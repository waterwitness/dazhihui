package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import com.android.dazhihui.b.b;
import com.android.dazhihui.b.h;
import java.lang.reflect.Field;
import java.util.List;

class pv
  implements DialogInterface.OnClickListener
{
  pv(PublicMessageDialog paramPublicMessageDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      Field localField = paramDialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
      Object localObject = PublicMessageDialog.a(this.a).d(0);
      if (((List)localObject).size() == 0)
      {
        paramDialogInterface = new Intent();
        paramDialogInterface.putExtra("type", (byte)2);
        paramDialogInterface.setClass(this.a, MessageCenterList.class);
        this.a.startActivity(paramDialogInterface);
        this.a.finish();
        return;
      }
      if (((List)localObject).size() == 1) {
        ((AlertDialog)paramDialogInterface).getButton(paramInt).setText(2131166138);
      }
      localObject = (h)((List)localObject).get(((List)localObject).size() - 1);
      PublicMessageDialog.a(this.a).c(((h)localObject).a);
      ((AlertDialog)paramDialogInterface).setMessage(((h)localObject).f);
      localField.setAccessible(true);
      localField.set(paramDialogInterface, Boolean.valueOf(false));
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */