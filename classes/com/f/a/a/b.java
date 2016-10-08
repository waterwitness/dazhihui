package com.f.a.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class b
  implements View.OnFocusChangeListener, View.OnTouchListener
{
  private int a;
  private de b;
  
  public b(int paramInt)
  {
    this(paramInt, null);
  }
  
  public b(int paramInt, de paramde)
  {
    this.a = paramInt;
    this.b = paramde;
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = (EditText)paramView;
    if (paramBoolean)
    {
      ((InputMethodManager)paramView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      if (paramView.isClickable())
      {
        paramView.setInputType(0);
        paramView.setText("");
        paramView.setClickable(false);
        ec.a(paramView.getContext(), paramView, this.a);
      }
    }
    while (this.b == null) {
      return;
    }
    z.a("PasswordKeyboardListener", "validatapwd");
    this.b.a(this.a);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramView instanceof EditText))
    {
      paramView = (EditText)paramView;
      paramView.setInputType(0);
      if ((paramMotionEvent.getAction() == 1) && (paramView.isClickable()))
      {
        paramView.setText("");
        paramView.setClickable(false);
        ec.a(paramView.getContext(), paramView, this.a);
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */