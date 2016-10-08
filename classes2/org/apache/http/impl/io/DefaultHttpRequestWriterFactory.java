package org.apache.http.impl.io;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Immutable;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;

@Immutable
public class DefaultHttpRequestWriterFactory
  implements HttpMessageWriterFactory<HttpRequest>
{
  public static final DefaultHttpRequestWriterFactory INSTANCE = new DefaultHttpRequestWriterFactory();
  private final LineFormatter lineFormatter;
  
  public DefaultHttpRequestWriterFactory()
  {
    this(null);
  }
  
  public DefaultHttpRequestWriterFactory(LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public HttpMessageWriter<HttpRequest> create(SessionOutputBuffer paramSessionOutputBuffer)
  {
    return new DefaultHttpRequestWriter(paramSessionOutputBuffer, this.lineFormatter);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpRequestWriterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */