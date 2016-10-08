package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.w;

public class MaxNineScreen
  extends BaseActivity
{
  public void init(Bundle paramBundle)
  {
    setContentView(2130903407);
    paramBundle = (EditText)findViewById(2131560354);
    ((Button)findViewById(2131560355)).setOnClickListener(new ip(this, paramBundle));
    paramBundle = (EditText)findViewById(2131560332);
    Object localObject2 = (EditText)findViewById(2131560349);
    paramBundle.setText(g.a().C() + ":" + g.a().D());
    paramBundle = (EditText)findViewById(2131560334);
    paramBundle.setText(g.a().H() + ":" + g.a().I());
    if (g.a().L()) {
      paramBundle.setFocusable(false);
    }
    for (;;)
    {
      paramBundle = (EditText)findViewById(2131560333);
      paramBundle.setText(e.a().t());
      label189:
      Object localObject1;
      if (g.a().L())
      {
        paramBundle.setFocusable(false);
        ((TextView)findViewById(2131560335)).setText("" + g.a().y());
        ((TextView)findViewById(2131560341)).setText(g.a().v());
        ((TextView)findViewById(2131560338)).setText(g.a().t());
        ((TextView)findViewById(2131560342)).setText(w.a().c() + "");
        ((TextView)findViewById(2131560336)).setText("" + w.a().c() + "");
        ((TextView)findViewById(2131560337)).setText(String.valueOf(g.a().r()));
        localObject1 = (TextView)findViewById(2131560339);
        if (!g.a().L()) {
          break label752;
        }
        paramBundle = "是";
        label381:
        ((TextView)localObject1).setText(paramBundle);
        TextView localTextView = (TextView)findViewById(2131560340);
        localObject1 = g.a().u();
        paramBundle = (Bundle)localObject1;
        if (localObject1 == null) {
          paramBundle = "null";
        }
        localTextView.setText(paramBundle);
        ((TextView)findViewById(2131560343)).setText(g.a().o() + "");
      }
      try
      {
        int i = getPackageManager().getPackageInfo(getPackageName(), 16384).versionCode;
        ((TextView)findViewById(2131560346)).setText(String.valueOf(i));
        paramBundle = (TextView)findViewById(2131560347);
        localObject1 = m.a().J();
        if ((localObject1 != null) && ("0".equals(((LeftMenuVo)localObject1).getIsComplete()))) {
          paramBundle.setText("仅接受权限");
        }
        for (;;)
        {
          ((Button)findViewById(2131560348)).setOnClickListener(new iq(this));
          ((Button)findViewById(2131560350)).setOnClickListener(new ir(this, (EditText)localObject2));
          ((Button)findViewById(2131560351)).setOnClickListener(new is(this));
          localObject2 = (TextView)findViewById(2131560345);
          paramBundle = (TextView)findViewById(2131560344);
          localObject1 = a.c().b();
          if (localObject1 != null)
          {
            ((TextView)localObject2).setText(((AdvertVo)localObject1).jsonUrl);
            localObject2 = getSharedPreferences("DzhPush", 0).getString("slotversion", "");
            paramBundle.setText("crc:" + a.c().a + "\n版本:" + (String)localObject2 + "\n更新时间:" + ((AdvertVo)localObject1).updataTime);
          }
          paramBundle = (EditText)findViewById(2131560352);
          paramBundle.setHint("输入网址:http://");
          ((Button)findViewById(2131560353)).setOnClickListener(new it(this, paramBundle));
          return;
          paramBundle.setFocusable(true);
          break;
          paramBundle.setFocusable(true);
          break label189;
          label752:
          paramBundle = "否";
          break label381;
          paramBundle.setText("全量权限");
        }
      }
      catch (PackageManager.NameNotFoundException paramBundle)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MaxNineScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */