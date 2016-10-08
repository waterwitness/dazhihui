package com.android.dazhihui.ui.delegate.b;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.dazhihui.ui.a.e;

final class q
  implements DialogInterface.OnClickListener
{
  q(Activity paramActivity, String paramString1, String paramString2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 0;
    paramInt = 0;
    String str;
    if (paramInt < com.android.dazhihui.c.a.a.B[o.B].length) {
      if (!com.android.dazhihui.c.a.a.B[o.B][paramInt].equals(""))
      {
        str = com.android.dazhihui.c.a.a.B[o.B][paramInt];
        paramInt = i;
      }
    }
    for (;;)
    {
      label47:
      if (paramInt < com.android.dazhihui.c.a.a.D[o.B].length) {
        if (com.android.dazhihui.c.a.a.D[o.B][paramInt].equals("")) {}
      }
      for (paramDialogInterface = com.android.dazhihui.c.a.a.D[o.B][paramInt];; paramDialogInterface = null)
      {
        if ((str == null) || (paramDialogInterface == null))
        {
          return;
          paramInt += 1;
          break;
          paramInt += 1;
          break label47;
        }
        for (;;)
        {
          Bundle localBundle;
          try
          {
            Intent localIntent = this.a.getPackageManager().getLaunchIntentForPackage(str);
            if (this.b.equals("海通证券"))
            {
              localBundle = new Bundle();
              localBundle.putString("type", "trade");
              str = e.a().g();
              if (this.c == null)
              {
                localBundle.putString("id", "0");
                localIntent.putExtras(localBundle);
              }
            }
            else
            {
              this.a.startActivity(localIntent);
              o.a(this.b, this.a);
              return;
            }
          }
          catch (Exception localException)
          {
            o.C = paramDialogInterface;
            new AlertDialog.Builder(this.a).setTitle("提示").setMessage("您还未下载“" + com.android.dazhihui.c.a.a.F[o.B] + "”是否进行下载？").setPositiveButton("下载", new r(this)).setNegativeButton("取消", null).show();
            return;
          }
          Object localObject2;
          if (this.c.equals("138"))
          {
            localBundle.putString("id", "21001");
            localObject2 = localException;
            if (localException == null) {
              localObject2 = "";
            }
            localBundle.putString("code", (String)localObject2);
          }
          else if (this.c.equals("139"))
          {
            localBundle.putString("id", "21002");
            localObject2 = localException;
            if (localException == null) {
              localObject2 = "";
            }
            localBundle.putString("code", (String)localObject2);
          }
          else if (this.c.equals("chedan"))
          {
            localBundle.putString("id", "21003");
          }
          else if (this.c.equals("chicang"))
          {
            localBundle.putString("id", "21004");
          }
          else
          {
            localBundle.putString("id", "0");
          }
        }
      }
      Object localObject1 = null;
      paramInt = i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */