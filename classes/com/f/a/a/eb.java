package com.f.a.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class eb
{
  public String[] a = { "pluginSerialNoTest", "pluginSerialNoProduct", "commonPayPhone" };
  public String[] b = { "text", "text", "text" };
  private c c = new c(paramContext, this.d, this.a, this.b);
  private String d = "pluginfo";
  
  public eb(Context paramContext) {}
  
  public cc a(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Cursor localCursor = this.c.a(paramInt);
    if (localCursor == null) {
      return (cc)localObject2;
    }
    if (localCursor.moveToNext())
    {
      localObject2 = new cc();
      ((cc)localObject2).a(paramInt);
      if (!u.a().f) {
        break label132;
      }
    }
    label132:
    for (localObject1 = localCursor.getString(localCursor.getColumnIndex(this.a[0]));; localObject1 = localCursor.getString(localCursor.getColumnIndex(this.a[1])))
    {
      String str = localCursor.getString(localCursor.getColumnIndex(this.a[2]));
      ((cc)localObject2).a((String)localObject1);
      ((cc)localObject2).b(str);
      localObject1 = localObject2;
      localObject2 = localObject1;
      if (localCursor == null) {
        break;
      }
      localCursor.close();
      this.c.a();
      return (cc)localObject1;
    }
  }
  
  public boolean a(cc paramcc)
  {
    if (paramcc == null) {
      return false;
    }
    ContentValues localContentValues = new ContentValues();
    if (u.a().f) {
      localContentValues.put(this.a[0], paramcc.b());
    }
    for (;;)
    {
      localContentValues.put(this.a[2], paramcc.c());
      return this.c.a(localContentValues);
      localContentValues.put(this.a[1], paramcc.b());
    }
  }
  
  public boolean b(cc paramcc)
  {
    int j = 1;
    boolean bool = false;
    ContentValues localContentValues = new ContentValues();
    if (paramcc.b() != null) {
      if (u.a().f) {
        localContentValues.put(this.a[0], paramcc.b());
      }
    }
    for (int i = 1;; i = 0)
    {
      if (paramcc.c() != null)
      {
        localContentValues.put(this.a[2], paramcc.c());
        i = j;
      }
      for (;;)
      {
        if (i != 0) {
          bool = this.c.a(paramcc.a(), localContentValues);
        }
        return bool;
        localContentValues.put(this.a[1], paramcc.b());
        break;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */