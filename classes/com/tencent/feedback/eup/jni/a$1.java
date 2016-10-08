package com.tencent.feedback.eup.jni;

import java.io.File;
import java.io.FilenameFilter;

final class a$1
  implements FilenameFilter
{
  a$1(a parama) {}
  
  public final boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith("so");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\jni\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */