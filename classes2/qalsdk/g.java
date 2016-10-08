package qalsdk;

import com.tencent.qalsdk.util.QLog;

class g
  implements bf
{
  g(e parame) {}
  
  public void a(int paramInt1, int paramInt2, String paramString, Object paramObject)
  {
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() > 10) {
        str = paramString.substring(0, 10);
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d("WifiDetector", 2, "WIFI detect onEchoResult, taskId: " + paramInt1 + " result: " + paramInt2 + " actualContent: " + str);
    }
    paramInt2 = e.a(this.a, paramInt2);
    e.a(this.a, paramInt2, (String)paramObject);
    e.b(this.a, e.a(this.a) - (1 << paramInt1));
    if (e.a(this.a) == 0) {
      this.a.d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */