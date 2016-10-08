package com.iflytek.cloud.record;

class c$b
  extends Thread
{
  private int b = c.c(this.a);
  
  private c$b(c paramc) {}
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc 34
    //   2: ldc 36
    //   4: invokestatic 41	com/iflytek/thirdparty/X:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: ldc 34
    //   9: new 43	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   16: ldc 46
    //   18: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_0
    //   22: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   25: invokestatic 54	com/iflytek/cloud/record/c:d	(Lcom/iflytek/cloud/record/c;)Z
    //   28: invokevirtual 57	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   31: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokestatic 41	com/iflytek/thirdparty/X:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: aload_0
    //   38: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   41: invokestatic 54	com/iflytek/cloud/record/c:d	(Lcom/iflytek/cloud/record/c;)Z
    //   44: ifeq +405 -> 449
    //   47: aload_0
    //   48: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   51: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   54: aload_0
    //   55: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   58: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   61: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   64: aload_0
    //   65: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   68: getfield 77	com/iflytek/cloud/record/c:a	Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //   71: invokestatic 82	com/iflytek/thirdparty/N:a	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   74: pop
    //   75: aload_0
    //   76: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   79: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   82: invokevirtual 90	com/iflytek/cloud/record/b:c	()V
    //   85: aload_0
    //   86: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   89: invokestatic 94	com/iflytek/cloud/record/c:h	(Lcom/iflytek/cloud/record/c;)Ljava/lang/Object;
    //   92: astore_1
    //   93: aload_1
    //   94: monitorenter
    //   95: aload_0
    //   96: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   99: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   102: iconst_4
    //   103: if_icmpeq +23 -> 126
    //   106: aload_0
    //   107: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   110: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   113: iconst_3
    //   114: if_icmpeq +12 -> 126
    //   117: aload_0
    //   118: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   121: iconst_2
    //   122: invokestatic 100	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;I)I
    //   125: pop
    //   126: aload_1
    //   127: monitorexit
    //   128: aload_0
    //   129: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   132: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   135: iconst_4
    //   136: if_icmpeq +491 -> 627
    //   139: aload_0
    //   140: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   143: invokestatic 103	com/iflytek/cloud/record/c:j	(Lcom/iflytek/cloud/record/c;)V
    //   146: aload_0
    //   147: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   150: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   153: iconst_2
    //   154: if_icmpeq +14 -> 168
    //   157: aload_0
    //   158: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   161: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   164: iconst_1
    //   165: if_icmpne +622 -> 787
    //   168: aload_0
    //   169: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   172: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   175: invokevirtual 106	com/iflytek/cloud/record/b:g	()Z
    //   178: ifeq +408 -> 586
    //   181: aload_0
    //   182: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   185: iconst_1
    //   186: iconst_2
    //   187: invokestatic 109	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;II)Z
    //   190: ifeq +17 -> 207
    //   193: aload_0
    //   194: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   197: invokestatic 113	com/iflytek/cloud/record/c:k	(Lcom/iflytek/cloud/record/c;)Landroid/os/Handler;
    //   200: iconst_2
    //   201: invokestatic 119	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   204: invokevirtual 122	android/os/Message:sendToTarget	()V
    //   207: aload_0
    //   208: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   211: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   214: invokevirtual 124	com/iflytek/cloud/record/b:d	()I
    //   217: istore_3
    //   218: aload_0
    //   219: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   222: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   225: invokevirtual 127	com/iflytek/cloud/record/b:e	()Lcom/iflytek/cloud/record/b$a;
    //   228: astore_1
    //   229: aload_1
    //   230: ifnull +34 -> 264
    //   233: aload_0
    //   234: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   237: aload_1
    //   238: getfield 131	com/iflytek/cloud/record/b$a:d	I
    //   241: invokestatic 133	com/iflytek/cloud/record/c:b	(Lcom/iflytek/cloud/record/c;I)I
    //   244: pop
    //   245: aload_0
    //   246: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   249: invokestatic 113	com/iflytek/cloud/record/c:k	(Lcom/iflytek/cloud/record/c;)Landroid/os/Handler;
    //   252: iconst_3
    //   253: iload_3
    //   254: aload_1
    //   255: getfield 135	com/iflytek/cloud/record/b$a:c	I
    //   258: invokestatic 138	android/os/Message:obtain	(Landroid/os/Handler;III)Landroid/os/Message;
    //   261: invokevirtual 122	android/os/Message:sendToTarget	()V
    //   264: aload_0
    //   265: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   268: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   271: invokevirtual 147	android/media/AudioTrack:getPlayState	()I
    //   274: iconst_3
    //   275: if_icmpeq +13 -> 288
    //   278: aload_0
    //   279: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   282: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   285: invokevirtual 150	android/media/AudioTrack:play	()V
    //   288: aload_0
    //   289: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   292: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   295: aload_0
    //   296: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   299: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   302: aload_0
    //   303: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   306: invokestatic 153	com/iflytek/cloud/record/c:m	(Lcom/iflytek/cloud/record/c;)I
    //   309: invokevirtual 156	com/iflytek/cloud/record/b:a	(Landroid/media/AudioTrack;I)V
    //   312: goto -184 -> 128
    //   315: astore_1
    //   316: aload_1
    //   317: invokestatic 159	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   320: aload_0
    //   321: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   324: invokestatic 113	com/iflytek/cloud/record/c:k	(Lcom/iflytek/cloud/record/c;)Landroid/os/Handler;
    //   327: iconst_0
    //   328: new 161	com/iflytek/cloud/SpeechError
    //   331: dup
    //   332: sipush 20011
    //   335: invokespecial 163	com/iflytek/cloud/SpeechError:<init>	(I)V
    //   338: invokestatic 166	android/os/Message:obtain	(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
    //   341: invokevirtual 122	android/os/Message:sendToTarget	()V
    //   344: aload_0
    //   345: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   348: invokestatic 94	com/iflytek/cloud/record/c:h	(Lcom/iflytek/cloud/record/c;)Ljava/lang/Object;
    //   351: astore_1
    //   352: aload_1
    //   353: monitorenter
    //   354: aload_0
    //   355: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   358: iconst_4
    //   359: invokestatic 100	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;I)I
    //   362: pop
    //   363: aload_1
    //   364: monitorexit
    //   365: aload_0
    //   366: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   369: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   372: ifnull +22 -> 394
    //   375: aload_0
    //   376: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   379: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   382: invokevirtual 169	android/media/AudioTrack:release	()V
    //   385: aload_0
    //   386: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   389: aconst_null
    //   390: invokestatic 172	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Landroid/media/AudioTrack;)Landroid/media/AudioTrack;
    //   393: pop
    //   394: aload_0
    //   395: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   398: invokestatic 54	com/iflytek/cloud/record/c:d	(Lcom/iflytek/cloud/record/c;)Z
    //   401: ifeq +465 -> 866
    //   404: aload_0
    //   405: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   408: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   411: aload_0
    //   412: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   415: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   418: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   421: aload_0
    //   422: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   425: getfield 77	com/iflytek/cloud/record/c:a	Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //   428: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   431: pop
    //   432: aload_0
    //   433: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   436: aconst_null
    //   437: invokestatic 177	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Lcom/iflytek/cloud/record/c$b;)Lcom/iflytek/cloud/record/c$b;
    //   440: pop
    //   441: ldc 34
    //   443: ldc -77
    //   445: invokestatic 41	com/iflytek/thirdparty/X:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: return
    //   449: aload_0
    //   450: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   453: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   456: aload_0
    //   457: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   460: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   463: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   466: aconst_null
    //   467: invokestatic 82	com/iflytek/thirdparty/N:a	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   470: pop
    //   471: goto -396 -> 75
    //   474: astore_2
    //   475: aload_0
    //   476: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   479: invokestatic 94	com/iflytek/cloud/record/c:h	(Lcom/iflytek/cloud/record/c;)Ljava/lang/Object;
    //   482: astore_1
    //   483: aload_1
    //   484: monitorenter
    //   485: aload_0
    //   486: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   489: iconst_4
    //   490: invokestatic 100	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;I)I
    //   493: pop
    //   494: aload_1
    //   495: monitorexit
    //   496: aload_0
    //   497: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   500: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   503: ifnull +22 -> 525
    //   506: aload_0
    //   507: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   510: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   513: invokevirtual 169	android/media/AudioTrack:release	()V
    //   516: aload_0
    //   517: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   520: aconst_null
    //   521: invokestatic 172	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Landroid/media/AudioTrack;)Landroid/media/AudioTrack;
    //   524: pop
    //   525: aload_0
    //   526: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   529: invokestatic 54	com/iflytek/cloud/record/c:d	(Lcom/iflytek/cloud/record/c;)Z
    //   532: ifeq +304 -> 836
    //   535: aload_0
    //   536: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   539: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   542: aload_0
    //   543: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   546: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   549: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   552: aload_0
    //   553: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   556: getfield 77	com/iflytek/cloud/record/c:a	Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //   559: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   562: pop
    //   563: aload_0
    //   564: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   567: aconst_null
    //   568: invokestatic 177	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Lcom/iflytek/cloud/record/c$b;)Lcom/iflytek/cloud/record/c$b;
    //   571: pop
    //   572: ldc 34
    //   574: ldc -77
    //   576: invokestatic 41	com/iflytek/thirdparty/X:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   579: aload_2
    //   580: athrow
    //   581: astore_2
    //   582: aload_1
    //   583: monitorexit
    //   584: aload_2
    //   585: athrow
    //   586: aload_0
    //   587: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   590: invokestatic 86	com/iflytek/cloud/record/c:g	(Lcom/iflytek/cloud/record/c;)Lcom/iflytek/cloud/record/b;
    //   593: invokevirtual 181	com/iflytek/cloud/record/b:f	()Z
    //   596: ifeq +151 -> 747
    //   599: ldc -73
    //   601: invokestatic 186	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   604: aload_0
    //   605: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   608: iconst_4
    //   609: invokestatic 100	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;I)I
    //   612: pop
    //   613: aload_0
    //   614: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   617: invokestatic 113	com/iflytek/cloud/record/c:k	(Lcom/iflytek/cloud/record/c;)Landroid/os/Handler;
    //   620: iconst_4
    //   621: invokestatic 119	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   624: invokevirtual 122	android/os/Message:sendToTarget	()V
    //   627: aload_0
    //   628: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   631: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   634: ifnull +13 -> 647
    //   637: aload_0
    //   638: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   641: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   644: invokevirtual 189	android/media/AudioTrack:stop	()V
    //   647: aload_0
    //   648: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   651: invokestatic 94	com/iflytek/cloud/record/c:h	(Lcom/iflytek/cloud/record/c;)Ljava/lang/Object;
    //   654: astore_1
    //   655: aload_1
    //   656: monitorenter
    //   657: aload_0
    //   658: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   661: iconst_4
    //   662: invokestatic 100	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;I)I
    //   665: pop
    //   666: aload_1
    //   667: monitorexit
    //   668: aload_0
    //   669: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   672: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   675: ifnull +22 -> 697
    //   678: aload_0
    //   679: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   682: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   685: invokevirtual 169	android/media/AudioTrack:release	()V
    //   688: aload_0
    //   689: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   692: aconst_null
    //   693: invokestatic 172	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Landroid/media/AudioTrack;)Landroid/media/AudioTrack;
    //   696: pop
    //   697: aload_0
    //   698: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   701: invokestatic 54	com/iflytek/cloud/record/c:d	(Lcom/iflytek/cloud/record/c;)Z
    //   704: ifeq +192 -> 896
    //   707: aload_0
    //   708: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   711: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   714: aload_0
    //   715: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   718: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   721: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   724: aload_0
    //   725: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   728: getfield 77	com/iflytek/cloud/record/c:a	Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //   731: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   734: pop
    //   735: aload_0
    //   736: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   739: aconst_null
    //   740: invokestatic 177	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;Lcom/iflytek/cloud/record/c$b;)Lcom/iflytek/cloud/record/c$b;
    //   743: pop
    //   744: goto -303 -> 441
    //   747: aload_0
    //   748: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   751: iconst_2
    //   752: iconst_1
    //   753: invokestatic 109	com/iflytek/cloud/record/c:a	(Lcom/iflytek/cloud/record/c;II)Z
    //   756: ifeq +22 -> 778
    //   759: ldc -65
    //   761: invokestatic 186	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   764: aload_0
    //   765: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   768: invokestatic 113	com/iflytek/cloud/record/c:k	(Lcom/iflytek/cloud/record/c;)Landroid/os/Handler;
    //   771: iconst_1
    //   772: invokestatic 119	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   775: invokevirtual 122	android/os/Message:sendToTarget	()V
    //   778: ldc2_w 192
    //   781: invokestatic 197	com/iflytek/cloud/record/c$b:sleep	(J)V
    //   784: goto -656 -> 128
    //   787: aload_0
    //   788: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   791: invokestatic 97	com/iflytek/cloud/record/c:i	(Lcom/iflytek/cloud/record/c;)I
    //   794: iconst_3
    //   795: if_icmpne -667 -> 128
    //   798: iconst_2
    //   799: aload_0
    //   800: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   803: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   806: invokevirtual 147	android/media/AudioTrack:getPlayState	()I
    //   809: if_icmpeq +13 -> 822
    //   812: aload_0
    //   813: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   816: invokestatic 142	com/iflytek/cloud/record/c:l	(Lcom/iflytek/cloud/record/c;)Landroid/media/AudioTrack;
    //   819: invokevirtual 200	android/media/AudioTrack:pause	()V
    //   822: ldc2_w 192
    //   825: invokestatic 197	com/iflytek/cloud/record/c$b:sleep	(J)V
    //   828: goto -700 -> 128
    //   831: astore_2
    //   832: aload_1
    //   833: monitorexit
    //   834: aload_2
    //   835: athrow
    //   836: aload_0
    //   837: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   840: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   843: aload_0
    //   844: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   847: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   850: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   853: aconst_null
    //   854: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   857: pop
    //   858: goto -295 -> 563
    //   861: astore_2
    //   862: aload_1
    //   863: monitorexit
    //   864: aload_2
    //   865: athrow
    //   866: aload_0
    //   867: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   870: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   873: aload_0
    //   874: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   877: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   880: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   883: aconst_null
    //   884: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   887: pop
    //   888: goto -456 -> 432
    //   891: astore_2
    //   892: aload_1
    //   893: monitorexit
    //   894: aload_2
    //   895: athrow
    //   896: aload_0
    //   897: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   900: invokestatic 65	com/iflytek/cloud/record/c:e	(Lcom/iflytek/cloud/record/c;)Landroid/content/Context;
    //   903: aload_0
    //   904: getfield 12	com/iflytek/cloud/record/c$b:a	Lcom/iflytek/cloud/record/c;
    //   907: invokestatic 68	com/iflytek/cloud/record/c:f	(Lcom/iflytek/cloud/record/c;)Z
    //   910: invokestatic 74	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   913: aconst_null
    //   914: invokestatic 174	com/iflytek/thirdparty/N:b	(Landroid/content/Context;Ljava/lang/Boolean;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Z
    //   917: pop
    //   918: goto -183 -> 735
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	921	0	this	b
    //   315	2	1	localException	Exception
    //   474	106	2	localObject3	Object
    //   581	4	2	localObject4	Object
    //   831	4	2	localObject5	Object
    //   861	4	2	localObject6	Object
    //   891	4	2	localObject7	Object
    //   217	37	3	i	int
    // Exception table:
    //   from	to	target	type
    //   0	75	315	java/lang/Exception
    //   75	95	315	java/lang/Exception
    //   128	168	315	java/lang/Exception
    //   168	207	315	java/lang/Exception
    //   207	229	315	java/lang/Exception
    //   233	264	315	java/lang/Exception
    //   264	288	315	java/lang/Exception
    //   288	312	315	java/lang/Exception
    //   449	471	315	java/lang/Exception
    //   584	586	315	java/lang/Exception
    //   586	627	315	java/lang/Exception
    //   627	647	315	java/lang/Exception
    //   747	778	315	java/lang/Exception
    //   778	784	315	java/lang/Exception
    //   787	822	315	java/lang/Exception
    //   822	828	315	java/lang/Exception
    //   0	75	474	finally
    //   75	95	474	finally
    //   128	168	474	finally
    //   168	207	474	finally
    //   207	229	474	finally
    //   233	264	474	finally
    //   264	288	474	finally
    //   288	312	474	finally
    //   316	344	474	finally
    //   449	471	474	finally
    //   584	586	474	finally
    //   586	627	474	finally
    //   627	647	474	finally
    //   747	778	474	finally
    //   778	784	474	finally
    //   787	822	474	finally
    //   822	828	474	finally
    //   95	126	581	finally
    //   126	128	581	finally
    //   582	584	581	finally
    //   485	496	831	finally
    //   832	834	831	finally
    //   354	365	861	finally
    //   862	864	861	finally
    //   657	668	891	finally
    //   892	894	891	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */