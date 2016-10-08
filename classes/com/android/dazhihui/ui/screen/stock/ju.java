package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.CheckBox;
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
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CommentListView;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.io;
import com.android.dazhihui.ui.widget.kp;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ju
  extends a
  implements View.OnClickListener
{
  private com.android.dazhihui.ui.widget.km A;
  private com.android.dazhihui.ui.widget.km B;
  private kp C;
  private LinearLayout D;
  private LinearLayout E;
  private TextView F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private Handler K;
  private Toast L;
  private LoadAndRefreshView M;
  private PageLoadTip N;
  private TextView O;
  private JsonHeader P;
  private ArrayList<JsonPLItem> Q = new ArrayList();
  private m R;
  private m S;
  private m T;
  private m U;
  private m V;
  private m W;
  private JsonPLItem X;
  private JsonPLItem Y;
  private JsonPLItem.UtilsItem Z;
  View a;
  private List<JsonPLItem.UtilsItem> aa;
  private boolean ab = false;
  private boolean ac = false;
  private boolean ad = false;
  private String ae = "";
  private JsonPLItem af;
  private String ag = null;
  private String ah = null;
  private String ai = "1";
  private int aj;
  private RelativeLayout ak;
  private int al = -1;
  private boolean am = false;
  private View an;
  private DzhHeader ao;
  private AbsListView.OnScrollListener ap = new jv(this);
  protected String b;
  EditText c;
  LinearLayout d;
  String e;
  String f;
  String g;
  String h;
  String i;
  CheckBox j;
  Bundle k;
  int l;
  View m;
  AlertDialog n = null;
  AlertDialog o = null;
  private CommentListView p;
  private io q;
  private PartScrollView r;
  private TextView s;
  private PopupWindow t;
  private EditText u;
  private Button v;
  private ImageView w;
  private ImageView x;
  private ImageView y;
  private LinearLayout z;
  
  public static e a(Bundle paramBundle)
  {
    ju localju = new ju();
    localju.setArguments(paramBundle);
    return localju;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (!isAdded()) {}
    label474:
    label607:
    do
    {
      String str3;
      do
      {
        String str1;
        do
        {
          int i1;
          do
          {
            do
            {
              do
              {
                return;
                Object localObject = new q(paramArrayOfByte);
                i1 = paramArrayOfByte.length;
                ((q)localObject).b();
                paramArrayOfByte = new String(paramArrayOfByte, 1, i1 - 1);
                for (;;)
                {
                  try
                  {
                    if (TextUtils.isEmpty(paramArrayOfByte)) {
                      break;
                    }
                    localJSONObject = new JSONArray(paramArrayOfByte).getJSONObject(0);
                    paramArrayOfByte = new k();
                    localJsonHeader = (JsonHeader)paramArrayOfByte.a(localJSONObject.getJSONObject("header").toString(), JsonHeader.class);
                    localObject = localJsonHeader.getType();
                    str3 = localJsonHeader.getError();
                    String str2 = localJsonHeader.getService();
                    str1 = localJsonHeader.getMsg();
                    if ((localObject == null) || (str3 == null) || (str2 == null)) {
                      break;
                    }
                    i1 = Integer.valueOf((String)localObject).intValue();
                    if ((114 != Integer.valueOf(str2).intValue()) || (("1".equals(str3)) && ((i1 == 1) || (i1 == 0)))) {
                      break;
                    }
                    if (i1 == 5)
                    {
                      paramArrayOfByte = (ArrayList)paramArrayOfByte.a(localJSONObject.getJSONArray("data").toString(), new jz(this).getType());
                      this.q.a(paramArrayOfByte, this.af);
                      return;
                    }
                  }
                  catch (JSONException paramArrayOfByte)
                  {
                    JSONObject localJSONObject;
                    JsonHeader localJsonHeader;
                    paramArrayOfByte.printStackTrace();
                    return;
                    if (i1 != 4) {
                      break label474;
                    }
                    if (this.Q == null) {
                      this.Q = new ArrayList();
                    }
                    this.P = localJsonHeader;
                    this.ag = localJsonHeader.getNext();
                    this.ah = localJsonHeader.getPrev();
                    localObject = localJSONObject.getJSONObject("data").getJSONArray("reply");
                    if ((this.ah == null) && (0 != 0)) {
                      throw new NullPointerException();
                    }
                    paramArrayOfByte = (ArrayList)paramArrayOfByte.a(((JSONArray)localObject).toString(), new kb(this).getType());
                    if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
                      this.Q.addAll(paramArrayOfByte);
                    }
                    if ((this.ah == null) && ((this.Q == null) || (this.Q.size() == 0)))
                    {
                      paramArrayOfByte = getResources().getDrawable(2130838489);
                      paramArrayOfByte.setBounds(0, 0, 480, 419);
                      this.s.setCompoundDrawables(null, paramArrayOfByte, null, null);
                      this.s.setText(getString(2131166142));
                      this.s.setGravity(17);
                      this.s.setVisibility(0);
                      if (this.Q == null) {
                        break;
                      }
                      this.q.a(this.Q);
                      return;
                    }
                  }
                  catch (NumberFormatException paramArrayOfByte)
                  {
                    paramArrayOfByte.printStackTrace();
                    return;
                  }
                  this.s.setVisibility(8);
                }
                if (i1 != 3) {
                  break label607;
                }
                if (!"0".equals(str3)) {
                  break;
                }
                b("点赞成功");
              } while ((this.W.j() == null) || (!(this.W.j() instanceof ps)));
              paramArrayOfByte = (ps)this.W.j();
              if (paramArrayOfByte.a != null)
              {
                oy.a.put(paramArrayOfByte.a, Boolean.valueOf(true));
                oy.b = oy.a.size();
              }
            } while (!paramArrayOfByte.b);
            this.q.b();
            return;
            if ("2".equals(str3))
            {
              a(getActivity(), 2);
              return;
            }
            b("点赞失败,请重试");
            return;
          } while (i1 != 2);
          if (!"0".equals(str3)) {
            break;
          }
          b("发表评论成功");
          e();
          a(Boolean.valueOf(false), this.c);
          if (this.u != null) {
            this.u.setText("");
          }
          this.c.setText("");
          this.s.setVisibility(8);
          this.q.a(this.X);
        } while (("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解" == null) || ("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解".equals("")));
        c("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解");
        return;
        if ("1".equals(str3))
        {
          if ((str1 != null) && (!str1.equals("")))
          {
            b(str1);
            return;
          }
          b("发表评论失败,请重试");
          return;
        }
      } while (!"2".equals(str3));
      a(getActivity(), 1);
    } while (this.u == null);
    this.u.setText("");
  }
  
  private void d(String paramString)
  {
    this.N.a(paramString, new kc(this));
  }
  
  private void f()
  {
    if ((!this.am) && (!TextUtils.isEmpty(this.b)))
    {
      this.am = true;
      d();
      c();
    }
  }
  
  private void g()
  {
    if ((this.ad) || (this.P == null)) {
      return;
    }
    this.U = oy.a(this.b, Integer.parseInt(this.P.getNext()));
    this.U.a(this);
    com.android.dazhihui.a.g.a().a(this.U);
    this.ad = true;
  }
  
  public void a()
  {
    if (this.q != null) {
      this.q.a();
    }
    if (this.O != null) {
      this.O.setVisibility(8);
    }
    if (this.Q != null) {
      this.Q.clear();
    }
  }
  
  public void a(int paramInt)
  {
    System.out.println("setBbsMenuGroupStatus type = " + paramInt);
    if (paramInt == 1)
    {
      a(Boolean.valueOf(false), null);
      this.E.setVisibility(8);
      this.z.setVisibility(8);
      return;
    }
    if (paramInt == 2)
    {
      if (this.x.getVisibility() != 0) {
        break label281;
      }
      this.D.setVisibility(8);
    }
    label281:
    for (paramInt = 1;; paramInt = 0)
    {
      this.E.setVisibility(8);
      this.z.setVisibility(8);
      this.x.setVisibility(8);
      this.w.setVisibility(0);
      a(Boolean.valueOf(true), this.u);
      if (paramInt != 1) {
        break;
      }
      this.K.sendEmptyMessageDelayed(111, 100L);
      return;
      if (paramInt == 3)
      {
        a(Boolean.valueOf(false), this.u);
        this.z.setVisibility(8);
        this.w.setVisibility(8);
        this.x.setVisibility(0);
        this.K.sendEmptyMessageDelayed(222, 200L);
        return;
      }
      if (paramInt != 4) {
        break;
      }
      a(Boolean.valueOf(false), this.u);
      this.E.setVisibility(8);
      if (this.A == null)
      {
        this.A = new com.android.dazhihui.ui.widget.km(getActivity(), this.z);
        this.A.a(this.C);
      }
      this.z.setVisibility(0);
      return;
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
      kn localkn = new kn(this);
      ((Button)localObject).setOnClickListener(localkn);
      localButton.setOnClickListener(localkn);
      paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
      paramContext.setView(localView);
      this.n = paramContext.create();
      this.n.show();
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
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new ko(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.o = paramContext.create();
    this.o.show();
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
    this.b = paramString;
    if ((isResumed()) && (getUserVisibleHint())) {
      f();
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    k localk = new r().a().b();
    if (!w.a().l())
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), paramString1, paramString2, "0", paramString3, ""));
      localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
      paramString1 = new ArrayList(1);
      paramString1.add(localLinkedHashMap);
      new kj(this).getType();
      paramString1 = localk.a(paramString1);
      paramString2 = new x(3005);
      paramString2.b(2);
      paramString2.a(paramString1.getBytes());
      this.V = new m(paramString2);
      this.V.a(this);
      com.android.dazhihui.a.g.a().a(this.V);
      e();
      return;
    }
    com.android.dazhihui.o.a().c(new kk(this, paramString1, paramString2, paramString3, localk));
  }
  
  public void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem)
  {
    if (!w.a().l())
    {
      this.W = oy.a(paramString, "0");
      paramJsonPLItem = new ps();
      paramJsonPLItem.b = paramBoolean;
      paramJsonPLItem.a = paramString;
      this.W.a(paramJsonPLItem);
      this.W.a(this);
      com.android.dazhihui.a.g.a().a(this.W);
      return;
    }
    com.android.dazhihui.o.a().c(new km(this, paramString, paramBoolean));
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d.setVisibility(8);
    this.a.setVisibility(8);
    this.ab = paramBoolean1;
    this.ac = paramBoolean2;
    Object localObject;
    if (this.t == null)
    {
      this.t = new PopupWindow(getActivity());
      localObject = getActivity().getLayoutInflater().inflate(2130903057, null);
      this.u = ((EditText)((View)localObject).findViewById(2131558616));
      this.v = ((Button)((View)localObject).findViewById(2131558617));
      this.v.setTextSize(2, 19.0F);
      this.D = ((LinearLayout)((View)localObject).findViewById(2131558613));
      this.x = ((ImageView)((View)localObject).findViewById(2131558594));
      this.w = ((ImageView)((View)localObject).findViewById(2131558595));
      this.y = ((ImageView)((View)localObject).findViewById(2131558592));
      this.z = ((LinearLayout)((View)localObject).findViewById(2131560389));
      this.E = ((LinearLayout)((View)localObject).findViewById(2131558606));
      this.F = ((TextView)((View)localObject).findViewById(2131558607));
      this.G = ((TextView)((View)localObject).findViewById(2131558608));
      this.H = ((TextView)((View)localObject).findViewById(2131558609));
      this.I = ((TextView)((View)localObject).findViewById(2131558610));
      this.J = ((TextView)((View)localObject).findViewById(2131558611));
      kd localkd = new kd(this);
      this.C = new kf(this);
      this.v.setOnClickListener(localkd);
      this.x.setOnClickListener(localkd);
      this.w.setOnClickListener(localkd);
      this.y.setOnClickListener(localkd);
      this.F.setOnClickListener(localkd);
      this.G.setOnClickListener(localkd);
      this.H.setOnClickListener(localkd);
      this.I.setOnClickListener(localkd);
      this.J.setOnClickListener(localkd);
      this.u.setOnTouchListener(new kg(this));
      this.u.addTextChangedListener(new kh(this));
      this.t.setAnimationStyle(2131296258);
      this.t.setContentView((View)localObject);
      this.t.setHeight(-2);
      this.t.setWidth(com.android.dazhihui.g.a().m());
      this.t.setBackgroundDrawable(new ColorDrawable());
      this.t.setFocusable(true);
      this.t.setSoftInputMode(16);
      this.t.setOnDismissListener(new ki(this));
    }
    if (!this.ab)
    {
      localObject = "";
      if ((!this.ac) || (this.Z == null)) {
        break label594;
      }
      localObject = this.Z.getIp();
    }
    for (;;)
    {
      this.u.setHint("回复 " + (String)localObject + ":");
      this.u.requestFocus();
      localObject = getActivity();
      if (localObject != null)
      {
        localObject = ((Activity)localObject).getWindow().getDecorView();
        this.t.showAtLocation((View)localObject, 81, 0, 0);
      }
      this.K.sendEmptyMessageDelayed(333, 150L);
      return;
      label594:
      if (this.Y != null) {
        localObject = this.Y.getIp();
      }
    }
  }
  
  public void b()
  {
    c();
  }
  
  public void b(String paramString)
  {
    if (this.L != null) {
      this.L.setText(paramString);
    }
    for (;;)
    {
      this.L.show();
      return;
      this.L = Toast.makeText(getActivity(), paramString, 0);
    }
  }
  
  public void c()
  {
    if ((this.q == null) || (this.ad)) {}
    do
    {
      return;
      a();
      this.S = oy.a(this.b);
      this.S.a(this);
      com.android.dazhihui.a.g.a().a(this.S);
      this.ad = true;
    } while (this.N == null);
    this.N.setVisibility(0);
    this.N.b();
  }
  
  public void c(String paramString)
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
      switch (kp.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.ao == null);
      this.ao.a(paramy);
      return;
    } while (this.ao == null);
    this.ao.a(paramy);
  }
  
  public void d()
  {
    if (w.a().l())
    {
      System.out.println("---sendRequest(mGuhLoginJsonRequest)");
      this.R = oy.d("", w.a().o());
      this.R.a(this);
      com.android.dazhihui.a.g.a().a(this.R);
    }
  }
  
  public void e()
  {
    if (this.t != null) {
      this.t.dismiss();
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramh == this.S) || (paramh == this.T) || (paramh == this.W) || (paramh == this.V) || (paramh == this.U) || (paramh == this.R))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if (paramj != null)
      {
        byte[] arrayOfByte = paramj.b;
        if ((paramj.a == 3005) && (arrayOfByte != null)) {
          a(arrayOfByte);
        }
      }
      if (paramh == this.S)
      {
        this.ad = false;
        if (this.N != null) {
          this.N.a();
        }
      }
      if (paramh == this.U) {
        this.ad = false;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.S)
    {
      this.ad = false;
      d("数据请求超时,点击重新加载!");
    }
    if (paramh == this.U)
    {
      Log.i("GUH", "moreRequest handleTimeout");
      this.ad = false;
    }
  }
  
  public void loadMoreData()
  {
    if (!this.ad)
    {
      if ((this.P != null) && (this.P.getNext() != null) && (!"".equals(this.P.getNext())))
      {
        if (this.Q != null) {
          this.Q.clear();
        }
        g();
      }
    }
    else {
      return;
    }
    if (this.P == null)
    {
      c();
      return;
    }
    b("已加载到最后一页");
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.S)
    {
      this.ad = false;
      d("网络连接异常,请检查网络情况,然后点击重新加载!");
    }
    if (paramh == this.U)
    {
      Log.i("GUH", "moreRequest netException");
      this.ad = false;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str1;
    String str2;
    String str3;
    Object localObject2;
    Object localObject1;
    if ((paramInt2 == -1) && (paramInt1 == 111))
    {
      System.out.println("requestCode == REQUEST_CODE_BBS_COMMENT_ACTIVITY");
      if (paramIntent != null)
      {
        str1 = paramIntent.getStringExtra("send_text");
        System.out.println("content = " + str1);
        str2 = com.android.dazhihui.g.a().v();
        str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        if (!w.a().l()) {
          break label234;
        }
        localObject2 = w.a().g();
        localObject1 = localObject2;
        if ("".equals(localObject2))
        {
          localObject1 = w.a().f();
          localObject1 = ((String)localObject1).replace(((String)localObject1).subSequence(((String)localObject1).length() - 3, ((String)localObject1).length()), "***");
        }
      }
    }
    for (;;)
    {
      localObject2 = new ArrayList();
      n.a(this.b, 1137);
      this.X = new JsonPLItem("", (String)localObject1, str1, str3, "0", str2, "1", (List)localObject2);
      this.ae = "";
      a(this.ae, str1, this.b);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label234:
      if ((str2 != null) && (str2.length() > 3)) {
        localObject1 = "android股友(" + str2.substring(str2.length() - 4) + ")";
      } else {
        localObject1 = "android股友(0000)";
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      paramView.setVisibility(8);
    } while (this.r == null);
    this.r.scrollTo(0, 0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.b = paramBundle.getString("code");
    }
    this.k = getArguments();
    this.e = this.k.getString("stock");
    this.i = this.k.getString("title");
    this.f = this.k.getString("url");
    this.g = this.k.getString("summary");
    this.h = this.k.getString("source");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.an = paramLayoutInflater.inflate(2130903341, paramViewGroup, false);
    this.an.postDelayed(new ke(this), 600L);
    this.m = this.an.findViewById(2131560100);
    this.m.getBackground().setAlpha(100);
    this.m.setOnClickListener(new kq(this));
    this.an.getViewTreeObserver().addOnGlobalLayoutListener(new kr(this));
    this.a = this.an.findViewById(2131560101);
    this.j = ((CheckBox)this.an.findViewById(2131559647));
    if (!w.a().l()) {
      this.j.setChecked(false);
    }
    for (;;)
    {
      this.an.findViewById(2131559644).setOnClickListener(new ks(this));
      this.d = ((LinearLayout)this.an.findViewById(2131560102));
      this.c = ((EditText)this.an.findViewById(2131559645));
      this.c.setOnTouchListener(new ku(this));
      this.an.findViewById(2131559646).setOnClickListener(new kv(this));
      this.ao = ((DzhHeader)this.an.findViewById(2131559624));
      this.ao.a(getActivity(), new kw(this));
      this.M = ((LoadAndRefreshView)this.an.findViewById(2131558601));
      this.ak = ((RelativeLayout)this.an.findViewById(2131558931));
      this.s = ((TextView)this.an.findViewById(2131558605));
      this.p = ((CommentListView)this.an.findViewById(2131558602));
      this.p.setVerticalScrollBarEnabled(false);
      this.p.setOverScrollMode(2);
      this.p.setVerticalFadingEdgeEnabled(false);
      this.N = ((PageLoadTip)this.an.findViewById(2131558603));
      this.O = ((TextView)this.an.findViewById(2131558705));
      this.aj = getResources().getDimensionPixelSize(2131230773);
      this.M.a(true, true);
      this.M.setOnHeaderRefreshListener(new ky(this));
      this.M.setOnFooterLoadListener(new jw(this));
      this.p.setOnScrollListener(this.ap);
      if (this.Q != null) {
        this.Q.clear();
      }
      this.q = new io(getActivity());
      this.p.setAdapter(this.q);
      this.q.a(new jx(this));
      this.K = new jy(this);
      n.a(this.b, 1180);
      changeLookFace(this.mLookFace);
      return this.an;
      this.j.setChecked(true);
    }
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if (!paramBoolean) {
      f();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.q != null) && (oy.a.size() > oy.b))
    {
      this.q.b();
      oy.b = oy.a.size();
    }
    this.K.sendEmptyMessageDelayed(444, 1000L);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putString("code", this.b);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void refresh()
  {
    if (isVisible()) {}
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {}
  }
  
  public void show()
  {
    n.a(this.b, 1180);
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */