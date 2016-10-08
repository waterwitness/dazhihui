package com.iflytek.speech.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.iflytek.cloud.SpeechUtility;

class ApkInstaller$1
  implements DialogInterface.OnClickListener
{
  ApkInstaller$1(ApkInstaller paramApkInstaller) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = SpeechUtility.getUtility().getComponentUrl();
    ApkInstaller.access$100(this.this$0, ApkInstaller.access$000(this.this$0), paramDialogInterface, "SpeechService.apk");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\util\ApkInstaller$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */