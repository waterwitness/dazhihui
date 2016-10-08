package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
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

public class FundListViewPublic
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
  private String[] p;
  private String[] q;
  private DzhHeader r;
  private mh s;
  private String t;
  private com.android.dazhihui.a.b.u u;
  private com.android.dazhihui.a.b.u v;
  private com.android.dazhihui.a.b.u w;
  
  public FundListViewPublic()
  {
    String[] arrayOfString;
    if (a.u == null)
    {
      arrayOfString = new String[8];
      arrayOfString[0] = "基金代码";
      arrayOfString[1] = "基金名称";
      arrayOfString[2] = "基金状态";
      arrayOfString[3] = "基金风险等级";
      arrayOfString[4] = "基金净值";
      arrayOfString[5] = "基金公司";
      arrayOfString[6] = "基金认购方式";
      arrayOfString[7] = "基金总份额";
      this.h = arrayOfString;
      if (a.v != null) {
        break label273;
      }
      arrayOfString = new String[8];
      arrayOfString[0] = "1090";
      arrayOfString[1] = "1091";
      arrayOfString[2] = "1123";
      arrayOfString[3] = "1323";
      arrayOfString[4] = "1094";
      arrayOfString[5] = "1089";
      arrayOfString[6] = "1286";
      arrayOfString[7] = "1259";
      label132:
      this.i = arrayOfString;
      if (a.A != null) {
        break label280;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "基金名称";
      arrayOfString[1] = "实际份额";
      arrayOfString[2] = "可用份额";
      arrayOfString[3] = "基金市值";
      arrayOfString[4] = "基金状态";
      arrayOfString[5] = "基金代码";
      label179:
      this.j = arrayOfString;
      if (a.B != null) {
        break label287;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1092";
      arrayOfString[2] = "1098";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1123";
      arrayOfString[5] = "1090";
    }
    for (;;)
    {
      this.m = arrayOfString;
      this.n = a.s;
      this.o = a.t;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      return;
      arrayOfString = a.u;
      break;
      label273:
      arrayOfString = a.v;
      break label132;
      label280:
      arrayOfString = a.A;
      break label179;
      label287:
      arrayOfString = a.B;
    }
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.u paramu)
  {
    if (this.t.equals("jjinfo"))
    {
      this.p = this.h;
      this.q = this.i;
      paramu = com.android.dazhihui.ui.delegate.b.h.b(paramu.e());
      if (paramu.b()) {
        break label114;
      }
      c(paramu.d());
    }
    label114:
    do
    {
      return;
      if (this.t.equals("femx"))
      {
        this.p = this.j;
        this.q = this.m;
        break;
      }
      if (!this.t.equals("jjzhcx")) {
        break;
      }
      this.p = this.n;
      this.q = this.o;
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
      String[] arrayOfString = new String[this.p.length];
      int[] arrayOfInt = new int[this.p.length];
      int i1 = 0;
      for (;;)
      {
        if (i1 < this.p.length) {
          try
          {
            arrayOfString[i1] = paramu.a(k, this.q[i1]).trim();
            arrayOfString[i1] = o.c(this.q[i1], arrayOfString[i1]);
            arrayOfInt[i1] = getResources().getColor(2131493235);
            i1 += 1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              arrayOfString[i1] = "-";
            }
          }
        }
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
    String[] arrayOfString = this.s.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    if (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      if (this.t.equals("jjinfo")) {
        localStringBuffer.append("\n").append(this.h[k]).append(": ").append((String)localObject);
      }
      for (;;)
      {
        k += 1;
        break;
        if (this.t.equals("femx")) {
          localStringBuffer.append("\n").append(this.j[k]).append(": ").append((String)localObject);
        } else if (this.t.equals("jjzhcx")) {
          localStringBuffer.append("\n").append(this.n[k]).append(": ").append((String)localObject);
        }
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
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", "").a("1206", this.f).a("1277", this.e).a("1321", "0").h()) });
    registRequestListener(this.u);
    a(this.u, paramBoolean);
  }
  
  public void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11906").a("1206", this.f).a("1277", this.e).h()) });
    registRequestListener(this.v);
    a(this.v, paramBoolean);
  }
  
  public void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11926").a("1206", this.f).a("1277", this.e).h()) });
    registRequestListener(this.w);
    a(this.w, paramBoolean);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (aw.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.r.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.r.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    if (this.t.equals("jjinfo")) {
      paramct.d = "基金信息";
    }
    for (;;)
    {
      paramct.p = this;
      return;
      if (this.t.equals("femx")) {
        paramct.d = "份额明细";
      } else if (this.t.equals("jjzhcx")) {
        paramct.d = "基金账户";
      }
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.r = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null)
    {
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    while ((paramh != this.u) && (paramh != this.v) && (paramh != this.w)) {
      return;
    }
    a(paramj);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.u) {
      this.g.d();
    }
    if (paramh == this.v) {
      this.g.d();
    }
    if (paramh == this.w) {
      this.g.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903478);
    this.t = getIntent().getExtras().getString("tag");
    this.r = ((DzhHeader)findViewById(2131558513));
    this.r.a(this, this);
    this.g = ((TableLayoutGroup)findViewById(2131558886));
    this.g.setHeaderHeight((int)getResources().getDimension(2131230811));
    if (this.t.equals("jjinfo"))
    {
      this.g.setHeaderColumn(this.h);
      this.g.setPullDownLoading(false);
      this.g.setColumnClickable(null);
      this.g.setContinuousLoading(true);
      this.g.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.g.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.g.setDrawHeaderSeparateLine(false);
      this.g.setHeaderTextColor(getResources().getColor(2131493099));
      this.g.setHeaderFontSize(getResources().getDimension(2131230899));
      this.g.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.g.setLeftPadding(25);
      this.g.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.g.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.g.setStockNameColor(getResources().getColor(2131493235));
      this.g.setFirstColumnColorDifferent(true);
      if (!this.t.equals("jjinfo")) {
        break label391;
      }
      a(true);
    }
    for (;;)
    {
      this.g.setOnLoadingListener(new au(this));
      this.g.setOnTableLayoutClickListener(new av(this));
      return;
      if (this.t.equals("femx"))
      {
        this.g.setHeaderColumn(this.j);
        break;
      }
      if (!this.t.equals("jjzhcx")) {
        break;
      }
      this.g.setHeaderColumn(this.n);
      break;
      label391:
      if (this.t.equals("femx")) {
        b(true);
      } else if (this.t.equals("jjzhcx")) {
        c(true);
      }
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.u) {
      this.g.d();
    }
    if (paramh == this.v) {
      this.g.d();
    }
    if (paramh == this.w) {
      this.g.d();
    }
    if (this == b.a().f()) {
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundListViewPublic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */