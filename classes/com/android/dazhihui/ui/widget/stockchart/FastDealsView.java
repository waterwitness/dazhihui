package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.screen.stock.uv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public class FastDealsView
  extends LinearLayout
  implements View.OnClickListener
{
  public static int a = 0;
  public static int b = 1;
  private TextView A;
  private TextView B;
  private TextView C;
  private EditText D;
  private EditText E;
  private Button F;
  private Button G;
  private Button H;
  private Button I;
  private EditText J;
  private ImageView K;
  private View L;
  private Fragment M;
  private f N;
  private String O = "0";
  private DecimalFormat P = new DecimalFormat("#.00");
  private StockVo Q;
  private Handler R = new a(this);
  private View c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private ImageView u;
  private ImageView v;
  private View w;
  private View x;
  private TextView y;
  private TextView z;
  
  public FastDealsView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public FastDealsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FastDealsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.c = LayoutInflater.from(paramContext).inflate(2130903315, null);
    addView(this.c);
    a(this.c);
  }
  
  public void a()
  {
    this.O = ah.a().b();
    Object localObject = n.b(this.O);
    if (this.N == f.a)
    {
      localObject = new SpannableString("可买 " + (String)localObject + "股");
      ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject).length() - 1, 33);
    }
    for (;;)
    {
      this.A.setText((CharSequence)localObject);
      return;
      localObject = new SpannableString("可卖：" + (String)localObject + "股");
      ((SpannableString)localObject).setSpan(new ForegroundColorSpan(getResources().getColor(2131493079)), 3, ((SpannableString)localObject).length() - 1, 33);
    }
  }
  
  public void a(View paramView)
  {
    this.m = ((TextView)paramView.findViewById(2131559546));
    this.d = ((TextView)paramView.findViewById(2131559539));
    this.e = ((TextView)paramView.findViewById(2131559543));
    this.f = ((TextView)paramView.findViewById(2131559547));
    this.g = ((TextView)paramView.findViewById(2131559540));
    this.h = ((TextView)paramView.findViewById(2131559544));
    this.i = ((TextView)paramView.findViewById(2131559548));
    this.j = ((TextView)paramView.findViewById(2131559541));
    this.k = ((TextView)paramView.findViewById(2131559545));
    this.l = ((TextView)paramView.findViewById(2131559549));
    this.t = ((TextView)paramView.findViewById(2131559542));
    this.s = ((TextView)paramView.findViewById(2131559538));
    this.n = ((TextView)paramView.findViewById(2131559534));
    this.o = ((TextView)paramView.findViewById(2131559535));
    this.p = ((TextView)paramView.findViewById(2131559536));
    this.q = ((TextView)paramView.findViewById(2131559537));
    this.u = ((ImageView)paramView.findViewById(2131559551));
    this.r = ((TextView)paramView.findViewById(2131559552));
    this.v = ((ImageView)paramView.findViewById(2131559550));
    this.y = ((TextView)paramView.findViewById(2131560023));
    this.D = ((EditText)paramView.findViewById(2131560031));
    this.E = ((EditText)paramView.findViewById(2131560032));
    this.w = paramView.findViewById(2131560029);
    this.x = paramView.findViewById(2131560027);
    this.F = ((Button)paramView.findViewById(2131560037));
    this.G = ((Button)paramView.findViewById(2131560038));
    this.H = ((Button)paramView.findViewById(2131560039));
    this.I = ((Button)paramView.findViewById(2131560040));
    this.z = ((TextView)paramView.findViewById(2131560025));
    this.A = ((TextView)paramView.findViewById(2131560036));
    this.B = ((TextView)paramView.findViewById(2131560034));
    this.C = ((TextView)paramView.findViewById(2131560035));
    this.L = paramView.findViewById(2131559533);
    this.K = ((ImageView)paramView.findViewById(2131560024));
    this.w.setOnClickListener(this);
    this.x.setOnClickListener(this);
    this.F.setOnClickListener(this);
    this.G.setOnClickListener(this);
    this.H.setOnClickListener(this);
    this.B.setOnClickListener(this);
    this.C.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    this.k.setOnClickListener(this);
    this.l.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.s.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.t.setOnClickListener(this);
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.p.setOnClickListener(this);
    this.q.setOnClickListener(this);
    this.r.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.K.setOnClickListener(this);
    this.I.setOnClickListener(this);
    paramView = new b(this);
    this.D.setOnFocusChangeListener(paramView);
    this.E.setOnFocusChangeListener(paramView);
    this.D.setOnClickListener(this);
    this.E.setOnClickListener(this);
    setOnClickListener(this);
    if (Build.VERSION.SDK_INT >= 11.0D) {}
    try
    {
      paramView = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
      paramView.setAccessible(false);
      paramView.invoke(this.D, new Object[] { Boolean.valueOf(false) });
      paramView.invoke(this.E, new Object[] { Boolean.valueOf(false) });
      this.D.addTextChangedListener(new c(this));
      this.E.addTextChangedListener(new d(this));
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
      }
    }
    catch (InvocationTargetException paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
        continue;
        this.D.setInputType(0);
        this.E.setInputType(0);
      }
    }
    catch (NoSuchMethodException paramView)
    {
      for (;;) {}
    }
  }
  
  public void a(EditText paramEditText, View paramView)
  {
    EditText localEditText;
    if (paramView != this.x)
    {
      localEditText = paramEditText;
      if (paramView != this.w) {}
    }
    else
    {
      localEditText = this.D;
    }
    if (localEditText == null) {}
    for (;;)
    {
      return;
      int i1;
      if ((paramView instanceof TextView))
      {
        paramEditText = paramView;
        i1 = localEditText.getSelectionStart();
        paramView = localEditText.getText().toString();
        if (paramEditText == this.u)
        {
          if (i1 > 0)
          {
            localEditText.setText(paramView.substring(0, i1 - 1) + paramView.substring(i1, paramView.length()));
            localEditText.setSelection(i1 - 1);
            return;
          }
          localEditText.setText("");
          localEditText.setSelection(0);
          return;
        }
        if (paramEditText != this.w) {}
      }
      try
      {
        if (TextUtils.isEmpty(paramView)) {
          paramEditText = "0.01";
        }
        for (;;)
        {
          localEditText.setText(paramEditText);
          localEditText.setSelection(paramEditText.length());
          return;
          float f1 = Float.parseFloat(paramView);
          paramView = this.P.format(f1 + 0.01F);
          paramEditText = paramView;
          if (paramView.startsWith(".")) {
            paramEditText = "0" + paramView;
          }
        }
        Object localObject;
        if (paramEditText == this.x)
        {
          if (TextUtils.isEmpty(paramView)) {
            paramEditText = "0.10";
          }
          for (;;)
          {
            localEditText.setText(paramEditText);
            localEditText.setSelection(paramEditText.length());
            return;
            try
            {
              localObject = Double.valueOf(Double.valueOf(Double.parseDouble(paramView)).doubleValue() - 0.01D);
              paramEditText = (EditText)localObject;
              if (((Double)localObject).doubleValue() <= 0.0D) {
                paramEditText = Double.valueOf(0.01D);
              }
              paramEditText = this.P.format(paramEditText);
            }
            catch (NumberFormatException paramEditText)
            {
              paramEditText = paramView;
            }
          }
        }
        if (paramEditText == this.s)
        {
          if ((!TextUtils.isEmpty(paramView)) && (!paramView.contains(".")))
          {
            if (i1 > 0)
            {
              localObject = paramView.substring(0, i1);
              paramView = paramView.substring(i1, paramView.length());
            }
            for (paramEditText = new StringBuffer((String)localObject).append(((TextView)paramEditText).getText()).toString() + paramView;; paramEditText = paramView + ((TextView)paramEditText).getText())
            {
              localEditText.setText(paramEditText);
              localEditText.setSelection(paramEditText.length());
              return;
            }
          }
        }
        else
        {
          if (i1 > 0)
          {
            localObject = paramView.substring(0, i1);
            paramView = paramView.substring(i1, paramView.length());
          }
          for (paramEditText = new StringBuffer((String)localObject).append(((TextView)paramEditText).getText()).toString() + paramView;; paramEditText = paramView + ((TextView)paramEditText).getText())
          {
            localEditText.setText(paramEditText);
            localEditText.setSelection(paramEditText.length());
            return;
          }
        }
      }
      catch (NumberFormatException paramEditText) {}
    }
  }
  
  public void b()
  {
    Object localObject2 = com.android.dazhihui.ui.delegate.a.a().c();
    int i1;
    label140:
    double d1;
    label313:
    label333:
    int i2;
    if (localObject2 != null)
    {
      localObject1 = ((com.android.dazhihui.ui.delegate.c.c)localObject2).c();
      localObject2 = ((com.android.dazhihui.ui.delegate.c.c)localObject2).d();
      i1 = g.a().m();
      if (getWidth() > 0)
      {
        this.y.setMaxWidth((getWidth() - getResources().getDimensionPixelOffset(2131230806)) * 3 / 5 + getResources().getDimensionPixelOffset(2131230799));
        this.y.setText("登录账号：" + (String)localObject1 + " " + (String)localObject2);
      }
    }
    else
    {
      if (!(this.M instanceof uv)) {
        break label674;
      }
      this.Q = ((uv)this.M).u();
      this.D.setText(this.Q.getCurrentValue());
      localObject1 = new SpannableString("涨停 " + this.Q.getZtValue());
      ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject1).length(), 33);
      this.B.setText((CharSequence)localObject1);
      localObject1 = new SpannableString("跌停 " + this.Q.getDtValue());
      ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(-11753174), 3, ((SpannableString)localObject1).length(), 33);
      this.C.setText((CharSequence)localObject1);
      if ((!TextUtils.isEmpty(this.D.getText().toString())) && (!TextUtils.isEmpty(this.E.getText().toString()))) {
        break label701;
      }
      d1 = 0.0D;
      if (this.N != f.a) {
        break label733;
      }
      this.z.setBackgroundResource(2130837934);
      localObject1 = String.format(String.valueOf(d1), new Object[] { "%.2f" });
      this.z.setText("¥ " + (String)localObject1);
      i1 = getWidth();
      localObject1 = (RelativeLayout.LayoutParams)this.z.getLayoutParams();
      i2 = this.E.getLeft();
      if (i2 != 0) {
        break label746;
      }
      this.z.setVisibility(8);
    }
    label674:
    label701:
    label733:
    label746:
    for (((RelativeLayout.LayoutParams)localObject1).leftMargin = ((i1 - getResources().getDimensionPixelOffset(2131230824)) * 3 / 5);; ((RelativeLayout.LayoutParams)localObject1).leftMargin = i2)
    {
      this.D.postDelayed(new e(this, (RelativeLayout.LayoutParams)localObject1), 5L);
      this.I.setBackgroundColor(getResources().getColor(2131492886));
      if (this.N != f.a) {
        break label755;
      }
      localObject1 = new SpannableString("可买 " + this.O + "股");
      ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(-65536), 3, ((SpannableString)localObject1).length() - 1, 33);
      this.A.setText((CharSequence)localObject1);
      this.z.setBackgroundResource(2130837934);
      this.r.setText("买入");
      this.I.setText("买入");
      this.E.setHint("买入数量");
      this.w.setBackgroundColor(getResources().getColor(2131493412));
      this.x.setBackgroundColor(getResources().getColor(2131493412));
      this.r.setBackgroundResource(2130837923);
      return;
      this.y.setMaxWidth((i1 - getResources().getDimensionPixelOffset(2131230806)) * 3 / 5 + getResources().getDimensionPixelOffset(2131230799));
      break;
      if (!(this.M instanceof eu)) {
        break label140;
      }
      this.Q = ((eu)this.M).e();
      break label140;
      d1 = Float.parseFloat(this.D.getText().toString()) * Float.parseFloat(this.E.getText().toString());
      break label313;
      this.z.setBackgroundResource(2130837935);
      break label333;
    }
    label755:
    Object localObject1 = new SpannableString("可卖 " + this.O + "股");
    ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(getResources().getColor(2131493079)), 3, ((SpannableString)localObject1).length() - 1, 33);
    this.A.setText((CharSequence)localObject1);
    this.z.setBackgroundResource(2130837935);
    this.r.setText("卖出");
    this.I.setText("卖出");
    this.E.setHint("卖出数量");
    this.w.setBackgroundColor(getResources().getColor(2131493078));
    this.x.setBackgroundColor(getResources().getColor(2131493078));
    this.r.setBackgroundColor(getResources().getColor(2131493078));
    this.r.setBackgroundResource(2130837940);
  }
  
  public void c()
  {
    this.E.setText("");
    this.D.setText("");
    this.O = "0";
    this.z.setText("");
    this.B.setText("涨停 --");
    this.C.setText("跌停 --");
    this.A.setText("--");
    ah.a().a("0");
  }
  
  public String getDealCount()
  {
    return this.E.getText().toString();
  }
  
  public String getDealPrice()
  {
    return this.D.getText().toString();
  }
  
  public f getDealsType()
  {
    return this.N;
  }
  
  public TextView getPriceTextView()
  {
    return this.D;
  }
  
  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    View localView = getFocusedChild();
    if ((localView instanceof EditText)) {
      ((EditText)localView).getText().toString();
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return;
      a(this.J, paramView);
      return;
      this.L.setVisibility(8);
      return;
      if (this.J != this.E)
      {
        a(this.J, paramView);
        return;
        if (!TextUtils.isEmpty(this.O))
        {
          i1 = Integer.valueOf(this.O).intValue() * 2 / 3;
          this.E.setText(String.valueOf(i1));
          this.E.setSelection(String.valueOf(i1).length());
          return;
          this.E.setText(this.O);
          return;
          if (!TextUtils.isEmpty(this.O))
          {
            i1 = Integer.valueOf(this.O).intValue() / 2;
            this.E.setText(String.valueOf(i1));
            this.E.setSelection(String.valueOf(i1).length());
            return;
            if (!TextUtils.isEmpty(this.O))
            {
              i1 = Integer.valueOf(this.O).intValue() / 3;
              this.E.setText(String.valueOf(i1));
              this.E.setSelection(String.valueOf(i1).length());
              return;
              setVisibility(8);
              this.L.setVisibility(8);
              c();
              if ((this.M instanceof uv))
              {
                ((uv)this.M).f().getMinChartContainer().getDetailSwitchView().setEnableChange(true);
                return;
                this.D.getText().toString().trim();
              }
            }
          }
        }
      }
      try
      {
        if ((!TextUtils.isEmpty(this.D.getText().toString())) && (!TextUtils.isEmpty(this.E.getText().toString())))
        {
          if ((this.M instanceof uv))
          {
            ((uv)this.M).a(this.N);
            return;
          }
          if ((this.M instanceof eu))
          {
            ((eu)this.M).a(this.N);
            return;
          }
        }
      }
      catch (NumberFormatException paramView) {}
    }
    if ((this.M instanceof uv)) {
      ((uv)this.M).u();
    }
    for (;;)
    {
      this.D.setText(this.Q.getZtValue());
      this.D.setSelection(this.D.getText().toString().length());
      return;
      if ((this.M instanceof eu)) {
        ((eu)this.M).e();
      }
    }
    if ((this.M instanceof uv)) {
      ((uv)this.M).u();
    }
    for (;;)
    {
      this.D.setText(this.Q.getDtValue());
      this.D.setSelection(this.D.getText().toString().length());
      return;
      if ((this.M instanceof eu)) {
        ((eu)this.M).e();
      }
    }
    this.L.setVisibility(0);
    return;
  }
  
  public void setDealsPrice(String paramString)
  {
    this.D.setText(paramString);
  }
  
  public void setDealsType(f paramf)
  {
    this.N = paramf;
  }
  
  public void setHolder(Fragment paramFragment)
  {
    this.M = paramFragment;
  }
  
  public void setKeyViewVisibility(int paramInt)
  {
    this.L.setVisibility(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\FastDealsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */