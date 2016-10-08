package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class CancelTable
  extends DelegateBaseActivity
  implements cp, cs
{
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  ProgressDialog e;
  int f;
  private int g = com.android.dazhihui.ui.a.m.a().H();
  private int h = 0;
  private TableLayoutGroup i;
  private String[] j = { "股票名称", "委托数量", "委托价格", "买卖类别", "申报时间", "股票代码", "合同号" };
  private String[] m = { "1037", "1040", "1041", "1026", "1039", "1036", "1042" };
  private DzhHeader n;
  private mh o;
  private int p;
  private com.android.dazhihui.a.b.u q = null;
  private com.android.dazhihui.a.b.u r = null;
  
  private void c()
  {
    if ((this.p < 0) || (this.p > this.d)) {}
    StringBuffer localStringBuffer;
    do
    {
      return;
      Hashtable localHashtable = d();
      String[] arrayOfString = this.o.a;
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("合 同 号: ").append(com.android.dazhihui.d.n.t((String)localHashtable.get("1042")));
      int k = 0;
      while (k < 6)
      {
        localStringBuffer.append("\n").append(this.j[k]).append(": ").append(arrayOfString[k]);
        k += 1;
      }
    } while ((this.i == null) || (this.i.getDataModel().size() == 0));
    new AlertDialog.Builder(this).setTitle(2131165568).setMessage(localStringBuffer).setPositiveButton(2131165363, new o(this)).setNegativeButton(2131165331, new n(this)).show();
  }
  
  private Hashtable<String, String> d()
  {
    return c(this.p);
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
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while ((this.p < 0) || (this.p > this.d)) {
      return;
    }
    Hashtable localHashtable = d();
    String[] arrayOfString = this.o.a;
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("合 同 号: ").append(com.android.dazhihui.d.n.t((String)localHashtable.get("1042")));
    int k = 0;
    while (k < 6)
    {
      ((StringBuffer)localObject).append("\n").append(this.j[k]).append(": ").append(arrayOfString[k]);
      k += 1;
    }
    arrayOfString = new String[6];
    arrayOfString[0] = "1036";
    arrayOfString[1] = "1037";
    arrayOfString[2] = "1026";
    arrayOfString[3] = "1042";
    arrayOfString[4] = "1019";
    arrayOfString[5] = "1003";
    localObject = com.android.dazhihui.ui.delegate.b.o.g("11114").a("1212", "1");
    k = 0;
    for (;;)
    {
      if (k < arrayOfString.length) {
        try
        {
          ((com.android.dazhihui.ui.delegate.b.h)localObject).a(arrayOfString[k], com.android.dazhihui.d.n.t((String)localHashtable.get(arrayOfString[k])));
          k += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            ((com.android.dazhihui.ui.delegate.b.h)localObject).a(arrayOfString[k], "-");
          }
        }
      }
    }
    this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
    registRequestListener(this.r);
    a(this.r, false);
    this.e.show();
  }
  
  public void a(String paramString)
  {
    new AlertDialog.Builder(this).setMessage(paramString).setPositiveButton("确定", new p(this)).show();
  }
  
  public void a(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11132").a("1206", this.h).a("1277", this.g).a("1036", "").a("1026", "").h()) });
    registRequestListener(this.q);
    a(this.q, paramBoolean);
    this.e.show();
  }
  
  public void b()
  {
    if (this.b == 0) {
      return;
    }
    c();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (q.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.n == null);
      this.n.a(paramy);
      return;
    } while (this.n == null);
    this.n.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131166378);
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.n = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (!isFinishing()) {
      this.e.cancel();
    }
    Object localObject;
    if (paramh == this.q)
    {
      localObject = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
      {
        localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
        }
      }
    }
    do
    {
      do
      {
        return;
        this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
        this.d = ((com.android.dazhihui.ui.delegate.b.h)localObject).b("1289");
        if ((this.b == 0) && (this.i.getDataModel().size() == 0))
        {
          this.i.setBackgroundResource(2130838490);
          return;
        }
        this.i.setBackgroundColor(getResources().getColor(2131493677));
        if (this.b > 0)
        {
          ArrayList localArrayList = new ArrayList();
          int k = 0;
          while (k < this.b)
          {
            mh localmh = new mh();
            String[] arrayOfString = new String[this.j.length];
            int[] arrayOfInt = new int[this.j.length];
            int i1 = 0;
            while (i1 < this.j.length)
            {
              try
              {
                arrayOfString[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, this.m[i1]).trim();
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
              arrayOfString[i1] = com.android.dazhihui.ui.delegate.b.o.c(this.m[i1], arrayOfString[i1]);
              arrayOfInt[i1] = getResources().getColor(2131493235);
              i1 += 1;
            }
            localmh.a = arrayOfString;
            localmh.b = arrayOfInt;
            localArrayList.add(localmh);
            k += 1;
          }
          a((com.android.dazhihui.ui.delegate.b.h)localObject, this.h);
          this.i.a(localArrayList, this.h);
        }
      } while (paramh != this.r);
      paramh = ((v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      a(paramh.a(0, "1208"));
      return;
    }
    paramh = Toast.makeText(this, paramh.d(), 0);
    paramh.setGravity(17, 0, 0);
    paramh.show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.q) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
    if (isFinishing()) {
      this.e.dismiss();
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903065);
    this.n = ((DzhHeader)findViewById(2131558643));
    this.n.a(this, this);
    this.i = ((TableLayoutGroup)findViewById(2131558644));
    this.i.setHeaderColumn(this.j);
    this.i.setPullDownLoading(false);
    this.i.setColumnClickable(null);
    this.i.setContinuousLoading(false);
    this.i.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.i.setDrawHeaderSeparateLine(false);
    this.i.setHeaderTextColor(getResources().getColor(2131493235));
    this.i.setHeaderHeight(56);
    this.i.setContentRowHeight(96);
    this.i.setLeftPadding(25);
    this.i.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.i.setStockNameColor(getResources().getColor(2131493235));
    this.i.setOnLoadingListener(new l(this));
    this.i.setOnTableLayoutClickListener(new m(this));
    this.e = new ProgressDialog(this);
    this.e.setCancelable(true);
    this.e.setIndeterminate(true);
    this.e.setTitle("请稍后...");
    this.e.setMessage("正在连接网络...");
    a(false);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.q) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(9);
    }
    if (isFinishing()) {
      this.e.dismiss();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    this.f = paramInt;
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    switch (this.f)
    {
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\CancelTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */