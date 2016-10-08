package com.tencent.avsdkhost.widget;

import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVVideoCtrl;
import com.tencent.avsdk.control.QavsdkControl;

class AboveVideoBottomViewHost$4
  implements SeekBar.OnSeekBarChangeListener
{
  AboveVideoBottomViewHost$4(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("ilvb", "美颜 onProgressChanged progress=" + paramInt);
    if ((AboveVideoBottomViewHost.access$500(this.this$0) != null) && (AboveVideoBottomViewHost.access$500(this.this$0).getAVContext() != null) && (AboveVideoBottomViewHost.access$500(this.this$0).getAVContext().getVideoCtrl() != null)) {
      AboveVideoBottomViewHost.access$500(this.this$0).getAVContext().getVideoCtrl().inputBeautyParam(AboveVideoBottomViewHost.getBeautyProgress(paramInt));
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    Log.d("ilvb", "onStartTrackingTouch");
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    Log.d("ilvb", "onStopTrackingTouch");
    Toast.makeText(AboveVideoBottomViewHost.access$400(this.this$0), "美颜效果:" + paramSeekBar.getProgress() + "%", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */