package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class gr
{
  int a = 0;
  private Context b;
  private View c;
  private KeyboardView d;
  private ImageView e;
  private LinearLayout f;
  private Keyboard g;
  private Button h;
  private Button i;
  private Button j;
  private Button k;
  private EditText l;
  private InputMethodManager m;
  private View n;
  private int o = 0;
  private gv p = null;
  private float q = 0.0F;
  private View.OnClickListener r = new gs(this);
  private KeyboardView.OnKeyboardActionListener s = new gt(this);
  
  public gr(View paramView1, Context paramContext, EditText paramEditText, View paramView2)
  {
    this.c = paramView1;
    this.b = paramContext;
    this.l = paramEditText;
    this.n = paramView2;
    this.q = paramView2.getY();
    this.g = new Keyboard(paramContext, 2131034115);
    this.d = ((KeyboardView)paramView1.findViewById(2131559532));
    this.e = ((ImageView)paramView1.findViewById(2131559524));
    this.f = ((LinearLayout)paramView1.findViewById(2131559525));
    this.h = ((Button)paramView1.findViewById(2131559527));
    this.i = ((Button)paramView1.findViewById(2131559528));
    this.j = ((Button)paramView1.findViewById(2131559529));
    this.k = ((Button)paramView1.findViewById(2131559530));
    this.d.setKeyboard(this.g);
    this.d.setEnabled(true);
    this.d.setPreviewEnabled(false);
    this.d.setOnKeyboardActionListener(this.s);
    this.e.setOnClickListener(this.r);
    this.h.setOnClickListener(this.r);
    this.i.setOnClickListener(this.r);
    this.j.setOnClickListener(this.r);
    this.k.setOnClickListener(this.r);
  }
  
  public void a()
  {
    ((InputMethodManager)this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.l.getWindowToken(), 2);
    this.m = ((InputMethodManager)this.b.getSystemService("input_method"));
    this.m.hideSoftInputFromWindow(this.l.getWindowToken(), 2);
  }
  
  public void a(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void a(gv paramgv)
  {
    this.p = paramgv;
  }
  
  public void b()
  {
    a();
    int i1 = this.d.getVisibility();
    if ((i1 == 8) || (i1 == 4))
    {
      this.d.setVisibility(0);
      this.e.setVisibility(0);
      this.f.setVisibility(0);
      new Handler().postDelayed(new gu(this), 100L);
    }
  }
  
  public void c()
  {
    if (this.d.getVisibility() == 0)
    {
      this.d.setVisibility(4);
      this.e.setVisibility(4);
      this.f.setVisibility(4);
      if ((this.a > 0) && (this.n != null))
      {
        if (this.q != this.n.getY()) {
          this.n.offsetTopAndBottom(this.a);
        }
        this.a = 0;
      }
    }
  }
  
  public boolean d()
  {
    return this.d.getVisibility() == 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */