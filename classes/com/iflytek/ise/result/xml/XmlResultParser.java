package com.iflytek.ise.result.xml;

import android.text.TextUtils;
import android.util.Xml;
import com.iflytek.ise.result.FinalResult;
import com.iflytek.ise.result.Result;
import com.iflytek.ise.result.entity.Phone;
import com.iflytek.ise.result.entity.Sentence;
import com.iflytek.ise.result.entity.Syll;
import com.iflytek.ise.result.entity.Word;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class XmlResultParser
{
  private Phone createPhone(XmlPullParser paramXmlPullParser)
  {
    Phone localPhone = new Phone();
    localPhone.beg_pos = getInt(paramXmlPullParser, "beg_pos");
    localPhone.end_pos = getInt(paramXmlPullParser, "end_pos");
    localPhone.content = getContent(paramXmlPullParser);
    localPhone.dp_message = getInt(paramXmlPullParser, "dp_message");
    localPhone.time_len = getInt(paramXmlPullParser, "time_len");
    return localPhone;
  }
  
  private Sentence createSentence(XmlPullParser paramXmlPullParser)
  {
    Sentence localSentence = new Sentence();
    localSentence.beg_pos = getInt(paramXmlPullParser, "beg_pos");
    localSentence.end_pos = getInt(paramXmlPullParser, "end_pos");
    localSentence.content = getContent(paramXmlPullParser);
    localSentence.time_len = getInt(paramXmlPullParser, "time_len");
    localSentence.index = getInt(paramXmlPullParser, "index");
    localSentence.word_count = getInt(paramXmlPullParser, "word_count");
    return localSentence;
  }
  
  private Syll createSyll(XmlPullParser paramXmlPullParser)
  {
    Syll localSyll = new Syll();
    localSyll.beg_pos = getInt(paramXmlPullParser, "beg_pos");
    localSyll.end_pos = getInt(paramXmlPullParser, "end_pos");
    localSyll.content = getContent(paramXmlPullParser);
    localSyll.symbol = getSymbol(paramXmlPullParser);
    localSyll.dp_message = getInt(paramXmlPullParser, "dp_message");
    localSyll.time_len = getInt(paramXmlPullParser, "time_len");
    return localSyll;
  }
  
  private Word createWord(XmlPullParser paramXmlPullParser)
  {
    Word localWord = new Word();
    localWord.beg_pos = getInt(paramXmlPullParser, "beg_pos");
    localWord.end_pos = getInt(paramXmlPullParser, "end_pos");
    localWord.content = getContent(paramXmlPullParser);
    localWord.symbol = getSymbol(paramXmlPullParser);
    localWord.time_len = getInt(paramXmlPullParser, "time_len");
    localWord.dp_message = getInt(paramXmlPullParser, "dp_message");
    localWord.total_score = getFloat(paramXmlPullParser, "total_score");
    localWord.global_index = getInt(paramXmlPullParser, "global_index");
    localWord.index = getInt(paramXmlPullParser, "index");
    return localWord;
  }
  
  private String getContent(XmlPullParser paramXmlPullParser)
  {
    return paramXmlPullParser.getAttributeValue(null, "content");
  }
  
  private String getExceptInfo(XmlPullParser paramXmlPullParser)
  {
    return paramXmlPullParser.getAttributeValue(null, "except_info");
  }
  
  private float getFloat(XmlPullParser paramXmlPullParser, String paramString)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return 0.0F;
    }
    return Float.parseFloat(paramXmlPullParser);
  }
  
  private int getInt(XmlPullParser paramXmlPullParser, String paramString)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return 0;
    }
    return Integer.parseInt(paramXmlPullParser);
  }
  
  private boolean getIsRejected(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "is_rejected");
    if (paramXmlPullParser == null) {
      return false;
    }
    return Boolean.parseBoolean(paramXmlPullParser);
  }
  
  private String getLanguage(XmlPullParser paramXmlPullParser)
  {
    return paramXmlPullParser.getAttributeValue(null, "lan");
  }
  
  private String getSymbol(XmlPullParser paramXmlPullParser)
  {
    return paramXmlPullParser.getAttributeValue(null, "symbol");
  }
  
  /* Error */
  private Result parseResult(XmlPullParser paramXmlPullParser)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 147 1 0
    //   6: istore 9
    //   8: aconst_null
    //   9: astore 6
    //   11: aconst_null
    //   12: astore 5
    //   14: aconst_null
    //   15: astore 4
    //   17: iconst_0
    //   18: istore 11
    //   20: aconst_null
    //   21: astore 7
    //   23: aconst_null
    //   24: astore_2
    //   25: iload 9
    //   27: istore 10
    //   29: aload_2
    //   30: astore_3
    //   31: iconst_1
    //   32: iload 10
    //   34: if_icmpeq +108 -> 142
    //   37: iload 10
    //   39: tableswitch	default:+21->60, 2:+40->79, 3:+493->532
    //   60: iload 11
    //   62: istore 9
    //   64: aload_1
    //   65: invokeinterface 150 1 0
    //   70: istore 10
    //   72: iload 9
    //   74: istore 11
    //   76: goto -47 -> 29
    //   79: ldc -104
    //   81: aload_1
    //   82: invokeinterface 156 1 0
    //   87: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +9 -> 99
    //   93: iconst_1
    //   94: istore 9
    //   96: goto -32 -> 64
    //   99: ldc -92
    //   101: aload_1
    //   102: invokeinterface 156 1 0
    //   107: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifeq +47 -> 157
    //   113: iload 11
    //   115: ifne +29 -> 144
    //   118: new 166	com/iflytek/ise/result/ReadSyllableResult
    //   121: dup
    //   122: invokespecial 167	com/iflytek/ise/result/ReadSyllableResult:<init>	()V
    //   125: astore_3
    //   126: aload_3
    //   127: astore_2
    //   128: iload 11
    //   130: istore 9
    //   132: goto -68 -> 64
    //   135: astore_1
    //   136: aload_1
    //   137: invokevirtual 170	org/xmlpull/v1/XmlPullParserException:printStackTrace	()V
    //   140: aload_2
    //   141: astore_3
    //   142: aload_3
    //   143: areturn
    //   144: aload_0
    //   145: aload_2
    //   146: aload_1
    //   147: invokespecial 174	com/iflytek/ise/result/xml/XmlResultParser:readTotalResult	(Lcom/iflytek/ise/result/Result;Lorg/xmlpull/v1/XmlPullParser;)V
    //   150: iload 11
    //   152: istore 9
    //   154: goto -90 -> 64
    //   157: ldc -80
    //   159: aload_1
    //   160: invokeinterface 156 1 0
    //   165: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifeq +67 -> 235
    //   171: iload 11
    //   173: ifne +49 -> 222
    //   176: new 178	com/iflytek/ise/result/ReadWordResult
    //   179: dup
    //   180: invokespecial 179	com/iflytek/ise/result/ReadWordResult:<init>	()V
    //   183: astore_3
    //   184: aload_0
    //   185: aload_1
    //   186: invokespecial 181	com/iflytek/ise/result/xml/XmlResultParser:getLanguage	(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    //   189: astore 8
    //   191: aload 8
    //   193: astore_2
    //   194: aload 8
    //   196: ifnonnull +6 -> 202
    //   199: ldc -73
    //   201: astore_2
    //   202: aload_3
    //   203: aload_2
    //   204: putfield 188	com/iflytek/ise/result/Result:language	Ljava/lang/String;
    //   207: aload_3
    //   208: astore_2
    //   209: iload 11
    //   211: istore 9
    //   213: goto -149 -> 64
    //   216: astore_1
    //   217: aload_3
    //   218: astore_2
    //   219: goto -83 -> 136
    //   222: aload_0
    //   223: aload_2
    //   224: aload_1
    //   225: invokespecial 174	com/iflytek/ise/result/xml/XmlResultParser:readTotalResult	(Lcom/iflytek/ise/result/Result;Lorg/xmlpull/v1/XmlPullParser;)V
    //   228: iload 11
    //   230: istore 9
    //   232: goto -168 -> 64
    //   235: ldc -66
    //   237: aload_1
    //   238: invokeinterface 156 1 0
    //   243: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   246: ifne +17 -> 263
    //   249: ldc -64
    //   251: aload_1
    //   252: invokeinterface 156 1 0
    //   257: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   260: ifeq +67 -> 327
    //   263: iload 11
    //   265: ifne +49 -> 314
    //   268: new 194	com/iflytek/ise/result/ReadSentenceResult
    //   271: dup
    //   272: invokespecial 195	com/iflytek/ise/result/ReadSentenceResult:<init>	()V
    //   275: astore_3
    //   276: aload_0
    //   277: aload_1
    //   278: invokespecial 181	com/iflytek/ise/result/xml/XmlResultParser:getLanguage	(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    //   281: astore 8
    //   283: aload 8
    //   285: astore_2
    //   286: aload 8
    //   288: ifnonnull +6 -> 294
    //   291: ldc -73
    //   293: astore_2
    //   294: aload_3
    //   295: aload_2
    //   296: putfield 188	com/iflytek/ise/result/Result:language	Ljava/lang/String;
    //   299: aload_3
    //   300: astore_2
    //   301: iload 11
    //   303: istore 9
    //   305: goto -241 -> 64
    //   308: astore_1
    //   309: aload_3
    //   310: astore_2
    //   311: goto -175 -> 136
    //   314: aload_0
    //   315: aload_2
    //   316: aload_1
    //   317: invokespecial 174	com/iflytek/ise/result/xml/XmlResultParser:readTotalResult	(Lcom/iflytek/ise/result/Result;Lorg/xmlpull/v1/XmlPullParser;)V
    //   320: iload 11
    //   322: istore 9
    //   324: goto -260 -> 64
    //   327: ldc -59
    //   329: aload_1
    //   330: invokeinterface 156 1 0
    //   335: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   338: ifeq +35 -> 373
    //   341: aload_2
    //   342: getfield 201	com/iflytek/ise/result/Result:sentences	Ljava/util/ArrayList;
    //   345: ifnonnull +14 -> 359
    //   348: aload_2
    //   349: new 203	java/util/ArrayList
    //   352: dup
    //   353: invokespecial 204	java/util/ArrayList:<init>	()V
    //   356: putfield 201	com/iflytek/ise/result/Result:sentences	Ljava/util/ArrayList;
    //   359: aload_0
    //   360: aload_1
    //   361: invokespecial 206	com/iflytek/ise/result/xml/XmlResultParser:createSentence	(Lorg/xmlpull/v1/XmlPullParser;)Lcom/iflytek/ise/result/entity/Sentence;
    //   364: astore 4
    //   366: iload 11
    //   368: istore 9
    //   370: goto -306 -> 64
    //   373: ldc -48
    //   375: aload_1
    //   376: invokeinterface 156 1 0
    //   381: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   384: ifeq +42 -> 426
    //   387: aload 4
    //   389: ifnull +23 -> 412
    //   392: aload 4
    //   394: getfield 211	com/iflytek/ise/result/entity/Sentence:words	Ljava/util/ArrayList;
    //   397: ifnonnull +15 -> 412
    //   400: aload 4
    //   402: new 203	java/util/ArrayList
    //   405: dup
    //   406: invokespecial 204	java/util/ArrayList:<init>	()V
    //   409: putfield 211	com/iflytek/ise/result/entity/Sentence:words	Ljava/util/ArrayList;
    //   412: aload_0
    //   413: aload_1
    //   414: invokespecial 213	com/iflytek/ise/result/xml/XmlResultParser:createWord	(Lorg/xmlpull/v1/XmlPullParser;)Lcom/iflytek/ise/result/entity/Word;
    //   417: astore 5
    //   419: iload 11
    //   421: istore 9
    //   423: goto -359 -> 64
    //   426: ldc -41
    //   428: aload_1
    //   429: invokeinterface 156 1 0
    //   434: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   437: ifeq +42 -> 479
    //   440: aload 5
    //   442: ifnull +23 -> 465
    //   445: aload 5
    //   447: getfield 218	com/iflytek/ise/result/entity/Word:sylls	Ljava/util/ArrayList;
    //   450: ifnonnull +15 -> 465
    //   453: aload 5
    //   455: new 203	java/util/ArrayList
    //   458: dup
    //   459: invokespecial 204	java/util/ArrayList:<init>	()V
    //   462: putfield 218	com/iflytek/ise/result/entity/Word:sylls	Ljava/util/ArrayList;
    //   465: aload_0
    //   466: aload_1
    //   467: invokespecial 220	com/iflytek/ise/result/xml/XmlResultParser:createSyll	(Lorg/xmlpull/v1/XmlPullParser;)Lcom/iflytek/ise/result/entity/Syll;
    //   470: astore 6
    //   472: iload 11
    //   474: istore 9
    //   476: goto -412 -> 64
    //   479: ldc -34
    //   481: aload_1
    //   482: invokeinterface 156 1 0
    //   487: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   490: ifeq -430 -> 60
    //   493: aload 6
    //   495: ifnull +23 -> 518
    //   498: aload 6
    //   500: getfield 225	com/iflytek/ise/result/entity/Syll:phones	Ljava/util/ArrayList;
    //   503: ifnonnull +15 -> 518
    //   506: aload 6
    //   508: new 203	java/util/ArrayList
    //   511: dup
    //   512: invokespecial 204	java/util/ArrayList:<init>	()V
    //   515: putfield 225	com/iflytek/ise/result/entity/Syll:phones	Ljava/util/ArrayList;
    //   518: aload_0
    //   519: aload_1
    //   520: invokespecial 227	com/iflytek/ise/result/xml/XmlResultParser:createPhone	(Lorg/xmlpull/v1/XmlPullParser;)Lcom/iflytek/ise/result/entity/Phone;
    //   523: astore 7
    //   525: iload 11
    //   527: istore 9
    //   529: goto -465 -> 64
    //   532: ldc -34
    //   534: aload_1
    //   535: invokeinterface 156 1 0
    //   540: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   543: ifeq +21 -> 564
    //   546: aload 6
    //   548: getfield 225	com/iflytek/ise/result/entity/Syll:phones	Ljava/util/ArrayList;
    //   551: aload 7
    //   553: invokevirtual 230	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   556: pop
    //   557: iload 11
    //   559: istore 9
    //   561: goto -497 -> 64
    //   564: ldc -41
    //   566: aload_1
    //   567: invokeinterface 156 1 0
    //   572: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   575: ifeq +21 -> 596
    //   578: aload 5
    //   580: getfield 218	com/iflytek/ise/result/entity/Word:sylls	Ljava/util/ArrayList;
    //   583: aload 6
    //   585: invokevirtual 230	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   588: pop
    //   589: iload 11
    //   591: istore 9
    //   593: goto -529 -> 64
    //   596: ldc -48
    //   598: aload_1
    //   599: invokeinterface 156 1 0
    //   604: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   607: ifeq +21 -> 628
    //   610: aload 4
    //   612: getfield 211	com/iflytek/ise/result/entity/Sentence:words	Ljava/util/ArrayList;
    //   615: aload 5
    //   617: invokevirtual 230	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   620: pop
    //   621: iload 11
    //   623: istore 9
    //   625: goto -561 -> 64
    //   628: ldc -59
    //   630: aload_1
    //   631: invokeinterface 156 1 0
    //   636: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   639: ifeq +20 -> 659
    //   642: aload_2
    //   643: getfield 201	com/iflytek/ise/result/Result:sentences	Ljava/util/ArrayList;
    //   646: aload 4
    //   648: invokevirtual 230	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   651: pop
    //   652: iload 11
    //   654: istore 9
    //   656: goto -592 -> 64
    //   659: aload_2
    //   660: astore_3
    //   661: ldc -92
    //   663: aload_1
    //   664: invokeinterface 156 1 0
    //   669: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   672: ifne -530 -> 142
    //   675: aload_2
    //   676: astore_3
    //   677: ldc -80
    //   679: aload_1
    //   680: invokeinterface 156 1 0
    //   685: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   688: ifne -546 -> 142
    //   691: ldc -66
    //   693: aload_1
    //   694: invokeinterface 156 1 0
    //   699: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   702: istore 12
    //   704: iload 12
    //   706: ifeq -646 -> 60
    //   709: aload_2
    //   710: areturn
    //   711: astore_1
    //   712: aconst_null
    //   713: astore_2
    //   714: aload_1
    //   715: invokevirtual 231	java/io/IOException:printStackTrace	()V
    //   718: aload_2
    //   719: areturn
    //   720: astore_1
    //   721: goto -7 -> 714
    //   724: astore_1
    //   725: goto -11 -> 714
    //   728: astore_1
    //   729: aload_3
    //   730: astore_2
    //   731: goto -17 -> 714
    //   734: astore_1
    //   735: aload_3
    //   736: astore_2
    //   737: goto -23 -> 714
    //   740: astore_1
    //   741: aconst_null
    //   742: astore_2
    //   743: goto -607 -> 136
    //   746: astore_1
    //   747: goto -611 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	750	0	this	XmlResultParser
    //   0	750	1	paramXmlPullParser	XmlPullParser
    //   24	719	2	localObject1	Object
    //   30	706	3	localObject2	Object
    //   15	632	4	localSentence	Sentence
    //   12	604	5	localWord	Word
    //   9	575	6	localSyll	Syll
    //   21	531	7	localPhone	Phone
    //   189	98	8	str	String
    //   6	649	9	i	int
    //   27	44	10	j	int
    //   18	635	11	k	int
    //   702	3	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   79	93	135	org/xmlpull/v1/XmlPullParserException
    //   99	113	135	org/xmlpull/v1/XmlPullParserException
    //   118	126	135	org/xmlpull/v1/XmlPullParserException
    //   144	150	135	org/xmlpull/v1/XmlPullParserException
    //   157	171	135	org/xmlpull/v1/XmlPullParserException
    //   176	184	135	org/xmlpull/v1/XmlPullParserException
    //   222	228	135	org/xmlpull/v1/XmlPullParserException
    //   235	263	135	org/xmlpull/v1/XmlPullParserException
    //   268	276	135	org/xmlpull/v1/XmlPullParserException
    //   314	320	135	org/xmlpull/v1/XmlPullParserException
    //   327	359	135	org/xmlpull/v1/XmlPullParserException
    //   359	366	135	org/xmlpull/v1/XmlPullParserException
    //   373	387	135	org/xmlpull/v1/XmlPullParserException
    //   392	412	135	org/xmlpull/v1/XmlPullParserException
    //   412	419	135	org/xmlpull/v1/XmlPullParserException
    //   426	440	135	org/xmlpull/v1/XmlPullParserException
    //   445	465	135	org/xmlpull/v1/XmlPullParserException
    //   465	472	135	org/xmlpull/v1/XmlPullParserException
    //   479	493	135	org/xmlpull/v1/XmlPullParserException
    //   498	518	135	org/xmlpull/v1/XmlPullParserException
    //   518	525	135	org/xmlpull/v1/XmlPullParserException
    //   532	557	135	org/xmlpull/v1/XmlPullParserException
    //   564	589	135	org/xmlpull/v1/XmlPullParserException
    //   596	621	135	org/xmlpull/v1/XmlPullParserException
    //   628	652	135	org/xmlpull/v1/XmlPullParserException
    //   661	675	135	org/xmlpull/v1/XmlPullParserException
    //   677	704	135	org/xmlpull/v1/XmlPullParserException
    //   184	191	216	org/xmlpull/v1/XmlPullParserException
    //   202	207	216	org/xmlpull/v1/XmlPullParserException
    //   276	283	308	org/xmlpull/v1/XmlPullParserException
    //   294	299	308	org/xmlpull/v1/XmlPullParserException
    //   0	8	711	java/io/IOException
    //   64	72	720	java/io/IOException
    //   79	93	724	java/io/IOException
    //   99	113	724	java/io/IOException
    //   118	126	724	java/io/IOException
    //   144	150	724	java/io/IOException
    //   157	171	724	java/io/IOException
    //   176	184	724	java/io/IOException
    //   222	228	724	java/io/IOException
    //   235	263	724	java/io/IOException
    //   268	276	724	java/io/IOException
    //   314	320	724	java/io/IOException
    //   327	359	724	java/io/IOException
    //   359	366	724	java/io/IOException
    //   373	387	724	java/io/IOException
    //   392	412	724	java/io/IOException
    //   412	419	724	java/io/IOException
    //   426	440	724	java/io/IOException
    //   445	465	724	java/io/IOException
    //   465	472	724	java/io/IOException
    //   479	493	724	java/io/IOException
    //   498	518	724	java/io/IOException
    //   518	525	724	java/io/IOException
    //   532	557	724	java/io/IOException
    //   564	589	724	java/io/IOException
    //   596	621	724	java/io/IOException
    //   628	652	724	java/io/IOException
    //   661	675	724	java/io/IOException
    //   677	704	724	java/io/IOException
    //   184	191	728	java/io/IOException
    //   202	207	728	java/io/IOException
    //   276	283	734	java/io/IOException
    //   294	299	734	java/io/IOException
    //   0	8	740	org/xmlpull/v1/XmlPullParserException
    //   64	72	746	org/xmlpull/v1/XmlPullParserException
  }
  
  private void readTotalResult(Result paramResult, XmlPullParser paramXmlPullParser)
  {
    paramResult.beg_pos = getInt(paramXmlPullParser, "beg_pos");
    paramResult.end_pos = getInt(paramXmlPullParser, "end_pos");
    paramResult.content = getContent(paramXmlPullParser);
    paramResult.total_score = getFloat(paramXmlPullParser, "total_score");
    paramResult.time_len = getInt(paramXmlPullParser, "time_len");
    paramResult.except_info = getExceptInfo(paramXmlPullParser);
    paramResult.is_rejected = getIsRejected(paramXmlPullParser);
  }
  
  public Result parse(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    for (;;)
    {
      try
      {
        localXmlPullParser.setInput(new ByteArrayInputStream(paramString.getBytes()), "utf-8");
        i = localXmlPullParser.getEventType();
        paramString = null;
      }
      catch (XmlPullParserException paramString)
      {
        boolean bool;
        paramString.printStackTrace();
        return null;
      }
      catch (IOException paramString)
      {
        paramString.printStackTrace();
        return null;
      }
      int i = localXmlPullParser.next();
      if ("FinalResult".equals(localXmlPullParser.getName()))
      {
        paramString = new FinalResult();
      }
      else if ("ret".equals(localXmlPullParser.getName()))
      {
        paramString.ret = getInt(localXmlPullParser, "value");
      }
      else if ("total_score".equals(localXmlPullParser.getName()))
      {
        paramString.total_score = getFloat(localXmlPullParser, "value");
      }
      else if ("xml_result".equals(localXmlPullParser.getName()))
      {
        return parseResult(localXmlPullParser);
        bool = "FinalResult".equals(localXmlPullParser.getName());
        if (bool)
        {
          return paramString;
          if (1 == i) {
            break;
          }
          switch (i)
          {
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\xml\XmlResultParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */