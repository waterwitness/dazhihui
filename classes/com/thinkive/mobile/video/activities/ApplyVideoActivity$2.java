package com.thinkive.mobile.video.activities;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

final class ApplyVideoActivity$2
  implements View.OnClickListener
{
  ApplyVideoActivity$2(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (ApplyVideoActivity.i(this.a).getText().toString().equals("取消排队"))
    {
      this.a.q();
      this.a.finish();
      return;
    }
    this.a.e = false;
    this.a.d = false;
    this.a.b = false;
    this.a.c = false;
    this.a.i = "0";
    this.a.p();
    this.a.b(false);
    this.a.a(false);
    this.a.j().setBackgroundColor(Color.parseColor("#999999"));
    this.a.j().setText("正在申请视频见证...");
    this.a.j().setClickable(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */