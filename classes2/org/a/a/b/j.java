package org.a.a.b;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.a.a.ay;
import org.a.a.bd;
import org.a.a.bq;
import org.a.a.c;
import org.a.a.d;

public class j
  extends d
  implements c
{
  bd a;
  
  public j(Date paramDate)
  {
    SimpleTimeZone localSimpleTimeZone = new SimpleTimeZone(0, "Z");
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    localSimpleDateFormat.setTimeZone(localSimpleTimeZone);
    paramDate = localSimpleDateFormat.format(paramDate) + "Z";
    int i = Integer.parseInt(paramDate.substring(0, 4));
    if ((i < 1950) || (i > 2049))
    {
      this.a = new ay(paramDate);
      return;
    }
    this.a = new bq(paramDate.substring(2));
  }
  
  public bd d()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */