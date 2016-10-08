package com.iflytek.sunflower.task;

import com.iflytek.sunflower.b.a;
import com.iflytek.sunflower.b.a.a;
import com.iflytek.sunflower.c.c;
import com.iflytek.sunflower.c.g;
import org.apache.http.util.EncodingUtils;
import org.json.JSONObject;

class f
  implements a.a
{
  f(e parame) {}
  
  public void a(a parama, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    try
    {
      parama = new JSONObject(EncodingUtils.getString(c.b(paramArrayOfByte), "utf-8"));
      this.a.a(parama);
      return;
    }
    catch (Exception parama)
    {
      a(parama);
    }
  }
  
  public void a(Exception paramException)
  {
    g.c("Collector", "get online config error:" + paramException);
  }
  
  public void a(byte[] paramArrayOfByte) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */