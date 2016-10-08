package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ViewFlipper;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.widget.adv.GifView;
import java.util.Date;

public class AppRestoreAdvertScreen
  extends Activity
{
  public static Date a;
  private static int b = 3000;
  private ViewFlipper c;
  private AdvertVo.AdvertBitmap d;
  private n e = new n(this);
  
  private void a()
  {
    this.c.removeCallbacks(this.e);
    this.c.postDelayed(this.e, b);
  }
  
  public static void a(Context paramContext)
  {
    if (!com.android.dazhihui.d.n.b(paramContext))
    {
      if (g.a().h()) {
        a = new Date();
      }
    }
    else {
      return;
    }
    a = null;
  }
  
  private void b()
  {
    finish();
  }
  
  public static void b(Context paramContext)
  {
    if ((a != null) && (new Date().getTime() - a.getTime() > 1800000L) && (a.c().a(109, false) != null))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(paramContext, AppRestoreAdvertScreen.class);
      paramContext.startActivity(localIntent);
    }
    a = null;
  }
  
  public void onBackPressed()
  {
    this.c.removeCallbacks(this.e);
    b();
    super.onBackPressed();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903216);
    this.c = ((ViewFlipper)findViewById(2131559503));
    paramBundle = findViewById(2131559506);
    GifView localGifView = (GifView)findViewById(2131559504);
    this.d = a.c().a(109, false);
    if (localGifView != null) {
      localGifView.setOnClickListener(new l(this));
    }
    if (this.d != null)
    {
      b = 3000;
      localGifView.setImage(this.d.bytes);
      if ((a.c().b() != null) && (a.c().b().getAdvert(109) != null))
      {
        if (!a.c().b().getAdvert(109).closetype.equals("0"))
        {
          b = 5000;
          paramBundle.setVisibility(0);
          paramBundle.setOnClickListener(new m(this));
        }
        if (!TextUtils.isEmpty(this.d.advItem.countid)) {
          com.android.dazhihui.d.n.a(String.valueOf(109), Integer.parseInt(this.d.advItem.countid));
        }
      }
      this.c.showNext();
      return;
    }
    b = 1000;
  }
  
  public void onResume()
  {
    super.onResume();
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\AppRestoreAdvertScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */