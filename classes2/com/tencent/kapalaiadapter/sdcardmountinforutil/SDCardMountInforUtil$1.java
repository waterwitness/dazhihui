package com.tencent.kapalaiadapter.sdcardmountinforutil;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class SDCardMountInforUtil$1
  extends BroadcastReceiver
{
  SDCardMountInforUtil$1(SDCardMountInforUtil paramSDCardMountInforUtil) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (("android.intent.action.MEDIA_MOUNTED".equals(paramContext)) || ("android.intent.action.MEDIA_SCANNER_STARTED".equals(paramContext)) || ("android.intent.action.MEDIA_SCANNER_FINISHED".equals(paramContext)) || ("android.intent.action.MEDIA_REMOVED".equals(paramContext)) || ("android.intent.action.MEDIA_UNMOUNTED".equals(paramContext)) || ("android.intent.action.MEDIA_BAD_REMOVAL".equals(paramContext))) {
      SDCardMountInforUtil.access$100(this.this$0, SDCardMountInforUtil.access$000(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\kapalaiadapter\sdcardmountinforutil\SDCardMountInforUtil$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */