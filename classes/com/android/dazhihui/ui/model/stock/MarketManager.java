package com.android.dazhihui.ui.model.stock;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.a.a;
import com.android.dazhihui.ui.screen.stock.a.aa;
import com.android.dazhihui.ui.screen.stock.a.ab;
import com.android.dazhihui.ui.screen.stock.a.af;
import com.android.dazhihui.ui.screen.stock.a.ao;
import com.android.dazhihui.ui.screen.stock.a.az;
import com.android.dazhihui.ui.screen.stock.a.ba;
import com.android.dazhihui.ui.screen.stock.a.bb;
import com.android.dazhihui.ui.screen.stock.a.bd;
import com.android.dazhihui.ui.screen.stock.a.bf;
import com.android.dazhihui.ui.screen.stock.a.l;
import com.android.dazhihui.ui.screen.stock.a.y;
import com.android.dazhihui.ui.screen.stock.hw;
import com.android.dazhihui.ui.screen.stock.id;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.screen.stock.sk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MarketManager
  implements i
{
  private static final String ATTRI_AMERICA = "america";
  private static final String ATTRI_BOND = "bond";
  private static final String ATTRI_CYZS = "cyzs";
  private static final String ATTRI_DATA = "data";
  private static final String ATTRI_DDE = "dde";
  private static final String ATTRI_EXCHANGE = "exchange";
  private static final String ATTRI_FIVE = "five";
  private static final String ATTRI_FOCUS = "focus";
  private static final String ATTRI_FUND = "fund";
  private static final String ATTRI_FUTURES = "futures";
  private static final String ATTRI_GJ = "gj";
  private static final String ATTRI_GLOBAL = "global";
  private static final String ATTRI_GN = "gn";
  private static final String ATTRI_HEADER = "header";
  private static final String ATTRI_HONGKONG = "hongkong";
  private static final String ATTRI_HUSHEN = "hushen";
  private static final String ATTRI_JUECE = "juece";
  private static final String ATTRI_MODULE = "module";
  private static final String ATTRI_MODULE_DETAIL = "module_detail";
  private static final String ATTRI_NAME = "name";
  private static final String ATTRI_OMZS = "omzs";
  private static final String ATTRI_OPTION = "option";
  private static final String ATTRI_QQZS = "qqzs";
  private static final String ATTRI_STATIC = "static";
  private static final String ATTRI_STOCK = "stock";
  private static final String ATTRI_TYPE = "type";
  private static final String ATTRI_YTZS = "ytzs";
  private static final String DECISION_ROOT = "decision_root";
  private static final String ROOT = "root";
  private static MarketManager _instance;
  private Context mContext;
  private List<MenuConfigVo.FirstMenuItem> mFirstMenuList;
  private HashMap<String, ArrayList<MarketVo>> mListMap;
  private HashMap<Integer, MarketVo> mMarketAllMap = new HashMap();
  private HashMap<String, MarketVo> mMarketMap;
  private HashMap<String, String> mParentMap;
  private HashMap<String, ArrayList<String>> mStockListMap;
  private com.android.dazhihui.a.b.f reqStklist;
  
  private MarketManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mParentMap = new HashMap();
    this.mListMap = new HashMap();
    this.mStockListMap = new HashMap();
    try
    {
      init(paramContext);
      return;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void addStockList(JSONObject paramJSONObject1, JSONObject paramJSONObject2, String paramString)
  {
    paramJSONObject1 = paramJSONObject1.optString(paramString);
    paramJSONObject2 = paramJSONObject2.optJSONArray(paramString);
    paramString = new ArrayList();
    if (paramJSONObject2 != null)
    {
      int i = 0;
      while (i < paramJSONObject2.length())
      {
        paramString.add(paramJSONObject2.optJSONObject(i).optString("type"));
        i += 1;
      }
    }
    this.mStockListMap.put(paramJSONObject1, paramString);
  }
  
  private void addtoParentMap(String paramString, ArrayList<MarketVo> paramArrayList)
  {
    if (this.mParentMap == null) {
      this.mParentMap = new HashMap();
    }
    int i = 0;
    while (i < paramArrayList.size())
    {
      this.mParentMap.put(((MarketVo)paramArrayList.get(i)).getName(), paramString);
      i += 1;
    }
  }
  
  private MarketVo createMarketVo(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    paramString = new MarketVo(paramString, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (this.mMarketAllMap == null) {
      this.mMarketAllMap = new HashMap();
    }
    this.mMarketAllMap.put(Integer.valueOf(paramInt2), paramString);
    return paramString;
  }
  
  private void decodeDecision(String paramString)
  {
    if (this.mListMap == null) {
      this.mListMap = new HashMap();
    }
    Object localObject1 = new JSONArray(paramString).optJSONObject(0);
    paramString = ((JSONObject)localObject1).optJSONArray("header").optJSONObject(0);
    Object localObject3 = ((JSONObject)localObject1).optJSONArray("data").optJSONObject(0);
    localObject1 = paramString.optString("dde");
    Object localObject2 = inflateArray((JSONObject)localObject3, "dde", false, false);
    this.mListMap.put(localObject1, localObject2);
    localObject2 = paramString.optString("stock");
    Object localObject4 = inflateArray((JSONObject)localObject3, "stock", false, false);
    this.mListMap.put(localObject2, localObject4);
    localObject4 = paramString.optString("module");
    Object localObject5 = inflateArray((JSONObject)localObject3, "module", false, false);
    this.mListMap.put(localObject4, localObject5);
    localObject5 = paramString.optString("five");
    Object localObject6 = inflateArray((JSONObject)localObject3, "five", false, false);
    this.mListMap.put(localObject5, localObject6);
    localObject6 = paramString.optString("static");
    localObject3 = inflateArray((JSONObject)localObject3, "static", false, false);
    this.mListMap.put(localObject6, localObject3);
    paramString = paramString.optString("focus");
    this.mParentMap.put(paramString, paramString);
    localObject1 = inflateArrayRoot(new String[] { localObject1, localObject2, localObject4, localObject5, localObject6 });
    ((ArrayList)localObject1).add(new MarketVo(paramString, false, true, 107));
    this.mListMap.put("decision_root", localObject1);
  }
  
  public static MarketManager get()
  {
    if (_instance == null) {}
    try
    {
      if (_instance == null) {
        _instance = new MarketManager(DzhApplication.a());
      }
      return _instance;
    }
    finally {}
  }
  
  private static MarketVo get2331MarketVo(int paramInt)
  {
    return new MarketVo(n.j(paramInt), false, false, paramInt);
  }
  
  private static MarketVo get2955MarketVo(int paramInt)
  {
    return new MarketVo(n.i(paramInt), false, false, paramInt);
  }
  
  private static String getValue(String paramString1, String paramString2, String paramString3)
  {
    int i = paramString1.length();
    int j;
    if (paramString2.contains("&" + paramString1 + "="))
    {
      j = paramString2.indexOf("&" + paramString1 + "=");
      int k = paramString2.indexOf("&", j + 1);
      if (k > 0) {
        paramString3 = paramString2.substring(i + j + 1 + 1, k);
      }
    }
    else
    {
      return paramString3;
    }
    return paramString2.substring(i + j + 1 + 1);
  }
  
  private ArrayList<MarketVo> inflateArray(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = new ArrayList();
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    int i = 0;
    while (i < paramJSONObject.length())
    {
      paramString = paramJSONObject.optJSONObject(i);
      paramString = new MarketVo(paramString.optString("name"), paramBoolean1, paramBoolean2, paramString.optInt("type"));
      setMarketVoById(paramString);
      localArrayList.add(paramString);
      i += 1;
    }
    return localArrayList;
  }
  
  private ArrayList<MarketVo> inflateArrayRoot(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      localArrayList.add(new MarketVo(paramArrayOfString[i], true, false, -100));
      i += 1;
    }
    return localArrayList;
  }
  
  public static boolean isHKLimit(int paramInt)
  {
    return (paramInt == 34) || (paramInt == 31) || (paramInt == 35) || (paramInt == 32) || (paramInt == 33);
  }
  
  /* Error */
  public static MarketVo parseMarketConfig(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ldc_w 296
    //   6: invokevirtual 266	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   9: ifeq +424 -> 433
    //   12: aload_0
    //   13: astore_1
    //   14: aload_0
    //   15: ldc_w 296
    //   18: invokevirtual 300	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   21: ifne +15 -> 36
    //   24: aload_0
    //   25: aload_0
    //   26: ldc_w 296
    //   29: invokevirtual 270	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   32: invokevirtual 279	java/lang/String:substring	(I)Ljava/lang/String;
    //   35: astore_1
    //   36: ldc_w 302
    //   39: aload_1
    //   40: ldc_w 304
    //   43: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: invokestatic 309	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   49: istore 4
    //   51: ldc 85
    //   53: aload_1
    //   54: ldc_w 311
    //   57: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   60: invokestatic 309	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   63: istore 5
    //   65: ldc_w 313
    //   68: aload_1
    //   69: ldc_w 311
    //   72: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: invokestatic 309	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   78: istore 6
    //   80: ldc_w 315
    //   83: aload_1
    //   84: ldc_w 317
    //   87: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   90: pop
    //   91: ldc_w 319
    //   94: aload_1
    //   95: ldc_w 317
    //   98: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   101: pop
    //   102: ldc_w 321
    //   105: aload_1
    //   106: ldc_w 317
    //   109: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   112: pop
    //   113: ldc_w 323
    //   116: aload_1
    //   117: ldc_w 311
    //   120: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   123: invokestatic 309	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   126: istore 7
    //   128: ldc 67
    //   130: aload_1
    //   131: ldc_w 317
    //   134: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   137: ldc_w 325
    //   140: invokestatic 331	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   143: pop
    //   144: ldc_w 333
    //   147: aload_1
    //   148: ldc_w 317
    //   151: invokestatic 306	com/android/dazhihui/ui/model/stock/MarketManager:getValue	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   154: ldc_w 325
    //   157: invokestatic 331	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: pop
    //   161: iload 4
    //   163: ifne +777 -> 940
    //   166: iload 7
    //   168: iconst_m1
    //   169: if_icmpeq +736 -> 905
    //   172: iload 7
    //   174: tableswitch	default:+190->364, 135:+217->391, 136:+190->364, 137:+190->364, 138:+190->364, 139:+190->364, 140:+190->364, 141:+190->364, 142:+190->364, 143:+190->364, 144:+190->364, 145:+190->364, 146:+217->391, 147:+217->391, 148:+217->391, 149:+217->391, 150:+217->391, 151:+217->391, 152:+217->391, 153:+217->391, 154:+217->391, 155:+217->391, 156:+217->391, 157:+217->391, 158:+217->391, 159:+217->391, 160:+217->391, 161:+217->391, 162:+217->391, 163:+217->391, 164:+217->391, 165:+217->391, 166:+217->391, 167:+217->391, 168:+217->391, 169:+217->391, 170:+190->364, 171:+217->391, 172:+217->391, 173:+190->364, 174:+190->364, 175:+190->364, 176:+190->364, 177:+190->364, 178:+217->391
    //   364: aconst_null
    //   365: astore_0
    //   366: aload_0
    //   367: areturn
    //   368: astore_0
    //   369: aload_0
    //   370: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   373: goto -229 -> 144
    //   376: astore_0
    //   377: aload_0
    //   378: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   381: aconst_null
    //   382: areturn
    //   383: astore_0
    //   384: aload_0
    //   385: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   388: goto -227 -> 161
    //   391: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   394: iload 7
    //   396: invokevirtual 339	com/android/dazhihui/ui/model/stock/MarketManager:getMarketVoById	(I)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   399: astore_0
    //   400: goto -34 -> 366
    //   403: iload 6
    //   405: iconst_m1
    //   406: if_icmpeq +534 -> 940
    //   409: iload 6
    //   411: invokestatic 341	com/android/dazhihui/ui/model/stock/MarketManager:get2955MarketVo	(I)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   414: astore_0
    //   415: goto -49 -> 366
    //   418: iload 6
    //   420: iconst_m1
    //   421: if_icmpeq +519 -> 940
    //   424: iload 6
    //   426: invokestatic 343	com/android/dazhihui/ui/model/stock/MarketManager:get2331MarketVo	(I)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   429: astore_0
    //   430: goto -64 -> 366
    //   433: aload_0
    //   434: ldc_w 345
    //   437: invokestatic 348	com/android/dazhihui/d/n:g	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   440: astore_1
    //   441: aload_1
    //   442: astore_0
    //   443: aload_0
    //   444: invokestatic 352	com/android/dazhihui/ui/widget/b/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   447: astore_3
    //   448: aload_0
    //   449: astore_1
    //   450: aload_0
    //   451: invokevirtual 248	java/lang/String:length	()I
    //   454: aload_3
    //   455: invokevirtual 248	java/lang/String:length	()I
    //   458: if_icmple +16 -> 474
    //   461: aload_0
    //   462: aload_3
    //   463: invokevirtual 248	java/lang/String:length	()I
    //   466: aload_0
    //   467: invokevirtual 248	java/lang/String:length	()I
    //   470: invokevirtual 277	java/lang/String:substring	(II)Ljava/lang/String;
    //   473: astore_1
    //   474: aload_2
    //   475: astore_0
    //   476: aload_1
    //   477: invokestatic 357	android/text/TextUtils:isDigitsOnly	(Ljava/lang/CharSequence;)Z
    //   480: ifeq -114 -> 366
    //   483: aload_1
    //   484: invokestatic 309	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   487: istore 5
    //   489: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   492: astore_1
    //   493: aload_2
    //   494: astore_0
    //   495: iload 5
    //   497: lookupswitch	default:+448->945, 1:+347->844, 2:+450->947, 5:+450->947, 6:+365->862, 9:+450->947, 11:+450->947, 12:+450->947, 21:+450->947, 24:+373->870, 30:+450->947, 34:+450->947, 37:+450->947, 38:+450->947, 39:+-131->366, 40:+-131->366, 42:+450->947, 96:+450->947, 97:+450->947, 98:+450->947, 99:+450->947, 100:+450->947, 101:+450->947, 102:+450->947, 103:+450->947, 104:+450->947, 105:+450->947, 106:+450->947, 107:+450->947, 108:+450->947, 109:+450->947, 110:+450->947, 111:+450->947, 112:+450->947, 113:+450->947, 114:+450->947, 115:+450->947, 116:+450->947, 117:+450->947, 118:+450->947, 119:+450->947, 127:+450->947, 128:+-131->366
    //   844: aload_1
    //   845: ldc_w 359
    //   848: invokevirtual 362	com/android/dazhihui/ui/model/stock/MarketManager:getMarketVo	(Ljava/lang/String;)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   851: astore_0
    //   852: aload_0
    //   853: areturn
    //   854: astore_1
    //   855: aload_1
    //   856: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   859: goto -416 -> 443
    //   862: aload_1
    //   863: ldc_w 364
    //   866: invokevirtual 362	com/android/dazhihui/ui/model/stock/MarketManager:getMarketVo	(Ljava/lang/String;)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   869: areturn
    //   870: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   873: ldc_w 366
    //   876: invokevirtual 370	com/android/dazhihui/ui/model/stock/MarketManager:getChildList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   879: iconst_1
    //   880: invokevirtual 186	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   883: checkcast 188	com/android/dazhihui/ui/model/stock/MarketVo
    //   886: areturn
    //   887: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   890: iload 4
    //   892: invokevirtual 339	com/android/dazhihui/ui/model/stock/MarketManager:getMarketVoById	(I)Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   895: astore_0
    //   896: aload_0
    //   897: areturn
    //   898: astore_0
    //   899: aload_0
    //   900: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   903: aconst_null
    //   904: areturn
    //   905: iload 5
    //   907: iconst_m1
    //   908: if_icmpeq +32 -> 940
    //   911: iload 5
    //   913: lookupswitch	default:+27->940, 2331:+-495->418, 2955:+-510->403
    //   940: aconst_null
    //   941: astore_0
    //   942: goto -576 -> 366
    //   945: aconst_null
    //   946: areturn
    //   947: iload 5
    //   949: istore 4
    //   951: iload 5
    //   953: bipush 11
    //   955: if_icmpne -68 -> 887
    //   958: bipush 118
    //   960: istore 4
    //   962: goto -75 -> 887
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	965	0	paramString	String
    //   13	832	1	localObject1	Object
    //   854	9	1	localException	Exception
    //   1	493	2	localObject2	Object
    //   447	16	3	str	String
    //   49	912	4	i	int
    //   63	893	5	j	int
    //   78	347	6	k	int
    //   126	269	7	m	int
    // Exception table:
    //   from	to	target	type
    //   128	144	368	java/lang/Exception
    //   36	128	376	java/lang/Exception
    //   369	373	376	java/lang/Exception
    //   384	388	376	java/lang/Exception
    //   391	400	376	java/lang/Exception
    //   409	415	376	java/lang/Exception
    //   424	430	376	java/lang/Exception
    //   144	161	383	java/lang/Exception
    //   433	441	854	java/lang/Exception
    //   450	474	898	java/lang/Exception
    //   476	493	898	java/lang/Exception
    //   844	852	898	java/lang/Exception
    //   862	870	898	java/lang/Exception
    //   870	887	898	java/lang/Exception
    //   887	896	898	java/lang/Exception
  }
  
  private void readFutures(q paramq, int paramInt1, int paramInt2, ArrayList<MarketVo> paramArrayList1, ArrayList<MarketVo> paramArrayList2)
  {
    int i = 0;
    if (i < paramInt1)
    {
      new NodeVo();
      String str = paramq.l();
      paramq.b();
      int j = paramq.b();
      int k = paramq.b();
      int m = paramq.b();
      int n = paramq.e();
      MarketVo localMarketVo;
      if ((k <= 90) || (m == 0))
      {
        localMarketVo = new MarketVo(str, false, false, n);
        localMarketVo.setType(j);
        label86:
        if (paramInt2 == 3003) {
          break label177;
        }
        paramArrayList1.add(localMarketVo);
      }
      for (;;)
      {
        setMarketVoById(localMarketVo);
        i += 1;
        break;
        ArrayList localArrayList = readListChild(paramq, n, paramInt2);
        localMarketVo = new MarketVo(str, true, false, -100);
        localMarketVo.setType(j);
        this.mListMap.put(str, localArrayList);
        addtoMarketMap(localArrayList);
        addtoParentMap(str, localArrayList);
        break label86;
        label177:
        paramArrayList2.add(localMarketVo);
      }
    }
  }
  
  private ArrayList<MarketVo> readListChild(q paramq, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    if (i < paramInt1)
    {
      String str = paramq.l();
      paramq.b();
      int j = paramq.b();
      paramq.b();
      int k = paramq.b();
      int m = paramq.d();
      MarketVo localMarketVo;
      if (k == 0)
      {
        localMarketVo = new MarketVo(str, false, false, m);
        localMarketVo.setType(j);
      }
      for (;;)
      {
        localArrayList1.add(localMarketVo);
        i += 1;
        break;
        ArrayList localArrayList2 = readListChild(paramq, m, paramInt2);
        localMarketVo = new MarketVo(str, true, false, -100);
        localMarketVo.setType(j);
        this.mListMap.put(str, localArrayList2);
        addtoMarketMap(localArrayList2);
        addtoParentMap(str, localArrayList2);
      }
    }
    return localArrayList1;
  }
  
  public void addList(String paramString, ArrayList<MarketVo> paramArrayList)
  {
    this.mListMap.put(paramString, paramArrayList);
  }
  
  public void addtoMarketMap(ArrayList<MarketVo> paramArrayList)
  {
    if (this.mMarketMap == null) {
      this.mMarketMap = new HashMap();
    }
    int i = 0;
    while (i < paramArrayList.size())
    {
      this.mMarketMap.put(((MarketVo)paramArrayList.get(i)).getName(), paramArrayList.get(i));
      i += 1;
    }
  }
  
  public l createFragment(Bundle paramBundle, MarketVo paramMarketVo)
  {
    ao localao = ao.a(paramBundle);
    if (paramMarketVo == null) {}
    do
    {
      return localao;
      if (("板块综合".equals(paramMarketVo.getName())) || ("行业板块".equals(paramMarketVo.getName())) || ("概念板块".equals(paramMarketVo.getName()))) {
        return bf.a(paramBundle);
      }
      if ((("基金".equals(get().getParent(paramMarketVo.getName()))) && ((paramMarketVo.getId() == 15) || (paramMarketVo.getId() == 16) || (paramMarketVo.getId() == 14) || (paramMarketVo.getId() == 24))) || ("分级基金".equals(paramMarketVo.getName())) || ("债券".equals(get().getParent(paramMarketVo.getName()))) || (("商品期货".equals(get().getParent(paramMarketVo.getName()))) && ("常用商品".equals(paramMarketVo.getName())))) {
        return ao.a(paramBundle);
      }
      if (("基金".equals(get().getParent(paramMarketVo.getName()))) && (paramMarketVo.getId() != 15) && (paramMarketVo.getId() != 16) && (paramMarketVo.getId() != 14) && (paramMarketVo.getId() != 24)) {
        return a.a(paramBundle);
      }
      if (("商品期货".equals(get().getParent(paramMarketVo.getName()))) && (!"常用商品".equals(paramMarketVo.getName())) && (!"富时A50指数期货".equals(paramMarketVo.getName()))) {
        return com.android.dazhihui.ui.screen.stock.a.f.a(paramBundle);
      }
      if ("大宗电子".equals(get().getParent(paramMarketVo.getName()))) {
        return com.android.dazhihui.ui.screen.stock.a.f.a(paramBundle);
      }
      if ("期权".equals(get().getParent(paramMarketVo.getName()))) {
        return ao.a(paramBundle);
      }
      if ((paramMarketVo.getType() == 104) || (paramMarketVo.getType() == 109)) {
        return ao.a(paramBundle);
      }
      if ("板块".equals(paramMarketVo.getName())) {
        return new az();
      }
      if ("沪深".equals(paramMarketVo.getName())) {
        return new aa();
      }
      if ("股指".equals(paramMarketVo.getName())) {
        return new af();
      }
      if ("全球".equals(paramMarketVo.getName())) {
        return new com.android.dazhihui.ui.screen.stock.a.x();
      }
      if ("美股".equals(paramMarketVo.getName())) {
        return new bb();
      }
      if ("港股".equals(paramMarketVo.getName())) {
        return new y();
      }
      if ("行情".equals(paramMarketVo.getName())) {
        return new ab();
      }
    } while (!"新三板综合".equals(paramMarketVo.getName()));
    return new ba();
  }
  
  public e createFragmentByMarketType(int paramInt)
  {
    Object localObject = getFirstMenuItemList();
    if ((localObject != null) && (paramInt < ((List)localObject).size()) && (paramInt >= 0)) {}
    for (localObject = (MenuConfigVo.FirstMenuItem)((List)localObject).get(paramInt);; localObject = null)
    {
      ao localao = ao.a(null);
      if (localObject == null) {
        return localao;
      }
      switch (((MenuConfigVo.FirstMenuItem)localObject).id)
      {
      default: 
        localObject = new Bundle();
        ((Bundle)localObject).putInt("FirstMenuItem", paramInt);
        return hw.a((Bundle)localObject);
      case 1: 
        return new sk();
      case 2: 
        return new az();
      case 4: 
        return new aa();
      case 5: 
        return new af();
      case 6: 
        return new com.android.dazhihui.ui.screen.stock.a.x();
      case 9: 
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("market_vo", new MarketVo("港股通", false, false, 39));
        return ao.a((Bundle)localObject);
      case 12: 
        return new ab();
      case 17: 
        return new bb();
      case 18: 
        return new y();
      case 19: 
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("market_vo", get().getMarketVo("分级基金"));
        return ao.a((Bundle)localObject);
      case 20: 
        return new bd();
      case 21: 
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("market_vo", get().getMarketVo("常用商品"));
        return ao.a((Bundle)localObject);
      }
      localObject = new Bundle();
      ((Bundle)localObject).putInt("FirstMenuItem", paramInt);
      return hw.a((Bundle)localObject);
    }
  }
  
  @Deprecated
  public e createFragmentByMarketType(MarketMenuVo.MenuItem paramMenuItem)
  {
    Object localObject1 = ao.a(null);
    if (paramMenuItem == null) {
      return (e)localObject1;
    }
    Bundle localBundle;
    if ("1".equals(paramMenuItem.getType())) {
      switch (paramMenuItem.getId())
      {
      case 3: 
      case 7: 
      case 8: 
      case 10: 
      case 11: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      default: 
        localBundle = new Bundle();
        if ((paramMenuItem.getId() != 1000) || (TextUtils.isEmpty(paramMenuItem.getUrlPath()))) {
          break;
        }
      }
    }
    for (localObject1 = parseMarketConfig(paramMenuItem.getUrlPath());; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = get().getMarketVo(paramMenuItem.getName());
      }
      localBundle.putParcelable("market_vo", (Parcelable)localObject2);
      return createFragment(localBundle, (MarketVo)localObject2);
      return new sk();
      return new az();
      return new aa();
      return new af();
      return new com.android.dazhihui.ui.screen.stock.a.x();
      paramMenuItem = new Bundle();
      paramMenuItem.putParcelable("market_vo", new MarketVo("港股通", false, false, 39));
      return ao.a(paramMenuItem);
      return new ab();
      return new bb();
      return new y();
      paramMenuItem = new Bundle();
      paramMenuItem.putParcelable("market_vo", get().getMarketVo("分级基金"));
      return ao.a(paramMenuItem);
      return new bd();
      paramMenuItem = new Bundle();
      paramMenuItem.putParcelable("market_vo", get().getMarketVo("常用商品"));
      return ao.a(paramMenuItem);
      if ("2".equals(paramMenuItem.getType()))
      {
        localObject1 = r.a(paramMenuItem.getUrlPath(), "");
        if ((localObject1 != null) && (localObject1.length > 0) && ("0".equals(localObject1[0]))) {
          return ao.a(null);
        }
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("nexturl", paramMenuItem.getUrlPath());
        ((Bundle)localObject1).putString("names", null);
        ((Bundle)localObject1).putInt("api_type", 0);
        ((Bundle)localObject1).putByteArray("post_data", null);
        ((Bundle)localObject1).putBoolean("ISSHOWTITLE", false);
        ((Bundle)localObject1).putInt("BROWSER_COUNT_ID", paramMenuItem.getCountid());
        ((Bundle)localObject1).putInt("BACK_GROUND_COLOR", 0);
        return id.b((Bundle)localObject1);
      }
      if ("3".equals(paramMenuItem.getType())) {
        return ao.a(null);
      }
      if ("4".equals(paramMenuItem.getType())) {
        return lp.a(1, paramMenuItem.getUrlPath(), paramMenuItem.getName(), false);
      }
      if (!"5".equals(paramMenuItem.getType())) {
        break;
      }
      localObject1 = r.a(paramMenuItem.getUrlPath(), "");
      paramMenuItem = localObject1[1];
      localObject1 = localObject1[0];
      paramMenuItem = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector(paramMenuItem);
      localObject1 = new Bundle();
      ((Bundle)localObject1).putString("nexturl", paramMenuItem);
      ((Bundle)localObject1).putString("names", null);
      ((Bundle)localObject1).putInt("api_type", 0);
      ((Bundle)localObject1).putByteArray("post_data", null);
      ((Bundle)localObject1).putBoolean("ISSHOWTITLE", false);
      ((Bundle)localObject1).putInt("BACK_GROUND_COLOR", 0);
      ((Bundle)localObject1).putBoolean("ISHUITOUGU", true);
      return id.b((Bundle)localObject1);
    }
  }
  
  public e createFragmentByMarketType(MenuConfigVo.SecondMenuItem paramSecondMenuItem)
  {
    Object localObject1 = ao.a(null);
    if (paramSecondMenuItem == null) {
      return (e)localObject1;
    }
    Bundle localBundle;
    if (7 == paramSecondMenuItem.type) {
      switch (paramSecondMenuItem.id)
      {
      case 3: 
      case 7: 
      case 8: 
      case 10: 
      case 11: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      default: 
        localBundle = new Bundle();
        if ((paramSecondMenuItem.id != 1000) || (TextUtils.isEmpty(paramSecondMenuItem.urlPath))) {
          break;
        }
      }
    }
    for (localObject1 = parseMarketConfig(paramSecondMenuItem.urlPath);; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(paramSecondMenuItem.name)) {
          localObject2 = get().getMarketVo(paramSecondMenuItem.name);
        }
      }
      localBundle.putParcelable("market_vo", (Parcelable)localObject2);
      return createFragment(localBundle, (MarketVo)localObject2);
      return new sk();
      return new az();
      return new aa();
      return new af();
      return new com.android.dazhihui.ui.screen.stock.a.x();
      paramSecondMenuItem = new Bundle();
      paramSecondMenuItem.putParcelable("market_vo", new MarketVo("港股通", false, false, 39));
      return ao.a(paramSecondMenuItem);
      return new ab();
      return new bb();
      return new y();
      paramSecondMenuItem = new Bundle();
      paramSecondMenuItem.putParcelable("market_vo", get().getMarketVo("分级基金"));
      return ao.a(paramSecondMenuItem);
      return new bd();
      paramSecondMenuItem = new Bundle();
      paramSecondMenuItem.putParcelable("market_vo", get().getMarketVo("常用商品"));
      return ao.a(paramSecondMenuItem);
      if (4 == paramSecondMenuItem.type)
      {
        localObject1 = r.a(paramSecondMenuItem.urlPath, "");
        if ((localObject1 != null) && (localObject1.length > 0) && ("0".equals(localObject1[0]))) {
          return ao.a(null);
        }
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("nexturl", paramSecondMenuItem.urlPath);
        ((Bundle)localObject1).putString("names", null);
        ((Bundle)localObject1).putInt("api_type", 0);
        ((Bundle)localObject1).putByteArray("post_data", null);
        ((Bundle)localObject1).putBoolean("ISSHOWTITLE", false);
        ((Bundle)localObject1).putInt("BROWSER_COUNT_ID", paramSecondMenuItem.countid);
        ((Bundle)localObject1).putInt("BACK_GROUND_COLOR", 0);
        return id.b((Bundle)localObject1);
      }
      if (3 == paramSecondMenuItem.type) {
        return ao.a(null);
      }
      if (1 == paramSecondMenuItem.type) {
        return lp.a(1, paramSecondMenuItem.urlPath, paramSecondMenuItem.name, false);
      }
      if (5 == paramSecondMenuItem.type)
      {
        localObject1 = r.a(paramSecondMenuItem.urlPath, "");
        paramSecondMenuItem = localObject1[1];
        localObject1 = localObject1[0];
        paramSecondMenuItem = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector(paramSecondMenuItem);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("nexturl", paramSecondMenuItem);
        ((Bundle)localObject1).putString("names", null);
        ((Bundle)localObject1).putInt("api_type", 0);
        ((Bundle)localObject1).putByteArray("post_data", null);
        ((Bundle)localObject1).putBoolean("ISSHOWTITLE", false);
        ((Bundle)localObject1).putInt("BACK_GROUND_COLOR", 0);
        ((Bundle)localObject1).putBoolean("ISHUITOUGU", true);
        return id.b((Bundle)localObject1);
      }
      if ((2 == paramSecondMenuItem.type) || (6 != paramSecondMenuItem.type)) {
        break;
      }
      return (e)localObject1;
    }
  }
  
  public void decode(String paramString)
  {
    if (this.mListMap == null) {
      this.mListMap = new HashMap();
    }
    paramString = new JSONArray(paramString).optJSONObject(0);
    paramString.optJSONArray("header").optJSONObject(0);
    paramString = paramString.optJSONArray("data").optJSONObject(0);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("沪深A股", false, false, 0, 5));
    localArrayList.add(createMarketVo("沪深指数", false, false, 101, 9));
    createMarketVo("沪深指数", false, false, 101, 135);
    localArrayList.add(createMarketVo("创业板", false, false, 25, 21));
    localArrayList.add(createMarketVo("中小板块", false, false, 1, 96));
    localArrayList.add(createMarketVo("上证A股", false, false, 11, 97));
    localArrayList.add(createMarketVo("深证A股", false, false, 21, 98));
    localArrayList.add(createMarketVo("上证B股", false, false, 12, 99));
    localArrayList.add(createMarketVo("深证B股", false, false, 22, 100));
    localArrayList.add(createMarketVo("深证H股", false, false, 111, 101));
    localArrayList.add(createMarketVo("两网及退市", false, false, 28, 102));
    localArrayList.add(createMarketVo("新三板", false, false, 29, 103));
    localArrayList.add(createMarketVo("上证风险", false, false, 5, 104));
    localArrayList.add(createMarketVo("上证退市", false, false, 4, 105));
    localArrayList.add(createMarketVo("深证退市", false, false, 6, 106));
    this.mListMap.put("沪深市场", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("沪深市场", localArrayList);
    this.mParentMap.put("市场板块", "板块详情");
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("DDE决策", true, false, -100, 30));
    localArrayList.add(createMarketVo("个股资金", true, false, -100, 34));
    localArrayList.add(createMarketVo("板块资金", true, false, -100, 38));
    localArrayList.add(createMarketVo("5分钟涨幅", true, false, -100, 37));
    localArrayList.add(createMarketVo("盈利预期", true, false, -100, 40));
    localArrayList.add(createMarketVo("股价预警", true, false, -100, 39));
    localArrayList.add(createMarketVo("阶段统计", true, false, -100, 127));
    createMarketVo("阶段统计", true, false, -100, 2);
    localArrayList.add(createMarketVo("交易关注", false, true, -100, 42));
    localArrayList.add(createMarketVo("异动主题", true, false, -100, 128));
    this.mListMap.put("决策", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("决策", localArrayList);
    createMarketVo("港股", false, false, -100, 172);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("香港指数", false, false, 30, 12));
    localArrayList.add(createMarketVo("港股通", false, false, 39, 107));
    localArrayList.add(createMarketVo("AH股", false, false, 34, 112));
    localArrayList.add(createMarketVo("国企股", false, false, 31, 113));
    localArrayList.add(createMarketVo("香港主板", false, false, 35, 114));
    localArrayList.add(createMarketVo("红筹股", false, false, 32, 115));
    localArrayList.add(createMarketVo("蓝筹股", false, false, 33, 116));
    this.mListMap.put("港股", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("港股", localArrayList);
    createMarketVo("新三板综合", false, false, -100, 178);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("做市", false, false, 121, -1));
    localArrayList.add(createMarketVo("协议", false, false, 120, -1));
    this.mListMap.put("基础层", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("基础层", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("做市", false, false, 123, -1));
    localArrayList.add(createMarketVo("协议", false, false, 122, -1));
    this.mListMap.put("创新层", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("创新层", localArrayList);
    createMarketVo("美股", false, false, -100, 171);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("全球指数", false, false, 102, 117));
    localArrayList.add(createMarketVo("Nasdaq中国", false, false, 209, 110));
    localArrayList.add(createMarketVo("NYSE中国", false, false, 211, 108));
    localArrayList.add(createMarketVo("标普500", false, false, 208, 109));
    localArrayList.add(createMarketVo("Nasdaq100", false, false, 210, 111));
    this.mListMap.put("美股", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("美股", localArrayList);
    localArrayList = inflateArray(paramString, "global", false, true);
    this.mListMap.put("全球市场", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("全球市场", localArrayList);
    localArrayList = inflateArray(paramString, "option", false, false);
    this.mListMap.put("期权", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("期权", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("常用商品", true, false, -100, 146));
    this.mListMap.put("商品期货", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("商品期货", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(new MarketVo("国际", false, true, 107));
    localArrayList.add(new MarketVo("国内", false, true, 107));
    this.mListMap.put("常用商品", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("常用商品", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("人民币中间价", false, false, 109, 118));
    localArrayList.add(createMarketVo("全球外汇", false, false, 104, 119));
    localArrayList.add(createMarketVo("国际贵金属", false, false, 110, 2955110));
    this.mListMap.put("外汇", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("外汇", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(createMarketVo("分级基金", true, false, -100, 169));
    localArrayList.add(createMarketVo("上证基金", false, false, 14, 295514));
    localArrayList.add(createMarketVo("深证基金", false, false, 24, 295524));
    localArrayList.add(createMarketVo("ETF基金", false, false, 15, 295515));
    localArrayList.add(createMarketVo("LOF基金", false, false, 16, 295516));
    localArrayList.add(createMarketVo("股票基金", false, false, 1, 233101));
    localArrayList.add(createMarketVo("债券基金", false, false, 2, 233102));
    localArrayList.add(createMarketVo("混合基金", false, false, 3, 233103));
    localArrayList.add(createMarketVo("保本基金", false, false, 4, 233104));
    localArrayList.add(createMarketVo("货币基金", false, false, 5, 233105));
    this.mListMap.put("基金", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("基金", localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(new MarketVo("分级B", false, false, -100));
    localArrayList.add(new MarketVo("分级A", false, false, -100));
    localArrayList.add(new MarketVo("上市母基", false, false, -100));
    this.mListMap.put("分级基金", localArrayList);
    addtoMarketMap(localArrayList);
    addtoParentMap("分级基金", localArrayList);
    paramString = inflateArray(paramString, "bond", false, false);
    this.mListMap.put("债券", paramString);
    addtoMarketMap(paramString);
    addtoParentMap("债券", paramString);
    paramString = inflateArrayRoot(new String[] { "沪深市场", "港股", "全球市场", "商品期货", "外汇", "基金", "债券" });
    this.mListMap.put("root", paramString);
    addtoMarketMap(paramString);
    addtoParentMap("root", paramString);
  }
  
  public void decodeFutures(q paramq)
  {
    try
    {
      int k = paramq.e();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int j = 0;
      int i = 0;
      if (j < k)
      {
        String str = paramq.l().trim();
        if (this.mContext.getResources().getString(2131166267).equals(str)) {
          i = 3001;
        }
        for (;;)
        {
          paramq.b();
          paramq.b();
          paramq.b();
          paramq.b();
          readFutures(paramq, paramq.e(), i, localArrayList1, localArrayList2);
          j += 1;
          break;
          if (this.mContext.getResources().getString(2131165427).equals(str)) {
            i = 3003;
          } else if (this.mContext.getResources().getString(2131166162).equals(str)) {
            i = 3002;
          }
        }
      }
      paramq = (ArrayList)this.mListMap.get("商品期货");
      if (paramq.size() >= 1) {
        localArrayList1.add(0, paramq.get(0));
      }
      this.mListMap.put("商品期货", localArrayList1);
      addtoMarketMap(localArrayList1);
      addtoParentMap("商品期货", localArrayList1);
      this.mListMap.put("大宗电子", localArrayList2);
      addtoMarketMap(localArrayList2);
      addtoParentMap("大宗电子", localArrayList2);
      return;
    }
    catch (Exception paramq)
    {
      paramq.printStackTrace();
    }
  }
  
  public void decodeStockList(String paramString)
  {
    if (this.mStockListMap == null) {
      this.mStockListMap = new HashMap();
    }
    JSONObject localJSONObject = new JSONArray(paramString).optJSONObject(0);
    paramString = localJSONObject.optJSONArray("header").optJSONObject(0);
    localJSONObject = localJSONObject.optJSONObject("data");
    addStockList(paramString, localJSONObject, "cyzs");
    addStockList(paramString, localJSONObject, "ytzs");
    addStockList(paramString, localJSONObject, "omzs");
    addStockList(paramString, localJSONObject, "qqzs");
    addStockList(paramString, localJSONObject, "gj");
    addStockList(paramString, localJSONObject, "gn");
  }
  
  public ArrayList<MarketVo> getBrotherList(String paramString)
  {
    return (ArrayList)this.mListMap.get(this.mParentMap.get(paramString));
  }
  
  public ArrayList<MarketVo> getChildList(String paramString)
  {
    return (ArrayList)this.mListMap.get(paramString);
  }
  
  public List<MenuConfigVo.FirstMenuItem> getFirstMenuItemList()
  {
    this.mFirstMenuList = MenuManager.getInstance().getMarketMenu();
    if ((this.mFirstMenuList == null) || (this.mFirstMenuList.size() <= 0))
    {
      this.mFirstMenuList = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new MenuConfigVo.SecondMenuItem(12, "沪深", 7, ""));
      localArrayList.add(new MenuConfigVo.SecondMenuItem(5, "指数", 7, ""));
      localArrayList.add(new MenuConfigVo.SecondMenuItem(20, "港美", 7, ""));
      localArrayList.add(new MenuConfigVo.SecondMenuItem(21, "商品", 7, ""));
      this.mFirstMenuList.add(new MenuConfigVo.FirstMenuItem(100, "股票", localArrayList));
      localArrayList = new ArrayList();
      localArrayList.add(new MenuConfigVo.SecondMenuItem(19, "分级", 7, ""));
      localArrayList.add(new MenuConfigVo.SecondMenuItem(-1, "ETF", 7, "dzh_browser_url&goto=0&type=2955&kind=15&title=ETF基金"));
      localArrayList.add(new MenuConfigVo.SecondMenuItem(-1, "LOF", 7, "dzh_browser_url&goto=0&type=2955&kind=16&title=LOF基金"));
      this.mFirstMenuList.add(new MenuConfigVo.FirstMenuItem(168, "基金", localArrayList));
      localArrayList = new ArrayList();
      localArrayList.add(new MenuConfigVo.SecondMenuItem(-1, "三板", 7, "dzh_browser_url&goto=0&screen=178"));
      this.mFirstMenuList.add(new MenuConfigVo.FirstMenuItem(157, "新三板", localArrayList));
    }
    return this.mFirstMenuList;
  }
  
  public String getMarketNameById(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "";
    case 1000: 
      return "沪深A股";
    case 1001: 
      return "沪深指数";
    case 1002: 
      return "创业板";
    case 1003: 
      return "中小板块";
    case 1004: 
      return "板块综合";
    case 1005: 
      return "行业板块";
    case 1006: 
      return "概念板块";
    case 1007: 
      return "上证A股";
    case 1008: 
      return "深证A股";
    case 1009: 
      return "上证B股";
    case 1010: 
      return "深证B股";
    case 1011: 
      return "深证H股";
    case 1012: 
      return "两网及退市";
    case 1013: 
      return "新三板";
    case 1014: 
      return "上证风险";
    case 1015: 
      return "上证退市";
    case 1016: 
      return "深证退市";
    case 1017: 
      return "分级基金";
    case 1018: 
      return "上证基金";
    case 1019: 
      return "深证基金";
    case 1020: 
      return "ETF基金";
    case 1021: 
      return "LOF基金";
    case 1022: 
      return "股票基金";
    case 1023: 
      return "债券基金";
    case 1024: 
      return "混合基金";
    case 1025: 
      return "保本基金";
    case 1026: 
      return "货币基金";
    case 1027: 
      return "全球指数";
    case 1028: 
      return "Nasdaq中国";
    case 1029: 
      return "NYSE中国";
    case 1030: 
      return "标普500";
    case 1031: 
      return "Nasdaq100";
    case 1032: 
      return "香港指数";
    case 1033: 
      return "港股通";
    case 1034: 
      return "AH股";
    case 1035: 
      return "国企股";
    case 1036: 
      return "香港主板";
    case 1037: 
      return "红筹股";
    case 1038: 
      return "蓝筹股";
    case 1039: 
      return "上证期权";
    case 1040: 
      return "上证债券";
    case 1041: 
      return "深证债券";
    case 1042: 
      return "上证转债";
    case 1043: 
      return "深证转债";
    case 1044: 
      return "上证回购";
    case 1045: 
      return "深证回购";
    case 1046: 
      return "上证出入库";
    case 1047: 
      return "上证小公募";
    case 1048: 
      return "人民币中间价";
    case 1049: 
      return "全球外汇";
    case 1050: 
      return "国际贵金属";
    case 1051: 
      return "常用商品";
    case 1052: 
      return "股指期货";
    case 1053: 
      return "国债期货";
    case 1054: 
      return "上海期货";
    case 1055: 
      return "大连商品";
    case 1056: 
      return "郑州商品";
    case 1057: 
      return "商品期指";
    case 1058: 
      return "上海黄金";
    case 1059: 
      return "渤海商品";
    case 1060: 
      return "伦敦LME";
    case 1061: 
      return "纽约NYMEX";
    case 1062: 
      return "纽约COMEX";
    case 1063: 
      return "芝加哥CBOT";
    case 1064: 
      return "ICE洲际商品";
    case 1065: 
      return "新加坡期货";
    case 1066: 
      return "河北大宗";
    case 1067: 
      return "大圆银泰";
    case 1068: 
      return "君泰贵金属";
    case 1069: 
      return "昆明贵重金属";
    case 1070: 
      return "南京亚太化工";
    case 1071: 
      return "天新茶叶";
    case 1072: 
      return "天津贵金属";
    case 1073: 
      return "浙江商品";
    case 1074: 
      return "DDE决策";
    case 1075: 
      return "个股资金";
    case 1076: 
      return "板块资金";
    case 1077: 
      return "5分钟涨幅";
    case 1078: 
      return "盈利预期";
    case 1079: 
      return "阶段统计";
    case 1080: 
      return "交易关注";
    }
    return "异动主题";
  }
  
  public MarketVo getMarketVo(String paramString)
  {
    return (MarketVo)this.mMarketMap.get(paramString);
  }
  
  public MarketVo getMarketVoById(int paramInt)
  {
    if (this.mMarketAllMap != null) {
      return (MarketVo)this.mMarketAllMap.get(Integer.valueOf(paramInt));
    }
    return null;
  }
  
  public MarketVo getMarketVoByName(String paramString)
  {
    if ((this.mMarketAllMap != null) && (paramString != null))
    {
      Object localObject = this.mMarketAllMap.values();
      if ((localObject != null) && (((Collection)localObject).size() > 0))
      {
        localObject = ((Collection)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          MarketVo localMarketVo = (MarketVo)((Iterator)localObject).next();
          if ((localMarketVo != null) && (paramString.equals(localMarketVo.getName()))) {
            return localMarketVo;
          }
        }
      }
    }
    return null;
  }
  
  public String getParent(String paramString)
  {
    return (String)this.mParentMap.get(paramString);
  }
  
  public ArrayList<String> getStockCodeList(String paramString)
  {
    return (ArrayList)this.mStockListMap.get(paramString);
  }
  
  /* Error */
  public void handleResponse(h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_2
    //   6: instanceof 947
    //   9: ifeq +61 -> 70
    //   12: aload_2
    //   13: checkcast 947	com/android/dazhihui/a/b/g
    //   16: astore_2
    //   17: aload_1
    //   18: aload_0
    //   19: getfield 949	com/android/dazhihui/ui/model/stock/MarketManager:reqStklist	Lcom/android/dazhihui/a/b/f;
    //   22: if_acmpne -18 -> 4
    //   25: aload_2
    //   26: invokevirtual 952	com/android/dazhihui/a/b/g:a	()[B
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull -27 -> 4
    //   34: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   37: new 215	java/lang/String
    //   40: dup
    //   41: aload_1
    //   42: ldc_w 345
    //   45: invokespecial 955	java/lang/String:<init>	([BLjava/lang/String;)V
    //   48: invokevirtual 957	com/android/dazhihui/ui/model/stock/MarketManager:decodeStockList	(Ljava/lang/String;)V
    //   51: return
    //   52: astore_1
    //   53: aload_1
    //   54: invokevirtual 142	org/json/JSONException:printStackTrace	()V
    //   57: return
    //   58: astore_1
    //   59: aload_1
    //   60: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   63: return
    //   64: astore_1
    //   65: aload_1
    //   66: invokevirtual 958	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   69: return
    //   70: aload_2
    //   71: instanceof 960
    //   74: ifeq -70 -> 4
    //   77: aload_2
    //   78: checkcast 960	com/android/dazhihui/a/b/o
    //   81: invokevirtual 964	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull -82 -> 4
    //   89: aload_1
    //   90: getfield 968	com/android/dazhihui/a/b/p:a	I
    //   93: sipush 2981
    //   96: if_icmpne -92 -> 4
    //   99: aload_1
    //   100: getfield 971	com/android/dazhihui/a/b/p:b	[B
    //   103: astore_1
    //   104: aload_1
    //   105: ifnull -101 -> 4
    //   108: aload_1
    //   109: arraylength
    //   110: iconst_2
    //   111: if_icmple -107 -> 4
    //   114: new 377	com/android/dazhihui/a/b/q
    //   117: dup
    //   118: aload_1
    //   119: invokespecial 974	com/android/dazhihui/a/b/q:<init>	([B)V
    //   122: astore_2
    //   123: invokestatic 336	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   126: aload_2
    //   127: invokevirtual 976	com/android/dazhihui/ui/model/stock/MarketManager:decodeFutures	(Lcom/android/dazhihui/a/b/q;)V
    //   130: ldc_w 978
    //   133: ldc_w 980
    //   136: invokestatic 985	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   139: pop
    //   140: aload_0
    //   141: getfield 130	com/android/dazhihui/ui/model/stock/MarketManager:mContext	Landroid/content/Context;
    //   144: invokevirtual 989	android/content/Context:getFilesDir	()Ljava/io/File;
    //   147: ifnull -143 -> 4
    //   150: new 991	java/io/File
    //   153: dup
    //   154: new 250	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   161: aload_0
    //   162: getfield 130	com/android/dazhihui/ui/model/stock/MarketManager:mContext	Landroid/content/Context;
    //   165: invokevirtual 989	android/content/Context:getFilesDir	()Ljava/io/File;
    //   168: invokevirtual 994	java/io/File:getPath	()Ljava/lang/String;
    //   171: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc_w 996
    //   177: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokespecial 997	java/io/File:<init>	(Ljava/lang/String;)V
    //   186: astore_2
    //   187: new 999	java/io/FileOutputStream
    //   190: dup
    //   191: aload_2
    //   192: invokespecial 1002	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   195: astore_2
    //   196: aload_2
    //   197: aload_1
    //   198: invokevirtual 1005	java/io/FileOutputStream:write	([B)V
    //   201: aload_2
    //   202: invokevirtual 1008	java/io/FileOutputStream:close	()V
    //   205: return
    //   206: astore_1
    //   207: aload_1
    //   208: invokevirtual 1009	java/io/FileNotFoundException:printStackTrace	()V
    //   211: return
    //   212: astore_1
    //   213: aload_1
    //   214: invokevirtual 143	java/io/IOException:printStackTrace	()V
    //   217: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	MarketManager
    //   0	218	1	paramh	h
    //   0	218	2	paramj	com.android.dazhihui.a.b.j
    // Exception table:
    //   from	to	target	type
    //   34	51	52	org/json/JSONException
    //   5	30	58	java/lang/Exception
    //   34	51	58	java/lang/Exception
    //   53	57	58	java/lang/Exception
    //   65	69	58	java/lang/Exception
    //   70	85	58	java/lang/Exception
    //   89	104	58	java/lang/Exception
    //   108	187	58	java/lang/Exception
    //   187	205	58	java/lang/Exception
    //   207	211	58	java/lang/Exception
    //   213	217	58	java/lang/Exception
    //   34	51	64	java/io/UnsupportedEncodingException
    //   187	205	206	java/io/FileNotFoundException
    //   187	205	212	java/io/IOException
  }
  
  public void handleTimeout(h paramh) {}
  
  /* Error */
  public void init(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 1013	java/io/BufferedReader
    //   6: dup
    //   7: new 1015	java/io/InputStreamReader
    //   10: dup
    //   11: aload_1
    //   12: invokevirtual 1019	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   15: ldc_w 1021
    //   18: invokevirtual 1027	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: invokespecial 1030	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   24: invokespecial 1033	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: astore_2
    //   28: new 1035	java/lang/StringBuffer
    //   31: dup
    //   32: invokespecial 1036	java/lang/StringBuffer:<init>	()V
    //   35: astore 4
    //   37: aload_2
    //   38: invokevirtual 1039	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnull +13 -> 56
    //   46: aload 4
    //   48: aload_3
    //   49: invokevirtual 1042	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   52: pop
    //   53: goto -16 -> 37
    //   56: aload_0
    //   57: aload 4
    //   59: invokevirtual 1043	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   62: invokevirtual 1045	com/android/dazhihui/ui/model/stock/MarketManager:decode	(Ljava/lang/String;)V
    //   65: new 1013	java/io/BufferedReader
    //   68: dup
    //   69: new 1015	java/io/InputStreamReader
    //   72: dup
    //   73: aload_1
    //   74: invokevirtual 1019	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   77: ldc_w 1047
    //   80: invokevirtual 1027	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   83: invokespecial 1030	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   86: invokespecial 1033	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   89: astore_3
    //   90: new 1035	java/lang/StringBuffer
    //   93: dup
    //   94: invokespecial 1036	java/lang/StringBuffer:<init>	()V
    //   97: astore 4
    //   99: aload_3
    //   100: invokevirtual 1039	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   103: astore_2
    //   104: aload_2
    //   105: ifnull +13 -> 118
    //   108: aload 4
    //   110: aload_2
    //   111: invokevirtual 1042	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   114: pop
    //   115: goto -16 -> 99
    //   118: aload_0
    //   119: aload 4
    //   121: invokevirtual 1043	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   124: invokevirtual 957	com/android/dazhihui/ui/model/stock/MarketManager:decodeStockList	(Ljava/lang/String;)V
    //   127: new 1013	java/io/BufferedReader
    //   130: dup
    //   131: new 1015	java/io/InputStreamReader
    //   134: dup
    //   135: aload_1
    //   136: invokevirtual 1019	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   139: ldc_w 1049
    //   142: invokevirtual 1027	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   145: invokespecial 1030	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   148: invokespecial 1033	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   151: astore_2
    //   152: new 1035	java/lang/StringBuffer
    //   155: dup
    //   156: invokespecial 1036	java/lang/StringBuffer:<init>	()V
    //   159: astore 4
    //   161: aload_2
    //   162: invokevirtual 1039	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   165: astore_3
    //   166: aload_3
    //   167: ifnull +13 -> 180
    //   170: aload 4
    //   172: aload_3
    //   173: invokevirtual 1042	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   176: pop
    //   177: goto -16 -> 161
    //   180: aload_0
    //   181: aload 4
    //   183: invokevirtual 1043	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   186: invokespecial 1051	com/android/dazhihui/ui/model/stock/MarketManager:decodeDecision	(Ljava/lang/String;)V
    //   189: new 991	java/io/File
    //   192: dup
    //   193: new 250	java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   200: aload_1
    //   201: invokevirtual 989	android/content/Context:getFilesDir	()Ljava/io/File;
    //   204: invokevirtual 994	java/io/File:getPath	()Ljava/lang/String;
    //   207: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: ldc_w 996
    //   213: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokespecial 997	java/io/File:<init>	(Ljava/lang/String;)V
    //   222: astore 7
    //   224: aload 7
    //   226: invokevirtual 1054	java/io/File:length	()J
    //   229: l2i
    //   230: newarray <illegal type>
    //   232: astore 6
    //   234: new 1056	java/io/FileInputStream
    //   237: dup
    //   238: aload 7
    //   240: invokespecial 1057	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   243: astore_3
    //   244: aload_3
    //   245: astore_2
    //   246: aload_3
    //   247: aload 6
    //   249: invokevirtual 1061	java/io/FileInputStream:read	([B)I
    //   252: pop
    //   253: aload_3
    //   254: ifnull +7 -> 261
    //   257: aload_3
    //   258: invokevirtual 1062	java/io/FileInputStream:close	()V
    //   261: aload_0
    //   262: new 377	com/android/dazhihui/a/b/q
    //   265: dup
    //   266: aload 6
    //   268: invokespecial 974	com/android/dazhihui/a/b/q:<init>	([B)V
    //   271: invokevirtual 976	com/android/dazhihui/ui/model/stock/MarketManager:decodeFutures	(Lcom/android/dazhihui/a/b/q;)V
    //   274: aload 7
    //   276: invokevirtual 1065	java/io/File:exists	()Z
    //   279: ifeq +11 -> 290
    //   282: aload 7
    //   284: invokevirtual 1068	java/io/File:canRead	()Z
    //   287: ifne +90 -> 377
    //   290: aload_1
    //   291: invokevirtual 1019	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   294: ldc_w 1070
    //   297: invokevirtual 1027	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   300: astore_1
    //   301: aload_1
    //   302: astore_2
    //   303: sipush 1964
    //   306: newarray <illegal type>
    //   308: astore_3
    //   309: aload_1
    //   310: astore_2
    //   311: aload_1
    //   312: aload_3
    //   313: iconst_0
    //   314: aload_3
    //   315: arraylength
    //   316: invokevirtual 1075	java/io/InputStream:read	([BII)I
    //   319: istore 8
    //   321: aload_1
    //   322: astore_2
    //   323: ldc_w 978
    //   326: new 250	java/lang/StringBuilder
    //   329: dup
    //   330: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   333: ldc_w 1077
    //   336: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: iload 8
    //   341: invokevirtual 1080	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   344: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: invokestatic 985	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   350: pop
    //   351: iload 8
    //   353: sipush 1964
    //   356: if_icmpeq +57 -> 413
    //   359: aload_1
    //   360: astore_2
    //   361: aload_1
    //   362: invokevirtual 1081	java/io/InputStream:close	()V
    //   365: iconst_0
    //   366: ifeq +11 -> 377
    //   369: new 1083	java/lang/NullPointerException
    //   372: dup
    //   373: invokespecial 1084	java/lang/NullPointerException:<init>	()V
    //   376: athrow
    //   377: return
    //   378: astore 4
    //   380: aconst_null
    //   381: astore_3
    //   382: aload_3
    //   383: astore_2
    //   384: aload 4
    //   386: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   389: aload_3
    //   390: ifnull -129 -> 261
    //   393: aload_3
    //   394: invokevirtual 1062	java/io/FileInputStream:close	()V
    //   397: goto -136 -> 261
    //   400: astore_1
    //   401: aconst_null
    //   402: astore_2
    //   403: aload_2
    //   404: ifnull +7 -> 411
    //   407: aload_2
    //   408: invokevirtual 1062	java/io/FileInputStream:close	()V
    //   411: aload_1
    //   412: athrow
    //   413: aload_1
    //   414: astore_2
    //   415: aload_0
    //   416: new 377	com/android/dazhihui/a/b/q
    //   419: dup
    //   420: aload_3
    //   421: invokespecial 974	com/android/dazhihui/a/b/q:<init>	([B)V
    //   424: invokevirtual 976	com/android/dazhihui/ui/model/stock/MarketManager:decodeFutures	(Lcom/android/dazhihui/a/b/q;)V
    //   427: aload_1
    //   428: ifnull -51 -> 377
    //   431: aload_1
    //   432: invokevirtual 1081	java/io/InputStream:close	()V
    //   435: return
    //   436: astore_2
    //   437: aload 5
    //   439: astore_1
    //   440: aload_2
    //   441: invokevirtual 143	java/io/IOException:printStackTrace	()V
    //   444: aload_1
    //   445: ifnull -68 -> 377
    //   448: aload_1
    //   449: invokevirtual 1081	java/io/InputStream:close	()V
    //   452: return
    //   453: astore_3
    //   454: aconst_null
    //   455: astore_1
    //   456: aload_1
    //   457: astore_2
    //   458: aload_3
    //   459: invokevirtual 334	java/lang/Exception:printStackTrace	()V
    //   462: aload_1
    //   463: ifnull -86 -> 377
    //   466: aload_1
    //   467: invokevirtual 1081	java/io/InputStream:close	()V
    //   470: return
    //   471: astore_1
    //   472: aconst_null
    //   473: astore_2
    //   474: aload_2
    //   475: ifnull +7 -> 482
    //   478: aload_2
    //   479: invokevirtual 1081	java/io/InputStream:close	()V
    //   482: aload_1
    //   483: athrow
    //   484: astore_1
    //   485: goto -11 -> 474
    //   488: astore_3
    //   489: aload_1
    //   490: astore_2
    //   491: aload_3
    //   492: astore_1
    //   493: goto -19 -> 474
    //   496: astore_3
    //   497: goto -41 -> 456
    //   500: astore_2
    //   501: goto -61 -> 440
    //   504: astore_1
    //   505: goto -102 -> 403
    //   508: astore 4
    //   510: goto -128 -> 382
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	513	0	this	MarketManager
    //   0	513	1	paramContext	Context
    //   27	388	2	localObject1	Object
    //   436	5	2	localIOException1	IOException
    //   457	34	2	localContext	Context
    //   500	1	2	localIOException2	IOException
    //   41	380	3	localObject2	Object
    //   453	6	3	localException1	Exception
    //   488	4	3	localObject3	Object
    //   496	1	3	localException2	Exception
    //   35	147	4	localStringBuffer	StringBuffer
    //   378	7	4	localException3	Exception
    //   508	1	4	localException4	Exception
    //   1	437	5	localObject4	Object
    //   232	35	6	arrayOfByte	byte[]
    //   222	61	7	localFile	java.io.File
    //   319	38	8	i	int
    // Exception table:
    //   from	to	target	type
    //   234	244	378	java/lang/Exception
    //   234	244	400	finally
    //   290	301	436	java/io/IOException
    //   290	301	453	java/lang/Exception
    //   290	301	471	finally
    //   303	309	484	finally
    //   311	321	484	finally
    //   323	351	484	finally
    //   361	365	484	finally
    //   415	427	484	finally
    //   458	462	484	finally
    //   440	444	488	finally
    //   303	309	496	java/lang/Exception
    //   311	321	496	java/lang/Exception
    //   323	351	496	java/lang/Exception
    //   361	365	496	java/lang/Exception
    //   415	427	496	java/lang/Exception
    //   303	309	500	java/io/IOException
    //   311	321	500	java/io/IOException
    //   323	351	500	java/io/IOException
    //   361	365	500	java/io/IOException
    //   415	427	500	java/io/IOException
    //   246	253	504	finally
    //   384	389	504	finally
    //   246	253	508	java/lang/Exception
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public void sendMarketType()
  {
    this.reqStklist = new com.android.dazhihui.a.b.f();
    this.reqStklist.c("http://mnews.gw.com.cn/wap/data/scfl.json");
    this.reqStklist.a(this);
    Object localObject = new com.android.dazhihui.a.b.x(2981);
    ((com.android.dazhihui.a.b.x)localObject).c("市场-MarketHomeFragment-2981包获取商品期货和大宗电子的子市场");
    localObject = new m((com.android.dazhihui.a.b.x)localObject);
    ((m)localObject).a(this);
    g.a().a((h)localObject);
  }
  
  public void setMarketVoById(MarketVo paramMarketVo)
  {
    if (paramMarketVo == null) {}
    do
    {
      return;
      if (this.mMarketAllMap == null) {
        this.mMarketAllMap = new HashMap();
      }
      if ("沪深A股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(5), paramMarketVo);
        return;
      }
      if ("沪深指数".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(9), paramMarketVo);
        return;
      }
      if ("创业板".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(21), paramMarketVo);
        return;
      }
      if ("中小板块".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(96), paramMarketVo);
        return;
      }
      if ("板块综合".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(1), paramMarketVo);
        return;
      }
      if ("行业板块".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(298401), paramMarketVo);
        return;
      }
      if ("概念板块".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(298402), paramMarketVo);
        return;
      }
      if ("上证A股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(97), paramMarketVo);
        return;
      }
      if ("深证A股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(98), paramMarketVo);
        return;
      }
      if ("上证B股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(99), paramMarketVo);
        return;
      }
      if ("深证B股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(100), paramMarketVo);
        return;
      }
      if ("深证H股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(101), paramMarketVo);
        return;
      }
      if ("两网及退市".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(102), paramMarketVo);
        return;
      }
      if ("新三板".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(103), paramMarketVo);
        return;
      }
      if ("上证风险".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(104), paramMarketVo);
        return;
      }
      if ("上证退市".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(105), paramMarketVo);
        return;
      }
      if ("深证退市".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(106), paramMarketVo);
        return;
      }
      if ("分级基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(169), paramMarketVo);
        return;
      }
      if ("上证基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295514), paramMarketVo);
        return;
      }
      if ("深证基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295524), paramMarketVo);
        return;
      }
      if ("ETF基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295515), paramMarketVo);
        return;
      }
      if ("LOF基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295516), paramMarketVo);
        return;
      }
      if ("股票基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(233101), paramMarketVo);
        return;
      }
      if ("债券基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(233102), paramMarketVo);
        return;
      }
      if ("混合基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(233103), paramMarketVo);
        return;
      }
      if ("保本基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(233104), paramMarketVo);
        return;
      }
      if ("货币基金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(233105), paramMarketVo);
        return;
      }
      if ("全球指数".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(117), paramMarketVo);
        return;
      }
      if ("Nasdaq中国".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(110), paramMarketVo);
        return;
      }
      if ("NYSE中国".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(108), paramMarketVo);
        return;
      }
      if ("标普500".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(109), paramMarketVo);
        return;
      }
      if ("Nasdaq100".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(111), paramMarketVo);
        return;
      }
      if ("香港指数".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(12), paramMarketVo);
        return;
      }
      if ("港股通".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(107), paramMarketVo);
        return;
      }
      if ("AH股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(112), paramMarketVo);
        return;
      }
      if ("国企股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(113), paramMarketVo);
        return;
      }
      if ("香港主板".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(114), paramMarketVo);
        return;
      }
      if ("红筹股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(115), paramMarketVo);
        return;
      }
      if ("蓝筹股".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(116), paramMarketVo);
        return;
      }
      if ("上证期权".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(298701), paramMarketVo);
        return;
      }
      if ("上证债券".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295513), paramMarketVo);
        return;
      }
      if ("深证债券".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295523), paramMarketVo);
        return;
      }
      if ("上证转债".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295551), paramMarketVo);
        return;
      }
      if ("深证转债".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295553), paramMarketVo);
        return;
      }
      if ("上证回购".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295552), paramMarketVo);
        return;
      }
      if ("深证回购".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295554), paramMarketVo);
        return;
      }
      if ("上证出入库".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295550), paramMarketVo);
        return;
      }
      if ("上证小公募".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(295510), paramMarketVo);
        return;
      }
      if ("人民币中间价".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(118), paramMarketVo);
        return;
      }
      if ("全球外汇".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(119), paramMarketVo);
        return;
      }
      if ("国际贵金属".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(2955110), paramMarketVo);
        return;
      }
      if ("常用商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(146), paramMarketVo);
        return;
      }
      if ("股指期货".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(147), paramMarketVo);
        this.mMarketAllMap.put(Integer.valueOf(24), paramMarketVo);
        return;
      }
      if ("国债期货".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(148), paramMarketVo);
        return;
      }
      if ("上海期货".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(149), paramMarketVo);
        return;
      }
      if ("大连商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(150), paramMarketVo);
        return;
      }
      if ("郑州商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(151), paramMarketVo);
        return;
      }
      if ("商品期指".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(152), paramMarketVo);
        return;
      }
      if ("上海黄金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(153), paramMarketVo);
        return;
      }
      if ("渤海商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(154), paramMarketVo);
        return;
      }
      if ("伦敦LME".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(155), paramMarketVo);
        return;
      }
      if ("纽约NYMEX".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(156), paramMarketVo);
        return;
      }
      if ("纽约COMEX".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(157), paramMarketVo);
        return;
      }
      if ("芝加哥CBOT".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(158), paramMarketVo);
        return;
      }
      if ("ICE洲际商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(159), paramMarketVo);
        return;
      }
      if ("新加坡期货".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(160), paramMarketVo);
        return;
      }
      if ("河北大宗".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(161), paramMarketVo);
        return;
      }
      if ("大圆银泰".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(162), paramMarketVo);
        return;
      }
      if ("君泰贵金属".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(163), paramMarketVo);
        return;
      }
      if ("昆明贵重金属".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(164), paramMarketVo);
        return;
      }
      if ("南京亚太化工".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(165), paramMarketVo);
        return;
      }
      if ("天新茶叶".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(166), paramMarketVo);
        return;
      }
      if ("天津贵金属".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(167), paramMarketVo);
        return;
      }
      if ("浙江商品".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(168), paramMarketVo);
        return;
      }
      if ("DDE决策".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(30), paramMarketVo);
        return;
      }
      if ("个股资金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(34), paramMarketVo);
        return;
      }
      if ("板块资金".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(38), paramMarketVo);
        return;
      }
      if ("5分钟涨幅".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(37), paramMarketVo);
        return;
      }
      if ("盈利预期".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(40), paramMarketVo);
        return;
      }
      if ("阶段统计".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(127), paramMarketVo);
        this.mMarketAllMap.put(Integer.valueOf(2), paramMarketVo);
        return;
      }
      if ("交易关注".equals(paramMarketVo.getName()))
      {
        this.mMarketAllMap.put(Integer.valueOf(42), paramMarketVo);
        return;
      }
    } while (!"异动主题".equals(paramMarketVo.getName()));
    this.mMarketAllMap.put(Integer.valueOf(128), paramMarketVo);
  }
  
  public void setStatisticsUserAction(String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    String str;
    do
    {
      return;
      str = paramString1;
      if (paramString1 == null) {
        str = "";
      }
      if (paramString2.equals("河北大宗"))
      {
        n.a(str, 1227);
        return;
      }
      if (paramString2.equals("大圆银泰"))
      {
        n.a(str, 1228);
        return;
      }
      if (paramString2.equals("君泰贵金属"))
      {
        n.a(str, 1229);
        return;
      }
      if (paramString2.equals("昆明贵重金属"))
      {
        n.a(str, 1230);
        return;
      }
      if (paramString2.equals("南京亚太化工"))
      {
        n.a(str, 1231);
        return;
      }
      if (paramString2.equals("天新茶叶"))
      {
        n.a(str, 1232);
        return;
      }
      if (paramString2.equals("天津贵金属"))
      {
        n.a(str, 1233);
        return;
      }
      if (paramString2.equals("浙江商品"))
      {
        n.a(str, 1234);
        return;
      }
      if (paramString2.equals("云操盘白银"))
      {
        n.a(str, 1235);
        return;
      }
      if (paramString2.equals("云操盘期权"))
      {
        n.a(str, 1236);
        return;
      }
      if (paramString2.equals("股指期货"))
      {
        n.a(str, 1036);
        return;
      }
      if (paramString2.equals("上海期货"))
      {
        n.a(str, 1037);
        return;
      }
      if (paramString2.equals("大连商品"))
      {
        n.a(str, 1038);
        return;
      }
      if (paramString2.equals("郑州商品"))
      {
        n.a(str, 1039);
        return;
      }
      if (paramString2.equals("商品期指"))
      {
        n.a(str, 1040);
        return;
      }
      if (paramString2.equals("上海黄金"))
      {
        n.a(str, 1041);
        return;
      }
      if (paramString2.equals("上海航运"))
      {
        n.a(str, 1035);
        return;
      }
      if (paramString2.equals("渤海商品"))
      {
        n.a(str, 1034);
        return;
      }
      if (paramString2.equals("伦敦LME"))
      {
        n.a(str, 1043);
        return;
      }
      if (paramString2.equals("纽约NYMEX"))
      {
        n.a(str, 1044);
        return;
      }
      if (paramString2.equals("纽约COMEX"))
      {
        n.a(str, 1045);
        return;
      }
      if (paramString2.equals("芝加哥CBOT"))
      {
        n.a(str, 1046);
        return;
      }
      if (paramString2.equals("ICE洲际商品"))
      {
        n.a(str, 1047);
        return;
      }
      if (paramString2.equals("沪深A股"))
      {
        n.a(str, 1252);
        return;
      }
      if (paramString2.equals("沪深指数"))
      {
        n.a(str, 1253);
        return;
      }
      if (paramString2.equals("创业板"))
      {
        n.a(str, 1254);
        return;
      }
      if (paramString2.equals("中小板块"))
      {
        n.a(str, 1255);
        return;
      }
      if (paramString2.equals("上证A股"))
      {
        n.a(str, 1256);
        return;
      }
      if (paramString2.equals("深证A股"))
      {
        n.a(str, 1258);
        return;
      }
      if (paramString2.equals("港股通"))
      {
        n.a(str, 1259);
        return;
      }
      if (paramString2.equals("上证B股"))
      {
        n.a(str, 1260);
        return;
      }
      if (paramString2.equals("深证B股"))
      {
        n.a(str, 1261);
        return;
      }
      if (paramString2.equals("深证H股"))
      {
        n.a(str, 1262);
        return;
      }
      if (paramString2.equals("两网及退市"))
      {
        n.a(str, 1263);
        return;
      }
      if (paramString2.equals("新三板"))
      {
        n.a(str, 1264);
        return;
      }
      if (paramString2.equals("上证风险"))
      {
        n.a(str, 1265);
        return;
      }
      if (paramString2.equals("上证退市"))
      {
        n.a(str, 1266);
        return;
      }
      if (paramString2.equals("深证退市"))
      {
        n.a(str, 1267);
        return;
      }
      if (paramString2.equals("上证基金"))
      {
        n.a(str, 1268);
        return;
      }
      if (paramString2.equals("深证基金"))
      {
        n.a(str, 1269);
        return;
      }
      if (paramString2.equals("ETF基金"))
      {
        n.a(str, 1270);
        return;
      }
      if (paramString2.equals("LOF基金"))
      {
        n.a(str, 1271);
        return;
      }
      if (paramString2.equals("股票基金"))
      {
        n.a(str, 1272);
        return;
      }
      if (paramString2.equals("债券基金"))
      {
        n.a(str, 1274);
        return;
      }
      if (paramString2.equals("混合基金"))
      {
        n.a(str, 1275);
        return;
      }
      if (paramString2.equals("保本基金"))
      {
        n.a(str, 1276);
        return;
      }
      if (paramString2.equals("货币基金"))
      {
        n.a(str, 1277);
        return;
      }
      if (paramString2.equals("上证债券"))
      {
        n.a(str, 1278);
        return;
      }
      if (paramString2.equals("上证转债"))
      {
        n.a(str, 1279);
        return;
      }
      if (paramString2.equals("上证回购"))
      {
        n.a(str, 1280);
        return;
      }
      if (paramString2.equals("上证出入库"))
      {
        n.a(str, 1281);
        return;
      }
      if (paramString2.equals("深证债券"))
      {
        n.a(str, 1282);
        return;
      }
      if (paramString2.equals("深证转债"))
      {
        n.a(str, 1284);
        return;
      }
      if (paramString2.equals("深证回购"))
      {
        n.a(str, 1285);
        return;
      }
      if (paramString2.equals("常用商品"))
      {
        n.a(str, 1286);
        return;
      }
      if (paramString2.equals("国债期货"))
      {
        n.a(str, 1287);
        return;
      }
      if (paramString2.equals("比特币模拟"))
      {
        n.a(str, 1288);
        return;
      }
      if (paramString2.equals("比特币"))
      {
        n.a(str, 1289);
        return;
      }
      if (paramString2.equals("渤海酒业"))
      {
        n.a(str, 1290);
        return;
      }
      if (paramString2.equals("滨海电子商务"))
      {
        n.a(str, 1291);
        return;
      }
      if (paramString2.equals("泛亚有色金属"))
      {
        n.a(str, 1293);
        return;
      }
      if (paramString2.equals("上证期权"))
      {
        n.a(str, 1294);
        return;
      }
      if (paramString2.equals("股指期权"))
      {
        n.a(str, 1295);
        return;
      }
      if (paramString2.equals("新加坡期货"))
      {
        n.a(str, 1076);
        return;
      }
      if (paramString2.equals("分级基金"))
      {
        n.a(str, 1399);
        return;
      }
      if (paramString2.equals("上证小公募"))
      {
        n.a(str, 1400);
        return;
      }
      if (paramString2.equals("DDE决策"))
      {
        n.a(str, 1238);
        return;
      }
      if (paramString2.equals("个股资金"))
      {
        n.a(str, 1145);
        return;
      }
      if (paramString2.equals("板块资金"))
      {
        n.a(str, 1239);
        return;
      }
      if (paramString2.equals("5分钟涨幅"))
      {
        n.a(str, 1240);
        return;
      }
      if (paramString2.equals("盈利预期"))
      {
        n.a(str, 1241);
        return;
      }
      if (paramString2.equals("阶段统计"))
      {
        n.a(str, 1242);
        return;
      }
      if (paramString2.equals("交易关注"))
      {
        n.a(str, 1146);
        return;
      }
      if (paramString2.equals("异动主题"))
      {
        n.a(str, 1147);
        return;
      }
      if (paramString2.equals("期权"))
      {
        n.a(str, 1181);
        return;
      }
      if (paramString2.equals("沪深指数"))
      {
        n.a(str, 1326);
        return;
      }
      if (paramString2.equals("股指期货"))
      {
        n.a(str, 1327);
        return;
      }
      if (paramString2.equals("全球指数"))
      {
        n.a(str, 1328);
        return;
      }
      if (paramString2.equals("涨跌幅更多"))
      {
        n.a(str, 1196);
        return;
      }
      if (paramString2.equals("五分钟涨跌幅更多"))
      {
        n.a(str, 1197);
        return;
      }
      if (paramString2.equals("资金流更多"))
      {
        n.a(str, 1198);
        return;
      }
      if (paramString2.equals("换手率更多"))
      {
        n.a(str, 1199);
        return;
      }
      if (paramString2.equals("港股通"))
      {
        n.a(str, 1259);
        return;
      }
      if (paramString2.equals("AH股"))
      {
        n.a(str, 1200);
        return;
      }
      if (paramString2.equals("国企股"))
      {
        n.a(str, 1201);
        return;
      }
      if (paramString2.equals("香港主板"))
      {
        n.a(str, 1202);
        return;
      }
      if (paramString2.equals("全球指数"))
      {
        n.a(str, 1203);
        return;
      }
      if (paramString2.equals("人民币中间价"))
      {
        n.a(str, 1204);
        return;
      }
      if (paramString2.equals("全球外汇"))
      {
        n.a(str, 1205);
        return;
      }
      if (paramString2.equals("全球原油更多"))
      {
        n.a(str, 1208);
        return;
      }
      if (paramString2.equals("分级A"))
      {
        n.a(str, 1402);
        return;
      }
      if (paramString2.equals("看盘宝"))
      {
        n.a(str, 1418);
        return;
      }
      if (paramString2.equals("要闻"))
      {
        n.a(str, 1419);
        return;
      }
    } while (!paramString2.equals("板块更多"));
    n.a(str, 1195);
  }
  
  public void update() {}
  
  public void update2() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MarketManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */