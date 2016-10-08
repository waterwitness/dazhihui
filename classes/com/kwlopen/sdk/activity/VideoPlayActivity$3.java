package com.kwlopen.sdk.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class VideoPlayActivity$3
  implements DialogInterface.OnClickListener
{
  VideoPlayActivity$3(VideoPlayActivity paramVideoPlayActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("type", "3");
    this.this$0.setResult(-1, paramDialogInterface);
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoPlayActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */