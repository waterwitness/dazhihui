package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.WarningItem;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CustomImgview;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;
import java.io.PrintStream;
import java.util.List;

public class AddWarningActivity
  extends BaseActivity
  implements com.android.dazhihui.a.b.i, cp, cs
{
  private CustomImgview A;
  private CustomImgview B;
  private String C = "";
  private String D = "";
  private String E = "";
  private PopupWindow F;
  private WindowManager.LayoutParams G;
  private View H;
  private int I = 2;
  private int J;
  private WindowManager K;
  private View L;
  private boolean M = true;
  private Handler N = new i(this);
  private String a;
  private int b = 16;
  private int c;
  private final int d = 1;
  private final int e = 0;
  private boolean f = false;
  private DzhHeader g;
  private int h;
  private String i;
  private String j;
  private int k = -1;
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private WarningItem s;
  private TextView t;
  private TextView u;
  private TextView v;
  private EditText w;
  private EditText x;
  private EditText y;
  private CustomImgview z;
  
  private void a(int paramInt)
  {
    String str1 = this.w.getText().toString();
    String str2 = this.x.getText().toString();
    String str3 = this.y.getText().toString();
    if ((this.C == null) || (this.C.equals("")) || (this.C.equals("--"))) {}
    float f1;
    do
    {
      return;
      if (paramInt == 0)
      {
        try
        {
          f1 = Float.valueOf(str1).floatValue();
          try
          {
            if ((!str1.equals("")) && (f1 < Float.valueOf(this.C).floatValue()))
            {
              this.w.setTextColor(-65536);
              return;
            }
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            return;
          }
          this.w.setTextColor(-16777216);
        }
        catch (Exception localException1)
        {
          this.w.setTextColor(-65536);
          return;
        }
        this.z.setChecked(true);
        return;
      }
      if (paramInt == 1)
      {
        try
        {
          f1 = Float.valueOf(str2).floatValue();
          try
          {
            if ((!str2.equals("")) && (f1 > Float.valueOf(this.C).floatValue()))
            {
              this.x.setTextColor(-65536);
              return;
            }
          }
          catch (Exception localException2)
          {
            return;
          }
          this.A.setChecked(true);
        }
        catch (Exception localException3)
        {
          this.x.setTextColor(-65536);
          return;
        }
        this.x.setTextColor(-16777216);
        return;
      }
    } while (paramInt != 2);
    try
    {
      f1 = Float.valueOf(str3).floatValue();
      try
      {
        if ((!str3.equals("")) && (f1 == 0.0D))
        {
          this.y.setTextColor(-65536);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        return;
      }
      this.B.setChecked(true);
    }
    catch (Exception localException4)
    {
      this.B.setChecked(false);
      this.y.setTextColor(-65536);
      return;
    }
    this.y.setTextColor(-16777216);
  }
  
  private void a(View paramView, String paramString)
  {
    b();
    this.H = getLayoutInflater().inflate(2130903588, null);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    ((TextView)this.H.findViewById(2131561342)).setText(paramString);
    this.G.gravity = 51;
    this.G.x = (arrayOfInt[0] + paramView.getWidth() - getResources().getDimensionPixelOffset(2131230792));
    this.G.y = (arrayOfInt[1] - getResources().getDimensionPixelOffset(2131230828));
    this.G.width = -2;
    this.G.height = -2;
    this.G.flags = 408;
    this.G.format = -3;
    this.G.windowAnimations = 0;
    this.K = ((WindowManager)getSystemService("window"));
    this.K.addView(this.H, this.G);
  }
  
  private void b()
  {
    if (this.H != null) {}
    try
    {
      this.K.removeView(this.H);
      return;
    }
    catch (Exception localException) {}
  }
  
  private void c()
  {
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(308);
    localx2.a(this.l);
    localx2.a(this.m);
    if ((this.n == null) || (this.n.length() < 11)) {
      localx2.a("");
    }
    float[] arrayOfFloat;
    for (;;)
    {
      localx2.a(this.q);
      localx2.a(this.p);
      localx2.b(com.android.dazhihui.g.a().ac());
      localx2.a(this.r);
      localx2.d(this.s.getmWarningId());
      localx2.a(this.a);
      arrayOfFloat = new float[5];
      String str2 = this.w.getText().toString().trim();
      String str1 = str2;
      try
      {
        if (Float.parseFloat(str2) == 0.0F) {
          str1 = "";
        }
        arrayOfFloat[0] = Float.parseFloat(str1);
        i1 = 1;
        if (!this.z.a()) {
          arrayOfFloat[0] = -1.0F;
        }
        str2 = this.x.getText().toString().trim();
        str1 = str2;
      }
      catch (Exception localException2)
      {
        try
        {
          if (Float.parseFloat(str2) == 0.0F) {
            str1 = "";
          }
          arrayOfFloat[1] = Float.parseFloat(str1);
          i1 = 1;
          if (!this.A.a()) {
            arrayOfFloat[1] = -1.0F;
          }
          str1 = this.y.getText().toString().trim();
        }
        catch (Exception localException2)
        {
          try
          {
            for (;;)
            {
              if (Float.parseFloat(str1) != 0.0F) {
                break label316;
              }
              showShortToast("涨跌幅设置无效");
              return;
              localx2.a(this.n);
              break;
              localException1 = localException1;
              arrayOfFloat[0] = -1.0F;
              i1 = 0;
              continue;
              localException2 = localException2;
              arrayOfFloat[1] = -1.0F;
            }
            label316:
            arrayOfFloat[2] = Float.parseFloat(localException2);
            arrayOfFloat[3] = Float.parseFloat(localException2);
            i1 = 1;
          }
          catch (Exception localException3)
          {
            for (;;)
            {
              int i1;
              arrayOfFloat[2] = -1.0F;
              arrayOfFloat[3] = -1.0F;
            }
            localx2.a(arrayOfFloat[0]);
            localx2.a(arrayOfFloat[1]);
            localx2.a(arrayOfFloat[2]);
            localx2.b(0);
            localx2.a(arrayOfFloat[3]);
            localx2.b(0);
            localx2.a(arrayOfFloat[4]);
            localx2.b(0);
            localx2.b(0);
            localx1.a(localx2, com.android.dazhihui.ui.a.m.a().h());
            com.android.dazhihui.a.b.m localm = new com.android.dazhihui.a.b.m(localx1);
            com.android.dazhihui.a.g.a().a(localm);
          }
          if (!this.B.a())
          {
            arrayOfFloat[2] = -1.0F;
            arrayOfFloat[3] = -1.0F;
          }
          arrayOfFloat[4] = -1.0F;
          if (i1 == 0)
          {
            showShortToast(2131166002);
            return;
          }
        }
      }
    }
  }
  
  private void d()
  {
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(300);
    localx2.a(this.l);
    localx2.a(this.m);
    if (this.n == null) {
      localx2.a("");
    }
    float[] arrayOfFloat;
    for (;;)
    {
      localx2.a(this.q);
      localx2.a(this.p);
      localx2.b(com.android.dazhihui.g.a().ac());
      localx2.a(this.r);
      localx2.a(this.a);
      arrayOfFloat = new float[5];
      String str2 = this.w.getText().toString().trim();
      String str1 = str2;
      try
      {
        if (Float.parseFloat(str2) == 0.0F) {
          str1 = "";
        }
        arrayOfFloat[0] = Float.parseFloat(str1);
        i1 = 1;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          arrayOfFloat[0] = -1.0F;
          int i1 = 0;
        }
      }
      if (!this.z.a()) {
        arrayOfFloat[0] = -1.0F;
      }
      str2 = this.x.getText().toString().trim();
      str1 = str2;
      try
      {
        if (Float.parseFloat(str2) == 0.0F) {
          str1 = "";
        }
        arrayOfFloat[1] = Float.parseFloat(str1);
        i1 = 1;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          arrayOfFloat[1] = -1.0F;
        }
      }
      if (!this.A.a()) {
        arrayOfFloat[1] = -1.0F;
      }
      str2 = this.y.getText().toString().trim();
      str1 = str2;
      try
      {
        if (Float.parseFloat(str2) == 0.0F) {
          str1 = "";
        }
        arrayOfFloat[2] = Float.parseFloat(str1);
        arrayOfFloat[3] = Float.parseFloat(str1);
        i1 = 1;
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          arrayOfFloat[2] = -1.0F;
          arrayOfFloat[3] = -1.0F;
        }
        localx2.a(arrayOfFloat[0]);
        localx2.a(arrayOfFloat[1]);
        localx2.a(arrayOfFloat[2]);
        localx2.b(0);
        localx2.a(arrayOfFloat[3]);
        localx2.b(0);
        localx2.a(arrayOfFloat[4]);
        localx2.b(0);
        localx2.b(0);
        localx1.a(localx2, com.android.dazhihui.ui.a.m.a().h());
        com.android.dazhihui.a.b.m localm = new com.android.dazhihui.a.b.m(localx1);
        com.android.dazhihui.a.g.a().a(localm);
      }
      if (!this.B.a())
      {
        arrayOfFloat[2] = -1.0F;
        arrayOfFloat[3] = -1.0F;
      }
      arrayOfFloat[4] = -1.0F;
      if (i1 != 0) {
        break;
      }
      showShortToast(2131166002);
      return;
      if (this.n.length() < 11) {
        localx2.a("");
      } else {
        localx2.a(this.n);
      }
    }
  }
  
  private void e()
  {
    Object localObject = new x[2];
    localObject[0] = new x(2955);
    localObject[0].c(106);
    localObject[0].c(this.b);
    String str = this.a;
    localObject[0].a(new String[] { str });
    localObject[1] = new x(2939);
    localObject[1].a(this.a);
    localObject = new com.android.dazhihui.a.b.m((x[])localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((com.android.dazhihui.a.b.h)localObject);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 3)
    {
      a();
      return true;
    }
    if (((Integer)paramView.getTag()).intValue() == 2)
    {
      e();
      return true;
    }
    if (((Integer)paramView.getTag()).intValue() == 0)
    {
      finish();
      return true;
    }
    return false;
  }
  
  public void a()
  {
    if (this.h == 8002)
    {
      c();
      return;
    }
    d();
  }
  
  public void a(int paramInt, String paramString)
  {
    String str = "";
    if ((this.J == 0) || (paramString.equals("")))
    {
      b();
      return;
    }
    try
    {
      Float localFloat = Float.valueOf(paramString);
      if (!paramString.equals("")) {
        str = b.c((int)(localFloat.floatValue() * Math.pow(10.0D, this.I)), this.J);
      }
      paramString = "较当前价涨" + str + "%";
      this.F = new PopupWindow(this);
      if (paramInt == 0)
      {
        a(this.w, paramString);
        return;
      }
    }
    catch (Exception paramString)
    {
      Toast.makeText(this, "输入数字不合法", 100);
      return;
    }
    if (paramInt == 1)
    {
      a(this.x, paramString);
      return;
    }
    b();
  }
  
  public void a(p paramp)
  {
    int i1 = paramp.a;
    paramp = paramp.b;
    if (i1 == 2939) {
      if (paramp == null) {}
    }
    do
    {
      do
      {
        do
        {
          try
          {
            if (paramp.length > 0)
            {
              paramp = new q(paramp);
              paramp.l();
              paramp.l();
              this.c = paramp.b();
              i1 = paramp.b();
              paramp.e();
              paramp.h();
              int i2 = paramp.h();
              int i3 = paramp.h();
              b.a(i2, i1);
              b.a(i3, i1);
            }
            return;
          }
          catch (Exception paramp)
          {
            System.out.println("Read 2960 error!!!");
            return;
          }
        } while ((i1 != 2955) || (paramp == null) || (paramp.length <= 0));
        paramp = new q(paramp);
        i1 = paramp.e();
        paramp.e();
      } while (i1 != 106);
      paramp.e();
    } while (paramp.e() != 1);
    paramp.l();
    paramp.l();
    this.I = paramp.b();
    paramp.b();
    i1 = paramp.h();
    paramp.h();
    this.J = paramp.h();
    paramp.h();
    paramp.h();
    paramp.h();
    paramp.e();
    this.C = b.a(this.J, this.I);
    this.D = b.c(this.J, i1);
    this.E = b.d(this.J, i1, this.I);
    this.u.setText("最新价 " + this.C);
    if (this.D.startsWith("-")) {
      this.v.setText("涨跌幅 " + this.D + "%");
    }
    for (;;)
    {
      a(0);
      a(1);
      return;
      this.v.setText("涨跌幅 " + this.D + "%");
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (j.a[paramy.ordinal()])
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
    paramct.a = 16936;
    paramct.d = paramContext.getString(2131165249);
    paramct.e = paramContext.getString(2131166226);
    paramct.p = this;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    b();
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    if ((paramj instanceof o)) {
      a(((o)paramj).h());
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903046);
    this.g = ((DzhHeader)findViewById(2131558545));
    this.g.a(this, this);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.h = paramBundle.getInt("screenId");
      this.a = paramBundle.getString("code");
      this.i = paramBundle.getString("name");
      this.j = n.e(this.a);
      this.k = paramBundle.getInt("index");
    }
    this.L = findViewById(2131558544);
    this.t = ((TextView)findViewById(2131558547));
    this.u = ((TextView)findViewById(2131558548));
    this.v = ((TextView)findViewById(2131558549));
    this.w = ((EditText)findViewById(2131558552));
    this.x = ((EditText)findViewById(2131558557));
    this.y = ((EditText)findViewById(2131558561));
    this.z = ((CustomImgview)findViewById(2131558554));
    this.A = ((CustomImgview)findViewById(2131558559));
    this.B = ((CustomImgview)findViewById(2131558563));
    this.t.setText(this.i);
    this.l = w.a().f();
    this.m = "";
    this.n = w.a().k();
    this.o = w.a().n();
    this.p = com.android.dazhihui.g.a().v();
    this.q = com.android.dazhihui.g.a().Z();
    this.r = com.android.dazhihui.g.a().r();
    this.G = new WindowManager.LayoutParams();
    this.w.addTextChangedListener(new k(this, 0, 0));
    this.x.addTextChangedListener(new k(this, 0, 1));
    this.y.addTextChangedListener(new k(this, 0, 2));
    this.w.setOnFocusChangeListener(new d(this));
    this.x.setOnFocusChangeListener(new f(this));
    paramBundle = new g(this);
    this.z.setOnClickListener(paramBundle);
    this.A.setOnClickListener(paramBundle);
    this.B.setOnClickListener(paramBundle);
    this.y.setOnFocusChangeListener(new h(this));
    e();
    paramBundle = com.android.dazhihui.ui.a.m.a().e();
    if ((this.h == 8002) && (this.k >= 0))
    {
      this.s = ((WarningItem)paramBundle.get(this.k));
      float f1 = this.s.getmOverPrice();
      int i1 = this.s.getmDecimalNum();
      if (f1 >= 0.0F)
      {
        this.w.setText(n.a(Float.valueOf(f1), i1));
        this.z.setChecked(true);
      }
      f1 = this.s.getmBelowPrice();
      if (f1 >= 0.0F)
      {
        paramBundle = n.a(Float.valueOf(f1), i1);
        if (this.x == null) {
          return;
        }
        this.x.setText(paramBundle);
        this.A.setChecked(true);
      }
      f1 = this.s.getmDayIncrease();
      if (f1 >= 0.0F)
      {
        this.y.setText(n.a(Float.valueOf(f1), i1));
        this.B.setChecked(true);
      }
      f1 = this.s.getmDayFall();
      if (f1 >= 0.0F)
      {
        this.y.setText(n.a(Float.valueOf(f1), i1));
        this.B.setChecked(true);
      }
    }
    for (;;)
    {
      changeLookFace(this.mLookFace);
      return;
      this.z.setChecked(false);
      this.A.setChecked(false);
      this.B.setChecked(false);
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException) {}
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      finish();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    this.w.requestFocus();
    this.w.setSelection(this.w.getText().toString().length());
    this.z.setChecked(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\AddWarningActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */