package org.apache.http;

public abstract interface HeaderElement
{
  public abstract String getName();
  
  public abstract NameValuePair getParameter(int paramInt);
  
  public abstract NameValuePair getParameterByName(String paramString);
  
  public abstract int getParameterCount();
  
  public abstract NameValuePair[] getParameters();
  
  public abstract String getValue();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HeaderElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */