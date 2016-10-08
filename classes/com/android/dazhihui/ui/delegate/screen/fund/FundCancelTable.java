package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.content.Context;
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

public class FundCancelTable
  extends DelegateBaseActivity
  implements cp, cs
{
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  private int e = m.a().H();
  private int f = 0;
  private TableLayoutGroup g;
  private String[] h = a.w;
  private String[] i = a.x;
  private DzhHeader j;
  private mh m;
  private int n;
  private com.android.dazhihui.a.b.u o;
  private com.android.dazhihui.a.b.u p;
  
  private void c()
  {
    if ((this.n < 0) || (this.n > this.d)) {
      return;
    }
    Hashtable localHashtable = c(this.n);
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    if (k < this.i.length)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(this.h[k]).append(":");
      if (localHashtable.get(this.i[k]) == null) {}
      for (String str = "";; str = (String)localHashtable.get(this.i[k]))
      {
        localStringBuffer.append(str + "\n");
        k += 1;
        break;
      }
    }
    d(localStringBuffer.toString());
  }
  
  private void d(String paramString)
  {
    new AlertDialog.Builder(this).setTitle(2131165568).setMessage(paramString).setPositiveButton(2131165363, new ad(this)).setNegativeButton(2131165331, new ac(this)).show();
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
    if (!o.r()) {
      return;
    }
    Object localObject = c(this.n);
    String str1;
    String str2;
    label43:
    String str3;
    if (((Hashtable)localObject).get("1090") == null)
    {
      str1 = "";
      if (((Hashtable)localObject).get("1042") != null) {
        break label167;
      }
      str2 = "";
      if (((Hashtable)localObject).get("1038") != null) {
        break label181;
      }
      str3 = "";
      label56:
      if (((Hashtable)localObject).get("1800") != null) {
        break label195;
      }
    }
    label167:
    label181:
    label195:
    for (localObject = "";; localObject = (String)((Hashtable)localObject).get("1800"))
    {
      this.p = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11902").a("1090", str1).a("1092", "0").a("1042", str2).a("1038", str3).a("1800", (String)localObject).h()) });
      registRequestListener(this.p);
      a(this.p, true);
      return;
      str1 = (String)((Hashtable)localObject).get("1090");
      break;
      str2 = (String)((Hashtable)localObject).get("1042");
      break label43;
      str3 = (String)((Hashtable)localObject).get("1038");
      break label56;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.o = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11908").a("1022", o.y()).a("1023", o.y()).a("1214", "1").a("1206", this.f).a("1277", this.e).h()) });
    registRequestListener(this.o);
    a(this.o, paramBoolean);
  }
  
  public void b()
  {
    c();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (ae.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.j.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.j.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金撤单";
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
    if (paramj == null)
    {
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    do
    {
      return;
      if (paramh == this.o)
      {
        com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (!localh.b())
        {
          c(localh.d());
          return;
        }
        this.b = localh.g();
        if ((this.b == 0) && (this.g.getDataModel().size() == 0))
        {
          this.g.setBackgroundResource(2130838490);
          return;
        }
        this.g.setBackgroundColor(getResources().getColor(2131493677));
        if (this.b > 0)
        {
          this.d = localh.b("1289");
          ArrayList localArrayList = new ArrayList();
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
                arrayOfString[i1] = localh.a(k, this.i[i1]).trim();
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
            localArrayList.add(localmh);
            k += 1;
          }
          a(localh, this.f);
          this.g.a(localArrayList, this.f);
        }
      }
    } while (paramh != this.p);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b())
    {
      c(paramh.a(0, "1208"));
      this.g.a();
      a(false);
      return;
    }
    c(paramh.d());
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.o) {
      this.g.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903468);
    this.j = ((DzhHeader)findViewById(2131558513));
    this.j.a(this, this);
    this.g = ((TableLayoutGroup)findViewById(2131558644));
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
    this.g.setOnLoadingListener(new aa(this));
    this.g.setOnTableLayoutClickListener(new ab(this));
    a(false);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.o) {
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
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      if (paramInt == 4) {
        finish();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundCancelTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */