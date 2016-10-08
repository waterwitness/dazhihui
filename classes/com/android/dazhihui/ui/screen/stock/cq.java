package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CommentListView;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import com.android.dazhihui.ui.widget.am;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.jo;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cq
  extends e
  implements View.OnClickListener
{
  private boolean A = false;
  private boolean B = false;
  private boolean C = false;
  private String D = "";
  private JsonPLItem E;
  private String F = null;
  private String G = null;
  private String H = "1";
  private int I;
  private int J;
  private RelativeLayout K;
  private int L = -1;
  private boolean M = false;
  private View N;
  private View O;
  private jo P = new cr(this);
  protected String a;
  protected String b;
  AlertDialog c = null;
  private CommentListView d;
  private am e;
  private PartScrollView f;
  private TextView g;
  private PopupWindow h;
  private EditText i;
  private Button j;
  private Toast k;
  private LoadAndRefreshView l;
  private PageLoadTip m;
  private TextView n;
  private ImageView o;
  private JsonHeader p;
  private ArrayList<JsonPLItem> q = new ArrayList();
  private m r;
  private m s;
  private m t;
  private m u;
  private m v;
  private JsonPLItem w;
  private JsonPLItem x;
  private JsonPLItem.UtilsItem y;
  private List<JsonPLItem.UtilsItem> z;
  
  public static e a(String paramString1, String paramString2)
  {
    cq localcq = new cq();
    Bundle localBundle = new Bundle();
    localBundle.putString("code", paramString1);
    localBundle.putString("name", paramString2);
    localcq.setBundle(localBundle);
    return localcq;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (!isAdded()) {}
    String str2;
    label470:
    label481:
    label493:
    label799:
    do
    {
      int i1;
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              return;
              Object localObject1 = new q(paramArrayOfByte);
              i1 = paramArrayOfByte.length;
              ((q)localObject1).b();
              paramArrayOfByte = new String(paramArrayOfByte, 1, i1 - 1);
              Object localObject2;
              for (;;)
              {
                try
                {
                  if (TextUtils.isEmpty(paramArrayOfByte)) {
                    break;
                  }
                  localObject1 = new JSONArray(paramArrayOfByte).getJSONObject(0);
                  paramArrayOfByte = new k();
                  localObject2 = (JsonHeader)paramArrayOfByte.a(((JSONObject)localObject1).getJSONObject("header").toString(), JsonHeader.class);
                  String str1 = ((JsonHeader)localObject2).getType();
                  str2 = ((JsonHeader)localObject2).getError();
                  String str3 = ((JsonHeader)localObject2).getService();
                  if ((str1 == null) || (str2 == null) || (str3 == null)) {
                    break;
                  }
                  i1 = Integer.valueOf(str1).intValue();
                  if ((113 != Integer.valueOf(str3).intValue()) || (("1".equals(str2)) && ((i1 == 1) || (i1 == 0) || (i1 == 6)))) {
                    break;
                  }
                  if (i1 == 1)
                  {
                    paramArrayOfByte = (ArrayList)paramArrayOfByte.a(((JSONObject)localObject1).getJSONArray("data").toString(), new dd(this).getType());
                    this.e.a(paramArrayOfByte, this.E);
                    return;
                  }
                }
                catch (JSONException paramArrayOfByte)
                {
                  paramArrayOfByte.printStackTrace();
                  return;
                  if (i1 != 0) {
                    break label493;
                  }
                  if (this.q == null) {
                    this.q = new ArrayList();
                  }
                  this.p = ((JsonHeader)localObject2);
                  this.F = ((JsonHeader)localObject2).getNext();
                  this.G = ((JsonHeader)localObject2).getPrev();
                  localObject2 = ((JSONObject)localObject1).getJSONObject("data");
                  localObject1 = ((JSONObject)localObject2).getJSONArray("recent");
                  if (this.G == null)
                  {
                    localObject2 = ((JSONObject)localObject2).getJSONArray("hot");
                    if (localObject2 != null)
                    {
                      localObject2 = (ArrayList)paramArrayOfByte.a(((JSONArray)localObject2).toString(), new de(this).getType());
                      if ((localObject2 == null) || (((ArrayList)localObject2).size() <= 0)) {
                        break label470;
                      }
                      this.q.addAll((Collection)localObject2);
                      this.e.a(((ArrayList)localObject2).size());
                    }
                  }
                  paramArrayOfByte = (ArrayList)paramArrayOfByte.a(((JSONArray)localObject1).toString(), new df(this).getType());
                  if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
                    this.q.addAll(paramArrayOfByte);
                  }
                  if ((this.G != null) || ((this.q != null) && (this.q.size() != 0))) {
                    break label481;
                  }
                  this.g.setText(getString(2131166142));
                  this.g.setVisibility(0);
                  if (this.q == null) {
                    break;
                  }
                  this.e.a(this.q);
                  return;
                }
                catch (NumberFormatException paramArrayOfByte)
                {
                  paramArrayOfByte.printStackTrace();
                  return;
                }
                this.e.a(0);
                continue;
                this.g.setVisibility(8);
              }
              if (i1 != 6) {
                break;
              }
              if (this.q == null) {
                this.q = new ArrayList();
              }
              this.p = ((JsonHeader)localObject2);
              this.F = ((JsonHeader)localObject2).getNext();
              this.G = ((JsonHeader)localObject2).getPrev();
              localObject1 = ((JSONObject)localObject1).getJSONArray("data");
              if (localObject1 != null)
              {
                paramArrayOfByte = (ArrayList)paramArrayOfByte.a(((JSONArray)localObject1).toString(), new dg(this).getType());
                if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
                  this.q.addAll(paramArrayOfByte);
                }
              }
              if ((this.G == null) && ((this.q == null) || (this.q.size() == 0)))
              {
                this.g.setText("没有吧内热帖");
                this.g.setVisibility(0);
              }
              while (this.q != null)
              {
                this.e.a(this.q);
                return;
                this.g.setVisibility(8);
              }
            }
            if (i1 != 3) {
              break label799;
            }
            if (!"0".equals(str2)) {
              break;
            }
            a("点赞成功");
          } while ((this.v.j() == null) || (!(this.v.j() instanceof ps)));
          paramArrayOfByte = (ps)this.v.j();
          if (paramArrayOfByte.a != null)
          {
            oy.a.put(paramArrayOfByte.a, Boolean.valueOf(true));
            oy.b = oy.a.size();
          }
        } while (!paramArrayOfByte.b);
        this.e.b();
        return;
        if ("2".equals(str2))
        {
          a(getActivity(), 2);
          return;
        }
        a("点赞失败,请重试");
        return;
      } while (i1 != 2);
      if ("0".equals(str2))
      {
        a("发表评论成功");
        d();
        if (this.i != null) {
          this.i.setText("");
        }
        this.e.a(this.w);
        return;
      }
      if ("1".equals(str2))
      {
        a("发表评论失败,请重试");
        return;
      }
    } while (!"2".equals(str2));
    a(getActivity(), 2);
    this.i.setText("");
  }
  
  private void b(String paramString)
  {
    this.m.a(paramString, new cs(this));
  }
  
  private void e()
  {
    if ((this.C) || (this.p == null)) {
      return;
    }
    this.t = oy.a(Integer.parseInt(this.p.getNext()), this.a);
    this.t.a(this);
    com.android.dazhihui.a.g.a().a(this.t);
    this.C = true;
  }
  
  public void a()
  {
    if (this.e != null) {
      this.e.a();
    }
    if (this.n != null) {
      this.n.setVisibility(8);
    }
    if (this.o != null) {
      this.o.setVisibility(8);
    }
    if (this.q != null) {
      this.q.clear();
    }
  }
  
  public void a(Context paramContext, int paramInt)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903094, null);
    Object localObject = (TextView)localView.findViewById(2131558565);
    if (paramInt == 1) {
      ((TextView)localObject).setText("尊敬的用户需要登录后才能发言哦！");
    }
    for (;;)
    {
      localObject = (Button)localView.findViewById(2131558581);
      Button localButton = (Button)localView.findViewById(2131558820);
      cy localcy = new cy(this);
      ((Button)localObject).setOnClickListener(localcy);
      localButton.setOnClickListener(localcy);
      paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
      paramContext.setView(localView);
      this.c = paramContext.create();
      this.c.show();
      return;
      if (paramInt == 2) {
        ((TextView)localObject).setText("尊敬的用户需要登录后才能点赞哦！");
      }
    }
  }
  
  public void a(String paramString)
  {
    if (this.k != null) {
      this.k.setText(paramString);
    }
    for (;;)
    {
      this.k.show();
      return;
      this.k = Toast.makeText(getActivity(), paramString, 0);
    }
  }
  
  public void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem)
  {
    if (!w.a().l())
    {
      this.v = oy.b(paramString, "0");
      paramJsonPLItem = new ps();
      paramJsonPLItem.b = paramBoolean;
      paramJsonPLItem.a = paramString;
      this.v.a(paramJsonPLItem);
      this.v.a(this);
      com.android.dazhihui.a.g.a().a(this.v);
      return;
    }
    com.android.dazhihui.o.a().c(new cx(this, paramString, paramBoolean));
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.A = paramBoolean1;
    this.B = paramBoolean2;
    if (this.h == null)
    {
      this.h = new PopupWindow(getActivity());
      localObject = getActivity().getLayoutInflater().inflate(2130903373, null);
      this.i = ((EditText)((View)localObject).findViewById(2131558616));
      if (!this.A) {
        this.i.setHint("发表评论");
      }
      this.j = ((Button)((View)localObject).findViewById(2131558617));
      this.j.setTextSize(2, 19.0F);
      this.j.setOnClickListener(new ct(this));
      this.h.setAnimationStyle(2131296258);
      this.h.setContentView((View)localObject);
      this.h.setHeight(getResources().getDimensionPixelOffset(2131230834));
      this.h.setWidth(com.android.dazhihui.g.a().m());
      this.h.setBackgroundDrawable(new ColorDrawable());
      this.h.setFocusable(true);
      this.h.setSoftInputMode(16);
    }
    this.i.requestFocus();
    Object localObject = getActivity();
    if ((localObject != null) && ((localObject instanceof StockChartScreen)))
    {
      localObject = ((Activity)localObject).findViewById(Integer.MAX_VALUE);
      this.h.showAtLocation((View)localObject, 81, 0, 0);
    }
  }
  
  public void b()
  {
    c();
  }
  
  public void b(String paramString1, String paramString2)
  {
    k localk = new r().a().b();
    if (!w.a().l())
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), paramString1, paramString2, "0", this.a));
      localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
      paramString1 = new ArrayList(1);
      paramString1.add(localLinkedHashMap);
      new cu(this).getType();
      paramString1 = localk.a(paramString1);
      paramString2 = new x(3005);
      paramString2.b(2);
      paramString2.a(paramString1.getBytes());
      this.u = new m(paramString2);
      this.u.a(this);
      com.android.dazhihui.a.g.a().a(this.u);
      d();
      return;
    }
    com.android.dazhihui.o.a().c(new cv(this, paramString1, paramString2, localk));
  }
  
  public void c()
  {
    if ((this.e == null) || (this.C)) {}
    do
    {
      return;
      a();
      this.r = oy.a(1, this.a);
      this.r.a(this);
      com.android.dazhihui.a.g.a().a(this.r);
      this.C = true;
    } while (this.m == null);
    this.m.setVisibility(0);
    this.m.b();
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (cz.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.O == null);
      this.O.setBackgroundColor(getResources().getColor(2131493542));
      this.d.setBackgroundColor(getResources().getColor(2131493542));
      this.e.a(paramy);
      return;
    } while (this.O == null);
    this.O.setBackgroundColor(getResources().getColor(2131493605));
    this.d.setBackgroundColor(getResources().getColor(2131493605));
    this.e.a(paramy);
  }
  
  public void d()
  {
    if (this.h != null) {
      this.h.dismiss();
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramh == this.r) || (paramh == this.s) || (paramh == this.v) || (paramh == this.u) || (paramh == this.t))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if (paramj != null)
      {
        byte[] arrayOfByte = paramj.b;
        if ((paramj.a == 3005) && (arrayOfByte != null)) {
          a(arrayOfByte);
        }
      }
      if (paramh == this.r)
      {
        this.C = false;
        if (this.m != null) {
          this.m.a();
        }
      }
      if (paramh == this.t) {
        this.C = false;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.r)
    {
      this.C = false;
      b("数据请求超时,点击重新加载!");
    }
    if (paramh == this.t)
    {
      Log.i("GUH", "moreRequest handleTimeout");
      this.C = false;
    }
  }
  
  public void loadMoreData()
  {
    if (!this.C)
    {
      if ((this.p != null) && (this.p.getNext() != null) && (!"".equals(this.p.getNext())))
      {
        if (this.q != null) {
          this.q.clear();
        }
        e();
      }
    }
    else {
      return;
    }
    if (this.p == null)
    {
      c();
      return;
    }
    a("已加载到最后一页");
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.r)
    {
      this.C = false;
      b("网络连接异常,请检查网络情况,然后点击重新加载!");
    }
    if (paramh == this.t)
    {
      Log.i("GUH", "moreRequest netException");
      this.C = false;
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
        this.D = "";
      } while ((this.h != null) && (this.h.isShowing()));
      a(true, false);
      return;
      paramView.setVisibility(8);
    } while (this.f == null);
    this.f.scrollTo(0, 0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      setBundle(paramBundle);
    }
    paramBundle = getBundle();
    if (paramBundle != null)
    {
      this.a = paramBundle.getString("code");
      this.b = paramBundle.getString("name");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.O = paramLayoutInflater.inflate(2130903119, paramViewGroup, false);
    this.l = ((LoadAndRefreshView)this.O.findViewById(2131558601));
    this.N = this.O.findViewById(2131558932);
    this.K = ((RelativeLayout)this.O.findViewById(2131558931));
    this.g = ((TextView)this.O.findViewById(2131558605));
    this.d = ((CommentListView)this.O.findViewById(2131558602));
    this.d.setVerticalScrollBarEnabled(false);
    this.d.setOverScrollMode(2);
    this.d.setVerticalFadingEdgeEnabled(false);
    this.o = ((ImageView)this.O.findViewById(2131558938));
    this.m = ((PageLoadTip)this.O.findViewById(2131558603));
    this.n = ((TextView)this.O.findViewById(2131558705));
    this.J = getResources().getDimensionPixelSize(2131230773);
    this.l.a(true, true);
    this.l.setOnHeaderRefreshListener(new da(this));
    this.l.setOnFooterLoadListener(new db(this));
    this.o.setOnClickListener(this);
    if (this.q != null) {
      this.q.clear();
    }
    this.e = new am(getActivity(), this.a);
    this.d.setAdapter(this.e);
    this.e.a(new dc(this));
    c();
    n.a(this.a, 1180);
    changeLookFace(this.mLookFace);
    return this.O;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.e != null) && (oy.a.size() > oy.b))
    {
      this.e.b();
      oy.b = oy.a.size();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    getBundle();
  }
  
  public void refresh()
  {
    if (isVisible()) {}
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {
      b();
    }
  }
  
  public void show()
  {
    n.a(this.a, 1180);
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */