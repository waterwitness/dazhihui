package com.tencent.wxop.stat.b;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

final class n
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    return Pattern.matches("cpu[0-9]", paramFile.getName());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */