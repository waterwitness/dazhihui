package com.squareup.okhttp;

import com.squareup.okhttp.internal.Base64;
import java.io.UnsupportedEncodingException;

public final class OkAuthenticator$Credential
{
  private final String headerValue;
  
  private OkAuthenticator$Credential(String paramString)
  {
    this.headerValue = paramString;
  }
  
  public static Credential basic(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = Base64.encode((paramString1 + ":" + paramString2).getBytes("ISO-8859-1"));
      paramString1 = new Credential("Basic " + paramString1);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new AssertionError();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Credential)) && (((Credential)paramObject).headerValue.equals(this.headerValue));
  }
  
  public String getHeaderValue()
  {
    return this.headerValue;
  }
  
  public int hashCode()
  {
    return this.headerValue.hashCode();
  }
  
  public String toString()
  {
    return this.headerValue;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\OkAuthenticator$Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */