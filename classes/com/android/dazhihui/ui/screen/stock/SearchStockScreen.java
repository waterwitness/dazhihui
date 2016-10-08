package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.WarningItem;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.LabelMenu;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.ac;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.gw;
import com.android.dazhihui.ui.widget.hi;
import com.android.dazhihui.w;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SearchStockScreen
  extends AdvertBaseActivity
  implements i, cp
{
  private static String n = "SH000001";
  private static String o = "SZ399001";
  private int A = 0;
  private d B;
  private int C;
  private int D;
  private int E;
  private float F;
  private float G;
  private float H;
  private float I;
  private List<WarningItem> J;
  private WarningItem K;
  private SelfSelectedStockManager L;
  private String[] M;
  private boolean N = false;
  private View O;
  private View P;
  private TextView Q;
  private TextView R;
  private EditText S;
  private EditText T;
  private View U;
  private View V;
  private gw W;
  private ListView X;
  private ImageView Y;
  DzhMainHeader a;
  private LabelMenu aa;
  private ImageView ab;
  private hi ac;
  private int ad;
  private int ae = 0;
  private f af;
  View b;
  View c;
  View d;
  private int e = 0;
  private String[] f;
  private int[] g;
  private String[] h;
  private String[] i;
  private boolean[] j;
  private boolean[] k;
  private String l = "SEARCH";
  private rv m;
  private boolean p = false;
  private long q;
  private int r;
  private String s = "";
  private CharSequence t;
  private boolean u;
  private ru v;
  private ArrayList<String> w;
  private boolean x = false;
  private int y = 0;
  private int z = 0;
  
  private String a(int paramInt, String paramString)
  {
    int i2 = 0;
    int i1 = i2;
    switch (paramInt)
    {
    default: 
      i1 = i2;
    }
    while (i1 == 0)
    {
      return "";
      i1 = i2;
      if (!TextUtils.isEmpty(paramString)) {
        if (paramString.startsWith("SH"))
        {
          i1 = 2131165555;
        }
        else if (paramString.startsWith("SZ"))
        {
          i1 = 2131166254;
        }
        else if (paramString.startsWith("ZH"))
        {
          i1 = 2131166256;
        }
        else if (paramString.startsWith("HK"))
        {
          i1 = 2131165490;
        }
        else if (paramString.startsWith("HH"))
        {
          i1 = 2131165560;
        }
        else if (!paramString.startsWith("NS"))
        {
          i1 = i2;
          if (!paramString.startsWith("NY")) {}
        }
        else
        {
          i1 = 2131165906;
          continue;
          i1 = 2131165600;
          continue;
          i1 = 2131166459;
          continue;
          i1 = 2131166431;
          continue;
          i1 = 2131166405;
          continue;
          i1 = 2131166157;
          continue;
          i1 = 2131166160;
          continue;
          i1 = 2131166199;
          continue;
          return "ETF";
          return "LOF";
          i1 = 2131166468;
          continue;
          i1 = 2131166422;
          continue;
          i1 = 2131166170;
          continue;
          i1 = 2131165561;
          continue;
          i1 = i2;
          if (!TextUtils.isEmpty(paramString)) {
            if (paramString.startsWith("SH"))
            {
              i1 = 2131165556;
            }
            else
            {
              i1 = i2;
              if (paramString.startsWith("SZ"))
              {
                i1 = 2131166255;
                continue;
                i1 = 2131166252;
              }
            }
          }
        }
      }
    }
    return getResources().getString(i1);
  }
  
  private void g()
  {
    if (Build.VERSION.SDK_INT <= 10)
    {
      this.S.setInputType(0);
      return;
    }
    getWindow().setSoftInputMode(3);
    try
    {
      Method localMethod = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
      localMethod.setAccessible(true);
      localMethod.invoke(this.S, new Object[] { Boolean.valueOf(false) });
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void h()
  {
    Intent localIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
    localIntent.putExtra("android.speech.extra.PROMPT", getString(2131166265));
    this.w.clear();
    startActivityForResult(localIntent, 1234);
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
  
  protected void a()
  {
    this.O = findViewById(2131560184);
    this.P = findViewById(2131560323);
    this.a = ((DzhMainHeader)findViewById(2131559251));
    this.b = findViewById(2131560317);
    this.c = findViewById(2131560328);
    this.c = findViewById(2131560328);
    this.d = findViewById(2131560329);
    Object localObject = new ArrayList();
    ((List)localObject).add("搜股");
    ((List)localObject).add("找人");
    ((List)localObject).add("慧搜");
    this.a.a(this, 6, (List)localObject);
    if (this.ae != 0)
    {
      this.a.a(1, -1);
      this.b.setVisibility(8);
      this.c.setVisibility(0);
      this.d.setVisibility(8);
      new Handler().postDelayed(new rj(this), 500L);
      this.a.setOnCheckedChangeListener(new rm(this));
      this.aa = ((LabelMenu)findViewById(2131560326));
      this.Q = ((TextView)findViewById(2131560325));
      localObject = (AdvertView)findViewById(2131559626);
      ((AdvertView)localObject).a(2131493506, 2131493506, 0);
      ((AdvertView)localObject).setAdvCode(104);
      a((ac)localObject);
      this.S = ((EditText)findViewById(2131560322));
      this.T = ((EditText)findViewById(2131560290));
      this.U = findViewById(2131560318);
      this.V = findViewById(2131560321);
      this.R = ((TextView)findViewById(2131560324));
      if (this.z == 0) {
        break label461;
      }
      this.R.setVisibility(8);
      this.aa.setVisibility(0);
    }
    for (;;)
    {
      g();
      this.W = new gw(this, this, this.S);
      this.W.b();
      this.X = ((ListView)findViewById(2131560327));
      this.Y = ((ImageView)findViewById(2131560291));
      this.Y.setVisibility(8);
      return;
      this.a.a(0, -1);
      this.b.setVisibility(0);
      this.c.setVisibility(8);
      this.d.setVisibility(8);
      break;
      label461:
      this.R.setVisibility(0);
      this.aa.setVisibility(8);
    }
  }
  
  public void a(int paramInt)
  {
    Object localObject1 = this.i;
    if (localObject1 == null) {}
    int i2;
    do
    {
      return;
      i2 = localObject1.length;
    } while ((paramInt < 0) || (paramInt >= i2) || (this.h.length != i2) || (this.h.length != i2));
    Object localObject2 = new Vector();
    int i1 = 0;
    while (i1 < i2)
    {
      ((Vector)localObject2).add(new StockVo(this.h[i1], localObject1[i1], this.g[i1], this.k[0]));
      i1 += 1;
    }
    localObject1 = new Bundle();
    StockVo localStockVo = (StockVo)((Vector)localObject2).get(paramInt);
    String str = localStockVo.getCode();
    if ((str != null) && (str.contains("BI")))
    {
      localObject2 = new MarketVo(localStockVo.getName(), false, false, -1);
      ((Bundle)localObject1).putString("code", localStockVo.getCode());
      ((Bundle)localObject1).putParcelable("market_vo", (Parcelable)localObject2);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtras((Bundle)localObject1);
      ((Intent)localObject2).setClass(this, PlateListScreen.class);
      startActivity((Intent)localObject2);
    }
    for (;;)
    {
      finish();
      return;
      ((Bundle)localObject1).putParcelable("stock_vo", (Parcelable)((Vector)localObject2).get(paramInt));
      r.a(this, (Vector)localObject2, paramInt, (Bundle)localObject1);
    }
  }
  
  public void a(p paramp)
  {
    int i5 = 1;
    int i1 = 0;
    Object localObject1 = paramp.b;
    int i2 = paramp.a;
    if (localObject1 == null) {
      return;
    }
    if ((localObject1.length == 0) && (i2 == 2939))
    {
      this.u = false;
      paramp = Message.obtain(this.v, 2);
      this.v.sendMessage(paramp);
      return;
    }
    this.u = false;
    paramp = new q((byte[])localObject1);
    if (i2 == 2955) {}
    try
    {
      paramp.e();
      paramp.e();
      paramp.e();
      i2 = paramp.e();
      this.i = new String[i2];
      this.f = new String[i2];
      this.g = new int[i2];
      this.h = new String[i2];
      this.j = new boolean[i2];
      this.k = new boolean[i2];
      i1 = 0;
      while (i1 < i2)
      {
        this.i[Math.abs(i1 - 0)] = paramp.l();
        this.h[Math.abs(i1 - 0)] = paramp.l();
        paramp.b();
        i3 = paramp.b();
        this.g[i1] = i3;
        paramp.h();
        paramp.h();
        paramp.h();
        paramp.h();
        paramp.h();
        paramp.h();
        this.j[Math.abs(i1 - 0)] = com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.i[Math.abs(i1 - 0)]);
        this.f[Math.abs(i1 - 0)] = n.e(this.i[Math.abs(i1 - 0)]);
        i1 += 1;
      }
      paramp = Message.obtain(this.v, 1);
      this.v.sendMessage(paramp);
    }
    catch (Exception paramp)
    {
      do
      {
        for (;;)
        {
          int i3;
          int[] arrayOfInt;
          boolean[] arrayOfBoolean;
          paramp.printStackTrace();
        }
      } while (i2 != 2939);
      localObject1 = paramp.l();
      Object localObject2 = paramp.l();
      i1 = paramp.b();
      this.M = new String[1];
      this.M[0] = localObject1;
      this.h = new String[1];
      this.f = new String[1];
      this.g = new int[1];
      this.i = new String[1];
      this.j = new boolean[1];
      this.k = new boolean[1];
      this.h[0] = localObject2;
      this.i[0] = localObject1;
      this.g[0] = i1;
      this.f[0] = n.e((String)localObject1);
      this.j[0] = com.android.dazhihui.ui.a.m.a().b().exitSelfStock((String)localObject1);
      paramp.b();
      paramp.e();
      paramp.h();
      paramp.h();
      paramp.h();
      paramp.h();
      paramp.h();
      i1 = paramp.b();
      paramp = this.k;
      if (i1 != 1) {
        break label895;
      }
      for (;;)
      {
        paramp[0] = i5;
        i1 = this.r;
        if (i1 != 0) {
          break label1086;
        }
        try
        {
          if (this.s.length() > 5) {
            break label901;
          }
          paramp = Message.obtain(this.v, 1);
          this.v.sendMessage(paramp);
        }
        catch (Exception paramp)
        {
          paramp = Message.obtain(this.v, 1);
          this.v.sendMessage(paramp);
        }
        break;
        i5 = 0;
      }
      if (this.A != 3) {
        break label928;
      }
      paramp = Message.obtain(this.v, 1);
      this.v.sendMessage(paramp);
      return;
      if (this.z != 0) {
        break label1065;
      }
      paramp = Message.obtain(this.v, 2);
      this.v.sendMessage(paramp);
      if (!this.M[0].contains("BI")) {
        break label1057;
      }
      localObject1 = new MarketVo(this.h[0], false, false, -1);
      paramp = new Bundle();
      paramp.putString("code", this.M[0]);
      paramp.putParcelable("market_vo", (Parcelable)localObject1);
      localObject1 = new Intent();
      ((Intent)localObject1).putExtras(paramp);
      ((Intent)localObject1).setClass(this, PlateListScreen.class);
      startActivity((Intent)localObject1);
      finish();
      for (;;)
      {
        Integer.parseInt(this.s);
        break;
        a(0);
        continue;
        paramp = Message.obtain(this.v, 1);
        this.v.sendMessage(paramp);
      }
      paramp = Message.obtain(this.v, 1);
      this.v.sendMessage(paramp);
    }
    paramp = Message.obtain(this.v, 2);
    this.v.sendMessage(paramp);
    return;
    if (i2 == 2943)
    {
      i3 = paramp.e();
      localObject1 = new String[i3];
      localObject2 = new String[i3];
      this.M = new String[i3];
      arrayOfInt = new int[i3];
      arrayOfBoolean = new boolean[i3];
      i2 = 0;
      while (i1 < i3)
      {
        String str1 = paramp.l();
        String str2 = paramp.l();
        int i4 = paramp.b();
        this.M[i2] = str1;
        localObject1[i2] = str2;
        localObject2[i2] = n.e(this.M[i2]);
        arrayOfBoolean[i2] = com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.M[i2]);
        arrayOfInt[i2] = i4;
        i2 += 1;
        i1 += 1;
      }
      this.h = new String[i2];
      this.f = new String[i2];
      this.g = new int[i2];
      this.i = new String[i2];
      this.j = new boolean[i2];
      this.k = new boolean[i2];
      System.arraycopy(localObject1, 0, this.h, 0, i2);
      System.arraycopy(localObject2, 0, this.f, 0, i2);
      System.arraycopy(arrayOfInt, 0, this.g, 0, i2);
      System.arraycopy(this.M, 0, this.i, 0, i2);
      System.arraycopy(arrayOfBoolean, 0, this.j, 0, i2);
      paramp = Message.obtain(this.v, 1);
      this.v.sendMessage(paramp);
      return;
    }
    label895:
    label901:
    label928:
    label1057:
    label1065:
    label1086:
    return;
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (paramBoolean.booleanValue())
    {
      paramView.requestFocus();
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void a(String paramString)
  {
    x localx = new x(2939);
    this.s = paramString.toUpperCase();
    localx.a(this.s);
    paramString = new com.android.dazhihui.a.b.m(localx);
    paramString.a(this);
    com.android.dazhihui.a.g.a().a(paramString);
  }
  
  protected void b()
  {
    this.B = d.a();
    this.D = com.android.dazhihui.g.a().m();
    this.E = com.android.dazhihui.g.a().n();
    this.G = (this.D * 100 / 320);
    this.H = (15.0F * this.G / 100.0F);
    this.F = getResources().getDisplayMetrics().density;
    this.I = (12.0F * this.G / 100.0F);
    this.S.setOnTouchListener(new rn(this));
    this.Y.setOnClickListener(new ro(this));
    this.S.addTextChangedListener(new rp(this));
    this.X.setOnItemClickListener(new rq(this));
    this.X.setOnTouchListener(new rr(this));
    this.w = new ArrayList();
    this.ab = ((ImageView)findViewById(2131560319));
    this.ab.setOnClickListener(new rs(this));
    d();
    n.a("", 1178);
    this.v = new ru(this, Looper.myLooper());
    this.J = com.android.dazhihui.ui.a.m.a().e();
    this.aa.setOnChangeListener(new rt(this));
  }
  
  public void c()
  {
    Log.w(this.l, "process");
    if (this.t.length() > 0)
    {
      this.aa.setVisibility(8);
      this.R.setVisibility(8);
      this.Q.setVisibility(0);
      if (this.Y.getVisibility() == 8) {
        this.Y.setVisibility(0);
      }
      if (this.t.toString().equals("03")) {
        a(n);
      }
    }
    label246:
    label257:
    label262:
    for (;;)
    {
      return;
      if (this.t.toString().equals("04"))
      {
        a(o);
        return;
      }
      if (this.t.toString().toLowerCase().equals("max911"))
      {
        startActivity(MaxNineScreen.class);
        return;
      }
      a(this.t.toString());
      return;
      if ((!this.N) && ((!this.aa.isShown()) || (!this.R.isShown())))
      {
        if (this.z != 0) {
          break label246;
        }
        this.R.setVisibility(0);
        this.Q.setVisibility(8);
        if (!this.x) {
          break label257;
        }
        e();
      }
      for (;;)
      {
        if (this.Y.getVisibility() != 0) {
          break label262;
        }
        this.Y.setVisibility(8);
        return;
        this.aa.setVisibility(0);
        break;
        d();
      }
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (rl.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.O != null)
        {
          this.O.setBackgroundColor(getResources().getColor(2131493542));
          this.P.setBackgroundColor(getResources().getColor(2131493547));
          this.R.setTextColor(getResources().getColor(2131493549));
          this.Q.setTextColor(getResources().getColor(2131493549));
          this.aa.setBackgroundColor(getResources().getColor(2131493547));
          this.S.setTextColor(getResources().getColor(2131493546));
          this.aa.a(paramy);
          this.U.setBackgroundColor(0);
          this.V.setBackgroundResource(2130838739);
        }
      } while (this.a == null);
      this.a.a();
      return;
      if (this.O != null)
      {
        this.O.setBackgroundColor(getResources().getColor(2131493605));
        this.P.setBackgroundResource(2130838813);
        this.R.setTextColor(getResources().getColor(2131493612));
        this.Q.setTextColor(getResources().getColor(2131493612));
        this.aa.setBackgroundResource(2130838813);
        this.S.setTextColor(getResources().getColor(2131493609));
        this.aa.a(paramy);
        this.U.setBackgroundColor(getResources().getColor(2131493610));
        this.V.setBackgroundResource(2130838820);
      }
    } while (this.a == null);
    this.a.a();
  }
  
  public void d()
  {
    Object localObject = new x(2955);
    ((x)localObject).c(106);
    ((x)localObject).c(this.e);
    ((x)localObject).a(this.L.getBrowseStockCodeVector());
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((h)localObject);
  }
  
  public void e()
  {
    Object localObject = new x(2955);
    ((x)localObject).c(107);
    ((x)localObject).c(this.e);
    ((x)localObject).a(this.L.getSelfStockCodeVector());
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((h)localObject);
  }
  
  public void f()
  {
    this.af = new f();
    this.af.c("http://gwapi.bankuang.com/log?origin=/&target=/homeNav&token=" + w.a().o() + "&deviceId=" + com.android.dazhihui.g.a().v());
    registRequestListener(this.af);
    sendRequest(this.af);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.af)
    {
      new String(((com.android.dazhihui.a.b.g)paramj).a());
      return;
    }
    a(((o)paramj).h());
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    if (SelfSelectedStockManager.getInstance().getSelfStockVectorSize() <= 0) {
      SelfSelectedStockManager.getInstance().loadDataFromLocal();
    }
    this.C = hashCode();
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.z = paramBundle.getInt("searchType");
      this.r = paramBundle.getInt("type");
      this.A = paramBundle.getInt("index_type");
      this.ae = paramBundle.getInt("sb_search_type");
    }
    setContentView(2130903405);
    this.ad = getResources().getColor(2131493616);
    this.L = com.android.dazhihui.ui.a.m.a().b();
    a();
    b();
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1234) && (paramInt2 == -1))
    {
      this.w = paramIntent.getStringArrayListExtra("android.speech.extra.RESULTS");
      if (this.ac != null) {
        break label111;
      }
      this.ac = new hi(this, this.w);
      this.ac.b(2130837567);
      this.ac.a(-16777216);
      this.ac.a(new rk(this));
    }
    for (;;)
    {
      this.ac.c(this.D);
      this.ac.a(this.S);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label111:
      this.ac.a(this.w);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.W.a();
    this.W.c();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return false;
      if ((this.W != null) && (this.W.d()))
      {
        this.W.a();
        this.W.c();
      }
      else
      {
        finish();
      }
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    paramIntent = getIntent().getExtras();
    if (paramIntent != null)
    {
      this.z = paramIntent.getInt("searchType");
      this.r = paramIntent.getInt("type");
      this.A = paramIntent.getInt("index_type");
      this.ae = paramIntent.getInt("sb_search_type");
    }
  }
  
  public void onPause()
  {
    a(Boolean.valueOf(false), this.T);
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SearchStockScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */