package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class bn
{
  Notification A;
  public Notification B = new Notification();
  public ArrayList<String> C;
  public Context a;
  public CharSequence b;
  public CharSequence c;
  PendingIntent d;
  PendingIntent e;
  RemoteViews f;
  public Bitmap g;
  public CharSequence h;
  public int i;
  int j;
  boolean k = true;
  public boolean l;
  public bz m;
  public CharSequence n;
  int o;
  int p;
  boolean q;
  String r;
  boolean s;
  String t;
  public ArrayList<bj> u = new ArrayList();
  boolean v = false;
  String w;
  Bundle x;
  int y = 0;
  int z = 0;
  
  public bn(Context paramContext)
  {
    this.a = paramContext;
    this.B.when = System.currentTimeMillis();
    this.B.audioStreamType = -1;
    this.j = 0;
    this.C = new ArrayList();
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localNotification = this.B;
      localNotification.flags |= paramInt;
      return;
    }
    Notification localNotification = this.B;
    localNotification.flags &= (paramInt ^ 0xFFFFFFFF);
  }
  
  protected static CharSequence d(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    while (paramCharSequence.length() <= 5120) {
      return paramCharSequence;
    }
    return paramCharSequence.subSequence(0, 5120);
  }
  
  public Notification a()
  {
    return bi.a().a(this, b());
  }
  
  public bn a(int paramInt)
  {
    this.B.icon = paramInt;
    return this;
  }
  
  public bn a(long paramLong)
  {
    this.B.when = paramLong;
    return this;
  }
  
  public bn a(PendingIntent paramPendingIntent)
  {
    this.d = paramPendingIntent;
    return this;
  }
  
  public bn a(CharSequence paramCharSequence)
  {
    this.b = d(paramCharSequence);
    return this;
  }
  
  public bn a(boolean paramBoolean)
  {
    a(16, paramBoolean);
    return this;
  }
  
  public bn b(CharSequence paramCharSequence)
  {
    this.c = d(paramCharSequence);
    return this;
  }
  
  protected bo b()
  {
    return new bo();
  }
  
  public bn c(CharSequence paramCharSequence)
  {
    this.B.tickerText = d(paramCharSequence);
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */