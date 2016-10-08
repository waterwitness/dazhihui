package com.tencent.avsdk;

import android.util.Log;
import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.w;

class UserilvbManager$1
  implements b
{
  UserilvbManager$1(UserilvbManager paramUserilvbManager) {}
  
  public void loginStatusChange(c paramc)
  {
    Log.i("ilvb", "UserilvbManager iLoginListener status=" + paramc + " isLogin=" + w.a().l());
    if (paramc == c.b) {
      this.this$0.requestToken();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\UserilvbManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */