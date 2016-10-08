package com.iflytek.cloud.resource;

import android.text.TextUtils;
import java.util.Locale;

public class Resource
{
  public static final int TAG_ERROR_CODE = 0;
  public static final int TAG_ERROR_UNKNOWN = 1;
  public static final int TEXT_AGAIN = 9;
  public static final int TEXT_CANCEL = 4;
  public static final int TEXT_DETAIL = 3;
  public static final int TEXT_HELP_LINK = 1;
  public static final int TEXT_HELP_RECO = 13;
  public static final int TEXT_HELP_SMS = 12;
  public static final int TEXT_KNOW = 2;
  public static final int TEXT_MORE = 7;
  public static final int TEXT_PLAYBACK = 10;
  public static final int TEXT_POWER_LINK = 0;
  public static final int TEXT_RETRIEVE = 11;
  public static final int TEXT_RETRY = 8;
  public static final int TEXT_SET = 6;
  public static final int TEXT_STOP = 5;
  public static final int TITLE_AUDIO_PLAYING = 6;
  public static final int TITLE_AUDIO_REQUEST = 4;
  public static final int TITLE_CONNECTING = 1;
  public static final int TITLE_DATA_UPLOAD = 7;
  public static final int TITLE_ERROR = 5;
  public static final int TITLE_HELP = 0;
  public static final int TITLE_RECOGNIZE_WAITING = 3;
  public static final int TITLE_RECORDING = 2;
  private static Locale a = Locale.CHINA;
  
  private static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while ((Locale.CHINA.toString().equalsIgnoreCase(paramString)) || (Locale.CHINESE.toString().equalsIgnoreCase(paramString))) {
      return true;
    }
    return false;
  }
  
  public static String getErrorDescription(int paramInt)
  {
    String[] arrayOfString = a.c;
    if (a.equals(Locale.US)) {
      arrayOfString = b.c;
    }
    while ((paramInt > 0) && (paramInt < arrayOfString.length))
    {
      return arrayOfString[paramInt];
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.c;
      }
    }
    return getErrorTag(1);
  }
  
  public static String getErrorTag(int paramInt)
  {
    String[] arrayOfString = a.d;
    if (a.equals(Locale.US)) {
      arrayOfString = b.d;
    }
    while ((paramInt >= 0) && (paramInt < arrayOfString.length))
    {
      return arrayOfString[paramInt];
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.d;
      }
    }
    return "";
  }
  
  public static String getLanguage()
  {
    return a.toString();
  }
  
  public static String getText(int paramInt)
  {
    String[] arrayOfString = a.a;
    if (a.equals(Locale.US)) {
      arrayOfString = b.a;
    }
    while ((paramInt >= 0) && (paramInt < arrayOfString.length))
    {
      return arrayOfString[paramInt];
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.a;
      }
    }
    return "";
  }
  
  public static String getTitle(int paramInt)
  {
    String[] arrayOfString = a.b;
    if (a.equals(Locale.US)) {
      arrayOfString = b.b;
    }
    while ((paramInt >= 0) && (paramInt < arrayOfString.length))
    {
      return arrayOfString[paramInt];
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.b;
      }
    }
    return "";
  }
  
  public static boolean matchLanguage(String paramString)
  {
    String str = "";
    if (paramString != null) {
      str = paramString.trim();
    }
    if (a.toString().equalsIgnoreCase(str)) {
      return true;
    }
    return (a(str)) && (a(a.toString()));
  }
  
  public static void setErrorDescription(int paramInt, String paramString)
  {
    String[] arrayOfString = a.c;
    if (a.equals(Locale.US)) {
      arrayOfString = b.c;
    }
    for (;;)
    {
      if ((paramInt > 0) && (paramInt < arrayOfString.length)) {
        arrayOfString[paramInt] = paramString;
      }
      return;
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.c;
      }
    }
  }
  
  public static void setText(int paramInt, String paramString)
  {
    String[] arrayOfString = a.a;
    if (a.equals(Locale.US)) {
      arrayOfString = b.a;
    }
    for (;;)
    {
      if ((paramInt >= 0) && (paramInt < arrayOfString.length)) {
        arrayOfString[paramInt] = paramString;
      }
      return;
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.a;
      }
    }
  }
  
  public static void setTitle(int paramInt, String paramString)
  {
    String[] arrayOfString = a.b;
    if (a.equals(Locale.US)) {
      arrayOfString = b.b;
    }
    for (;;)
    {
      if ((paramInt >= 0) && (paramInt < arrayOfString.length)) {
        arrayOfString[paramInt] = paramString;
      }
      return;
      if (a.equals(Locale.TRADITIONAL_CHINESE)) {
        arrayOfString = c.b;
      }
    }
  }
  
  public static void setUILanguage(Locale paramLocale)
  {
    if (paramLocale == null) {}
    while ((!paramLocale.equals(Locale.US)) && (!paramLocale.equals(Locale.CHINA)) && (!paramLocale.equals(Locale.TRADITIONAL_CHINESE))) {
      return;
    }
    a = paramLocale;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\resource\Resource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */