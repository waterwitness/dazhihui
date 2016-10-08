package org.apache.http.impl.io;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequestFactory;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
@NotThreadSafe
public class HttpRequestParser
  extends AbstractMessageParser<HttpMessage>
{
  private final CharArrayBuffer lineBuf;
  private final HttpRequestFactory requestFactory;
  
  public HttpRequestParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.requestFactory = ((HttpRequestFactory)Args.notNull(paramHttpRequestFactory, "Request factory"));
    this.lineBuf = new CharArrayBuffer(128);
  }
  
  protected HttpMessage parseHead(SessionInputBuffer paramSessionInputBuffer)
  {
    this.lineBuf.clear();
    if (paramSessionInputBuffer.readLine(this.lineBuf) == -1) {
      throw new ConnectionClosedException("Client closed connection");
    }
    paramSessionInputBuffer = new ParserCursor(0, this.lineBuf.length());
    paramSessionInputBuffer = this.lineParser.parseRequestLine(this.lineBuf, paramSessionInputBuffer);
    return this.requestFactory.newHttpRequest(paramSessionInputBuffer);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\HttpRequestParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */