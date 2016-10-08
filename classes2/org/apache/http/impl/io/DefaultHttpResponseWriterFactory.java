package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;

@Immutable
public class DefaultHttpResponseWriterFactory
  implements HttpMessageWriterFactory<HttpResponse>
{
  public static final DefaultHttpResponseWriterFactory INSTANCE = new DefaultHttpResponseWriterFactory();
  private final LineFormatter lineFormatter;
  
  public DefaultHttpResponseWriterFactory()
  {
    this(null);
  }
  
  public DefaultHttpResponseWriterFactory(LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public HttpMessageWriter<HttpResponse> create(SessionOutputBuffer paramSessionOutputBuffer)
  {
    return new DefaultHttpResponseWriter(paramSessionOutputBuffer, this.lineFormatter);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpResponseWriterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */