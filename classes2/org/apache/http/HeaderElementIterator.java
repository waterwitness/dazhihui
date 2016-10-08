package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderElementIterator
  extends Iterator<Object>
{
  public abstract boolean hasNext();
  
  public abstract HeaderElement nextElement();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HeaderElementIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */