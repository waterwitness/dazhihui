package com.thinkive.mobile.account.activitys;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.thinkive.android.widget.OpenPhotoView;

final class IdentityPhotoActivity$3
  implements View.OnClickListener
{
  IdentityPhotoActivity$3(IdentityPhotoActivity paramIdentityPhotoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (IdentityPhotoActivity.b(this.a).getTag().equals("0"))
    {
      IdentityPhotoActivity.b(this.a).setEnabled(false);
      IdentityPhotoActivity.c(this.a).c();
      return;
    }
    IdentityPhotoActivity.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */