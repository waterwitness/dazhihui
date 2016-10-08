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
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class Transfertable_select
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
  private DzhHeader j;
  private int m;
  private String n;
  private mh o;
  private com.android.dazhihui.a.b.u p;
  
  public Transfertable_select()
  {
    String[] arrayOfString;
    if (a.q == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "流水号";
      arrayOfString[1] = "银行名称";
      arrayOfString[2] = "转帐方向";
      arrayOfString[3] = "转帐金额";
      arrayOfString[4] = "转帐日期";
      arrayOfString[5] = "转帐时间";
      this.h = arrayOfString;
      if (a.r != null) {
        break label152;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1191";
      arrayOfString[1] = "1187";
      arrayOfString[2] = "1083";
      arrayOfString[3] = "1192";
      arrayOfString[4] = "1195";
      arrayOfString[5] = "1196";
    }
    for (;;)
    {
      this.i = arrayOfString;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.m = 0;
      this.n = "";
      return;
      arrayOfString = a.q;
      break;
      label152:
      arrayOfString = a.r;
    }
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
  
  public void a()
  {
    if (this.b == 0) {
      return;
    }
    String[] arrayOfString = this.o.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.h[k]).append(": ").append((String)localObject);
      k += 1;
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
    this.p = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11124").a("1186", this.n).a("1022", o.w()).a("1023", o.y()).a("1206", this.f).a("1277", this.e).a("1028", this.m).h()) });
    registRequestListener(this.p);
    a(this.p, paramBoolean);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131165246);
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.j = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    com.android.dazhihui.ui.delegate.b.u.a(paramj, this);
    if (paramj == null)
    {
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    do
    {
      do
      {
        return;
      } while (paramh != this.p);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        paramh = Toast.makeText(this, paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      this.b = paramh.g();
      if ((this.b == 0) && (this.g.getDataModel().size() == 0))
      {
        this.g.setBackgroundResource(2130838490);
        return;
      }
      this.g.setBackgroundColor(getResources().getColor(2131493677));
    } while (this.b <= 0);
    this.d = paramh.b("1289");
    paramj = new ArrayList();
    int k = 0;
    while (k < this.b)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.h.length];
      int[] arrayOfInt = new int[this.h.length];
      int i1 = 0;
      while (i1 < this.h.length)
      {
        try
        {
          arrayOfString[i1] = paramh.a(k, this.i[i1]).trim();
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
        arrayOfString[i1] = o.c(this.i[i1], arrayOfString[i1]);
        arrayOfInt[i1] = getResources().getColor(2131493235);
        i1 += 1;
      }
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      k += 1;
    }
    this.g.a(paramj, this.f);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.p) {
      this.g.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903108);
    paramBundle = getIntent().getExtras();
    this.m = paramBundle.getInt("moneyTypeId");
    this.n = paramBundle.getString("bankname");
    this.j = ((DzhHeader)findViewById(2131558643));
    this.j.setTitle("转账查询");
    this.j.a(this, this);
    this.g = ((TableLayoutGroup)findViewById(2131558886));
    this.g.setHeaderColumn(this.h);
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
    this.g.setOnLoadingListener(new ht(this));
    this.g.setOnTableLayoutClickListener(new hu(this));
    a(false);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.p) {
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\Transfertable_select.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */