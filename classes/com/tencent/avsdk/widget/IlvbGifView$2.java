package com.tencent.avsdk.widget;

import android.os.Handler;
import com.android.dazhihui.ui.widget.a.aa;

class IlvbGifView$2
  implements aa
{
  IlvbGifView$2(IlvbGifView paramIlvbGifView) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this.this$0.mHandler.sendEmptyMessage(0);
      return;
    }
    this.this$0.setGifCallBack(this.this$0.gifCallBack);
    this.this$0.setImage(paramArrayOfByte);
    this.this$0.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbGifView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */