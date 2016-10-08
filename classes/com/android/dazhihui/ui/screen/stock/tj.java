package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.w;
import com.tencent.avsdk.activity.MyFavoriteActivity;

class tj
  implements View.OnClickListener
{
  tj(ti paramti) {}
  
  public void onClick(View paramView)
  {
    if (w.a().l())
    {
      paramView = new Intent();
      paramView.setClass(this.a.getActivity(), MyFavoriteActivity.class);
      this.a.startActivity(paramView);
      return;
    }
    paramView = new Intent(this.a.getActivity(), LoginMainScreen.class);
    paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */