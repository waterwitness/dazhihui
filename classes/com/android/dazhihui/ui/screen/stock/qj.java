package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.ui.RecognizerDialogListener;

class qj
  implements RecognizerDialogListener
{
  qj(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void onError(SpeechError paramSpeechError)
  {
    SearchHuiFragment.a(this.a, paramSpeechError.getPlainDescription(true));
  }
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    SearchHuiFragment.m(this.a).setVisibility(8);
    SearchHuiFragment.a(this.a, paramRecognizerResult);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */