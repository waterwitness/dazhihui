package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.n;
import java.util.Iterator;
import java.util.List;

public class gn
{
  public boolean a = true;
  public boolean b = false;
  int c = 0;
  boolean d;
  private Context e;
  private Activity f;
  private KeyboardView g;
  private ImageView h;
  private Keyboard i;
  private Keyboard j;
  private boolean k = true;
  private gq l = null;
  private EditText m;
  private InputMethodManager n;
  private ScrollView o;
  private KeyboardView.OnKeyboardActionListener p = new go(this);
  
  public gn(Activity paramActivity, Context paramContext, EditText paramEditText, ScrollView paramScrollView)
  {
    this.f = paramActivity;
    this.e = paramContext;
    this.m = paramEditText;
    this.o = paramScrollView;
    this.i = new Keyboard(paramContext, 2131034116);
    this.j = new Keyboard(paramContext, 2131034118);
    this.g = ((KeyboardView)paramActivity.findViewById(2131559727));
    this.h = ((ImageView)paramActivity.findViewById(2131559726));
    this.g.setKeyboard(this.j);
    this.g.setEnabled(true);
    this.g.setPreviewEnabled(false);
    this.g.setOnKeyboardActionListener(this.p);
    this.d = false;
  }
  
  private boolean a(String paramString)
  {
    return "abcdefghijklmnopqrstuvwxyz".indexOf(paramString.toLowerCase()) > -1;
  }
  
  private void e()
  {
    c();
    this.n = ((InputMethodManager)this.e.getSystemService("input_method"));
    this.n.showSoftInput(this.m, 0);
  }
  
  private void f()
  {
    Object localObject = this.i.getKeys();
    Keyboard.Key localKey;
    if (this.b)
    {
      this.b = false;
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localKey = (Keyboard.Key)((Iterator)localObject).next();
        if ((localKey.label != null) && (a(localKey.label.toString())))
        {
          localKey.label = localKey.label.toString().toLowerCase();
          localKey.codes[0] += 32;
        }
      }
    }
    this.b = true;
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localKey = (Keyboard.Key)((Iterator)localObject).next();
      if ((localKey.label != null) && (a(localKey.label.toString())))
      {
        localKey.label = localKey.label.toString().toUpperCase();
        localKey.codes[0] -= 32;
      }
    }
  }
  
  public void a()
  {
    ((InputMethodManager)this.e.getSystemService("input_method")).hideSoftInputFromWindow(this.m.getWindowToken(), 2);
    this.n = ((InputMethodManager)this.e.getSystemService("input_method"));
    this.n.hideSoftInputFromWindow(this.m.getWindowToken(), 2);
  }
  
  public void a(float paramFloat)
  {
    if ((this.m.getText() != null) && (!this.m.getText().toString().equals("")))
    {
      int i1 = a.a(this.m.getText().toString(), this.m.getTextSize());
      int i2 = (int)((paramFloat - this.m.getPaddingLeft()) / i1 * this.m.getText().toString().length());
      i1 = i2;
      if (i2 > this.m.getText().toString().length()) {
        i1 = this.m.getText().toString().length();
      }
      this.m.setSelection(i1);
      if (this.k)
      {
        this.a = true;
        this.g.setKeyboard(this.j);
        n.a("", 1178);
      }
    }
    else
    {
      return;
    }
    this.a = false;
    this.g.setKeyboard(this.i);
    n.a("", 1069);
  }
  
  public void a(EditText paramEditText)
  {
    this.k = this.a;
    this.a = true;
    this.m = paramEditText;
    this.g.setKeyboard(this.j);
    this.g.setOnKeyboardActionListener(this.p);
  }
  
  public void a(gq paramgq)
  {
    this.l = paramgq;
  }
  
  public void b()
  {
    a();
    this.d = true;
    int i1 = this.g.getVisibility();
    if ((i1 == 8) || (i1 == 4))
    {
      this.g.setVisibility(0);
      new Handler().postDelayed(new gp(this), 100L);
    }
  }
  
  public void c()
  {
    int i1 = this.g.getVisibility();
    if ((this.c > 0) && (this.o != null))
    {
      this.o.offsetTopAndBottom(this.c);
      this.c = 0;
    }
    if (i1 == 0) {
      this.g.setVisibility(4);
    }
  }
  
  public boolean d()
  {
    return this.g.getVisibility() == 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */