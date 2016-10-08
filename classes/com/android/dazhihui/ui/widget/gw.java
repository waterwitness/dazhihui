package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Iterator;
import java.util.List;

public class gw
{
  public boolean a = true;
  public boolean b = false;
  private Context c;
  private Activity d;
  private KeyboardView e;
  private Keyboard f;
  private Keyboard g;
  private int[] h = { 99003, 99004, 99060, 99000, 99300 };
  private String[] i = { "03", "04", "600", "000", "300" };
  private EditText j;
  private InputMethodManager k;
  private KeyboardView.OnKeyboardActionListener l = new gx(this);
  
  public gw(Activity paramActivity, Context paramContext, EditText paramEditText)
  {
    this.d = paramActivity;
    this.c = paramContext;
    this.j = paramEditText;
    this.f = new Keyboard(this.c, 2131034116);
    this.g = new Keyboard(paramContext, 2131034117);
    this.e = ((KeyboardView)paramActivity.findViewById(2131559727));
    this.e.setKeyboard(this.g);
    this.e.setEnabled(true);
    this.e.setPreviewEnabled(true);
    this.e.setOnKeyboardActionListener(this.l);
  }
  
  private boolean a(String paramString)
  {
    return "abcdefghijklmnopqrstuvwxyz".indexOf(paramString.toLowerCase()) > -1;
  }
  
  private void e()
  {
    c();
    this.k = ((InputMethodManager)this.d.getSystemService("input_method"));
    this.k.showSoftInput(this.j, 0);
  }
  
  private void f()
  {
    Object localObject = this.f.getKeys();
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
    ((InputMethodManager)this.d.getSystemService("input_method")).hideSoftInputFromWindow(this.j.getWindowToken(), 2);
    this.k = ((InputMethodManager)this.d.getSystemService("input_method"));
    this.k.hideSoftInputFromWindow(this.j.getWindowToken(), 2);
  }
  
  public void b()
  {
    a();
    int m = this.e.getVisibility();
    if ((m == 8) || (m == 4)) {
      this.e.setVisibility(0);
    }
  }
  
  public void c()
  {
    if (this.e.getVisibility() == 0) {
      this.e.setVisibility(4);
    }
  }
  
  public boolean d()
  {
    return this.e.getVisibility() == 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */