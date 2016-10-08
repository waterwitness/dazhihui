package com.payeco.android.plugin.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import java.util.Random;

public class PayecoKeyBoard
  extends PopupWindow
{
  public static final int KEYBOARD_ALL = 0;
  public static final int KEYBOARD_CHARACTER = 2;
  public static final int KEYBOARD_DIGIT = 1;
  public static final int KEYBOARD_MAXLENGTH_UNLIMITED = -1;
  public static final int KEYBOARD_SYMBOL = 3;
  private static Resources a;
  private static String b;
  private Button cA;
  private Button cB;
  private int cC = 0;
  private int cD = -1;
  private View.OnClickListener cE = new f(this);
  private Activity cx;
  private View cy;
  private Button cz;
  
  private PayecoKeyBoard(Activity paramActivity, Button paramButton, View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, -1, -2, true);
    this.cx = paramActivity;
    a = paramActivity.getResources();
    b = this.cx.getPackageName();
    this.cy = paramView;
    this.cz = paramButton;
    this.cC = paramInt1;
    this.cD = paramInt2;
    ((RelativeLayout)this.cy.findViewById(a.getIdentifier("payeco_keyboardLayout", "id", b))).setOnKeyListener(new g(this));
    this.cA = ((Button)this.cy.findViewById(a.getIdentifier("payeco_keyboard_password", "id", b)));
    paramActivity = this.cz.getText();
    if (paramActivity != null) {
      this.cA.setText(paramActivity);
    }
    this.cB = ((Button)this.cy.findViewById(a.getIdentifier("payeco_confirm_keyboard", "id", b)));
    this.cB.setOnClickListener(new h(this));
    paramActivity = (RadioGroup)this.cy.findViewById(a.getIdentifier("payeco_keyboard_type", "id", b));
    paramInt1 = a.getIdentifier("payeco_digit_keyboard", "id", b);
    paramInt2 = a.getIdentifier("payeco_character_keyboard", "id", b);
    int i = a.getIdentifier("payeco_symbol_keyboard", "id", b);
    a.getIdentifier("payeco_confirm_keyboard", "id", b);
    paramActivity.setOnCheckedChangeListener(new i(this, paramInt1, paramInt2, i));
    if (this.cC == 1)
    {
      paramActivity.check(paramInt1);
      paramActivity.setVisibility(8);
      return;
    }
    if (this.cC == 2)
    {
      paramActivity.check(paramInt2);
      paramActivity.setVisibility(8);
      return;
    }
    if (this.cC == 3)
    {
      paramActivity.check(i);
      paramActivity.setVisibility(8);
      return;
    }
    paramActivity.check(paramInt1);
  }
  
  private static int[] l()
  {
    int[] arrayOfInt1 = new int[10];
    int[] arrayOfInt2 = new int[10];
    arrayOfInt2[1] = 1;
    arrayOfInt2[2] = 2;
    arrayOfInt2[3] = 3;
    arrayOfInt2[4] = 4;
    arrayOfInt2[5] = 5;
    arrayOfInt2[6] = 6;
    arrayOfInt2[7] = 7;
    arrayOfInt2[8] = 8;
    arrayOfInt2[9] = 9;
    Random localRandom = new Random();
    int i = 0;
    for (;;)
    {
      if (i >= arrayOfInt2.length) {
        return arrayOfInt1;
      }
      int j = localRandom.nextInt(arrayOfInt2.length - i);
      arrayOfInt1[i] = arrayOfInt2[j];
      arrayOfInt2[j] = arrayOfInt2[(arrayOfInt2.length - 1 - i)];
      i += 1;
    }
  }
  
  public static PayecoKeyBoard popPayecoKeyboard(Activity paramActivity, View paramView, Button paramButton, int paramInt1, int paramInt2)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    View localView = paramActivity.getCurrentFocus();
    if ((localView != null) && (localInputMethodManager.isActive())) {
      localInputMethodManager.hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
    paramActivity = new PayecoKeyBoard(paramActivity, paramButton, ((LayoutInflater)paramActivity.getSystemService("layout_inflater")).inflate(paramActivity.getResources().getIdentifier("payeco_keyboard", "layout", paramActivity.getPackageName()), null), paramInt1, paramInt2);
    paramActivity.setBackgroundDrawable(new BitmapDrawable());
    paramActivity.update();
    paramActivity.showAtLocation(paramView, 80, 0, 0);
    return paramActivity;
  }
  
  public void dismiss()
  {
    super.dismiss();
  }
  
  public CharSequence getPasswordText()
  {
    return this.cA.getText();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\PayecoKeyBoard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */