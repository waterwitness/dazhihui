package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.dazhihui.d.aq;

class hn
  implements Runnable
{
  hn(MainScreen paramMainScreen) {}
  
  public void run()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("BugFile", 0);
    String str1 = localSharedPreferences.getString("bugInfo", "");
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = localSharedPreferences.getString("bugTime", "");
      aq.a(this.a, str1, str2, new ho(this, localSharedPreferences));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */