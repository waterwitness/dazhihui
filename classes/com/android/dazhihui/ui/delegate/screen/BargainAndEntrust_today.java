package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class BargainAndEntrust_today
  extends DelegateBaseActivity
  implements cp, cs
{
  protected boolean a;
  protected int b;
  protected int c;
  protected int d;
  private int e = m.a().H();
  private int f = 0;
  private TableLayoutGroup g;
  private String[] h;
  private String[] i;
  private String[] j;
  private String[] m;
  private String[] n;
  private String[] o;
  private DzhHeader p;
  private mh q;
  private byte r;
  private String s;
  private com.android.dazhihui.a.b.u t;
  private com.android.dazhihui.a.b.u u;
  
  public BargainAndEntrust_today()
  {
    String[] arrayOfString;
    if (com.android.dazhihui.ui.delegate.c.a.g == null)
    {
      arrayOfString = new String[10];
      arrayOfString[0] = "股票名称";
      arrayOfString[1] = "委托状态";
      arrayOfString[2] = "委托数量";
      arrayOfString[3] = "委托价格";
      arrayOfString[4] = "买卖类别";
      arrayOfString[5] = "申报时间";
      arrayOfString[6] = "成交数量";
      arrayOfString[7] = "成交价格";
      arrayOfString[8] = "股票代码";
      arrayOfString[9] = "合同号";
      this.h = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.h != null) {
        break label286;
      }
      arrayOfString = new String[10];
      arrayOfString[0] = "1037";
      arrayOfString[1] = "1043";
      arrayOfString[2] = "1040";
      arrayOfString[3] = "1041";
      arrayOfString[4] = "1026";
      arrayOfString[5] = "1039";
      arrayOfString[6] = "1047";
      arrayOfString[7] = "1048";
      arrayOfString[8] = "1036";
      arrayOfString[9] = "1042";
      label156:
      this.i = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.i != null) {
        break label293;
      }
      arrayOfString = new String[5];
      arrayOfString[0] = "股票名称";
      arrayOfString[1] = "成交数量";
      arrayOfString[2] = "成交价格";
      arrayOfString[3] = "买卖类别";
      arrayOfString[4] = "成交时间";
      label197:
      this.j = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.j != null) {
        break label300;
      }
      arrayOfString = new String[5];
      arrayOfString[0] = "1037";
      arrayOfString[1] = "1047";
      arrayOfString[2] = "1048";
      arrayOfString[3] = "1026";
      arrayOfString[4] = "1046";
    }
    for (;;)
    {
      this.m = arrayOfString;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.r = 1;
      this.s = null;
      this.u = null;
      return;
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.g;
      break;
      label286:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.h;
      break label156;
      label293:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.i;
      break label197;
      label300:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.j;
    }
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.u paramu)
  {
    if (this.s.equals("todayEntrust"))
    {
      this.n = this.h;
      this.o = this.i;
      paramu = com.android.dazhihui.ui.delegate.b.h.b(paramu.e());
      if (paramu.b()) {
        break label85;
      }
      paramu = Toast.makeText(this, paramu.d(), 0);
      paramu.setGravity(17, 0, 0);
      paramu.show();
    }
    label85:
    do
    {
      return;
      this.n = this.j;
      this.o = this.m;
      break;
      this.b = paramu.g();
      this.d = paramu.b("1289");
      if ((this.b == 0) && (this.g.getDataModel().size() == 0))
      {
        this.g.setBackgroundResource(2130838490);
        return;
      }
      this.g.setBackgroundColor(getResources().getColor(2131493677));
    } while (this.b <= 0);
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    while (k < this.b)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.n.length];
      int[] arrayOfInt = new int[this.n.length];
      int i1 = 0;
      while (i1 < this.n.length)
      {
        try
        {
          arrayOfString[i1] = paramu.a(k, this.o[i1]).trim();
          if (arrayOfString[i1] == null) {
            arrayOfString[i1] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            arrayOfString[i1] = "--";
          }
        }
        arrayOfString[i1] = o.c(this.o[i1], arrayOfString[i1]);
        arrayOfInt[i1] = getResources().getColor(2131493235);
        i1 += 1;
      }
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      localArrayList.add(localmh);
      k += 1;
    }
    this.g.a(localArrayList, this.f);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    if (this.b == 0) {
      return;
    }
    String[] arrayOfString = this.q.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    if (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      if (this.s.equals("todayEntrust")) {
        localStringBuffer.append("\n").append(this.h[k]).append(": ").append((String)localObject);
      }
      for (;;)
      {
        k += 1;
        break;
        localStringBuffer.append("\n").append(this.j[k]).append(": ").append((String)localObject);
      }
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11134").a("1206", this.f).a("1277", this.e).a("1036", "").a("1026", "").h()) });
    registRequestListener(this.t);
    a(this.t, paramBoolean);
  }
  
  public void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11140").a("1206", this.f).a("1277", this.e).a("1217", Integer.toString(this.r)).a("1036", "").a("1026", "").h()) });
    registRequestListener(this.u);
    a(this.u, paramBoolean);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (c.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.p == null);
      this.p.a(paramy);
      return;
    } while (this.p == null);
    this.p.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    String str = paramContext.getResources().getString(2131165448);
    paramContext = paramContext.getResources().getString(2131166381);
    paramct.a = 40;
    if (this.s.equals("todayEntrust")) {}
    for (paramct.d = str;; paramct.d = paramContext)
    {
      paramct.p = this;
      return;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.p = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.t)
    {
      com.android.dazhihui.ui.delegate.b.u localu = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(localu, this)) {
        a(localu);
      }
    }
    if (paramh == this.u)
    {
      paramh = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
        a(paramh);
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.t) {
      this.g.d();
    }
    if (paramh == this.u) {
      this.g.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903108);
    this.s = getIntent().getExtras().getString("tag");
    this.p = ((DzhHeader)findViewById(2131558643));
    this.p.a(this, this);
    this.g = ((TableLayoutGroup)findViewById(2131558886));
    if (this.s.equals("todayEntrust")) {
      this.g.setHeaderColumn(this.h);
    }
    for (;;)
    {
      this.g.setPullDownLoading(false);
      this.g.setColumnClickable(null);
      this.g.setContinuousLoading(false);
      this.g.setHeaderBackgroundColor(getResources().getColor(2131493234));
      this.g.setDrawHeaderSeparateLine(false);
      this.g.setHeaderTextColor(getResources().getColor(2131493235));
      this.g.setHeaderHeight(56);
      this.g.setContentRowHeight(96);
      this.g.setLeftPadding(25);
      this.g.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.g.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.g.setStockNameColor(getResources().getColor(2131493235));
      this.g.setOnLoadingListener(new a(this));
      this.g.setOnTableLayoutClickListener(new b(this));
      if (!this.s.equals("todayEntrust")) {
        break;
      }
      a(false);
      return;
      this.g.setHeaderColumn(this.j);
    }
    b(false);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.t) {
      this.g.d();
    }
    if (paramh == this.u) {
      this.g.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(9);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\BargainAndEntrust_today.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */