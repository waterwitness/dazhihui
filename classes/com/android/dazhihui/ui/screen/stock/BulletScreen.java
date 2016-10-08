package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.service.DownloadService;

public class BulletScreen
  extends Activity
{
  private int a;
  private String b;
  private String c;
  private AlertDialog d;
  private AlertDialog e;
  
  private void a()
  {
    if (this.d != null) {
      this.d.dismiss();
    }
    this.e = new AlertDialog.Builder(this).setTitle(this.b).setMessage(this.c).setPositiveButton(getString(2131165363), new ap(this)).setOnKeyListener(new ao(this)).setOnCancelListener(new an(this)).create();
    this.e.show();
  }
  
  private void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a == 2) && (!DownloadService.a(this, g.a().P(), false, true)) && (!TextUtils.isEmpty(g.a().P()))) {
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(g.a().P())));
    }
    finish();
  }
  
  private void b()
  {
    ScrollView localScrollView = (ScrollView)getLayoutInflater().inflate(2130903578, null);
    TextView localTextView1 = (TextView)localScrollView.findViewById(2131561273);
    TextView localTextView2 = (TextView)localScrollView.findViewById(2131561274);
    TextView localTextView3 = (TextView)localScrollView.findViewById(2131561275);
    View localView1 = localScrollView.findViewById(2131561278);
    View localView2 = localScrollView.findViewById(2131561279);
    CheckBox localCheckBox = (CheckBox)localScrollView.findViewById(2131561277);
    View localView3 = localScrollView.findViewById(2131561276);
    if (g.a().T() == 1) {
      localCheckBox.setChecked(true);
    }
    for (;;)
    {
      localView3.setVisibility(8);
      localTextView1.setText(getString(2131166015) + g.a().r());
      localTextView2.setText(getString(2131165996) + g.a().S());
      localTextView3.setText(g.a().R());
      localView1.setOnClickListener(new aq(this));
      localView2.setOnClickListener(new ar(this));
      if (this.d != null) {
        this.d.dismiss();
      }
      this.d = new AlertDialog.Builder(new ContextThemeWrapper(this, 2131296289)).setView(localScrollView).setOnCancelListener(new as(this)).create();
      this.d.show();
      return;
      localCheckBox.setChecked(false);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903063);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {
      finish();
    }
    do
    {
      return;
      this.a = localBundle.getInt("screenId");
      this.b = localBundle.getString("title");
      this.c = localBundle.getString("message");
      if (TextUtils.isEmpty(this.b)) {
        this.b = getString(2131165514);
      }
      if (TextUtils.isEmpty(this.c)) {
        this.c = "";
      }
    } while (paramBundle != null);
    if (this.a == 2)
    {
      b();
      return;
    }
    if (this.a == 3)
    {
      a();
      return;
    }
    finish();
  }
  
  protected void onDestroy()
  {
    if ((this.d != null) && (this.d.isShowing())) {
      this.d.dismiss();
    }
    if ((this.e != null) && (this.e.isShowing())) {
      this.e.dismiss();
    }
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\BulletScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */