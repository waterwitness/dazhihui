package com.android.volley.toolbox;

public abstract interface Authenticator
{
  public abstract String getAuthToken();
  
  public abstract void invalidateAuthToken(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\Authenticator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */