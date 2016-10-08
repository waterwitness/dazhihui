package com.tencent.avsdk.widget;

import android.view.View;

class FireworksAnimation$1$1$1
  implements Runnable
{
  FireworksAnimation$1$1$1(FireworksAnimation.1.1 param1) {}
  
  public void run()
  {
    if (this.this$2.this$1.this$0.showNumber == 1)
    {
      this.this$2.this$1.this$0.setVisibility(8);
      this.this$2.this$1.this$0.imageView1.setVisibility(4);
      this.this$2.this$1.this$0.imageView2.setVisibility(4);
      this.this$2.this$1.this$0.imageView3.setVisibility(4);
      this.this$2.this$1.this$0.start(this.this$2.this$1.val$xx, this.this$2.this$1.val$mRunnable);
    }
    do
    {
      return;
      this.this$2.this$1.this$0.showNumber = 0;
      this.this$2.this$1.this$0.setVisibility(8);
      this.this$2.this$1.this$0.imageView1.setVisibility(4);
      this.this$2.this$1.this$0.imageView2.setVisibility(4);
      this.this$2.this$1.this$0.imageView3.setVisibility(4);
      this.this$2.this$1.this$0.isShowAnimation = false;
    } while (this.this$2.this$1.val$mRunnable == null);
    this.this$2.this$1.val$mRunnable.run();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FireworksAnimation$1$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */