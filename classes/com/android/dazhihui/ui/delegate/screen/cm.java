package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class cm
  implements View.OnClickListener
{
  cm(InitVerifedDongHai paramInitVerifedDongHai) {}
  
  public void onClick(View paramView)
  {
    if (InitVerifedDongHai.d(this.a) == null)
    {
      paramView = Toast.makeText(this.a, "　　获取注册激活码失败。", 0);
      paramView.setGravity(17, 0, 0);
      paramView.show();
      return;
    }
    this.a.a(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */