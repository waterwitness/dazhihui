package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
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
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.CommentBodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonKanHaoKanKongItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CommentListView;
import com.android.dazhihui.ui.widget.EmojiInputView;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.ui.widget.dm;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class bs
  extends com.android.dazhihui.ui.screen.a
  implements View.OnClickListener, dm
{
  private m A;
  private m B;
  private JsonKanHaoKanKongItem C = new JsonKanHaoKanKongItem();
  private m D;
  private boolean E = false;
  private JsonPLItem F;
  private JsonPLItem G;
  private JsonPLItem.UtilsItem H;
  private List<JsonPLItem.UtilsItem> I;
  private boolean J = false;
  private boolean K = false;
  private boolean L = false;
  private String M = "";
  private JsonPLItem N;
  private String O = null;
  private String P = null;
  private String Q = "1";
  private int R;
  private RelativeLayout S;
  private int T = -1;
  private PopupWindow U;
  private EmojiInputView V;
  private EmojiInputView W;
  private Animation X;
  private Animation Y;
  private TextView Z;
  protected String a;
  private String aA;
  private int aB = 0;
  private String aC = "0.0";
  private Animation aD = null;
  private Animation aE = null;
  private Animation aF = null;
  private StockChartContainer aG;
  private int aH;
  private AbsListView.OnScrollListener aI = new bt(this);
  private TextView aa;
  private TextView ab;
  private TextView ac;
  private ai ad;
  private boolean ae = false;
  private boolean af = false;
  private View ag;
  private int ah;
  private View ai;
  private View aj;
  private View ak;
  private RelativeLayout al;
  private View am;
  private View an;
  private ImageView ao;
  private ImageView ap;
  private TextView aq;
  private TextView ar;
  private TextView as;
  private TextView at;
  private View au;
  private View av;
  private TextView aw;
  private LinearLayout.LayoutParams ax;
  private LinearLayout.LayoutParams ay;
  private Boolean az = Boolean.valueOf(true);
  protected String b;
  protected String c;
  protected String d;
  String[] e = new String[5];
  AlertDialog f = null;
  AlertDialog g = null;
  private CommentListView h;
  private com.android.dazhihui.ui.widget.o i;
  private TextView j;
  private TextView k;
  private PartScrollView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private Toast p;
  private LoadAndRefreshView q;
  private PageLoadTip r;
  private TextView s;
  private JsonHeader t;
  private ArrayList<JsonPLItem> u = new ArrayList();
  private m v;
  private m w;
  private m x;
  private m y;
  private m z;
  
  public static e a(String paramString1, String paramString2)
  {
    bs localbs = new bs();
    Bundle localBundle = new Bundle();
    localBundle.putString("code", paramString1);
    localBundle.putString("name", paramString2);
    localbs.setBundle(localBundle);
    return localbs;
  }
  
  private String a(int paramInt)
  {
    if (paramInt >= 10000)
    {
      double d1 = paramInt / 10000.0D;
      DecimalFormat localDecimalFormat = new DecimalFormat("#0.00");
      return String.valueOf(localDecimalFormat.format(Double.valueOf(d1)) + "万");
    }
    return String.valueOf(paramInt);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, Boolean paramBoolean, String paramString1, String paramString2)
  {
    int i1 = 1;
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt2 < 0) {
        paramInt2 = 0;
      }
      for (;;)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0)) {}
        for (int i2 = 1;; i2 = paramInt1)
        {
          if ((this.ax == null) || (this.ay == null))
          {
            this.ax = new LinearLayout.LayoutParams(-1, 6, i1);
            this.ay = new LinearLayout.LayoutParams(-1, 6, i2);
            this.ay.setMargins(2, 0, 0, 0);
          }
          for (;;)
          {
            this.au.setLayoutParams(this.ax);
            this.av.setLayoutParams(this.ay);
            this.aq.setText(a(paramInt1));
            this.as.setText(a(paramInt2));
            a(paramInt3, paramBoolean, paramString1, paramString2);
            return;
            this.ax.weight = i1;
            this.ay.weight = i2;
          }
          i1 = paramInt2;
        }
      }
    }
  }
  
  private void a(int paramInt, Boolean paramBoolean, String paramString1, String paramString2)
  {
    if (paramBoolean.booleanValue())
    {
      this.am.setClickable(true);
      this.an.setClickable(true);
      this.ar.setTextColor(Color.parseColor("#999999"));
      this.aq.setTextColor(Color.parseColor("#999999"));
      this.at.setTextColor(Color.parseColor("#999999"));
      this.as.setTextColor(Color.parseColor("#999999"));
      this.ao.setImageResource(2130838240);
      this.ap.setImageResource(2130838241);
      this.aw.setVisibility(8);
      return;
    }
    paramBoolean = "0";
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String str3 = localSimpleDateFormat.format(new Date());
    long l1;
    if (paramInt == 0)
    {
      this.am.setClickable(true);
      this.an.setClickable(false);
      this.ar.setTextColor(Color.parseColor("#ef3939"));
      this.aq.setTextColor(Color.parseColor("#ef3939"));
      this.at.setTextColor(Color.parseColor("#88999999"));
      this.as.setTextColor(Color.parseColor("#88999999"));
      this.ao.setImageResource(2130838240);
      this.ap.setImageResource(2130838242);
      str2 = "你已" + "<font color='#ef3939'><b>看好</b></font>" + "这支股票，当前价格" + paramString1;
      str1 = str2;
      if (!TextUtils.isEmpty(paramString2))
      {
        str1 = str2;
        if (str3.equals(paramString2)) {}
      }
      try
      {
        l1 = localSimpleDateFormat.parse(paramString2).getTime();
        paramInt = (int)((new Date().getTime() - l1) / 1000L / 3600L / 24L);
        paramString2 = paramBoolean;
        if (this.aG != null)
        {
          paramString2 = paramBoolean;
          if (this.aG.getDataModel() != null)
          {
            paramString2 = this.aG.getDataModel().getCurrentValue();
            if (paramString2 != null)
            {
              paramBoolean = paramString2;
              if (!paramString2.equals("--")) {}
            }
            else
            {
              paramBoolean = b.a(this.aG.getDataModel().getCp(), this.aG.getDataModel().getmDecimalLen());
            }
            if (paramBoolean == null) {
              break label1098;
            }
            paramString2 = paramBoolean;
            if (paramBoolean.equals("--")) {
              break label1098;
            }
          }
        }
        paramBoolean = Float.valueOf(Float.valueOf(paramString2).floatValue() - Float.valueOf(paramString1).floatValue());
        paramString2 = a(paramBoolean.floatValue() / Float.valueOf(paramString1).floatValue(), 2).replace("-", "");
        if (paramBoolean.floatValue() <= 0.0F) {
          break label600;
        }
        paramBoolean = "<font color='#ef3939'><b>上涨</b></font>";
        str1 = paramInt + "天前您" + "<font color='#ef3939'><b>" + "看好" + "</b></font>";
        str1 = "" + str1 + "这支股票，当时价格" + paramString1 + new StringBuilder().append("，至今已").append(paramBoolean).append(paramString2).toString();
      }
      catch (ParseException paramBoolean)
      {
        for (;;)
        {
          paramBoolean.printStackTrace();
          str1 = str2;
        }
      }
      this.aw.setText(Html.fromHtml(str1));
    }
    label591:
    label600:
    while (paramInt != 1) {
      for (;;)
      {
        this.aw.setVisibility(0);
        return;
        paramBoolean = "<font color='#4ca92a'><b>下跌</b></font>";
      }
    }
    this.am.setClickable(false);
    this.an.setClickable(true);
    this.ar.setTextColor(Color.parseColor("#88999999"));
    this.aq.setTextColor(Color.parseColor("#88999999"));
    this.at.setTextColor(Color.parseColor("#4ca92a"));
    this.as.setTextColor(Color.parseColor("#4ca92a"));
    this.ao.setImageResource(2130838239);
    this.ap.setImageResource(2130838241);
    String str2 = "你已" + "<font color='#4ca92a'><b>看空</b></font>" + "这支股票，当前价格" + paramString1;
    String str1 = str2;
    if (!TextUtils.isEmpty(paramString2))
    {
      str1 = str2;
      if (str3.equals(paramString2)) {}
    }
    for (;;)
    {
      try
      {
        l1 = localSimpleDateFormat.parse(paramString2).getTime();
        paramInt = (int)((new Date().getTime() - l1) / 1000L / 3600L / 24L);
        paramString2 = paramBoolean;
        if (this.aG != null)
        {
          paramString2 = paramBoolean;
          if (this.aG.getDataModel() != null)
          {
            paramString2 = this.aG.getDataModel().getCurrentValue();
            if (paramString2 != null)
            {
              paramBoolean = paramString2;
              if (!paramString2.equals("--")) {}
            }
            else
            {
              paramBoolean = b.a(this.aG.getDataModel().getCp(), this.aG.getDataModel().getmDecimalLen());
            }
            if (paramBoolean == null) {
              break label1106;
            }
            paramString2 = paramBoolean;
            if (paramBoolean.equals("--")) {
              break label1106;
            }
          }
        }
        paramBoolean = Float.valueOf(Float.valueOf(paramString2).floatValue() - Float.valueOf(paramString1).floatValue());
        paramString2 = a(paramBoolean.floatValue() / Float.valueOf(paramString1).floatValue(), 2).replace("-", "");
        if (paramBoolean.floatValue() <= 0.0F) {
          continue;
        }
        paramBoolean = "<font color='#ef3939'><b>上涨</b></font>";
        str1 = paramInt + "天前您" + "<font color='#4ca92a'><b>" + "看空" + "</b></font>";
        str1 = "" + str1 + "这支股票，当时价格" + paramString1 + new StringBuilder().append("，至今已").append(paramBoolean).append(paramString2).toString();
      }
      catch (ParseException paramBoolean)
      {
        paramBoolean.printStackTrace();
        str1 = str2;
        continue;
      }
      this.aw.setText(Html.fromHtml(str1));
      break label591;
      paramBoolean = "<font color='#4ca92a'><b>下跌</b></font>";
      continue;
      label1098:
      paramString2 = "0";
      break;
      label1106:
      paramString2 = "0";
    }
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = null;
    if (!isAdded()) {}
    Object localObject3;
    String str2;
    int i2;
    label402:
    label640:
    label714:
    byte[] arrayOfByte;
    label958:
    label990:
    do
    {
      do
      {
        Object localObject1;
        k localk;
        Object localObject2;
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return;
                try
                {
                  localObject1 = new q(paramArrayOfByte);
                  i1 = paramArrayOfByte.length;
                  ((q)localObject1).b();
                  paramArrayOfByte = new String(paramArrayOfByte, 1, i1 - 1);
                  if (!TextUtils.isEmpty(paramArrayOfByte))
                  {
                    paramArrayOfByte = new JSONArray(paramArrayOfByte).getJSONObject(0);
                    localk = new k();
                    localObject1 = (JsonHeader)localk.a(paramArrayOfByte.getJSONObject("header").toString(), JsonHeader.class);
                    localObject2 = ((JsonHeader)localObject1).getType();
                    localObject3 = ((JsonHeader)localObject1).getError();
                    String str1 = ((JsonHeader)localObject1).getService();
                    str2 = ((JsonHeader)localObject1).getMsg();
                    if ((localObject2 != null) && (localObject3 != null) && (str1 != null))
                    {
                      i1 = Integer.valueOf((String)localObject2).intValue();
                      i2 = Integer.valueOf(str1).intValue();
                      if (114 != i2) {
                        break label402;
                      }
                      if (i1 == 0)
                      {
                        if ((localObject3 == null) || (!((String)localObject3).equals("0"))) {
                          continue;
                        }
                        d.a().a("login_cuccess_first_into_guh", 0);
                        d.a().g();
                      }
                    }
                  }
                }
                catch (JSONException paramArrayOfByte)
                {
                  paramArrayOfByte.printStackTrace();
                  return;
                  if (i1 == 12)
                  {
                    System.out.println("---GUH_KANHAOKANKONGDATA dataMap = " + paramArrayOfByte.toString());
                    paramArrayOfByte = paramArrayOfByte.getJSONObject("data");
                    if (paramArrayOfByte == null) {
                      continue;
                    }
                    this.C = ((JsonKanHaoKanKongItem)localk.a(paramArrayOfByte.toString(), new ck(this).getType()));
                    j();
                  }
                }
                catch (Exception paramArrayOfByte)
                {
                  paramArrayOfByte.printStackTrace();
                  return;
                }
              }
            } while (i1 != 13);
            System.out.println("---GUH_KANHAOKANKONGTOUPIAO dataMap = " + paramArrayOfByte.toString());
            if ("0".equals(localObject3))
            {
              h();
              return;
            }
            if ("1".equals(localObject3))
            {
              if ((str2 != null) && (!str2.equals("")))
              {
                a(str2);
                return;
              }
              a("请求异常,请重试");
              return;
            }
          } while (!"2".equals(localObject3));
          a(getActivity(), 2);
          return;
        } while ((113 != i2) || (("1".equals(localObject3)) && ((i1 == 1) || (i1 == 0))));
        if (i1 == 1)
        {
          paramArrayOfByte = (ArrayList)localk.a(paramArrayOfByte.getJSONArray("data").toString(), new cl(this).getType());
          this.i.a(paramArrayOfByte, this.N);
          return;
        }
        if (i1 == 0)
        {
          System.out.println("dataMap = " + paramArrayOfByte);
          if (this.u == null) {
            this.u = new ArrayList();
          }
          this.t = ((JsonHeader)localObject1);
          this.O = ((JsonHeader)localObject1).getNext();
          this.P = ((JsonHeader)localObject1).getPrev();
          localObject1 = paramArrayOfByte.getJSONObject("data");
          localObject3 = ((JSONObject)localObject1).getJSONArray("recent");
          if (this.P != null) {
            break label1453;
          }
          paramArrayOfByte = ((JSONObject)localObject1).getJSONArray("hot");
          if (paramArrayOfByte == null) {
            break label1448;
          }
          paramArrayOfByte = (ArrayList)localk.a(paramArrayOfByte.toString(), new cm(this).getType());
          if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
          {
            this.u.addAll(paramArrayOfByte);
            this.i.a(paramArrayOfByte.size());
          }
          for (;;)
          {
            try
            {
              localObject2 = ((JSONObject)localObject1).getJSONArray("like");
              localObject1 = paramArrayOfByte;
              if (localObject2 != null)
              {
                localArrayList = (ArrayList)localk.a(((JSONArray)localObject2).toString(), new bu(this).getType());
                if ((localArrayList != null) && (localArrayList.size() > 0))
                {
                  this.u.addAll(localArrayList);
                  this.i.b(localArrayList.size());
                  localObject1 = paramArrayOfByte;
                }
              }
              else
              {
                paramArrayOfByte = (ArrayList)localk.a(((JSONArray)localObject3).toString(), new bv(this).getType());
                if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
                  this.u.addAll(paramArrayOfByte);
                }
                if ((this.P == null) && (paramArrayOfByte != null) && (paramArrayOfByte.size() > 3))
                {
                  if ((com.android.dazhihui.ui.a.a.c().b() != null) && (com.android.dazhihui.ui.a.a.c().b().getAdvert(138) != null) && (!com.android.dazhihui.ui.a.a.c().b().getAdvert(138).advList.isEmpty())) {
                    continue;
                  }
                  System.out.println("ADVERT138 is no");
                }
                if ((this.P != null) || ((this.u != null) && (this.u.size() != 0))) {
                  break label990;
                }
                this.o.setText(getString(2131166142));
                this.o.setVisibility(0);
                if (this.u == null) {
                  break;
                }
                this.i.a(this.u);
                return;
                this.i.a(0);
                continue;
              }
            }
            catch (Exception localException)
            {
              localException.printStackTrace();
              localObject2 = null;
              continue;
              this.i.b(0);
              arrayOfByte = paramArrayOfByte;
              continue;
              paramArrayOfByte = new JsonPLItem();
              paramArrayOfByte.setIsAdv(Boolean.valueOf(true));
              if (arrayOfByte == null) {
                break label1442;
              }
            }
            i1 = arrayOfByte.size();
            i2 = i1;
            if (localArrayList != null) {
              i2 = i1 + localArrayList.size();
            }
            this.u.add(i2 + 3, paramArrayOfByte);
            continue;
            this.o.setVisibility(8);
          }
        }
        if (i1 != 3) {
          break label1245;
        }
        if (!"0".equals(localObject3)) {
          break;
        }
        a("点赞成功");
      } while ((this.A.j() == null) || (!(this.A.j() instanceof ps)));
      paramArrayOfByte = (ps)this.A.j();
      if (paramArrayOfByte.a != null)
      {
        oy.a.put(paramArrayOfByte.a, Boolean.valueOf(true));
        oy.b = oy.a.size();
      }
    } while (!paramArrayOfByte.b);
    int i1 = 0;
    for (;;)
    {
      if (i1 < this.u.size())
      {
        if ((paramArrayOfByte.a != null) && (paramArrayOfByte.a.equals(((JsonPLItem)this.u.get(i1)).getId())))
        {
          i2 = Integer.valueOf(((JsonPLItem)this.u.get(i1)).getGood()).intValue();
          ((JsonPLItem)this.u.get(i1)).setGood("" + (i2 + 1));
        }
      }
      else
      {
        this.i.notifyDataSetChanged();
        return;
        if ("2".equals(localObject3))
        {
          a(getActivity(), 2);
          return;
        }
        a("点赞失败,请重试");
        return;
        label1245:
        if (i1 != 2) {
          break;
        }
        if ("0".equals(localObject3))
        {
          a("发表评论成功");
          e();
          if (this.V != null) {
            this.V.a(this.M);
          }
          if (this.W != null) {
            this.W.a(this.M);
          }
          this.i.a(this.F);
          if (("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解" == null) || ("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解".equals(""))) {
            break;
          }
          c("为了使您看到更加有意义的评论，所有用户的发言将在审核后显示，给您带来的不便敬请谅解");
          return;
        }
        if ("1".equals(localObject3))
        {
          if ((str2 != null) && (!str2.equals("")))
          {
            a(str2);
            return;
          }
          a("发表评论失败,请重试");
          return;
        }
        if (!"2".equals(localObject3)) {
          break;
        }
        a(getActivity(), 1);
        if (this.V != null) {
          this.V.a(this.M);
        }
        if (this.W == null) {
          break;
        }
        this.W.a(this.M);
        return;
        label1442:
        i1 = 0;
        break label958;
        label1448:
        paramArrayOfByte = null;
        break label640;
        label1453:
        arrayOfByte = null;
        break label714;
      }
      i1 += 1;
    }
  }
  
  private void b(int paramInt)
  {
    if (this.aD == null) {
      this.aD = AnimationUtils.loadAnimation(getActivity(), 2130968596);
    }
    this.ao.clearAnimation();
    this.ap.clearAnimation();
    if (paramInt == 0)
    {
      this.ao.setAnimation(this.aD);
      this.aD.start();
    }
    while (paramInt != 1) {
      return;
    }
    this.ap.setAnimation(this.aD);
    this.aD.start();
  }
  
  private void d(String paramString)
  {
    this.r.a(paramString, new bw(this));
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
  
  private void g()
  {
    if ((this.L) || (this.t == null)) {
      return;
    }
    this.y = oy.b(this.a, Integer.parseInt(this.t.getNext()));
    this.y.a(this);
    com.android.dazhihui.a.g.a().a(this.y);
    this.L = true;
  }
  
  private void h()
  {
    boolean bool;
    String str2;
    String str1;
    if (!this.az.booleanValue())
    {
      bool = true;
      this.az = Boolean.valueOf(bool);
      str2 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      if (!this.aA.equals("1")) {
        break label273;
      }
      str1 = "1";
      label56:
      if (this.aB != 0) {
        break label343;
      }
      if (!this.az.booleanValue()) {
        break label300;
      }
      this.C.setLp("" + (Integer.valueOf(this.C.getLp()).intValue() - 1));
      label113:
      if (!TextUtils.isEmpty(this.c)) {
        break label439;
      }
      pq.a(this.b + this.a, str1, str2, this.aC, this.C.getLp(), this.C.getSp());
    }
    for (;;)
    {
      this.e[0] = str1;
      this.e[1] = str2;
      this.e[2] = this.aC;
      this.e[3] = this.C.getLp();
      this.e[4] = this.C.getSp();
      a(Integer.valueOf(this.C.getLp()).intValue(), Integer.valueOf(this.C.getSp()).intValue(), this.aB, this.az, this.aC, null);
      i();
      return;
      bool = false;
      break;
      label273:
      if (this.aA.equals("2"))
      {
        str1 = "-1";
        break label56;
      }
      str1 = "0";
      break label56;
      label300:
      this.C.setLp("" + (Integer.valueOf(this.C.getLp()).intValue() + 1));
      break label113;
      label343:
      if (this.az.booleanValue())
      {
        this.C.setSp("" + (Integer.valueOf(this.C.getSp()).intValue() - 1));
        break label113;
      }
      this.C.setSp("" + (Integer.valueOf(this.C.getSp()).intValue() + 1));
      break label113;
      label439:
      pq.a(this.d + this.c, str1, str2, this.aC, this.C.getLp(), this.C.getSp());
    }
  }
  
  private void i()
  {
    if ((this.aE == null) || (this.aF == null))
    {
      this.aE = AnimationUtils.loadAnimation(getActivity(), 2130968597);
      this.aF = AnimationUtils.loadAnimation(getActivity(), 2130968598);
    }
    this.au.clearAnimation();
    this.av.clearAnimation();
    this.au.setAnimation(this.aE);
    this.av.setAnimation(this.aF);
    this.aE.start();
    this.aF.start();
  }
  
  private void j()
  {
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    int i1;
    if (TextUtils.isEmpty(this.c))
    {
      pq.a(this.b + this.a, this.e);
      if (!this.e[0].equals("0")) {
        break label351;
      }
      this.az = Boolean.valueOf(true);
      i1 = 0;
    }
    for (;;)
    {
      label87:
      int i2 = Math.abs(Integer.valueOf(this.e[3]).intValue() - Integer.valueOf(this.C.getLp()).intValue());
      int i3 = Math.abs(Integer.valueOf(this.e[4]).intValue() - Integer.valueOf(this.C.getSp()).intValue());
      Boolean localBoolean = Boolean.valueOf(false);
      if (i2 > 1)
      {
        this.e[3] = this.C.getLp();
        localBoolean = Boolean.valueOf(true);
        label178:
        if (i3 <= 1) {
          break label456;
        }
        this.e[4] = this.C.getSp();
        localBoolean = Boolean.valueOf(true);
        label202:
        if (localBoolean.booleanValue())
        {
          if (!TextUtils.isEmpty(this.c)) {
            break label472;
          }
          pq.a(this.b + this.a, this.e[0], this.e[1], this.e[2], this.e[3], this.e[4]);
        }
      }
      for (;;)
      {
        a(Integer.valueOf(this.C.getLp()).intValue(), Integer.valueOf(this.C.getSp()).intValue(), i1, this.az, this.aC, str);
        return;
        pq.a(this.d + this.c, this.e);
        break;
        label351:
        if (this.e[0].equals("1"))
        {
          this.az = Boolean.valueOf(false);
          str = this.e[1];
          this.aC = this.e[2];
          i1 = 0;
          break label87;
        }
        if (!this.e[0].equals("-1")) {
          break label532;
        }
        this.az = Boolean.valueOf(false);
        str = this.e[1];
        this.aC = this.e[2];
        i1 = 1;
        break label87;
        this.C.setLp(this.e[3]);
        break label178;
        label456:
        this.C.setSp(this.e[4]);
        break label202;
        label472:
        pq.a(this.d + this.c, this.e[0], this.e[1], this.e[2], this.e[3], this.e[4]);
      }
      label532:
      i1 = 0;
    }
  }
  
  public String a(double paramDouble, int paramInt)
  {
    NumberFormat localNumberFormat = NumberFormat.getPercentInstance();
    localNumberFormat.setMinimumFractionDigits(paramInt);
    return localNumberFormat.format(paramDouble);
  }
  
  public void a()
  {
    Object localObject = getBundle();
    if (localObject != null)
    {
      this.a = ((Bundle)localObject).getString("code");
      this.b = ((Bundle)localObject).getString("name");
      this.ah = ((Bundle)localObject).getInt("type");
      if (TextUtils.isEmpty(this.a))
      {
        localObject = (StockVo)this.mBundle.getParcelable("stock_vo");
        if (localObject != null)
        {
          this.a = ((StockVo)localObject).getCode();
          this.b = ((StockVo)localObject).getName();
          this.ah = ((StockVo)localObject).getType();
        }
      }
      int i1 = n.o(this.a);
      if ((this.ah == 0) && ((i1 == 0) || (i1 == 1)))
      {
        this.c = this.a;
        this.d = this.b;
        this.a = "SH000001";
        this.b = "上证指数";
      }
      if (TextUtils.isEmpty(this.a))
      {
        this.a = "SH000001";
        this.b = "上证指数";
        this.ah = 0;
      }
      if (this.V != null) {
        this.V.a = this.a;
      }
      if (this.W != null) {
        this.W.a = this.a;
      }
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
      cc localcc = new cc(this);
      ((Button)localObject).setOnClickListener(localcc);
      localButton.setOnClickListener(localcc);
      paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
      paramContext.setView(localView);
      this.f = paramContext.create();
      this.f.show();
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
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new ce(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.g = paramContext.create();
    this.g.show();
  }
  
  public void a(EmojiInputView paramEmojiInputView)
  {
    this.W = paramEmojiInputView;
    if (this.W != null)
    {
      this.W.setOnSendListener(this);
      this.W.setHint("发表新话题");
    }
  }
  
  public void a(StockChartContainer paramStockChartContainer)
  {
    this.aG = paramStockChartContainer;
  }
  
  public void a(Boolean paramBoolean, View paramView)
  {
    if (getActivity() == null) {
      return;
    }
    InputMethodManager localInputMethodManager = (InputMethodManager)getActivity().getSystemService("input_method");
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
    if (this.p != null) {
      this.p.setText(paramString);
    }
    for (;;)
    {
      this.p.show();
      return;
      this.p = Toast.makeText(getActivity(), paramString, 0);
    }
  }
  
  public void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem)
  {
    if (!w.a().l())
    {
      this.A = oy.b(paramString, "0");
      paramJsonPLItem = new ps();
      paramJsonPLItem.b = paramBoolean;
      paramJsonPLItem.a = paramString;
      this.A.a(paramJsonPLItem);
      this.A.a(this);
      com.android.dazhihui.a.g.a().a(this.A);
      return;
    }
    com.android.dazhihui.o.a().c(new cb(this, paramString, paramBoolean));
  }
  
  public void a(boolean paramBoolean)
  {
    b(paramBoolean);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.J = paramBoolean1;
    this.K = paramBoolean2;
    if (this.W == null) {
      return;
    }
    if (paramBoolean1)
    {
      if ((this.U != null) && (this.U.isShowing())) {
        this.U.dismiss();
      }
      this.W.setVisibility(0);
      return;
    }
    this.W.setVisibility(8);
    if (this.U == null)
    {
      this.U = new PopupWindow(getActivity());
      this.U.setAnimationStyle(2131296258);
      this.U.setContentView(this.V);
      this.U.setHeight(-2);
      this.U.setWidth(com.android.dazhihui.g.a().m());
      this.U.setBackgroundDrawable(new ColorDrawable());
      this.U.setFocusable(true);
      this.U.setSoftInputMode(16);
      this.U.setOnDismissListener(new bx(this));
    }
    Object localObject;
    if (!this.J)
    {
      localObject = "";
      if ((!this.K) || (this.H == null)) {
        break label323;
      }
      localObject = this.H.getIp();
    }
    for (;;)
    {
      this.V.setHint("回复 " + (String)localObject + ":");
      this.V.setmClickCommentId(this.M);
      this.V.setCacheCommentInput(this.M);
      this.V.a();
      localObject = getActivity();
      if ((localObject != null) && ((localObject instanceof StockChartScreen)))
      {
        localObject = ((Activity)localObject).findViewById(Integer.MAX_VALUE);
        this.U.showAtLocation((View)localObject, 81, 0, 0);
      }
      this.V.b.sendEmptyMessageDelayed(333, 150L);
      return;
      label323:
      if (this.G != null) {
        localObject = this.G.getIp();
      }
    }
  }
  
  public void b()
  {
    if (this.i != null) {
      this.i.a();
    }
    if (this.s != null) {
      this.s.setVisibility(8);
    }
    if (this.u != null) {
      this.u.clear();
    }
  }
  
  public void b(String paramString)
  {
    String str3 = com.android.dazhihui.g.a().v();
    String str4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    String str2;
    String str1;
    if (w.a().l())
    {
      str2 = w.a().g();
      str1 = str2;
      if ("".equals(str2))
      {
        str1 = w.a().f();
        str1 = str1.replace(str1.subSequence(str1.length() - 3, str1.length()), "***");
      }
    }
    ArrayList localArrayList;
    for (;;)
    {
      localArrayList = new ArrayList();
      if (!this.J) {
        break;
      }
      n.a(this.a, 1137);
      this.F = new JsonPLItem("", str1, paramString, str4, "0", str3, "1", localArrayList);
      if (w.a().l())
      {
        str1 = e(w.a().f());
        str1 = String.format(f.k, new Object[] { str1 });
        this.F.setAvatar(str1);
      }
      if (!TextUtils.isEmpty(paramString)) {
        break label664;
      }
      Toast.makeText(getActivity(), 2131165948, 0).show();
      return;
      if ((str3 != null) && (str3.length() > 3)) {
        str1 = "android股友(" + str3.substring(str3.length() - 4) + ")";
      } else {
        str1 = "android股友(0000)";
      }
    }
    if (!this.K)
    {
      n.a(this.a, 1138);
      localArrayList.addAll(this.G.getRemarks());
      localArrayList.add(new JsonPLItem.UtilsItem(this.G.getId(), this.G.getIp(), this.G.getContent(), this.G.getOtime(), this.G.getGood(), this.G.getMac(), this.G.getFloor()));
      if (TextUtils.isEmpty(this.G.getFloor())) {}
      for (str2 = String.valueOf(localArrayList.size() + 1);; str2 = String.valueOf(Integer.valueOf(this.G.getFloor()).intValue() + 1))
      {
        this.F = new JsonPLItem("", str1, paramString, str4, "0", str3, str2, localArrayList);
        break;
      }
    }
    n.a(this.a, 1138);
    if ((this.I != null) && (this.I.size() > 0))
    {
      int i2 = this.I.indexOf(this.H);
      int i1 = 0;
      while (i1 <= i2)
      {
        localArrayList.add(this.I.get(i1));
        i1 += 1;
      }
      if (TextUtils.isEmpty(this.H.getFloor())) {
        str2 = String.valueOf(localArrayList.size() + 1);
      }
    }
    for (;;)
    {
      this.F = new JsonPLItem("", str1, paramString, str4, "0", str3, str2, localArrayList);
      break;
      str2 = String.valueOf(Integer.valueOf(this.H.getFloor()).intValue() + 1);
      continue;
      localArrayList.add(new JsonPLItem.UtilsItem(this.H.getId(), this.H.getIp(), this.H.getContent(), this.H.getOtime(), this.H.getGood(), this.H.getMac(), "1"));
      str2 = "2";
    }
    label664:
    c(this.M, paramString);
  }
  
  public void b(String paramString1, String paramString2)
  {
    String str2 = w.a().o();
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = "0";
    }
    if (TextUtils.isEmpty(this.c)) {}
    for (this.D = oy.a(this.a, str1, paramString1, paramString2);; this.D = oy.a(this.c, str1, paramString1, paramString2))
    {
      this.D.a(this);
      com.android.dazhihui.a.g.a().a(this.D);
      return;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if ((this.i == null) || (this.L)) {
      return;
    }
    b();
    this.w = oy.b(this.a);
    this.w.a(this);
    this.w.a(Boolean.valueOf(paramBoolean));
    com.android.dazhihui.a.g.a().a(this.w);
    this.L = true;
    if (this.r != null)
    {
      this.r.setVisibility(0);
      this.r.b();
    }
    d();
  }
  
  public void c()
  {
    d locald = d.a();
    int i1 = locald.b("login_cuccess_first_into_guh", 1);
    locald.g();
    if ((w.a().l()) && (i1 == 1))
    {
      System.out.println("---sendRequest(mGuhLoginJsonRequest)");
      this.v = oy.d("", w.a().o());
      this.v.a(this);
      com.android.dazhihui.a.g.a().a(this.v);
    }
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
  
  public void c(String paramString1, String paramString2)
  {
    k localk = new r().a().b();
    if (!w.a().l())
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      localLinkedHashMap.put("data", new CommentBodyField(String.valueOf(2), com.android.dazhihui.g.a().v(), w.a().f(), w.a().g(), paramString1, paramString2, "0", this.a));
      localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
      paramString1 = new ArrayList(1);
      paramString1.add(localLinkedHashMap);
      new by(this).getType();
      paramString1 = localk.a(paramString1);
      paramString2 = new x(3005);
      paramString2.b(2);
      paramString2.a(paramString1.getBytes());
      this.z = new m(paramString2);
      this.z.a(this);
      com.android.dazhihui.a.g.a().a(this.z);
      e();
      a(Boolean.valueOf(false), this.W);
      return;
    }
    com.android.dazhihui.o.a().c(new bz(this, paramString1, paramString2, localk));
  }
  
  public void c(boolean paramBoolean)
  {
    this.af = paramBoolean;
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (cf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.aj == null);
      this.aj.setBackgroundColor(getResources().getColor(2131493542));
      this.h.setBackgroundColor(getResources().getColor(2131493542));
      this.i.a(paramy);
      this.ag.setBackgroundColor(getResources().getColor(2131493551));
      this.k.setTextColor(getResources().getColor(2131493563));
      this.ai.setBackgroundColor(getResources().getColor(2131493551));
      this.j.setTextColor(getResources().getColor(2131493563));
      this.m.setBackgroundResource(2130838707);
      this.m.setTextColor(getResources().getColorStateList(2130838706));
      this.n.setBackgroundResource(2130838707);
      this.n.setTextColor(getResources().getColorStateList(2130838706));
      this.Z.setBackgroundResource(2130838707);
      this.Z.setTextColor(getResources().getColorStateList(2130838706));
      this.aa.setBackgroundResource(2130838707);
      this.aa.setTextColor(getResources().getColorStateList(2130838706));
      this.ab.setBackgroundResource(2130838707);
      this.ab.setTextColor(getResources().getColorStateList(2130838706));
      this.al.setBackgroundResource(2130838733);
      return;
    } while (this.aj == null);
    this.aj.setBackgroundColor(getResources().getColor(2131493605));
    this.h.setBackgroundColor(getResources().getColor(2131493605));
    this.i.a(paramy);
    this.ag.setBackgroundColor(getResources().getColor(2131493614));
    this.k.setTextColor(getResources().getColor(2131493626));
    this.ai.setBackgroundColor(getResources().getColor(2131493614));
    this.j.setTextColor(getResources().getColor(2131493626));
    this.m.setBackgroundResource(2130838792);
    this.m.setTextColor(getResources().getColorStateList(2130838791));
    this.n.setBackgroundResource(2130838792);
    this.n.setTextColor(getResources().getColorStateList(2130838791));
    this.Z.setBackgroundResource(2130838792);
    this.Z.setTextColor(getResources().getColorStateList(2130838791));
    this.aa.setBackgroundResource(2130838792);
    this.aa.setTextColor(getResources().getColorStateList(2130838791));
    this.ab.setBackgroundResource(2130838792);
    this.ab.setTextColor(getResources().getColorStateList(2130838791));
    this.al.setBackgroundResource(2130838815);
  }
  
  public void d()
  {
    if (TextUtils.isEmpty(this.c)) {}
    for (this.B = oy.f(this.a);; this.B = oy.f(this.c))
    {
      this.B.a(this);
      com.android.dazhihui.a.g.a().a(this.B);
      return;
    }
  }
  
  public void e()
  {
    if (this.U != null) {
      this.U.dismiss();
    }
  }
  
  public void f()
  {
    int i1 = 0;
    if (!isAdded()) {
      return;
    }
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    if ((TextUtils.isEmpty(this.e[0])) || (this.e[0].equals("0"))) {
      this.az = Boolean.valueOf(true);
    }
    for (;;)
    {
      a(Integer.valueOf(this.C.getLp()).intValue(), Integer.valueOf(this.C.getSp()).intValue(), i1, this.az, this.aC, str);
      return;
      if (this.e[0].equals("1"))
      {
        this.az = Boolean.valueOf(false);
        str = this.e[1];
        this.aC = this.e[2];
      }
      else if (this.e[0].equals("-1"))
      {
        this.az = Boolean.valueOf(false);
        str = this.e[1];
        this.aC = this.e[2];
        i1 = 1;
      }
      else
      {
        this.az = Boolean.valueOf(true);
      }
    }
  }
  
  public View getScroolView()
  {
    return this.h;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    byte[] arrayOfByte;
    if ((paramh == this.w) || (paramh == this.x) || (paramh == this.A) || (paramh == this.z) || (paramh == this.y) || (paramh == this.v) || (paramh == this.B) || (paramh == this.D))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if (paramj != null)
      {
        arrayOfByte = paramj.b;
        if (paramj.a != 2960) {
          break label337;
        }
        if (arrayOfByte == null) {}
      }
    }
    for (;;)
    {
      try
      {
        if (arrayOfByte.length > 0)
        {
          paramj = new q(arrayOfByte);
          paramj.b();
          int i1 = paramj.e();
          paramj.e();
          paramj.h();
          paramj.h();
          paramj = "<font color='#ff8208'><b>" + (i1 + 1) + "</b></font>";
          paramj = "今日" + "浏览排行第" + paramj + "位";
          this.j.setText(Html.fromHtml(paramj));
          this.k.setText(Html.fromHtml(paramj));
          this.j.postInvalidate();
        }
        if (paramh == this.w)
        {
          this.L = false;
          if (this.r != null) {
            this.r.a();
          }
          if ((((Boolean)paramh.j()).booleanValue()) && (getActivity() != null) && ((getActivity() instanceof StockChartScreen))) {
            ((StockChartScreen)getActivity()).a().d(true);
          }
        }
        if (paramh == this.y) {
          this.L = false;
        }
        if (paramh == this.D) {
          this.E = false;
        }
        return;
      }
      catch (Exception paramj)
      {
        System.out.println("Read 2960 error!!!");
        continue;
      }
      label337:
      if ((paramj.a == 3005) && (arrayOfByte != null)) {
        a(arrayOfByte);
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.w)
    {
      this.L = false;
      d("数据请求超时,点击重新加载!");
      if ((((Boolean)paramh.j()).booleanValue()) && (getActivity() != null) && ((getActivity() instanceof StockChartScreen))) {
        ((StockChartScreen)getActivity()).a().d(false);
      }
    }
    if (paramh == this.y)
    {
      Log.i("GUH", "moreRequest handleTimeout");
      this.L = false;
    }
    if (paramh == this.D)
    {
      Log.i("GUH", "kanhao kankong handleTimeout");
      this.E = false;
    }
  }
  
  public void loadMoreData()
  {
    if (!this.L)
    {
      if ((this.t != null) && (this.t.getNext() != null) && (!"".equals(this.t.getNext())))
      {
        if (this.u != null) {
          this.u.clear();
        }
        g();
      }
    }
    else {
      return;
    }
    if (this.t == null)
    {
      b(false);
      return;
    }
    n.a(this.a, 20122);
    a("已加载到最后一页");
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.w)
    {
      this.L = false;
      d("网络连接异常,请检查网络情况,然后点击重新加载!");
      if ((((Boolean)paramh.j()).booleanValue()) && (getActivity() != null) && ((getActivity() instanceof StockChartScreen))) {
        ((StockChartScreen)getActivity()).a().d(false);
      }
    }
    if (paramh == this.y)
    {
      Log.i("GUH", "moreRequest netException");
      this.L = false;
    }
    if (paramh == this.D)
    {
      Log.i("GUH", "kanhao kankong netException");
      this.E = false;
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
          break label230;
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
      n.a(this.a, 1137);
      this.F = new JsonPLItem("", (String)localObject1, str1, str3, "0", str2, "1", (List)localObject2);
      this.M = "";
      c(this.M, str1);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label230:
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
    double d1;
    do
    {
      do
      {
        do
        {
          return;
          this.M = "";
          a(true, false);
          n.a(this.a, 20069);
          return;
          paramView = d.a();
          if (paramView.b("new_reply_my_bbs", 0) == 1)
          {
            ah.a().a(16);
            paramView.a("new_reply_my_bbs", 0);
          }
          paramView.g();
          if (w.a().l())
          {
            startActivity(new Intent(getActivity(), BBSMyStatementActivity.class));
            return;
          }
          paramView = new Intent(getActivity(), LoginMainScreen.class);
          paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
          paramView.putExtra("CAN_showSyncSettingDialog", true);
          startActivity(paramView);
          return;
          paramView.setVisibility(8);
        } while (this.l == null);
        this.l.scrollTo(0, 0);
        return;
        n.a(this.a, 20123);
        b(0);
      } while (this.E);
      this.E = true;
      this.aB = 0;
      if ((this.aG != null) && (this.aG.getDataModel() != null))
      {
        this.aC = this.aG.getDataModel().getCurrentValue();
        if ((this.aC == null) || (this.aC.equals("--"))) {
          this.aC = b.a(this.aG.getDataModel().getCp(), this.aG.getDataModel().getmDecimalLen());
        }
        if ((this.aC == null) || (this.aC.equals("--"))) {
          this.aC = "0";
        }
      }
      if (this.az.booleanValue()) {}
      for (this.aA = "1";; this.aA = "-1")
      {
        d1 = Double.valueOf(this.aC).doubleValue();
        b(this.aA, "" + Double.valueOf(d1 * 100.0D).intValue());
        return;
      }
      n.a(this.a, 20123);
      b(1);
    } while (this.E);
    this.E = true;
    this.aB = 1;
    if ((this.aG != null) && (this.aG.getDataModel() != null))
    {
      this.aC = this.aG.getDataModel().getCurrentValue();
      if ((this.aC == null) || (this.aC.equals("--"))) {
        this.aC = b.a(this.aG.getDataModel().getCp(), this.aG.getDataModel().getmDecimalLen());
      }
      if ((this.aC == null) || (this.aC.equals("--"))) {
        this.aC = "0";
      }
    }
    if (this.az.booleanValue()) {}
    for (this.aA = "2";; this.aA = "-2")
    {
      d1 = Double.valueOf(this.aC).doubleValue();
      b(this.aA, "" + Double.valueOf(d1 * 100.0D).intValue());
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      setBundle(paramBundle);
    }
    a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.aj = paramLayoutInflater.inflate(2130903118, paramViewGroup, false);
    this.ai = paramLayoutInflater.inflate(2130903122, null);
    paramViewGroup = new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(2131230824));
    this.ai.setLayoutParams(paramViewGroup);
    this.ak = paramLayoutInflater.inflate(2130903121, null);
    paramLayoutInflater = new AbsListView.LayoutParams(-1, -2);
    this.ak.setLayoutParams(paramLayoutInflater);
    this.al = ((RelativeLayout)this.ak.findViewById(2131558944));
    this.am = this.ak.findViewById(2131558946);
    this.an = this.ak.findViewById(2131558950);
    this.aq = ((TextView)this.ak.findViewById(2131558948));
    this.ar = ((TextView)this.ak.findViewById(2131558949));
    this.as = ((TextView)this.ak.findViewById(2131558952));
    this.at = ((TextView)this.ak.findViewById(2131558951));
    this.au = this.ak.findViewById(2131558955);
    this.av = this.ak.findViewById(2131558956);
    this.aw = ((TextView)this.ak.findViewById(2131558957));
    this.ao = ((ImageView)this.ak.findViewById(2131558947));
    this.ap = ((ImageView)this.ak.findViewById(2131558953));
    this.am.setOnClickListener(this);
    this.an.setOnClickListener(this);
    a(true, false);
    this.V = new EmojiInputView(getActivity());
    this.V.setOnSendListener(this);
    getActivity().getWindow().setSoftInputMode(16);
    this.q = ((LoadAndRefreshView)this.aj.findViewById(2131558601));
    this.ag = this.aj.findViewById(2131558932);
    this.Z = ((TextView)this.ai.findViewById(2131558960));
    this.aa = ((TextView)this.aj.findViewById(2131558934));
    this.ab = ((TextView)this.aj.findViewById(2131558935));
    this.ac = ((TextView)this.aj.findViewById(2131558936));
    this.S = ((RelativeLayout)this.aj.findViewById(2131558931));
    this.m = ((TextView)this.ai.findViewById(2131558959));
    this.n = ((TextView)this.aj.findViewById(2131558933));
    this.j = ((TextView)this.ai.findViewById(2131558961));
    this.k = ((TextView)this.aj.findViewById(2131558937));
    this.o = ((TextView)this.aj.findViewById(2131558605));
    this.h = ((CommentListView)this.aj.findViewById(2131558602));
    this.h.setVerticalScrollBarEnabled(false);
    this.h.setOverScrollMode(2);
    this.h.setVerticalFadingEdgeEnabled(false);
    this.r = ((PageLoadTip)this.aj.findViewById(2131558603));
    this.s = ((TextView)this.aj.findViewById(2131558705));
    this.R = getResources().getDimensionPixelSize(2131230773);
    this.q.a(true, true);
    this.q.setOnHeaderRefreshListener(new cd(this));
    this.q.setOnFooterLoadListener(new cg(this));
    this.h.setOnScrollListener(this.aI);
    this.m.setOnClickListener(this);
    this.n.setOnClickListener(this);
    if (this.u != null) {
      this.u.clear();
    }
    this.h.addHeaderView(this.ai);
    this.h.addHeaderView(this.ak);
    this.i = new com.android.dazhihui.ui.widget.o(this);
    this.h.setAdapter(this.i);
    this.i.a(new ch(this));
    paramLayoutInflater = new ci(this);
    this.Z.setOnClickListener(paramLayoutInflater);
    this.aa.setOnClickListener(paramLayoutInflater);
    this.ab.setOnClickListener(this);
    this.j.setSelected(true);
    this.ad = new cj(this, 16);
    ah.a().a(this.ad);
    if (this.af) {
      b(false);
    }
    n.a(this.a, 1180);
    this.X = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), 2130968610);
    this.Y = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), 2130968611);
    c();
    changeLookFace(this.mLookFace);
    return this.aj;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.i != null) {
      this.i.c();
    }
  }
  
  public void onDestroyView()
  {
    ah.a().b(this.ad);
    super.onDestroyView();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.i != null) && (oy.a.size() > oy.b))
    {
      this.i.b();
      oy.b = oy.a.size();
    }
    if (this.V != null) {
      this.V.b.sendEmptyMessageDelayed(444, 1000L);
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
      a(false);
    }
  }
  
  public void show()
  {
    a();
    n.a(this.a, 1180);
    a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */