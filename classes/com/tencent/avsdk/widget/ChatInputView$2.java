package com.tencent.avsdk.widget;

import android.util.Log;
import com.iflytek.cloud.InitListener;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.control.QavsdkControl;

class ChatInputView$2
  implements InitListener
{
  ChatInputView$2(ChatInputView paramChatInputView) {}
  
  public void onInit(int paramInt)
  {
    Log.d(ChatInputView.access$000(), "SpeechRecognizer init() code = " + paramInt);
    if (paramInt != 0)
    {
      if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
        QavsdkControl.getInstance().getAVContext().getAudioCtrl().startTRAEServiceWhenIsSystemApp();
      }
      this.this$0.isRecord = false;
      ChatInputView.access$102(this.this$0, ChatInputView.SpeechState.SPEECH_IDLE);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatInputView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */