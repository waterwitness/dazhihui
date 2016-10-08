package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;
import java.lang.reflect.Array;

public class KlineTechnicalLay
  extends LinearLayout
{
  private Context a;
  private DisplayMetrics b;
  private Paint c = new Paint(1);
  private String[] d = null;
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private String j = "";
  private String k = "";
  private String l = "";
  private String m = "";
  private String n = "";
  private String o = "";
  private String p = "";
  private String q = "";
  private Drawable r;
  private int s;
  private int t;
  private int u;
  private TextView[] v = new TextView[15];
  private String[] w = new String[15];
  private TextView[] x = new TextView[3];
  private View[] y = new View[6];
  private int z;
  
  public KlineTechnicalLay(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    this.s = this.a.getResources().getDimensionPixelSize(2131230833);
    this.t = this.a.getResources().getDimensionPixelSize(2131230830);
    this.u = this.a.getResources().getDimensionPixelSize(2131230964);
    this.b = this.a.getResources().getDisplayMetrics();
    this.c.setColor(-1);
    this.c.setTextSize(this.u);
    this.r = a.a(getResources(), 2130838496);
    a();
  }
  
  public KlineTechnicalLay(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.s = this.a.getResources().getDimensionPixelSize(2131230833);
    this.t = this.a.getResources().getDimensionPixelSize(2131230830);
    this.u = this.a.getResources().getDimensionPixelSize(2131230964);
    this.b = this.a.getResources().getDisplayMetrics();
    this.c.setColor(-1);
    this.c.setTextSize(this.u);
    this.r = a.a(getResources(), 2130838496);
    a();
  }
  
  public KlineTechnicalLay(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    this.s = this.a.getResources().getDimensionPixelSize(2131230833);
    this.t = this.a.getResources().getDimensionPixelSize(2131230830);
    this.u = this.a.getResources().getDimensionPixelSize(2131230964);
    this.b = this.a.getResources().getDisplayMetrics();
    this.c.setColor(-1);
    this.c.setTextSize(this.u);
    this.r = a.a(getResources(), 2130838496);
    a();
  }
  
  private void b()
  {
    this.v[0].setText(this.w[0] + this.e);
    if (this.d != null)
    {
      this.v[1].setText(this.w[1] + this.d[0]);
      this.v[2].setText(this.w[2] + this.d[1]);
    }
    this.v[3].setText(this.w[3] + this.h);
    this.v[4].setText(this.w[4] + this.f);
    this.v[5].setText(this.w[5] + this.l);
    this.v[6].setText(this.w[6] + this.m);
    this.v[7].setText(this.w[7] + this.n);
    this.v[8].setText(this.w[8] + this.i);
    this.v[9].setText(this.w[9] + this.j);
    this.v[10].setText(this.w[10] + this.g);
    this.v[11].setText(this.w[11] + this.o);
    this.v[12].setText(this.w[12] + this.p);
    this.v[13].setText(this.w[13] + this.q);
    this.v[14].setText(this.w[14] + this.k);
  }
  
  public void a()
  {
    int i3 = 0;
    View localView = LayoutInflater.from(getContext()).inflate(2130903224, null);
    this.x[0] = ((TextView)localView.findViewById(2131559557));
    this.x[1] = ((TextView)localView.findViewById(2131559563));
    this.x[2] = ((TextView)localView.findViewById(2131559573));
    this.v[0] = ((TextView)localView.findViewById(2131559558));
    this.v[1] = ((TextView)localView.findViewById(2131559560));
    this.v[2] = ((TextView)localView.findViewById(2131559562));
    this.v[3] = ((TextView)localView.findViewById(2131559565));
    this.v[4] = ((TextView)localView.findViewById(2131559566));
    this.v[5] = ((TextView)localView.findViewById(2131559568));
    this.v[6] = ((TextView)localView.findViewById(2131559569));
    this.v[7] = ((TextView)localView.findViewById(2131559571));
    this.v[8] = ((TextView)localView.findViewById(2131559572));
    this.v[9] = ((TextView)localView.findViewById(2131559574));
    this.v[10] = ((TextView)localView.findViewById(2131559575));
    this.v[11] = ((TextView)localView.findViewById(2131559577));
    this.v[12] = ((TextView)localView.findViewById(2131559578));
    this.v[13] = ((TextView)localView.findViewById(2131559580));
    this.v[14] = ((TextView)localView.findViewById(2131559581));
    this.y[0] = localView.findViewById(2131559559);
    this.y[1] = localView.findViewById(2131559561);
    this.y[2] = localView.findViewById(2131559567);
    this.y[3] = localView.findViewById(2131559570);
    this.y[4] = localView.findViewById(2131559576);
    this.y[5] = localView.findViewById(2131559579);
    if (g.a().b() == y.a)
    {
      this.z = 0;
      i1 = 0;
      label387:
      if (i1 >= this.x.length) {
        break label479;
      }
      if (this.z != 0) {
        break label454;
      }
      this.x[i1].setBackgroundColor(getResources().getColor(2131493181));
      this.x[i1].setTextColor(getResources().getColor(2131493677));
    }
    for (;;)
    {
      i1 += 1;
      break label387;
      this.z = 1;
      break;
      label454:
      this.x[i1].setBackgroundColor(-789513);
      this.x[i1].setTextColor(-12686651);
    }
    label479:
    int i1 = 0;
    int i2;
    for (;;)
    {
      i2 = i3;
      if (i1 >= this.y.length) {
        break;
      }
      if (this.z == 1) {
        this.y[i1].setBackgroundColor(-2697514);
      }
      i1 += 1;
    }
    if (i2 < this.v.length)
    {
      this.w[i2] = ((String)this.v[i2].getText());
      if (this.z == 0) {
        this.v[i2].setTextColor(getResources().getColor(2131493677));
      }
      for (;;)
      {
        i2 += 1;
        break;
        this.v[i2].setTextColor(getResources().getColor(2131492903));
      }
    }
    addView(localView);
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      q localq = new q(paramArrayOfByte);
      int i2 = localq.e();
      Object localObject2;
      int i3;
      int i1;
      if ((i2 >>> 0 & 0x1) != 0)
      {
        localObject1 = new int[3];
        localObject2 = new int[5];
        i3 = localq.b();
        if ((i3 & 0x1) == 0) {
          break label422;
        }
        i1 = 1;
        localObject1[0] = i1;
        if ((i3 & 0x2) == 0) {
          break label428;
        }
        i1 = 1;
        label68:
        localObject1[1] = i1;
        if ((i3 & 0x4) == 0) {
          break label434;
        }
        i1 = 1;
        label83:
        localObject1[2] = i1;
        localObject2[0] = localq.h();
        localObject2[1] = localq.h();
        localObject2[2] = localq.h();
        localObject2[3] = localq.h();
        localObject2[4] = localq.d();
        if (localObject1[0] != 1) {
          break label447;
        }
        if (localObject1[2] != 1) {
          break label440;
        }
        paramArrayOfByte = "B点";
        label146:
        paramArrayOfByte = paramArrayOfByte + ",明日收盘价<" + b.g(localObject2[0], 2) + "出现S点";
        if (localObject1[1] != 1) {
          break label506;
        }
      }
      int i4;
      int i5;
      long l1;
      label422:
      label428:
      label434:
      label440:
      label447:
      label506:
      for (Object localObject1 = "向上" + ",明日收盘价<" + b.g(localObject2[2], 2) + "出现卖出机会";; localObject1 = "向下" + ",若明日收盘价>" + b.g(localObject2[3], 2) + "出现买入机会")
      {
        this.d = new String[] { paramArrayOfByte, localObject1 };
        if ((i2 >>> 1 & 0x1) == 0) {
          break label549;
        }
        i3 = localq.e();
        paramArrayOfByte = (String[][])Array.newInstance(String.class, new int[] { i3, 5 });
        localObject1 = new int[i3];
        i1 = 0;
        while (i1 < i3)
        {
          localObject2 = localq.l();
          String str = localq.l();
          localq.b();
          localq.h();
          i4 = localq.h();
          i5 = localq.e();
          l1 = b.a(localq.h());
          paramArrayOfByte[i1][0] = localObject2;
          paramArrayOfByte[i1][1] = str;
          paramArrayOfByte[i1][2] = b.b(i4 + 10000, 10000);
          paramArrayOfByte[i1][3] = String.valueOf(i5);
          paramArrayOfByte[i1][4] = b.b(l1);
          localObject1[i1] = b.h(i4 + 10000, 10000);
          i1 += 1;
        }
        i1 = 0;
        break;
        i1 = 0;
        break label68;
        i1 = 0;
        break label83;
        paramArrayOfByte = "持股";
        break label146;
        if (localObject1[2] == 1) {}
        for (paramArrayOfByte = "S点";; paramArrayOfByte = "持币")
        {
          paramArrayOfByte = paramArrayOfByte + ",若明日收盘价>" + b.g(localObject2[1], 2) + "出现B点";
          break;
        }
      }
      label549:
      if ((i2 >>> 2 & 0x1) != 0)
      {
        i1 = localq.h();
        i3 = localq.h();
        i4 = localq.h();
        i5 = localq.d();
        int i6 = localq.d();
        localq.b();
        localq.b();
        l1 = b.a(i1);
        long l2 = b.a(i3);
        long l3 = b.a(i4);
        b.c(l1);
        b.c(l2);
        b.c(l3);
        b.a(i5 / 1000.0F, 3);
        b.a(i6 / 1000.0F, 3);
        this.e = n.d(l1);
        this.f = n.d(l2);
        this.g = n.d(l3);
      }
      if ((i2 >>> 3 & 0x1) != 0)
      {
        paramArrayOfByte = new String[4];
        i1 = localq.f();
        b.h(i1 + 10000, 10000);
        i2 = localq.h();
        i3 = localq.f();
        b.h(i3 + 10000, 10000);
        i4 = localq.h();
        paramArrayOfByte[0] = (b.a(i1 / 100.0F, 2) + "%");
        paramArrayOfByte[1] = (b.a(i2 / 100.0F, 2) + "%");
        paramArrayOfByte[2] = (b.a(i3 / 100.0F, 2) + "%");
        paramArrayOfByte[3] = (b.a(i4 / 100.0F, 2) + "%");
        this.h = paramArrayOfByte[0];
        this.i = paramArrayOfByte[1];
        this.j = paramArrayOfByte[2];
        this.k = paramArrayOfByte[3];
      }
    }
    b();
  }
  
  public void setFiveAndThirtyDayData(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 6)) {
      return;
    }
    this.l = paramArrayOfString[0];
    this.m = paramArrayOfString[1];
    this.n = paramArrayOfString[2];
    this.o = paramArrayOfString[3];
    this.p = paramArrayOfString[4];
    this.q = paramArrayOfString[5];
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\KlineTechnicalLay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */