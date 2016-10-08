package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.screen.BrowserActivity;

class r
  implements View.OnClickListener
{
  r(o paramo) {}
  
  public void onClick(View paramView)
  {
    paramView = ((JsonPLItem)paramView.getTag()).getAuthorlink();
    if ((paramView != null) && (!paramView.equals("")))
    {
      Intent localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", paramView);
      localIntent.putExtras(localBundle);
      localIntent.setClass(o.f(this.a), BrowserActivity.class);
      o.f(this.a).startActivity(localIntent);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */