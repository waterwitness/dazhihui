package com.android.dazhihui.ui.delegate.screen.margin;

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
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class b
  extends ad
{
  private int c = -1;
  private DzhHeader d;
  private ListView e;
  private ImageView f;
  private LinearLayout g;
  private TableLayoutGroup h;
  private String[] i;
  private String[] j;
  private String[] k;
  private String[] l;
  private int m = -1;
  private View n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s = 12140;
  private com.android.dazhihui.a.b.u t;
  private com.android.dazhihui.a.b.u u;
  
  public b() {}
  
  public b(int paramInt)
  {
    this.s = paramInt;
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int i1 = this.q;
    int i2 = this.p;
    if (this.s == 12180) {}
    for (com.android.dazhihui.ui.delegate.b.h localh = o.g("12180").a("1206", i1).a("1277", i2).a("1214", "1").a("1036", "").a("1026", "");; localh = o.g("12140").a("1206", i1).a("1277", i2).a("1036", "").a("1026", ""))
    {
      this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.t);
      a(this.t, paramBoolean);
      return;
    }
  }
  
  private void c()
  {
    this.d = ((DzhHeader)this.n.findViewById(2131558643));
    this.e = ((ListView)this.n.findViewById(2131558780));
    this.f = ((ImageView)this.n.findViewById(2131558778));
    this.h = ((TableLayoutGroup)this.n.findViewById(2131558887));
    this.g = ((LinearLayout)this.n.findViewById(2131558888));
  }
  
  private void c(int paramInt)
  {
    if ((this.r < 0) || (this.r >= this.h.getDataModel().size())) {
      return;
    }
    this.m = paramInt;
    Hashtable localHashtable = b(this.r);
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    if (paramInt < this.l.length)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(this.k[paramInt]).append(":");
      if (localHashtable.get(this.l[paramInt]) == null) {}
      for (String str = "";; str = (String)localHashtable.get(this.l[paramInt]))
      {
        localStringBuffer.append(str + "\n");
        paramInt += 1;
        break;
      }
    }
    new AlertDialog.Builder(getActivity()).setTitle(2131165568).setMessage(localStringBuffer.toString()).setPositiveButton(2131165363, new e(this)).setNegativeButton(2131165331, null).show();
  }
  
  private void c(String paramString)
  {
    getActivity().runOnUiThread(new g(this, paramString));
  }
  
  private void d()
  {
    this.h.setVisibility(0);
    this.g.setVisibility(8);
    if (this.s == 12140)
    {
      this.k = a.aS;
      this.l = a.aT;
    }
    for (;;)
    {
      this.i = this.k;
      this.j = this.l;
      if ((this.i == null) || (this.j == null))
      {
        this.i = new String[] { "" };
        this.j = new String[] { "" };
      }
      this.h.setHeaderColumn(this.i);
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
      this.h.setOnLoadingListener(new c(this));
      this.h.setOnTableLayoutClickListener(new d(this));
      return;
      if (this.s == 12180)
      {
        this.k = a.bg;
        this.l = a.bh;
      }
    }
  }
  
  private void e()
  {
    if (!o.r()) {}
    while ((this.m == -1) || (this.r < 0) || (this.r >= this.h.getDataModel().size())) {
      return;
    }
    Object localObject2 = b(this.m);
    String str1;
    label78:
    String str2;
    label91:
    String str3;
    label106:
    String str4;
    label121:
    String str5;
    label136:
    String str6;
    if (((Hashtable)localObject2).get("1036") == null)
    {
      localObject1 = "";
      if (((Hashtable)localObject2).get("1037") != null) {
        break label287;
      }
      str1 = "";
      if (((Hashtable)localObject2).get("1026") != null) {
        break label302;
      }
      str2 = "";
      if (((Hashtable)localObject2).get("1042") != null) {
        break label316;
      }
      str3 = "";
      if (((Hashtable)localObject2).get("1019") != null) {
        break label332;
      }
      str4 = "";
      if (((Hashtable)localObject2).get("1003") != null) {
        break label348;
      }
      str5 = "";
      if (((Hashtable)localObject2).get("1800") != null) {
        break label364;
      }
      str6 = "";
      label151:
      if (((Hashtable)localObject2).get("1021") != null) {
        break label380;
      }
      localObject2 = "";
      label166:
      this.c = 1;
      if (this.s != 12180) {
        break label396;
      }
    }
    label287:
    label302:
    label316:
    label332:
    label348:
    label364:
    label380:
    label396:
    for (Object localObject1 = o.g("12182").a("1036", (String)localObject1).a("1042", str3).a("1019", str4).a("1021", (String)localObject2).a("1800", str6);; localObject1 = o.g("12136").a("1212", "1").a("1036", (String)localObject1).a("1037", str1).a("1026", str2).a("1042", str3).a("1019", str4).a("1003", str5).a("1800", str6))
    {
      this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject1).h()) });
      registRequestListener(this.u);
      a(this.u, true);
      return;
      localObject1 = (String)((Hashtable)localObject2).get("1036");
      break;
      str1 = (String)((Hashtable)localObject2).get("1037");
      break label78;
      str2 = (String)((Hashtable)localObject2).get("1026");
      break label91;
      str3 = (String)((Hashtable)localObject2).get("1042");
      break label106;
      str4 = (String)((Hashtable)localObject2).get("1019");
      break label121;
      str5 = (String)((Hashtable)localObject2).get("1003");
      break label136;
      str6 = (String)((Hashtable)localObject2).get("1800");
      break label151;
      localObject2 = (String)((Hashtable)localObject2).get("1021");
      break label166;
    }
  }
  
  public void b()
  {
    this.q = 0;
    this.p = 20;
    this.h.a();
    a(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    label346:
    do
    {
      do
      {
        return;
        if (paramh == this.t)
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
            ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            this.o = ((com.android.dazhihui.ui.delegate.b.h)localObject).b("1289");
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
                    break label346;
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
              a((com.android.dazhihui.ui.delegate.b.h)localObject, this.q);
              this.h.a(localArrayList, this.q);
            }
          }
        }
      } while (paramh != this.u);
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
    this.n = paramLayoutInflater.inflate(2130903466, paramViewGroup, false);
    c();
    d();
    a(true);
    return this.n;
  }
  
  public void show()
  {
    super.show();
    if (this.h != null) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */