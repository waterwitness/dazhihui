package com.thinkive.mobile.account.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.mobile.account.tools.EditPhotoView;

public class PhotographActivity
  extends Activity
{
  public static String a;
  private EditPhotoView b;
  private Button c;
  private Button d;
  private Button e;
  private ImageView f;
  private ImageView g;
  private ImageView h;
  private ImageView i;
  private RelativeLayout j;
  private int k;
  
  public final void a()
  {
    try
    {
      this.e.setEnabled(false);
      this.b.b();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void b()
  {
    setResult(-1, new Intent());
    this.b.a();
    finish();
  }
  
  public final void c()
  {
    EditPhotoView.a = false;
    this.b.a();
    this.b.a(this.k);
    this.e.setVisibility(0);
    this.c.setVisibility(4);
    this.d.setVisibility(4);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_photograph"));
    this.b = ((EditPhotoView)findViewById(ResourceUtil.getResourceID(this, "id", "pv_view")));
    this.c = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_photo_ok")));
    this.d = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_photo_cancel")));
    this.e = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_get_photo")));
    this.f = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "image_zs")));
    this.g = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "image_zx")));
    this.h = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "image_ys")));
    this.i = ((ImageView)findViewById(ResourceUtil.getResourceID(this, "id", "image_yx")));
    this.j = ((RelativeLayout)findViewById(ResourceUtil.getResourceID(this, "id", "rela_top")));
    paramBundle = getIntent().getStringExtra("img_type");
    a = paramBundle;
    if (paramBundle.equals("3"))
    {
      this.k = 1;
      this.f.setVisibility(4);
      this.g.setVisibility(4);
      this.h.setVisibility(4);
      this.i.setVisibility(4);
      this.j.setVisibility(8);
    }
    for (;;)
    {
      this.c.setOnClickListener(new PhotographActivity.1(this));
      this.d.setOnClickListener(new PhotographActivity.2(this));
      this.e.setOnClickListener(new PhotographActivity.3(this));
      return;
      this.e.setBackgroundResource(ResourceUtil.getResourceID(this, "drawable", "fxc_kh_take_photo_land_draw"));
      this.c.setBackgroundResource(ResourceUtil.getResourceID(this, "drawable", "fxc_kh_ok_land_draw"));
      this.d.setBackgroundResource(ResourceUtil.getResourceID(this, "drawable", "fxc_kh_cancel_land_draw_selector"));
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    this.b.a();
    finish();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStop()
  {
    this.b.a();
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\PhotographActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */