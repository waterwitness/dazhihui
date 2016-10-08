package com.android.thinkive.framework.keyboard;

public class BaseKeyboard
{
  protected static final String DRAWABLE = "drawable";
  protected static final String RES_NAME_DELETE_BIG = "btn_keyboard_delete_big";
  protected static final String RES_NAME_DELETE_BIG_WHITE = "btn_keyboard_delete_big_white";
  protected static final String RES_NAME_DELETE_SMALL = "btn_keyboard_delete_small";
  protected static final String RES_NAME_DELETE_SMALL_WHITE = "btn_keyboard_delete_small_white";
  protected static final String RES_NAME_SHIFT = "btn_keyboard_shift";
  protected static final String RES_NAME_SHIFT_WHITE = "btn_keyboard_shift_white";
  public static final short THEME_LIGHT = 1;
  public static final short THEME_NIGHT = 2;
  protected static int sColorDefaultFont;
  protected static int sColorDefaultFuncKeyBg;
  protected static int sColorDefaultKeyBg = ;
  protected static int sColorKeyboardBg = getColorKeyboardBg();
  protected static int sColorSelectedFont;
  protected static int sColorSelectedKeyBg;
  protected static String sResNameDeleteBig = getResNameDeleteBig();
  protected static String sResNameDeleteSmall = getResNameDeleteSmall();
  protected static String sResNameShift = getResNameShift();
  private static short sTheme = 2;
  
  static
  {
    sColorDefaultFuncKeyBg = getColorDefaultFuncKeyBg();
    sColorSelectedKeyBg = getColorSelectedKeyBg();
    sColorDefaultFont = getColorDefaultFont();
    sColorSelectedFont = getColorSelectedFont();
  }
  
  public static int getColorDefaultFont()
  {
    if (1 == sTheme) {
      return -10066330;
    }
    return -3355444;
  }
  
  public static int getColorDefaultFuncKeyBg()
  {
    if (1 == sTheme) {
      return -3355444;
    }
    return -10066330;
  }
  
  public static int getColorDefaultKeyBg()
  {
    if (1 == sTheme) {
      return -1710619;
    }
    return -11711155;
  }
  
  public static int getColorKeyboardBg()
  {
    if (1 == sTheme) {
      return -1;
    }
    return -4210753;
  }
  
  public static int getColorSelectedFont()
  {
    if (1 == sTheme) {}
    return -1;
  }
  
  public static int getColorSelectedKeyBg()
  {
    if (1 == sTheme) {
      return 43662;
    }
    return -1553860;
  }
  
  public static String getResKeyPreviewBg()
  {
    if (1 == sTheme) {
      return "bg_key_preview_light";
    }
    return "bg_key_preview_night";
  }
  
  public static String getResNameDeleteBig()
  {
    if (1 == sTheme) {
      return "btn_keyboard_delete_big_light";
    }
    return "btn_keyboard_delete_big_night";
  }
  
  public static String getResNameDeleteSmall()
  {
    if (1 == sTheme) {
      return "btn_keyboard_delete_small_light";
    }
    return "btn_keyboard_delete_small_night";
  }
  
  public static String getResNameShift()
  {
    if (1 == sTheme) {
      return "btn_keyboard_shift_light";
    }
    return "btn_keyboard_shift_night";
  }
  
  public void setTheme(short paramShort)
  {
    sTheme = paramShort;
    sColorDefaultKeyBg = getColorDefaultKeyBg();
    sColorDefaultFuncKeyBg = getColorDefaultFuncKeyBg();
    sColorSelectedKeyBg = getColorSelectedKeyBg();
    sColorDefaultFont = getColorDefaultFont();
    sColorSelectedFont = getColorSelectedFont();
    sColorKeyboardBg = getColorKeyboardBg();
    sResNameDeleteBig = getResNameDeleteBig();
    sResNameDeleteSmall = getResNameDeleteSmall();
    sResNameShift = getResNameShift();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\BaseKeyboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */