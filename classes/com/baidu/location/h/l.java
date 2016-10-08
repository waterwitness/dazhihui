package com.baidu.location.h;

import android.net.wifi.ScanResult;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class l
{
  public List a = null;
  private long b = 0L;
  private long c = 0L;
  private boolean d = false;
  private boolean e;
  
  public l(List paramList, long paramLong)
  {
    this.b = paramLong;
    this.a = paramList;
    this.c = System.currentTimeMillis();
    i();
  }
  
  private void i()
  {
    if (a() < 1) {
      return;
    }
    int j = this.a.size() - 1;
    int i = 1;
    label23:
    int k;
    if ((j >= 1) && (i != 0))
    {
      k = 0;
      i = 0;
      label37:
      if (k < j)
      {
        if (((ScanResult)this.a.get(k)).level >= ((ScanResult)this.a.get(k + 1)).level) {
          break label155;
        }
        ScanResult localScanResult = (ScanResult)this.a.get(k + 1);
        this.a.set(k + 1, this.a.get(k));
        this.a.set(k, localScanResult);
        i = 1;
      }
    }
    label155:
    for (;;)
    {
      k += 1;
      break label37;
      j -= 1;
      break label23;
      break;
    }
  }
  
  public int a()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.size();
  }
  
  public String a(int paramInt)
  {
    return a(paramInt, false);
  }
  
  public String a(int paramInt, boolean paramBoolean)
  {
    if (a() < 1) {
      return null;
    }
    int m = 0;
    Object localObject2 = new Random();
    StringBuffer localStringBuffer = new StringBuffer(512);
    Object localObject1 = new ArrayList();
    Object localObject3 = r.a().i();
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT >= 17) {}
    label896:
    label899:
    for (;;)
    {
      try
      {
        l = SystemClock.elapsedRealtimeNanos() / 1000L;
        i = j;
        if (l > 0L) {
          i = 1;
        }
        if ((i != 0) && (i != 0) && (paramBoolean)) {}
        k = 0;
        i = 0;
        int n = this.a.size();
        j = 1;
        if (n <= paramInt) {
          break label899;
        }
        n = paramInt;
        i1 = 0;
        paramInt = m;
        if (i1 < n) {
          if (((ScanResult)this.a.get(i1)).level == 0)
          {
            m = j;
            j = paramInt;
            paramInt = i;
            i = m;
            i1 += 1;
            m = paramInt;
            paramInt = j;
            j = i;
            i = m;
            continue;
          }
        }
      }
      catch (Error localError)
      {
        int k;
        int i1;
        long l = 0L;
        continue;
        int i2;
        if (j != 0)
        {
          j = 0;
          localStringBuffer.append("&wf=");
          String str = ((ScanResult)this.a.get(i1)).BSSID.replace(":", "");
          localStringBuffer.append(str);
          i2 = ((ScanResult)this.a.get(i1)).level;
          m = i2;
          if (i2 < 0) {
            m = -i2;
          }
          localStringBuffer.append(String.format(Locale.CHINA, ";%d;", new Object[] { Integer.valueOf(m) }));
          m = k + 1;
          k = i;
          if (localObject3 != null)
          {
            k = i;
            if (((String)localObject3).equals(str))
            {
              this.e = r.a().a(((ScanResult)this.a.get(i1)).capabilities);
              r.a().h();
              k = m;
            }
          }
          if (paramInt != 0) {
            continue;
          }
        }
        try
        {
          if ((((Random)localObject2).nextInt(10) != 2) || (((ScanResult)this.a.get(i1)).SSID == null) || (((ScanResult)this.a.get(i1)).SSID.length() >= 30)) {
            break label896;
          }
          localStringBuffer.append(((ScanResult)this.a.get(i1)).SSID);
          paramInt = 1;
          i2 = paramInt;
          i = j;
          paramInt = k;
          k = m;
          j = i2;
        }
        catch (Exception localException)
        {
          i = j;
          j = paramInt;
          paramInt = k;
          k = m;
        }
        localStringBuffer.append("|");
        continue;
        if ((paramInt == 1) && (((Random)localObject2).nextInt(20) == 1) && (((ScanResult)this.a.get(i1)).SSID != null) && (((ScanResult)this.a.get(i1)).SSID.length() < 30))
        {
          localStringBuffer.append(((ScanResult)this.a.get(i1)).SSID);
          paramInt = 2;
          continue;
          continue;
          if (j == 0)
          {
            localStringBuffer.append("&wf_n=" + i);
            if ((0L > 10L) && (((List)localObject1).size() > 0))
            {
              localObject2 = new StringBuffer(128);
              ((StringBuffer)localObject2).append("&wf_ut=");
              localObject3 = (Long)((List)localObject1).get(0);
              localObject1 = ((List)localObject1).iterator();
              paramInt = 1;
              if (((Iterator)localObject1).hasNext())
              {
                Long localLong = (Long)((Iterator)localObject1).next();
                if (paramInt != 0)
                {
                  ((StringBuffer)localObject2).append(localLong.longValue());
                  paramInt = 0;
                  ((StringBuffer)localObject2).append("|");
                  continue;
                }
                l = localLong.longValue() - ((Long)localObject3).longValue();
                if (l != 0L) {
                  ((StringBuffer)localObject2).append("" + l);
                }
                continue;
              }
              localStringBuffer.append(((StringBuffer)localObject2).toString());
            }
            localStringBuffer.append("&wf_st=");
            localStringBuffer.append(this.b);
            localStringBuffer.append("&wf_et=");
            localStringBuffer.append(this.c);
            localStringBuffer.append("&wf_vt=");
            localStringBuffer.append(i.a);
            if (i > 0)
            {
              this.d = true;
              localStringBuffer.append("&wf_en=");
              if (this.e)
              {
                paramInt = 1;
                localStringBuffer.append(paramInt);
              }
            }
            else
            {
              return localStringBuffer.toString();
            }
            paramInt = 0;
            continue;
          }
          return null;
        }
      }
    }
  }
  
  public boolean a(l paraml)
  {
    if ((this.a != null) && (paraml != null) && (paraml.a != null))
    {
      int i;
      int j;
      if (this.a.size() < paraml.a.size())
      {
        i = this.a.size();
        j = 0;
      }
      for (;;)
      {
        if (j >= i) {
          break label116;
        }
        if (!((ScanResult)this.a.get(j)).BSSID.equals(((ScanResult)paraml.a.get(j)).BSSID))
        {
          return false;
          i = paraml.a.size();
          break;
        }
        j += 1;
      }
      label116:
      return true;
    }
    return false;
  }
  
  public String b()
  {
    try
    {
      String str = a(com.baidu.location.b.l.L, true);
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public String b(int paramInt)
  {
    int i = 0;
    try
    {
      if (a() < 1) {
        return null;
      }
      Object localObject = new StringBuffer(512);
      int j = this.a.size();
      if (j > paramInt) {}
      for (;;)
      {
        if (i < paramInt)
        {
          if (((ScanResult)this.a.get(i)).level != 0) {
            ((StringBuffer)localObject).append(String.format(Locale.CHINA, "<access-point>\n<mac>%s</mac>\n<signal-strength>%d</signal-strength>\n</access-point>\n", new Object[] { ((ScanResult)this.a.get(i)).BSSID.replace(":", ""), Integer.valueOf(((ScanResult)this.a.get(i)).level) }));
          }
        }
        else
        {
          localObject = ((StringBuffer)localObject).toString();
          return (String)localObject;
          paramInt = j;
          continue;
        }
        i += 1;
      }
      return null;
    }
    catch (Exception localException) {}
  }
  
  public boolean b(l paraml)
  {
    if ((this.a != null) && (paraml != null) && (paraml.a != null))
    {
      int i;
      int j;
      if (this.a.size() < paraml.a.size())
      {
        i = this.a.size();
        j = 0;
      }
      for (;;)
      {
        if (j >= i) {
          break label174;
        }
        String str1 = ((ScanResult)this.a.get(j)).BSSID;
        int k = ((ScanResult)this.a.get(j)).level;
        String str2 = ((ScanResult)paraml.a.get(j)).BSSID;
        int m = ((ScanResult)paraml.a.get(j)).level;
        if ((!str1.equals(str2)) || (k != m))
        {
          return false;
          i = paraml.a.size();
          break;
        }
        j += 1;
      }
      label174:
      return true;
    }
    return false;
  }
  
  public String c()
  {
    try
    {
      String str = a(15);
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public String c(int paramInt)
  {
    if (a() < 1) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer(512);
    int i = this.a.size();
    if (i > paramInt) {
      i = paramInt;
    }
    for (;;)
    {
      int j = 0;
      paramInt = 1;
      while (j < i) {
        if (((ScanResult)this.a.get(j)).level == 0)
        {
          j += 1;
        }
        else
        {
          if (paramInt != 0) {
            paramInt = 0;
          }
          for (;;)
          {
            localStringBuffer.append(((ScanResult)this.a.get(j)).BSSID.replace(":", ""));
            int m = ((ScanResult)this.a.get(j)).level;
            int k = m;
            if (m < 0) {
              k = -m;
            }
            localStringBuffer.append(String.format(Locale.CHINA, ";%d;", new Object[] { Integer.valueOf(k) }));
            break;
            localStringBuffer.append("|");
          }
        }
      }
      if (paramInt == 0) {
        return localStringBuffer.toString();
      }
      return null;
    }
  }
  
  public boolean c(l paraml)
  {
    return i.a(paraml, this, com.baidu.location.b.l.O);
  }
  
  public int d()
  {
    int k = 0;
    int i = 0;
    for (;;)
    {
      int j = k;
      if (i < a())
      {
        j = -((ScanResult)this.a.get(i)).level;
        if (j <= 0) {}
      }
      else
      {
        return j;
      }
      i += 1;
    }
  }
  
  public String d(int paramInt)
  {
    if ((paramInt == 0) || (a() < 1)) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer(256);
    if (this.a.size() > com.baidu.location.b.l.L) {
      i = com.baidu.location.b.l.L;
    }
    int k = 0;
    int i = 1;
    int j = 0;
    if (j < com.baidu.location.b.l.L)
    {
      int m = k;
      if ((i & paramInt) != 0)
      {
        if (k != 0) {
          break label163;
        }
        localStringBuffer.append("&ssid=");
      }
      for (;;)
      {
        localStringBuffer.append(((ScanResult)this.a.get(j)).BSSID.replace(":", ""));
        localStringBuffer.append(";");
        localStringBuffer.append(((ScanResult)this.a.get(j)).SSID);
        m = k + 1;
        i <<= 1;
        j += 1;
        k = m;
        break;
        label163:
        localStringBuffer.append("|");
      }
    }
    return localStringBuffer.toString();
  }
  
  public boolean e()
  {
    return this.d;
  }
  
  public boolean f()
  {
    return System.currentTimeMillis() - this.c < 3000L;
  }
  
  public boolean g()
  {
    return System.currentTimeMillis() - this.c < 5000L;
  }
  
  public boolean h()
  {
    return System.currentTimeMillis() - this.b < 3000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */