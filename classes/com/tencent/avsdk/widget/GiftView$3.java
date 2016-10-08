package com.tencent.avsdk.widget;

import com.tencent.avsdk.Model.GiftVo;
import com.tencent.avsdk.control.GiftManager.GiftCallBack;

class GiftView$3
  implements GiftManager.GiftCallBack
{
  GiftView$3(GiftView paramGiftView) {}
  
  public void callBack(GiftVo paramGiftVo)
  {
    GiftView.access$202(this.this$0, paramGiftVo);
    this.this$0.adapter.notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */