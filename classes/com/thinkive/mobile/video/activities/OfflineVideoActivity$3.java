package com.thinkive.mobile.video.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class OfflineVideoActivity$3
  implements View.OnClickListener
{
  OfflineVideoActivity$3(OfflineVideoActivity paramOfflineVideoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (System.currentTimeMillis() - OfflineVideoActivity.f(this.a) < 1500L) {}
    do
    {
      return;
      OfflineVideoActivity.b(this.a, System.currentTimeMillis());
      if (this.a.d.equals("0"))
      {
        Toast.makeText(this.a, "亲，您还没有录制视频，请视频录制完成在进行上传操作", 0).show();
        return;
      }
      if (this.a.d.equals("1"))
      {
        if (this.a.b == 0)
        {
          this.a.b(50L);
          return;
        }
        this.a.h();
        this.a.b(688L);
        return;
      }
    } while (!this.a.d.equals("2"));
    Toast.makeText(this.a, "亲，视频正在录制，请视频录制完成在进行上传操作", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */