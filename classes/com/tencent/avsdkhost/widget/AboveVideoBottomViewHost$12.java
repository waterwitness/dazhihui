package com.tencent.avsdkhost.widget;

import android.graphics.Bitmap;
import android.view.View;
import com.g.a.b.a.b;
import com.g.a.b.f.a;

class AboveVideoBottomViewHost$12
  implements a
{
  AboveVideoBottomViewHost$12(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public void onLoadingCancelled(String paramString, View paramView) {}
  
  public void onLoadingComplete(String paramString, View paramView, Bitmap paramBitmap)
  {
    AboveVideoBottomViewHost.access$1302(this.this$0, paramBitmap);
  }
  
  public void onLoadingFailed(String paramString, View paramView, b paramb) {}
  
  public void onLoadingStarted(String paramString, View paramView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */