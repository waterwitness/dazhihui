package com.tencent.avsdk.widget;

import android.view.View;

class MyGallery$2
  implements Runnable
{
  MyGallery$2(MyGallery paramMyGallery, View paramView) {}
  
  public void run()
  {
    int i = this.val$tabView.getLeft();
    int j = (this.this$0.getWidth() - this.val$tabView.getWidth()) / 2;
    this.this$0.smoothScrollTo(i - j, 0);
    MyGallery.access$202(this.this$0, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\MyGallery$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */