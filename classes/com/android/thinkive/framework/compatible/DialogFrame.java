package com.android.thinkive.framework.compatible;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.Calendar;

public class DialogFrame
{
  public static final int DIALOG_CURRENT_DAY = 7974919;
  public static final int DIALOG_CURRENT_HOUR = 7974920;
  public static final int DIALOG_CURRENT_MINUTE = 7974921;
  public static final int DIALOG_CURRENT_MONTHR = 7974918;
  public static final int DIALOG_CURRENT_YEAR = 7974917;
  public static final int DIALOG_MULTICHOICE = 7974916;
  public static final int DIALOG_NEGATIVEBUTTON = 7974914;
  public static final int DIALOG_NO_CHOICE = -1;
  public static final int DIALOG_POSITIVEBUTTON = 7974913;
  public static final int DIALOG_SINGLECHOICE = 7974915;
  private static ProgressDialog dialog = null;
  private Context content = null;
  
  public DialogFrame(Context paramContext)
  {
    this.content = paramContext;
  }
  
  public DialogFrame(Context paramContext, int paramInt)
  {
    this.content = paramContext;
  }
  
  public void alert(String paramString1, String paramString2, CallBack paramCallBack)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.content);
    paramString2 = localBuilder.setTitle(paramString1).setMessage(paramString2);
    if (paramCallBack != null) {}
    for (paramString1 = new DialogFrame.1(this, paramCallBack);; paramString1 = null)
    {
      paramString2.setPositiveButton("确定", paramString1);
      localBuilder.show();
      return;
    }
  }
  
  public void confirm(String paramString1, String paramString2, String paramString3, CallBack paramCallBack)
  {
    Object localObject = null;
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this.content);
    localBuilder1.setCancelable(false);
    paramString2 = localBuilder1.setTitle(paramString1).setMessage(paramString2);
    if (paramCallBack != null) {}
    for (paramString1 = new DialogFrame.2(this, paramCallBack);; paramString1 = null)
    {
      AlertDialog.Builder localBuilder2 = paramString2.setPositiveButton("确定", paramString1);
      paramString1 = paramString3;
      if (!TextUtils.isEmpty(paramString3)) {
        paramString1 = "取消";
      }
      paramString2 = (String)localObject;
      if (paramCallBack != null) {
        paramString2 = new DialogFrame.3(this, paramCallBack);
      }
      localBuilder2.setNegativeButton(paramString1, paramString2);
      localBuilder1.show();
      return;
    }
  }
  
  public void dateDialog(int paramInt1, int paramInt2, int paramInt3, CallBack paramCallBack)
  {
    Calendar localCalendar = Calendar.getInstance();
    Context localContext = this.content;
    if (paramCallBack != null)
    {
      paramCallBack = new DialogFrame.11(this, paramCallBack);
      if (paramInt1 != 7974917) {
        break label91;
      }
      paramInt1 = localCalendar.get(1);
      label41:
      if (paramInt2 != 7974918) {
        break label94;
      }
      paramInt2 = localCalendar.get(2);
      label54:
      if (paramInt3 != 7974919) {
        break label97;
      }
      paramInt3 = localCalendar.get(5);
    }
    label91:
    label94:
    label97:
    for (;;)
    {
      new DatePickerDialog(localContext, paramCallBack, paramInt1, paramInt2, paramInt3).show();
      return;
      paramCallBack = null;
      break;
      break label41;
      break label54;
    }
  }
  
  public void dialog(String paramString1, View paramView, String paramString2, String paramString3, CallBack paramCallBack)
  {
    Object localObject = null;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.content);
    localBuilder.setInverseBackgroundForced(true);
    if (!TextUtils.isEmpty(paramString1)) {
      localBuilder.setTitle(paramString1);
    }
    localBuilder.setView(paramView);
    if (!TextUtils.isEmpty(paramString2)) {
      if (paramCallBack == null) {
        break label118;
      }
    }
    label118:
    for (paramString1 = new DialogFrame.9(this, paramCallBack);; paramString1 = null)
    {
      localBuilder.setPositiveButton(paramString2, paramString1);
      if (!TextUtils.isEmpty(paramString3))
      {
        paramString1 = (String)localObject;
        if (paramCallBack != null) {
          paramString1 = new DialogFrame.10(this, paramCallBack);
        }
        localBuilder.setNegativeButton(paramString3, paramString1);
      }
      localBuilder.show();
      return;
    }
  }
  
  public void multiChoiceDialog(String paramString, String[] paramArrayOfString, boolean[] paramArrayOfBoolean, CallBack paramCallBack)
  {
    Object localObject = null;
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this.content);
    AlertDialog.Builder localBuilder2 = localBuilder1.setTitle(paramString);
    if (paramCallBack != null)
    {
      paramString = new DialogFrame.6(this, paramCallBack);
      paramArrayOfString = localBuilder2.setMultiChoiceItems(paramArrayOfString, paramArrayOfBoolean, paramString);
      if (paramCallBack == null) {
        break label112;
      }
    }
    label112:
    for (paramString = new DialogFrame.7(this, paramCallBack);; paramString = null)
    {
      paramArrayOfString = paramArrayOfString.setPositiveButton("确定", paramString);
      paramString = (String)localObject;
      if (paramCallBack != null) {
        paramString = new DialogFrame.8(this, paramCallBack);
      }
      paramArrayOfString.setNegativeButton("取消", paramString);
      localBuilder1.show();
      return;
      paramString = null;
      break;
    }
  }
  
  public void prompt(String paramString)
  {
    Toast.makeText(this.content, paramString, 0).show();
  }
  
  public void singleChoiceDialog(String paramString, String[] paramArrayOfString, int paramInt, CallBack paramCallBack)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.content);
    localBuilder.setTitle(paramString);
    if (paramInt == -1)
    {
      paramString = (String)localObject1;
      if (paramCallBack != null) {
        paramString = new DialogFrame.4(this, paramCallBack);
      }
      localBuilder.setItems(paramArrayOfString, paramString);
    }
    for (;;)
    {
      localBuilder.show();
      return;
      paramString = (String)localObject2;
      if (paramCallBack != null) {
        paramString = new DialogFrame.5(this, paramCallBack);
      }
      localBuilder.setSingleChoiceItems(paramArrayOfString, paramInt, paramString);
    }
  }
  
  public void timeDialog(int paramInt1, int paramInt2, CallBack paramCallBack)
  {
    Calendar localCalendar = Calendar.getInstance();
    Context localContext = this.content;
    if (paramCallBack != null)
    {
      paramCallBack = new DialogFrame.12(this, paramCallBack);
      if (paramInt1 != 7974920) {
        break label75;
      }
      paramInt1 = localCalendar.get(11);
      label39:
      if (paramInt2 != 7974921) {
        break label78;
      }
      paramInt2 = localCalendar.get(12);
    }
    label75:
    label78:
    for (;;)
    {
      new TimePickerDialog(localContext, paramCallBack, paramInt1, paramInt2, true).show();
      return;
      paramCallBack = null;
      break;
      break label39;
    }
  }
  
  public void unWaitDialog()
  {
    if ((dialog != null) && (dialog.isShowing())) {
      dialog.dismiss();
    }
    dialog = null;
  }
  
  public void waitDialog(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (dialog != null)
    {
      dialog.cancel();
      dialog.dismiss();
    }
    dialog = new ProgressDialog(this.content);
    if (!TextUtils.isEmpty(paramString1)) {
      dialog.setTitle(paramString1);
    }
    dialog.setMessage(paramString2);
    dialog.setIndeterminate(true);
    dialog.setCancelable(paramBoolean);
    dialog.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\DialogFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */