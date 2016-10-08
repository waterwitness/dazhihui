package com.tencent.avsdk;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.avsdk.Model.CustomSysMsgVo.RedEnvelopeSys;
import java.util.List;

class ChatMsgGuestListAdapter$2
  implements View.OnClickListener
{
  ChatMsgGuestListAdapter$2(ChatMsgGuestListAdapter paramChatMsgGuestListAdapter, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if ((ChatMsgGuestListAdapter.access$200(this.this$0) != null) && (this.val$thePosition < ChatMsgGuestListAdapter.access$200(this.this$0).size()))
    {
      Object localObject = (ChatEntity)ChatMsgGuestListAdapter.access$200(this.this$0).get(this.val$thePosition);
      paramView = new CustomSysMsgVo.RedEnvelopeSys();
      paramView.EventId = "";
      paramView.HotUrl = ((ChatEntity)localObject).hongbaoUrl;
      paramView.Account = ((ChatEntity)localObject).userAccount;
      paramView.AccountName = ((ChatEntity)localObject).user;
      paramView.AccountLevel = ((ChatEntity)localObject).AccountLevel;
      localObject = ChatMsgGuestListAdapter.access$300(this.this$0).obtainMessage(295);
      ((Message)localObject).obj = paramView;
      ChatMsgGuestListAdapter.access$300(this.this$0).sendMessage((Message)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\ChatMsgGuestListAdapter$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */