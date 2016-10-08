package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.TouchImageView;
import com.android.dazhihui.ui.widget.a.r;

public class ZoomImageScreen
  extends BaseActivity
{
  AlertDialog a;
  private byte[] b;
  
  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, ZoomImageScreen.class);
    localIntent.putExtra("url", paramString);
    paramContext.startActivity(localIntent);
  }
  
  protected void init(Bundle paramBundle)
  {
    paramBundle = new TouchImageView(this);
    paramBundle.setId(paramBundle.hashCode());
    paramBundle.setBackgroundColor(getResources().getColor(17170444));
    setContentView(paramBundle);
    Object localObject = getIntent().getStringExtra("url");
    paramBundle.setOnClickListener(new xl(this));
    r.a(this).a((String)localObject, new xm(this, paramBundle));
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).setOrientation(1);
    ((LinearLayout)localObject).setGravity(17);
    TextView localTextView = new TextView(this);
    localTextView.setText("保存到手机");
    localTextView.setTextColor(-16777216);
    localTextView.setOnClickListener(new xn(this));
    localTextView.setGravity(17);
    localTextView.setTextSize(2, 16.0F);
    ((LinearLayout)localObject).addView(localTextView, -2, 150);
    paramBundle.setOnLongClickListener(new xp(this, new AlertDialog.Builder(this, 3).setView((View)localObject)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ZoomImageScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */