package com.tencent.imsdk;

import java.io.File;
import java.util.Arrays;
import java.util.Calendar;

final class ᐧ
  extends Thread
{
  public final void run()
  {
    Object localObject = new File(QLogImpl.getLogPath());
    if (((File)localObject).exists())
    {
      localObject = ((File)localObject).listFiles();
      if ((localObject == null) || (localObject.length == 0)) {
        return;
      }
      Arrays.sort((Object[])localObject, new ᴵ(this));
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.add(6, -7);
      long l = localCalendar.getTimeInMillis();
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        localCalendar = localObject[i];
        if (QLog.isColorLevel()) {
          QLog.d(LogManager.tag, 2, "found log file " + localCalendar.getName());
        }
        if (l > localCalendar.lastModified())
        {
          localCalendar.delete();
          if (QLog.isColorLevel()) {
            QLog.d(LogManager.tag, 2, "del expires log " + localCalendar.getName());
          }
        }
        i += 1;
      }
    }
    localObject = Calendar.getInstance();
    ((Calendar)localObject).set(6, ((Calendar)localObject).get(6) - 7);
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    ((Calendar)localObject).getTimeInMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ᐧ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */