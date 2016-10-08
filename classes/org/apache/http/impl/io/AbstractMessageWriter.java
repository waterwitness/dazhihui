package org.apache.http.impl.io;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public abstract class AbstractMessageWriter<T extends HttpMessage>
  implements HttpMessageWriter<T>
{
  protected final CharArrayBuffer lineBuf;
  protected final LineFormatter lineFormatter;
  protected final SessionOutputBuffer sessionBuffer;
  
  public AbstractMessageWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    this.sessionBuffer = ((SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session input buffer"));
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      this.lineBuf = new CharArrayBuffer(128);
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  @Deprecated
  public AbstractMessageWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    Args.notNull(paramSessionOutputBuffer, "Session input buffer");
    this.sessionBuffer = paramSessionOutputBuffer;
    this.lineBuf = new CharArrayBuffer(128);
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public void write(T paramT)
  {
    Args.notNull(paramT, "HTTP message");
    writeHeadLine(paramT);
    paramT = paramT.headerIterator();
    while (paramT.hasNext())
    {
      Header localHeader = paramT.nextHeader();
      this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, localHeader));
    }
    this.lineBuf.clear();
    this.sessionBuffer.writeLine(this.lineBuf);
  }
  
  protected abstract void writeHeadLine(T paramT);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\AbstractMessageWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */