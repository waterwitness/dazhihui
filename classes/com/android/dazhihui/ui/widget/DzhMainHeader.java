package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.f;
import com.android.dazhihui.b.b;
import com.android.dazhihui.b.i;
import com.android.dazhihui.b.j;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LeftMenuConfigManager;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.header;
import com.android.dazhihui.ui.model.stock.PublicWidomMessageVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.model.stock.RightTopManager.RecevierHotVideoDataListener;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.LeftMenuItem;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.adv.ai;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DzhMainHeader
  extends LinearLayout
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, i, j, RightTopManager.RecevierHotVideoDataListener
{
  private View A;
  private PublicWidomMessageVo B;
  private TranslateAnimation C;
  private TranslateAnimation D;
  private dc E;
  private Runnable F;
  private View G;
  private AutoTextView H;
  private View I;
  private TextView J;
  private ImageView K;
  private ImageView L;
  private List<LeftMenuConfigVo.LeftMenuItem> M = new ArrayList();
  private boolean N = false;
  private boolean O = false;
  private dd P;
  int a;
  int b;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public boolean g = false;
  ai h = new cy(this, 16);
  ai i = new cz(this, 18);
  private int j = 1;
  private RadioGroup k;
  private ImageView l;
  private ImageView m;
  private ImageView n;
  private ImageView o;
  private y p;
  private NewsTabPageIndicator q;
  private List<String> r;
  private View s;
  private View t;
  private View u;
  private TextView v;
  private TextView w;
  private TextView x;
  private MarqueeTextView y;
  private Context z;
  
  public DzhMainHeader(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DzhMainHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    k();
  }
  
  private int a(View paramView)
  {
    int i1 = 0;
    while (i1 < this.k.getChildCount())
    {
      if (this.k.getChildAt(i1) == paramView) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  private RadioButton a(String paramString, int paramInt)
  {
    MyRadioButton localMyRadioButton = new MyRadioButton(getContext());
    localMyRadioButton.setId(paramInt);
    localMyRadioButton.setGravity(17);
    localMyRadioButton.setText(paramString);
    localMyRadioButton.setPadding(0, 0, 0, 0);
    localMyRadioButton.setButtonDrawable(17170445);
    localMyRadioButton.setTextSize(2, 15.0F);
    localMyRadioButton.setLayoutParams(new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(2131230839), -1));
    localMyRadioButton.setOnCheckedChangeListener(this);
    return localMyRadioButton;
  }
  
  private void k()
  {
    this.p = g.a().b();
    setOrientation(0);
    this.s = LayoutInflater.from(getContext()).inflate(2130903103, this, false);
    this.k = ((RadioGroup)this.s.findViewById(2131558851));
    this.l = ((ImageView)this.s.findViewById(2131558848));
    this.m = ((ImageView)this.s.findViewById(2131558852));
    this.n = ((ImageView)this.s.findViewById(2131558853));
    this.o = ((ImageView)this.s.findViewById(2131558854));
    this.n.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.t = this.s.findViewById(2131558850);
    this.u = this.s.findViewById(2131558847);
    this.v = ((TextView)this.s.findViewById(2131558855));
    this.w = ((TextView)this.s.findViewById(2131558849));
    this.A = this.s.findViewById(2131561343);
    this.y = ((MarqueeTextView)this.s.findViewById(2131561345));
    this.q = ((NewsTabPageIndicator)this.s.findViewById(2131558856));
    this.G = this.s.findViewById(2131558861);
    this.G.setOnClickListener(this);
    this.H = ((AutoTextView)this.s.findViewById(2131558863));
    this.x = ((TextView)this.s.findViewById(2131558864));
    this.x.setOnClickListener(this);
    this.I = this.s.findViewById(2131558857);
    this.J = ((TextView)this.s.findViewById(2131558859));
    this.K = ((ImageView)this.s.findViewById(2131558858));
    this.L = ((ImageView)this.s.findViewById(2131558860));
    this.I.setOnClickListener(this);
    int i1 = getResources().getDimensionPixelSize(2131230828);
    this.l.setOnClickListener(this);
    this.A.setOnClickListener(this);
    this.t.setOnClickListener(this);
    addView(this.s, -1, i1);
    b.a().a(this);
    m();
    ah.a().a(this.h);
    this.F = new cu(this);
  }
  
  private void l()
  {
    int i2 = 0;
    int i1 = 0;
    if (this.p == y.a)
    {
      this.s.setBackgroundColor(-13750218);
      this.k.setBackgroundResource(2130837705);
      i2 = this.k.getChildCount();
      if (this.j == 8) {
        this.m.setImageResource(2130838350);
      }
      while (i2 == 1)
      {
        this.k.getChildAt(0).setBackgroundResource(2130837707);
        if (this.n != null) {
          this.n.setImageResource(2130838724);
        }
        if (this.o != null) {
          this.o.setImageResource(2130838721);
        }
        this.A.setBackgroundResource(2130838891);
        this.G.setBackgroundResource(2130838891);
        return;
        this.m.setImageResource(2130838727);
      }
      label148:
      if (i1 < i2)
      {
        if (i1 != 0) {
          break label178;
        }
        this.k.getChildAt(i1).setBackgroundResource(2130837709);
      }
      for (;;)
      {
        i1 += 1;
        break label148;
        break;
        label178:
        if (i1 == i2 - 1) {
          this.k.getChildAt(i1).setBackgroundResource(2130837713);
        } else {
          this.k.getChildAt(i1).setBackgroundResource(2130837711);
        }
      }
    }
    if (this.j == 8) {
      this.m.setImageResource(2130838350);
    }
    int i3;
    for (;;)
    {
      this.s.setBackgroundColor(-14072189);
      this.k.setBackgroundResource(2130837704);
      i3 = this.k.getChildCount();
      i1 = i2;
      if (i3 != 1) {
        break;
      }
      this.k.getChildAt(0).setBackgroundResource(2130837706);
      if (this.n != null) {
        this.n.setImageResource(2130838806);
      }
      if (this.o != null) {
        this.o.setImageResource(2130838803);
      }
      this.A.setBackgroundResource(2130838892);
      this.G.setBackgroundResource(2130838892);
      return;
      this.m.setImageResource(2130838809);
    }
    label355:
    if (i1 < i3)
    {
      if (i1 != 0) {
        break label385;
      }
      this.k.getChildAt(i1).setBackgroundResource(2130837708);
    }
    for (;;)
    {
      i1 += 1;
      break label355;
      break;
      label385:
      if (i1 == i3 - 1) {
        this.k.getChildAt(i1).setBackgroundResource(2130837712);
      } else {
        this.k.getChildAt(i1).setBackgroundResource(2130837710);
      }
    }
  }
  
  private void m()
  {
    b localb = b.a();
    int i1 = localb.q().size();
    int i2 = localb.h();
    int i3 = localb.n();
    int i4 = localb.l().size();
    h();
    if (this.O) {
      this.a = localb.d().size();
    }
    for (this.d = (i1 + i2 + i3 + i4 + this.a);; this.d = (i1 + i2 + i3 + i4))
    {
      this.d += ah.e.size();
      n();
      return;
    }
  }
  
  private void n()
  {
    if (this.g) {
      h();
    }
    if (this.N) {}
    for (this.b = (this.d + this.c); (this.b > 0) && (this.A.getVisibility() == 8); this.b = this.d)
    {
      this.w.setVisibility(0);
      this.w.setText(String.valueOf(this.b));
      return;
    }
    this.w.setVisibility(8);
  }
  
  public void a()
  {
    if (this.p != g.a().b())
    {
      this.p = g.a().b();
      l();
    }
  }
  
  public void a(byte paramByte)
  {
    m();
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 3)
    {
      this.k.setVisibility(8);
      this.v.setVisibility(8);
      this.q.setVisibility(0);
      this.m.setVisibility(8);
      this.u.setVisibility(0);
      l();
    }
    for (;;)
    {
      if (paramInt == 8)
      {
        this.k.setVisibility(8);
        this.v.setVisibility(8);
        this.q.setVisibility(8);
        this.m.setVisibility(0);
        this.G.setVisibility(0);
        this.I.setVisibility(8);
        setSeeLiveNumber(null);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.m.getLayoutParams();
        localLayoutParams.width = getResources().getDimensionPixelOffset(2131230821);
        localLayoutParams.height = (getResources().getDimensionPixelOffset(2131230821) * 3 / 2);
        localLayoutParams.leftMargin = getResources().getDimensionPixelOffset(2131230774);
        localLayoutParams.rightMargin = getResources().getDimensionPixelOffset(2131230774);
        this.m.setPadding(0, 0, 0, 0);
        l();
      }
      return;
      if (paramInt == 5)
      {
        this.k.setVisibility(8);
        this.v.setVisibility(0);
        this.v.setText("发现");
        l();
      }
      else if (paramInt == 1)
      {
        this.k.setVisibility(8);
        this.v.setVisibility(0);
        this.v.setText("大智慧");
        l();
      }
      else
      {
        int i1;
        if ((paramInt == 2) || (paramInt == 4))
        {
          if ((this.r != null) && (this.r.size() > 0))
          {
            i1 = 0;
            while (i1 < this.r.size())
            {
              this.k.addView(a((String)this.r.get(i1), i1));
              i1 += 1;
            }
            l();
            this.k.setVisibility(0);
            this.v.setVisibility(8);
          }
        }
        else if (paramInt == 6)
        {
          if ((this.r != null) && (this.r.size() > 0))
          {
            i1 = 0;
            while (i1 < this.r.size())
            {
              this.k.addView(a((String)this.r.get(i1), i1));
              i1 += 1;
            }
            l();
            this.k.setVisibility(0);
            this.v.setVisibility(8);
            this.m.setVisibility(8);
            this.u.setVisibility(8);
            this.t.setVisibility(0);
          }
        }
        else if ((paramInt == 7) && (this.r != null) && (this.r.size() > 0))
        {
          i1 = 0;
          while (i1 < this.r.size())
          {
            this.k.addView(a((String)this.r.get(i1), i1));
            i1 += 1;
          }
          l();
          this.k.setVisibility(0);
          this.v.setVisibility(8);
          this.m.setVisibility(8);
          this.u.setVisibility(8);
          this.t.setVisibility(0);
        }
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.k.getChildAt(paramInt1) != null)
    {
      int i1 = this.k.getChildAt(paramInt1).getId();
      if ((paramInt2 != -1) && (i1 == this.k.getCheckedRadioButtonId())) {
        this.k.clearCheck();
      }
      ((RadioButton)this.k.getChildAt(paramInt1)).setChecked(true);
    }
  }
  
  public void a(Context paramContext, int paramInt, List<String> paramList)
  {
    this.j = paramInt;
    this.z = paramContext;
    this.r = paramList;
    this.k.removeAllViews();
    a(this.j);
  }
  
  public void a(View paramView, int paramInt)
  {
    if (paramInt == 1)
    {
      if (this.D == null)
      {
        this.D = new TranslateAnimation(0.0F, 0 - paramView.getWidth() - paramView.getLeft(), 0.0F, 0.0F);
        this.D.setDuration(1000L);
        this.D.setAnimationListener(new da(this, paramView));
      }
      paramView.startAnimation(this.D);
    }
    while (paramInt != 0) {
      return;
    }
    int i1 = paramView.getWidth();
    paramInt = i1;
    if (i1 == 0) {
      paramInt = this.z.getResources().getDimensionPixelOffset(2131230807);
    }
    this.C = new TranslateAnimation(-paramInt, 0.0F, 0.0F, 0.0F);
    this.C.setDuration(1000L);
    this.C.setAnimationListener(new db(this, paramView));
    paramView.startAnimation(this.C);
  }
  
  public void a(PublicWidomMessageVo paramPublicWidomMessageVo)
  {
    if (getVisibility() == 0) {
      b(paramPublicWidomMessageVo);
    }
  }
  
  public void b()
  {
    if (this.n != null) {
      this.n.setVisibility(0);
    }
    if (this.m != null) {
      this.m.setVisibility(8);
    }
    if (this.o != null) {
      this.o.setVisibility(8);
    }
  }
  
  public void b(byte paramByte)
  {
    m();
  }
  
  public void b(PublicWidomMessageVo paramPublicWidomMessageVo)
  {
    this.B = paramPublicWidomMessageVo;
    if (paramPublicWidomMessageVo.getType() == 0)
    {
      this.w.setVisibility(8);
      this.y.setText(paramPublicWidomMessageVo.getTitle());
      a(this.A, 0);
    }
    paramPublicWidomMessageVo.setType(1);
    this.y.postDelayed(this.F, 6000L);
  }
  
  public void c()
  {
    if (this.m != null) {
      this.m.setVisibility(0);
    }
    if (this.n != null) {
      this.n.setVisibility(8);
    }
    if (this.o != null) {
      this.o.setVisibility(8);
    }
  }
  
  public void d()
  {
    if (this.o != null) {
      this.o.setVisibility(0);
    }
    if (this.n != null) {
      this.n.setVisibility(8);
    }
    if (this.m != null) {
      this.m.setVisibility(8);
    }
  }
  
  public void e()
  {
    b.a().a(this);
  }
  
  public void f()
  {
    b.a().b(this);
    if ((this.A != null) && (this.A.getVisibility() == 0)) {
      this.A.setVisibility(8);
    }
  }
  
  public void g()
  {
    new AlertDialog.Builder(getContext()).setIcon(2130837525).setTitle("你确定退出？").setPositiveButton(2131165363, new cx(this)).setNegativeButton(2131165331, new cw(this)).show();
  }
  
  public int getCurrentPostion()
  {
    int i1 = 0;
    while (i1 < this.k.getChildCount())
    {
      if (((RadioButton)this.k.getChildAt(i1)).isChecked()) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  public RadioGroup getMRadioGroup()
  {
    return this.k;
  }
  
  public void h()
  {
    this.M = LeftMenuConfigManager.getInstace().getLeftMenu();
    if (this.M != null)
    {
      int i1 = 0;
      while (i1 < this.M.size())
      {
        if (((LeftMenuConfigVo.LeftMenuItem)this.M.get(i1)).countId == 20229) {
          this.O = true;
        }
        if (((LeftMenuConfigVo.LeftMenuItem)this.M.get(i1)).countId == 20225) {
          this.N = true;
        }
        i1 += 1;
      }
    }
  }
  
  public void i()
  {
    RightTopManager.getInstance().addRecevierHotVideoDataListenerList(this);
  }
  
  public void j()
  {
    RightTopManager.getInstance().removeRecevierHotVideoDataListenerList(this);
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = 0;
      while (i1 < this.k.getChildCount())
      {
        if (paramCompoundButton.getId() != this.k.getChildAt(i1).getId()) {
          ((CompoundButton)this.k.getChildAt(i1)).setChecked(false);
        }
        i1 += 1;
      }
    }
    if (this.P != null)
    {
      i1 = a(paramCompoundButton);
      this.P.a(paramCompoundButton, i1, paramBoolean);
    }
  }
  
  public void onClick(View paramView)
  {
    Object localObject;
    switch (paramView.getId())
    {
    case 2131558864: 
    default: 
    case 2131558854: 
    case 2131558850: 
      do
      {
        return;
        g();
        return;
      } while (!(this.z instanceof Activity));
      ((Activity)this.z).finish();
      return;
    case 2131558852: 
      if (this.j == 8)
      {
        localObject = m.a().g();
        paramView = (View)localObject;
        if (localObject == null) {
          paramView = (LivebarConfigVo)DzhApplication.a().b().a("liveBarconfig", new cv(this));
        }
        if ((paramView == null) || (paramView.getHeader().getZhiboUrl() == null)) {
          break label461;
        }
      }
      break;
    }
    label461:
    for (paramView = paramView.getHeader().getZhiboUrl(); !TextUtils.isEmpty(paramView); paramView = null)
    {
      r.a(paramView, this.z, "20299", null);
      return;
      paramView = new Intent();
      paramView.setClass(getContext(), SearchStockScreen.class);
      getContext().startActivity(paramView);
      return;
      if (this.E == null) {
        break;
      }
      this.E.c();
      return;
      ((MainScreen)this.z).f();
      return;
      if (this.B == null) {
        break;
      }
      new Intent();
      new Bundle();
      paramView = this.B.getUrl_page();
      localObject = this.B.getUrl_list();
      if (TextUtils.isEmpty(paramView)) {
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          paramView = (View)localObject;
        }
      }
      for (;;)
      {
        r.a(paramView, this.z, "20217", null);
        this.A.setVisibility(8);
        b.a().d().remove(this.B);
        b.a().a((byte)100);
        this.B = null;
        this.A.removeCallbacks(this.F);
        this.A.clearAnimation();
        return;
        paramView = "http://10.15.108.157/wap/style/msg/zhxx/html/index.html?vs\\u003d20160316162514";
        continue;
        paramView = new Intent();
        paramView.setClass(getContext(), SearchStockScreen.class);
        localObject = new Bundle();
        ((Bundle)localObject).putInt("sb_search_type", 1);
        paramView.putExtras((Bundle)localObject);
        getContext().startActivity(paramView);
        return;
        r.a(f.ax, getContext(), "", null);
        return;
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b.a().b(this);
    b.a().b(this);
    ah.a().b(this.h);
  }
  
  public void recevierData() {}
  
  public void setDoRefresh(dc paramdc)
  {
    this.E = paramdc;
  }
  
  public void setOnCheckedChangeListener(dd paramdd)
  {
    this.P = paramdd;
  }
  
  public void setSeeLiveNumber(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramString);
      localArrayList.add("主播名/视吧/话题");
      this.H.setShowData(localArrayList);
      this.H.a();
      return;
    }
    this.H.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DzhMainHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */