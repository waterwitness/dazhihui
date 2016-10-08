package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderIterator
  extends Iterator<Object>
{
  public abstract boolean hasNext();
  
  public abstract Header nextHeader();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HeaderIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */