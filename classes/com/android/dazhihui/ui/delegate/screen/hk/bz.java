package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;

public class bz
  extends Dialog
{
  private int a = 0;
  private String b = "";
  private View.OnClickListener c = null;
  private Context d = null;
  
  public bz(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public bz(Context paramContext, int paramInt, String paramString, View.OnClickListener paramOnClickListener)
  {
    this(paramContext, 2131296265);
    this.d = paramContext;
    a();
  }
  
  private void a()
  {
    View localView = LayoutInflater.from(this.d).inflate(2130903159, null);
    setContentView(localView);
    setCanceledOnTouchOutside(false);
    TextView localTextView = (TextView)localView.findViewById(2131559231);
    WebView localWebView = (WebView)localView.findViewById(2131559229);
    CheckBox localCheckBox = (CheckBox)localView.findViewById(2131559232);
    ScrollView localScrollView = (ScrollView)localView.findViewById(2131559230);
    switch (this.a)
    {
    }
    for (;;)
    {
      ((Button)localView.findViewById(2131558854)).setOnClickListener(new ca(this, localCheckBox));
      return;
      localTextView.setText(this.b);
      localWebView.setVisibility(8);
      continue;
      a(localWebView);
      localScrollView.setVisibility(8);
    }
  }
  
  private void a(WebView paramWebView)
  {
    if (!TextUtils.isEmpty(this.b))
    {
      paramWebView.loadUrl(this.b);
      paramWebView.setWebViewClient(new cb(this));
      paramWebView.getSettings().setJavaScriptEnabled(true);
      paramWebView.getSettings().setUseWideViewPort(true);
      paramWebView.getSettings().setLoadWithOverviewMode(true);
      paramWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
      paramWebView.getSettings().setCacheMode(2);
      paramWebView.getSettings().setDomStorageEnabled(true);
    }
  }
  
  public void show()
  {
    super.show();
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    localWindow.setGravity(17);
    Display localDisplay = ((Activity)this.d).getWindowManager().getDefaultDisplay();
    localLayoutParams.height = ((int)(0.75D * localDisplay.getHeight()));
    localLayoutParams.width = ((int)(0.9D * localDisplay.getWidth()));
    localWindow.getDecorView().setPadding(0, 0, 0, 0);
    localWindow.setAttributes(localLayoutParams);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */