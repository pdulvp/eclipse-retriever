package org.pdulvp.retriever.model.handler.helpers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;

public class XMLExt {
  
  public static String dom2String(Document doc ) {
    

    String xmlStr = "";
      StringWriter  strWriter    = null;
      XMLSerializer probeMsgSerializer   = null;
      OutputFormat  outFormat    = null;

      try {
        probeMsgSerializer = new XMLSerializer();
        strWriter = new StringWriter();
        outFormat = new OutputFormat();

        // Setup format settings
        outFormat.setIndenting(true);
        outFormat.setIndent(4);

        // Define a Writer
        probeMsgSerializer.setOutputCharStream(strWriter);

        // Apply the format settings
        probeMsgSerializer.setOutputFormat(outFormat);

        // Serialize XML Document
        probeMsgSerializer.serialize( doc);
        xmlStr = strWriter.toString();
        strWriter.close();

      } catch (IOException ioEx) {
          System.out.println("Error " + ioEx);
      }
      
      return xmlStr;
  }

  public static byte[] domToByteArray(Document doc) {

    java.io.ByteArrayOutputStream data = new java.io.ByteArrayOutputStream();
    java.io.PrintStream ps = new java.io.PrintStream(data);

    org.apache.xml.serialize.OutputFormat of = new org.apache.xml.serialize.OutputFormat("XML", "UTF-8", true);
    of.setIndent(1);
    of.setIndenting(true);
    org.apache.xml.serialize.XMLSerializer serializer = new org.apache.xml.serialize.XMLSerializer(ps, of);

    try {// As a DOM Serializer
      serializer.asDOMSerializer();
      serializer.serialize(doc);
    } catch (RuntimeException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return data.toByteArray();
  }

  public static Document xml2dom(String body) {
    HtmlCleaner cleaner = new HtmlCleaner();
    CleanerProperties props = cleaner.getProperties();
    props.setTranslateSpecialEntities(true);
    props.setTransResCharsToNCR(true);
    props.setOmitComments(true);

    TagNode node;
    try {
      node = cleaner.clean(new ByteArrayInputStream(body.getBytes("UTF-8")));
      return new DomSerializer(props, true).createDOM(node);

    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ParserConfigurationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
  }

}
