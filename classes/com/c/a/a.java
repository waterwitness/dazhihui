package com.c.a;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

final class a
  implements ad<java.util.Date>, v<java.util.Date>
{
  private final DateFormat a;
  private final DateFormat b;
  private final DateFormat c;
  
  a()
  {
    this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
  }
  
  public a(int paramInt1, int paramInt2)
  {
    this(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US), DateFormat.getDateTimeInstance(paramInt1, paramInt2));
  }
  
  a(String paramString)
  {
    this(new SimpleDateFormat(paramString, Locale.US), new SimpleDateFormat(paramString));
  }
  
  a(DateFormat paramDateFormat1, DateFormat paramDateFormat2)
  {
    this.a = paramDateFormat1;
    this.b = paramDateFormat2;
    this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  private java.util.Date a(w paramw)
  {
    java.util.Date localDate2;
    synchronized (this.b)
    {
      try
      {
        java.util.Date localDate1 = this.b.parse(paramw.b());
        return localDate1;
      }
      catch (ParseException localParseException1) {}
    }
  }
  
  public w a(java.util.Date paramDate, Type arg2, ac paramac)
  {
    synchronized (this.b)
    {
      paramDate = new ab(this.a.format(paramDate));
      return paramDate;
    }
  }
  
  public java.util.Date a(w paramw, Type paramType, u paramu)
  {
    if (!(paramw instanceof ab)) {
      throw new aa("The date should be a string value");
    }
    paramw = a(paramw);
    if (paramType == java.util.Date.class) {
      return paramw;
    }
    if (paramType == Timestamp.class) {
      return new Timestamp(paramw.getTime());
    }
    if (paramType == java.sql.Date.class) {
      return new java.sql.Date(paramw.getTime());
    }
    throw new IllegalArgumentException(getClass() + " cannot deserialize to " + paramType);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */