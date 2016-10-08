package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

@NotThreadSafe
public class DefaultHttpResponseWriter
  extends AbstractMessageWriter<HttpResponse>
{
  public DefaultHttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer)
  {
    super(paramSessionOutputBuffer, null);
  }
  
  public DefaultHttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    super(paramSessionOutputBuffer, paramLineFormatter);
  }
  
  protected void writeHeadLine(HttpResponse paramHttpResponse)
  {
    this.lineFormatter.formatStatusLine(this.lineBuf, paramHttpResponse.getStatusLine());
    this.sessionBuffer.writeLine(this.lineBuf);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpResponseWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */