package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem.ReplyItem;
import com.android.dazhihui.ui.screen.stock.GUHDetailBZTJ;

class ie
  implements View.OnClickListener
{
  ie(hv paramhv) {}
  
  public void onClick(View paramView)
  {
    JsonMyTalkItem localJsonMyTalkItem = (JsonMyTalkItem)paramView.getTag(2131558470);
    paramView = localJsonMyTalkItem.getReply().getHot();
    if ((localJsonMyTalkItem.getTopurl().equals("")) && ((paramView.equals("true")) || (paramView.equals("1"))))
    {
      paramView = new Intent(hv.f(this.a), GUHDetailBZTJ.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("opid", localJsonMyTalkItem.getReply().getId());
      if (localJsonMyTalkItem.getStock() != null)
      {
        Object localObject = localJsonMyTalkItem.getStock().toString().replace("{", "").replace("}", "").split("=|:");
        if ((localObject != null) && (localObject.length == 2))
        {
          localJsonMyTalkItem = localObject[0];
          localObject = localObject[1];
          localBundle.putString("code", localJsonMyTalkItem);
          localBundle.putString("name", (String)localObject);
        }
      }
      localBundle.putBoolean("isShowKeyboard", false);
      paramView.putExtras(localBundle);
      hv.f(this.a).startActivity(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */