package com.unionpay.upomp.lthj.plugin.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.f.a.a.a;
import com.f.a.a.bp;

public class AboutActivity
  extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getString(bp.j()), new a(this));
    setContentView(bp.aq());
    ((TextView)findViewById(bp.aw())).setText("20131231s");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\AboutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */