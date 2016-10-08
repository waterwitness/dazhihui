package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ah
  implements i
{
  public static ah a;
  public static boolean b = true;
  public static Map<String, Boolean> e = new HashMap();
  public static Map<String, Double> f = new HashMap();
  private e A;
  private t B;
  private t C;
  private com.android.dazhihui.a.b.u D;
  private boolean E = true;
  private String F = "0";
  private String[] G = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] H = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private final String[] I = { "stock_name", "business_time", "business_price", "business_amount", "business_balance" };
  private String J;
  private String K;
  private String L;
  private String M;
  private String N;
  private String O;
  private String P;
  private String Q;
  private String R;
  private String S;
  private ag T;
  private c U;
  private String V;
  private d W = d.a();
  private String X;
  private n Y;
  private com.android.dazhihui.a.b.u Z = null;
  private e aa;
  private t ab;
  private String ac;
  private com.android.dazhihui.a.b.u ad = null;
  private com.android.dazhihui.a.b.u ae = null;
  private int af;
  private ao ag;
  private ap ah;
  private String ai;
  private String aj;
  private String[] ak;
  private String al;
  private String am;
  private String an;
  private String ao;
  private boolean ap;
  String c;
  String d;
  private String g = "1";
  private String h = "0";
  private com.android.dazhihui.ui.delegate.b.h i;
  private int j = -1;
  private String k;
  private int l;
  private int m;
  private int n;
  private String o;
  private String[] p;
  private String q;
  private String r;
  private String s;
  private String t;
  private int u;
  private int v;
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.u x;
  private com.android.dazhihui.a.b.u y;
  private e z;
  
  public ah()
  {
    String[] arrayOfString;
    if (com.android.dazhihui.ui.delegate.c.a.j == null)
    {
      arrayOfString = new String[7];
      arrayOfString[0] = "1036";
      arrayOfString[1] = "1037";
      arrayOfString[2] = "1047";
      arrayOfString[3] = "1048";
      arrayOfString[4] = "1026";
      arrayOfString[5] = "1046";
      arrayOfString[6] = "1027";
    }
    for (;;)
    {
      this.ak = arrayOfString;
      this.an = "1";
      this.ap = false;
      return;
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.j;
    }
  }
  
  public static ah a()
  {
    if (a == null) {
      a = new ah();
    }
    return a;
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.u paramu)
  {
    int i1 = 0;
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.h.b(paramu.e());
    if (!localh.b())
    {
      paramu = Toast.makeText(com.android.dazhihui.b.b.a().f(), localh.d(), 0);
      paramu.setGravity(17, 0, 0);
      paramu.show();
    }
    do
    {
      return;
      this.m = localh.g();
      this.n = localh.b("1289");
      l();
    } while (this.m <= 0);
    if (i1 < this.m)
    {
      label100:
      label120:
      label140:
      String str;
      if (localh.a(i1, "1048") == null)
      {
        paramu = "";
        this.al = paramu;
        if (localh.a(i1, "1047") != null) {
          break label208;
        }
        paramu = "";
        this.am = paramu;
        if (localh.a(i1, "1026") != null) {
          break label220;
        }
        paramu = "";
        if (localh.a(i1, "1036") != null) {
          break label232;
        }
        str = "";
        label155:
        this.ao = str;
        if (!paramu.equals("0")) {
          break label244;
        }
        this.an = "1";
      }
      for (;;)
      {
        a(this.an, this.ao);
        i1 += 1;
        break;
        paramu = localh.a(i1, "1048");
        break label100;
        label208:
        paramu = localh.a(i1, "1047");
        break label120;
        label220:
        paramu = localh.a(i1, "1026");
        break label140;
        label232:
        str = localh.a(i1, "1036");
        break label155;
        label244:
        if (paramu.equals("1")) {
          this.an = "2";
        }
      }
    }
    b = true;
    e(this.V);
  }
  
  private void p()
  {
    if (!o.r()) {
      return;
    }
    this.A = new e();
    this.A.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.A.b("UTF-8");
    this.A.a("Bearer " + o.d);
    this.A.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.A.a("sendercomp_id", "90013");
    this.A.a("exchange_type", "");
    this.A.a("stock_account", "");
    this.A.a("stock_code", "");
    this.A.a("position_str", "");
    this.A.a("request_num", "");
    this.A.a(this);
    com.android.dazhihui.a.g.a().a(this.A);
  }
  
  public Double a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    Double localDouble = Double.valueOf(0.0D);
    if (!paramh.b()) {
      return Double.valueOf(0.0D);
    }
    int i2 = paramh.g();
    int i1 = 0;
    if (i1 < i2)
    {
      if (paramh.a(i1, "1065") == null) {}
      for (String str = "0";; str = paramh.a(i1, "1065"))
      {
        double d1 = localDouble.doubleValue();
        localDouble = Double.valueOf(Double.parseDouble(str) + d1);
        i1 += 1;
        break;
      }
    }
    return localDouble;
  }
  
  public Double a(String paramString, ArrayList<ag> paramArrayList)
  {
    d.a();
    Object localObject1 = Double.valueOf(0.0D);
    if (!((Boolean)e.get(paramString)).booleanValue()) {
      return (Double)f.get(paramString);
    }
    d locald = d.a();
    n localn = locald.i(paramString);
    locald.g();
    if (localn == null)
    {
      e.put(paramString, Boolean.valueOf(false));
      return (Double)localObject1;
    }
    Object localObject2 = new SimpleDateFormat("MM-dd").format(new Date());
    int i1;
    if (localn.d().startsWith((String)localObject2))
    {
      localObject1 = localn.g();
      if (localn.f().equals("0"))
      {
        e.put(paramString, Boolean.valueOf(false));
        return Double.valueOf((String)localObject1);
      }
      localObject1 = locald.l(paramString);
      locald.g();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      localObject1 = Double.valueOf(0.0D);
      a locala;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if (!TextUtils.isEmpty(locala.e())) {}
      }
      else
      {
        e.put(paramString, Boolean.valueOf(false));
        localn.b("" + localObject1);
        localn.a("0");
        locald.a(localn);
        locald.g();
        return (Double)localObject1;
      }
      localObject2 = paramArrayList.iterator();
      for (;;)
      {
        if (((Iterator)localObject2).hasNext())
        {
          Object localObject3 = (ag)((Iterator)localObject2).next();
          if (locala.e().endsWith(((ag)localObject3).a().substring(((ag)localObject3).a().length() - 6))) {
            if (locala.b().equals("1"))
            {
              i1 = -1;
              label351:
              localObject3 = com.android.dazhihui.d.b.a(((ag)localObject3).d(), ((ag)localObject3).c());
              localObject2 = localObject3;
              if (((String)localObject3).equals("--")) {
                localObject2 = "0";
              }
              double d1 = ((Double)localObject1).doubleValue();
              double d2 = i1;
              double d3 = Double.valueOf(locala.c()).doubleValue();
              double d4 = Double.valueOf((String)localObject2).doubleValue();
              localObject1 = Double.valueOf(Integer.valueOf(locala.d()).intValue() * (d2 * (d3 - d4)) + d1);
            }
          }
        }
      }
    }
    for (;;)
    {
      break;
      i1 = 1;
      break label351;
      e.put(paramString, Boolean.valueOf(false));
      return (Double)localObject1;
    }
  }
  
  public Double a(String paramString, ArrayList<ag> paramArrayList, Double paramDouble)
  {
    d.a();
    Object localObject = Double.valueOf(0.0D);
    a();
    if (!b) {
      return paramDouble;
    }
    d locald = d.a();
    n localn = locald.i(paramString);
    locald.g();
    if (localn == null)
    {
      a();
      b = false;
      return (Double)localObject;
    }
    paramDouble = new SimpleDateFormat("MM-dd").format(new Date());
    int i1;
    if (localn.d().startsWith(paramDouble))
    {
      paramDouble = localn.g();
      if (localn.f().equals("0"))
      {
        a();
        b = false;
        return Double.valueOf(paramDouble);
      }
      paramString = locald.l(paramString);
      locald.g();
      Iterator localIterator = paramString.iterator();
      paramString = Double.valueOf(0.0D);
      a locala;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if (!TextUtils.isEmpty(locala.e())) {}
      }
      else
      {
        a();
        b = false;
        localn.b("" + paramString);
        localn.a("0");
        locald.a(localn);
        locald.g();
        return paramString;
      }
      paramDouble = paramArrayList.iterator();
      for (;;)
      {
        if (paramDouble.hasNext())
        {
          localObject = (ag)paramDouble.next();
          if (locala.e().endsWith(((ag)localObject).a().substring(((ag)localObject).a().length() - 6))) {
            if ((locala.b() != null) && (locala.b().equals("1")))
            {
              i1 = -1;
              label310:
              localObject = com.android.dazhihui.d.b.a(((ag)localObject).e(), ((ag)localObject).c());
              paramDouble = (Double)localObject;
              if (((String)localObject).equals("--")) {
                paramDouble = "0";
              }
              double d1 = paramString.doubleValue();
              double d2 = i1;
              double d3 = Double.valueOf(locala.c()).doubleValue();
              double d4 = Double.valueOf(paramDouble).doubleValue();
              paramString = Double.valueOf(Integer.valueOf(locala.d()).intValue() * (d2 * (d3 - d4)) + d1);
            }
          }
        }
      }
    }
    for (;;)
    {
      break;
      i1 = 1;
      break label310;
      a();
      b = false;
      return (Double)localObject;
    }
  }
  
  public String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return String.valueOf(Double.valueOf(Double.parseDouble(paramString1) - (Double.parseDouble(paramString3) - Double.parseDouble(paramString2)) * Double.parseDouble(paramString4)));
  }
  
  public void a(int paramInt, com.android.dazhihui.ui.delegate.b.h paramh)
  {
    Object localObject = this.W.c(this.V, 3);
    this.W.g();
    if (localObject != null)
    {
      this.W.b(this.V, "3");
      this.W.g();
    }
    int i1 = 0;
    while (i1 < paramInt)
    {
      this.M = paramh.a(i1, "1036");
      this.N = paramh.a(i1, "1037");
      this.O = paramh.a(i1, "1060");
      this.P = paramh.a(i1, "1062");
      this.Q = paramh.a(i1, "1064");
      localObject = paramh.a(i1, "1061");
      this.S = ("HK" + this.M);
      this.T = new ag(this.V, this.N, this.S, this.P, Integer.valueOf(this.O).intValue(), Integer.valueOf((String)localObject).intValue(), 3, this.Q, "0");
      this.W.a(this.T);
      this.W.g();
      i1 += 1;
    }
    m();
  }
  
  public void a(ao paramao)
  {
    this.ag = paramao;
  }
  
  public void a(ap paramap)
  {
    this.ah = paramap;
  }
  
  public void a(String paramString)
  {
    this.o = paramString;
  }
  
  public void a(String paramString, com.android.dazhihui.ui.delegate.b.h paramh)
  {
    Object localObject = a(paramh);
    paramh = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramh = "0";
    }
    double d1 = Double.parseDouble(paramh);
    double d2 = ((Double)localObject).doubleValue();
    localObject = com.android.dazhihui.ui.delegate.a.a().c();
    paramh = "";
    paramString = "";
    if (localObject != null)
    {
      paramh = ((c)localObject).c();
      paramString = ((c)localObject).d();
    }
    paramString = paramh + "_" + paramString;
    paramString = "zszdev" + paramString;
    d.a().a(paramString, String.valueOf(Double.valueOf(d1 - d2)));
    d.a().g();
  }
  
  public void a(String paramString1, String paramString2)
  {
    paramString1 = new a(paramString1, this.V, this.al, this.am, paramString2);
    this.W.a(paramString1);
    this.W.g();
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    if (!o.r()) {
      return;
    }
    this.q = paramString1;
    this.t = paramString2;
    this.u = paramInt;
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", paramString1).h()) });
    this.w.a(this);
    com.android.dazhihui.a.g.a().a(this.w);
  }
  
  public void a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    if (!o.r()) {}
    while ((this.q == null) || (this.p == null) || (this.r == null)) {
      return;
    }
    this.p = j();
    this.af = paramInt;
    this.j = 1;
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11116").a("1026", String.valueOf(paramInt)).a("1021", this.r).a("1019", this.p[1]);
    if (this.s == null) {}
    for (String str = "0";; str = this.s)
    {
      paramString1 = localh.a("1003", str).a("1036", paramString3).a("1041", paramString1).a("1029", "1").a("1040", paramString2).a("1396", this.g).a("1515", this.h);
      this.i = paramString1;
      this.ae = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(paramString1.h()) });
      this.ae.a(this);
      com.android.dazhihui.a.g.a().a(this.ae);
      return;
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    String str;
    if (!TextUtils.isEmpty(paramString1))
    {
      str = paramString1;
      if (!paramString1.equals("--")) {}
    }
    else
    {
      str = "0";
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      paramString1 = paramString2;
      if (!paramString2.equals("--")) {}
    }
    else
    {
      paramString1 = "0";
    }
    if (!TextUtils.isEmpty(paramString3))
    {
      paramString2 = paramString3;
      if (!paramString3.equals("--")) {}
    }
    else
    {
      paramString2 = "0";
    }
    double d1 = Double.parseDouble(str);
    double d2 = Double.parseDouble(paramString1);
    double d3 = Double.parseDouble(paramString2);
    paramString3 = com.android.dazhihui.ui.delegate.a.a().c();
    paramString2 = "";
    paramString1 = "";
    if (paramString3 != null)
    {
      paramString2 = paramString3.c();
      paramString1 = paramString3.d();
    }
    paramString1 = paramString2 + "_" + paramString1;
    paramString1 = "zzcdev" + paramString1;
    d.a().a(paramString1, String.valueOf(Double.valueOf(d1 - (d2 + d3))));
    d.a().g();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.U = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.U != null)
    {
      this.K = this.U.c();
      this.L = this.U.d();
    }
    this.V = (this.K + "_" + this.L);
    paramString8 = a(paramString7, paramString4, paramString8, paramString5);
    this.S = b(paramString2, paramString3);
    this.T = new ag(this.V, paramString1, this.S, paramString4, Integer.valueOf(paramString5).intValue(), Integer.valueOf(paramString6).intValue(), 1, paramString7, paramString8);
    this.W.a(this.T);
    this.W.g();
  }
  
  public String b()
  {
    return this.o;
  }
  
  public String b(String paramString1, String paramString2)
  {
    String str;
    if ((paramString2 != null) && (paramString1 != null)) {
      if (o.l()) {
        if (paramString2.trim().equals("1")) {
          str = "SH" + paramString1;
        }
      }
    }
    label173:
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
                str = paramString1;
              } while (!paramString2.trim().equals("2"));
              return "SZ" + paramString1;
              if (!o.m()) {
                break label173;
              }
              if ((paramString2.equals("1")) || (paramString2.equals("3"))) {
                return "SH" + paramString1;
              }
              if (paramString2.equals("0")) {
                break;
              }
              str = paramString1;
            } while (!paramString2.equals("2"));
            return "SZ" + paramString1;
            if ((paramString2 != null) && (paramString2.equals("深圳交易所"))) {
              return "SZ" + paramString1;
            }
            if ((paramString2 != null) && (paramString2.equals("上海交易所"))) {
              return "SH" + paramString1;
            }
            if ((paramString2.equals("")) || (paramString2.trim().equals("3")) || (paramString2.trim().equals("5")) || (paramString2.trim().equals("7"))) {
              return "SH" + paramString1;
            }
            if ((paramString2.trim().equals("2")) || (paramString2.trim().equals("4")) || (paramString2.trim().equals("6")) || (paramString2.trim().equals("8")) || (paramString2.trim().equals("9"))) {
              break;
            }
            str = paramString1;
          } while (!paramString2.trim().equals("10"));
          return "SZ" + paramString1;
          str = paramString1;
        } while (paramString1 == null);
        str = paramString1;
      } while (paramString1.startsWith("SH"));
      str = paramString1;
    } while (paramString1.startsWith("SZ"));
    if ((paramString1.startsWith("5")) || (paramString1.startsWith("6")) || (paramString1.startsWith("9"))) {
      return "SH" + paramString1;
    }
    if ((paramString1.startsWith("0")) || (paramString1.startsWith("1")) || (paramString1.startsWith("2")) || (paramString1.startsWith("3")) || (paramString1.startsWith("4"))) {
      return "SZ" + paramString1;
    }
    return "SH" + paramString1;
  }
  
  public void b(int paramInt, com.android.dazhihui.ui.delegate.b.h paramh)
  {
    Object localObject1 = this.W.c(this.V, 3);
    this.W.g();
    if (localObject1 != null)
    {
      this.W.b(this.V, "2");
      this.W.g();
    }
    int i1 = 0;
    while (i1 < paramInt)
    {
      this.M = paramh.a(i1, "1090");
      this.N = paramh.a(i1, "1091");
      this.O = paramh.a(i1, "1110");
      this.P = paramh.a(i1, "1062");
      this.Q = paramh.a(i1, "1064");
      Object localObject2 = paramh.a(i1, "1267");
      localObject1 = Double.valueOf(this.O);
      localObject2 = Double.valueOf((String)localObject2);
      this.T = new ag(this.V, this.N, this.M, this.P, ((Double)localObject1).intValue(), ((Double)localObject2).intValue(), 2, this.Q, "0");
      this.W.a(this.T);
      this.W.g();
      i1 += 1;
    }
    m();
  }
  
  public void b(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.k);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.C = new t();
    this.C.c(f.Q);
    this.C.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.C.a(paramString);
      this.C.a(this);
      com.android.dazhihui.a.g.a().a(this.C);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public Boolean c()
  {
    this.W = d.a();
    this.U = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.U != null)
    {
      this.K = this.U.c();
      this.L = this.U.d();
    }
    this.V = (this.K + "_" + this.L);
    if (this.W.b("offline_capital_state", 0) == 2)
    {
      n localn = this.W.i(this.V);
      this.W.g();
      if (localn != null)
      {
        if (localn.e().equals("1")) {
          return Boolean.valueOf(true);
        }
      }
      else {
        return Boolean.valueOf(false);
      }
    }
    return Boolean.valueOf(false);
  }
  
  public void c(String paramString)
  {
    if (this.U != null)
    {
      this.K = this.U.c();
      this.L = this.U.d();
    }
    String str = this.K + "_" + this.L;
    n localn = this.W.i(str);
    this.W.g();
    if (localn != null)
    {
      this.c = localn.e();
      if (!this.c.equals("1")) {
        break label160;
      }
    }
    label160:
    for (this.d = "1";; this.d = "0")
    {
      this.Y = new n(str, this.d, n(), this.L, paramString, "0", "1");
      if (localn != null) {
        break label169;
      }
      this.W.b(this.Y);
      return;
      this.d = "0";
      break;
    }
    label169:
    this.W.a(this.Y);
  }
  
  public void d()
  {
    this.U = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.U != null)
    {
      this.K = this.U.c();
      this.L = this.U.d();
    }
    this.V = (this.K + "_" + this.L);
    this.W.b(this.V, "1");
    this.W.g();
  }
  
  public void d(String paramString)
  {
    new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setMessage(paramString).setPositiveButton("确定", null).show();
  }
  
  public void e()
  {
    if (!o.r()) {
      return;
    }
    this.y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", "").a("1036", "").a("1206", "0").a("1277", "0").h()) });
    this.y.a(this);
    com.android.dazhihui.a.g.a().a(this.y);
  }
  
  public void e(String paramString)
  {
    paramString = this.W.i(paramString);
    paramString.a("1");
    this.W.a(paramString);
  }
  
  public void f()
  {
    if (!o.r()) {
      return;
    }
    this.Z = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11140").a("1206", 0).a("1277", 100).a("1217", Integer.toString(0)).a("1036", "").a("1026", "").h()) });
    this.Z.a(this);
    com.android.dazhihui.a.g.a().a(this.Z);
  }
  
  public void f(String paramString)
  {
    com.android.dazhihui.b.b.a().f().runOnUiThread(new an(this, paramString));
  }
  
  public void g()
  {
    if (!o.r()) {
      return;
    }
    this.aa = new e();
    this.aa.b("UTF-8");
    this.aa.a("Bearer " + o.d);
    this.aa.a("position_str", "0");
    this.aa.a("request_num", "100");
    this.aa.c("https://uatopen.hs.net/secu/v1/business_qry");
    this.aa.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.aa.a("sendercomp_id", "90013");
    this.aa.a("exchange_type", "");
    this.aa.a("stock_account", "");
    this.aa.a("stock_code", "");
    this.aa.a(this);
    com.android.dazhihui.a.g.a().a(this.aa);
  }
  
  public void h()
  {
    if (!o.r()) {}
    for (;;)
    {
      return;
      Object localObject = new JinZhengRequestData();
      ((JinZhengRequestData)localObject).setType("JinzhengDRCJ_600180");
      ((JinZhengRequestData)localObject).setService_id("600180");
      ((JinZhengRequestData)localObject).setCompany_id(o.q);
      ((JinZhengRequestData)localObject).setUser_id(o.p);
      ((JinZhengRequestData)localObject).setUser_id_cls("2");
      ((JinZhengRequestData)localObject).setSession(o.g);
      ((JinZhengRequestData)localObject).setKey_str("");
      ((JinZhengRequestData)localObject).setRec_count("100");
      try
      {
        if (this.ac != null)
        {
          this.ac = ((JinZhengRequestData)localObject).jinzhengJson();
          this.ab = new t();
          this.ab.c(f.Q);
          this.ab.c("Content-Type", "application/json");
          localObject = new StringEntity(this.ac, "UTF-8");
          this.ab.a((HttpEntity)localObject);
          this.ab.a(this);
          com.android.dazhihui.a.g.a().a(this.ab);
          return;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    this.U = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.U != null)
    {
      this.K = this.U.c();
      this.L = this.U.d();
    }
    this.V = (this.K + "_" + this.L);
    Object localObject1;
    int i1;
    label179:
    Object localObject6;
    if (paramh == this.D)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, com.android.dazhihui.b.b.a().f()))
      {
        if (this.E) {
          e();
        }
        this.E = false;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(com.android.dazhihui.b.b.a().f(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        this.l = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        if (this.l > 0)
        {
          i1 = 0;
          if (i1 >= this.l) {
            break label4215;
          }
          localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
          if ((localObject6 == null) || (!((String)localObject6).equals("1"))) {
            break label4221;
          }
          label214:
          this.F = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
          this.ai = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
          this.aj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
        }
        a(this.ai, this.F, this.aj);
        c(this.F);
      }
    }
    if (paramh == this.z)
    {
      localObject6 = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.E) {
        p();
      }
      this.E = false;
    }
    for (;;)
    {
      Object localObject5;
      try
      {
        localObject1 = new JSONObject((String)localObject6).getJSONArray("data");
        int i3 = ((JSONArray)localObject1).length();
        if (i3 > 0)
        {
          i1 = 0;
          if (i1 < ((JSONArray)localObject1).length())
          {
            localObject8 = (JSONObject)((JSONArray)localObject1).get(i1);
            i2 = i3 - 1;
            if (i2 < 0) {
              break label4230;
            }
            this.F = ((JSONObject)localObject8).getString("enable_balance");
            this.ai = ((JSONObject)localObject8).getString("asset_balance");
            this.aj = ((JSONObject)localObject8).getString("market_value");
            i2 -= 1;
            continue;
          }
          a(this.ai, this.F, this.aj);
          c(this.F);
        }
        if ((paramj instanceof com.android.dazhihui.a.b.g))
        {
          localObject1 = (com.android.dazhihui.a.b.g)paramj;
          if (paramh == this.B)
          {
            localObject6 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
            System.out.println("查询客户资金返回数据" + (String)localObject6);
            localObject6 = (JinzhengResponse)new k().a((String)localObject6, JinzhengResponse.class);
            localObject8 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
            localObject9 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
            if (!((String)localObject8).equals("0"))
            {
              Toast.makeText(com.android.dazhihui.b.b.a().f(), (CharSequence)localObject9, 1).show();
              return;
            }
          }
        }
      }
      catch (JSONException localJSONException1)
      {
        Object localObject8;
        int i2;
        Object localObject9;
        try
        {
          localObject6 = ((JSONObject)new JSONTokener((String)localObject6).nextValue()).getString("error_info");
          localObject6 = Toast.makeText(com.android.dazhihui.b.b.a().f(), (CharSequence)localObject6, 0);
          ((Toast)localObject6).setGravity(17, 0, 0);
          ((Toast)localObject6).show();
          return;
        }
        catch (JSONException localJSONException5)
        {
          new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new ai(this)).show();
          localJSONException5.printStackTrace();
          localJSONException1.printStackTrace();
        }
        continue;
        if (((String)localObject8).equals("0"))
        {
          if (this.E) {
            b(o.g);
          }
          this.E = false;
          this.l = ((JinzhengResponse.Answer)localJSONException5.ANSWERS.get(0)).ANS_COMM_DATA.size();
          if (this.l > 0)
          {
            i1 = this.l - 1;
            if (i1 >= 0)
            {
              this.F = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException5.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).AVAILABLE;
              this.ai = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException5.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).ASSERT_VAL;
              this.aj = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException5.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).MKT_VAL;
              i1 -= 1;
              continue;
            }
          }
          a(this.ai, this.F, this.aj);
          c(this.F);
        }
        Object localObject2;
        Object localObject7;
        if (paramh == this.C)
        {
          this.W.h(this.V);
          this.W.g();
          localObject2 = new String(localJSONException1.a());
          System.out.println("持仓返回数据" + (String)localObject2);
          localObject8 = (JinzhengResponse)new k().a((String)localObject2, JinzhengResponse.class);
          localObject2 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject8).ANSWERS.get(0)).ANS_COMM_DATA;
          localObject7 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject8).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject8 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject8).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (!((String)localObject7).equals("0"))
          {
            Toast.makeText(com.android.dazhihui.b.b.a().f(), (CharSequence)localObject8, 1).show();
            return;
          }
          this.m = ((ArrayList)localObject2).size();
          if (this.m > 0)
          {
            i1 = 0;
            if (i1 < ((ArrayList)localObject2).size())
            {
              this.M = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SECU_CODE;
              this.N = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SECU_NAME;
              this.O = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SHARE_QTY;
              this.P = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).CURRENT_COST;
              this.X = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).MARKET;
              this.Q = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).INCOME_AMT;
              this.S = b(this.M, this.X);
              this.J = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SHARE_AVL;
              this.R = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).MKT_PRICE;
              localObject7 = a(this.Q, this.P, this.R, this.O);
              this.T = new ag(this.V, this.N, this.S, this.P, Integer.valueOf(this.O).intValue(), Integer.valueOf(this.J).intValue(), 1, this.Q, (String)localObject7);
              this.W.a(this.T);
              this.W.g();
              i1 += 1;
              continue;
            }
            m();
          }
        }
        if (paramh == this.y)
        {
          localObject2 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, com.android.dazhihui.b.b.a().f()))
          {
            localObject7 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject7).b())
            {
              paramh = Toast.makeText(com.android.dazhihui.b.b.a().f(), ((com.android.dazhihui.ui.delegate.b.h)localObject7).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            this.m = ((com.android.dazhihui.ui.delegate.b.h)localObject7).g();
            this.n = ((com.android.dazhihui.ui.delegate.b.h)localObject7).b("1289");
            if (!o.i()) {
              continue;
            }
            this.G = com.android.dazhihui.ui.delegate.c.a.e;
            this.H = com.android.dazhihui.ui.delegate.c.a.f;
            if ((this.G == null) || (this.H == null))
            {
              this.G = new String[] { "" };
              this.H = new String[] { "" };
            }
            this.W.h(this.V);
            this.W.g();
            i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).g();
            if (i2 > 0)
            {
              i1 = 0;
              if (i1 < i2)
              {
                this.M = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1036");
                this.N = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1037");
                this.P = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1062");
                this.X = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1021");
                this.O = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1461");
                if ((this.O == null) || (this.O.equals(""))) {
                  this.O = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1060");
                }
                if ((this.X == null) || (this.X.equals(""))) {
                  this.X = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1004");
                }
                this.Q = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1064");
                this.J = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1061");
                this.S = b(this.M, this.X);
                this.R = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1181");
                localObject2 = a(this.Q, this.P, this.R, this.O);
                this.T = new ag(this.V, this.N, this.S, this.P, Integer.valueOf(this.O).intValue(), Integer.valueOf(this.J).intValue(), 1, this.Q, (String)localObject2);
                this.W.a(this.T);
                this.W.g();
                i1 += 1;
                continue;
              }
              m();
            }
            if (this.K.contains("湘财证券"))
            {
              localObject2 = a().a((com.android.dazhihui.ui.delegate.b.h)localObject7);
              a().a(this.ai, this.F, String.valueOf(localObject2));
              a().a(String.valueOf(this.aj), (com.android.dazhihui.ui.delegate.b.h)localObject7);
            }
          }
        }
        if (paramh == this.A)
        {
          localObject2 = new String(((com.android.dazhihui.a.b.g)paramj).a());
          this.W.h(this.V);
          this.W.g();
        }
        try
        {
          localObject7 = new JSONObject((String)localObject2).getJSONArray("data");
          i2 = ((JSONArray)localObject7).length();
          if (i2 > 0)
          {
            i1 = 0;
            if (i1 < i2)
            {
              localObject8 = (JSONObject)((JSONArray)localObject7).get(i1);
              this.P = ((JSONObject)localObject8).getString("cost_price");
              this.M = ((JSONObject)localObject8).getString("stock_code");
              this.N = ((JSONObject)localObject8).getString("stock_name");
              this.O = ((JSONObject)localObject8).getString("current_amount");
              this.X = ((JSONObject)localObject8).getString("exchange_type");
              this.S = b(this.M, this.X);
              this.J = ((JSONObject)localObject8).getString("enable_amount");
              this.Q = ((JSONObject)localObject8).getString("income_balance");
              this.R = ((JSONObject)localObject8).getString("last_price");
              localObject8 = a(this.Q, this.P, this.R, this.O);
              this.T = new ag(this.V, this.N, this.S, this.P, Integer.valueOf(this.O).intValue(), Integer.valueOf(this.J).intValue(), 1, this.Q, (String)localObject8);
              this.W.a(this.T);
              this.W.g();
              i1 += 1;
              continue;
              if (this.m > 0)
              {
                this.W.h(this.V);
                this.W.g();
                i1 = 0;
                if (i1 < this.m)
                {
                  i2 = 0;
                  if (i2 < this.H.length)
                  {
                    if (this.H[i2].equals("1036"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) == null)
                      {
                        localObject2 = "";
                        this.M = ((String)localObject2);
                      }
                    }
                    else
                    {
                      if (this.H[i2].equals("1037"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.N = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1060"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.O = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1062"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.P = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1021"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.X = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1061"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.J = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1064"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.Q = ((String)localObject2);
                      }
                      if (this.H[i2].equals("1181"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]) != null) {
                          continue;
                        }
                        localObject2 = "";
                        this.R = ((String)localObject2);
                      }
                      i2 += 1;
                      continue;
                    }
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, this.H[i2]);
                    continue;
                  }
                  if ((this.X == null) || (this.X.equals(""))) {
                    this.X = ((com.android.dazhihui.ui.delegate.b.h)localObject7).a(i1, "1004");
                  }
                  localObject2 = a(this.Q, this.P, this.R, this.O);
                  this.S = b(this.M, this.X);
                  this.T = new ag(this.V, this.N, this.S, this.P, Integer.valueOf(this.O).intValue(), Integer.valueOf(this.J).intValue(), 1, this.Q, (String)localObject2);
                  this.W.a(this.T);
                  this.W.g();
                  i1 += 1;
                  continue;
                }
                m();
              }
              if (!this.K.contains("湘财证券")) {
                continue;
              }
              localObject2 = a().a((com.android.dazhihui.ui.delegate.b.h)localObject7);
              a().a(this.ai, this.F, String.valueOf(localObject2));
              a().a(String.valueOf(this.aj), (com.android.dazhihui.ui.delegate.b.h)localObject7);
              continue;
            }
            m();
          }
          if (paramh == this.Z)
          {
            localObject2 = ((v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, com.android.dazhihui.b.b.a().f())) {
              a((com.android.dazhihui.ui.delegate.b.u)localObject2);
            }
          }
          if (paramh == this.aa) {
            localObject7 = new String(((com.android.dazhihui.a.b.g)paramj).a());
          }
        }
        catch (JSONException localJSONException6)
        {
          try
          {
            localObject8 = new JSONObject((String)localObject7).getJSONArray("data");
            i1 = ((JSONArray)localObject8).length();
            l();
            Object localObject3;
            if (i1 > 0)
            {
              i1 = 0;
              if (i1 < ((JSONArray)localObject8).length())
              {
                localObject9 = (JSONObject)((JSONArray)localObject8).get(i1);
                i2 = 0;
                if (i2 < this.I.length)
                {
                  if (this.I[i2].equals("business_price"))
                  {
                    if (((JSONObject)localObject9).getString("business_price") == null)
                    {
                      localObject2 = "";
                      this.al = ((String)localObject2);
                    }
                  }
                  else
                  {
                    if (this.I[i2].equals("1047"))
                    {
                      if (((JSONObject)localObject9).getString("business_amount") != null) {
                        continue;
                      }
                      localObject2 = "";
                      this.am = ((String)localObject2);
                    }
                    if (this.I[i2].equals("entrust_bs"))
                    {
                      if (((JSONObject)localObject9).getString("entrust_bs") != null) {
                        continue;
                      }
                      localObject2 = "";
                      this.an = ((String)localObject2);
                    }
                    if (this.I[i2].equals("stock_code"))
                    {
                      if (((JSONObject)localObject9).getString("stock_code") != null) {
                        continue;
                      }
                      localObject2 = "";
                      this.ao = ((String)localObject2);
                    }
                    i2 += 1;
                    continue;
                    localJSONException6 = localJSONException6;
                    try
                    {
                      localObject2 = ((JSONObject)new JSONTokener((String)localObject2).nextValue()).getString("error_info");
                      localObject2 = Toast.makeText(com.android.dazhihui.b.b.a().f(), (CharSequence)localObject2, 0);
                      ((Toast)localObject2).setGravity(17, 0, 0);
                      ((Toast)localObject2).show();
                      return;
                    }
                    catch (JSONException localJSONException2)
                    {
                      new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new aj(this)).show();
                      localJSONException2.printStackTrace();
                      localJSONException6.printStackTrace();
                    }
                    continue;
                  }
                  localObject3 = ((JSONObject)localObject9).getString("business_price");
                  continue;
                  localObject3 = ((JSONObject)localObject9).getString("business_amount");
                  continue;
                  localObject3 = ((JSONObject)localObject9).getString("entrust_bs");
                  continue;
                  localObject3 = ((JSONObject)localObject9).getString("stock_code");
                  continue;
                }
                a(this.an, this.ao);
                i1 += 1;
                continue;
              }
              b = true;
              e(this.V);
            }
            if (paramh == this.ab)
            {
              localObject3 = new String(((com.android.dazhihui.a.b.g)paramj).a());
              localObject3 = (JinzhengResponse)new k().a((String)localObject3, JinzhengResponse.class);
              str = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
              str = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
              if (((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA == null)
              {
                i1 = 0;
                l();
                if (i1 <= 0) {
                  continue;
                }
                i2 = 0;
                if (i2 >= i1) {
                  continue;
                }
                this.ao = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA.get(i2)).SECU_CODE;
                this.al = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA.get(i2)).MATCHED_PRICE;
                this.am = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA.get(i2)).MATCHED_QTY;
                str = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA.get(i2)).TRD_ID;
                if (!str.equals("B")) {
                  continue;
                }
                this.an = "1";
                a(this.an, this.ao);
                i2 += 1;
                continue;
              }
            }
          }
          catch (JSONException localJSONException3)
          {
            String str;
            try
            {
              Object localObject4 = ((JSONObject)new JSONTokener(str).nextValue()).getString("error_info");
              localObject4 = Toast.makeText(com.android.dazhihui.b.b.a().f(), (CharSequence)localObject4, 0);
              ((Toast)localObject4).setGravity(17, 0, 0);
              ((Toast)localObject4).show();
              return;
            }
            catch (JSONException localJSONException4)
            {
              new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new ak(this)).show();
              localJSONException4.printStackTrace();
            }
            continue;
            i1 = ((JinzhengResponse.Answer)localJSONException4.ANSWERS.get(0)).ANS_COMM_DATA.size();
            continue;
            if (!str.equals("S")) {
              continue;
            }
            this.an = "2";
            continue;
            b = true;
            e(this.V);
            if (paramh == this.w)
            {
              localObject5 = ((v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject5, com.android.dazhihui.b.b.a().f()))
              {
                localObject5 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject5).e());
                if ((!((com.android.dazhihui.ui.delegate.b.h)localObject5).b()) && (((com.android.dazhihui.ui.delegate.b.h)localObject5).g() == 0)) {
                  break;
                }
                this.r = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1021");
                this.s = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1021");
                i();
              }
            }
            if (paramh == this.x)
            {
              localObject5 = ((v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject5, com.android.dazhihui.b.b.a().f()))
              {
                localObject5 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject5).e());
                if (((com.android.dazhihui.ui.delegate.b.h)localObject5).b())
                {
                  if (((com.android.dazhihui.ui.delegate.b.h)localObject5).g() != 0) {
                    break label4126;
                  }
                  this.o = "0";
                  a(this.o);
                  if (this.ag != null) {
                    this.ag.l();
                  }
                  if (this.ah != null) {
                    this.ah.g();
                  }
                }
              }
            }
          }
        }
      }
      if (paramh != this.ae) {
        break;
      }
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, com.android.dazhihui.b.b.a().f())) {
        break;
      }
      this.j = -1;
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (paramh.b())
      {
        if (this.af == 0)
        {
          paramj = paramh.a(0, "1208");
          if (paramj != null)
          {
            new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setTitle("提示信息").setMessage(paramj).setPositiveButton("确定", new am(this)).setNegativeButton("取消", new al(this)).setCancelable(false).show();
            return;
            label4126:
            this.o = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1061");
            continue;
          }
        }
        paramh = paramh.a(0, "1042");
        new AlertDialog.Builder(com.android.dazhihui.b.b.a().f()).setMessage("　　委托请求提交成功。合同号为：" + paramh).setPositiveButton("确定", null).setCancelable(false).show();
        this.i = null;
      }
      else
      {
        d(paramh.d());
        return;
        label4215:
        i1 = 0;
        break label214;
        label4221:
        i1 += 1;
        break label179;
        label4230:
        i1 += 1;
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    switch (this.j)
    {
    }
    for (;;)
    {
      this.j = -1;
      return;
      f("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void i()
  {
    if (!o.r()) {}
    do
    {
      return;
      this.p = j();
      if (this.u != 0) {
        break;
      }
    } while (com.android.dazhihui.d.n.w(this.t) == 0.0F);
    String str = com.android.dazhihui.d.n.t(this.t);
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11110").a("1021", this.r).a("1019", this.p[1]);
    if (this.s == null) {
      localObject = "0";
    }
    for (Object localObject = localh.a("1003", (String)localObject).a("1036", this.q).a("1041", str).a("1078", "0").a("1247", "0");; localObject = o.g("11146").a("1019", this.p[1]).a("1036", this.q).a("1206", "0").a("1277", "1"))
    {
      this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      this.x.a(this);
      com.android.dazhihui.a.g.a().a(this.x);
      return;
      localObject = this.s;
      break;
    }
  }
  
  public String[] j()
  {
    int i1;
    if (o.z.length > 0) {
      i1 = 0;
    }
    for (;;)
    {
      if (i1 < o.z.length)
      {
        if (this.r.equals(o.z[i1][0])) {
          this.v = i1;
        }
      }
      else
      {
        if ((o.z != null) && (o.z.length != 0) && (this.v < o.z.length)) {
          break;
        }
        return new String[] { "", "" };
      }
      i1 += 1;
    }
    return o.z[this.v];
  }
  
  public void k()
  {
    this.j = 1;
    if (!o.r()) {
      return;
    }
    this.i.a("1396", this.g).a("1515", this.h);
    this.ae = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(this.i.h()) });
    this.ae.a(this);
    com.android.dazhihui.a.g.a().a(this.ae);
  }
  
  public void l()
  {
    this.W = d.a();
    this.W.m(this.V);
    this.W.g();
  }
  
  public void m()
  {
    if (o.l())
    {
      h();
      return;
    }
    if (o.m())
    {
      g();
      return;
    }
    f();
  }
  
  public String n()
  {
    Date localDate = new Date(System.currentTimeMillis());
    return new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(localDate);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    switch (this.j)
    {
    }
    for (;;)
    {
      this.j = -1;
      return;
      f("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void o()
  {
    d.a().m();
    d.a().g();
    int i1 = d.a().c("offline_capital_state");
    d.a().g();
    if (i1 == 2)
    {
      d.a().a("offline_capital_state", 0);
      d.a().g();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */