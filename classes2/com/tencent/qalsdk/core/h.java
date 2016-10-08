package com.tencent.qalsdk.core;

import java.io.File;
import java.util.Comparator;

class h
  implements Comparator<File>
{
  h(g paramg) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    if (paramFile1.lastModified() > paramFile2.lastModified()) {
      return 1;
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */