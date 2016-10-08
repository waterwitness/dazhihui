package com.tencent.av.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

class VcSystemInfo$1CpuFilter
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    return Pattern.matches("cpu[0-9]", paramFile.getName());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\utils\VcSystemInfo$1CpuFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */