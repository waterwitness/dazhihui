package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.screen.BrowserActivity;

class py
  implements DialogInterface.OnClickListener
{
  py(PublicMessageDialog paramPublicMessageDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((PublicMessageDialog.b(this.a) == 4) || (PublicMessageDialog.b(this.a) == 13))
    {
      paramDialogInterface = new Intent(this.a, BrowserActivity.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", PublicMessageDialog.c(this.a));
      localBundle.putBoolean("isToMain", false);
      localBundle.putString("names", this.a.getResources().getString(2131165355));
      paramDialogInterface.putExtras(localBundle);
      if (PublicMessageDialog.b(this.a) == 4)
      {
        this.a.finish();
        r.a(PublicMessageDialog.c(this.a), this.a, "", null);
        return;
      }
      r.a(true, 19);
      r.a(PublicMessageDialog.c(this.a), this.a, "", null);
      r.a(false, -100);
      return;
    }
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("type", (byte)2);
    paramDialogInterface.setClass(this.a, MessageCenterList.class);
    this.a.finish();
    this.a.startActivity(paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */