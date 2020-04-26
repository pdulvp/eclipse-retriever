package org.pdulvp.retriever.model.handler.helpers;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.pdulvp.retriever.result.URIResult;
import org.w3c.dom.Node;

public class ImageExt {

  public static byte[] saveToPNG(InputStream stream) {

    try {
      // Transcode the file.
      TranscoderInput input = new TranscoderInput(stream);

      PNGTranscoder trans = new PNGTranscoder(); /*{
        // temporary workaround for https://issues.apache.org/jira/browse/BATIK-1051
        @Override
        protected BridgeContext createBridgeContext(String svgVersion) {
          if ("1.2".equals(svgVersion)) {
            return new SVG12BridgeContext(userAgent) {
              @Override
              public void registerSVGBridges() {
                super.registerSVGBridges();
           //     this.putBridge(new SVGPatternElementBridgePatched());
              }
            };
          }
          return new BridgeContext(userAgent) {
            @Override
            public void registerSVGBridges() {
              super.registerSVGBridges();
           //   this.putBridge(new SVGPatternElementBridgePatched());
            }
          };
        }
      };*/

      trans.addTranscodingHint(PNGTranscoder.KEY_WIDTH, new Float(500));

      ByteArrayOutputStream ostream = new ByteArrayOutputStream();
      TranscoderOutput output = new TranscoderOutput(ostream);

      // Perform the transcoding.
      trans.transcode(input, output);
      ostream.flush();
      ostream.close();

      return ostream.toByteArray();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;

  }

  public static void svgFixesForPNG(URIResult result) {
    // Remove all invalid links
    try {
      Object links = InterpreterUtil.getInterpreter(result).evaluate(result, "xpath://*[@href]");
      if (links instanceof Collection && (!((Collection) links).isEmpty())) {
        for (Object a : ((Collection) links)) {
          if (a instanceof Node) {
            Object referenced = InterpreterUtil.getInterpreter(result).evaluate(result, "xpath://*[@id=\""
                + ((Node) a).getAttributes().getNamedItem("xlink:href").getNodeValue().substring(1) + "\"]");
            if (referenced instanceof Collection && (((Collection) referenced).isEmpty())) {
              ((Node) a).getParentNode().removeChild((Node) a);
            }
          }
        }
      }
    } catch (EvaluationException e) {
      e.printStackTrace();
    }
  }

}
