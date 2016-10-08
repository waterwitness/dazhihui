package com.baidu.location.h;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.GpsStatus.NmeaListener;
import android.location.LocationManager;
import android.os.Handler;
import com.baidu.location.b.l;
import com.baidu.location.e.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class b
  implements GpsStatus.Listener, GpsStatus.NmeaListener
{
  long a = 0L;
  private long c = 0L;
  private final int d = 400;
  private boolean e = false;
  private List f = new ArrayList();
  private String g = null;
  private String h = null;
  private String i = null;
  
  private b(a parama) {}
  
  public void a(String paramString)
  {
    if ((System.currentTimeMillis() - this.c > 400L) && (this.e) && (this.f.size() > 0)) {}
    try
    {
      s locals = new s(this.f, this.g, this.h, this.i);
      if (locals.a())
      {
        l.d = a.a(this.b, locals, a.h(this.b));
        if (l.d > 0) {
          a.a(String.format(Locale.CHINA, "&nmea=%.1f|%.1f&g_tp=%d", new Object[] { Double.valueOf(locals.c()), Double.valueOf(locals.b()), Integer.valueOf(l.d) }));
        }
      }
      for (;;)
      {
        this.f.clear();
        this.i = null;
        this.h = null;
        this.g = null;
        this.e = false;
        if (!paramString.startsWith("$GPGGA")) {
          break;
        }
        this.e = true;
        this.g = paramString.trim();
        this.c = System.currentTimeMillis();
        return;
        l.d = 0;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l.d = 0;
        continue;
        if (paramString.startsWith("$GPGSV")) {
          this.f.add(paramString.trim());
        } else if (paramString.startsWith("$GPGSA")) {
          this.i = paramString.trim();
        }
      }
    }
  }
  
  public void onGpsStatusChanged(int paramInt)
  {
    if (a.d(this.b) == null) {}
    do
    {
      return;
      switch (paramInt)
      {
      case 3: 
      default: 
        return;
      case 2: 
        a.b(this.b, null);
        a.a(this.b, false);
        a.a(0);
        return;
      }
    } while (!a.b(this.b));
    try
    {
      if (a.e(this.b) == null) {
        a.a(this.b, a.d(this.b).getGpsStatus(null));
      }
      for (;;)
      {
        Iterator localIterator = a.e(this.b).getSatellites().iterator();
        a.a(this.b, 0);
        a.b(this.b, 0);
        a.a(this.b, new HashMap());
        paramInt = 0;
        while (localIterator.hasNext())
        {
          GpsSatellite localGpsSatellite = (GpsSatellite)localIterator.next();
          if (localGpsSatellite.usedInFix())
          {
            paramInt += 1;
            if (localGpsSatellite.getSnr() >= l.E) {
              a.f(this.b);
            }
            a.a(this.b, localGpsSatellite, a.g(this.b));
          }
        }
        a.d(this.b).getGpsStatus(a.e(this.b));
      }
      a.a(paramInt);
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onNmeaReceived(long paramLong, String paramString)
  {
    if (!a.b(this.b)) {}
    do
    {
      return;
      if (!i.a().g)
      {
        l.d = 0;
        return;
      }
    } while ((paramString == null) || (paramString.equals("")) || (paramString.length() < 9) || (paramString.length() > 150) || (!this.b.j()));
    a.c(this.b).sendMessage(a.c(this.b).obtainMessage(2, paramString));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */