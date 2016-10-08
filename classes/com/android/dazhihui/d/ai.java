package com.android.dazhihui.d;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import com.android.dazhihui.ui.widget.a.aa;

final class ai
  implements aa
{
  ai(String paramString, int paramInt1, int paramInt2, Context paramContext) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {
      return;
    }
    paramString = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    paramArrayOfByte.putExtra("android.intent.extra.shortcut.NAME", this.a);
    paramArrayOfByte.putExtra("duplicate", false);
    Intent localIntent = new Intent("com.dazhihui.android.ACTION_MAIN");
    if (this.b - 1 < 0) {}
    for (;;)
    {
      localIntent.putExtra("index", i);
      localIntent.putExtra("index_type", this.c);
      localIntent.putExtra("tName", this.a);
      localIntent.setClassName("com.android.dazhihui", "com.android.dazhihui.dzh.dzh");
      localIntent.setFlags(268435456);
      localIntent.addFlags(2097152);
      paramArrayOfByte.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
      paramArrayOfByte.putExtra("android.intent.extra.shortcut.ICON", paramString);
      this.d.sendBroadcast(paramArrayOfByte);
      return;
      i = this.b - 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */