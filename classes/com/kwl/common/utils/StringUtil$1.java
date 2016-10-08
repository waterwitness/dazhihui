package com.kwl.common.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

class StringUtil$1
  extends ThreadLocal<SimpleDateFormat>
{
  protected SimpleDateFormat initialValue()
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\StringUtil$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */