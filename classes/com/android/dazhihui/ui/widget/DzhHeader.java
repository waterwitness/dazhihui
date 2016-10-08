package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.f;
import com.android.dazhihui.ui.model.stock.adapter.MinuteTitleGridAdpter;
import com.android.dazhihui.ui.screen.y;

public class DzhHeader
  extends RelativeLayout
  implements View.OnClickListener
{
  private ScrollButton A;
  private SwitchButton B;
  private DzhMainHeader C;
  private WriteableImageView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private TextView H;
  private ImageView I;
  private View J;
  private View K;
  private ProgressBar L;
  private boolean M;
  private String N;
  private LinearLayout O;
  private WriteableImageView P;
  private WriteableImageView Q;
  private View.OnClickListener R;
  private ct S = null;
  private boolean T = false;
  private String U = "";
  int a;
  int b;
  int c;
  int d;
  PopupWindow e;
  cr f;
  cq g;
  cp h;
  cp i;
  String j;
  Drawable k;
  Drawable l;
  Drawable m;
  boolean n;
  Drawable o;
  Drawable p;
  Drawable q;
  Drawable r;
  Context s;
  AttributeSet t;
  private WriteableImageView u;
  private WriteableImageView v;
  private View w;
  private ProgressBar x;
  private WriteableImageView y;
  private WriteableImageView z;
  
  public DzhHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903552, this);
    this.u = ((WriteableImageView)findViewById(2131561195));
    this.v = ((WriteableImageView)findViewById(2131561209));
    this.O = ((LinearLayout)findViewById(2131561210));
    this.P = ((WriteableImageView)findViewById(2131561211));
    this.Q = ((WriteableImageView)findViewById(2131561212));
    this.w = findViewById(2131561204);
    this.x = ((ProgressBar)findViewById(2131561207));
    this.y = ((WriteableImageView)findViewById(2131561205));
    this.G = ((TextView)findViewById(2131561206));
    this.z = ((WriteableImageView)findViewById(2131561202));
    this.H = ((TextView)findViewById(2131561203));
    this.L = ((ProgressBar)findViewById(2131561200));
    this.A = ((ScrollButton)findViewById(2131561213));
    this.B = ((SwitchButton)findViewById(2131560917));
    this.C = ((DzhMainHeader)findViewById(2131560918));
    this.D = ((WriteableImageView)findViewById(2131561208));
    this.E = ((TextView)findViewById(2131561199));
    this.F = ((TextView)findViewById(2131561196));
    this.I = ((ImageView)findViewById(2131561197));
    this.J = findViewById(2131561204);
    this.K = findViewById(2131561201);
    this.u.setTag(Integer.valueOf(0));
    this.v.setTag(Integer.valueOf(1));
    this.y.setTag(Integer.valueOf(2));
    this.z.setTag(Integer.valueOf(3));
    this.D.setTag(Integer.valueOf(4));
    this.F.setTag(Integer.valueOf(5));
    this.u.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.y.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.F.setOnClickListener(this);
    this.v.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230895));
    this.u.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230899));
    this.y.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230899));
    this.z.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230899));
    this.P.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230895));
    this.Q.setTextSize(paramContext.getResources().getDimensionPixelSize(2131230901));
    this.l = getResources().getDrawable(2130837540);
    this.j = getResources().getString(2131165275);
    this.k = getResources().getDrawable(2130838108);
    this.m = getResources().getDrawable(2130837600);
    this.o = getResources().getDrawable(2130838114);
    this.p = getResources().getDrawable(2130838123);
    this.q = getResources().getDrawable(2130838094);
    this.r = getResources().getDrawable(2130838129);
    this.e = new PopupWindow(paramContext);
    this.e.setWidth(-2);
    this.e.setHeight(-2);
    this.e.setFocusable(false);
    this.e.setBackgroundDrawable(new ColorDrawable(0));
    this.s = paramContext;
    this.t = paramAttributeSet;
    this.g = new cq(this);
    this.g.a = ((LinearLayout)inflate(getContext(), 2130903571, null));
    this.g.b = ((ImageView)this.g.a.findViewById(2131561258));
    this.g.c = ((GridView)this.g.a.findViewById(2131561259));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.DzhHeader);
    this.N = paramContext.getString(5);
    paramContext.recycle();
    this.f = new cr(this);
    if ((this.N != null) && (this.N.equals("centerMessage"))) {}
    for (this.f.a = ((LinearLayout)inflate(getContext(), 2130903574, null));; this.f.a = ((LinearLayout)inflate(getContext(), 2130903573, null)))
    {
      this.f.b = ((ImageView)this.f.a.findViewById(2131561262));
      this.f.c = ((ListView)this.f.a.findViewById(2131561263));
      setBackgroundColor(-13750218);
      return;
    }
  }
  
  private void a(View paramView)
  {
    if (this.e.isShowing()) {
      this.e.dismiss();
    }
    if (this.g.c.getCount() == 0) {}
    do
    {
      return;
      this.g.a(paramView, getWidth());
      this.e.setContentView(this.g.a);
      this.e.setWindowLayoutMode(-2, -2);
      this.e.setFocusable(true);
      paramView.getLocationOnScreen(new int[2]);
      this.e.showAsDropDown(paramView, 0, -this.g.e);
      this.e.update();
    } while (!this.T);
    n.a(this.U, 1215);
  }
  
  private boolean a(BaseAdapter paramBaseAdapter, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    if ((paramBaseAdapter == null) || (paramOnItemClickListener == null))
    {
      this.f = null;
      return false;
    }
    if (this.f == null)
    {
      this.f = new cr(this);
      if ((this.N == null) || (!this.N.equals("centerMessage"))) {
        break label238;
      }
    }
    label238:
    for (this.f.a = ((LinearLayout)inflate(getContext(), 2130903574, null));; this.f.a = ((LinearLayout)inflate(getContext(), 2130903573, null)))
    {
      this.f.b = ((ImageView)this.f.a.findViewById(2131561262));
      this.f.c = ((ListView)this.f.a.findViewById(2131561263));
      this.f.c.setAdapter(paramBaseAdapter);
      if ((paramBaseAdapter != null) && (paramBaseAdapter.getCount() > 6))
      {
        paramBaseAdapter = paramBaseAdapter.getView(0, null, this.f.c);
        paramBaseAdapter.measure(0, 0);
        int i1 = paramBaseAdapter.getMeasuredHeight();
        paramBaseAdapter = this.f.c.getLayoutParams();
        paramBaseAdapter.height = (i1 * 6 + this.f.c.getDividerHeight() * 6 + 20);
        this.f.c.setLayoutParams(paramBaseAdapter);
      }
      this.f.c.setOnItemClickListener(new cm(this, paramOnItemClickListener));
      return true;
    }
  }
  
  private boolean a(MinuteTitleGridAdpter paramMinuteTitleGridAdpter, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    if ((paramMinuteTitleGridAdpter == null) || (paramOnItemClickListener == null))
    {
      this.g = null;
      return false;
    }
    if (this.g == null)
    {
      this.g = new cq(this);
      this.g.a = ((LinearLayout)inflate(getContext(), 2130903571, null));
      this.g.b = ((ImageView)this.g.a.findViewById(2131561258));
      this.g.c = ((GridView)this.g.a.findViewById(2131561259));
    }
    this.g.c.setAdapter(paramMinuteTitleGridAdpter);
    this.g.c.setOnItemClickListener(new cn(this, paramOnItemClickListener));
    return (this.g.c.getAdapter() != null) && (paramOnItemClickListener != null);
  }
  
  private void b(View paramView)
  {
    if (this.e.isShowing()) {
      this.e.dismiss();
    }
    if (this.f.c.getCount() == 0) {
      return;
    }
    if ((this.N != null) && (this.N.equals("centerMessage"))) {
      this.v.a(this.S.d, 4);
    }
    this.f.a();
    this.e.setContentView(this.f.a);
    this.e.setWindowLayoutMode(-2, -2);
    this.e.setFocusable(true);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    this.e.showAtLocation(this, 49, 0, arrayOfInt[1] + paramView.getHeight() - this.f.e);
    this.e.update();
    this.e.setOnDismissListener(new cl(this));
  }
  
  public void a()
  {
    if ((this.M) && (this.x != null))
    {
      this.x.setVisibility(0);
      this.y.setVisibility(8);
    }
    for (;;)
    {
      this.M = false;
      return;
      this.L.setVisibility(0);
    }
  }
  
  public void a(Context paramContext, cs paramcs)
  {
    this.S = new ct();
    a(paramContext, paramcs, false);
  }
  
  public void a(Context paramContext, cs paramcs, boolean paramBoolean)
  {
    if (this.S == null) {
      this.S = new ct();
    }
    paramcs.createTitleObj(paramContext, this.S);
    this.a = (this.S.a & 0xF);
    label214:
    label277:
    label333:
    int i1;
    switch (this.a)
    {
    default: 
      this.u.setVisibility(8);
      this.b = (this.S.a & 0xF0);
      switch (this.b)
      {
      default: 
        this.v.setVisibility(0);
        this.A.setVisibility(4);
        this.B.setVisibility(4);
        this.C.setVisibility(8);
        this.v.a();
        this.v.setImageDrawable(this.S.c);
        this.c = (this.S.a & 0xF00);
        switch (this.c)
        {
        default: 
          this.w.setVisibility(8);
          this.d = (this.S.a & 0xF000);
          switch (this.d)
          {
          default: 
            this.z.setVisibility(8);
            i1 = this.S.a & 0xF0000;
            if (i1 == 65536)
            {
              this.v.setVisibility(8);
              this.E.setVisibility(0);
              this.F.setVisibility(8);
            }
            break;
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      this.i = this.S.p;
      paramcs.getTitle(this);
      return;
      this.u.setVisibility(0);
      this.u.a(this.S.b, 0);
      if (this.S.b.equals("返回"))
      {
        this.u.setBackgroundDrawable(this.k);
        break;
      }
      this.u.setBackgroundDrawable(this.m);
      break;
      this.u.setVisibility(0);
      this.u.a();
      this.u.setImageDrawable(this.k);
      break;
      this.u.setVisibility(0);
      this.u.a();
      this.u.setImageDrawable(this.l);
      break;
      this.v.setVisibility(0);
      this.A.setVisibility(4);
      this.B.setVisibility(4);
      this.C.setVisibility(8);
      paramContext = this.v;
      Object localObject = this.S.d;
      if (this.S.r) {}
      for (i1 = 1;; i1 = 0)
      {
        paramContext.a((String)localObject, i1);
        break;
      }
      this.v.setVisibility(0);
      this.A.setVisibility(4);
      this.B.setVisibility(4);
      this.C.setVisibility(8);
      this.v.setVisibility(4);
      this.O.setVisibility(0);
      this.P.setVisibility(0);
      this.Q.setVisibility(0);
      this.P.a(this.S.s, 0);
      if (this.S.t == null)
      {
        this.Q.setVisibility(8);
        break label214;
      }
      this.Q.setVisibility(0);
      this.Q.a(this.S.t, 0);
      break label214;
      this.v.setVisibility(0);
      this.A.setVisibility(4);
      this.B.setVisibility(4);
      this.C.setVisibility(8);
      this.v.a(this.S.d, 2);
      a(this.S.i, this.S.j);
      this.n = this.S.q;
      break label214;
      this.v.setVisibility(4);
      this.C.setVisibility(8);
      this.A.setVisibility(0);
      this.A.setButtonSwitchListener(this.S.o);
      this.B.setVisibility(4);
      break label214;
      this.v.setVisibility(4);
      this.A.setVisibility(4);
      this.B.setVisibility(8);
      this.C.setVisibility(0);
      break label214;
      this.w.setVisibility(0);
      this.y.a();
      if (a(this.S.m, this.S.n))
      {
        if (!this.T)
        {
          this.y.setImageDrawable(this.o);
          break label277;
        }
        if (this.S.k != null)
        {
          this.y.setImageDrawable(this.S.k);
          break label277;
        }
        this.y.setImageDrawable(this.o);
        break label277;
      }
      this.y.setImageDrawable(this.p);
      break label277;
      this.w.setVisibility(0);
      this.y.a(this.S.h, 0);
      break label277;
      this.w.setVisibility(0);
      this.y.a();
      this.y.setImageDrawable(this.S.k);
      break label277;
      this.z.setVisibility(0);
      this.z.a();
      localObject = this.z;
      if (this.S.f == null) {}
      for (paramContext = this.r;; paramContext = this.S.f)
      {
        ((WriteableImageView)localObject).setImageDrawable(paramContext);
        break;
      }
      this.z.setVisibility(0);
      this.z.a(this.S.e, 0);
      break label333;
      this.D.setVisibility(8);
      this.E.setVisibility(8);
      if ((i1 == 131072) || (i1 == 262144))
      {
        if ((i1 == 262144) && (this.S.g != null))
        {
          this.F.setText("");
          this.F.setBackgroundDrawable(this.S.g);
        }
        this.F.setVisibility(0);
      }
      else
      {
        this.F.setVisibility(8);
      }
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (co.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        setBackgroundColor(getResources().getColor(2131493536));
        if ((this.f != null) && (this.f.b != null)) {
          this.f.b.setImageResource(2130838118);
        }
      } while ((this.f == null) || (this.f.c == null) || ((this.N != null) && (this.N.equals("centerMessage"))));
      this.f.c.setBackgroundResource(2130837566);
      this.f.c.setDivider(new ColorDrawable(-16777216));
      this.f.c.setDividerHeight(2);
      return;
      setBackgroundColor(getResources().getColor(2131493599));
      if ((this.f != null) && (this.f.b != null)) {
        this.f.b.setImageResource(2130838121);
      }
    } while ((this.f == null) || (this.f.c == null) || ((this.N != null) && (this.N.equals("centerMessage"))));
    this.f.c.setBackgroundResource(2130838788);
    this.f.c.setDivider(new ColorDrawable(-2697514));
    this.f.c.setDividerHeight(2);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.P.a(paramString1, 0);
    if (paramString2 == null)
    {
      this.Q.setVisibility(8);
      return;
    }
    this.Q.setVisibility(0);
    this.Q.a(paramString2, 0);
  }
  
  public void b()
  {
    if ((this.x != null) && (this.x.getVisibility() == 0)) {
      this.y.setVisibility(0);
    }
    this.x.setVisibility(8);
    this.L.setVisibility(8);
  }
  
  public void c()
  {
    onClick(this.v);
  }
  
  public SwitchButton getSwitchButton()
  {
    return this.B;
  }
  
  public ct getTitleObj()
  {
    return this.S;
  }
  
  public DzhMainHeader getTradeLoginChildPapeIndicator()
  {
    return this.C;
  }
  
  public void onClick(View paramView)
  {
    boolean bool;
    if (((Integer)paramView.getTag()).intValue() == 10)
    {
      a(paramView);
      bool = true;
    }
    for (;;)
    {
      if ((this.h != null) && (!bool)) {
        this.h.OnChildClick(paramView);
      }
      if ((((Integer)paramView.getTag()).intValue() == 5) && (this.R != null)) {
        this.R.onClick(paramView);
      }
      return;
      if ((((Integer)paramView.getTag()).intValue() == 2) && (this.c == 512) && (this.g != null))
      {
        a(paramView);
        bool = true;
      }
      else if ((((Integer)paramView.getTag()).intValue() == 1) && (this.b == 64) && (this.f != null))
      {
        b(paramView);
        bool = true;
      }
      else if (this.i != null)
      {
        bool = this.i.OnChildClick(paramView);
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public void setIsMinute(boolean paramBoolean)
  {
    this.T = paramBoolean;
  }
  
  public void setMoreRefresh(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
  
  public void setMoreText(String paramString)
  {
    this.G.setText(paramString);
    ((RelativeLayout.LayoutParams)this.J.getLayoutParams()).height = -2;
    paramString = (RelativeLayout.LayoutParams)this.y.getLayoutParams();
    paramString.width = getResources().getDimensionPixelOffset(2131230799);
    paramString.height = getResources().getDimensionPixelOffset(2131230799);
    this.G.setVisibility(0);
    this.J.setTag(Integer.valueOf(10));
    this.J.setOnClickListener(this);
    this.y.setClickable(false);
    this.G.setClickable(false);
  }
  
  public void setOnHeaderButtonClickListener(cp paramcp)
  {
    this.h = paramcp;
  }
  
  public void setOnTuiJianClickListener(View.OnClickListener paramOnClickListener)
  {
    this.R = paramOnClickListener;
  }
  
  public void setRightText(int paramInt)
  {
    if (this.d == 16384) {
      this.z.a(paramInt, false);
    }
  }
  
  public void setRightText(String paramString)
  {
    if (this.d == 16384) {
      this.z.a(paramString, 0);
    }
  }
  
  public void setRightTextTag(String paramString)
  {
    this.H.setText(paramString);
    ((RelativeLayout.LayoutParams)this.K.getLayoutParams()).height = -2;
    paramString = (RelativeLayout.LayoutParams)this.z.getLayoutParams();
    paramString.width = getResources().getDimensionPixelOffset(2131230799);
    paramString.height = getResources().getDimensionPixelOffset(2131230799);
    this.H.setVisibility(0);
    this.K.setTag(Integer.valueOf(3));
    this.K.setOnClickListener(this);
    this.z.setClickable(false);
    this.H.setClickable(false);
  }
  
  public void setStockCode(String paramString)
  {
    this.U = paramString;
  }
  
  public void setTitle(int paramInt)
  {
    this.v.a(paramInt, false);
  }
  
  public void setTitle(String paramString)
  {
    this.v.a(paramString, 0);
  }
  
  public void setTuiJianRed(boolean paramBoolean)
  {
    if (this.I != null)
    {
      if (paramBoolean) {
        this.I.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.I.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DzhHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */