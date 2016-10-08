package com.thinkive.mobile.account.activitys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;

final class IdentityPhotoActivity$4
  implements View.OnClickListener
{
  IdentityPhotoActivity$4(IdentityPhotoActivity paramIdentityPhotoActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent("android.intent.action.PICK", null);
    paramView.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
    try
    {
      this.a.startActivityForResult(paramView, 2);
      return;
    }
    catch (ActivityNotFoundException paramView)
    {
      paramView = new Intent("android.intent.action.GET_CONTENT");
      paramView.setType("image/*");
      this.a.startActivityForResult(paramView, 2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */