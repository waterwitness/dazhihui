package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class cl
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;
  private static final Object d = new Object();
  
  public static Bundle a(Notification.Builder paramBuilder, cf paramcf)
  {
    paramBuilder.addAction(paramcf.a(), paramcf.b(), paramcf.c());
    paramBuilder = new Bundle(paramcf.d());
    if (paramcf.f() != null) {
      paramBuilder.putParcelableArray("android.support.remoteInputs", cz.a(paramcf.f()));
    }
    return paramBuilder;
  }
  
  public static Bundle a(Notification paramNotification)
  {
    Object localObject1;
    Bundle localBundle;
    synchronized (a)
    {
      if (c) {
        return null;
      }
    }
  }
  
  public static SparseArray<Bundle> a(List<Bundle> paramList)
  {
    Object localObject1 = null;
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      Bundle localBundle = (Bundle)paramList.get(i);
      Object localObject2 = localObject1;
      if (localBundle != null)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SparseArray();
        }
        ((SparseArray)localObject2).put(i, localBundle);
      }
      i += 1;
      localObject1 = localObject2;
    }
    return (SparseArray<Bundle>)localObject1;
  }
  
  public static void a(bh parambh, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    parambh = new Notification.BigPictureStyle(parambh.a()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2) {
      parambh.bigLargeIcon(paramBitmap2);
    }
    if (paramBoolean1) {
      parambh.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(bh parambh, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    parambh = new Notification.BigTextStyle(parambh.a()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean) {
      parambh.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(bh parambh, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList<CharSequence> paramArrayList)
  {
    parambh = new Notification.InboxStyle(parambh.a()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean) {
      parambh.setSummaryText(paramCharSequence2);
    }
    paramCharSequence1 = paramArrayList.iterator();
    while (paramCharSequence1.hasNext()) {
      parambh.addLine((CharSequence)paramCharSequence1.next());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */