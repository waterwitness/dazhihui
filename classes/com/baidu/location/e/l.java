package com.baidu.location.e;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Environment;
import android.os.Handler;
import com.baidu.location.b.b;
import com.baidu.location.h.g;
import com.baidu.location.h.p;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class l
{
  public static String f = "0";
  private static l j = null;
  private m A = null;
  private boolean B = false;
  private boolean C = false;
  private int D = 0;
  private float E = 0.0F;
  private float F = 0.0F;
  private long G = 0L;
  private int H = 500;
  private Handler I = null;
  private byte[] J = new byte[4];
  private byte[] K = null;
  private int L = 0;
  private List M = null;
  private boolean N = false;
  long a = 0L;
  Location b = null;
  Location c = null;
  StringBuilder d = null;
  long e = 0L;
  int g = 0;
  double h = 116.22345545D;
  double i = 40.245667323D;
  private int k = 1;
  private double l = 0.699999988079071D;
  private String m = "3G|4G";
  private int n = 1;
  private int o = 307200;
  private int p = 15;
  private int q = 1;
  private double r = 3.5D;
  private double s = 3.0D;
  private double t = 0.5D;
  private int u = 300;
  private int v = 60;
  private int w = 0;
  private int x = 60;
  private int y = 0;
  private long z = 0L;
  
  public static l a()
  {
    if (j == null) {
      j = new l();
    }
    return j;
  }
  
  /* Error */
  private String a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: invokestatic 175	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   3: invokevirtual 179	java/util/UUID:toString	()Ljava/lang/String;
    //   6: astore_3
    //   7: new 181	java/net/URL
    //   10: dup
    //   11: aload_2
    //   12: invokespecial 184	java/net/URL:<init>	(Ljava/lang/String;)V
    //   15: invokevirtual 188	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: checkcast 190	java/net/HttpURLConnection
    //   21: astore_2
    //   22: aload_2
    //   23: sipush 10000
    //   26: invokevirtual 194	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   29: aload_2
    //   30: sipush 10000
    //   33: invokevirtual 197	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   36: aload_2
    //   37: iconst_1
    //   38: invokevirtual 201	java/net/HttpURLConnection:setDoInput	(Z)V
    //   41: aload_2
    //   42: iconst_1
    //   43: invokevirtual 204	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   46: aload_2
    //   47: iconst_0
    //   48: invokevirtual 207	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   51: aload_2
    //   52: ldc -47
    //   54: invokevirtual 212	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   57: aload_2
    //   58: ldc -42
    //   60: ldc -40
    //   62: invokevirtual 220	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: aload_2
    //   66: ldc -34
    //   68: ldc -32
    //   70: invokevirtual 220	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_2
    //   74: ldc -30
    //   76: new 228	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 229	java/lang/StringBuilder:<init>	()V
    //   83: ldc -25
    //   85: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc -19
    //   90: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_3
    //   94: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokevirtual 220	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_1
    //   104: ifnull +196 -> 300
    //   107: aload_1
    //   108: invokevirtual 244	java/io/File:exists	()Z
    //   111: ifeq +189 -> 300
    //   114: aload_2
    //   115: invokevirtual 248	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   118: astore 4
    //   120: new 250	java/io/DataOutputStream
    //   123: dup
    //   124: aload 4
    //   126: invokespecial 253	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   129: astore 5
    //   131: new 255	java/lang/StringBuffer
    //   134: dup
    //   135: invokespecial 256	java/lang/StringBuffer:<init>	()V
    //   138: astore 6
    //   140: aload 6
    //   142: ldc_w 258
    //   145: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   148: pop
    //   149: aload 6
    //   151: aload_3
    //   152: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   155: pop
    //   156: aload 6
    //   158: ldc_w 263
    //   161: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   164: pop
    //   165: aload 6
    //   167: new 228	java/lang/StringBuilder
    //   170: dup
    //   171: invokespecial 229	java/lang/StringBuilder:<init>	()V
    //   174: ldc_w 265
    //   177: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: aload_1
    //   181: invokevirtual 268	java/io/File:getName	()Ljava/lang/String;
    //   184: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: ldc_w 270
    //   190: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: ldc_w 263
    //   196: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   205: pop
    //   206: aload 6
    //   208: new 228	java/lang/StringBuilder
    //   211: dup
    //   212: invokespecial 229	java/lang/StringBuilder:<init>	()V
    //   215: ldc_w 272
    //   218: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: ldc_w 263
    //   224: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   233: pop
    //   234: aload 6
    //   236: ldc_w 263
    //   239: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   242: pop
    //   243: aload 5
    //   245: aload 6
    //   247: invokevirtual 273	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   250: invokevirtual 279	java/lang/String:getBytes	()[B
    //   253: invokevirtual 283	java/io/DataOutputStream:write	([B)V
    //   256: new 285	java/io/FileInputStream
    //   259: dup
    //   260: aload_1
    //   261: invokespecial 288	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   264: astore_1
    //   265: sipush 1024
    //   268: newarray <illegal type>
    //   270: astore 6
    //   272: aload_1
    //   273: aload 6
    //   275: invokevirtual 294	java/io/InputStream:read	([B)I
    //   278: istore 7
    //   280: iload 7
    //   282: iconst_m1
    //   283: if_icmpeq +20 -> 303
    //   286: aload 5
    //   288: aload 6
    //   290: iconst_0
    //   291: iload 7
    //   293: invokevirtual 297	java/io/DataOutputStream:write	([BII)V
    //   296: goto -24 -> 272
    //   299: astore_1
    //   300: ldc 59
    //   302: areturn
    //   303: aload_1
    //   304: invokevirtual 300	java/io/InputStream:close	()V
    //   307: aload 5
    //   309: ldc_w 263
    //   312: invokevirtual 279	java/lang/String:getBytes	()[B
    //   315: invokevirtual 283	java/io/DataOutputStream:write	([B)V
    //   318: aload 5
    //   320: new 228	java/lang/StringBuilder
    //   323: dup
    //   324: invokespecial 229	java/lang/StringBuilder:<init>	()V
    //   327: ldc_w 258
    //   330: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: aload_3
    //   334: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: ldc_w 258
    //   340: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: ldc_w 263
    //   346: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: invokevirtual 279	java/lang/String:getBytes	()[B
    //   355: invokevirtual 283	java/io/DataOutputStream:write	([B)V
    //   358: aload 5
    //   360: invokevirtual 303	java/io/DataOutputStream:flush	()V
    //   363: aload_2
    //   364: invokevirtual 307	java/net/HttpURLConnection:getResponseCode	()I
    //   367: istore 7
    //   369: aload 4
    //   371: invokevirtual 310	java/io/OutputStream:close	()V
    //   374: aload_0
    //   375: aload_0
    //   376: getfield 106	com/baidu/location/e/l:y	I
    //   379: sipush 400
    //   382: iadd
    //   383: putfield 106	com/baidu/location/e/l:y	I
    //   386: aload_0
    //   387: aload_0
    //   388: getfield 106	com/baidu/location/e/l:y	I
    //   391: invokespecial 312	com/baidu/location/e/l:c	(I)V
    //   394: iload 7
    //   396: sipush 200
    //   399: if_icmpne -99 -> 300
    //   402: ldc_w 314
    //   405: areturn
    //   406: astore_1
    //   407: goto -107 -> 300
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	410	0	this	l
    //   0	410	1	paramFile	File
    //   0	410	2	paramString	String
    //   6	328	3	str	String
    //   118	252	4	localOutputStream	java.io.OutputStream
    //   129	230	5	localDataOutputStream	java.io.DataOutputStream
    //   138	151	6	localObject	Object
    //   278	122	7	i1	int
    // Exception table:
    //   from	to	target	type
    //   7	103	299	java/net/MalformedURLException
    //   107	272	299	java/net/MalformedURLException
    //   272	280	299	java/net/MalformedURLException
    //   286	296	299	java/net/MalformedURLException
    //   303	394	299	java/net/MalformedURLException
    //   7	103	406	java/io/IOException
    //   107	272	406	java/io/IOException
    //   272	280	406	java/io/IOException
    //   286	296	406	java/io/IOException
    //   303	394	406	java/io/IOException
  }
  
  private boolean a(String paramString, Context paramContext)
  {
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = bool4;
    label127:
    for (;;)
    {
      try
      {
        paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
        if (paramContext != null)
        {
          bool2 = bool4;
          paramContext = paramContext.iterator();
          bool2 = bool1;
          bool3 = bool1;
          if (paramContext.hasNext())
          {
            bool2 = bool1;
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
            bool2 = bool1;
            if (!localRunningAppProcessInfo.processName.equals(paramString)) {
              break label127;
            }
            bool2 = bool1;
            int i1 = localRunningAppProcessInfo.importance;
            if ((i1 != 200) && (i1 != 100)) {
              break label127;
            }
            bool1 = true;
            continue;
          }
        }
        return bool3;
      }
      catch (Exception paramString)
      {
        bool3 = bool2;
      }
    }
  }
  
  private byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt & 0xFF), (byte)((0xFF00 & paramInt) >> 8), (byte)((0xFF0000 & paramInt) >> 16), (byte)((0xFF000000 & paramInt) >> 24) };
  }
  
  private byte[] a(String paramString)
  {
    int i4 = 0;
    if (paramString == null) {
      return null;
    }
    paramString = paramString.getBytes();
    int i1 = (byte)new Random().nextInt(255);
    int i2 = (byte)new Random().nextInt(255);
    byte[] arrayOfByte = new byte[paramString.length + 2];
    int i5 = paramString.length;
    int i3 = 0;
    while (i4 < i5)
    {
      arrayOfByte[i3] = ((byte)(paramString[i4] ^ i1));
      i4 += 1;
      i3 += 1;
    }
    i4 = i3 + 1;
    arrayOfByte[i3] = i1;
    arrayOfByte[i4] = i2;
    return arrayOfByte;
  }
  
  private String b(String paramString)
  {
    Calendar localCalendar = Calendar.getInstance();
    return String.format(paramString, new Object[] { Integer.valueOf(localCalendar.get(1)), Integer.valueOf(localCalendar.get(2) + 1), Integer.valueOf(localCalendar.get(5)) });
  }
  
  private void b(int paramInt)
  {
    byte[] arrayOfByte = a(paramInt);
    paramInt = 0;
    while (paramInt < 4)
    {
      this.M.add(Byte.valueOf(arrayOfByte[paramInt]));
      paramInt += 1;
    }
  }
  
  private void b(Location paramLocation)
  {
    c(paramLocation);
    g();
  }
  
  private void c()
  {
    if (this.N) {
      return;
    }
    this.N = true;
    d(b.c);
    i();
    d();
  }
  
  private void c(int paramInt)
  {
    if (paramInt == 0) {}
    for (;;)
    {
      return;
      Object localObject1 = com.baidu.location.b.e.a + "/grtcf.dat";
      try
      {
        localObject1 = new File((String)localObject1);
        Object localObject2;
        if (!((File)localObject1).exists())
        {
          localObject2 = new File(com.baidu.location.b.e.a);
          if (!((File)localObject2).exists()) {
            ((File)localObject2).mkdirs();
          }
          if (((File)localObject1).createNewFile())
          {
            localObject2 = new RandomAccessFile((File)localObject1, "rw");
            ((RandomAccessFile)localObject2).seek(2L);
            ((RandomAccessFile)localObject2).writeInt(0);
            ((RandomAccessFile)localObject2).seek(8L);
            byte[] arrayOfByte = "1980_01_01:0".getBytes();
            ((RandomAccessFile)localObject2).writeInt(arrayOfByte.length);
            ((RandomAccessFile)localObject2).write(arrayOfByte);
            ((RandomAccessFile)localObject2).seek(200L);
            ((RandomAccessFile)localObject2).writeBoolean(false);
            ((RandomAccessFile)localObject2).seek(800L);
            ((RandomAccessFile)localObject2).writeBoolean(false);
            ((RandomAccessFile)localObject2).close();
          }
        }
        else
        {
          localObject1 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject1).seek(8L);
          localObject2 = (b("%d_%02d_%02d") + ":" + paramInt).getBytes();
          ((RandomAccessFile)localObject1).writeInt(localObject2.length);
          ((RandomAccessFile)localObject1).write((byte[])localObject2);
          ((RandomAccessFile)localObject1).close();
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  private void c(Location paramLocation)
  {
    if ((System.currentTimeMillis() - this.a < this.H) || (paramLocation == null)) {
      return;
    }
    if ((paramLocation != null) && (paramLocation.hasSpeed()) && (paramLocation.getSpeed() > this.E)) {
      this.E = paramLocation.getSpeed();
    }
    try
    {
      if (this.M == null)
      {
        this.M = new ArrayList();
        h();
        d(paramLocation);
      }
      for (;;)
      {
        this.L += 1;
        return;
        e(paramLocation);
      }
    }
    catch (Exception paramLocation)
    {
      for (;;) {}
    }
  }
  
  private void c(String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = new JSONObject(paramString);
      if (paramString.has("on")) {
        this.k = paramString.getInt("on");
      }
      if (paramString.has("bash")) {
        this.l = paramString.getDouble("bash");
      }
      if (paramString.has("net")) {
        this.m = paramString.getString("net");
      }
      if (paramString.has("tcon")) {
        this.n = paramString.getInt("tcon");
      }
      if (paramString.has("tcsh")) {
        this.o = paramString.getInt("tcsh");
      }
      if (paramString.has("per")) {
        this.p = paramString.getInt("per");
      }
      if (paramString.has("chdron")) {
        this.q = paramString.getInt("chdron");
      }
      if (paramString.has("spsh")) {
        this.r = paramString.getDouble("spsh");
      }
      if (paramString.has("acsh")) {
        this.s = paramString.getDouble("acsh");
      }
      if (paramString.has("stspsh")) {
        this.t = paramString.getDouble("stspsh");
      }
      if (paramString.has("drstsh")) {
        this.u = paramString.getInt("drstsh");
      }
      if (paramString.has("stper")) {
        this.v = paramString.getInt("stper");
      }
      if (paramString.has("nondron")) {
        this.w = paramString.getInt("nondron");
      }
      if (paramString.has("nondrper")) {
        this.x = paramString.getInt("nondrper");
      }
      if (paramString.has("uptime")) {
        this.z = paramString.getLong("uptime");
      }
      j();
      return;
    }
    catch (JSONException paramString) {}
  }
  
  private void d()
  {
    Object localObject = null;
    if (0 == 0) {
      localObject = "6.1.2";
    }
    localObject = ((String)localObject).split("\\.");
    int i2 = localObject.length;
    this.J[0] = 0;
    this.J[1] = 0;
    this.J[2] = 0;
    this.J[3] = 0;
    int i1 = i2;
    if (i2 >= 4) {
      i1 = 4;
    }
    i2 = 0;
    while (i2 < i1) {
      try
      {
        this.J[i2] = ((byte)(Integer.valueOf(localObject[i2]).intValue() & 0xFF));
        i2 += 1;
      }
      catch (Exception localException) {}
    }
    this.K = a(b.c + ":" + b.a().b);
  }
  
  private void d(Location paramLocation)
  {
    int i2 = 0;
    this.e = System.currentTimeMillis();
    b((int)(this.e / 1000L));
    b((int)(paramLocation.getLongitude() * 1000000.0D));
    b((int)(paramLocation.getLatitude() * 1000000.0D));
    int i1;
    if (paramLocation.hasBearing())
    {
      i1 = 0;
      if (!paramLocation.hasSpeed()) {
        break label115;
      }
      label65:
      if (i1 <= 0) {
        break label121;
      }
      this.M.add(Byte.valueOf((byte)32));
      label84:
      if (i2 <= 0) {
        break label157;
      }
      this.M.add(Byte.valueOf((byte)Byte.MIN_VALUE));
    }
    for (;;)
    {
      this.b = paramLocation;
      return;
      i1 = 1;
      break;
      label115:
      i2 = 1;
      break label65;
      label121:
      byte b1 = (byte)((byte)((int)(paramLocation.getBearing() / 15.0F) & 0xFF) & 0xFFFFFFDF);
      this.M.add(Byte.valueOf(b1));
      break label84;
      label157:
      b1 = (byte)((byte)((int)(paramLocation.getSpeed() * 3.6D / 4.0D) & 0xFF) & 0x7F);
      this.M.add(Byte.valueOf(b1));
    }
  }
  
  private void d(String paramString)
  {
    i2 = 1;
    Object localObject1 = com.baidu.location.b.e.a + "/grtcf.dat";
    for (;;)
    {
      try
      {
        localObject1 = new File((String)localObject1);
        if (((File)localObject1).exists())
        {
          localObject1 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject1).seek(2L);
          i3 = ((RandomAccessFile)localObject1).readInt();
          ((RandomAccessFile)localObject1).seek(8L);
          i1 = ((RandomAccessFile)localObject1).readInt();
          localObject2 = new byte[i1];
          ((RandomAccessFile)localObject1).read((byte[])localObject2, 0, i1);
          localObject2 = new String((byte[])localObject2);
          i1 = i2;
          if (((String)localObject2).contains(b("%d_%02d_%02d")))
          {
            boolean bool = ((String)localObject2).contains(":");
            i1 = i2;
            if (!bool) {}
          }
        }
      }
      catch (Exception paramString)
      {
        int i3;
        Object localObject2;
        long l1;
        return;
      }
      try
      {
        localObject2 = ((String)localObject2).split(":");
        i1 = i2;
        if (localObject2.length > 1)
        {
          this.y = Integer.valueOf(localObject2[1]).intValue();
          i1 = i2;
        }
      }
      catch (Exception localException)
      {
        i1 = i2;
        continue;
      }
      if (i1 <= i3)
      {
        l1 = i1 * 2048;
        ((RandomAccessFile)localObject1).seek(l1);
        i2 = ((RandomAccessFile)localObject1).readInt();
        localObject2 = new byte[i2];
        ((RandomAccessFile)localObject1).read((byte[])localObject2, 0, i2);
        localObject2 = new String((byte[])localObject2);
        if ((paramString != null) && (((String)localObject2).contains(paramString))) {
          c((String)localObject2);
        }
      }
      else
      {
        ((RandomAccessFile)localObject1).close();
        return;
      }
      i1 += 1;
    }
  }
  
  private void e(Location paramLocation)
  {
    int i4 = (int)((paramLocation.getLongitude() - this.b.getLongitude()) * 100000.0D);
    int i5 = (int)((paramLocation.getLatitude() - this.b.getLatitude()) * 100000.0D);
    int i1;
    int i2;
    label58:
    int i3;
    label66:
    label81:
    byte b2;
    if (paramLocation.hasBearing())
    {
      i1 = 0;
      if (!paramLocation.hasSpeed()) {
        break label384;
      }
      i2 = 0;
      if (i4 <= 0) {
        break label390;
      }
      i3 = 0;
      int i6 = Math.abs(i4);
      if (i5 <= 0) {
        break label396;
      }
      i4 = 0;
      i5 = Math.abs(i5);
      if (this.L > 1)
      {
        this.c = null;
        this.c = this.b;
      }
      this.b = paramLocation;
      if ((this.b != null) && (this.c != null) && (this.b.getTime() > this.c.getTime()) && (this.b.getTime() - this.c.getTime() < 5000L))
      {
        long l1 = this.b.getTime() - this.c.getTime();
        float[] arrayOfFloat = new float[2];
        Location.distanceBetween(this.b.getAltitude(), this.b.getLongitude(), this.c.getLatitude(), this.c.getLongitude(), arrayOfFloat);
        double d1 = 2.0F * (arrayOfFloat[0] - this.c.getSpeed() * (float)l1) / (float)(l1 * l1);
        if (d1 > this.F) {
          this.F = ((float)d1);
        }
      }
      this.M.add(Byte.valueOf((byte)(i6 & 0xFF)));
      this.M.add(Byte.valueOf((byte)(i5 & 0xFF)));
      if (i1 <= 0) {
        break label402;
      }
      b1 = 32;
      if (i4 > 0) {
        b1 = (byte)96;
      }
      b2 = b1;
      if (i3 > 0) {
        b2 = (byte)(b1 | 0xFFFFFF80);
      }
      this.M.add(Byte.valueOf(b2));
    }
    for (;;)
    {
      if (i2 <= 0) {
        break label474;
      }
      this.M.add(Byte.valueOf((byte)Byte.MIN_VALUE));
      return;
      i1 = 1;
      break;
      label384:
      i2 = 1;
      break label58;
      label390:
      i3 = 1;
      break label66;
      label396:
      i4 = 1;
      break label81;
      label402:
      b2 = (byte)((byte)((int)(paramLocation.getBearing() / 15.0F) & 0xFF) & 0x1F);
      b1 = b2;
      if (i4 > 0) {
        b1 = (byte)(b2 | 0x40);
      }
      b2 = b1;
      if (i3 > 0) {
        b2 = (byte)(b1 | 0xFFFFFF80);
      }
      this.M.add(Byte.valueOf(b2));
    }
    label474:
    byte b1 = (byte)((byte)((int)(paramLocation.getSpeed() * 3.6D / 4.0D) & 0xFF) & 0x7F);
    this.M.add(Byte.valueOf(b1));
  }
  
  private void e(String paramString)
  {
    Object localObject1 = com.baidu.location.b.e.a + "/grtcf.dat";
    try
    {
      localObject1 = new File((String)localObject1);
      Object localObject2;
      int i2;
      int i1;
      if (!((File)localObject1).exists())
      {
        localObject2 = new File(com.baidu.location.b.e.a);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        if (((File)localObject1).createNewFile())
        {
          localObject2 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject2).seek(2L);
          ((RandomAccessFile)localObject2).writeInt(0);
          ((RandomAccessFile)localObject2).seek(8L);
          byte[] arrayOfByte = "1980_01_01:0".getBytes();
          ((RandomAccessFile)localObject2).writeInt(arrayOfByte.length);
          ((RandomAccessFile)localObject2).write(arrayOfByte);
          ((RandomAccessFile)localObject2).seek(200L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).seek(800L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).close();
        }
      }
      else
      {
        localObject1 = new RandomAccessFile((File)localObject1, "rw");
        ((RandomAccessFile)localObject1).seek(2L);
        i2 = ((RandomAccessFile)localObject1).readInt();
        i1 = 1;
      }
      for (;;)
      {
        if (i1 <= i2)
        {
          ((RandomAccessFile)localObject1).seek(i1 * 2048);
          int i3 = ((RandomAccessFile)localObject1).readInt();
          localObject2 = new byte[i3];
          ((RandomAccessFile)localObject1).read((byte[])localObject2, 0, i3);
          if (!new String((byte[])localObject2).contains(b.c)) {}
        }
        else
        {
          if (i1 >= i2)
          {
            ((RandomAccessFile)localObject1).seek(2L);
            ((RandomAccessFile)localObject1).writeInt(i1);
          }
          ((RandomAccessFile)localObject1).seek(i1 * 2048);
          paramString = paramString.getBytes();
          ((RandomAccessFile)localObject1).writeInt(paramString.length);
          ((RandomAccessFile)localObject1).write(paramString);
          ((RandomAccessFile)localObject1).close();
          return;
        }
        i1 += 1;
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private boolean e()
  {
    if (this.B) {
      if (this.C) {
        if (this.E < this.t)
        {
          this.D += this.p;
          if ((this.D > this.u) && (System.currentTimeMillis() - this.G <= this.v * 1000)) {
            break label186;
          }
        }
      }
    }
    do
    {
      do
      {
        return true;
        this.D = 0;
        this.C = false;
        return true;
      } while (this.E >= this.t);
      this.C = true;
      this.D = 0;
      this.D += this.p;
      return true;
      if ((this.E >= this.r) || (this.F >= this.s))
      {
        this.B = true;
        return true;
      }
    } while ((this.w == 1) && (System.currentTimeMillis() - this.G > this.x * 1000));
    label186:
    return false;
  }
  
  private void f()
  {
    this.M = null;
    this.e = 0L;
    this.L = 0;
    this.b = null;
    this.c = null;
    this.E = 0.0F;
    this.F = 0.0F;
  }
  
  private void g()
  {
    if ((this.e == 0L) || (System.currentTimeMillis() - this.e < this.p * 1000)) {}
    do
    {
      return;
      if (com.baidu.location.f.b().getSharedPreferences("loc_navi_mode", 4).getBoolean("is_navi_on", false))
      {
        f();
        return;
      }
      if ((this.n == 1) && (!e()))
      {
        f();
        return;
      }
      if (!a(b.c, com.baidu.location.f.b()))
      {
        f();
        return;
      }
    } while (this.M == null);
    int i2 = this.M.size();
    this.M.set(0, Byte.valueOf((byte)(i2 & 0xFF)));
    this.M.set(1, Byte.valueOf((byte)((0xFF00 & i2) >> 8)));
    this.M.set(3, Byte.valueOf((byte)(this.L & 0xFF)));
    byte[] arrayOfByte = new byte[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      arrayOfByte[i1] = ((Byte)this.M.get(i1)).byteValue();
      i1 += 1;
    }
    Object localObject;
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      localObject = new File(Environment.getExternalStorageDirectory(), "baidu/tempdata");
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      if (((File)localObject).exists())
      {
        localObject = new File((File)localObject, "intime.dat");
        if (((File)localObject).exists()) {
          ((File)localObject).delete();
        }
      }
    }
    try
    {
      localObject = new BufferedOutputStream(new FileOutputStream((File)localObject));
      ((BufferedOutputStream)localObject).write(arrayOfByte);
      ((BufferedOutputStream)localObject).flush();
      ((BufferedOutputStream)localObject).close();
      new aj(this).start();
      f();
      this.G = System.currentTimeMillis();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void h()
  {
    int i1 = 0;
    this.M.add(Byte.valueOf((byte)0));
    this.M.add(Byte.valueOf((byte)0));
    if (f.equals("0")) {
      this.M.add(Byte.valueOf((byte)110));
    }
    for (;;)
    {
      this.M.add(Byte.valueOf((byte)0));
      this.M.add(Byte.valueOf(this.J[0]));
      this.M.add(Byte.valueOf(this.J[1]));
      this.M.add(Byte.valueOf(this.J[2]));
      this.M.add(Byte.valueOf(this.J[3]));
      int i2 = this.K.length;
      this.M.add(Byte.valueOf((byte)(i2 + 1 & 0xFF)));
      while (i1 < i2)
      {
        this.M.add(Byte.valueOf(this.K[i1]));
        i1 += 1;
      }
      this.M.add(Byte.valueOf((byte)126));
    }
  }
  
  private void i()
  {
    if (System.currentTimeMillis() - this.z > 86400000L)
    {
      if (this.A == null) {
        this.A = new m(this);
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(b.a().a(false));
      localStringBuffer.append(f.a().c());
      this.A.a(localStringBuffer.toString());
    }
    j();
  }
  
  private void j() {}
  
  public void a(Location paramLocation)
  {
    if (!this.N) {
      c();
    }
    if ((this.k != 1) || (e.a().f() >= this.l * 100.0D) || (!this.m.contains(g.a(g.a().e()))) || ((this.n == 1) && (this.y > this.o))) {
      return;
    }
    this.I.post(new ai(this, paramLocation));
  }
  
  public void b()
  {
    if (!this.N) {
      return;
    }
    this.N = false;
    f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */