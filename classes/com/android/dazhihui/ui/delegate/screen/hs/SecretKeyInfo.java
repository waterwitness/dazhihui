package com.android.dazhihui.ui.delegate.screen.hs;

import javax.crypto.spec.SecretKeySpec;

class SecretKeyInfo
{
  public static final String SECRET_AES_256 = "AES-256";
  public static final String SECRET_RC4_128 = "RC-128";
  private SecretKeySpec key;
  private String random;
  private String secret;
  private long time;
  
  public SecretKeyInfo(String paramString)
  {
    this.secret = paramString;
    this.time = System.currentTimeMillis();
    RandomString localRandomString = new RandomString();
    if (paramString.equals("AES-256"))
    {
      this.random = localRandomString.random(this.time, 32);
      this.key = new SecretKeySpec(this.random.getBytes(), "AES");
    }
    while (!paramString.equals("RC-128")) {
      return;
    }
    this.random = localRandomString.random(this.time, 16);
    this.key = new SecretKeySpec(this.random.getBytes(), "RC4");
  }
  
  public SecretKeySpec getKey()
  {
    return this.key;
  }
  
  public String getSecret()
  {
    return this.secret;
  }
  
  public long getTime()
  {
    return this.time;
  }
  
  public String toString()
  {
    return this.secret + "|" + this.time + "|" + this.random;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hs\SecretKeyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */