package com.android.dazhihui.ui.delegate.newtrade;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.delegate.newtrade.a.a;
import com.android.dazhihui.ui.delegate.newtrade.b.c;
import com.android.dazhihui.ui.delegate.newtrade.screen.NewTradeBaseActivity;
import com.android.dazhihui.ui.delegate.newtrade.widge.TableView;
import com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget.KlineDetailView;
import com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget.KlineView;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.stockchart.az;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TradeDetialScreen
  extends NewTradeBaseActivity
  implements View.OnClickListener, cp, cs
{
  public static final Comparator<c> a = new l();
  private int A;
  private String B;
  private String C;
  private int D;
  private int E;
  private int F;
  private int G;
  private StockVo H;
  private KlineDetailView I;
  private final String[] J = { "成交情况", "价格", "数量", "成交额", "总费用" };
  private List<c> K;
  private int[] L = null;
  private int[] M = null;
  private int[] N = null;
  private k O = null;
  private k P = null;
  private com.android.dazhihui.a.b.m Q = null;
  private com.android.dazhihui.a.b.m R;
  private DatePickerDialog.OnDateSetListener S = new o(this);
  private DatePickerDialog.OnDateSetListener T = new r(this);
  boolean b = false;
  private final int e = 0;
  private final int f = 1;
  private DzhHeader g;
  private ScrollView h;
  private LinearLayout i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private FrameLayout q;
  private FrameLayout r;
  private KlineView s;
  private TableView t;
  private int u = 0;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  private String a(String paramString)
  {
    return paramString.substring(0, 4) + "-" + paramString.substring(4, 6) + "-" + paramString.substring(6, 8);
  }
  
  private void a(com.android.dazhihui.a.b.m paramm, byte[] paramArrayOfByte)
  {
    Object localObject1 = new q(paramArrayOfByte);
    int i2 = ((q)localObject1).b();
    int i3 = ((q)localObject1).e();
    this.b = false;
    long[] arrayOfLong2;
    int[][] arrayOfInt;
    long[] arrayOfLong1;
    Object localObject2;
    boolean bool;
    if (i3 > 0)
    {
      paramArrayOfByte = this.H.getKData();
      arrayOfLong2 = this.H.getKVolData();
      arrayOfInt = this.H.getPrototypeKData();
      arrayOfLong1 = this.H.getPrototypeKVolData();
      paramm = (int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 8 });
      localObject2 = new long[i3];
      i1 = 0;
      if (i1 < i3)
      {
        paramm[i1][0] = ((q)localObject1).h();
        if ((i1 == 0) && (paramArrayOfByte != null)) {
          if (paramm[i1][0] >= paramArrayOfByte[0][0]) {
            break label315;
          }
        }
        label315:
        for (bool = true;; bool = false)
        {
          this.b = bool;
          if ((i1 == 0) && ((this.b) || (paramArrayOfByte == null))) {
            this.H.setKIndexDay(paramm[i1][0]);
          }
          if ((paramArrayOfByte == null) && (i1 == i3 - 1)) {
            this.H.setKNowDay(paramm[i1][0]);
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
        break label422;
      }
      paramArrayOfByte = paramm;
      localObject1 = paramm;
      bool = true;
      paramm = (com.android.dazhihui.a.b.m)localObject2;
    }
    label422:
    Object localObject3;
    for (;;)
    {
      this.H.setKData((int[][])localObject1);
      this.H.setKVolData((long[])localObject2);
      this.H.setPrototypeKData(paramArrayOfByte);
      this.H.setPrototypeKVolData(paramm);
      this.s.d();
      l();
      this.s.k();
      this.s.a(bool);
      if (this.H.getKLineOffset() < 50)
      {
        if (this.H.getKLineOffset() <= 0) {
          break label856;
        }
        e();
      }
      return;
      if ((paramArrayOfByte == null) || (!this.b)) {
        break;
      }
      i1 = paramArrayOfByte.length;
      localObject1 = new int[i1 + i3][];
      System.arraycopy(paramm, 0, localObject1, 0, i3);
      System.arraycopy(paramArrayOfByte, 0, localObject1, i3, i1);
      paramArrayOfByte = new long[i1 + i3];
      System.arraycopy(localObject2, 0, paramArrayOfByte, 0, i3);
      System.arraycopy(arrayOfLong2, 0, paramArrayOfByte, i3, i1);
      i1 = arrayOfInt.length;
      localObject3 = new int[i1 + i3][];
      System.arraycopy(paramm, 0, localObject3, 0, i3);
      System.arraycopy(arrayOfInt, 0, localObject3, i3, i1);
      paramm = new long[i1 + i3];
      System.arraycopy(localObject2, 0, paramm, 0, i3);
      System.arraycopy(arrayOfLong1, 0, paramm, i3, i1);
      i1 = Math.max(0, localObject1.length - this.s.getKLineSize());
      i1 = Math.min(this.H.getKLineOffset() + i3, i1);
      this.s.setKLineOffset(i1);
      localObject2 = paramArrayOfByte;
      paramArrayOfByte = (byte[])localObject3;
      bool = false;
    }
    int i4 = paramm[0][0];
    i2 = paramArrayOfByte.length;
    int i1 = paramArrayOfByte.length - 1;
    label631:
    if (i1 >= 0) {
      if (paramArrayOfByte[i1][0] != i4) {}
    }
    for (;;)
    {
      localObject1 = new int[i1 + i3][];
      System.arraycopy(paramArrayOfByte, 0, localObject1, 0, i1);
      System.arraycopy(paramm, 0, localObject1, i1, i3);
      localObject3 = new long[i1 + i3];
      System.arraycopy(arrayOfLong2, 0, localObject3, 0, i1);
      System.arraycopy(localObject2, 0, localObject3, i1, i3);
      paramArrayOfByte = new int[i1 + i3][];
      System.arraycopy(arrayOfInt, 0, paramArrayOfByte, 0, i1);
      System.arraycopy(paramm, 0, paramArrayOfByte, i1, i3);
      paramm = new long[i1 + i3];
      System.arraycopy(arrayOfLong1, 0, paramm, 0, i1);
      System.arraycopy(localObject2, 0, paramm, i1, i3);
      if ((localObject1.length > i2) && (this.s.getKLineSize() + this.H.getKLineOffset() >= localObject1.length))
      {
        i1 = Math.max(0, localObject1.length - this.s.getKLineSize());
        i1 = Math.min(this.H.getKLineOffset() + localObject1.length - i2, i1);
        this.s.setKLineOffset(i1);
      }
      localObject2 = localObject3;
      bool = false;
      break;
      i1 -= 1;
      break label631;
      label856:
      e();
      return;
      i1 = i2;
    }
  }
  
  private void a(com.android.dazhihui.a.b.m paramm, byte[] paramArrayOfByte, int paramInt)
  {
    paramm = new q(paramArrayOfByte);
    int i1 = paramm.b();
    int i2;
    if (paramm.e() > 0)
    {
      paramm.h();
      paramm.h();
      paramm.h();
      paramm.h();
      i2 = paramm.h();
      paramm.h();
      paramm.h();
      if (i1 == 1) {
        paramm.h();
      }
      if (paramInt != 0) {
        break label80;
      }
      this.D = i2;
    }
    label80:
    while (paramInt != 1) {
      return;
    }
    this.E = i2;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length != 0) {
        break label106;
      }
      paramArrayOfByte = getWindow().getDecorView();
      if ((!isFinishing()) && (paramArrayOfByte != null)) {
        break label32;
      }
    }
    label32:
    label106:
    do
    {
      return;
      SelfSelectedStockManager.getInstance().removeBrowseStock(this.H.getCode());
      new AlertDialog.Builder(this).setTitle(getString(2131166406)).setMessage(getString(2131166278)).setPositiveButton(2131165363, new n(this, this)).setOnCancelListener(new m(this)).create().show();
      return;
      localObject2 = new q(paramArrayOfByte);
      localObject1 = ((q)localObject2).l();
      paramArrayOfByte = ((q)localObject2).l();
    } while (!((String)localObject1).contains(this.H.getCode()));
    Object localObject1 = new int[8];
    localObject1[0] = ((q)localObject2).b();
    localObject1[1] = ((q)localObject2).b();
    localObject1[2] = ((q)localObject2).e();
    localObject1[3] = ((q)localObject2).h();
    localObject1[4] = ((q)localObject2).h();
    localObject1[5] = ((q)localObject2).h();
    localObject1[6] = ((q)localObject2).h();
    localObject1[7] = ((q)localObject2).h();
    this.H.setmData2939((int[])localObject1);
    int i1 = localObject1[1];
    this.H.setmDecimalLen(i1);
    int i2 = ((q)localObject2).b();
    ((q)localObject2).h();
    int i3 = ((q)localObject2).b();
    Object localObject2 = az.a(localObject1[4], i1);
    String str = com.android.dazhihui.d.b.a(localObject1[5], i1);
    this.H.setRiseLimit((String)localObject2);
    this.H.setDownLimit(str);
    this.H.setStockExtendRank(i3);
    if (localObject1[0] != this.H.getType()) {
      this.H.setType(localObject1[0]);
    }
    if (i2 == 1) {}
    for (;;)
    {
      this.H.setName(paramArrayOfByte);
      this.H.setLoanable(bool);
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
      this.H.setCp(i1);
      return;
      bool = false;
    }
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    int i2 = paramArrayOfByte.e();
    this.L = new int[i2];
    this.M = new int[i2];
    this.N = new int[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      this.L[i1] = paramArrayOfByte.h();
      this.M[i1] = paramArrayOfByte.f();
      this.N[i1] = paramArrayOfByte.f();
      i1 += 1;
    }
    m();
    this.H.setExRightsTime(this.L);
    this.H.setExRightsMulti(this.M);
    this.H.setExRightsAdd(this.N);
    if (this.H.needExRight())
    {
      l();
      this.s.k();
      this.s.a(false);
      this.H.setNeedExRight(false);
    }
  }
  
  private void f()
  {
    this.g = ((DzhHeader)findViewById(2131558683));
    this.i = ((LinearLayout)findViewById(2131558686));
    this.h = ((ScrollView)findViewById(2131558685));
    this.j = ((TextView)findViewById(2131558687));
    this.k = ((TextView)findViewById(2131558688));
    this.l = ((TextView)findViewById(2131558689));
    this.m = ((TextView)findViewById(2131558690));
    this.n = ((TextView)findViewById(2131558691));
    this.p = ((TextView)findViewById(2131558692));
    this.q = ((FrameLayout)findViewById(2131558694));
    this.r = ((FrameLayout)findViewById(2131558693));
    this.t = ((TableView)findViewById(2131558695));
  }
  
  private void g()
  {
    Object localObject = getIntent().getExtras();
    if (localObject != null)
    {
      this.u = ((Bundle)localObject).getInt("date_type", 0);
      this.B = ((Bundle)localObject).getString("mYk");
      this.C = ((Bundle)localObject).getString("hold_days");
      this.A = ((Bundle)localObject).getInt("yk_type", 0);
      this.w = ((Bundle)localObject).getString("stock_name");
      this.v = ((Bundle)localObject).getString("stock_code");
      this.x = ((Bundle)localObject).getString("market_code");
    }
    if (this.v == null) {
      finish();
    }
    this.g.a(this, this);
    j();
    if (this.A == 0) {
      this.l.setText("区间总盈亏");
    }
    for (;;)
    {
      if (this.H == null)
      {
        this.H = new StockVo(this.w, this.x + this.v, 1, false);
        localObject = this.H;
        StockVo.setTempExRights(0);
      }
      this.s = new KlineView(this);
      this.s.setHolder(this);
      localObject = new RelativeLayout.LayoutParams(-1, -1);
      this.q.addView(this.s, (ViewGroup.LayoutParams)localObject);
      this.I = new KlineDetailView(this);
      this.I.setBackgroundColor(-789513);
      this.I.setVisibility(8);
      localObject = new RelativeLayout.LayoutParams(-1, -1);
      this.I.setHolder(this.s);
      this.I.setVisibility(8);
      this.r.addView(this.I, (ViewGroup.LayoutParams)localObject);
      this.o = new TextView(this);
      this.o.setBackgroundColor(getResources().getColor(2131493660));
      this.o.setVisibility(0);
      this.o.setGravity(17);
      this.o.setTextColor(getResources().getColor(2131492970));
      this.o.setText("平均买入价格：--\t平均卖出价格：--");
      localObject = new RelativeLayout.LayoutParams(-1, -1);
      this.r.addView(this.o, (ViewGroup.LayoutParams)localObject);
      this.t.setParentScrollView(this.h);
      this.K = new LinkedList();
      return;
      this.l.setText("区间实现盈亏");
    }
  }
  
  private void h()
  {
    this.j.setOnClickListener(this);
    this.k.setOnClickListener(this);
  }
  
  private void i()
  {
    if ((this.B != null) && (com.android.dazhihui.d.n.w(this.B) < 0.0F))
    {
      this.i.setBackgroundColor(getResources().getColor(2131492956));
      return;
    }
    this.i.setBackgroundColor(getResources().getColor(2131492957));
  }
  
  private void j()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    Calendar localCalendar = Calendar.getInstance();
    Calendar.getInstance();
    switch (this.u)
    {
    }
    for (;;)
    {
      this.z = com.android.dazhihui.ui.delegate.b.o.y();
      this.j.setText(this.y.substring(0, 4) + "-" + this.y.substring(4, 6) + "-" + this.y.substring(6, 8));
      this.k.setText(this.z.substring(0, 4) + "-" + this.z.substring(4, 6) + "-" + this.z.substring(6, 8));
      return;
      localCalendar.add(2, 0);
      localCalendar.set(5, 1);
      this.y = localSimpleDateFormat.format(localCalendar.getTime());
      continue;
      localCalendar.add(2, -1);
      localCalendar.set(5, 1);
      this.y = localSimpleDateFormat.format(localCalendar.getTime());
      continue;
      localCalendar.add(2, -2);
      localCalendar.set(5, 1);
      this.y = localSimpleDateFormat.format(localCalendar.getTime());
      continue;
      localCalendar.add(2, -5);
      localCalendar.set(5, 1);
      this.y = localSimpleDateFormat.format(localCalendar.getTime());
      continue;
      localCalendar.add(2, -11);
      localCalendar.set(5, 1);
      this.y = localSimpleDateFormat.format(localCalendar.getTime());
    }
  }
  
  private void k()
  {
    Collections.sort(this.K, a);
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = null;
    int i11 = 0;
    int i1 = 0;
    int i6 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    c localc;
    Object localObject2;
    int i14;
    int i15;
    int i16;
    int i12;
    int i13;
    int i10;
    int i9;
    int i8;
    int i7;
    if (i11 < this.K.size())
    {
      localc = (c)this.K.get(i11);
      localObject2 = ((c)this.K.get(i11)).c;
      i14 = 0;
      i15 = 0;
      i16 = 0;
      int i17 = 0;
      if (((c)this.K.get(i11)).c.equals("1"))
      {
        i12 = com.android.dazhihui.d.n.x(((c)this.K.get(i11)).d);
        i13 = com.android.dazhihui.d.n.x(((c)this.K.get(i11)).i);
        i10 = i17;
        i9 = i13;
        i8 = i15;
        i7 = i12;
        if (com.android.dazhihui.d.n.i(((c)this.K.get(i11)).a, this.y).intValue() < 0) {
          break label2023;
        }
        i10 = i17;
        i9 = i13;
        i8 = i15;
        i7 = i12;
        if (com.android.dazhihui.d.n.i(this.z, ((c)this.K.get(i11)).a).intValue() < 0) {
          break label2023;
        }
        i6 += i13;
        i7 = i5;
        i14 = 0;
        i15 = i4 + 1;
        i8 = i13;
        i9 = 0;
        i4 = i2 + i12;
        i10 = i12;
        i5 = i1;
        i2 = i15;
        i1 = i7;
        i7 = i14;
      }
    }
    for (;;)
    {
      if ((localObject1 == null) || (!((String)localObject1).equals(localc.a)))
      {
        String str = localc.a;
        localObject1 = localObject2;
        i12 = i7;
        i13 = i11 + 1;
        i7 = i10;
        i10 = i9;
        i9 = i8;
        i8 = i12;
        i12 = i13;
        label373:
        if (i12 < this.K.size())
        {
          i13 = i8;
          i14 = i9;
          i15 = i10;
          i16 = i7;
          localObject2 = localObject1;
          if (((c)this.K.get(i12)).a.equals(localc.a))
          {
            if (!((c)this.K.get(i12)).c.equals("1")) {
              break label791;
            }
            i7 += com.android.dazhihui.d.n.x(((c)this.K.get(i12)).d);
            i9 += com.android.dazhihui.d.n.x(((c)this.K.get(i12)).i);
          }
          for (;;)
          {
            i13 = i8;
            i14 = i9;
            i15 = i10;
            i16 = i7;
            localObject2 = localObject1;
            if (!((String)localObject1).equals(((c)this.K.get(i12)).c))
            {
              localObject2 = "0";
              i16 = i7;
              i15 = i10;
              i14 = i9;
              i13 = i8;
            }
            i12 += 1;
            i8 = i13;
            i9 = i14;
            i10 = i15;
            i7 = i16;
            localObject1 = localObject2;
            break label373;
            i13 = com.android.dazhihui.d.n.x(((c)this.K.get(i11)).d);
            i12 = com.android.dazhihui.d.n.x(((c)this.K.get(i11)).i);
            i10 = i12;
            i9 = i16;
            i8 = i13;
            i7 = i14;
            if (com.android.dazhihui.d.n.i(((c)this.K.get(i11)).a, this.y).intValue() < 0) {
              break label2023;
            }
            i10 = i12;
            i9 = i16;
            i8 = i13;
            i7 = i14;
            if (com.android.dazhihui.d.n.i(this.z, ((c)this.K.get(i11)).a).intValue() < 0) {
              break label2023;
            }
            i14 = i5 + 1;
            i7 = i12;
            i8 = 0;
            i3 += i13;
            i9 = i13;
            i5 = i2;
            i10 = 0;
            i12 = i1 + i12;
            i1 = i14;
            i2 = i4;
            i4 = i5;
            i5 = i12;
            break;
            label791:
            i10 += com.android.dazhihui.d.n.x(((c)this.K.get(i12)).d);
            i8 += com.android.dazhihui.d.n.x(((c)this.K.get(i12)).i);
          }
        }
        localObject2 = new c();
        if (((String)localObject1).equals("0"))
        {
          i12 = Math.min(i7, i10);
          float f1 = com.android.dazhihui.d.n.i(com.android.dazhihui.d.n.a(i8 + "", i10 + "", 3).toString(), com.android.dazhihui.d.n.a(i9 + "", i7 + "", 3).toString()).floatValue();
          i7 = com.android.dazhihui.d.n.j(f1 + "", i12 + "").intValue();
          ((c)localObject2).k = (a(((c)this.K.get(i11)).a) + ":买卖做T" + i12 + "股，做T盈亏" + i7);
          label1085:
          localLinkedList.add(localObject2);
          localObject1 = str;
        }
      }
      for (;;)
      {
        localLinkedList.add(localc);
        i11 += 1;
        i7 = i4;
        i8 = i5;
        i5 = i1;
        i4 = i2;
        i2 = i7;
        i1 = i8;
        break;
        if ((((String)localObject1).equals("1")) && (localc.f.equals(localc.d)))
        {
          ((c)localObject2).k = (a(((c)this.K.get(i11)).a) + ":买入（建仓）,买入" + i7 + "股");
          break label1085;
        }
        if ((((String)localObject1).equals("1")) && (!localc.f.equals(localc.d)))
        {
          ((c)localObject2).k = (a(((c)this.K.get(i11)).a) + ":买入（加仓）,买入" + i7 + "股");
          break label1085;
        }
        if ((((String)localObject1).equals("2")) && (localc.f.equals(com.android.dazhihui.d.n.i(i10 + "", localc.d).toString())))
        {
          ((c)localObject2).k = (a(((c)this.K.get(i11)).a) + ":卖出（清仓）,卖出" + i10 + "股");
          break label1085;
        }
        if ((!((String)localObject1).equals("2")) || (localc.f.equals(com.android.dazhihui.d.n.i(i10 + "", localc.d).toString()))) {
          break label1085;
        }
        ((c)localObject2).k = (a(((c)this.K.get(i11)).a) + ":卖出（减仓）,卖出" + i10 + "股");
        break label1085;
        if ((i6 == 0) || (i2 == 0))
        {
          localObject1 = "--";
          if ((i1 != 0) && (i3 != 0)) {
            break label1841;
          }
          localObject2 = "--";
          label1558:
          this.o.setText("平均买入价格：" + (String)localObject1 + "\t平均卖出价格：" + (String)localObject2);
          this.p.setText("持股" + this.C + "天，买入" + i4 + "次，卖出" + i5 + "次");
          localObject1 = (String[][])Array.newInstance(String.class, new int[] { localLinkedList.size(), 6 });
          i1 = 0;
          label1683:
          if (i1 >= localLinkedList.size()) {
            break label2011;
          }
          if (((c)localLinkedList.get(i1)).k == null) {
            break label1894;
          }
          localObject1[i1][0] = "";
          localObject1[i1][1] = "";
          localObject1[i1][2] = "";
          localObject1[i1][3] = "";
          localObject1[i1][4] = "";
          localObject1[i1][5] = ((c)localLinkedList.get(i1)).k;
        }
        for (;;)
        {
          i1 += 1;
          break label1683;
          localObject1 = com.android.dazhihui.d.n.a(i6 + "", i2 + "", 3).toString();
          break;
          label1841:
          localObject2 = com.android.dazhihui.d.n.a(i1 + "", i3 + "", 3).toString();
          break label1558;
          label1894:
          localObject1[i1][0] = ((c)localLinkedList.get(i1)).c;
          localObject1[i1][1] = ((c)localLinkedList.get(i1)).e;
          localObject1[i1][2] = ((c)localLinkedList.get(i1)).d;
          localObject1[i1][3] = ((c)localLinkedList.get(i1)).i;
          localObject1[i1][4] = ((c)localLinkedList.get(i1)).g;
          localObject1[i1][5] = "";
        }
        label2011:
        this.t.setData((String[][])localObject1);
        return;
      }
      label2023:
      i14 = i8;
      i12 = i2;
      i2 = i7;
      i13 = i1;
      i7 = i10;
      i8 = i9;
      i9 = i14;
      i10 = i2;
      i1 = i5;
      i2 = i4;
      i4 = i12;
      i5 = i13;
    }
  }
  
  private void l()
  {
    int i3 = StockVo.getExRights();
    int[] arrayOfInt1 = this.H.getExRightsMulti();
    int[] arrayOfInt2 = this.H.getExRightsAdd();
    int[] arrayOfInt3 = this.H.getExRightsTime();
    Object localObject = this.H.getPrototypeKData();
    long[] arrayOfLong2 = this.H.getPrototypeKVolData();
    int i4 = this.H.getKNowDay();
    if ((arrayOfInt3 != null) && (arrayOfInt3.length != 0) && (localObject != null) && (com.android.dazhihui.d.n.l(this.H.getType(), this.H.getMarketType())))
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
      this.H.setKData(arrayOfInt);
      this.H.setKVolData(arrayOfLong1);
      this.H.setExRightsId((int[])localObject);
    }
  }
  
  private void m()
  {
    if ((this.L == null) || (this.M == null) || (this.N == null)) {
      return;
    }
    int i1 = 0;
    if (i1 < this.L.length) {
      if (com.android.dazhihui.d.n.i(this.L[i1] + "", this.y).intValue() <= 0) {}
    }
    for (int i2 = i1;; i2 = -1)
    {
      i1 = 0;
      label76:
      if (i1 < this.L.length) {
        if (com.android.dazhihui.d.n.i(this.L[i1] + "", this.z).intValue() <= 0) {}
      }
      for (;;)
      {
        label185:
        int i3;
        if (i2 != -1)
        {
          this.F = com.android.dazhihui.d.n.a(this.D * this.M[i2] + this.N[i2] * 100 + "", "10000", 0).intValue();
          if (i1 == -1) {
            break label297;
          }
          localObject = new StringBuilder();
          i1 = this.E;
          i3 = this.M[i2];
        }
        label297:
        for (this.G = com.android.dazhihui.d.n.a(this.N[i2] * 100 + i1 * i3 + "", "10000", 0).intValue();; this.G = this.E)
        {
          if (this.F != 0) {
            break label308;
          }
          this.n.setText("--");
          return;
          i1 += 1;
          break;
          i1 += 1;
          break label76;
          this.F = this.D;
          break label185;
        }
        label308:
        float f1 = com.android.dazhihui.d.n.a(this.G - this.F + "", this.F + "", 4).floatValue();
        Object localObject = NumberFormat.getPercentInstance();
        ((NumberFormat)localObject).setMaximumFractionDigits(2);
        this.n.setText(((NumberFormat)localObject).format(f1));
        return;
        i1 = -1;
      }
    }
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
    }
  }
  
  public StockVo a()
  {
    return this.H;
  }
  
  public void a(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramInt == 1) {
      str = com.android.dazhihui.d.n.A(paramString);
    }
    this.Q = new com.android.dazhihui.a.b.m();
    paramString = new x(2944);
    paramString.a(this.v);
    paramString.b(7);
    paramString.d(com.android.dazhihui.d.n.x(str));
    paramString.c(1);
    this.Q.a(paramString);
    this.Q.a(Integer.valueOf(paramInt));
    registRequestListener(this.Q);
    sendRequest(this.Q);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.I.a();
      this.I.setVisibility(0);
      this.I.invalidate();
      this.o.setVisibility(8);
      return;
    }
    this.I.setVisibility(8);
    this.o.setVisibility(0);
  }
  
  public void b()
  {
    this.I.a();
  }
  
  public void b(boolean paramBoolean)
  {
    e();
  }
  
  public void c()
  {
    com.android.dazhihui.ui.delegate.b.h localh = a.a("18810");
    localh.a("1022", this.y).a("1023", this.z).a("1026", this.A).a("1277", "").a("1206", "");
    this.O = new k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.O);
    a(this.O, true);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (u.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.g == null);
      this.g.a(paramy);
      return;
    } while (this.g == null);
    this.g.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = ("交易明细(" + this.w + ")");
    paramct.p = this;
  }
  
  public void d()
  {
    com.android.dazhihui.ui.delegate.b.h localh = a.a("18812");
    localh.a("1022", "").a("1023", "").a("1036", this.v).a("1277", "").a("1206", "");
    this.P = new k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.P);
    a(this.P, true);
  }
  
  public void e()
  {
    this.R = new com.android.dazhihui.a.b.m();
    x localx = new x(2944);
    localx.a(this.H.getCode());
    localx.b(7);
    localx.d(this.H.getKIndexDay());
    localx.c(150);
    this.R.a(localx);
    localx = new x(2939);
    localx.a(this.H.getCode());
    this.R.a(localx);
    localx = new x(2958);
    localx.a(this.H.getCode());
    localx.b(0);
    this.R.a(localx);
    registRequestListener(this.R);
    sendRequest(this.R);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i1 = 0;
    super.handleResponse(paramh, paramj);
    Object localObject;
    if (((paramh instanceof com.android.dazhihui.a.b.m)) && (paramh == this.Q))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if ((paramj != null) && (paramj.b != null))
      {
        localObject = paramj.b;
        if ((localObject != null) && (localObject.length != 0)) {
          break label58;
        }
      }
    }
    label57:
    label58:
    do
    {
      do
      {
        do
        {
          byte[] arrayOfByte;
          do
          {
            do
            {
              break label57;
              break label57;
              break label57;
              do
              {
                return;
              } while (paramj.a != 2944);
              a((com.android.dazhihui.a.b.m)paramh, (byte[])localObject, ((Integer)paramh.j()).intValue());
              if (((Integer)paramh.j()).intValue() == 0)
              {
                a(this.z, 1);
                return;
              }
            } while (((Integer)paramh.j()).intValue() != 1);
            m();
            return;
            if ((!(paramh instanceof com.android.dazhihui.a.b.m)) || (paramh != this.R)) {
              break;
            }
            localObject = ((com.android.dazhihui.a.b.o)paramj).h();
            if ((localObject == null) || (((p)localObject).b == null)) {
              break;
            }
            arrayOfByte = ((p)localObject).b;
          } while ((arrayOfByte == null) || (arrayOfByte.length == 0));
          if (((p)localObject).a == 2944)
          {
            a((com.android.dazhihui.a.b.m)paramh, arrayOfByte);
            this.s.invalidate();
          }
          if (((p)localObject).a == 2939) {
            a(arrayOfByte);
          }
          if (((p)localObject).a == 2958) {
            b(arrayOfByte);
          }
        } while (!(paramj instanceof com.android.dazhihui.a.b.l));
        paramj = ((com.android.dazhihui.a.b.l)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.newtrade.a.b.a(paramj, this));
      com.android.dazhihui.ui.delegate.b.g.b(paramj.d());
      paramj = com.android.dazhihui.ui.delegate.b.h.a(paramj.d());
      if (paramh == this.O)
      {
        d();
        if (!paramj.b())
        {
          showShortToast(paramj.d());
          return;
        }
        i2 = paramj.g();
        while (i1 < i2)
        {
          paramh = paramj.a(i1, "1036");
          if ((paramh != null) && (paramh.equals(this.v)))
          {
            this.B = paramj.a(i1, "3104");
            this.C = com.android.dazhihui.d.n.t(paramj.a(i1, "9030"));
            paramj = this.m;
            if (this.B == null) {}
            for (paramh = "--";; paramh = this.B)
            {
              paramj.setText(paramh);
              i();
              return;
            }
          }
          i1 += 1;
        }
        this.m.setText("0");
        this.C = "0";
        i();
        return;
      }
    } while (paramh != this.P);
    if (!paramj.b())
    {
      showShortToast(paramj.d());
      return;
    }
    this.K.clear();
    int i2 = paramj.g();
    paramh = new String[i2][];
    i1 = 0;
    while (i1 < i2)
    {
      paramh = new c();
      paramh.b = com.android.dazhihui.d.n.t(paramj.a(i1, "1036"));
      paramh.c = com.android.dazhihui.d.n.t(paramj.a(i1, "1026"));
      paramh.a = com.android.dazhihui.d.n.t(paramj.a(i1, "1215"));
      paramh.e = com.android.dazhihui.d.n.t(paramj.a(i1, "1048"));
      paramh.d = com.android.dazhihui.d.n.t(paramj.a(i1, "1047"));
      paramh.f = com.android.dazhihui.d.n.t(paramj.a(i1, "1461"));
      paramh.g = com.android.dazhihui.d.n.t(paramj.a(i1, "1894"));
      paramh.h = com.android.dazhihui.d.n.t(paramj.a(i1, "9030"));
      paramh.i = (com.android.dazhihui.d.n.j(paramh.d, paramh.e).intValue() + "");
      paramh.j = com.android.dazhihui.d.n.h(paramh.i, paramh.g).toString();
      this.K.add(paramh);
      i1 += 1;
    }
    k();
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903075);
    f();
    g();
    h();
    if ((this.B == null) || (this.C == null)) {
      c();
    }
    for (;;)
    {
      this.s.a(this.y, this.z);
      a(this.y, 0);
      e();
      this.t.setHeaders(this.J);
      return;
      i();
      this.m.setText(this.B);
      d();
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558687: 
      new DatePickerDialog(this, 3, this.S, com.android.dazhihui.d.n.x(this.y.substring(0, 4)), com.android.dazhihui.d.n.x(this.y.substring(4, 6)) - 1, com.android.dazhihui.d.n.x(this.y.substring(6, 8))).show();
      return;
    }
    new DatePickerDialog(this, 3, this.T, com.android.dazhihui.d.n.x(this.z.substring(0, 4)), com.android.dazhihui.d.n.x(this.z.substring(4, 6)) - 1, com.android.dazhihui.d.n.x(this.z.substring(6, 8))).show();
  }
  
  public void onResume()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r())
    {
      finish();
      return;
    }
    super.onResume();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
    {
      ViewGroup.LayoutParams localLayoutParams = this.t.getLayoutParams();
      localLayoutParams.height = (com.android.dazhihui.g.a().n() - this.g.getHeight() - this.r.getHeight() - this.q.getHeight());
      this.t.setLayoutParams(localLayoutParams);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\TradeDetialScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */