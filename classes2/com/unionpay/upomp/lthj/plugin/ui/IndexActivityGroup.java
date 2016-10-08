package com.unionpay.upomp.lthj.plugin.ui;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.AlertDialog.Builder;
import android.app.LocalActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import com.f.a.a.au;
import com.f.a.a.bp;
import com.f.a.a.q;
import com.f.a.a.s;
import com.f.a.a.u;
import com.unionpay.upomp.lthj.util.PluginHelper;

public class IndexActivityGroup
  extends ActivityGroup
  implements View.OnClickListener, au
{
  public static IndexActivityGroup instance;
  private Button a;
  private ImageView b;
  
  private void a()
  {
    changeSubActivity(new Intent(this, HomeActivity.class));
  }
  
  public void aboutEnable(boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.setEnabled(paramBoolean);
    }
  }
  
  public void backToMerchant()
  {
    if ((TextUtils.isEmpty(u.a().t)) && (TextUtils.isEmpty(u.a().u))) {
      u.a().u = "未进行支付";
    }
    synchronized (PluginHelper.a)
    {
      PluginHelper.a.notify();
      finish();
      return;
    }
  }
  
  public void changeSubActivity(Intent paramIntent)
  {
    paramIntent = getLocalActivityManager().startActivity(paramIntent.getComponent().getShortClassName(), paramIntent).getDecorView();
    paramIntent.clearFocus();
    ViewGroup localViewGroup = (ViewGroup)findViewById(bp.aR());
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramIntent);
  }
  
  public void changeTitleButton(String paramString, View.OnClickListener paramOnClickListener)
  {
    if ((paramString != null) && (paramOnClickListener != null))
    {
      this.a.setVisibility(0);
      this.a.setText(paramString);
      this.a.setOnClickListener(paramOnClickListener);
      return;
    }
    this.a.setVisibility(8);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.b) {
      changeSubActivity(new Intent(this, AboutActivity.class));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(bp.K());
    this.a = ((Button)findViewById(bp.aF()));
    this.b = ((ImageView)findViewById(bp.aG()));
    this.b.setOnClickListener(this);
    a();
    instance = this;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return getCurrentActivity().onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void quitNotice()
  {
    new AlertDialog.Builder(this).setTitle("退出交易").setMessage(bp.r()).setNegativeButton(bp.q(), new q(this)).setPositiveButton(bp.p(), new s(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\IndexActivityGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */