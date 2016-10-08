package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.f;
import com.android.dazhihui.ui.screen.BaseActivity;

public class MenuItemView
  extends LinearLayout
{
  private View[] A;
  private View[] B;
  private ImageView[] C;
  private TextView[] D;
  private View[] E;
  private View F;
  private LinearLayout G;
  private LinearLayout[] H;
  private BaseActivity I;
  private Drawable J;
  private Drawable K;
  private Drawable L;
  private Drawable M;
  private hh N;
  private RelativeLayout O;
  private boolean P = false;
  private ImageView Q;
  private int a;
  private int b;
  private ImageButton c;
  private TextView[] d;
  private TextView[] e;
  private TextView[] f;
  private TextView[] g;
  private TextView[] h;
  private TextView[] i;
  private TextView[] j;
  private TextView[] k;
  private TextView[] l;
  private TextView[] m;
  private TextView[] n;
  private TextView[] o;
  private TextView[] p;
  private TextView[] q;
  private TextView[] r;
  private TextView[] s;
  private TextView[] t;
  private TextView[] u;
  private TextView[] v;
  private TextView[] w;
  private TextView[] x;
  private View[] y;
  private ImageView[] z;
  
  public MenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.I = ((BaseActivity)paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.DZHLayout);
    this.b = paramContext.getInt(0, 0);
    a();
    this.J = paramContext.getDrawable(3);
    this.M = paramContext.getDrawable(4);
    paramContext.recycle();
    c();
  }
  
  private void c()
  {
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    int i2 = 0;
    ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from(getContext()).inflate(2130903568, null);
    localViewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    int i1;
    hg localhg;
    switch (this.b)
    {
    default: 
      i1 = 0;
      LayoutInflater.from(getContext()).inflate(i1, localViewGroup, true);
      localhg = new hg(this);
      this.H = new LinearLayout[4];
      switch (this.b)
      {
      }
      break;
    }
    for (;;)
    {
      addView(localViewGroup);
      b();
      return;
      i1 = 2130903280;
      break;
      i1 = 2130903291;
      break;
      i1 = 2130903294;
      break;
      i1 = 2130903295;
      break;
      i1 = 2130903296;
      break;
      i1 = 2130903297;
      break;
      i1 = 2130903298;
      break;
      i1 = 2130903299;
      break;
      i1 = 2130903300;
      break;
      i1 = 2130903281;
      break;
      i1 = 2130903282;
      break;
      i1 = 2130903283;
      break;
      i1 = 2130903284;
      break;
      i1 = 2130903285;
      break;
      i1 = 2130903286;
      break;
      i1 = 2130903287;
      break;
      i1 = 2130903288;
      break;
      i1 = 2130903290;
      break;
      i1 = 2130903292;
      break;
      i1 = 2130903293;
      break;
      this.d = new TextView[4];
      this.d[0] = ((TextView)localViewGroup.findViewById(2131559849));
      this.d[1] = ((TextView)localViewGroup.findViewById(2131559850));
      this.d[2] = ((TextView)localViewGroup.findViewById(2131559851));
      this.d[3] = ((TextView)localViewGroup.findViewById(2131559852));
      i1 = i2;
      while (i1 < this.d.length)
      {
        this.d[i1].setClickable(true);
        this.d[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.c = ((ImageButton)localViewGroup.findViewById(2131559907));
      this.G = ((LinearLayout)localViewGroup.findViewById(2131559906));
      this.c.setOnClickListener(localhg);
      this.G.setOnClickListener(localhg);
      this.e = new TextView[4];
      this.e[0] = ((TextView)localViewGroup.findViewById(2131559899));
      this.e[1] = ((TextView)localViewGroup.findViewById(2131559901));
      this.e[2] = ((TextView)localViewGroup.findViewById(2131559903));
      this.e[3] = ((TextView)localViewGroup.findViewById(2131559905));
      this.H[0] = ((LinearLayout)localViewGroup.findViewById(2131559898));
      this.H[1] = ((LinearLayout)localViewGroup.findViewById(2131559900));
      this.H[2] = ((LinearLayout)localViewGroup.findViewById(2131559902));
      this.H[3] = ((LinearLayout)localViewGroup.findViewById(2131559904));
      i1 = 0;
      for (;;)
      {
        i2 = i3;
        if (i1 >= this.H.length) {
          break;
        }
        this.H[i1].setVisibility(4);
        i1 += 1;
      }
      while (i2 < this.e.length)
      {
        this.e[i2].setClickable(true);
        this.e[i2].setOnClickListener(localhg);
        i2 += 1;
      }
      this.f = new TextView[3];
      this.f[0] = ((TextView)localViewGroup.findViewById(2131559925));
      this.f[1] = ((TextView)localViewGroup.findViewById(2131559926));
      this.f[2] = ((TextView)localViewGroup.findViewById(2131559927));
      i1 = i4;
      while (i1 < this.f.length)
      {
        this.f[i1].setClickable(true);
        this.f[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.g = new TextView[4];
      this.g[0] = ((TextView)localViewGroup.findViewById(2131559928));
      this.g[1] = ((TextView)localViewGroup.findViewById(2131559929));
      this.g[2] = ((TextView)localViewGroup.findViewById(2131559930));
      this.g[3] = ((TextView)localViewGroup.findViewById(2131559931));
      i1 = i5;
      while (i1 < this.g.length)
      {
        this.g[i1].setClickable(true);
        this.g[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.h = new TextView[2];
      this.h[0] = ((TextView)localViewGroup.findViewById(2131559932));
      this.h[1] = ((TextView)localViewGroup.findViewById(2131559933));
      i1 = i6;
      while (i1 < this.h.length)
      {
        this.h[i1].setClickable(true);
        this.h[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.i = new TextView[2];
      this.i[0] = ((TextView)localViewGroup.findViewById(2131559935));
      this.i[1] = ((TextView)localViewGroup.findViewById(2131559936));
      i1 = i7;
      while (i1 < this.i.length)
      {
        this.i[i1].setClickable(true);
        this.i[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.j = new TextView[3];
      this.j[0] = ((TextView)localViewGroup.findViewById(2131559937));
      this.j[1] = ((TextView)localViewGroup.findViewById(2131559938));
      this.j[2] = ((TextView)localViewGroup.findViewById(2131559939));
      i1 = i8;
      while (i1 < this.j.length)
      {
        this.j[i1].setClickable(true);
        this.j[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.k = new TextView[3];
      this.k[0] = ((TextView)localViewGroup.findViewById(2131559940));
      this.k[1] = ((TextView)localViewGroup.findViewById(2131559941));
      this.k[2] = ((TextView)localViewGroup.findViewById(2131559942));
      i1 = i9;
      while (i1 < this.k.length)
      {
        this.k[i1].setClickable(true);
        this.k[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.l = new TextView[5];
      this.l[0] = ((TextView)localViewGroup.findViewById(2131559943));
      this.l[1] = ((TextView)localViewGroup.findViewById(2131559944));
      this.l[2] = ((TextView)localViewGroup.findViewById(2131559945));
      this.l[3] = ((TextView)localViewGroup.findViewById(2131559946));
      this.l[4] = ((TextView)localViewGroup.findViewById(2131559947));
      i1 = i10;
      while (i1 < this.l.length)
      {
        this.l[i1].setClickable(true);
        this.l[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.m = new TextView[2];
      this.m[0] = ((TextView)localViewGroup.findViewById(2131559853));
      this.m[1] = ((TextView)localViewGroup.findViewById(2131559854));
      i1 = i11;
      while (i1 < this.m.length)
      {
        this.m[i1].setClickable(true);
        this.m[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.n = new TextView[3];
      this.n[0] = ((TextView)localViewGroup.findViewById(2131559855));
      this.n[1] = ((TextView)localViewGroup.findViewById(2131559856));
      this.n[2] = ((TextView)localViewGroup.findViewById(2131559857));
      i1 = i12;
      while (i1 < this.n.length)
      {
        this.n[i1].setClickable(true);
        this.n[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.o = new TextView[2];
      this.o[0] = ((TextView)localViewGroup.findViewById(2131559858));
      this.o[1] = ((TextView)localViewGroup.findViewById(2131559859));
      i1 = i13;
      while (i1 < this.o.length)
      {
        this.o[i1].setClickable(true);
        this.o[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.p = new TextView[3];
      this.p[0] = ((TextView)localViewGroup.findViewById(2131559861));
      this.p[1] = ((TextView)localViewGroup.findViewById(2131559863));
      this.p[2] = ((TextView)localViewGroup.findViewById(2131559864));
      this.O = ((RelativeLayout)localViewGroup.findViewById(2131559860));
      this.Q = ((ImageView)localViewGroup.findViewById(2131559862));
      i1 = i14;
      while (i1 < this.p.length)
      {
        this.p[i1].setClickable(true);
        this.p[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.q = new TextView[4];
      this.q[0] = ((TextView)localViewGroup.findViewById(2131559865));
      this.q[1] = ((TextView)localViewGroup.findViewById(2131559866));
      this.q[2] = ((TextView)localViewGroup.findViewById(2131559867));
      this.q[3] = ((TextView)localViewGroup.findViewById(2131559868));
      i1 = i15;
      while (i1 < this.q.length)
      {
        this.q[i1].setClickable(true);
        this.q[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.r = new TextView[2];
      this.r[0] = ((TextView)localViewGroup.findViewById(2131559869));
      this.r[1] = ((TextView)localViewGroup.findViewById(2131559870));
      i1 = i16;
      while (i1 < this.r.length)
      {
        this.r[i1].setClickable(true);
        this.r[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.s = new TextView[2];
      this.s[0] = ((TextView)localViewGroup.findViewById(2131559871));
      this.s[1] = ((TextView)localViewGroup.findViewById(2131559872));
      i1 = i17;
      while (i1 < this.s.length)
      {
        this.s[i1].setClickable(true);
        this.s[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.t = new TextView[4];
      this.t[0] = ((TextView)localViewGroup.findViewById(2131559873));
      this.t[1] = ((TextView)localViewGroup.findViewById(2131559874));
      this.t[2] = ((TextView)localViewGroup.findViewById(2131559875));
      this.t[3] = ((TextView)localViewGroup.findViewById(2131559876));
      i1 = i18;
      while (i1 < this.t.length)
      {
        this.t[i1].setClickable(true);
        this.t[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.u = new TextView[2];
      this.u[0] = ((TextView)localViewGroup.findViewById(2131559877));
      this.u[1] = ((TextView)localViewGroup.findViewById(2131559878));
      i1 = i19;
      while (i1 < this.u.length)
      {
        this.u[i1].setClickable(true);
        this.u[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.v = new TextView[5];
      this.B = new View[5];
      this.C = new ImageView[5];
      this.D = new TextView[4];
      this.E = new View[5];
      this.B[0] = localViewGroup.findViewById(2131559879);
      this.B[1] = localViewGroup.findViewById(2131559883);
      this.B[2] = localViewGroup.findViewById(2131559887);
      this.B[3] = localViewGroup.findViewById(2131559891);
      this.B[4] = localViewGroup.findViewById(2131559895);
      this.v[0] = ((TextView)localViewGroup.findViewById(2131559880));
      this.v[1] = ((TextView)localViewGroup.findViewById(2131559884));
      this.v[2] = ((TextView)localViewGroup.findViewById(2131559888));
      this.v[3] = ((TextView)localViewGroup.findViewById(2131559892));
      this.v[4] = ((TextView)localViewGroup.findViewById(2131559896));
      this.C[0] = ((ImageView)localViewGroup.findViewById(2131559882));
      this.C[1] = ((ImageView)localViewGroup.findViewById(2131559886));
      this.C[2] = ((ImageView)localViewGroup.findViewById(2131559890));
      this.C[3] = ((ImageView)localViewGroup.findViewById(2131559894));
      this.C[4] = ((ImageView)localViewGroup.findViewById(2131559897));
      this.D[0] = ((TextView)localViewGroup.findViewById(2131559881));
      this.D[1] = ((TextView)localViewGroup.findViewById(2131559885));
      this.D[2] = ((TextView)localViewGroup.findViewById(2131559889));
      this.D[3] = ((TextView)localViewGroup.findViewById(2131559893));
      this.F = localViewGroup.findViewById(2131559895);
      i1 = i20;
      while (i1 < this.v.length)
      {
        this.B[i1].setClickable(true);
        this.B[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.w = new TextView[2];
      this.w[0] = ((TextView)localViewGroup.findViewById(2131559908));
      this.w[1] = ((TextView)localViewGroup.findViewById(2131559909));
      i1 = i21;
      while (i1 < this.w.length)
      {
        this.w[i1].setClickable(true);
        this.w[i1].setOnClickListener(localhg);
        i1 += 1;
      }
      this.x = new TextView[6];
      this.y = new View[5];
      this.z = new ImageView[2];
      this.A = new View[2];
      this.x[0] = ((TextView)localViewGroup.findViewById(2131559910));
      this.x[1] = ((TextView)localViewGroup.findViewById(2131559912));
      this.x[2] = ((TextView)localViewGroup.findViewById(2131559915));
      this.x[3] = ((TextView)localViewGroup.findViewById(2131559919));
      this.x[4] = ((TextView)localViewGroup.findViewById(2131559922));
      this.x[5] = ((TextView)localViewGroup.findViewById(2131559924));
      this.y[0] = localViewGroup.findViewById(2131559911);
      this.y[1] = localViewGroup.findViewById(2131559913);
      this.y[2] = localViewGroup.findViewById(2131559917);
      this.y[3] = localViewGroup.findViewById(2131559921);
      this.y[4] = localViewGroup.findViewById(2131559923);
      this.A[0] = localViewGroup.findViewById(2131559914);
      this.A[1] = localViewGroup.findViewById(2131559918);
      this.z[0] = ((ImageView)localViewGroup.findViewById(2131559916));
      this.z[1] = ((ImageView)localViewGroup.findViewById(2131559920));
      i1 = i22;
      while (i1 < this.x.length)
      {
        this.x[i1].setClickable(true);
        this.x[i1].setOnClickListener(localhg);
        i1 += 1;
      }
    }
  }
  
  public void a()
  {
    this.J = getResources().getDrawable(2130838924);
    this.K = getResources().getDrawable(2130838926);
    this.M = getResources().getDrawable(2130838927);
    this.L = getResources().getDrawable(2130838925);
    if (this.b == 4)
    {
      this.a = 1;
      return;
    }
    this.a = 0;
  }
  
  public void b()
  {
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i1 = 0;
    switch (this.b)
    {
    default: 
    case 1: 
    case 0: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
      label210:
      label247:
      label263:
      label300:
      label316:
      label358:
      label375:
      label417:
      label434:
      label476:
      label493:
      label535:
      label552:
      label607:
      label635:
      label690:
      label718:
      label773:
      label801:
      label856:
      label884:
      label939:
      label967:
      label1013:
      label1039:
      label1067:
      label1162:
      label1203:
      label1217:
      label1272:
      label1300:
      label1355:
      label1383:
      label1438:
      label1468:
      label1523:
      label1553:
      label1682:
      do
      {
        do
        {
          return;
        } while (i1 >= this.e.length);
        if (i1 == this.a) {
          this.e[i1].setBackgroundDrawable(this.L);
        }
        for (;;)
        {
          i1 += 1;
          break;
          this.e[i1].setBackgroundDrawable(this.K);
        }
        if (i2 < this.d.length)
        {
          if (i2 != this.a) {
            break label247;
          }
          this.d[i2].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i2 += 1;
          break label210;
          break;
          this.d[i2].setBackgroundDrawable(this.M);
        }
        if (i3 < this.f.length)
        {
          if (i3 != this.a) {
            break label300;
          }
          this.f[i3].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i3 += 1;
          break label263;
          break;
          this.f[i3].setBackgroundDrawable(this.M);
        }
        if (i4 < this.g.length)
        {
          if (i4 != this.a) {
            break label358;
          }
          this.g[i4].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i4 += 1;
          break label316;
          break;
          this.g[i4].setBackgroundDrawable(this.M);
        }
        if (i5 < this.h.length)
        {
          if (i5 != this.a) {
            break label417;
          }
          this.h[i5].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i5 += 1;
          break label375;
          break;
          this.h[i5].setBackgroundDrawable(this.M);
        }
        if (i6 < this.i.length)
        {
          if (i6 != this.a) {
            break label476;
          }
          this.i[i6].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i6 += 1;
          break label434;
          break;
          this.i[i6].setBackgroundDrawable(this.M);
        }
        if (i7 < this.j.length)
        {
          if (i7 != this.a) {
            break label535;
          }
          this.j[i7].setBackgroundDrawable(this.J);
        }
        for (;;)
        {
          i7 += 1;
          break label493;
          break;
          this.j[i7].setBackgroundDrawable(this.M);
        }
        if (i8 < this.k.length)
        {
          if (i8 != this.a) {
            break label607;
          }
          this.k[i8].setBackgroundDrawable(this.J);
          this.k[i8].setTextColor(-4558075);
        }
        for (;;)
        {
          i8 += 1;
          break label552;
          break;
          this.k[i8].setBackgroundDrawable(this.M);
          this.k[i8].setTextColor(-1);
        }
        if (i9 < this.l.length)
        {
          if (i9 != this.a) {
            break label690;
          }
          this.l[i9].setBackgroundDrawable(this.J);
          this.l[i9].setTextColor(-4558075);
        }
        for (;;)
        {
          i9 += 1;
          break label635;
          break;
          this.l[i9].setBackgroundDrawable(this.M);
          this.l[i9].setTextColor(-1);
        }
        if (i10 < this.m.length)
        {
          if (i10 != this.a) {
            break label773;
          }
          this.m[i10].setBackgroundDrawable(this.J);
          this.m[i10].setTextColor(-4558075);
        }
        for (;;)
        {
          i10 += 1;
          break label718;
          break;
          this.m[i10].setBackgroundDrawable(this.M);
          this.m[i10].setTextColor(-1);
        }
        if (i11 < this.n.length)
        {
          if (i11 != this.a) {
            break label856;
          }
          this.n[i11].setBackgroundDrawable(this.J);
          this.n[i11].setTextColor(-4558075);
        }
        for (;;)
        {
          i11 += 1;
          break label801;
          break;
          this.n[i11].setBackgroundDrawable(this.M);
          this.n[i11].setTextColor(-1);
        }
        if (i12 < this.o.length)
        {
          if (i12 != this.a) {
            break label939;
          }
          this.o[i12].setBackgroundDrawable(this.J);
          this.o[i12].setTextColor(-4558075);
        }
        for (;;)
        {
          i12 += 1;
          break label884;
          break;
          this.o[i12].setBackgroundDrawable(this.M);
          this.o[i12].setTextColor(-1);
        }
        if (i13 < this.p.length)
        {
          if (this.a != 0) {
            break label1067;
          }
          this.O.setBackgroundDrawable(this.J);
          if (i13 != 0) {
            break label1039;
          }
          this.p[i13].setTextColor(-4558075);
          if (this.P) {
            this.Q.setImageResource(2130838407);
          }
        }
        for (;;)
        {
          i13 += 1;
          break label967;
          break;
          this.p[i13].setBackgroundDrawable(this.M);
          this.p[i13].setTextColor(-1);
          break label1013;
          if (i13 == this.a)
          {
            this.p[i13].setBackgroundDrawable(this.J);
            this.p[i13].setTextColor(-4558075);
          }
          else
          {
            this.O.setBackgroundDrawable(this.M);
            this.p[i13].setBackgroundDrawable(this.M);
            this.p[i13].setTextColor(-1);
            if (this.P) {
              this.Q.setImageResource(2130838408);
            }
          }
        }
        if (i14 < this.q.length)
        {
          if (i14 != this.a) {
            break label1203;
          }
          this.q[i14].setTextColor(-4558075);
        }
        for (;;)
        {
          i14 += 1;
          break label1162;
          break;
          this.q[i14].setTextColor(-1);
        }
        if (i15 < this.r.length)
        {
          if (i15 != this.a) {
            break label1272;
          }
          this.r[i15].setBackgroundDrawable(this.J);
          this.r[i15].setTextColor(-4558075);
        }
        for (;;)
        {
          i15 += 1;
          break label1217;
          break;
          this.r[i15].setBackgroundDrawable(this.M);
          this.r[i15].setTextColor(-1);
        }
        if (i16 < this.s.length)
        {
          if (i16 != this.a) {
            break label1355;
          }
          this.s[i16].setBackgroundDrawable(this.J);
          this.s[i16].setTextColor(-9086201);
        }
        for (;;)
        {
          i16 += 1;
          break label1300;
          break;
          this.s[i16].setBackgroundDrawable(this.M);
          this.s[i16].setTextColor(-1);
        }
        if (i17 < this.t.length)
        {
          if (i17 != this.a) {
            break label1438;
          }
          this.t[i17].setBackgroundDrawable(this.J);
          this.t[i17].setTextColor(65280);
        }
        for (;;)
        {
          i17 += 1;
          break label1383;
          break;
          this.t[i17].setBackgroundDrawable(this.M);
          this.t[i17].setTextColor(-7370108);
        }
        if (i18 < this.u.length)
        {
          if (i18 != this.a) {
            break label1523;
          }
          this.u[i18].setBackgroundDrawable(this.J);
          this.u[i18].setTextColor(-9086201);
        }
        for (;;)
        {
          i18 += 1;
          break label1468;
          break;
          this.u[i18].setBackgroundDrawable(this.M);
          this.u[i18].setTextColor(-1);
        }
        i1 = 0;
        if (i1 < this.v.length)
        {
          if (this.a == 4)
          {
            this.F.setBackgroundColor(getResources().getColor(2131493328));
            return;
          }
          if (i1 != this.a) {
            break label1682;
          }
          this.v[i1].setBackgroundDrawable(this.J);
          this.v[i1].getPaint().setFlags(8);
          this.v[i1].getPaint().setAntiAlias(true);
          this.v[i1].setTextColor(-940800);
          this.v[i1].setBackgroundColor(0);
          this.F.setBackgroundColor(getResources().getColor(2131493456));
        }
        for (;;)
        {
          i1 += 1;
          break label1553;
          break;
          this.v[i1].setBackgroundDrawable(this.M);
          this.v[i1].getPaint().setFlags(0);
          this.v[i1].setTextColor(-1);
          this.v[i1].setBackgroundColor(0);
          this.F.setBackgroundColor(getResources().getColor(2131493456));
        }
      } while (i19 >= this.w.length);
      if (i19 == this.a)
      {
        this.w[i19].setBackgroundDrawable(this.J);
        this.w[i19].setTextColor(-9086201);
      }
      for (;;)
      {
        i19 += 1;
        break;
        this.w[i19].setBackgroundDrawable(this.M);
        this.w[i19].setTextColor(-1);
      }
    }
    i1 = 0;
    label1833:
    if (i1 < this.x.length)
    {
      if (i1 != this.a) {
        break label1942;
      }
      this.x[i1].getPaint().setFlags(0);
      this.x[i1].getPaint().setAntiAlias(true);
      this.x[i1].setTextColor(-1);
      this.x[i1].setBackgroundColor(-13486781);
      if (i1 != 2) {
        break label1922;
      }
      this.A[0].setBackgroundColor(-13486781);
    }
    for (;;)
    {
      i1 += 1;
      break label1833;
      break;
      label1922:
      if (i1 == 3)
      {
        this.A[1].setBackgroundColor(-13486781);
        continue;
        label1942:
        this.x[i1].getPaint().setFlags(0);
        this.x[i1].setTextColor(-1);
        this.x[i1].setBackgroundColor(0);
        if (i1 == 2) {
          this.A[0].setBackgroundColor(0);
        } else if (i1 == 3) {
          this.A[1].setBackgroundColor(0);
        }
      }
    }
  }
  
  public int getCurrentIndex()
  {
    return this.a;
  }
  
  public View getSelectedView()
  {
    return this.v[this.a];
  }
  
  public int getType()
  {
    return this.b;
  }
  
  public void setCurIndex(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setImgInVisible(int paramInt)
  {
    if (this.b == 20) {
      this.z[(paramInt - 3)].setVisibility(8);
    }
  }
  
  public void setImgVisible(int paramInt)
  {
    if (this.b == 20) {
      this.z[(paramInt - 3)].setVisibility(0);
    }
  }
  
  public void setOnChangeListener(hh paramhh)
  {
    this.N = paramhh;
  }
  
  public void setSelectIndex(int paramInt)
  {
    if (paramInt < 0) {
      return;
    }
    this.a = paramInt;
    b();
  }
  
  public void setText(String[] paramArrayOfString)
  {
    int i1 = 0;
    while (i1 < this.v.length)
    {
      this.v[i1].setText(paramArrayOfString[i1]);
      i1 += 1;
    }
  }
  
  public void setType(int paramInt)
  {
    if (this.b == paramInt) {
      return;
    }
    removeAllViews();
    this.b = paramInt;
    c();
  }
  
  public void setViewInVisible(int paramInt)
  {
    if (this.b == 20)
    {
      if (paramInt == 3) {
        this.A[1].setVisibility(8);
      }
      this.y[(paramInt - 1)].setVisibility(8);
      this.x[paramInt].setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */