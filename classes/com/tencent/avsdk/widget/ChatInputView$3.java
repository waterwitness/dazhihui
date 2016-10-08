package com.tencent.avsdk.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.control.QavsdkControl;

class ChatInputView$3
  implements DialogInterface.OnCancelListener
{
  ChatInputView$3(ChatInputView paramChatInputView) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().startTRAEServiceWhenIsSystemApp();
    }
    this.this$0.isRecord = false;
    ChatInputView.access$102(this.this$0, ChatInputView.SpeechState.SPEECH_IDLE);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatInputView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */