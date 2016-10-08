package com.android.dazhihui.ui.model.stock.market;

import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.b;
import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HHStkVo
  implements Serializable
{
  public String buy = "";
  public String curVol = "";
  public String initVol = "";
  public String sell = "";
  public String time = "";
  
  public void decode(q paramq)
  {
    int i = paramq.h();
    int j = paramq.h();
    int k = paramq.h();
    long l1 = b.b(paramq.h());
    long l2 = b.b(paramq.h());
    this.time = getTime(i);
    this.buy = b.a(j, 4);
    this.sell = b.a(k, 4);
    this.initVol = parseLong(l1);
    this.curVol = parseLong(l2);
  }
  
  public String getTime(int paramInt)
  {
    if (paramInt < 1) {
      return "- -";
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(1970, 0, 1, 0, 0, 0);
    localCalendar.setTimeInMillis(paramInt * 1000L + 28800000L + localCalendar.getTimeInMillis());
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(localCalendar.getTime());
  }
  
  public String parseLong(long paramLong)
  {
    int i;
    if (paramLong / 100000000L > 0L)
    {
      i = (int)(paramLong / (100000000L / 10000L));
      return b.a(i, 4) + "亿";
    }
    if (paramLong / 10000L > 0L)
    {
      i = (int)(paramLong / (10000L / 10000L));
      return b.a(i, 4) + "万";
    }
    return String.valueOf(paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\market\HHStkVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */