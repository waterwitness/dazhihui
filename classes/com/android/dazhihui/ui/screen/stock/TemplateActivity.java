package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.DzhHeader;

public class TemplateActivity
  extends BaseActivity
{
  protected void init(Bundle paramBundle)
  {
    Object localObject2 = new LinearLayout(this);
    ((LinearLayout)localObject2).setOrientation(1);
    Object localObject1 = new DzhHeader(this, null);
    ((DzhHeader)localObject1).setBackgroundResource(2130838872);
    ((DzhHeader)localObject1).a(this, new wm(this));
    ((LinearLayout)localObject2).addView((View)localObject1, -1, getResources().getDimensionPixelSize(2131231109));
    paramBundle = new FrameLayout(this);
    paramBundle.setId(paramBundle.hashCode());
    ((LinearLayout)localObject2).addView(paramBundle);
    setContentView((View)localObject2);
    if (getIntent() != null)
    {
      localObject2 = getIntent().getExtras();
      String str = ((Bundle)localObject2).getString("name");
      ((DzhHeader)localObject1).setTitle(((Bundle)localObject2).getString("templateTitle"));
      localObject1 = (e)Fragment.instantiate(this, str, (Bundle)localObject2);
      ((e)localObject1).setBundle((Bundle)localObject2);
      getSupportFragmentManager().a().a(paramBundle.getId(), (Fragment)localObject1).b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\TemplateActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */