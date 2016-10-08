package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class BDLocation
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new n();
  private int A = 1;
  private String B = null;
  private int C;
  private String D = "";
  private List E = null;
  private int a = 0;
  private String b = null;
  private double c = Double.MIN_VALUE;
  private double d = Double.MIN_VALUE;
  private boolean e = false;
  private double f = Double.MIN_VALUE;
  private boolean g = false;
  private float h = 0.0F;
  private boolean i = false;
  private float j = 0.0F;
  private boolean k = false;
  private int l = -1;
  private float m = -1.0F;
  private String n = null;
  private boolean o = false;
  private String p = null;
  private String q = null;
  private String r = null;
  private String s = null;
  private boolean t = false;
  private a u = new c().a();
  private String v = null;
  private String w = null;
  private String x = null;
  private boolean y = false;
  private int z = 0;
  
  public BDLocation() {}
  
  private BDLocation(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readDouble();
    this.d = paramParcel.readDouble();
    this.f = paramParcel.readDouble();
    this.h = paramParcel.readFloat();
    this.j = paramParcel.readFloat();
    this.l = paramParcel.readInt();
    this.m = paramParcel.readFloat();
    this.v = paramParcel.readString();
    this.z = paramParcel.readInt();
    this.w = paramParcel.readString();
    this.x = paramParcel.readString();
    this.B = paramParcel.readString();
    Object localObject = paramParcel.readString();
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    String str5 = paramParcel.readString();
    paramParcel.readString();
    String str6 = paramParcel.readString();
    String str7 = paramParcel.readString();
    this.u = new c().a(str6).b(str7).c((String)localObject).d(str1).e(str5).f(str2).g(str3).h(str4).a();
    localObject = new boolean[7];
    this.C = paramParcel.readInt();
    this.D = paramParcel.readString();
    this.q = paramParcel.readString();
    this.r = paramParcel.readString();
    this.s = paramParcel.readString();
    this.A = paramParcel.readInt();
    try
    {
      paramParcel.readBooleanArray((boolean[])localObject);
      this.e = localObject[0];
      this.g = localObject[1];
      this.i = localObject[2];
      this.k = localObject[3];
      this.o = localObject[4];
      this.t = localObject[5];
      this.y = localObject[6];
      localObject = new ArrayList();
      paramParcel.readList((List)localObject, Poi.class.getClassLoader());
      if (((List)localObject).size() == 0)
      {
        this.E = null;
        return;
      }
      this.E = ((List)localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public BDLocation(BDLocation paramBDLocation)
  {
    this.a = paramBDLocation.a;
    this.b = paramBDLocation.b;
    this.c = paramBDLocation.c;
    this.d = paramBDLocation.d;
    this.e = paramBDLocation.e;
    this.f = paramBDLocation.f;
    this.g = paramBDLocation.g;
    this.h = paramBDLocation.h;
    this.i = paramBDLocation.i;
    this.j = paramBDLocation.j;
    this.k = paramBDLocation.k;
    this.l = paramBDLocation.l;
    this.m = paramBDLocation.m;
    this.n = paramBDLocation.n;
    this.o = paramBDLocation.o;
    this.p = paramBDLocation.p;
    this.t = paramBDLocation.t;
    this.u = new c().a(paramBDLocation.u.a).b(paramBDLocation.u.b).c(paramBDLocation.u.c).d(paramBDLocation.u.d).e(paramBDLocation.u.e).f(paramBDLocation.u.f).g(paramBDLocation.u.g).h(paramBDLocation.u.h).a();
    this.v = paramBDLocation.v;
    this.w = paramBDLocation.w;
    this.x = paramBDLocation.x;
    this.A = paramBDLocation.A;
    this.z = paramBDLocation.z;
    this.y = paramBDLocation.y;
    this.B = paramBDLocation.B;
    this.C = paramBDLocation.C;
    this.D = paramBDLocation.D;
    this.q = paramBDLocation.q;
    this.r = paramBDLocation.r;
    this.s = paramBDLocation.s;
    if (paramBDLocation.E == null)
    {
      this.E = null;
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < paramBDLocation.E.size())
    {
      Poi localPoi = (Poi)paramBDLocation.E.get(i1);
      localArrayList.add(new Poi(localPoi.a(), localPoi.c(), localPoi.b()));
      i1 += 1;
    }
    this.E = localArrayList;
  }
  
  /* Error */
  public BDLocation(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aload_0
    //   4: invokespecial 56	java/lang/Object:<init>	()V
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield 58	com/baidu/location/BDLocation:a	I
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield 60	com/baidu/location/BDLocation:b	Ljava/lang/String;
    //   17: aload_0
    //   18: ldc2_w 61
    //   21: putfield 64	com/baidu/location/BDLocation:c	D
    //   24: aload_0
    //   25: ldc2_w 61
    //   28: putfield 66	com/baidu/location/BDLocation:d	D
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield 68	com/baidu/location/BDLocation:e	Z
    //   36: aload_0
    //   37: ldc2_w 61
    //   40: putfield 70	com/baidu/location/BDLocation:f	D
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 72	com/baidu/location/BDLocation:g	Z
    //   48: aload_0
    //   49: fconst_0
    //   50: putfield 74	com/baidu/location/BDLocation:h	F
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield 76	com/baidu/location/BDLocation:i	Z
    //   58: aload_0
    //   59: fconst_0
    //   60: putfield 78	com/baidu/location/BDLocation:j	F
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 80	com/baidu/location/BDLocation:k	Z
    //   68: aload_0
    //   69: iconst_m1
    //   70: putfield 82	com/baidu/location/BDLocation:l	I
    //   73: aload_0
    //   74: ldc 83
    //   76: putfield 85	com/baidu/location/BDLocation:m	F
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 87	com/baidu/location/BDLocation:n	Ljava/lang/String;
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield 89	com/baidu/location/BDLocation:o	Z
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield 91	com/baidu/location/BDLocation:p	Ljava/lang/String;
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 93	com/baidu/location/BDLocation:q	Ljava/lang/String;
    //   99: aload_0
    //   100: aconst_null
    //   101: putfield 95	com/baidu/location/BDLocation:r	Ljava/lang/String;
    //   104: aload_0
    //   105: aconst_null
    //   106: putfield 97	com/baidu/location/BDLocation:s	Ljava/lang/String;
    //   109: aload_0
    //   110: iconst_0
    //   111: putfield 99	com/baidu/location/BDLocation:t	Z
    //   114: aload_0
    //   115: new 101	com/baidu/location/c
    //   118: dup
    //   119: invokespecial 102	com/baidu/location/c:<init>	()V
    //   122: invokevirtual 105	com/baidu/location/c:a	()Lcom/baidu/location/a;
    //   125: putfield 107	com/baidu/location/BDLocation:u	Lcom/baidu/location/a;
    //   128: aload_0
    //   129: aconst_null
    //   130: putfield 109	com/baidu/location/BDLocation:v	Ljava/lang/String;
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 111	com/baidu/location/BDLocation:w	Ljava/lang/String;
    //   138: aload_0
    //   139: aconst_null
    //   140: putfield 113	com/baidu/location/BDLocation:x	Ljava/lang/String;
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield 115	com/baidu/location/BDLocation:y	Z
    //   148: aload_0
    //   149: iconst_0
    //   150: putfield 117	com/baidu/location/BDLocation:z	I
    //   153: aload_0
    //   154: iconst_1
    //   155: putfield 119	com/baidu/location/BDLocation:A	I
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield 121	com/baidu/location/BDLocation:B	Ljava/lang/String;
    //   163: aload_0
    //   164: ldc 123
    //   166: putfield 125	com/baidu/location/BDLocation:D	Ljava/lang/String;
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 127	com/baidu/location/BDLocation:E	Ljava/util/List;
    //   174: aload_1
    //   175: ifnull +12 -> 187
    //   178: aload_1
    //   179: ldc 123
    //   181: invokevirtual 235	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   184: ifeq +4 -> 188
    //   187: return
    //   188: new 237	org/json/JSONObject
    //   191: dup
    //   192: aload_1
    //   193: invokespecial 239	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   196: astore_1
    //   197: aload_1
    //   198: ldc -15
    //   200: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   203: astore_2
    //   204: aload_2
    //   205: ldc -9
    //   207: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   210: invokestatic 257	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   213: istore 11
    //   215: aload_0
    //   216: iload 11
    //   218: invokevirtual 260	com/baidu/location/BDLocation:a	(I)V
    //   221: aload_0
    //   222: aload_2
    //   223: ldc_w 262
    //   226: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   229: invokevirtual 264	com/baidu/location/BDLocation:a	(Ljava/lang/String;)V
    //   232: iload 11
    //   234: bipush 61
    //   236: if_icmpne +203 -> 439
    //   239: aload_1
    //   240: ldc_w 266
    //   243: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   246: astore_1
    //   247: aload_1
    //   248: ldc_w 268
    //   251: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   254: astore_2
    //   255: aload_0
    //   256: aload_2
    //   257: ldc_w 269
    //   260: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   263: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   266: invokevirtual 278	com/baidu/location/BDLocation:a	(D)V
    //   269: aload_0
    //   270: aload_2
    //   271: ldc_w 279
    //   274: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   277: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   280: invokevirtual 281	com/baidu/location/BDLocation:b	(D)V
    //   283: aload_0
    //   284: aload_1
    //   285: ldc_w 283
    //   288: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   291: invokestatic 289	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   294: invokevirtual 292	com/baidu/location/BDLocation:b	(F)V
    //   297: aload_0
    //   298: aload_1
    //   299: ldc_w 293
    //   302: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   305: invokestatic 289	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   308: invokevirtual 295	com/baidu/location/BDLocation:a	(F)V
    //   311: aload_0
    //   312: aload_1
    //   313: ldc_w 296
    //   316: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   319: invokestatic 289	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   322: invokevirtual 298	com/baidu/location/BDLocation:c	(F)V
    //   325: aload_0
    //   326: aload_1
    //   327: ldc_w 299
    //   330: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   333: invokestatic 257	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   336: invokevirtual 301	com/baidu/location/BDLocation:b	(I)V
    //   339: aload_1
    //   340: ldc_w 302
    //   343: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   346: istore 12
    //   348: iload 12
    //   350: ifeq +14 -> 364
    //   353: aload_0
    //   354: aload_1
    //   355: ldc_w 302
    //   358: invokevirtual 309	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   361: invokevirtual 311	com/baidu/location/BDLocation:c	(D)V
    //   364: aload_1
    //   365: ldc_w 313
    //   368: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   371: ifeq +48 -> 419
    //   374: aload_0
    //   375: aload_1
    //   376: ldc_w 313
    //   379: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   382: invokestatic 257	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   385: invokevirtual 315	com/baidu/location/BDLocation:c	(I)V
    //   388: aload_0
    //   389: getfield 119	com/baidu/location/BDLocation:A	I
    //   392: ifne +39 -> 431
    //   395: aload_0
    //   396: ldc_w 317
    //   399: invokevirtual 319	com/baidu/location/BDLocation:b	(Ljava/lang/String;)V
    //   402: return
    //   403: astore_1
    //   404: aload_1
    //   405: invokevirtual 322	java/lang/Exception:printStackTrace	()V
    //   408: aload_0
    //   409: iconst_0
    //   410: putfield 58	com/baidu/location/BDLocation:a	I
    //   413: aload_0
    //   414: iconst_0
    //   415: putfield 89	com/baidu/location/BDLocation:o	Z
    //   418: return
    //   419: aload_0
    //   420: iconst_1
    //   421: invokevirtual 315	com/baidu/location/BDLocation:c	(I)V
    //   424: goto -36 -> 388
    //   427: astore_1
    //   428: goto -40 -> 388
    //   431: aload_0
    //   432: ldc_w 324
    //   435: invokevirtual 319	com/baidu/location/BDLocation:b	(Ljava/lang/String;)V
    //   438: return
    //   439: iload 11
    //   441: sipush 161
    //   444: if_icmpne +908 -> 1352
    //   447: aload_1
    //   448: ldc_w 266
    //   451: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   454: astore 9
    //   456: aload 9
    //   458: ldc_w 268
    //   461: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   464: astore_1
    //   465: aload_0
    //   466: aload_1
    //   467: ldc_w 269
    //   470: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   473: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   476: invokevirtual 278	com/baidu/location/BDLocation:a	(D)V
    //   479: aload_0
    //   480: aload_1
    //   481: ldc_w 279
    //   484: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   487: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   490: invokevirtual 281	com/baidu/location/BDLocation:b	(D)V
    //   493: aload_0
    //   494: aload 9
    //   496: ldc_w 283
    //   499: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   502: invokestatic 289	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   505: invokevirtual 292	com/baidu/location/BDLocation:b	(F)V
    //   508: aload 9
    //   510: ldc_w 326
    //   513: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   516: ifeq +219 -> 735
    //   519: aload 9
    //   521: ldc_w 326
    //   524: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   527: astore_1
    //   528: aload_1
    //   529: ldc_w 328
    //   532: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   535: ifeq +23 -> 558
    //   538: aload_1
    //   539: ldc_w 328
    //   542: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   545: astore_2
    //   546: aload_2
    //   547: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   550: ifne +111 -> 661
    //   553: aload_0
    //   554: aload_2
    //   555: putfield 93	com/baidu/location/BDLocation:q	Ljava/lang/String;
    //   558: aload_1
    //   559: ldc_w 336
    //   562: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   565: ifeq +110 -> 675
    //   568: aload_1
    //   569: ldc_w 336
    //   572: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   575: ldc_w 338
    //   578: invokevirtual 342	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   581: astore_2
    //   582: new 173	java/util/ArrayList
    //   585: dup
    //   586: invokespecial 174	java/util/ArrayList:<init>	()V
    //   589: astore_3
    //   590: iconst_0
    //   591: istore 11
    //   593: iload 11
    //   595: aload_2
    //   596: invokevirtual 347	org/json/JSONArray:length	()I
    //   599: if_icmpge +71 -> 670
    //   602: aload_2
    //   603: iload 11
    //   605: invokevirtual 350	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   608: astore 4
    //   610: aload 4
    //   612: ldc_w 352
    //   615: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   618: astore 5
    //   620: aload_3
    //   621: new 176	com/baidu/location/Poi
    //   624: dup
    //   625: aload 4
    //   627: ldc_w 354
    //   630: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   633: aload 5
    //   635: aload 4
    //   637: ldc_w 356
    //   640: invokevirtual 309	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   643: invokespecial 225	com/baidu/location/Poi:<init>	(Ljava/lang/String;Ljava/lang/String;D)V
    //   646: invokeinterface 229 2 0
    //   651: pop
    //   652: iload 11
    //   654: iconst_1
    //   655: iadd
    //   656: istore 11
    //   658: goto -65 -> 593
    //   661: aload_0
    //   662: ldc 123
    //   664: putfield 93	com/baidu/location/BDLocation:q	Ljava/lang/String;
    //   667: goto -109 -> 558
    //   670: aload_0
    //   671: aload_3
    //   672: putfield 127	com/baidu/location/BDLocation:E	Ljava/util/List;
    //   675: aload_1
    //   676: ldc_w 358
    //   679: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   682: ifeq +23 -> 705
    //   685: aload_1
    //   686: ldc_w 358
    //   689: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   692: astore_2
    //   693: aload_2
    //   694: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   697: ifne +8 -> 705
    //   700: aload_0
    //   701: aload_2
    //   702: putfield 95	com/baidu/location/BDLocation:r	Ljava/lang/String;
    //   705: aload_1
    //   706: ldc_w 360
    //   709: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   712: ifeq +23 -> 735
    //   715: aload_1
    //   716: ldc_w 360
    //   719: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   722: astore_1
    //   723: aload_1
    //   724: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   727: ifne +8 -> 735
    //   730: aload_0
    //   731: aload_1
    //   732: putfield 97	com/baidu/location/BDLocation:s	Ljava/lang/String;
    //   735: aload 9
    //   737: ldc_w 362
    //   740: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   743: ifeq +318 -> 1061
    //   746: aload 9
    //   748: ldc_w 362
    //   751: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   754: ldc_w 364
    //   757: invokevirtual 368	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   760: astore 10
    //   762: aload 10
    //   764: arraylength
    //   765: istore 11
    //   767: iload 11
    //   769: ifle +492 -> 1261
    //   772: aload 10
    //   774: iconst_0
    //   775: aaload
    //   776: astore_1
    //   777: goto +486 -> 1263
    //   780: aload_0
    //   781: new 101	com/baidu/location/c
    //   784: dup
    //   785: invokespecial 102	com/baidu/location/c:<init>	()V
    //   788: aload 7
    //   790: invokevirtual 151	com/baidu/location/c:a	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   793: aload 8
    //   795: invokevirtual 153	com/baidu/location/c:b	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   798: aload_1
    //   799: invokevirtual 155	com/baidu/location/c:c	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   802: aload_2
    //   803: invokevirtual 157	com/baidu/location/c:d	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   806: aload 6
    //   808: invokevirtual 159	com/baidu/location/c:e	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   811: aload_3
    //   812: invokevirtual 161	com/baidu/location/c:f	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   815: aload 4
    //   817: invokevirtual 163	com/baidu/location/c:g	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   820: aload 5
    //   822: invokevirtual 165	com/baidu/location/c:h	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   825: invokevirtual 105	com/baidu/location/c:a	()Lcom/baidu/location/a;
    //   828: putfield 107	com/baidu/location/BDLocation:u	Lcom/baidu/location/a;
    //   831: aload_0
    //   832: iconst_1
    //   833: putfield 89	com/baidu/location/BDLocation:o	Z
    //   836: aload 9
    //   838: ldc_w 370
    //   841: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   844: ifeq +30 -> 874
    //   847: aload_0
    //   848: aload 9
    //   850: ldc_w 370
    //   853: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   856: putfield 109	com/baidu/location/BDLocation:v	Ljava/lang/String;
    //   859: aload_0
    //   860: getfield 109	com/baidu/location/BDLocation:v	Ljava/lang/String;
    //   863: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   866: ifeq +8 -> 874
    //   869: aload_0
    //   870: aconst_null
    //   871: putfield 109	com/baidu/location/BDLocation:v	Ljava/lang/String;
    //   874: aload 9
    //   876: ldc_w 372
    //   879: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   882: ifeq +30 -> 912
    //   885: aload_0
    //   886: aload 9
    //   888: ldc_w 372
    //   891: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   894: putfield 121	com/baidu/location/BDLocation:B	Ljava/lang/String;
    //   897: aload_0
    //   898: getfield 121	com/baidu/location/BDLocation:B	Ljava/lang/String;
    //   901: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   904: ifeq +8 -> 912
    //   907: aload_0
    //   908: aconst_null
    //   909: putfield 121	com/baidu/location/BDLocation:B	Ljava/lang/String;
    //   912: aload 9
    //   914: ldc_w 374
    //   917: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   920: ifeq +30 -> 950
    //   923: aload_0
    //   924: aload 9
    //   926: ldc_w 374
    //   929: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   932: putfield 111	com/baidu/location/BDLocation:w	Ljava/lang/String;
    //   935: aload_0
    //   936: getfield 111	com/baidu/location/BDLocation:w	Ljava/lang/String;
    //   939: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   942: ifeq +8 -> 950
    //   945: aload_0
    //   946: aconst_null
    //   947: putfield 111	com/baidu/location/BDLocation:w	Ljava/lang/String;
    //   950: aload 9
    //   952: ldc_w 376
    //   955: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   958: ifeq +30 -> 988
    //   961: aload_0
    //   962: aload 9
    //   964: ldc_w 376
    //   967: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   970: putfield 113	com/baidu/location/BDLocation:x	Ljava/lang/String;
    //   973: aload_0
    //   974: getfield 113	com/baidu/location/BDLocation:x	Ljava/lang/String;
    //   977: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   980: ifeq +8 -> 988
    //   983: aload_0
    //   984: aconst_null
    //   985: putfield 113	com/baidu/location/BDLocation:x	Ljava/lang/String;
    //   988: aload 9
    //   990: ldc_w 378
    //   993: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   996: ifeq +24 -> 1020
    //   999: aload 9
    //   1001: ldc_w 378
    //   1004: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1007: astore_1
    //   1008: aload_1
    //   1009: invokestatic 334	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1012: ifeq +62 -> 1074
    //   1015: aload_0
    //   1016: iconst_0
    //   1017: putfield 117	com/baidu/location/BDLocation:z	I
    //   1020: aload 9
    //   1022: ldc_w 313
    //   1025: invokevirtual 306	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   1028: ifeq +78 -> 1106
    //   1031: aload_0
    //   1032: aload 9
    //   1034: ldc_w 313
    //   1037: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1040: invokestatic 257	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   1043: invokevirtual 315	com/baidu/location/BDLocation:c	(I)V
    //   1046: aload_0
    //   1047: getfield 119	com/baidu/location/BDLocation:A	I
    //   1050: ifne +68 -> 1118
    //   1053: aload_0
    //   1054: ldc_w 317
    //   1057: invokevirtual 319	com/baidu/location/BDLocation:b	(Ljava/lang/String;)V
    //   1060: return
    //   1061: aload_0
    //   1062: iconst_0
    //   1063: putfield 89	com/baidu/location/BDLocation:o	Z
    //   1066: aload_0
    //   1067: aconst_null
    //   1068: invokevirtual 380	com/baidu/location/BDLocation:c	(Ljava/lang/String;)V
    //   1071: goto -235 -> 836
    //   1074: aload_1
    //   1075: ldc_w 382
    //   1078: invokevirtual 235	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1081: ifeq +11 -> 1092
    //   1084: aload_0
    //   1085: iconst_0
    //   1086: putfield 117	com/baidu/location/BDLocation:z	I
    //   1089: goto -69 -> 1020
    //   1092: aload_0
    //   1093: aload_1
    //   1094: invokestatic 386	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1097: invokevirtual 389	java/lang/Integer:intValue	()I
    //   1100: putfield 117	com/baidu/location/BDLocation:z	I
    //   1103: goto -83 -> 1020
    //   1106: aload_0
    //   1107: iconst_1
    //   1108: invokevirtual 315	com/baidu/location/BDLocation:c	(I)V
    //   1111: goto -65 -> 1046
    //   1114: astore_1
    //   1115: goto -69 -> 1046
    //   1118: aload_0
    //   1119: ldc_w 324
    //   1122: invokevirtual 319	com/baidu/location/BDLocation:b	(Ljava/lang/String;)V
    //   1125: return
    //   1126: aload_1
    //   1127: ldc_w 266
    //   1130: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1133: astore_1
    //   1134: aload_1
    //   1135: ldc_w 268
    //   1138: invokevirtual 245	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1141: astore_2
    //   1142: aload_0
    //   1143: aload_2
    //   1144: ldc_w 269
    //   1147: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1150: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   1153: invokevirtual 278	com/baidu/location/BDLocation:a	(D)V
    //   1156: aload_0
    //   1157: aload_2
    //   1158: ldc_w 279
    //   1161: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1164: invokestatic 275	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   1167: invokevirtual 281	com/baidu/location/BDLocation:b	(D)V
    //   1170: aload_0
    //   1171: aload_1
    //   1172: ldc_w 283
    //   1175: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1178: invokestatic 289	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   1181: invokevirtual 292	com/baidu/location/BDLocation:b	(F)V
    //   1184: aload_0
    //   1185: aload_1
    //   1186: ldc_w 391
    //   1189: invokevirtual 251	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1192: invokestatic 396	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   1195: invokestatic 399	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1198: invokespecial 402	com/baidu/location/BDLocation:a	(Ljava/lang/Boolean;)V
    //   1201: aload_0
    //   1202: ldc_w 324
    //   1205: invokevirtual 319	com/baidu/location/BDLocation:b	(Ljava/lang/String;)V
    //   1208: return
    //   1209: iload 11
    //   1211: sipush 167
    //   1214: if_icmpne -1027 -> 187
    //   1217: aload_0
    //   1218: iconst_2
    //   1219: invokevirtual 315	com/baidu/location/BDLocation:c	(I)V
    //   1222: return
    //   1223: astore_2
    //   1224: goto -860 -> 364
    //   1227: aconst_null
    //   1228: astore 7
    //   1230: goto +105 -> 1335
    //   1233: aconst_null
    //   1234: astore 6
    //   1236: goto +85 -> 1321
    //   1239: aconst_null
    //   1240: astore 5
    //   1242: goto +67 -> 1309
    //   1245: aconst_null
    //   1246: astore 4
    //   1248: goto +49 -> 1297
    //   1251: aconst_null
    //   1252: astore_3
    //   1253: goto +32 -> 1285
    //   1256: aconst_null
    //   1257: astore_2
    //   1258: goto +16 -> 1274
    //   1261: aconst_null
    //   1262: astore_1
    //   1263: iload 11
    //   1265: iconst_1
    //   1266: if_icmple -10 -> 1256
    //   1269: aload 10
    //   1271: iconst_1
    //   1272: aaload
    //   1273: astore_2
    //   1274: iload 11
    //   1276: iconst_2
    //   1277: if_icmple -26 -> 1251
    //   1280: aload 10
    //   1282: iconst_2
    //   1283: aaload
    //   1284: astore_3
    //   1285: iload 11
    //   1287: iconst_3
    //   1288: if_icmple -43 -> 1245
    //   1291: aload 10
    //   1293: iconst_3
    //   1294: aaload
    //   1295: astore 4
    //   1297: iload 11
    //   1299: iconst_4
    //   1300: if_icmple -61 -> 1239
    //   1303: aload 10
    //   1305: iconst_4
    //   1306: aaload
    //   1307: astore 5
    //   1309: iload 11
    //   1311: iconst_5
    //   1312: if_icmple -79 -> 1233
    //   1315: aload 10
    //   1317: iconst_5
    //   1318: aaload
    //   1319: astore 6
    //   1321: iload 11
    //   1323: bipush 6
    //   1325: if_icmple -98 -> 1227
    //   1328: aload 10
    //   1330: bipush 6
    //   1332: aaload
    //   1333: astore 7
    //   1335: iload 11
    //   1337: bipush 7
    //   1339: if_icmple -559 -> 780
    //   1342: aload 10
    //   1344: bipush 7
    //   1346: aaload
    //   1347: astore 8
    //   1349: goto -569 -> 780
    //   1352: iload 11
    //   1354: bipush 66
    //   1356: if_icmpeq -230 -> 1126
    //   1359: iload 11
    //   1361: bipush 68
    //   1363: if_icmpne -154 -> 1209
    //   1366: goto -240 -> 1126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1369	0	this	BDLocation
    //   0	1369	1	paramString	String
    //   203	955	2	localObject1	Object
    //   1223	1	2	localException	Exception
    //   1257	17	2	localObject2	Object
    //   589	696	3	localArrayList	ArrayList
    //   608	688	4	localJSONObject1	org.json.JSONObject
    //   618	690	5	str1	String
    //   806	514	6	str2	String
    //   788	546	7	str3	String
    //   1	1347	8	str4	String
    //   454	579	9	localJSONObject2	org.json.JSONObject
    //   760	583	10	arrayOfString	String[]
    //   213	1151	11	i1	int
    //   346	3	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   188	232	403	java/lang/Exception
    //   239	348	403	java/lang/Exception
    //   388	402	403	java/lang/Exception
    //   431	438	403	java/lang/Exception
    //   447	558	403	java/lang/Exception
    //   558	590	403	java/lang/Exception
    //   593	652	403	java/lang/Exception
    //   661	667	403	java/lang/Exception
    //   670	675	403	java/lang/Exception
    //   675	705	403	java/lang/Exception
    //   705	735	403	java/lang/Exception
    //   735	767	403	java/lang/Exception
    //   780	836	403	java/lang/Exception
    //   836	874	403	java/lang/Exception
    //   874	912	403	java/lang/Exception
    //   912	950	403	java/lang/Exception
    //   950	988	403	java/lang/Exception
    //   988	1020	403	java/lang/Exception
    //   1046	1060	403	java/lang/Exception
    //   1061	1071	403	java/lang/Exception
    //   1074	1089	403	java/lang/Exception
    //   1092	1103	403	java/lang/Exception
    //   1118	1125	403	java/lang/Exception
    //   1126	1208	403	java/lang/Exception
    //   1217	1222	403	java/lang/Exception
    //   364	388	427	java/lang/Exception
    //   419	424	427	java/lang/Exception
    //   1020	1046	1114	java/lang/Exception
    //   1106	1111	1114	java/lang/Exception
    //   353	364	1223	java/lang/Exception
  }
  
  private void a(Boolean paramBoolean)
  {
    this.t = paramBoolean.booleanValue();
  }
  
  public List a()
  {
    return this.E;
  }
  
  public void a(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public void a(float paramFloat)
  {
    this.h = paramFloat;
    this.g = true;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(a parama)
  {
    if (parama != null)
    {
      this.u = parama;
      this.o = true;
    }
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void a(List paramList)
  {
    this.E = paramList;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public void b(float paramFloat)
  {
    this.j = paramFloat;
    this.i = true;
  }
  
  public void b(int paramInt)
  {
    this.l = paramInt;
  }
  
  public void b(String paramString)
  {
    this.n = paramString;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public void c(double paramDouble)
  {
    this.f = paramDouble;
    this.e = true;
  }
  
  public void c(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  public void c(int paramInt)
  {
    this.A = paramInt;
  }
  
  public void c(String paramString)
  {
    this.p = paramString;
    if (paramString == null)
    {
      this.o = false;
      return;
    }
    this.o = true;
  }
  
  public double d()
  {
    return this.d;
  }
  
  public void d(int paramInt)
  {
    this.C = paramInt;
  }
  
  public void d(String paramString)
  {
    this.q = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float e()
  {
    return this.h;
  }
  
  public void e(String paramString)
  {
    this.B = paramString;
  }
  
  public float f()
  {
    return this.j;
  }
  
  public String g()
  {
    return this.n;
  }
  
  public int h()
  {
    return this.a;
  }
  
  public int i()
  {
    this.k = true;
    return this.l;
  }
  
  public float j()
  {
    return this.m;
  }
  
  public boolean k()
  {
    return this.o;
  }
  
  public a l()
  {
    return this.u;
  }
  
  public String m()
  {
    return this.u.i;
  }
  
  public String n()
  {
    return this.u.c;
  }
  
  public String o()
  {
    return this.u.d;
  }
  
  public String p()
  {
    return this.q;
  }
  
  public int q()
  {
    return this.A;
  }
  
  public String r()
  {
    return this.B;
  }
  
  public int s()
  {
    return this.C;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeDouble(this.c);
    paramParcel.writeDouble(this.d);
    paramParcel.writeDouble(this.f);
    paramParcel.writeFloat(this.h);
    paramParcel.writeFloat(this.j);
    paramParcel.writeInt(this.l);
    paramParcel.writeFloat(this.m);
    paramParcel.writeString(this.v);
    paramParcel.writeInt(this.z);
    paramParcel.writeString(this.w);
    paramParcel.writeString(this.x);
    paramParcel.writeString(this.B);
    paramParcel.writeString(this.u.c);
    paramParcel.writeString(this.u.d);
    paramParcel.writeString(this.u.f);
    paramParcel.writeString(this.u.g);
    paramParcel.writeString(this.u.h);
    paramParcel.writeString(this.u.e);
    paramParcel.writeString(this.u.i);
    paramParcel.writeString(this.u.a);
    paramParcel.writeString(this.u.b);
    paramParcel.writeInt(this.C);
    paramParcel.writeString(this.D);
    paramParcel.writeString(this.q);
    paramParcel.writeString(this.r);
    paramParcel.writeString(this.s);
    paramParcel.writeInt(this.A);
    paramParcel.writeBooleanArray(new boolean[] { this.e, this.g, this.i, this.k, this.o, this.t, this.y });
    paramParcel.writeList(this.E);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\BDLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */