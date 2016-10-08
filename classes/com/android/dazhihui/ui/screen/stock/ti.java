package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.LeftMenuItem;
import com.android.dazhihui.ui.model.stock.StockMinuteMenuVo;
import com.android.dazhihui.ui.model.stock.StockMinuteMenuVo.Header;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalDetailActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalInitActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalMine;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ag;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.ui.widget.dzhrefresh.StickyRefreshScrollView;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.android.dazhihui.w;
import com.c.a.k;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class ti
  extends com.android.dazhihui.ui.screen.a
  implements View.OnClickListener, com.android.dazhihui.a.b.i, com.android.dazhihui.b.i, com.android.dazhihui.service.q
{
  public static int a = 0;
  public static String b = "";
  public static String c = "";
  private com.android.dazhihui.ui.screen.stock.offlinecapital.n A;
  private String B;
  private Double C;
  private ai D;
  private ai E;
  private DzhMainHeader F;
  private boolean G;
  int d;
  private ArrayList<String> e;
  private ArrayList<String> f;
  private View g;
  private LayoutInflater h;
  private LeftMenuVo i;
  private ai j;
  private boolean k;
  private boolean l;
  private com.android.dazhihui.a.b.f m;
  private com.android.dazhihui.a.b.f n;
  private com.android.dazhihui.a.b.f o;
  private StickyRefreshScrollView p;
  private List<LeftMenuVo.LeftMenuItem> q;
  private uf r;
  private int s;
  private View t;
  private TextView u;
  private TextView v;
  private TextView w;
  private d x;
  private com.android.dazhihui.a.b.m y;
  private ArrayList<ag> z;
  
  private View a(LeftMenuVo.LeftMenuItem paramLeftMenuItem, View paramView)
  {
    ue localue;
    if (paramView == null)
    {
      paramView = this.h.inflate(2130903424, null);
      localue = new ue();
      localue.a = ((ImageView)paramView.findViewById(2131560425));
      localue.b = ((ImageView)paramView.findViewById(2131560427));
      localue.c = ((TextView)paramView.findViewById(2131560426));
      localue.c.setSingleLine(true);
      paramView.setTag(localue);
      r.a(getActivity()).a(paramLeftMenuItem.getImagepath(), localue.a);
      localue.c.setText(paramLeftMenuItem.getMenuname());
      localue.b.setVisibility(8);
      if (paramLeftMenuItem.getMenuflag() != 2) {
        break label341;
      }
      localue.b.setVisibility(0);
      localue.b.setImageResource(2130837628);
    }
    for (;;)
    {
      String str = paramLeftMenuItem.getCallurl();
      if (("123".equals(str)) && (com.android.dazhihui.b.b.a().r()))
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130838460);
      }
      if (("133".equals(str)) && (this.k))
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130838460);
      }
      if (("dzh_browser_url&goto=0&screen=177".equals(str)) && (this.l))
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130838460);
      }
      if (("http://htg.yundzh.com/friend/dynamicInfo?DZHSPECIAL=285".equals(str)) && (this.G))
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130838460);
      }
      if (paramLeftMenuItem.isShowRed())
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130838460);
        com.android.dazhihui.ui.widget.adv.ah.a().b(10001);
      }
      paramView.setOnClickListener(new tr(this, paramLeftMenuItem));
      return paramView;
      localue = (ue)paramView.getTag();
      break;
      label341:
      if ((paramLeftMenuItem.getMenuflag() == 3) && (!com.android.dazhihui.ui.widget.adv.ah.c(10, this.i.getVersion() + paramLeftMenuItem.getCountId() + paramLeftMenuItem.getMenuname())))
      {
        localue.b.setVisibility(0);
        localue.b.setImageResource(2130837629);
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i1] & 0xFF);
      String str1 = str2;
      if (str2.length() == 1) {
        str1 = "0" + str2;
      }
      localStringBuilder.append(str1);
      i1 += 1;
    }
    return localStringBuilder.toString().toLowerCase(Locale.getDefault()).trim();
  }
  
  public static void a(Context paramContext)
  {
    com.android.dazhihui.o.a().c(new to(paramContext));
  }
  
  private void a(boolean paramBoolean)
  {
    this.G = paramBoolean;
    if (this.r != null) {
      this.r.notifyDataSetChanged();
    }
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.r != null) {
      this.r.notifyDataSetChanged();
    }
  }
  
  private void c(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  private void d(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  private void g()
  {
    List localList1 = (List)this.i.getLeftMenuMap().get("normal");
    List localList2 = (List)this.i.getLeftMenuMap().get("channel");
    this.q = new ArrayList();
    this.q.addAll(localList1);
    this.q.addAll(localList2);
    this.r.notifyDataSetChanged();
  }
  
  private void h()
  {
    Object localObject = this.g.findViewById(2131559257);
    if (com.android.dazhihui.g.a().L())
    {
      ((View)localObject).setVisibility(0);
      ((View)localObject).setOnClickListener(new tw(this));
      localObject = this.g.findViewById(2131559259);
      ((View)localObject).setVisibility(0);
      ((View)localObject).setOnClickListener(new tx(this));
      localObject = this.g.findViewById(2131559258);
      ((View)localObject).setVisibility(0);
      ((View)localObject).setOnClickListener(new tz(this));
      localObject = this.g.findViewById(2131559260);
      ((View)localObject).setVisibility(0);
      ((View)localObject).setOnClickListener(new ub(this));
      localObject = this.g.findViewById(2131559261);
      ((View)localObject).setVisibility(0);
      ((View)localObject).setOnClickListener(new tj(this));
    }
    a();
    j();
    show();
    this.p.setOnRefreshListener(new tk(this));
    if (com.android.dazhihui.ui.widget.adv.ah.e.size() != 0)
    {
      localObject = com.android.dazhihui.ui.widget.adv.ah.e.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        a((String)((Iterator)localObject).next());
      }
    }
    DzhPushService.a(this);
  }
  
  private void i() {}
  
  private void j()
  {
    this.j = new tl(this, 1164);
    com.android.dazhihui.ui.widget.adv.ah.a().a(this.j);
    this.D = new tm(this, 16);
    this.E = new tn(this, 18);
    com.android.dazhihui.ui.widget.adv.ah.a().a(this.D);
    com.android.dazhihui.ui.widget.adv.ah.a().a(this.E);
  }
  
  private void k()
  {
    Object localObject = d.a();
    int i1 = ((d)localObject).b("offline_capital_state", 0);
    ((d)localObject).g();
    if (i1 == 1)
    {
      startActivity(new Intent(getActivity(), OfflineCapitalDetailActivity.class));
      return;
    }
    if (i1 == 2)
    {
      this.e = new ArrayList();
      this.f = new ArrayList();
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length != 0))
      {
        i1 = 0;
        while (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (!this.e.contains(com.android.dazhihui.c.a.a.E[i1][0])) {
            this.e.add(com.android.dazhihui.c.a.a.E[i1][0]);
          }
          if (!this.f.contains(com.android.dazhihui.c.a.a.E[i1][2])) {
            this.f.add(com.android.dazhihui.c.a.a.E[i1][2]);
          }
          i1 += 1;
        }
      }
      if ((this.e.size() == 1) && (this.f.size() == 1))
      {
        localObject = new Intent(getActivity(), OfflineCapitalDetailActivity.class);
        ((Intent)localObject).putExtra("entrustName", (String)this.e.get(0) + "_" + com.android.dazhihui.c.a.a.E[0][2]);
        startActivity((Intent)localObject);
        return;
      }
      startActivity(new Intent(getActivity(), OfflineCapitalMine.class));
      return;
    }
    localObject = new Intent(getActivity(), OfflineCapitalInitActivity.class);
    getActivity().startActivity((Intent)localObject);
  }
  
  private void l()
  {
    LeftMenuVo localLeftMenuVo = (LeftMenuVo)DzhApplication.a().b().a("LeftMenuJson", new tp(this));
    com.android.dazhihui.ui.a.m.a().a(localLeftMenuVo);
    if ((localLeftMenuVo == null) || (!localLeftMenuVo.isSameDay()))
    {
      this.n = new com.android.dazhihui.a.b.f();
      this.n.c(com.android.dazhihui.a.f.f);
      registRequestListener(this.n);
      sendRequest(this.n);
      return;
    }
    m();
  }
  
  private void m()
  {
    LeftMenuVo localLeftMenuVo = com.android.dazhihui.ui.a.m.a().J();
    Object localObject1 = (List)localLeftMenuVo.getLeftMenuMap().get("normal");
    Object localObject2 = (List)localLeftMenuVo.getLeftMenuMap().get("channel");
    ArrayList localArrayList = new ArrayList();
    if (localObject1 != null) {
      localArrayList.addAll((Collection)localObject1);
    }
    if (localObject2 != null) {
      localArrayList.addAll((Collection)localObject2);
    }
    localObject1 = localArrayList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (LeftMenuVo.LeftMenuItem)((Iterator)localObject1).next();
      if (((LeftMenuVo.LeftMenuItem)localObject2).getMenuflag() == 3)
      {
        localObject2 = localLeftMenuVo.getVersion() + ((LeftMenuVo.LeftMenuItem)localObject2).getCountId() + ((LeftMenuVo.LeftMenuItem)localObject2).getMenuname();
        com.android.dazhihui.ui.widget.adv.ah.a().a(10, (String)localObject2);
      }
    }
  }
  
  private void n()
  {
    Vector localVector = c();
    if (localVector.size() > 0)
    {
      x[] arrayOfx = new x[1];
      arrayOfx[0] = new x(2955);
      arrayOfx[0].c(107);
      arrayOfx[0].c(32897);
      arrayOfx[0].a(localVector);
      arrayOfx[0].c("2955-107-离线持仓-" + localVector);
      if (this.y == null)
      {
        this.y = new com.android.dazhihui.a.b.m(arrayOfx);
        this.y.a("2955--离线持仓--自动包 NioRequest");
        registRequestListener(this.y);
      }
      for (;;)
      {
        setAutoRequest(this.y);
        sendRequest(this.y);
        return;
        this.y.a(arrayOfx);
      }
    }
    this.y = null;
    setAutoRequest(null);
  }
  
  private void o()
  {
    Object localObject2 = Double.valueOf(0.0D);
    Object localObject1 = localObject2;
    if (this.d == 2)
    {
      this.x = d.a();
      String str = this.x.b("zszdev" + this.B);
      this.x.g();
      localObject1 = localObject2;
      if (!TextUtils.isEmpty(str)) {
        localObject1 = Double.valueOf(str);
      }
    }
    System.out.println("zszdev = " + localObject1);
    double d1 = d().doubleValue();
    localObject2 = a(Double.valueOf(((Double)localObject1).doubleValue() + d1));
    localObject1 = localObject2;
    if (((String)localObject2).equals(".00")) {
      localObject1 = "0.00";
    }
    this.w.setText((CharSequence)localObject1);
    localObject2 = a(e());
    localObject1 = localObject2;
    if (!((String)localObject2).startsWith("-"))
    {
      localObject1 = localObject2;
      if (!((String)localObject2).equals("0.00")) {
        localObject1 = "+" + (String)localObject2;
      }
    }
    this.v.setText((CharSequence)localObject1);
    a(this.v, this.v.getText().toString());
    localObject2 = a(f());
    localObject1 = localObject2;
    if (!((String)localObject2).startsWith("-"))
    {
      localObject1 = localObject2;
      if (!((String)localObject2).equals("0.00")) {
        localObject1 = "+" + (String)localObject2;
      }
    }
    this.u.setText((CharSequence)localObject1);
    a(this.u, this.u.getText().toString());
  }
  
  public String a(Double paramDouble)
  {
    return String.valueOf(new DecimalFormat("0.00").format(paramDouble).toString());
  }
  
  public void a()
  {
    this.i = com.android.dazhihui.ui.a.m.a().J();
    if (this.i != null) {
      g();
    }
    for (;;)
    {
      return;
      try
      {
        Object localObject = r.a(getActivity().getAssets().open("menu_wo.json"));
        if (localObject != null)
        {
          localObject = new String((byte[])localObject);
          LeftMenuVo localLeftMenuVo = new LeftMenuVo();
          localLeftMenuVo.decode((String)localObject);
          this.i = localLeftMenuVo;
          g();
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void a(byte paramByte)
  {
    if (paramByte == 100) {
      return;
    }
    if (com.android.dazhihui.b.b.a().r())
    {
      b(true);
      return;
    }
    b(false);
  }
  
  public void a(int paramInt)
  {
    b(paramInt);
    if (this.z.size() <= 0)
    {
      this.w.setText("0.00");
      this.v.setText("0.00");
      this.u.setText("0.00");
    }
    n();
  }
  
  public void a(TextView paramTextView, String paramString)
  {
    if ((paramTextView == null) || (getActivity() == null) || (getActivity().isFinishing())) {
      return;
    }
    if (Double.valueOf(paramString).doubleValue() < 0.0D)
    {
      paramTextView.setTextColor(getResources().getColor(2131492932));
      return;
    }
    paramTextView.setTextColor(-65536);
  }
  
  public void a(ag paramag)
  {
    int i1;
    if (paramag != null) {
      i1 = 0;
    }
    for (;;)
    {
      if (i1 < this.z.size())
      {
        ag localag = (ag)this.z.get(i1);
        if (localag.a().equals(paramag.a())) {
          localag.a(paramag);
        }
      }
      else
      {
        return;
      }
      i1 += 1;
    }
  }
  
  public void a(String paramString)
  {
    if ((this.q == null) || (this.q.size() == 0)) {}
    while (TextUtils.isEmpty(paramString)) {
      return;
    }
    for (;;)
    {
      try
      {
        i1 = Integer.valueOf(paramString).intValue();
        Iterator localIterator = this.q.iterator();
        if (localIterator.hasNext())
        {
          LeftMenuVo.LeftMenuItem localLeftMenuItem = (LeftMenuVo.LeftMenuItem)localIterator.next();
          if (localLeftMenuItem.getCountId() != i1) {
            continue;
          }
          localLeftMenuItem.setIsShowRed(true);
          i1 = 1;
          if (i1 == 0)
          {
            com.android.dazhihui.ui.widget.adv.ah.e.remove(paramString);
            com.android.dazhihui.ui.widget.adv.ah.a().b(10001);
          }
          if (this.r == null) {
            break;
          }
          this.r.notifyDataSetChanged();
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        return;
      }
      int i1 = 0;
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    if ((paramInt != com.android.dazhihui.ui.widget.adv.ah.o) || (!com.android.dazhihui.ui.widget.adv.ah.e.containsKey(paramString))) {
      return;
    }
    a(paramString);
  }
  
  void b()
  {
    this.x = d.a();
    this.d = this.x.b("offline_capital_state", 0);
    this.x.g();
    LeftMenuVo localLeftMenuVo = com.android.dazhihui.ui.a.m.a().J();
    if ((localLeftMenuVo != null) && (localLeftMenuVo.getcChangType().equals("1")) && (this.d == 2))
    {
      this.x.a("offline_capital_state", 0);
      this.x.g();
      this.x.j();
      this.x.g();
      this.x.m();
      this.x.g();
      this.d = 0;
    }
    if ((this.d == 1) || (this.d == 2))
    {
      this.t.setVisibility(0);
      a(this.d);
      return;
    }
    this.t.setVisibility(8);
  }
  
  public void b(byte paramByte)
  {
    if (com.android.dazhihui.b.b.a().r())
    {
      b(true);
      return;
    }
    b(false);
  }
  
  public void b(int paramInt)
  {
    this.x = d.a();
    this.z = new ArrayList();
    if (paramInt == 1)
    {
      this.z = this.x.k();
      this.x.g();
    }
    while (paramInt != 2) {
      return;
    }
    String str1 = this.x.b("offline_capital_my_show_quanshang");
    this.x.g();
    this.A = null;
    if (!TextUtils.isEmpty(str1))
    {
      this.A = this.x.i(str1);
      this.x.g();
    }
    str1 = this.x.b("offline_capital_my_show_quanshang_is_set");
    if (((str1 == null) || (!str1.equals("1"))) && ((this.A == null) || (!this.A.e().equals("1"))))
    {
      this.x.a("offline_capital_my_show_quanshang", "");
      String str2 = this.x.b("hadTongbu_entrust_name");
      this.x.g();
      if (!TextUtils.isEmpty(str2))
      {
        this.A = this.x.i(str2);
        this.x.g();
      }
    }
    if (((this.A == null) || (!this.A.e().equals("1"))) && ((str1 == null) || (!str1.equals("1"))))
    {
      this.x.a("offline_capital_my_show_quanshang", "");
      this.A = this.x.j("1");
      this.x.g();
    }
    if ((this.A == null) || (!this.A.e().equals("1")))
    {
      System.out.println("获取本地券商账户失败");
      this.t.setVisibility(8);
      return;
    }
    System.out.println("mOfflineCapitalEntrust.entrustName = " + this.A.c());
    this.B = this.A.c();
    this.x.a("offline_capital_my_show_quanshang", this.B);
    this.x.g();
    this.x.a("offline_capital_my_show_quanshang_is_set", "1");
    this.x.g();
    this.z.addAll(this.x.c(this.A.c(), 1));
    this.x.g();
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (this.F != null) {
      this.F.f();
    }
  }
  
  public Vector<String> c()
  {
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < this.z.size())
    {
      localVector.add(((ag)this.z.get(i1)).a());
      i1 += 1;
    }
    return localVector;
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      this.F.a();
    }
    switch (tq.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.mLookFace = y.a;
      return;
    }
    this.mLookFace = y.b;
  }
  
  public Double d()
  {
    Iterator localIterator = this.z.iterator();
    ag localag;
    double d1;
    for (Double localDouble = Double.valueOf(0.0D); localIterator.hasNext(); localDouble = Double.valueOf(Double.valueOf(localag.p()).doubleValue() + d1))
    {
      localag = (ag)localIterator.next();
      d1 = localDouble.doubleValue();
    }
    return localDouble;
  }
  
  public Double e()
  {
    Iterator localIterator = this.z.iterator();
    ag localag;
    double d1;
    for (Double localDouble = Double.valueOf(0.0D); localIterator.hasNext(); localDouble = Double.valueOf(Double.valueOf(localag.q()).doubleValue() + d1))
    {
      localag = (ag)localIterator.next();
      d1 = localDouble.doubleValue();
    }
    return localDouble;
  }
  
  public Double f()
  {
    Iterator localIterator = this.z.iterator();
    Double localDouble = Double.valueOf(0.0D);
    if (localIterator.hasNext())
    {
      ag localag = (ag)localIterator.next();
      if (localag.d() - localag.e() == 0) {
        break label252;
      }
      System.out.println("itm.getLatestPrice() = " + localag.d());
      System.out.println("itm.getClosePrice() = " + localag.e());
      String str = com.android.dazhihui.d.b.a(localag.d() - localag.e(), localag.c());
      double d1 = localDouble.doubleValue();
      double d2 = Double.valueOf(str).doubleValue();
      localDouble = Double.valueOf(localag.m() * d2 + d1);
    }
    label252:
    for (;;)
    {
      break;
      if (this.d == 1) {}
      for (this.C = Double.valueOf(0.0D);; this.C = com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().a(this.B, this.z, this.C))
      {
        System.out.println("---DRYKDeviation = " + this.C);
        return Double.valueOf(localDouble.doubleValue() + this.C.doubleValue());
      }
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            try
            {
              if (paramh == this.n)
              {
                paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
                try
                {
                  paramh = new LeftMenuVo();
                  paramh.decode(paramj);
                  paramj = com.android.dazhihui.ui.a.m.a().J();
                  if ((paramj == null) || (!paramj.getVersion().equals(paramh.getVersion())))
                  {
                    com.android.dazhihui.ui.a.m.a().a(paramh);
                    DzhApplication.a().b().a("LeftMenuJson", paramh);
                    if (this.g != null)
                    {
                      a();
                      i();
                    }
                    m();
                  }
                  return;
                }
                catch (JSONException paramh)
                {
                  paramh.printStackTrace();
                  return;
                }
              }
              if (paramh != this.o) {
                break;
              }
            }
            catch (Exception paramh)
            {
              paramh.printStackTrace();
              return;
            }
            paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
            try
            {
              paramh = (StockMinuteMenuVo)new k().a(paramh, StockMinuteMenuVo.class);
              paramh.time = System.currentTimeMillis();
              paramj = com.android.dazhihui.ui.a.m.a().K();
              if ((paramj == null) || (!paramj.header.vs.equals(paramh.header.vs)))
              {
                com.android.dazhihui.ui.a.m.a().a(paramh);
                DzhApplication.a().b().a("StockMenu", paramh);
                return;
              }
            }
            catch (Exception paramh)
            {
              paramh.printStackTrace();
              return;
            }
          }
          if (paramh == this.m)
          {
            paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
            try
            {
              paramh = new uc();
              paramj = new JSONObject(paramj).getJSONObject("data");
              String str = paramj.getString("notice");
              i1 = paramj.getInt("HResolution");
              i2 = paramj.getInt("VResolution");
              int i3 = paramj.getInt("FrameRate");
              paramh.a = str;
              paramh.b = i1;
              paramh.c = i2;
              paramh.d = i3;
              com.android.dazhihui.ui.a.m.a().a(paramh);
              return;
            }
            catch (Exception paramh)
            {
              paramh.printStackTrace();
              return;
            }
          }
        } while (paramh != this.y);
        paramh = ((com.android.dazhihui.a.b.o)paramj).h();
      } while ((paramh == null) || (paramh.a != 2955));
      paramh = paramh.b;
    } while (paramh == null);
    paramh = new com.android.dazhihui.a.b.q(paramh);
    int i1 = paramh.e();
    paramh.e();
    paramh.e();
    int i2 = paramh.e();
    if (i1 == 107)
    {
      if (!com.android.dazhihui.g.a().L()) {
        break label474;
      }
      System.out.println("SettingFragment 离线持仓-处理返回的2955_107");
    }
    for (;;)
    {
      if (i1 < i2)
      {
        paramj = new ag();
        paramj.a(paramh);
        a(paramj);
        i1 += 1;
      }
      else
      {
        o();
        return;
        label474:
        i1 = 0;
      }
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void loadMoreData() {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    com.android.dazhihui.b.b.a().a(this);
    h();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onClick(View paramView)
  {
    w.a();
    switch (paramView.getId())
    {
    }
    do
    {
      int i1;
      do
      {
        return;
        com.android.dazhihui.d.n.a("", 20120);
        i1 = d.a().b("offline_capital_state", 0);
        this.x.g();
        if (i1 == 1)
        {
          startActivity(new Intent(getActivity(), OfflineCapitalDetailActivity.class));
          return;
        }
      } while (i1 != 2);
      paramView = new Intent(getActivity(), OfflineCapitalDetailActivity.class);
      if (!TextUtils.isEmpty(this.B))
      {
        this.A = this.x.i(this.B);
        this.x.g();
      }
    } while (this.A == null);
    String str = this.A.c();
    paramView.putExtra("entrustName", str);
    System.out.println("entrustName = " + str);
    startActivity(paramView);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.h = paramLayoutInflater;
    this.g = paramLayoutInflater.inflate(2130903166, null);
    paramLayoutInflater = this.g.findViewById(2131559253);
    paramViewGroup = (AdvertView)this.g.findViewById(2131559254);
    paramViewGroup.setOnAdvertStateChangeListener(new ts(this, paramLayoutInflater));
    paramViewGroup.setAdvCode(147);
    addAdvert(paramViewGroup);
    this.p = ((StickyRefreshScrollView)this.g.findViewById(2131559252));
    this.F = ((DzhMainHeader)this.g.findViewById(2131559251));
    this.F.a(getActivity(), 5, null);
    paramLayoutInflater = this.g.findViewById(2131559178);
    paramViewGroup = (AdvertView)this.g.findViewById(2131559270);
    paramLayoutInflater.setOnClickListener(new tt(this, paramViewGroup));
    paramViewGroup.setOnAdvertStateChangeListener(new tu(this, paramLayoutInflater));
    paramViewGroup.setAdvCode(137);
    addAdvert(paramViewGroup);
    paramLayoutInflater = (ViewFlow)this.g.findViewById(2131559173);
    this.r = new uf(this, getActivity());
    paramLayoutInflater.setAdapter(this.r);
    paramLayoutInflater.setFlowIndicator((CircleFlowIndicator)this.g.findViewById(2131559255));
    this.t = this.g.findViewById(2131559262);
    this.u = ((TextView)this.g.findViewById(2131559265));
    this.v = ((TextView)this.g.findViewById(2131559267));
    this.w = ((TextView)this.g.findViewById(2131559269));
    this.t.setOnClickListener(this);
    changeLookFace(this.mLookFace);
    return this.g;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.android.dazhihui.b.b.a().b(this);
    com.android.dazhihui.ui.widget.adv.ah.a().b(this.j);
    com.android.dazhihui.ui.widget.adv.ah.a().b(this.D);
    DzhPushService.b(this);
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (com.android.dazhihui.b.b.a().r()) {
        b(true);
      }
    }
    else {
      return;
    }
    b(false);
  }
  
  public void onResume()
  {
    super.onResume();
    com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a();
    com.android.dazhihui.ui.screen.stock.offlinecapital.ah.b = true;
    b();
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -1) && (paramInt2 == -1)) {}
  }
  
  public void show()
  {
    super.show();
    w localw = w.a();
    if ((localw.h() == c.b) && (!localw.l()))
    {
      byte[] arrayOfByte = localw.j();
      if ((!TextUtils.isEmpty(localw.f())) && (arrayOfByte != null) && (arrayOfByte.length > 0)) {
        localw.b(true);
      }
    }
    com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a();
    com.android.dazhihui.ui.screen.stock.offlinecapital.ah.b = true;
    b();
    if (this.F != null)
    {
      this.F.a();
      this.F.e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */