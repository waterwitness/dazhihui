package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import com.android.dazhihui.ui.screen.BrowserActivity;

class ua
  implements DialogInterface.OnClickListener
{
  ua(tz paramtz, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent();
    Bundle localBundle = new Bundle();
    String str = this.a.getText().toString();
    if ((TextUtils.isEmpty(str)) || ("http://".equals(str))) {
      return;
    }
    localBundle.putString("nexturl", str);
    paramDialogInterface.putExtras(localBundle);
    paramDialogInterface.setClass(this.b.a.getActivity(), BrowserActivity.class);
    this.b.a.startActivity(paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */