package android.support.v4.content;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Process;

public class a
{
  public static int a(Context paramContext, String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("permission is null");
    }
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }
  
  public static final Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return b.a(paramContext, paramInt);
    }
    return paramContext.getResources().getDrawable(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\content\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */