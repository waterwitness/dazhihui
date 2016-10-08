package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class OptionListActivity
  extends BaseActivity
  implements View.OnClickListener, cp, cs
{
  private int A = 2;
  private String a;
  private String b;
  private int c;
  private int d;
  private int e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private View k;
  private DzhHeader l = null;
  private TextView m;
  private TextView n;
  private boolean[] o = { 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1 };
  private String[] p;
  private TableLayoutGroup q;
  private com.android.dazhihui.a.b.m r;
  private View s;
  private int t = 6;
  private int u = 8;
  private byte v = 0;
  private int w = 20;
  private final int x = 0;
  private final int y = 1;
  private final int z = 2;
  
  private void a(int paramInt1, int paramInt2)
  {
    x[] arrayOfx = new x[3];
    arrayOfx[0] = new x(2939);
    arrayOfx[0].a(this.a);
    arrayOfx[1] = new x(2940);
    arrayOfx[1].a(this.a);
    arrayOfx[2] = new x(2987);
    arrayOfx[2].b(1);
    arrayOfx[2].d(-1407975213);
    arrayOfx[2].a(this.a);
    arrayOfx[2].b(this.u);
    arrayOfx[2].b(this.v);
    arrayOfx[2].b(this.A);
    arrayOfx[2].c(paramInt1);
    arrayOfx[2].c(paramInt2);
    this.r = new com.android.dazhihui.a.b.m(arrayOfx);
    this.r.a(Integer.valueOf(paramInt1));
    registRequestListener(this.r);
    sendRequest(this.r);
    a();
  }
  
  private void c()
  {
    boolean bool = true;
    this.q.setFirstHeaderWidth((int)getResources().getDimension(2131230855));
    this.q.setContinuousLoading(true);
    this.q.setColumnClickable(this.o);
    this.q.setHeaderColumn(this.p);
    this.q.setColumnAlign(Paint.Align.CENTER);
    this.q.setFirstColumnHeadAlign(Paint.Align.CENTER);
    TableLayoutGroup localTableLayoutGroup = this.q;
    int i1 = this.t;
    if (this.v == 0) {
      bool = false;
    }
    localTableLayoutGroup.a(i1, bool);
    this.q.setOnLoadingListener(new ns(this));
    this.q.setOnContentScrollChangeListener(new nt(this));
    this.q.setOnTableLayoutClickListener(new nu(this));
  }
  
  private void d()
  {
    a(this.q.getContentVisibleBeginPosition(), com.android.dazhihui.ui.a.m.a().H());
    a();
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
  
  public int a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    default: 
      return 0;
    case 1: 
      return 2;
    case 3: 
      return 3;
    case 6: 
      return 8;
    case 9: 
      return 1;
    }
    return 4;
  }
  
  public void a()
  {
    if (this.l != null) {
      this.l.a();
    }
  }
  
  public void b()
  {
    if (this.l != null) {
      this.l.b();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (nv.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.s != null)
        {
          this.s.setBackgroundColor(getResources().getColor(2131493540));
          this.q.a(paramy);
          this.f.setTextColor(-1);
          this.g.setTextColor(-1);
        }
      } while (this.l == null);
      this.l.a(paramy);
      return;
      if (this.s != null)
      {
        this.s.setBackgroundColor(getResources().getColor(2131493603));
        this.q.a(paramy);
        this.f.setTextColor(-14540254);
        this.g.setTextColor(-6642515);
      }
    } while (this.l == null);
    this.l.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    Object localObject = getIntent().getExtras();
    paramContext = "";
    if (localObject != null) {
      paramContext = ((Bundle)localObject).getString("BUNDLE_OPTION_TITLE");
    }
    localObject = paramContext;
    if (TextUtils.isEmpty(paramContext)) {
      localObject = this.b;
    }
    paramct.d = ((String)localObject);
    paramct.a = 8744;
    paramct.q = false;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.l = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = (o)paramj;
    int i4 = ((Integer)paramh.j()).intValue();
    if (paramj == null) {}
    Object localObject1;
    Object localObject2;
    String str;
    int i2;
    int i3;
    label271:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            paramj = paramj.h();
          } while (paramj == null);
          if (paramj.a != 2939) {
            break;
          }
          localObject1 = paramj.b;
          if (localObject1 == null) {
            break;
          }
          localObject1 = new q((byte[])localObject1);
          localObject2 = ((q)localObject1).l();
          str = ((q)localObject1).l();
        } while (!((String)localObject2).equals(this.a));
        this.a = ((String)localObject2);
        this.b = str;
        if (TextUtils.isEmpty(this.l.getTitleObj().d))
        {
          this.l.getTitleObj().d = this.b;
          this.l.setTitle(this.b);
        }
        this.f.setText(this.b);
        if ((!this.a.startsWith("SH")) && (!this.a.startsWith("SZ"))) {
          break;
        }
        this.g.setText(this.a.substring(2));
        i1 = ((q)localObject1).b();
        this.e = ((q)localObject1).b();
        ((q)localObject1).e();
        i2 = ((q)localObject1).h();
        ((q)localObject1).h();
        ((q)localObject1).h();
        b.b(((q)localObject1).h());
        i3 = ((q)localObject1).h();
        if ((i1 != 7) && (i1 != 8) && (i1 != 17)) {
          break label1012;
        }
        if (i3 != 0) {
          break label1003;
        }
        this.c = i2;
        if (paramj.a == 2940)
        {
          localObject1 = paramj.b;
          if (localObject1 != null)
          {
            localObject1 = new q((byte[])localObject1);
            ((q)localObject1).b();
            i1 = ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            this.d = i1;
            i1 = b.i(this.d, this.c);
            localObject1 = b.a(this.d, this.e);
            localObject2 = b.m(this.d, this.c);
            str = b.e(this.d, this.c, this.e);
            this.h.setTextColor(i1);
            this.h.setText((CharSequence)localObject1);
            this.i.setTextColor(i1);
            this.i.setText(str);
            this.j.setTextColor(i1);
            this.j.setText((CharSequence)localObject2);
          }
        }
      } while (paramj.a != 2987);
      paramj = paramj.b;
    } while (paramj == null);
    paramj = new q(paramj);
    paramj.h();
    int i1 = paramj.e();
    int i5 = paramj.e();
    if ((paramh.j() != null) && (((Integer)paramh.j()).intValue() + i5 < i1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.q.setLoadingDown(bool);
      paramh = new ArrayList();
      i1 = 0;
      label556:
      if (i1 < i5)
      {
        localObject1 = new String[this.p.length];
        localObject2 = new int[this.p.length];
        str = paramj.l();
        localObject1[0] = paramj.l();
        localObject2[0] = 39936;
        int i6 = paramj.b();
        int i7 = paramj.b();
        paramj.e();
        i2 = paramj.h();
        int i8 = paramj.h();
        int i9 = paramj.h();
        paramj.h();
        paramj.b();
        paramj.h();
        paramj.b();
        paramj.b();
        paramj.h();
        paramj.b();
        int i10 = paramj.h();
        int i11 = paramj.b();
        int i12 = paramj.h();
        int i13 = paramj.h();
        int i14 = paramj.h();
        int i15 = paramj.h();
        i3 = paramj.h();
        if (i3 == 0) {}
        for (;;)
        {
          localObject1[1] = b.a(i8, i6);
          localObject2[1] = b.h(i8, i2);
          localObject1[2] = b.b(i8, i2, i6);
          localObject2[2] = localObject2[1];
          localObject1[3] = b.b(i8, i2);
          localObject2[3] = localObject2[1];
          localObject1[4] = b.a(i13, i6);
          localObject2[4] = 39936;
          localObject1[5] = b.a(i14, i6);
          localObject2[5] = 39936;
          localObject1[6] = String.valueOf(i9);
          localObject2[6] = 39936;
          localObject1[7] = String.valueOf(i15);
          localObject2[7] = 39936;
          localObject1[8] = b.a(i3, i6);
          localObject2[8] = 39936;
          localObject1[9] = b.a(i10, i11);
          localObject2[9] = 39936;
          localObject1[10] = String.valueOf(i12);
          localObject2[10] = 39936;
          mh localmh = new mh();
          localmh.a = ((String[])localObject1);
          localmh.b = ((int[])localObject2);
          localmh.d = n.e(str);
          localmh.i = true;
          localmh.h = false;
          localmh.i = false;
          localmh.g = i7;
          localmh.k = new Object[] { str };
          paramh.add(localmh);
          i1 += 1;
          break label556;
          this.g.setText(this.a);
          break;
          label1003:
          this.c = i3;
          break label271;
          label1012:
          this.c = i2;
          break label271;
          i2 = i3;
        }
      }
      this.q.a(paramh, i4);
      b();
      return;
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903364);
    this.s = findViewById(2131560184);
    this.l = ((DzhHeader)findViewById(2131560185));
    this.l.setOnHeaderButtonClickListener(this);
    this.k = findViewById(2131560186);
    this.k.setOnClickListener(new nr(this));
    this.f = ((TextView)findViewById(2131559834));
    this.g = ((TextView)findViewById(2131559835));
    this.h = ((TextView)findViewById(2131558625));
    this.i = ((TextView)findViewById(2131559832));
    this.j = ((TextView)findViewById(2131559833));
    this.p = getResources().getStringArray(2131361888);
    this.q = ((TableLayoutGroup)findViewById(2131560190));
    this.m = ((TextView)findViewById(2131560188));
    this.n = ((TextView)findViewById(2131560189));
    this.m.setOnClickListener(this);
    this.n.setOnClickListener(this);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      StockVo localStockVo = (StockVo)paramBundle.getParcelable("stock_vo");
      if (localStockVo != null)
      {
        this.a = localStockVo.getCode();
        this.b = localStockVo.getName();
        localStockVo.getType();
        paramBundle.getInt("option_type");
        this.A = paramBundle.getInt("option_bs_type", 2);
      }
    }
    else
    {
      if (this.A != 0) {
        break label389;
      }
      this.m.setTextColor(-16732935);
      this.n.setTextColor(-1314574);
    }
    for (;;)
    {
      this.l.a(this, this);
      this.w = com.android.dazhihui.ui.a.m.a().H();
      c();
      this.u = a(this.t);
      a(0, this.w);
      changeLookFace(this.mLookFace);
      return;
      this.a = paramBundle.getString("code");
      this.b = paramBundle.getString("name");
      paramBundle.getInt("type");
      break;
      label389:
      if (this.A == 1)
      {
        this.m.setTextColor(-1314574);
        this.n.setTextColor(-16732935);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while (this.A == 0);
      this.A = 0;
      this.w = com.android.dazhihui.ui.a.m.a().H();
      this.q.a();
      this.v = 0;
      this.t = 6;
      this.u = a(this.t);
      a(0, this.w);
      this.m.setTextColor(-16732935);
      this.n.setTextColor(-1314574);
      this.m.setSelected(true);
      this.n.setSelected(false);
      return;
    } while (this.A == 1);
    this.A = 1;
    this.w = com.android.dazhihui.ui.a.m.a().H();
    this.q.a();
    this.v = 0;
    this.t = 6;
    this.u = a(this.t);
    a(0, this.w);
    this.m.setTextColor(-1314574);
    this.n.setTextColor(-16732935);
    this.m.setSelected(false);
    this.n.setSelected(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\OptionListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */