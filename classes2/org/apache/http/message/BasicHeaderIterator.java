package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicHeaderIterator
  implements HeaderIterator
{
  protected final Header[] allHeaders;
  protected int currentIndex;
  protected String headerName;
  
  public BasicHeaderIterator(Header[] paramArrayOfHeader, String paramString)
  {
    this.allHeaders = ((Header[])Args.notNull(paramArrayOfHeader, "Header array"));
    this.headerName = paramString;
    this.currentIndex = findNext(-1);
  }
  
  protected boolean filterHeader(int paramInt)
  {
    return (this.headerName == null) || (this.headerName.equalsIgnoreCase(this.allHeaders[paramInt].getName()));
  }
  
  protected int findNext(int paramInt)
  {
    if (paramInt < -1) {
      return -1;
    }
    int i = this.allHeaders.length;
    for (boolean bool = false; (!bool) && (paramInt < i - 1); bool = filterHeader(paramInt)) {
      paramInt += 1;
    }
    if (bool) {}
    for (;;)
    {
      return paramInt;
      paramInt = -1;
    }
  }
  
  public boolean hasNext()
  {
    return this.currentIndex >= 0;
  }
  
  public final Object next()
  {
    return nextHeader();
  }
  
  public Header nextHeader()
  {
    int i = this.currentIndex;
    if (i < 0) {
      throw new NoSuchElementException("Iteration already finished.");
    }
    this.currentIndex = findNext(i);
    return this.allHeaders[i];
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Removing headers is not supported.");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHeaderIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */