package com.android.thinkive.framework;

import com.android.thinkive.framework.config.AddressConfigBean;

class MultiAddressManager$PingThread
  extends Thread
{
  private AddressConfigBean addressConfigBean;
  private String urlAddress;
  private String urlName;
  
  public MultiAddressManager$PingThread(MultiAddressManager paramMultiAddressManager, AddressConfigBean paramAddressConfigBean, String paramString)
  {
    this.addressConfigBean = paramAddressConfigBean;
    this.urlName = paramAddressConfigBean.getName();
    this.urlAddress = paramString;
  }
  
  public String getUrlName()
  {
    return this.urlName;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 30	com/android/thinkive/framework/MultiAddressManager$PingThread:urlAddress	Ljava/lang/String;
    //   9: invokestatic 41	com/android/thinkive/framework/util/FormatUtil:formatUrlToHost	(Ljava/lang/String;)Ljava/lang/String;
    //   12: astore_1
    //   13: new 43	java/lang/StringBuilder
    //   16: dup
    //   17: ldc 45
    //   19: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: aload_1
    //   23: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 60	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   32: invokestatic 66	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   35: new 43	java/lang/StringBuilder
    //   38: dup
    //   39: ldc 68
    //   41: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: aload_1
    //   45: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokevirtual 72	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   54: invokevirtual 78	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   57: astore_1
    //   58: new 80	java/io/BufferedReader
    //   61: dup
    //   62: new 82	java/io/InputStreamReader
    //   65: dup
    //   66: aload_1
    //   67: invokespecial 85	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   70: invokespecial 88	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   73: astore_3
    //   74: new 90	java/lang/StringBuffer
    //   77: dup
    //   78: invokespecial 91	java/lang/StringBuffer:<init>	()V
    //   81: astore_2
    //   82: aload_3
    //   83: invokevirtual 94	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   86: astore 4
    //   88: aload 4
    //   90: ifnonnull +116 -> 206
    //   93: aload_0
    //   94: getfield 15	com/android/thinkive/framework/MultiAddressManager$PingThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   97: astore 4
    //   99: aload 4
    //   101: monitorenter
    //   102: new 43	java/lang/StringBuilder
    //   105: dup
    //   106: ldc 96
    //   108: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: aload_2
    //   112: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   115: ldc 101
    //   117: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload_0
    //   121: getfield 20	com/android/thinkive/framework/MultiAddressManager$PingThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   124: invokevirtual 105	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   127: invokevirtual 111	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   130: invokevirtual 114	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   133: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 117	com/android/thinkive/framework/util/Log:i	(Ljava/lang/String;)V
    //   139: aload_0
    //   140: getfield 20	com/android/thinkive/framework/MultiAddressManager$PingThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   143: invokevirtual 105	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   146: invokevirtual 111	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   149: ifne +37 -> 186
    //   152: aload_0
    //   153: getfield 20	com/android/thinkive/framework/MultiAddressManager$PingThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   156: invokevirtual 105	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   159: iconst_1
    //   160: invokevirtual 121	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   163: pop
    //   164: aload_0
    //   165: getfield 20	com/android/thinkive/framework/MultiAddressManager$PingThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   168: aload_0
    //   169: getfield 30	com/android/thinkive/framework/MultiAddressManager$PingThread:urlAddress	Ljava/lang/String;
    //   172: invokevirtual 124	com/android/thinkive/framework/config/AddressConfigBean:setPriorityValue	(Ljava/lang/String;)V
    //   175: aload_0
    //   176: getfield 15	com/android/thinkive/framework/MultiAddressManager$PingThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   179: aload_0
    //   180: getfield 28	com/android/thinkive/framework/MultiAddressManager$PingThread:urlName	Ljava/lang/String;
    //   183: invokestatic 130	com/android/thinkive/framework/MultiAddressManager:access$0	(Lcom/android/thinkive/framework/MultiAddressManager;Ljava/lang/String;)V
    //   186: aload 4
    //   188: monitorexit
    //   189: aload_1
    //   190: ifnull +7 -> 197
    //   193: aload_1
    //   194: invokevirtual 135	java/io/InputStream:close	()V
    //   197: aload_3
    //   198: ifnull +7 -> 205
    //   201: aload_3
    //   202: invokevirtual 136	java/io/BufferedReader:close	()V
    //   205: return
    //   206: aload_2
    //   207: aload 4
    //   209: invokevirtual 139	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   212: pop
    //   213: goto -131 -> 82
    //   216: astore 4
    //   218: aload_1
    //   219: astore_2
    //   220: aload_3
    //   221: astore_1
    //   222: aload 4
    //   224: astore_3
    //   225: aload_3
    //   226: invokevirtual 142	java/io/IOException:printStackTrace	()V
    //   229: aload_2
    //   230: ifnull +7 -> 237
    //   233: aload_2
    //   234: invokevirtual 135	java/io/InputStream:close	()V
    //   237: aload_1
    //   238: ifnull -33 -> 205
    //   241: aload_1
    //   242: invokevirtual 136	java/io/BufferedReader:close	()V
    //   245: return
    //   246: astore_1
    //   247: aload_1
    //   248: invokevirtual 142	java/io/IOException:printStackTrace	()V
    //   251: return
    //   252: astore_2
    //   253: aload 4
    //   255: monitorexit
    //   256: aload_2
    //   257: athrow
    //   258: astore_2
    //   259: aload_1
    //   260: ifnull +7 -> 267
    //   263: aload_1
    //   264: invokevirtual 135	java/io/InputStream:close	()V
    //   267: aload_3
    //   268: ifnull +7 -> 275
    //   271: aload_3
    //   272: invokevirtual 136	java/io/BufferedReader:close	()V
    //   275: aload_2
    //   276: athrow
    //   277: astore_1
    //   278: aload_1
    //   279: invokevirtual 142	java/io/IOException:printStackTrace	()V
    //   282: goto -7 -> 275
    //   285: astore_1
    //   286: aload_1
    //   287: invokevirtual 142	java/io/IOException:printStackTrace	()V
    //   290: return
    //   291: astore_2
    //   292: aconst_null
    //   293: astore_1
    //   294: aload 4
    //   296: astore_3
    //   297: goto -38 -> 259
    //   300: astore_2
    //   301: aload 4
    //   303: astore_3
    //   304: goto -45 -> 259
    //   307: astore_3
    //   308: aload_2
    //   309: astore 4
    //   311: aload_3
    //   312: astore_2
    //   313: aload_1
    //   314: astore_3
    //   315: aload 4
    //   317: astore_1
    //   318: goto -59 -> 259
    //   321: astore_3
    //   322: aconst_null
    //   323: astore_1
    //   324: goto -99 -> 225
    //   327: astore_3
    //   328: aconst_null
    //   329: astore 4
    //   331: aload_1
    //   332: astore_2
    //   333: aload 4
    //   335: astore_1
    //   336: goto -111 -> 225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	339	0	this	PingThread
    //   12	230	1	localObject1	Object
    //   246	18	1	localIOException1	java.io.IOException
    //   277	2	1	localIOException2	java.io.IOException
    //   285	2	1	localIOException3	java.io.IOException
    //   293	43	1	localObject2	Object
    //   4	230	2	localObject3	Object
    //   252	5	2	localObject4	Object
    //   258	18	2	localObject5	Object
    //   291	1	2	localObject6	Object
    //   300	9	2	localObject7	Object
    //   312	21	2	localObject8	Object
    //   73	231	3	localObject9	Object
    //   307	5	3	localObject10	Object
    //   314	1	3	localObject11	Object
    //   321	1	3	localIOException4	java.io.IOException
    //   327	1	3	localIOException5	java.io.IOException
    //   1	207	4	localObject12	Object
    //   216	86	4	localIOException6	java.io.IOException
    //   309	25	4	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   74	82	216	java/io/IOException
    //   82	88	216	java/io/IOException
    //   93	102	216	java/io/IOException
    //   206	213	216	java/io/IOException
    //   256	258	216	java/io/IOException
    //   233	237	246	java/io/IOException
    //   241	245	246	java/io/IOException
    //   102	186	252	finally
    //   186	189	252	finally
    //   253	256	252	finally
    //   74	82	258	finally
    //   82	88	258	finally
    //   93	102	258	finally
    //   206	213	258	finally
    //   256	258	258	finally
    //   263	267	277	java/io/IOException
    //   271	275	277	java/io/IOException
    //   193	197	285	java/io/IOException
    //   201	205	285	java/io/IOException
    //   13	58	291	finally
    //   58	74	300	finally
    //   225	229	307	finally
    //   13	58	321	java/io/IOException
    //   58	74	327	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\MultiAddressManager$PingThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */