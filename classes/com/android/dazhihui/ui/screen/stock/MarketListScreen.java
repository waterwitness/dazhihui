package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.bf;
import com.android.dazhihui.d.bg;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.DZLHItem;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.market.HHStkVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.HHStkDataView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.hd;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MarketListScreen
  extends BaseActivity
  implements cp, cs
{
  private int a = 0;
  protected int b = 0;
  protected HHStkDataView c;
  protected f d;
  com.android.dazhihui.a.b.m e;
  com.android.dazhihui.a.b.m f;
  com.android.dazhihui.a.b.m g;
  private int h = 0;
  private int i = 33273;
  private boolean[] j;
  private int[] k;
  private String[] l;
  private byte m = 0;
  private int n = com.android.dazhihui.ui.a.m.a().H();
  private DzhHeader o;
  private TableLayoutGroup p;
  private boolean q;
  private Vector<String> r;
  private bg s;
  private MarketVo t;
  private ArrayList<MarketVo> u;
  private DzhHeader v;
  private boolean w = true;
  private ArrayList<DZLHItem> x;
  
  private int a(int paramInt)
  {
    int i2 = 0;
    int i1 = i2;
    if (this.k != null)
    {
      i1 = i2;
      if (paramInt >= 0)
      {
        i1 = i2;
        if (paramInt < this.k.length) {
          i1 = this.k[paramInt];
        }
      }
    }
    return i1;
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      return;
    }
    Toast.makeText(paramContext, paramString, 0).show();
  }
  
  private void a(p paramp)
  {
    paramp = paramp.b;
    if (paramp != null)
    {
      paramp = new q(paramp);
      HHStkVo localHHStkVo = new HHStkVo();
      localHHStkVo.decode(paramp);
      this.c.setData(localHHStkVo);
    }
  }
  
  private void b(int paramInt)
  {
    if (this.t == null) {}
    do
    {
      do
      {
        return;
        if (MarketManager.isHKLimit(this.h)) {
          paramInt = 0;
        }
        if (!this.q) {
          break;
        }
      } while ((this.r == null) || (this.r.size() == 0));
      if (paramInt + 50 < this.r.size()) {}
      for (int i1 = 50;; i1 = this.r.size() - paramInt)
      {
        localObject = new x(2955);
        ((x)localObject).c(this.h);
        ((x)localObject).c(this.i);
        ((x)localObject).a(this.r, paramInt, i1);
        ((x)localObject).c("市场-自动包-子市场名=" + this.t.getName() + "-带代码集合requestID=" + this.h + "-begin=" + paramInt);
        this.f = new com.android.dazhihui.a.b.m((x)localObject);
        registRequestListener(this.f);
        this.f.a(Integer.valueOf(paramInt));
        setAutoRequest(this.f);
        return;
      }
    } while ((this.h == 106) || (this.h == 107));
    Object localObject = new x[1];
    localObject[0] = new x(2955);
    localObject[0].c(this.h);
    localObject[0].c(this.i);
    localObject[0].b(this.a);
    localObject[0].b(this.m);
    localObject[0].c(paramInt);
    localObject[0].c(this.n);
    localObject[0].c("市场-自动包-子市场名=" + this.t.getName() + "-requestID=" + this.h + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m((x[])localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
  }
  
  private void c()
  {
    if (this.h == 39)
    {
      this.g = new com.android.dazhihui.a.b.m(new x(2989));
      registRequestListener(this.g);
      sendRequest(this.g);
    }
  }
  
  private void d()
  {
    if (this.q) {
      a(true);
    }
    for (;;)
    {
      c();
      return;
      b(this.p.getContentVisibleBeginPosition(), true);
    }
  }
  
  private void e()
  {
    ArrayList localArrayList = MarketManager.get().getChildList(this.t.getName());
    Object localObject2 = null;
    int i1 = this.t.getCurrentChild();
    Object localObject1 = localObject2;
    if (localArrayList != null)
    {
      localObject1 = localObject2;
      if (i1 < localArrayList.size()) {
        localObject1 = (MarketVo)localArrayList.get(i1);
      }
    }
    if (localObject1 != null)
    {
      localObject1 = ((MarketVo)localObject1).getName();
      if (!((String)localObject1).equals("沪深A股")) {
        break label80;
      }
      n.a("", 1296);
    }
    label80:
    do
    {
      return;
      if (((String)localObject1).equals("沪深指数"))
      {
        n.a("", 1297);
        return;
      }
      if (((String)localObject1).equals("创业板"))
      {
        n.a("", 1298);
        return;
      }
      if (((String)localObject1).equals("中小板块"))
      {
        n.a("", 1299);
        return;
      }
      if (((String)localObject1).equals("上证A股"))
      {
        n.a("", 1300);
        return;
      }
      if (((String)localObject1).equals("深证A股"))
      {
        n.a("", 1301);
        return;
      }
      if (((String)localObject1).equals("港股通"))
      {
        n.a("", 1302);
        return;
      }
      if (((String)localObject1).equals("上证B股"))
      {
        n.a("", 1303);
        return;
      }
      if (((String)localObject1).equals("深证B股"))
      {
        n.a("", 1304);
        return;
      }
      if (((String)localObject1).equals("深证H股"))
      {
        n.a("", 1305);
        return;
      }
      if (((String)localObject1).equals("两网及退市"))
      {
        n.a("", 1306);
        return;
      }
      if (((String)localObject1).equals("新三板"))
      {
        n.a("", 1307);
        return;
      }
      if (((String)localObject1).equals("上证风险"))
      {
        n.a("", 1308);
        return;
      }
      if (((String)localObject1).equals("上证退市"))
      {
        n.a("", 1309);
        return;
      }
    } while (!((String)localObject1).equals("深证退市"));
    n.a("", 1310);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      startActivity(new Intent(this, SearchStockScreen.class));
      continue;
      d();
    }
  }
  
  public void a()
  {
    a(0, true);
    b(0);
    setAutoRequestPeriod(com.android.dazhihui.ui.a.m.a().u() * 1000);
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    if (this.q) {
      a(paramBoolean);
    }
    for (;;)
    {
      c();
      return;
      b(paramInt, paramBoolean);
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    if ((this.r == null) || (this.r.size() == 0) || (this.t == null)) {}
    do
    {
      return;
      int i1 = 0;
      if (i1 < this.r.size())
      {
        if (i1 + 50 < this.r.size()) {}
        for (int i2 = 50;; i2 = this.r.size() - i1)
        {
          x localx = new x(2955);
          localx.c(this.h);
          localx.c(this.i);
          localx.a(this.r, i1, i2);
          localx.c("市场-子市场名=" + this.t.getName() + "-带代码集合requestID=" + this.h + "-begin=" + i1);
          this.f = new com.android.dazhihui.a.b.m(localx);
          registRequestListener(this.f);
          this.f.a(Integer.valueOf(i1));
          sendRequest(this.f);
          i1 += 50;
          break;
        }
      }
    } while ((!paramBoolean) || (this.o == null));
    this.o.setMoreRefresh(true);
    this.o.a();
  }
  
  public void b()
  {
    if ((this.w) && (this.k != null) && (this.p != null)) {
      this.p.a(this.b);
    }
    this.w = false;
  }
  
  protected void b(int paramInt, boolean paramBoolean)
  {
    if ((this.h == 106) || (this.h == 107) || (this.t == null)) {}
    for (;;)
    {
      return;
      if (MarketManager.isHKLimit(this.h)) {
        paramInt = 0;
      }
      try
      {
        x localx = new x(2955);
        localx.c(this.h);
        localx.c(this.i);
        localx.b(this.a);
        localx.b(this.m);
        localx.c(paramInt);
        localx.c(this.n);
        localx.c("市场-子市场名=" + this.t.getName() + "-requestID=" + this.h + "-begin=" + paramInt);
        this.e = new com.android.dazhihui.a.b.m(localx);
        this.e.a(Integer.valueOf(paramInt));
        registRequestListener(this.e);
        sendRequest(this.e);
        if ((paramBoolean) && (this.o != null))
        {
          this.o.setMoreRefresh(true);
          this.o.a();
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (il.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.p != null)
        {
          this.p.setBackgroundColor(getResources().getColor(2131493542));
          this.p.a(paramy);
        }
      } while (this.o == null);
      this.o.a(paramy);
      return;
      if (this.p != null)
      {
        this.p.setBackgroundColor(getResources().getColor(2131493605));
        this.p.a(paramy);
      }
    } while (this.o == null);
    this.o.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    MarketManager localMarketManager = MarketManager.get();
    if (this.t.isMenu())
    {
      paramct.a = 8776;
      paramct.d = this.t.getName();
      paramct.i = new hd(paramContext, localMarketManager.getChildList(this.t.getName()));
      paramct.j = new ik(this);
    }
    for (;;)
    {
      return;
      paramct.a = 10280;
      paramct.k = paramContext.getResources().getDrawable(2130838123);
      if (this.t != null) {
        if ((this.h != 20296) && (this.h != 20297)) {
          break label148;
        }
      }
      label148:
      for (paramct.d = getResources().getString(2131166024); TextUtils.isEmpty(paramct.d); paramct.d = this.t.getName())
      {
        paramct.d = "市场列表";
        return;
      }
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.v = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i1;
    if ((this.i >>> 12 & 0x1) != 0) {
      i1 = this.t.getCurrentChild();
    }
    for (;;)
    {
      Object localObject1 = new Stock2955Vo();
      if (((paramj instanceof g)) || (this.d == paramh))
      {
        paramh = (g)paramj;
        if (paramh == null) {
          label53:
          return;
        }
        paramh = paramh.a();
      }
      try
      {
        paramh = new String(paramh, "utf-8");
        paramj = new JSONArray(paramh).getJSONObject(0).getJSONObject("header");
        if ((paramj != null) && (!"0".equals(paramj.getString("error"))))
        {
          Toast.makeText(this, getResources().getString(2131165394), 1000).show();
          return;
        }
      }
      catch (JSONException paramh)
      {
        paramh.printStackTrace();
        return;
        paramh = new JSONArray(paramh).getJSONObject(0).getJSONArray("data");
        Object localObject2;
        if (paramh != null)
        {
          if (this.x == null) {
            this.x = new ArrayList();
          }
          this.x.clear();
          if (this.r == null) {
            this.r = new Vector();
          }
          this.r.clear();
          i1 = 0;
          while (i1 < paramh.length())
          {
            localObject2 = paramh.getJSONObject(i1);
            paramj = ((JSONObject)localObject2).getString("stockcode");
            localObject1 = ((JSONObject)localObject2).getString("stockname");
            localObject2 = ((JSONObject)localObject2).getString("sszt");
            this.r.add(paramj);
            paramj = new DZLHItem(paramj, (String)localObject1, (String)localObject2);
            this.x.add(paramj);
            i1 += 1;
          }
          d();
          return;
        }
        Toast.makeText(this, getResources().getString(2131165394), 1000).show();
        return;
        if (paramh == this.g)
        {
          paramh = (o)paramj;
          if (paramh == null) {
            break label53;
          }
          a(paramh.h());
          return;
        }
        paramj = (o)paramj;
        if (paramj == null) {
          break label53;
        }
        paramj = paramj.h();
        int i3;
        int i4;
        int i2;
        int i5;
        if (paramj.a == 2955)
        {
          paramj = paramj.b;
          if (paramj != null)
          {
            paramj = new q(paramj);
            i3 = paramj.e();
            i4 = paramj.e();
            i2 = paramj.e();
            i5 = paramj.e();
            if (!this.q) {
              if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + i5 >= i2)) {
                break label737;
              }
            }
          }
        }
        label737:
        for (boolean bool = true;; bool = false)
        {
          this.p.setLoadingDown(bool);
          localObject2 = new ArrayList();
          i2 = 0;
          while (i2 < i5)
          {
            String[] arrayOfString = new String[this.l.length];
            int[] arrayOfInt = new int[this.l.length];
            ((Stock2955Vo)localObject1).decode(paramj, i3, i4);
            ((Stock2955Vo)localObject1).getData(this.l, arrayOfString, arrayOfInt, i1);
            mh localmh = new mh();
            if (this.x != null)
            {
              arrayOfString[3] = ((DZLHItem)this.x.get(i2)).getSszt();
              arrayOfInt[3] = 39936;
            }
            localmh.a = arrayOfString;
            localmh.b = arrayOfInt;
            localmh.d = n.e(((Stock2955Vo)localObject1).code);
            localmh.g = ((Stock2955Vo)localObject1).type;
            if (((Stock2955Vo)localObject1).ggsm > 0) {
              localmh.i = true;
            }
            if (i3 == 10) {
              localmh.j = true;
            }
            localmh.h = ((Stock2955Vo)localObject1).isLoanable;
            localmh.k = new Object[] { ((Stock2955Vo)localObject1).code };
            ((List)localObject2).add(localmh);
            i2 += 1;
          }
          i1 = 0;
          if (paramh.j() != null) {
            i1 = ((Integer)paramh.j()).intValue();
          }
          if (i3 == 101) {
            i1 = 0;
          }
          this.p.a((List)localObject2, i1);
          b();
          if (this.o == null) {
            break;
          }
          this.o.b();
          return;
        }
        i1 = 0;
      }
      catch (Exception paramh) {}
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.o != null) {
      this.o.b();
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903275);
    this.p = ((TableLayoutGroup)findViewById(2131559838));
    this.o = ((DzhHeader)findViewById(2131559836));
    this.o.setOnHeaderButtonClickListener(this);
    this.c = ((HHStkDataView)findViewById(2131559837));
    MarketManager localMarketManager = MarketManager.get();
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (this.t == null))
    {
      this.t = ((MarketVo)paramBundle.getParcelable("market_vo"));
      this.a = paramBundle.getInt("sequenceID", 0);
      this.m = paramBundle.getByte("SortType", (byte)0).byteValue();
    }
    for (int i1 = paramBundle.getInt("child_index", 0);; i1 = 0)
    {
      paramBundle = this.t;
      if (this.t.isMenu())
      {
        this.u = localMarketManager.getChildList(this.t.getName());
        if ((i1 > 0) && (this.u != null) && (i1 < this.u.size())) {
          this.t.setCurrentChild(i1);
        }
        i1 = this.t.getCurrentChild();
        if ((this.u != null) && (i1 < this.u.size())) {
          paramBundle = (MarketVo)this.u.get(i1);
        }
      }
      for (;;)
      {
        if (paramBundle.hasStockList())
        {
          this.r = new Vector();
          ArrayList localArrayList = localMarketManager.getStockCodeList(paramBundle.getName());
          if (localArrayList != null) {
            this.r.addAll(localArrayList);
          }
          this.q = true;
        }
        for (;;)
        {
          this.h = paramBundle.getId();
          if (MarketManager.isHKLimit(this.h)) {
            this.n = 20;
          }
          this.s = bf.a(this.t.getName());
          if (this.s == null) {
            this.s = bf.a(this.t.getName() + paramBundle.getName());
          }
          if (this.s == null) {
            this.s = bf.a();
          }
          if (this.s == null) {
            break label586;
          }
          this.i = this.s.e();
          paramBundle = this.s.a();
          this.l = new String[paramBundle.length];
          i1 = 0;
          while (i1 < paramBundle.length)
          {
            this.l[i1] = paramBundle[i1];
            i1 += 1;
          }
          this.q = false;
          this.r = null;
        }
        paramBundle = this.s.b();
        this.j = new boolean[paramBundle.length];
        i1 = 0;
        while (i1 < paramBundle.length)
        {
          this.j[i1] = paramBundle[i1];
          i1 += 1;
        }
        this.k = this.s.c();
        if ((this.k != null) && (this.a != 0))
        {
          i1 = 0;
          if (i1 < this.k.length) {
            if (this.a == this.k[i1]) {
              this.b = i1;
            }
          }
        }
        for (i1 = 1;; i1 = 0)
        {
          if (i1 == 0)
          {
            this.b = this.s.d();
            this.a = a(this.b);
          }
          label586:
          label764:
          label788:
          boolean bool;
          if (this.t.isMenu())
          {
            i1 = this.t.getCurrentChild();
            localMarketManager.getChildList(this.t.getName());
            paramBundle = ((MarketVo)this.u.get(i1)).getName();
            this.l[0] = paramBundle;
            if ("沪深指数".equals(paramBundle)) {
              this.j = new boolean[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            }
            this.o.a(this, this);
            if (this.q) {
              break label993;
            }
            this.p.setContinuousLoading(true);
            this.p.setColumnClickable(this.j);
            this.p.setHeaderColumn(this.l);
            this.p.setColumnAlign(Paint.Align.CENTER);
            this.p.setFirstColumnHeadAlign(Paint.Align.CENTER);
            paramBundle = this.p;
            i1 = this.b;
            if (this.m != 0) {
              break label1004;
            }
            bool = false;
            label851:
            paramBundle.a(i1, bool);
            this.p.setOnLoadingListener(new ig(this));
            this.p.setOnContentScrollChangeListener(new ih(this));
            if (MarketManager.isHKLimit(this.h)) {
              this.p.setOnContentScrollBottomListener(new ii(this));
            }
            this.p.setOnTableLayoutClickListener(new ij(this));
            if (this.h != 39) {
              break label1010;
            }
            this.c.setVisibility(0);
          }
          for (;;)
          {
            changeLookFace(this.mLookFace);
            return;
            i1 += 1;
            break;
            if (TextUtils.isEmpty(this.t.getName())) {
              break label764;
            }
            this.l[0] = this.t.getName();
            break label764;
            label993:
            this.p.setContinuousLoading(false);
            break label788;
            label1004:
            bool = true;
            break label851;
            label1010:
            this.c.setVisibility(8);
          }
        }
      }
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.o != null) {
      this.o.b();
    }
  }
  
  protected void onResume()
  {
    a();
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MarketListScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */