package com.tencent.avsdk.widget;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

class FlowerView$AnListener
  implements Animation.AnimationListener
{
  private int type;
  
  public FlowerView$AnListener(FlowerView paramFlowerView, int paramInt)
  {
    this.type = paramInt;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (this.type == 0) {
      this.this$0.mHandler.sendEmptyMessage(0);
    }
    do
    {
      return;
      if (this.type == 1)
      {
        FlowerView.access$802(this.this$0, FlowerView.access$800(this.this$0) + 1);
        this.this$0.beishu.setText("X" + FlowerView.access$800(this.this$0));
        this.this$0.beishu.setVisibility(0);
        if (FlowerView.access$800(this.this$0) >= this.this$0.setlinkCount(0, 0))
        {
          FlowerView.access$902(this.this$0, true);
          FlowerView.access$1100(this.this$0, FlowerView.access$1000(this.this$0));
          return;
        }
        this.this$0.mHandler.sendEmptyMessage(1);
        return;
      }
      if (this.type == 2)
      {
        FlowerView.access$802(this.this$0, FlowerView.access$800(this.this$0) + 1);
        this.this$0.beishu.setText("X" + FlowerView.access$800(this.this$0));
        if (FlowerView.access$800(this.this$0) >= this.this$0.setlinkCount(0, 0))
        {
          FlowerView.access$902(this.this$0, true);
          FlowerView.access$1100(this.this$0, FlowerView.access$1000(this.this$0));
          return;
        }
        this.this$0.mHandler.sendEmptyMessage(1);
        return;
      }
    } while (this.type != 3);
    this.this$0.mHandler.sendEmptyMessage(2);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FlowerView$AnListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */