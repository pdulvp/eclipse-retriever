package org.pdulvp.retriever.model.handler.helpers;

import java.io.InputStream;

public class HttpResult {
  public String getEncoding() {
    return encoding;
  }
  public InputStream getStream() {
    return stream;
  }
  public int getStatus() {
    return status;
  }
  String encoding;
  InputStream stream;
  int status;
  public HttpResult(InputStream stream, String encoding, int status) {
    super();
    this.encoding = encoding;
    this.stream = stream;
    this.status = status;
  }
}
