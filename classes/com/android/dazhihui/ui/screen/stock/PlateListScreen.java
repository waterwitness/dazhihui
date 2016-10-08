package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2990Vo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class PlateListScreen
  extends BaseActivity
  implements cp, cs
{
  private int a = 1;
  private boolean[] b;
  private int[] c;
  private String[] d;
  private byte e = 0;
  private final int f = 30;
  private MarketVo g;
  private String h;
  private DzhHeader i;
  private TableLayoutGroup j;
  private ViewGroup k;
  private TextView l;
  private TextView m;
  private ImageView n;
  private String o = com.android.dazhihui.a.f.B;
  private String p = "bk_" + com.android.dazhihui.a.f.C;
  private com.android.dazhihui.a.b.f q;
  private os r = new os(this);
  
  private int a(int paramInt)
  {
    int i2 = 0;
    int i1 = i2;
    if (paramInt >= 0)
    {
      i1 = i2;
      if (paramInt < this.c.length) {
        i1 = this.c[paramInt];
      }
    }
    return i1;
  }
  
  private void a()
  {
    a(this.j.getContentVisibleBeginPosition(), true);
    b(this.j.getContentVisibleBeginPosition());
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2990);
    arrayOfx[0].c(107);
    arrayOfx[0].d(38393);
    Object localObject = new Vector();
    ((Vector)localObject).add(this.h);
    arrayOfx[0].a((Vector)localObject);
    localObject = "";
    if (this.g != null) {
      localObject = this.g.getName();
    }
    arrayOfx[0].c("市场-板块详情列表-" + (String)localObject + "-4095-自动包-107-moduleCode=" + this.h);
    arrayOfx[1] = new x(2990);
    arrayOfx[1].c(4095);
    arrayOfx[1].d(38393);
    arrayOfx[1].b(this.a);
    arrayOfx[1].b(this.e);
    arrayOfx[1].c(paramInt);
    arrayOfx[1].c(30);
    arrayOfx[1].a(this.h);
    arrayOfx[1].c("市场-板块详情列表-" + (String)localObject + "-4095-自动包-moduleCode=" + this.h + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m(arrayOfx);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    sendRequest((h)localObject);
    if ((paramBoolean) && (this.i != null))
    {
      this.i.setMoreRefresh(true);
      this.i.a();
    }
  }
  
  private void a(String paramString)
  {
    int i2 = 1;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      paramString = localJSONObject.getJSONObject("header");
      localJSONObject = localJSONObject.getJSONObject("data");
      this.r.a = paramString.getString("vs");
      this.r.b = localJSONObject.getString("time");
      this.r.c = localJSONObject.getString("title");
      this.r.d = localJSONObject.getString("urlPath");
      i1 = i2;
      if (this.r.b != null)
      {
        i1 = i2;
        if (this.r.c != null)
        {
          i1 = i2;
          if (!this.r.b.isEmpty())
          {
            i1 = i2;
            if (!this.r.c.isEmpty())
            {
              this.l.setText(this.r.b);
              this.m.setText(this.r.c);
              this.k.setVisibility(0);
              i1 = i2;
            }
          }
        }
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        int i1 = 0;
      }
    }
    if (i1 == 0) {
      this.k.setVisibility(8);
    }
  }
  
  private void b(int paramInt)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2990);
    arrayOfx[0].c(107);
    arrayOfx[0].d(38393);
    Object localObject = new Vector();
    ((Vector)localObject).add(this.h);
    arrayOfx[0].a((Vector)localObject);
    localObject = "";
    if (this.g != null) {
      localObject = this.g.getName();
    }
    arrayOfx[0].c("市场-板块详情列表-" + (String)localObject + "-4095-自动包-107-moduleCode=" + this.h);
    arrayOfx[1] = new x(2990);
    arrayOfx[1].c(4095);
    arrayOfx[1].d(38393);
    arrayOfx[1].b(this.a);
    arrayOfx[1].b(this.e);
    arrayOfx[1].c(paramInt);
    arrayOfx[1].c(30);
    arrayOfx[1].a(this.h);
    arrayOfx[1].c("市场-板块详情列表-" + (String)localObject + "-4095-自动包-moduleCode=" + this.h + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m(arrayOfx);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
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
      a();
      continue;
      startActivity(new Intent(this, SearchStockScreen.class));
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (or.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.j != null)
        {
          this.j.setBackgroundColor(getResources().getColor(2131493542));
          this.j.a(paramy);
        }
      } while (this.i == null);
      this.i.a(paramy);
      return;
      if (this.j != null)
      {
        this.j.setBackgroundColor(getResources().getColor(2131493605));
        this.j.a(paramy);
      }
    } while (this.i == null);
    this.i.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8744;
    paramct.d = this.g.getName();
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof g))
    {
      paramj = (g)paramj;
      if (paramh == null) {}
      do
      {
        do
        {
          return;
        } while (paramh != this.q);
        paramh = paramj.a();
      } while (paramh == null);
      try
      {
        a(new String(paramh, "UTF-8"));
        return;
      }
      catch (UnsupportedEncodingException paramh)
      {
        paramh.printStackTrace();
        return;
      }
    }
    for (;;)
    {
      int i3;
      int i2;
      int i5;
      int i1;
      try
      {
        paramj = (o)paramj;
        if (paramj == null) {
          return;
        }
        paramj = paramj.h();
        if (paramj == null) {
          return;
        }
        if (paramj.a == 2990)
        {
          paramj = paramj.b;
          if (paramj == null) {
            return;
          }
          paramj = new q(paramj);
          i3 = paramj.e();
          int i4 = paramj.h();
          i2 = paramj.e();
          i5 = paramj.e();
          if (paramh.j() != null)
          {
            i1 = ((Integer)paramh.j()).intValue();
            break label546;
            this.j.setLoadingDown(bool);
            label206:
            paramh = new ArrayList();
            Stock2990Vo localStock2990Vo = new Stock2990Vo();
            i2 = 0;
            if (i2 < i5)
            {
              String[] arrayOfString = new String[this.d.length];
              int[] arrayOfInt = new int[this.d.length];
              bool = localStock2990Vo.decode(paramj, i3, i4);
              if (!bool) {
                return;
              }
              localStock2990Vo.getData(this.d, arrayOfString, arrayOfInt, 0);
              mh localmh = new mh();
              localmh.a = arrayOfString;
              localmh.b = arrayOfInt;
              localmh.d = n.e(localStock2990Vo.code);
              localmh.g = localStock2990Vo.type;
              if (localStock2990Vo.ggsm > 0) {
                localmh.i = true;
              }
              localmh.h = localStock2990Vo.isLoanable;
              localmh.k = new Object[] { localStock2990Vo.code };
              if (i3 == 107) {
                localmh.g = 0;
              }
              paramh.add(localmh);
              i2 += 1;
              continue;
            }
            i2 = paramh.size();
            if (i2 <= 0) {
              return;
            }
            if (i3 == 107)
            {
              this.j.setPlateData((mh)paramh.get(0));
              return;
            }
            this.j.a(paramh, i1);
          }
        }
        else
        {
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      finally
      {
        if (this.i != null) {
          this.i.b();
        }
      }
      label546:
      do
      {
        bool = false;
        break;
        i1 = 0;
        if (i3 != 4095) {
          break label206;
        }
      } while (i1 + i5 >= i2);
      boolean bool = true;
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903371);
    this.k = ((ViewGroup)findViewById(2131560204));
    this.l = ((TextView)findViewById(2131560206));
    this.m = ((TextView)findViewById(2131560207));
    this.n = ((ImageView)findViewById(2131560205));
    this.n.setVisibility(8);
    paramBundle = getIntent().getExtras();
    this.g = ((MarketVo)paramBundle.getParcelable("market_vo"));
    this.h = paramBundle.getString("code");
    if (this.g == null)
    {
      finish();
      return;
    }
    this.a = 1;
    this.b = new boolean[] { 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0 };
    this.c = new int[] { 0, 4, 1, 25, 0, 21, 20, 5, 0, 17, 0, 0, 0, 2, 3, 0, 0 };
    this.d = new String[] { "名称", "最新", "涨幅%", "涨速%", "涨跌", "换手%", "量比", "五日涨幅%", "振幅%", "净额", "市盈", "市净", "昨收", "成交量", "成交额", "最高", "最低" };
    this.d[0] = this.g.getName();
    this.i = ((DzhHeader)findViewById(2131558567));
    this.i.a(this, this);
    this.j = ((TableLayoutGroup)findViewById(2131560198));
    this.j.setContinuousLoading(true);
    this.j.setColumnClickable(this.b);
    this.j.setHeaderColumn(this.d);
    this.j.setColumnAlign(Paint.Align.CENTER);
    this.j.setFirstColumnHeadAlign(Paint.Align.CENTER);
    paramBundle = this.j;
    if (this.e == 0) {}
    for (boolean bool = false;; bool = true)
    {
      paramBundle.a(2, bool);
      this.j.setOnLoadingListener(new om(this));
      this.j.setOnContentScrollChangeListener(new on(this));
      this.j.setOnTableLayoutClickListener(new oo(this));
      new StringBuilder(this.o).append(this.h.substring(0, 2)).append("/").append(this.h.substring(this.h.length() - 2)).append("/").append(this.h.substring(2)).append("/").append(this.p).toString();
      this.k.setOnClickListener(new op(this));
      this.n.setOnClickListener(new oq(this));
      changeLookFace(this.mLookFace);
      return;
    }
  }
  
  protected void onResume()
  {
    setAutoRequestPeriod(com.android.dazhihui.ui.a.m.a().u() * 1000);
    a(0, true);
    b(0);
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\PlateListScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */