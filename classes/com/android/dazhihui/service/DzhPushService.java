package com.android.dazhihui.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import com.android.dazhihui.receiver.WakeUpServiceReciver;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.w;
import com.d.a.c.a;
import com.d.a.c.bu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DzhPushService
  extends Service
{
  public static String B;
  public static String C;
  public static t D;
  public static u E;
  public static String F;
  public static String H;
  public static Map<String, String> I;
  public static Map<String, String> J;
  public static Map<String, String> K;
  public static Map<String, String> L;
  public static Map<String, String> M;
  public static Map<String, String> N;
  public static int P;
  public static int Q;
  private static SharedPreferences W;
  private static ArrayList<t> X;
  public static bu a;
  private static ArrayList<q> ai;
  private static ArrayList<r> aj;
  public static String h = "DzhPublicRedPoint";
  public static String j = "DzhRoomOnline";
  public static long k = 60000L;
  public static int l = 100;
  public static int m = 101;
  public static int n = 102;
  public static int o = 103;
  public static int p = 104;
  public static int q = 106;
  public static int r = 108;
  public static int s = 109;
  public static int t = 110;
  public static int u = 111;
  public static int v = 112;
  public static int w = 113;
  public static int x = 114;
  public static int y = 115;
  public static int z = 116;
  public boolean A = false;
  public String G;
  public boolean O = false;
  public Runnable R = new c(this);
  public o S = new o(this);
  private int T = 0;
  private int U = 1;
  private long V = 60000L;
  private String Y = "ws://" + B + "/ws?token=%s&username=%s&firstchannelid=%s&platform=%s&appversion=%s&deviceid=%s&latestchannelid=%s";
  private String Z = "https://gw.yundzh.com/token/access?appid=%s&secret_key=%s&deviceid=%s";
  private String aa = "https://gw.yundzh.com/token/refresh?access_token=%s&appid=%s&secret_key=%s";
  private String ab = "/msg/cancoel?qid=%s";
  private String ac = "";
  private String ad = "";
  private String ae = "";
  private com.android.dazhihui.a.v af;
  private boolean ag = false;
  private ArrayList<String> ah = new ArrayList();
  private com.android.dazhihui.v ak;
  private SharedPreferences al;
  private n am;
  public final String b = "DzhAdPush";
  final String c = "DzhRedPoint";
  final String d = "DzhRpcircle";
  final String e = "DzhSpecialNews";
  final String f = "DzhHotsVideo";
  final String g = "DzhHotsVideoStock";
  public String i = "DzhHotNews";
  
  static
  {
    X = new ArrayList();
    if ("formal".equals("beta")) {
      B = "10.15.89.119";
    }
    for (;;)
    {
      C = "DZHPUSHSERVICERESTART";
      F = "com.android.dazhihui.service.DzhPushService";
      H = "0";
      I = new HashMap();
      J = new HashMap();
      K = new HashMap();
      L = new HashMap();
      M = new HashMap();
      N = new HashMap();
      ai = new ArrayList();
      aj = new ArrayList();
      P = 1;
      Q = 2;
      return;
      if ("formal".equals("local")) {
        B = "10.15.144.80";
      } else {
        B = "v2.yundzh.com:81";
      }
    }
  }
  
  private String a(int paramInt, String paramString)
  {
    String str2 = com.android.dazhihui.g.a().v();
    String str3 = com.android.dazhihui.g.a().u();
    String str4 = w.a().o();
    String str1;
    if (!w.a().l())
    {
      this.ac = "";
      this.ag = false;
      str1 = null;
      if (paramInt != 0) {
        break label519;
      }
      if (!paramString.equals("DzhAdPush")) {
        break label186;
      }
      W = getSharedPreferences("DzhPush", 0);
      paramString = W.getString("slotversion", "");
      str1 = W.getString("propversion", "");
      str1 = "/advert/get?userid=" + this.ac + "&deviceid=" + str2 + "&propversion=" + str1 + "&slotversion=" + paramString + "&sub=1&output=json" + "&qid=DzhAdPush" + "&channelid=" + str3;
    }
    label186:
    label519:
    while (paramInt != 1)
    {
      do
      {
        return str1;
        this.ag = true;
        break;
        if (paramString.equals("DzhRedPoint"))
        {
          if (TextUtils.isEmpty(this.ac)) {}
          for (paramString = "D_" + str2;; paramString = "U_" + this.ac) {
            return "/msg/get?from=system&type=channel&subtype=redpoint&qid=DzhRedPoint&format=json&sub=1&to=" + paramString;
          }
        }
        if (paramString.equals("DzhRpcircle"))
        {
          if (TextUtils.isEmpty(this.ac)) {}
          for (paramString = "D_" + str2;; paramString = "U_" + this.ac) {
            return "/msg/get?type=channel&subtype=rpcircle&qid=DzhRpcircle&to=" + paramString;
          }
        }
        if (paramString.equals("DzhHotsVideo"))
        {
          paramString = "/ilvb/tiplist?qid=DzhHotsVideo&sub=1&version=" + H + "&usertoken=" + str4;
          Log.d("pushService", "getRequestUrl------------>" + paramString);
          return paramString;
        }
        if (paramString.equals(h)) {
          return "/msg/get?output=json&qid=DzhPublicRedPoint&type=channel&subtype=rpcommon&sub=1&to=SystemCommonRedPointDzh";
        }
        if (paramString.equals("DzhHotsVideoStock")) {
          return "/ilvb/tiplist?qid=DzhHotsVideoStock&sub=1&version=" + H + "&kline=kline" + "&obj=" + "&usertoken=" + str4;
        }
      } while (!paramString.equals(j));
      return "/msg/get?output=json&qid=DzhRoomOnline&type=channel&subtype=roomlivesize&from=System&to=Dzh&sub=1";
    }
    return "/cancel?qid=" + paramString;
  }
  
  public static void a(int paramInt)
  {
    if ((a == null) || (!a.i()))
    {
      if (D != null) {
        D.a(null, 1, P);
      }
      return;
    }
    String str2 = com.android.dazhihui.g.a().v();
    String str3 = com.android.dazhihui.g.a().u();
    String str1 = w.a().f();
    if (!w.a().l()) {
      str1 = "";
    }
    str1 = "/user/news/get?userid=" + str1 + "&deviceid=" + str2 + "&qid=DzhSpecialNews" + "&channelid=" + str3 + "&page=" + paramInt + "&output=json";
    a.a(str1);
    com.android.dazhihui.d.n.e("pushService", "SPECIALNEWS --------->" + str1);
  }
  
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setAction(F);
    localIntent.setPackage("com.android.dazhihui");
    paramContext.startService(localIntent);
  }
  
  public static void a(q paramq)
  {
    if ((paramq != null) && (!ai.contains(paramq))) {
      ai.add(paramq);
    }
  }
  
  public static void a(t paramt)
  {
    if ((paramt != null) && (!X.contains(paramt))) {
      X.add(paramt);
    }
  }
  
  public static void a(u paramu)
  {
    E = paramu;
  }
  
  public static void a(String paramString)
  {
    if (W == null) {}
    do
    {
      do
      {
        return;
      } while (!W.getBoolean("isShowStockVide", true));
      String str = w.a().o();
      w.a().f();
      if (!w.a().l()) {}
      paramString = "/ilvb/tiplist?qid=DzhHotsVideoStock&sub=1&version=0&type=kline&obj=" + paramString + "&usertoken=" + str;
      com.android.dazhihui.d.n.e("pushService", "sendHotVideoStockRequest --------->" + paramString);
    } while ((a == null) || (!a.i()));
    a.a(paramString);
  }
  
  private void a(String paramString, int paramInt)
  {
    try
    {
      paramString = new JSONObject(paramString).getJSONObject("Data").getJSONArray("RepDataUserNews");
      if ((paramString != null) && (paramString.length() > 0))
      {
        paramString = paramString.getJSONObject(0).toString();
        Message localMessage = this.S.obtainMessage(r);
        localMessage.arg1 = paramInt;
        localMessage.obj = paramString;
        this.S.sendMessage(localMessage);
      }
      return;
    }
    catch (JSONException paramString) {}
  }
  
  public static void b(int paramInt)
  {
    if ((a == null) || (!a.i()))
    {
      if (D != null) {
        D.a(null, 1, Q);
      }
      return;
    }
    String str1 = com.android.dazhihui.g.a().v();
    String str2 = com.android.dazhihui.g.a().u();
    w.a().f();
    String str3 = w.a().o();
    if (!w.a().l()) {}
    str1 = "/user/news/getv2?usertoken=" + str3 + "&deviceid=" + str1 + "&qid=DzhHotNews" + "&channelid=" + str2 + "&page=" + paramInt + "&output=json";
    a.a(str1);
    com.android.dazhihui.d.n.e("pushService", "HOTNEWS --------->" + str1);
  }
  
  public static void b(q paramq)
  {
    if ((paramq != null) && (ai.contains(paramq))) {
      ai.remove(paramq);
    }
  }
  
  public static void b(t paramt)
  {
    if ((paramt != null) && (X.contains(paramt))) {
      X.remove(paramt);
    }
  }
  
  private void b(String paramString)
  {
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString).getJSONObject("Data");
        if (paramString == null) {
          break label190;
        }
        localObject1 = paramString.getJSONArray("RepDataMsgGetOutput");
        paramString = (String)localObject2;
        if (localObject1 != null)
        {
          paramString = ((JSONArray)localObject1).getJSONObject(0).getJSONArray("msgs");
          if (paramString == null) {
            break label185;
          }
        }
      }
      catch (JSONException paramString)
      {
        return;
      }
      try
      {
        if (paramString.length() <= 0) {
          break label185;
        }
        paramString = new JSONArray(paramString.getJSONObject(paramString.length() - 1).getString("msg"));
        if (paramString == null) {
          break label185;
        }
        paramString = paramString.getJSONObject(0);
        if (paramString == null) {
          break label185;
        }
        paramString.getJSONObject("header").getString("vs");
        paramString = paramString.getJSONArray("data");
        if (paramString == null) {
          break label185;
        }
        paramString = (ArrayList)new com.c.a.k().a(paramString.toString(), new l(this).getType());
      }
      catch (JSONException paramString)
      {
        paramString = (String)localObject2;
        continue;
      }
      Object localObject1 = this.S.obtainMessage(w);
      ((Message)localObject1).obj = paramString;
      this.S.sendMessage((Message)localObject1);
      return;
      label185:
      paramString = null;
      continue;
      label190:
      localObject1 = null;
    }
  }
  
  private void c(String paramString)
  {
    ArrayList localArrayList = null;
    for (;;)
    {
      try
      {
        this.O = false;
        paramString = new JSONObject(paramString).getJSONObject("Data");
        if (paramString == null) {
          break label175;
        }
        localObject = paramString.getJSONArray("RepDataTipList");
        if (localObject == null) {
          break label170;
        }
        paramString = ((JSONArray)localObject).getJSONObject(0).getString("Period");
        ((JSONArray)localObject).getJSONObject(0).getString("Version");
        if (localObject != null)
        {
          localObject = ((JSONArray)localObject).getJSONObject(0).getJSONArray("OwnerList");
          com.c.a.k localk = new com.c.a.k();
          if (localObject != null) {
            localArrayList = (ArrayList)localk.a(((JSONArray)localObject).toString(), new m(this).getType());
          }
          localObject = new HotVideoVo();
          ((HotVideoVo)localObject).setPeriod(paramString);
          ((HotVideoVo)localObject).setStocklist(localArrayList);
          paramString = this.S.obtainMessage(x);
          paramString.obj = localObject;
          this.S.sendMessage(paramString);
          return;
        }
      }
      catch (JSONException paramString)
      {
        j();
        return;
      }
      Object localObject = null;
      continue;
      label170:
      paramString = null;
      continue;
      label175:
      localObject = null;
    }
  }
  
  public static void d()
  {
    e();
    String str = w.a().o();
    w.a().f();
    if (!w.a().l()) {}
    str = "/ilvb/tiplist?qid=DzhHotsVideo&type=home&sub=1&version=" + H + "&usertoken=" + str;
    com.android.dazhihui.d.n.e("pushService", "sendHotVideoRequest --------->" + str);
    if ((a == null) || (!a.i())) {
      return;
    }
    a.a(str);
  }
  
  private void d(String paramString)
  {
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        this.O = false;
        paramString = new JSONObject(paramString).getJSONObject("Data");
        if (paramString != null)
        {
          localObject1 = paramString.getJSONArray("RepDataTipList");
          if (localObject1 != null)
          {
            str3 = ((JSONArray)localObject1).getJSONObject(0).getString("Period");
            paramString = ((JSONArray)localObject1).getJSONObject(0).getString("Version");
          }
        }
      }
      catch (JSONException paramString)
      {
        Object localObject2;
        com.c.a.k localk;
        j();
        return;
      }
      try
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(0).getString("ShowType");
        str1 = paramString;
        paramString = (String)localObject2;
      }
      catch (JSONException localJSONException)
      {
        String str2 = paramString;
        paramString = "";
        continue;
      }
      if (localObject1 != null)
      {
        localObject1 = ((JSONArray)localObject1).getJSONObject(0).getJSONArray("OwnerList");
        localk = new com.c.a.k();
        localObject2 = localObject3;
        if (localObject1 != null) {
          localObject2 = (ArrayList)localk.a(((JSONArray)localObject1).toString(), new d(this).getType());
        }
        localObject1 = new HotVideoVo();
        ((HotVideoVo)localObject1).setPeriod(str3);
        ((HotVideoVo)localObject1).setStocklist((ArrayList)localObject2);
        ((HotVideoVo)localObject1).setShowType(paramString);
        if ((TextUtils.isEmpty(str1)) || (H.equals(str1)))
        {
          if ((TextUtils.isEmpty(paramString)) || (paramString.equals("1")) || (paramString.equals("2")))
          {
            com.android.dazhihui.d.n.e("pushService", "ShowType --------->" + paramString);
            return;
          }
          com.android.dazhihui.d.n.e("pushService", "ShowType --------->" + paramString);
        }
        H = str1;
        paramString = this.S.obtainMessage(v);
        paramString.obj = localObject1;
        this.S.sendMessage(paramString);
        return;
      }
      Object localObject1 = null;
      continue;
      String str1 = "";
      String str3 = null;
      paramString = "";
      continue;
      localObject1 = null;
    }
  }
  
  public static void e()
  {
    com.android.dazhihui.d.n.e("pushService", "cancelHotVideoRequest --------->" + "/cancel?qid=DzhHotsVideo");
    if ((a == null) || (!a.i())) {
      return;
    }
    a.a("/cancel?qid=DzhHotsVideo");
  }
  
  private void e(String paramString)
  {
    com.android.dazhihui.ui.a.m.a().b(paramString);
    com.android.dazhihui.d.n.f("pushService", "online number:" + paramString);
    if (aj.size() > 0)
    {
      Iterator localIterator = aj.iterator();
      while (localIterator.hasNext()) {
        ((r)localIterator.next()).a(paramString);
      }
    }
  }
  
  public static void f()
  {
    com.android.dazhihui.d.n.e("pushService", "cancelHotVideoRequest --------->" + "/cancel?qid=DzhHotsVideoStock");
    if ((a == null) || (!a.i())) {
      return;
    }
    a.a("/cancel?qid=DzhHotsVideoStock");
  }
  
  /* Error */
  private void f(String paramString)
  {
    // Byte code:
    //   0: new 477	org/json/JSONObject
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 478	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: ldc_w 480
    //   11: invokevirtual 484	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull +425 -> 441
    //   19: aload_1
    //   20: ldc_w 654
    //   23: invokevirtual 490	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   26: astore_1
    //   27: aload_1
    //   28: ifnull +406 -> 434
    //   31: aload_1
    //   32: iconst_0
    //   33: invokevirtual 499	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   36: ldc_w 656
    //   39: invokevirtual 490	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   42: astore_2
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 499	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   48: ldc_w 658
    //   51: invokevirtual 537	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   54: astore_1
    //   55: new 546	com/c/a/k
    //   58: dup
    //   59: invokespecial 547	com/c/a/k:<init>	()V
    //   62: astore_3
    //   63: aload_2
    //   64: ifnull +365 -> 429
    //   67: aload_3
    //   68: aload_2
    //   69: invokevirtual 548	org/json/JSONArray:toString	()Ljava/lang/String;
    //   72: new 660	com/android/dazhihui/service/e
    //   75: dup
    //   76: aload_0
    //   77: invokespecial 661	com/android/dazhihui/service/e:<init>	(Lcom/android/dazhihui/service/DzhPushService;)V
    //   80: invokevirtual 662	com/android/dazhihui/service/e:getType	()Ljava/lang/reflect/Type;
    //   83: invokevirtual 558	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   86: checkcast 132	java/util/ArrayList
    //   89: astore_2
    //   90: aload_0
    //   91: ldc_w 310
    //   94: iconst_0
    //   95: invokevirtual 314	com/android/dazhihui/service/DzhPushService:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   98: putstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   101: getstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   104: ldc_w 324
    //   107: ldc_w 261
    //   110: invokeinterface 322 3 0
    //   115: astore_3
    //   116: aload_1
    //   117: invokestatic 353	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   120: ifne +303 -> 423
    //   123: getstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   126: invokeinterface 666 1 0
    //   131: ldc_w 324
    //   134: aload_1
    //   135: invokeinterface 672 3 0
    //   140: invokeinterface 675 1 0
    //   145: pop
    //   146: aload_3
    //   147: aload_1
    //   148: invokevirtual 147	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   151: ifne +272 -> 423
    //   154: iconst_1
    //   155: istore 9
    //   157: aload_2
    //   158: ifnull +303 -> 461
    //   161: aload_2
    //   162: invokevirtual 630	java/util/ArrayList:size	()I
    //   165: ifle +296 -> 461
    //   168: getstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   171: ldc_w 316
    //   174: ldc_w 261
    //   177: invokeinterface 322 3 0
    //   182: astore_1
    //   183: lconst_0
    //   184: lstore 13
    //   186: lload 13
    //   188: lstore 11
    //   190: aload_1
    //   191: invokestatic 353	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   194: ifne +18 -> 212
    //   197: lload 13
    //   199: lstore 11
    //   201: iload 9
    //   203: ifne +9 -> 212
    //   206: aload_1
    //   207: invokestatic 681	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   210: lstore 11
    //   212: new 165	java/util/HashMap
    //   215: dup
    //   216: invokespecial 166	java/util/HashMap:<init>	()V
    //   219: astore 5
    //   221: new 683	com/android/dazhihui/service/s
    //   224: dup
    //   225: aload_0
    //   226: invokespecial 684	com/android/dazhihui/service/s:<init>	(Lcom/android/dazhihui/service/DzhPushService;)V
    //   229: astore 4
    //   231: aload 4
    //   233: aload 5
    //   235: invokevirtual 687	com/android/dazhihui/service/s:a	(Ljava/util/Map;)V
    //   238: iconst_0
    //   239: istore 10
    //   241: iload 10
    //   243: aload_2
    //   244: invokevirtual 630	java/util/ArrayList:size	()I
    //   247: if_icmpge +92 -> 339
    //   250: new 689	com/android/dazhihui/service/p
    //   253: dup
    //   254: aload_0
    //   255: invokespecial 690	com/android/dazhihui/service/p:<init>	(Lcom/android/dazhihui/service/DzhPushService;)V
    //   258: astore 6
    //   260: aload_2
    //   261: iload 10
    //   263: invokevirtual 694	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   266: checkcast 696	com/android/dazhihui/ui/model/stock/PushAdDataVo
    //   269: astore 8
    //   271: aload 8
    //   273: invokevirtual 699	com/android/dazhihui/ui/model/stock/PushAdDataVo:getSlot	()Ljava/lang/String;
    //   276: astore 7
    //   278: aload 8
    //   280: invokevirtual 702	com/android/dazhihui/ui/model/stock/PushAdDataVo:getVersion	()Ljava/lang/String;
    //   283: astore_3
    //   284: aload 8
    //   286: invokevirtual 705	com/android/dazhihui/ui/model/stock/PushAdDataVo:getData	()Ljava/lang/String;
    //   289: astore 8
    //   291: aload_3
    //   292: invokestatic 681	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   295: lstore 13
    //   297: aload 6
    //   299: aload 8
    //   301: putfield 706	com/android/dazhihui/service/p:b	Ljava/lang/String;
    //   304: aload 6
    //   306: aload_3
    //   307: putfield 708	com/android/dazhihui/service/p:a	Ljava/lang/String;
    //   310: aload 5
    //   312: aload 7
    //   314: aload 6
    //   316: invokeinterface 714 3 0
    //   321: pop
    //   322: lload 13
    //   324: lload 11
    //   326: lcmp
    //   327: ifle +93 -> 420
    //   330: aload_3
    //   331: astore_1
    //   332: lload 13
    //   334: lstore 11
    //   336: goto +110 -> 446
    //   339: aload_0
    //   340: ldc_w 310
    //   343: iconst_0
    //   344: invokevirtual 314	com/android/dazhihui/service/DzhPushService:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   347: putstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   350: getstatic 288	com/android/dazhihui/service/DzhPushService:W	Landroid/content/SharedPreferences;
    //   353: invokeinterface 666 1 0
    //   358: ldc_w 316
    //   361: aload_1
    //   362: invokeinterface 672 3 0
    //   367: invokeinterface 675 1 0
    //   372: pop
    //   373: aload_0
    //   374: getfield 285	com/android/dazhihui/service/DzhPushService:S	Lcom/android/dazhihui/service/o;
    //   377: getstatic 106	com/android/dazhihui/service/DzhPushService:n	I
    //   380: invokevirtual 504	com/android/dazhihui/service/o:obtainMessage	(I)Landroid/os/Message;
    //   383: astore_1
    //   384: aload_1
    //   385: aload 4
    //   387: putfield 513	android/os/Message:obj	Ljava/lang/Object;
    //   390: iload 9
    //   392: ifeq +18 -> 410
    //   395: aload_1
    //   396: iconst_1
    //   397: putfield 509	android/os/Message:arg1	I
    //   400: aload_0
    //   401: getfield 285	com/android/dazhihui/service/DzhPushService:S	Lcom/android/dazhihui/service/o;
    //   404: aload_1
    //   405: invokevirtual 517	com/android/dazhihui/service/o:sendMessage	(Landroid/os/Message;)Z
    //   408: pop
    //   409: return
    //   410: aload_1
    //   411: iconst_0
    //   412: putfield 509	android/os/Message:arg1	I
    //   415: goto -15 -> 400
    //   418: astore_1
    //   419: return
    //   420: goto +26 -> 446
    //   423: iconst_0
    //   424: istore 9
    //   426: goto -269 -> 157
    //   429: aconst_null
    //   430: astore_2
    //   431: goto -341 -> 90
    //   434: aconst_null
    //   435: astore_1
    //   436: aconst_null
    //   437: astore_2
    //   438: goto -383 -> 55
    //   441: aconst_null
    //   442: astore_1
    //   443: goto -416 -> 27
    //   446: iload 10
    //   448: iconst_1
    //   449: iadd
    //   450: istore 10
    //   452: goto -211 -> 241
    //   455: astore_1
    //   456: aconst_null
    //   457: astore_1
    //   458: goto -403 -> 55
    //   461: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	462	0	this	DzhPushService
    //   0	462	1	paramString	String
    //   42	396	2	localObject1	Object
    //   62	269	3	localObject2	Object
    //   229	157	4	locals	s
    //   219	92	5	localHashMap	HashMap
    //   258	57	6	localp	p
    //   276	37	7	str	String
    //   269	31	8	localObject3	Object
    //   155	270	9	i1	int
    //   239	212	10	i2	int
    //   188	147	11	l1	long
    //   184	149	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   0	15	418	org/json/JSONException
    //   19	27	418	org/json/JSONException
    //   31	43	418	org/json/JSONException
    //   55	63	418	org/json/JSONException
    //   67	90	418	org/json/JSONException
    //   90	154	418	org/json/JSONException
    //   161	183	418	org/json/JSONException
    //   190	197	418	org/json/JSONException
    //   206	212	418	org/json/JSONException
    //   212	238	418	org/json/JSONException
    //   241	322	418	org/json/JSONException
    //   339	390	418	org/json/JSONException
    //   395	400	418	org/json/JSONException
    //   400	409	418	org/json/JSONException
    //   410	415	418	org/json/JSONException
    //   43	55	455	org/json/JSONException
  }
  
  private void g(String paramString)
  {
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString).getJSONObject("Data");
        int i2;
        if (paramString != null)
        {
          paramString = paramString.getJSONArray("RepDataMsgGetOutput");
          W = getSharedPreferences("DzhPush", 0);
          i2 = W.getInt("circlepointtotalnumber", 0);
          if (paramString != null)
          {
            paramString = paramString.getJSONObject(0).getJSONArray("msgs");
            if (paramString == null) {}
          }
        }
        Object localObject2;
        int i1;
        paramString = null;
      }
      catch (JSONException paramString)
      {
        try
        {
          if (paramString.length() > 0)
          {
            paramString = paramString.getJSONObject(paramString.length() - 1);
            localObject2 = paramString.getString("msg");
            i1 = paramString.getInt("extra");
            i2 = i1 - i2;
            W.edit().putInt("circlepointtotalnumber", i1).commit();
            W.edit().putInt("circlepointtotalnumber", i2).commit();
            paramString = (String)localObject1;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject2 = new JSONArray((String)localObject2);
              paramString = (String)localObject1;
              if (localObject2 != null)
              {
                localObject2 = ((JSONArray)localObject2).getJSONObject(0);
                paramString = (String)localObject1;
                if (localObject2 != null)
                {
                  localObject1 = ((JSONObject)localObject2).getJSONObject("header").getString("vs");
                  localObject2 = ((JSONObject)localObject2).getJSONArray("data");
                  paramString = (String)localObject1;
                  if (localObject2 != null)
                  {
                    ((JSONArray)localObject2).getJSONObject(0).getInt("type");
                    paramString = (String)localObject1;
                  }
                }
              }
            }
            if (i2 > 0)
            {
              localObject1 = this.S.obtainMessage(t);
              ((Message)localObject1).obj = paramString;
              this.S.sendMessage((Message)localObject1);
            }
          }
          return;
        }
        catch (JSONException paramString)
        {
          return;
        }
        paramString = paramString;
        return;
      }
    }
  }
  
  private void h(String paramString)
  {
    JSONArray localJSONArray = null;
    String str = null;
    int i2 = 0;
    for (;;)
    {
      int i1;
      try
      {
        paramString = new JSONObject(paramString).getJSONObject("Data");
        if (paramString == null) {
          break label252;
        }
        localObject1 = paramString.getJSONArray("RepDataMsgGetOutput");
        paramString = str;
        i1 = i2;
        if (localObject1 != null)
        {
          localObject2 = ((JSONArray)localObject1).getJSONObject(0).getJSONArray("msgs");
          paramString = str;
          i1 = i2;
          if (localObject2 != null)
          {
            paramString = str;
            i1 = i2;
            localObject1 = localJSONArray;
          }
        }
      }
      catch (JSONException paramString)
      {
        Object localObject2;
        return;
      }
      try
      {
        if (((JSONArray)localObject2).length() > 0)
        {
          localObject1 = localJSONArray;
          localObject2 = new JSONArray(((JSONArray)localObject2).getJSONObject(((JSONArray)localObject2).length() - 1).getString("msg"));
          paramString = str;
          i1 = i2;
          if (localObject2 != null)
          {
            localObject1 = localJSONArray;
            localObject2 = ((JSONArray)localObject2).getJSONObject(0);
            paramString = str;
            i1 = i2;
            if (localObject2 != null)
            {
              localObject1 = localJSONArray;
              str = ((JSONObject)localObject2).getJSONObject("header").getString("vs");
              localObject1 = str;
              localJSONArray = ((JSONObject)localObject2).getJSONArray("data");
              paramString = str;
              i1 = i2;
              if (localJSONArray != null)
              {
                localObject1 = str;
                i1 = localJSONArray.getJSONObject(0).getInt("type");
                paramString = str;
              }
            }
          }
        }
      }
      catch (JSONException paramString)
      {
        paramString = (String)localObject1;
        i1 = i2;
        continue;
      }
      if (i1 == 1)
      {
        localObject1 = this.S.obtainMessage(q);
        ((Message)localObject1).obj = paramString;
        this.S.sendMessage((Message)localObject1);
      }
      return;
      label252:
      Object localObject1 = null;
    }
  }
  
  private void i()
  {
    HotVideoVo localHotVideoVo = new HotVideoVo();
    localHotVideoVo.setPeriod("0");
    localHotVideoVo.setStocklist(null);
    Message localMessage = this.S.obtainMessage(x);
    localMessage.obj = localHotVideoVo;
    this.S.sendMessage(localMessage);
  }
  
  private void i(String paramString)
  {
    str2 = "";
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString).getJSONObject("Data");
      str1 = str2;
      if (paramString != null)
      {
        paramString = localJSONObject.getJSONArray("RepDataMsgGetOutput");
        str1 = str2;
        if (paramString != null)
        {
          paramString = paramString.getJSONObject(0).getJSONArray("msgs");
          str1 = str2;
          if (paramString != null)
          {
            str1 = str2;
            if (paramString.length() > 0)
            {
              paramString = paramString.getJSONObject(0).getString("msg");
              str1 = str2;
              if (!TextUtils.isEmpty(paramString)) {
                str1 = new JSONObject(paramString).getString("size");
              }
            }
          }
        }
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        String str1 = str2;
      }
    }
    paramString = this.S.obtainMessage(y);
    paramString.obj = str1;
    this.S.sendMessage(paramString);
  }
  
  private void j()
  {
    HotVideoVo localHotVideoVo = new HotVideoVo();
    localHotVideoVo.setPeriod("0");
    localHotVideoVo.setStocklist(null);
    Message localMessage = this.S.obtainMessage(v);
    localMessage.obj = localHotVideoVo;
    this.S.sendMessage(localMessage);
  }
  
  private void j(String paramString)
  {
    if (this.am != null) {
      this.am.a(paramString);
    }
  }
  
  private void k()
  {
    this.ac = w.a().f();
    this.ad = w.a().i();
    this.A = false;
    if (!w.a().l()) {
      this.ac = "";
    }
    for (this.ag = false;; this.ag = true)
    {
      this.S.removeCallbacks(this.R);
      this.S.removeMessages(l);
      this.S.removeMessages(m);
      this.S.removeMessages(p);
      this.S.removeMessages(u);
      if (a != null) {
        a.d();
      }
      String str1 = com.android.dazhihui.g.a().v();
      String str2 = com.android.dazhihui.g.a().u();
      this.G = com.android.dazhihui.g.a().r();
      String str3 = com.android.dazhihui.g.a().y() + "";
      String str4 = com.android.dazhihui.g.a().t();
      str1 = String.format(this.Y, new Object[] { this.ae, this.ac, str2, str4, this.G, str1, str3 });
      a.a().a(str1, null, new f(this));
      return;
    }
  }
  
  public void a()
  {
    this.ah.clear();
    I.clear();
    I.put("1246", "沪深");
    I.put("1384", "板块");
    I.put("20000", "全球");
    I.put("20109", "港美");
    I.put("20208", "外汇");
    I.put("20111", "更多");
    J.clear();
    J.put("20218", "慧理财");
    J.put("20108", "私募");
    J.put("20005", "分级");
    J.put("20008", "更多");
    K.clear();
    K.put("20200", "综合");
    K.put("20201", "行情");
    K.put("20202", "路演");
    L.clear();
    L.put("20217", "理财");
    L.put("20203", "A股");
    L.put("20204", "港美");
    L.put("20205", "开户");
    N.clear();
    N.put("20113", "新股");
    N.put("20025", "慧问");
    N.put("20015", "机会");
    N.put("20231", "热播");
    N.put("20013", "微视频");
    N.put("20016", "路演");
    N.put("20009", "快讯");
    N.put("20258", "热读");
    N.put("1311", "更多");
    M.clear();
    M.put("20092", "万2.5佣金");
    M.put("20115", "盈亏统计");
    M.put("20096", "决策");
    M.put("20265", "新股");
    M.put("20206", "热播");
    M.put("20098", "抢红包");
    M.put("20100", "钱包");
    M.put("20099", "客服");
    M.put("20095", "我的导师");
    M.put("20097", "路演");
    M.put("20101", "兑奖");
    M.put("20102", "旗舰店");
    M.put("20103", "模拟大赛");
    M.put("20104", "微视频");
    M.put("20105", "股友圈");
    M.put("20107", "慧投票");
    this.ah.add("20092");
    this.ah.add("20115");
    this.ah.add("20096");
    this.ah.add("20113");
    this.ah.add("20206");
    this.ah.add("20098");
    this.ah.add("20092");
    this.ah.add("20100");
    this.ah.add("20095");
    this.ah.add("20097");
    this.ah.add("20101");
    this.ah.add("20102");
    this.ah.add("20103");
    this.ah.add("20104");
    this.ah.add("20105");
    this.ah.add("20107");
  }
  
  public void a(ArrayList<RedPointVo> paramArrayList)
  {
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      paramArrayList = paramArrayList.iterator();
      int i2 = 10;
      if (paramArrayList.hasNext())
      {
        Object localObject = (RedPointVo)paramArrayList.next();
        String str1 = ((RedPointVo)localObject).getType();
        String str2;
        if (N.containsKey(str1)) {
          if (!TextUtils.isEmpty(str1))
          {
            str2 = this.al.getString(str1, null);
            if (TextUtils.isEmpty(str2)) {
              ah.d.put(str1, localObject);
            }
          }
          else
          {
            label95:
            i1 = ah.m;
            ah.a().b(10003);
          }
        }
        label243:
        label356:
        label458:
        label547:
        do
        {
          localObject = ai.iterator();
          for (;;)
          {
            i2 = i1;
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
            ((q)((Iterator)localObject).next()).a(str1, i1);
          }
          if (((RedPointVo)localObject).getVs().equals(str2)) {
            break label95;
          }
          ah.d.put(str1, localObject);
          break label95;
          if (L.containsKey(str1))
          {
            if (!TextUtils.isEmpty(str1))
            {
              str2 = this.al.getString(str1, null);
              if (!TextUtils.isEmpty(str2)) {
                break label243;
              }
              ah.i.put(str1, localObject);
            }
            for (;;)
            {
              i1 = ah.n;
              ah.a().b(10004);
              break;
              if (!((RedPointVo)localObject).getVs().equals(str2)) {
                ah.i.put(str1, localObject);
              }
            }
          }
          if ((J.containsKey(str1)) || (K.containsKey(str1)) || (I.containsKey(str1)))
          {
            if (J.containsKey(str1)) {
              if (!TextUtils.isEmpty(str1))
              {
                str2 = this.al.getString(str1, null);
                if (TextUtils.isEmpty(str2)) {
                  ah.g.put(str1, localObject);
                }
              }
              else
              {
                i1 = ah.k;
              }
            }
            do
            {
              ah.a().b(10002);
              break;
              if (((RedPointVo)localObject).getVs().equals(str2)) {
                break label356;
              }
              ah.g.put(str1, localObject);
              break label356;
              if (K.containsKey(str1))
              {
                if (!TextUtils.isEmpty(str1))
                {
                  str2 = this.al.getString(str1, null);
                  if (!TextUtils.isEmpty(str2)) {
                    break label458;
                  }
                  ah.h.put(str1, localObject);
                }
                for (;;)
                {
                  i1 = ah.l;
                  break;
                  if (!((RedPointVo)localObject).getVs().equals(str2)) {
                    ah.h.put(str1, localObject);
                  }
                }
              }
              i1 = i2;
            } while (!I.containsKey(str1));
            if (!TextUtils.isEmpty(str1))
            {
              str2 = this.al.getString(str1, null);
              if (!TextUtils.isEmpty(str2)) {
                break label547;
              }
              ah.f.put(str1, localObject);
            }
            for (;;)
            {
              i1 = ah.j;
              break;
              if (!((RedPointVo)localObject).getVs().equals(str2)) {
                ah.f.put(str1, localObject);
              }
            }
          }
          i1 = i2;
        } while (!M.containsKey(str1));
        int i1 = ah.o;
        if (!TextUtils.isEmpty(str1))
        {
          str2 = this.al.getString(str1, null);
          if (!TextUtils.isEmpty(str2)) {
            break label645;
          }
          ah.e.put(str1, localObject);
        }
        for (;;)
        {
          ah.a().b(10001);
          break;
          label645:
          if (!((RedPointVo)localObject).getVs().equals(str2)) {
            ah.e.put(str1, localObject);
          }
        }
      }
    }
  }
  
  public void b()
  {
    this.ae = com.android.dazhihui.o.a().c();
    com.android.dazhihui.d.n.e("pushService", "mToken --------->" + this.ae);
    k();
  }
  
  public void c()
  {
    this.S.removeCallbacks(this.R);
    if (this.A)
    {
      if (a == null) {
        return;
      }
      com.android.dazhihui.d.n.f("pushService", "ping --------->" + hashCode());
      this.A = false;
      DateFormat.format("yyyy-MM-dd HH:mm:ss", System.currentTimeMillis()).toString();
      a.b("");
      this.S.postDelayed(this.R, k);
      return;
    }
    k();
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    W = getSharedPreferences("DzhPush", 0);
    a();
    super.onCreate();
  }
  
  public void onDestroy()
  {
    if (a != null) {
      a.d();
    }
    a = null;
    com.android.dazhihui.a.g.a().b(this.af);
    com.android.dazhihui.o.a().b(this.ak);
    this.S.removeCallbacks(this.R);
    this.S.removeMessages(l);
    this.S.removeMessages(m);
    this.S.removeMessages(p);
    AlarmManager localAlarmManager = (AlarmManager)getSystemService("alarm");
    Object localObject = new Intent(this, WakeUpServiceReciver.class);
    ((Intent)localObject).setAction(C);
    localObject = PendingIntent.getBroadcast(this, 0, (Intent)localObject, 0);
    localAlarmManager.set(0, System.currentTimeMillis() + k, (PendingIntent)localObject);
    super.onDestroy();
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    H = "0";
    this.O = true;
    if (L.size() == 0) {
      a();
    }
    this.al = getSharedPreferences(h, 0);
    this.ac = w.a().f();
    w.a().m();
    if (!w.a().l()) {
      this.ac = "";
    }
    this.ad = w.a().i();
    if (this.af == null) {
      this.af = new j(this);
    }
    com.android.dazhihui.a.g.a().a(this.af);
    if (this.ak != null) {
      com.android.dazhihui.o.a().b(this.ak);
    }
    this.ak = new k(this);
    com.android.dazhihui.o.a().a(this.ak);
    b();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (a != null) {
      a.d();
    }
    return super.onStartCommand(paramIntent, 1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\DzhPushService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */