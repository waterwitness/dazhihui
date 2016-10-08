package com.squareup.okhttp.internal.spdy;

class Hpack$HeaderEntry
{
  private final String name;
  private final String value;
  
  Hpack$HeaderEntry(String paramString1, String paramString2)
  {
    this.name = paramString1;
    this.value = paramString2;
  }
  
  int length()
  {
    return this.name.length() + 32 + this.value.length();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Hpack$HeaderEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */