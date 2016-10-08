package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.AdvertUpPullData;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.Data;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.model.stock.RightTopManager.RecevierHotVideoDataListener;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter.SortMode;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ap;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.HomeListView;
import com.android.dazhihui.ui.widget.HotVideoViewFlow;
import com.android.dazhihui.ui.widget.IndexTopLayout;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.SelfStockSortMenuLayout;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dy;
import com.android.dazhihui.ui.widget.dzhrefresh.HomeView;
import com.android.dazhihui.ui.widget.dzhrefresh.HomeViewRefreshLayout;
import com.android.dazhihui.ui.widget.stockchart.FastDealsView;
import com.android.dazhihui.ui.widget.stockchart.az;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class eu
  extends com.android.dazhihui.ui.screen.a
  implements View.OnClickListener, RightTopManager.RecevierHotVideoDataListener, ap, dy, com.handmark.pulltorefresh.library.m<HomeView>
{
  private View A;
  private View B;
  private View C;
  private LinearLayout D;
  private boolean E = true;
  private boolean F = false;
  private boolean G = false;
  private fo H = new fo(this);
  private fp I = fp.a;
  private SelfSelectedStockManager J = SelfSelectedStockManager.getInstance();
  private com.android.dazhihui.ui.a.m K = com.android.dazhihui.ui.a.m.a();
  private MyWebView L;
  private PopupWindow M;
  private boolean N = true;
  private HotVideoViewFlow O;
  private wl P;
  private RelativeLayout Q;
  private ImageView R;
  private TranslateAnimation S;
  private TranslateAnimation T;
  private boolean U = false;
  private BroadcastReceiver V = new fl(this);
  private u W = new fm(this);
  private Handler X = new fc(this);
  private final int Y = 0;
  private final int Z = 1;
  private com.android.dazhihui.a.b.m a;
  private com.android.dazhihui.a.b.m b;
  private View c;
  private DzhMainHeader d;
  private AdvertView e;
  private HomeViewRefreshLayout f;
  private RelativeLayout g;
  private AdvertView h;
  private com.android.dazhihui.a.b.m i;
  private TextView j;
  private ImageView k;
  private View l;
  private com.android.dazhihui.ui.widget.dzhrefresh.f m;
  private SelfStock n;
  private StockVo o;
  private IndexTopLayout p;
  private SelfStockSortMenuLayout q;
  private AdvertView r;
  private AdvertView s;
  private AdvertView t;
  private HomeListView u;
  private HomeViewAdapter v;
  private FastDealsView w;
  private View x;
  private View y;
  private View z;
  
  private void a(int paramInt)
  {
    if ((this.S == null) || (this.T == null)) {
      q();
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.Q.startAnimation(this.T);
      return;
    }
    this.Q.startAnimation(this.S);
  }
  
  private void a(String paramString)
  {
    if (this.L == null)
    {
      ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from(getContext()).inflate(2130903092, null);
      this.L = ((MyWebView)localViewGroup.findViewById(2131558818));
      this.L.getSettings().setBuiltInZoomControls(false);
      this.L.setHorizontalFadingEdgeEnabled(false);
      this.L.setHorizontalScrollBarEnabled(false);
      this.L.setHorizontalScrollbarOverlay(false);
      this.L.setVerticalFadingEdgeEnabled(false);
      this.L.setVerticalScrollBarEnabled(false);
      this.L.setVerticalScrollbarOverlay(false);
      TextView localTextView = (TextView)localViewGroup.findViewById(2131558567);
      this.L.setWebViewLoadListener(new fa(this, localTextView));
      ((ImageView)localViewGroup.findViewById(2131558817)).setOnClickListener(new fb(this));
      this.L.setBackgroundColor(-1);
      this.L.setLayerType(2, null);
      this.M = new PopupWindow(localViewGroup, -2, -2, true);
      this.M.setOutsideTouchable(true);
      this.M.setBackgroundDrawable(new ColorDrawable(0));
      this.M.setWindowLayoutMode(-2, -2);
    }
    for (;;)
    {
      this.L.loadUrl(paramString);
      this.M.showAtLocation(this.g, 1, 0, 0);
      return;
      this.L.clearHistory();
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (getActivity() != null)
    {
      if (paramBoolean) {
        getActivity().setRequestedOrientation(-1);
      }
    }
    else {
      return;
    }
    getActivity().setRequestedOrientation(1);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    boolean bool = true;
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
      SelfSelectedStockManager.getInstance().removeBrowseStock(this.o.getCode());
      new AlertDialog.Builder(paramArrayOfByte).setTitle(paramArrayOfByte.getString(2131166406)).setMessage(paramArrayOfByte.getString(2131166278)).setPositiveButton(2131165363, new ew(this, paramArrayOfByte)).setOnCancelListener(new fn(this)).create().show();
      return;
      localObject2 = new q(paramArrayOfByte);
      localObject1 = ((q)localObject2).l();
      paramArrayOfByte = ((q)localObject2).l();
    } while (!((String)localObject1).equals(this.o.getCode()));
    Object localObject1 = new int[8];
    localObject1[0] = ((q)localObject2).b();
    localObject1[1] = ((q)localObject2).b();
    localObject1[2] = ((q)localObject2).e();
    localObject1[3] = ((q)localObject2).h();
    localObject1[4] = ((q)localObject2).h();
    localObject1[5] = ((q)localObject2).h();
    localObject1[6] = ((q)localObject2).h();
    localObject1[7] = ((q)localObject2).h();
    this.o.setmData2939((int[])localObject1);
    int i1 = localObject1[1];
    this.o.setmDecimalLen(i1);
    int i2 = ((q)localObject2).b();
    ((q)localObject2).h();
    int i3 = ((q)localObject2).b();
    Object localObject2 = az.a(localObject1[4], i1);
    String str = com.android.dazhihui.d.b.a(localObject1[5], i1);
    this.o.setRiseLimit((String)localObject2);
    this.o.setDownLimit(str);
    this.o.setStockExtendRank(i3);
    if (i2 == 1) {}
    for (;;)
    {
      this.o.setName(paramArrayOfByte);
      this.o.setLoanable(bool);
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
      this.o.setCp(i1);
      this.w.b();
      return;
      bool = false;
    }
  }
  
  private void h()
  {
    if (this.p != null) {
      this.p.a();
    }
  }
  
  private void i()
  {
    if (this.p != null) {
      this.p.b();
    }
  }
  
  private void j()
  {
    int i1 = 0;
    if (this.v == null) {
      return;
    }
    Vector localVector = this.J.getBrowseStockCodeVector(0, 4);
    int i3 = this.J.getSelfStockVectorSize();
    if ((i3 > 0) || ((localVector != null) && (localVector.size() > 0)))
    {
      ArrayList localArrayList = new ArrayList();
      x localx;
      if (i3 > 0)
      {
        int i2;
        do
        {
          localx = new x(2955);
          localx.c(107);
          localx.c(32897);
          localx.a(this.J.getSelfStockCodeVector(i1, i1 + 50 - 1));
          localx.c("2955-107-自选-我的自选-index=" + i1 + " total=" + i3);
          localArrayList.add(localx);
          i2 = i1 + 50;
          i1 = i2;
        } while (i2 < i3);
      }
      if ((localVector != null) && (localVector.size() > 0))
      {
        localx = new x(2955);
        localx.c(106);
        localx.c(32897);
        localx.a(localVector);
        localx.c("2955-106-自选-最新浏览-" + localVector);
        localArrayList.add(localx);
      }
      this.a = new com.android.dazhihui.a.b.m();
      this.a.a("2955--自选--自动包 NioRequest");
      this.a.a(com.android.dazhihui.a.b.n.a);
      registRequestListener(this.a);
      this.a.a(localArrayList);
      setAutoRequest(this.a);
      sendRequest(this.a);
      return;
    }
    this.a = null;
    setAutoRequest(null);
  }
  
  private void k()
  {
    if (this.v == null) {}
    Vector localVector;
    do
    {
      return;
      localVector = this.v.getRefreshStock();
    } while ((localVector == null) || (localVector.size() <= 0));
    x localx = new x(2978);
    localx.b(2);
    localx.d(88070);
    localx.d(88070);
    localx.a(localVector);
    localx.c("2978-自选-个股推送-" + localVector);
    this.b = new com.android.dazhihui.a.b.m(localx);
    registRequestListener(this.b);
    this.b.a(com.android.dazhihui.a.b.n.b);
    com.android.dazhihui.b.b.a().a(this.b);
    sendRequest(this.b);
  }
  
  private void l()
  {
    if (this.H != null) {
      this.H.removeMessages(2);
    }
    Object localObject = new x(2978);
    ((x)localObject).c("自选解除注册2978");
    ((x)localObject).b(0);
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(com.android.dazhihui.a.b.n.b);
    ((com.android.dazhihui.a.b.m)localObject).d(false);
    com.android.dazhihui.a.g.a().a((h)localObject);
    com.android.dazhihui.b.b.a().b();
  }
  
  private void m()
  {
    Object localObject = oy.a().b();
    int i1;
    if ((localObject != null) && (((AdvertUpPullVo)localObject).data != null) && (((AdvertUpPullVo)localObject).data.upPull != null))
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = ((AdvertUpPullVo)localObject).data.upPull.iterator();
      while (localIterator.hasNext())
      {
        AdvertUpPullVo.AdvertUpPullData localAdvertUpPullData = (AdvertUpPullVo.AdvertUpPullData)localIterator.next();
        if ((localAdvertUpPullData != null) && ("1".equals(localAdvertUpPullData.type))) {
          localArrayList.add(localAdvertUpPullData);
        }
      }
      if (localArrayList.size() > 0) {
        if ((((AdvertUpPullVo)localObject).homeIndex >= 0) && (((AdvertUpPullVo)localObject).homeIndex < localArrayList.size()))
        {
          localObject = (AdvertUpPullVo.AdvertUpPullData)localArrayList.get(((AdvertUpPullVo)localObject).homeIndex);
          this.j.setText(((AdvertUpPullVo.AdvertUpPullData)localObject).content);
          new ex(this, (AdvertUpPullVo.AdvertUpPullData)localObject);
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        this.g.setVisibility(0);
        return;
        n();
        i1 = 1;
        continue;
        n();
        i1 = 1;
        continue;
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.j.setOnClickListener(null);
        this.k.setOnClickListener(null);
        if (this.h.getVisibility() == 0) {
          i1 = 1;
        }
      }
      else
      {
        this.g.setVisibility(8);
        return;
      }
      i1 = 0;
    }
  }
  
  private void n()
  {
    this.j.setVisibility(8);
    this.k.setVisibility(8);
    if (this.g.getVisibility() == 0) {
      this.l.setVisibility(8);
    }
    for (;;)
    {
      this.j.setOnClickListener(null);
      this.k.setOnClickListener(null);
      return;
      this.l.setVisibility(0);
    }
  }
  
  private void o()
  {
    this.M = new PopupWindow();
    this.M.setBackgroundDrawable(new ColorDrawable(0));
    this.M.setFocusable(true);
    this.M.setOutsideTouchable(true);
  }
  
  private void p()
  {
    if (this.o == null) {
      return;
    }
    this.i = new com.android.dazhihui.a.b.m();
    this.i.a("2939静态数据");
    x localx = new x(2939);
    localx.a(this.o.getCode());
    this.i.a(localx);
    if (this.o.getType() == 5)
    {
      localx = new x(2987);
      localx.b(0);
      localx.d(68157440);
      localx.a(new String[] { this.o.getCode() });
      this.i.a(localx);
    }
    registRequestListener(this.i);
    sendRequest(this.i);
  }
  
  private void q()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getActivity().getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f1 = this.Q.getWidth();
    f1 = (localDisplayMetrics.widthPixels + f1) / 2.0F;
    this.S = new TranslateAnimation(-f1, 0.0F, 0.0F, 0.0F);
    this.S.setDuration(500L);
    this.S.setAnimationListener(new fd(this));
    this.T = new TranslateAnimation(0.0F, -f1, 0.0F, 0.0F);
    this.T.setAnimationListener(new fe(this));
    this.T.setDuration(500L);
  }
  
  private void r()
  {
    if (com.android.dazhihui.g.a().A() != null)
    {
      if (this.Q.getVisibility() != 0) {
        break label47;
      }
      if (!this.U)
      {
        this.X.removeMessages(0);
        this.X.sendEmptyMessageDelayed(0, 3000L);
      }
    }
    label47:
    while (this.R.getVisibility() == 0) {
      return;
    }
    this.Q.setVisibility(0);
    this.X.sendEmptyMessageDelayed(0, 3000L);
  }
  
  private void s()
  {
    if (com.android.dazhihui.g.a().A() != null) {
      if ((this.Q != null) && (this.Q.getVisibility() == 0)) {
        if (!this.U) {
          this.X.removeMessages(0);
        }
      }
    }
    while (this.Q == null)
    {
      do
      {
        this.X.sendEmptyMessageDelayed(0, 3000L);
        do
        {
          return;
        } while ((this.R != null) && (this.R.getVisibility() == 0));
        if (this.Q != null) {
          this.Q.setVisibility(0);
        }
      } while (this.X == null);
      this.X.sendEmptyMessageDelayed(0, 3000L);
      return;
    }
    this.Q.setVisibility(4);
  }
  
  public void a()
  {
    this.H.sendEmptyMessage(2);
  }
  
  public void a(SelfStock paramSelfStock)
  {
    this.n = paramSelfStock;
    this.o = new StockVo(paramSelfStock.getName(), paramSelfStock.getCode(), paramSelfStock.getType(), paramSelfStock.isLoan(), paramSelfStock.getSelfLatestPrice(), paramSelfStock.getSelfGrowthRate(), paramSelfStock.getSelfUpDown());
    p();
  }
  
  public void a(HomeViewAdapter.SortMode paramSortMode)
  {
    if (this.v != null) {
      this.v.setSortMode(paramSortMode);
    }
  }
  
  public void a(com.android.dazhihui.ui.widget.stockchart.f paramf)
  {
    if (this.M == null) {
      o();
    }
    View localView = LayoutInflater.from(getActivity()).inflate(2130903113, null);
    Object localObject1 = (RelativeLayout.LayoutParams)localView.findViewById(2131558900).getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject1).width = (this.c.getWidth() * 2 / 3);
    ((RelativeLayout.LayoutParams)localObject1).height = -2;
    localObject1 = (TextView)localView.findViewById(2131558901);
    Object localObject3 = (TextView)localView.findViewById(2131558902);
    Object localObject4 = (TextView)localView.findViewById(2131558903);
    Object localObject5 = (TextView)localView.findViewById(2131558904);
    localObject1 = (TextView)localView.findViewById(2131558905);
    Object localObject2 = (TextView)localView.findViewById(2131558906);
    TextView localTextView1 = (TextView)localView.findViewById(2131558907);
    TextView localTextView2 = (TextView)localView.findViewById(2131558908);
    ((TextView)localObject5).setText("代码： " + this.n.getCode());
    ((TextView)localObject4).setText("名称： " + this.n.getName());
    localObject5 = com.android.dazhihui.ui.delegate.a.a().c();
    if (localObject5 != null)
    {
      localObject4 = ((c)localObject5).c();
      localObject5 = ((c)localObject5).d();
      ((TextView)localObject3).setText("账户： " + (String)localObject4 + " " + (String)localObject5);
    }
    localObject3 = new SpannableString("价格： " + this.w.getDealPrice());
    ((SpannableString)localObject3).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject3).length(), 33);
    ((TextView)localObject2).setText((CharSequence)localObject3);
    localObject2 = new SpannableString("数量： " + this.w.getDealCount());
    ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject2).length(), 33);
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localTextView1.setOnClickListener(new ey(this));
    if (paramf == com.android.dazhihui.ui.widget.stockchart.f.a)
    {
      localTextView2.setText("确认买入");
      localTextView2.setBackgroundColor(getResources().getColor(2131493412));
    }
    for (;;)
    {
      localTextView2.setOnClickListener(new ez(this, paramf));
      this.M.setContentView(localView);
      this.M.setWidth(this.c.getWidth());
      this.M.setHeight(com.android.dazhihui.g.a().n());
      this.M.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493662)));
      this.M.showAtLocation(this.c, 80, 0, 0);
      return;
      localTextView2.setText("确认卖出");
      localTextView2.setBackgroundColor(getResources().getColor(2131493078));
    }
  }
  
  public void a(PullToRefreshBase<HomeView> paramPullToRefreshBase)
  {
    this.G = true;
    b();
  }
  
  public void a(String paramString, int paramInt)
  {
    String str = this.n.getCode();
    str = str.substring(2, str.length());
    ah.a().a(str, paramString, paramInt);
  }
  
  public void b()
  {
    if ((this.H != null) && (getActivity() != null) && (!getActivity().isFinishing()))
    {
      this.H.removeMessages(0);
      this.H.sendEmptyMessageDelayed(0, 200L);
    }
  }
  
  public void b(com.android.dazhihui.ui.widget.stockchart.f paramf)
  {
    this.w.setDealsType(paramf);
    this.w.setVisibility(0);
  }
  
  public void beforeHidden()
  {
    this.E = false;
    a(false);
    l();
    i();
    if (this.X != null) {
      this.X.removeMessages(0);
    }
    super.beforeHidden();
  }
  
  public HomeViewAdapter.SortMode c()
  {
    if (this.v != null) {
      return this.v.getSortMode();
    }
    return HomeViewAdapter.SortMode.SORT_MODE_NONE;
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((getActivity() != null) && (paramy != null))
    {
      this.d.a();
      this.e.g();
      this.f.a(paramy);
      this.v.changeLookFace(paramy);
      this.O.a(paramy);
    }
    switch (ff.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.mLookFace = y.a;
      this.c.setBackgroundColor(getResources().getColor(2131493540));
      this.f.setBackgroundColor(getResources().getColor(2131493552));
      return;
    }
    this.mLookFace = y.b;
    this.c.setBackgroundColor(getResources().getColor(2131493603));
    this.f.setBackgroundColor(getResources().getColor(2131493615));
  }
  
  public int d()
  {
    if (this.v != null) {
      return this.v.getLastColumnType();
    }
    return 0;
  }
  
  public StockVo e()
  {
    return this.o;
  }
  
  public void f()
  {
    if (this.w.getVisibility() == 0)
    {
      this.w.setVisibility(8);
      this.w.c();
    }
  }
  
  public String g()
  {
    this.w.a();
    return ah.a().b();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (getActivity() == null) {}
    label7:
    int i3;
    int i4;
    int i1;
    label162:
    label275:
    label350:
    label394:
    do
    {
      do
      {
        break label7;
        break label7;
        do
        {
          return;
        } while (paramj == null);
        do
        {
          try
          {
            if (!(paramj instanceof o)) {
              break;
            }
            paramh = ((o)paramj).h();
            if (paramh == null) {
              break;
            }
            paramj = paramh.b;
            if (paramh.a != 2955) {
              break label394;
            }
            if (this.G)
            {
              if (this.f != null) {
                this.f.d();
              }
              this.G = false;
            }
            if (paramj == null) {
              break;
            }
            paramh = new q(paramj);
            i2 = paramh.e();
            i3 = paramh.e();
            paramh.e();
            i4 = paramh.e();
            if (i2 == 107)
            {
              if (com.android.dazhihui.g.a().L()) {
                Log.i("s2955", "自选 我的自选-处理返回的2955_107 解析开始len=" + i4);
              }
              paramj = new SelfStock();
              i1 = 0;
              if (i1 < i4)
              {
                if (!paramj.decode(paramh, i2, i3)) {
                  break label705;
                }
                this.J.updateSelfStock(paramj);
                if (this.p == null) {
                  break label705;
                }
                this.p.a(paramj);
                break label705;
              }
              if (com.android.dazhihui.g.a().L()) {
                Log.i("s2955", "自选 我的自选-处理返回的2955_107 解析结束len=" + i4);
              }
              if ((i4 > 0) && (this.v != null) && (this.v.getSortMode() != HomeViewAdapter.SortMode.SORT_MODE_NONE)) {
                this.v.requestSort();
              }
              if (this.v == null) {
                break;
              }
              this.v.notifyDataSetChanged();
              return;
            }
          }
          catch (Exception paramh)
          {
            paramh.printStackTrace();
            return;
          }
        } while (i2 != 106);
        if (com.android.dazhihui.g.a().L()) {
          Log.i("s2955", "自选 最新浏览-处理返回的2955_106 len=" + i4);
        }
        paramj = new SelfStock();
        i1 = 0;
        if (i1 >= i4) {
          break label717;
        }
        if (!paramj.decode(paramh, i2, i3)) {
          break label712;
        }
        this.J.updateBrowseStock(paramj);
        if (this.p == null) {
          break label712;
        }
        this.p.a(paramj);
        break label712;
        if (paramh.a != 2978) {
          break;
        }
        if ((this.I != null) && (this.I.a() > fp.d.a())) {
          l();
        }
      } while (paramj == null);
      paramh = new q(paramj);
    } while (paramh.h() != 88070);
    paramh.e();
    int i2 = paramh.e();
    if (com.android.dazhihui.g.a().L()) {
      Log.i("s2978", "自选 处理返回的2978 count=" + i2);
    }
    for (;;)
    {
      if (i1 < i2)
      {
        paramj = paramh.l();
        i3 = paramh.b();
        i4 = paramh.b();
        int i5 = paramh.e();
        int i6 = paramh.h();
        int i7 = paramh.h();
        int i8 = paramh.h();
        int i9 = paramh.h();
        int i10 = paramh.h();
        if (this.p != null) {
          this.p.a(paramj, i3, i4, i5, i6, i7, i8, i9, i10);
        }
        if (!this.J.updateSelfStock(paramj, i3, i4, i5, i8, i9, i10)) {
          this.J.updateBrowseStock(paramj, i3, i4, i5, i8, i9, i10);
        }
      }
      else
      {
        if ((i2 > 0) && (this.v != null) && (this.v.getSortMode() != HomeViewAdapter.SortMode.SORT_MODE_NONE)) {
          this.v.requestSort();
        }
        if (this.v == null) {
          break;
        }
        this.v.notifyDataSetChanged();
        return;
        if (paramh.a != 2939) {
          break;
        }
        a(paramj);
        return;
        label705:
        i1 += 1;
        break label162;
        label712:
        i1 += 1;
        break label350;
        label717:
        break label275;
        i1 = 0;
        continue;
      }
      i1 += 1;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if ((paramh == this.a) && (this.G))
    {
      this.f.d();
      this.G = false;
    }
    if ((this.I != null) && (this.I.a() == fp.c.a()) && (this.H != null) && (isVisible()) && (this.E) && ((paramh instanceof com.android.dazhihui.a.b.m)))
    {
      b();
      if ((com.android.dazhihui.g.a().L()) && (paramh != null) && ((paramh instanceof com.android.dazhihui.a.b.m)))
      {
        showShortToast(2131166193);
        Log.i("s2978", "handleTimeout " + ((com.android.dazhihui.a.b.m)paramh).v());
      }
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if ((paramh == this.a) && (this.G))
    {
      this.f.d();
      this.G = false;
    }
    if ((this.I != null) && (this.I.a() == fp.c.a()) && (this.H != null) && (isVisible()) && (this.E) && ((paramh instanceof com.android.dazhihui.a.b.m))) {
      showShortToast(2131166192);
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.I = fp.b;
    a(true);
    setAutoRequestPeriod(60000L);
    getActivity().registerReceiver(this.V, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    this.F = true;
    this.d.a(getActivity(), 1, null);
    this.d.e();
    this.y.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.A.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.C.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.t.a(2131493528, 2131493591, 0);
    this.r.setAdvCode(103);
    addAdvert(this.r);
    this.t.setAdvCode(139);
    addAdvert(this.t);
    this.s.setAdvCode(114);
    addAdvert(this.s);
    this.e.setAdvCode(149);
    addAdvert(this.e);
    this.h.setAdvCode(136);
    addAdvert(this.h);
    this.h.setOnAdvertStateChangeListener(new fi(this));
    if (com.android.dazhihui.ui.a.a.c().a(136, false) != null) {
      m();
    }
    this.u.setOverScrollMode(2);
    this.v = new HomeViewAdapter(getActivity(), this);
    this.u.setAdapter(this.v);
    this.u.a(this);
    this.u.setOnChildClickListener(new fj(this));
    this.v.setHolder(this.u);
    this.v.setSelfStockSortMenuLayout(this.q);
    this.q.setHomeViewFragment(this);
    if (AdvertUpPullVo.isNeedUpdate()) {
      oy.a().a(new fk(this));
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.D) {
      startActivity(new Intent(getActivity(), SearchStockScreen.class));
    }
    do
    {
      return;
      if (paramView == this.A)
      {
        com.android.dazhihui.d.n.a("", 1186);
        startActivity(new Intent(getActivity(), SelfStockMoreListScreen.class));
        return;
      }
      if (paramView == this.z)
      {
        startActivity(new Intent(getActivity(), SelfStockEditScreen.class));
        return;
      }
      if (paramView == this.B)
      {
        paramView = new Intent(getActivity(), MoreNewsListScreen.class);
        Bundle localBundle = new Bundle();
        localBundle.putString("url", "1");
        localBundle.putInt("type", 2);
        localBundle.putString("name", getResources().getString(2131166276));
        paramView.putExtras(localBundle);
        startActivity(paramView);
        return;
      }
    } while (paramView != this.C);
    if (HomeViewAdapter.mFirstSuggest == 1)
    {
      d.a().a("first_go_to_suggest", 0);
      HomeViewAdapter.mFirstSuggest = 0;
      d.a().g();
    }
    com.android.dazhihui.d.n.a("", 1237);
    startActivity(new Intent(getActivity(), DecisionScreen.class));
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2)
    {
      a(false);
      startActivity(new Intent(getActivity(), SelfStockLandScapeScreen.class));
      getActivity().overridePendingTransition(0, 0);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramLayoutInflater.inflate(2130903169, paramViewGroup, false);
    this.d = ((DzhMainHeader)this.c.findViewById(2131559251));
    this.e = ((AdvertView)this.c.findViewById(2131559286));
    this.f = ((HomeViewRefreshLayout)this.c.findViewById(2131559287));
    this.O = ((HotVideoViewFlow)this.c.findViewById(2131559288));
    this.f.setOnRefreshListener(this);
    this.f.setScrollingWhileRefreshingEnabled(true);
    this.w = ((FastDealsView)getActivity().findViewById(2131559725));
    this.w.setHolder(this);
    this.p = this.f.getHomeView().getTopLayout();
    this.q = this.f.getHomeView().getSortLayout();
    this.r = this.f.getHomeView().getAdv103();
    this.Q = ((RelativeLayout)this.c.findViewById(2131559250));
    this.R = ((ImageView)this.c.findViewById(2131559249));
    this.R.setVisibility(8);
    if (com.android.dazhihui.g.a().A() != null)
    {
      this.Q.setVisibility(0);
      this.X.sendEmptyMessageDelayed(0, 3000L);
    }
    for (;;)
    {
      this.R.setOnClickListener(new ev(this));
      this.Q.setOnClickListener(new fg(this));
      this.u = this.f.getHomeView().getHomeListView();
      this.m = ((com.android.dazhihui.ui.widget.dzhrefresh.f)this.f.getHeaderLayout());
      this.g = ((RelativeLayout)this.f.findViewById(2131558839));
      this.h = ((AdvertView)this.m.findViewById(2131558575));
      this.j = ((TextView)this.m.findViewById(2131558576));
      this.k = ((ImageView)this.m.findViewById(2131558577));
      this.l = this.m.findViewById(2131558578);
      this.x = paramLayoutInflater.inflate(2130903391, null);
      this.y = paramLayoutInflater.inflate(2130903565, null);
      this.u.addHeaderView(this.x);
      this.u.addFooterView(this.y);
      this.t = ((AdvertView)this.x.findViewById(2131560261));
      this.z = this.x.findViewById(2131560271);
      this.A = this.x.findViewById(2131560268);
      this.B = this.x.findViewById(2131560263);
      this.C = this.x.findViewById(2131560256);
      this.D = ((LinearLayout)this.x.findViewById(2131560274));
      this.s = ((AdvertView)this.y.findViewById(2131561240));
      this.P = new fh(this);
      ah.a().a(this);
      return this.c;
      this.Q.setVisibility(8);
    }
  }
  
  public void onDestroy()
  {
    if ((this.F) && (getActivity() != null))
    {
      getActivity().unregisterReceiver(this.V);
      this.F = false;
    }
    i();
    RightTopManager.getInstance().removeRecevierHotVideoDataListenerList(this);
    SystemSetingScreen.b(this.P);
    super.onDestroy();
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.t != null)) {
      this.t.h();
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.I = fp.d;
    com.android.dazhihui.a.g.a().b(this.W);
    l();
    DzhPushService.e();
    if (this.X != null) {
      this.X.removeMessages(0);
    }
    i();
  }
  
  public void onResume()
  {
    super.onResume();
    com.android.dazhihui.a.g.a().a(this.W);
    this.I = fp.c;
    if (this.v != null) {
      this.v.updateFromSelfStockManager();
    }
    DzhPushService.d();
    if ((this.E) && (this.H != null))
    {
      b();
      this.H.sendEmptyMessageDelayed(2, 100L);
      h();
      a(true);
    }
    SystemSetingScreen.a(this.P);
    RightTopManager.getInstance().addRecevierHotVideoDataListenerList(this);
    r();
  }
  
  public void onStop()
  {
    i();
    this.I = fp.e;
    if (this.J != null)
    {
      this.J.synchronizeSelfStockToDB();
      this.J.saveIndexStockToDB();
    }
    super.onStop();
  }
  
  public void recevierData()
  {
    Object localObject = RightTopManager.getInstance().getData();
    if (localObject != null)
    {
      if (!getActivity().getSharedPreferences("DzhPush", 0).getBoolean("isShowHotVide", true))
      {
        this.p.a(false);
        this.O.setVisibility(8);
      }
    }
    else {
      return;
    }
    ArrayList localArrayList = ((HotVideoVo)localObject).getStocklist();
    localObject = ((HotVideoVo)localObject).getShowType();
    if ((!TextUtils.isEmpty((CharSequence)localObject)) && (localArrayList != null) && (localArrayList.size() > 0))
    {
      if (((String)localObject).equals("1"))
      {
        this.p.a(true);
        this.O.setVisibility(8);
        return;
      }
      if (((String)localObject).equals("2"))
      {
        this.O.setVisibility(0);
        this.p.a(false);
        this.O.setHotvideoData(localArrayList);
        return;
      }
      this.p.a(false);
      this.O.setVisibility(8);
      return;
    }
    this.p.a(false);
    this.O.setVisibility(8);
  }
  
  public void refresh()
  {
    show();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    this.E = paramBoolean;
    if (paramBoolean)
    {
      show();
      return;
    }
    beforeHidden();
  }
  
  public void show()
  {
    this.E = true;
    a(true);
    if (this.v != null) {
      this.v.updateFromSelfStockManager();
    }
    if (this.H != null)
    {
      b();
      this.H.sendEmptyMessageDelayed(2, 500L);
    }
    h();
    s();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */