package com.tencent.avsdk.widget;

import android.graphics.BitmapFactory;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.aa;
import java.text.SimpleDateFormat;
import java.util.Date;

class FlowerView$2
  implements aa
{
  FlowerView$2(FlowerView paramFlowerView) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    if ((paramString.equals(FlowerView.access$500(this.this$0).userUrl + "?time=" + localSimpleDateFormat.format(new Date()))) && (paramArrayOfByte != null)) {
      this.this$0.circleImageView.setImageBitmap(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FlowerView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */