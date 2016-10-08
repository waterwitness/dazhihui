package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;

@ThreadSafe
public class HttpDateGenerator
{
  public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
  public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
  @GuardedBy("this")
  private long dateAsLong = 0L;
  @GuardedBy("this")
  private String dateAsText = null;
  @GuardedBy("this")
  private final DateFormat dateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
  
  public HttpDateGenerator()
  {
    this.dateformat.setTimeZone(GMT);
  }
  
  public String getCurrentDate()
  {
    try
    {
      long l = System.currentTimeMillis();
      if (l - this.dateAsLong > 1000L)
      {
        this.dateAsText = this.dateformat.format(new Date(l));
        this.dateAsLong = l;
      }
      String str = this.dateAsText;
      return str;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\HttpDateGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */