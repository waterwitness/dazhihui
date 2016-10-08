package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
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

public class ETFFundCancel
  extends DelegateBaseActivity
  implements cp, cs
{
  private String a = "";
  private boolean b = false;
  private int c = -1;
  private int d;
  private mh e;
  private String[] f;
  private String[] g;
  private DzhHeader h;
  private ImageView i;
  private TableLayoutGroup j;
  private int m;
  private int n;
  private int o;
  private int p = -1;
  private com.android.dazhihui.a.b.u q;
  private com.android.dazhihui.a.b.u r;
  
  private void a()
  {
    this.h = ((DzhHeader)findViewById(2131558643));
    this.h.a(this, this);
    this.i = ((ImageView)findViewById(2131558778));
    this.j = ((TableLayoutGroup)findViewById(2131558887));
  }
  
  private void a(int paramInt)
  {
    if ((o.i()) && ((this.d < 0) || (this.d >= this.j.getDataModel().size()))) {
      return;
    }
    this.p = paramInt;
    Hashtable localHashtable = c(paramInt);
    StringBuilder localStringBuilder = new StringBuilder().append("").append("证券名称:");
    if (localHashtable.get("1037") == null)
    {
      str = "";
      str = str + "\n";
      localStringBuilder = new StringBuilder().append(str).append("委托时间:");
      if (localHashtable.get("1039") != null) {
        break label227;
      }
      str = "";
      label120:
      str = str + "\n";
      localStringBuilder = new StringBuilder().append(str).append("合同号:");
      if (localHashtable.get("1042") != null) {
        break label240;
      }
    }
    label227:
    label240:
    for (String str = "";; str = (String)localHashtable.get("1042"))
    {
      str = str + "\n";
      promptTrade(getString(2131165568), str, getString(2131165363), getString(2131165331), new l(this), null, null);
      return;
      str = (String)localHashtable.get("1037");
      break;
      str = (String)localHashtable.get("1039");
      break label120;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int k = this.o;
    int i1 = this.n;
    this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12426").a("1206", k).a("1277", i1).a("1906", "").a("1036", "").a("1214", "").h()) });
    registRequestListener(this.q);
    a(this.q, paramBoolean);
  }
  
  private void b()
  {
    this.j.setVisibility(0);
    this.f = a.a;
    this.g = a.b;
    if ((this.f == null) || (this.g == null))
    {
      this.f = new String[] { "" };
      this.g = new String[] { "" };
    }
    this.j.setHeaderColumn(this.f);
    this.j.setPullDownLoading(false);
    this.j.setColumnClickable(null);
    this.j.setContinuousLoading(false);
    this.j.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.j.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.j.setDrawHeaderSeparateLine(false);
    this.j.setHeaderTextColor(getResources().getColor(2131493099));
    this.j.setHeaderFontSize(getResources().getDimension(2131230899));
    this.j.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.j.setLeftPadding(25);
    this.j.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.j.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.j.setStockNameColor(getResources().getColor(2131493235));
    this.j.setFirstColumnColorDifferent(true);
    this.j.setOnLoadingListener(new j(this));
    this.j.setOnTableLayoutClickListener(new k(this));
  }
  
  private void c()
  {
    if (!o.r()) {}
    while ((!o.i()) || (this.p == -1) || ((o.i()) && ((this.d < 0) || (this.d >= this.j.getDataModel().size())))) {
      return;
    }
    Object localObject = c(this.p);
    String str1;
    String str2;
    label89:
    String str3;
    label103:
    String str4;
    if (((Hashtable)localObject).get("1036") == null)
    {
      str1 = "";
      if (((Hashtable)localObject).get("1042") != null) {
        break label248;
      }
      str2 = "";
      if (((Hashtable)localObject).get("1019") != null) {
        break label262;
      }
      str3 = "";
      if (((Hashtable)localObject).get("1021") != null) {
        break label277;
      }
      str4 = "";
      label118:
      if (((Hashtable)localObject).get("1800") != null) {
        break label293;
      }
    }
    label248:
    label262:
    label277:
    label293:
    for (localObject = "";; localObject = (String)((Hashtable)localObject).get("1800"))
    {
      this.c = 1;
      this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12428").a("1212", "1").a("1036", str1).a("1042", str2).a("1019", str3).a("1021", str4).a("1800", (String)localObject).h()) });
      registRequestListener(this.r);
      a(this.r, true);
      return;
      str1 = (String)((Hashtable)localObject).get("1036");
      break;
      str2 = (String)((Hashtable)localObject).get("1042");
      break label89;
      str3 = (String)((Hashtable)localObject).get("1019");
      break label103;
      str4 = (String)((Hashtable)localObject).get("1021");
      break label118;
    }
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new n(this, paramString));
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    case 1: 
    case 2: 
    default: 
      return true;
    case 0: 
      finish();
      return true;
    }
    a(true);
    return true;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.h.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.p = this;
    paramct.d = getResources().getString(2131165199);
    paramct.f = getResources().getDrawable(2130838123);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.h = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((paramj == null) || (this == null) || (isFinishing())) {}
    label351:
    do
    {
      do
      {
        return;
        if (paramh == this.q)
        {
          Object localObject = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this))
          {
            localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
            {
              paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            this.m = ((com.android.dazhihui.ui.delegate.b.h)localObject).b("1289");
            int i3 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            if ((i3 == 0) && (this.j.getDataModel().size() == 0))
            {
              this.j.setBackgroundResource(2130838490);
              return;
            }
            this.j.setBackgroundColor(getResources().getColor(2131493677));
            if (i3 > 0)
            {
              ArrayList localArrayList = new ArrayList();
              int k = 0;
              while (k < i3)
              {
                mh localmh = new mh();
                String[] arrayOfString = new String[this.f.length];
                int[] arrayOfInt = new int[this.f.length];
                int i1 = 0;
                for (;;)
                {
                  if (i1 >= this.f.length) {
                    break label351;
                  }
                  try
                  {
                    arrayOfString[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, this.g[i1]).trim();
                    if (arrayOfString[i1] == null) {
                      arrayOfString[i1] = "--";
                    }
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      String str;
                      arrayOfString[i1] = "--";
                      continue;
                      int i2 = getResources().getColor(2131492932);
                    }
                  }
                  str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(k, "1026");
                  if ((str == null) || (!str.equals("0"))) {
                    break;
                  }
                  i2 = -65536;
                  arrayOfString[i1] = o.c(this.g[i1], arrayOfString[i1]);
                  arrayOfInt[i1] = i2;
                  i1 += 1;
                }
                localmh.a = arrayOfString;
                localmh.b = arrayOfInt;
                localArrayList.add(localmh);
                k += 1;
              }
              a((com.android.dazhihui.ui.delegate.b.h)localObject, this.o);
              this.j.a(localArrayList, this.o);
            }
          }
        }
      } while (paramh != this.r);
      paramh = ((v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
    this.c = -1;
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      promptTrade(getString(2131166360), paramh.a(0, "1208"), getString(2131165363), null, new m(this), null, null);
      return;
    }
    paramh = Toast.makeText(this, paramh.d(), 0);
    paramh.setGravity(17, 0, 0);
    paramh.show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    getLoadingDialog().dismiss();
    switch (this.c)
    {
    }
    for (;;)
    {
      this.c = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903109);
    a();
    b();
    a(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    getLoadingDialog().dismiss();
    switch (this.c)
    {
    }
    for (;;)
    {
      this.c = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ETFFundCancel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */