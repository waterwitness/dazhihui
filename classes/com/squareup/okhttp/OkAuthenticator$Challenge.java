package com.squareup.okhttp;

public final class OkAuthenticator$Challenge
{
  private final String realm;
  private final String scheme;
  
  public OkAuthenticator$Challenge(String paramString1, String paramString2)
  {
    this.scheme = paramString1;
    this.realm = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Challenge)) && (((Challenge)paramObject).scheme.equals(this.scheme)) && (((Challenge)paramObject).realm.equals(this.realm));
  }
  
  public String getRealm()
  {
    return this.realm;
  }
  
  public String getScheme()
  {
    return this.scheme;
  }
  
  public int hashCode()
  {
    return this.scheme.hashCode() + this.realm.hashCode() * 31;
  }
  
  public String toString()
  {
    return this.scheme + " realm=\"" + this.realm + "\"";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\OkAuthenticator$Challenge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */