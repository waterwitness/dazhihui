package com.thinkive.mobile.account.activitys;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.thinkive.mobile.account.tools.FaceEditPhotoView;

final class FacePhotographActivity$5
  implements View.OnClickListener
{
  FacePhotographActivity$5(FacePhotographActivity paramFacePhotographActivity) {}
  
  public final void onClick(View paramView)
  {
    if (FacePhotographActivity.c(this.a).getText().equals("取消"))
    {
      FacePhotographActivity.d(this.a).a();
      FacePhotographActivity.e = false;
      this.a.finish();
    }
    while (!FacePhotographActivity.c(this.a).getText().equals("重拍")) {
      return;
    }
    FacePhotographActivity.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */