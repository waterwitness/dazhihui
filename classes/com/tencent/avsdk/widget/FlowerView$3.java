package com.tencent.avsdk.widget;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.a.aa;

class FlowerView$3
  implements aa
{
  FlowerView$3(FlowerView paramFlowerView) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      this.this$0.flowerImg.setImageBitmap(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
      this.this$0.leftContent.setVisibility(4);
      this.this$0.flowerImg.setVisibility(4);
      this.this$0.beishu.setVisibility(4);
      this.this$0.rootView.setVisibility(0);
      FlowerView.access$700(this.this$0, FlowerView.access$600(this.this$0));
      return;
    }
    this.this$0.mHandler.sendEmptyMessage(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FlowerView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */