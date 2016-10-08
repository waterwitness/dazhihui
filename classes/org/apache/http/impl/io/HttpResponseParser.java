package org.apache.http.impl.io;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
@NotThreadSafe
public class HttpResponseParser
  extends AbstractMessageParser<HttpMessage>
{
  private final CharArrayBuffer lineBuf;
  private final HttpResponseFactory responseFactory;
  
  public HttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.responseFactory = ((HttpResponseFactory)Args.notNull(paramHttpResponseFactory, "Response factory"));
    this.lineBuf = new CharArrayBuffer(128);
  }
  
  protected HttpMessage parseHead(SessionInputBuffer paramSessionInputBuffer)
  {
    this.lineBuf.clear();
    if (paramSessionInputBuffer.readLine(this.lineBuf) == -1) {
      throw new NoHttpResponseException("The target server failed to respond");
    }
    paramSessionInputBuffer = new ParserCursor(0, this.lineBuf.length());
    paramSessionInputBuffer = this.lineParser.parseStatusLine(this.lineBuf, paramSessionInputBuffer);
    return this.responseFactory.newHttpResponse(paramSessionInputBuffer, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\HttpResponseParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */