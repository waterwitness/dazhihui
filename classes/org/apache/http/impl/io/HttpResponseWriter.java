package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

@Deprecated
@NotThreadSafe
public class HttpResponseWriter
  extends AbstractMessageWriter<HttpResponse>
{
  public HttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    super(paramSessionOutputBuffer, paramLineFormatter, paramHttpParams);
  }
  
  protected void writeHeadLine(HttpResponse paramHttpResponse)
  {
    this.lineFormatter.formatStatusLine(this.lineBuf, paramHttpResponse.getStatusLine());
    this.sessionBuffer.writeLine(this.lineBuf);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\HttpResponseWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */