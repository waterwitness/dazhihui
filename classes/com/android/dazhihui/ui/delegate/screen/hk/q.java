package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.ui.delegate.domain.HKStockCode;
import com.android.dazhihui.ui.delegate.screen.ad;
import java.util.ArrayList;
import java.util.Vector;

public class q
  extends ad
{
  private int c = -1;
  private ListView d;
  private DropDownTextView e = null;
  private ImageView f;
  private String[] g = { "名称", "委托时间", "价格", "状态", "委托", "成交", "买卖标志", "合同号", "代码" };
  private String[] h = { "1037", "1039", "1041", "1043", "1040", "1047", "1026", "1042", "1036", "1003" };
  private String[] i = { "名称", "委托时间", "价格", "状态", "委托", "成交", "买卖标志", "合同号", "代码" };
  private String[] j = { "1037", "1039", "1041", "1043", "1040", "1047", "1026", "1042", "1036", "1003" };
  private Vector<Integer> k;
  private Vector<String[]> l;
  private Vector<String[]> m;
  private Vector<Integer> n;
  private y o;
  private LayoutInflater p;
  private int q = -1;
  private SharedPreferences r = null;
  private View s;
  private ch t = null;
  private int u = 0;
  private m v = new r(this);
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.u x;
  
  private void a(int paramInt, String paramString)
  {
    if (this.l == null) {
      return;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.q = paramInt;
    paramString = "" + "委托编号:" + ((String[])this.l.get(paramInt))[7] + "\n";
    paramString = paramString + "证券代码:" + ((String[])this.l.get(paramInt))[8] + "\n";
    paramString = paramString + "证券名称:" + str + "\n";
    paramString = paramString + "委托价格:" + ((String[])this.l.get(paramInt))[2] + "\n";
    paramString = paramString + "委托数量:" + ((String[])this.l.get(paramInt))[4] + "\n";
    paramString = paramString + "已成数量:" + ((String[])this.l.get(paramInt))[5] + "\n";
    new AlertDialog.Builder(getActivity()).setTitle(2131165568).setMessage(paramString).setPositiveButton(2131165363, new u(this)).setNegativeButton(2131165331, new t(this)).show();
  }
  
  private void a(boolean paramBoolean)
  {
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15012").a("1206", this.m.size()).a("1277", 20).h()) });
    registRequestListener(this.w);
    a(this.w, paramBoolean);
  }
  
  private void c()
  {
    this.d = ((ListView)this.s.findViewById(2131558780));
    this.f = ((ImageView)this.s.findViewById(2131558778));
    this.e = ((DropDownTextView)this.s.findViewById(2131560781));
    this.e.setVisibility(0);
    this.d.setEmptyView(this.f);
    bk.a(bk.B, this.e, 0);
    this.e.setOnItemChangeListener(this.v);
  }
  
  private void c(int paramInt)
  {
    if (this.l == null) {
      return;
    }
    String str = ((String[])this.l.get(paramInt))[8];
    ArrayList localArrayList = new ArrayList();
    HKStockCode localHKStockCode = new HKStockCode();
    localHKStockCode.setCode(str);
    localArrayList.add(localHKStockCode);
    this.t.b();
    this.c = 2;
    this.t.a(localArrayList, new w(this, paramInt), true);
  }
  
  private void c(String paramString)
  {
    getActivity().runOnUiThread(new x(this, paramString));
  }
  
  private void d()
  {
    this.f.setVisibility(8);
    this.k = new Vector();
    this.n = new Vector();
    this.l = new Vector();
    this.m = new Vector();
    this.p = LayoutInflater.from(getActivity());
    this.o = new y(this);
    this.d.addFooterView(this.o.a());
    this.d.setAdapter(this.o);
    this.t = new ch(this);
    this.d.setOnScrollListener(new s(this));
    this.r = PreferenceManager.getDefaultSharedPreferences(getActivity());
  }
  
  private void e()
  {
    if ((this.l == null) || (this.q == -1)) {
      return;
    }
    this.c = 1;
    this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15008").a("1042", ((String[])this.l.get(this.q))[7]).h()) });
    registRequestListener(this.x);
    a(this.x, true);
  }
  
  public void b()
  {
    this.k.removeAllElements();
    this.n.removeAllElements();
    this.l.removeAllElements();
    this.m.removeAllElements();
    this.o.a().setVisibility(0);
    a(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    label377:
    label472:
    do
    {
      do
      {
        return;
        Object localObject;
        if ((paramj instanceof com.android.dazhihui.a.b.o))
        {
          localObject = ((com.android.dazhihui.a.b.o)paramj).h();
          if (localObject != null) {
            this.t.a((p)localObject);
          }
        }
        if (paramh == this.w)
        {
          localObject = ((com.android.dazhihui.a.b.v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, getActivity()))
          {
            com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
            if (!localh.b())
            {
              paramh = Toast.makeText(getActivity(), localh.d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            int i4 = localh.g();
            int i1 = localh.b("1289");
            this.o.a(i1);
            if ((i4 == 0) && (this.l.size() == 0))
            {
              this.f.setVisibility(0);
              this.d.removeFooterView(this.o.a());
              return;
            }
            this.f.setVisibility(4);
            if (this.m.size() + i4 >= i1) {
              this.d.removeFooterView(this.o.a());
            }
            if (i4 > 0)
            {
              int i2 = 0;
              while (i2 < i4)
              {
                String[] arrayOfString2 = new String[this.h.length];
                String[] arrayOfString1 = new String[this.j.length];
                i1 = 0;
                if (i1 < this.h.length)
                {
                  if (localh.a(i2, this.h[i1]) == null) {}
                  for (localObject = "";; localObject = localh.a(i2, this.h[i1]))
                  {
                    arrayOfString2[i1] = localObject;
                    if ("1043".equals(this.h[i1])) {
                      arrayOfString2[i1] = bk.c(arrayOfString2[i1]);
                    }
                    i1 += 1;
                    break;
                  }
                }
                int i3 = 0;
                i1 = 0;
                if (i3 < this.j.length)
                {
                  if (localh.a(i2, this.j[i3]) == null)
                  {
                    localObject = "";
                    arrayOfString1[i3] = localObject;
                    if (this.j[i3].equals("1026")) {
                      if (!arrayOfString1[i3].equals("0")) {
                        break label472;
                      }
                    }
                  }
                  for (i1 = -65536;; i1 = -16776961)
                  {
                    if ("1043".equals(this.j[i3])) {
                      arrayOfString1[i3] = bk.c(arrayOfString1[i3]);
                    }
                    i3 += 1;
                    break;
                    localObject = localh.a(i2, this.j[i3]);
                    break label377;
                  }
                }
                this.m.add(arrayOfString1);
                this.n.add(new Integer(i1));
                i2 += 1;
              }
            }
            this.l = bk.b(this.m, this.h.length - 1, this.u);
            this.k = bk.b(this.m, this.n, this.h.length - 1, this.u);
            this.o.notifyDataSetInvalidated();
            if (this.l.size() == 0)
            {
              this.f.setVisibility(0);
              this.d.removeFooterView(this.o.a());
            }
          }
        }
      } while (paramh != this.x);
      paramh = ((com.android.dazhihui.a.b.v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
    this.c = -1;
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      if (paramh.a(0, "1043") == null)
      {
        paramh = "";
        if (!"".equals(bk.c(paramh))) {
          break label725;
        }
      }
      for (;;)
      {
        new AlertDialog.Builder(getActivity()).setMessage(paramh).setPositiveButton("确定", new v(this)).setCancelable(false).show();
        return;
        paramh = paramh.a(0, "1043");
        break;
        label725:
        paramh = bk.c(paramh);
      }
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
      continue;
      this.t.a();
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
      continue;
      this.t.a();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.s = paramLayoutInflater.inflate(2130903489, paramViewGroup, false);
    c();
    d();
    a(true);
    return this.s;
  }
  
  public void show()
  {
    super.show();
    if ((this.m != null) && (this.l != null) && (this.n != null) && (this.k != null)) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */