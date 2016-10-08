package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.d;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api2206;
import com.android.dazhihui.ui.model.stock.StockVo.Api2917;
import com.android.dazhihui.ui.model.stock.StockVo.Api2930;
import com.android.dazhihui.ui.model.stock.StockVo.Api2931;
import com.android.dazhihui.ui.model.stock.StockVo.Api2931Item;
import com.android.dazhihui.ui.model.stock.StockVo.Api2955_4416;
import com.android.dazhihui.ui.model.stock.StockVo.Api2994;
import com.android.dazhihui.ui.model.stock.StockVo.Api3010;
import com.android.dazhihui.ui.model.stock.StockVo.Api3010_Table;
import com.android.dazhihui.ui.model.stock.StockVo.ApiDoubleVol;
import com.android.dazhihui.ui.model.stock.adapter.MinuteTitleGridAdpter;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ao;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.EmojiInputView;
import com.android.dazhihui.ui.widget.IndexStockChartBottomWidget;
import com.android.dazhihui.ui.widget.PopupMenu;
import com.android.dazhihui.ui.widget.StockChartViewflow;
import com.android.dazhihui.ui.widget.StockLandTitle;
import com.android.dazhihui.ui.widget.StockLandView;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.mh;
import com.android.dazhihui.ui.widget.stockchart.FastDealMenu;
import com.android.dazhihui.ui.widget.stockchart.FastDealsView;
import com.android.dazhihui.ui.widget.stockchart.KChartContainer;
import com.android.dazhihui.ui.widget.stockchart.KChartDetailView;
import com.android.dazhihui.ui.widget.stockchart.MinChartContainer;
import com.android.dazhihui.ui.widget.stockchart.MinChartContainerTop;
import com.android.dazhihui.ui.widget.stockchart.MinChartDetailSwitchView;
import com.android.dazhihui.ui.widget.stockchart.MinChartDetailView;
import com.android.dazhihui.ui.widget.stockchart.MinChartIndexSwitchView;
import com.android.dazhihui.ui.widget.stockchart.MinChartTradeVolumnView;
import com.android.dazhihui.ui.widget.stockchart.MinChartTreadPrice;
import com.android.dazhihui.ui.widget.stockchart.MinuteChartChildView;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.StockChartDetaisView;
import com.android.dazhihui.ui.widget.stockchart.StockChartFrameLayout;
import com.android.dazhihui.ui.widget.stockchart.StockChartHeaderTitleView;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;
import com.android.dazhihui.ui.widget.stockchart.StockChartPriceView;
import com.android.dazhihui.ui.widget.stockchart.StockCostView;
import com.android.dazhihui.ui.widget.stockchart.af;
import com.android.dazhihui.ui.widget.stockchart.aj;
import com.android.dazhihui.ui.widget.stockchart.av;
import com.android.dazhihui.ui.widget.stockchart.ay;
import com.android.dazhihui.ui.widget.stockchart.az;
import com.android.dazhihui.ui.widget.stockchart.s;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

public class uv
  extends com.android.dazhihui.ui.screen.e
  implements View.OnClickListener, u, com.android.dazhihui.b, ao, com.android.dazhihui.ui.widget.dzhrefresh.b, com.android.dazhihui.ui.widget.dzhrefresh.c, ay
{
  public static int a = 239;
  public static int b = 255;
  public static int c = 191;
  public static final int[] d = { 2130838521, 2130838519 };
  public static final int[] e = { 2130838521, 2130838523 };
  public static final int[] f = { 2130838426, 2130838519, 2130838517 };
  public static final int[] g = { 2130838521, 2130838520 };
  public static final int[] h = { 2130838521, 2130838520, 2130838519 };
  public static final int[] i = { 2130838521 };
  public static final int[] j = { 2130838665, 2130838672, 2130838668 };
  public static final int[] k = { 2130838666, 2130838665, 2130838673, 2130838672, 2130838667, 2130838674, 2130838670 };
  public static final int[] l = { 2130838665, 2130838672, 2130838669 };
  public static final int[] m = { 2130838666, 2130838665, 2130838673, 2130838672, 2130838667, 2130838674, 2130838671 };
  public static final String[] n = { "加自选", "预警", "分享", "添加桌面", "白色主题" };
  public static final int[] o = { 2130838395, 2130838426, 2130838416, 2130838394, 2130838417 };
  public static final String[] p = { "分享", "预警", "小智诊股", "添加桌面", "白色主题" };
  public static final String[] q = { "分享", "预警", "添加桌面", "白色主题" };
  public static final int[] r = { 2130838650, 2130838656, 2130838663, 2130838634, 2130838652 };
  public static final int[] s = { 2130838651, 2130838657, 2130838664, 2130838635, 2130838653 };
  public static final int[] t = { 2130838650, 2130838656, 2130838634, 2130838652 };
  public static final int[] u = { 2130838651, 2130838657, 2130838635, 2130838653 };
  private int A = 1;
  private View B;
  private StockChartPager C;
  private IndexStockChartBottomWidget D;
  private EmojiInputView E;
  private int F = 0;
  private int G = 0;
  private int H;
  private com.android.dazhihui.ui.a.m I = com.android.dazhihui.ui.a.m.a();
  private com.android.dazhihui.a.b.m J;
  private com.android.dazhihui.a.b.m K;
  private com.android.dazhihui.a.b.m L;
  private com.android.dazhihui.a.b.m M;
  private com.android.dazhihui.a.b.m N;
  private com.android.dazhihui.a.b.m O;
  private com.android.dazhihui.a.b.m P;
  private com.android.dazhihui.a.b.m Q;
  private com.android.dazhihui.a.b.m R;
  private com.android.dazhihui.a.b.m S;
  private com.android.dazhihui.a.b.m T;
  private com.android.dazhihui.a.b.m U;
  private com.android.dazhihui.a.b.m V;
  private com.android.dazhihui.a.b.m W;
  private com.android.dazhihui.a.b.m X;
  private com.android.dazhihui.a.b.m Y;
  private com.android.dazhihui.a.b.m Z;
  private StockChartHeaderTitleView aA;
  private ImageView aB;
  private ImageView aC;
  private View aD;
  private int aE = 2130838628;
  private int aF = 2130838119;
  private int aG = -11907497;
  private int aH = -5395027;
  private boolean aI;
  private Vector<StockVo> aJ;
  private FastDealsView aK;
  private FastDealMenu aL;
  private PopupMenu aM;
  private Button aN;
  private Button aO;
  private boolean aP = false;
  private ArrayList<HotVideoPushStockVo> aQ;
  private StockChartVideoAdapter aR;
  private int aS;
  private String aT;
  private int aU = 0;
  private wl aV;
  private View aW;
  private boolean aX = false;
  private AdapterView.OnItemClickListener aY = new vl(this);
  private Handler aZ = new vo(this);
  private com.android.dazhihui.a.b.f aa;
  private com.android.dazhihui.a.b.m ab;
  private com.android.dazhihui.a.b.m ac;
  private SimpleDateFormat ad = new SimpleDateFormat("yyyyMMddHHmm");
  private StockChartContainer ae;
  private StockVo af;
  private boolean ag = false;
  private PopupWindow ah;
  private StockLandTitle ai;
  private StockLandView aj;
  private MinChartDetailView ak;
  private KChartDetailView al;
  private String[] am;
  private String[] an;
  private String[] ao;
  private LinearLayout ap;
  private View aq;
  private View ar;
  private LinearLayout as;
  private String[] at = { "1分钟", "5分钟", "15分钟", "30分钟", "60分钟" };
  private int au;
  private AdvertView av;
  private AdvertView aw;
  private AdvertView ax;
  private vq ay = vq.a;
  private RelativeLayout az;
  private av ba = av.a;
  private View.OnClickListener bb = new uz(this);
  public AdvertView v;
  public AdvertView w;
  public AdvertView x;
  public LoadAndRefreshView y;
  private final int[] z = { 4128, 1072845347 };
  
  private void A()
  {
    this.aJ = this.I.v();
    if (this.aJ.size() > 0)
    {
      this.F = this.I.x();
      this.G = this.I.v().size();
      if (this.F >= this.G) {
        this.F = 0;
      }
      this.af = ((StockVo)this.aJ.get(this.F));
      this.aA.setStockVo(this.af);
      this.aA.a(this.af.getName(), this.af.getCode());
      this.aA.setHasRong(this.af.getLoanable());
      this.C.a(this.F, this.G);
    }
  }
  
  private void B()
  {
    if (this.C.getPreviousContainer() != null) {
      this.C.getPreviousContainer().setHolder(this);
    }
    this.ae = this.C.getCurrentContainer();
    this.ae.setHolder(this);
    this.ae.setDataModel(this.af);
    this.D.f();
    if (this.C.getNextContainer() != null) {
      this.C.getNextContainer().setHolder(this);
    }
    this.C.setOnPageChangeListener(this);
    this.ai.setHolder(this.ae);
    this.ak.setHolder(this.ae);
    this.al.setHolder(this.ae);
    this.am = getResources().getStringArray(2131361874);
    this.an = getResources().getStringArray(2131361862);
    this.ao = getResources().getStringArray(2131361859);
    Bundle localBundle = getBundle();
    if (localBundle != null)
    {
      boolean bool = localBundle.getBoolean("go_kline", false);
      this.aI = localBundle.getBoolean("go_guba", false);
      if (bool) {
        this.ae.a(av.b);
      }
    }
    for (;;)
    {
      DzhPushService.a(new vm(this));
      if (this.ae.g != null) {
        this.ae.g.setVisibility(8);
      }
      this.C.f();
      return;
      if (this.aI)
      {
        if (com.android.dazhihui.d.n.l(localBundle.getString("code", "")))
        {
          this.ae.setmSwitchType(av.a);
          this.ae.a(av.c);
        }
        else
        {
          this.ae.setmSwitchType(av.a);
          this.ae.a(av.d);
        }
      }
      else
      {
        this.ae.a(av.a);
        continue;
        this.ae.a(av.a);
      }
    }
  }
  
  private void C()
  {
    if (this.af == null) {
      return;
    }
    this.T = new com.android.dazhihui.a.b.m();
    x localx = new x(2997);
    localx.a(this.af.getCode());
    this.T.a(localx);
    registRequestListener(this.T);
    sendRequest(this.T);
  }
  
  private void D()
  {
    if (this.af == null) {
      return;
    }
    this.J = new com.android.dazhihui.a.b.m();
    this.J.a("2939静态数据");
    x localx = new x(2939);
    localx.a(this.af.getCode());
    this.J.a(localx);
    if (this.af.getType() == 5)
    {
      localx = new x(2987);
      localx.b(0);
      localx.d(68157440);
      localx.a(new String[] { this.af.getCode() });
      this.J.a(localx);
    }
    registRequestListener(this.J);
    sendRequest(this.J);
  }
  
  private void E()
  {
    if (this.af == null) {}
    for (;;)
    {
      return;
      this.K = new com.android.dazhihui.a.b.m();
      this.K.a("mReqExtend");
      x localx;
      if (this.ae.getSwitchType() == av.a)
      {
        if (!com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) {
          break label175;
        }
        localx = new x(2931);
        localx.a(this.af.getCode());
        localx.c(this.af.getApi2976().position);
        localx.c(1000);
        this.K.a(localx);
        localx = new x(2930);
        localx.a(this.af.getCode());
        this.K.a(localx);
      }
      while (this.K.s().size() > 0)
      {
        registRequestListener(this.K);
        sendRequest(this.K);
        return;
        label175:
        if (com.android.dazhihui.d.n.m(this.af.getCode()))
        {
          this.af.getHsIndex2955Data().clear();
          this.af.getPlate2955Data().clear();
          localx = new x(2955);
          localx.c(105);
          localx.c(37904);
          localx.b(17);
          localx.b(0);
          localx.c(0);
          localx.c(3);
          this.K.a(localx);
          localx = new x(2955);
          localx.c(105);
          localx.c(37904);
          localx.b(17);
          localx.b(1);
          localx.c(0);
          localx.c(3);
          this.K.a(localx);
          localx = new x(2955);
          localx.c(0);
          localx.c(37904);
          localx.b(17);
          localx.b(0);
          localx.c(0);
          localx.c(3);
          this.K.a(localx);
          localx = new x(2955);
          localx.c(0);
          localx.c(37904);
          localx.b(17);
          localx.b(1);
          localx.c(0);
          localx.c(3);
          this.K.a(localx);
        }
        else if ((this.af.getType() == 0) && (this.af.getMarketType() == 4))
        {
          localx = new x(2955);
          localx.c(4095);
          localx.c(34833);
          localx.b(1);
          localx.b(0);
          localx.c(0);
          localx.c(20);
          localx.a(this.af.getCode());
          this.K.a(localx);
        }
      }
    }
  }
  
  private void F()
  {
    int i1 = 0;
    if (this.af == null) {}
    label712:
    label794:
    label1171:
    label1269:
    for (;;)
    {
      return;
      this.L = new com.android.dazhihui.a.b.m();
      this.L.a("动态数据");
      Object localObject = new x(2940);
      ((x)localObject).a(this.af.getCode());
      this.L.a((x)localObject);
      this.L.a(Boolean.valueOf(this.aP));
      localObject = this.ae.getSwitchType();
      x localx;
      if (localObject == av.a)
      {
        i1 = this.af.getMarketType();
        this.aZ.removeMessages(0);
        this.aZ.removeMessages(1);
        this.af.setMinLength(0);
        this.af.setFirstTpPosition(0);
        this.af.setSecondTpPositiom(0);
        this.af.setMinOffset(0);
        localx = new x(2942);
        localx.a(this.af.getCode());
        localx.c(0);
        this.L.a(localx);
        if (this.af.getMinIndex() < this.af.getMinTotalPoint())
        {
          if (com.android.dazhihui.d.n.e(this.af.getType()))
          {
            localx = new x(2941);
            localx.a(this.af.getCode());
            localx.d(0);
            localx.c(20);
            this.L.a(localx);
          }
          if ((i1 != 15) && (i1 != 11) && (i1 != 12) && (i1 != 1) && (i1 != 0) && (i1 != 13) && (this.af.getType() != 5)) {
            break label794;
          }
          localx = new x(2957);
          localx.a(this.af.getCode());
          localx.d(0);
          this.L.a(localx);
          localx = new x(2204);
          localx.a(this.af.getCode());
          this.L.a(localx);
          if (c(this.af))
          {
            localx = new x(2917);
            localx.a(this.af.getCode());
            localx.d(this.af.getApi2917Data().queueId);
            this.L.a(localx);
            localx = new x(2915);
            localx.a(this.af.getCode());
            this.L.a(localx);
            this.aZ.sendEmptyMessageDelayed(1, 3000L);
          }
          localx = new x(2941);
          localx.a(this.af.getCode());
          localx.d(0);
          localx.c(20);
          this.L.a(localx);
          if (com.android.dazhihui.d.n.k(this.af.getCode()))
          {
            localx = new x(2965);
            localx.a(this.af.getCode());
            localx.c(0);
            this.L.a(localx);
          }
          localx = new x(2922);
          localx.a(this.af.getCode());
          localx.d(0);
          this.L.a(localx);
          localx = new x(2923);
          localx.a(this.af.getCode());
          localx.d(0);
          this.L.a(localx);
          localx = new x(2924);
          localx.a(this.af.getCode());
          localx.d(0);
          this.L.a(localx);
          if (com.android.dazhihui.d.n.k(this.af.getType(), i1)) {
            G();
          }
          if (com.android.dazhihui.d.n.g(this.af.getType()))
          {
            localx = new x(2994);
            localx.a(this.af.getCode());
            this.L.a(localx);
          }
        }
        registRequestListener(this.L);
        sendRequest(this.L);
        if (localObject != av.a) {
          break label1171;
        }
        H();
      }
      for (;;)
      {
        if ((com.android.dazhihui.d.n.g(this.af.getType(), this.af.getMarketType())) || ((com.android.dazhihui.d.n.f(this.af.getType(), this.af.getMarketType())) && (!c(this.af)))) {
          break label1269;
        }
        I();
        return;
        if (!com.android.dazhihui.d.n.f(this.af.getType(), i1)) {
          break;
        }
        localx = new x(2204);
        localx.a(this.af.getCode());
        this.L.a(localx);
        localx = new x(2941);
        localx.a(this.af.getCode());
        localx.d(0);
        localx.c(20);
        this.L.a(localx);
        if (!c(this.af)) {
          break;
        }
        localx = new x(2917);
        localx.a(this.af.getCode());
        localx.d(this.af.getApi2917Data().queueId);
        this.L.a(localx);
        localx = new x(2915);
        localx.a(this.af.getCode());
        this.L.a(localx);
        this.aZ.sendEmptyMessageDelayed(1, 3000L);
        break;
        if (localObject != av.b) {
          break label712;
        }
        this.aZ.removeMessages(2);
        localx = new x(2944);
        localx.a(this.af.getCode());
        localx.b(this.ae.getKChartContainer().getKLinePeriodValue());
        localx.d(0);
        localx.c(150);
        this.L.a(localx);
        localx = new x(2933);
        localx.a(this.af.getCode());
        localx.d(0);
        localx.c(150);
        this.L.a(localx);
        int i2 = this.ae.getKChartContainer().getKLinePeriodValue();
        if ((i2 != 7) && (i2 != 8) && (i2 != 9)) {
          break label712;
        }
        localx = new x(2958);
        localx.a(this.af.getCode());
        if (StockVo.getExRights() == 1) {
          i1 = 1;
        }
        localx.b(i1);
        this.L.a(localx);
        break label712;
        if (localObject == av.b)
        {
          localObject = this.ae.getKChartContainer().getDDEModel();
          if (this.ae.getKChartContainer().getKLinePeriodValue() == 7) {
            switch (vg.a[localObject.ordinal()])
            {
            case 1: 
            default: 
              break;
            case 2: 
              g(true);
              break;
            case 3: 
              h(true);
              break;
            case 4: 
              i(true);
            }
          }
        }
      }
    }
  }
  
  private void G()
  {
    if (this.af == null) {
      return;
    }
    this.S = new com.android.dazhihui.a.b.m();
    this.S.a(com.android.dazhihui.a.b.n.b);
    this.S.a("2206");
    x localx = new x(2206);
    localx.a(this.af.getCode());
    this.S.a(localx);
    registRequestListener(this.S);
    sendRequest(this.S);
  }
  
  private void H()
  {
    if (this.af == null) {
      return;
    }
    this.U = new com.android.dazhihui.a.b.m();
    this.U.a("mReq2955Attr");
    this.U.a(com.android.dazhihui.a.b.n.b);
    Vector localVector = new Vector();
    localVector.add(this.af.getCode());
    x localx = new x(2955);
    localx.c(106);
    localx.c(4416);
    localx.a(localVector);
    this.U.a(localx);
    registRequestListener(this.U);
    sendRequest(this.U);
  }
  
  private void I()
  {
    if ((this.af == null) || (TextUtils.isEmpty(this.af.getCode()))) {}
    do
    {
      return;
      this.af.setCjl2978(0);
    } while ((com.android.dazhihui.d.n.g(this.af.getType(), this.af.getMarketType())) || ((com.android.dazhihui.d.n.f(this.af.getType(), this.af.getMarketType())) && (!c(this.af))) || (this.af.getMinIndex() >= this.af.getMinTotalPoint()));
    this.X = new com.android.dazhihui.a.b.m();
    this.X.a("mRegist2978Req");
    this.X.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2978);
    Vector localVector = new Vector();
    localVector.add(this.af.getCode());
    localx.b(2);
    if (com.android.dazhihui.d.n.k(this.af.getType(), this.af.getMarketType()))
    {
      localx.d(this.z[0]);
      localx.d(this.z[0]);
    }
    for (;;)
    {
      localx.a(localVector, 0, localVector.size());
      this.X.a(localx);
      registRequestListener(this.X);
      com.android.dazhihui.b.b.a().a(this.X);
      sendRequest(this.X);
      this.aZ.removeMessages(3);
      this.aZ.sendEmptyMessageDelayed(3, 60000L);
      return;
      localx.d(this.z[1]);
      localx.d(this.z[1]);
    }
  }
  
  private void J()
  {
    this.aZ.removeMessages(3);
    Object localObject = new x(2978);
    ((x)localObject).b(0);
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(com.android.dazhihui.a.b.n.b);
    ((com.android.dazhihui.a.b.m)localObject).d(false);
    com.android.dazhihui.b.b.a().b();
    sendRequest((h)localObject);
  }
  
  private void K()
  {
    if (this.af == null) {
      return;
    }
    if (this.ae.getSwitchType() == av.a)
    {
      this.V = new com.android.dazhihui.a.b.m();
      this.V.a("mAutoLevel2Req");
      this.V.a(com.android.dazhihui.a.b.n.d);
      x localx = new x(2204);
      localx.a(this.af.getCode());
      this.V.a(localx);
      if (c(this.af))
      {
        localx = new x(2915);
        localx.a(this.af.getCode());
        this.V.a(localx);
        localx = new x(2917);
        localx.a(this.af.getCode());
        localx.d(this.af.getApi2917Data().queueId);
        this.V.a(localx);
      }
      registRequestListener(this.V);
      sendRequest(this.V);
    }
    this.aZ.sendEmptyMessageDelayed(1, 3000L);
  }
  
  private void L()
  {
    if (this.af == null) {}
    while (((!c(this.af)) && (com.android.dazhihui.d.n.f(this.af.getType(), this.af.getMarketType()))) || (this.ae.getSwitchType() != av.a)) {
      return;
    }
    this.W = new com.android.dazhihui.a.b.m();
    this.W.a("mAuto2942Req");
    x localx = new x(2942);
    localx.a(this.af.getCode());
    localx.c(this.af.getMinIndex());
    this.W.a(localx);
    if (this.af.getMinIndex() < this.af.getMinTotalPoint())
    {
      localx = new x(2940);
      localx.a(this.af.getCode());
      this.W.a(localx);
      if (com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType()))
      {
        localx = new x(2931);
        localx.a(this.af.getCode());
        localx.c(this.af.getApi2976().position);
        localx.c(30);
        this.W.a(localx);
        localx = new x(2930);
        localx.a(this.af.getCode());
        this.W.a(localx);
      }
      if (com.android.dazhihui.d.n.k(this.af.getCode()))
      {
        localx = new x(2965);
        localx.a(this.af.getCode());
        localx.c(this.af.getMinIndex());
        this.W.a(localx);
      }
      localx = new x(2922);
      localx.a(this.af.getCode());
      localx.d(this.af.getMinIndex());
      this.W.a(localx);
      localx = new x(2923);
      localx.a(this.af.getCode());
      localx.d(this.af.getMinIndex());
      this.W.a(localx);
      localx = new x(2924);
      localx.a(this.af.getCode());
      localx.d(this.af.getMinIndex());
      this.W.a(localx);
      if (com.android.dazhihui.d.n.k(this.af.getType(), this.af.getMarketType())) {
        G();
      }
      if (com.android.dazhihui.d.n.g(this.af.getType()))
      {
        localx = new x(2994);
        localx.a(this.af.getCode());
        this.W.a(localx);
      }
      H();
      E();
    }
    registRequestListener(this.W);
    sendRequest(this.W);
    this.aZ.sendEmptyMessageDelayed(0, 15000L);
  }
  
  private void M()
  {
    if (this.af == null) {}
    while (com.android.dazhihui.d.n.h(this.af.getType(), this.af.getMarketType())) {
      return;
    }
    if (this.ae.getSwitchType() == av.b)
    {
      this.Y = new com.android.dazhihui.a.b.m();
      this.Y.a("mAuto2944Req");
      Object localObject = new x(2944);
      ((x)localObject).a(this.af.getCode());
      ((x)localObject).b(this.ae.getKChartContainer().getKLinePeriodValue());
      ((x)localObject).d(0);
      ((x)localObject).c(150);
      this.Y.a((x)localObject);
      registRequestListener(this.Y);
      sendRequest(this.Y);
      localObject = this.ae.getKChartContainer().getDDEModel();
      if (this.ae.getKChartContainer().getKLinePeriodValue() == 7) {
        switch (vg.a[localObject.ordinal()])
        {
        }
      }
    }
    for (;;)
    {
      this.aZ.sendEmptyMessageDelayed(2, 15000L);
      return;
      g(true);
      continue;
      h(true);
      continue;
      i(true);
    }
  }
  
  private void N()
  {
    this.ag = false;
    this.J = null;
    this.K = null;
    this.L = null;
    this.M = null;
    this.N = null;
    this.O = null;
    this.P = null;
    this.Q = null;
    this.R = null;
    this.S = null;
    this.V = null;
    this.W = null;
    this.U = null;
    this.Y = null;
    this.aa = null;
    clearRequest();
    this.aZ.removeMessages(0);
    this.aZ.removeMessages(1);
    this.aZ.removeMessages(2);
    D();
    F();
  }
  
  private void O()
  {
    int i3 = StockVo.getExRights();
    int[] arrayOfInt1 = this.af.getExRightsMulti();
    int[] arrayOfInt2 = this.af.getExRightsAdd();
    int[] arrayOfInt3 = this.af.getExRightsTime();
    Object localObject = this.af.getPrototypeKData();
    long[] arrayOfLong2 = this.af.getPrototypeKVolData();
    int i4 = this.af.getKNowDay();
    if ((arrayOfInt3 != null) && (arrayOfInt3.length != 0) && (localObject != null) && (this.ae.getKChartContainer().getKLinePeriodValue() == 7) && (com.android.dazhihui.d.n.l(this.af.getType(), this.af.getMarketType())))
    {
      int i1 = localObject.length;
      int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 8 });
      long[] arrayOfLong1 = new long[arrayOfLong2.length];
      i1 = 0;
      int i2;
      while (i1 < localObject.length)
      {
        if (i1 < arrayOfLong1.length) {
          arrayOfLong1[i1] = arrayOfLong2[i1];
        }
        i2 = 0;
        while (i2 < localObject[0].length)
        {
          arrayOfInt[i1][i2] = localObject[i1][i2];
          i2 += 1;
        }
        i1 += 1;
      }
      localObject = new int[arrayOfInt.length];
      i1 = 0;
      while (i1 < arrayOfInt.length)
      {
        int i5 = arrayOfInt[i1][0];
        if (i3 == 0)
        {
          i2 = 0;
          if (i2 < arrayOfInt3.length)
          {
            if (i4 < arrayOfInt3[i2]) {}
            for (;;)
            {
              i2 += 1;
              break;
              if (i5 == arrayOfInt3[i2]) {
                localObject[i1] = 1;
              }
              if ((i2 == 0) && (i5 < arrayOfInt3[i2]))
              {
                arrayOfInt[i1][1] = ((arrayOfInt[i1][1] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][2] = ((arrayOfInt[i1][2] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][3] = ((arrayOfInt[i1][3] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][4] = ((arrayOfInt[i1][4] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                if (arrayOfInt1[i2] != 0) {
                  arrayOfLong1[i1] = (arrayOfLong1[i1] * 10000L / arrayOfInt1[i2]);
                }
              }
              else if ((i2 > 0) && (i5 >= arrayOfInt3[(i2 - 1)]) && (i5 < arrayOfInt3[i2]))
              {
                arrayOfInt[i1][1] = ((arrayOfInt[i1][1] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][2] = ((arrayOfInt[i1][2] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][3] = ((arrayOfInt[i1][3] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][4] = ((arrayOfInt[i1][4] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                if (arrayOfInt1[i2] != 0) {
                  arrayOfLong1[i1] = (arrayOfLong1[i1] * 10000L / arrayOfInt1[i2]);
                }
              }
            }
          }
        }
        else if (i3 == 1)
        {
          i2 = 0;
          if (i2 < arrayOfInt3.length)
          {
            if (i4 < arrayOfInt3[i2]) {}
            for (;;)
            {
              i2 += 1;
              break;
              if (i5 == arrayOfInt3[i2]) {
                localObject[i1] = 1;
              }
              if ((i2 == arrayOfInt3.length - 1) && (i5 >= arrayOfInt3[i2]))
              {
                arrayOfInt[i1][1] = ((arrayOfInt[i1][1] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][2] = ((arrayOfInt[i1][2] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][3] = ((arrayOfInt[i1][3] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][4] = ((arrayOfInt[i1][4] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                if (arrayOfInt1[i2] != 0) {
                  arrayOfLong1[i1] = (arrayOfLong1[i1] * 10000L / arrayOfInt1[i2]);
                }
              }
              else if ((i2 < arrayOfInt3.length - 1) && (i5 >= arrayOfInt3[i2]) && (i5 < arrayOfInt3[(i2 + 1)]))
              {
                arrayOfInt[i1][1] = ((arrayOfInt[i1][1] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][2] = ((arrayOfInt[i1][2] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][3] = ((arrayOfInt[i1][3] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                arrayOfInt[i1][4] = ((arrayOfInt[i1][4] * arrayOfInt1[i2] + arrayOfInt2[i2] * 100) / 10000);
                if (arrayOfInt1[i2] != 0) {
                  arrayOfLong1[i1] = (arrayOfLong1[i1] * 10000L / arrayOfInt1[i2]);
                }
              }
            }
          }
        }
        else
        {
          i2 = 0;
          if (i2 < arrayOfInt3.length)
          {
            if (i4 < arrayOfInt3[i2]) {}
            for (;;)
            {
              i2 += 1;
              break;
              if (i5 == arrayOfInt3[i2]) {
                localObject[i1] = 1;
              }
            }
          }
        }
        i1 += 1;
      }
      this.af.setKData(arrayOfInt);
      this.af.setKVolData(arrayOfLong1);
      this.af.setExRightsId((int[])localObject);
    }
  }
  
  private void P()
  {
    int i5 = 28;
    int i6 = 2;
    int[][] arrayOfInt = this.af.getMinData();
    if (arrayOfInt == null) {
      return;
    }
    int i7 = this.af.getmDp();
    int i8 = this.af.getmUp();
    int i3 = Integer.MIN_VALUE;
    int i1 = Integer.MAX_VALUE;
    int i9 = this.af.getMinIndex();
    int i4 = 0;
    while (i4 < i9)
    {
      i2 = i3;
      if (arrayOfInt[i4][1] > i3)
      {
        i2 = arrayOfInt[i4][1];
        this.af.mApiDoubleVol.dayHight = i4;
      }
      i3 = i1;
      if (arrayOfInt[i4][1] < i1)
      {
        i3 = arrayOfInt[i4][1];
        this.af.mApiDoubleVol.dayLow = i4;
      }
      i1 = i2;
      if (arrayOfInt[i4][2] > i2) {
        i1 = arrayOfInt[i4][2];
      }
      i2 = i3;
      if (arrayOfInt[i4][2] < i3) {
        i2 = arrayOfInt[i4][2];
      }
      if ((i4 > 3) && (d.a().e())) {
        c(i4);
      }
      i4 += 1;
      i3 = i1;
      i1 = i2;
    }
    int i2 = Math.max(i8, i3);
    i1 = Math.min(i7, i1);
    i3 = this.af.getCp();
    if (this.af.getType() == 0)
    {
      i1 = Math.max(Math.abs(i2 - i3), Math.abs(i1 - i3));
      if (i1 != i3) {
        break label382;
      }
      i1 = i5;
    }
    label382:
    for (;;)
    {
      if (i3 == 0) {
        i1 = 2;
      }
      for (i2 = 0;; i2 = i3 - i2 * i3 / 100)
      {
        this.af.setStockDrawMaxMin(i1, i2);
        return;
        i2 = i1 * 100 / i3 + 1;
        i1 = i3 * i2 / 100 + i3;
      }
      i1 = Math.max(Math.abs(i2 - i3), Math.abs(i1 - i3));
      if (i1 < 2) {
        i1 = i6;
      }
      for (;;)
      {
        i2 = i3 + i1;
        i3 -= i1;
        i1 = i2;
        i2 = i3;
        break;
        if (i1 == i3) {
          i1 = 28;
        }
      }
    }
  }
  
  private void Q()
  {
    if (this.aj != null)
    {
      if (this.ae.getSwitchType() != av.a) {
        break label33;
      }
      this.aj.setSelected(0);
    }
    for (;;)
    {
      z();
      return;
      label33:
      if (this.ae.getSwitchType() == av.b)
      {
        int i1 = this.ae.getKChartContainer().getKLinePeriodValue() - 1;
        if (i1 < 5)
        {
          this.aj.setSelected(4);
          this.aj.setViewText(this.at[i1]);
        }
        else
        {
          this.aj.setSelected(i1 - 5);
        }
      }
    }
  }
  
  private void R()
  {
    this.ah = new PopupWindow();
    this.ah.setBackgroundDrawable(new ColorDrawable(0));
    this.ah.setFocusable(true);
    this.ah.setOutsideTouchable(true);
  }
  
  private void S()
  {
    this.ar = LayoutInflater.from(getActivity()).inflate(2130903375, null, false);
    TextView localTextView1 = (TextView)this.ar.findViewById(2131559220);
    TextView localTextView2 = (TextView)this.ar.findViewById(2131559221);
    TextView localTextView3 = (TextView)this.ar.findViewById(2131559222);
    if ("app_dzh".equals("app_sb")) {
      localTextView3.setVisibility(8);
    }
    TextView localTextView4 = (TextView)this.ar.findViewById(2131559455);
    TextView localTextView5 = (TextView)this.ar.findViewById(2131559223);
    localTextView1.setOnClickListener(this.bb);
    localTextView2.setOnClickListener(this.bb);
    localTextView3.setOnClickListener(this.bb);
    localTextView4.setOnClickListener(this.bb);
    localTextView5.setOnClickListener(this.bb);
  }
  
  private View T()
  {
    View localView;
    String[] arrayOfString;
    Object localObject3;
    label92:
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if (this.mLookFace == y.a) {
      if (!com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType()))
      {
        q[3] = "白色主题";
        if (this.mLookFace != y.a) {
          break label296;
        }
        localView = LayoutInflater.from(getActivity()).inflate(2130903443, null);
        if (com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) {
          break label284;
        }
        arrayOfString = q;
        localObject3 = t;
        localObject1 = localObject3;
        localObject2 = arrayOfString;
        localObject4 = localView;
        if (this.ae.getSwitchType() != av.b) {
          break label442;
        }
        localObject4 = new String[arrayOfString.length + 1];
        System.arraycopy(arrayOfString, 0, localObject4, 0, arrayOfString.length);
        localObject4[(localObject4.length - 1)] = "K线设置";
        localObject1 = new int[localObject3.length + 1];
        System.arraycopy(localObject3, 0, localObject1, 0, localObject3.length);
        localObject1[(localObject1.length - 1)] = 2130838648;
        localObject2 = localView;
        localObject3 = localObject4;
      }
    }
    for (;;)
    {
      localObject1 = new MinuteTitleGridAdpter(getActivity(), null, (int[])localObject1, (String[])localObject3, this.mLookFace);
      localObject3 = (GridView)((View)localObject2).findViewById(2131560018);
      ((GridView)localObject3).setAdapter((ListAdapter)localObject1);
      ((GridView)localObject3).setNumColumns(1);
      ((GridView)localObject3).setOnItemClickListener(new vc(this));
      return (View)localObject2;
      p[4] = "白色主题";
      break;
      if (!com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType()))
      {
        q[3] = "黑色主题";
        break;
      }
      p[4] = "黑色主题";
      break;
      label284:
      arrayOfString = p;
      localObject3 = r;
      break label92;
      label296:
      localView = LayoutInflater.from(getActivity()).inflate(2130903444, null);
      if (!com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) {
        arrayOfString = q;
      }
      for (localObject3 = u;; localObject3 = s)
      {
        localObject1 = localObject3;
        localObject2 = arrayOfString;
        localObject4 = localView;
        if (this.ae.getSwitchType() != av.b) {
          break label442;
        }
        localObject4 = new String[arrayOfString.length + 1];
        System.arraycopy(arrayOfString, 0, localObject4, 0, arrayOfString.length);
        localObject4[(localObject4.length - 1)] = "K线设置";
        localObject1 = new int[localObject3.length + 1];
        System.arraycopy(localObject3, 0, localObject1, 0, localObject3.length);
        localObject1[(localObject1.length - 1)] = 2130838649;
        localObject2 = localView;
        localObject3 = localObject4;
        break;
        arrayOfString = p;
      }
      label442:
      localObject3 = localObject2;
      localObject2 = localObject4;
    }
  }
  
  private void U()
  {
    int i1;
    String[] arrayOfString;
    int[] arrayOfInt;
    FragmentActivity localFragmentActivity;
    Object localObject1;
    RelativeLayout localRelativeLayout;
    Object localObject2;
    LinearLayout localLinearLayout;
    Object localObject3;
    if (this.mLookFace == y.a)
    {
      i1 = -2892312;
      arrayOfString = this.af.getDetailData();
      i2 = this.af.getType();
      arrayOfInt = this.af.getDetailDataColor();
      localFragmentActivity = getActivity();
      this.az = new RelativeLayout(localFragmentActivity);
      this.az.setBackgroundColor(getResources().getColor(2131493662));
      this.ap = new LinearLayout(localFragmentActivity);
      this.ap.setOrientation(1);
      localObject1 = new RelativeLayout.LayoutParams(this.B.getWidth() * 3 / 4, this.B.getHeight() * 7 / 12);
      ((RelativeLayout.LayoutParams)localObject1).addRule(13);
      this.az.addView(this.ap, (ViewGroup.LayoutParams)localObject1);
      localRelativeLayout = new RelativeLayout(localFragmentActivity);
      localObject1 = new ImageView(localFragmentActivity);
      ((ImageView)localObject1).setScaleType(ImageView.ScaleType.CENTER);
      ((ImageView)localObject1).setImageResource(2130838414);
      localObject2 = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230824), getResources().getDimensionPixelSize(2131230824));
      ((RelativeLayout.LayoutParams)localObject2).addRule(11);
      ((RelativeLayout.LayoutParams)localObject2).rightMargin = 0;
      localRelativeLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = new TextView(localFragmentActivity);
      ((TextView)localObject1).setTextColor(i1);
      ((TextView)localObject1).setTextSize(14.0F);
      ((TextView)localObject1).setText("行情数据");
      localObject2 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(13);
      localRelativeLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      this.ap.addView(localRelativeLayout, (ViewGroup.LayoutParams)localObject1);
      localObject1 = new View(localFragmentActivity);
      ((View)localObject1).setId(localObject1.hashCode());
      ((View)localObject1).setBackgroundColor(-16777216);
      localObject2 = new LinearLayout.LayoutParams(-1, 1);
      this.ap.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = new LinearLayout(localFragmentActivity);
      ((LinearLayout)localObject1).setOrientation(0);
      localObject2 = new LinearLayout.LayoutParams(-1, -1);
      ((LinearLayout.LayoutParams)localObject2).topMargin = getResources().getDimensionPixelSize(2131230844);
      ((LinearLayout.LayoutParams)localObject2).bottomMargin = getResources().getDimensionPixelSize(2131230844);
      this.ap.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localLinearLayout = new LinearLayout(localFragmentActivity);
      localLinearLayout.setOrientation(1);
      localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
      ((LinearLayout.LayoutParams)localObject2).leftMargin = getResources().getDimensionPixelSize(2131230774);
      ((LinearLayout.LayoutParams)localObject2).rightMargin = getResources().getDimensionPixelSize(2131230774);
      ((LinearLayout)localObject1).addView(localLinearLayout, (ViewGroup.LayoutParams)localObject2);
      localObject2 = new LinearLayout(localFragmentActivity);
      ((LinearLayout)localObject2).setOrientation(1);
      localObject3 = new LinearLayout.LayoutParams(0, -1, 1.0F);
      ((LinearLayout.LayoutParams)localObject3).leftMargin = getResources().getDimensionPixelSize(2131230774);
      ((LinearLayout.LayoutParams)localObject3).rightMargin = getResources().getDimensionPixelSize(2131230774);
      ((LinearLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      if ((i2 != 0) || (!com.android.dazhihui.d.n.n(this.af.getCode()))) {
        break label762;
      }
      localObject1 = this.an;
    }
    for (;;)
    {
      i2 = 0;
      while (i2 < localObject1.length / 2)
      {
        localObject3 = new LinearLayout(localFragmentActivity);
        ((LinearLayout)localObject3).setOrientation(0);
        localLinearLayout.addView((View)localObject3, new LinearLayout.LayoutParams(-1, 0, 1.0F));
        TextView localTextView = new TextView(localFragmentActivity);
        localTextView.setTextColor(i1);
        localTextView.setTextSize(14.0F);
        localTextView.setText(localObject1[i2]);
        localTextView.setGravity(19);
        ((LinearLayout)localObject3).addView(localTextView, new LinearLayout.LayoutParams(-2, -1));
        localTextView = new TextView(localFragmentActivity);
        localTextView.setTextSize(14.0F);
        localTextView.setText(arrayOfString[i2]);
        localTextView.setTextColor(arrayOfInt[i2]);
        localTextView.setGravity(21);
        ((LinearLayout)localObject3).addView(localTextView, new LinearLayout.LayoutParams(-1, -1));
        i2 += 1;
      }
      i1 = -14540254;
      break;
      label762:
      if (com.android.dazhihui.d.n.g(i2)) {
        localObject1 = this.ao;
      } else {
        localObject1 = this.am;
      }
    }
    int i2 = localObject1.length / 2;
    while (i2 < localObject1.length)
    {
      localLinearLayout = new LinearLayout(localFragmentActivity);
      localLinearLayout.setOrientation(0);
      ((LinearLayout)localObject2).addView(localLinearLayout, new LinearLayout.LayoutParams(-1, 0, 1.0F));
      localObject3 = new TextView(localFragmentActivity);
      ((TextView)localObject3).setTextColor(i1);
      ((TextView)localObject3).setTextSize(14.0F);
      ((TextView)localObject3).setText(localObject1[i2]);
      ((TextView)localObject3).setGravity(19);
      localLinearLayout.addView((View)localObject3, new LinearLayout.LayoutParams(-2, -1));
      localObject3 = new TextView(localFragmentActivity);
      ((TextView)localObject3).setTextSize(14.0F);
      ((TextView)localObject3).setTextColor(arrayOfInt[i2]);
      ((TextView)localObject3).setText(arrayOfString[i2]);
      ((TextView)localObject3).setGravity(21);
      localLinearLayout.addView((View)localObject3, new LinearLayout.LayoutParams(-1, -1));
      i2 += 1;
    }
    localRelativeLayout.setOnClickListener(new vf(this));
  }
  
  private View a(MinuteTitleGridAdpter paramMinuteTitleGridAdpter)
  {
    View localView = LayoutInflater.from(getActivity()).inflate(2130903443, null);
    GridView localGridView = (GridView)localView.findViewById(2131560018);
    localGridView.setAdapter(paramMinuteTitleGridAdpter);
    localGridView.setNumColumns(1);
    localGridView.setOnItemClickListener(new vb(this));
    return localView;
  }
  
  private void a(Context paramContext)
  {
    Object localObject1 = getResources();
    int i2 = ((Resources)localObject1).getDimensionPixelSize(2131230780);
    int i3 = ((Resources)localObject1).getDimensionPixelSize(2131230798);
    int i4 = ((Resources)localObject1).getDimensionPixelSize(2131230774);
    int i5 = ((Resources)localObject1).getDimensionPixelSize(2131230820);
    int i6 = ((Resources)localObject1).getDimensionPixelSize(2131230773);
    this.as = new LinearLayout(paramContext);
    this.as.setOrientation(1);
    this.as.setGravity(17);
    localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    ((LinearLayout)localObject1).setGravity(17);
    ((LinearLayout)localObject1).setBackgroundResource(this.aE);
    int i1 = 0;
    if (i1 < 5)
    {
      localObject2 = new TextView(paramContext);
      ((TextView)localObject2).setTextColor(this.aH);
      ((TextView)localObject2).setGravity(17);
      ((TextView)localObject2).setText(this.at[i1]);
      ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(-2, i5));
      ((TextView)localObject2).setOnClickListener(this);
      if (i1 == 0) {
        ((TextView)localObject2).setTag(s.a);
      }
      for (;;)
      {
        if (i1 < 4)
        {
          localObject2 = new View(paramContext);
          ((View)localObject2).setBackgroundColor(this.aG);
          ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(-1, i6));
        }
        i1 += 1;
        break;
        if (i1 == 1) {
          ((TextView)localObject2).setTag(s.b);
        } else if (i1 == 2) {
          ((TextView)localObject2).setTag(s.c);
        } else if (i1 == 3) {
          ((TextView)localObject2).setTag(s.d);
        } else if (i1 == 4) {
          ((TextView)localObject2).setTag(s.e);
        }
      }
    }
    Object localObject2 = new LinearLayout.LayoutParams(-1, i5 * 5);
    this.as.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.au = (i5 * 5 + i4);
    paramContext = new ImageView(paramContext);
    paramContext.setImageResource(this.aF);
    localObject1 = new LinearLayout.LayoutParams(i2, i4);
    ((LinearLayout.LayoutParams)localObject1).topMargin = (-i3);
    this.as.addView(paramContext, (ViewGroup.LayoutParams)localObject1);
    this.as.requestLayout();
  }
  
  private void a(com.android.dazhihui.a.b.m paramm, byte[] paramArrayOfByte)
  {
    Object localObject1 = new q(paramArrayOfByte);
    int i2 = ((q)localObject1).b();
    int i4 = ((q)localObject1).e();
    this.ag = false;
    long[] arrayOfLong2;
    int[][] arrayOfInt;
    long[] arrayOfLong1;
    int i3;
    Object localObject2;
    boolean bool;
    if (i4 > 0)
    {
      paramArrayOfByte = this.af.getKData();
      arrayOfLong2 = this.af.getKVolData();
      arrayOfInt = this.af.getPrototypeKData();
      arrayOfLong1 = this.af.getPrototypeKVolData();
      i3 = this.ae.getKChartContainer().getKLinePeriodValue();
      paramm = (int[][])Array.newInstance(Integer.TYPE, new int[] { i4, 8 });
      localObject2 = new long[i4];
      i1 = 0;
      if (i1 < i4)
      {
        paramm[i1][0] = ((q)localObject1).h();
        if ((i1 == 0) && (paramArrayOfByte != null)) {
          if (paramm[i1][0] >= paramArrayOfByte[0][0]) {
            break label327;
          }
        }
        label327:
        for (bool = true;; bool = false)
        {
          this.ag = bool;
          if ((i1 == 0) && ((this.ag) || (paramArrayOfByte == null))) {
            this.af.setKIndexDay(paramm[i1][0]);
          }
          if ((paramArrayOfByte == null) && (i1 == i4 - 1)) {
            this.af.setKNowDay(paramm[i1][0]);
          }
          paramm[i1][1] = ((q)localObject1).h();
          paramm[i1][2] = ((q)localObject1).h();
          paramm[i1][3] = ((q)localObject1).h();
          paramm[i1][4] = ((q)localObject1).h();
          localObject2[i1] = com.android.dazhihui.d.b.b(((q)localObject1).h());
          paramm[i1][5] = ((int)(localObject2[i1] / 10000L));
          paramm[i1][6] = ((int)(com.android.dazhihui.d.b.b(((q)localObject1).h()) / 100L));
          if (i2 == 1) {
            paramm[i1][7] = ((q)localObject1).h();
          }
          i1 += 1;
          break;
        }
      }
      if (paramArrayOfByte != null) {
        break label507;
      }
      paramArrayOfByte = paramm;
      localObject1 = paramm;
      bool = true;
      paramm = (com.android.dazhihui.a.b.m)localObject2;
    }
    label454:
    label507:
    Object localObject3;
    for (;;)
    {
      this.af.setKData((int[][])localObject1);
      this.af.setKVolData((long[])localObject2);
      this.af.setPrototypeKData(paramArrayOfByte);
      this.af.setPrototypeKVolData(paramm);
      if ((i3 == 7) || (i3 == 8) || (i3 == 9)) {
        O();
      }
      this.ae.getKChartContainer().v();
      this.ae.getKChartContainer().d(bool);
      if (this.af.getKLineOffset() < 50)
      {
        if (this.af.getKLineOffset() <= 0) {
          break label956;
        }
        c(false);
      }
      if (this.ae.getKChartContainer().getKLinePeriodValue() == 7)
      {
        i1 = 0;
        paramm = this.af.getKDDX();
        if (paramm != null) {
          i1 = paramm.length;
        }
        if (i1 >= this.af.getKData().length) {
          break label964;
        }
        f(false);
      }
      return;
      if ((paramArrayOfByte == null) || (!this.ag)) {
        break;
      }
      i1 = paramArrayOfByte.length;
      localObject1 = new int[i1 + i4][];
      System.arraycopy(paramm, 0, localObject1, 0, i4);
      System.arraycopy(paramArrayOfByte, 0, localObject1, i4, i1);
      paramArrayOfByte = new long[i1 + i4];
      System.arraycopy(localObject2, 0, paramArrayOfByte, 0, i4);
      System.arraycopy(arrayOfLong2, 0, paramArrayOfByte, i4, i1);
      i1 = arrayOfInt.length;
      localObject3 = new int[i1 + i4][];
      System.arraycopy(paramm, 0, localObject3, 0, i4);
      System.arraycopy(arrayOfInt, 0, localObject3, i4, i1);
      paramm = new long[i1 + i4];
      System.arraycopy(localObject2, 0, paramm, 0, i4);
      System.arraycopy(arrayOfLong1, 0, paramm, i4, i1);
      i1 = Math.max(0, localObject1.length - this.ae.getKChartContainer().getKLineSize());
      i1 = Math.min(this.af.getKLineOffset() + i4, i1);
      this.ae.getKChartContainer().setKLineOffset(i1);
      localObject2 = paramArrayOfByte;
      paramArrayOfByte = (byte[])localObject3;
      bool = false;
    }
    int i5 = paramm[0][0];
    i2 = paramArrayOfByte.length;
    int i1 = paramArrayOfByte.length - 1;
    label722:
    if (i1 >= 0) {
      if (paramArrayOfByte[i1][0] != i5) {}
    }
    for (;;)
    {
      localObject1 = new int[i1 + i4][];
      System.arraycopy(paramArrayOfByte, 0, localObject1, 0, i1);
      System.arraycopy(paramm, 0, localObject1, i1, i4);
      localObject3 = new long[i1 + i4];
      System.arraycopy(arrayOfLong2, 0, localObject3, 0, i1);
      System.arraycopy(localObject2, 0, localObject3, i1, i4);
      paramArrayOfByte = new int[i1 + i4][];
      System.arraycopy(arrayOfInt, 0, paramArrayOfByte, 0, i1);
      System.arraycopy(paramm, 0, paramArrayOfByte, i1, i4);
      paramm = new long[i1 + i4];
      System.arraycopy(arrayOfLong1, 0, paramm, 0, i1);
      System.arraycopy(localObject2, 0, paramm, i1, i4);
      if ((localObject1.length > i2) && (this.ae.getKChartContainer().getKLineSize() + this.af.getKLineOffset() >= localObject1.length))
      {
        i1 = Math.max(0, localObject1.length - this.ae.getKChartContainer().getKLineSize());
        i1 = Math.min(this.af.getKLineOffset() + localObject1.length - i2, i1);
        this.ae.getKChartContainer().setKLineOffset(i1);
      }
      localObject2 = localObject3;
      bool = false;
      break;
      i1 -= 1;
      break label722;
      label956:
      c(true);
      break label454;
      label964:
      f(true);
      return;
      i1 = i2;
    }
  }
  
  private void a(String paramString, StockVo paramStockVo)
  {
    Bitmap localBitmap = c(paramStockVo.getCode());
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.equals("大智慧")) {
        str = " 大智慧  ";
      }
    }
    paramString = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    paramString.putExtra("android.intent.extra.shortcut.NAME", str);
    paramString.putExtra("duplicate", false);
    Intent localIntent = new Intent("com.dazhihui.android.ACTION_VIEW_STOCK");
    localIntent.putExtra("code", paramStockVo.getCode());
    localIntent.putExtra("name", paramStockVo.getName());
    localIntent.putExtra("type", paramStockVo.getType());
    localIntent.putExtra("BUNDLE_SHORT", 1);
    localIntent.putExtra("tName", str);
    localIntent.setClassName("com.android.dazhihui", "com.android.dazhihui.dzh.dzh");
    localIntent.setFlags(268435456);
    localIntent.addFlags(2097152);
    paramString.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
    paramString.putExtra("android.intent.extra.shortcut.ICON", localBitmap);
    getActivity().sendBroadcast(paramString);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject(new String(paramArrayOfByte, "UTF-8"));
        paramArrayOfByte = localJSONObject.getJSONObject("header");
        localJSONObject = localJSONObject.getJSONObject("data");
        af localaf = new af();
        localaf.a = paramArrayOfByte.getString("vs");
        localaf.b = localJSONObject.getString("time");
        localaf.c = localJSONObject.getString("title");
        localaf.d = localJSONObject.getString("urlPath");
        if ((!TextUtils.isEmpty(localaf.a)) && (com.android.dazhihui.g.a().b(this.af.getCode(), localaf.a)))
        {
          this.ae.getMinChartContainer().a(null, false);
          return;
        }
        this.ae.getMinChartContainer().a(localaf, true);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        this.ae.getMinChartContainer().a(null, false);
        return;
      }
    }
    this.ae.getMinChartContainer().a(null, false);
  }
  
  private void a(byte[] paramArrayOfByte, j paramj)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {
      e(paramArrayOfByte, ((com.android.dazhihui.a.b.o)paramj).i());
    }
  }
  
  private void a(byte[] paramArrayOfByte, av paramav)
  {
    int i2 = 0;
    int i1 = 0;
    paramArrayOfByte = new q(paramArrayOfByte);
    int i3;
    ArrayList localArrayList;
    Object localObject;
    if (paramArrayOfByte.b() == 2)
    {
      i3 = paramArrayOfByte.e();
      paramArrayOfByte.e();
      paramArrayOfByte.e();
      paramArrayOfByte.h();
      if (i3 != 1000) {
        break label180;
      }
      i2 = paramArrayOfByte.e();
      localArrayList = new ArrayList();
      while (i1 < i2)
      {
        localObject = this.af;
        localObject.getClass();
        localObject = new StockVo.Api3010((StockVo)localObject);
        ((StockVo.Api3010)localObject).price = paramArrayOfByte.h();
        ((StockVo.Api3010)localObject).delen = paramArrayOfByte.b();
        ((StockVo.Api3010)localObject).vol = paramArrayOfByte.h();
        ((StockVo.Api3010)localObject).bigVol = paramArrayOfByte.h();
        localArrayList.add(localObject);
        i1 += 1;
      }
      if (paramav != av.a) {
        break label164;
      }
      this.af.setApi3010_MinChart(localArrayList);
    }
    label164:
    label180:
    do
    {
      do
      {
        do
        {
          return;
        } while (paramav != av.b);
        this.af.setApi3010_KChart(localArrayList);
        return;
      } while (i3 != 1001);
      i3 = paramArrayOfByte.e();
      localArrayList = new ArrayList();
      i1 = i2;
      while (i1 < i3)
      {
        localObject = this.af;
        localObject.getClass();
        localObject = new StockVo.Api3010_Table((StockVo)localObject);
        ((StockVo.Api3010_Table)localObject).time = this.H;
        ((StockVo.Api3010_Table)localObject).delen = paramArrayOfByte.b();
        ((StockVo.Api3010_Table)localObject).profit_rate = paramArrayOfByte.b();
        ((StockVo.Api3010_Table)localObject).averageCost = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        ((StockVo.Api3010_Table)localObject).bigAverageCost = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        ((StockVo.Api3010_Table)localObject).senvenLowLimite = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        ((StockVo.Api3010_Table)localObject).senvenUpLimite = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        ((StockVo.Api3010_Table)localObject).nineLowLimite = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        ((StockVo.Api3010_Table)localObject).nineUpLimite = az.a(paramArrayOfByte.h(), ((StockVo.Api3010_Table)localObject).delen);
        localArrayList.add(localObject);
        i1 += 1;
      }
      if (paramav == av.a)
      {
        this.af.setApi3010_Table_MinChart(localArrayList);
        this.ae.getMinChartContainer().getStockCostView().a();
        return;
      }
    } while (paramav != av.b);
    this.af.setApi3010_Table_KChart(localArrayList);
    this.ae.getKChartContainer().getStockCostView().a();
  }
  
  private void a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Object localObject = new q(paramArrayOfByte);
    int i2 = ((q)localObject).e();
    paramArrayOfByte = new int[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      paramArrayOfByte[i1] = ((q)localObject).b();
      i1 += 1;
    }
    localObject = this.af.getHsZdNum();
    if (i2 > 0)
    {
      if (paramBoolean) {
        this.af.setHsZdNum(paramArrayOfByte);
      }
    }
    else {
      return;
    }
    if (localObject.length > this.af.getMinOffset()) {
      if (localObject.length <= this.af.getMinOffset() + i2) {
        break label124;
      }
    }
    label124:
    for (i1 = i2;; i1 = localObject.length - this.af.getMinOffset() - 1)
    {
      System.arraycopy(paramArrayOfByte, 0, localObject, this.af.getMinOffset(), i1);
      paramArrayOfByte = (byte[])localObject;
      break;
    }
  }
  
  public static boolean a(StockVo paramStockVo)
  {
    return (paramStockVo != null) && (com.android.dazhihui.d.n.f(paramStockVo.getType(), paramStockVo.getMarketType())) && ((paramStockVo.getmStockStatus() >>> 14 & 0x1) == 1);
  }
  
  private View b(MinuteTitleGridAdpter paramMinuteTitleGridAdpter)
  {
    if (this.mLookFace == y.a) {}
    for (View localView = LayoutInflater.from(getActivity()).inflate(2130903443, null);; localView = LayoutInflater.from(getActivity()).inflate(2130903444, null))
    {
      GridView localGridView = (GridView)localView.findViewById(2131560018);
      localGridView.setAdapter(paramMinuteTitleGridAdpter);
      localGridView.setNumColumns(1);
      localGridView.setOnItemClickListener(new vd(this));
      return localView;
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, av paramav)
  {
    this.ab = new com.android.dazhihui.a.b.m();
    x localx1 = new x(3010);
    localx1.b(2);
    x localx2 = new x(1000);
    localx2.a(this.af.getCode());
    localx2.d(paramInt1);
    localx2.c(paramInt2);
    localx1.a(localx2, paramInt3, 0);
    this.ab.a(paramav);
    this.ab.a(localx1);
    registRequestListener(this.ab);
    sendRequest(this.ab);
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    Object localObject = new q(paramArrayOfByte);
    paramArrayOfByte = ((q)localObject).h() + "";
    String str1 = ((q)localObject).h() + "";
    String str2 = az.a(((q)localObject).h(), this.af.getmDecimalLen());
    String str3 = az.a(((q)localObject).h(), this.af.getmDecimalLen());
    localObject = az.a(((q)localObject).h(), this.af.getmDecimalLen());
    this.af.set2997Data(new String[] { paramArrayOfByte, str1, str2, str3, localObject });
  }
  
  private void b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject = new q(paramArrayOfByte);
    int i2 = ((q)localObject).e();
    if (i2 == 0) {}
    paramArrayOfByte = new int[i2];
    while (i1 < paramArrayOfByte.length)
    {
      paramArrayOfByte[i1] = ((q)localObject).d();
      i1 += 1;
    }
    i1 = paramArrayOfByte.length;
    localObject = this.af.getMinDDX();
    if (i1 > 0)
    {
      if (paramBoolean) {}
      for (;;)
      {
        try
        {
          Arrays.fill((int[])localObject, 0);
          System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1);
          this.af.setMinDDX((int[])localObject);
          this.ae.getMinChartContainer().getIndexSwitchView().c();
          return;
        }
        catch (Exception paramArrayOfByte) {}
        System.arraycopy(paramArrayOfByte, 0, localObject, this.af.getMinOffset(), i1);
      }
    }
  }
  
  public static boolean b(StockVo paramStockVo)
  {
    return (paramStockVo != null) && (com.android.dazhihui.d.n.f(paramStockVo.getType(), paramStockVo.getMarketType())) && ((paramStockVo.getmStockStatus() >>> 11 & 0x1) == 1);
  }
  
  private Bitmap c(String paramString)
  {
    int i2 = getResources().getDimensionPixelSize(2131230874);
    BitmapDrawable localBitmapDrawable = (BitmapDrawable)getResources().getDrawable(2130838602);
    int i3 = localBitmapDrawable.getIntrinsicWidth();
    int i1 = localBitmapDrawable.getIntrinsicHeight();
    if (localBitmapDrawable.getOpacity() != -1) {}
    Canvas localCanvas;
    Paint localPaint;
    for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i3, i1, (Bitmap.Config)localObject);
      localCanvas = new Canvas((Bitmap)localObject);
      localBitmapDrawable.setBounds(0, 0, i3, i1);
      localBitmapDrawable.draw(localCanvas);
      localPaint = new Paint(1);
      localPaint.setTextAlign(Paint.Align.CENTER);
      localPaint.setTextSize(i2);
      localPaint.setColor(-1);
      for (i1 = com.android.dazhihui.d.a.b(paramString, i2); i1 > i3 - getResources().getDimensionPixelOffset(2131230823); i1 = com.android.dazhihui.d.a.b(paramString, i2)) {
        i2 -= 1;
      }
    }
    localPaint.setTextSize(i2);
    localCanvas.drawText(paramString, localBitmapDrawable.getIntrinsicWidth() / 2, localBitmapDrawable.getIntrinsicHeight() / 2, localPaint);
    return (Bitmap)localObject;
  }
  
  private void c(int paramInt1, int paramInt2, int paramInt3, av paramav)
  {
    this.H = paramInt2;
    this.ac = new com.android.dazhihui.a.b.m();
    x localx1 = new x(3010);
    localx1.b(2);
    x localx2 = new x(1001);
    localx2.a(this.af.getCode());
    localx2.d(paramInt1);
    localx2.c(paramInt2);
    localx1.a(localx2, paramInt3, 0);
    this.ac.a(localx1);
    this.ac.a(paramav);
    registRequestListener(this.ac);
    sendRequest(this.ac);
  }
  
  private void c(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    paramArrayOfByte.h();
    paramArrayOfByte.e();
    if (paramArrayOfByte.e() > 0)
    {
      paramArrayOfByte.l();
      paramArrayOfByte.l();
      int i1 = paramArrayOfByte.h();
      int i2 = paramArrayOfByte.b();
      int i3 = paramArrayOfByte.h();
      this.af.setApi2987ExecRightDay(i3);
      this.af.setApi2987ExecPrice(i1);
      this.af.setApi2987ExecDelen(i2);
    }
  }
  
  private void c(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject = new q(paramArrayOfByte);
    int i2 = ((q)localObject).e();
    if (i2 == 0) {}
    paramArrayOfByte = new int[i2];
    while (i1 < paramArrayOfByte.length)
    {
      paramArrayOfByte[i1] = ((q)localObject).g();
      i1 += 1;
    }
    i1 = paramArrayOfByte.length;
    localObject = this.af.getMinDealChaLiang();
    if (i1 > 0)
    {
      if (paramBoolean) {}
      for (;;)
      {
        try
        {
          Arrays.fill((int[])localObject, 0);
          System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1);
          this.af.setMinDealChaLiang((int[])localObject);
          this.ae.getMinChartContainer().getIndexSwitchView().d();
          return;
        }
        catch (ArrayIndexOutOfBoundsException paramArrayOfByte) {}
        System.arraycopy(paramArrayOfByte, 0, localObject, this.af.getMinOffset(), i1);
      }
    }
  }
  
  public static boolean c(StockVo paramStockVo)
  {
    boolean bool = true;
    int i1;
    if ((paramStockVo != null) && (com.android.dazhihui.w.a().l()))
    {
      i1 = paramStockVo.getMarketType();
      if (i1 != 1) {
        break label50;
      }
      if ((int)(com.android.dazhihui.w.a().c() >>> 7 & 1L) != 1) {
        break label70;
      }
    }
    while (paramStockVo.getType() == 0)
    {
      return false;
      label50:
      if (i1 == 0)
      {
        if ((int)(com.android.dazhihui.w.a().c() >>> 8 & 1L) == 1) {}
      }
      else {
        label70:
        while ((!com.android.dazhihui.d.n.f(paramStockVo.getType(), i1)) || ((int)(com.android.dazhihui.w.a().c() >>> 19 & 1L) != 1))
        {
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  private void d(View paramView)
  {
    if (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.af.getCode()))
    {
      o[0] = 2130838402;
      n[0] = "删自选";
      if (this.mLookFace != y.a) {
        break label165;
      }
      n[4] = "白色主题";
      label52:
      if (this.aq == null) {
        if (this.mLookFace != y.b) {
          break label176;
        }
      }
    }
    label165:
    label176:
    for (this.aq = LayoutInflater.from(getActivity()).inflate(2130903444, null);; this.aq = LayoutInflater.from(getActivity()).inflate(2130903443, null))
    {
      MinuteTitleGridAdpter localMinuteTitleGridAdpter = new MinuteTitleGridAdpter(getActivity(), null, o, n, this.mLookFace);
      GridView localGridView = (GridView)this.aq.findViewById(2131560018);
      localGridView.setAdapter(localMinuteTitleGridAdpter);
      localGridView.setNumColumns(1);
      localGridView.setOnItemClickListener(new va(this, paramView));
      return;
      o[0] = 2130838395;
      n[0] = "加自选";
      break;
      n[4] = "黑色主题";
      break label52;
    }
  }
  
  private void d(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    StockVo.Api2955_4416 localApi2955_4416 = this.af.getApi2955_4416Data();
    paramArrayOfByte.e();
    paramArrayOfByte.e();
    paramArrayOfByte.e();
    if (paramArrayOfByte.e() > 0) {}
    try
    {
      paramArrayOfByte.l();
      paramArrayOfByte.l();
      localApi2955_4416.decLen = paramArrayOfByte.b();
      localApi2955_4416.type = paramArrayOfByte.b();
      localApi2955_4416.cp = paramArrayOfByte.h();
      localApi2955_4416.kp = paramArrayOfByte.h();
      localApi2955_4416.lp = paramArrayOfByte.h();
      localApi2955_4416.up = paramArrayOfByte.h();
      localApi2955_4416.dp = paramArrayOfByte.h();
      localApi2955_4416.cje = paramArrayOfByte.h();
      localApi2955_4416.wb = paramArrayOfByte.d();
      localApi2955_4416.syl = paramArrayOfByte.h();
      localApi2955_4416.sjl = paramArrayOfByte.h();
      localApi2955_4416.zjlrDay = paramArrayOfByte.h();
      localApi2955_4416.zjlcDay = paramArrayOfByte.h();
      localApi2955_4416.zjlrDay5 = paramArrayOfByte.h();
      localApi2955_4416.zjlcDay5 = paramArrayOfByte.h();
      localApi2955_4416.zjcjeDay5 = paramArrayOfByte.h();
      localApi2955_4416.zjlrDay30 = paramArrayOfByte.h();
      localApi2955_4416.zjlcDay30 = paramArrayOfByte.h();
      localApi2955_4416.zjcjeDay30 = paramArrayOfByte.h();
      this.ae.getMinChartContainer().i();
      return;
    }
    catch (Exception paramArrayOfByte) {}
  }
  
  private void d(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i2 = 0;
    paramArrayOfByte = new q(paramArrayOfByte);
    int[][] arrayOfInt = (int[][])null;
    int i1 = paramArrayOfByte.e();
    if (i1 == 0) {}
    arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 2 });
    i1 = 0;
    while (i1 < arrayOfInt.length)
    {
      i3 = paramArrayOfByte.h();
      int i4 = paramArrayOfByte.h();
      arrayOfInt[i1][0] = i3;
      arrayOfInt[i1][1] = i4;
      i1 += 1;
    }
    int i3 = arrayOfInt.length;
    paramArrayOfByte = this.af.getMinBSVol();
    if (i3 > 0)
    {
      if (paramBoolean) {
        i1 = i2;
      }
      for (;;)
      {
        try
        {
          if (i1 < paramArrayOfByte.length)
          {
            paramArrayOfByte[i1][0] = 0;
            paramArrayOfByte[i1][1] = 1;
            i1 += 1;
            continue;
          }
          System.arraycopy(arrayOfInt, 0, paramArrayOfByte, 0, i3);
          this.af.setMinBSVol(paramArrayOfByte);
          this.ae.getMinChartContainer().getIndexSwitchView().e();
          return;
        }
        catch (ArrayIndexOutOfBoundsException paramArrayOfByte) {}
        System.arraycopy(arrayOfInt, 0, paramArrayOfByte, this.af.getMinOffset(), i3);
      }
    }
  }
  
  private void e(boolean paramBoolean)
  {
    vr localvr = az.a(this.af);
    this.ae.setStockVo(this.af);
    this.ae.a(localvr, paramBoolean);
    this.D.f();
  }
  
  private void e(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    StockVo.Api2994 localApi2994 = this.af.getApi2994Data();
    int i1 = paramArrayOfByte.b();
    localApi2994.fundType = i1;
    localApi2994.premiumPrice = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 3);
    localApi2994.montherFundRealTimeValue = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 4);
    localApi2994.upMontherFundRise = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 2);
    localApi2994.downMontherFundDown = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 2);
    if (i1 == 0) {
      localApi2994.hideProfit = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 3);
    }
    for (;;)
    {
      this.ae.getMinChartContainer().f();
      return;
      if (i1 == 1) {
        localApi2994.priceLeverage = com.android.dazhihui.d.b.a(paramArrayOfByte.h(), 3);
      }
    }
  }
  
  private void e(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i7 = 931;
    int i1;
    int[][] arrayOfInt;
    int i4;
    Object localObject2;
    int i8;
    int i3;
    int i2;
    int i14;
    int i13;
    int i6;
    int i12;
    label283:
    Object localObject1;
    for (;;)
    {
      try
      {
        q localq = new q(paramArrayOfByte);
        int i9 = localq.b();
        localq.b();
        localq.b();
        i1 = localq.e();
        if (((i1 == 0) || (i1 == 1)) && (this.af.getMinIndex() > i1))
        {
          this.af.cleanData();
          this.ae.getMinChartContainer().a();
          return;
        }
        this.af.setMinIndex(i1);
        i5 = localq.e();
        i1 = this.af.getMinTotalPoint();
        arrayOfInt = this.af.getMinData();
        i4 = this.af.getMinLength();
        paramArrayOfByte = this.af.getMinTradeVolum();
        localObject2 = this.af.getMinTime();
        i8 = this.af.getCp();
        i3 = this.af.getMinOffset();
        if (!paramBoolean) {
          break label1041;
        }
        int i10 = localq.b();
        int i11 = localq.e();
        i2 = 0;
        i1 = 0;
        if (i2 >= i11) {
          break label1081;
        }
        i14 = localq.e();
        i13 = localq.e();
        i6 = d(i14);
        i12 = d(i13);
        i14 = e(i14);
        i13 = e(i13);
        if (i6 > i12) {
          break label1053;
        }
        i6 = i13 - i14 + (i12 - i6) * 60;
        i6 /= i10;
        i2 += 1;
        i1 = i6 + i1;
        continue;
        if ((arrayOfInt != null) && (arrayOfInt.length == i2))
        {
          i5 = i1;
          i1 = i2;
          localObject1 = paramArrayOfByte;
          paramArrayOfByte = (byte[])localObject2;
          i2 = i5;
          label313:
          localObject2 = (int[][])null;
          if ((i2 != 0) || (i9 == 1))
          {
            localObject2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2, 5 });
            break label1119;
            label356:
            if (i5 >= localObject2.length) {
              break;
            }
            i6 = localq.h();
            localObject2[i5][0] = i6;
            localObject2[i5][1] = localq.h();
            localObject2[i5][3] = localq.h();
            localObject2[i5][2] = localq.h();
            paramArrayOfByte[i5] = i6;
            if (i9 != 1) {
              break label1129;
            }
            localObject2[i5][4] = localq.h();
            break label1129;
            label443:
            if (i5 != localObject2.length - 1) {
              break label1038;
            }
            i2 = i6;
            break label1148;
          }
        }
        else
        {
          arrayOfInt = new int[i2][];
          localObject1 = new int[i2];
          paramArrayOfByte = new int[i2];
          i5 = i2;
          i2 = i1;
          i1 = i5;
          continue;
        }
        localObject2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2, 4 });
      }
      catch (Exception paramArrayOfByte)
      {
        label518:
        paramArrayOfByte.printStackTrace();
        return;
      }
      localObject1[(i4 - 1 + i5)] = localObject2[i5][3];
    }
    int i5 = localObject2.length;
    if (i5 > 0)
    {
      if (i4 == 0)
      {
        System.arraycopy(localObject2, 0, arrayOfInt, 0, i5);
        i4 = i5;
        if (arrayOfInt[0][1] != 0) {
          break label1157;
        }
        arrayOfInt[0][1] = i8;
        break label1157;
      }
      for (;;)
      {
        label593:
        label641:
        label663:
        label712:
        try
        {
          if (i5 >= arrayOfInt.length - 1) {
            break label740;
          }
          localObject2 = arrayOfInt[i5];
          if (localObject2 == null)
          {
            i5 += 1;
            continue;
            i6 = localObject2[0][0];
            i3 = i4 - 1;
            break label1180;
            System.arraycopy(localObject2, 0, arrayOfInt, i3, i5);
            i4 = i5 + i3;
            break;
            i3 -= 1;
            break label1180;
          }
          paramArrayOfByte[i5] = arrayOfInt[i5][0];
          if (arrayOfInt[i5][1] != 0) {
            break label1200;
          }
          arrayOfInt[i5][1] = arrayOfInt[(i5 - 1)][1];
        }
        catch (Exception localException1) {}
        if (localObject1[i5] < localObject1[(i5 - 1)]) {
          localObject1[i5] = localObject1[(i5 - 1)];
        }
      }
      label740:
      label750:
      try
      {
        i5 = arrayOfInt.length - 1;
      }
      catch (Exception localException2) {}
      if (localObject1[i5] <= localObject1[(i5 + 1)]) {
        break label1259;
      }
      localObject1[(i5 + 1)] = localObject1[i5];
      break label1259;
      label778:
      i5 = arrayOfInt.length;
      i5 -= 1;
      label789:
      if (i5 > 0)
      {
        if (arrayOfInt[i5][1] != 0) {
          break label1340;
        }
        arrayOfInt[i5][1] = i8;
        break label1340;
      }
    }
    for (;;)
    {
      arrayOfInt[i5][3] = (localObject1[i5] - localObject1[(i5 - 1)]);
      i5 -= 1;
      break label789;
      arrayOfInt[0][3] = arrayOfInt[0][3];
      label855:
      this.af.setMinTotalPoint(i1);
      this.af.setMinData(arrayOfInt);
      this.af.setMinLength(i4);
      this.af.setMinTradeVolum((int[])localObject1);
      this.af.setMinTime(paramArrayOfByte);
      this.af.setMinOffset(i3);
      if ((d.a().d()) && (com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) && (!this.aX))
      {
        if (i2 != 1500) {
          break label1014;
        }
        a(0, 1459, 0, av.a);
      }
      for (;;)
      {
        m();
        this.ae.getMinChartContainer().getTreadPriceView().postInvalidate();
        this.ae.getMinChartContainer().getTradeVolumnView().postInvalidate();
        this.ae.getMinChartContainer().getIndexSwitchView().f();
        this.ai.postInvalidate();
        return;
        label1014:
        a(0, i2, 0, av.a);
      }
      label1038:
      label1041:
      label1053:
      label1081:
      label1119:
      label1129:
      label1148:
      label1157:
      label1180:
      do
      {
        i3 = i4;
        break label641;
        break label855;
        break label1148;
        i2 = i5;
        localObject1 = paramArrayOfByte;
        paramArrayOfByte = localException2;
        break label313;
        i6 = 60 - i14 + (23 - i6) * 60 + (i13 + i12 * 60);
        break;
        i2 = i1;
        if (i1 < 0) {
          i2 = 241;
        }
        i2 += 1;
        i1 = i5;
        if (i5 <= i2) {
          break label283;
        }
        i1 = i2;
        break label283;
        i5 = 0;
        i2 = i7;
        break label356;
        if (i4 != 0) {
          break label518;
        }
        localObject1[i5] = localException2[i5][3];
        break label443;
        i5 += 1;
        break label356;
        if (arrayOfInt[0][2] == 0) {
          arrayOfInt[0][2] = i8;
        }
        i5 = 1;
        break label593;
      } while (i3 < 0);
      if (arrayOfInt[i3][0] != i6) {
        break label663;
      }
      break label641;
      label1200:
      if (arrayOfInt[i5][2] == 0) {
        arrayOfInt[i5][2] = arrayOfInt[(i5 - 1)][2];
      }
      if (localObject1[i5] != 0) {
        break label712;
      }
      localObject1[i5] = localObject1[(i5 - 1)];
      break label712;
      while (i5 >= 0)
      {
        if (arrayOfInt[i5] != null) {
          break label1268;
        }
        label1259:
        i5 -= 1;
      }
      break label778;
      label1268:
      if (arrayOfInt[i5][1] == 0) {
        arrayOfInt[i5][1] = arrayOfInt[(i5 + 1)][1];
      }
      if (arrayOfInt[i5][2] == 0) {
        arrayOfInt[i5][2] = arrayOfInt[(i5 + 1)][2];
      }
      if (localObject1[i5] != 0) {
        break label750;
      }
      localObject1[i5] = localObject1[(i5 + 1)];
      break label750;
      label1340:
      if (arrayOfInt[i5][2] == 0) {
        arrayOfInt[i5][2] = i8;
      }
    }
  }
  
  private void f(boolean paramBoolean)
  {
    int i1 = 0;
    if (this.af == null) {
      return;
    }
    this.N = new com.android.dazhihui.a.b.m();
    this.N.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2918);
    localx.a(this.af.getCode());
    if (paramBoolean) {
      localx.d(0);
    }
    for (;;)
    {
      int[][] arrayOfInt1 = this.af.getKData();
      int[][] arrayOfInt2 = this.af.getKDDX();
      if (arrayOfInt2 != null) {
        i1 = arrayOfInt2.length;
      }
      if ((arrayOfInt1 != null) && (arrayOfInt1.length - i1 > 0)) {}
      localx.c(150);
      this.N.a(localx);
      registRequestListener(this.N);
      sendRequest(this.N);
      return;
      localx.d(this.af.getKDDXIndexDay());
    }
  }
  
  private void f(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    int i1 = paramArrayOfByte.h();
    if (paramArrayOfByte.e() != 1) {
      return;
    }
    paramArrayOfByte.e();
    if (!paramArrayOfByte.l().equals(this.af.getCode()))
    {
      J();
      return;
    }
    int i2;
    if (i1 == this.z[0])
    {
      i1 = paramArrayOfByte.h();
      i2 = paramArrayOfByte.h();
      this.af.setCp(i1);
      this.af.setZxj(i2);
      this.ae.a();
      this.ai.postInvalidate();
      this.ae.getmPriceView().postInvalidate();
    }
    for (;;)
    {
      this.aA.b();
      paramArrayOfByte = this.ae.getCurrentFragment();
      if ((paramArrayOfByte == null) || (!(paramArrayOfByte instanceof bs))) {
        break;
      }
      ((bs)paramArrayOfByte).f();
      return;
      if (i1 == this.z[1])
      {
        paramArrayOfByte.l();
        i2 = paramArrayOfByte.b();
        int i4 = paramArrayOfByte.b();
        int i3 = paramArrayOfByte.h();
        i1 = paramArrayOfByte.h();
        int i6 = paramArrayOfByte.h();
        if ((i2 != 7) && (i2 != 8) && (i2 != 17) && (i2 != 5)) {
          this.af.setCp(i3);
        }
        this.af.setmDecimalLen(i4);
        this.af.setZxj(i6);
        i4 = paramArrayOfByte.h();
        int i5 = paramArrayOfByte.h();
        int i7 = this.af.getNP2978();
        i2 = this.af.getCjl2978();
        Object localObject = new int[5];
        localObject[0] = i1;
        localObject[1] = i6;
        i1 = i2;
        if (i2 == 0) {
          i1 = this.af.getmVol();
        }
        localObject[2] = (i4 - i1);
        localObject[3] = az.e(i6, i3);
        if (i5 > i7) {
          localObject[4] = -11753174;
        }
        for (;;)
        {
          if (localObject[2] > 0)
          {
            List localList = this.af.getMinDealData();
            localList.add(localObject);
            if (localList.size() > 20) {
              localList.remove(0);
            }
          }
          localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { 10, 3 });
          i1 = 0;
          while (i1 < 5)
          {
            i2 = paramArrayOfByte.h();
            localObject[(4 - i1)][0] = i2;
            i2 = paramArrayOfByte.h();
            localObject[(i1 + 5)][0] = i2;
            localObject[(4 - i1)][1] = paramArrayOfByte.h();
            localObject[(i1 + 5)][1] = paramArrayOfByte.h();
            localObject[(4 - i1)][2] = az.e(localObject[(4 - i1)][0], i3);
            localObject[(i1 + 5)][2] = az.e(localObject[(i1 + 5)][0], i3);
            i1 += 1;
          }
          localObject[4] = -1099463;
        }
        this.af.setNP2978(i5);
        this.af.setCjl2978(i4);
        this.ae.a();
        this.af.setMinFiveRange((int[][])localObject);
        this.ae.getmPriceView().postInvalidate();
        if (!c(this.af)) {
          this.ae.getMinChartContainer().getDetailSwitchView().a(aj.a);
        }
        this.ae.getMinChartContainer().getDetailSwitchView().a(aj.b);
        this.ai.postInvalidate();
      }
    }
  }
  
  private void g(boolean paramBoolean)
  {
    int i1 = 0;
    if (this.af == null) {
      return;
    }
    this.O = new com.android.dazhihui.a.b.m();
    this.O.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2919);
    localx.a(this.af.getCode());
    if (paramBoolean)
    {
      localx.d(0);
      int[][] arrayOfInt1 = this.af.getKData();
      int[][] arrayOfInt2 = this.af.getKDDY();
      if (arrayOfInt2 != null) {
        i1 = arrayOfInt2.length;
      }
      if ((arrayOfInt1 == null) || (arrayOfInt1.length - i1 <= 0)) {
        break label150;
      }
      localx.c(arrayOfInt1.length - i1);
    }
    for (;;)
    {
      this.O.a(localx);
      registRequestListener(this.O);
      sendRequest(this.O);
      return;
      localx.d(this.af.getKDDYIndexDay());
      break;
      label150:
      localx.c(150);
    }
  }
  
  private void g(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    StockVo.Api2206 localApi2206 = this.af.getApi2206Data();
    localApi2206.riseNum = paramArrayOfByte.e();
    localApi2206.equalNum = paramArrayOfByte.e();
    localApi2206.downNum = paramArrayOfByte.e();
    localApi2206.avgPrice = paramArrayOfByte.h();
    localApi2206.weightAvgPrice = paramArrayOfByte.h();
    localApi2206.sumCirculationValue = paramArrayOfByte.h();
    localApi2206.sumValue = paramArrayOfByte.h();
    this.ae.a();
  }
  
  private void h(boolean paramBoolean)
  {
    int i1 = 0;
    if (this.af == null) {
      return;
    }
    this.P = new com.android.dazhihui.a.b.m();
    this.P.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2920);
    localx.a(this.af.getCode());
    if (paramBoolean)
    {
      localx.d(0);
      int[][] arrayOfInt1 = this.af.getKData();
      int[][] arrayOfInt2 = this.af.getKDDZ();
      if (arrayOfInt2 != null) {
        i1 = arrayOfInt2.length;
      }
      if ((arrayOfInt1 == null) || (arrayOfInt1.length - i1 <= 0)) {
        break label150;
      }
      localx.c(arrayOfInt1.length - i1);
    }
    for (;;)
    {
      this.P.a(localx);
      registRequestListener(this.P);
      sendRequest(this.P);
      return;
      localx.d(this.af.getKDDZIndexDay());
      break;
      label150:
      localx.c(150);
    }
  }
  
  private void h(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    int i2 = paramArrayOfByte.e();
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2, 3 });
    int i1 = 0;
    while (i1 < i2)
    {
      int i3 = paramArrayOfByte.h();
      arrayOfInt[i1][0] = i3;
      arrayOfInt[i1][1] = paramArrayOfByte.h();
      arrayOfInt[i1][2] = az.e(i3, this.af.getCp());
      i1 += 1;
    }
    this.af.setMinLevel2Range(arrayOfInt);
  }
  
  private void i(boolean paramBoolean)
  {
    int i1 = 0;
    if (this.af == null) {
      return;
    }
    this.Q = new com.android.dazhihui.a.b.m();
    this.Q.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2928);
    localx.a(this.af.getCode());
    if (paramBoolean)
    {
      localx.d(0);
      int[][] arrayOfInt1 = this.af.getKData();
      int[][] arrayOfInt2 = this.af.getKSupl();
      if (arrayOfInt2 != null) {
        i1 = arrayOfInt2.length;
      }
      if ((arrayOfInt1 == null) || (arrayOfInt1.length - i1 <= 0)) {
        break label150;
      }
      localx.c(arrayOfInt1.length - i1);
    }
    for (;;)
    {
      this.Q.a(localx);
      registRequestListener(this.Q);
      sendRequest(this.Q);
      return;
      localx.d(this.af.getKSuplIndexDay());
      break;
      label150:
      localx.c(150);
    }
  }
  
  private void i(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    StockVo.Api2917 localApi2917 = this.af.getApi2917Data();
    localApi2917.queueId = paramArrayOfByte.h();
    localApi2917.queueTypeDes = paramArrayOfByte.b();
    localApi2917.buydata = new String[2];
    localApi2917.selldata = new String[2];
    int i1 = 0;
    while (i1 < localApi2917.queueTypeDes)
    {
      int i2 = paramArrayOfByte.b();
      int i3 = paramArrayOfByte.h();
      int i4 = paramArrayOfByte.h();
      int[] arrayOfInt = paramArrayOfByte.j();
      if (i2 == 0)
      {
        localApi2917.buydata[0] = com.android.dazhihui.d.b.a(i3, 2);
        localApi2917.buydata[1] = String.valueOf(i4);
        if (arrayOfInt.length > 0)
        {
          localApi2917.buyList = new String[arrayOfInt.length];
          i2 = 0;
          while (i2 < arrayOfInt.length)
          {
            localApi2917.buyList[i2] = com.android.dazhihui.d.b.n(arrayOfInt[i2], 0);
            i2 += 1;
          }
        }
      }
      else
      {
        localApi2917.selldata[0] = com.android.dazhihui.d.b.a(i3, 2);
        localApi2917.selldata[1] = String.valueOf(i4);
        if (arrayOfInt.length > 0)
        {
          localApi2917.sellList = new String[arrayOfInt.length];
          i2 = 0;
          while (i2 < arrayOfInt.length)
          {
            localApi2917.sellList[i2] = com.android.dazhihui.d.b.n(arrayOfInt[i2], 0);
            i2 += 1;
          }
        }
      }
      i1 += 1;
    }
    this.ae.getMinChartContainer().e();
    this.ae.getMinChartContainer().getDetailSwitchView().a(aj.a);
    this.aZ.removeMessages(1);
    if (this.ay != vq.b) {
      this.aZ.sendEmptyMessageDelayed(1, 3000L);
    }
  }
  
  private void j(boolean paramBoolean)
  {
    if (getResources().getConfiguration().orientation == 1)
    {
      if (this.D != null)
      {
        w();
        this.D.a();
      }
      this.aD.setVisibility(0);
      this.ai.setVisibility(8);
      this.aj.setVisibility(8);
      this.ae.j.setVisibility(0);
    }
    for (;;)
    {
      e(paramBoolean);
      Q();
      return;
      if (this.D != null)
      {
        v();
        this.D.b();
      }
      this.ae.j.setVisibility(8);
      this.aL.setVisibility(8);
      this.aK.setVisibility(8);
      this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
      this.aK.c();
      this.aD.setVisibility(8);
      this.ai.setVisibility(0);
      this.ai.setHolder(this.ae);
      this.ak.setHolder(this.ae);
      this.al.setHolder(this.ae);
      this.aj.setVisibility(0);
    }
  }
  
  private void j(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    int i6 = paramArrayOfByte.e();
    int i7 = paramArrayOfByte.e();
    paramArrayOfByte.e();
    int i1 = paramArrayOfByte.e() - 1;
    if (i6 != 105) {}
    for (int i2 = 1;; i2 = 0)
    {
      Object localObject1;
      int i4;
      int i3;
      Object localObject2;
      int[] arrayOfInt;
      Object localObject3;
      String str1;
      int i8;
      int i9;
      int i10;
      int i11;
      if (i6 == 4095)
      {
        localObject1 = this.af.getPlate2955Data();
        ((List)localObject1).clear();
        i4 = 0;
        i3 = i1;
        i1 = i4;
        if (i3 >= 0)
        {
          localObject2 = new mh();
          arrayOfInt = new int[5];
          localObject3 = paramArrayOfByte.l();
          str1 = paramArrayOfByte.l();
          arrayOfInt[0] = 39936;
          i8 = paramArrayOfByte.b();
          i9 = paramArrayOfByte.b();
          i10 = paramArrayOfByte.h();
          paramArrayOfByte.h();
          i11 = paramArrayOfByte.h();
          paramArrayOfByte.h();
          paramArrayOfByte.h();
          paramArrayOfByte.h();
          if (i6 == 105) {
            paramArrayOfByte.e();
          }
          if ((i7 >>> 0 & 0x1) != 0)
          {
            paramArrayOfByte.e();
            paramArrayOfByte.h();
          }
          if ((i7 >>> 3 & 0x1) != 0) {
            paramArrayOfByte.e();
          }
          if ((i7 >>> 4 & 0x1) == 0) {
            break label866;
          }
          i1 = paramArrayOfByte.e();
        }
      }
      label541:
      label866:
      for (;;)
      {
        if ((i7 >>> 5 & 0x1) != 0) {
          paramArrayOfByte.d();
        }
        if ((i7 >>> 6 & 0x1) != 0) {
          paramArrayOfByte.d();
        }
        if ((i7 >>> 7 & 0x1) != 0) {}
        for (i4 = paramArrayOfByte.b();; i4 = 0)
        {
          if ((i7 >>> 8 & 0x1) != 0)
          {
            paramArrayOfByte.f();
            paramArrayOfByte.f();
          }
          int i5 = 0;
          if ((i7 >>> 11 & 0x1) != 0)
          {
            i5 = paramArrayOfByte.d();
            paramArrayOfByte.d();
            paramArrayOfByte.f();
            paramArrayOfByte.f();
            paramArrayOfByte.f();
            paramArrayOfByte.b();
            paramArrayOfByte.b();
          }
          boolean bool = false;
          if (i2 != 0) {
            if ((i7 >>> 15 & 0x1) != 0) {
              if ((paramArrayOfByte.b() & 0x1) != 1) {
                break label541;
              }
            }
          }
          for (bool = true;; bool = false)
          {
            ((mh)localObject2).h = bool;
            String str2 = com.android.dazhihui.d.b.d(i1);
            String str3 = com.android.dazhihui.d.b.a(i11, i8);
            arrayOfInt[1] = com.android.dazhihui.d.b.h(i11, i10);
            String str4 = com.android.dazhihui.d.b.c(i11, i10);
            arrayOfInt[2] = arrayOfInt[1];
            arrayOfInt[4] = 65280;
            String str5 = com.android.dazhihui.d.b.a(i5, 3);
            arrayOfInt[3] = -4144960;
            ((mh)localObject2).a = new String[] { str1, str3, str4, str5, str2 };
            ((mh)localObject2).b = arrayOfInt;
            ((mh)localObject2).d = com.android.dazhihui.d.n.e((String)localObject3);
            ((mh)localObject2).g = i9;
            if (i4 > 0) {
              ((mh)localObject2).i = true;
            }
            ((mh)localObject2).k = new Object[] { localObject3 };
            if (i6 == 107) {
              ((mh)localObject2).g = 0;
            }
            ((List)localObject1).add(localObject2);
            i3 -= 1;
            break;
          }
          this.af.setPlate2955Data((List)localObject1);
          this.ae.b(0);
          do
          {
            do
            {
              return;
              localObject1 = new Stock2955Vo();
              if (i1 >= 0)
              {
                localObject2 = new String[4];
                arrayOfInt = new int[4];
                ((Stock2955Vo)localObject1).decode(paramArrayOfByte, i6, i7);
                ((Stock2955Vo)localObject1).getData(new String[] { "最近1天", "净额", "占成交额%", "涨幅%" }, (String[])localObject2, arrayOfInt, 0);
                localObject3 = new mh();
                ((mh)localObject3).a = ((String[])localObject2);
                ((mh)localObject3).b = arrayOfInt;
                ((mh)localObject3).d = com.android.dazhihui.d.n.e(((Stock2955Vo)localObject1).code);
                ((mh)localObject3).g = ((Stock2955Vo)localObject1).type;
                if (((Stock2955Vo)localObject1).ggsm > 0) {
                  ((mh)localObject3).i = true;
                }
                if (i6 == 10) {
                  ((mh)localObject3).j = true;
                }
                ((mh)localObject3).h = ((Stock2955Vo)localObject1).isLoanable;
                ((mh)localObject3).k = new Object[] { ((Stock2955Vo)localObject1).code };
                if (i6 == 105) {
                  this.af.getPlate2955Data().add(localObject3);
                }
                for (;;)
                {
                  i1 -= 1;
                  break;
                  if ((i6 == 0) && (i7 == 37904)) {
                    this.af.getHsIndex2955Data().add(localObject3);
                  }
                }
              }
              if (i6 != 105) {
                break;
              }
            } while (this.af.getPlate2955Data().size() != 6);
            this.ae.b(1);
            return;
          } while ((i6 != 0) || (i7 != 37904) || (this.af.getHsIndex2955Data().size() != 6));
          this.ae.b(2);
          return;
        }
      }
    }
  }
  
  private void k(byte[] paramArrayOfByte)
  {
    q localq = new q(paramArrayOfByte);
    StockVo.Api2931 localApi2931 = this.af.getApi2976();
    localApi2931.buyMiddleRate = localq.e();
    localApi2931.buyBigRate = localq.e();
    localApi2931.buyBBigRate = localq.e();
    localApi2931.sellMiddleRate = localq.e();
    localApi2931.sellBigRate = localq.e();
    localApi2931.sellBBigRate = localq.e();
    localApi2931.buyNum4Large = localq.e();
    localApi2931.sellNum4Large = localq.e();
    localApi2931.OrgBuyNum = localq.e();
    localApi2931.OrgSellNum = localq.e();
    localq.e();
    Vector localVector = localApi2931.items;
    localVector.clear();
    int i2 = localq.e();
    int i1 = 0;
    if (i1 < i2)
    {
      StockVo.Api2931Item localApi2931Item = new StockVo.Api2931Item();
      localApi2931Item.type = localq.b();
      String str = String.valueOf(localq.e());
      paramArrayOfByte = "";
      if (str.length() == 4)
      {
        paramArrayOfByte = str.substring(0, 2) + ":" + str.substring(2, 4);
        label206:
        localApi2931Item.time = paramArrayOfByte;
        localApi2931Item.vol = String.valueOf(localq.h());
        if ((localApi2931Item.type == 2) || (localApi2931Item.type == 3)) {
          break label300;
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        if (str.length() != 3) {
          break label206;
        }
        paramArrayOfByte = str.substring(0, 1) + ":" + str.substring(1, 3);
        break label206;
        label300:
        localVector.add(localApi2931Item);
      }
    }
    this.af.setApi2976(localApi2931);
    this.ae.b();
  }
  
  private void l(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    StockVo.Api2930 localApi2930 = this.af.getApi2930();
    localApi2930.totalSell = paramArrayOfByte.h();
    localApi2930.sellAvgPrice = paramArrayOfByte.h();
    localApi2930.totalBuy = paramArrayOfByte.h();
    localApi2930.buyAvgPrice = paramArrayOfByte.h();
    localApi2930.ddx = paramArrayOfByte.d();
    localApi2930.orderNumCha = paramArrayOfByte.h();
    localApi2930.buyOrder4BBig = paramArrayOfByte.h();
    localApi2930.sellOrder4BBig = paramArrayOfByte.h();
    localApi2930.buyOrder4Big = paramArrayOfByte.h();
    localApi2930.sellOrder4Big = paramArrayOfByte.h();
    localApi2930.buyOrder4Middle = paramArrayOfByte.h();
    localApi2930.sellOrder4Middle = paramArrayOfByte.h();
    localApi2930.buyOrder4Small = paramArrayOfByte.h();
    localApi2930.sellOrder4Small = paramArrayOfByte.h();
    this.af.setApi2930(localApi2930);
    this.ae.b();
  }
  
  private void m(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    paramArrayOfByte = new q(paramArrayOfByte);
    int i5 = paramArrayOfByte.b();
    paramArrayOfByte.h();
    int i6 = paramArrayOfByte.e();
    List localList1 = this.af.getMinDealData();
    List localList2 = this.af.getOptionMinDealData();
    localList1.clear();
    localList2.clear();
    int i3 = 0;
    int i4 = 0;
    if (i3 < i6)
    {
      int[] arrayOfInt = new int[7];
      int i7 = paramArrayOfByte.h();
      int i8 = paramArrayOfByte.h();
      int i9 = i8 & 0x7FFFFFFF;
      int i10 = paramArrayOfByte.h();
      int i2 = 0;
      if (i5 == 1) {
        i2 = paramArrayOfByte.h();
      }
      int i1 = 1;
      int i11;
      if (Math.abs(i2 - i4) <= i10)
      {
        i1 = (i10 + i2 - i4) / 2;
        i11 = i10 - i1;
        if ((i1 == 0) && (i11 > 0)) {
          i1 = 6;
        }
      }
      else
      {
        label173:
        arrayOfInt[0] = i7;
        arrayOfInt[1] = i9;
        arrayOfInt[2] = i10;
        arrayOfInt[3] = az.e(i9, this.af.getCp());
        if (i8 >> 31 != 0) {
          break label361;
        }
        arrayOfInt[4] = -11753174;
      }
      for (;;)
      {
        if (i3 != 0) {
          arrayOfInt[5] = (i2 - i4);
        }
        arrayOfInt[6] = i1;
        localList1.add(arrayOfInt);
        localList2.add(arrayOfInt);
        i3 += 1;
        i4 = i2;
        break;
        if ((i1 > 0) && (i11 == 0))
        {
          i1 = 5;
          break label173;
        }
        if (i9 > 0)
        {
          if (i1 > i11)
          {
            i1 = 3;
            break label173;
          }
          if (i1 < i11)
          {
            i1 = 2;
            break label173;
          }
          i1 = 8;
          break label173;
        }
        if (i1 > i11)
        {
          i1 = 1;
          break label173;
        }
        if (i1 < i11)
        {
          i1 = 4;
          break label173;
        }
        i1 = 7;
        break label173;
        label361:
        arrayOfInt[4] = -1099463;
      }
    }
    this.ae.getMinChartContainer().getDetailSwitchView().a(aj.b);
    this.ae.getMinChartContainer().getmBottomView().a();
  }
  
  private void n(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    int i2 = paramArrayOfByte.h();
    int i3 = paramArrayOfByte.e();
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 3 });
    int i1 = 0;
    while (i1 < i3)
    {
      int i4 = paramArrayOfByte.h();
      arrayOfInt[i1][0] = i4;
      arrayOfInt[i1][1] = paramArrayOfByte.h();
      arrayOfInt[i1][2] = az.e(i4, i2);
      i1 += 1;
    }
    this.af.setMinFiveRange(arrayOfInt);
    if (!c(this.af)) {
      this.ae.getMinChartContainer().getDetailSwitchView().a(aj.a);
    }
  }
  
  private void o(byte[] paramArrayOfByte)
  {
    boolean bool2 = true;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length != 0) {
        break label111;
      }
      paramArrayOfByte = getActivity();
      localObject1 = paramArrayOfByte.getWindow().getDecorView();
      if ((!paramArrayOfByte.isFinishing()) && (localObject1 != null)) {
        break label37;
      }
    }
    label37:
    label111:
    do
    {
      return;
      SelfSelectedStockManager.getInstance().removeBrowseStock(this.af.getCode());
      new AlertDialog.Builder(paramArrayOfByte).setTitle(paramArrayOfByte.getString(2131166406)).setMessage(paramArrayOfByte.getString(2131166278)).setPositiveButton(2131165363, new uy(this, paramArrayOfByte)).setOnCancelListener(new ux(this)).create().show();
      return;
      localObject2 = new q(paramArrayOfByte);
      localObject1 = ((q)localObject2).l();
      paramArrayOfByte = ((q)localObject2).l();
    } while (!((String)localObject1).equals(this.af.getCode()));
    Object localObject1 = new int[8];
    localObject1[0] = ((q)localObject2).b();
    localObject1[1] = ((q)localObject2).b();
    localObject1[2] = ((q)localObject2).e();
    localObject1[3] = ((q)localObject2).h();
    localObject1[4] = ((q)localObject2).h();
    localObject1[5] = ((q)localObject2).h();
    localObject1[6] = ((q)localObject2).h();
    localObject1[7] = ((q)localObject2).h();
    this.af.setmData2939((int[])localObject1);
    this.af.mApiDoubleVol.cp = localObject1[3];
    this.af.mApiDoubleVol.captialVol = localObject1[6];
    int i1 = localObject1[1];
    this.af.setmDecimalLen(i1);
    int i2 = ((q)localObject2).b();
    ((q)localObject2).h();
    int i3 = ((q)localObject2).b();
    int i4 = ((q)localObject2).e();
    Object localObject2 = az.a(localObject1[4], i1);
    String str = com.android.dazhihui.d.b.a(localObject1[5], i1);
    this.af.setRiseLimit((String)localObject2);
    this.af.setDownLimit(str);
    this.af.setmStockStatus(i4);
    this.af.setStockExtendRank(i3);
    if (localObject1[0] != this.af.getType())
    {
      this.af.setType(localObject1[0]);
      if (c(this.af)) {
        K();
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (i2 == 1) {}
      for (;;)
      {
        this.af.setName(paramArrayOfByte);
        this.af.setLoanable(bool2);
        i2 = localObject1[3];
        if ((localObject1[0] != 7) && (localObject1[0] != 8) && (localObject1[0] != 17))
        {
          i1 = i2;
          if (localObject1[0] != 5) {}
        }
        else
        {
          i1 = i2;
          if (localObject1[7] != 0) {
            i1 = localObject1[7];
          }
        }
        e(bool1);
        this.ae.a();
        this.af.setCp(i1);
        this.aA.a(this.af.getName(), this.af.getCode());
        if (a(this.af))
        {
          this.aW.setVisibility(0);
          C();
        }
        E();
        return;
        bool2 = false;
      }
    }
  }
  
  private void p(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    paramArrayOfByte = new q(paramArrayOfByte);
    int i1 = paramArrayOfByte.b();
    this.af.setCCTag(i1);
    this.af.setZxj(paramArrayOfByte.h());
    this.af.setmOp(paramArrayOfByte.h());
    this.af.setmUp(paramArrayOfByte.h());
    this.af.setmDp(paramArrayOfByte.h());
    int i2 = paramArrayOfByte.h();
    this.af.setmVol(i2);
    int i3 = paramArrayOfByte.h();
    this.af.setmTotalAmount(i3);
    az.a(i3);
    this.af.setmNpVol(paramArrayOfByte.h());
    this.af.setmXsVol(paramArrayOfByte.h());
    int i4 = paramArrayOfByte.h();
    this.af.setmJj(i4);
    this.af.mApiDoubleVol.perPrice = i4;
    this.af.mApiDoubleVol.sumVol = i2;
    if (i3 <= 0) {}
    int[] arrayOfInt;
    for (this.af.mApiDoubleVol.perVol = 0L;; this.af.mApiDoubleVol.perVol = (i2 / i3))
    {
      if (i1 == 1)
      {
        this.af.setmJs(paramArrayOfByte.h());
        this.af.setmCc(paramArrayOfByte.h());
        this.af.setmZc(paramArrayOfByte.h());
      }
      this.af.setmLb(paramArrayOfByte.e());
      i2 = paramArrayOfByte.e();
      arrayOfInt = new int[i2 * 2];
      i1 = 0;
      while (i1 < i2)
      {
        arrayOfInt[(i1 * 2)] = paramArrayOfByte.h();
        arrayOfInt[(i1 * 2 + 1)] = paramArrayOfByte.h();
        i1 += 1;
      }
    }
    this.af.set2940DealsData(arrayOfInt);
    i1 = this.af.getMarketType();
    if ((this.af.getType() != 0) && (i1 != 1) && (i1 != 0) && (i1 != 11) && (i1 != 12) && (i1 == 13)) {}
    this.af.resetDetailData(this.af.getType());
    this.ae.a();
    this.ae.getMinChartContainer().j();
    this.ae.getmDetailView().postInvalidate();
    this.ae.getmPriceView().postInvalidate();
    this.aA.b();
    paramArrayOfByte = this.ae.getCurrentFragment();
    if ((paramArrayOfByte != null) && ((paramArrayOfByte instanceof bs))) {
      ((bs)paramArrayOfByte).f();
    }
    this.ae.getMinChartContainer().getDetailSwitchView().a(aj.c);
  }
  
  private void q(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    Object localObject;
    int i5;
    int i2;
    label117:
    int[][] arrayOfInt1;
    int[][] arrayOfInt2;
    do
    {
      do
      {
        return;
        localObject = new q(paramArrayOfByte);
        i5 = ((q)localObject).e();
      } while (i5 <= 0);
      paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5, 2 });
      i1 = 0;
      if (i1 < i5)
      {
        paramArrayOfByte[i1][0] = ((q)localObject).h();
        if (i1 == 0)
        {
          i2 = this.af.getKDDXIndexDay();
          if (i2 != 0) {
            break label117;
          }
          this.af.setKDDXIndexDay(paramArrayOfByte[0][0]);
        }
        for (;;)
        {
          paramArrayOfByte[i1][1] = ((q)localObject).d();
          i1 += 1;
          break;
          if (i2 > paramArrayOfByte[0][0]) {
            this.af.setKDDXIndexDay(paramArrayOfByte[0][0]);
          }
        }
      }
      arrayOfInt1 = this.af.getKDDX();
      arrayOfInt2 = this.af.getKData();
    } while (arrayOfInt2 == null);
    int i7 = 0;
    int i6 = 0;
    int i1 = 0;
    if (i1 < arrayOfInt2.length)
    {
      if (i7 == 0) {
        break label450;
      }
      if (i1 - i6 != paramArrayOfByte.length) {}
    }
    else
    {
      this.af.setKDDXIndexDay(paramArrayOfByte[0][0]);
      if (arrayOfInt1 != null) {
        break label630;
      }
    }
    for (;;)
    {
      this.af.setKDDX(paramArrayOfByte);
      this.ae.getKChartContainer().a(com.android.dazhihui.ui.widget.stockchart.n.a);
      if (paramArrayOfByte.length < arrayOfInt2.length)
      {
        this.ae.getKChartContainer().getDDEModel();
        if (this.ae.getKChartContainer().getKLinePeriodValue() == 7) {
          f(false);
        }
      }
      this.ae.getKChartContainer().w();
      return;
      i2 = i7;
      int i3 = i6;
      localObject = paramArrayOfByte;
      int i4 = i5;
      if (arrayOfInt2[i1][0] < paramArrayOfByte[(i1 - i6)][0])
      {
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 + 1, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1 - i6);
        localObject[(i1 - i6)][0] = arrayOfInt2[i1][0];
        localObject[(i1 - i6)][1] = localObject[(i1 - i6 - 1)][1];
        System.arraycopy(paramArrayOfByte, i1 - i6, localObject, i1 - i6 + 1, i5 - (i1 - i6));
        i4 = i5 + 1;
        i3 = i6;
        i2 = i7;
      }
      label450:
      label481:
      do
      {
        do
        {
          for (;;)
          {
            i1 += 1;
            i7 = i2;
            i6 = i3;
            paramArrayOfByte = (byte[])localObject;
            i5 = i4;
            break;
            if (arrayOfInt2[i1][0] != paramArrayOfByte[0][0]) {
              break label481;
            }
            i2 = 1;
            i3 = i1;
            localObject = paramArrayOfByte;
            i4 = i5;
          }
          i2 = i7;
          i3 = i6;
          localObject = paramArrayOfByte;
          i4 = i5;
        } while (i1 != 0);
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
      } while (arrayOfInt2[0][0] <= paramArrayOfByte[0][0]);
      int i8 = 0;
      for (;;)
      {
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
        if (i8 >= paramArrayOfByte.length) {
          break;
        }
        if (arrayOfInt2[0][0] <= paramArrayOfByte[i8][0])
        {
          localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 - i8, 2 });
          System.arraycopy(paramArrayOfByte, i8, localObject, 0, i5 - i8);
          i4 = i5 - i8;
          i2 = 1;
          i3 = 0;
          break;
        }
        i8 += 1;
      }
      label630:
      if (paramArrayOfByte[0][0] < arrayOfInt1[0][0])
      {
        i1 = paramArrayOfByte.length;
        i2 = arrayOfInt1.length;
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1 + i2, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramArrayOfByte.length);
        System.arraycopy(arrayOfInt1, 0, localObject, paramArrayOfByte.length, arrayOfInt1.length);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= arrayOfInt1.length) {
            break label774;
          }
          if (paramArrayOfByte[0][0] == arrayOfInt1[i1][0])
          {
            if (arrayOfInt1.length > paramArrayOfByte.length + i1) {}
            for (i2 = paramArrayOfByte.length;; i2 = arrayOfInt1.length - i1 - 1)
            {
              System.arraycopy(paramArrayOfByte, 0, arrayOfInt1, i1, i2);
              paramArrayOfByte = arrayOfInt1;
              break;
            }
          }
          i1 += 1;
        }
        label774:
        paramArrayOfByte = arrayOfInt1;
      }
    }
  }
  
  private void r(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    Object localObject;
    int i5;
    int i2;
    label117:
    int[][] arrayOfInt1;
    int[][] arrayOfInt2;
    do
    {
      do
      {
        return;
        localObject = new q(paramArrayOfByte);
        i5 = ((q)localObject).e();
      } while (i5 <= 0);
      paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5, 2 });
      i1 = 0;
      if (i1 < i5)
      {
        paramArrayOfByte[i1][0] = ((q)localObject).h();
        if (i1 == 0)
        {
          i2 = this.af.getKDDYIndexDay();
          if (i2 != 0) {
            break label117;
          }
          this.af.setKDDYIndexDay(paramArrayOfByte[0][0]);
        }
        for (;;)
        {
          paramArrayOfByte[i1][1] = ((q)localObject).d();
          i1 += 1;
          break;
          if (i2 > paramArrayOfByte[0][0]) {
            this.af.setKDDYIndexDay(paramArrayOfByte[0][0]);
          }
        }
      }
      arrayOfInt1 = this.af.getKDDY();
      arrayOfInt2 = this.af.getKData();
    } while (arrayOfInt2 == null);
    int i7 = 0;
    int i6 = 0;
    int i1 = 0;
    if (i1 < arrayOfInt2.length)
    {
      if (i7 == 0) {
        break label435;
      }
      if (i1 - i6 != paramArrayOfByte.length) {}
    }
    else
    {
      if (arrayOfInt1 != null) {
        break label615;
      }
    }
    for (;;)
    {
      this.af.setKDDY(paramArrayOfByte);
      this.ae.getKChartContainer().a(com.android.dazhihui.ui.widget.stockchart.n.b);
      if (paramArrayOfByte.length >= arrayOfInt2.length) {
        break;
      }
      paramArrayOfByte = this.ae.getKChartContainer().getDDEModel();
      if ((this.ae.getKChartContainer().getKLinePeriodValue() != 7) || (paramArrayOfByte != com.android.dazhihui.ui.widget.stockchart.n.b)) {
        break;
      }
      g(false);
      return;
      i2 = i7;
      int i3 = i6;
      localObject = paramArrayOfByte;
      int i4 = i5;
      if (arrayOfInt2[i1][0] < paramArrayOfByte[(i1 - i6)][0])
      {
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 + 1, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1 - i6);
        localObject[(i1 - i6)][0] = arrayOfInt2[i1][0];
        localObject[(i1 - i6)][1] = localObject[(i1 - i6 - 1)][1];
        System.arraycopy(paramArrayOfByte, i1 - i6, localObject, i1 - i6 + 1, i5 - (i1 - i6));
        i4 = i5 + 1;
        i3 = i6;
        i2 = i7;
      }
      label435:
      label466:
      do
      {
        do
        {
          for (;;)
          {
            i1 += 1;
            i7 = i2;
            i6 = i3;
            paramArrayOfByte = (byte[])localObject;
            i5 = i4;
            break;
            if (arrayOfInt2[i1][0] != paramArrayOfByte[0][0]) {
              break label466;
            }
            i2 = 1;
            i3 = i1;
            localObject = paramArrayOfByte;
            i4 = i5;
          }
          i2 = i7;
          i3 = i6;
          localObject = paramArrayOfByte;
          i4 = i5;
        } while (i1 != 0);
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
      } while (arrayOfInt2[0][0] <= paramArrayOfByte[0][0]);
      int i8 = 0;
      for (;;)
      {
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
        if (i8 >= paramArrayOfByte.length) {
          break;
        }
        if (arrayOfInt2[0][0] <= paramArrayOfByte[i8][0])
        {
          localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 - i8, 2 });
          System.arraycopy(paramArrayOfByte, i8, localObject, 0, i5 - i8);
          i4 = i5 - i8;
          i2 = 1;
          i3 = 0;
          break;
        }
        i8 += 1;
      }
      label615:
      if (paramArrayOfByte[0][0] < arrayOfInt1[0][0])
      {
        i1 = paramArrayOfByte.length;
        i2 = arrayOfInt1.length;
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1 + i2, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramArrayOfByte.length);
        System.arraycopy(arrayOfInt1, 0, localObject, paramArrayOfByte.length, arrayOfInt1.length);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= arrayOfInt1.length) {
            break label759;
          }
          if (paramArrayOfByte[0][0] == arrayOfInt1[i1][0])
          {
            if (arrayOfInt1.length > paramArrayOfByte.length + i1) {}
            for (i2 = paramArrayOfByte.length;; i2 = arrayOfInt1.length - i1 - 1)
            {
              System.arraycopy(paramArrayOfByte, 0, arrayOfInt1, i1, i2);
              paramArrayOfByte = arrayOfInt1;
              break;
            }
          }
          i1 += 1;
        }
        label759:
        paramArrayOfByte = arrayOfInt1;
      }
    }
  }
  
  private void s(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    Object localObject;
    int i5;
    int i2;
    label127:
    int[][] arrayOfInt1;
    int[][] arrayOfInt2;
    do
    {
      do
      {
        return;
        localObject = new q(paramArrayOfByte);
        i5 = ((q)localObject).e();
      } while (i5 <= 0);
      paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5, 3 });
      i1 = 0;
      if (i1 < i5)
      {
        paramArrayOfByte[i1][0] = ((q)localObject).h();
        if (i1 == 0)
        {
          i2 = this.af.getKDDZIndexDay();
          if (i2 != 0) {
            break label127;
          }
          this.af.setKDDZIndexDay(paramArrayOfByte[0][0]);
        }
        for (;;)
        {
          paramArrayOfByte[i1][1] = ((q)localObject).g();
          paramArrayOfByte[i1][2] = ((q)localObject).b();
          i1 += 1;
          break;
          if (i2 > paramArrayOfByte[0][0]) {
            this.af.setKDDZIndexDay(paramArrayOfByte[0][0]);
          }
        }
      }
      arrayOfInt1 = this.af.getKDDZ();
      arrayOfInt2 = this.af.getKData();
    } while (arrayOfInt2 == null);
    int i6 = 0;
    int i7 = 0;
    int i1 = 0;
    if (i1 < arrayOfInt2.length)
    {
      if (i7 == 0) {
        break label465;
      }
      if (i1 - i6 != paramArrayOfByte.length) {}
    }
    else
    {
      if (arrayOfInt1 != null) {
        break label645;
      }
    }
    for (;;)
    {
      this.af.setKDDZ(paramArrayOfByte);
      this.ae.getKChartContainer().a(com.android.dazhihui.ui.widget.stockchart.n.c);
      if (paramArrayOfByte.length >= arrayOfInt2.length) {
        break;
      }
      paramArrayOfByte = this.ae.getKChartContainer().getDDEModel();
      if ((this.ae.getKChartContainer().getKLinePeriodValue() != 7) || (paramArrayOfByte != com.android.dazhihui.ui.widget.stockchart.n.c)) {
        break;
      }
      h(false);
      return;
      i2 = i7;
      int i3 = i6;
      localObject = paramArrayOfByte;
      int i4 = i5;
      if (arrayOfInt2[i1][0] < paramArrayOfByte[(i1 - i6)][0])
      {
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 + 1, 3 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1 - i6);
        localObject[(i1 - i6)][0] = arrayOfInt2[i1][0];
        localObject[(i1 - i6)][1] = localObject[(i1 - i6 - 1)][1];
        localObject[(i1 - i6)][2] = localObject[(i1 - i6 - 1)][2];
        System.arraycopy(paramArrayOfByte, i1 - i6, localObject, i1 - i6 + 1, i5 - (i1 - i6));
        i4 = i5 + 1;
        i3 = i6;
        i2 = i7;
      }
      label465:
      label496:
      do
      {
        do
        {
          for (;;)
          {
            i1 += 1;
            i7 = i2;
            i6 = i3;
            paramArrayOfByte = (byte[])localObject;
            i5 = i4;
            break;
            if (arrayOfInt2[i1][0] != paramArrayOfByte[0][0]) {
              break label496;
            }
            i2 = 1;
            i3 = i1;
            localObject = paramArrayOfByte;
            i4 = i5;
          }
          i2 = i7;
          i3 = i6;
          localObject = paramArrayOfByte;
          i4 = i5;
        } while (i1 != 0);
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
      } while (arrayOfInt2[0][0] <= paramArrayOfByte[0][0]);
      int i8 = 0;
      for (;;)
      {
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
        if (i8 >= paramArrayOfByte.length) {
          break;
        }
        if (arrayOfInt2[0][0] <= paramArrayOfByte[i8][0])
        {
          localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 - i8, 3 });
          System.arraycopy(paramArrayOfByte, i8, localObject, 0, i5 - i8);
          i4 = i5 - i8;
          i3 = 0;
          i2 = 1;
          break;
        }
        i8 += 1;
      }
      label645:
      if (paramArrayOfByte[0][0] < arrayOfInt1[0][0])
      {
        i1 = paramArrayOfByte.length;
        i2 = arrayOfInt1.length;
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1 + i2, 3 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramArrayOfByte.length);
        System.arraycopy(arrayOfInt1, 0, localObject, paramArrayOfByte.length, arrayOfInt1.length);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= arrayOfInt1.length) {
            break label789;
          }
          if (paramArrayOfByte[0][0] == arrayOfInt1[i1][0])
          {
            if (arrayOfInt1.length > paramArrayOfByte.length + i1) {}
            for (i2 = paramArrayOfByte.length;; i2 = arrayOfInt1.length - i1 - 1)
            {
              System.arraycopy(paramArrayOfByte, 0, arrayOfInt1, i1, i2);
              paramArrayOfByte = arrayOfInt1;
              break;
            }
          }
          i1 += 1;
        }
        label789:
        paramArrayOfByte = arrayOfInt1;
      }
    }
  }
  
  private void t(byte[] paramArrayOfByte)
  {
    int[][] arrayOfInt2 = this.af.getKData();
    if (arrayOfInt2 == null) {}
    Object localObject;
    int i5;
    do
    {
      return;
      localObject = new q(paramArrayOfByte);
      i5 = ((q)localObject).e();
    } while (i5 <= 0);
    paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5, 2 });
    int i1 = 0;
    int i2;
    if (i1 < i5)
    {
      paramArrayOfByte[i1][0] = ((q)localObject).h();
      if (i1 == 0)
      {
        i2 = this.af.getKSuplIndexDay();
        if (i2 != 0) {
          break label127;
        }
        this.af.setKSuplIndexDay(paramArrayOfByte[0][0]);
      }
      for (;;)
      {
        paramArrayOfByte[i1][1] = ((q)localObject).d();
        i1 += 1;
        break;
        label127:
        if (i2 > paramArrayOfByte[0][0]) {
          this.af.setKSuplIndexDay(paramArrayOfByte[0][0]);
        }
      }
    }
    int[][] arrayOfInt1 = this.af.getKSupl();
    int i7 = 0;
    int i6 = 0;
    i1 = 0;
    if (i1 < arrayOfInt2.length)
    {
      if (i7 == 0) {
        break label431;
      }
      if (i1 - i6 != paramArrayOfByte.length) {}
    }
    else
    {
      if (arrayOfInt1 != null) {
        break label611;
      }
    }
    for (;;)
    {
      this.af.setKSupl(paramArrayOfByte);
      this.ae.getKChartContainer().a(com.android.dazhihui.ui.widget.stockchart.n.d);
      if (paramArrayOfByte.length >= arrayOfInt2.length) {
        break;
      }
      paramArrayOfByte = this.ae.getKChartContainer().getDDEModel();
      if ((this.ae.getKChartContainer().getKLinePeriodValue() != 7) || (paramArrayOfByte != com.android.dazhihui.ui.widget.stockchart.n.d)) {
        break;
      }
      i(false);
      return;
      i2 = i7;
      int i3 = i6;
      localObject = paramArrayOfByte;
      int i4 = i5;
      if (arrayOfInt2[i1][0] < paramArrayOfByte[(i1 - i6)][0])
      {
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 + 1, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, i1 - i6);
        localObject[(i1 - i6)][0] = arrayOfInt2[i1][0];
        localObject[(i1 - i6)][1] = localObject[(i1 - i6 - 1)][1];
        System.arraycopy(paramArrayOfByte, i1 - i6, localObject, i1 - i6 + 1, i5 - (i1 - i6));
        i4 = i5 + 1;
        i3 = i6;
        i2 = i7;
      }
      label431:
      label462:
      do
      {
        do
        {
          for (;;)
          {
            i1 += 1;
            i7 = i2;
            i6 = i3;
            paramArrayOfByte = (byte[])localObject;
            i5 = i4;
            break;
            if (arrayOfInt2[i1][0] != paramArrayOfByte[0][0]) {
              break label462;
            }
            i2 = 1;
            i3 = i1;
            localObject = paramArrayOfByte;
            i4 = i5;
          }
          i2 = i7;
          i3 = i6;
          localObject = paramArrayOfByte;
          i4 = i5;
        } while (i1 != 0);
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
      } while (arrayOfInt2[0][0] <= paramArrayOfByte[0][0]);
      int i8 = 0;
      for (;;)
      {
        i2 = i7;
        i3 = i6;
        localObject = paramArrayOfByte;
        i4 = i5;
        if (i8 >= paramArrayOfByte.length) {
          break;
        }
        if (arrayOfInt2[0][0] <= paramArrayOfByte[i8][0])
        {
          localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5 - i8, 2 });
          System.arraycopy(paramArrayOfByte, i8, localObject, 0, i5 - i8);
          i4 = i5 - i8;
          i2 = 1;
          i3 = 0;
          break;
        }
        i8 += 1;
      }
      label611:
      if (paramArrayOfByte[0][0] < arrayOfInt1[0][0])
      {
        i1 = paramArrayOfByte.length;
        i2 = arrayOfInt1.length;
        localObject = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1 + i2, 2 });
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramArrayOfByte.length);
        System.arraycopy(arrayOfInt1, 0, localObject, paramArrayOfByte.length, arrayOfInt1.length);
        paramArrayOfByte = (byte[])localObject;
      }
      else
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= arrayOfInt1.length) {
            break label755;
          }
          if (paramArrayOfByte[0][0] == arrayOfInt1[i1][0])
          {
            if (arrayOfInt1.length > paramArrayOfByte.length + i1) {}
            for (i2 = paramArrayOfByte.length;; i2 = arrayOfInt1.length - i1 - 1)
            {
              System.arraycopy(paramArrayOfByte, 0, arrayOfInt1, i1, i2);
              paramArrayOfByte = arrayOfInt1;
              break;
            }
          }
          i1 += 1;
        }
        label755:
        paramArrayOfByte = arrayOfInt1;
      }
    }
  }
  
  private void u(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    int i2 = paramArrayOfByte.e();
    int[] arrayOfInt1 = new int[i2];
    int[] arrayOfInt2 = new int[i2];
    int[] arrayOfInt3 = new int[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      arrayOfInt1[i1] = paramArrayOfByte.h();
      arrayOfInt2[i1] = paramArrayOfByte.f();
      arrayOfInt3[i1] = paramArrayOfByte.f();
      i1 += 1;
    }
    this.af.setExRightsTime(arrayOfInt1);
    this.af.setExRightsMulti(arrayOfInt2);
    this.af.setExRightsAdd(arrayOfInt3);
    if (this.af.needExRight())
    {
      O();
      this.ae.getKChartContainer().v();
      this.ae.getKChartContainer().d(false);
      this.af.setNeedExRight(false);
    }
  }
  
  private void v(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    Object localObject2 = new q(paramArrayOfByte);
    int i3 = ((q)localObject2).e();
    paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 3 });
    Object localObject1 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 5 });
    int i1 = 0;
    int i2;
    if (i1 < i3)
    {
      int i4 = ((q)localObject2).b();
      byte b1 = paramArrayOfByte[i1];
      if ((i4 & 0x1) != 0)
      {
        i2 = 1;
        label96:
        b1[0] = i2;
        b1 = paramArrayOfByte[i1];
        if ((i4 & 0x2) == 0) {
          break label211;
        }
        i2 = 1;
        label118:
        b1[1] = i2;
        b1 = paramArrayOfByte[i1];
        if ((i4 & 0x4) == 0) {
          break label217;
        }
      }
      label211:
      label217:
      for (i2 = 1;; i2 = 0)
      {
        b1[2] = i2;
        localObject1[i1][0] = ((q)localObject2).h();
        localObject1[i1][1] = ((q)localObject2).h();
        localObject1[i1][2] = ((q)localObject2).h();
        localObject1[i1][3] = ((q)localObject2).h();
        localObject1[i1][4] = ((q)localObject2).d();
        i1 += 1;
        break;
        i2 = 0;
        break label96;
        i2 = 0;
        break label118;
      }
    }
    int[][] arrayOfInt1 = this.af.getBsTag();
    int[][] arrayOfInt2 = this.af.getBs();
    if (arrayOfInt1 == null) {}
    for (;;)
    {
      this.af.setBs((int[][])localObject1);
      this.af.setBsTag(paramArrayOfByte);
      this.ae.getKChartContainer().u();
      return;
      if ((arrayOfInt1 != null) && (this.ag))
      {
        i1 = arrayOfInt1.length;
        i2 = paramArrayOfByte.length;
        localObject2 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2 + i1, 3 });
        System.arraycopy(paramArrayOfByte, 0, localObject2, 0, paramArrayOfByte.length);
        System.arraycopy(arrayOfInt1, 0, localObject2, paramArrayOfByte.length, i1);
        i1 = arrayOfInt2.length;
        i2 = localObject1.length;
        paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { i2 + i1, 5 });
        System.arraycopy(localObject1, 0, paramArrayOfByte, 0, localObject1.length);
        System.arraycopy(arrayOfInt2, 0, paramArrayOfByte, localObject1.length, i1);
        localObject1 = paramArrayOfByte;
        paramArrayOfByte = (byte[])localObject2;
      }
      else
      {
        localObject1 = arrayOfInt2;
        paramArrayOfByte = arrayOfInt1;
      }
    }
  }
  
  private void w(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      int i1 = new q(paramArrayOfByte).h();
      if (i1 > 0) {
        f().c(i1);
      }
    }
  }
  
  private void z()
  {
    if (this.af != null)
    {
      if (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.af.getCode())) {
        this.aj.a(false);
      }
    }
    else {
      return;
    }
    this.aj.a(true);
  }
  
  public void a()
  {
    if (this.ah == null) {
      R();
    }
    if (this.ah.isShowing())
    {
      this.ah.dismiss();
      this.ah.update();
      return;
    }
    int[] arrayOfInt = new int[2];
    int i1 = this.aj.a(arrayOfInt);
    if (this.as == null) {
      a(getActivity());
    }
    this.ah.setContentView(this.as);
    this.ah.setWidth(i1);
    this.ah.setHeight(this.au);
    this.ah.setBackgroundDrawable(new ColorDrawable(0));
    this.ah.showAsDropDown(this.aj, arrayOfInt[0], -this.au - this.aj.getHeight());
    this.ah.update();
  }
  
  public void a(int paramInt)
  {
    if (this.F != paramInt)
    {
      this.ae = this.C.getCurrentContainer();
      if (this.ae != null) {}
    }
    else
    {
      return;
    }
    this.F = paramInt;
    this.af = this.I.t(this.F);
    Object localObject = this.ae.getDataModel();
    if ((localObject != null) && (this.af != localObject)) {
      ((StockVo)localObject).cleanData();
    }
    if (!com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) {
      this.ba = av.a;
    }
    this.ae.setDataModel(this.af);
    this.ae.getMinChartContainer().getStockCostView().a();
    this.D.f();
    this.C.post(new vp(this));
    this.ae.m();
    this.aA.setHasRong(this.af.getLoanable());
    this.aA.a(this.af.getName(), this.af.getCode());
    this.aA.setStockVo(this.af);
    this.aK.setVisibility(8);
    this.aL.setVisibility(8);
    this.aW.setVisibility(8);
    this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
    this.aK.c();
    N();
    this.C.d();
    this.aM.setVisibility(8);
    localObject = com.android.dazhihui.a.g.a().r();
    if ((localObject == com.android.dazhihui.a.w.e) || (localObject == com.android.dazhihui.a.w.b))
    {
      DzhPushService.f();
      DzhPushService.a(this.af.getCode());
    }
    this.aZ.removeMessages(100);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.aK.getPriceTextView().setTextSize(2, paramInt2);
    if (paramInt2 > 16)
    {
      this.aZ.sendEmptyMessageDelayed(paramInt1, 100L);
      return;
    }
    this.aK.getPriceTextView().setTextSize(2, 16.0F);
    this.aK.setDealsPrice(this.aT);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, av paramav)
  {
    if (paramav == av.a)
    {
      localArrayList = this.af.getApi3010_Table_MinChart();
      if ((localArrayList != null) && (localArrayList.size() > 0)) {
        if ((((StockVo.Api3010_Table)localArrayList.get(0)).time != 1459) || (paramInt2 != 1459)) {}
      }
    }
    while (paramav != av.b)
    {
      ArrayList localArrayList;
      return;
      b(paramInt1, paramInt2, 0, paramav);
      c(paramInt1, paramInt2, 0, paramav);
      return;
      b(paramInt1, paramInt2, 0, paramav);
      c(paramInt1, paramInt2, 0, paramav);
      return;
    }
    int i1;
    if (paramInt3 == 2) {
      i1 = 1;
    }
    for (;;)
    {
      b(paramInt1, paramInt2, i1, paramav);
      c(paramInt1, paramInt2, i1, paramav);
      return;
      if (paramInt3 == 0)
      {
        i1 = 2;
      }
      else
      {
        i1 = paramInt3;
        if (paramInt3 == 1) {
          i1 = 3;
        }
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    setBundle(paramBundle);
    A();
    B();
    refresh();
  }
  
  public void a(View paramView)
  {
    if (paramView.getId() == 2131558919)
    {
      com.android.dazhihui.ui.a.e.a().g(this.af.getCode().substring(2));
      paramView = new Bundle();
      paramView.putString("gotoFlag", "138");
      com.android.dazhihui.ui.a.e.a().a(paramView);
      com.android.dazhihui.ui.delegate.b.o.a(getActivity());
    }
    do
    {
      return;
      if (paramView.getId() == 2131558916)
      {
        new Bundle().putInt("margin_trading_mark", 401);
        com.android.dazhihui.ui.delegate.b.o.a(getActivity(), this.af.getType(), this.af.getCode(), null, 2);
        return;
      }
      if (paramView.getId() == 2131558910)
      {
        if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.v))
        {
          a(this.af.getCurrentValue(), 0);
          this.aK.setVisibility(0);
          this.aL.setVisibility(8);
          this.aK.setDealsType(com.android.dazhihui.ui.widget.stockchart.f.a);
          this.aK.b();
          this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(false);
          e();
          g(3);
          return;
        }
        com.android.dazhihui.ui.delegate.b.o.a(getActivity(), this.af.getType(), this.af.getCode(), null, 0);
        return;
      }
      if (paramView.getId() == 2131558913)
      {
        if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.v))
        {
          a(this.af.getCurrentValue(), 1);
          this.aK.setVisibility(0);
          this.aL.setVisibility(8);
          this.aK.setDealsType(com.android.dazhihui.ui.widget.stockchart.f.b);
          this.aK.b();
          this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(false);
          e();
          g(3);
          return;
        }
        com.android.dazhihui.ui.delegate.b.o.a(getActivity(), this.af.getType(), this.af.getCode(), null, 1);
        return;
      }
    } while (paramView.getId() != 2131558920);
    this.aK.c();
    this.aK.setVisibility(8);
    this.aK.setKeyViewVisibility(8);
    this.aL.setVisibility(8);
    this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
  }
  
  public void a(HotVideoVo paramHotVideoVo)
  {
    if (this.ae == null) {
      return;
    }
    this.aQ = paramHotVideoVo.getStocklist();
    this.aR = this.ae.getmHotVideoAdapter();
    if ((this.aQ != null) && (this.aQ.size() > 0))
    {
      if (this.ae.g.getVisibility() == 8)
      {
        this.ae.g.b();
        this.ae.g.setVisibility(0);
      }
      this.ae.h.setAdapter(this.aR);
      this.ae.h.setNumColumns(5);
      this.aR.setHotData(this.aQ);
      this.ae.g.setHotvideoData(this.aQ);
      paramHotVideoVo = ((HotVideoPushStockVo)this.aQ.get(0)).getOwnerPeriod();
      if (TextUtils.isEmpty(paramHotVideoVo)) {}
    }
    try
    {
      Integer.parseInt(paramHotVideoVo);
      g(1);
      return;
      this.ae.g.setVisibility(8);
      return;
    }
    catch (NumberFormatException paramHotVideoVo)
    {
      for (;;) {}
    }
  }
  
  public void a(com.android.dazhihui.ui.widget.stockchart.f paramf)
  {
    if (this.ah == null) {
      R();
    }
    View localView = LayoutInflater.from(getActivity()).inflate(2130903113, null);
    Object localObject1 = (RelativeLayout.LayoutParams)localView.findViewById(2131558900).getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject1).width = (this.B.getWidth() * 2 / 3);
    ((RelativeLayout.LayoutParams)localObject1).height = -2;
    localObject1 = (TextView)localView.findViewById(2131558901);
    Object localObject3 = (TextView)localView.findViewById(2131558902);
    Object localObject4 = (TextView)localView.findViewById(2131558903);
    Object localObject5 = (TextView)localView.findViewById(2131558904);
    localObject1 = (TextView)localView.findViewById(2131558905);
    Object localObject2 = (TextView)localView.findViewById(2131558906);
    TextView localTextView1 = (TextView)localView.findViewById(2131558907);
    TextView localTextView2 = (TextView)localView.findViewById(2131558908);
    ((TextView)localObject5).setText("代码： " + this.af.getCode());
    ((TextView)localObject4).setText("名称： " + this.af.getName());
    localObject5 = com.android.dazhihui.ui.delegate.a.a().c();
    if (localObject5 != null)
    {
      localObject4 = ((com.android.dazhihui.ui.delegate.c.c)localObject5).c();
      localObject5 = ((com.android.dazhihui.ui.delegate.c.c)localObject5).d();
      ((TextView)localObject3).setText("账户： " + (String)localObject4 + " " + (String)localObject5);
    }
    localObject3 = new SpannableString("价格： " + this.aK.getDealPrice());
    ((SpannableString)localObject3).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject3).length(), 33);
    ((TextView)localObject2).setText((CharSequence)localObject3);
    localObject2 = new SpannableString("数量： " + this.aK.getDealCount());
    ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject2).length(), 33);
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localTextView1.setOnClickListener(new vi(this));
    if (paramf == com.android.dazhihui.ui.widget.stockchart.f.a)
    {
      localTextView2.setText("确认买入");
      localTextView2.setBackgroundColor(getResources().getColor(2131493412));
    }
    for (;;)
    {
      localTextView2.setOnClickListener(new vj(this, paramf));
      this.ah.setContentView(localView);
      this.ah.setWidth(this.B.getWidth());
      this.ah.setHeight(this.B.getHeight());
      this.ah.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
      this.ah.showAtLocation(this.B, 17, 0, getResources().getDimensionPixelOffset(2131230806));
      return;
      localTextView2.setText("确认卖出");
      localTextView2.setBackgroundColor(getResources().getColor(2131493078));
    }
  }
  
  public void a(com.android.dazhihui.ui.widget.stockchart.n paramn)
  {
    if ((this.ae.getSwitchType() == av.b) && (this.ae.getKChartContainer().getKLinePeriodValue() == 7)) {}
    switch (vg.a[paramn.ordinal()])
    {
    case 1: 
    default: 
      return;
    case 2: 
      g(true);
      return;
    case 3: 
      h(true);
      return;
    }
    i(true);
  }
  
  public void a(s params)
  {
    this.af.changeKLinePeriod();
    this.ae.getKChartContainer().d(true);
    params = this.ae.getSwitchType();
    if (params == av.a) {}
    while (params != av.b) {
      return;
    }
    F();
    this.aP = false;
  }
  
  public void a(String paramString)
  {
    this.aZ.removeMessages(126);
    this.aZ.removeMessages(120);
    this.aZ.removeMessages(118);
    this.aZ.removeMessages(122);
    this.aZ.removeMessages(124);
    this.aZ.removeMessages(116);
    if (this.aS == 0) {
      this.aS = ((int)this.aK.getPriceTextView().getTextSize());
    }
    this.aT = paramString;
    this.aK.setDealsPrice(paramString);
    this.aK.getPriceTextView().setTextSize(2, 21.0F);
    this.aZ.sendEmptyMessageDelayed(126, 100L);
  }
  
  public void a(String paramString, int paramInt)
  {
    if (this.af != null)
    {
      String str = this.af.getCode();
      str = str.substring(2, str.length());
      ah.a().a(str, paramString, paramInt);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.aP = paramBoolean;
    av localav = this.ae.getSwitchType();
    if (localav == av.a) {
      N();
    }
    do
    {
      return;
      if (localav == av.b)
      {
        N();
        return;
      }
    } while (!this.aI);
    D();
    j();
    this.aI = false;
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    int i7 = Integer.MAX_VALUE;
    int i6 = Integer.MIN_VALUE;
    int[] arrayOfInt = this.af.getCurrentData();
    int i5 = 0;
    int i3 = Integer.MIN_VALUE;
    int i1 = Integer.MAX_VALUE;
    int i4;
    int i2;
    if (i5 < paramInt1)
    {
      i4 = i1;
      if (i5 < paramInt2) {
        break label169;
      }
      i2 = i1;
      if (arrayOfInt[i5] < i1) {
        i2 = arrayOfInt[i5];
      }
      i4 = i2;
      if (arrayOfInt[i5] <= i3) {
        break label169;
      }
    }
    for (i1 = arrayOfInt[i5];; i1 = i3)
    {
      i4 = i7;
      if (arrayOfInt[i5] < i7) {
        i4 = arrayOfInt[i5];
      }
      int i8 = i6;
      if (arrayOfInt[i5] > i6) {
        i8 = arrayOfInt[i5];
      }
      i5 += 1;
      i3 = i1;
      i1 = i2;
      i7 = i4;
      i6 = i8;
      break;
      this.af.mApiDoubleVol.range = (i6 - i7);
      return i3 - i1;
      label169:
      i2 = i4;
    }
  }
  
  public void b()
  {
    com.android.dazhihui.d.n.a(this.af.getCode(), 20212);
    this.D.d(u().getCode(), y());
    if (this.af == null) {}
    String str1;
    String str2;
    do
    {
      return;
      str1 = this.af.getCode();
      str2 = this.af.getName();
      if (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(str1))
      {
        this.aM.setVisibility(0);
        this.aM.b();
        return;
      }
    } while (!com.android.dazhihui.ui.a.m.a().b().addSelfStock(str1, str2));
    new Vector().add(str1);
    z();
    b("添加自选股成功");
  }
  
  public void b(int paramInt) {}
  
  public void b(View paramView)
  {
    if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w))
    {
      i1 = getResources().getDimensionPixelOffset(2131230775);
      if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w)) {
        if (this.mLookFace == y.b)
        {
          localObject = new MinuteTitleGridAdpter(getActivity(), null, m, getResources().getStringArray(2131361918), this.mLookFace);
          i1 = getResources().getDimensionPixelOffset(2131230785);
          if (this.ah == null) {
            R();
          }
          localObject = b((MinuteTitleGridAdpter)localObject);
          ((View)localObject).findViewById(2131560019).setVisibility(0);
          ((View)localObject).findViewById(2131560017).setVisibility(8);
          this.ah.setContentView((View)localObject);
          this.ah.setWidth(i1);
          this.ah.setHeight(-2);
          this.ah.setBackgroundDrawable(new ColorDrawable(0));
          localObject = new int[2];
          paramView.getLocationOnScreen((int[])localObject);
          this.ah.showAtLocation(getActivity().getWindow().getDecorView(), 83, localObject[0] - (this.ah.getWidth() - paramView.getWidth()) / 2, paramView.getHeight());
          this.ah.update();
        }
      }
    }
    while (this.aL == null) {
      for (;;)
      {
        int i1;
        return;
        Object localObject = new MinuteTitleGridAdpter(getActivity(), null, k, getResources().getStringArray(2131361918), this.mLookFace);
        continue;
        if (this.mLookFace == y.b) {
          localObject = new MinuteTitleGridAdpter(getActivity(), null, l, getResources().getStringArray(2131361908), this.mLookFace);
        } else {
          localObject = new MinuteTitleGridAdpter(getActivity(), null, j, getResources().getStringArray(2131361908), this.mLookFace);
        }
      }
    }
    this.aL.setVisibility(0);
    this.aK.setVisibility(8);
    this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
    this.aK.c();
  }
  
  public void b(String paramString)
  {
    paramString = Toast.makeText(getActivity(), paramString, 0);
    paramString.setGravity(17, 0, 0);
    paramString.show();
  }
  
  public void b(boolean paramBoolean)
  {
    this.aX = paramBoolean;
  }
  
  public StockChartHeaderTitleView c()
  {
    return this.aA;
  }
  
  public void c(int paramInt)
  {
    double d1 = 0.0D;
    Object localObject = this.af.getMinTradeVolum();
    int[] arrayOfInt = this.af.getTradeVolum();
    if ((arrayOfInt == null) || (paramInt >= arrayOfInt.length)) {}
    int i1;
    label218:
    label310:
    label821:
    label827:
    do
    {
      long l1;
      long l2;
      do
      {
        return;
        int i2 = arrayOfInt[paramInt];
        l1 = localObject[paramInt];
        l2 = l1 / (paramInt + 1);
        i1 = 0;
        while (i1 <= paramInt)
        {
          d1 += (arrayOfInt[i1] - l2) * (arrayOfInt[i1] - l2);
          i1 += 1;
        }
        this.af.mApiDoubleVol.perVol = l2;
        this.af.mApiDoubleVol.standerVol = ((int)Math.sqrt(d1 / paramInt));
        localObject = this.af.mApiDoubleVol;
        if ((i2 <= 2L * l2) && ((paramInt <= 3) || ((arrayOfInt[(paramInt - 1)] <= l2) && (arrayOfInt[(paramInt - 2)] <= l2) && (arrayOfInt[(paramInt - 3)] <= l2)) || (i2 <= this.af.mApiDoubleVol.standerVol / 2 + l2))) {
          break;
        }
        bool = true;
        ((StockVo.ApiDoubleVol)localObject).isUpVol = bool;
        arrayOfInt = this.af.getmData2939();
        this.af.mApiDoubleVol.captialVol = (arrayOfInt[6] * 100);
        arrayOfInt = this.af.getCurrentData();
      } while ((arrayOfInt == null) || (paramInt >= arrayOfInt.length));
      i1 = paramInt;
      if (paramInt == 48) {
        i1 = 48;
      }
      paramInt = arrayOfInt[i1];
      if (arrayOfInt[i1] == this.af.getCp())
      {
        d1 = 0.0D;
        l2 = az.a(this.af.getmData2939()[6]);
        this.af.mApiDoubleVol.captialVol = l2;
        double d2 = 1.0F * (float)l1 * 240.0F * 100.0F / (float)(l2 * i1);
        localObject = this.af.mApiDoubleVol;
        if ((!this.af.mApiDoubleVol.isUpVol) || (d2 <= 4.0D) || (i1 <= 15) || (i1 >= 210) || (i1 < 2) || (arrayOfInt[i1] <= arrayOfInt[(i1 - 1)]) || (this.af.mApiDoubleVol.dayHight != i1) || (d1 >= 6.0D)) {
          break label821;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        ((StockVo.ApiDoubleVol)localObject).isUpPricVol = bool;
        if (this.af.mApiDoubleVol.isUpPricVol)
        {
          com.android.dazhihui.d.n.f("doubleShow", "doubleShow --------->isUpPricVol:" + i1);
          this.af.mApiDoubleVol.isHasUpPriceIndex = i1;
        }
        this.af.mApiDoubleVol.pbRange = 0;
        this.af.mApiDoubleVol.range = 0;
        this.af.mApiDoubleVol.pb = 0;
        if ((this.af.mApiDoubleVol.isHasUpPriceIndex > 0) && (i1 > this.af.mApiDoubleVol.isHasUpPriceIndex))
        {
          this.af.mApiDoubleVol.pb = (i1 - this.af.mApiDoubleVol.dayHight);
          if (this.af.mApiDoubleVol.pb > 10) {
            this.af.mApiDoubleVol.pbRange = b(i1, this.af.mApiDoubleVol.dayHight);
          }
        }
        this.af.mApiDoubleVol.isTp = this.af.isExistStockTp(i1);
        if (!this.af.mApiDoubleVol.isTp) {
          break;
        }
        if (this.af.getFirstTpPosition() != 0) {
          break label827;
        }
        com.android.dazhihui.d.n.f("doubleShow", "doubleShow --------->one" + i1);
        com.android.dazhihui.d.n.f("doubleShow", "doubleShow --------->onepbrange:" + this.af.mApiDoubleVol.pbRange + "range:" + this.af.mApiDoubleVol.range);
        this.af.setFirstTpPosition(i1);
        this.ae.getMinChartContainer().getTreadPriceView().invalidate();
        return;
        bool = false;
        break label218;
        d1 = Double.valueOf(az.b(az.d(paramInt, this.af.getCp()), this.af.getmDecimalLen())).doubleValue();
        break label310;
      }
    } while ((i1 <= this.af.getFirstTpPosition() + 14) || (this.af.getSecondTpPositiom() != 0));
    com.android.dazhihui.d.n.f("doubleShow", "doubleShow --------->two" + i1);
    this.af.setSecondTpPositiom(i1);
    this.ae.getMinChartContainer().getTreadPriceView().invalidate();
  }
  
  public void c(View paramView)
  {
    com.android.dazhihui.d.n.a(this.af.getCode(), 20213);
    this.D.e(u().getCode(), y());
    int i1 = getResources().getDimensionPixelOffset(2131230785);
    if (this.ah == null) {
      R();
    }
    View localView1 = T();
    Object localObject = localView1.findViewById(2131560019);
    View localView2 = localView1.findViewById(2131560017);
    ((View)localObject).setVisibility(0);
    localView2.setVisibility(8);
    localObject = (RelativeLayout.LayoutParams)((View)localObject).getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).addRule(14, 0);
    ((RelativeLayout.LayoutParams)localObject).addRule(11);
    ((RelativeLayout.LayoutParams)localObject).rightMargin = ((paramView.getWidth() - getResources().getDimensionPixelSize(2131230795)) / 2);
    this.ah.setContentView(localView1);
    this.ah.setWidth(i1);
    this.ah.setHeight(-2);
    this.ah.setBackgroundDrawable(new ColorDrawable(0));
    this.ah.showAtLocation(getActivity().getWindow().getDecorView(), 85, 0, paramView.getHeight());
    this.ah.update();
  }
  
  public void c(boolean paramBoolean)
  {
    this.M = new com.android.dazhihui.a.b.m();
    Object localObject = new x(2944);
    ((x)localObject).a(this.af.getCode());
    ((x)localObject).b(this.ae.getKChartContainer().getKLinePeriodValue());
    ((x)localObject).d(this.af.getKIndexDay());
    ((x)localObject).c(150);
    this.M.a((x)localObject);
    localObject = new x(2933);
    ((x)localObject).a(this.af.getCode());
    ((x)localObject).d(this.af.getKIndexDay());
    ((x)localObject).c(150);
    this.M.a((x)localObject);
    registRequestListener(this.M);
    sendRequest(this.M);
    localObject = this.ae.getKChartContainer().getDDEModel();
    if (this.ae.getKChartContainer().getKLinePeriodValue() == 7) {}
    switch (vg.a[localObject.ordinal()])
    {
    case 1: 
    default: 
      return;
    case 2: 
      g(false);
      return;
    case 3: 
      h(false);
      return;
    }
    i(false);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.av.g();
    if (this.aw != null) {
      this.aw.g();
    }
    if (this.ax != null) {
      this.ax.g();
    }
    if (paramy == y.b)
    {
      this.ak.setBackgroundColor(-789513);
      this.al.setBackgroundColor(-789513);
      this.B.setBackgroundColor(getResources().getColor(2131493677));
      this.aH = -14540254;
      this.aE = 2130838629;
      this.aF = 2130838120;
      this.aG = -3618616;
      this.aD.setBackgroundColor(-14072189);
      this.aB.setImageDrawable(getResources().getDrawable(2130838809));
      this.ae.g.a(y.b);
    }
    for (;;)
    {
      this.ai.a(paramy);
      this.aj.a(paramy);
      this.C.a(paramy);
      this.as = null;
      if (this.D != null)
      {
        this.D.a(paramy);
        this.D.e();
      }
      if (this.y != null) {
        this.y.a(paramy);
      }
      return;
      this.ae.g.a(y.a);
      this.ak.setBackgroundColor(-13750218);
      this.al.setBackgroundColor(-13750218);
      this.B.setBackgroundColor(-15789289);
      this.aH = -5395027;
      this.aE = 2130838628;
      this.aF = 2130838119;
      this.aG = -11907497;
      this.aD.setBackgroundColor(-13749961);
      this.aB.setImageDrawable(getResources().getDrawable(2130838727));
    }
  }
  
  public int d(int paramInt)
  {
    return paramInt / 100;
  }
  
  public void d()
  {
    if (this.ah == null) {
      R();
    }
    View localView = LayoutInflater.from(getActivity()).inflate(2130903438, null);
    Object localObject1 = localView.findViewById(2131560529);
    if (this.mLookFace == y.a) {
      ((View)localObject1).setBackgroundColor(-13157822);
    }
    Object localObject2;
    TextView localTextView1;
    TextView localTextView2;
    TextView localTextView3;
    TextView localTextView4;
    for (int i1 = -2892312;; i1 = -14540254)
    {
      localObject1 = (RelativeLayout.LayoutParams)((View)localObject1).getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).width = (this.B.getWidth() * 8 / 12);
      ((RelativeLayout.LayoutParams)localObject1).height = -2;
      localObject2 = (TextView)localView.findViewById(2131560533);
      TextView localTextView5 = (TextView)localView.findViewById(2131560535);
      TextView localTextView6 = (TextView)localView.findViewById(2131560537);
      TextView localTextView7 = (TextView)localView.findViewById(2131560539);
      TextView localTextView8 = (TextView)localView.findViewById(2131560541);
      TextView localTextView9 = (TextView)localView.findViewById(2131560531);
      localObject1 = (TextView)localView.findViewById(2131560534);
      localTextView1 = (TextView)localView.findViewById(2131560536);
      localTextView2 = (TextView)localView.findViewById(2131560538);
      localTextView3 = (TextView)localView.findViewById(2131560540);
      localTextView4 = (TextView)localView.findViewById(2131560542);
      localTextView9.setTextColor(i1);
      ((TextView)localObject2).setTextColor(i1);
      localTextView5.setTextColor(i1);
      localTextView6.setTextColor(i1);
      localTextView7.setTextColor(i1);
      localTextView8.setTextColor(i1);
      localTextView9.setTextColor(i1);
      ((TextView)localObject1).setTextColor(i1);
      localTextView1.setTextColor(i1);
      localTextView2.setTextColor(i1);
      localTextView3.setTextColor(i1);
      localTextView4.setTextColor(i1);
      localObject2 = this.af.get2997Data();
      if (localObject2 != null) {
        break;
      }
      return;
      ((View)localObject1).setBackgroundColor(getResources().getColor(2131493677));
    }
    localView.setOnClickListener(new vk(this));
    ((TextView)localObject1).setText(localObject2[0]);
    localTextView1.setText(localObject2[1]);
    localTextView2.setText(localObject2[2]);
    localTextView3.setText(localObject2[3]);
    localTextView4.setText(localObject2[4]);
    this.ah.setContentView(localView);
    this.ah.setWidth(this.B.getWidth());
    this.ah.setHeight(this.B.getHeight());
    this.ah.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
    this.ah.showAtLocation(this.B, 17, 0, getResources().getDimensionPixelOffset(2131230806));
  }
  
  public void d(boolean paramBoolean)
  {
    if (this.y != null)
    {
      if (paramBoolean) {
        this.y.a(false, 1);
      }
    }
    else {
      return;
    }
    this.y.a(false, 2);
  }
  
  public int e(int paramInt)
  {
    return paramInt % 100;
  }
  
  public void e()
  {
    int i1 = this.C.getHeaderHeight();
    this.ae.a.scrollTo(0, i1);
    this.ae.getMinChartContainer().getmScoolView().scrollTo(0, 0);
    this.C.d();
  }
  
  public StockChartContainer f()
  {
    return this.ae;
  }
  
  public void f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131559222: 
      localObject = new BitmapDrawable(bb.a(getActivity(), false));
      bb.a(getActivity()).a("大智慧", (Drawable)localObject);
      com.android.dazhihui.d.n.a(this.af.getCode(), 1388);
      return;
    case 2131559221: 
      if (!bb.a(getActivity(), "com.tencent.mm"))
      {
        Toast.makeText(getActivity(), "请先安装微信", 0).show();
        return;
      }
      localObject = ((BitmapDrawable)new BitmapDrawable(bb.a(getActivity(), false))).getBitmap();
      bb.a(getActivity()).a("", (Bitmap)localObject, true);
      com.android.dazhihui.d.n.a(this.af.getCode(), 1387);
      return;
    case 2131559220: 
      if (!bb.a(getActivity(), "com.tencent.mm"))
      {
        Toast.makeText(getActivity(), "请先安装微信", 0).show();
        return;
      }
      localObject = ((BitmapDrawable)new BitmapDrawable(bb.a(getActivity(), false))).getBitmap();
      bb.a(getActivity()).a("", (Bitmap)localObject, false);
      com.android.dazhihui.d.n.a(this.af.getCode(), 1386);
      return;
    }
    Object localObject = ((BitmapDrawable)new BitmapDrawable(bb.a(getActivity(), false))).getBitmap();
    bb.a(getActivity()).a(this.af.getName(), this.af.getCode(), (Bitmap)localObject);
  }
  
  public void finishMarketDispatch()
  {
    refresh();
    com.android.dazhihui.a.w localw = com.android.dazhihui.a.g.a().r();
    if ((localw == com.android.dazhihui.a.w.e) || (localw == com.android.dazhihui.a.w.b))
    {
      DzhPushService.f();
      if (this.af != null) {}
    }
    else
    {
      return;
    }
    DzhPushService.a(this.af.getCode());
  }
  
  public void g()
  {
    com.android.dazhihui.d.n.a(this.af.getCode(), 1414);
    String str1 = this.af.getCode();
    String str2 = this.af.getName();
    Bundle localBundle = new Bundle();
    int i1 = com.android.dazhihui.d.n.r(str1);
    if (i1 >= 0)
    {
      localBundle.putInt("index", i1);
      localBundle.putInt("screenId", 8002);
    }
    for (;;)
    {
      localBundle.putString("name", str2);
      localBundle.putString("code", str1);
      ((StockChartScreen)getActivity()).startActivity(AddWarningActivity.class, localBundle);
      return;
      localBundle.putInt("screenId", 8001);
    }
  }
  
  public void g(int paramInt)
  {
    Object localObject1 = getActivity();
    if (localObject1 == null) {}
    SharedPreferences localSharedPreferences;
    RelativeLayout.LayoutParams localLayoutParams;
    ImageView localImageView;
    do
    {
      return;
      localSharedPreferences = ((Context)localObject1).getSharedPreferences("DzhStockChartTips", 0);
      if (this.ah == null) {
        R();
      }
      if (paramInt != 1) {
        this.az = new RelativeLayout((Context)localObject1);
      }
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localImageView = new ImageView((Context)localObject1);
      if (paramInt != 1) {
        break;
      }
    } while (localSharedPreferences.getBoolean("showHotVideClose", false));
    this.az = ((RelativeLayout)LayoutInflater.from((Context)localObject1).inflate(2130903374, null));
    localObject1 = (RelativeLayout)this.az.findViewById(2131560211);
    ((RelativeLayout.LayoutParams)((RelativeLayout)localObject1).getLayoutParams()).width = this.ae.g.getLeftWidth();
    Object localObject2 = this.az.findViewById(2131560210);
    View localView = this.az.findViewById(2131560213);
    if (this.mLookFace == y.b)
    {
      ((RelativeLayout)localObject1).setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
      ((View)localObject2).setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
      localView.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
      label248:
      localSharedPreferences.edit().putBoolean("showHotVideClose", true).commit();
    }
    label270:
    label1144:
    for (;;)
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        this.az.addView(localImageView, localLayoutParams);
      }
      this.az.setOnClickListener(new ve(this, paramInt));
      this.ah.setHeight(this.B.getHeight());
      this.ah.setWidth(this.B.getWidth());
      if (this.mLookFace == y.b) {
        if ((paramInt != 1) && (paramInt != 2)) {
          this.ah.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
        }
      }
      for (;;)
      {
        this.ah.setContentView(this.az);
        this.ah.showAtLocation(this.B, 17, 0, getResources().getDimensionPixelOffset(2131230806));
        this.ah.update();
        return;
        ((RelativeLayout)localObject1).setBackgroundDrawable(new ColorDrawable(1073741824));
        ((View)localObject2).setBackgroundDrawable(new ColorDrawable(1073741824));
        localView.setBackgroundDrawable(new ColorDrawable(1073741824));
        break label248;
        if (paramInt == 2)
        {
          if (localSharedPreferences.getBoolean("showHotVideOpen", false)) {
            break;
          }
          this.az = ((RelativeLayout)LayoutInflater.from((Context)localObject1).inflate(2130903374, null));
          ((RelativeLayout.LayoutParams)((RelativeLayout)this.az.findViewById(2131560211)).getLayoutParams()).width = 1;
          localObject1 = (ImageView)this.az.findViewById(2131560214);
          ((ImageView)localObject1).setImageDrawable(getResources().getDrawable(2130838861));
          ((ImageView)localObject1).setVisibility(0);
          localObject1 = this.az.findViewById(2131560210);
          localObject2 = this.az.findViewById(2131560213);
          if (this.mLookFace == y.b)
          {
            ((View)localObject1).setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
            ((View)localObject2).setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
          }
          for (;;)
          {
            localSharedPreferences.edit().putBoolean("showHotVideOpen", true).commit();
            break;
            ((View)localObject1).setBackgroundDrawable(new ColorDrawable(1073741824));
            ((View)localObject2).setBackgroundDrawable(new ColorDrawable(1073741824));
          }
        }
        if (paramInt == 3)
        {
          if (localSharedPreferences.getBoolean("showFastDeal", false)) {
            break;
          }
          localObject1 = new ImageView((Context)localObject1);
          ((ImageView)localObject1).setScaleType(ImageView.ScaleType.FIT_XY);
          ((ImageView)localObject1).setId(localObject1.hashCode());
          if (c(this.af)) {
            ((ImageView)localObject1).setImageDrawable(getResources().getDrawable(2130837942));
          }
          for (;;)
          {
            localImageView.setImageDrawable(getResources().getDrawable(2130838859));
            localObject2 = new RelativeLayout.LayoutParams(this.B.getWidth() / 3, getResources().getDimensionPixelOffset(2131230799));
            ((RelativeLayout.LayoutParams)localObject2).height = this.ae.getMinChartContainer().getDetailSwitchView().getTheItemWidth();
            ((RelativeLayout.LayoutParams)localObject2).addRule(10);
            ((RelativeLayout.LayoutParams)localObject2).addRule(11);
            ((RelativeLayout.LayoutParams)localObject2).topMargin = (getResources().getDimensionPixelOffset(2131230842) + this.ae.getMinChartContainer().getDetailSwitchView().getTheTopoffSet());
            this.az.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
            localLayoutParams.addRule(3, ((ImageView)localObject1).getId());
            localLayoutParams.topMargin = getResources().getDimensionPixelOffset(2131230829);
            localLayoutParams.addRule(11);
            localLayoutParams.rightMargin = getResources().getDimensionPixelOffset(2131230824);
            localSharedPreferences.edit().putBoolean("showFastDeal", true).commit();
            break;
            ((ImageView)localObject1).setImageDrawable(getResources().getDrawable(2130837941));
          }
        }
        if (paramInt != 4) {
          break label1144;
        }
        if (localSharedPreferences.getBoolean("showKlineParamSetting", false)) {
          break;
        }
        localObject1 = this.ae.getKChartContainer().getParamSettingBtnLocation();
        localImageView.setImageDrawable(getResources().getDrawable(2130838860));
        localLayoutParams = new RelativeLayout.LayoutParams(getResources().getDimensionPixelOffset(2131230809), getResources().getDimensionPixelOffset(2131230855));
        localLayoutParams.addRule(9);
        localLayoutParams.topMargin = (localObject1[1] - getResources().getDimensionPixelOffset(2131230855) - getResources().getDimensionPixelOffset(2131230806));
        localLayoutParams.leftMargin = 0;
        localSharedPreferences.edit().putBoolean("showKlineParamSetting", true).commit();
        break label270;
        if ((paramInt != 1) && (paramInt != 2)) {
          this.ah.setBackgroundDrawable(new ColorDrawable(1073741824));
        }
      }
    }
  }
  
  public void h()
  {
    this.D.c(u().getCode(), y());
    com.android.dazhihui.d.n.a(this.af.getCode(), 20211);
    String str = com.android.dazhihui.a.f.W + this.af.getCode();
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", str);
    localIntent.putExtras(localBundle);
    localIntent.setClass(getActivity(), BrowserActivity.class);
    startActivity(localIntent);
  }
  
  public void h(int paramInt)
  {
    this.A = paramInt;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (this.ay == vq.b) {
      if ((paramj instanceof com.android.dazhihui.a.b.o))
      {
        paramh = ((com.android.dazhihui.a.b.o)paramj).h();
        if ((paramh != null) && (paramh.b != null) && (paramh.a == 2978)) {
          J();
        }
      }
    }
    p localp;
    byte[] arrayOfByte;
    do
    {
      do
      {
        return;
        if (!(paramj instanceof com.android.dazhihui.a.b.o)) {
          break label1008;
        }
        if ((paramh != this.Z) && (paramh != this.J) && (paramh != this.L) && (paramh != this.N) && (paramh != this.O) && (paramh != this.P) && (paramh != this.Q) && (paramh != this.R) && (paramh != this.K) && (paramh != this.V) && (paramh != this.W) && (paramh != this.Y) && (paramh != this.X) && (paramh != this.S) && (paramh != this.M) && (paramh != this.T) && (paramh != this.ab) && (paramh != this.ac)) {
          break;
        }
        localp = ((com.android.dazhihui.a.b.o)paramj).h();
      } while ((localp == null) || (localp.b == null));
      arrayOfByte = localp.b;
    } while ((arrayOfByte == null) || ((arrayOfByte.length == 0) && (paramh != this.J)));
    av localav;
    boolean bool;
    if (paramh == this.L)
    {
      this.aU = 0;
      if (((Boolean)this.L.j()).booleanValue())
      {
        localav = this.ae.getSwitchType();
        if (localav == av.a)
        {
          if ((localp.a != 2940) && (localp.a != 2942)) {
            break label384;
          }
          this.y.a(false, 1);
          bool = true;
        }
      }
    }
    for (;;)
    {
      if (localp.a == 2939)
      {
        o(arrayOfByte);
        return;
        if ((localav == av.b) && ((localp.a == 2933) || (localp.a == 2944))) {
          this.y.a(false, 1);
        }
        label384:
        bool = true;
      }
      else
      {
        if (localp.a == 2940)
        {
          p(arrayOfByte);
          this.aZ.removeMessages(4);
          if (this.ay == vq.b) {
            break;
          }
          this.aZ.sendEmptyMessageDelayed(4, 15000L);
          return;
        }
        if (localp.a == 2942)
        {
          a(arrayOfByte, paramj);
          this.aZ.removeMessages(0);
          if (this.ay == vq.b) {
            break;
          }
          this.aZ.sendEmptyMessageDelayed(0, 15000L);
          return;
        }
        if (localp.a == 2957)
        {
          w(arrayOfByte);
          return;
        }
        if (localp.a == 2922)
        {
          b(arrayOfByte, bool);
          return;
        }
        if (localp.a == 2923)
        {
          c(arrayOfByte, bool);
          return;
        }
        if (localp.a == 2924)
        {
          d(arrayOfByte, bool);
          return;
        }
        if (localp.a == 2944)
        {
          a((com.android.dazhihui.a.b.m)paramh, arrayOfByte);
          this.aZ.removeMessages(2);
          if (this.ay == vq.b) {
            break;
          }
          this.aZ.sendEmptyMessageDelayed(2, 15000L);
          return;
        }
        if (localp.a == 2933)
        {
          v(arrayOfByte);
          return;
        }
        if (localp.a == 2958)
        {
          u(arrayOfByte);
          return;
        }
        if (localp.a == 2918)
        {
          q(arrayOfByte);
          return;
        }
        if (localp.a == 2919)
        {
          r(arrayOfByte);
          return;
        }
        if (localp.a == 2920)
        {
          s(arrayOfByte);
          return;
        }
        if (localp.a == 2928)
        {
          t(arrayOfByte);
          return;
        }
        if (localp.a == 2204)
        {
          n(arrayOfByte);
          return;
        }
        if (localp.a == 2941)
        {
          m(arrayOfByte);
          return;
        }
        if (localp.a == 2965)
        {
          a(arrayOfByte, bool);
          return;
        }
        if (localp.a == 2931)
        {
          k(arrayOfByte);
          return;
        }
        if (localp.a == 2930)
        {
          l(arrayOfByte);
          return;
        }
        if (localp.a == 2955)
        {
          j(arrayOfByte);
          return;
        }
        if (localp.a == 2915)
        {
          h(arrayOfByte);
          return;
        }
        if (localp.a == 2917)
        {
          i(arrayOfByte);
          return;
        }
        if (localp.a == 2206)
        {
          g(arrayOfByte);
          return;
        }
        if (localp.a == 2978)
        {
          f(arrayOfByte);
          return;
        }
        if (localp.a == 2994)
        {
          e(arrayOfByte);
          return;
        }
        if (localp.a == 2987)
        {
          c(arrayOfByte);
          return;
        }
        if (localp.a == 2997)
        {
          b(arrayOfByte);
          return;
        }
        if (localp.a != 3010) {
          break;
        }
        a(arrayOfByte, (av)paramh.j());
        return;
        if (paramh != this.U) {
          break;
        }
        paramh = ((com.android.dazhihui.a.b.o)paramj).h();
        if ((paramh == null) || (paramh.b == null)) {
          break;
        }
        paramh = paramh.b;
        if ((paramh == null) || (paramh.length == 0)) {
          break;
        }
        d(paramh);
        return;
        label1008:
        if ((!(paramj instanceof com.android.dazhihui.a.b.g)) || (paramh != this.aa)) {
          break;
        }
        a(((com.android.dazhihui.a.b.g)paramj).a());
        return;
        bool = false;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.J == paramh) {
      D();
    }
    do
    {
      do
      {
        return;
      } while (this.L != paramh);
      com.android.dazhihui.d.n.e("stockChart", "Timeout------->");
      if (this.aU <= 3)
      {
        clearRequest();
        F();
        this.aU += 1;
      }
    } while (!((Boolean)this.L.j()).booleanValue());
    this.y.a(false, 2);
  }
  
  public void i()
  {
    com.android.dazhihui.d.n.a(this.af.getCode(), 20214);
    if (this.ah == null) {
      R();
    }
    if (this.ah.isShowing())
    {
      this.ah.dismiss();
      this.ah.update();
      return;
    }
    if (this.ar == null) {
      S();
    }
    this.ah.setContentView(this.ar);
    this.ah.setWidth(-1);
    this.ah.setHeight(-2);
    this.ah.setBackgroundDrawable(new ColorDrawable(-65536));
    this.ah.showAtLocation(this.B, 81, 0, 0);
    this.ah.update();
  }
  
  public void j()
  {
    Object localObject = this.ae.getSwitchType();
    if ((localObject != av.a) && (localObject != av.a))
    {
      this.Z = new com.android.dazhihui.a.b.m();
      this.Z.a(com.android.dazhihui.a.b.n.b);
      this.Z.a("mAuto2940Req");
      localObject = new x(2940);
      ((x)localObject).a(this.af.getCode());
      this.Z.a((x)localObject);
      registRequestListener(this.Z);
      sendRequest(this.Z);
    }
  }
  
  public void k()
  {
    int i1 = 1;
    if (this.af == null) {}
    int i2;
    do
    {
      return;
      i2 = this.ae.getKChartContainer().getKLinePeriodValue();
    } while ((i2 != 7) && (i2 != 8) && (i2 != 9));
    this.R = new com.android.dazhihui.a.b.m();
    this.R.a(com.android.dazhihui.a.b.n.b);
    x localx = new x(2958);
    localx.a(this.af.getCode());
    if (StockVo.getExRights() == 1) {}
    for (;;)
    {
      localx.b(i1);
      this.R.a(localx);
      registRequestListener(this.R);
      sendRequest(this.R);
      return;
      i1 = 0;
    }
  }
  
  public String l()
  {
    this.aK.a();
    return ah.a().b();
  }
  
  public void loginStatusChange(com.android.dazhihui.c paramc)
  {
    if ((paramc != com.android.dazhihui.c.b) || (this.af == null)) {}
    while ((this.ae == null) || (this.ae.getSwitchType() != av.a) || (this.ay != vq.a) || (!c(this.af))) {
      return;
    }
    this.aZ.removeMessages(1);
    K();
  }
  
  public void m()
  {
    int[][] arrayOfInt = this.af.getMinData();
    int[] arrayOfInt3 = this.af.getmAveragePrice();
    int[] arrayOfInt2 = this.af.getCurrentData();
    int[] arrayOfInt1 = this.af.getTradeVolum();
    int i2 = this.af.getmMaxVol();
    if (arrayOfInt != null)
    {
      if ((arrayOfInt3 != null) && (arrayOfInt3.length == arrayOfInt.length)) {
        break label274;
      }
      arrayOfInt3 = new int[arrayOfInt.length];
      arrayOfInt2 = new int[arrayOfInt.length];
      arrayOfInt1 = new int[arrayOfInt.length];
    }
    label274:
    for (;;)
    {
      if ((arrayOfInt2 == null) || (arrayOfInt2.length != arrayOfInt.length)) {
        arrayOfInt2 = new int[arrayOfInt.length];
      }
      for (;;)
      {
        int[] arrayOfInt4;
        if (arrayOfInt1 != null)
        {
          arrayOfInt4 = arrayOfInt1;
          if (arrayOfInt1.length == arrayOfInt.length) {}
        }
        else
        {
          arrayOfInt4 = new int[arrayOfInt.length];
        }
        arrayOfInt1 = this.af.getMinTradeVolum();
        int i1 = 0;
        if (i1 < this.af.getMinLength())
        {
          arrayOfInt2[i1] = arrayOfInt[i1][1];
          arrayOfInt3[i1] = arrayOfInt[i1][2];
          if (i1 == 0) {
            arrayOfInt4[i1] = arrayOfInt[i1][3];
          }
          for (;;)
          {
            int i3 = i2;
            if (arrayOfInt4[i1] > i2) {
              i3 = arrayOfInt4[i1];
            }
            i1 += 1;
            i2 = i3;
            break;
            arrayOfInt1[i1] -= arrayOfInt1[(i1 - 1)];
          }
        }
        this.af.setCurrentData(arrayOfInt2);
        this.af.setmAveragePrice(arrayOfInt3);
        this.af.setTradeVolum(arrayOfInt4);
        this.af.setmMaxVol(i2);
        P();
        return;
      }
    }
  }
  
  public void n()
  {
    if ((com.android.dazhihui.d.n.j(this.af.getCode())) || ("SZ399006".equals(this.af.getCode()))) {
      return;
    }
    com.android.dazhihui.d.n.a(this.af.getCode(), 20210);
    if (this.ah == null) {
      R();
    }
    if (this.ah.isShowing())
    {
      this.ah.dismiss();
      return;
    }
    U();
    this.ah.setWidth(this.B.getWidth());
    this.ah.setHeight(this.B.getHeight());
    this.ah.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
    if (this.mLookFace == y.a) {
      this.ap.setBackgroundColor(-13157822);
    }
    for (;;)
    {
      this.ah.setContentView(this.az);
      this.ah.showAtLocation(this.B, 17, 0, getResources().getDimensionPixelOffset(2131230806));
      this.ah.update();
      return;
      this.ap.setBackgroundColor(getResources().getColor(2131493677));
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.J == paramh) {
      D();
    }
    while ((this.L != paramh) || (!((Boolean)this.L.j()).booleanValue())) {
      return;
    }
    this.y.a(false, 2);
  }
  
  public void o()
  {
    this.aL.setVisibility(8);
    this.aK.setVisibility(8);
    this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
    this.aK.c();
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    j(false);
  }
  
  public void onClick(View paramView)
  {
    if (((paramView instanceof MinChartContainerTop)) || ((paramView instanceof StockChartDetaisView))) {
      n();
    }
    Object localObject;
    do
    {
      return;
      if ((paramView instanceof StockChartHeaderTitleView))
      {
        if (this.ah == null) {
          R();
        }
        d(paramView);
        this.ah.setContentView(this.aq);
        this.ah.setWidth(getResources().getDimensionPixelOffset(2131230785));
        this.ah.setHeight(-2);
        this.ah.setBackgroundDrawable(new ColorDrawable(0));
        com.android.dazhihui.d.n.a(this.af.getCode(), 1409);
        localObject = this.ah;
        i1 = getResources().getDimensionPixelSize(2131230840);
        ((PopupWindow)localObject).showAsDropDown(paramView, ((StockChartHeaderTitleView)paramView).getAddImgWight() / 2 + i1 - paramView.getWidth() / 2, -getResources().getDimensionPixelOffset(2131230799));
        this.ah.update();
        return;
      }
      if (paramView.getId() == 2131560573)
      {
        if ((this.ae != null) && (this.ae.getStockType() == vr.c) && (this.ae.getSwitchType() == av.f))
        {
          this.ae.a(av.a);
          ((StockChartScreen)getActivity()).a(true);
          return;
        }
        getActivity().finish();
        return;
      }
      if (paramView.getId() != a) {
        break;
      }
    } while ((this.af == null) || (this.af.getCode() == null));
    int i2 = this.af.getType();
    String str = this.af.getCode();
    int i3 = com.android.dazhihui.d.n.o(str);
    if (com.android.dazhihui.d.n.k(i2, i3))
    {
      com.android.dazhihui.d.n.a(str, 1215);
      paramView = new Bundle();
      paramView.putInt("TAB_ID", 805306368);
      localObject = new Intent();
      ((Intent)localObject).setClass(getActivity(), MainScreen.class);
      ((Intent)localObject).putExtras(paramView);
      getActivity().startActivity((Intent)localObject);
      return;
    }
    if ((com.android.dazhihui.d.n.g(i2, i3)) || (com.android.dazhihui.d.n.e(i2, i3)))
    {
      refresh();
      return;
    }
    int i1 = (int)(com.android.dazhihui.g.a().m() / 4 * 1.1D);
    if (com.android.dazhihui.d.n.f(i2, i3))
    {
      i1 = (int)(com.android.dazhihui.g.a().m() / 4 * 1.3D);
      localObject = new MinuteTitleGridAdpter(getActivity(), null, f, getResources().getStringArray(2131361917), this.mLookFace);
    }
    for (;;)
    {
      if (this.ah == null) {
        R();
      }
      localObject = a((MinuteTitleGridAdpter)localObject);
      this.ah.setContentView((View)localObject);
      this.ah.setWidth(i1);
      this.ah.setHeight(-2);
      this.ah.setBackgroundDrawable(new ColorDrawable(0));
      paramView.getLocationOnScreen(new int[2]);
      this.ah.showAsDropDown(paramView, -(this.ah.getWidth() - paramView.getWidth()) / 2, 0);
      this.ah.update();
      com.android.dazhihui.d.n.a(str, 1215);
      return;
      if (i2 == 5)
      {
        localObject = new MinuteTitleGridAdpter(getActivity(), null, e, getResources().getStringArray(2131361915), this.mLookFace);
      }
      else if ((i2 == 7) || (i2 == 8) || (i2 == 17))
      {
        localObject = new MinuteTitleGridAdpter(getActivity(), null, d, getResources().getStringArray(2131361910), this.mLookFace);
      }
      else if ((i2 == 6) || (i2 == 3) || (i2 == 12) || (i2 == 18) || (i2 == 15))
      {
        localObject = new MinuteTitleGridAdpter(getActivity(), null, g, getResources().getStringArray(2131361911), this.mLookFace);
      }
      else if (i3 == 11)
      {
        localObject = new MinuteTitleGridAdpter(getActivity(), null, h, getResources().getStringArray(2131361920), this.mLookFace);
      }
      else if ((com.android.dazhihui.d.n.i(i2, i3)) || (com.android.dazhihui.d.n.a(i2, i3)))
      {
        if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w))
        {
          if (this.mLookFace == y.b) {}
          for (localObject = new MinuteTitleGridAdpter(getActivity(), null, m, getResources().getStringArray(2131361918), this.mLookFace);; localObject = new MinuteTitleGridAdpter(getActivity(), null, k, getResources().getStringArray(2131361918), this.mLookFace))
          {
            i1 = (int)(com.android.dazhihui.g.a().m() / 4 * 1.5D);
            break;
          }
        }
        if (this.mLookFace == y.b) {
          localObject = new MinuteTitleGridAdpter(getActivity(), null, l, getResources().getStringArray(2131361908), this.mLookFace);
        } else {
          localObject = new MinuteTitleGridAdpter(getActivity(), null, j, getResources().getStringArray(2131361908), this.mLookFace);
        }
      }
      else
      {
        if (com.android.dazhihui.d.n.g(i2))
        {
          if (this.mLookFace == y.b)
          {
            localObject = new MinuteTitleGridAdpter(getActivity(), null, l, getResources().getStringArray(2131361908), this.mLookFace);
            continue;
          }
          localObject = new MinuteTitleGridAdpter(getActivity(), null, j, getResources().getStringArray(2131361908), this.mLookFace);
          continue;
          if (paramView.getId() == 2131560575)
          {
            paramView = new Intent(getActivity(), SearchStockScreen.class);
            getActivity().startActivity(paramView);
            return;
          }
          if (paramView.getId() == 2131560498)
          {
            paramView = this.af.getCode();
            com.android.dazhihui.ui.a.m.a().b().removeSelfStock(paramView);
            new Vector().add(paramView);
            z();
            b("删除自选股成功");
            this.D.a(this.D.getmTabType());
            this.aM.setVisibility(8);
            return;
          }
          if (paramView.getId() == 2131560499)
          {
            this.aM.c();
            return;
          }
          if ((paramView instanceof TextView))
          {
            paramView = paramView.getTag();
            if (paramView == null) {
              break;
            }
            paramView = (s)paramView;
            this.ae.a(av.b);
            this.ae.getKChartContainer().a(paramView, false);
            this.aj.setSelected(4);
            this.aj.setViewText(this.at[(paramView.a() - 1)]);
            this.ah.dismiss();
            return;
          }
          if ((paramView.getId() != 2131560494) || (this.af.get2997Data() == null)) {
            break;
          }
          d();
          return;
        }
        localObject = null;
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    j(true);
    if ((this.ah != null) && (this.ah.isShowing())) {
      this.ah.dismiss();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.B = paramLayoutInflater.inflate(2130903436, paramViewGroup, false);
    this.ai = ((StockLandTitle)this.B.findViewById(2131560491));
    this.aA = ((StockChartHeaderTitleView)this.B.findViewById(2131560574));
    this.aW = this.B.findViewById(2131560494);
    this.y = ((LoadAndRefreshView)this.B.findViewById(2131560105));
    this.y.a(true, false);
    this.y.setOnHeaderRefreshListener(this);
    this.y.setOnFooterLoadListener(this);
    this.C = ((StockChartPager)this.B.findViewById(2131560495));
    this.aD = this.B.findViewById(2131560490);
    this.aj = ((StockLandView)this.B.findViewById(2131560502));
    this.aB = ((ImageView)this.B.findViewById(2131560575));
    this.aC = ((ImageView)this.B.findViewById(2131560573));
    this.aK = ((FastDealsView)this.B.findViewById(2131559725));
    this.aL = ((FastDealMenu)this.B.findViewById(2131560500));
    this.aL.setHolder(this);
    this.aK.setHolder(this);
    this.aW.setVisibility(8);
    this.aM = ((PopupMenu)this.B.findViewById(2131560497));
    this.aM.setBackgroundColor(getResources().getColor(2131493660));
    this.aN = ((Button)this.B.findViewById(2131560498));
    this.aO = ((Button)this.B.findViewById(2131560499));
    this.aN.setOnClickListener(this);
    this.aO.setOnClickListener(this);
    this.aB.setOnClickListener(this);
    this.aC.setOnClickListener(this);
    this.aW.setOnClickListener(this);
    this.aj.setOnChildListener(new uw(this));
    this.ak = ((MinChartDetailView)this.B.findViewById(2131560492));
    this.al = ((KChartDetailView)this.B.findViewById(2131560493));
    this.C.setHolder(this);
    this.C.getCurrentContainer().setIsCurrentContainer(true);
    this.D = ((IndexStockChartBottomWidget)this.B.findViewById(2131560496));
    this.D.setHolder(this);
    this.E = ((EmojiInputView)this.B.findViewById(2131560501));
    if ((getActivity() instanceof StockChartScreen))
    {
      this.av = this.C.getCurrentContainer().c.f;
      ((StockChartScreen)getActivity()).a(this.av);
      if (this.C.getNextContainer() != null)
      {
        this.aw = this.C.getNextContainer().c.f;
        ((StockChartScreen)getActivity()).a(this.aw);
      }
      if (this.C.getPreviousContainer() != null)
      {
        this.ax = this.C.getPreviousContainer().c.f;
        ((StockChartScreen)getActivity()).a(this.ax);
      }
      this.v = this.C.getCurrentContainer().b.b;
      ((StockChartScreen)getActivity()).a(this.v);
      if (this.C.getNextContainer() != null)
      {
        this.w = this.C.getNextContainer().b.b;
        ((StockChartScreen)getActivity()).a(this.w);
      }
      if (this.C.getPreviousContainer() != null)
      {
        this.x = this.C.getPreviousContainer().b.b;
        ((StockChartScreen)getActivity()).a(this.x);
      }
    }
    this.aV = new vh(this);
    ah.a().a(this);
    SystemSetingScreen.a(this.aV);
    A();
    B();
    return this.B;
  }
  
  public void onDestroy()
  {
    this.J = null;
    this.K = null;
    this.L = null;
    this.M = null;
    this.N = null;
    this.O = null;
    this.P = null;
    this.Q = null;
    this.R = null;
    this.S = null;
    this.V = null;
    this.W = null;
    this.U = null;
    this.Y = null;
    this.aa = null;
    clearRequest();
    this.aZ.removeMessages(0);
    this.aZ.removeMessages(1);
    this.aZ.removeMessages(2);
    this.aZ.removeMessages(4);
    this.aZ.removeMessages(126);
    this.aZ.removeMessages(120);
    this.aZ.removeMessages(118);
    this.aZ.removeMessages(122);
    this.aZ.removeMessages(124);
    this.aZ.removeMessages(116);
    if (this.D != null) {
      this.D.c();
    }
    this.ae = this.C.getCurrentContainer();
    if (this.ae != null) {
      this.ae.f();
    }
    if (this.C != null)
    {
      if (this.C.getPreviousContainer() != null) {
        this.C.getPreviousContainer().f();
      }
      if (this.C.getNextContainer() != null) {
        this.C.getNextContainer().f();
      }
      this.C.g();
    }
    ah.a().a(null);
    DzhPushService.f();
    SystemSetingScreen.b(this.aV);
    super.onDestroy();
  }
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    Object localObject = this.ae.getSwitchType();
    if ((localObject == av.a) || (localObject == av.b)) {
      a(true);
    }
    do
    {
      return;
      localObject = this.ae.getCurrentFragment();
      if ((localObject instanceof bs))
      {
        ((bs)localObject).a(true);
        return;
      }
      if (((localObject instanceof lp)) || ((localObject instanceof i)) || ((localObject instanceof ne)))
      {
        ((com.android.dazhihui.ui.screen.e)localObject).onPulledrefresh(true);
        return;
      }
    } while ((!(localObject instanceof of)) && (!(localObject instanceof dh)) && (!(localObject instanceof cn)) && (!(localObject instanceof oh)) && (!(localObject instanceof at)));
    ((com.android.dazhihui.ui.screen.e)localObject).onPulledrefresh(true);
    paramBaseRefreshView.a(false);
  }
  
  public void onPause()
  {
    super.onPause();
    J();
    DzhPushService.f();
  }
  
  public void onResume()
  {
    super.onResume();
    this.ay = vq.a;
    com.android.dazhihui.w.a().a(this);
    com.android.dazhihui.a.g.a().a(this);
    Object localObject = this.ae.getDataModel();
    if ((localObject != null) && (this.af != localObject)) {
      ((StockVo)localObject).cleanData();
    }
    refresh();
    if (this.ae.getSwitchType() == av.b) {
      this.ae.c.m();
    }
    this.aA.setStockVo((StockVo)localObject);
    if ((this.D != null) && (this.D.getVisibility() == 0)) {
      this.D.a();
    }
    localObject = com.android.dazhihui.a.g.a().r();
    if ((localObject == com.android.dazhihui.a.w.e) || (localObject == com.android.dazhihui.a.w.b))
    {
      DzhPushService.f();
      if (this.af != null) {}
    }
    while (this.ae.g == null)
    {
      return;
      DzhPushService.a(this.af.getCode());
    }
    this.ae.g.c();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    this.ay = vq.b;
    this.aZ.removeMessages(0);
    this.aZ.removeMessages(1);
    this.aZ.removeMessages(2);
    this.aZ.removeMessages(4);
    if (this.D != null) {
      this.D.b();
    }
    com.android.dazhihui.w.a().b(this);
    com.android.dazhihui.a.g.a().b(this);
    super.onStop();
  }
  
  public av p()
  {
    return this.ba;
  }
  
  public void q()
  {
    av localav = this.ae.getSwitchType();
    if ((localav == av.a) || (localav == av.b))
    {
      this.ag = false;
      this.aP = false;
      clearRequest();
      F();
      if (localav == av.b) {
        o();
      }
    }
    for (this.ba = av.a;; this.ba = av.a)
    {
      if (com.android.dazhihui.d.n.i(this.af.getType(), this.af.getMarketType())) {
        this.ba = this.ae.getSwitchType();
      }
      return;
      this.aL.setVisibility(8);
      this.aK.setVisibility(8);
      this.ae.getMinChartContainer().getDetailSwitchView().setEnableChange(true);
      this.aK.c();
      if (localav != av.f) {
        j();
      }
    }
  }
  
  public MinChartDetailView r()
  {
    return this.ak;
  }
  
  public void refresh()
  {
    a(false);
  }
  
  public KChartDetailView s()
  {
    return this.al;
  }
  
  public void t()
  {
    this.al.setVisibility(0);
    this.al.a();
    this.al.invalidate();
  }
  
  public StockVo u()
  {
    return this.af;
  }
  
  public void v()
  {
    FrameLayout.LayoutParams localLayoutParams;
    if ((this.D != null) && (this.C != null) && ((this.D.getVisibility() != 8) || (getResources().getConfiguration().orientation == 2)))
    {
      this.D.setVisibility(8);
      localLayoutParams = (FrameLayout.LayoutParams)this.C.getLayoutParams();
      if (getResources().getConfiguration().orientation != 1) {
        break label95;
      }
    }
    label95:
    for (localLayoutParams.bottomMargin = 0;; localLayoutParams.bottomMargin = getActivity().getResources().getDimensionPixelSize(2131230820))
    {
      this.C.setLayoutParams(localLayoutParams);
      this.D.requestLayout();
      return;
    }
  }
  
  public void w()
  {
    if ((getResources().getConfiguration().orientation == 1) && (this.D != null) && (this.C != null) && (this.D.getVisibility() != 0))
    {
      this.D.setVisibility(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.C.getLayoutParams();
      localLayoutParams.bottomMargin = getActivity().getResources().getDimensionPixelSize(2131230835);
      this.C.setLayoutParams(localLayoutParams);
      this.D.requestLayout();
    }
    this.D.e();
  }
  
  public EmojiInputView x()
  {
    return this.E;
  }
  
  public int y()
  {
    return this.A;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */