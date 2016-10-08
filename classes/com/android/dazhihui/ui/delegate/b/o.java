package com.android.dazhihui.ui.delegate.b;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.screen.CancelTable;
import com.android.dazhihui.ui.delegate.screen.CapitalandHoldingTable;
import com.android.dazhihui.ui.delegate.screen.EntrustNew;
import com.android.dazhihui.ui.delegate.screen.InitVerifedChuanCai;
import com.android.dazhihui.ui.delegate.screen.InitVerifedDongHai;
import com.android.dazhihui.ui.delegate.screen.MobileLogin;
import com.android.dazhihui.ui.delegate.screen.MobileLoginHS;
import com.android.dazhihui.ui.delegate.screen.MobileVerifed;
import com.android.dazhihui.ui.delegate.screen.RegionTable;
import com.android.dazhihui.ui.delegate.screen.TradeOutsideScreen;
import com.android.dazhihui.ui.delegate.screen.fund.FundAtone;
import com.android.dazhihui.ui.delegate.screen.fund.FundEntrust;
import com.android.dazhihui.ui.delegate.screen.fund.IFundEntrust;
import com.android.dazhihui.ui.delegate.screen.hk.HKCaptialHolding;
import com.android.dazhihui.ui.delegate.screen.hk.HKTradeCommon;
import com.android.dazhihui.ui.delegate.screen.hk.bk;
import com.android.dazhihui.ui.delegate.screen.margin.MarginCommonScreen;
import com.android.dazhihui.ui.delegate.screen.margin.MarginCommonScreen2;
import com.android.dazhihui.ui.delegate.screen.margin.MarginQuery;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockMainActivity;
import com.android.dazhihui.ui.delegate.screen.otc.OtcEntrust;
import com.android.dazhihui.ui.delegate.screen.xc.trade.TradeCommonStock;
import com.android.dazhihui.ui.delegate.screen.xc.trade.TradeQuery;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.cairh.app.sjkh.MainActivity;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o
{
  public static String[][] A = { { "2", "深A" }, { "3", "沪A" }, { "4", "深B" }, { "5", "沪B" }, { "9", "特A" }, { "10", "特B" }, { "17", "港股通" } };
  public static int B = 0;
  public static String C;
  public static String D;
  private static com.android.dazhihui.c.a.a E;
  private static h F;
  private static String[] G;
  private static Calendar H;
  private static String[][] I;
  private static String[][] J;
  private static String[][] K;
  private static String[][] L;
  private static String[][] M;
  private static String[][] N;
  private static int O;
  private static String[] P = { "11104", "11118", "11124", "11126", "11130", "11132", "11134", "11136", "11138", "11140", "11142", "11144", "11146", "11148", "11150", "11152", "11154", "11156", "11158", "11162", "11164", "11906", "11908", "11910", "11912", "11916", "11924", "11926", "12000", "12016", "12024", "12028", "12030", "12050", "12052", "12054", "12064", "12070", "12076", "12078", "12086", "12092", "12096", "12098", "12102", "12104", "12108", "12110", "12112", "12114", "12116", "12118", "12122", "12126", "12128", "12130", "12132", "12138", "12140", "12142", "12144", "12146", "12148", "12152", "12154", "12158", "12160", "12162", "12176", "12178", "12180", "12184", "12190", "12194", "12196", "12198", "12202", "12206", "12208", "12210", "12214", "12216", "12218", "12220", "12224", "12226", "12228", "12238", "12240", "12242", "12244", "12248", "12252", "12258", "12260", "12262", "12264", "12266", "12268", "12270", "12272", "12274", "12276", "12278", "12280", "12282", "12284", "12286", "12290", "12292", "12294", "12298", "12300", "12302", "12310", "12314", "12318", "12320", "12322", "12324", "12326", "12328", "12330", "12332", "12338", "12340", "12344", "12346", "12350", "12352", "12354", "12356", "12358", "12364", "12368", "12370", "12372", "12374", "12376", "12378", "12382", "12384", "12388", "12390", "12394", "12396", "12398", "12400", "12402", "12406", "12410", "12412", "12414", "12416", "12418", "12422", "12426", "12430", "12432", "12434", "12436", "12438", "12440", "12444", "12448", "12450", "12452", "12454", "12456", "12458", "12460", "12464", "12466", "12468", "12470", "12472", "12474", "12476", "12480", "12482", "12484", "12486", "12488", "12490", "12510", "12522", "12524", "12528", "12534", "12536", "12540", "12544", "12548", "12550", "12554", "12556", "12558", "12568", "12570", "12572", "12574", "12576", "12578", "12580", "12586", "12588", "12590", "12592", "12594", "12598", "12600", "12604", "12608", "12610", "12614", "12616", "12618", "12620", "12622", "12624", "12626", "12628", "12630", "12634", "12636", "12638", "12640", "12642", "12646", "12648", "12654", "12656", "12658", "12660", "12662", "12664", "12666", "12668", "12672", "12676", "12678", "12680", "12682", "12684", "12686", "12688", "12690", "12692", "12696", "12698", "12702", "12704", "12706", "12708", "12710", "12714", "12718", "12720", "12722", "12726", "12728", "12730", "12732", "12734", "12736", "12738", "12740", "12742", "12750", "12752", "12756", "12760", "12764", "12766", "12770", "12774", "12776", "12778", "12780", "12782", "12784", "12786", "12788", "12792", "12794", "12796", "12798", "12800", "12802", "12804", "12806", "12814", "12816", "12818", "12820", "12822", "12828", "12834", "12838", "12840", "12842", "12844", "12846", "12848", "12854", "12858", "12860", "12862", "12864", "12872", "12874", "12876", "12880", "12882", "12884", "12886", "12890", "12892", "12894", "12898", "12902", "12904", "12912", "12914", "12916", "12918", "12920", "12924", "12926", "12932", "12934", "12938", "12940", "12946", "12948", "12952", "12954", "12956", "12520", "12494", "12496", "12506", "12514", "12516", "12518", "18006", "18010" };
  private static List<String> Q;
  private static String[] R = { "31100", "31200", "31300", "31400", "31500", "31600", "30100", "31700", "32021", "32022", "30110", "32041", "31800", "31101" };
  private static List<String> S;
  private static String[] T = { "36100", "36201", "36200", "36202", "36301", "36302", "36303", "36304", "36400", "30100", "36500", "30110", "32041", "36101" };
  private static List<String> U;
  public static boolean a = false;
  public static boolean b = false;
  public static boolean c = false;
  public static String d = "";
  public static String e = "";
  public static String f = "";
  public static String g = "";
  public static String h = "";
  public static boolean i = false;
  public static String j;
  public static String k;
  public static String l = "";
  public static String[] m;
  public static String[] n = new String[2];
  public static boolean o = false;
  public static String p;
  public static String q;
  public static boolean r = false;
  public static String s;
  public static int t = -1;
  public static boolean u;
  public static int v;
  public static int w;
  public static int x;
  public static int y;
  public static String[][] z;
  
  static
  {
    G = new String[] { "21010", "1205", "1207", "1203", "1005", "1016", "1030", "6129", "6130", "6131", "1202", "6183" };
    u = false;
    v = 0;
    w = 1;
    x = 2;
    y = v;
    H = Calendar.getInstance();
    I = new String[][] { { "0", "人民币" }, { "1", "美元" }, { "2", "港币" }, { "9", "所有币种" } };
    J = new String[][] { { "0", "资金转入" }, { "1", "资金转出" }, { "2", "余额查询" } };
    String[] arrayOfString1 = { "10", "申购" };
    String[] arrayOfString2 = { "19", "未知类别" };
    String[] arrayOfString3 = { "20", "配股缴款" };
    String[] arrayOfString4 = { "29", "解除指定" };
    String[] arrayOfString5 = { "40", "五档买入" };
    String[] arrayOfString6 = { "45", "兑付" };
    String[] arrayOfString7 = { "48", "调帐转入" };
    K = new String[][] { { "0", "买入" }, { "1", "卖出" }, { "2", "转托管" }, { "3", "配股" }, { "4", "撤买" }, { "5", "认购" }, { "6", "撤卖" }, { "7", "转股" }, { "8", "红利" }, { "9", "手续费" }, arrayOfString1, { "11", "赎回" }, { "12", "行权" }, { "13", "行权撤单" }, { "18", "撤单" }, arrayOfString2, arrayOfString3, { "21", "转债转股" }, { "22", "转债回售" }, { "23", "新股申购" }, { "24", "新股缴款" }, { "25", "融资" }, { "26", "认购" }, { "27", "认估" }, { "28", "指定交易" }, arrayOfString4, { "30", "预受要约" }, { "31", "解除预受" }, { "32", "回购解除" }, { "33", "回购指定" }, { "34", "配债" }, { "35", "配售缴款" }, { "36", "配售放弃" }, { "37", "对方买入" }, { "38", "本方买入" }, { "39", "即时买入" }, arrayOfString5, { "41", "融券" }, { "42", "配号" }, { "43", "配售" }, { "44", "送股" }, arrayOfString6, { "46", "托管转入" }, { "47", "托管转出" }, arrayOfString7, { "49", "调帐转出" }, { "50", "成本调整" }, { "51", "费用返还" } };
    arrayOfString1 = new String[] { "2", "SZ" };
    arrayOfString2 = new String[] { "3", "SH" };
    arrayOfString3 = new String[] { "12", "OF" };
    L = new String[][] { arrayOfString1, arrayOfString2, { "4", "SZ" }, { "5", "SH" }, arrayOfString3 };
    M = new String[][] { { "0", "不可撤" }, { "1", "可撤" } };
    arrayOfString1 = new String[] { "3", "上海A股" };
    arrayOfString2 = new String[] { "9", "A股特别转让" };
    N = new String[][] { { "0", "资金帐户" }, { "1", "客户号" }, { "2", "深圳A股" }, arrayOfString1, { "4", "深圳B股" }, { "5", "上海B股" }, { "6", "深圳国债" }, { "7", "上海国债" }, { "8", "深圳创业" }, arrayOfString2, { "10", "B股特别转让" }, { "17", "港股通" }, { "50", "其他类别账号" } };
    O = 0;
  }
  
  public static String A()
  {
    byte[] arrayOfByte = com.a.a.a.a.a.a("77c10133-432a-493d-a53c-bcaa57beefb0:366c24d9-c0ff-4cb6-a593-1ec00e7eeb10".getBytes("UTF-8"));
    System.out.println("RESULT: " + new String(arrayOfByte));
    return new String(arrayOfByte);
  }
  
  public static String B()
  {
    Object localObject = D();
    if (localObject != null) {}
    String str;
    do
    {
      return (String)localObject;
      str = C();
      localObject = str;
    } while (str != null);
    return "";
  }
  
  public static String C()
  {
    Object localObject1 = (WifiManager)com.android.dazhihui.b.b.a().f().getSystemService("wifi");
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = ((WifiManager)localObject1).getConnectionInfo();
        if (localObject1 != null)
        {
          localObject1 = ((WifiInfo)localObject1).getMacAddress();
          Object localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = "";
          }
          return (String)localObject3;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
      Object localObject2 = null;
    }
  }
  
  public static String D()
  {
    if (com.android.dazhihui.b.b.a().f() != null) {}
    for (Object localObject1 = (TelephonyManager)com.android.dazhihui.b.b.a().f().getSystemService("phone");; localObject1 = null)
    {
      if (localObject1 != null) {}
      for (localObject1 = ((TelephonyManager)localObject1).getDeviceId();; localObject1 = null)
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = "";
        }
        return (String)localObject2;
      }
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {}
    return -12563843;
  }
  
  public static String a(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  public static String a(String paramString, int paramInt)
  {
    int i1 = paramString.indexOf(".");
    if (i1 == -1) {}
    while (i1 + paramInt >= paramString.length()) {
      return paramString;
    }
    return paramString.substring(0, i1 + 1 + paramInt);
  }
  
  public static String a(String[][] paramArrayOfString, String paramString, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    while (i1 < paramArrayOfString.length)
    {
      if (paramArrayOfString[i1][paramInt1].equals(paramString)) {
        return paramArrayOfString[i1][paramInt2];
      }
      i1 += 1;
    }
    return "";
  }
  
  private static void a(int paramInt, Context paramContext, Bundle paramBundle)
  {
    if (paramContext == null) {
      return;
    }
    if (paramInt == v) {}
    for (String str = "普通交易";; str = "融资融券")
    {
      new AlertDialog.Builder(paramContext).setTitle("提示信息").setMessage("该功能仅支持" + str + "，是否切换交易系统？").setNegativeButton("取消", null).setPositiveButton("确认", new p(paramBundle, paramContext)).setCancelable(false).show();
      return;
      if (paramInt != w) {
        break;
      }
    }
  }
  
  public static void a(Activity paramActivity, boolean paramBoolean)
  {
    c localc = com.android.dazhihui.ui.delegate.a.a().c();
    Intent localIntent = new Intent();
    localIntent.setClass(paramActivity, MainActivity.class);
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 1)
    {
      localIntent.putExtra("configUrl", com.android.dazhihui.a.f.aq);
      localIntent.putExtra("type", i1);
      localIntent.putExtra("username", localc.d());
      localIntent.putExtra("password", new String(s(localc.e())));
      paramActivity.startActivityForResult(localIntent, 13);
      return;
    }
  }
  
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putInt("TAB_ID", 805306368);
    localIntent.setClass(paramContext, MainScreen.class);
    localIntent.putExtras(localBundle);
    localIntent.addFlags(67108864);
    paramContext.startActivity(localIntent);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putInt("TAB_ID", 805306368);
    localBundle.putInt("fragment_index", paramInt);
    localIntent.setClass(paramContext, MainScreen.class);
    localIntent.putExtras(localBundle);
    localIntent.addFlags(67108864);
    paramContext.startActivity(localIntent);
  }
  
  public static void a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    paramString1 = n.e(paramString1);
    if (!r())
    {
      if (paramString1 != null) {
        e.a().g(paramString1);
      }
      if (paramString2 != null) {
        e.a().h(paramString2);
      }
      switch (paramInt2)
      {
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        e.a().a(localBundle);
        a(paramContext);
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                return;
                                localBundle.putString("gotoFlag", "138");
                                break;
                                localBundle.putString("gotoFlag", "139");
                                break;
                                localBundle.putString("gotoFlag", "chedan");
                                break;
                                localBundle.putString("gotoFlag", "chicang");
                                break;
                                e.a().a(paramString1);
                                localBundle.putString("gotoFlag", "137");
                                break;
                                e.a().d(paramString1);
                                localBundle.putString("gotoFlag", "140");
                                break;
                                e.a().d(paramString1);
                                localBundle.putString("gotoFlag", "181");
                                break;
                                e.a().d(paramString1);
                                localBundle.putString("gotoFlag", "fundchedan");
                                break;
                                e.a().b(paramString1);
                                localBundle.putString("gotoFlag", "141");
                                break;
                                localBundle.putString("gotoFlag", "183");
                                break;
                                localBundle.putString("gotoFlag", "184");
                                break;
                                e.a().c(paramString1);
                                localBundle.putString("gotoFlag", "142");
                                break;
                                switch (paramInt2)
                                {
                                default: 
                                  return;
                                case 0: 
                                  if (((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (l()) || (m()) || (i())) && (y == v))
                                  {
                                    localBundle.putInt("type", 0);
                                    if (paramString2 != null) {
                                      localBundle.putString("sprice", paramString2);
                                    }
                                    if (paramString1 != null) {
                                      localBundle.putString("scode", paramString1);
                                    }
                                    localIntent.setClass(paramContext, TradeCommonStock.class);
                                    localIntent.putExtras(localBundle);
                                    paramContext.startActivity(localIntent);
                                    return;
                                  }
                                  if (y == w)
                                  {
                                    localBundle.putInt("type", 0);
                                    if (paramString1 != null) {
                                      localBundle.putString("scode", paramString1);
                                    }
                                    if (paramString2 != null) {
                                      localBundle.putString("sprice", paramString2);
                                    }
                                    localIntent.setClass(paramContext, MarginCommonScreen.class);
                                    localIntent.putExtras(localBundle);
                                    paramContext.startActivity(localIntent);
                                    return;
                                  }
                                  if (y == v)
                                  {
                                    localBundle.putInt("screenId", 0);
                                    if (paramString2 != null) {
                                      localBundle.putString("sprice", paramString2);
                                    }
                                    if (paramString1 != null) {
                                      localBundle.putString("scode", paramString1);
                                    }
                                    localIntent.setClass(paramContext, EntrustNew.class);
                                    localIntent.putExtras(localBundle);
                                    paramContext.startActivity(localIntent);
                                    return;
                                  }
                                  break;
                                }
                              } while (y != x);
                              localBundle.putInt("screenId", 0);
                              if (paramString2 != null) {
                                localBundle.putString("sprice", paramString2);
                              }
                              if (paramString1 != null) {
                                localBundle.putString("codes", paramString1);
                              }
                              localIntent.setClass(paramContext, HKTradeCommon.class);
                              localIntent.putExtras(localBundle);
                              paramContext.startActivity(localIntent);
                              return;
                              if (((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (l()) || (m()) || (i())) && (y == v))
                              {
                                localBundle.putInt("type", 1);
                                if (paramString2 != null) {
                                  localBundle.putString("sprice", paramString2);
                                }
                                if (paramString1 != null) {
                                  localBundle.putString("scode", paramString1);
                                }
                                localIntent.setClass(paramContext, TradeCommonStock.class);
                                localIntent.putExtras(localBundle);
                                paramContext.startActivity(localIntent);
                                return;
                              }
                              if (y == w)
                              {
                                localBundle.putInt("type", 1);
                                if (paramString1 != null) {
                                  localBundle.putString("scode", paramString1);
                                }
                                if (paramString2 != null) {
                                  localBundle.putString("sprice", paramString2);
                                }
                                localIntent.setClass(paramContext, MarginCommonScreen.class);
                                localIntent.putExtras(localBundle);
                                paramContext.startActivity(localIntent);
                                return;
                              }
                              if (y == v)
                              {
                                localBundle.putInt("screenId", 1);
                                if (paramString2 != null) {
                                  localBundle.putString("sprice", paramString2);
                                }
                                if (paramString1 != null) {
                                  localBundle.putString("scode", paramString1);
                                }
                                localIntent.setClass(paramContext, EntrustNew.class);
                                localIntent.putExtras(localBundle);
                                paramContext.startActivity(localIntent);
                                return;
                              }
                            } while (y != x);
                            localBundle.putInt("screenId", 1);
                            if (paramString2 != null) {
                              localBundle.putString("sprice", paramString2);
                            }
                            if (paramString1 != null) {
                              localBundle.putString("codes", paramString1);
                            }
                            localIntent.setClass(paramContext, HKTradeCommon.class);
                            localIntent.putExtras(localBundle);
                            paramContext.startActivity(localIntent);
                            return;
                            if (((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (l()) || (m()) || (i())) && (y == v))
                            {
                              localBundle.putInt("type", 2);
                              localIntent.setClass(paramContext, TradeCommonStock.class);
                              localIntent.putExtras(localBundle);
                              paramContext.startActivity(localIntent);
                              return;
                            }
                            if (y == w)
                            {
                              localBundle.putInt("type", 2);
                              localIntent.setClass(paramContext, MarginCommonScreen.class);
                              localIntent.putExtras(localBundle);
                              paramContext.startActivity(localIntent);
                              return;
                            }
                            if (y == v)
                            {
                              localIntent.setClass(paramContext, CancelTable.class);
                              paramContext.startActivity(localIntent);
                              return;
                            }
                          } while (y != x);
                          localBundle.putInt("screenId", 2);
                          localIntent.setClass(paramContext, HKTradeCommon.class);
                          localIntent.putExtras(localBundle);
                          paramContext.startActivity(localIntent);
                          return;
                          if (((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (l()) || (m()) || (i())) && (y == v))
                          {
                            localBundle.putInt("type", 3);
                            localIntent.setClass(paramContext, TradeCommonStock.class);
                            localIntent.putExtras(localBundle);
                            paramContext.startActivity(localIntent);
                            return;
                          }
                          if (y == w)
                          {
                            localBundle.putInt("type", 3);
                            localIntent.setClass(paramContext, MarginCommonScreen.class);
                            localIntent.putExtras(localBundle);
                            paramContext.startActivity(localIntent);
                            return;
                          }
                          if (y == v)
                          {
                            localIntent.setClass(paramContext, CapitalandHoldingTable.class);
                            paramContext.startActivity(localIntent);
                            return;
                          }
                        } while (y != x);
                        localIntent.setClass(paramContext, HKCaptialHolding.class);
                        paramContext.startActivity(localIntent);
                        return;
                      } while (y != w);
                      localBundle.putInt("type", 0);
                      if (paramString1 != null) {
                        localBundle.putString("scode", paramString1);
                      }
                      if (paramString2 != null) {
                        localBundle.putString("sprice", paramString2);
                      }
                      localIntent.setClass(paramContext, MarginCommonScreen.class);
                      localIntent.putExtras(localBundle);
                      paramContext.startActivity(localIntent);
                      return;
                    } while (y != w);
                    localBundle.putInt("mode", 0);
                    localBundle.putInt("type", 0);
                    if (paramString1 != null) {
                      localBundle.putString("scode", paramString1);
                    }
                    localIntent.setClass(paramContext, MarginCommonScreen2.class);
                    localIntent.putExtras(localBundle);
                    paramContext.startActivity(localIntent);
                    return;
                  } while (y != w);
                  localBundle.putInt("type", 1);
                  if (paramString1 != null) {
                    localBundle.putString("scode", paramString1);
                  }
                  if (paramString2 != null) {
                    localBundle.putString("sprice", paramString2);
                  }
                  localIntent.setClass(paramContext, MarginCommonScreen.class);
                  localIntent.putExtras(localBundle);
                  paramContext.startActivity(localIntent);
                  return;
                } while (y != w);
                localBundle.putInt("mode", 1);
                localBundle.putInt("type", 0);
                if (paramString1 != null) {
                  localBundle.putString("scode", paramString1);
                }
                localIntent.setClass(paramContext, MarginCommonScreen2.class);
                localIntent.putExtras(localBundle);
                paramContext.startActivity(localIntent);
                return;
              } while (y != w);
              localBundle.putInt("type", 2);
              localIntent.setClass(paramContext, MarginCommonScreen.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            } while (y != w);
            localBundle.putInt("mode", 3);
            localBundle.putInt("type", 1);
            if (paramString1 != null) {
              localBundle.putString("scode", paramString1);
            }
            localIntent.setClass(paramContext, MarginCommonScreen2.class);
            localIntent.putExtras(localBundle);
            paramContext.startActivity(localIntent);
            return;
          } while (y != w);
          localBundle.putInt("mode", 2);
          localBundle.putInt("type", 1);
          if (paramString1 != null) {
            localBundle.putString("scode", paramString1);
          }
          localIntent.setClass(paramContext, MarginCommonScreen2.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
          if (!e())
          {
            d(paramContext);
            return;
          }
          if (y != v)
          {
            e.a().a(paramString1);
            localBundle.putString("gotoFlag", "137");
            a(paramContext, localBundle);
            return;
          }
          localBundle.putInt("screenId", 16385);
          if (paramString1 != null) {
            localBundle.putString("scode", paramString1);
          }
          localIntent.setClass(paramContext, OtcEntrust.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
          if (!d())
          {
            d(paramContext);
            return;
          }
          if (y != v)
          {
            e.a().d(paramString1);
            localBundle.putString("gotoFlag", "140");
            a(paramContext, localBundle);
            return;
          }
          if (paramString1 != null) {
            localBundle.putString("scode", paramString1);
          }
          localBundle.putInt("screenId", 1);
          localIntent.setClass(paramContext, FundEntrust.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
          if (!d())
          {
            d(paramContext);
            return;
          }
          if (y != v)
          {
            e.a().d(paramString1);
            localBundle.putString("gotoFlag", "181");
            a(paramContext, localBundle);
            return;
          }
          if (paramString1 != null) {
            localBundle.putString("scode", paramString1);
          }
          localBundle.putInt("screenId", 0);
          localIntent.setClass(paramContext, FundEntrust.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
          if (!d())
          {
            d(paramContext);
            return;
          }
          if (y != v)
          {
            e.a().d(paramString1);
            localBundle.putString("gotoFlag", "fundchedan");
            a(paramContext, localBundle);
            return;
          }
          if (paramString1 != null) {
            localBundle.putString("codes", paramString1);
          }
          localIntent.setClass(paramContext, FundAtone.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
          if (y == v)
          {
            if (a())
            {
              localBundle.putInt("type", 0);
              localBundle.putString("scode", paramString1);
              localIntent.setClass(paramContext, NewStockMainActivity.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            }
            if ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (l()) || (m()) || (i()))
            {
              localBundle.putInt("type", 0);
              if (paramString2 != null) {
                localBundle.putString("sprice", paramString2);
              }
              if (paramString1 != null) {
                localBundle.putString("scode", paramString1);
              }
              localIntent.setClass(paramContext, TradeCommonStock.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            }
            localBundle.putInt("screenId", 0);
            if (paramString1 != null) {
              localBundle.putString("scode", paramString1);
            }
            localIntent.setClass(paramContext, EntrustNew.class);
            localIntent.putExtras(localBundle);
            paramContext.startActivity(localIntent);
            return;
          }
          if (y == w)
          {
            if (c())
            {
              localBundle.putInt("type", 0);
              localBundle.putString("scode", paramString1);
              localIntent.setClass(paramContext, NewStockMainActivity.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            }
            localBundle.putInt("type", 0);
            if (paramString1 != null) {
              localBundle.putString("scode", paramString1);
            }
            if (paramString2 != null) {
              localBundle.putString("sprice", paramString2);
            }
            localIntent.setClass(paramContext, MarginCommonScreen.class);
            localIntent.putExtras(localBundle);
            paramContext.startActivity(localIntent);
            return;
          }
          localBundle.putString("gotoFlag", "141");
          a(paramContext, localBundle);
          return;
          if (y == v)
          {
            if ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (i()))
            {
              localBundle.putInt("category", 12024);
              localIntent.setClass(paramContext, TradeQuery.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            }
            d(paramContext);
            return;
          }
          if (y == w)
          {
            localBundle.putInt("category", 12522);
            localIntent.setClass(paramContext, MarginQuery.class);
            localIntent.putExtras(localBundle);
            paramContext.startActivity(localIntent);
            return;
          }
          localBundle.putString("gotoFlag", "183");
          a(paramContext, localBundle);
          return;
          if (y == v)
          {
            if ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (k()) || (i()))
            {
              localBundle.putInt("category", 11148);
              localIntent.setClass(paramContext, TradeQuery.class);
              localIntent.putExtras(localBundle);
              paramContext.startActivity(localIntent);
              return;
            }
            d(paramContext);
            return;
          }
          if (y == w)
          {
            localBundle.putInt("category", 12510);
            localIntent.setClass(paramContext, MarginQuery.class);
            localIntent.putExtras(localBundle);
            paramContext.startActivity(localIntent);
            return;
          }
          localBundle.putString("gotoFlag", "184");
          a(paramContext, localBundle);
          return;
          if (!g())
          {
            d(paramContext);
            return;
          }
          if (y != v)
          {
            e.a().c(paramString1);
            localBundle.putString("gotoFlag", "142");
            a(paramContext, localBundle);
            return;
          }
          if (paramString1 != null) {
            localBundle.putString("scode", paramString1);
          }
          localBundle.putInt("screenId", 0);
          localIntent.setClass(paramContext, IFundEntrust.class);
          localIntent.putExtras(localBundle);
          paramContext.startActivity(localIntent);
          return;
        } while (y != x);
        localBundle.putInt("screenId", 0);
        if (paramString1 != null) {
          localBundle.putString("codes", paramString1);
        }
        if (paramString2 != null) {
          localBundle.putString("sprice", paramString2);
        }
        localIntent.setClass(paramContext, HKTradeCommon.class);
        localIntent.putExtras(localBundle);
        paramContext.startActivity(localIntent);
        return;
      } while (y != x);
      localBundle.putInt("screenId", 1);
      if (paramString1 != null) {
        localBundle.putString("codes", paramString1);
      }
      if (paramString2 != null) {
        localBundle.putString("sprice", paramString2);
      }
      localIntent.setClass(paramContext, HKTradeCommon.class);
      localIntent.putExtras(localBundle);
      paramContext.startActivity(localIntent);
      return;
    } while (y != x);
    localIntent.setClass(paramContext, HKCaptialHolding.class);
    paramContext.startActivity(localIntent);
  }
  
  private static void a(Context paramContext, Bundle paramBundle)
  {
    a(v, paramContext, paramBundle);
  }
  
  public static void a(h paramh)
  {
    F = paramh;
    u = false;
  }
  
  public static void a(BaseActivity paramBaseActivity)
  {
    int i1 = e.a().j();
    if (i1 == -1) {}
    for (;;)
    {
      return;
      E = new com.android.dazhihui.c.a.a(paramBaseActivity);
      com.android.dazhihui.c.a.a.i[i1][1] = "";
      E.a(19);
      E.close();
      Bundle localBundle;
      if (e.a().b() != null)
      {
        localBundle = e.a().b();
        if (localBundle == null) {}
      }
      for (boolean bool = localBundle.getBoolean("haveNoLoginSorHaveOne"); com.android.dazhihui.c.a.a.i[i1][2] != null; bool = false)
      {
        if ("1".equals(com.android.dazhihui.c.a.a.C[i1][3]))
        {
          localBundle = new Bundle();
          localBundle.putBoolean("hidden", false);
          localBundle.putBoolean("haveNoLoginSorHaveOne", bool);
          paramBaseActivity.startActivity(MobileLogin.class, localBundle);
          return;
        }
        if ("2".equals(com.android.dazhihui.c.a.a.C[i1][3]))
        {
          f(paramBaseActivity, bool);
          return;
        }
        if (("3".equals(com.android.dazhihui.c.a.a.C[i1][3])) || ("51".equals(com.android.dazhihui.c.a.a.C[i1][3])))
        {
          c(paramBaseActivity, bool);
          return;
        }
        if (("4".equals(com.android.dazhihui.c.a.a.C[i1][3])) || ("6".equals(com.android.dazhihui.c.a.a.C[i1][3])))
        {
          e(paramBaseActivity, bool);
          return;
        }
        if ("5".equals(com.android.dazhihui.c.a.a.C[i1][3]))
        {
          b(paramBaseActivity, bool);
          return;
        }
        if ("7".equals(com.android.dazhihui.c.a.a.C[i1][3]))
        {
          d(paramBaseActivity, bool);
          return;
        }
        localBundle = new Bundle();
        Intent localIntent = new Intent();
        localBundle.putBoolean("isaddqs", true);
        localIntent.putExtras(localBundle);
        localIntent.setClass(paramBaseActivity, TradeOutsideScreen.class);
        paramBaseActivity.startActivity(localIntent);
        return;
      }
    }
  }
  
  public static void a(BaseActivity paramBaseActivity, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("hidden", false);
    if (paramString != null) {
      localBundle.putString("gotoFlag", paramString);
    }
    localBundle.putBoolean("xcLoginProcedure", paramBoolean1);
    localBundle.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
    paramBaseActivity.startActivity(MobileLogin.class, localBundle);
  }
  
  public static void a(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("haveNoLoginSorHaveOne", paramBoolean);
    paramBaseActivity.startActivity(MobileLoginHS.class, localBundle);
  }
  
  public static void a(String paramString, Activity paramActivity)
  {
    int i4 = 1;
    int i5 = 0;
    int i3 = 0;
    E = new com.android.dazhihui.c.a.a(paramActivity);
    if ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length < 1))
    {
      com.android.dazhihui.c.a.a.M = new String[1];
      com.android.dazhihui.c.a.a.M[0] = paramString;
      E.a(49);
      E.close();
      return;
    }
    int i1 = 0;
    int i2 = 0;
    while (i1 < com.android.dazhihui.c.a.a.M.length)
    {
      if (com.android.dazhihui.c.a.a.M[i1].equals(paramString)) {
        i2 = 1;
      }
      i1 += 1;
    }
    if (i2 != 0)
    {
      paramActivity = new String[com.android.dazhihui.c.a.a.M.length];
      paramActivity[0] = paramString;
      i2 = i4;
      i1 = i3;
      if (i1 < com.android.dazhihui.c.a.a.M.length)
      {
        if (com.android.dazhihui.c.a.a.M[i1].equals(paramString)) {}
        for (;;)
        {
          i1 += 1;
          break;
          paramActivity[i2] = com.android.dazhihui.c.a.a.M[i1];
          i2 += 1;
        }
      }
    }
    for (com.android.dazhihui.c.a.a.M = paramActivity;; com.android.dazhihui.c.a.a.M = paramActivity)
    {
      E.a(49);
      E.close();
      return;
      paramActivity = new String[com.android.dazhihui.c.a.a.M.length + 1];
      paramActivity[0] = paramString;
      i1 = i5;
      while (i1 < com.android.dazhihui.c.a.a.M.length)
      {
        paramActivity[(i1 + 1)] = com.android.dazhihui.c.a.a.M[i1];
        i1 += 1;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    try
    {
      H.set(1, Integer.parseInt(paramString1.substring(0, 4)));
      H.set(2, Integer.parseInt(paramString1.substring(4, 6)) - 1);
      H.set(5, Integer.parseInt(paramString1.substring(6, 8)));
      H.set(11, Integer.parseInt(paramString2.substring(0, 2)));
      H.set(12, Integer.parseInt(paramString1.substring(3, 5)));
      H.set(13, Integer.parseInt(paramString1.substring(6, 8)));
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  private static void a(String[][] paramArrayOfString, String[] paramArrayOfString1)
  {
    int i1 = paramArrayOfString.length;
    i1 = 0;
    while (i1 < paramArrayOfString1.length)
    {
      int i2 = i1 / 2;
      paramArrayOfString[i2][0] = paramArrayOfString1[i1];
      paramArrayOfString[i2][1] = paramArrayOfString1[(i1 + 1)];
      i1 += 2;
    }
  }
  
  public static boolean a()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31100");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool2 = false;
    Object localObject = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(paramString)) {}
    }
    for (;;)
    {
      paramString = (String)localObject;
      if (i1 != -1)
      {
        paramString = (String)localObject;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          paramString = (String)localObject;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            paramString = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (paramString != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(paramString)))
        {
          try
          {
            i1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][2]).length();
            bool1 = bool2;
            if (i1 != 0) {
              bool1 = true;
            }
            return bool1;
          }
          catch (JSONException paramString)
          {
            paramString.printStackTrace();
            return false;
          }
          i1 += 1;
          break;
        }
        i1 += 1;
      }
      i1 = -1;
    }
  }
  
  public static boolean a(String paramString1, String paramString2, Activity paramActivity, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i2 = 0;
    int i4 = 0;
    int i3 = 0;
    B = -1;
    if ((com.android.dazhihui.c.a.a.F == null) || (com.android.dazhihui.c.a.a.F.length == 0) || (com.android.dazhihui.c.a.a.C == null)) {}
    int i1;
    do
    {
      return false;
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.F.length)
      {
        if ((com.android.dazhihui.c.a.a.F[i1].contains(paramString1)) && (com.android.dazhihui.c.a.a.C[i1].length >= 5) && ((com.android.dazhihui.c.a.a.C[i1][4].trim().equals("10")) || (com.android.dazhihui.c.a.a.C[i1][4].trim().equals("11")))) {
          B = i1;
        }
        i1 += 1;
      }
    } while (B == -1);
    if (com.android.dazhihui.c.a.a.C[B][4].trim().equals("11"))
    {
      i1 = i3;
      for (;;)
      {
        paramString1 = (String)localObject2;
        if (i1 < com.android.dazhihui.c.a.a.B[B].length)
        {
          if (!com.android.dazhihui.c.a.a.B[B][i1].equals("")) {
            paramString1 = com.android.dazhihui.c.a.a.B[B][i1];
          }
        }
        else
        {
          if (paramString1 != null) {
            break;
          }
          return true;
        }
        i1 += 1;
      }
      paramString2 = new Intent();
      localObject1 = new Bundle();
      ((Bundle)localObject1).putString("nexturl", paramString1);
      paramString2.putExtras((Bundle)localObject1);
      paramString2.setClass(paramActivity, BrowserActivity.class);
      paramActivity.startActivity(paramString2);
      return true;
    }
    AlertDialog.Builder localBuilder;
    Object localObject4;
    Object localObject3;
    if (com.android.dazhihui.c.a.a.C[B][4].trim().equals("10"))
    {
      localBuilder = new AlertDialog.Builder(paramActivity);
      if (!paramBoolean) {
        break label467;
      }
      localObject4 = u(paramString1);
      D = null;
      if (localObject4 != null) {
        break label410;
      }
      localObject3 = "尊敬的用户：\n        即日起，您可以点击下方按钮直接打开“" + paramString1 + "”进行委托交易，给您带来不便深表歉意，敬请谅解！";
      localObject2 = "0";
      localObject1 = null;
      localBuilder.setTitle("提示").setMessage((CharSequence)localObject3).setPositiveButton("打开委托", new q(paramActivity, paramString1, paramString2));
      if (!((String)localObject2).equals("0")) {
        break label438;
      }
      localBuilder.setNegativeButton("取消", null);
    }
    for (;;)
    {
      localBuilder.show();
      return true;
      label410:
      localObject3 = localObject4[0];
      localObject2 = localObject4[1];
      localObject1 = localObject4[2];
      D = localObject4[3];
      break;
      label438:
      if (((String)localObject2).equals("1")) {
        localBuilder.setNegativeButton((CharSequence)localObject1, new s(paramActivity));
      }
    }
    label467:
    if ((com.android.dazhihui.c.a.a.C != null) && (com.android.dazhihui.c.a.a.C[B].length >= 5) && (com.android.dazhihui.c.a.a.C[B][4].trim().equals("10")))
    {
      i1 = 0;
      label508:
      if (i1 >= com.android.dazhihui.c.a.a.B[B].length) {
        break label1114;
      }
      if (!com.android.dazhihui.c.a.a.B[B][i1].equals(""))
      {
        localObject2 = com.android.dazhihui.c.a.a.B[B][i1];
        i1 = i2;
      }
    }
    for (;;)
    {
      label555:
      if (i1 < com.android.dazhihui.c.a.a.D[B].length) {
        if (com.android.dazhihui.c.a.a.D[B][i1].equals("")) {}
      }
      for (localObject1 = com.android.dazhihui.c.a.a.D[B][i1];; localObject1 = null)
      {
        if ((localObject2 == null) || (localObject1 == null))
        {
          return true;
          i1 += 1;
          break label508;
          i1 += 1;
          break label555;
        }
        for (;;)
        {
          try
          {
            localObject3 = paramActivity.getPackageManager().getLaunchIntentForPackage((String)localObject2);
            if (paramString1.equals("海通证券"))
            {
              localObject4 = new Bundle();
              ((Bundle)localObject4).putString("type", "trade");
              localObject2 = e.a().g();
              if (paramString2 == null)
              {
                ((Bundle)localObject4).putString("id", "0");
                ((Intent)localObject3).putExtras((Bundle)localObject4);
              }
            }
            else
            {
              paramActivity.startActivity((Intent)localObject3);
              a(paramString1, paramActivity);
              return true;
            }
            if (paramString2.equals("138"))
            {
              ((Bundle)localObject4).putString("id", "21001");
              paramString2 = (String)localObject2;
              if (localObject2 == null) {
                paramString2 = "";
              }
              ((Bundle)localObject4).putString("code", paramString2);
              continue;
            }
          }
          catch (Exception paramString1)
          {
            C = (String)localObject1;
            new AlertDialog.Builder(paramActivity);
            localBuilder.setTitle("提示").setMessage("您还未下载“" + com.android.dazhihui.c.a.a.F[B] + "”是否进行下载？").setPositiveButton("下载", new t(paramActivity)).setNegativeButton("取消", null).show();
          }
          if (paramString2.equals("139"))
          {
            ((Bundle)localObject4).putString("id", "21002");
            paramString2 = (String)localObject2;
            if (localObject2 == null) {
              paramString2 = "";
            }
            ((Bundle)localObject4).putString("code", paramString2);
          }
          else if (paramString2.equals("chedan"))
          {
            ((Bundle)localObject4).putString("id", "21003");
          }
          else if (paramString2.equals("chicang"))
          {
            ((Bundle)localObject4).putString("id", "21004");
          }
          else
          {
            ((Bundle)localObject4).putString("id", "0");
          }
        }
        if ((com.android.dazhihui.c.a.a.C == null) || (com.android.dazhihui.c.a.a.C[B].length < 5) || (!com.android.dazhihui.c.a.a.C[B][4].trim().equals("11"))) {
          break;
        }
        i1 = i4;
        for (;;)
        {
          paramString2 = (String)localObject1;
          if (i1 < com.android.dazhihui.c.a.a.B[B].length)
          {
            if (!com.android.dazhihui.c.a.a.B[B][i1].equals("")) {
              paramString2 = com.android.dazhihui.c.a.a.B[B][i1];
            }
          }
          else
          {
            if (paramString2 != null) {
              break;
            }
            return true;
          }
          i1 += 1;
        }
        localObject1 = new Intent();
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("nexturl", paramString2);
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        ((Intent)localObject1).setClass(paramActivity, BrowserActivity.class);
        paramActivity.startActivity((Intent)localObject1);
        a(paramString1, paramActivity);
        break;
      }
      label1114:
      localObject2 = null;
      i1 = i2;
    }
  }
  
  public static String b(Context paramContext)
  {
    paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    Object localObject = new Date();
    localObject = new SimpleDateFormat("yyyyMMddHHmmss").format((Date)localObject);
    return (String)localObject + paramContext;
  }
  
  public static String b(String paramString, int paramInt)
  {
    int i1;
    if (paramString != null)
    {
      i1 = paramString.indexOf(".");
      if (i1 != -1) {
        break label19;
      }
    }
    label19:
    while (i1 + 1 + paramInt >= paramString.length()) {
      return paramString;
    }
    return paramString.substring(0, i1 + 1 + paramInt);
  }
  
  public static String b(String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString1;
    arrayOfString[1] = paramString2;
    int i1 = 0;
    while (i1 < 2) {
      if ((arrayOfString[i1].equals("0")) || (arrayOfString[i1].equals("0.0")) || (arrayOfString[i1].equals("0.00")) || (arrayOfString[i1].equals("0.000")) || (arrayOfString[i1].equals("0.0000")) || (arrayOfString[i1].equals("0.00000")))
      {
        arrayOfString[i1] = "0";
        i1 += 1;
      }
      else
      {
        paramString2 = h(arrayOfString[i1]);
        int i5 = paramString2.indexOf(".");
        if (i5 < 0) {
          label124:
          return paramString2;
        }
        label133:
        int i6;
        int i2;
        if (i5 < 0)
        {
          paramString1 = paramString2;
          i6 = paramString1.length();
          i2 = 0;
        }
        int i4;
        for (int i3 = 0;; i3 = i4)
        {
          boolean bool;
          if (i2 < i6 - i5 - 1)
          {
            bool = paramString1.substring(paramString1.length() - 1 - i2, paramString1.length() - i2).equals("0");
            if (bool) {}
          }
          else
          {
            paramString2 = paramString1.substring(0, paramString1.length() - i3);
            i2 = paramString2.indexOf(".");
            paramString1 = paramString2;
            if (paramString2.length() == i2 + 1) {
              paramString1 = paramString2.substring(0, paramString2.length() - 1);
            }
            arrayOfString[i1] = paramString1;
            paramString2 = paramString1;
            if (paramString1.indexOf(".") == -1) {
              break label124;
            }
            if (paramString1.equals("0")) {
              break;
            }
            return paramString1;
            if (i5 == 0)
            {
              paramString1 = "0";
              break label133;
            }
            paramString1 = paramString2;
            if (paramString2.length() - i5 <= 4) {
              break label133;
            }
            paramString1 = paramString2.substring(0, i5 + 4);
            break label133;
          }
          i4 = i3;
          if (bool) {
            i4 = i3 + 1;
          }
          i2 += 1;
        }
      }
    }
    return arrayOfString[1];
  }
  
  public static void b(BaseActivity paramBaseActivity, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = e.a().j();
    if ((com.android.dazhihui.c.a.a.i[i1].length == com.android.dazhihui.c.a.a.k) && (!com.android.dazhihui.c.a.a.i[i1][1].equals(""))) {
      if ((l()) || (m()))
      {
        paramString = new Bundle();
        paramString.putBoolean("fromBrokerList", true);
        paramString.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
        e.a().a(paramString);
        e.a().a(true);
        a(paramBaseActivity, 0);
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          localBundle = new Bundle();
          if (paramString != null) {
            localBundle.putString("gotoFlag", paramString);
          }
          localBundle.putBoolean("xcLoginProcedure", paramBoolean1);
          localBundle.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
          paramBaseActivity.startActivity(RegionTable.class, localBundle);
        } while ((paramString == null) && (!paramBoolean1));
        paramBaseActivity.finish();
        return;
      } while (com.android.dazhihui.c.a.a.i[i1][2] == null);
      if (!"1".equals(com.android.dazhihui.c.a.a.C[i1][3])) {
        break;
      }
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("hidden", false);
      if (paramString != null) {
        localBundle.putString("gotoFlag", paramString);
      }
      localBundle.putBoolean("xcLoginProcedure", paramBoolean1);
      localBundle.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
      paramBaseActivity.startActivity(MobileLogin.class, localBundle);
    } while ((paramString == null) && (!paramBoolean1));
    paramBaseActivity.finish();
    return;
    if ("2".equals(com.android.dazhihui.c.a.a.C[i1][3]))
    {
      f(paramBaseActivity, paramBoolean2);
      return;
    }
    if ("3".equals(com.android.dazhihui.c.a.a.C[i1][3]))
    {
      o();
      paramString = new Bundle();
      paramString.putBoolean("hidden", false);
      paramString.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
      paramBaseActivity.startActivity(MobileVerifed.class, paramString);
      return;
    }
    if ("4".equals(com.android.dazhihui.c.a.a.C[i1][3]))
    {
      paramString = new Bundle();
      paramString.putBoolean("hidden", false);
      paramString.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
      paramBaseActivity.startActivity(InitVerifedChuanCai.class, paramString);
      return;
    }
    paramString = new Bundle();
    paramString.putBoolean("hidden", false);
    paramString.putBoolean("haveNoLoginSorHaveOne", paramBoolean2);
    paramBaseActivity.startActivity(MobileLogin.class, paramString);
  }
  
  public static void b(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("hidden", false);
    localBundle.putBoolean(MobileLogin.a, true);
    localBundle.putBoolean("haveNoLoginSorHaveOne", paramBoolean);
    paramBaseActivity.startActivity(MobileLogin.class, localBundle);
  }
  
  public static void b(String paramString, Activity paramActivity)
  {
    int i2 = 0;
    if ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length < 1)) {
      return;
    }
    E = new com.android.dazhihui.c.a.a(paramActivity);
    paramActivity = new String[com.android.dazhihui.c.a.a.M.length - 1];
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.M.length)
    {
      if (com.android.dazhihui.c.a.a.M[i1].equals(paramString)) {}
      for (;;)
      {
        i1 += 1;
        break;
        paramActivity[i2] = com.android.dazhihui.c.a.a.M[i1];
        i2 += 1;
      }
    }
    com.android.dazhihui.c.a.a.M = paramActivity;
    E.a(49);
    E.close();
  }
  
  public static boolean b()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31810");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static boolean b(int paramInt)
  {
    if (paramInt == -1) {}
    for (;;)
    {
      return false;
      try
      {
        boolean bool = "6".equals(com.android.dazhihui.c.a.a.C[paramInt][3]);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return false;
  }
  
  public static boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    label17:
    label80:
    for (;;)
    {
      return false;
      int i1;
      if (com.android.dazhihui.c.a.a.i != null)
      {
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.i.length) {
          if (!com.android.dazhihui.c.a.a.i[i1][2].equals(paramString)) {}
        }
      }
      for (;;)
      {
        if (i1 == -1) {
          break label80;
        }
        try
        {
          boolean bool = "6".equals(com.android.dazhihui.c.a.a.C[i1][3]);
          if (!bool) {
            break;
          }
          return true;
        }
        catch (Exception paramString)
        {
          paramString.printStackTrace();
          return false;
        }
        i1 += 1;
        break label17;
        i1 = -1;
      }
    }
  }
  
  /* Error */
  public static String c(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 1777	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   6: invokevirtual 1778	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: invokevirtual 1781	android/content/Context:getPackageName	()Ljava/lang/String;
    //   15: iconst_0
    //   16: invokevirtual 1785	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   19: astore_0
    //   20: aload_1
    //   21: aload_0
    //   22: invokevirtual 1789	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   25: checkcast 86	java/lang/String
    //   28: areturn
    //   29: astore_0
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_2
    //   33: astore_0
    //   34: goto -14 -> 20
    //   37: astore_0
    //   38: aload_2
    //   39: astore_0
    //   40: goto -20 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	paramContext	Context
    //   9	23	1	localPackageManager	PackageManager
    //   1	38	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	29	android/content/pm/PackageManager$NameNotFoundException
    //   10	20	37	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static String c(String paramString1, String paramString2)
  {
    String str;
    if (paramString1.equals("1026")) {
      str = m(paramString2);
    }
    do
    {
      return str;
      if (paramString1.equals("1028")) {
        return j(paramString2);
      }
      if (paramString1.equals("1214")) {
        return n(paramString2);
      }
      if (paramString1.equals("1193")) {
        return l(paramString2);
      }
      str = paramString2;
    } while (!paramString1.equals("1021"));
    return o(paramString2);
  }
  
  public static void c(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    Object localObject1;
    if (m == null)
    {
      localObject1 = f.a("u");
      Object localObject2 = (String)((Hashtable)localObject1).get("tel");
      String str = (String)((Hashtable)localObject1).get("key");
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 11) {
          localObject1 = null;
        }
      }
      localObject2 = str;
      if (str != null)
      {
        localObject2 = str;
        if (str.length() == 0) {
          localObject2 = null;
        }
      }
      if (localObject1 == null) {
        break label146;
      }
      if (localObject2 == null) {
        break label132;
      }
      m = new String[] { localObject1, localObject2 };
    }
    for (;;)
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("hidden", false);
      ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
      paramBaseActivity.startActivity(InitVerifedDongHai.class, (Bundle)localObject1);
      return;
      label132:
      m = new String[] { localObject1 };
      continue;
      label146:
      m = new String[0];
    }
  }
  
  public static boolean c()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][2]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("36100");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static com.android.dazhihui.ui.delegate.c.b[][] c(String paramString)
  {
    Object localObject = (com.android.dazhihui.ui.delegate.c.b[][])null;
    paramString = (String)localObject;
    if (localObject == null)
    {
      paramString = new com.android.dazhihui.ui.delegate.c.b[2][];
      localObject = new com.android.dazhihui.ui.delegate.c.b("修改交易密码", "36500", "", 1);
      com.android.dazhihui.ui.delegate.c.b localb = new com.android.dazhihui.ui.delegate.c.b("委托设置", "36501", "", 2);
      paramString[0] = { localObject };
      paramString[1] = { localb };
    }
    return paramString;
  }
  
  public static String[][] c(int paramInt)
  {
    String[][] arrayOfString = (String[][])null;
    String str;
    if (arrayOfString == null) {
      str = com.android.dazhihui.c.a.a.C[paramInt][4];
    }
    try
    {
      paramInt = Integer.parseInt(str);
      switch (paramInt)
      {
      default: 
        return arrayOfString;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        paramInt = 4;
      }
      arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 1, 2 });
      a(arrayOfString, new String[] { "不验证", "n" });
      return arrayOfString;
    }
    arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 2, 2 });
    a(arrayOfString, new String[] { "校验柜台通讯密码", "1", "不验证", "n" });
    return arrayOfString;
    arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 3, 2 });
    a(arrayOfString, new String[] { "本地验证", "b", "认证口令", "0", "动态口令", "5" });
    return arrayOfString;
    arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 2, 2 });
    a(arrayOfString, new String[] { "本地验证", "b", "动态口令", "2" });
    return arrayOfString;
    arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 3, 2 });
    a(arrayOfString, new String[] { "无口令", "n", "通讯密码", "0", "动态口令", "5" });
    return arrayOfString;
    arrayOfString = (String[][])Array.newInstance(String.class, new int[] { 2, 2 });
    a(arrayOfString, new String[] { "本地验证", "b", "动态口令", "5" });
    return arrayOfString;
  }
  
  public static String d(int paramInt)
  {
    Calendar localCalendar = v();
    localCalendar.setTime(new Date(localCalendar.getTime().getTime() + paramInt * 24L * 3600L * 1000L));
    paramInt = localCalendar.get(1);
    int i1 = localCalendar.get(2);
    return String.valueOf(localCalendar.get(5) + (paramInt * 10000 + (i1 + 1) * 100));
  }
  
  private static void d(Context paramContext)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    paramContext = com.android.dazhihui.c.a.a.z;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramContext != null) {}
    for (;;)
    {
      localBuilder.setMessage(paramContext + "暂不支持此功能。").setPositiveButton("确定", null).show();
      return;
      paramContext = "该券商";
    }
  }
  
  public static void d(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    Object localObject1;
    if (m == null)
    {
      localObject1 = f.a("u");
      Object localObject2 = (String)((Hashtable)localObject1).get("tel");
      String str = (String)((Hashtable)localObject1).get("key");
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 11) {
          localObject1 = null;
        }
      }
      localObject2 = str;
      if (str != null)
      {
        localObject2 = str;
        if (str.length() == 0) {
          localObject2 = null;
        }
      }
      if (localObject1 == null) {
        break label154;
      }
      if (localObject2 == null) {
        break label140;
      }
      m = new String[] { localObject1, localObject2 };
    }
    for (;;)
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("hidden", false);
      ((Bundle)localObject1).putBoolean("isTPY", true);
      ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
      paramBaseActivity.startActivity(InitVerifedDongHai.class, (Bundle)localObject1);
      return;
      label140:
      m = new String[] { localObject1 };
      continue;
      label154:
      m = new String[0];
    }
  }
  
  public static boolean d()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31200");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static com.android.dazhihui.ui.delegate.c.b[][] d(String paramString)
  {
    Object localObject1 = (com.android.dazhihui.ui.delegate.c.b[][])null;
    Object localObject3 = new Vector();
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length)
    {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(paramString)) {
        break label773;
      }
      label40:
      paramString = (String)localObject2;
      if (i1 != -1)
      {
        paramString = (String)localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          paramString = (String)localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            paramString = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      if ((paramString != null) && (com.android.dazhihui.c.a.a.P != null))
      {
        i1 = 0;
        label96:
        if (i1 < com.android.dazhihui.c.a.a.P.length) {
          if (!com.android.dazhihui.c.a.a.P[i1][0].equals(paramString)) {}
        }
      }
    }
    for (;;)
    {
      int i2;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      int i3;
      label280:
      int i5;
      try
      {
        paramString = new JSONArray(com.android.dazhihui.c.a.a.P[i1][2]);
        int i6 = paramString.length();
        i2 = 0;
        i1 = 1;
        if (i2 < i6)
        {
          localObject2 = paramString.getJSONObject(i2);
          localObject4 = ((JSONObject)localObject2).optString("minName");
          localObject5 = ((JSONObject)localObject2).optString("id");
          localObject6 = ((JSONObject)localObject2).optString("url");
          i3 = ((JSONObject)localObject2).optInt("groupId");
          if (!x(((String)localObject5).trim())) {
            break label764;
          }
          ((Vector)localObject3).add(new com.android.dazhihui.ui.delegate.c.b((String)localObject4, (String)localObject5, (String)localObject6, i3));
          if (i1 >= i3) {
            break label791;
          }
          i1 = i3;
          if ((!((String)localObject5).trim().equals("30110")) || (localObject6 == null)) {
            break label750;
          }
          localObject2 = ((String)localObject6).trim().split(",");
          i4 = 0;
          i3 = 0;
          if (i3 < localObject2.length)
          {
            if (localObject2[i3].matches("\\w+\\.\\w+\\.\\w+\\.\\w+\\:\\w+")) {
              break label794;
            }
            localObject2[i3] = null;
            break label782;
          }
          if (i4 <= 0) {
            break label750;
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.a = new String[i4];
          i4 = 0;
          i3 = 0;
          if (i3 >= localObject2.length) {
            break label750;
          }
          i5 = i4;
          if (localObject2 == null) {
            break label803;
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.a[i4] = localObject2[i3];
          i5 = i4 + 1;
          break label803;
        }
        paramString = new com.android.dazhihui.ui.delegate.c.b[i1][];
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        paramString = (String)localObject1;
        continue;
      }
      if (paramString != null)
      {
        i1 = 0;
        if (i1 < paramString.length)
        {
          localObject1 = new Vector();
          localObject2 = ((Vector)localObject3).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject4 = (com.android.dazhihui.ui.delegate.c.b)((Iterator)localObject2).next();
            if (((com.android.dazhihui.ui.delegate.c.b)localObject4).d != i1 + 1) {
              continue;
            }
            ((Vector)localObject1).add(localObject4);
            continue;
            i1 += 1;
            break label96;
          }
          paramString[i1] = new com.android.dazhihui.ui.delegate.c.b[((Vector)localObject1).size()];
          i2 = 0;
          while (i2 < ((Vector)localObject1).size())
          {
            paramString[i1][i2] = ((com.android.dazhihui.ui.delegate.c.b)((Vector)localObject1).get(i2));
            i2 += 1;
          }
          i1 += 1;
          continue;
        }
      }
      if (paramString == null)
      {
        paramString = new com.android.dazhihui.ui.delegate.c.b("资金持仓", "36201", "", 1);
        localObject1 = new com.android.dazhihui.ui.delegate.c.b("综合查询", "36200", "", 1);
        localObject2 = new com.android.dazhihui.ui.delegate.c.b("资产负债查询", "36202", "", 1);
        localObject3 = new com.android.dazhihui.ui.delegate.c.b("直接还款", "36301", "", 2);
        localObject4 = new com.android.dazhihui.ui.delegate.c.b("卖券还款", "36302", "", 2);
        localObject5 = new com.android.dazhihui.ui.delegate.c.b("直接还券", "36303", "", 2);
        localObject6 = new com.android.dazhihui.ui.delegate.c.b("买券还券", "36304", "", 2);
        com.android.dazhihui.ui.delegate.c.b localb1 = new com.android.dazhihui.ui.delegate.c.b("担保品划转", "36400", "", 3);
        com.android.dazhihui.ui.delegate.c.b localb2 = new com.android.dazhihui.ui.delegate.c.b("修改交易密码", "36500", "", 4);
        return new com.android.dazhihui.ui.delegate.c.b[][] { { paramString, localObject1, localObject2 }, { localObject3, localObject4, localObject5, localObject6 }, { localb1 }, { localb2 } };
      }
      return paramString;
      label750:
      break label764;
      paramString = (String)localObject1;
      continue;
      i1 = -1;
      break label40;
      label764:
      i2 += 1;
      continue;
      label773:
      i1 += 1;
      break;
      for (;;)
      {
        label782:
        i3 += 1;
        break label280;
        label791:
        break;
        label794:
        i4 += 1;
      }
      label803:
      i3 += 1;
      int i4 = i5;
    }
  }
  
  public static String e(int paramInt)
  {
    String str = "SH";
    switch (paramInt)
    {
    default: 
      str = "--";
    case 3: 
    case 5: 
    case 7: 
      return str;
    }
    return "SZ";
  }
  
  public static void e(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    int i1 = e.a().j();
    if (i1 == -1) {
      return;
    }
    E = new com.android.dazhihui.c.a.a(paramBaseActivity);
    com.android.dazhihui.c.a.a.i[i1][0] = "";
    E.a(19);
    E.close();
    if (m == null)
    {
      localObject1 = f.a("u");
      Object localObject2 = (String)((Hashtable)localObject1).get("tel");
      String str = (String)((Hashtable)localObject1).get("key");
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 11) {
          localObject1 = null;
        }
      }
      localObject2 = str;
      if (str != null)
      {
        localObject2 = str;
        if (str.length() == 0) {
          localObject2 = null;
        }
      }
      if (localObject1 == null) {
        break label203;
      }
      if (localObject2 == null) {
        break label189;
      }
      m = new String[] { localObject1, localObject2 };
    }
    while (m.length > 0)
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("hidden", true);
      ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
      paramBaseActivity.startActivity(InitVerifedChuanCai.class, (Bundle)localObject1);
      return;
      label189:
      m = new String[] { localObject1 };
      continue;
      label203:
      m = new String[0];
    }
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putBoolean("hidden", false);
    ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
    paramBaseActivity.startActivity(InitVerifedChuanCai.class, (Bundle)localObject1);
  }
  
  public static boolean e()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31500");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static com.android.dazhihui.ui.delegate.c.b[][] e(String paramString)
  {
    Object localObject1 = (com.android.dazhihui.ui.delegate.c.b[][])null;
    Vector localVector = new Vector();
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length)
    {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(paramString)) {
        break label534;
      }
      label38:
      if ((i1 != -1) && (com.android.dazhihui.c.a.a.C.length > i1) && (com.android.dazhihui.c.a.a.C[i1].length >= 7))
      {
        paramString = com.android.dazhihui.c.a.a.C[i1][6];
        label75:
        if ((paramString != null) && (com.android.dazhihui.c.a.a.P != null))
        {
          i1 = 0;
          label88:
          if (i1 < com.android.dazhihui.c.a.a.P.length) {
            if (!com.android.dazhihui.c.a.a.P[i1][0].equals(paramString)) {}
          }
        }
      }
    }
    for (;;)
    {
      int i2;
      int i3;
      label272:
      int i5;
      try
      {
        paramString = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
        int i6 = paramString.length();
        i2 = 0;
        i1 = 1;
        if (i2 < i6)
        {
          localObject2 = paramString.getJSONObject(i2);
          localObject3 = ((JSONObject)localObject2).optString("minName");
          String str1 = ((JSONObject)localObject2).optString("id");
          String str2 = ((JSONObject)localObject2).optString("url");
          i3 = ((JSONObject)localObject2).optInt("groupId");
          if (!w(str1.trim())) {
            break label525;
          }
          localVector.add(new com.android.dazhihui.ui.delegate.c.b((String)localObject3, str1, str2, i3));
          if (i1 >= i3) {
            break label552;
          }
          i1 = i3;
          if ((!str1.trim().equals("30110")) || (str2 == null)) {
            break label506;
          }
          localObject2 = str2.trim().split(",");
          i3 = 0;
          i4 = 0;
          if (i3 < localObject2.length)
          {
            if (localObject2[i3].matches("\\w+\\.\\w+\\.\\w+\\.\\w+\\:\\w+")) {
              break label555;
            }
            localObject2[i3] = null;
            break label543;
          }
          if (i4 <= 0) {
            break label506;
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.a = new String[i4];
          i3 = 0;
          i4 = 0;
          if (i3 >= localObject2.length) {
            break label506;
          }
          i5 = i4;
          if (localObject2 == null) {
            break label564;
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.a[i4] = localObject2[i3];
          i5 = i4 + 1;
          break label564;
        }
        paramString = new com.android.dazhihui.ui.delegate.c.b[i1][];
      }
      catch (JSONException paramString)
      {
        Object localObject2;
        Object localObject3;
        paramString.printStackTrace();
        paramString = (String)localObject1;
        continue;
      }
      if (paramString != null)
      {
        i1 = 0;
        if (i1 < paramString.length)
        {
          localObject1 = new Vector();
          localObject2 = localVector.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (com.android.dazhihui.ui.delegate.c.b)((Iterator)localObject2).next();
            if (((com.android.dazhihui.ui.delegate.c.b)localObject3).d != i1 + 1) {
              continue;
            }
            ((Vector)localObject1).add(localObject3);
            continue;
            i1 += 1;
            break label88;
          }
          paramString[i1] = new com.android.dazhihui.ui.delegate.c.b[((Vector)localObject1).size()];
          i2 = 0;
          while (i2 < ((Vector)localObject1).size())
          {
            paramString[i1][i2] = ((com.android.dazhihui.ui.delegate.c.b)((Vector)localObject1).get(i2));
            i2 += 1;
          }
          i1 += 1;
          continue;
        }
      }
      return paramString;
      label506:
      break label525;
      paramString = (String)localObject1;
      continue;
      paramString = null;
      break label75;
      i1 = -1;
      break label38;
      label525:
      i2 += 1;
      continue;
      label534:
      i1 += 1;
      break;
      for (;;)
      {
        label543:
        i3 += 1;
        break label272;
        label552:
        break;
        label555:
        i4 += 1;
      }
      label564:
      i3 += 1;
      int i4 = i5;
    }
  }
  
  public static String f(String paramString)
  {
    String str2;
    int i2;
    int i1;
    int i3;
    if (paramString == null)
    {
      str2 = "";
      str1 = str2;
      if (paramString != null)
      {
        str1 = str2;
        if (paramString.length() > 0)
        {
          i2 = paramString.indexOf("(");
          i1 = i2;
          if (i2 < 0) {
            i1 = paramString.indexOf("（");
          }
          i3 = paramString.indexOf(")");
          i2 = i3;
          if (i3 < 0) {
            i2 = paramString.indexOf("）");
          }
          i3 = paramString.indexOf("[");
          if ((i1 <= 0) || (i2 <= i1)) {
            break label120;
          }
        }
      }
    }
    for (String str1 = paramString.substring(i1 + 1, i2);; str1 = paramString.substring(0, i3))
    {
      if (c) {
        str1 = "南华证券";
      }
      label120:
      do
      {
        return str1;
        str2 = paramString;
        break;
        str1 = paramString;
      } while (i3 <= 0);
    }
  }
  
  public static void f(BaseActivity paramBaseActivity, boolean paramBoolean)
  {
    if (m == null)
    {
      localObject1 = f.a("u");
      Object localObject2 = (String)((Hashtable)localObject1).get("tel");
      String str = (String)((Hashtable)localObject1).get("key");
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 11) {
          localObject1 = null;
        }
      }
      localObject2 = str;
      if (str != null)
      {
        localObject2 = str;
        if (str.length() == 0) {
          localObject2 = null;
        }
      }
      if (localObject1 == null) {
        break label153;
      }
      if (localObject2 == null) {
        break label139;
      }
      m = new String[] { localObject1, localObject2 };
    }
    while (m.length > 0)
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("hidden", true);
      ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
      paramBaseActivity.startActivity(MobileVerifed.class, (Bundle)localObject1);
      return;
      label139:
      m = new String[] { localObject1 };
      continue;
      label153:
      m = new String[0];
    }
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putBoolean("hidden", false);
    ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", paramBoolean);
    paramBaseActivity.startActivity(MobileVerifed.class, (Bundle)localObject1);
  }
  
  public static boolean f()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31400");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static h g(String paramString)
  {
    paramString = new h(paramString);
    int i1 = 0;
    while (i1 < G.length)
    {
      paramString.a(G[i1], F.a(G[i1]));
      i1 += 1;
    }
    if (y == w) {
      paramString.a("1552", "1");
    }
    return paramString;
  }
  
  public static boolean g()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31300");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static String h(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() != 0) {}
    }
    else
    {
      str = "-";
    }
    return str;
  }
  
  public static boolean h()
  {
    boolean bool2 = false;
    Object localObject1 = com.android.dazhihui.c.a.a.z;
    Object localObject2 = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(localObject1)) {}
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 != -1)
      {
        localObject1 = localObject2;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          localObject1 = localObject2;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            localObject1 = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      boolean bool1 = bool2;
      if (localObject1 != null)
      {
        bool1 = bool2;
        if (com.android.dazhihui.c.a.a.P != null) {
          i1 = 0;
        }
      }
      for (;;)
      {
        bool1 = bool2;
        if ((i1 >= com.android.dazhihui.c.a.a.P.length) || (com.android.dazhihui.c.a.a.P[i1][0].equals(localObject1))) {
          try
          {
            localObject1 = new JSONArray(com.android.dazhihui.c.a.a.P[i1][1]);
            int i2 = ((JSONArray)localObject1).length();
            i1 = 0;
            for (;;)
            {
              bool1 = bool2;
              if (i1 < i2)
              {
                bool1 = ((JSONArray)localObject1).getJSONObject(i1).optString("id").contains("31600");
                if (bool1) {
                  bool1 = true;
                }
              }
              else
              {
                return bool1;
                i1 += 1;
                break;
              }
              i1 += 1;
            }
            i1 += 1;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.printStackTrace();
            return false;
          }
        }
      }
      i1 = -1;
    }
  }
  
  public static String i(String paramString)
  {
    Object localObject2;
    if (paramString == null)
    {
      localObject2 = "";
      return (String)localObject2;
    }
    int i2 = paramString.length();
    Object localObject1 = "";
    int i1 = 0;
    for (;;)
    {
      localObject2 = localObject1;
      if (i1 >= i2) {
        break;
      }
      String str = paramString.substring(i1, i1 + 1);
      localObject2 = localObject1;
      if (!str.equals(" ")) {
        localObject2 = (String)localObject1 + str;
      }
      i1 += 1;
      localObject1 = localObject2;
    }
  }
  
  public static boolean i()
  {
    String str = com.android.dazhihui.c.a.a.z;
    if ((TextUtils.isEmpty(str)) || (str.contains("湘财证券")) || (str.contains("恒泰证券"))) {}
    label103:
    for (;;)
    {
      return false;
      int i1 = 0;
      if (i1 < com.android.dazhihui.c.a.a.F.length) {
        if (!com.android.dazhihui.c.a.a.F[i1].equals(str)) {}
      }
      for (;;)
      {
        if ((i1 == -1) || (com.android.dazhihui.c.a.a.C.length <= i1) || (com.android.dazhihui.c.a.a.C[i1].length < 8)) {
          break label103;
        }
        return com.android.dazhihui.c.a.a.C[i1][7].equals("1");
        i1 += 1;
        break;
        i1 = -1;
      }
    }
  }
  
  public static String j(String paramString)
  {
    return a(I, paramString, 0, 1);
  }
  
  public static boolean j()
  {
    String str = com.android.dazhihui.c.a.a.z;
    if ((TextUtils.isEmpty(str)) || (str.contains("湘财证券")) || (str.contains("恒泰证券"))) {}
    label35:
    label119:
    for (;;)
    {
      return false;
      int i1 = 0;
      if (i1 < com.android.dazhihui.c.a.a.F.length) {
        if (!com.android.dazhihui.c.a.a.F[i1].equals(str)) {}
      }
      for (;;)
      {
        if ((i1 == -1) || (com.android.dazhihui.c.a.a.C.length <= i1) || (com.android.dazhihui.c.a.a.C[i1].length < 7)) {
          break label119;
        }
        str = com.android.dazhihui.c.a.a.C[i1][6];
        if ((!str.equals("20")) && (!str.equals("32"))) {
          break;
        }
        return true;
        i1 += 1;
        break label35;
        i1 = -1;
      }
    }
  }
  
  public static int k(String paramString)
  {
    return Integer.parseInt(a(I, paramString, 1, 0));
  }
  
  public static boolean k()
  {
    return (com.android.dazhihui.c.a.a.z != null) && (com.android.dazhihui.c.a.a.z.contains("恒泰证券"));
  }
  
  public static String l(String paramString)
  {
    return a(J, paramString, 0, 1);
  }
  
  public static boolean l()
  {
    int i1 = e.a().j();
    if (i1 == -1) {}
    for (;;)
    {
      return false;
      try
      {
        boolean bool = "8".equals(com.android.dazhihui.c.a.a.C[i1][4]);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return false;
  }
  
  public static String m(String paramString)
  {
    return a(K, paramString, 0, 1);
  }
  
  public static boolean m()
  {
    int i1 = e.a().j();
    if (i1 == -1) {}
    for (;;)
    {
      return false;
      try
      {
        boolean bool = "9".equals(com.android.dazhihui.c.a.a.C[i1][4]);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return false;
  }
  
  public static String n(String paramString)
  {
    return a(M, paramString, 0, 1);
  }
  
  public static boolean n()
  {
    int i1 = e.a().j();
    if (i1 == -1) {}
    for (;;)
    {
      return false;
      try
      {
        boolean bool = "6".equals(com.android.dazhihui.c.a.a.C[i1][3]);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return false;
  }
  
  public static String o(String paramString)
  {
    return a(N, paramString, 0, 1);
  }
  
  public static void o()
  {
    Object localObject1;
    if (m == null)
    {
      localObject1 = f.a("u");
      Object localObject2 = (String)((Hashtable)localObject1).get("tel");
      String str = (String)((Hashtable)localObject1).get("key");
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 11) {
          localObject1 = null;
        }
      }
      localObject2 = str;
      if (str != null)
      {
        localObject2 = str;
        if (str.length() == 0) {
          localObject2 = null;
        }
      }
      if (localObject1 == null) {
        break label107;
      }
      if (localObject2 != null) {
        m = new String[] { localObject1, localObject2 };
      }
    }
    else
    {
      return;
    }
    m = new String[] { localObject1 };
    return;
    label107:
    m = new String[0];
  }
  
  public static String p()
  {
    String str = "";
    if (com.android.dazhihui.c.a.a.i != null) {
      str = com.android.dazhihui.c.a.a.i[e.a().j()][2];
    }
    str = f(str);
    if (c) {
      str = "南华证券";
    }
    return str;
  }
  
  public static String p(String paramString)
  {
    Object localObject = paramString;
    if (paramString != null) {
      try
      {
        int i1 = paramString.indexOf(".");
        localObject = paramString;
        if (i1 > 0) {
          if (Integer.parseInt(paramString.substring(i1 + 1, paramString.length())) > 0)
          {
            String str = String.valueOf(new BigDecimal(Double.parseDouble(paramString)).setScale(2, 4).doubleValue());
            i1 = str.indexOf(".");
            localObject = str;
            if (i1 > 0)
            {
              localObject = str;
              if (str.length() - i1 == 2) {
                localObject = str + "0";
              }
            }
          }
          else
          {
            localObject = paramString.substring(0, i1);
            return (String)localObject;
          }
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localNumberFormatException.printStackTrace();
        return paramString;
      }
    }
    return localNumberFormatException;
  }
  
  public static String q()
  {
    String str = "";
    if (com.android.dazhihui.c.a.a.i != null) {
      str = com.android.dazhihui.c.a.a.i[e.a().j()][2];
    }
    return str;
  }
  
  public static String q(String paramString)
  {
    if ((paramString != null) && (z != null) && (z.length > 0))
    {
      int i1 = 0;
      while (i1 < A.length)
      {
        if (A[i1][0].equals(paramString)) {
          return A[i1][1];
        }
        i1 += 1;
      }
    }
    return "";
  }
  
  public static String r(String paramString)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = localObject3;
    if (z != null)
    {
      if (paramString == null) {
        localObject1 = localObject3;
      }
    }
    else {
      return (String)localObject1;
    }
    int i2 = z.length;
    int i1 = 0;
    label29:
    localObject1 = localObject2;
    if (i1 < i2)
    {
      if ((paramString.equals(z[i1][0])) && ("1".equals(z[i1][2]))) {
        localObject1 = z[i1][1];
      }
    }
    else
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        i1 = 0;
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (i1 < i2)
      {
        if (paramString.equals(z[i1][0])) {
          localObject2 = z[i1][1];
        }
      }
      else
      {
        localObject1 = localObject2;
        if (localObject2 != null) {
          break;
        }
        localObject1 = localObject2;
        if (i2 <= 0) {
          break;
        }
        localObject1 = localObject2;
        if (z[0].length <= 2) {
          break;
        }
        return z[0][1];
        i1 += 1;
        break label29;
      }
      i1 += 1;
    }
  }
  
  public static boolean r()
  {
    if (l()) {
      return b;
    }
    if (m()) {
      return i;
    }
    return (F != null) && (!u);
  }
  
  public static boolean s()
  {
    return (F != null) && (u);
  }
  
  /* Error */
  public static byte[] s(String paramString)
  {
    // Byte code:
    //   0: new 2038	javax/crypto/spec/IvParameterSpec
    //   3: dup
    //   4: ldc_w 2040
    //   7: invokevirtual 2043	java/lang/String:getBytes	()[B
    //   10: invokespecial 2044	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   13: astore_1
    //   14: new 2046	javax/crypto/spec/SecretKeySpec
    //   17: dup
    //   18: ldc_w 2040
    //   21: invokevirtual 2043	java/lang/String:getBytes	()[B
    //   24: ldc_w 2048
    //   27: invokespecial 2051	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   30: astore_2
    //   31: ldc_w 2053
    //   34: invokestatic 2058	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   37: astore_3
    //   38: aload_3
    //   39: invokevirtual 2061	javax/crypto/Cipher:getBlockSize	()I
    //   42: istore 7
    //   44: aload_0
    //   45: invokevirtual 2043	java/lang/String:getBytes	()[B
    //   48: astore_0
    //   49: aload_0
    //   50: arraylength
    //   51: istore 6
    //   53: iload 6
    //   55: istore 5
    //   57: iload 6
    //   59: iload 7
    //   61: irem
    //   62: ifeq +16 -> 78
    //   65: iload 6
    //   67: iload 7
    //   69: iload 6
    //   71: iload 7
    //   73: irem
    //   74: isub
    //   75: iadd
    //   76: istore 5
    //   78: iload 5
    //   80: newarray <illegal type>
    //   82: astore 4
    //   84: aload_0
    //   85: iconst_0
    //   86: aload 4
    //   88: iconst_0
    //   89: aload_0
    //   90: arraylength
    //   91: invokestatic 2065	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   94: aload_3
    //   95: iconst_1
    //   96: aload_2
    //   97: aload_1
    //   98: invokevirtual 2069	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   101: aload_3
    //   102: aload 4
    //   104: invokevirtual 2072	javax/crypto/Cipher:doFinal	([B)[B
    //   107: astore_0
    //   108: aload_0
    //   109: invokestatic 1176	com/a/a/a/a/a:a	([B)[B
    //   112: astore_1
    //   113: aload_1
    //   114: areturn
    //   115: astore_1
    //   116: aconst_null
    //   117: astore_0
    //   118: aload_1
    //   119: invokevirtual 1241	java/lang/Exception:printStackTrace	()V
    //   122: aload_0
    //   123: areturn
    //   124: astore_1
    //   125: goto -7 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramString	String
    //   13	101	1	localObject	Object
    //   115	4	1	localException1	Exception
    //   124	1	1	localException2	Exception
    //   30	67	2	localSecretKeySpec	javax.crypto.spec.SecretKeySpec
    //   37	65	3	localCipher	javax.crypto.Cipher
    //   82	21	4	arrayOfByte	byte[]
    //   55	24	5	i1	int
    //   51	25	6	i2	int
    //   42	33	7	i3	int
    // Exception table:
    //   from	to	target	type
    //   0	53	115	java/lang/Exception
    //   78	108	115	java/lang/Exception
    //   108	113	124	java/lang/Exception
  }
  
  public static void t()
  {
    u.a();
    F = null;
    z = (String[][])null;
    t = -1;
    y = v;
    com.android.dazhihui.ui.delegate.screen.ggt.GgtTradeMenu.b = (String[][])null;
    com.android.dazhihui.ui.delegate.screen.ggt.GgtTradeMenu.a = (String[][])null;
    com.android.dazhihui.ui.delegate.screen.margin.bg.g = null;
    b = false;
    i = false;
    com.android.dazhihui.ui.delegate.a.a().l();
    bk.d();
    com.android.dazhihui.ui.delegate.newtrade.a.a.c();
  }
  
  public static boolean t(String paramString)
  {
    if ((com.android.dazhihui.c.a.a.F == null) || (com.android.dazhihui.c.a.a.F.length == 0) || (com.android.dazhihui.c.a.a.C == null)) {}
    for (;;)
    {
      return false;
      int i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.F.length)
      {
        if ((com.android.dazhihui.c.a.a.F[i1].contains(paramString)) && (com.android.dazhihui.c.a.a.C[i1].length >= 5) && ((com.android.dazhihui.c.a.a.C[i1][4].trim().equals("10")) || (com.android.dazhihui.c.a.a.C[i1][4].trim().equals("11")))) {
          return true;
        }
        i1 += 1;
      }
    }
  }
  
  public static void u()
  {
    o = false;
    k.d();
    t();
  }
  
  public static String[] u(String paramString)
  {
    Object localObject = null;
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(paramString)) {}
    }
    for (;;)
    {
      paramString = (String)localObject;
      if (i1 != -1)
      {
        paramString = (String)localObject;
        if (com.android.dazhihui.c.a.a.C.length > i1)
        {
          paramString = (String)localObject;
          if (com.android.dazhihui.c.a.a.C[i1].length >= 7) {
            paramString = com.android.dazhihui.c.a.a.C[i1][6];
          }
        }
      }
      if ((paramString != null) && (com.android.dazhihui.c.a.a.N != null))
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= com.android.dazhihui.c.a.a.N.length) {
            break label156;
          }
          if (paramString.equals(com.android.dazhihui.c.a.a.N[i1][0]))
          {
            return new String[] { com.android.dazhihui.c.a.a.N[i1][1], com.android.dazhihui.c.a.a.N[i1][2], com.android.dazhihui.c.a.a.N[i1][3], com.android.dazhihui.c.a.a.N[i1][4] };
            i1 += 1;
            break;
          }
          i1 += 1;
        }
      }
      label156:
      return null;
      i1 = -1;
    }
  }
  
  public static Calendar v()
  {
    Calendar localCalendar = Calendar.getInstance();
    int[] arrayOfInt = new int[6];
    int[] tmp10_9 = arrayOfInt;
    tmp10_9[0] = 1;
    int[] tmp14_10 = tmp10_9;
    tmp14_10[1] = 2;
    int[] tmp18_14 = tmp14_10;
    tmp18_14[2] = 5;
    int[] tmp22_18 = tmp18_14;
    tmp22_18[3] = 11;
    int[] tmp27_22 = tmp22_18;
    tmp27_22[4] = 12;
    int[] tmp32_27 = tmp27_22;
    tmp32_27[5] = 13;
    tmp32_27;
    int i1 = 0;
    while (i1 < arrayOfInt.length)
    {
      localCalendar.set(arrayOfInt[i1], H.get(arrayOfInt[i1]));
      i1 += 1;
    }
    return localCalendar;
  }
  
  public static boolean v(String paramString)
  {
    if (Q == null) {
      Q = Arrays.asList(P);
    }
    return Q.contains(paramString);
  }
  
  public static String w()
  {
    return d(-30);
  }
  
  public static boolean w(String paramString)
  {
    if (S == null) {
      S = Arrays.asList(R);
    }
    return S.contains(paramString);
  }
  
  public static String x()
  {
    return d(-6);
  }
  
  public static boolean x(String paramString)
  {
    if (U == null) {
      U = Arrays.asList(T);
    }
    return U.contains(paramString);
  }
  
  public static String y()
  {
    return d(0);
  }
  
  public static boolean z()
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (u.c())
    {
      bool1 = bool2;
      if (u.b())
      {
        bool1 = bool2;
        if (g.a().v()) {
          bool1 = false;
        }
      }
    }
    return bool1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */