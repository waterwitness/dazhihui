package com.android.thinkive.framework.download;

import com.android.thinkive.framework.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTask
  implements Runnable
{
  private static final long REFRESH_INTEVAL_SIZE = 102400L;
  private DownloadItemBean mDownloadItemBean;
  private DownloadManager mDownloadManager;
  private String mFilePath;
  private volatile boolean mPauseFlag;
  private volatile boolean mStopFlag;
  private int mTryTimes;
  
  public DownloadTask(DownloadItemBean paramDownloadItemBean, DownloadManager paramDownloadManager)
  {
    this.mDownloadManager = paramDownloadManager;
    this.mDownloadItemBean = paramDownloadItemBean;
    this.mTryTimes = 0;
  }
  
  private RandomAccessFile buildDownloadFile()
  {
    Object localObject = this.mDownloadItemBean.getName();
    localObject = new File(this.mDownloadItemBean.getSavePath(), (String)localObject);
    if ((!((File)localObject).getParentFile().isDirectory()) && (!((File)localObject).getParentFile().mkdirs())) {
      throw new IOException("cannot create download folder");
    }
    ((File)localObject).exists();
    this.mFilePath = ((File)localObject).getAbsolutePath();
    localObject = new RandomAccessFile((File)localObject, "rw");
    long l = this.mDownloadItemBean.getFinishedSize();
    Log.d("buildDownloadFile()====> downloadFinishedSize = " + l);
    if (l != 0L) {
      ((RandomAccessFile)localObject).seek(l);
    }
    return (RandomAccessFile)localObject;
  }
  
  private FileOutputStream buildOuPutFile()
  {
    Object localObject = this.mDownloadItemBean.getName();
    localObject = new File(this.mDownloadItemBean.getSavePath(), (String)localObject);
    if ((!((File)localObject).getParentFile().isDirectory()) && (!((File)localObject).getParentFile().mkdirs())) {
      throw new IOException("cannot create download folder");
    }
    ((File)localObject).exists();
    this.mFilePath = ((File)localObject).getAbsolutePath();
    return new FileOutputStream((File)localObject);
  }
  
  private HttpURLConnection initConnection()
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.mDownloadItemBean.getUrl()).openConnection();
    localHttpURLConnection.setConnectTimeout(60000);
    localHttpURLConnection.setReadTimeout(60000);
    localHttpURLConnection.setUseCaches(true);
    long l = this.mDownloadItemBean.getFinishedSize();
    if (l != 0L) {
      localHttpURLConnection.setRequestProperty("Range", "bytes=" + l + "-");
    }
    return localHttpURLConnection;
  }
  
  protected void cancelDownload()
  {
    this.mStopFlag = true;
    resumeDownload();
  }
  
  protected void pauseDownload()
  {
    if (this.mPauseFlag) {
      return;
    }
    this.mPauseFlag = true;
  }
  
  protected void resumeDownload()
  {
    if (!this.mPauseFlag) {
      return;
    }
    this.mPauseFlag = false;
    try
    {
      notify();
      return;
    }
    finally {}
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 169	com/android/thinkive/framework/download/DownloadTask:buildDownloadFile	()Ljava/io/RandomAccessFile;
    //   4: astore_1
    //   5: aload_0
    //   6: invokespecial 171	com/android/thinkive/framework/download/DownloadTask:initConnection	()Ljava/net/HttpURLConnection;
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual 174	java/net/HttpURLConnection:connect	()V
    //   14: aload_0
    //   15: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   18: aload_0
    //   19: getfield 75	com/android/thinkive/framework/download/DownloadTask:mFilePath	Ljava/lang/String;
    //   22: invokevirtual 177	com/android/thinkive/framework/download/DownloadItemBean:setSavePath	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   29: invokevirtual 180	com/android/thinkive/framework/download/DownloadItemBean:getTotalSize	()J
    //   32: lconst_0
    //   33: lcmp
    //   34: ifne +24 -> 58
    //   37: aload_0
    //   38: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   41: aload_2
    //   42: invokevirtual 184	java/net/HttpURLConnection:getContentLength	()I
    //   45: i2l
    //   46: invokevirtual 187	com/android/thinkive/framework/download/DownloadItemBean:setTotalSize	(J)V
    //   49: aload_1
    //   50: aload_2
    //   51: invokevirtual 184	java/net/HttpURLConnection:getContentLength	()I
    //   54: i2l
    //   55: invokevirtual 190	java/io/RandomAccessFile:setLength	(J)V
    //   58: aload_0
    //   59: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   62: invokevirtual 193	com/android/thinkive/framework/download/DownloadItemBean:getMimeType	()Ljava/lang/String;
    //   65: invokestatic 199	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   68: ifeq +14 -> 82
    //   71: aload_0
    //   72: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   75: aload_2
    //   76: invokevirtual 202	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   79: invokevirtual 205	com/android/thinkive/framework/download/DownloadItemBean:setMimeType	(Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   86: getstatic 211	com/android/thinkive/framework/download/DownloadStatus:STATUS_RUNNING	Lcom/android/thinkive/framework/download/DownloadStatus;
    //   89: invokevirtual 215	com/android/thinkive/framework/download/DownloadItemBean:setStatus	(Lcom/android/thinkive/framework/download/DownloadStatus;)V
    //   92: aload_0
    //   93: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   96: aload_0
    //   97: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   100: invokevirtual 221	com/android/thinkive/framework/download/DownloadManager:onDownloadStarted	(Lcom/android/thinkive/framework/download/DownloadItemBean;)V
    //   103: aload_2
    //   104: invokevirtual 225	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   107: astore_3
    //   108: sipush 10240
    //   111: newarray <illegal type>
    //   113: astore_2
    //   114: aload_0
    //   115: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   118: invokevirtual 86	com/android/thinkive/framework/download/DownloadItemBean:getFinishedSize	()J
    //   121: lstore 8
    //   123: invokestatic 230	java/lang/System:currentTimeMillis	()J
    //   126: lstore 10
    //   128: lload 8
    //   130: lstore 12
    //   132: aload_0
    //   133: getfield 155	com/android/thinkive/framework/download/DownloadTask:mStopFlag	Z
    //   136: ifne +16 -> 152
    //   139: aload_3
    //   140: aload_2
    //   141: invokevirtual 236	java/io/InputStream:read	([B)I
    //   144: istore 5
    //   146: iload 5
    //   148: iconst_m1
    //   149: if_icmpne +66 -> 215
    //   152: aload_0
    //   153: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   156: lload 8
    //   158: invokevirtual 239	com/android/thinkive/framework/download/DownloadItemBean:setFinishedSize	(J)V
    //   161: aload_0
    //   162: getfield 155	com/android/thinkive/framework/download/DownloadTask:mStopFlag	Z
    //   165: ifeq +242 -> 407
    //   168: aload_0
    //   169: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   172: aload_0
    //   173: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   176: invokevirtual 242	com/android/thinkive/framework/download/DownloadManager:onDownloadCanceled	(Lcom/android/thinkive/framework/download/DownloadItemBean;)V
    //   179: aload_3
    //   180: ifnull +7 -> 187
    //   183: aload_3
    //   184: invokevirtual 245	java/io/InputStream:close	()V
    //   187: aload_1
    //   188: ifnull +7 -> 195
    //   191: aload_1
    //   192: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   195: return
    //   196: aload_0
    //   197: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   200: aload_0
    //   201: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   204: invokevirtual 249	com/android/thinkive/framework/download/DownloadManager:onDownloadPaused	(Lcom/android/thinkive/framework/download/DownloadItemBean;)V
    //   207: aload_0
    //   208: monitorenter
    //   209: aload_0
    //   210: invokevirtual 252	java/lang/Object:wait	()V
    //   213: aload_0
    //   214: monitorexit
    //   215: aload_0
    //   216: getfield 161	com/android/thinkive/framework/download/DownloadTask:mPauseFlag	Z
    //   219: ifne -23 -> 196
    //   222: aload_1
    //   223: aload_2
    //   224: iconst_0
    //   225: iload 5
    //   227: invokevirtual 256	java/io/RandomAccessFile:write	([BII)V
    //   230: lload 8
    //   232: iload 5
    //   234: i2l
    //   235: ladd
    //   236: lstore 6
    //   238: lload 6
    //   240: lload 12
    //   242: lsub
    //   243: lstore 14
    //   245: lload 6
    //   247: lstore 8
    //   249: lload 14
    //   251: ldc2_w 9
    //   254: lcmp
    //   255: ifle -123 -> 132
    //   258: ldc2_w 257
    //   261: lload 14
    //   263: lmul
    //   264: invokestatic 230	java/lang/System:currentTimeMillis	()J
    //   267: lload 10
    //   269: lsub
    //   270: ldiv
    //   271: lstore 8
    //   273: invokestatic 230	java/lang/System:currentTimeMillis	()J
    //   276: lstore 10
    //   278: aload_0
    //   279: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   282: lload 6
    //   284: invokevirtual 239	com/android/thinkive/framework/download/DownloadItemBean:setFinishedSize	(J)V
    //   287: aload_0
    //   288: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   291: lload 8
    //   293: invokevirtual 261	com/android/thinkive/framework/download/DownloadItemBean:setDownloadSpeed	(J)V
    //   296: aload_0
    //   297: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   300: aload_0
    //   301: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   304: lload 6
    //   306: lload 8
    //   308: invokevirtual 265	com/android/thinkive/framework/download/DownloadManager:onPregressUpdate	(Lcom/android/thinkive/framework/download/DownloadItemBean;JJ)V
    //   311: lload 6
    //   313: lstore 12
    //   315: lload 6
    //   317: lstore 8
    //   319: goto -187 -> 132
    //   322: astore 4
    //   324: aload 4
    //   326: invokevirtual 268	java/lang/InterruptedException:printStackTrace	()V
    //   329: aload_0
    //   330: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   333: aload_0
    //   334: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   337: invokevirtual 271	com/android/thinkive/framework/download/DownloadManager:onDownloadResumed	(Lcom/android/thinkive/framework/download/DownloadItemBean;)V
    //   340: goto -127 -> 213
    //   343: astore_2
    //   344: aload_0
    //   345: monitorexit
    //   346: aload_2
    //   347: athrow
    //   348: astore 4
    //   350: aload_1
    //   351: astore_2
    //   352: aload_3
    //   353: astore_1
    //   354: aload 4
    //   356: astore_3
    //   357: aload_3
    //   358: invokevirtual 272	java/io/IOException:printStackTrace	()V
    //   361: aload_0
    //   362: getfield 32	com/android/thinkive/framework/download/DownloadTask:mTryTimes	I
    //   365: iconst_1
    //   366: if_icmple +80 -> 446
    //   369: aload_0
    //   370: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   373: aload_0
    //   374: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   377: aload_3
    //   378: invokevirtual 275	java/io/IOException:getMessage	()Ljava/lang/String;
    //   381: invokevirtual 279	com/android/thinkive/framework/download/DownloadManager:onDownloadFailed	(Lcom/android/thinkive/framework/download/DownloadItemBean;Ljava/lang/String;)V
    //   384: aload_1
    //   385: ifnull +7 -> 392
    //   388: aload_1
    //   389: invokevirtual 245	java/io/InputStream:close	()V
    //   392: aload_2
    //   393: ifnull -198 -> 195
    //   396: aload_2
    //   397: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   400: return
    //   401: astore_1
    //   402: aload_1
    //   403: invokevirtual 272	java/io/IOException:printStackTrace	()V
    //   406: return
    //   407: aload_0
    //   408: getfield 28	com/android/thinkive/framework/download/DownloadTask:mDownloadManager	Lcom/android/thinkive/framework/download/DownloadManager;
    //   411: aload_0
    //   412: getfield 30	com/android/thinkive/framework/download/DownloadTask:mDownloadItemBean	Lcom/android/thinkive/framework/download/DownloadItemBean;
    //   415: invokevirtual 282	com/android/thinkive/framework/download/DownloadManager:onDownloadFinished	(Lcom/android/thinkive/framework/download/DownloadItemBean;)V
    //   418: goto -239 -> 179
    //   421: astore_2
    //   422: aload_3
    //   423: ifnull +7 -> 430
    //   426: aload_3
    //   427: invokevirtual 245	java/io/InputStream:close	()V
    //   430: aload_1
    //   431: ifnull +7 -> 438
    //   434: aload_1
    //   435: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   438: aload_2
    //   439: athrow
    //   440: astore_1
    //   441: aload_1
    //   442: invokevirtual 272	java/io/IOException:printStackTrace	()V
    //   445: return
    //   446: aload_0
    //   447: aload_0
    //   448: getfield 32	com/android/thinkive/framework/download/DownloadTask:mTryTimes	I
    //   451: iconst_1
    //   452: iadd
    //   453: putfield 32	com/android/thinkive/framework/download/DownloadTask:mTryTimes	I
    //   456: aload_1
    //   457: ifnull +7 -> 464
    //   460: aload_1
    //   461: invokevirtual 245	java/io/InputStream:close	()V
    //   464: aload_2
    //   465: ifnull -465 -> 0
    //   468: aload_2
    //   469: invokevirtual 246	java/io/RandomAccessFile:close	()V
    //   472: goto -472 -> 0
    //   475: astore_1
    //   476: aload_1
    //   477: invokevirtual 272	java/io/IOException:printStackTrace	()V
    //   480: goto -480 -> 0
    //   483: astore_1
    //   484: aload_1
    //   485: invokevirtual 272	java/io/IOException:printStackTrace	()V
    //   488: goto -50 -> 438
    //   491: astore_2
    //   492: aconst_null
    //   493: astore_3
    //   494: aconst_null
    //   495: astore_1
    //   496: goto -74 -> 422
    //   499: astore_2
    //   500: aconst_null
    //   501: astore_3
    //   502: goto -80 -> 422
    //   505: astore_3
    //   506: aload_2
    //   507: astore 4
    //   509: aload_3
    //   510: astore_2
    //   511: aload_1
    //   512: astore_3
    //   513: aload 4
    //   515: astore_1
    //   516: goto -94 -> 422
    //   519: astore_3
    //   520: aconst_null
    //   521: astore_1
    //   522: aconst_null
    //   523: astore_2
    //   524: goto -167 -> 357
    //   527: astore_3
    //   528: aconst_null
    //   529: astore 4
    //   531: aload_1
    //   532: astore_2
    //   533: aload 4
    //   535: astore_1
    //   536: goto -179 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	539	0	this	DownloadTask
    //   4	385	1	localObject1	Object
    //   401	34	1	localIOException1	IOException
    //   440	21	1	localIOException2	IOException
    //   475	2	1	localIOException3	IOException
    //   483	2	1	localIOException4	IOException
    //   495	41	1	localObject2	Object
    //   9	215	2	localObject3	Object
    //   343	4	2	localObject4	Object
    //   351	46	2	localObject5	Object
    //   421	48	2	localObject6	Object
    //   491	1	2	localObject7	Object
    //   499	8	2	localObject8	Object
    //   510	23	2	localObject9	Object
    //   107	395	3	localObject10	Object
    //   505	5	3	localObject11	Object
    //   512	1	3	localObject12	Object
    //   519	1	3	localIOException5	IOException
    //   527	1	3	localIOException6	IOException
    //   322	3	4	localInterruptedException	InterruptedException
    //   348	7	4	localIOException7	IOException
    //   507	27	4	localObject13	Object
    //   144	89	5	i	int
    //   236	80	6	l1	long
    //   121	197	8	l2	long
    //   126	151	10	l3	long
    //   130	184	12	l4	long
    //   243	19	14	l5	long
    // Exception table:
    //   from	to	target	type
    //   209	213	322	java/lang/InterruptedException
    //   209	213	343	finally
    //   213	215	343	finally
    //   324	340	343	finally
    //   344	346	343	finally
    //   108	128	348	java/io/IOException
    //   132	146	348	java/io/IOException
    //   152	179	348	java/io/IOException
    //   196	209	348	java/io/IOException
    //   215	230	348	java/io/IOException
    //   258	311	348	java/io/IOException
    //   346	348	348	java/io/IOException
    //   407	418	348	java/io/IOException
    //   388	392	401	java/io/IOException
    //   396	400	401	java/io/IOException
    //   108	128	421	finally
    //   132	146	421	finally
    //   152	179	421	finally
    //   196	209	421	finally
    //   215	230	421	finally
    //   258	311	421	finally
    //   346	348	421	finally
    //   407	418	421	finally
    //   183	187	440	java/io/IOException
    //   191	195	440	java/io/IOException
    //   460	464	475	java/io/IOException
    //   468	472	475	java/io/IOException
    //   426	430	483	java/io/IOException
    //   434	438	483	java/io/IOException
    //   0	5	491	finally
    //   5	58	499	finally
    //   58	82	499	finally
    //   82	108	499	finally
    //   357	384	505	finally
    //   446	456	505	finally
    //   0	5	519	java/io/IOException
    //   5	58	527	java/io/IOException
    //   58	82	527	java/io/IOException
    //   82	108	527	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */