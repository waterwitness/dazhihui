package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class jl
  implements View.OnClickListener
{
  jl(MessageWarnScreen paramMessageWarnScreen) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    paramView = new Bundle();
    paramView.putInt("searchType", 1);
    this.a.startActivity(SearchStockScreen.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */