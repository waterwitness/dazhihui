package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class EmojiInputView
  extends LinearLayout
{
  private static Map<String, String> w = new HashMap();
  public String a;
  public Handler b = new dh(this);
  private LayoutInflater c;
  private Scroller d;
  private Context e;
  private EditText f;
  private Button g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private LinearLayout k;
  private km l;
  private kp m;
  private LinearLayout n;
  private LinearLayout o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private dm u;
  private String v = "";
  
  public EmojiInputView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public EmojiInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public EmojiInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext;
    setOrientation(1);
    this.c = LayoutInflater.from(paramContext);
    this.d = new Scroller(paramContext, new LinearInterpolator());
    this.c.inflate(2130903057, this);
    a(this);
  }
  
  public void a()
  {
    if (this.f != null) {
      this.f.requestFocus();
    }
  }
  
  public void a(View paramView)
  {
    this.f = ((EditText)paramView.findViewById(2131558616));
    this.g = ((Button)paramView.findViewById(2131558617));
    this.g.setTextSize(2, 19.0F);
    this.n = ((LinearLayout)paramView.findViewById(2131558613));
    this.i = ((ImageView)paramView.findViewById(2131558594));
    this.h = ((ImageView)paramView.findViewById(2131558595));
    this.j = ((ImageView)paramView.findViewById(2131558592));
    this.k = ((LinearLayout)paramView.findViewById(2131560389));
    this.o = ((LinearLayout)paramView.findViewById(2131558606));
    this.p = ((TextView)paramView.findViewById(2131558607));
    this.q = ((TextView)paramView.findViewById(2131558608));
    this.r = ((TextView)paramView.findViewById(2131558609));
    this.s = ((TextView)paramView.findViewById(2131558610));
    this.t = ((TextView)paramView.findViewById(2131558611));
    paramView = new di(this);
    this.m = new dj(this);
    this.g.setOnClickListener(paramView);
    this.i.setOnClickListener(paramView);
    this.h.setOnClickListener(paramView);
    this.j.setOnClickListener(paramView);
    this.p.setOnClickListener(paramView);
    this.q.setOnClickListener(paramView);
    this.r.setOnClickListener(paramView);
    this.s.setOnClickListener(paramView);
    this.t.setOnClickListener(paramView);
    this.f.setOnTouchListener(new dk(this));
    this.f.addTextChangedListener(new dl(this));
  }
  
  public void a(EditText paramEditText, View paramView)
  {
    paramView = ((TextView)paramView).getText().toString();
    int i1 = paramEditText.getSelectionStart();
    paramEditText.getText().insert(i1, paramView);
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.e.getSystemService("input_method");
    if ((paramBoolean.booleanValue()) && (paramView != null))
    {
      paramView.requestFocus();
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    if (paramView == null)
    {
      localInputMethodManager.toggleSoftInput(1, 0);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void a(String paramString)
  {
    if (this.f != null) {
      this.f.setText("");
    }
    if ((paramString != null) && (!paramString.equals(""))) {
      b(paramString);
    }
  }
  
  public void b(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      w.remove(paramString);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setBbsMenuGroupStatus(int paramInt)
  {
    System.out.println("setBbsMenuGroupStatus type = " + paramInt);
    if (this.f == null) {
      return;
    }
    if (paramInt == 1)
    {
      a(Boolean.valueOf(false), null);
      this.o.setVisibility(8);
      this.k.setVisibility(8);
      return;
    }
    if (paramInt == 2)
    {
      if (this.i.getVisibility() != 0) {
        break label289;
      }
      this.n.setVisibility(8);
    }
    label289:
    for (paramInt = 1;; paramInt = 0)
    {
      this.o.setVisibility(8);
      this.k.setVisibility(8);
      this.i.setVisibility(8);
      this.h.setVisibility(0);
      a(Boolean.valueOf(true), this.f);
      if (paramInt != 1) {
        break;
      }
      this.b.sendEmptyMessageDelayed(111, 100L);
      return;
      if (paramInt == 3)
      {
        a(Boolean.valueOf(false), this.f);
        this.k.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.b.sendEmptyMessageDelayed(222, 200L);
        return;
      }
      if (paramInt != 4) {
        break;
      }
      a(Boolean.valueOf(false), this.f);
      this.o.setVisibility(8);
      if (this.l == null)
      {
        this.l = new km(this.e, this.k);
        this.l.a(this.m);
      }
      this.k.setVisibility(0);
      return;
    }
  }
  
  public void setCacheCommentInput(String paramString)
  {
    if ((this.f != null) && (paramString != null) && (!paramString.equals("")))
    {
      paramString = (String)w.get(paramString);
      if (paramString != null)
      {
        this.f.setText(paramString);
        this.f.setSelection(this.f.getText().length());
      }
    }
    else
    {
      return;
    }
    this.f.setText("");
  }
  
  public void setHint(String paramString)
  {
    if (this.f != null) {
      this.f.setHint(paramString);
    }
  }
  
  public void setOnSendListener(dm paramdm)
  {
    this.u = paramdm;
  }
  
  public void setmClickCommentId(String paramString)
  {
    this.v = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\EmojiInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */