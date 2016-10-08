package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem;
import com.android.dazhihui.ui.screen.BrowserActivity;

class hz
  implements View.OnClickListener
{
  hz(hv paramhv) {}
  
  public void onClick(View paramView)
  {
    paramView = ((JsonMyTalkItem)paramView.getTag()).getAuthorlink();
    if ((paramView != null) && (!paramView.equals("")))
    {
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", paramView);
      localIntent.putExtras(localBundle);
      localIntent.setClass(hv.f(this.a), BrowserActivity.class);
      hv.f(this.a).startActivity(localIntent);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */