package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.stock.FundStockChartScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class a
  extends l
{
  private String[] R = null;
  private String[] S = null;
  private int T = 1;
  private int U = 0;
  private int V = 1;
  private MarketVo W;
  private int X = 0;
  private com.android.dazhihui.ui.a.m Y = com.android.dazhihui.ui.a.m.a();
  private int Z = 0;
  protected TableLayoutGroup a;
  boolean[] b = { 0, 1, 0, 0, 0, 0 };
  boolean[] c = { 0, 1, 0, 0, 0, 0 };
  private View d;
  private int e = 0;
  
  public static a a(Bundle paramBundle)
  {
    a locala = new a();
    locala.setArguments(paramBundle);
    return locala;
  }
  
  private void a()
  {
    Object localObject = getActivity();
    if ((this.d == null) || (localObject == null)) {
      return;
    }
    localObject = getActivity().getIntent().getExtras();
    if ((localObject != null) && (this.W == null)) {
      this.W = ((MarketVo)((Bundle)localObject).getParcelable("market_vo"));
    }
    if (this.W == null)
    {
      ((ViewGroup)this.d).removeAllViews();
      n.c("market list screen NULL");
      return;
    }
    this.X = this.W.getId();
    this.R = getResources().getStringArray(2131361814);
    this.S = getResources().getStringArray(2131361815);
    this.a = ((TableLayoutGroup)this.d.findViewById(2131559838));
    this.a.setLayerType(1, null);
    h(this.X);
    if (this.W != null)
    {
      this.R[0] = this.W.getName();
      this.S[0] = this.W.getName();
    }
    if (this.e == 4)
    {
      this.a.setHeaderColumn(this.S);
      this.a.setColumnClickable(this.c);
      a(0, true);
      if ((localObject != null) && (this.W == null)) {
        this.W = ((MarketVo)((Bundle)localObject).getParcelable("market_vo"));
      }
      this.X = this.W.getId();
      this.a.setColumnAlign(Paint.Align.CENTER);
      this.a.setFirstColumnHeadAlign(Paint.Align.CENTER);
      this.a.setContinuousLoading(true);
      localObject = this.a;
      if (this.Z != 0) {
        break label376;
      }
    }
    label376:
    for (boolean bool = false;; bool = true)
    {
      ((TableLayoutGroup)localObject).a(1, bool);
      this.a.setOnLoadingListener(new b(this));
      this.a.setOnContentScrollChangeListener(new c(this));
      this.a.setOnTableLayoutClickListener(new d(this));
      changeLookFace(this.mLookFace);
      return;
      this.a.setHeaderColumn(this.R);
      this.a.setColumnClickable(this.b);
      break;
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.W == null) {}
    do
    {
      return;
      Object localObject = new x(2331);
      ((x)localObject).c(0);
      ((x)localObject).c(paramInt);
      ((x)localObject).c(this.Y.H());
      ((x)localObject).b(this.V);
      ((x)localObject).b(this.T);
      ((x)localObject).b(this.U);
      ((x)localObject).c("市场-基金市场-" + this.W.getName() + "-requestID=" + this.X + "-begin=" + paramInt);
      localObject = new com.android.dazhihui.a.b.m((x)localObject);
      ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
      registRequestListener((h)localObject);
      sendRequest((h)localObject);
      i(paramInt);
    } while (!paramBoolean);
    d();
  }
  
  private void a(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Intent localIntent = new Intent(getActivity(), FundStockChartScreen.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("code", paramString1);
    localBundle.putString("name", paramString2);
    localBundle.putStringArray("values", paramArrayOfString);
    if (this.e == 4) {
      localBundle.putBoolean("is_currency", true);
    }
    localIntent.putExtras(localBundle);
    startActivity(localIntent);
  }
  
  private void g(int paramInt)
  {
    this.U = paramInt;
  }
  
  private void h(int paramInt)
  {
    this.e = (paramInt - 1);
    switch (this.e)
    {
    default: 
      return;
    case 0: 
      g(1);
      return;
    case 1: 
      g(2);
      return;
    case 2: 
      g(3);
      return;
    case 3: 
      g(4);
      return;
    }
    g(5);
  }
  
  private void i(int paramInt)
  {
    if (this.W == null) {
      return;
    }
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j == 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    Object localObject = new x(2331);
    ((x)localObject).c(0);
    ((x)localObject).c(paramInt);
    ((x)localObject).c(this.Y.H());
    ((x)localObject).b(this.V);
    ((x)localObject).b(this.T);
    ((x)localObject).b(this.U);
    ((x)localObject).c("市场-自动包-基金市场-" + this.W.getName() + "-requestID=" + this.X + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
  }
  
  public void a(int paramInt) {}
  
  public void a(boolean paramBoolean)
  {
    if ((this.d != null) && (paramBoolean)) {
      this.d.scrollTo(0, 0);
    }
    refresh();
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (e.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.setBackgroundColor(getActivity().getResources().getColor(2131493542));
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.setBackgroundColor(getActivity().getResources().getColor(2131493605));
    this.a.a(paramy);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramj = (o)paramj;
      if (paramj == null) {
        return;
      }
      paramj = paramj.h();
      int j = ((Integer)paramh.j()).intValue();
      if ((paramj != null) && (paramj.a == 2331))
      {
        paramh = paramj.b;
        if ((paramh != null) && (this.a != null))
        {
          paramh = new q(paramh);
          int k = paramh.b();
          if (k != this.e + 1)
          {
            a(j, true);
            return;
          }
          paramh.e();
          int i = paramh.e() - 1;
          paramj = new ArrayList();
          if ((k != 5) && (this.e != 4)) {}
          while (i >= 0)
          {
            Object localObject1 = new int[6];
            Object localObject2 = new mh();
            String str1 = paramh.l();
            String str2 = paramh.l();
            localObject1[0] = 39936;
            k = paramh.h();
            int m = paramh.h();
            int n = paramh.h();
            paramh.h();
            int i1 = paramh.h();
            paramh.h();
            paramh.h();
            paramh.h();
            paramh.h();
            paramh.h();
            String str3 = com.android.dazhihui.d.b.a(m, 4);
            localObject1[1] = com.android.dazhihui.d.b.h(m, i1);
            String str4 = com.android.dazhihui.d.b.b(m, i1);
            localObject1[2] = localObject1[1];
            String str5 = com.android.dazhihui.d.b.a(n, 4);
            localObject1[3] = -1;
            String str6 = "" + k;
            localObject1[4] = -1;
            String str7 = com.android.dazhihui.d.b.a(i1, 4);
            localObject1[5] = -1;
            ((mh)localObject2).a = new String[] { str2, str3, str4, str5, str6, str7 };
            ((mh)localObject2).b = ((int[])localObject1);
            ((mh)localObject2).d = n.e(str1);
            ((mh)localObject2).k = new Object[] { str1 };
            paramj.add(localObject2);
            i -= 1;
            continue;
            if (this.e == 4) {
              while (i >= 0)
              {
                localObject1 = new mh();
                localObject2 = paramh.l();
                str1 = paramh.l();
                k = paramh.h();
                m = paramh.h();
                n = paramh.h();
                paramh.h();
                i1 = paramh.h();
                int i2 = paramh.h();
                ((mh)localObject1).a = new String[] { str1, com.android.dazhihui.d.b.a(m, 4), com.android.dazhihui.d.b.a(n, 4), com.android.dazhihui.d.b.a(i1, 4), com.android.dazhihui.d.b.a(i2, 4), "" + k };
                ((mh)localObject1).b = new int[] { 39936, -1, -1, -1, -1, -1 };
                ((mh)localObject1).d = n.e((String)localObject2);
                ((mh)localObject1).h = false;
                ((mh)localObject1).k = new Object[] { localObject2 };
                paramj.add(localObject1);
                i -= 1;
              }
            }
            return;
          }
          this.a.a(paramj, j);
        }
      }
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    finally
    {
      e();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if ((paramBundle != null) && (this.W == null)) {
      this.W = ((MarketVo)paramBundle.getParcelable("market_vo"));
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = paramLayoutInflater.inflate(2130903277, null);
    a();
    return this.d;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.a != null)
    {
      a(this.a.getContentVisibleBeginPosition(), true);
      return;
    }
    a(0, true);
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
  
  public void show()
  {
    refresh();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */