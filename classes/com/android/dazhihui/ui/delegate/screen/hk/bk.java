package com.android.dazhihui.ui.delegate.screen.hk;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.domain.HKExchangeRate;
import com.android.dazhihui.ui.delegate.domain.HKMarketInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Vector;

public class bk
{
  public static String[][] A = (String[][])null;
  public static String[] B = { "所有订单", "港股订单", "美股订单", "A股订单" };
  public static String[] C = { "所有股票", "港股", "美股", "A股" };
  private static boolean D;
  private static boolean E;
  private static boolean F;
  private static String[][] G;
  public static String a = "港股交易";
  public static String b = "委托买入";
  public static String c = "委托卖出";
  public static String d = "委托撤单";
  public static String e = "资金股份";
  public static String f = "当日成交";
  public static String g = "当日委托";
  public static String h = "历史成交";
  public static String i = "历史委托";
  public static String[][] j;
  public static ArrayList<HKMarketInfo> k = null;
  public static ArrayList<HKExchangeRate> l = null;
  public static String[] m;
  public static String[] n;
  public static String[] o;
  public static String[] p;
  public static String[] q;
  public static String[] r;
  public static String[] s;
  public static String[] t;
  public static String[] u;
  public static String[] v;
  public static String[] w;
  public static String[] x;
  public static String[] y;
  public static String[] z;
  
  static
  {
    D = false;
    E = false;
    F = false;
    G = new String[][] { { "Y", "核准" }, { "N", "审核中" }, { "NEW", "提交中" }, { "WA", "审核中" }, { "PRO", "发送中" }, { "Q", "排队中" }, { "REJ", "拒绝" }, { "PEX", "部成" }, { "FEX", "全成" }, { "CAN", "已撤单" } };
  }
  
  public static String a(int paramInt)
  {
    Object localObject;
    if (paramInt == 0) {
      localObject = "1";
    }
    int i1;
    do
    {
      return (String)localObject;
      str = "0.";
      i1 = 1;
      localObject = str;
    } while (i1 > paramInt);
    if (i1 == paramInt) {}
    for (String str = str + "1";; str = str + "0")
    {
      i1 += 1;
      break;
    }
  }
  
  public static String a(String paramString)
  {
    if (l == null) {
      return null;
    }
    int i1 = 0;
    while (i1 < l.size())
    {
      if (paramString.equals(((HKExchangeRate)l.get(i1)).getCurrency())) {
        return ((HKExchangeRate)l.get(i1)).getExchangeRate();
      }
      i1 += 1;
    }
    return null;
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
  
  public static BigDecimal a(String paramString1, String paramString2)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.length() != 0) {}
    }
    else
    {
      str = "0";
    }
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = "0";
    }
    return new BigDecimal(str).multiply(new BigDecimal(paramString1));
  }
  
  public static Vector<String[]> a(Vector<String[]> paramVector, int paramInt1, int paramInt2)
  {
    if (A == null) {
      return paramVector;
    }
    Vector localVector = new Vector();
    int i1 = 0;
    if (i1 < paramVector.size())
    {
      if (paramInt2 == 0) {}
      for (boolean bool = true;; bool = A[(paramInt2 - 1)][1].equals(((String[])paramVector.get(i1))[paramInt1]))
      {
        if (bool) {
          localVector.add(paramVector.get(i1));
        }
        i1 += 1;
        break;
      }
    }
    return localVector;
  }
  
  public static Vector<Integer> a(Vector<String[]> paramVector, Vector<Integer> paramVector1, int paramInt1, int paramInt2)
  {
    if (A == null) {
      return paramVector1;
    }
    Vector localVector = new Vector();
    int i1 = 0;
    if (i1 < paramVector.size())
    {
      if (paramInt2 == 0) {}
      for (boolean bool = true;; bool = A[(paramInt2 - 1)][1].equals(((String[])paramVector.get(i1))[paramInt1]))
      {
        if (bool) {
          localVector.add(paramVector1.get(i1));
        }
        i1 += 1;
        break;
      }
    }
    return localVector;
  }
  
  public static void a(h paramh)
  {
    l = new ArrayList();
    int i1 = 0;
    while (i1 < paramh.g())
    {
      if (("CNY".equals(paramh.a(i1, "1311"))) || ("USD".equals(paramh.a(i1, "1311"))))
      {
        HKExchangeRate localHKExchangeRate = new HKExchangeRate();
        localHKExchangeRate.setCurrency(paramh.a(i1, "1311"));
        localHKExchangeRate.setExchangeRate(paramh.a(i1, "5002"));
        l.add(localHKExchangeRate);
      }
      i1 += 1;
    }
  }
  
  public static void a(DropDownTextView paramDropDownTextView, int paramInt)
  {
    if (A == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("所有币种");
    int i1 = 0;
    while (i1 < A.length)
    {
      localArrayList.add(A[i1][0]);
      i1 += 1;
    }
    paramDropDownTextView.a(localArrayList, paramInt);
    paramDropDownTextView.setCanDropDown(true);
    paramDropDownTextView.setCanDelItem(false);
  }
  
  public static void a(boolean paramBoolean)
  {
    E = paramBoolean;
  }
  
  public static void a(String[] paramArrayOfString, DropDownTextView paramDropDownTextView, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < paramArrayOfString.length)
    {
      localArrayList.add(paramArrayOfString[i1]);
      i1 += 1;
    }
    paramDropDownTextView.a(localArrayList, paramInt);
    paramDropDownTextView.setCanDropDown(true);
    paramDropDownTextView.setCanDelItem(false);
  }
  
  public static boolean a()
  {
    return E;
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    switch (paramInt)
    {
    }
    do
    {
      bool1 = false;
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while ("HKEX".equals(paramString));
          if (!"SZB".equals(paramString)) {
            break;
          }
          return true;
          bool1 = bool2;
        } while ("US".equals(paramString));
        if (!"SHB".equals(paramString)) {
          break;
        }
        return true;
        bool1 = bool2;
      } while ("SHA".equals(paramString));
    } while (!"SZA".equals(paramString));
    return true;
  }
  
  public static h b(h paramh)
  {
    paramh.a("1325", "7,15003,15005,15013,15017,15021,1501915023");
    return paramh;
  }
  
  public static String b(String paramString)
  {
    if (g(paramString)) {
      return "US";
    }
    if ((paramString.length() == 5) && (i(paramString))) {
      return "HKEX";
    }
    if (paramString.startsWith("60")) {
      return "SHA";
    }
    if (paramString.startsWith("90")) {
      return "SH-B";
    }
    if ((paramString.startsWith("00")) || (paramString.startsWith("30"))) {
      return "SZA";
    }
    if (paramString.startsWith("20")) {
      return "SZ-B";
    }
    return "";
  }
  
  public static BigDecimal b(String paramString1, String paramString2)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.length() != 0) {}
    }
    else
    {
      str = "0";
    }
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = "0";
    }
    return new BigDecimal(str).divide(new BigDecimal(paramString1), 4, 4);
  }
  
  public static Vector<String[]> b(Vector<String[]> paramVector, int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < paramVector.size())
    {
      if (b(((String[])paramVector.get(i1))[paramInt1], paramInt2)) {
        localVector.add(paramVector.get(i1));
      }
      i1 += 1;
    }
    return localVector;
  }
  
  public static Vector<Integer> b(Vector<String[]> paramVector, Vector<Integer> paramVector1, int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < paramVector.size())
    {
      if (b(((String[])paramVector.get(i1))[paramInt1], paramInt2)) {
        localVector.add(paramVector1.get(i1));
      }
      i1 += 1;
    }
    return localVector;
  }
  
  public static void b(boolean paramBoolean)
  {
    F = paramBoolean;
  }
  
  public static boolean b()
  {
    return F;
  }
  
  public static boolean b(String paramString, int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    switch (paramInt)
    {
    }
    do
    {
      bool1 = false;
      do
      {
        do
        {
          do
          {
            return bool1;
            if (!"HKEX".equals(paramString)) {
              break;
            }
            return true;
            if (!"US".equals(paramString)) {
              break;
            }
            return true;
            bool1 = bool2;
          } while ("SHA".equals(paramString));
          bool1 = bool2;
        } while ("SZA".equals(paramString));
        bool1 = bool2;
      } while ("SHB".equals(paramString));
    } while (!"SZB".equals(paramString));
    return true;
  }
  
  public static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    paramString = paramString.toUpperCase();
    return a(G, paramString, 0, 1);
  }
  
  public static String c(String paramString, int paramInt)
  {
    String str;
    if ((paramString == null) || (paramString.length() == 0)) {
      str = "0";
    }
    do
    {
      return str;
      str = paramString;
    } while ("--".equals(paramString));
    return new BigDecimal(paramString).setScale(paramInt, 4).toString();
  }
  
  public static BigDecimal c(String paramString1, String paramString2)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.length() != 0) {}
    }
    else
    {
      str = "0";
    }
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = "0";
    }
    return new BigDecimal(str).add(new BigDecimal(paramString1));
  }
  
  public static void c(boolean paramBoolean)
  {
    D = paramBoolean;
  }
  
  public static boolean c()
  {
    return D;
  }
  
  public static BigDecimal d(String paramString1, String paramString2)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.length() != 0) {}
    }
    else
    {
      str = "0";
    }
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = "0";
    }
    return new BigDecimal(str).subtract(new BigDecimal(paramString1));
  }
  
  public static void d()
  {
    j = (String[][])null;
    k = null;
    l = null;
    D = false;
    F = false;
    E = false;
    A = (String[][])null;
  }
  
  public static boolean d(String paramString)
  {
    return ("SHA".equals(paramString)) || ("SHB".equals(paramString)) || ("SZA".equals(paramString)) || ("SZB".equals(paramString)) || ("HKEX".equals(paramString)) || ("US".equals(paramString));
  }
  
  public static String e(String paramString)
  {
    String str;
    if (("SHA".equals(paramString)) || ("SHB".equals(paramString)) || ("SZA".equals(paramString)) || ("SZB".equals(paramString))) {
      str = "CN";
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
                return str;
                if ("HKEX".equals(paramString)) {
                  return "HK";
                }
                str = paramString;
              } while ("US".equals(paramString));
              str = paramString;
            } while ("JP".equals(paramString));
            str = paramString;
          } while ("SG".equals(paramString));
          str = paramString;
        } while ("UK".equals(paramString));
        str = paramString;
      } while ("AU".equals(paramString));
      str = paramString;
    } while ("CA".equals(paramString));
    return "";
  }
  
  public static void e()
  {
    String[] arrayOfString;
    if (m != null)
    {
      arrayOfString = m;
      m = arrayOfString;
      if (n == null) {
        break label305;
      }
      arrayOfString = n;
      label24:
      n = arrayOfString;
      if (o == null) {
        break label413;
      }
      arrayOfString = o;
      label38:
      o = arrayOfString;
      if (p == null) {
        break label472;
      }
      arrayOfString = p;
      label52:
      p = arrayOfString;
      if (q == null) {
        break label531;
      }
      arrayOfString = q;
      label66:
      q = arrayOfString;
      if (r == null) {
        break label681;
      }
      arrayOfString = r;
      label80:
      r = arrayOfString;
      if (u == null) {
        break label831;
      }
      arrayOfString = u;
      label94:
      u = arrayOfString;
      if (v == null) {
        break label981;
      }
      arrayOfString = v;
      label108:
      v = arrayOfString;
      if (s == null) {
        break label1131;
      }
      arrayOfString = s;
      label122:
      s = arrayOfString;
      if (t == null) {
        break label1260;
      }
      arrayOfString = t;
      label136:
      t = arrayOfString;
      if (y == null) {
        break label1389;
      }
      arrayOfString = y;
      label150:
      y = arrayOfString;
      if (z == null) {
        break label1518;
      }
      arrayOfString = z;
      label164:
      z = arrayOfString;
      if (w == null) {
        break label1647;
      }
      arrayOfString = w;
      label178:
      w = arrayOfString;
      if (x == null) {
        break label1776;
      }
      arrayOfString = x;
    }
    for (;;)
    {
      x = arrayOfString;
      return;
      arrayOfString = new String[15];
      arrayOfString[0] = "客户号";
      arrayOfString[1] = "股东代码";
      arrayOfString[2] = "证券代码";
      arrayOfString[3] = "证券名称";
      arrayOfString[4] = "交易所名称";
      arrayOfString[5] = "证券数量";
      arrayOfString[6] = "可用数量";
      arrayOfString[7] = "当前价";
      arrayOfString[8] = "成本价格";
      arrayOfString[9] = "保本价";
      arrayOfString[10] = "浮动盈亏";
      arrayOfString[11] = "最新市值";
      arrayOfString[12] = "买入均价";
      arrayOfString[13] = "实现盈亏";
      arrayOfString[14] = "盈亏比例";
      break;
      label305:
      arrayOfString = new String[15];
      arrayOfString[0] = "1016";
      arrayOfString[1] = "1019";
      arrayOfString[2] = "1036";
      arrayOfString[3] = "1037";
      arrayOfString[4] = "1004";
      arrayOfString[5] = "1060";
      arrayOfString[6] = "1569";
      arrayOfString[7] = "1181";
      arrayOfString[8] = "1062";
      arrayOfString[9] = "1230";
      arrayOfString[10] = "1064";
      arrayOfString[11] = "1065";
      arrayOfString[12] = "1235";
      arrayOfString[13] = "2308";
      arrayOfString[14] = "1320";
      break label24;
      label413:
      arrayOfString = new String[8];
      arrayOfString[0] = "沪港通可用资金";
      arrayOfString[1] = "沪港通浮动盈亏";
      arrayOfString[2] = "沪港通最新市值";
      arrayOfString[3] = "资金余额";
      arrayOfString[4] = "总资产";
      arrayOfString[5] = "浮动盈亏";
      arrayOfString[6] = "最新市值";
      arrayOfString[7] = "可用资金";
      break label38;
      label472:
      arrayOfString = new String[8];
      arrayOfString[0] = "6029";
      arrayOfString[1] = "6031";
      arrayOfString[2] = "6030";
      arrayOfString[3] = "1077";
      arrayOfString[4] = "1087";
      arrayOfString[5] = "1064";
      arrayOfString[6] = "1065";
      arrayOfString[7] = "1078";
      break label52;
      label531:
      arrayOfString = new String[21];
      arrayOfString[0] = "委托编号";
      arrayOfString[1] = "委托日期";
      arrayOfString[2] = "委托时间";
      arrayOfString[3] = "营业部代码";
      arrayOfString[4] = "客户号";
      arrayOfString[5] = "帐号类别";
      arrayOfString[6] = "交易所名称";
      arrayOfString[7] = "股东代码";
      arrayOfString[8] = "证券代码";
      arrayOfString[9] = "证券名称";
      arrayOfString[10] = "买卖标志";
      arrayOfString[11] = "买卖说明";
      arrayOfString[12] = "委托属性说明";
      arrayOfString[13] = "委托价格";
      arrayOfString[14] = "委托数量";
      arrayOfString[15] = "成交数量";
      arrayOfString[16] = "状态说明";
      arrayOfString[17] = "订单类别";
      arrayOfString[18] = "订单时效";
      arrayOfString[19] = "可否撤单";
      arrayOfString[20] = "撤单回调参数";
      break label66;
      label681:
      arrayOfString = new String[21];
      arrayOfString[0] = "1042";
      arrayOfString[1] = "1038";
      arrayOfString[2] = "1039";
      arrayOfString[3] = "1005";
      arrayOfString[4] = "1016";
      arrayOfString[5] = "1021";
      arrayOfString[6] = "1004";
      arrayOfString[7] = "1019";
      arrayOfString[8] = "1036";
      arrayOfString[9] = "1037";
      arrayOfString[10] = "1026";
      arrayOfString[11] = "1027";
      arrayOfString[12] = "2305";
      arrayOfString[13] = "1041";
      arrayOfString[14] = "1040";
      arrayOfString[15] = "1047";
      arrayOfString[16] = "1043";
      arrayOfString[17] = "6014";
      arrayOfString[18] = "6015";
      arrayOfString[19] = "1214";
      arrayOfString[20] = "1800";
      break label80;
      label831:
      arrayOfString = new String[21];
      arrayOfString[0] = "委托编号";
      arrayOfString[1] = "委托日期";
      arrayOfString[2] = "委托时间";
      arrayOfString[3] = "营业部代码";
      arrayOfString[4] = "客户号";
      arrayOfString[5] = "帐号类别";
      arrayOfString[6] = "交易所名称";
      arrayOfString[7] = "股东代码";
      arrayOfString[8] = "证券代码";
      arrayOfString[9] = "证券名称";
      arrayOfString[10] = "买卖标志";
      arrayOfString[11] = "买卖说明";
      arrayOfString[12] = "委托属性说明";
      arrayOfString[13] = "委托价格";
      arrayOfString[14] = "委托数量";
      arrayOfString[15] = "成交数量";
      arrayOfString[16] = "状态说明";
      arrayOfString[17] = "订单类别";
      arrayOfString[18] = "订单时效";
      arrayOfString[19] = "可否撤单";
      arrayOfString[20] = "撤单回调参数";
      break label94;
      label981:
      arrayOfString = new String[21];
      arrayOfString[0] = "1042";
      arrayOfString[1] = "1038";
      arrayOfString[2] = "1039";
      arrayOfString[3] = "1005";
      arrayOfString[4] = "1016";
      arrayOfString[5] = "1021";
      arrayOfString[6] = "1004";
      arrayOfString[7] = "1019";
      arrayOfString[8] = "1036";
      arrayOfString[9] = "1037";
      arrayOfString[10] = "1026";
      arrayOfString[11] = "1027";
      arrayOfString[12] = "2305";
      arrayOfString[13] = "1041";
      arrayOfString[14] = "1040";
      arrayOfString[15] = "1047";
      arrayOfString[16] = "1043";
      arrayOfString[17] = "6014";
      arrayOfString[18] = "6015";
      arrayOfString[19] = "1214";
      arrayOfString[20] = "1800";
      break label108;
      label1131:
      arrayOfString = new String[18];
      arrayOfString[0] = "委托日期";
      arrayOfString[1] = "委托编号";
      arrayOfString[2] = "营业部代码";
      arrayOfString[3] = "客户号";
      arrayOfString[4] = "帐号类别";
      arrayOfString[5] = "交易所名称";
      arrayOfString[6] = "股东代码";
      arrayOfString[7] = "证券代码";
      arrayOfString[8] = "证券名称";
      arrayOfString[9] = "买卖标志";
      arrayOfString[10] = "买卖说明";
      arrayOfString[11] = "委托属性说明";
      arrayOfString[12] = "委托价格";
      arrayOfString[13] = "委托数量";
      arrayOfString[14] = "成交数量";
      arrayOfString[15] = "状态说明";
      arrayOfString[16] = "成交价格";
      arrayOfString[17] = "成交金额";
      break label122;
      label1260:
      arrayOfString = new String[18];
      arrayOfString[0] = "1038";
      arrayOfString[1] = "1042";
      arrayOfString[2] = "1005";
      arrayOfString[3] = "1016";
      arrayOfString[4] = "1021";
      arrayOfString[5] = "1004";
      arrayOfString[6] = "1019";
      arrayOfString[7] = "1036";
      arrayOfString[8] = "1037";
      arrayOfString[9] = "1026";
      arrayOfString[10] = "1027";
      arrayOfString[11] = "2305";
      arrayOfString[12] = "1041";
      arrayOfString[13] = "1040";
      arrayOfString[14] = "1047";
      arrayOfString[15] = "1043";
      arrayOfString[16] = "1048";
      arrayOfString[17] = "1049";
      break label136;
      label1389:
      arrayOfString = new String[18];
      arrayOfString[0] = "委托日期";
      arrayOfString[1] = "委托编号";
      arrayOfString[2] = "营业部代码";
      arrayOfString[3] = "客户号";
      arrayOfString[4] = "帐号类别";
      arrayOfString[5] = "交易所名称";
      arrayOfString[6] = "股东代码";
      arrayOfString[7] = "证券代码";
      arrayOfString[8] = "证券名称";
      arrayOfString[9] = "买卖标志";
      arrayOfString[10] = "买卖说明";
      arrayOfString[11] = "委托属性说明";
      arrayOfString[12] = "委托价格";
      arrayOfString[13] = "委托数量";
      arrayOfString[14] = "成交数量";
      arrayOfString[15] = "状态说明";
      arrayOfString[16] = "订单类别";
      arrayOfString[17] = "订单时效";
      break label150;
      label1518:
      arrayOfString = new String[18];
      arrayOfString[0] = "1038";
      arrayOfString[1] = "1042";
      arrayOfString[2] = "1005";
      arrayOfString[3] = "1016";
      arrayOfString[4] = "1021";
      arrayOfString[5] = "1004";
      arrayOfString[6] = "1019";
      arrayOfString[7] = "1036";
      arrayOfString[8] = "1037";
      arrayOfString[9] = "1026";
      arrayOfString[10] = "1027";
      arrayOfString[11] = "2305";
      arrayOfString[12] = "1041";
      arrayOfString[13] = "1040";
      arrayOfString[14] = "1047";
      arrayOfString[15] = "1043";
      arrayOfString[16] = "6014";
      arrayOfString[17] = "6015";
      break label164;
      label1647:
      arrayOfString = new String[18];
      arrayOfString[0] = "委托日期";
      arrayOfString[1] = "委托编号";
      arrayOfString[2] = "营业部代码";
      arrayOfString[3] = "客户号";
      arrayOfString[4] = "帐号类别";
      arrayOfString[5] = "交易所名称";
      arrayOfString[6] = "股东代码";
      arrayOfString[7] = "证券代码";
      arrayOfString[8] = "证券名称";
      arrayOfString[9] = "买卖标志";
      arrayOfString[10] = "买卖说明";
      arrayOfString[11] = "委托属性说明";
      arrayOfString[12] = "委托价格";
      arrayOfString[13] = "委托数量";
      arrayOfString[14] = "成交数量";
      arrayOfString[15] = "状态说明";
      arrayOfString[16] = "订单类别";
      arrayOfString[17] = "订单时效";
      break label178;
      label1776:
      arrayOfString = new String[18];
      arrayOfString[0] = "1038";
      arrayOfString[1] = "1042";
      arrayOfString[2] = "1005";
      arrayOfString[3] = "1016";
      arrayOfString[4] = "1021";
      arrayOfString[5] = "1004";
      arrayOfString[6] = "1019";
      arrayOfString[7] = "1036";
      arrayOfString[8] = "1037";
      arrayOfString[9] = "1026";
      arrayOfString[10] = "1027";
      arrayOfString[11] = "2305";
      arrayOfString[12] = "1041";
      arrayOfString[13] = "1040";
      arrayOfString[14] = "1047";
      arrayOfString[15] = "1043";
      arrayOfString[16] = "6014";
      arrayOfString[17] = "6015";
    }
  }
  
  public static boolean e(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      return paramString1.matches(paramString2);
    }
    return false;
  }
  
  public static int f(String paramString)
  {
    int i1 = 0;
    if (("SHA".equals(paramString)) || ("SHB".equals(paramString)) || ("SZA".equals(paramString)) || ("SZB".equals(paramString))) {
      i1 = Color.parseColor("#FEA2A3");
    }
    do
    {
      return i1;
      if ("HKEX".equals(paramString)) {
        return Color.parseColor("#D7D316");
      }
      if ("US".equals(paramString)) {
        return Color.parseColor("#D5C5A3");
      }
      if ("JP".equals(paramString)) {
        return Color.parseColor("#75D29D");
      }
      if ("SG".equals(paramString)) {
        return Color.parseColor("#FFB974");
      }
      if ("UK".equals(paramString)) {
        return Color.parseColor("#AAE674");
      }
      if ("AU".equals(paramString)) {
        return Color.parseColor("#6ADADE");
      }
    } while (!"CA".equals(paramString));
    return Color.parseColor("#DEAEF7");
  }
  
  public static boolean g(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      bool1 = bool2;
      if (paramString.length() > 0)
      {
        bool1 = bool2;
        if (paramString.charAt(0) >= 'A')
        {
          bool1 = bool2;
          if (paramString.charAt(0) <= 'z') {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public static String h(String paramString)
  {
    String str = "";
    if (!g(paramString))
    {
      if (paramString.length() == 5) {
        str = "HK";
      }
      do
      {
        return str;
        if ((paramString.startsWith("60")) || (paramString.startsWith("90"))) {
          return "SH";
        }
      } while ((!paramString.startsWith("00")) && (!paramString.startsWith("30")) && (!paramString.startsWith("20")));
      return "SZ";
    }
    return "NS";
  }
  
  public static boolean i(String paramString)
  {
    return e(paramString, "^\\d+$");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */