package com.thinkive.mobile.video.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class OfflineVideoActivity$2
  implements View.OnClickListener
{
  OfflineVideoActivity$2(OfflineVideoActivity paramOfflineVideoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (System.currentTimeMillis() - OfflineVideoActivity.e(this.a) < 1500L) {}
    do
    {
      return;
      OfflineVideoActivity.a(this.a, System.currentTimeMillis());
      if (this.a.d.equals("0"))
      {
        Toast.makeText(this.a, "亲，您还没有录制视频，请视频录制完成在进行删除操作", 0).show();
        return;
      }
      if (this.a.d.equals("1"))
      {
        if (this.a.b == 0)
        {
          this.a.a(50L);
          return;
        }
        this.a.h();
        this.a.a(688L);
        return;
      }
    } while (!this.a.d.equals("2"));
    Toast.makeText(this.a, "亲，视频正在录制，请视频录制完成在进行删除操作", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */