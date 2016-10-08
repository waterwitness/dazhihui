package com.thinkive.mobile.video.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class OfflineVideoActivity$1
  implements View.OnClickListener
{
  OfflineVideoActivity$1(OfflineVideoActivity paramOfflineVideoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.b == 0)
    {
      if (this.a.c.equals("1")) {
        this.a.e();
      }
      while (!this.a.c.equals("2")) {
        return;
      }
      this.a.j();
      this.a.e();
      return;
    }
    Toast.makeText(this.a, "亲，视频还在播放中", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */