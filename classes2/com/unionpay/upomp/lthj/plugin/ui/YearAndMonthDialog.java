package com.unionpay.upomp.lthj.plugin.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import android.widget.EditText;
import com.f.a.a.ax;
import com.f.a.a.ea;
import com.f.a.a.ec;
import java.util.Calendar;

public class YearAndMonthDialog
  implements DialogInterface.OnClickListener
{
  String[] a = new String[12];
  String[] b = new String[11];
  private AlertDialog c;
  private int d;
  private EditText e;
  private int f;
  private ax g;
  private Context h;
  
  public YearAndMonthDialog(Context paramContext, EditText paramEditText, int paramInt, ax paramax)
  {
    this.g = paramax;
    this.f = paramInt;
    this.h = paramContext;
    this.e = paramEditText;
    paramEditText = new ea(this);
    paramInt = 0;
    int i;
    for (;;)
    {
      i = j;
      if (paramInt > 10) {
        break;
      }
      this.d = Calendar.getInstance().get(1);
      this.b[paramInt] = (this.d + paramInt + "年");
      paramInt += 1;
    }
    while (i < 12)
    {
      this.a[i] = (i + 1 + "月");
      i += 1;
    }
    if (this.f == 0) {
      this.c = new AlertDialog.Builder(paramContext).setTitle("请输入信用卡有效期月份").setItems(this.a, this).create();
    }
    for (;;)
    {
      this.c.setOnDismissListener(paramEditText);
      return;
      if (this.f == 1) {
        this.c = new AlertDialog.Builder(paramContext).setTitle("请输入信用卡有效期年份").setItems(this.b, this).create();
      }
    }
  }
  
  public int getType()
  {
    return this.f;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = new StringBuffer();
    if (this.f == 0)
    {
      if (paramInt < 9) {
        ((StringBuffer)localObject).append("0");
      }
      ((StringBuffer)localObject).append(paramInt + 1);
      switch (this.f)
      {
      }
    }
    for (;;)
    {
      paramDialogInterface.dismiss();
      return;
      if (this.f != 1) {
        break;
      }
      this.d = Calendar.getInstance().get(1);
      ((StringBuffer)localObject).append(this.d - 2000 + paramInt);
      break;
      localObject = JniMethod.getJniMethod().encryptConfig(((StringBuffer)localObject).toString().getBytes(), ((StringBuffer)localObject).toString().getBytes().length);
      this.g.b((byte[])localObject);
      ec.a(this.h, this.e, 1, this.g);
      continue;
      this.e.setClickable(true);
      byte[] arrayOfByte = JniMethod.getJniMethod().encryptConfig(((StringBuffer)localObject).toString().getBytes(), ((StringBuffer)localObject).toString().getBytes().length);
      this.g.a(arrayOfByte);
      this.e.setText("**月/**年");
      ((StringBuffer)localObject).delete(0, ((StringBuffer)localObject).length());
      this.e.dispatchKeyEvent(new KeyEvent(1, 66));
    }
  }
  
  public void setInputText(EditText paramEditText)
  {
    this.e = paramEditText;
  }
  
  public void setType(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void show()
  {
    if (this.c != null) {
      this.c.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\YearAndMonthDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */