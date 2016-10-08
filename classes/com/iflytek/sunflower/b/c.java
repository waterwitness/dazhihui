package com.iflytek.sunflower.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.d;
import org.apache.http.util.EncodingUtils;
import org.json.JSONObject;

class c
  implements a.a
{
  c(b paramb, JSONObject paramJSONObject) {}
  
  public void a(a parama, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        if (a.a(EncodingUtils.getString(com.iflytek.sunflower.c.c.b(paramArrayOfByte), "utf-8")))
        {
          a(new Exception());
          return;
        }
        a(null);
        return;
      }
      catch (Exception parama)
      {
        a(parama);
      }
    }
  }
  
  public void a(Exception paramException)
  {
    if (paramException != null)
    {
      if (b.a(this.b) == 0) {
        g.d("Collector", "upload error. please check net state");
      }
      for (;;)
      {
        b.a(this.b, this.a);
        return;
        if (b.a(this.b) == 1) {
          g.f("Collector", "upload error. please check net state");
        }
      }
    }
    if (b.a(this.b) == 0) {
      g.b("Collector", "upload success");
    }
    for (;;)
    {
      try
      {
        paramException = d.a(b.b(this.b)).edit();
        paramException.putLong("dntr", com.iflytek.sunflower.c.a.a[0]);
        paramException.putLong("uptr", com.iflytek.sunflower.c.a.a[1]);
        paramException.commit();
        b.c(this.b);
        return;
      }
      catch (Exception paramException)
      {
        return;
      }
      if (b.a(this.b) == 1) {
        g.e("Collector", "upload success");
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */