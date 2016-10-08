package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.PrintStream;

class fc
  implements View.OnClickListener
{
  fc(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    Intent localIntent = new Intent();
    paramView.putInt("loginfragmentfalg", 1);
    paramView.putString("gotoFlag", dy.d(this.a));
    paramView.putBoolean("haveNoLoginSorHaveOne", dy.e(this.a));
    System.out.println("点击添加券商  haveNoLoginSorHaveOne   " + dy.e(this.a));
    localIntent.putExtras(paramView);
    localIntent.setClass(this.a.getActivity(), TradeOutsideScreen.class);
    this.a.startActivity(localIntent);
    dy.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */