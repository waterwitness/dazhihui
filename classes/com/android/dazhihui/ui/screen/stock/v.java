package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem.ReplyItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.CommentListView;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.hv;
import com.android.dazhihui.ui.widget.km;
import com.android.dazhihui.ui.widget.kp;
import com.c.a.k;
import com.c.a.r;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class v
  extends e
  implements View.OnClickListener
{
  private JsonHeader A;
  private ArrayList<JsonMyTalkItem> B = new ArrayList();
  private m C;
  private m D;
  private m E;
  private m F;
  private m G;
  private JsonMyTalkItem H;
  private JsonMyTalkItem.ReplyItem I;
  private boolean J = false;
  private boolean K = false;
  private boolean L = false;
  private String M = "";
  private String N = null;
  private String O = null;
  private String P = "1";
  private int Q;
  private RelativeLayout R;
  private int S = -1;
  private boolean T = true;
  private View U;
  AlertDialog a = null;
  AlertDialog b = null;
  private int c;
  private LoadAndRefreshView d;
  private CommentListView e;
  private hv f;
  private LinearLayout g;
  private PopupWindow h;
  private EditText i;
  private Button j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private LinearLayout n;
  private km o;
  private kp p;
  private LinearLayout q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private Handler x;
  private Toast y;
  private PageLoadTip z;
  
  public static v a(int paramInt)
  {
    v localv = new v();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    localv.setArguments(localBundle);
    return localv;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (!isAdded()) {}
    label537:
    do
    {
      String str2;
      do
      {
        String str4;
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
                  JsonHeader localJsonHeader;
                  try
                  {
                    localObject = new q(paramArrayOfByte);
                    i1 = paramArrayOfByte.length;
                    ((q)localObject).b();
                    paramArrayOfByte = new String(paramArrayOfByte, 1, i1 - 1);
                    if (TextUtils.isEmpty(paramArrayOfByte)) {
                      continue;
                    }
                    localObject = new JSONArray(paramArrayOfByte).getJSONObject(0);
                    paramArrayOfByte = new k();
                    System.out.println("dataMap = " + localObject);
                    localJsonHeader = (JsonHeader)paramArrayOfByte.a(((JSONObject)localObject).getJSONObject("header").toString(), JsonHeader.class);
                    String str1 = localJsonHeader.getType();
                    str2 = localJsonHeader.getError();
                    String str3 = localJsonHeader.getService();
                    localJsonHeader.getSubtype();
                    str4 = localJsonHeader.getMsg();
                    if ((str1 == null) || (str2 == null) || (str3 == null)) {
                      continue;
                    }
                    i1 = Integer.valueOf(str1).intValue();
                    if (114 != Integer.valueOf(str3).intValue()) {
                      continue;
                    }
                    System.out.println("GUH_SERVICE_114");
                    if (i1 == 0)
                    {
                      System.out.println("MSG_TYPE_GUH_LOGIN");
                      return;
                    }
                  }
                  catch (Exception paramArrayOfByte)
                  {
                    paramArrayOfByte.printStackTrace();
                    return;
                  }
                  if (i1 != 7) {
                    break;
                  }
                  System.out.println("MSG_TYPE_GUH_MY_COMMENT");
                  if (this.B == null) {
                    this.B = new ArrayList();
                  }
                  this.A = localJsonHeader;
                  this.N = localJsonHeader.getNext();
                  this.O = localJsonHeader.getPrev();
                  Object localObject = ((JSONObject)localObject).getJSONArray("data");
                  System.out.println("data = " + ((JSONArray)localObject).toString());
                  paramArrayOfByte = (ArrayList)paramArrayOfByte.a(((JSONArray)localObject).toString(), new ak(this).getType());
                  if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
                    this.B.addAll(paramArrayOfByte);
                  }
                  if ((this.O == null) && ((this.B == null) || (this.B.size() == 0))) {
                    this.g.setVisibility(0);
                  }
                  while (this.B != null)
                  {
                    this.f.a(this.B);
                    return;
                    this.g.setVisibility(8);
                  }
                }
                if (i1 != 3) {
                  break label537;
                }
                if (!"0".equals(str2)) {
                  break;
                }
                a("点赞成功");
              } while ((this.G.j() == null) || (!(this.G.j() instanceof ps)));
              paramArrayOfByte = (ps)this.G.j();
              if (paramArrayOfByte.a != null)
              {
                oy.a.put(paramArrayOfByte.a, Boolean.valueOf(true));
                oy.b = oy.a.size();
              }
            } while (!paramArrayOfByte.b);
            this.f.b();
            return;
            if ("2".equals(str2))
            {
              a(getActivity(), 2);
              return;
            }
            a("点赞失败,请重试");
            return;
          } while (i1 != 2);
          System.out.println("评论回复结果");
          if (!"0".equals(str2)) {
            break;
          }
          a("发表评论成功");
          d();
          if (this.i != null) {
            this.i.setText("");
          }
        } while (("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解" == null) || ("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解".equals("")));
        b("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解");
        return;
        if ("1".equals(str2))
        {
          if ((str4 != null) && (!str4.equals("")))
          {
            a(str4);
            return;
          }
          a("发表评论失败,请重试");
          return;
        }
      } while (!"2".equals(str2));
      a(getActivity(), 1);
    } while (this.i == null);
    this.i.setText("");
  }
  
  private void c(String paramString)
  {
    this.z.a(paramString, new al(this));
  }
  
  private void e()
  {
    int i1 = 0;
    if ((this.L) || (this.A == null)) {
      return;
    }
    if (1 == this.c) {}
    for (;;)
    {
      this.E = oy.a(com.android.dazhihui.w.a().o(), i1, Integer.parseInt(this.A.getNext()));
      this.E.a(this);
      com.android.dazhihui.a.g.a().a(this.E);
      this.L = true;
      return;
      if (2 == this.c) {
        i1 = 3;
      }
    }
  }
  
  public void a()
  {
    if (this.f != null) {
      this.f.a();
    }
    if (this.B != null) {
      this.B.clear();
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
      af localaf = new af(this);
      ((Button)localObject).setOnClickListener(localaf);
      localButton.setOnClickListener(localaf);
      paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
      paramContext.setView(localView);
      this.a = paramContext.create();
      this.a.show();
      return;
      if (paramInt == 2) {
        ((TextView)localObject).setText("尊敬的用户需要登录后才能点赞哦！");
      }
    }
  }
  
  public void a(Context paramContext, String paramString)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903093, null);
    ((TextView)localView.findViewById(2131558565)).setText(paramString);
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new ag(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.b = paramContext.create();
    this.b.show();
  }
  
  public void a(EditText paramEditText, View paramView)
  {
    paramView = ((TextView)paramView).getText().toString();
    int i1 = paramEditText.getSelectionStart();
    paramEditText.getText().insert(i1, paramView);
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getActivity().getSystemService("input_method");
    if (paramBoolean.booleanValue())
    {
      paramView.requestFocus();
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    if (paramView == null)
    {
      localInputMethodManager.toggleSoftInput(1, 0);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void a(String paramString)
  {
    if (this.y != null) {
      this.y.setText(paramString);
    }
    for (;;)
    {
      this.y.show();
      return;
      this.y = Toast.makeText(getActivity(), paramString, 0);
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    k localk = new r().a().b();
    if (!com.android.dazhihui.w.a().l())
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), com.android.dazhihui.w.a().f(), com.android.dazhihui.w.a().g(), paramString1, paramString2, "0", paramString3));
      localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
      paramString1 = new ArrayList(1);
      paramString1.add(localLinkedHashMap);
      new ab(this).getType();
      paramString1 = localk.a(paramString1);
      paramString2 = new com.android.dazhihui.a.b.x(3005);
      paramString2.b(2);
      paramString2.a(paramString1.getBytes());
      this.F = new m(paramString2);
      this.F.a(this);
      com.android.dazhihui.a.g.a().a(this.F);
      d();
      return;
    }
    com.android.dazhihui.o.a().c(new ac(this, paramString1, paramString2, paramString3, localk));
  }
  
  public void a(String paramString, boolean paramBoolean, JsonMyTalkItem paramJsonMyTalkItem, JsonMyTalkItem.ReplyItem paramReplyItem)
  {
    if (!com.android.dazhihui.w.a().l())
    {
      this.G = oy.c(paramString, "0");
      paramJsonMyTalkItem = new ps();
      paramJsonMyTalkItem.b = paramBoolean;
      paramJsonMyTalkItem.a = paramString;
      this.G.a(paramJsonMyTalkItem);
      this.G.a(this);
      com.android.dazhihui.a.g.a().a(this.G);
      return;
    }
    com.android.dazhihui.o.a().c(new ae(this, paramString, paramBoolean));
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.J = paramBoolean1;
    this.K = paramBoolean2;
    Object localObject;
    if (this.h == null)
    {
      this.h = new PopupWindow(getActivity());
      localObject = getActivity().getLayoutInflater().inflate(2130903057, null);
      this.i = ((EditText)((View)localObject).findViewById(2131558616));
      this.j = ((Button)((View)localObject).findViewById(2131558617));
      this.j.setTextSize(2, 19.0F);
      this.q = ((LinearLayout)((View)localObject).findViewById(2131558613));
      this.l = ((ImageView)((View)localObject).findViewById(2131558594));
      this.k = ((ImageView)((View)localObject).findViewById(2131558595));
      this.m = ((ImageView)((View)localObject).findViewById(2131558592));
      this.n = ((LinearLayout)((View)localObject).findViewById(2131560389));
      this.r = ((LinearLayout)((View)localObject).findViewById(2131558606));
      this.s = ((TextView)((View)localObject).findViewById(2131558607));
      this.t = ((TextView)((View)localObject).findViewById(2131558608));
      this.u = ((TextView)((View)localObject).findViewById(2131558609));
      this.v = ((TextView)((View)localObject).findViewById(2131558610));
      this.w = ((TextView)((View)localObject).findViewById(2131558611));
      am localam = new am(this);
      this.p = new x(this);
      this.j.setOnClickListener(localam);
      this.l.setOnClickListener(localam);
      this.k.setOnClickListener(localam);
      this.m.setOnClickListener(localam);
      this.s.setOnClickListener(localam);
      this.t.setOnClickListener(localam);
      this.u.setOnClickListener(localam);
      this.v.setOnClickListener(localam);
      this.w.setOnClickListener(localam);
      this.i.setOnTouchListener(new y(this));
      this.i.addTextChangedListener(new z(this));
      this.h.setAnimationStyle(2131296258);
      this.h.setContentView((View)localObject);
      this.h.setHeight(-2);
      this.h.setWidth(com.android.dazhihui.g.a().m());
      this.h.setBackgroundDrawable(new ColorDrawable());
      this.h.setFocusable(true);
      this.h.setSoftInputMode(16);
      this.h.setOnDismissListener(new aa(this));
    }
    if (!this.J)
    {
      localObject = "";
      if ((!this.K) || (this.I == null)) {
        break label570;
      }
      localObject = this.I.getIp();
    }
    for (;;)
    {
      this.i.setHint("回复 " + (String)localObject + ":");
      this.i.requestFocus();
      localObject = getActivity().findViewById(2131558584);
      this.h.showAtLocation((View)localObject, 81, 0, 0);
      this.x.sendEmptyMessageDelayed(333, 150L);
      return;
      label570:
      if (this.H != null) {
        localObject = this.H.getIp();
      }
    }
  }
  
  public void b()
  {
    c();
  }
  
  public void b(int paramInt)
  {
    System.out.println("setBbsMenuGroupStatus type = " + paramInt);
    if (paramInt == 1)
    {
      a(Boolean.valueOf(false), null);
      this.r.setVisibility(8);
      this.n.setVisibility(8);
      return;
    }
    if (paramInt == 2)
    {
      if (this.l.getVisibility() != 0) {
        break label281;
      }
      this.q.setVisibility(8);
    }
    label281:
    for (paramInt = 1;; paramInt = 0)
    {
      this.r.setVisibility(8);
      this.n.setVisibility(8);
      this.l.setVisibility(8);
      this.k.setVisibility(0);
      a(Boolean.valueOf(true), this.i);
      if (paramInt != 1) {
        break;
      }
      this.x.sendEmptyMessageDelayed(111, 100L);
      return;
      if (paramInt == 3)
      {
        a(Boolean.valueOf(false), this.i);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
        this.l.setVisibility(0);
        this.x.sendEmptyMessageDelayed(222, 200L);
        return;
      }
      if (paramInt != 4) {
        break;
      }
      a(Boolean.valueOf(false), this.i);
      this.r.setVisibility(8);
      if (this.o == null)
      {
        this.o = new km(getActivity(), this.n);
        this.o.a(this.p);
      }
      this.n.setVisibility(0);
      return;
    }
  }
  
  public void b(String paramString)
  {
    d locald = d.a();
    int i1 = locald.b("first_comment_cuccess", 0);
    locald.g();
    if (i1 == 0) {
      a(getActivity(), paramString);
    }
  }
  
  public void c()
  {
    if ((this.f == null) || (this.L)) {
      return;
    }
    a();
    int i1;
    if (com.android.dazhihui.w.a().l()) {
      if (1 == this.c) {
        i1 = 0;
      }
    }
    for (;;)
    {
      this.C = oy.a(com.android.dazhihui.w.a().o(), i1, 1);
      this.C.a(this);
      com.android.dazhihui.a.g.a().a(this.C);
      this.L = true;
      if (this.z == null) {
        break;
      }
      this.z.setVisibility(0);
      this.z.b();
      return;
      if (2 == this.c)
      {
        i1 = 3;
        continue;
        System.out.println("未登录");
      }
      else
      {
        i1 = 0;
      }
    }
  }
  
  public void d()
  {
    if (this.h != null) {
      this.h.dismiss();
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    byte[] arrayOfByte;
    if ((paramh == this.C) || (paramh == this.D) || (paramh == this.G) || (paramh == this.F) || (paramh == this.E))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if (paramj != null)
      {
        arrayOfByte = paramj.b;
        if (paramj.a != 2960) {
          break label108;
        }
      }
    }
    for (;;)
    {
      if (paramh == this.C)
      {
        this.L = false;
        if (this.z != null) {
          this.z.a();
        }
      }
      if (paramh == this.E) {
        this.L = false;
      }
      return;
      label108:
      if ((paramj.a == 3005) && (arrayOfByte != null)) {
        a(arrayOfByte);
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.C)
    {
      this.L = false;
      c("数据请求超时,点击重新加载!");
    }
    if (paramh == this.E)
    {
      Log.i("GUH", "moreRequest handleTimeout");
      this.L = false;
    }
  }
  
  public void loadMoreData()
  {
    if (!this.L)
    {
      if ((this.A != null) && (this.A.getNext() != null) && (!"".equals(this.A.getNext())))
      {
        if (this.B != null) {
          this.B.clear();
        }
        e();
      }
    }
    else {
      return;
    }
    if (this.A == null)
    {
      c();
      return;
    }
    a("已加载到最后一页");
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.C)
    {
      this.L = false;
      c("网络连接异常,请检查网络情况,然后点击重新加载!");
    }
    if (paramh == this.E)
    {
      Log.i("GUH", "moreRequest netException");
      this.L = false;
    }
  }
  
  public void onClick(View paramView) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = getArguments().getInt("type");
    this.U = paramLayoutInflater.inflate(2130903055, paramViewGroup, false);
    new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(2131230824));
    this.d = ((LoadAndRefreshView)this.U.findViewById(2131558601));
    this.R = ((RelativeLayout)this.U.findViewById(2131558931));
    this.g = ((LinearLayout)this.U.findViewById(2131558604));
    this.e = ((CommentListView)this.U.findViewById(2131558602));
    this.e.setVerticalScrollBarEnabled(false);
    this.e.setOverScrollMode(2);
    this.e.setVerticalFadingEdgeEnabled(false);
    this.z = ((PageLoadTip)this.U.findViewById(2131558603));
    this.Q = getResources().getDimensionPixelSize(2131230773);
    this.d.a(true, true);
    this.d.setOnHeaderRefreshListener(new w(this));
    this.d.setOnFooterLoadListener(new ah(this));
    if (this.B != null) {
      this.B.clear();
    }
    this.f = new hv(getActivity(), this.c);
    this.e.setAdapter(this.f);
    this.f.a(new ai(this));
    if (this.T) {
      c();
    }
    this.x = new aj(this);
    return this.U;
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.f != null) && (oy.a.size() > oy.b))
    {
      this.f.b();
      oy.b = oy.a.size();
    }
    this.x.sendEmptyMessageDelayed(444, 1000L);
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
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */