package com.tencent.avsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BrowserActivity;

class ChatMsgGuestListAdapter$1
  implements View.OnClickListener
{
  ChatMsgGuestListAdapter$1(ChatMsgGuestListAdapter paramChatMsgGuestListAdapter) {}
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof ChatMsgGuestListAdapter.ViewHolder)))
    {
      paramView = (ChatMsgGuestListAdapter.ViewHolder)paramView.getTag();
      String str = f.ap + paramView.userAccount;
      Bundle localBundle = new Bundle();
      Intent localIntent = new Intent(ChatMsgGuestListAdapter.access$000(this.this$0), BrowserActivity.class);
      localBundle.putString("nexturl", str);
      localIntent.putExtras(localBundle);
      if (!TextUtils.isEmpty(paramView.userAccount)) {
        ChatMsgGuestListAdapter.access$000(this.this$0).startActivity(localIntent);
      }
      if (g.a().L()) {
        Log.d(ChatMsgGuestListAdapter.access$100(), "用户的主页=" + str);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\ChatMsgGuestListAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */