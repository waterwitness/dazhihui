package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.screen.BrowserActivity;

class at
  implements View.OnClickListener
{
  at(CommentViewBZTJ paramCommentViewBZTJ, JsonPLItem paramJsonPLItem) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a.getAuthorlink();
    if (TextUtils.isEmpty(paramView)) {
      return;
    }
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramView);
    localIntent.putExtras(localBundle);
    localIntent.setClass(CommentViewBZTJ.a(this.b), BrowserActivity.class);
    CommentViewBZTJ.a(this.b).startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */