package com.baidu.location.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.storage.StorageManager;
import com.baidu.location.f;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static String a = a().b() + "/baidu/tempdata";
  private static volatile e c = null;
  private final List b = new ArrayList();
  private Context d;
  
  private e(Context paramContext)
  {
    this.d = paramContext;
  }
  
  public static e a()
  {
    if (c == null) {}
    try
    {
      if (c == null) {
        c = new e(f.b());
      }
      return c;
    }
    finally {}
  }
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: new 60	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: ldc 62
    //   7: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 69	java/io/File:exists	()Z
    //   15: ifeq +8 -> 23
    //   18: aload_1
    //   19: invokevirtual 72	java/io/File:delete	()Z
    //   22: pop
    //   23: aload_1
    //   24: invokevirtual 75	java/io/File:createNewFile	()Z
    //   27: istore_2
    //   28: aload_1
    //   29: invokevirtual 69	java/io/File:exists	()Z
    //   32: ifeq +8 -> 40
    //   35: aload_1
    //   36: invokevirtual 72	java/io/File:delete	()Z
    //   39: pop
    //   40: iload_2
    //   41: ireturn
    //   42: astore_1
    //   43: iconst_0
    //   44: istore_2
    //   45: aload_1
    //   46: invokevirtual 78	java/lang/Exception:printStackTrace	()V
    //   49: iload_2
    //   50: ireturn
    //   51: astore_1
    //   52: goto -7 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	e
    //   0	55	1	paramString	String
    //   27	23	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	23	42	java/lang/Exception
    //   23	28	42	java/lang/Exception
    //   28	40	51	java/lang/Exception
  }
  
  private List d()
  {
    try
    {
      localObject2 = (StorageManager)this.d.getSystemService("storage");
      localObject1 = localObject2.getClass().getMethod("getVolumeList", new Class[0]);
      localObject3 = localObject2.getClass().getMethod("getVolumeState", new Class[] { String.class });
      localObject5 = Class.forName("android.os.storage.StorageVolume");
      localObject4 = ((Class)localObject5).getMethod("isRemovable", new Class[0]);
      localObject5 = ((Class)localObject5).getMethod("getPath", new Class[0]);
      arrayOfObject = (Object[])((Method)localObject1).invoke(localObject2, new Object[0]);
      if (arrayOfObject == null) {
        break label324;
      }
      k = arrayOfObject.length;
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1;
        Object localObject3;
        Object localObject5;
        Object localObject4;
        Object[] arrayOfObject;
        int k;
        int i;
        String str2;
        label194:
        List localList;
        boolean bool;
        label228:
        label324:
        localException.printStackTrace();
        continue;
        int j = 0;
        continue;
        for (;;)
        {
          label442:
          if (j == 0) {
            break label474;
          }
          str1 = "Internal Storage";
          break label228;
          label453:
          i += 1;
          break;
          label462:
          j = 0;
          break label194;
          label468:
          bool = false;
        }
        label474:
        String str1 = "External Storage";
      }
    }
    if (i < k)
    {
      localObject1 = arrayOfObject[i];
      str2 = (String)((Method)localObject5).invoke(localObject1, new Object[0]);
      if ((str2 == null) || (str2.length() <= 0)) {
        break label453;
      }
      if (!"mounted".equals(((Method)localObject3).invoke(localObject2, new Object[] { str2 }))) {
        break label453;
      }
      if (((Boolean)((Method)localObject4).invoke(localObject1, new Object[0])).booleanValue()) {
        break label462;
      }
      j = 1;
      if ((Build.VERSION.SDK_INT > 19) || (!a(str2))) {
        break label453;
      }
      localList = this.b;
      if (j != 0) {
        break label468;
      }
      bool = true;
      break label442;
      localList.add(new a(str2, bool, (String)localObject1));
      break label453;
    }
    else
    {
      if (Build.VERSION.SDK_INT >= 19)
      {
        localObject1 = this.d.getExternalFilesDirs(null);
        localObject2 = new ArrayList();
        ((List)localObject2).addAll(this.b);
        i = 0;
      }
      for (;;)
      {
        if ((i >= localObject1.length) || (localObject1[i] == null))
        {
          this.b.clear();
          this.b.addAll((Collection)localObject2);
          return this.b;
        }
        localObject3 = localObject1[i].getAbsolutePath();
        localObject4 = this.b.iterator();
        do
        {
          if (!((Iterator)localObject4).hasNext()) {
            break;
          }
        } while (!((String)localObject3).startsWith(((a)((Iterator)localObject4).next()).a()));
        j = 1;
        if ((j == 0) && (((String)localObject3).indexOf(this.d.getPackageName()) != -1)) {
          ((List)localObject2).add(new a((String)localObject3, true, "External Storage"));
        }
        i += 1;
      }
    }
  }
  
  /* Error */
  private List e()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: new 43	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 44	java/util/ArrayList:<init>	()V
    //   10: astore 7
    //   12: new 43	java/util/ArrayList
    //   15: dup
    //   16: invokespecial 44	java/util/ArrayList:<init>	()V
    //   19: astore 6
    //   21: new 60	java/io/File
    //   24: dup
    //   25: ldc -54
    //   27: invokespecial 205	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 69	java/io/File:exists	()Z
    //   35: ifeq +106 -> 141
    //   38: new 207	java/util/Scanner
    //   41: dup
    //   42: aload_1
    //   43: invokespecial 210	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   46: astore_2
    //   47: aload_2
    //   48: astore_1
    //   49: aload_2
    //   50: invokevirtual 211	java/util/Scanner:hasNext	()Z
    //   53: ifeq +82 -> 135
    //   56: aload_2
    //   57: astore_1
    //   58: aload_2
    //   59: invokevirtual 214	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   62: astore_3
    //   63: aload_2
    //   64: astore_1
    //   65: aload_3
    //   66: ldc -40
    //   68: invokevirtual 188	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   71: ifeq -24 -> 47
    //   74: aload_2
    //   75: astore_1
    //   76: aload_3
    //   77: bipush 9
    //   79: bipush 32
    //   81: invokevirtual 220	java/lang/String:replace	(CC)Ljava/lang/String;
    //   84: ldc -34
    //   86: invokevirtual 226	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull -44 -> 47
    //   94: aload_2
    //   95: astore_1
    //   96: aload_3
    //   97: arraylength
    //   98: ifle -51 -> 47
    //   101: aload_2
    //   102: astore_1
    //   103: aload 7
    //   105: aload_3
    //   106: iconst_1
    //   107: aaload
    //   108: invokeinterface 156 2 0
    //   113: pop
    //   114: goto -67 -> 47
    //   117: astore_2
    //   118: aload_2
    //   119: invokevirtual 78	java/lang/Exception:printStackTrace	()V
    //   122: aload_1
    //   123: ifnull +7 -> 130
    //   126: aload_1
    //   127: invokevirtual 229	java/util/Scanner:close	()V
    //   130: aload_0
    //   131: getfield 46	com/baidu/location/b/e:b	Ljava/util/List;
    //   134: areturn
    //   135: aload_2
    //   136: astore_1
    //   137: aload_2
    //   138: invokevirtual 229	java/util/Scanner:close	()V
    //   141: new 60	java/io/File
    //   144: dup
    //   145: ldc -25
    //   147: invokespecial 205	java/io/File:<init>	(Ljava/lang/String;)V
    //   150: astore_1
    //   151: aload_1
    //   152: invokevirtual 69	java/io/File:exists	()Z
    //   155: ifeq +133 -> 288
    //   158: new 207	java/util/Scanner
    //   161: dup
    //   162: aload_1
    //   163: invokespecial 210	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   166: astore_2
    //   167: aload_2
    //   168: astore_1
    //   169: aload_2
    //   170: invokevirtual 211	java/util/Scanner:hasNext	()Z
    //   173: ifeq +109 -> 282
    //   176: aload_2
    //   177: astore_1
    //   178: aload_2
    //   179: invokevirtual 214	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   182: astore_3
    //   183: aload_2
    //   184: astore_1
    //   185: aload_3
    //   186: ldc -23
    //   188: invokevirtual 188	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   191: ifeq -24 -> 167
    //   194: aload_2
    //   195: astore_1
    //   196: aload_3
    //   197: bipush 9
    //   199: bipush 32
    //   201: invokevirtual 220	java/lang/String:replace	(CC)Ljava/lang/String;
    //   204: ldc -34
    //   206: invokevirtual 226	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   209: astore_3
    //   210: aload_3
    //   211: ifnull -44 -> 167
    //   214: aload_2
    //   215: astore_1
    //   216: aload_3
    //   217: arraylength
    //   218: ifle -51 -> 167
    //   221: aload_3
    //   222: iconst_2
    //   223: aaload
    //   224: astore 5
    //   226: aload_2
    //   227: astore_1
    //   228: aload 5
    //   230: astore_3
    //   231: aload 5
    //   233: ldc -21
    //   235: invokevirtual 239	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   238: ifeq +19 -> 257
    //   241: aload_2
    //   242: astore_1
    //   243: aload 5
    //   245: iconst_0
    //   246: aload 5
    //   248: ldc -21
    //   250: invokevirtual 195	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   253: invokevirtual 243	java/lang/String:substring	(II)Ljava/lang/String;
    //   256: astore_3
    //   257: aload_2
    //   258: astore_1
    //   259: aload 6
    //   261: aload_3
    //   262: invokeinterface 156 2 0
    //   267: pop
    //   268: goto -101 -> 167
    //   271: astore_1
    //   272: aload_2
    //   273: ifnull +7 -> 280
    //   276: aload_2
    //   277: invokevirtual 229	java/util/Scanner:close	()V
    //   280: aload_1
    //   281: athrow
    //   282: aload_2
    //   283: astore_1
    //   284: aload_2
    //   285: invokevirtual 229	java/util/Scanner:close	()V
    //   288: invokestatic 249	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   291: invokevirtual 170	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   294: astore_1
    //   295: aload_0
    //   296: getfield 46	com/baidu/location/b/e:b	Ljava/util/List;
    //   299: new 148	com/baidu/location/b/a
    //   302: dup
    //   303: aload_1
    //   304: iconst_0
    //   305: ldc -5
    //   307: invokespecial 151	com/baidu/location/b/a:<init>	(Ljava/lang/String;ZLjava/lang/String;)V
    //   310: invokeinterface 156 2 0
    //   315: pop
    //   316: aload 7
    //   318: invokeinterface 174 1 0
    //   323: astore_3
    //   324: aload_3
    //   325: invokeinterface 179 1 0
    //   330: ifeq +97 -> 427
    //   333: aload_3
    //   334: invokeinterface 183 1 0
    //   339: checkcast 105	java/lang/String
    //   342: astore 5
    //   344: aload 6
    //   346: aload 5
    //   348: invokeinterface 253 2 0
    //   353: ifeq -29 -> 324
    //   356: aload 5
    //   358: aload_1
    //   359: invokevirtual 133	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   362: ifne -38 -> 324
    //   365: new 60	java/io/File
    //   368: dup
    //   369: aload 5
    //   371: invokespecial 205	java/io/File:<init>	(Ljava/lang/String;)V
    //   374: astore_2
    //   375: aload_2
    //   376: invokevirtual 69	java/io/File:exists	()Z
    //   379: ifeq -55 -> 324
    //   382: aload_2
    //   383: invokevirtual 256	java/io/File:isDirectory	()Z
    //   386: ifeq -62 -> 324
    //   389: aload_2
    //   390: invokevirtual 259	java/io/File:canWrite	()Z
    //   393: ifeq -69 -> 324
    //   396: aload_0
    //   397: getfield 46	com/baidu/location/b/e:b	Ljava/util/List;
    //   400: new 148	com/baidu/location/b/a
    //   403: dup
    //   404: aload 5
    //   406: iconst_0
    //   407: ldc -5
    //   409: invokespecial 151	com/baidu/location/b/a:<init>	(Ljava/lang/String;ZLjava/lang/String;)V
    //   412: invokeinterface 156 2 0
    //   417: pop
    //   418: goto -94 -> 324
    //   421: astore_2
    //   422: aconst_null
    //   423: astore_1
    //   424: goto -306 -> 118
    //   427: iconst_0
    //   428: ifeq -298 -> 130
    //   431: new 261	java/lang/NullPointerException
    //   434: dup
    //   435: invokespecial 262	java/lang/NullPointerException:<init>	()V
    //   438: athrow
    //   439: astore_1
    //   440: aload 4
    //   442: astore_2
    //   443: goto -171 -> 272
    //   446: astore_1
    //   447: goto -175 -> 272
    //   450: astore_3
    //   451: aload_1
    //   452: astore_2
    //   453: aload_3
    //   454: astore_1
    //   455: goto -183 -> 272
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	458	0	this	e
    //   30	229	1	localObject1	Object
    //   271	10	1	localObject2	Object
    //   283	141	1	localObject3	Object
    //   439	1	1	localObject4	Object
    //   446	6	1	localObject5	Object
    //   454	1	1	localObject6	Object
    //   46	56	2	localScanner	java.util.Scanner
    //   117	21	2	localException1	Exception
    //   166	224	2	localObject7	Object
    //   421	1	2	localException2	Exception
    //   442	11	2	localObject8	Object
    //   62	272	3	localObject9	Object
    //   450	4	3	localObject10	Object
    //   1	440	4	localObject11	Object
    //   224	181	5	str	String
    //   19	326	6	localArrayList1	ArrayList
    //   10	307	7	localArrayList2	ArrayList
    // Exception table:
    //   from	to	target	type
    //   49	56	117	java/lang/Exception
    //   58	63	117	java/lang/Exception
    //   65	74	117	java/lang/Exception
    //   76	90	117	java/lang/Exception
    //   96	101	117	java/lang/Exception
    //   103	114	117	java/lang/Exception
    //   137	141	117	java/lang/Exception
    //   169	176	117	java/lang/Exception
    //   178	183	117	java/lang/Exception
    //   185	194	117	java/lang/Exception
    //   196	210	117	java/lang/Exception
    //   216	221	117	java/lang/Exception
    //   231	241	117	java/lang/Exception
    //   243	257	117	java/lang/Exception
    //   259	268	117	java/lang/Exception
    //   284	288	117	java/lang/Exception
    //   169	176	271	finally
    //   178	183	271	finally
    //   185	194	271	finally
    //   196	210	271	finally
    //   216	221	271	finally
    //   231	241	271	finally
    //   243	257	271	finally
    //   259	268	271	finally
    //   284	288	271	finally
    //   21	47	421	java/lang/Exception
    //   141	167	421	java/lang/Exception
    //   288	324	421	java/lang/Exception
    //   324	418	421	java/lang/Exception
    //   21	47	439	finally
    //   141	167	439	finally
    //   288	324	439	finally
    //   324	418	439	finally
    //   49	56	446	finally
    //   58	63	446	finally
    //   65	74	446	finally
    //   76	90	446	finally
    //   96	101	446	finally
    //   103	114	446	finally
    //   137	141	446	finally
    //   118	122	450	finally
  }
  
  public String b()
  {
    List localList = c();
    if ((localList == null) || (localList.size() == 0)) {
      return null;
    }
    return ((a)localList.get(0)).a();
  }
  
  public List c()
  {
    List localList = null;
    if (Build.VERSION.SDK_INT >= 14) {
      localList = d();
    }
    if ((localList != null) && (localList.size() > 0)) {
      return localList;
    }
    return e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */