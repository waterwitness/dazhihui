package com.android.dazhihui.dzh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.screen.InitScreen;
import java.util.Iterator;
import java.util.List;

public class dzh
  extends Activity
{
  private final String a = "hascreateshortcut";
  private final String b = "com.android.launcher.action.INSTALL_SHORTCUT";
  
  private String a(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    for (;;)
    {
      int i;
      ProviderInfo localProviderInfo;
      try
      {
        paramContext = paramContext.getPackageManager().getInstalledPackages(8);
        if (paramContext == null) {
          break;
        }
        paramContext = paramContext.iterator();
        if (!paramContext.hasNext()) {
          break;
        }
        ProviderInfo[] arrayOfProviderInfo = ((PackageInfo)paramContext.next()).providers;
        if (arrayOfProviderInfo == null) {
          continue;
        }
        int j = arrayOfProviderInfo.length;
        i = 0;
        if (i >= j) {
          continue;
        }
        localProviderInfo = arrayOfProviderInfo[i];
        if ((localProviderInfo.readPermission != null) && (localProviderInfo.readPermission.contains(paramString))) {
          return localProviderInfo.authority;
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        return null;
      }
      if ((localProviderInfo.writePermission != null) && (localProviderInfo.writePermission.contains(paramString))) {
        return localProviderInfo.authority;
      }
      i += 1;
    }
    return null;
  }
  
  private void a(String paramString)
  {
    Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramString);
    localIntent1.putExtra("duplicate", false);
    Intent localIntent2 = new Intent("android.intent.action.MAIN");
    localIntent2.addCategory("android.intent.category.LAUNCHER");
    localIntent2.putExtra("tName", paramString);
    localIntent2.setClassName("com.android.dazhihui", "com.android.dazhihui.dzh.dzh");
    localIntent2.setFlags(268435456);
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, 2130838090));
    sendBroadcast(localIntent1);
  }
  
  /* Error */
  private boolean b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: aload_1
    //   5: ldc -120
    //   7: invokespecial 138	com/android/dazhihui/dzh/dzh:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   10: astore 5
    //   12: aload 5
    //   14: astore_3
    //   15: aload 5
    //   17: ifnonnull +11 -> 28
    //   20: aload_0
    //   21: aload_1
    //   22: ldc -116
    //   24: invokespecial 138	com/android/dazhihui/dzh/dzh:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnonnull +17 -> 46
    //   32: iconst_0
    //   33: ifeq +11 -> 44
    //   36: new 142	java/lang/NullPointerException
    //   39: dup
    //   40: invokespecial 143	java/lang/NullPointerException:<init>	()V
    //   43: athrow
    //   44: iconst_1
    //   45: ireturn
    //   46: new 145	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   53: ldc -108
    //   55: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_3
    //   59: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc -102
    //   64: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 164	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   73: astore_3
    //   74: aload_1
    //   75: invokevirtual 168	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   78: aload_3
    //   79: aconst_null
    //   80: ldc -86
    //   82: iconst_1
    //   83: anewarray 64	java/lang/String
    //   86: dup
    //   87: iconst_0
    //   88: aload_2
    //   89: aastore
    //   90: aconst_null
    //   91: invokevirtual 176	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore_1
    //   95: aload_1
    //   96: ifnull +28 -> 124
    //   99: aload_1
    //   100: invokeinterface 182 1 0
    //   105: istore 6
    //   107: iload 6
    //   109: ifle +15 -> 124
    //   112: aload_1
    //   113: ifnull +9 -> 122
    //   116: aload_1
    //   117: invokeinterface 185 1 0
    //   122: iconst_1
    //   123: ireturn
    //   124: aload_1
    //   125: ifnull +9 -> 134
    //   128: aload_1
    //   129: invokeinterface 185 1 0
    //   134: iconst_0
    //   135: ireturn
    //   136: astore_1
    //   137: aconst_null
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull +9 -> 149
    //   143: aload_1
    //   144: invokeinterface 185 1 0
    //   149: iconst_1
    //   150: ireturn
    //   151: astore_2
    //   152: aload 4
    //   154: astore_1
    //   155: aload_1
    //   156: ifnull +9 -> 165
    //   159: aload_1
    //   160: invokeinterface 185 1 0
    //   165: aload_2
    //   166: athrow
    //   167: astore_2
    //   168: goto -13 -> 155
    //   171: astore_2
    //   172: goto -33 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	dzh
    //   0	175	1	paramContext	Context
    //   0	175	2	paramString	String
    //   14	65	3	localObject1	Object
    //   1	152	4	localObject2	Object
    //   10	6	5	str	String
    //   105	3	6	i	int
    // Exception table:
    //   from	to	target	type
    //   3	12	136	java/lang/Exception
    //   20	28	136	java/lang/Exception
    //   46	95	136	java/lang/Exception
    //   3	12	151	finally
    //   20	28	151	finally
    //   46	95	151	finally
    //   99	107	167	finally
    //   99	107	171	java/lang/Exception
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = d.a();
    int i = paramBundle.c("hascreateshortcut");
    Intent localIntent = new Intent();
    String str = getIntent().getAction();
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      if (!TextUtils.isEmpty(str)) {
        localBundle.putString("BUNDLE_ACTION", str);
      }
      localIntent.putExtras(localBundle);
    }
    for (;;)
    {
      localIntent.setAction("android.intent.action.MAIN");
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setClass(this, InitScreen.class);
      startActivity(localIntent);
      if ((i == 0) && (!b(this, getResources().getString(2131165267)))) {
        a(getResources().getString(2131166277));
      }
      paramBundle.a("hascreateshortcut", 1);
      paramBundle.g();
      finish();
      return;
      if (!TextUtils.isEmpty(str)) {
        localIntent.putExtra("BUNDLE_ACTION", str);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\dzh\dzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */