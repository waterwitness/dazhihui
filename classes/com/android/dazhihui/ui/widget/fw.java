package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.c;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Adv;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.AdvList;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Data;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Infos;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.c.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fw
  extends com.android.dazhihui.ui.widget.adv.a
{
  GroupAdvertVo a;
  c b = new fx(this);
  
  public fw(IndexTopWidget paramIndexTopWidget, int paramInt)
  {
    super(paramInt);
  }
  
  private void f()
  {
    if ((IndexTopWidget.b(this.c) != null) && (IndexTopWidget.c(this.c) != null)) {
      IndexTopWidget.c(this.c).removeRefresh(IndexTopWidget.b(this.c));
    }
  }
  
  private void g()
  {
    int i = 3000;
    Object localObject;
    int j;
    label363:
    GroupAdvertVo.AdvList localAdvList;
    if ((this.a.data.infos != null) && (this.a.data.infos.tradings != null) && (this.a.data.infos.tradings.size() > 0))
    {
      localObject = this.a.data.infos.tradings;
      this.c.a();
      IndexTopWidget.a(this.c, 2);
      IndexTopWidget.a(this.c, new String[((List)localObject).size()]);
      i = 0;
      while (i < ((List)localObject).size())
      {
        IndexTopWidget.d(this.c)[i] = ((String)((List)localObject).get(i));
        i += 1;
      }
      j = Integer.parseInt(this.a.data.infos.intervals) * 1000;
      i = j;
      if (j < 3000) {
        i = 3000;
      }
      IndexTopWidget.e(this.c).setVisibility(8);
      IndexTopWidget.f(this.c).setVisibility(0);
      IndexTopWidget.f(this.c).setOnClickListener(new fy(this));
      IndexTopWidget.a(this.c, new fz(this, i));
      IndexTopWidget.c(this.c).addRefresh(IndexTopWidget.b(this.c));
      if ((this.a != null) && (this.a.data != null) && (this.a.data.infos != null) && (this.a.data.infos.tradings != null) && (this.a.data.infos.tradings.size() > 0)) {
        if (!TextUtils.isEmpty(this.a.data.infos.countid)) {
          n.a(String.valueOf(this.d), Integer.parseInt(this.a.data.infos.countid));
        }
      }
    }
    else if ((this.a.data.adv != null) && (this.a.data.adv.advList != null) && (this.a.data.adv.advList.size() > 0))
    {
      this.c.a();
      IndexTopWidget.a(this.c, new ArrayList());
      localObject = this.a.data.adv.advList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localAdvList = (GroupAdvertVo.AdvList)((Iterator)localObject).next();
        IndexTopWidget.g(this.c).add(localAdvList);
      }
      IndexTopWidget.a(this.c, 3);
      localObject = IndexTopWidget.g(this.c).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localAdvList = (GroupAdvertVo.AdvList)((Iterator)localObject).next();
        if (localAdvList.type == 2) {
          IndexTopWidget.a(this.c, localAdvList.content);
        }
      }
      j = Integer.parseInt(this.a.data.adv.intervals) * 1000;
      if (j >= 3000) {
        break label823;
      }
    }
    for (;;)
    {
      IndexTopWidget.f(this.c).setVisibility(8);
      IndexTopWidget.e(this.c).setVisibility(0);
      IndexTopWidget.e(this.c).a(i);
      IndexTopWidget.h(this.c).notifyDataSetChanged();
      IndexTopWidget.e(this.c).setSelection(0);
      IndexTopWidget.e(this.c).requestLayout();
      IndexTopWidget.e(this.c).invalidate();
      if (IndexTopWidget.b().size() <= 0) {
        break;
      }
      IndexTopWidget.a(this.c);
      break;
      h();
      break;
      if ((this.a == null) || (this.a.data == null) || (this.a.data.adv == null) || (this.a.data.adv.advList == null) || (this.a.data.adv.advList.size() <= 0)) {
        break label363;
      }
      localObject = this.a.data.adv.advList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localAdvList = (GroupAdvertVo.AdvList)((Iterator)localObject).next();
        if (!TextUtils.isEmpty(localAdvList.countid)) {
          n.a(String.valueOf(this.d), Integer.parseInt(localAdvList.countid));
        }
      }
      break label363;
      label823:
      i = j;
    }
  }
  
  private void h()
  {
    this.c.a();
    IndexTopWidget.a(this.c, 1);
    int i = 0;
    while (i < IndexTopWidget.a.length)
    {
      IndexTopWidget.a(this.c, IndexTopWidget.a[i]);
      i += 1;
    }
    IndexTopWidget.e(this.c).setVisibility(0);
    IndexTopWidget.f(this.c).setVisibility(8);
    IndexTopWidget.e(this.c).a(IndexTopWidget.i(this.c));
    IndexTopWidget.h(this.c).notifyDataSetChanged();
    IndexTopWidget.a(this.c);
  }
  
  public void a()
  {
    com.android.dazhihui.ui.a.a.c().a(null);
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    g();
  }
  
  public void b()
  {
    e();
    com.android.dazhihui.ui.a.a.c().a(this.b);
    if ((this.a != null) && (this.a.data != null) && (this.a.data.infos != null) && (this.a.data.infos.tradings != null) && (this.a.data.infos.tradings.size() > 0)) {
      if (!TextUtils.isEmpty(this.a.data.infos.countid)) {
        n.a(String.valueOf(this.d), Integer.parseInt(this.a.data.infos.countid));
      }
    }
    for (;;)
    {
      return;
      if ((this.a != null) && (this.a.data != null) && (this.a.data.adv != null) && (this.a.data.adv.advList != null) && (this.a.data.adv.advList.size() > 0))
      {
        Iterator localIterator = this.a.data.adv.advList.iterator();
        while (localIterator.hasNext())
        {
          GroupAdvertVo.AdvList localAdvList = (GroupAdvertVo.AdvList)localIterator.next();
          if (!TextUtils.isEmpty(localAdvList.countid)) {
            n.a(String.valueOf(this.d), Integer.parseInt(localAdvList.countid));
          }
        }
      }
    }
  }
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    g();
  }
  
  public void c()
  {
    h();
  }
  
  public void d()
  {
    SharedPreferences localSharedPreferences = this.c.getContext().getSharedPreferences("GroupAdvertJson", 0);
    k localk = new k();
    localSharedPreferences.edit().putString("GroupAdvertJson", localk.a(this.a)).commit();
    f();
    this.c.a();
  }
  
  public void e()
  {
    GroupAdvertVo localGroupAdvertVo = com.android.dazhihui.ui.a.a.c().a();
    if (this.a == null) {
      if ((localGroupAdvertVo != null) && (!com.android.dazhihui.ui.a.a.b(localGroupAdvertVo)))
      {
        f();
        this.a = localGroupAdvertVo;
        a(null);
      }
    }
    while (this.a == localGroupAdvertVo) {
      return;
    }
    if (com.android.dazhihui.ui.a.a.b(localGroupAdvertVo))
    {
      f();
      c();
      this.a = null;
      return;
    }
    f();
    this.a = localGroupAdvertVo;
    b(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */