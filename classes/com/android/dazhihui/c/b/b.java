package com.android.dazhihui.c.b;

import java.io.File;
import java.util.Comparator;

final class b
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    if (paramFile1.lastModified() < paramFile2.lastModified()) {
      return -1;
    }
    if (paramFile1.lastModified() == paramFile2.lastModified()) {
      return 0;
    }
    return 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */