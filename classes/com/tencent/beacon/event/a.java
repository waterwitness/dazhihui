package com.tencent.beacon.event;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import com.tencent.beacon.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static String g = "INSTALL_UPLOADED_DENGTA";
  private static String h = "USEAPP_UPLOADED_DENGTA";
  private Context a;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private int e = 180;
  private String f = "N";
  private List<com.tencent.beacon.a.a.b> i = null;
  private Runnable j = new a.1(this);
  private Runnable k = new a.2(this);
  private Runnable l = new a.3(this);
  
  public a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    this.a = paramContext;
    this.c = paramBoolean1;
    this.b = paramBoolean2;
    this.d = paramBoolean3;
    this.e = paramInt;
    paramContext = n.a();
    if (paramContext != null) {
      this.f = paramContext.r();
    }
    if (this.c)
    {
      paramContext = com.tencent.beacon.a.b.b(this.a, g, "");
      if (("".equals(paramContext)) || (!com.tencent.beacon.b.a.t().equals(paramContext))) {
        break label204;
      }
      com.tencent.beacon.e.b.a("installApp list has been uploaded today! " + paramContext, new Object[0]);
    }
    for (;;)
    {
      if (this.b)
      {
        e.a().a(this.k, 60000L);
        a(true);
      }
      return;
      label204:
      e.a().a(this.j, 60000L);
    }
  }
  
  private List<com.tencent.beacon.a.a.b> b(boolean paramBoolean)
  {
    if (this.a == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        localObject1 = (ActivityManager)this.a.getSystemService("activity");
        if (localObject1 == null) {
          break;
        }
        Object localObject3 = ((ActivityManager)localObject1).getRunningAppProcesses();
        if ((localObject3 == null) || (((List)localObject3).size() <= 0)) {
          continue;
        }
        localObject1 = new ArrayList();
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
        try
        {
          localObject3 = ((List)localObject3).iterator();
          if (!((Iterator)localObject3).hasNext()) {
            continue;
          }
          localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject3).next();
          if ((localRunningAppProcessInfo.processName.startsWith("android")) || (localRunningAppProcessInfo.processName.startsWith("com.android."))) {
            continue;
          }
          if (localRunningAppProcessInfo.uid >= 10000) {
            continue;
          }
        }
        catch (Exception localException2) {}
        com.tencent.beacon.a.a.b localb = new com.tencent.beacon.a.a.b();
        localb.b = localRunningAppProcessInfo.processName;
        localb.c = localRunningAppProcessInfo.pid;
        localb.d = bool;
        ((List)localObject1).add(localb);
        continue;
      }
      catch (Exception localException1)
      {
        Object localObject1;
        Object localObject2 = null;
        continue;
        continue;
        localObject2 = null;
        continue;
        bool = true;
      }
      return (List<com.tencent.beacon.a.a.b>)localObject1;
      boolean bool = false;
      if (bool) {
        if (!paramBoolean) {}
      }
    }
  }
  
  /* Error */
  @android.annotation.SuppressLint({"NewApi"})
  private List<String> c(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 71	com/tencent/beacon/event/a:a	Landroid/content/Context;
    //   4: ifnonnull +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getfield 71	com/tencent/beacon/event/a:a	Landroid/content/Context;
    //   13: invokevirtual 281	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -11 -> 7
    //   21: aload_2
    //   22: iconst_0
    //   23: invokevirtual 287	android/content/pm/PackageManager:getInstalledPackages	(I)Ljava/util/List;
    //   26: astore_3
    //   27: aload_3
    //   28: ifnull -21 -> 7
    //   31: aload_3
    //   32: invokeinterface 139 1 0
    //   37: ifle -30 -> 7
    //   40: new 197	java/util/ArrayList
    //   43: dup
    //   44: invokespecial 198	java/util/ArrayList:<init>	()V
    //   47: astore_2
    //   48: aload_3
    //   49: invokeinterface 202 1 0
    //   54: astore_3
    //   55: aload_3
    //   56: invokeinterface 208 1 0
    //   61: ifeq +202 -> 263
    //   64: aload_3
    //   65: invokeinterface 212 1 0
    //   70: checkcast 289	android/content/pm/PackageInfo
    //   73: astore 4
    //   75: aload 4
    //   77: getfield 293	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   80: getfield 298	android/content/pm/ApplicationInfo:flags	I
    //   83: iconst_1
    //   84: iand
    //   85: ifne +195 -> 280
    //   88: iconst_1
    //   89: istore 6
    //   91: goto +174 -> 265
    //   94: new 100	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   101: astore 5
    //   103: aload 5
    //   105: ldc -1
    //   107: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload 5
    //   113: aload 4
    //   115: getfield 301	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   118: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: ldc -1
    //   123: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload 5
    //   129: aload 4
    //   131: getfield 304	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   134: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: ldc -1
    //   139: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload 5
    //   145: aload 4
    //   147: getfield 307	android/content/pm/PackageInfo:versionCode	I
    //   150: invokevirtual 258	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   153: ldc -1
    //   155: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: getstatic 312	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   162: invokestatic 318	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   165: bipush 9
    //   167: if_icmpge +47 -> 214
    //   170: aload 5
    //   172: ldc -1
    //   174: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload 5
    //   180: ldc -1
    //   182: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: iload 6
    //   188: ifeq +61 -> 249
    //   191: aload 5
    //   193: ldc 48
    //   195: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload_2
    //   200: aload 5
    //   202: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: invokeinterface 242 2 0
    //   210: pop
    //   211: goto -156 -> 55
    //   214: aload 5
    //   216: aload 4
    //   218: getfield 322	android/content/pm/PackageInfo:firstInstallTime	J
    //   221: invokevirtual 325	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   224: ldc -1
    //   226: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload 5
    //   232: aload 4
    //   234: getfield 328	android/content/pm/PackageInfo:lastUpdateTime	J
    //   237: invokevirtual 325	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   240: ldc -1
    //   242: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: goto -60 -> 186
    //   249: aload 5
    //   251: ldc -3
    //   253: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: goto -58 -> 199
    //   260: astore_2
    //   261: aconst_null
    //   262: areturn
    //   263: aload_2
    //   264: areturn
    //   265: iload_1
    //   266: ifne -172 -> 94
    //   269: iload 6
    //   271: ifeq -216 -> 55
    //   274: goto -180 -> 94
    //   277: astore_3
    //   278: aload_2
    //   279: areturn
    //   280: iconst_0
    //   281: istore 6
    //   283: goto -18 -> 265
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	a
    //   0	286	1	paramBoolean	boolean
    //   16	184	2	localObject1	Object
    //   260	19	2	localException1	Exception
    //   26	39	3	localObject2	Object
    //   277	1	3	localException2	Exception
    //   73	160	4	localPackageInfo	android.content.pm.PackageInfo
    //   101	149	5	localStringBuilder	StringBuilder
    //   89	193	6	m	int
    // Exception table:
    //   from	to	target	type
    //   9	17	260	java/lang/Exception
    //   21	27	260	java/lang/Exception
    //   31	48	260	java/lang/Exception
    //   48	55	277	java/lang/Exception
    //   55	88	277	java/lang/Exception
    //   94	186	277	java/lang/Exception
    //   191	199	277	java/lang/Exception
    //   199	211	277	java/lang/Exception
    //   214	246	277	java/lang/Exception
    //   249	257	277	java/lang/Exception
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      e.a().a(110, this.l, this.e * 1000, this.e * 1000);
      return;
    }
    e.a().a(110, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */