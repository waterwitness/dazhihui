package com.baidu.location.e;

import android.net.wifi.ScanResult;
import java.util.List;
import java.util.Locale;

public class ae
{
  public List a = null;
  private long c = 0L;
  
  public ae(aa paramaa, List paramList)
  {
    this.a = paramList;
    this.c = System.currentTimeMillis();
    b();
  }
  
  private void b()
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
    if (a() < 2) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer(512);
    int i1 = this.a.size();
    int k = 0;
    int j = 0;
    int m;
    for (int i = 1;; i = m)
    {
      m = i;
      if (k >= i1) {
        break label207;
      }
      if (((ScanResult)this.a.get(k)).level != 0) {
        break;
      }
      m = i;
      k += 1;
    }
    if (i != 0)
    {
      localStringBuffer.append("&wf=");
      i = 0;
    }
    for (;;)
    {
      localStringBuffer.append(((ScanResult)this.a.get(k)).BSSID.replace(":", ""));
      int n = ((ScanResult)this.a.get(k)).level;
      m = n;
      if (n < 0) {
        m = -n;
      }
      localStringBuffer.append(String.format(Locale.CHINA, ";%d;", new Object[] { Integer.valueOf(m) }));
      n = j + 1;
      j = n;
      m = i;
      if (n <= paramInt) {
        break;
      }
      m = i;
      label207:
      if (m == 0) {
        break label224;
      }
      return null;
      localStringBuffer.append("|");
    }
    label224:
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */