package com.thinkive.mobile.account.activitys;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.compatible.Parameter;

final class CameraActivity$2
  implements View.OnClickListener
{
  CameraActivity$2(CameraActivity paramCameraActivity) {}
  
  public final void onClick(View paramView)
  {
    CameraActivity.a(this.a, new DialogFrame(this.a));
    CameraActivity.a(this.a).waitDialog("请稍等...", "影像上传中.", false);
    paramView = this.a.e();
    paramView.addParameter("img_data", this.a.d());
    CameraActivity.a(this.a, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\CameraActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */