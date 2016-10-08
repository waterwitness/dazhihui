package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class BasicHeaderElementIterator
  implements HeaderElementIterator
{
  private CharArrayBuffer buffer = null;
  private HeaderElement currentElement = null;
  private ParserCursor cursor = null;
  private final HeaderIterator headerIt;
  private final HeaderValueParser parser;
  
  public BasicHeaderElementIterator(HeaderIterator paramHeaderIterator)
  {
    this(paramHeaderIterator, BasicHeaderValueParser.INSTANCE);
  }
  
  public BasicHeaderElementIterator(HeaderIterator paramHeaderIterator, HeaderValueParser paramHeaderValueParser)
  {
    this.headerIt = ((HeaderIterator)Args.notNull(paramHeaderIterator, "Header iterator"));
    this.parser = ((HeaderValueParser)Args.notNull(paramHeaderValueParser, "Parser"));
  }
  
  private void bufferHeaderValue()
  {
    this.cursor = null;
    this.buffer = null;
    Object localObject;
    do
    {
      if (this.headerIt.hasNext())
      {
        localObject = this.headerIt.nextHeader();
        if ((localObject instanceof FormattedHeader))
        {
          this.buffer = ((FormattedHeader)localObject).getBuffer();
          this.cursor = new ParserCursor(0, this.buffer.length());
          this.cursor.updatePos(((FormattedHeader)localObject).getValuePos());
        }
      }
      else
      {
        return;
      }
      localObject = ((Header)localObject).getValue();
    } while (localObject == null);
    this.buffer = new CharArrayBuffer(((String)localObject).length());
    this.buffer.append((String)localObject);
    this.cursor = new ParserCursor(0, this.buffer.length());
  }
  
  private void parseNextElement()
  {
    for (;;)
    {
      if ((this.headerIt.hasNext()) || (this.cursor != null))
      {
        if ((this.cursor == null) || (this.cursor.atEnd())) {
          bufferHeaderValue();
        }
        if (this.cursor == null) {}
      }
      else
      {
        while (!this.cursor.atEnd())
        {
          HeaderElement localHeaderElement = this.parser.parseHeaderElement(this.buffer, this.cursor);
          if ((localHeaderElement.getName().length() != 0) || (localHeaderElement.getValue() != null))
          {
            this.currentElement = localHeaderElement;
            return;
          }
        }
        if (this.cursor.atEnd())
        {
          this.cursor = null;
          this.buffer = null;
        }
      }
    }
  }
  
  public boolean hasNext()
  {
    if (this.currentElement == null) {
      parseNextElement();
    }
    return this.currentElement != null;
  }
  
  public final Object next()
  {
    return nextElement();
  }
  
  public HeaderElement nextElement()
  {
    if (this.currentElement == null) {
      parseNextElement();
    }
    if (this.currentElement == null) {
      throw new NoSuchElementException("No more header elements available");
    }
    HeaderElement localHeaderElement = this.currentElement;
    this.currentElement = null;
    return localHeaderElement;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Remove not supported");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHeaderElementIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */