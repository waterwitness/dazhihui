package com.android.dazhihui.d;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;

public final class bh
{
  private static AlertDialog a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnCancelListener paramOnCancelListener, String paramString5, DialogInterface.OnClickListener paramOnClickListener3)
  {
    paramContext = new AlertDialog.Builder(paramContext);
    if (paramInt != 0) {
      paramContext.setIcon(paramInt);
    }
    if (paramOnCancelListener != null) {
      paramContext.setOnCancelListener(paramOnCancelListener);
    }
    if (paramString5 != null) {
      paramContext.setNeutralButton(paramString5, paramOnClickListener3);
    }
    if (!TextUtils.isEmpty(paramString2)) {
      paramContext.setMessage(paramString2);
    }
    if (paramString3 == null) {
      paramContext.setTitle(paramString1).setNegativeButton(paramString4, paramOnClickListener2);
    }
    for (;;)
    {
      return paramContext.create();
      if (paramString4 == null) {
        paramContext.setTitle(paramString1).setPositiveButton(paramString3, paramOnClickListener1);
      } else {
        paramContext.setTitle(paramString1).setPositiveButton(paramString3, paramOnClickListener1).setNegativeButton(paramString4, paramOnClickListener2);
      }
    }
  }
  
  public static AlertDialog a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, paramString1, paramString2, 0, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2, null, null, null);
  }
  
  public static AlertDialog a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramContext, paramString1, paramString2, 0, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2, paramOnCancelListener, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */