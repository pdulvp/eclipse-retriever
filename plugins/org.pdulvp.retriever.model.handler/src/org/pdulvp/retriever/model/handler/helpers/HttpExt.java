package org.pdulvp.retriever.model.handler.helpers;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.pdulvp.retriever.model.handler.Activator;

public class HttpExt {
  public static HttpResult get(String uri) {
    return get(uri, new HashMap<String, String>());
  }

  public static String hmacSha1(String value, String key) {
    try {
        // Get an hmac_sha1 key from the raw key bytes
        byte[] keyBytes = key.getBytes();           
        SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");

        // Get an hmac_sha1 Mac instance and initialize with the signing key
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(signingKey);

        // Compute the hmac on input data bytes
        byte[] rawHmac = mac.doFinal(value.getBytes());

        // Convert raw bytes to Hex
        byte[] hexBytes = new Hex().encode(rawHmac);

        //  Covert array of Hex bytes to a String
        return new String(hexBytes, "UTF-8");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
  
  public static HttpResult get(String uri, HashMap<String, String> headers) {

    URL url;
    try {
      url = new URL(uri);

      Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "Fetch internet :" + uri));

      String encoding = null;
      URLConnection con = url.openConnection();
      con.setDoOutput(true);
      ((HttpURLConnection)con).setRequestMethod("POST");
      con.addRequestProperty("User-Agent", "themattharris' HTTP Client");//Mozilla/5.0 (Windows NT 10.0; WOW64; rv:44.0) Gecko/20100101 Firefox/44.0");
      con.setUseCaches( false );
      con.addRequestProperty("Host", "api.twitter.com"); //"www.enligne.parionssport.fdj.fr");
      //con.addRequestProperty("Accept-Language", "en-US,en;q=0.5");
      //con.addRequestProperty("X-Requested-With", "XMLHttpRequest");
      //con.addRequestProperty("Referer", "https://www.enligne.parionssport.fdj.fr/paris-en-direct/");
      //con.addRequestProperty("Cookie", "modern=agpfrp8; price_format=EURO; ");
     // con.addRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");

      for (String header : headers.keySet()) {
        con.addRequestProperty(header, headers.get(header));
      }

      //if (con.getContentEncoding() != null) {
      //  encoding = con.getContentEncoding();
      //}
      if (con instanceof HttpURLConnection) {
       /* if (((HttpURLConnection) con).getResponseMessage().equals("TLS Redirect")) {
          uri = uri.substring(4);
          uri = "https" + uri;
          url = new URL(uri);
          con = url.openConnection();
          if (con.getContentEncoding() != null) {
            encoding = con.getContentEncoding();
          }
        }*/
      }
      

      DataOutputStream wr = new DataOutputStream(con.getOutputStream());
      wr.writeBytes("oauth_callback=http%3A%2F%2Flocalhost%2Fsign-in-with-twitter%2F");
     wr.flush();
     wr.close();
      
      
      InputStream s = con.getInputStream();
      if (con instanceof HttpURLConnection) {
        return new HttpResult(s, encoding, ((HttpURLConnection) con).getResponseCode());
      }
      return new HttpResult(s, encoding, -1);

    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  public static String getResult(InputStream stream, String encoding) {
    try {
      return IOUtils.toString(stream, encoding);
    } catch (IOException e) {
      return null;
    }
  }

  public static String body(HttpResult couple) {
    return getResult(couple.getStream(), couple.getEncoding());
  }

}
