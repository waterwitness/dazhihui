package com.tencent.feedback.eup.jni;

import android.content.Context;
import com.tencent.feedback.eup.b;
import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements Runnable
{
  private File a;
  private long b;
  private int c;
  private int d;
  private Context e;
  
  public d(Context paramContext, String paramString, long paramLong, int paramInt)
  {
    this.a = new File(paramString);
    this.b = paramLong;
    this.c = paramInt;
    this.e = paramContext;
  }
  
  private static void a(String paramString, String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
      com.tencent.feedback.common.e.c("rqdp{  fileNameList == null || fileNameList.length <= 0}", new Object[0]);
    }
    for (;;)
    {
      return;
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        File localFile = new File(paramString, paramArrayOfString[i]);
        if ((localFile.exists()) && (localFile.canWrite()))
        {
          com.tencent.feedback.common.e.b("rqdp{  file delete} %s", new Object[] { localFile.getPath() });
          localFile.delete();
        }
        i += 1;
      }
    }
  }
  
  public final void run()
  {
    this.d = 0;
    if ((this.a == null) || (!this.a.exists()) || (!this.a.isDirectory()))
    {
      com.tencent.feedback.common.e.c("rqdp{  TombFilesCleanTask mDir == null || !mDir.exists() || !mDir.isDirectory() ,pls check!}", new Object[0]);
      return;
    }
    com.tencent.feedback.common.e.a("rqdp{ start to find native record}", new Object[0]);
    Object localObject = c.a(this.e, this.a.getAbsolutePath());
    if (localObject != null)
    {
      com.tencent.feedback.common.e.a("found a record insert %s", new Object[] { ((com.tencent.feedback.eup.e)localObject).e() });
      ((com.tencent.feedback.eup.e)localObject).f(true);
      b.a(this.e, (com.tencent.feedback.eup.e)localObject);
    }
    c.a(this.a.getAbsolutePath());
    com.tencent.feedback.common.e.a("rqdp{  start to clean} %s.* rqdp{  in dir} %s rqdp{  which time <} %s rqdp{  and max file nums should <} %s", new Object[] { "tomb_", this.a.getAbsolutePath(), Long.valueOf(this.b), Integer.valueOf(this.c) });
    localObject = new LinkedList();
    String[] arrayOfString = this.a.list(new d.1(this, 5, 4, (List)localObject));
    int i;
    int j;
    if (arrayOfString != null)
    {
      i = arrayOfString.length;
      if (i > 0)
      {
        com.tencent.feedback.common.e.b("rqdp{  delete old num} %d", new Object[] { Integer.valueOf(i) });
        a(this.a.getAbsolutePath(), arrayOfString);
      }
      i = this.d - i - this.c;
      j = ((List)localObject).size();
      if ((i <= 0) || (j <= 0)) {
        break label412;
      }
      com.tencent.feedback.common.e.a("rqdp{  should delete not too old file num} %d", new Object[] { Integer.valueOf(i) });
      Collections.sort((List)localObject);
      if (j <= i) {
        break label377;
      }
    }
    for (;;)
    {
      arrayOfString = new String[i];
      StringBuffer localStringBuffer = new StringBuffer();
      i = 0;
      while ((i < ((List)localObject).size()) && (i < arrayOfString.length))
      {
        localStringBuffer.append("tomb_");
        localStringBuffer.append(((List)localObject).get(i));
        localStringBuffer.append(".txt");
        arrayOfString[i] = localStringBuffer.toString();
        localStringBuffer.delete(0, localStringBuffer.length());
        i += 1;
      }
      i = 0;
      break;
      label377:
      i = j;
    }
    com.tencent.feedback.common.e.b("rqdp{  delete not too old files} %d", new Object[] { Integer.valueOf(arrayOfString.length) });
    a(this.a.getAbsolutePath(), arrayOfString);
    label412:
    com.tencent.feedback.common.e.a("rqdp{  clean end!}", new Object[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\jni\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */