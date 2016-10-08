package com.tencent.qalsdk.core;

import com.tencent.qalsdk.util.ALog;
import com.tencent.qalsdk.util.QLog;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import qalsdk.ah;

final class g
  extends Thread
{
  private void a(String paramString)
  {
    int k = 3;
    paramString = new File(paramString);
    Calendar localCalendar;
    int i;
    if (paramString.exists())
    {
      paramString = paramString.listFiles();
      if ((paramString == null) || (paramString.length == 0)) {
        return;
      }
      Arrays.sort(paramString, new h(this));
      localCalendar = Calendar.getInstance();
      try
      {
        String str = ah.d();
        if ((str == null) || (str.length() <= 0)) {
          break label229;
        }
        i = Integer.parseInt(str);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
          i = 3;
        }
      }
      j = k;
      if (i >= 1) {
        if (i <= 14) {
          break label288;
        }
      }
    }
    label229:
    label288:
    for (int j = k;; j = i)
    {
      localCalendar.add(6, j - j * 2);
      long l = localCalendar.getTimeInMillis();
      j = paramString.length;
      i = 0;
      while (i < j)
      {
        localCalendar = paramString[i];
        if (QLog.isColorLevel()) {
          QLog.d(e.a, 2, "found log file " + localCalendar.getName());
        }
        if (l > localCalendar.lastModified())
        {
          localCalendar.delete();
          if (QLog.isColorLevel()) {
            QLog.d(e.a, 2, "del expires log " + localCalendar.getName());
          }
        }
        i += 1;
      }
      paramString = Calendar.getInstance();
      paramString.set(6, paramString.get(6) - 7);
      paramString.set(11, 0);
      paramString.set(12, 0);
      paramString.set(13, 0);
      paramString.set(14, 0);
      paramString.getTimeInMillis();
      return;
    }
  }
  
  public void run()
  {
    a(ALog.getFilePath());
    a(QLog.getFilePath());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */