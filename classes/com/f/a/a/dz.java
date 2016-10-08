package com.f.a.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class dz
  implements View.OnFocusChangeListener, View.OnTouchListener
{
  private ax a;
  
  public dz(ax paramax)
  {
    this.a = paramax;
  }
  
  private void a(EditText paramEditText)
  {
    ((InputMethodManager)paramEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
    paramEditText.setText("");
    paramEditText.setInputType(0);
    paramEditText.setClickable(false);
    ec.a(paramEditText.getContext(), paramEditText, 0, this.a);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if ((paramView instanceof EditText))
    {
      paramView = (EditText)paramView;
      if ((paramBoolean) && (paramView.isClickable())) {
        a(paramView);
      }
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramView instanceof EditText))
    {
      paramView = (EditText)paramView;
      if ((paramMotionEvent.getAction() == 1) && (paramView.isClickable())) {
        a(paramView);
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */