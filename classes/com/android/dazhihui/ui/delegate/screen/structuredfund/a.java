package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class a
  extends ad
{
  private com.android.dazhihui.a.b.u A;
  private com.android.dazhihui.a.b.u B;
  private int c = -1;
  private DzhHeader d;
  private ListView e;
  private ImageView f;
  private LinearLayout g;
  private TableLayoutGroup h;
  private String[] i = com.android.dazhihui.ui.delegate.c.a.bM;
  private String[] j = com.android.dazhihui.ui.delegate.c.a.bN;
  private String[] k;
  private String[] l;
  private String[] m = { "名称", "委托时间", "价格", "状态", "委托", "成交" };
  private String[] n = { "stock_name", "entrust_time", "entrust_price", "entrust_status", "entrust_amount", "business_amount" };
  private String[] o = { "SECU_NAME", "ORDER_TIME", "PRICE", "DCL_FLAG", "QTY", "MATCHED_QTY", "TRD_ID", "ORDER_ID", "MARKET" };
  private String[] p = { "1037", "1039", "1041", "1043", "1040", "1047" };
  private String[] q = { "名称", "委托时间", "价格", "状态", "委托", "成交", "合同号", "买卖标志", "代码", "股东代码", "交易所代码", "撤单回调参数" };
  private String[] r = { "1037", "1039", "1041", "", "1040", "1047", "1042", "1026", "1036", "1019", "1003", "1800" };
  private String[] s = { "stock_name", "entrust_time", "", "", "", "", "entrust_no", "entrust_bs" };
  private int t = -1;
  private View u;
  private int v;
  private int w;
  private int x;
  private int y;
  private mh z;
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12912").a("1972", "").a("1214", "1").a("1206", this.x).a("1277", this.w).h()) });
    registRequestListener(this.A);
    a(this.A, paramBoolean);
  }
  
  private void c()
  {
    this.d = ((DzhHeader)this.u.findViewById(2131558643));
    this.e = ((ListView)this.u.findViewById(2131558780));
    this.f = ((ImageView)this.u.findViewById(2131558778));
    this.h = ((TableLayoutGroup)this.u.findViewById(2131558887));
    this.g = ((LinearLayout)this.u.findViewById(2131558888));
  }
  
  private void c(int paramInt)
  {
    if ((this.y < 0) || (this.y >= this.h.getDataModel().size())) {
      return;
    }
    this.t = paramInt;
    Hashtable localHashtable = b(paramInt);
    StringBuilder localStringBuilder = new StringBuilder().append("").append("证券名称:");
    if (localHashtable.get("1091") == null)
    {
      str = "";
      str = str + "\n";
      localStringBuilder = new StringBuilder().append(str).append("委托时间:");
      if (localHashtable.get("1039") != null) {
        break label249;
      }
      str = "";
      label118:
      str = str + "\n";
      localStringBuilder = new StringBuilder().append(str).append("合同号:");
      if (localHashtable.get("1042") != null) {
        break label262;
      }
    }
    label249:
    label262:
    for (String str = "";; str = (String)localHashtable.get("1042"))
    {
      str = str + "\n";
      new AlertDialog.Builder(getActivity()).setTitle(2131165568).setMessage(str).setPositiveButton(2131165363, new e(this)).setNegativeButton(2131165331, new d(this)).show();
      return;
      str = (String)localHashtable.get("1091");
      break;
      str = (String)localHashtable.get("1039");
      break label118;
    }
  }
  
  private void c(String paramString)
  {
    getActivity().runOnUiThread(new g(this, paramString));
  }
  
  private void d()
  {
    this.h.setVisibility(0);
    this.g.setVisibility(8);
    this.k = this.i;
    this.l = this.j;
    if ((this.k == null) || (this.l == null))
    {
      this.k = new String[] { "" };
      this.l = new String[] { "" };
    }
    this.h.setHeaderColumn(this.k);
    this.h.setPullDownLoading(false);
    this.h.setColumnClickable(null);
    this.h.setContinuousLoading(false);
    this.h.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.h.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.h.setDrawHeaderSeparateLine(false);
    this.h.setHeaderTextColor(getResources().getColor(2131493099));
    this.h.setHeaderFontSize(getResources().getDimension(2131230899));
    this.h.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.h.setLeftPadding(25);
    this.h.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.h.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.h.setStockNameColor(getResources().getColor(2131493235));
    this.h.setFirstColumnColorDifferent(true);
    this.h.setOnLoadingListener(new b(this));
    this.h.setOnTableLayoutClickListener(new c(this));
  }
  
  private void e()
  {
    if (!o.r()) {}
    while ((this.t == -1) || (this.y < 0) || (this.y >= this.h.getDataModel().size())) {
      return;
    }
    Object localObject = b(this.t);
    String str;
    if (((Hashtable)localObject).get("1042") == null)
    {
      str = "";
      if (((Hashtable)localObject).get("1800") != null) {
        break label165;
      }
    }
    label165:
    for (localObject = "";; localObject = (String)((Hashtable)localObject).get("1800"))
    {
      this.c = 1;
      this.B = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12910").a("1042", str).a("1800", (String)localObject).a("2315", "0").h()) });
      registRequestListener(this.B);
      a(this.B, true);
      return;
      str = (String)((Hashtable)localObject).get("1042");
      break;
    }
  }
  
  public void b()
  {
    this.x = 0;
    this.w = 20;
    this.h.a();
    a(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    label330:
    do
    {
      do
      {
        return;
        if (paramh == this.A)
        {
          Object localObject = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, getActivity()))
          {
            localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            int i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            if ((i4 == 0) && (this.h.getDataModel().size() == 0))
            {
              this.h.setBackgroundResource(2130838490);
              return;
            }
            this.h.setBackgroundColor(getResources().getColor(2131493677));
            if (i4 > 0)
            {
              ArrayList localArrayList = new ArrayList();
              int i1 = 0;
              while (i1 < i4)
              {
                mh localmh = new mh();
                String[] arrayOfString = new String[this.k.length];
                int[] arrayOfInt = new int[this.k.length];
                int i2 = 0;
                for (;;)
                {
                  if (i2 >= this.k.length) {
                    break label330;
                  }
                  try
                  {
                    arrayOfString[i2] = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, this.l[i2]).trim();
                    if (arrayOfString[i2] == null) {
                      arrayOfString[i2] = "--";
                    }
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      String str;
                      arrayOfString[i2] = "--";
                      continue;
                      int i3 = getResources().getColor(2131492932);
                    }
                  }
                  str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1026");
                  if ((str == null) || (!str.equals("0"))) {
                    break;
                  }
                  i3 = -65536;
                  arrayOfString[i2] = o.c(this.l[i2], arrayOfString[i2]);
                  arrayOfInt[i2] = i3;
                  i2 += 1;
                }
                localmh.a = arrayOfString;
                localmh.b = arrayOfInt;
                localArrayList.add(localmh);
                i1 += 1;
              }
              a((com.android.dazhihui.ui.delegate.b.h)localObject, this.x);
              this.h.a(localArrayList, this.x);
            }
          }
        }
      } while (paramh != this.B);
      paramh = ((v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
    this.c = -1;
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      new AlertDialog.Builder(getActivity()).setMessage(paramh.a(0, "1208")).setPositiveButton("确定", new f(this)).setCancelable(false).show();
      return;
    }
    paramh = Toast.makeText(getActivity(), paramh.d(), 0);
    paramh.setGravity(17, 0, 0);
    paramh.show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.c)
    {
    }
    for (;;)
    {
      this.c = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.c)
    {
    }
    for (;;)
    {
      this.c = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.u = paramLayoutInflater.inflate(2130903466, paramViewGroup, false);
    c();
    d();
    a(true);
    return this.u;
  }
  
  public void show()
  {
    super.show();
    if (this.h != null) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */