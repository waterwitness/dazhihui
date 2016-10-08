package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class DefaultHttpResponseParser
  extends AbstractMessageParser<HttpResponse>
{
  private final CharArrayBuffer lineBuf;
  private final HttpResponseFactory responseFactory;
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, MessageConstraints.DEFAULT);
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints)
  {
    this(paramSessionInputBuffer, null, null, paramMessageConstraints);
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, MessageConstraints paramMessageConstraints)
  {
    super(paramSessionInputBuffer, paramLineParser, paramMessageConstraints);
    if (paramHttpResponseFactory != null) {}
    for (;;)
    {
      this.responseFactory = paramHttpResponseFactory;
      this.lineBuf = new CharArrayBuffer(128);
      return;
      paramHttpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
    }
  }
  
  @Deprecated
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    this.responseFactory = ((HttpResponseFactory)Args.notNull(paramHttpResponseFactory, "Response factory"));
    this.lineBuf = new CharArrayBuffer(128);
  }
  
  protected HttpResponse parseHead(SessionInputBuffer paramSessionInputBuffer)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\DefaultHttpResponseParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */