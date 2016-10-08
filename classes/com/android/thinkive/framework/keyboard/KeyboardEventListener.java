package com.android.thinkive.framework.keyboard;

public abstract interface KeyboardEventListener
{
  public static final int KEY_CODE_00 = -27;
  public static final int KEY_CODE_000 = -23;
  public static final int KEY_CODE_002 = -24;
  public static final int KEY_CODE_300 = -25;
  public static final int KEY_CODE_600 = -21;
  public static final int KEY_CODE_601 = -22;
  public static final int KEY_CODE_ALL_POSTION = -14;
  public static final int KEY_CODE_CLEAR = -2;
  public static final int KEY_CODE_DELETE = -5;
  public static final int KEY_CODE_DONE = -3;
  public static final int KEY_CODE_HALF_POSTION = -13;
  public static final int KEY_CODE_HIDE = -4;
  public static final int KEY_CODE_ONE_FOURTH_POSTION = -11;
  public static final int KEY_CODE_ONE_THIRD_POSTION = -12;
  public static final int KEY_CODE_POINT = -26;
  public static final int KEY_CODE_SHIFT = -6;
  public static final int KEY_CODE_SWITCH_EN_TO_NUM = -1;
  public static final int KEY_CODE_SWITCH_NUM_TO_EN = -7;
  
  public abstract void onKeyEvent(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\KeyboardEventListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */