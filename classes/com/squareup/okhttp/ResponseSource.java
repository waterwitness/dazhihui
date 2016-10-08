package com.squareup.okhttp;

public enum ResponseSource
{
  CACHE,  CONDITIONAL_CACHE,  NETWORK;
  
  public boolean requiresConnection()
  {
    return (this == CONDITIONAL_CACHE) || (this == NETWORK);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\ResponseSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */