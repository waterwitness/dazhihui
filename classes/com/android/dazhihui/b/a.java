package com.android.dazhihui.b;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.bn;
import com.android.dazhihui.ui.screen.NotificationActivity;
import com.android.dazhihui.ui.screen.stock.MessageCenterList;

public class a
{
  private static a j;
  private Context a;
  private b b = b.a();
  private NotificationManager c;
  private Notification d;
  private Notification e;
  private Notification f;
  private Notification g;
  private int h;
  private String i;
  
  public static a a()
  {
    if (j == null) {
      j = new a();
    }
    return j;
  }
  
  private void b()
  {
    this.d = new Notification();
    this.d.icon = this.h;
    this.d.defaults = 2;
    long[] arrayOfLong = new long[4];
    long[] tmp35_34 = arrayOfLong;
    tmp35_34[0] = 0L;
    long[] tmp39_35 = tmp35_34;
    tmp39_35[1] = 100L;
    long[] tmp45_39 = tmp39_35;
    tmp45_39[2] = 200L;
    long[] tmp51_45 = tmp45_39;
    tmp51_45[3] = 300L;
    tmp51_45;
    this.d.vibrate = arrayOfLong;
    this.d.flags = 16;
    this.e = new Notification();
    this.e.icon = this.h;
    this.e.defaults = 2;
    this.e.vibrate = arrayOfLong;
    this.e.flags = 16;
    this.f = new Notification();
    this.f.icon = this.h;
    this.f.defaults = 2;
    this.f.vibrate = arrayOfLong;
    this.f.flags = 16;
    this.g = new Notification();
    this.g.icon = this.h;
    this.g.defaults = 2;
    this.g.vibrate = arrayOfLong;
    this.g.flags = 16;
  }
  
  public void a(Context paramContext)
  {
    this.a = paramContext;
    this.c = ((NotificationManager)paramContext.getSystemService("notification"));
    this.h = 2130838090;
    b();
    this.i = paramContext.getString(2131165267);
  }
  
  public void a(h paramh)
  {
    int k;
    Object localObject1;
    Object localObject2;
    Intent localIntent;
    if (paramh != null)
    {
      k = Build.VERSION.SDK_INT;
      if (paramh.d != 0) {
        break label224;
      }
      localObject1 = this.i;
      localObject2 = new Bundle();
      localIntent = new Intent(this.a, NotificationActivity.class);
      ((Bundle)localObject2).putInt("notificationId", 2);
      ((Bundle)localObject2).putInt("BUNDLE_PUSH_ID", paramh.a);
      localIntent.putExtras((Bundle)localObject2);
      localIntent.setFlags(268435456);
      localObject2 = PendingIntent.getActivity(this.a, 0, localIntent, 134217728);
      if (k >= 11) {
        break label97;
      }
    }
    label97:
    label224:
    do
    {
      do
      {
        do
        {
          return;
          paramh = new bn(this.a).a((PendingIntent)localObject2).a(this.h).c(this.i + ":" + paramh.f).a(paramh.g).a(true).a((CharSequence)localObject1).b(paramh.f).a();
          paramh.defaults = 2;
          paramh.vibrate = new long[] { 0L, 100L, 200L, 300L };
          this.c.notify((int)System.currentTimeMillis(), paramh);
          return;
          if (paramh.d == 1)
          {
            localObject1 = new bn(this.a);
            localObject2 = this.i;
            localIntent = new Intent(this.a, NotificationActivity.class);
            localIntent.putExtra("notificationId", 4);
            localIntent.putExtra("url", paramh.e);
            localIntent.putExtra("BUNDLE_PUSH_ID", paramh.a);
            localIntent.setFlags(268435456);
            paramh = ((bn)localObject1).a(PendingIntent.getActivity(this.a, (int)System.currentTimeMillis(), localIntent, 134217728)).a(this.h).c(this.i + ":" + paramh.f).a(paramh.g).a(true).a((CharSequence)localObject2).b(paramh.f).a();
            paramh.defaults = 2;
            paramh.vibrate = new long[] { 0L, 100L, 200L, 300L };
            paramh.flags = 16;
            this.c.notify((int)System.currentTimeMillis(), paramh);
            return;
          }
          if (paramh.d != 2) {
            break;
          }
          localObject1 = this.i;
          localObject2 = new Intent(this.a, NotificationActivity.class);
          ((Intent)localObject2).putExtra("notificationId", 12);
          ((Intent)localObject2).putExtra("url", paramh.e);
          ((Intent)localObject2).putExtra("BUNDLE_PUSH_ID", paramh.a);
          ((Intent)localObject2).setFlags(268435456);
          localObject2 = PendingIntent.getActivity(this.a, (int)System.currentTimeMillis(), (Intent)localObject2, 134217728);
        } while (k < 11);
        paramh = new bn(this.a).a((PendingIntent)localObject2).a(this.h).c(this.i + ":" + paramh.f).a(paramh.g).a(true).a((CharSequence)localObject1).b(paramh.f).a();
        paramh.defaults = 2;
        paramh.vibrate = new long[] { 0L, 100L, 200L, 300L };
        paramh.flags = 16;
        this.c.notify((int)System.currentTimeMillis(), paramh);
        return;
      } while (paramh.d != 3);
      localObject1 = this.i;
      localObject2 = new Intent(this.a, NotificationActivity.class);
      ((Intent)localObject2).putExtra("notificationId", 13);
      ((Intent)localObject2).putExtra("url", paramh.e);
      ((Intent)localObject2).putExtra("BUNDLE_PUSH_ID", paramh.a);
      ((Intent)localObject2).setFlags(268435456);
      localObject2 = PendingIntent.getActivity(this.a, (int)System.currentTimeMillis(), (Intent)localObject2, 134217728);
    } while (k < 11);
    paramh = new bn(this.a).a((PendingIntent)localObject2).a(this.h).c(this.i + ":" + paramh.f).a(paramh.g).a(true).a((CharSequence)localObject1).b(paramh.f).a();
    paramh.defaults = 2;
    paramh.vibrate = new long[] { 0L, 100L, 200L, 300L };
    paramh.flags = 16;
    try
    {
      this.c.notify((int)System.currentTimeMillis(), paramh);
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void a(k paramk)
  {
    bn localbn = new bn(this.a);
    String str2 = paramk.f;
    String str1 = this.i;
    if (this.b.n() > 1) {
      str1 = this.i + "（" + this.b.n() + "条新自选股信息）";
    }
    Intent localIntent = new Intent(this.a, MessageCenterList.class);
    localIntent.putExtra("type", (byte)0);
    this.g = localbn.a(PendingIntent.getActivity(this.a, 22, localIntent, 268435456)).a(this.h).c(this.i + ":" + str2).a(paramk.g).a(true).a(str1).b(paramk.f).a();
    this.c.notify(5, this.g);
  }
  
  public void a(l paraml)
  {
    String str2 = paraml.c + "(" + paraml.b + ")" + paraml.d;
    String str1 = this.i;
    if (this.b.h() > 1) {
      str1 = this.i + "（" + this.b.h() + "条新预警信息）";
    }
    Object localObject = new Intent(this.a, NotificationActivity.class);
    ((Intent)localObject).putExtra("notificationId", 1);
    ((Intent)localObject).putExtra("code", paraml.b);
    ((Intent)localObject).putExtra("name", paraml.c);
    ((Intent)localObject).putExtra("BUNDLE_PUSH_ID", paraml.a);
    ((Intent)localObject).setFlags(((Intent)localObject).getFlags() | 0x10000000);
    localObject = PendingIntent.getActivity(this.a, 30, (Intent)localObject, 268435456);
    this.d = new bn(this.a).a((PendingIntent)localObject).a(this.h).c(this.i + ":" + str2).a(paraml.e).a(true).a(str1).b(paraml.d).a();
    this.d.defaults = 2;
    this.d.vibrate = new long[] { 0L, 100L, 200L, 300L };
    this.c.notify(1, this.d);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */