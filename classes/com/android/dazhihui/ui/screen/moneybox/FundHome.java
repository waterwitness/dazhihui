package com.android.dazhihui.ui.screen.moneybox;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import java.math.BigDecimal;

public class FundHome
  extends DelegateBaseActivity
{
  ImageView a;
  TextView b;
  TextView c;
  TextView d;
  Button e;
  Button f;
  private RelativeLayout g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private TextView m;
  private double n = 100000.0D;
  private BigDecimal o;
  private Animation p;
  
  private void d()
  {
    this.g = ((RelativeLayout)findViewById(2131560063));
    this.h = ((ImageView)this.g.findViewById(2131560068));
    this.h.setVisibility(0);
    this.m = ((TextView)this.g.findViewById(2131560069));
    this.m.setVisibility(0);
    this.b = ((TextView)findViewById(2131558819));
    this.c = ((TextView)findViewById(2131559592));
    this.d = ((TextView)findViewById(2131560071));
    this.i = ((ImageView)findViewById(2131560070));
    this.j = ((ImageView)findViewById(2131560072));
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    Object localObject1 = locald.b("FUNDS_MONEY");
    Object localObject2 = Long.valueOf(locald.d("FUNDS_TIME"));
    locald.g();
    if (localObject1 != null)
    {
      this.n = Double.parseDouble((String)localObject1);
      this.i.setVisibility(8);
    }
    if (((Long)localObject2).longValue() != 0L) {
      this.d.setText(a((Long)localObject2));
    }
    this.p = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
    this.d.setOnClickListener(new e(this));
    this.j.setOnClickListener(new f(this));
    this.b.setText(o.p(String.valueOf(this.n)));
    localObject2 = ((String[])ae.g.get(0))[4];
    if (localObject2 != null)
    {
      int k = ((String)localObject2).indexOf("%");
      localObject1 = localObject2;
      if (k > 0) {
        localObject1 = ((String)localObject2).substring(0, k);
      }
      this.o = BigDecimal.valueOf(Double.parseDouble((String)localObject1)).divide(BigDecimal.valueOf(100L));
      localObject1 = BigDecimal.valueOf(this.n).multiply(this.o);
      this.c.setText(o.p(((BigDecimal)localObject1).toString()));
    }
    this.a = ((ImageView)findViewById(2131558881));
    localObject1 = locald.e("FUNDSJSON_IMG");
    locald.g();
    if (localObject1 != null)
    {
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length);
      if (localObject1 != null)
      {
        localObject1 = new BitmapDrawable((Bitmap)localObject1);
        this.a.setBackgroundDrawable((Drawable)localObject1);
      }
    }
    localObject1 = this.a.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject1).height = (getWindowManager().getDefaultDisplay().getHeight() / 2);
    this.a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.e = ((Button)findViewById(2131559744));
    this.f = ((Button)findViewById(2131560073));
    localObject1 = new g(this);
    this.a.setOnClickListener((View.OnClickListener)localObject1);
    this.e.setOnClickListener((View.OnClickListener)localObject1);
    this.f.setOnClickListener((View.OnClickListener)localObject1);
    changeLookFace(this.l);
  }
  
  private void f()
  {
    this.m.setText("场内宝");
    this.h.setOnClickListener(new k(this));
  }
  
  public String a(Long paramLong)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    long l1 = paramLong.longValue();
    long l4 = System.currentTimeMillis() - l1;
    l1 = Math.ceil(l4 / 1000L);
    long l2 = Math.ceil((float)(l4 / 60L) / 1000.0F);
    long l3 = Math.ceil((float)(l4 / 60L / 60L) / 1000.0F);
    l4 = Math.ceil((float)(l4 / 24L / 60L / 60L) / 1000.0F);
    if (l4 - 1L > 0L) {
      localStringBuffer.append(l4 + "天");
    }
    for (;;)
    {
      if (!localStringBuffer.toString().equals("刚才")) {
        localStringBuffer.append("前");
      }
      return "同步于" + localStringBuffer.toString();
      if (l3 - 1L > 0L)
      {
        if (l3 >= 24L) {
          localStringBuffer.append("1天");
        } else {
          localStringBuffer.append(l3 + "小时");
        }
      }
      else if (l2 - 1L > 0L)
      {
        if (l2 == 60L) {
          localStringBuffer.append("1小时");
        } else {
          localStringBuffer.append(l2 + "分钟");
        }
      }
      else if (l1 - 1L > 0L)
      {
        if (l1 == 60L) {
          localStringBuffer.append("1分钟");
        } else {
          localStringBuffer.append(l1 + "秒");
        }
      }
      else {
        localStringBuffer.append("刚才");
      }
    }
  }
  
  public void a()
  {
    d();
    f();
    if (o.r()) {
      c();
    }
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a("确定", new i(this, paramInt, paramContext));
    paramContext.b("取消", new j(this, paramContext));
    paramContext.show();
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a(paramString3, new h(this, paramInt, paramContext));
    paramContext.show();
  }
  
  public void a(BaseActivity paramBaseActivity)
  {
    com.android.dazhihui.a.b.f localf = new com.android.dazhihui.a.b.f();
    localf.c(ae.a);
    localf.a(new d(this, paramBaseActivity));
    paramBaseActivity.sendRequest(localf);
  }
  
  public void a(Class<?> paramClass)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
  }
  
  public boolean a(int paramInt)
  {
    boolean bool = true;
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    int k = locald.c("FUNDS_INFO");
    locald.g();
    if (k == 0)
    {
      locald.a("FUNDS_INFO", 1);
      locald.g();
      a(this, "提示", "您需要登录券商委托才能申赎场内货币基金。", "我知道了", paramInt);
      bool = false;
    }
    return bool;
  }
  
  public void b()
  {
    if (o.r()) {
      a(FundSubscription.class);
    }
    while (!a(1)) {
      return;
    }
    ae.l = 1;
    o.a(this);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.a.b.u localu = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(localu);
    a(localu, true);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (l.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.g == null);
      this.g.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.g == null);
    this.g.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    for (;;)
    {
      try
      {
        super.handleResponse(paramh, paramj);
        paramh = ((v)paramj).b();
        this.p.cancel();
        if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
          return;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        switch (Integer.parseInt(paramh.a()))
        {
        case 11105: 
          int i1 = paramh.g();
          if (i1 <= 0) {
            break label262;
          }
          k = 0;
          if (k >= i1) {
            break label256;
          }
          paramj = paramh.a(k, "1415");
          if ((paramj != null) && (paramj.equals("1")))
          {
            paramh = paramh.a(k, "1078");
            if (paramh == null) {
              break label248;
            }
            this.n = Double.parseDouble(paramh);
            paramh = String.valueOf(this.n);
            this.b.setText(o.p(paramh));
            paramj = BigDecimal.valueOf(this.n).multiply(this.o).toString();
            this.c.setText(o.p(paramj));
            this.i.setVisibility(8);
            paramj = Long.valueOf(System.currentTimeMillis());
            com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
            locald.a("FUNDS_MONEY", paramh);
            locald.a("FUNDS_TIME", paramj.longValue());
            locald.g();
            this.d.setText(a(paramj));
            return;
          }
          break;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      k += 1;
      continue;
      label248:
      this.n = 0.0D;
      continue;
      label256:
      int k = 0;
    }
    label262:
    return;
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == b.a().f()) {
      b(1);
    }
    this.p.cancel();
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903323);
    if (ae.b == null)
    {
      a(this);
      return;
    }
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
    this.p.cancel();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
  
  public void onResume()
  {
    if (o.r()) {
      c();
    }
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\FundHome.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */