package com.android.dazhihui.ui.delegate.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.TradeOutsideScreen;
import java.util.ArrayList;

public class TradeAccountSwitchView
  extends RelativeLayout
  implements View.OnClickListener
{
  public LayoutInflater a;
  private RelativeLayout b;
  private ImageView c;
  private TextView d;
  private TextView e;
  private ImageView f;
  private Button g;
  private Dialog h;
  private View i;
  private int j;
  private ArrayList<f> k;
  private d l;
  private ListView m;
  private e n;
  private LinearLayout o;
  
  public TradeAccountSwitchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903463, this);
    b();
    c();
    d();
  }
  
  private void b()
  {
    this.b = ((RelativeLayout)findViewById(2131559060));
    this.c = ((ImageView)findViewById(2131560643));
    this.d = ((TextView)findViewById(2131560642));
    this.e = ((TextView)findViewById(2131558673));
    this.f = ((ImageView)findViewById(2131560646));
    this.g = ((Button)findViewById(2131560645));
  }
  
  private void c()
  {
    com.android.dazhihui.ui.delegate.c.c localc = com.android.dazhihui.ui.delegate.a.a().c();
    this.d.setText(localc.c());
    this.c.setImageDrawable(a(localc.c()));
    this.e.setText(localc.d());
  }
  
  private void d()
  {
    this.g.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.b.setOnClickListener(this);
  }
  
  private void e()
  {
    if (this.h == null)
    {
      this.h = new Dialog(getContext(), 16974132);
      this.h.getWindow().getAttributes().gravity = 17;
      this.h.setCancelable(true);
      this.o = ((LinearLayout)LayoutInflater.from(getContext()).inflate(2130903533, null));
      this.h.setContentView(this.o);
      this.m = ((ListView)this.o.findViewById(2131561000));
      this.m.setDivider(null);
      localObject = (TextView)this.o.findViewById(2131561001);
      if (this.n == null)
      {
        this.a = LayoutInflater.from(getContext());
        this.n = new e(this);
        this.m.setAdapter(this.n);
      }
      this.m.setOnItemClickListener(new c(this));
      ((TextView)localObject).setOnClickListener(this);
    }
    while (this.h.isShowing())
    {
      this.h.cancel();
      return;
      this.m = ((ListView)this.o.findViewById(2131561000));
    }
    int i2 = this.k.size();
    int i1 = i2;
    if (i2 > 3) {
      i1 = 3;
    }
    Object localObject = this.m.getLayoutParams();
    float f1 = getResources().getDimension(2131230842);
    ((ViewGroup.LayoutParams)localObject).height = ((int)(i1 * f1) + 1);
    this.h.show();
  }
  
  public Drawable a(String paramString)
  {
    int i1 = 0;
    if (i1 < com.android.dazhihui.c.a.a.F.length) {
      if (!com.android.dazhihui.c.a.a.F[i1].equals(paramString)) {}
    }
    for (;;)
    {
      if ((i1 != -1) && (com.android.dazhihui.c.a.a.C.length > i1)) {}
      for (paramString = com.android.dazhihui.c.a.a.C[i1][6];; paramString = null)
      {
        if (paramString != null) {}
        for (i1 = getResources().getIdentifier("weituo_qs_logo_" + paramString, "drawable", getContext().getPackageName());; i1 = 0)
        {
          int i2 = i1;
          if (i1 == 0) {
            i2 = getResources().getIdentifier("weituo_qs_logo_0", "drawable", getContext().getPackageName());
          }
          return getResources().getDrawable(i2);
          i1 += 1;
          break;
        }
      }
      i1 = -1;
    }
  }
  
  public void a()
  {
    Object localObject = com.android.dazhihui.ui.delegate.a.a().c();
    label99:
    String str2;
    if (((com.android.dazhihui.ui.delegate.c.c)localObject).i())
    {
      str1 = ((com.android.dazhihui.ui.delegate.c.c)localObject).c() + "【融】";
      this.d.setText(str1);
      this.c.setImageDrawable(a(((com.android.dazhihui.ui.delegate.c.c)localObject).c()));
      this.e.setText(((com.android.dazhihui.ui.delegate.c.c)localObject).d());
      this.k = new ArrayList();
      if ((com.android.dazhihui.c.a.a.E == null) || (com.android.dazhihui.c.a.a.E.length <= 0)) {
        break label254;
      }
      i1 = 0;
      if (i1 >= com.android.dazhihui.c.a.a.E.length) {
        break label254;
      }
      if (((this.j == 2) && (o.b(com.android.dazhihui.c.a.a.E[i1][0]))) || ((this.j == 1) && (!o.b(com.android.dazhihui.c.a.a.E[i1][0]))))
      {
        localObject = com.android.dazhihui.c.a.a.E[i1][0];
        str2 = com.android.dazhihui.c.a.a.E[i1][2];
        if (com.android.dazhihui.c.a.a.E[i1].length >= 7) {
          break label241;
        }
      }
    }
    label241:
    for (String str1 = "0";; str1 = com.android.dazhihui.c.a.a.E[i1][6])
    {
      f localf = new f(this);
      localf.a((String)localObject);
      localf.b(str2);
      localf.c(str1);
      this.k.add(localf);
      i1 += 1;
      break label99;
      str1 = ((com.android.dazhihui.ui.delegate.c.c)localObject).c();
      break;
    }
    label254:
    if (this.k.size() > 1) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        return;
      }
      this.f.setVisibility(8);
      this.g.setVisibility(0);
      return;
    }
  }
  
  public void a(int paramInt, View paramView)
  {
    this.j = paramInt;
    this.i = paramView;
  }
  
  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    if ((i1 == 2131560645) || (i1 == 2131561001))
    {
      com.android.dazhihui.ui.delegate.a.a().a("");
      com.android.dazhihui.ui.delegate.a.a().b("");
      com.android.dazhihui.ui.delegate.a.a().c("");
      paramView = new Intent();
      paramView.setClass(getContext(), TradeOutsideScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("isaddqs", true);
      if (this.j == 2) {
        localBundle.putInt("mode", 1);
      }
      paramView.putExtras(localBundle);
      getContext().startActivity(paramView);
      o.u();
      com.android.dazhihui.ui.a.e.a().a(true);
      if ((this.h != null) && (this.h.isShowing())) {
        this.h.cancel();
      }
    }
    do
    {
      return;
      if (i1 == 2131560646)
      {
        e();
        return;
      }
    } while ((i1 != 2131559060) || (this.f.getVisibility() != 0));
    e();
  }
  
  public void setAccountSwitchItemClick(d paramd)
  {
    this.l = paramd;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\TradeAccountSwitchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */