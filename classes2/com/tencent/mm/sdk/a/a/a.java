package com.tencent.mm.sdk.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.b.e;

public final class a
{
  public static boolean a(Context paramContext, a.a parama)
  {
    if ((paramContext == null) || (parama == null))
    {
      com.tencent.mm.sdk.b.a.a("MicroMsg.SDK.MMessage", "send fail, invalid argument");
      return false;
    }
    if (e.j(parama.p))
    {
      com.tencent.mm.sdk.b.a.a("MicroMsg.SDK.MMessage", "send fail, action is null");
      return false;
    }
    String str1 = null;
    if (!e.j(parama.o)) {
      str1 = parama.o + ".permission.MM_MESSAGE";
    }
    Intent localIntent = new Intent(parama.p);
    if (parama.n != null) {
      localIntent.putExtras(parama.n);
    }
    String str2 = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 570490883);
    localIntent.putExtra("_mmessage_appPackage", str2);
    localIntent.putExtra("_mmessage_content", parama.m);
    localIntent.putExtra("_mmessage_checksum", b.a(parama.m, 570490883, str2));
    paramContext.sendBroadcast(localIntent, str1);
    com.tencent.mm.sdk.b.a.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + localIntent + ", perm=" + str1);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */