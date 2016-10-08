package com.unionpay.upomp.lthj.plugin.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import com.f.a.a.au;
import com.f.a.a.bp;
import com.f.a.a.ds;
import com.f.a.a.du;
import com.f.a.a.z;

public class BaseActivity
  extends Activity
{
  private String a;
  private View.OnClickListener b;
  private au c;
  
  public au a()
  {
    return this.c;
  }
  
  protected void a(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.a = paramString;
    this.b = paramOnClickListener;
    z.a("baseactivity", paramString + "");
    this.c.changeTitleButton(paramString, paramOnClickListener);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    if ((getParent() instanceof au))
    {
      this.c = ((au)getParent());
      a(null, null);
    }
    super.onCreate(paramBundle);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      quitNotice();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    if (this.c != null) {
      this.c.changeTitleButton(this.a, this.b);
    }
    this.c.aboutEnable(false);
    super.onResume();
  }
  
  public void quitNotice()
  {
    new AlertDialog.Builder(this).setTitle("退出交易").setMessage(bp.r()).setNegativeButton(bp.q(), new du(this)).setPositiveButton(bp.p(), new ds(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\BaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */