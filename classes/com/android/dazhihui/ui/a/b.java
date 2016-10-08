package com.android.dazhihui.ui.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;

class b
  implements i
{
  b(a parama, int paramInt) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    a.a(this.b).getSharedPreferences("AdvertCrc", 0).edit().putInt("AdvertCrc", this.a).commit();
    this.b.a = this.a;
    paramh = ((g)paramj).a();
    this.b.b(a.a(this.b), new String(paramh));
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */