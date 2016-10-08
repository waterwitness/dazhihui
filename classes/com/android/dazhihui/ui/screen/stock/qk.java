package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;

class qk
  implements RecognizerListener
{
  qk(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void onBeginOfSpeech()
  {
    SearchHuiFragment.a(this.a, "开始说话");
  }
  
  public void onEndOfSpeech()
  {
    SearchHuiFragment.m(this.a).setVisibility(8);
    SearchHuiFragment.a(this.a, "结束说话");
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    SearchHuiFragment.m(this.a).setVisibility(8);
    SearchHuiFragment.a(this.a, paramSpeechError.getPlainDescription(true));
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle) {}
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    Log.d("speech", paramRecognizerResult.getResultString());
    SearchHuiFragment.m(this.a).setVisibility(8);
    SearchHuiFragment.a(this.a, paramRecognizerResult);
    if (paramBoolean) {}
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    SearchHuiFragment.a(this.a, "当前正在说话，音量大小：" + paramInt);
    Log.d("speech", "返回音频数据：" + paramArrayOfByte.length);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */