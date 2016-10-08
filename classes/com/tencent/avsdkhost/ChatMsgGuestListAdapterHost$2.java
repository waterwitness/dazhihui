package com.tencent.avsdkhost;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.avsdk.Model.CustomSysMsgVo.RedEnvelopeSys;
import java.util.List;

class ChatMsgGuestListAdapterHost$2
  implements View.OnClickListener
{
  ChatMsgGuestListAdapterHost$2(ChatMsgGuestListAdapterHost paramChatMsgGuestListAdapterHost, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if ((ChatMsgGuestListAdapterHost.access$100(this.this$0) != null) && (this.val$thePosition < ChatMsgGuestListAdapterHost.access$100(this.this$0).size()))
    {
      Object localObject = (ChatEntityHost)ChatMsgGuestListAdapterHost.access$100(this.this$0).get(this.val$thePosition);
      paramView = new CustomSysMsgVo.RedEnvelopeSys();
      paramView.EventId = "";
      paramView.HotUrl = ((ChatEntityHost)localObject).hongbaoUrl;
      paramView.Account = ((ChatEntityHost)localObject).userAccount;
      paramView.AccountName = ((ChatEntityHost)localObject).user;
      paramView.AccountLevel = ((ChatEntityHost)localObject).AccountLevel;
      localObject = ChatMsgGuestListAdapterHost.access$200(this.this$0).obtainMessage(295);
      ((Message)localObject).obj = paramView;
      ChatMsgGuestListAdapterHost.access$200(this.this$0).sendMessage((Message)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */