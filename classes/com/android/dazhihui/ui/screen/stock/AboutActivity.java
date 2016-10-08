package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.w;

public class AboutActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private g a;
  private View b;
  private View c;
  private View d;
  private View e;
  private View f;
  private View g;
  private View h;
  private View i;
  private TextView j;
  private TextView k;
  private TextView l;
  private View m;
  
  private void a()
  {
    Object localObject = (TextView)findViewById(2131558504);
    if (localObject != null) {
      ((TextView)localObject).setText(String.valueOf(g.a().s()));
    }
    this.c = findViewById(2131558503);
    this.d = findViewById(2131558500);
    if ("app_dzh".equals("app_sb")) {
      this.d.setVisibility(8);
    }
    this.e = findViewById(2131558501);
    this.f = findViewById(2131558502);
    this.l = ((TextView)findViewById(2131558499));
    this.g = findViewById(2131558505);
    this.h = findViewById(2131558508);
    this.i = findViewById(2131558510);
    localObject = (ImageView)findViewById(2131558506);
    TextView localTextView = (TextView)findViewById(2131558507);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.l.setText('V' + this.a.r());
    if ((this.a != null) && (this.a.r() != null) && (this.a.S() != null) && (n.b(this.a.r().trim(), this.a.S().trim())))
    {
      ((ImageView)localObject).setVisibility(0);
      localTextView.setVisibility(8);
      return;
    }
    ((ImageView)localObject).setVisibility(8);
    localTextView.setVisibility(0);
  }
  
  private void a(int paramInt, String paramString)
  {
    this.b = findViewById(2131560627);
    this.m = findViewById(2131560185);
    if (paramInt == 0)
    {
      this.j = ((TextView)findViewById(2131560628));
      this.j.setVisibility(0);
    }
    this.k = ((TextView)findViewById(2131558634));
    this.k.setText(paramString);
    this.b.setOnClickListener(new a(this));
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (c.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.m == null);
      this.m.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.m == null);
    this.m.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle)
  {
    this.a = g.a();
    setContentView(2130903040);
    a(1, "关于");
    a();
  }
  
  public void onClick(View paramView)
  {
    Object localObject = new Intent(this, SettingThirdScreen.class);
    switch (paramView.getId())
    {
    case 2131558504: 
    case 2131558506: 
    case 2131558507: 
    case 2131558509: 
    default: 
      return;
    case 2131558503: 
      paramView = "http://sq.gw.com.cn/feedback/mobile/index.php?r=yjfk.show&platform=" + this.a.t() + "&version=" + this.a.r() + "&platname=" + "1" + "&phonenumber=" + w.a().k();
      localObject = new Bundle();
      ((Bundle)localObject).putString("nexturl", paramView);
      ((Bundle)localObject).putString("names", getResources().getString(2131166445));
      startActivity(BrowserActivity.class, (Bundle)localObject);
      return;
    case 2131558500: 
      paramView = new Bundle();
      paramView.putInt("gallry", 0);
      startActivity(LeadScreen.class, paramView);
      return;
    case 2131558501: 
      ((Intent)localObject).putExtra("screenType", 3);
      startActivity((Intent)localObject);
      return;
    case 2131558505: 
      if (TextUtils.isEmpty(this.a.S()))
      {
        Log.e("AboutActivity", "NewVersion isEmpty");
        return;
      }
      paramView = new Bundle();
      int n = 2;
      if (n.b(this.a.r().trim(), this.a.S().trim()))
      {
        if (Build.VERSION.SDK_INT < 14) {
          new AlertDialog.Builder(this).setTitle("提示").setNeutralButton("取消", null).setNegativeButton("确定", new b(this)).setMessage("您的系统版本过低，安装最新版本可能导致部分功能不能正常使用，是否继续升级？").show();
        }
      }
      else
      {
        paramView.putString("message", "您当前版本为: " + this.a.r() + " 您已经是最新版本！");
        n = 3;
      }
      paramView.putInt("screenId", n);
      paramView.putString("title", getString(2131165551));
      startActivity(BulletScreen.class, paramView);
      return;
    case 2131558508: 
      paramView = getString(2131166365);
      startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramView)));
      return;
    case 2131558510: 
      paramView = getString(2131165193);
      startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramView)));
      return;
    }
    paramView = new Intent();
    localObject = new Bundle();
    ((Bundle)localObject).putString("nexturl", "http://mnews.gw.com.cn/wap/style/platform/readme/link.html");
    ((Bundle)localObject).putString("names", "平台用户协议");
    paramView.putExtras((Bundle)localObject);
    paramView.setClass(this, BrowserActivity.class);
    startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\AboutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */