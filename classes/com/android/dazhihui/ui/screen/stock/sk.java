package com.android.dazhihui.ui.screen.stock;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.a.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter.SortMode;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.HomeListView;
import com.android.dazhihui.ui.widget.IndexBottomWidget;
import com.android.dazhihui.ui.widget.IndexTopLayout;
import com.android.dazhihui.ui.widget.IndexTopWidget;
import com.android.dazhihui.ui.widget.SelfStockRefreshLayout;
import com.android.dazhihui.ui.widget.SelfStockSortMenuLayout;
import com.android.dazhihui.ui.widget.SlideableFrame;
import com.android.dazhihui.ui.widget.StockChartViewflow;
import com.android.dazhihui.ui.widget.adv.AdvertUpPullLayout;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dy;
import com.android.dazhihui.ui.widget.kr;
import com.android.dazhihui.ui.widget.ks;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@SuppressLint({"InflateParams"})
public class sk
  extends com.android.dazhihui.ui.screen.a
  implements View.OnClickListener, v, com.android.dazhihui.ui.a.o, cp, cs, dy, kr, ks
{
  private TextView A;
  private ImageView B;
  private ImageView C;
  private SelfSelectedStockManager D = SelfSelectedStockManager.getInstance();
  private com.android.dazhihui.ui.a.m E = com.android.dazhihui.ui.a.m.a();
  private boolean F = true;
  private sz G = new sz(this);
  private u H = new sl(this);
  private RelativeLayout I;
  private ImageView J;
  private TranslateAnimation K;
  private TranslateAnimation L;
  private boolean M = false;
  private boolean N = true;
  private boolean O = false;
  private Toast P;
  private boolean Q = false;
  private BroadcastReceiver R = new sy(this);
  private ta S = ta.a;
  private Runnable T = new sm(this);
  private Handler U = new sn(this);
  private final int V = 0;
  private final int W = 1;
  public HomeListView a;
  AdvertView b;
  public AdvertView c;
  public AdvertView d;
  public boolean e = true;
  public wl f;
  private com.android.dazhihui.a.b.m g;
  private com.android.dazhihui.a.b.m h;
  private View i;
  private LinearLayout j;
  private IndexTopWidget k;
  private IndexBottomWidget l;
  private SelfStockRefreshLayout m;
  private AdvertUpPullLayout n;
  private SelfStockRefreshLayout o;
  private IndexTopLayout p;
  private SelfStockSortMenuLayout q;
  private HomeViewAdapter r;
  private View s;
  private View t;
  private View u;
  private View v;
  private View w;
  private View x;
  private LinearLayout y;
  private TextView z;
  
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
  
  private void b(int paramInt)
  {
    if ((this.K == null) || (this.L == null)) {
      j();
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.I.startAnimation(this.L);
      return;
    }
    this.I.startAnimation(this.K);
  }
  
  private void e()
  {
    if ((this.l == null) || (this.k != null)) {}
  }
  
  private void f()
  {
    if ((this.l == null) || (this.k != null)) {}
  }
  
  private void g()
  {
    if (this.G != null) {
      this.G.removeMessages(2);
    }
    Object localObject = new x(2978);
    ((x)localObject).c("自选解除注册2978");
    ((x)localObject).b(0);
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(com.android.dazhihui.a.b.n.b);
    ((com.android.dazhihui.a.b.m)localObject).d(false);
    com.android.dazhihui.a.g.a().a((h)localObject);
    b.a().b();
    f();
  }
  
  private void h()
  {
    if (this.r == null) {}
    Vector localVector;
    do
    {
      return;
      localVector = this.r.getRefreshStock();
    } while ((localVector == null) || (localVector.size() <= 0));
    x localx = new x(2978);
    localx.b(2);
    localx.d(88070);
    localx.d(88070);
    localx.a(localVector);
    localx.c("2978-自选-个股推送-" + localVector);
    this.h = new com.android.dazhihui.a.b.m(localx);
    registRequestListener(this.h);
    this.h.a(com.android.dazhihui.a.b.n.b);
    b.a().a(this.h);
    sendRequest(this.h);
  }
  
  private void i()
  {
    int i1 = 0;
    if (this.r == null) {}
    do
    {
      return;
      Vector localVector = this.D.getBrowseStockCodeVector(0, 4);
      int i3 = this.D.getSelfStockVectorSize();
      if ((i3 <= 0) && ((localVector == null) || (localVector.size() <= 0))) {
        break;
      }
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
          localx.a(this.D.getSelfStockCodeVector(i1, i1 + 50 - 1));
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
      this.g = new com.android.dazhihui.a.b.m();
      this.g.a("2955--自选--自动包 NioRequest");
      this.g.a(com.android.dazhihui.a.b.n.a);
      registRequestListener(this.g);
      this.g.a(localArrayList);
      setAutoRequest(this.g);
      sendRequest(this.g);
    } while (!com.android.dazhihui.g.a().L());
    Log.i("s2955", "request2955Protocol");
    return;
    this.g = null;
    setAutoRequest(null);
  }
  
  private void j()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getActivity().getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f1 = this.I.getWidth();
    f1 = (localDisplayMetrics.widthPixels + f1) / 2.0F;
    this.K = new TranslateAnimation(-f1, 0.0F, 0.0F, 0.0F);
    this.K.setDuration(500L);
    this.K.setAnimationListener(new so(this));
    this.L = new TranslateAnimation(0.0F, -f1, 0.0F, 0.0F);
    this.L.setAnimationListener(new sp(this));
    this.L.setDuration(500L);
  }
  
  private void k()
  {
    if (com.android.dazhihui.g.a().A() != null)
    {
      if (this.I.getVisibility() != 0) {
        break label47;
      }
      if (!this.M)
      {
        this.U.removeMessages(0);
        this.U.sendEmptyMessageDelayed(0, 3000L);
      }
    }
    label47:
    while (this.J.getVisibility() == 0) {
      return;
    }
    this.I.setVisibility(0);
    this.U.sendEmptyMessageDelayed(0, 3000L);
  }
  
  private void l()
  {
    if (com.android.dazhihui.g.a().A() != null) {
      if ((this.I != null) && (this.I.getVisibility() == 0)) {
        if (!this.M) {
          this.U.removeMessages(0);
        }
      }
    }
    while (this.I == null)
    {
      do
      {
        this.U.sendEmptyMessageDelayed(0, 3000L);
        do
        {
          return;
        } while ((this.J != null) && (this.J.getVisibility() == 0));
        if (this.I != null) {
          this.I.setVisibility(0);
        }
      } while (this.U == null);
      this.U.sendEmptyMessageDelayed(0, 3000L);
      return;
    }
    this.I.setVisibility(4);
  }
  
  public boolean OnChildClick(View paramView)
  {
    return false;
  }
  
  public void a()
  {
    this.G.sendEmptyMessage(2);
  }
  
  public void a(int paramInt)
  {
    b();
    this.O = true;
    if (this.o != null)
    {
      this.o.removeCallbacks(this.T);
      this.o.postDelayed(this.T, 6000L);
    }
    if ((this.m != null) && (AdvertUpPullVo.isNeedUpdate())) {
      oy.a().a(new sx(this));
    }
  }
  
  public void b()
  {
    if ((this.G != null) && (getActivity() != null) && (!getActivity().isFinishing()))
    {
      this.G.removeMessages(0);
      this.G.sendEmptyMessageDelayed(0, 200L);
    }
  }
  
  public void beforeHidden()
  {
    this.F = false;
    a(false);
    g();
    if (this.U != null) {
      this.U.removeMessages(0);
    }
    f();
    super.beforeHidden();
  }
  
  public boolean c()
  {
    if (this.a != null) {
      return this.a.c();
    }
    return false;
  }
  
  public void c_() {}
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (sq.a[paramy.ordinal()])
      {
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
            return;
            if (this.a != null) {
              this.a.setBackgroundColor(getActivity().getResources().getColor(2131493552));
            }
            if (this.r != null) {
              this.r.changeLookFace(paramy);
            }
            if (this.m != null)
            {
              this.m.setBackgroundColor(getActivity().getResources().getColor(2131493552));
              this.m.a(paramy);
            }
            if (this.n != null) {
              this.n.a(paramy);
            }
            if ((this.k == null) || ((this.l == null) || (this.j != null)))
            {
              this.j.setBackgroundColor(getActivity().getResources().getColor(2131493539));
              this.B.setImageResource(2130838730);
              this.C.setImageResource(2130838727);
              this.z.setTextColor(getResources().getColorStateList(2130838718));
              this.A.setTextColor(getResources().getColorStateList(2130838718));
            }
          } while (this.s == null);
          ((ImageView)this.s.findViewById(2131560272)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838578));
          this.b.setBackgroundResource(2130838740);
          this.u.setBackgroundResource(2130838740);
          this.v.setBackgroundResource(2130838740);
          this.w.setBackgroundResource(2130838740);
          this.x.setBackgroundResource(2130838740);
          ((TextView)this.s.findViewById(2131560259)).setTextColor(getResources().getColor(2131493553));
          this.s.findViewById(2131560254).setBackgroundColor(getResources().getColor(2131493556));
          ((TextView)this.s.findViewById(2131560273)).setTextColor(getResources().getColor(2131493553));
          ((TextView)this.s.findViewById(2131560270)).setTextColor(getResources().getColor(2131493553));
          ((TextView)this.s.findViewById(2131560266)).setTextColor(getResources().getColor(2131493553));
          ((ImageView)this.s.findViewById(2131560258)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838582));
          ((ImageView)this.s.findViewById(2131560265)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838581));
          ((ImageView)this.s.findViewById(2131560269)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838579));
          if (HomeViewAdapter.mFirstSuggest == 0) {
            this.x.findViewById(2131560260).setVisibility(8);
          }
        } while (HomeViewAdapter.mFirstSelfNews != 0);
        this.w.findViewById(2131560267).setVisibility(8);
        return;
        if (this.a != null) {
          this.a.setBackgroundColor(getActivity().getResources().getColor(2131493615));
        }
        if (this.r != null) {
          this.r.changeLookFace(paramy);
        }
        if (this.m != null)
        {
          this.m.setBackgroundColor(getActivity().getResources().getColor(2131493615));
          this.m.a(paramy);
        }
        if (this.n != null) {
          this.n.a(paramy);
        }
        if ((this.k == null) || ((this.l == null) || (this.j != null)))
        {
          this.j.setBackgroundColor(getActivity().getResources().getColor(2131493602));
          this.B.setImageResource(2130838812);
          this.C.setImageResource(2130838809);
          this.z.setTextColor(getResources().getColorStateList(2130838800));
          this.A.setTextColor(getResources().getColorStateList(2130838800));
        }
      } while (this.s == null);
      ((ImageView)this.s.findViewById(2131560272)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838578, -12686651));
      this.b.setBackgroundResource(2130838821);
      this.u.setBackgroundResource(2130838821);
      this.v.setBackgroundResource(2130838821);
      this.w.setBackgroundResource(2130838821);
      this.x.setBackgroundResource(2130838821);
      ((TextView)this.s.findViewById(2131560259)).setTextColor(getResources().getColor(2131493616));
      this.s.findViewById(2131560254).setBackgroundColor(getResources().getColor(2131493619));
      ((TextView)this.s.findViewById(2131560273)).setTextColor(getResources().getColor(2131493616));
      ((TextView)this.s.findViewById(2131560270)).setTextColor(getResources().getColor(2131493616));
      ((TextView)this.s.findViewById(2131560266)).setTextColor(getResources().getColor(2131493616));
      ((ImageView)this.s.findViewById(2131560258)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838582, -12686651));
      ((ImageView)this.s.findViewById(2131560265)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838581, -12686651));
      ((ImageView)this.s.findViewById(2131560269)).setImageDrawable(com.android.dazhihui.d.q.a(getActivity(), 2130838579, -12686651));
      if (HomeViewAdapter.mFirstSuggest == 0) {
        this.x.findViewById(2131560260).setVisibility(8);
      }
    } while (HomeViewAdapter.mFirstSelfNews != 0);
    this.w.findViewById(2131560267).setVisibility(8);
  }
  
  public void createTitleObj(Context paramContext, ct paramct) {}
  
  public boolean d()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return false;
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    if (getActivity() == null) {}
    label7:
    int i3;
    int i4;
    int i1;
    label164:
    label277:
    label352:
    label396:
    do
    {
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
              if (!(paramj instanceof com.android.dazhihui.a.b.o)) {
                break;
              }
              paramh = ((com.android.dazhihui.a.b.o)paramj).h();
              if (paramh == null) {
                break;
              }
              if (paramh.a != 2955) {
                break label396;
              }
              if (this.O)
              {
                if (this.o != null) {
                  this.o.a(false, 1);
                }
                this.O = false;
              }
              paramh = paramh.b;
              if (paramh == null) {
                break;
              }
              paramh = new com.android.dazhihui.a.b.q(paramh);
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
                    break label735;
                  }
                  this.D.updateSelfStock(paramj);
                  if (this.p == null) {
                    break label735;
                  }
                  this.p.a(paramj);
                  break label735;
                }
                if (com.android.dazhihui.g.a().L()) {
                  Log.i("s2955", "自选 我的自选-处理返回的2955_107 解析结束len=" + i4);
                }
                if ((i4 > 0) && (this.r != null) && (this.r.getSortMode() != HomeViewAdapter.SortMode.SORT_MODE_NONE)) {
                  this.r.requestSort();
                }
                if (this.r == null) {
                  break;
                }
                this.r.notifyDataSetChanged();
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
            break label747;
          }
          if (!paramj.decode(paramh, i2, i3)) {
            break label742;
          }
          this.D.updateBrowseStock(paramj);
          if (this.p == null) {
            break label742;
          }
          this.p.a(paramj);
          break label742;
        } while (paramh.a != 2978);
        if ((this.S != null) && (this.S.a() > ta.d.a())) {
          g();
        }
        paramh = paramh.b;
      } while (paramh == null);
      paramh = new com.android.dazhihui.a.b.q(paramh);
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
        if ((this.k != null) && (getActivity() != null) && (IndexTopWidget.a(paramj))) {
          this.k.a(paramj, i4, i8, i6, i7, i10);
        }
        if (this.p != null) {
          this.p.a(paramj, i3, i4, i5, i6, i7, i8, i9, i10);
        }
        if (!this.D.updateSelfStock(paramj, i3, i4, i5, i8, i9, i10)) {
          this.D.updateBrowseStock(paramj, i3, i4, i5, i8, i9, i10);
        }
      }
      else
      {
        if ((i2 > 0) && (this.r != null) && (this.r.getSortMode() != HomeViewAdapter.SortMode.SORT_MODE_NONE)) {
          this.r.requestSort();
        }
        if (this.r == null) {
          break;
        }
        this.r.notifyDataSetChanged();
        return;
        label735:
        i1 += 1;
        break label164;
        label742:
        i1 += 1;
        break label352;
        label747:
        break label277;
        i1 = 0;
        continue;
      }
      i1 += 1;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if ((paramh == this.g) && (this.O))
    {
      if (this.o != null) {
        this.o.a(false, 2);
      }
      this.O = false;
    }
    if ((this.S != null) && (this.S.a() == ta.c.a()) && (this.G != null) && (isVisible()) && (this.F) && ((paramh instanceof com.android.dazhihui.a.b.m)))
    {
      b();
      if ((com.android.dazhihui.g.a().L()) && (paramh != null) && ((paramh instanceof com.android.dazhihui.a.b.m)))
      {
        showShortToast(2131166193);
        Log.i("s2978", "handleTimeout " + ((com.android.dazhihui.a.b.m)paramh).v());
      }
    }
  }
  
  public void j(boolean paramBoolean)
  {
    if ((paramBoolean) && (isVisible()) && (this.F))
    {
      b();
      this.G.sendEmptyMessageDelayed(2, 3000L);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if ((paramh == this.g) && (this.O))
    {
      if (this.o != null) {
        this.o.a(false, 2);
      }
      this.O = false;
    }
    if ((this.S != null) && (this.S.a() == ta.c.a()) && (this.G != null) && (isVisible()) && (this.F) && ((paramh instanceof com.android.dazhihui.a.b.m))) {
      showShortToast(2131166192);
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.S = ta.b;
    a(true);
    setAutoRequestPeriod(60000L);
    com.android.dazhihui.ui.a.m.a().a(this);
    getActivity().registerReceiver(this.R, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    this.Q = true;
    if ((this.m != null) && (AdvertUpPullVo.isNeedUpdate())) {
      oy.a().a(new sw(this));
    }
    if ((this.D.mDataBaseError) && (this.r != null))
    {
      Log.i("sdb", "自选股加载本地数据库错误");
      this.D.loadDataFromLocal();
      this.r.updateFromSelfStockManager();
    }
    Log.i("sdb", "自选onActivityCreated+" + this);
    if (this.p != null) {}
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.y) {
      startActivity(new Intent(getActivity(), SearchStockScreen.class));
    }
    do
    {
      return;
      if (paramView == this.v)
      {
        com.android.dazhihui.d.n.a("", 1186);
        startActivity(new Intent(getActivity(), SelfStockMoreListScreen.class));
        return;
      }
      if (paramView == this.u)
      {
        startActivity(new Intent(getActivity(), SelfStockEditScreen.class));
        return;
      }
      if (paramView == this.w)
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
    } while (paramView != this.x);
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
    if ((paramConfiguration.orientation != 2) || (((MainScreen)getActivity()).a().getCurrentItem() == 0)) {
      return;
    }
    a(false);
    startActivity(new Intent(getActivity(), SelfStockLandScapeScreen.class));
    getActivity().overridePendingTransition(0, 0);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.i = paramLayoutInflater.inflate(2130903164, paramViewGroup, false);
    this.m = ((SelfStockRefreshLayout)this.i.findViewById(2131558779));
    if (this.m != null)
    {
      this.n = new AdvertUpPullLayout(getActivity());
      this.n.setType("1");
      this.n.setAdvertUpPullListener(this.m);
      this.m.setAdvertUpPullView(this.n);
      this.m.b();
    }
    for (paramLayoutInflater = (AdvertView)this.m.findViewById(2131558575);; paramLayoutInflater = null)
    {
      if (paramLayoutInflater != null)
      {
        paramLayoutInflater.setAdvCode(136);
        addAdvert(paramLayoutInflater);
        paramLayoutInflater.setOnAdvertStateChangeListener(new sr(this));
        if ((com.android.dazhihui.ui.a.a.c().a(136, false) != null) && (this.n != null)) {
          this.n.b();
        }
      }
      if (this.m != null) {}
      this.a = ((HomeListView)this.i.findViewById(2131559245));
      this.a.setOverScrollMode(2);
      this.a.setVerticalFadingEdgeEnabled(false);
      this.d = ((AdvertView)this.i.findViewById(2131559246));
      this.I = ((RelativeLayout)this.i.findViewById(2131559250));
      this.J = ((ImageView)this.i.findViewById(2131559249));
      this.J.setVisibility(8);
      if (com.android.dazhihui.g.a().A() != null)
      {
        this.I.setVisibility(0);
        this.U.sendEmptyMessageDelayed(0, 3000L);
      }
      for (;;)
      {
        this.J.setOnClickListener(new ss(this));
        this.I.setOnClickListener(new st(this));
        this.S = ta.a;
        if (this.k != null)
        {
          this.k.setHomeFragment(this);
          addAdvert(this.k.c);
        }
        if (this.l != null) {}
        this.s = LayoutInflater.from(getActivity()).inflate(2130903391, null);
        this.t = LayoutInflater.from(getActivity()).inflate(2130903565, null);
        this.a.addHeaderView(this.s);
        this.a.addFooterView(this.t);
        this.t.setOnClickListener(this);
        this.b = ((AdvertView)this.s.findViewById(2131560261));
        this.b.a(2131493528, 2131493591, 0);
        this.b.setAdvCode(139);
        addAdvert(this.b);
        this.u = this.s.findViewById(2131560271);
        this.v = this.s.findViewById(2131560268);
        this.w = this.s.findViewById(2131560263);
        this.x = this.s.findViewById(2131560256);
        this.y = ((LinearLayout)this.s.findViewById(2131560274));
        this.u.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.d.setAdvCode(103);
        addAdvert(this.d);
        this.c = ((AdvertView)this.t.findViewById(2131561240));
        this.c.setAdvCode(114);
        addAdvert(this.c);
        this.r = new HomeViewAdapter(getActivity(), this);
        this.a.setAdapter(this.r);
        this.a.a(this);
        this.a.setOnChildClickListener(new su(this));
        this.f = new sv(this);
        this.r.setHolder(this.a);
        this.r.setSelfStockSortMenuLayout(this.q);
        this.P = Toast.makeText(getActivity(), "", 0);
        changeLookFace(this.mLookFace);
        Log.i("sdb", "自选onCreateView+" + this);
        return this.i;
        this.I.setVisibility(8);
      }
    }
  }
  
  public void onDestroy()
  {
    com.android.dazhihui.ui.a.m.a().b(this);
    SystemSetingScreen.b(this.f);
    if ((this.Q) && (getActivity() != null))
    {
      getActivity().unregisterReceiver(this.R);
      this.Q = false;
    }
    f();
    super.onDestroy();
  }
  
  public void onDetach()
  {
    if (this.m != null) {
      this.m.setOnLoadListener(null);
    }
    super.onDetach();
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.b != null)) {
      this.b.h();
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onPause()
  {
    this.S = ta.d;
    com.android.dazhihui.a.g.a().b(this.H);
    g();
    super.onPause();
    DzhPushService.e();
    if (this.U != null) {
      this.U.removeMessages(0);
    }
    f();
  }
  
  public void onResume()
  {
    super.onResume();
    SystemSetingScreen.a(this.f);
    this.p.a.c();
    this.e = SelfSelectedStockManager.getBoolean("selfstock_show_latest", DzhApplication.a().getApplicationContext(), "selfstock_show_latest", true);
    com.android.dazhihui.a.g.a().a(this.H);
    this.S = ta.c;
    if (this.r != null) {
      this.r.updateFromSelfStockManager();
    }
    DzhPushService.d();
    if ((this.F) && (this.G != null))
    {
      b();
      this.G.sendEmptyMessageDelayed(2, 100L);
      e();
      a(true);
    }
    k();
  }
  
  public void onStop()
  {
    f();
    this.S = ta.e;
    if (this.D != null)
    {
      this.D.synchronizeSelfStockToDB();
      this.D.saveIndexStockToDB();
    }
    super.onStop();
  }
  
  public void refresh()
  {
    show();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    this.F = paramBoolean;
    if (paramBoolean)
    {
      show();
      return;
    }
    beforeHidden();
  }
  
  public void show()
  {
    this.F = true;
    a(true);
    if (this.r != null) {
      this.r.updateFromSelfStockManager();
    }
    if (this.G != null)
    {
      b();
      this.G.sendEmptyMessageDelayed(2, 500L);
    }
    e();
    l();
    super.show();
  }
  
  public void showShortToast(int paramInt)
  {
    if ((getActivity() == null) || (getActivity().isFinishing())) {}
    String str;
    do
    {
      return;
      str = getActivity().getResources().getString(paramInt);
    } while ((this.P == null) || (TextUtils.isEmpty(str)));
    this.P.setText(str);
    this.P.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */