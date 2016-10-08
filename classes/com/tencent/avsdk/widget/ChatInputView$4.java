package com.tencent.avsdk.widget;

import android.os.SystemClock;
import android.widget.Toast;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.ui.RecognizerDialogListener;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.control.QavsdkControl;

class ChatInputView$4
  implements RecognizerDialogListener
{
  ChatInputView$4(ChatInputView paramChatInputView) {}
  
  public void onError(SpeechError paramSpeechError)
  {
    Toast.makeText(ChatInputView.access$300(this.this$0), paramSpeechError.getPlainDescription(true), 0).show();
    if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
      QavsdkControl.getInstance().getAVContext().getAudioCtrl().startTRAEServiceWhenIsSystemApp();
    }
    this.this$0.isRecord = false;
    AboveVideoBottomView.mLastRecoverHostAudioTime = SystemClock.uptimeMillis();
    ChatInputView.access$102(this.this$0, ChatInputView.SpeechState.SPEECH_IDLE);
  }
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    ChatInputView.access$200(this.this$0, paramRecognizerResult);
    if (paramBoolean)
    {
      if ((QavsdkControl.getInstance().getAVContext() != null) && (QavsdkControl.getInstance().getAVContext().getAudioCtrl() != null)) {
        QavsdkControl.getInstance().getAVContext().getAudioCtrl().startTRAEServiceWhenIsSystemApp();
      }
      this.this$0.isRecord = false;
      AboveVideoBottomView.mLastRecoverHostAudioTime = SystemClock.uptimeMillis();
      ChatInputView.access$102(this.this$0, ChatInputView.SpeechState.SPEECH_IDLE);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatInputView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */