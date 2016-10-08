package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

class HttpDate$1
  extends ThreadLocal<DateFormat>
{
  protected DateFormat initialValue()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return localSimpleDateFormat;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpDate$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */