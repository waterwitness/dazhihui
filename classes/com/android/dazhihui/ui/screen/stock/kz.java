package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.HotNewsVo;
import com.android.dazhihui.ui.model.stock.HotNewsVo.Data;
import com.android.dazhihui.ui.model.stock.NewsContentVo;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.NewsScrollView;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PopupMenu;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.im;
import com.android.dazhihui.ui.widget.km;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import com.tencent.avsdk.control.MyFavoriteManager;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class kz
  extends a
  implements View.OnClickListener
{
  private MyWebView A;
  private TextView B;
  private TextView C;
  private NewsContentVo D;
  private String E;
  private String F;
  private String G;
  private String H;
  private String I = null;
  private String J;
  private String K;
  private String L = null;
  private PageLoadTip M;
  private Vector<String> N = new Vector();
  private boolean O = true;
  private com.android.dazhihui.a.b.f P;
  private PopupMenu Q;
  private PopupMenu R;
  private View S;
  private View T;
  private View U;
  private View V;
  private View W;
  private View X;
  private String Y = "";
  private DzhHeader Z;
  FrameLayout a;
  public PopupMenu b;
  View c;
  View d;
  View e;
  View f;
  View g;
  NewsScrollView h;
  m i;
  TextView j;
  EditText k;
  m l;
  CheckBox m;
  LinearLayout n;
  km o;
  PopupWindow p;
  Bundle q;
  View r;
  Activity s;
  AdvertView t;
  im u = new lg(this);
  AlertDialog v = null;
  private int w = -1;
  private Animation x;
  private Animation y;
  private int z = 2;
  
  private View a(int paramInt)
  {
    return this.r.findViewById(paramInt);
  }
  
  public static kz a(Bundle paramBundle)
  {
    kz localkz = new kz();
    localkz.setArguments(paramBundle);
    return localkz;
  }
  
  private void a(ll paramll)
  {
    View localView = LayoutInflater.from(this.s).inflate(2130903313, null);
    GridView localGridView = (GridView)localView.findViewById(2131560018);
    localView.findViewById(2131560017).setVisibility(8);
    localView.findViewById(2131560019).setVisibility(0);
    localGridView.setNumColumns(1);
    localGridView.setAdapter(paramll);
    localGridView.setOnItemClickListener(paramll);
    this.p = new PopupWindow(localView);
    this.p.setOutsideTouchable(true);
    this.p.setFocusable(true);
    this.p.setBackgroundDrawable(new ColorDrawable(0));
    this.p.setWidth((int)(com.android.dazhihui.g.a().m() / 5 * 1.3D));
    this.p.setHeight(getResources().getDimensionPixelSize(2131230789));
  }
  
  private void a(String paramString1, String paramString2)
  {
    x localx = new x(3005);
    localx.b(2);
    localx.a(HotNewsVo.getRequest(paramString1, this.K, paramString2).getBytes());
    this.i = new m(localx);
    registRequestListener(this.i);
    sendRequest(this.i);
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), paramString1, paramString2, com.android.dazhihui.o.a().b(), paramString3));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1);
    paramString2 = new x(3005);
    paramString2.b(2);
    paramString2.a(paramString1.getBytes());
    this.l = new m(paramString2);
    registRequestListener(this.l);
    sendRequest(this.l);
  }
  
  private void b()
  {
    this.j = ((TextView)a(2131559632));
    this.t = ((AdvertView)a(2131559626));
    this.h = ((NewsScrollView)a(2131558651));
    this.x = AnimationUtils.loadAnimation(this.s.getApplicationContext(), 2130968610);
    this.y = AnimationUtils.loadAnimation(this.s.getApplicationContext(), 2130968611);
    this.h.setOnScrollChangedListener(new la(this));
    this.a = ((FrameLayout)a(2131559625));
    this.C = ((TextView)a(2131559212));
    this.A = ((MyWebView)a(2131559213));
    this.M = ((PageLoadTip)a(2131558603));
    this.B = ((TextView)a(2131559207));
    this.A.setBackgroundColor(0);
    this.Q = ((PopupMenu)a(2131559218));
    this.Q.setClickOutClose(false);
    this.X = a(2131559627);
    this.S = a(2131559223);
    this.S.setOnClickListener(this);
    this.V = a(2131559220);
    this.V.setOnClickListener(this);
    this.T = a(2131559222);
    this.T.setOnClickListener(this);
    if ("app_dzh".equals("app_sb")) {
      this.T.setVisibility(8);
    }
    this.U = a(2131559221);
    this.U.setOnClickListener(this);
    this.W = a(2131559455);
    this.W.setOnClickListener(this);
    this.R = ((PopupMenu)a(2131559636));
    this.R.setClickOutClose(true);
    a(2131559642).setOnClickListener(this);
    this.c = a(2131559637);
    this.c.setOnClickListener(this);
    this.d = a(2131559638);
    this.d.setOnClickListener(this);
    this.e = a(2131559639);
    this.e.setOnClickListener(this);
    this.f = a(2131559640);
    this.f.setOnClickListener(this);
    this.g = a(2131559641);
    this.g.setOnClickListener(this);
    if (this.z == 4)
    {
      this.c.setSelected(true);
      this.C.setTextSize(14.0F);
      this.B.setTextSize(10.0F);
      a(2131559634).setOnClickListener(this);
      a(2131559633).setOnClickListener(this);
      a(2131559629).setOnClickListener(this);
      a(2131559646).setOnClickListener(this);
      a(2131559644).setOnClickListener(this);
      a(2131559635).setOnClickListener(this);
      a(2131559630).setOnClickListener(this);
      this.n = ((LinearLayout)a(2131560389));
      this.m = ((CheckBox)a(2131559647));
      if (w.a().l()) {
        break label859;
      }
      this.m.setChecked(false);
    }
    for (;;)
    {
      this.k = ((EditText)a(2131559645));
      this.k.setOnTouchListener(new lb(this));
      this.b = ((PopupMenu)a(2131559643));
      this.b.setClickOutClose(true);
      this.b.setOnCloseListener(new lc(this));
      this.Z = ((DzhHeader)a(2131559624));
      this.Z.a(this.s, new ld(this));
      return;
      if (this.z == 3)
      {
        this.d.setSelected(true);
        this.C.setTextSize(16.0F);
        this.B.setTextSize(12.0F);
        break;
      }
      if (this.z == 2)
      {
        this.e.setSelected(true);
        this.C.setTextSize(20.0F);
        this.B.setTextSize(16.0F);
        break;
      }
      if (this.z == 1)
      {
        this.f.setSelected(true);
        this.C.setTextSize(22.0F);
        this.B.setTextSize(18.0F);
        break;
      }
      if (this.z != 0) {
        break;
      }
      this.g.setSelected(true);
      this.C.setTextSize(26.0F);
      this.B.setTextSize(22.0F);
      break;
      label859:
      this.m.setChecked(true);
    }
  }
  
  private void c()
  {
    this.c.setSelected(false);
    this.d.setSelected(false);
    this.e.setSelected(false);
    this.f.setSelected(false);
    this.g.setSelected(false);
  }
  
  private void c(String paramString)
  {
    if (paramString.trim().equals("信息地雷")) {
      n.a("", 1123);
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramString.trim().equals("公司新闻(个股)"))
            {
              n.a("", 1072);
              return;
            }
            if (paramString.trim().equals("公司公告(个股)"))
            {
              n.a("", 1071);
              return;
            }
            if (paramString.trim().equals("研报(个股)"))
            {
              n.a("", 1124);
              return;
            }
            if (paramString.trim().equals(getResources().getString(2131166435)))
            {
              n.a("", 1113);
              return;
            }
            if (paramString.trim().equals(getResources().getString(2131166435)))
            {
              n.a("", 1117);
              return;
            }
            if (paramString.trim().equals(getResources().getString(2131166387)))
            {
              n.a("", 1114);
              return;
            }
            if (paramString.trim().equals(getResources().getString(2131166426)))
            {
              n.a("", 1115);
              return;
            }
            if (paramString.trim().equals(getResources().getString(2131166462)))
            {
              n.a("", 1118);
              return;
            }
          } while (paramString.trim().equals(getResources().getString(2131165539)));
          if (paramString.trim().equals(getResources().getString(2131166429)))
          {
            n.a("", 1119);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131165608)))
          {
            n.a("", 1091);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131165493)))
          {
            n.a("", 1116);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131166487)))
          {
            n.a("", 1093);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131165523)))
          {
            n.a("", 1072);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131166418)))
          {
            n.a("", 1095);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131165352)))
          {
            n.a("", 1096);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131165522)))
          {
            n.a("", 1071);
            return;
          }
          if (paramString.trim().equals(getResources().getString(2131166268)))
          {
            n.a("", 1064);
            return;
          }
        } while (paramString.trim().equals(getResources().getString(2131165539)));
        if (paramString.trim().equals(getResources().getString(2131166478)))
        {
          n.a("", 1100);
          return;
        }
        if (paramString.trim().equals(getResources().getString(2131165519)))
        {
          n.a("", 1101);
          return;
        }
        if (paramString.trim().equals(getResources().getString(2131165507)))
        {
          n.a("", 1120);
          return;
        }
        if (paramString.trim().equals(getResources().getString(2131166267)))
        {
          n.a("", 1121);
          return;
        }
        if (paramString.trim().equals(getResources().getString(2131166026)))
        {
          n.a("", 1122);
          return;
        }
      } while ((paramString.trim().equals(getResources().getString(2131165609))) || (paramString.trim().equals(getResources().getString(2131166444))) || (paramString.trim().equals(getResources().getString(2131166490))) || (paramString.trim().equals(getResources().getString(2131166207))) || (paramString.trim().equals(getResources().getString(2131165607))) || (paramString.trim().equals(getResources().getString(2131165350))) || (paramString.trim().equals(getResources().getString(2131166453))) || (paramString.trim().equals(getResources().getString(2131165499))));
      if (paramString.trim().equals(getResources().getString(2131165504)))
      {
        n.a("", 1072);
        return;
      }
      if (paramString.trim().equals(getResources().getString(2131165506)))
      {
        n.a("", 1124);
        return;
      }
    } while (!paramString.trim().equals(getResources().getString(2131165503)));
    n.a("", 1071);
  }
  
  private void d(String paramString)
  {
    this.M.a(paramString, new li(this));
  }
  
  public void a()
  {
    if (this.D != null)
    {
      this.A.clearHistory();
      this.A.clearCache(true);
      this.A.clearView();
      String str = this.D.getContent(this.z);
      this.a.removeAllViews();
      MyWebView localMyWebView = this.A;
      localMyWebView.setFocusable(false);
      localMyWebView.setFocusableInTouchMode(false);
      if (this.t.b == 1) {
        this.t.setVisibility(4);
      }
      this.a.addView(localMyWebView, -1, -2);
      this.A = localMyWebView;
      this.A.setBackgroundColor(0);
      this.A.setLayerType(0, null);
      this.A.setWebViewLoadListener(this.u);
      this.A.loadDataWithBaseURL("http://www.gw.com.cn/", str, "text/html", "utf-8", "");
    }
  }
  
  public void a(Context paramContext, String paramString)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903093, null);
    ((TextView)localView.findViewById(2131558565)).setText(paramString);
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new lh(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.v = paramContext.create();
    this.v.show();
  }
  
  public void a(NewsContentVo paramNewsContentVo)
  {
    if (paramNewsContentVo == null) {
      return;
    }
    this.D = paramNewsContentVo;
    this.K = paramNewsContentVo.getTitle();
    this.q.putString("news_title", this.K);
    this.C.setText(paramNewsContentVo.getTitle());
    for (;;)
    {
      try
      {
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(paramNewsContentVo.getTime());
        localObject1 = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
        if (DateUtils.isToday(((Date)localObject2).getTime())) {
          localObject1 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        this.F = paramNewsContentVo.getSource();
        if ((this.F == null) || (this.F.equals(""))) {
          continue;
        }
        localObject1 = "来源:" + this.F + "  " + ((DateFormat)localObject1).format((Date)localObject2);
        this.B.setText((CharSequence)localObject1);
      }
      catch (ParseException localParseException)
      {
        Object localObject1;
        this.B.setText(paramNewsContentVo.getTime());
        continue;
        Object localObject2 = Pattern.compile("<img.*src=(.*?)[^>]*?>").matcher(paramNewsContentVo);
        ArrayList localArrayList = new ArrayList();
        if (!((Matcher)localObject2).find()) {
          continue;
        }
        Object localObject3 = ((Matcher)localObject2).group();
        localObject3 = Pattern.compile("http:\"?(.*?)(\"|>|\\s+)").matcher((CharSequence)localObject3);
        if (!((Matcher)localObject3).find()) {
          continue;
        }
        String str = ((Matcher)localObject3).group().substring(0, ((Matcher)localObject3).group().length() - 1);
        localArrayList.add(new lk(this, ((Matcher)localObject2).start() + "<img".length() + 1, "onclick=window.open(\"@img=" + str + "\") "));
        continue;
        continue;
        paramNewsContentVo = new StringBuilder(paramNewsContentVo);
        int i1 = localArrayList.size() - 1;
        if (i1 < 0) {
          continue;
        }
        paramNewsContentVo.insert(((lk)localArrayList.get(i1)).a, ((lk)localArrayList.get(i1)).b);
        i1 -= 1;
        continue;
        paramNewsContentVo = paramNewsContentVo.toString();
        this.A.setWebViewLoadListener(this.u);
        this.A.loadDataWithBaseURL("http://www.gw.com.cn/", paramNewsContentVo, "text/html", "utf-8", "");
      }
      paramNewsContentVo = paramNewsContentVo.getContent(this.z);
      this.A.setLayerType(0, null);
      localObject1 = Pattern.compile("href=\"@min=(\\w+)\"").matcher(paramNewsContentVo);
      if (!((Matcher)localObject1).find()) {
        continue;
      }
      localObject2 = ((Matcher)localObject1).group(1);
      if (!this.N.contains(localObject2))
      {
        this.N.add(localObject2);
        continue;
        localObject1 = ((DateFormat)localObject1).format((Date)localObject2);
      }
    }
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.s.getSystemService("input_method");
    if (paramBoolean.booleanValue())
    {
      paramView.requestFocus();
      localInputMethodManager.showSoftInput(paramView, 2);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public void a(String paramString)
  {
    this.M.b();
    this.P = new com.android.dazhihui.a.b.f();
    this.P.c(paramString);
    registRequestListener(this.P);
    sendRequest(this.P);
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
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (lj.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.Z == null);
      this.Z.a(paramy);
      return;
    } while (this.Z == null);
    this.Z.a(paramy);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.P)
    {
      this.M.a();
      paramh = ((com.android.dazhihui.a.b.g)paramj).a();
    }
    for (;;)
    {
      try
      {
        paramj = new NewsContentVo();
        paramj.decode(new JSONArray(new String(paramh, "UTF-8")).getJSONObject(0));
        a(paramj);
        return;
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        this.M.setPageError("数据解析异常!");
        return;
      }
      int i1;
      if (paramh == this.i)
      {
        paramh = (com.android.dazhihui.a.b.o)paramj;
        for (;;)
        {
          try
          {
            paramh = paramh.h().b;
            paramj = new q(paramh);
            i1 = (short)(paramh.length - 1);
            paramj.b();
            paramh = HotNewsVo.decode(new String(paramh, 1, i1));
            if ((paramh == null) || (paramh.data == null)) {
              break;
            }
            this.Y = paramh.data.id;
            if ((this.s instanceof NewsDetailInfo)) {
              ((NewsDetailInfo)this.s).a(this.Y);
            }
            if (paramh.data.reply <= 0) {
              break;
            }
            if (paramh.data.reply >= 1000)
            {
              this.j.setText("999+");
              this.j.setVisibility(0);
              return;
            }
          }
          catch (Exception paramh)
          {
            paramh.printStackTrace();
            return;
          }
          this.j.setText(String.valueOf(paramh.data.reply));
        }
      }
      if (paramh == this.l)
      {
        paramh = (com.android.dazhihui.a.b.o)paramj;
        try
        {
          paramh = paramh.h().b;
          paramj = new q(paramh);
          i1 = (short)(paramh.length - 1);
          paramj.b();
          paramh = new JSONArray(new String(paramh, 1, i1)).getJSONObject(0).getJSONObject("header");
          paramj = paramh.getString("error");
          if (paramj.equals("0"))
          {
            this.k.setText("");
            paramh.getString("msg");
            showShortToast("发表成功！");
            if (("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解" == null) || ("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解".equals(""))) {
              continue;
            }
            b("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解");
          }
        }
        catch (JSONException paramh)
        {
          paramh.printStackTrace();
          showShortToast("发表评论失败！");
          return;
        }
      }
    }
    if (paramj.equals("2"))
    {
      showShortToast("请先登录,登录后才能发表评论!");
      return;
    }
    paramh = paramh.getString("msg");
    if ((paramh != null) && (!paramh.equals("")))
    {
      showShortToast(paramh);
      return;
    }
    showShortToast("发表评论失败,请重试");
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.P) {
      d("数据请求超时,点击重新加载!");
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.P) {
      d("请求数据失败，点击重试!");
    }
  }
  
  public void onClick(View paramView)
  {
    String str = com.android.dazhihui.a.f.o + this.I;
    Object localObject;
    if (!TextUtils.isEmpty(this.L)) {
      localObject = com.android.dazhihui.a.f.o + this.I + "&advTypeShare=" + this.L;
    }
    switch (paramView.getId())
    {
    default: 
    case 2131559630: 
      do
      {
        return;
        localObject = str;
        break;
      } while (!(this.s instanceof NewsDetailInfo));
      n.a("", 20088);
      ((NewsDetailInfo)this.s).a(1);
      return;
    case 2131559635: 
      if (this.p == null)
      {
        localObject = new ArrayList();
        if ((this.O) && (this.N.size() > 0)) {
          ((List)localObject).add("相关个股");
        }
        ((List)localObject).add("问导师");
        a(new ll(this, this.s, (List)localObject));
      }
      this.p.showAsDropDown(paramView);
      return;
    case 2131559644: 
      n.a("", 20089);
      a(Boolean.valueOf(false), this.k);
      if (this.o == null)
      {
        this.o = new km(this.s, this.n);
        this.o.a(new lf(this));
      }
      this.n.setVisibility(0);
      return;
    case 2131559646: 
      if ((this.m.isChecked()) && (!w.a().l()))
      {
        showShortToast("请先登录,登录后才能发表评论!");
        return;
      }
      if (TextUtils.isEmpty(this.k.getText()))
      {
        showShortToast("评论内容不能为空!");
        return;
      }
      localObject = this.k.getText().toString();
      if (!TextUtils.isEmpty(this.Y))
      {
        if (TextUtils.isEmpty(this.J))
        {
          paramView = this.E;
          a(this.Y, (String)localObject, paramView);
          if (this.m.isChecked()) {
            if ((this.G == null) || (this.G.isEmpty())) {
              break label574;
            }
          }
        }
        for (paramView = this.G;; paramView = this.F)
        {
          bb.a(this.s).a(this.K, com.android.dazhihui.a.f.p, paramView, str, (String)localObject);
          this.b.c();
          return;
          paramView = this.J;
          break;
        }
      }
      showShortToast("发表评论异常,请稍后重试!");
      return;
    case 2131559629: 
      this.b.b();
      a(Boolean.valueOf(true), this.k);
      n.a("", 20087);
      return;
    case 2131559634: 
      this.Q.b();
      return;
    case 2131559633: 
      MyFavoriteManager.getInstance().addToMyFavorite(getActivity(), this.K, this.I, true);
      return;
    case 2131559642: 
      this.R.c();
      n.a("", 1335);
      return;
    case 2131559637: 
      this.z = 4;
      c();
      paramView.setSelected(true);
      d.a().a("NewsFontSize", this.z);
      d.a().g();
      a();
      this.C.setTextSize(14.0F);
      this.B.setTextSize(10.0F);
      return;
    case 2131559638: 
      this.z = 3;
      c();
      paramView.setSelected(true);
      d.a().a("NewsFontSize", this.z);
      d.a().g();
      a();
      this.C.setTextSize(16.0F);
      this.B.setTextSize(12.0F);
      return;
    case 2131559639: 
      this.z = 2;
      c();
      paramView.setSelected(true);
      d.a().a("NewsFontSize", this.z);
      d.a().g();
      a();
      this.C.setTextSize(20.0F);
      this.B.setTextSize(16.0F);
      return;
    case 2131559640: 
      this.z = 1;
      c();
      paramView.setSelected(true);
      d.a().a("NewsFontSize", this.z);
      d.a().g();
      a();
      this.C.setTextSize(22.0F);
      this.B.setTextSize(18.0F);
      return;
    case 2131559641: 
      this.z = 0;
      c();
      paramView.setSelected(true);
      d.a().a("NewsFontSize", this.z);
      a();
      this.C.setTextSize(26.0F);
      this.B.setTextSize(22.0F);
      return;
    case 2131559223: 
      this.Q.c();
      return;
    case 2131559220: 
      n.a(this.H, 1331);
      if ((this.G != null) && (!this.G.isEmpty())) {}
      for (paramView = this.G;; paramView = this.F)
      {
        System.out.println("shareUrl = " + (String)localObject);
        bb.a(this.s).a(this.K, com.android.dazhihui.a.f.p, paramView, (String)localObject, false);
        this.Q.c();
        return;
      }
    case 2131559222: 
      n.a(this.H, 1333);
      bb.a(this.s).a(this.K + "\n" + (String)localObject, null);
      this.Q.c();
      return;
    case 2131559221: 
      label574:
      n.a(this.H, 1332);
      if ((this.G != null) && (!this.G.isEmpty())) {}
      for (paramView = this.G;; paramView = this.F)
      {
        bb.a(this.s).a(this.K, com.android.dazhihui.a.f.p, paramView, (String)localObject, true);
        this.Q.c();
        return;
      }
    }
    if ((this.G != null) && (!this.G.isEmpty())) {}
    for (paramView = this.G;; paramView = this.F)
    {
      bb.a(this.s).a(this.K, com.android.dazhihui.a.f.p, paramView, str);
      this.Q.c();
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.q = getArguments();
    this.s = getActivity();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.r = paramLayoutInflater.inflate(2130903237, paramViewGroup, false);
    if (this.q != null)
    {
      this.I = this.q.getString("url");
      this.L = this.q.getString("advTypeShare", null);
      this.E = this.q.getString("title");
      this.K = this.q.getString("news_title");
      this.F = this.q.getString("source");
      this.G = this.q.getString("summary");
      this.J = this.q.getString("stock");
      this.O = this.q.getBoolean("isShowCorrelationStock", true);
      this.H = this.q.getString("newsId");
      if (this.H == null) {
        this.H = "";
      }
    }
    if ((this.E == null) || ("".equals(this.E.trim()))) {
      this.E = getResources().getString(2131166427);
    }
    this.z = d.a().b("NewsFontSize", 2);
    b();
    c(this.E.trim());
    a(this.I);
    paramLayoutInflater = this.F;
    if (TextUtils.isEmpty(this.F)) {
      paramLayoutInflater = this.E;
    }
    a(this.I, paramLayoutInflater);
    changeLookFace(this.mLookFace);
    return this.r;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */