package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.model.stock.RightTopManager.RecevierHotVideoDataListener;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IndexTopLayout
  extends RelativeLayout
  implements View.OnClickListener, i, IRequestAdapterListener, RightTopManager.RecevierHotVideoDataListener
{
  private static final String[] h = { "上证", "创业" };
  private static final String[] i = { "SH000001", "SZ399006" };
  private Runnable A = new fl(this);
  private Handler B = new Handler();
  private Runnable C = new fm(this);
  private Toast D;
  private HotVideoVo E = null;
  public StockChartViewflow a;
  public View b;
  public GridView c;
  protected RequestAdapter d = new fo(this);
  private Vector<String> e;
  private LayoutInflater f;
  private Context g;
  private CustomGridView j;
  private fq k;
  private View l;
  private View m;
  private View n;
  private FrameLayout o;
  private ImageView p;
  private ImageView q;
  private TextView r;
  private TextView s;
  private View t;
  private View u;
  private StockChartVideoAdapter v;
  private ArrayList<SelfStock> w = null;
  private m x;
  private int y = 5000;
  private Handler z = new Handler();
  
  public IndexTopLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IndexTopLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IndexTopLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.f.inflate(2130903215, this);
    this.e = new Vector();
    this.w = new ArrayList();
    paramInt = 0;
    while (paramInt < i.length)
    {
      this.e.add(i[paramInt]);
      paramAttributeSet = new SelfStock();
      paramAttributeSet.setStockCode(i[paramInt]);
      paramAttributeSet.selfType = 3;
      paramAttributeSet.setLoanable(false);
      this.w.add(paramAttributeSet);
      paramInt += 1;
    }
    this.j = ((CustomGridView)findViewById(2131559492));
    this.k = new fq(this);
    this.j.setAdapter(this.k);
    this.j.setOnItemClickListener(new fn(this));
    this.j.setFullDivider(true);
    this.l = findViewById(2131558582);
    this.m = findViewById(2131559493);
    this.n = findViewById(2131559498);
    this.o = ((FrameLayout)findViewById(2131559491));
    this.b = findViewById(2131559502);
    this.s = ((TextView)findViewById(2131559501));
    this.r = ((TextView)findViewById(2131559497));
    this.q = ((ImageView)findViewById(2131559500));
    this.p = ((ImageView)findViewById(2131559496));
    this.t = findViewById(2131559495);
    this.u = findViewById(2131559499);
    this.t.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.a = new StockChartViewflow(paramContext);
    paramContext = new FrameLayout.LayoutParams(-2, -1);
    this.o.addView(this.a, paramContext);
    this.a.setType(lf.b);
    this.E = RightTopManager.getInstance().getData();
    a(this.E);
    this.j.setWhiteDrawable(new ColorDrawable(getResources().getColor(2131493608)));
    this.D = Toast.makeText(this.g, "", 0);
    paramContext = SelfSelectedStockManager.getInstance().getIndexStockVector();
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      paramContext = paramContext.iterator();
      while (paramContext.hasNext()) {
        a((SelfStock)paramContext.next());
      }
    }
  }
  
  private m getRequest()
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2955);
    arrayOfx[0].c(107);
    arrayOfx[0].c(0);
    arrayOfx[0].a(this.e);
    arrayOfx[0].c("自选上面-指数-沪-深-创");
    return new m(arrayOfx);
  }
  
  public void a()
  {
    if (this.x == null)
    {
      this.x = getRequest();
      this.x.a(com.android.dazhihui.a.b.n.d);
      this.x.e(true);
      registRequestListener(this.x);
    }
    this.z.removeCallbacks(this.A);
    this.z.post(this.A);
    RightTopManager.getInstance().addRecevierHotVideoDataListenerList(this);
    if (this.a.getVisibility() == 0) {
      this.a.b();
    }
  }
  
  public void a(int paramInt)
  {
    if ((this.g == null) || (((this.g instanceof Activity)) && (((Activity)this.g).isFinishing()))) {}
    String str;
    do
    {
      return;
      str = this.g.getResources().getString(paramInt);
    } while ((this.D == null) || (TextUtils.isEmpty(str)));
    this.D.setText(str);
    this.D.show();
  }
  
  public void a(HotVideoVo paramHotVideoVo)
  {
    if (paramHotVideoVo != null)
    {
      paramHotVideoVo = paramHotVideoVo.getStocklist();
      if ((paramHotVideoVo != null) && (paramHotVideoVo.size() > 0))
      {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.v = this.a.getAdapter();
        this.v.setType(1);
        this.c = this.a.getmHotViewFlow();
        this.c.setAdapter(this.v);
        this.v.setHotData(paramHotVideoVo);
        this.a.setHotvideoData(paramHotVideoVo);
        return;
      }
      this.a.setVisibility(8);
      this.b.setVisibility(8);
      return;
    }
    this.a.setVisibility(8);
    this.b.setVisibility(8);
  }
  
  public void a(SelfStock paramSelfStock)
  {
    if (paramSelfStock == null) {}
    for (;;)
    {
      return;
      if ((("SH000001".equals(paramSelfStock.getCode())) || ("SZ399006".equals(paramSelfStock.getCode()))) && (this.k != null) && (this.w != null))
      {
        int i1 = 0;
        while (i1 < this.w.size())
        {
          SelfStock localSelfStock = (SelfStock)this.w.get(i1);
          if ((localSelfStock != null) && (paramSelfStock.getCode().equals(localSelfStock.code)))
          {
            localSelfStock.setDecl(paramSelfStock.getDecLen());
            localSelfStock.setType(paramSelfStock.getType());
            localSelfStock.setZs(paramSelfStock.getClosePrice());
            localSelfStock.setZxData(paramSelfStock.getLatestPrice());
            localSelfStock.setCje(paramSelfStock.getTradeVolumn());
            localSelfStock.setLoanable(false);
            this.k.notifyDataSetChanged();
          }
          i1 += 1;
        }
      }
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (fp.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.j != null) {
          this.j.a(paramy);
        }
        if (this.k != null) {
          this.k.a(paramy);
        }
        if (this.l != null)
        {
          this.l.setBackgroundResource(2130838703);
          this.m.setBackgroundResource(2130838703);
          this.n.setBackgroundResource(2130838703);
          int i1 = getResources().getColor(2131493563);
          this.r.setTextColor(i1);
          this.s.setTextColor(i1);
          this.p.setImageDrawable(com.android.dazhihui.d.q.a(this.g, 2130838587, i1));
          this.q.setImageDrawable(com.android.dazhihui.d.q.a(this.g, 2130838586, i1));
          this.t.setBackgroundResource(2130838704);
          this.u.setBackgroundResource(2130838704);
        }
        if (this.a != null) {
          this.a.a(paramy);
        }
      } while (this.v == null);
      this.v.notifyDataSetChanged();
      return;
      if (this.j != null) {
        this.j.a(paramy);
      }
      if (this.k != null) {
        this.k.a(paramy);
      }
      if (this.l != null)
      {
        this.l.setBackgroundColor(getResources().getColor(2131493608));
        this.m.setBackgroundColor(getResources().getColor(2131493608));
        this.n.setBackgroundColor(getResources().getColor(2131493608));
        this.r.setTextColor(getResources().getColor(2131493626));
        this.s.setTextColor(getResources().getColor(2131493626));
        this.p.setImageDrawable(com.android.dazhihui.d.q.a(this.g, 2130838587));
        this.q.setImageDrawable(com.android.dazhihui.d.q.a(this.g, 2130838586));
        this.t.setBackgroundResource(2130838790);
        this.u.setBackgroundResource(2130838790);
      }
      if (this.a != null) {
        this.a.a(paramy);
      }
    } while (this.v == null);
    this.v.notifyDataSetChanged();
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if ((("SH000001".equals(paramString)) || ("SZ399006".equals(paramString))) && (this.w != null) && (this.k != null))
    {
      paramInt3 = 0;
      while (paramInt3 < this.w.size())
      {
        SelfStock localSelfStock = (SelfStock)this.w.get(paramInt3);
        if ((localSelfStock != null) && (paramString.equals(localSelfStock.code)))
        {
          localSelfStock.setDecl(paramInt2);
          localSelfStock.setType(paramInt1);
          localSelfStock.setZxData(paramInt6);
          localSelfStock.setCje(paramInt8);
          this.k.notifyDataSetChanged();
        }
        paramInt3 += 1;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.B.removeCallbacks(this.C);
      this.B.postAtTime(this.C, 0L);
      return;
    }
    this.a.setVisibility(8);
    this.b.setVisibility(8);
  }
  
  public void b()
  {
    this.z.removeCallbacks(this.A);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i1 = 0;
    try
    {
      if (paramh == this.x)
      {
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh != null) && (paramh.a == 2955))
        {
          paramh = new com.android.dazhihui.a.b.q(paramh.b);
          int i3 = paramh.e();
          int i4 = paramh.e();
          paramh.e();
          int i2 = paramh.e();
          paramj = new ArrayList();
          if ((i3 == 107) && (i4 == 0))
          {
            while (i1 < i2)
            {
              SelfStock localSelfStock = new SelfStock();
              localSelfStock.selfType = 3;
              String str1 = paramh.l();
              String str2 = paramh.l();
              localSelfStock.setStockCode(str1);
              localSelfStock.setStockName(str2);
              localSelfStock.setDecl(paramh.b());
              localSelfStock.setType(paramh.b());
              localSelfStock.setZs(paramh.h());
              paramh.h();
              localSelfStock.setZxData(paramh.h());
              paramh.h();
              paramh.h();
              localSelfStock.setCje(paramh.h());
              localSelfStock.setLoanable(false);
              paramj.add(localSelfStock);
              SelfSelectedStockManager.getInstance().updateIndexStock(localSelfStock);
              i1 += 1;
            }
            if (paramj.size() == h.length)
            {
              this.w = paramj;
              if (this.k != null)
              {
                this.k.notifyDataSetChanged();
                return;
              }
            }
          }
        }
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (g.a().L()) {
      a(2131166193);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    a(2131166192);
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (getContext() != null)) {}
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559495: 
      com.android.dazhihui.d.n.a("", 1148);
      paramView = new Intent(this.g, MoreNewsListScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("url", "1");
      localBundle.putInt("type", 2);
      localBundle.putString("name", this.g.getResources().getString(2131166276));
      paramView.putExtras(localBundle);
      this.g.startActivity(paramView);
      return;
    }
    com.android.dazhihui.d.n.a("", 1186);
    this.g.startActivity(new Intent(this.g, SelfStockMoreListScreen.class));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void recevierData()
  {
    Object localObject = RightTopManager.getInstance().getData();
    if (localObject != null)
    {
      ((HotVideoVo)localObject).getStocklist();
      localObject = ((HotVideoVo)localObject).getShowType();
      if (!this.g.getSharedPreferences("DzhPush", 0).getBoolean("isShowHotVide", true))
      {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
      }
    }
    else
    {
      return;
    }
    if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).equals("1")))
    {
      this.B.removeCallbacks(this.C);
      this.B.postAtTime(this.C, 0L);
      return;
    }
    this.a.setVisibility(8);
    this.b.setVisibility(8);
  }
  
  public void registRequestListener(h paramh)
  {
    this.d.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.d.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.d.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.d.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.d.setAutoRequestPeriod(paramLong);
  }
  
  public void setData(ArrayList<SelfStock> paramArrayList)
  {
    this.w = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexTopLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */