package com.tencent.avsdk;

import android.util.Log;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class UserilvbManager$3
  extends s
{
  UserilvbManager$3(UserilvbManager paramUserilvbManager, i parami)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    Log.e("ilvb", "UserilvbManager requestToken again by qudao_id加密后为空");
    this.this$0.requestToken();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\UserilvbManager$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */