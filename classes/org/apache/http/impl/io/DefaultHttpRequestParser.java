package org.apache.http.impl.io;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpRequestFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class DefaultHttpRequestParser
  extends AbstractMessageParser<HttpRequest>
{
  private final CharArrayBuffer lineBuf;
  private final HttpRequestFactory requestFactory;
  
  public DefaultHttpRequestParser(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, MessageConstraints.DEFAULT);
  }
  
  public DefaultHttpRequestParser(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints)
  {
    this(paramSessionInputBuffer, null, null, paramMessageConstraints);
  }
  
  public DefaultHttpRequestParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, MessageConstraints paramMessageConstraints)
  {
    super(paramSessionInputBuffer, paramLineParser, paramMessageConstraints);
    if (paramHttpRequestFactory != null) {}
    for (;;)
    {
      this.requestFactory = paramHttpRequestFactory;
      this.lineBuf = new CharArrayBuffer(128);
      return;
      paramHttpRequestFactory = DefaultHttpRequestFactory.INSTANCE;
    }
  }
  
  @Deprecated
  public DefaultHttpRequestParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.requestFactory = ((HttpRequestFactory)Args.notNull(paramHttpRequestFactory, "Request factory"));
    this.lineBuf = new CharArrayBuffer(128);
  }
  
  protected HttpRequest parseHead(SessionInputBuffer paramSessionInputBuffer)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpRequestParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */