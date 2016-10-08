package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.adapter.PopupListAdpater;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DoubleDragTitle;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.PullDownView;
import com.android.dazhihui.ui.widget.VHDragListView;
import com.android.dazhihui.ui.widget.ay;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.ke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProfitExpectedScreen
  extends BaseActivity
  implements i, cs, ke
{
  private static String u = "http://mnews.gw.com.cn/wap";
  private static String[] v = { "/data/ipad/stock/list/1/0.json", "/data/ipad/stock/list/2/0.json", "/data/ipad/stock/list/3/0.json", "/data/ipad/stock/list/4/0.json", "/data/ipad/stock/list/5/0.json", "/data/ipad/stock/list/6/0.json" };
  private DzhHeader a;
  private String[] b = null;
  private VHDragListView c;
  private ay d;
  private DoubleDragTitle e;
  private PullDownView f;
  private List<HashMap<Integer, String>> g = new ArrayList();
  private String h;
  private String i;
  private int j = 7;
  private int k = 0;
  private int l = -1;
  private int m;
  private int n;
  private int o;
  private View p;
  private Handler q = new ot(this);
  private f r;
  private int[] s;
  private f t;
  
  private void a()
  {
    String str = u + v[this.k];
    this.r = new f();
    this.r.c(str);
    this.r.a(this);
    com.android.dazhihui.a.g.a().a(this.r);
  }
  
  private void a(String paramString)
  {
    this.t = new f();
    this.t.c(paramString);
    this.t.a(this);
    com.android.dazhihui.a.g.a().a(this.t);
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 2)
    {
      a();
      this.l = paramInt;
      return;
    }
    if (paramInt == 4)
    {
      if ((this.h != null) && (this.h.length() > 0))
      {
        a(this.h);
        this.l = paramInt;
        return;
      }
      this.l = -1;
      this.q.sendEmptyMessage(paramInt);
      Toast.makeText(this, 2131166362, 0).show();
      return;
    }
    this.q.sendEmptyMessage(paramInt);
    this.l = -1;
  }
  
  public void b(int paramInt)
  {
    this.k = paramInt;
    this.e.setTitleScale(this.k);
    a();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ox.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.p != null) {
          this.p.setBackgroundColor(getResources().getColor(2131493540));
        }
        if (this.d != null) {
          this.d.a(paramy);
        }
        if (this.c != null)
        {
          this.c.a(paramy);
          this.c.setDivider(new ColorDrawable(getResources().getColor(2131493545)));
          this.c.setDividerHeight(1);
        }
        if (this.e != null) {
          this.e.a(paramy);
        }
        if (this.f != null) {
          this.f.a(paramy);
        }
      } while (this.a == null);
      this.a.a(paramy);
      return;
      if (this.p != null) {
        this.p.setBackgroundColor(getResources().getColor(2131493603));
      }
      if (this.d != null) {
        this.d.a(paramy);
      }
      if (this.c != null)
      {
        this.c.a(paramy);
        this.c.setDivider(new ColorDrawable(getResources().getColor(2131493608)));
        this.c.setDividerHeight(1);
      }
      if (this.e != null) {
        this.e.a(paramy);
      }
      if (this.f != null) {
        this.f.a(paramy);
      }
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8776;
    paramct.d = paramContext.getResources().getString(2131165401);
    paramct.q = false;
    paramct.p = new ov(this);
    if ((this.b != null) && (this.b.length > 0))
    {
      paramct.i = new PopupListAdpater(paramContext, this.s, this.b);
      paramct.j = new ow(this);
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    int i3 = 0;
    if ((paramj instanceof com.android.dazhihui.a.b.g))
    {
      paramj = (com.android.dazhihui.a.b.g)paramj;
      if (paramh != null) {
        break label20;
      }
    }
    for (;;)
    {
      return;
      label20:
      if ((paramh != this.t) && (paramh != this.r)) {
        continue;
      }
      paramj = new String(paramj.a());
      try
      {
        Object localObject1 = new JSONObject(paramj);
        paramj = ((JSONObject)localObject1).getString("forecastYear");
        Object localObject2 = ((JSONObject)localObject1).getString("forecastNextYear");
        this.h = ((JSONObject)localObject1).getString("nextPage");
        this.i = ((JSONObject)localObject1).getString("upPage");
        this.e.a(paramj, (String)localObject2);
        paramj = ((JSONObject)localObject1).getJSONObject("docmap");
        this.m = paramj.getInt("allcount");
        this.n = paramj.getInt("pagesize");
        this.o = paramj.getInt("nowpage");
        int i1 = (this.o + 1) * this.n;
        if (i1 > this.m)
        {
          i1 = this.m;
          paramj = new StringBuilder().append("当前显示");
          int i2;
          if (this.o * this.n > this.m)
          {
            i2 = this.m;
            localObject2 = i2 + "条" + "(共" + this.m + "条)";
            if (!TextUtils.isEmpty(this.h)) {
              break label502;
            }
          }
          label502:
          for (paramj = "已经加载到最后一页(共" + this.m + "条)";; paramj = "查看" + (i1 - this.n + 1) + "~" + i1 + "(共" + this.m + "条)")
          {
            this.f.a((String)localObject2, paramj);
            paramj = ((JSONObject)localObject1).getJSONArray("stockList");
            localObject1 = new ArrayList();
            i1 = i3;
            while (i1 < paramj.length())
            {
              localObject2 = paramj.getJSONObject(i1);
              HashMap localHashMap = new HashMap();
              localHashMap.put(Integer.valueOf(0), ((JSONObject)localObject2).getString("stockname"));
              localHashMap.put(Integer.valueOf(1), ((JSONObject)localObject2).getString("stockcode"));
              localHashMap.put(Integer.valueOf(2), ((JSONObject)localObject2).getString("mgsyprice"));
              localHashMap.put(Integer.valueOf(3), ((JSONObject)localObject2).getString("stockbd"));
              localHashMap.put(Integer.valueOf(4), ((JSONObject)localObject2).getString("mgsypricenext"));
              localHashMap.put(Integer.valueOf(5), ((JSONObject)localObject2).getString("stocknextbd"));
              localHashMap.put(Integer.valueOf(6), ((JSONObject)localObject2).getString("forecastcount"));
              ((List)localObject1).add(localHashMap);
              i1 += 1;
            }
            i2 = this.o * this.n;
            break;
          }
          if (paramh == this.r) {
            this.g.clear();
          }
          this.g.addAll((Collection)localObject1);
          this.d.notifyDataSetChanged();
          if (this.l <= 0) {
            continue;
          }
          this.f.a(this.l);
          return;
        }
      }
      catch (Exception paramh)
      {
        for (;;)
        {
          paramh.printStackTrace();
        }
      }
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903377);
    this.p = findViewById(2131560215);
    this.b = getResources().getStringArray(2131361803);
    this.a = ((DzhHeader)findViewById(2131560216));
    n.a("", 1003);
    this.e = ((DoubleDragTitle)findViewById(2131560217));
    this.c = ((VHDragListView)findViewById(2131560219));
    this.d = new ay(this, 2130903567, this.j, this.g);
    this.c.setAdapter(this.d);
    this.c.setTitleContent(this.e);
    this.c.setOnItemClickListener(new ou(this));
    this.e.setListView(this.c);
    this.e.setTitleScale(this.k);
    this.f = ((PullDownView)findViewById(2131560218));
    this.f.setOnLoadListener(this);
    a();
    n.a("", 1090);
    this.s = new int[this.b.length];
    int i1 = 0;
    while (i1 < this.b.length)
    {
      this.s[i1] = i1;
      i1 += 1;
    }
    this.a.a(this, this);
    changeLookFace(this.mLookFace);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ProfitExpectedScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */