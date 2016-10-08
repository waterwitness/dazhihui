package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.km;
import com.android.dazhihui.ui.widget.kp;

public class BBSCommentActivity
  extends BaseActivity
  implements View.OnClickListener
{
  protected String a;
  protected String b;
  private View c;
  private TextView d;
  private EditText e;
  private RelativeLayout f;
  private ImageView g;
  private ImageView h;
  private ImageView i;
  private LinearLayout j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private LinearLayout p;
  private km q;
  private kp r;
  private Handler s;
  
  public void a(int paramInt)
  {
    if (paramInt == 1)
    {
      this.f.setVisibility(8);
      this.p.setVisibility(8);
      this.j.setVisibility(8);
      this.h.setVisibility(8);
      a(Boolean.valueOf(false), this.e);
    }
    do
    {
      return;
      if (paramInt == 2)
      {
        this.f.setVisibility(0);
        this.p.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        a(Boolean.valueOf(true), this.e);
        return;
      }
      if (paramInt == 3)
      {
        this.h.setVisibility(8);
        this.p.setVisibility(8);
        this.f.setVisibility(0);
        a(Boolean.valueOf(false), this.e);
        this.g.setVisibility(0);
        this.s.sendEmptyMessageDelayed(222, 100L);
        return;
      }
    } while (paramInt != 4);
    a(Boolean.valueOf(false), this.e);
    this.j.setVisibility(8);
    if (this.q == null)
    {
      this.q = new km(this, this.p);
      this.q.a(this.r);
    }
    this.p.setVisibility(0);
  }
  
  public void a(EditText paramEditText, View paramView)
  {
    paramView = ((TextView)paramView).getText().toString();
    int i1 = paramEditText.getSelectionStart();
    paramEditText.getText().insert(i1, paramView);
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (paramBoolean.booleanValue())
    {
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.a = paramBundle.getString("code", "");
    this.b = paramBundle.getString("name", "");
    setContentView(2130903052);
    this.c = findViewById(2131558586);
    this.d = ((TextView)findViewById(2131558588));
    this.f = ((RelativeLayout)findViewById(2131558590));
    this.e = ((EditText)findViewById(2131558589));
    this.g = ((ImageView)findViewById(2131558594));
    this.h = ((ImageView)findViewById(2131558595));
    this.i = ((ImageView)findViewById(2131558592));
    this.p = ((LinearLayout)findViewById(2131560389));
    this.j = ((LinearLayout)findViewById(2131558606));
    this.k = ((TextView)findViewById(2131558607));
    this.l = ((TextView)findViewById(2131558608));
    this.m = ((TextView)findViewById(2131558609));
    this.n = ((TextView)findViewById(2131558610));
    this.o = ((TextView)findViewById(2131558611));
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.k.setOnClickListener(this);
    this.l.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.s = new o(this);
    this.r = new p(this);
    this.s.sendEmptyMessageDelayed(333, 200L);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131558587: 
    case 2131558590: 
    case 2131558591: 
    case 2131558593: 
    case 2131558596: 
    case 2131558597: 
    case 2131558598: 
    case 2131558599: 
    case 2131558600: 
    case 2131558601: 
    case 2131558602: 
    case 2131558603: 
    case 2131558604: 
    case 2131558605: 
    case 2131558606: 
    default: 
      return;
    case 2131558586: 
      a(1);
      finish();
      return;
    case 2131558588: 
      paramView = this.e.getText().toString().trim();
      if (paramView.equals(""))
      {
        Toast.makeText(this, "内容不能为空！", 0).show();
        return;
      }
      a(1);
      Intent localIntent = new Intent();
      localIntent.putExtra("send_text", paramView);
      setResult(-1, localIntent);
      finish();
      return;
    case 2131558589: 
      a(2);
      return;
    case 2131558594: 
      a(2);
      return;
    case 2131558595: 
      a(3);
      return;
    case 2131558592: 
      n.a(this.a, 20089);
      a(4);
      return;
    }
    n.a(this.a, 20077);
    a(this.e, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\BBSCommentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */