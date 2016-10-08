package com.tencent.feedback.eup;

import android.content.Context;
import android.os.Environment;
import com.tencent.feedback.common.c;
import com.tencent.feedback.proguard.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class b
{
  public byte a;
  public int b;
  
  public static int a(Context paramContext, List<e> paramList)
  {
    int i = 0;
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.deleteEupList() start}", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.feedback.common.e.c("rqdp{  deleteEupList() have null args!}", new Object[0]);
      i = -1;
    }
    while (paramList.size() <= 0) {
      return i;
    }
    Long[] arrayOfLong = new Long[paramList.size()];
    i = 0;
    while (i < paramList.size())
    {
      arrayOfLong[i] = Long.valueOf(((e)paramList.get(i)).a());
      i += 1;
    }
    return l.a(paramContext, arrayOfLong);
  }
  
  /* Error */
  public static e a(Context paramContext, String paramString1, String paramString2, long paramLong1, Map<String, com.tencent.feedback.common.PlugInInfo> paramMap, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, long paramLong2, String paramString9, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 40	com/tencent/feedback/eup/e
    //   3: dup
    //   4: invokespecial 58	com/tencent/feedback/eup/e:<init>	()V
    //   7: astore 16
    //   9: aload 16
    //   11: aload 6
    //   13: invokevirtual 62	com/tencent/feedback/eup/e:i	(Ljava/lang/String;)V
    //   16: aload 16
    //   18: aload 7
    //   20: invokevirtual 65	com/tencent/feedback/eup/e:j	(Ljava/lang/String;)V
    //   23: aload 16
    //   25: lload 12
    //   27: lload_3
    //   28: ladd
    //   29: invokevirtual 68	com/tencent/feedback/eup/e:b	(J)V
    //   32: aload 14
    //   34: astore 6
    //   36: aload 14
    //   38: ifnull +39 -> 77
    //   41: aload 14
    //   43: astore 6
    //   45: aload 14
    //   47: invokevirtual 73	java/lang/String:length	()I
    //   50: sipush 10000
    //   53: if_icmple +24 -> 77
    //   56: aload 14
    //   58: aload 14
    //   60: invokevirtual 73	java/lang/String:length	()I
    //   63: sipush 10000
    //   66: isub
    //   67: aload 14
    //   69: invokevirtual 73	java/lang/String:length	()I
    //   72: invokevirtual 77	java/lang/String:substring	(II)Ljava/lang/String;
    //   75: astore 6
    //   77: aload 15
    //   79: astore 7
    //   81: aload 15
    //   83: ifnull +86 -> 169
    //   86: aload 15
    //   88: astore 7
    //   90: aload 15
    //   92: arraylength
    //   93: sipush 10000
    //   96: if_icmple +73 -> 169
    //   99: sipush 10000
    //   102: newarray <illegal type>
    //   104: astore 7
    //   106: aload 7
    //   108: arraylength
    //   109: iconst_1
    //   110: isub
    //   111: istore 18
    //   113: aload 15
    //   115: arraylength
    //   116: iconst_1
    //   117: isub
    //   118: istore 17
    //   120: iload 18
    //   122: iflt +47 -> 169
    //   125: iload 17
    //   127: iflt +42 -> 169
    //   130: aload 7
    //   132: iload 18
    //   134: aload 15
    //   136: iload 17
    //   138: baload
    //   139: bastore
    //   140: iload 18
    //   142: iconst_1
    //   143: isub
    //   144: istore 18
    //   146: iload 17
    //   148: iconst_1
    //   149: isub
    //   150: istore 17
    //   152: goto -32 -> 120
    //   155: astore 6
    //   157: aload 6
    //   159: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   162: aload 14
    //   164: astore 6
    //   166: goto -89 -> 77
    //   169: aload 16
    //   171: aload 6
    //   173: invokevirtual 83	com/tencent/feedback/eup/e:k	(Ljava/lang/String;)V
    //   176: aload 16
    //   178: aload 7
    //   180: invokevirtual 86	com/tencent/feedback/eup/e:b	([B)V
    //   183: aload 16
    //   185: aload 8
    //   187: invokevirtual 88	com/tencent/feedback/eup/e:c	(Ljava/lang/String;)V
    //   190: aload 10
    //   192: ifnull +14 -> 206
    //   195: aload 10
    //   197: invokevirtual 92	java/lang/String:trim	()Ljava/lang/String;
    //   200: invokevirtual 73	java/lang/String:length	()I
    //   203: ifne +393 -> 596
    //   206: ldc 94
    //   208: astore 6
    //   210: aload 16
    //   212: aload 6
    //   214: invokevirtual 96	com/tencent/feedback/eup/e:b	(Ljava/lang/String;)V
    //   217: aload 16
    //   219: aload 9
    //   221: invokevirtual 98	com/tencent/feedback/eup/e:a	(Ljava/lang/String;)V
    //   224: aload 11
    //   226: ifnull +18 -> 244
    //   229: aload 11
    //   231: astore 6
    //   233: aload 11
    //   235: invokevirtual 92	java/lang/String:trim	()Ljava/lang/String;
    //   238: invokevirtual 73	java/lang/String:length	()I
    //   241: ifne +7 -> 248
    //   244: ldc 100
    //   246: astore 6
    //   248: aload 16
    //   250: aload 6
    //   252: invokevirtual 103	com/tencent/feedback/eup/e:d	(Ljava/lang/String;)V
    //   255: aload 16
    //   257: ldc 104
    //   259: invokevirtual 107	com/tencent/feedback/eup/e:a	(F)V
    //   262: aload_0
    //   263: invokestatic 112	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   266: astore 6
    //   268: aload 16
    //   270: invokestatic 114	com/tencent/feedback/common/d:i	()J
    //   273: invokevirtual 116	com/tencent/feedback/eup/e:c	(J)V
    //   276: aload 16
    //   278: aload 6
    //   280: invokevirtual 118	com/tencent/feedback/common/d:k	()J
    //   283: invokevirtual 121	com/tencent/feedback/eup/e:e	(J)V
    //   286: aload 16
    //   288: invokestatic 124	com/tencent/feedback/common/d:g	()J
    //   291: invokevirtual 126	com/tencent/feedback/eup/e:d	(J)V
    //   294: aload 16
    //   296: invokestatic 129	com/tencent/feedback/common/d:n	()J
    //   299: invokevirtual 131	com/tencent/feedback/eup/e:i	(J)V
    //   302: aload 16
    //   304: invokestatic 134	com/tencent/feedback/common/d:o	()J
    //   307: invokevirtual 136	com/tencent/feedback/eup/e:j	(J)V
    //   310: ldc -118
    //   312: iconst_5
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload 16
    //   320: invokevirtual 140	com/tencent/feedback/eup/e:I	()J
    //   323: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: aload 16
    //   331: invokevirtual 143	com/tencent/feedback/eup/e:K	()J
    //   334: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   337: aastore
    //   338: dup
    //   339: iconst_2
    //   340: aload 16
    //   342: invokevirtual 146	com/tencent/feedback/eup/e:J	()J
    //   345: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   348: aastore
    //   349: dup
    //   350: iconst_3
    //   351: aload 16
    //   353: invokevirtual 149	com/tencent/feedback/eup/e:O	()J
    //   356: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   359: aastore
    //   360: dup
    //   361: iconst_4
    //   362: aload 16
    //   364: invokevirtual 152	com/tencent/feedback/eup/e:P	()J
    //   367: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   370: aastore
    //   371: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   374: aload_0
    //   375: invokestatic 157	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   378: astore_0
    //   379: aload 16
    //   381: aload_0
    //   382: invokevirtual 160	com/tencent/feedback/common/c:u	()J
    //   385: invokevirtual 163	com/tencent/feedback/eup/e:f	(J)V
    //   388: aload 16
    //   390: aload_0
    //   391: invokevirtual 166	com/tencent/feedback/common/c:t	()J
    //   394: invokevirtual 168	com/tencent/feedback/eup/e:g	(J)V
    //   397: aload 16
    //   399: aload_0
    //   400: invokevirtual 171	com/tencent/feedback/common/c:v	()J
    //   403: invokevirtual 174	com/tencent/feedback/eup/e:h	(J)V
    //   406: aload 16
    //   408: aload_0
    //   409: invokevirtual 176	com/tencent/feedback/common/c:B	()Ljava/lang/String;
    //   412: invokevirtual 179	com/tencent/feedback/eup/e:r	(Ljava/lang/String;)V
    //   415: aload 16
    //   417: aload_0
    //   418: invokevirtual 182	com/tencent/feedback/common/c:z	()Ljava/lang/String;
    //   421: invokevirtual 185	com/tencent/feedback/eup/e:s	(Ljava/lang/String;)V
    //   424: ldc -69
    //   426: iconst_5
    //   427: anewarray 4	java/lang/Object
    //   430: dup
    //   431: iconst_0
    //   432: aload 16
    //   434: invokevirtual 190	com/tencent/feedback/eup/e:L	()J
    //   437: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   440: aastore
    //   441: dup
    //   442: iconst_1
    //   443: aload 16
    //   445: invokevirtual 193	com/tencent/feedback/eup/e:M	()J
    //   448: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   451: aastore
    //   452: dup
    //   453: iconst_2
    //   454: aload 16
    //   456: invokevirtual 196	com/tencent/feedback/eup/e:N	()J
    //   459: invokestatic 47	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   462: aastore
    //   463: dup
    //   464: iconst_3
    //   465: aload 16
    //   467: invokevirtual 199	com/tencent/feedback/eup/e:Q	()Ljava/lang/String;
    //   470: aastore
    //   471: dup
    //   472: iconst_4
    //   473: aload 16
    //   475: invokevirtual 202	com/tencent/feedback/eup/e:R	()Ljava/lang/String;
    //   478: aastore
    //   479: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: aload 16
    //   484: aload_1
    //   485: invokevirtual 204	com/tencent/feedback/eup/e:e	(Ljava/lang/String;)V
    //   488: aload 16
    //   490: aload_2
    //   491: invokevirtual 207	com/tencent/feedback/eup/e:q	(Ljava/lang/String;)V
    //   494: aload 16
    //   496: aload 5
    //   498: invokevirtual 210	com/tencent/feedback/eup/e:a	(Ljava/util/Map;)V
    //   501: aload 16
    //   503: new 212	java/lang/StringBuilder
    //   506: dup
    //   507: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   510: invokestatic 217	com/tencent/feedback/proguard/a:c	()Ljava/lang/String;
    //   513: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: invokevirtual 227	com/tencent/feedback/eup/e:l	(Ljava/lang/String;)V
    //   522: aload 16
    //   524: new 212	java/lang/StringBuilder
    //   527: dup
    //   528: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   531: ldc -27
    //   533: invokestatic 232	com/tencent/feedback/proguard/a:b	(Ljava/lang/String;)Ljava/lang/String;
    //   536: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokevirtual 235	com/tencent/feedback/eup/e:m	(Ljava/lang/String;)V
    //   545: ldc -19
    //   547: iconst_1
    //   548: anewarray 4	java/lang/Object
    //   551: dup
    //   552: iconst_0
    //   553: aload 16
    //   555: invokevirtual 240	com/tencent/feedback/eup/e:x	()Ljava/lang/String;
    //   558: aastore
    //   559: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   562: ldc -14
    //   564: iconst_1
    //   565: anewarray 4	java/lang/Object
    //   568: dup
    //   569: iconst_0
    //   570: aload 16
    //   572: invokevirtual 245	com/tencent/feedback/eup/e:A	()Ljava/lang/String;
    //   575: aastore
    //   576: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   579: aload 16
    //   581: areturn
    //   582: astore 7
    //   584: aload 7
    //   586: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   589: aload 15
    //   591: astore 7
    //   593: goto -424 -> 169
    //   596: aload 10
    //   598: astore 6
    //   600: aload 10
    //   602: invokevirtual 73	java/lang/String:length	()I
    //   605: sipush 1000
    //   608: if_icmple -398 -> 210
    //   611: aload 10
    //   613: iconst_0
    //   614: sipush 1000
    //   617: invokevirtual 77	java/lang/String:substring	(II)Ljava/lang/String;
    //   620: astore 6
    //   622: goto -412 -> 210
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	625	0	paramContext	Context
    //   0	625	1	paramString1	String
    //   0	625	2	paramString2	String
    //   0	625	3	paramLong1	long
    //   0	625	5	paramMap	Map<String, com.tencent.feedback.common.PlugInInfo>
    //   0	625	6	paramString3	String
    //   0	625	7	paramString4	String
    //   0	625	8	paramString5	String
    //   0	625	9	paramString6	String
    //   0	625	10	paramString7	String
    //   0	625	11	paramString8	String
    //   0	625	12	paramLong2	long
    //   0	625	14	paramString9	String
    //   0	625	15	paramArrayOfByte	byte[]
    //   7	573	16	locale	e
    //   118	33	17	i	int
    //   111	34	18	j	int
    // Exception table:
    //   from	to	target	type
    //   56	77	155	java/lang/Throwable
    //   99	120	582	java/lang/Throwable
  }
  
  protected static l a(e parame)
  {
    if (parame == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        if (parame.b())
        {
          i = 1;
          l locall = new l(i, 0, parame.i(), com.tencent.feedback.proguard.a.a(parame));
          locall.b(parame.l());
          locall.a(parame.o());
          locall.a(parame.q());
          locall.a(parame.a());
          if (!parame.y()) {
            break label98;
          }
          i = 1;
          locall.c(i);
          return locall;
        }
      }
      catch (Throwable parame)
      {
        parame.printStackTrace();
        return null;
      }
      int i = 2;
      continue;
      label98:
      i = 0;
    }
  }
  
  protected static String a(Throwable paramThrowable, CrashStrategyBean paramCrashStrategyBean)
  {
    int i = 100;
    int j = 3;
    if (paramCrashStrategyBean != null)
    {
      j = Math.max(3, paramCrashStrategyBean.getMaxStackFrame());
      i = Math.max(100, paramCrashStrategyBean.getMaxStackLine());
      com.tencent.feedback.common.e.b("change frame:%d  line:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    }
    paramCrashStrategyBean = new ArrayList();
    a(paramCrashStrategyBean, paramThrowable, 0, j, i);
    if (paramCrashStrategyBean.size() > 0)
    {
      paramThrowable = new StringBuilder(paramCrashStrategyBean.size());
      paramCrashStrategyBean = paramCrashStrategyBean.iterator();
      while (paramCrashStrategyBean.hasNext()) {
        paramThrowable.append((String)paramCrashStrategyBean.next()).append("\n");
      }
      return paramThrowable.toString();
    }
    return "";
  }
  
  public static List<e> a(Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2, Boolean paramBoolean)
  {
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.queryEupRecent() start}", new Object[0]);
    if ((paramContext == null) || (paramInt1 == 0) || ((paramLong2 > 0L) && (paramLong1 > paramLong2)) || ((paramInt4 > 0) && (paramInt3 > paramInt4)))
    {
      com.tencent.feedback.common.e.c("rqdp{  context == null || limitNum == 0 || (timeEnd > 0 && timeStart > timeEnd) || (maxCount > 0 && miniCount > maxCount ,pls check}", new Object[0]);
      return null;
    }
    int i;
    if ("asc".equals(paramString1))
    {
      i = 1;
      paramString1 = null;
      if (paramInt2 != 2) {
        break label141;
      }
      paramString1 = new int[1];
      paramString1[0] = 2;
      label85:
      if (paramBoolean != null) {
        break label191;
      }
      paramInt2 = -1;
    }
    for (;;)
    {
      paramString1 = l.a(paramContext, paramString1, -1, i, -1L, paramInt1, paramString2, paramInt3, paramInt4, paramInt5, paramInt6, paramLong1, paramLong2, paramInt2);
      if ((paramString1 != null) && (paramString1.size() > 0)) {
        break label209;
      }
      return null;
      i = 2;
      break;
      label141:
      if (paramInt2 == 1)
      {
        paramString1 = new int[1];
        paramString1[0] = 1;
        break label85;
      }
      if (paramInt2 < 0)
      {
        paramString1 = new int[2];
        String tmp166_165 = paramString1;
        tmp166_165[0] = 1;
        String tmp170_166 = tmp166_165;
        tmp170_166[1] = 2;
        tmp170_166;
        break label85;
      }
      com.tencent.feedback.common.e.c("rqdp{  queryEupRecent() seletedRecordType unaccepted}", new Object[0]);
      break label85;
      label191:
      if (paramBoolean.booleanValue()) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
    }
    label209:
    paramString2 = new ArrayList();
    paramBoolean = paramString1.iterator();
    while (paramBoolean.hasNext())
    {
      l locall = (l)paramBoolean.next();
      try
      {
        Object localObject = com.tencent.feedback.proguard.a.b(locall.b());
        if ((localObject != null) && (e.class.isInstance(localObject)))
        {
          localObject = (e)e.class.cast(localObject);
          ((e)localObject).a(locall.a());
          paramString2.add(localObject);
          paramBoolean.remove();
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        com.tencent.feedback.common.e.d("rqdp{  query have error!}", new Object[0]);
      }
    }
    if (paramString1.size() > 0)
    {
      com.tencent.feedback.common.e.b("rqdp{  there are error datas ,should be remove }" + paramString1.size(), new Object[0]);
      paramBoolean = new Long[paramString1.size()];
      paramInt1 = 0;
      while (paramInt1 < paramString1.size())
      {
        paramBoolean[paramInt1] = Long.valueOf(((l)paramString1.get(paramInt1)).a());
        paramInt1 += 1;
      }
      l.a(paramContext, paramBoolean);
    }
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.queryEupRecent() end}", new Object[0]);
    return paramString2;
  }
  
  public static Map<String, String> a()
  {
    Object localObject = Thread.getAllStackTraces();
    HashMap localHashMap;
    if (localObject != null)
    {
      localHashMap = new HashMap();
      StringBuilder localStringBuilder = new StringBuilder();
      try
      {
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          localStringBuilder.setLength(0);
          StackTraceElement[] arrayOfStackTraceElement = (StackTraceElement[])localEntry.getValue();
          int j = arrayOfStackTraceElement.length;
          int i = 0;
          while (i < j)
          {
            localStringBuilder.append(arrayOfStackTraceElement[i].toString()).append("\n");
            i += 1;
          }
          localHashMap.put(((Thread)localEntry.getKey()).getName(), localStringBuilder.toString());
        }
        return localHashMap;
      }
      catch (Throwable localThrowable)
      {
        com.tencent.feedback.common.e.d("add all thread error", new Object[0]);
        localThrowable.printStackTrace();
      }
    }
    return null;
  }
  
  private static void a(ArrayList<String> paramArrayList, Throwable paramThrowable, int paramInt1, int paramInt2, int paramInt3)
  {
    for (;;)
    {
      if ((paramArrayList == null) || (paramThrowable == null) || (paramInt1 > paramInt2) || (paramArrayList.size() > paramInt3)) {}
      int i;
      do
      {
        return;
        i = paramInt1 + 1;
        StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
        if (arrayOfStackTraceElement != null)
        {
          int j = arrayOfStackTraceElement.length;
          paramInt1 = 0;
          while (paramInt1 < j)
          {
            paramArrayList.add(arrayOfStackTraceElement[paramInt1].toString());
            paramInt1 += 1;
          }
        }
      } while (paramThrowable.getCause() == null);
      paramArrayList.add("cause by:");
      paramArrayList.add(paramThrowable.getCause().getClass().getName() + ": " + paramThrowable.getCause().getMessage());
      paramThrowable = paramThrowable.getCause();
      paramInt1 = i;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    if (com.tencent.feedback.proguard.a.b() < 0L)
    {
      com.tencent.feedback.common.e.e("rqdp{  today fail?}", new Object[0]);
      new Date().getTime();
    }
    paramContext = g.a(paramContext).a(paramContext, 1);
    return (paramContext != null) && (paramContext.size() > 0);
  }
  
  public static boolean a(Context paramContext, e parame)
  {
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.insertEUP() start}", new Object[0]);
    if ((paramContext == null) || (parame == null))
    {
      com.tencent.feedback.common.e.c("rqdp{  EUPDAO.insertEUP() have null args}", new Object[0]);
      return false;
    }
    try
    {
      l locall = a(parame);
      if ((paramContext == null) || (locall == null)) {
        com.tencent.feedback.common.e.a("rqdp{  AnalyticsDAO.insert() have null args}", new Object[0]);
      }
      ArrayList localArrayList;
      for (boolean bool = false; bool; bool = l.a(paramContext, localArrayList))
      {
        parame.a(locall.a());
        return true;
        localArrayList = new ArrayList();
        localArrayList.add(locall);
      }
      return false;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      com.tencent.feedback.common.e.d("rqdp{  insert fail!}", new Object[0]);
      return false;
    }
    finally
    {
      com.tencent.feedback.common.e.b("rqdp{  EUPDAO.insertEUP() end}", new Object[0]);
    }
  }
  
  protected static boolean a(Context paramContext, e parame, CrashStrategyBean paramCrashStrategyBean)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramCrashStrategyBean != null)
    {
      bool1 = bool2;
      if (paramCrashStrategyBean.isStoreCrashSdcard())
      {
        Object localObject;
        try
        {
          com.tencent.feedback.common.e.b("save eup logs", new Object[0]);
          localObject = c.a(paramContext);
          String str1 = ((c)localObject).c();
          String str2 = ((c)localObject).B();
          String str3 = parame.s();
          Locale localLocale = Locale.US;
          String str4 = ((c)localObject).e();
          localObject = new Date(parame.i());
          if (localObject == null) {}
          for (localObject = null;; localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format((Date)localObject))
          {
            localObject = String.format(localLocale, "#--------\npackage:%s\nversion:%s\nsdk:%s\nprocess:%s\ndate:%s\ntype:%s\nmessage:%s\nstack:\n%s\neupID:%s\n", new Object[] { str1, str2, str4, str3, localObject, parame.e(), parame.f(), parame.h(), parame.x() });
            if (paramCrashStrategyBean.getStoreDirectoryPath() != null) {
              break label317;
            }
            if (com.tencent.feedback.common.a.f(paramContext)) {
              break;
            }
            return false;
          }
          int i = paramCrashStrategyBean.getCrashSdcardMaxSize();
          com.tencent.feedback.common.e.b("rqdp{  sv sd start}", new Object[0]);
          if ((localObject == null) || (((String)localObject).trim().length() <= 0)) {
            break label371;
          }
          if (Environment.getExternalStorageState().equals("mounted")) {
            com.tencent.feedback.proguard.a.a(new File(Environment.getExternalStorageDirectory(), "/Tencent/" + com.tencent.feedback.common.a.b(paramContext) + "/euplog.txt").getAbsolutePath(), (String)localObject, i);
          }
          com.tencent.feedback.common.e.b("rqdp{  sv sd end}", new Object[0]);
        }
        catch (Throwable paramContext)
        {
          com.tencent.feedback.common.e.c("rqdp{  save error} %s", new Object[] { paramContext.toString() });
          paramContext.printStackTrace();
          return false;
        }
        label317:
        parame = new File(paramCrashStrategyBean.getStoreDirectoryPath());
        paramContext = parame;
        if (!parame.isFile()) {
          paramContext = parame.getParentFile();
        }
        com.tencent.feedback.proguard.a.a(new File(paramContext, "euplog.txt").getAbsolutePath(), (String)localObject, paramCrashStrategyBean.getCrashSdcardMaxSize());
        bool1 = true;
      }
    }
    return bool1;
    label371:
    return true;
  }
  
  public static int b(Context paramContext)
  {
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.querySum() start}", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.feedback.common.e.c("rqdp{  querySum() context is null arg}", new Object[0]);
      return -1;
    }
    return l.a(paramContext, new int[] { 2, 1 }, -1L, Long.MAX_VALUE, null);
  }
  
  /* Error */
  public static boolean b(Context paramContext, List<e> paramList)
  {
    // Byte code:
    //   0: ldc_w 601
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +16 -> 27
    //   14: aload_1
    //   15: ifnull +12 -> 27
    //   18: aload_1
    //   19: invokeinterface 32 1 0
    //   24: ifgt +15 -> 39
    //   27: ldc_w 603
    //   30: iconst_0
    //   31: anewarray 4	java/lang/Object
    //   34: invokestatic 26	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: iconst_0
    //   38: ireturn
    //   39: new 303	java/util/ArrayList
    //   42: dup
    //   43: invokespecial 304	java/util/ArrayList:<init>	()V
    //   46: astore_2
    //   47: aload_1
    //   48: invokeinterface 352 1 0
    //   53: astore_1
    //   54: aload_1
    //   55: invokeinterface 320 1 0
    //   60: ifeq +56 -> 116
    //   63: aload_1
    //   64: invokeinterface 324 1 0
    //   69: checkcast 40	com/tencent/feedback/eup/e
    //   72: invokestatic 483	com/tencent/feedback/eup/b:a	(Lcom/tencent/feedback/eup/e;)Lcom/tencent/feedback/proguard/l;
    //   75: astore_3
    //   76: aload_3
    //   77: ifnull -23 -> 54
    //   80: aload_2
    //   81: aload_3
    //   82: invokevirtual 373	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   85: pop
    //   86: goto -32 -> 54
    //   89: astore_0
    //   90: aload_0
    //   91: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   94: ldc_w 494
    //   97: iconst_0
    //   98: anewarray 4	java/lang/Object
    //   101: invokestatic 380	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: ldc_w 605
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: iconst_0
    //   115: ireturn
    //   116: aload_0
    //   117: aload_2
    //   118: invokestatic 607	com/tencent/feedback/proguard/l:b	(Landroid/content/Context;Ljava/util/List;)Z
    //   121: istore 4
    //   123: ldc_w 605
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: iload 4
    //   135: ireturn
    //   136: astore_0
    //   137: ldc_w 605
    //   140: iconst_0
    //   141: anewarray 4	java/lang/Object
    //   144: invokestatic 21	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_0
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	paramContext	Context
    //   0	149	1	paramList	List<e>
    //   46	72	2	localArrayList	ArrayList
    //   75	7	3	locall	l
    //   121	13	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   39	54	89	java/lang/Throwable
    //   54	76	89	java/lang/Throwable
    //   80	86	89	java/lang/Throwable
    //   116	123	89	java/lang/Throwable
    //   39	54	136	finally
    //   54	76	136	finally
    //   80	86	136	finally
    //   90	104	136	finally
    //   116	123	136	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */