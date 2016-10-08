package com.f.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.URL;

class bv
  implements Runnable
{
  private OutputStream b;
  private InputStream c;
  private HttpURLConnection d;
  private java.net.Proxy e;
  
  bv(er paramer) {}
  
  private void a(String paramString)
  {
    if (paramString.length() != 0)
    {
      paramString = JniMethod.getJniMethod().chackPanDecrypt(paramString.getBytes(), paramString.length());
      if (paramString == null) {
        throw new Exception("数据异常,jni解密错误");
      }
      paramString = new String(paramString);
      String[] arrayOfString = paramString.split("\\|");
      z.a("binnet", paramString);
      if ("0000".equals(arrayOfString[0]))
      {
        this.a.a.sendEmptyMessage(1);
        return;
      }
      b("(" + arrayOfString[0] + ")" + arrayOfString[1]);
      return;
    }
    throw new Exception("服务器返回的数据错误");
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
    this.b.flush();
    Log.d("---plugin-send data length=", " " + paramArrayOfByte.length);
  }
  
  private void b(String paramString)
  {
    Message localMessage = Message.obtain();
    localMessage.obj = paramString;
    localMessage.what = 0;
    this.a.a.sendMessage(localMessage);
  }
  
  private void c()
  {
    Object localObject = ((ConnectivityManager)er.a(this.a).getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localObject != null) && (((NetworkInfo)localObject).isAvailable()) && (((NetworkInfo)localObject).getType() == 0))
    {
      localObject = android.net.Proxy.getDefaultHost();
      int i = android.net.Proxy.getDefaultPort();
      if (localObject != null)
      {
        localObject = new InetSocketAddress((String)localObject, i);
        this.e = new java.net.Proxy(Proxy.Type.HTTP, (SocketAddress)localObject);
      }
    }
  }
  
  public void a()
  {
    label41:
    label143:
    int i;
    if (u.a().f)
    {
      localObject = new URL("http://auth.uupay.net/busplat/order/checkPan.action");
      if (this.e == null) {
        break label247;
      }
      this.d = ((HttpURLConnection)((URL)localObject).openConnection(this.e));
      this.d.setRequestMethod("POST");
      this.d.setUseCaches(false);
      this.d.setRequestProperty("Charset", "UTF-8");
      this.d.setRequestProperty("Content-Type", "text/plain");
      this.d.setDoInput(true);
      this.d.setDoOutput(true);
      this.d.setConnectTimeout(120000);
      this.d.setReadTimeout(120000);
      if (v.a == null) {
        break label261;
      }
      this.d.setRequestProperty("sessionId", v.a);
      Log.d("---HttpNet-connect-sessionId-=", v.a);
      this.b = new DataOutputStream(this.d.getOutputStream());
      localObject = JniMethod.getJniMethod().chackPanEncrypt(er.c(this.a).getBytes(), er.c(this.a).length());
      a((byte[])localObject, 0, localObject.length);
      this.d.connect();
      i = this.d.getResponseCode();
      if (this.d.getResponseCode() == 200) {
        return;
      }
      if (i != 504) {
        break label274;
      }
    }
    label247:
    label261:
    label274:
    for (Object localObject = "网络连接超时, 请检查您的网络设置, 或稍候重试!";; localObject = "网络连接失败, 请检查您的网络设置, 或稍候重试!\r\n错误号: " + Integer.toString(i))
    {
      throw new Exception((String)localObject);
      break;
      this.d = ((HttpURLConnection)((URL)localObject).openConnection());
      break label41;
      Log.d("---HttpNet-connect-sessionId-is null=", "sessionId is null");
      break label143;
    }
  }
  
  public void b()
  {
    try
    {
      if (this.c != null)
      {
        this.c.close();
        this.c = null;
      }
      if (this.b != null)
      {
        this.b.close();
        this.b = null;
      }
      if (this.d != null)
      {
        this.d.disconnect();
        this.d = null;
      }
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        this.d = null;
        this.b = null;
        this.c = null;
        return;
      }
      catch (Exception localException2)
      {
        Log.d("---HttpNet-disconnect-e=", localException2.getMessage());
      }
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: invokespecial 321	com/f/a/a/bv:c	()V
    //   8: aload_0
    //   9: invokevirtual 323	com/f/a/a/bv:a	()V
    //   12: aload_0
    //   13: getfield 218	com/f/a/a/bv:d	Ljava/net/HttpURLConnection;
    //   16: invokevirtual 284	java/net/HttpURLConnection:getResponseCode	()I
    //   19: sipush 200
    //   22: if_icmpne +166 -> 188
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 218	com/f/a/a/bv:d	Ljava/net/HttpURLConnection;
    //   30: invokevirtual 327	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   33: putfield 302	com/f/a/a/bv:c	Ljava/io/InputStream;
    //   36: new 329	java/io/InputStreamReader
    //   39: dup
    //   40: aload_0
    //   41: getfield 302	com/f/a/a/bv:c	Ljava/io/InputStream;
    //   44: invokespecial 332	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   47: astore_1
    //   48: new 334	java/io/BufferedReader
    //   51: dup
    //   52: aload_1
    //   53: sipush 8192
    //   56: invokespecial 337	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   59: astore_2
    //   60: new 86	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   67: astore_3
    //   68: aload_2
    //   69: invokevirtual 340	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore 4
    //   74: aload 4
    //   76: ifnull +73 -> 149
    //   79: aload_3
    //   80: aload 4
    //   82: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: goto -18 -> 68
    //   89: astore 4
    //   91: aload_1
    //   92: astore_3
    //   93: aload 4
    //   95: astore_1
    //   96: aload_0
    //   97: getfield 20	com/f/a/a/bv:a	Lcom/f/a/a/er;
    //   100: ldc_w 342
    //   103: invokestatic 345	com/f/a/a/er:a	(Lcom/f/a/a/er;Ljava/lang/String;)V
    //   106: aload_1
    //   107: invokevirtual 348	java/lang/Exception:printStackTrace	()V
    //   110: aload_2
    //   111: ifnull +7 -> 118
    //   114: aload_2
    //   115: invokevirtual 349	java/io/BufferedReader:close	()V
    //   118: aload_3
    //   119: ifnull +7 -> 126
    //   122: aload_3
    //   123: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   126: aload_0
    //   127: invokevirtual 352	com/f/a/a/bv:b	()V
    //   130: return
    //   131: astore_1
    //   132: aload_1
    //   133: invokevirtual 348	java/lang/Exception:printStackTrace	()V
    //   136: aload_0
    //   137: getfield 20	com/f/a/a/bv:a	Lcom/f/a/a/er;
    //   140: ldc_w 354
    //   143: invokestatic 345	com/f/a/a/er:a	(Lcom/f/a/a/er;Ljava/lang/String;)V
    //   146: goto -134 -> 12
    //   149: ldc_w 356
    //   152: aload_3
    //   153: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokestatic 67	com/f/a/a/z:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: aload_0
    //   160: aload_3
    //   161: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokespecial 358	com/f/a/a/bv:a	(Ljava/lang/String;)V
    //   167: aload_2
    //   168: ifnull +7 -> 175
    //   171: aload_2
    //   172: invokevirtual 349	java/io/BufferedReader:close	()V
    //   175: aload_1
    //   176: ifnull +7 -> 183
    //   179: aload_1
    //   180: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   183: aload_0
    //   184: invokevirtual 352	com/f/a/a/bv:b	()V
    //   187: return
    //   188: aload_0
    //   189: getfield 20	com/f/a/a/bv:a	Lcom/f/a/a/er;
    //   192: ldc_w 342
    //   195: invokestatic 345	com/f/a/a/er:a	(Lcom/f/a/a/er;Ljava/lang/String;)V
    //   198: aconst_null
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_1
    //   202: goto -35 -> 167
    //   205: astore_1
    //   206: aload_1
    //   207: invokevirtual 359	java/io/IOException:printStackTrace	()V
    //   210: goto -27 -> 183
    //   213: astore_1
    //   214: aload_1
    //   215: invokevirtual 359	java/io/IOException:printStackTrace	()V
    //   218: goto -92 -> 126
    //   221: astore_1
    //   222: aconst_null
    //   223: astore 4
    //   225: aload_2
    //   226: astore_3
    //   227: aload 4
    //   229: astore_2
    //   230: aload_2
    //   231: ifnull +7 -> 238
    //   234: aload_2
    //   235: invokevirtual 349	java/io/BufferedReader:close	()V
    //   238: aload_3
    //   239: ifnull +7 -> 246
    //   242: aload_3
    //   243: invokevirtual 350	java/io/InputStreamReader:close	()V
    //   246: aload_0
    //   247: invokevirtual 352	com/f/a/a/bv:b	()V
    //   250: aload_1
    //   251: athrow
    //   252: astore_2
    //   253: aload_2
    //   254: invokevirtual 359	java/io/IOException:printStackTrace	()V
    //   257: goto -11 -> 246
    //   260: astore 4
    //   262: aconst_null
    //   263: astore_2
    //   264: aload_1
    //   265: astore_3
    //   266: aload 4
    //   268: astore_1
    //   269: goto -39 -> 230
    //   272: astore 4
    //   274: aload_1
    //   275: astore_3
    //   276: aload 4
    //   278: astore_1
    //   279: goto -49 -> 230
    //   282: astore_1
    //   283: goto -53 -> 230
    //   286: astore_1
    //   287: aconst_null
    //   288: astore_2
    //   289: goto -193 -> 96
    //   292: astore 4
    //   294: aconst_null
    //   295: astore_2
    //   296: aload_1
    //   297: astore_3
    //   298: aload 4
    //   300: astore_1
    //   301: goto -205 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	this	bv
    //   47	60	1	localObject1	Object
    //   131	49	1	localException1	Exception
    //   201	1	1	localObject2	Object
    //   205	2	1	localIOException1	java.io.IOException
    //   213	2	1	localIOException2	java.io.IOException
    //   221	44	1	localObject3	Object
    //   268	11	1	localObject4	Object
    //   282	1	1	localObject5	Object
    //   286	11	1	localException2	Exception
    //   300	1	1	localObject6	Object
    //   1	234	2	localObject7	Object
    //   252	2	2	localIOException3	java.io.IOException
    //   263	33	2	localObject8	Object
    //   3	295	3	localObject9	Object
    //   72	9	4	str	String
    //   89	5	4	localException3	Exception
    //   223	5	4	localObject10	Object
    //   260	7	4	localObject11	Object
    //   272	5	4	localObject12	Object
    //   292	7	4	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   60	68	89	java/lang/Exception
    //   68	74	89	java/lang/Exception
    //   79	86	89	java/lang/Exception
    //   149	167	89	java/lang/Exception
    //   8	12	131	java/lang/Exception
    //   171	175	205	java/io/IOException
    //   179	183	205	java/io/IOException
    //   114	118	213	java/io/IOException
    //   122	126	213	java/io/IOException
    //   12	48	221	finally
    //   188	198	221	finally
    //   234	238	252	java/io/IOException
    //   242	246	252	java/io/IOException
    //   48	60	260	finally
    //   60	68	272	finally
    //   68	74	272	finally
    //   79	86	272	finally
    //   149	167	272	finally
    //   96	110	282	finally
    //   12	48	286	java/lang/Exception
    //   188	198	286	java/lang/Exception
    //   48	60	292	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */