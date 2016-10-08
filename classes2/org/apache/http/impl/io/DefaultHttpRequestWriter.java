package org.apache.http.impl.io;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@NotThreadSafe
public class DefaultHttpRequestWriter
  extends AbstractMessageWriter<HttpRequest>
{
  public DefaultHttpRequestWriter(SessionOutputBuffer paramSessionOutputBuffer)
  {
    this(paramSessionOutputBuffer, null);
  }
  
  public DefaultHttpRequestWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    super(paramSessionOutputBuffer, paramLineFormatter);
  }
  
  protected void writeHeadLine(HttpRequest paramHttpRequest)
  {
    this.lineFormatter.formatRequestLine(this.lineBuf, paramHttpRequest.getRequestLine());
    this.sessionBuffer.writeLine(this.lineBuf);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpRequestWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */