package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

public class jm
{
  private static final String a = jm.class.getSimpleName();
  
  public static String a(CharSequence paramCharSequence, Context paramContext)
  {
    int i = 0;
    paramContext = new SpannableStringBuilder(paramCharSequence);
    paramCharSequence = (ImageSpan[])paramContext.getSpans(0, paramCharSequence.length(), ImageSpan.class);
    while (i < paramCharSequence.length)
    {
      Object localObject = paramCharSequence[i];
      String str = ((ImageSpan)localObject).getSource();
      int j = paramContext.getSpanStart(localObject);
      int k = paramContext.getSpanEnd(localObject);
      if (str.contains("[")) {
        paramContext.replace(j, k, a(str));
      }
      i += 1;
    }
    paramContext.clearSpans();
    return paramContext.toString();
  }
  
  private static String a(String paramString)
  {
    int i = 0;
    paramString = paramString.substring(1, paramString.length() - 1);
    if (paramString.length() < 6) {
      return new String(Character.toChars(Integer.parseInt(paramString, 16)));
    }
    Object localObject = paramString.split("_");
    paramString = Character.toChars(Integer.parseInt(localObject[0], 16));
    localObject = Character.toChars(Integer.parseInt(localObject[1], 16));
    char[] arrayOfChar = new char[paramString.length + localObject.length];
    while (i < paramString.length)
    {
      arrayOfChar[i] = paramString[i];
      i += 1;
    }
    i = paramString.length;
    while (i < arrayOfChar.length)
    {
      arrayOfChar[i] = localObject[(i - paramString.length)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */