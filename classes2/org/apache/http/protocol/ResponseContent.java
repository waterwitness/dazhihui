package org.apache.http.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ResponseContent
  implements HttpResponseInterceptor
{
  private final boolean overwrite;
  
  public ResponseContent()
  {
    this(false);
  }
  
  public ResponseContent(boolean paramBoolean)
  {
    this.overwrite = paramBoolean;
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    HttpEntity localHttpEntity;
    long l;
    if (this.overwrite)
    {
      paramHttpResponse.removeHeaders("Transfer-Encoding");
      paramHttpResponse.removeHeaders("Content-Length");
      paramHttpContext = paramHttpResponse.getStatusLine().getProtocolVersion();
      localHttpEntity = paramHttpResponse.getEntity();
      if (localHttpEntity == null) {
        break label224;
      }
      l = localHttpEntity.getContentLength();
      if ((!localHttpEntity.isChunked()) || (paramHttpContext.lessEquals(HttpVersion.HTTP_1_0))) {
        break label197;
      }
      paramHttpResponse.addHeader("Transfer-Encoding", "chunked");
      label90:
      if ((localHttpEntity.getContentType() != null) && (!paramHttpResponse.containsHeader("Content-Type"))) {
        paramHttpResponse.addHeader(localHttpEntity.getContentType());
      }
      if ((localHttpEntity.getContentEncoding() != null) && (!paramHttpResponse.containsHeader("Content-Encoding"))) {
        paramHttpResponse.addHeader(localHttpEntity.getContentEncoding());
      }
    }
    label197:
    label224:
    int i;
    do
    {
      return;
      if (paramHttpResponse.containsHeader("Transfer-Encoding")) {
        throw new ProtocolException("Transfer-encoding header already present");
      }
      if (!paramHttpResponse.containsHeader("Content-Length")) {
        break;
      }
      throw new ProtocolException("Content-Length header already present");
      if (l < 0L) {
        break label90;
      }
      paramHttpResponse.addHeader("Content-Length", Long.toString(localHttpEntity.getContentLength()));
      break label90;
      i = paramHttpResponse.getStatusLine().getStatusCode();
    } while ((i == 204) || (i == 304) || (i == 205));
    paramHttpResponse.addHeader("Content-Length", "0");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\ResponseContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */