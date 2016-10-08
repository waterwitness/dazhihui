package com.android.dazhihui.ui.screen.stock;

import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.UserilvbManager.OnIlvbSoundModeListener;
import com.tencent.avsdk.widget.FloatingView;

class hq
  implements UserilvbManager.OnIlvbSoundModeListener
{
  hq(MainScreen paramMainScreen) {}
  
  public void onIlvbSoundModeChange()
  {
    if (this.a.isFinishing()) {
      if (MainScreen.f(this.a) != null)
      {
        MainScreen.f(this.a).release();
        MainScreen.a(this.a, null);
      }
    }
    do
    {
      return;
      if (UserilvbManager.getInstance().getSavedRoomInfo() != null)
      {
        if (MainScreen.f(this.a) == null) {
          MainScreen.a(this.a, new FloatingView(this.a));
        }
        MainScreen.f(this.a).show();
        return;
      }
    } while (MainScreen.f(this.a) == null);
    MainScreen.f(this.a).hide();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */