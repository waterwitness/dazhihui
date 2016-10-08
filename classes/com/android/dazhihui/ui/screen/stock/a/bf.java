package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import com.android.dazhihui.ui.model.stock.Stock2990Vo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class bf
  extends l
{
  private static final int[] d = { 0, 1, 0, 25, 21, 20, 39, 5, 17 };
  private byte R = 0;
  private final int S = 30;
  private TableLayoutGroup T;
  private Drawable U = null;
  private Drawable V = null;
  private Drawable W = null;
  private float X;
  private float Y;
  private float Z;
  int a = 1;
  private byte aa = 0;
  private MarketVo ab;
  private boolean ac = true;
  private View b;
  private int c = 1;
  private String[] e;
  
  public static bf a(Bundle paramBundle)
  {
    bf localbf = new bf();
    localbf.setArguments(paramBundle);
    return localbf;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    int j = 105;
    if (this.ab == null) {
      return;
    }
    int i = j;
    switch (this.aa)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      Object localObject = new x(2990);
      ((x)localObject).c(i);
      ((x)localObject).d(1315896);
      ((x)localObject).b(this.c);
      ((x)localObject).b(this.R);
      ((x)localObject).c(paramInt);
      ((x)localObject).c(30);
      ((x)localObject).c("市场-板块-" + this.ab.getName() + "-begin=" + paramInt);
      localObject = new com.android.dazhihui.a.b.m((x)localObject);
      ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
      registRequestListener((h)localObject);
      sendRequest((h)localObject);
      h(paramInt);
      if (!paramBoolean) {
        break;
      }
      d();
      return;
      i = 113;
      continue;
      i = 114;
    }
  }
  
  private int g(int paramInt)
  {
    int j = 0;
    int i = j;
    if (paramInt >= 0)
    {
      i = j;
      if (paramInt < d.length) {
        i = d[paramInt];
      }
    }
    return i;
  }
  
  private void h(int paramInt)
  {
    int j = 105;
    if (this.ab == null) {
      return;
    }
    int i = j;
    switch (this.aa)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      Object localObject = new x(2990);
      ((x)localObject).c(i);
      ((x)localObject).d(1315896);
      ((x)localObject).b(this.c);
      ((x)localObject).b(this.R);
      ((x)localObject).c(paramInt);
      ((x)localObject).c(30);
      ((x)localObject).c("市场-自动包-板块-" + this.ab.getName() + "-begin=" + paramInt);
      localObject = new com.android.dazhihui.a.b.m((x)localObject);
      ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
      registRequestListener((h)localObject);
      i = com.android.dazhihui.ui.a.m.a().u();
      paramInt = i;
      if (i == 0) {
        paramInt = 5;
      }
      setAutoRequestPeriod(paramInt * 1000);
      setAutoRequest((h)localObject);
      return;
      i = 113;
      continue;
      i = 114;
    }
  }
  
  public void a()
  {
    boolean bool = true;
    Object localObject = getActivity();
    if ((this.b == null) || (localObject == null)) {
      return;
    }
    localObject = getActivity().getIntent().getExtras();
    if ((localObject != null) && (this.ab == null)) {
      this.ab = ((MarketVo)((Bundle)localObject).getParcelable("market_vo"));
    }
    if (this.ab == null)
    {
      ((ViewGroup)this.b).removeAllViews();
      n.c("market list screen NULL");
      return;
    }
    this.T = ((TableLayoutGroup)this.b.findViewById(2131560198));
    this.T.setLayerType(1, null);
    this.e = getResources().getStringArray(2131361884);
    this.V = new ColorDrawable(getResources().getColor(2131493561));
    this.U = new ColorDrawable(getResources().getColor(2131493558));
    this.W = new ColorDrawable(getResources().getColor(2131493560));
    this.X = getResources().getDimension(2131230793);
    this.Y = getResources().getDimension(2131230899);
    this.Z = getResources().getDimension(2131230901);
    label264:
    int i;
    if ("板块综合".equals(this.ab.getName()))
    {
      this.aa = 0;
      switch (this.aa)
      {
      default: 
        this.c = ((Bundle)localObject).getInt("plate_list_sequence", 1);
        if (this.c != 0) {
          i = 1;
        }
        break;
      }
    }
    for (;;)
    {
      if (i < d.length)
      {
        if (this.c == d[i]) {
          this.a = i;
        }
      }
      else
      {
        this.T.setContinuousLoading(true);
        this.T.setFirstColumnAlign(Paint.Align.LEFT);
        this.T.setColumnAlign(Paint.Align.CENTER);
        this.T.setColumnClickable(new boolean[] { 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 });
        this.T.setColumnDrawable(new boolean[] { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 });
        this.T.setHeaderColumn(this.e);
        localObject = this.T;
        i = this.a;
        if (this.R == 0) {
          bool = false;
        }
        ((TableLayoutGroup)localObject).a(i, bool);
        this.T.setOnLoadingListener(new bg(this));
        this.T.setOnContentScrollChangeListener(new bh(this));
        this.T.setOnTableLayoutClickListener(new bi(this));
        this.T.setOnDrawContentCellCallBack(new bj(this));
        changeLookFace(this.mLookFace);
        return;
        if ("行业板块".equals(this.ab.getName()))
        {
          this.aa = 1;
          break;
        }
        if (!"概念板块".equals(this.ab.getName())) {
          break;
        }
        this.aa = 2;
        break;
        this.e[0] = "板块综合";
        n.a("", 1396);
        break label264;
        this.e[0] = "行业板块";
        n.a("", 1397);
        break label264;
        this.e[0] = "概念板块";
        n.a("", 1398);
        break label264;
      }
      i += 1;
    }
  }
  
  public void a(int paramInt) {}
  
  public void a(boolean paramBoolean)
  {
    if ((this.b != null) && (paramBoolean)) {
      this.b.scrollTo(0, 0);
    }
    refresh();
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (bk.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        this.V = new ColorDrawable(getResources().getColor(2131493561));
        this.U = new ColorDrawable(getResources().getColor(2131493558));
        this.W = new ColorDrawable(getResources().getColor(2131493560));
        if (this.b != null) {
          this.T.setBackgroundColor(getActivity().getResources().getColor(2131493550));
        }
      } while (this.T == null);
      this.T.setBackgroundColor(getActivity().getResources().getColor(2131493542));
      this.T.a(paramy);
      return;
      this.V = new ColorDrawable(getResources().getColor(2131493624));
      this.U = new ColorDrawable(getResources().getColor(2131493621));
      this.W = new ColorDrawable(getResources().getColor(2131493623));
      if (this.b != null) {
        this.T.setBackgroundColor(getActivity().getResources().getColor(2131493613));
      }
    } while (this.T == null);
    this.T.setBackgroundColor(getActivity().getResources().getColor(2131493605));
    this.T.a(paramy);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        paramj = (o)paramj;
        if (paramj == null) {
          return;
        }
        paramj = paramj.h();
        if ((paramj != null) && (paramj.a == 2990))
        {
          paramj = paramj.b;
          if ((paramj != null) && (this.T != null))
          {
            paramj = new q(paramj);
            int j = paramj.e();
            int k = paramj.h();
            int n = paramj.e();
            int m = paramj.e();
            if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + m >= n)) {
              break label401;
            }
            if (m >= 30) {
              break label407;
            }
            Stock2990Vo localStock2990Vo;
            ArrayList localArrayList;
            mh localmh;
            String[] arrayOfString;
            int[] arrayOfInt;
            if (((Integer)paramh.j()).intValue() + 30 < n)
            {
              break label407;
              this.T.setLoadingDown(bool);
              localStock2990Vo = new Stock2990Vo();
              localArrayList = new ArrayList();
              if (i >= m) {
                continue;
              }
              localmh = new mh();
              arrayOfString = new String[this.e.length];
              arrayOfInt = new int[this.e.length];
              bool = localStock2990Vo.decode(paramj, j, k);
              if (bool) {}
            }
            else
            {
              bool = false;
              continue;
            }
            localStock2990Vo.getData(this.e, arrayOfString, arrayOfInt, 0);
            localmh.a = arrayOfString;
            localmh.b = arrayOfInt;
            localmh.d = n.e(localStock2990Vo.code);
            localmh.c = true;
            localmh.k = new Object[] { localStock2990Vo.code, Integer.valueOf(localStock2990Vo.cfg) };
            localArrayList.add(localmh);
            i += 1;
            continue;
            if (paramh.j() != null)
            {
              i = ((Integer)paramh.j()).intValue();
              this.T.a(localArrayList, i);
              if (this.ac) {
                this.T.a(this.a);
              }
              this.ac = false;
            }
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
      label401:
      boolean bool = false;
      continue;
      label407:
      bool = true;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if ((paramBundle != null) && (this.ab == null)) {
      this.ab = ((MarketVo)paramBundle.getParcelable("market_vo"));
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.b = paramLayoutInflater.inflate(2130903368, null);
    a();
    return this.b;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onResume()
  {
    refresh();
    super.onResume();
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.T != null)
    {
      a(this.T.getContentVisibleBeginPosition(), true);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */