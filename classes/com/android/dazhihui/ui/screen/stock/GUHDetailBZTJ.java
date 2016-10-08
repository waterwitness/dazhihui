package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.ComentHideField;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.Attr;
import com.android.dazhihui.ui.model.stock.NewsContentVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CommentViewBZTJ;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import com.android.dazhihui.ui.widget.PopupMenu;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.km;
import com.android.dazhihui.ui.widget.kp;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import com.g.a.a.a.b.c;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GUHDetailBZTJ
  extends BaseActivity
  implements TextWatcher, View.OnClickListener
{
  private View A;
  private View B;
  private TextView C;
  private LinearLayout D;
  private LinearLayout E;
  private ImageView F;
  private ImageView G;
  private ImageView H;
  private ImageView I;
  private LinearLayout J;
  private km K;
  private kp L;
  private LinearLayout M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private TextView R;
  private JsonPLItem S;
  private String T = "";
  private ArrayList<JsonPLItem> U;
  private m V;
  private m W;
  private m X;
  private String Y = "";
  private JsonPLItem Z;
  protected String a;
  private JsonPLItem aa;
  private PopupWindow ab;
  private View ac;
  private PopupMenu ad;
  private View ae;
  private View af;
  private View ag;
  private View ah;
  private boolean ai = false;
  private String aj = "1";
  private LoadAndRefreshView ak;
  private PartScrollView al;
  private Handler am;
  private Boolean an;
  private RelativeLayout ao;
  private RelativeLayout ap;
  private com.android.dazhihui.c.a.d aq = com.android.dazhihui.c.a.d.a();
  private int ar = 0;
  private com.g.a.b.d as;
  private View.OnClickListener at = new ed(this);
  protected String b;
  AlertDialog c = null;
  AlertDialog d = null;
  private int e = 2;
  private Toast f;
  private PopupWindow g;
  private MyWebView h;
  private PageLoadTip i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private ImageView o;
  private View p;
  private TextView q;
  private View r;
  private View s;
  private TextView t;
  private TextView u;
  private TextView v;
  private EditText w;
  private Button x;
  private TextView y;
  private CommentViewBZTJ z;
  
  public static void a(EditText paramEditText)
  {
    paramEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0, 0, 0, 0, 6));
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    Object localObject1 = new q(paramArrayOfByte);
    int i1 = paramArrayOfByte.length;
    ((q)localObject1).b();
    paramArrayOfByte = new String(paramArrayOfByte, 1, i1 - 1);
    String str2;
    String str4;
    try
    {
      if (TextUtils.isEmpty(paramArrayOfByte)) {
        return;
      }
      localObject1 = new JSONArray(paramArrayOfByte).getJSONObject(0);
      paramArrayOfByte = new k();
      Object localObject2 = (JsonHeader)paramArrayOfByte.a(((JSONObject)localObject1).getJSONObject("header").toString(), JsonHeader.class);
      String str1 = ((JsonHeader)localObject2).getType();
      str2 = ((JsonHeader)localObject2).getError();
      String str3 = ((JsonHeader)localObject2).getService();
      str4 = ((JsonHeader)localObject2).getMsg();
      if ((str1 == null) || (str2 == null) || (str3 == null)) {
        return;
      }
      i1 = Integer.valueOf(str1).intValue();
      if ((113 != Integer.valueOf(str3).intValue()) || (("1".equals(str2)) && (i1 == 4))) {
        return;
      }
      if (i1 == 4)
      {
        this.aj = ((JsonHeader)localObject2).getNext();
        localObject1 = ((JSONObject)localObject1).getJSONArray("data");
        System.out.println("jsonData = " + localObject1);
        this.U = ((ArrayList)paramArrayOfByte.a(((JSONArray)localObject1).toString(), new eo(this).getType()));
        if ((this.U != null) && (this.U.size() > 0))
        {
          this.Z = ((JsonPLItem)this.U.get(0));
          if ((oy.a != null) && (this.Z != null) && (oy.a.get(this.Z.getId()) != null) && (((Boolean)oy.a.get(this.Z.getId())).booleanValue()))
          {
            this.F.setEnabled(false);
            this.F.setImageResource(2130837556);
            this.t.setEnabled(false);
            paramArrayOfByte = getResources().getDrawable(2130837605);
            paramArrayOfByte.setBounds(0, 0, paramArrayOfByte.getIntrinsicWidth(), paramArrayOfByte.getIntrinsicHeight());
            this.t.setCompoundDrawables(paramArrayOfByte, null, null, null);
          }
        }
        a();
        this.z.setMainItem(this.Z);
        paramArrayOfByte = new ArrayList();
        if ((this.U == null) || (this.U.size() <= 1)) {
          return;
        }
        localObject1 = this.U.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (JsonPLItem)((Iterator)localObject1).next();
          if (localObject2 != this.Z) {
            paramArrayOfByte.add(localObject2);
          }
        }
      }
      if (i1 != 3) {
        break label683;
      }
    }
    catch (JSONException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return;
      this.z.setMainData(paramArrayOfByte);
      return;
    }
    catch (NumberFormatException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return;
    }
    if ("0".equals(str2))
    {
      a("点赞成功");
      this.F.setEnabled(false);
      this.F.setImageResource(2130837556);
      paramArrayOfByte = this.m.getText().toString();
      this.m.setText(Integer.parseInt(paramArrayOfByte) + 1 + "");
      this.m.setTextColor(Color.parseColor("#ff8208"));
      paramArrayOfByte = getResources().getDrawable(2130837605);
      paramArrayOfByte.setBounds(0, 0, paramArrayOfByte.getIntrinsicWidth(), paramArrayOfByte.getIntrinsicHeight());
      this.t.setCompoundDrawables(paramArrayOfByte, null, null, null);
      this.t.setEnabled(false);
      if ((oy.a != null) && (this.Z != null)) {
        oy.a.put(this.Z.getId(), Boolean.valueOf(true));
      }
    }
    else
    {
      if ("2".equals(str2))
      {
        a(this, 2);
        return;
      }
      a("点赞失败,请重试");
      return;
      label683:
      if (i1 == 5) {
        if ("0".equals(str2))
        {
          a("发表评论成功");
          b();
          this.w.setText("");
          this.z.a(this.aa);
          this.ao.setVisibility(4);
          paramArrayOfByte = this.y.getText().toString();
          this.y.setText(Integer.parseInt(paramArrayOfByte) + 1 + "");
          this.y.setTextColor(Color.parseColor("#ff8208"));
          if (("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解" != null) && (!"为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解".equals(""))) {
            c("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解");
          }
        }
        else
        {
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
          if ("2".equals(str2))
          {
            a(this, 1);
            this.w.setText("");
          }
        }
      }
    }
  }
  
  private void d()
  {
    if (this.ai) {
      return;
    }
    if (TextUtils.isEmpty(this.aj))
    {
      a("已加载到最后一页");
      return;
    }
    this.ai = true;
    x localx = new x(3005);
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (this.S != null) {
      localLinkedHashMap.put("data", new ComentHideField(4, this.S.getId(), this.aj));
    }
    for (;;)
    {
      localLinkedHashMap.put("header", new HeaderField(113));
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(localLinkedHashMap);
      localObject = ((k)localObject).a(localArrayList, new dx(this).getType());
      localx.b(2);
      localx.a(((String)localObject).getBytes());
      this.V = new m(localx);
      this.V.a(this);
      com.android.dazhihui.a.g.a().a(this.V);
      if ((this.i == null) || (!"1".equals(this.aj))) {
        break;
      }
      this.i.setVisibility(0);
      this.i.b();
      return;
      localLinkedHashMap.put("data", new ComentHideField(4, this.T, this.aj));
    }
  }
  
  private void d(String paramString)
  {
    this.i.a(paramString, new dw(this));
  }
  
  private String e(String paramString)
  {
    Object localObject = Base64.encodeToString(paramString.toLowerCase(Locale.getDefault()).getBytes(), 0).trim() + "UserCenter";
    paramString = "".getBytes();
    try
    {
      localObject = MessageDigest.getInstance("SHA-1").digest(((String)localObject).getBytes());
      paramString = (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localNoSuchAlgorithmException.printStackTrace();
      }
    }
    return ti.a(paramString).toLowerCase(Locale.getDefault());
  }
  
  public void a()
  {
    if ((this.Z == null) || (this.U == null)) {
      return;
    }
    label98:
    label162:
    label226:
    Object localObject;
    if (this.U.size() == 1)
    {
      this.ao.setVisibility(0);
      if ((this.Z.getGood() != null) && (!this.Z.getGood().equals("")) && (!this.Z.getGood().equals("0"))) {
        break label713;
      }
      this.m.setText("0");
      this.m.setTextColor(Color.parseColor("#757575"));
      if ((this.Z.getView() != null) && (!this.Z.getView().equals("")) && (!this.Z.getView().equals("0"))) {
        break label743;
      }
      this.n.setText("0");
      this.n.setTextColor(Color.parseColor("#757575"));
      if ((this.Z.getReply() != null) && (!this.Z.getReply().equals("")) && (!this.Z.getReply().equals("0"))) {
        break label773;
      }
      this.y.setText("0");
      this.y.setTextColor(Color.parseColor("#757575"));
      this.l.setText(this.Z.getIp());
      if (!com.g.a.b.g.a().b())
      {
        localObject = new com.g.a.b.j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
        com.g.a.b.g.a().a((com.g.a.b.h)localObject);
      }
      if ((this.ar != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label803;
      }
      label314:
      if ((this.Z.getTitle() == null) || (this.Z.getTitle().isEmpty())) {
        break label827;
      }
      this.k.setText(this.Z.getTitle());
    }
    for (;;)
    {
      try
      {
        Date localDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(this.Z.getOtime());
        localObject = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
        if (DateUtils.isToday(localDate.getTime())) {
          localObject = new SimpleDateFormat("今日 HH:mm", Locale.getDefault());
        }
        localObject = ((DateFormat)localObject).format(localDate);
        this.j.setText((CharSequence)localObject);
      }
      catch (ParseException localParseException)
      {
        label713:
        label743:
        label773:
        label803:
        label827:
        this.j.setText("");
        continue;
        this.p.setVisibility(8);
        continue;
        this.q.setVisibility(8);
        continue;
        if ((TextUtils.isEmpty(this.Z.attr.BZ)) || (!this.Z.attr.BZ.equals("2"))) {
          continue;
        }
        this.s.setVisibility(8);
        this.r.setVisibility(0);
        continue;
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        continue;
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        continue;
      }
      if (this.Z.attr == null) {
        continue;
      }
      if ((TextUtils.isEmpty(this.Z.attr.V)) || (!this.Z.attr.V.equals("1"))) {
        continue;
      }
      this.p.setVisibility(0);
      this.l.setTextColor(getResources().getColor(2131493412));
      if ((TextUtils.isEmpty(this.Z.attr.lvl)) || (this.Z.attr.lvl.equals("0"))) {
        continue;
      }
      this.q.setVisibility(0);
      this.q.setText("L" + this.Z.attr.lvl);
      if ((TextUtils.isEmpty(this.Z.attr.BZ)) || (!this.Z.attr.BZ.equals("1"))) {
        continue;
      }
      this.s.setVisibility(0);
      this.r.setVisibility(8);
      localObject = new NewsContentVo();
      ((NewsContentVo)localObject).setContent(this.Z.getContent());
      localObject = ((NewsContentVo)localObject).getContent(this.e);
      this.h.loadDataWithBaseURL("http://www.gw.com.cn/", (String)localObject, "text/html", "utf-8", "");
      if (this.i != null) {
        this.i.a();
      }
      this.h.requestLayout();
      this.h.postInvalidate();
      return;
      this.ao.setVisibility(4);
      break;
      this.m.setText(this.Z.getGood());
      this.m.setTextColor(Color.parseColor("#ff8208"));
      break label98;
      this.n.setText(this.Z.getView());
      this.n.setTextColor(Color.parseColor("#ff8208"));
      break label162;
      this.y.setText(this.Z.getReply());
      this.y.setTextColor(Color.parseColor("#ff8208"));
      break label226;
      com.g.a.b.g.a().a(this.Z.getAvatar(), this.o, this.as);
      break label314;
      this.k.setVisibility(8);
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131559222: 
      localObject = new BitmapDrawable(bb.a(this, false));
      bb.a(this).a("大智慧", (Drawable)localObject);
      n.a(this.a, 1391);
      return;
    case 2131559221: 
      if (!bb.a(this, "com.tencent.mm"))
      {
        Toast.makeText(this, "请先安装微信", 0).show();
        return;
      }
      localObject = ((BitmapDrawable)new BitmapDrawable(bb.a(this, false))).getBitmap();
      bb.a(this).a("", (Bitmap)localObject, true);
      n.a(this.a, 1390);
      return;
    }
    if (!bb.a(this, "com.tencent.mm"))
    {
      Toast.makeText(this, "请先安装微信", 0).show();
      return;
    }
    Object localObject = ((BitmapDrawable)new BitmapDrawable(bb.a(this, false))).getBitmap();
    bb.a(this).a("", (Bitmap)localObject, false);
    n.a(this.a, 1389);
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
      ee localee = new ee(this);
      ((Button)localObject).setOnClickListener(localee);
      localButton.setOnClickListener(localee);
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
  
  public void a(Context paramContext, String paramString)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903093, null);
    ((TextView)localView.findViewById(2131558565)).setText(paramString);
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new eg(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.d = paramContext.create();
    this.d.show();
  }
  
  public void a(EditText paramEditText, View paramView)
  {
    paramView = ((TextView)paramView).getText().toString();
    int i1 = paramEditText.getSelectionStart();
    paramEditText.getText().insert(i1, paramView);
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
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
    if (this.f != null) {
      this.f.setText(paramString);
    }
    for (;;)
    {
      this.f.show();
      return;
      this.f = Toast.makeText(this, paramString, 0);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    k localk = new r().a().b();
    if (!w.a().l())
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(5), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), paramString1, paramString2, "0", this.a));
      localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
      paramString1 = new ArrayList(1);
      paramString1.add(localLinkedHashMap);
      new dy(this).getType();
      paramString1 = localk.a(paramString1);
      paramString2 = new x(3005);
      paramString2.b(2);
      paramString2.a(paramString1.getBytes());
      this.W = new m(paramString2);
      this.W.a(this);
      com.android.dazhihui.a.g.a().a(this.W);
      b();
      return;
    }
    com.android.dazhihui.o.a().c(new dz(this, paramString1, paramString2, localk));
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void b()
  {
    if (this.g != null) {
      this.g.dismiss();
    }
  }
  
  public void b(int paramInt)
  {
    System.out.println("setBbsMenuGroupStatus type = " + paramInt);
    if (paramInt == 1)
    {
      a(Boolean.valueOf(false), this.w);
      this.M.setVisibility(8);
      this.J.setVisibility(8);
      this.H.setVisibility(0);
      this.G.setVisibility(8);
    }
    do
    {
      return;
      if (paramInt == 2)
      {
        this.H.setVisibility(0);
        this.G.setVisibility(8);
        this.M.setVisibility(8);
        this.J.setVisibility(8);
        a(Boolean.valueOf(true), this.w);
        return;
      }
      if (paramInt == 3)
      {
        this.J.setVisibility(8);
        this.E.setVisibility(4);
        this.M.setVisibility(4);
        a(Boolean.valueOf(false), this.w);
        this.H.setVisibility(8);
        this.G.setVisibility(0);
        this.am.sendEmptyMessageDelayed(222, 250L);
        return;
      }
    } while (paramInt != 4);
    a(Boolean.valueOf(false), this.w);
    this.M.setVisibility(8);
    if (this.K == null)
    {
      this.K = new km(this, this.J);
      this.K.a(this.L);
    }
    this.J.setVisibility(0);
  }
  
  public void b(String paramString)
  {
    if (!w.a().l())
    {
      this.X = oy.b(paramString, "0");
      this.X.a(this);
      com.android.dazhihui.a.g.a().a(this.X);
      return;
    }
    com.android.dazhihui.o.a().c(new eb(this, paramString));
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void c()
  {
    if (this.g == null)
    {
      this.g = new PopupWindow(this);
      View localView = getLayoutInflater().inflate(2130903373, null);
      this.w = ((EditText)localView.findViewById(2131558616));
      this.w.setHint("发表评论");
      this.x = ((Button)localView.findViewById(2131558617));
      this.x.setTextSize(2, 19.0F);
      this.x.setOnClickListener(new ec(this));
      this.g.setAnimationStyle(2131296258);
      this.g.setContentView(localView);
      this.g.setHeight(getResources().getDimensionPixelOffset(2131230834));
      this.g.setWidth(com.android.dazhihui.g.a().m());
      this.g.setBackgroundDrawable(new ColorDrawable());
      this.g.setFocusable(true);
      this.g.setSoftInputMode(16);
    }
    this.w.requestFocus();
    this.g.showAtLocation(findViewById(2131558584), 81, 0, 0);
  }
  
  public void c(String paramString)
  {
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    int i1 = locald.b("first_comment_cuccess", 0);
    locald.g();
    if (i1 == 0) {
      a(this, paramString);
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (eh.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.ap.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.ap.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    if ((paramh == this.V) || (paramh == this.X) || (paramh == this.W))
    {
      if (paramh == this.V) {
        this.ai = false;
      }
      paramh = ((com.android.dazhihui.a.b.o)paramj).h();
      if (paramh != null)
      {
        paramj = paramh.b;
        if ((paramh.a == 3005) && (paramj != null)) {
          a(paramj);
        }
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.V)
    {
      if ("1".equals(this.aj)) {
        d("数据请求超时,点击重新加载!");
      }
      this.ai = false;
    }
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.S = ((JsonPLItem)paramBundle.getSerializable("json"));
    this.T = paramBundle.getString("opid", "");
    this.a = paramBundle.getString("code");
    this.b = paramBundle.getString("name");
    this.an = Boolean.valueOf(paramBundle.getBoolean("isShowKeyboard", false));
    if ((TextUtils.isEmpty(this.a)) && (this.S != null))
    {
      this.a = this.S.getStockcode();
      if (TextUtils.isEmpty(this.a)) {
        a("股票代码为空");
      }
    }
    this.ar = this.aq.b("show_user_avatar_by_wifi", 0);
    this.as = new com.g.a.b.f().b(2130838099).c(2130838099).a(true).b(true).a();
    setContentView(2130903156);
    this.e = com.android.dazhihui.c.a.d.a().b("NewsFontSize", 2);
    this.ak = ((LoadAndRefreshView)findViewById(2131558779));
    this.ap = ((RelativeLayout)findViewById(2131558585));
    this.ak.a(false, true);
    this.ak.setOnFooterLoadListener(new dv(this));
    this.o = ((ImageView)findViewById(2131558707));
    this.o.setOnClickListener(this);
    this.l = ((TextView)findViewById(2131558709));
    this.l.setOnClickListener(this);
    this.m = ((TextView)findViewById(2131559209));
    this.n = ((TextView)findViewById(2131559211));
    this.y = ((TextView)findViewById(2131559216));
    this.z = ((CommentViewBZTJ)findViewById(2131558602));
    this.ac = findViewById(2131558584);
    this.k = ((TextView)findViewById(2131559212));
    this.h = ((MyWebView)findViewById(2131559213));
    this.i = ((PageLoadTip)findViewById(2131558603));
    this.j = ((TextView)findViewById(2131559207));
    this.p = findViewById(2131558708);
    this.q = ((TextView)findViewById(2131558711));
    this.r = findViewById(2131558712);
    this.s = findViewById(2131558713);
    this.h.setBackgroundColor(0);
    this.h.setWebViewLoadListener(new ef(this));
    this.ad = ((PopupMenu)findViewById(2131559218));
    this.ad.setClickOutClose(false);
    this.ae = findViewById(2131559223);
    this.ae.setOnClickListener(this);
    this.ah = findViewById(2131559220);
    this.ah.setOnClickListener(this);
    this.af = findViewById(2131559222);
    if ("app_dzh".equals("app_sb")) {
      this.af.setVisibility(8);
    }
    this.af.setOnClickListener(this);
    this.ag = findViewById(2131559221);
    this.ag.setOnClickListener(this);
    this.t = ((TextView)findViewById(2131558736));
    this.u = ((TextView)findViewById(2131558732));
    this.v = ((TextView)findViewById(2131559205));
    this.t.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.A = findViewById(2131558586);
    this.A.setOnClickListener(this);
    this.B = findViewById(2131559203);
    this.B.setOnClickListener(this);
    this.C = ((TextView)findViewById(2131558587));
    if (!TextUtils.isEmpty(this.b)) {
      this.C.setText(this.b + "吧");
    }
    this.D = ((LinearLayout)findViewById(2131558613));
    this.E = ((LinearLayout)findViewById(2131558614));
    this.F = ((ImageView)findViewById(2131558615));
    this.G = ((ImageView)findViewById(2131558594));
    this.H = ((ImageView)findViewById(2131558595));
    this.I = ((ImageView)findViewById(2131558592));
    this.J = ((LinearLayout)findViewById(2131560389));
    this.M = ((LinearLayout)findViewById(2131558606));
    this.N = ((TextView)findViewById(2131558607));
    this.O = ((TextView)findViewById(2131558608));
    this.P = ((TextView)findViewById(2131558609));
    this.Q = ((TextView)findViewById(2131558610));
    this.R = ((TextView)findViewById(2131558611));
    this.ao = ((RelativeLayout)findViewById(2131559217));
    this.w = ((EditText)findViewById(2131558616));
    this.w.setHint("发表评论(限140字以内)");
    this.x = ((Button)findViewById(2131558617));
    this.x.setTextSize(2, 19.0F);
    this.F.setOnClickListener(this);
    this.G.setOnClickListener(this);
    this.H.setOnClickListener(this);
    this.I.setOnClickListener(this);
    this.N.setOnClickListener(this);
    this.O.setOnClickListener(this);
    this.P.setOnClickListener(this);
    this.Q.setOnClickListener(this);
    this.R.setOnClickListener(this);
    this.x.setOnClickListener(this);
    this.ao.setOnClickListener(this);
    this.w.addTextChangedListener(this);
    this.w.setOnTouchListener(new ei(this));
    this.al = ((PartScrollView)findViewById(2131559206));
    this.al.setOnTouchListener(new ej(this));
    this.am = new ek(this);
    this.D.addOnLayoutChangeListener(new el(this));
    d();
    this.h.addOnLayoutChangeListener(new em(this));
    this.L = new en(this);
    changeLookFace(this.mLookFace);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.V)
    {
      if ("1".equals(this.aj)) {
        d("网络连接异常,请检查网络情况,然后点击重新加载!");
      }
      this.ai = false;
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131558707: 
    case 2131558709: 
    case 2131558736: 
    case 2131558732: 
    case 2131559205: 
    case 2131559220: 
    case 2131559221: 
    case 2131559222: 
    case 2131559223: 
    case 2131558586: 
    case 2131559203: 
    case 2131558617: 
    case 2131558615: 
      do
      {
        Object localObject1;
        do
        {
          do
          {
            do
            {
              do
              {
                return;
              } while ((this.Z == null) || (TextUtils.isEmpty(this.Z.getAuthorlink())));
              paramView = this.Z.getAuthorlink();
              localObject1 = new Intent();
              localObject2 = new Bundle();
              ((Bundle)localObject2).putString("nexturl", paramView);
              ((Intent)localObject1).putExtras((Bundle)localObject2);
              ((Intent)localObject1).setClass(this, BrowserActivity.class);
              startActivity((Intent)localObject1);
              return;
            } while (this.Z == null);
            b(this.Z.getId());
            return;
          } while (this.Z == null);
          this.Y = this.Z.getId();
          c();
          return;
          this.ad.b();
          return;
          this.ad.c();
          a(paramView.getId());
          return;
          b(1);
          finish();
          return;
          n.a(this.a, 20075);
          this.ad.b();
          return;
        } while (this.Z == null);
        this.Y = this.Z.getId();
        Object localObject2 = this.w.getText().toString();
        String str1 = com.android.dazhihui.g.a().v();
        String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        if (w.a().l())
        {
          localObject1 = w.a().g();
          paramView = (View)localObject1;
          if ("".equals(localObject1))
          {
            paramView = w.a().f();
            paramView = paramView.replace(paramView.subSequence(paramView.length() - 3, paramView.length()), "***");
          }
        }
        for (;;)
        {
          this.aa = new JsonPLItem("", paramView, (String)localObject2, str2, "0", str1, "1", new ArrayList());
          if (w.a().l())
          {
            paramView = e(w.a().f());
            paramView = String.format(com.android.dazhihui.a.f.k, new Object[] { paramView });
            this.aa.setAvatar(paramView);
          }
          if (!"".equals(localObject2)) {
            break;
          }
          Toast.makeText(this, 2131165948, 0).show();
          return;
          if ((str1 != null) && (str1.length() > 3)) {
            paramView = "android股友(" + str1.substring(str1.length() - 4) + ")";
          } else {
            paramView = "android股友(0000)";
          }
        }
        a(this.Y, (String)localObject2);
        a(Boolean.valueOf(false), this.w);
        return;
        n.a(this.a, 20076);
      } while (this.Z == null);
      b(this.Z.getId());
      return;
    case 2131558594: 
      b(2);
      return;
    case 2131558595: 
      b(3);
      return;
    case 2131558592: 
      n.a(this.a, 20089);
      b(4);
      return;
    case 2131558607: 
    case 2131558608: 
    case 2131558609: 
    case 2131558610: 
    case 2131558611: 
      n.a(this.a, 20077);
      a(this.w, paramView);
      return;
    }
    b(2);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    if (this.an.booleanValue()) {
      b(2);
    }
    super.onResume();
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      this.x.setTextColor(getResources().getColor(2131493017));
      this.x.setBackgroundResource(2130837557);
      return;
    }
    this.x.setTextColor(getResources().getColor(2131493018));
    this.x.setBackgroundResource(2130837560);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\GUHDetailBZTJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */