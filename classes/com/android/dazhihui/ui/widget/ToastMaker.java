package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

public class ToastMaker
{
  private static Toast a;
  private static CountDownTimer b;
  
  public static void a(Context paramContext, String paramString)
  {
    if (a != null)
    {
      a.cancel();
      a = null;
    }
    if (b != null)
    {
      b.cancel();
      b = null;
    }
    a = new Toast(paramContext);
    a.setDuration(1);
    ToastMaker.ToastLinearLayout localToastLinearLayout = new ToastMaker.ToastLinearLayout(paramContext);
    TextView localTextView = new TextView(paramContext);
    localTextView.setBackgroundColor(-1442840576);
    int i = paramContext.getResources().getDimensionPixelSize(2131230844);
    int j = paramContext.getResources().getDimensionPixelSize(2131230820);
    localTextView.setPadding(j, i, j, i);
    localTextView.setGravity(17);
    localTextView.setSingleLine();
    localTextView.setTextSize(18.0F);
    localTextView.setTextColor(-1);
    localTextView.setText(paramString);
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    paramContext.leftMargin = 2;
    paramContext.topMargin = 2;
    paramContext.rightMargin = 2;
    paramContext.bottomMargin = 2;
    localToastLinearLayout.addView(localTextView, paramContext);
    a.setView(localToastLinearLayout);
    a.show();
    b = new mq(3000L, 1000L).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ToastMaker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */