package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.q;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter.SortMode;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockEditScreen;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.y;

public class SelfStockSortMenuLayout
  extends RelativeLayout
  implements View.OnClickListener
{
  private int A;
  private LayoutInflater a;
  private Context b;
  private View c;
  private View d;
  private View e;
  private View f;
  private View g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private ImageView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private View t;
  private eu u;
  private Bitmap v;
  private Bitmap w;
  private Bitmap x;
  private Bitmap y;
  private int z;
  
  public SelfStockSortMenuLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SelfStockSortMenuLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext;
    this.a = LayoutInflater.from(paramContext);
    this.a.inflate(2130903414, this);
    this.t = findViewById(2131558582);
    this.e = findViewById(2131560375);
    this.c = findViewById(2131560381);
    this.d = findViewById(2131560385);
    this.o = ((TextView)findViewById(2131560382));
    this.p = ((TextView)findViewById(2131560386));
    this.q = ((TextView)findViewById(2131560374));
    this.r = ((TextView)findViewById(2131560377));
    this.s = ((TextView)findViewById(2131560380));
    this.l = ((ImageView)findViewById(2131560379));
    this.m = ((ImageView)findViewById(2131560376));
    this.n = ((ImageView)findViewById(2131560373));
    this.f = findViewById(2131560372);
    this.g = findViewById(2131560378);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.h = ((ImageView)findViewById(2131560383));
    this.i = ((ImageView)findViewById(2131560384));
    this.j = ((ImageView)findViewById(2131560387));
    this.k = ((ImageView)findViewById(2131560388));
    paramContext = BitmapFactory.decodeResource(getResources(), 2130838687);
    paramAttributeSet = new Matrix();
    paramAttributeSet.postRotate(90.0F);
    this.v = Bitmap.createBitmap(paramContext, 0, 0, paramContext.getWidth(), paramContext.getHeight(), paramAttributeSet, true);
    paramAttributeSet = new Matrix();
    paramAttributeSet.postRotate(-90.0F);
    this.w = Bitmap.createBitmap(paramContext, 0, 0, paramContext.getWidth(), paramContext.getHeight(), paramAttributeSet, true);
    paramContext = BitmapFactory.decodeResource(getResources(), 2130838688);
    paramAttributeSet = new Matrix();
    paramAttributeSet.postRotate(90.0F);
    this.x = Bitmap.createBitmap(paramContext, 0, 0, paramContext.getWidth(), paramContext.getHeight(), paramAttributeSet, true);
    paramAttributeSet = new Matrix();
    paramAttributeSet.postRotate(-90.0F);
    this.y = Bitmap.createBitmap(paramContext, 0, 0, paramContext.getWidth(), paramContext.getHeight(), paramAttributeSet, true);
    this.h.setImageBitmap(this.w);
    this.i.setImageBitmap(this.v);
    this.j.setImageBitmap(this.w);
    this.k.setImageBitmap(this.v);
    this.z = getResources().getColor(2131493563);
    this.A = getResources().getColor(2131493617);
    this.m.setImageDrawable(q.a(this.b, 2130838583, this.A));
  }
  
  public void a()
  {
    HomeViewAdapter.SortMode localSortMode;
    if (this.u != null)
    {
      localSortMode = this.u.c();
      if (this.u.d() != 2) {
        break label98;
      }
      this.p.setText("成交量");
      if ((localSortMode != HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC) && (localSortMode != HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC)) {
        break label71;
      }
      this.u.a(HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC);
    }
    for (;;)
    {
      this.u.show();
      b();
      return;
      label71:
      if ((localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC) || (localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC))
      {
        this.u.a(HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC);
        continue;
        label98:
        if (this.u.d() == 1)
        {
          this.p.setText("涨跌额");
          if ((localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC) || (localSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC)) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC);
          } else if ((localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC) || (localSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC)) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC);
          }
        }
        else
        {
          this.p.setText("涨幅");
          if ((localSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC) || (localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC)) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC);
          } else if ((localSortMode == HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC) || (localSortMode == HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC)) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC);
          }
        }
      }
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (kt.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.t == null);
      this.t.setBackgroundResource(2130838703);
      this.z = getResources().getColor(2131493563);
      this.o.setTextColor(this.z);
      this.p.setTextColor(this.z);
      this.q.setTextColor(this.z);
      this.s.setTextColor(this.z);
      this.l.setImageDrawable(q.a(this.b, 2130838584, this.z));
      this.n.setImageDrawable(q.a(this.b, 2130838585, this.z));
      this.f.setBackgroundResource(2130838704);
      this.g.setBackgroundResource(2130838704);
      this.e.setBackgroundResource(2130838704);
      this.c.setBackgroundResource(2130838704);
      this.d.setBackgroundResource(2130838704);
      b();
      return;
    } while (this.t == null);
    this.t.setBackgroundColor(getResources().getColor(2131493608));
    this.z = getResources().getColor(2131493626);
    this.o.setTextColor(this.z);
    this.p.setTextColor(this.z);
    this.q.setTextColor(this.z);
    this.s.setTextColor(this.z);
    this.l.setImageDrawable(q.a(this.b, 2130838584));
    this.n.setImageDrawable(q.a(this.b, 2130838585));
    this.f.setBackgroundResource(2130838790);
    this.g.setBackgroundResource(2130838790);
    this.e.setBackgroundResource(2130838790);
    this.c.setBackgroundResource(2130838790);
    this.d.setBackgroundResource(2130838790);
    b();
  }
  
  public void b()
  {
    if (this.u != null) {}
    switch (kt.b[this.u.c().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.h.setImageBitmap(this.w);
      this.i.setImageBitmap(this.v);
      this.j.setImageBitmap(this.w);
      this.k.setImageBitmap(this.v);
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      this.o.setTextColor(this.z);
      this.p.setTextColor(this.z);
      return;
    case 2: 
      this.h.setImageBitmap(this.y);
      this.i.setImageBitmap(this.v);
      this.j.setImageBitmap(this.w);
      this.k.setImageBitmap(this.v);
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      this.o.setTextColor(this.A);
      this.p.setTextColor(this.z);
      return;
    case 3: 
      this.h.setImageBitmap(this.w);
      this.i.setImageBitmap(this.x);
      this.j.setImageBitmap(this.w);
      this.k.setImageBitmap(this.v);
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      this.o.setTextColor(this.A);
      this.p.setTextColor(this.z);
      return;
    case 4: 
    case 5: 
    case 6: 
      this.h.setImageBitmap(this.w);
      this.i.setImageBitmap(this.v);
      this.j.setImageBitmap(this.y);
      this.k.setImageBitmap(this.v);
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      this.o.setTextColor(this.z);
      this.p.setTextColor(this.A);
      return;
    }
    this.h.setImageBitmap(this.w);
    this.i.setImageBitmap(this.v);
    this.j.setImageBitmap(this.w);
    this.k.setImageBitmap(this.x);
    this.f.setVisibility(8);
    this.e.setVisibility(0);
    this.o.setTextColor(this.z);
    this.p.setTextColor(this.A);
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (this.u != null)) {
      localObject = this.u.c();
    }
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560381: 
      if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZX_DESC) {
        this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZX_ASC);
      }
      for (;;)
      {
        this.u.show();
        b();
        return;
        if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZX_ASC) {
          this.u.a(HomeViewAdapter.SortMode.SORT_MODE_NONE);
        } else {
          this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZX_DESC);
        }
      }
    case 2131560385: 
      if (this.u.d() == 2) {
        if (localObject == HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC) {
          this.u.a(HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC);
        }
      }
      for (;;)
      {
        this.u.show();
        b();
        return;
        if (localObject == HomeViewAdapter.SortMode.SORT_MODE_CJL_ASC)
        {
          this.u.a(HomeViewAdapter.SortMode.SORT_MODE_NONE);
        }
        else
        {
          this.u.a(HomeViewAdapter.SortMode.SORT_MODE_CJL_DESC);
          continue;
          if (this.u.d() == 1)
          {
            if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC) {
              this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC);
            } else if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZD_ASC) {
              this.u.a(HomeViewAdapter.SortMode.SORT_MODE_NONE);
            } else {
              this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZD_DESC);
            }
          }
          else if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC);
          } else if (localObject == HomeViewAdapter.SortMode.SORT_MODE_ZF_ASC) {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_NONE);
          } else {
            this.u.a(HomeViewAdapter.SortMode.SORT_MODE_ZF_DESC);
          }
        }
      }
    case 2131560375: 
      this.u.a(HomeViewAdapter.SortMode.SORT_MODE_NONE);
      this.u.show();
      b();
      return;
    case 2131560372: 
      n.a("", 1177);
      this.b.startActivity(new Intent(this.b, SelfStockEditScreen.class));
      return;
    }
    n.a("", 1148);
    paramView = new Intent(this.b, MoreNewsListScreen.class);
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("url", "1");
    ((Bundle)localObject).putInt("type", 2);
    ((Bundle)localObject).putString("name", this.b.getResources().getString(2131166276));
    paramView.putExtras((Bundle)localObject);
    this.b.startActivity(paramView);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setHomeViewFragment(eu parameu)
  {
    this.u = parameu;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SelfStockSortMenuLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */