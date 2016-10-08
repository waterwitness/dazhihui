package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.b.i;
import com.android.dazhihui.b.k;
import com.android.dazhihui.b.l;
import com.android.dazhihui.d.bj;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.LeftMenuConfigManager;
import com.android.dazhihui.ui.model.stock.LeftMenuConfigManager.leftDataHaveListener;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.PublicWidomMessageVo;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.LeftMenuItem;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalDetailActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalInitActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalMine;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.PopupMenu;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.w;
import java.io.File;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class fu
  extends e
  implements View.OnClickListener, com.android.dazhihui.service.q, LeftMenuConfigManager.leftDataHaveListener
{
  private com.android.dazhihui.b.j A;
  private View B;
  private com.android.dazhihui.b.h C;
  private View D;
  private CircleImageView E;
  private TextView F;
  private TextView G;
  private ImageView H;
  private ImageView I;
  private ImageView J;
  private ImageView K;
  private ImageView L;
  private ImageView M;
  private RatingBar N;
  private com.android.dazhihui.a.b.m O;
  private com.android.dazhihui.a.b.m P;
  private int Q;
  private String R;
  private PopupMenu S;
  private String[] T = { "消息", "新股", "收藏" };
  private int[] U = { 2130838372, 2130837630, 2130838453 };
  private com.g.a.b.d V;
  private wk W;
  public bj a;
  public PublicWidomMessageVo b;
  public String c;
  public boolean d = false;
  private View e;
  private ListView f;
  private gd g;
  private int h;
  private List<LeftMenuConfigVo.LeftMenuItem> i = new ArrayList();
  private ArrayList<gf> j = new ArrayList();
  private com.android.dazhihui.b.b k = com.android.dazhihui.b.b.a();
  private com.android.dazhihui.c.a.d l = com.android.dazhihui.c.a.d.a();
  private DateFormat m = new SimpleDateFormat("MM月dd日 HH:mm");
  private LayoutInflater n;
  private View o;
  private View p;
  private com.android.dazhihui.b q;
  private CircleImageView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private ai w;
  private boolean x = false;
  private Drawable y;
  private i z;
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i1] & 0xFF);
      String str1 = str2;
      if (str2.length() == 1) {
        str1 = "0" + str2;
      }
      localStringBuilder.append(str1);
      i1 += 1;
    }
    return localStringBuilder.toString().toLowerCase(Locale.getDefault()).trim();
  }
  
  private String b(String paramString)
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
    return a(paramString).toLowerCase(Locale.getDefault());
  }
  
  private void f()
  {
    Object localObject = new com.android.dazhihui.a.b.x(3001);
    ((com.android.dazhihui.a.b.x)localObject).b(2);
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(521);
    localx.a(w.a().f());
    localx.a(com.android.dazhihui.g.a().v());
    localx.b(com.android.dazhihui.g.a().ac());
    localx.a(com.android.dazhihui.g.a().r());
    localx.c(0);
    localx.c(10);
    localx.b(1);
    localx.a(new int[] { 0, 1, 2, 3 });
    ((com.android.dazhihui.a.b.x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
    localObject = new com.android.dazhihui.a.b.m((com.android.dazhihui.a.b.x)localObject, com.android.dazhihui.a.b.n.a);
    registRequestListener((com.android.dazhihui.a.b.h)localObject);
    sendRequest((com.android.dazhihui.a.b.h)localObject);
  }
  
  private void g()
  {
    com.android.dazhihui.a.b.x localx1 = new com.android.dazhihui.a.b.x(2972);
    localx1.b(2);
    com.android.dazhihui.a.b.x localx2 = new com.android.dazhihui.a.b.x(108);
    localx2.a(w.a().f());
    localx2.a("");
    localx1.a(localx2);
    this.O = new com.android.dazhihui.a.b.m(localx1);
    this.O.a(new String("108"));
    registRequestListener(this.O);
    sendRequest(this.O);
  }
  
  private void h()
  {
    com.android.dazhihui.a.b.x localx1 = new com.android.dazhihui.a.b.x(2972);
    localx1.b(2);
    com.android.dazhihui.a.b.x localx2 = new com.android.dazhihui.a.b.x(167);
    String str1 = w.a().f();
    String str2 = Base64.encodeToString(w.a().j(), 0);
    localx2.a("{\"uname\":\"" + str1 + "\",\"password\":\"" + str2 + "\"}");
    localx1.a(localx2);
    this.P = new com.android.dazhihui.a.b.m(localx1);
    this.P.a(new String("167"));
    registRequestListener(this.P);
    sendRequest(this.P);
  }
  
  private void i()
  {
    Object localObject1 = com.android.dazhihui.c.a.d.a();
    int i1 = ((com.android.dazhihui.c.a.d)localObject1).b("offline_capital_state", 0);
    ((com.android.dazhihui.c.a.d)localObject1).g();
    if (i1 == 1)
    {
      startActivity(new Intent(getActivity(), OfflineCapitalDetailActivity.class));
      return;
    }
    if (i1 == 2)
    {
      localObject1 = new ArrayList();
      Object localObject2 = new ArrayList();
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length != 0))
      {
        i1 = 0;
        while (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (!((ArrayList)localObject1).contains(com.android.dazhihui.c.a.a.E[i1][0])) {
            ((ArrayList)localObject1).add(com.android.dazhihui.c.a.a.E[i1][0]);
          }
          if (!((ArrayList)localObject2).contains(com.android.dazhihui.c.a.a.E[i1][2])) {
            ((ArrayList)localObject2).add(com.android.dazhihui.c.a.a.E[i1][2]);
          }
          i1 += 1;
        }
      }
      if ((((ArrayList)localObject1).size() == 1) && (((ArrayList)localObject2).size() == 1))
      {
        localObject2 = new Intent(getActivity(), OfflineCapitalDetailActivity.class);
        ((Intent)localObject2).putExtra("entrustName", (String)((ArrayList)localObject1).get(0) + "_" + com.android.dazhihui.c.a.a.E[0][2]);
        startActivity((Intent)localObject2);
        return;
      }
      startActivity(new Intent(getActivity(), OfflineCapitalMine.class));
      return;
    }
    localObject1 = new Intent(getActivity(), OfflineCapitalInitActivity.class);
    getActivity().startActivity((Intent)localObject1);
  }
  
  public String a(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.isEmpty())) {
      throw new NullPointerException("StringUtils: truncate(String s, int n), 参数s不能为空！");
    }
    if (paramInt <= 0) {
      throw new ArrayIndexOutOfBoundsException("StringUtils: truncate(String s, int n), 参数n不能为负数!");
    }
    int i1 = paramInt;
    if (paramInt > paramString1.getBytes(paramString2).length) {
      i1 = paramString1.getBytes(paramString2).length;
    }
    byte[] arrayOfByte1 = new byte[i1];
    paramInt = 0;
    int i2 = 0;
    while (paramInt < paramString1.length())
    {
      byte[] arrayOfByte2 = String.valueOf(paramString1.charAt(paramInt)).getBytes(paramString2);
      if (arrayOfByte2.length > i1 - i2) {
        break;
      }
      int i3 = 0;
      while (i3 < arrayOfByte2.length)
      {
        arrayOfByte1[i2] = arrayOfByte2[i3];
        i3 += 1;
        i2 += 1;
      }
      paramInt += 1;
    }
    return new String(arrayOfByte1, 0, i2, paramString2);
  }
  
  public void a()
  {
    Object localObject;
    label173:
    String str;
    long l1;
    if (w.a().l())
    {
      this.c = w.a().f();
      this.d = w.a().t();
      this.D.setVisibility(0);
      this.p.setVisibility(8);
      i1 = w.a().e();
      if ((i1 == 1) || (i1 == 2))
      {
        if (TextUtils.isEmpty(w.a().g())) {
          w.a().c(w.a().g());
        }
        b();
        localObject = "";
        int i2 = ti.c.lastIndexOf("/");
        if (i2 > -1) {
          if (i1 != 1) {
            break label173;
          }
        }
        for (localObject = ti.c.substring(0, i2) + "/96";; localObject = ti.c.substring(0, i2) + "/100")
        {
          w.a().a((String)localObject);
          r.a(getActivity(), (String)localObject, this.E, false);
          w.a().b = 0;
          return;
        }
      }
      if (TextUtils.isEmpty(w.a().g()))
      {
        this.s.setText(this.c);
        this.F.setText(this.c);
        localObject = r.a(getActivity(), "UnceasingUpdateImageCache");
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        str = b(this.c);
        str = String.format(com.android.dazhihui.a.f.k, new Object[] { str });
        localObject = new File((File)localObject, com.android.dazhihui.ui.widget.a.x.c(str));
        if (!((File)localObject).exists()) {
          break label443;
        }
        l1 = ((File)localObject).lastModified();
        if (com.android.dazhihui.ui.a.m.a().J() == null) {
          break label504;
        }
      }
    }
    label443:
    label459:
    label504:
    for (int i1 = com.android.dazhihui.ui.a.m.a().J().getPeriod();; i1 = 0)
    {
      l1 = System.currentTimeMillis() - l1;
      if ((l1 >= i1 * 60 * 1000) || (l1 <= 0L)) {
        r.a(getActivity(), str, this.E, true);
      }
      for (;;)
      {
        w.a().a(str);
        if (!this.d) {
          break label459;
        }
        this.H.setVisibility(0);
        return;
        this.s.setText(w.a().g());
        this.F.setText(w.a().g());
        break;
        this.E.setImageBitmap(BitmapFactory.decodeFile(((File)localObject).getAbsolutePath()));
        continue;
        r.a(getActivity(), str, this.E, false);
      }
      this.H.setVisibility(8);
      return;
      this.D.setVisibility(8);
      this.o.setVisibility(8);
      this.p.setVisibility(0);
      this.p.setOnClickListener(this);
      return;
    }
  }
  
  public void a(wk paramwk)
  {
    this.W = paramwk;
  }
  
  public void a(y paramy)
  {
    int i1;
    if (paramy == y.a) {
      i1 = -14404792;
    }
    for (this.y = getResources().getDrawable(2130838357);; this.y = getResources().getDrawable(2130838382))
    {
      this.f.setDivider(new ColorDrawable(i1));
      this.f.setDividerHeight(getResources().getDimensionPixelOffset(2131230859));
      this.B.setBackgroundColor(i1);
      this.e.setBackgroundDrawable(this.y);
      return;
      i1 = -13347456;
    }
  }
  
  public void a(String paramString)
  {
    if ((this.i == null) || (this.i.size() == 0))
    {
      ah.e.remove(paramString);
      com.android.dazhihui.b.b.a().a((byte)101);
    }
    while (TextUtils.isEmpty(paramString)) {
      return;
    }
    for (;;)
    {
      try
      {
        i1 = Integer.valueOf(paramString).intValue();
        Iterator localIterator = this.i.iterator();
        if (localIterator.hasNext())
        {
          LeftMenuConfigVo.LeftMenuItem localLeftMenuItem = (LeftMenuConfigVo.LeftMenuItem)localIterator.next();
          if (localLeftMenuItem.countId != i1) {
            continue;
          }
          localLeftMenuItem.isShowRed = true;
          i1 = 1;
          if (i1 == 0)
          {
            ah.e.remove(paramString);
            ah.a().b(10001);
            com.android.dazhihui.b.b.a().a((byte)101);
            return;
          }
          d();
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        return;
      }
      int i1 = 0;
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    if ((paramInt != ah.o) || (!ah.e.containsKey(paramString))) {
      return;
    }
    a(paramString);
  }
  
  public void b()
  {
    w localw = w.a();
    localw.g();
    String str;
    if (TextUtils.isEmpty(localw.g())) {
      try
      {
        str = a(localw.f(), 16, "GBK");
        if (str.length() < localw.f().length())
        {
          this.F.setText(str + "...");
          return;
        }
        this.F.setText(str);
        return;
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        return;
      }
    }
    try
    {
      str = a(localException1.g(), 16, "GBK");
      if (str.length() < localException1.g().length())
      {
        this.F.setText(str + "...");
        return;
      }
    }
    catch (Exception localException2)
    {
      localException2.printStackTrace();
      return;
    }
    this.F.setText(str);
  }
  
  public void c()
  {
    this.i = LeftMenuConfigManager.getInstace().getLeftMenu();
    this.j.clear();
    if ((this.i == null) || (this.i.size() <= 0))
    {
      int i1 = 0;
      while (i1 < this.T.length)
      {
        gf localgf = new gf(this);
        localgf.a = this.T[i1];
        localgf.c = this.U[i1];
        this.j.add(i1, localgf);
        i1 += 1;
      }
    }
  }
  
  public void changeLookFace(y paramy)
  {
    a(paramy);
  }
  
  public void d()
  {
    if ((isDetached()) || (getActivity() == null)) {
      return;
    }
    this.i = LeftMenuConfigManager.getInstace().getLeftMenu();
    int i2 = this.k.g().size() + this.k.o().size() + this.k.l().size() + this.k.q().size();
    this.b = com.android.dazhihui.b.b.a().c();
    if ((this.i != null) && (this.i.size() > 0))
    {
      this.j.clear();
      int i1 = 0;
      if (i1 < this.i.size())
      {
        gf localgf = new gf(this);
        localgf.d = ((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).imagepath;
        localgf.a = ((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).menuname;
        localgf.e = ((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).countId;
        if (((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).countId == 20256) {
          localgf.b = i2;
        }
        for (;;)
        {
          this.j.add(i1, localgf);
          i1 += 1;
          break;
          if (((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).countId == 20225)
          {
            if (this.x) {
              localgf.b = this.h;
            } else {
              localgf.b = 0;
            }
          }
          else if (((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).countId == 20229)
          {
            if (this.b == null)
            {
              ga localga = new ga(this);
              this.b = ((PublicWidomMessageVo)DzhApplication.a().b().a("wisdomMessage", localga));
            }
            localgf.b = this.k.d().size();
          }
          else if (((LeftMenuConfigVo.LeftMenuItem)this.i.get(i1)).isShowRed)
          {
            localgf.b = 1;
          }
          else
          {
            localgf.b = 0;
          }
        }
      }
    }
    else
    {
      ((gf)this.j.get(0)).b = i2;
    }
    this.g.notifyDataSetChanged();
  }
  
  public void e()
  {
    if (w.a().l())
    {
      g();
      h();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    int i2;
    int i3;
    int i1;
    if ((paramj instanceof o))
    {
      paramj = ((o)paramj).h();
      if ((paramj != null) && (paramj.b != null))
      {
        if (paramj.a != 3001) {
          break label1178;
        }
        paramh = new com.android.dazhihui.a.b.q(paramj.b);
        if (paramh.b() == 2)
        {
          i2 = paramh.e();
          paramh.e();
          paramh.e();
          com.android.dazhihui.ui.a.m.a().c(paramh.h());
          if (i2 == 519) {
            if (paramh.e() == 0)
            {
              paramj = paramh.m();
              i3 = paramj.length;
              i1 = 0;
            }
          }
        }
      }
    }
    for (;;)
    {
      Object localObject2;
      JSONObject localJSONObject;
      if (i1 < i3)
      {
        Object localObject1 = paramj[i1];
        for (;;)
        {
          long l1;
          int i4;
          try
          {
            localObject1 = new JSONObject((String)localObject1);
            l1 = ((JSONObject)localObject1).optLong("md") & 0xFFFFFF;
            i4 = ((JSONObject)localObject1).optInt("mt");
            if (i4 == 0)
            {
              localObject2 = this.l.f();
              this.l.g();
              if ((localObject2 == null) || ((localObject2 != null) && (((l)localObject2).a != l1)))
              {
                localObject2 = new l();
                ((l)localObject2).a = ((int)l1);
                ((l)localObject2).d = ((JSONObject)localObject1).optString("des");
                ((l)localObject2).e = (((JSONObject)localObject1).optLong("pt") * 1000L);
                localObject1 = ((JSONObject)localObject1).optJSONObject("exp");
                if (localObject1 != null)
                {
                  ((l)localObject2).b = ((JSONObject)localObject1).optString("StkCode");
                  ((l)localObject2).c = ((JSONObject)localObject1).optString("StkName");
                }
                this.k.a((l)localObject2, true);
              }
              d();
              break;
            }
            if (i4 == 1)
            {
              localObject2 = this.l.b(0);
              this.l.g();
              if ((localObject2 != null) && ((localObject2 == null) || (((k)localObject2).a == l1))) {
                continue;
              }
              localObject2 = new k();
              ((k)localObject2).a = ((int)l1);
              ((k)localObject2).f = ((JSONObject)localObject1).optString("des");
              ((k)localObject2).g = (((JSONObject)localObject1).optLong("pt") * 1000L);
              localObject1 = ((JSONObject)localObject1).optJSONObject("exp");
              if (localObject1 != null)
              {
                ((k)localObject2).b = ((JSONObject)localObject1).optString("rt");
                ((k)localObject2).c = ((JSONObject)localObject1).optInt("ty");
                ((k)localObject2).d = ((JSONObject)localObject1).optString("url");
                ((k)localObject2).e = ((JSONObject)localObject1).optString("code");
              }
              ((k)localObject2).h = 0;
              this.k.a((k)localObject2, true);
              continue;
            }
            if (i4 != 2) {
              break label625;
            }
          }
          catch (JSONException localJSONException1)
          {
            localJSONException1.printStackTrace();
          }
          localObject2 = this.l.d();
          this.l.g();
          if ((localObject2 == null) || ((localObject2 != null) && (((com.android.dazhihui.b.h)localObject2).a != l1)))
          {
            localObject2 = new com.android.dazhihui.b.h();
            ((com.android.dazhihui.b.h)localObject2).a = ((int)l1);
            ((com.android.dazhihui.b.h)localObject2).f = localJSONException1.optString("des");
            ((com.android.dazhihui.b.h)localObject2).g = (localJSONException1.optLong("pt") * 1000L);
            localJSONObject = localJSONException1.optJSONObject("exp");
            if (localJSONObject != null) {
              ((com.android.dazhihui.b.h)localObject2).e = localJSONObject.optString("Url");
            }
            this.k.a((com.android.dazhihui.b.h)localObject2, true);
            continue;
            label625:
            if (i4 == 3)
            {
              localObject2 = this.l.b(3);
              this.l.g();
              if ((localObject2 == null) || ((localObject2 != null) && (((k)localObject2).a != l1)))
              {
                localObject2 = new k();
                ((k)localObject2).a = ((int)l1);
                ((k)localObject2).f = localJSONObject.optString("des");
                ((k)localObject2).g = (localJSONObject.optLong("pt") * 1000L);
                localJSONObject = localJSONObject.optJSONObject("exp");
                if (localJSONObject != null)
                {
                  ((k)localObject2).b = localJSONObject.optString("rt");
                  ((k)localObject2).c = localJSONObject.optInt("ty");
                  ((k)localObject2).d = localJSONObject.optString("url");
                  ((k)localObject2).e = localJSONObject.optString("code");
                }
                ((k)localObject2).h = 3;
                this.k.b((k)localObject2, true);
              }
            }
          }
        }
        i1 = paramh.h();
        paramj = paramh.l();
        System.out.println("error code:   " + i1 + "     message:    " + paramj);
      }
      if (i2 == 521) {
        if (paramh.e() > 0)
        {
          paramj = this.l.b();
          this.l.g();
          paramh = paramh.m();
          i3 = paramh.length;
          i1 = 0;
          if (i1 >= i3) {
            break label1173;
          }
          localJSONObject = paramh[i1];
        }
      }
      for (;;)
      {
        try
        {
          localJSONObject = new JSONObject(localJSONObject);
          i2 = (int)localJSONObject.optLong("md");
          localObject2 = new com.android.dazhihui.b.g();
          ((com.android.dazhihui.b.g)localObject2).a = (i2 & 0xFFFFFF);
          ((com.android.dazhihui.b.g)localObject2).b = localJSONObject.optInt("mt");
          ((com.android.dazhihui.b.g)localObject2).c = localJSONObject.optInt("mst");
          ((com.android.dazhihui.b.g)localObject2).d = localJSONObject.optString("res");
          ((com.android.dazhihui.b.g)localObject2).e = localJSONObject.optString("ct");
          ((com.android.dazhihui.b.g)localObject2).f = (localJSONObject.optLong("pt") * 1000L);
          ((com.android.dazhihui.b.g)localObject2).g = localJSONObject.optString("des");
          ((com.android.dazhihui.b.g)localObject2).h = localJSONObject.optString("exp");
          i2 = 0;
          if (i2 >= paramj.size()) {
            break label1708;
          }
          if (((com.android.dazhihui.b.g)paramj.get(i2)).a != ((com.android.dazhihui.b.g)localObject2).a) {
            continue;
          }
          i2 = 0;
          if (i2 != 0) {
            this.k.a((com.android.dazhihui.b.g)localObject2, true);
          }
        }
        catch (JSONException localJSONException2)
        {
          localJSONException2.printStackTrace();
          continue;
        }
        i1 += 1;
        break;
        i2 += 1;
        continue;
        i1 = paramh.h();
        paramh = paramh.l();
        System.out.println("error code:   " + i1 + "     message:    " + paramh);
        label1173:
        d();
        label1177:
        label1178:
        label1400:
        label1448:
        do
        {
          do
          {
            do
            {
              break label1177;
              do
              {
                return;
              } while (paramj.a != 2972);
              paramh = (String)paramh.j();
              Log.d("leftMenu", paramh);
              if (!paramh.equals("167")) {
                break;
              }
              paramh = new com.android.dazhihui.a.b.q(paramj.b);
              for (;;)
              {
                try
                {
                  paramh.b();
                  i1 = paramh.e();
                  paramh.e();
                  paramh.e();
                  if (i1 != 167) {
                    break;
                  }
                  paramh = paramh.l();
                  try
                  {
                    paramh = new JSONObject(paramh);
                    i1 = paramh.optInt("result", 3);
                    if (i1 != 0) {
                      break label1448;
                    }
                    paramh = Double.valueOf(paramh.optDouble("coins", 0.0D));
                    this.G.setVisibility(0);
                    if (paramh.doubleValue() < 0.0D)
                    {
                      paramh = "0";
                      this.R = paramh;
                      this.G.setText(paramh + "币");
                      return;
                    }
                  }
                  catch (JSONException paramh)
                  {
                    paramh.printStackTrace();
                    return;
                  }
                  if (paramh.doubleValue() >= 100000.0D) {
                    break label1400;
                  }
                }
                catch (Exception paramh)
                {
                  paramh.printStackTrace();
                  return;
                }
                paramh = paramh + "";
                continue;
                double d1 = Math.round(paramh.doubleValue() * 100.0D / 10000.0D) / 100.0D;
                paramh = Double.valueOf(d1) + "万";
              }
            } while (i1 != 1);
            return;
          } while (!paramh.equals("108"));
          paramh = new com.android.dazhihui.a.b.q(paramj.b);
          paramh.b();
          i1 = paramh.e();
          paramh.e();
          paramh.e();
        } while (i1 != 108);
        paramh.h();
        i1 = paramh.h();
        if (getActivity() != null) {
          getActivity().getSharedPreferences("userLevel", 0).edit().putInt(w.a().f(), i1).commit();
        }
        this.Q = i1;
        if (i1 >= 1)
        {
          this.I.setBackgroundResource(2130838045);
          if (i1 < 2) {
            break label1658;
          }
          this.J.setBackgroundResource(2130838045);
          label1596:
          if (i1 < 3) {
            break label1671;
          }
          this.K.setBackgroundResource(2130838045);
          label1612:
          if (i1 < 4) {
            break label1684;
          }
          this.L.setBackgroundResource(2130838045);
        }
        for (;;)
        {
          if (i1 < 5) {
            break label1697;
          }
          this.M.setBackgroundResource(2130838045);
          return;
          this.I.setBackgroundResource(2130838046);
          break;
          label1658:
          this.J.setBackgroundResource(2130838046);
          break label1596;
          label1671:
          this.K.setBackgroundResource(2130838046);
          break label1612;
          label1684:
          this.L.setBackgroundResource(2130838046);
        }
        label1697:
        this.M.setBackgroundResource(2130838046);
        return;
        label1708:
        i2 = 1;
      }
      i1 += 1;
    }
  }
  
  public void leftDataHave()
  {
    d();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131559670: 
    case 2131559671: 
    case 2131559667: 
    case 2131559672: 
    case 2131559651: 
    case 2131559654: 
    case 2131561345: 
      Bundle localBundle;
      do
      {
        return;
        com.android.dazhihui.d.n.a("", 1172);
        startActivity(new Intent(getActivity(), SystemSetingScreen.class));
        return;
        com.android.dazhihui.d.n.a("", 20227);
        paramView = com.android.dazhihui.c.a.d.a();
        if (this.mLookFace == y.a)
        {
          com.android.dazhihui.g.a().a(y.b);
          paramView.a("dzh_look_face", 1);
          paramView.g();
        }
        for (this.mLookFace = y.b;; this.mLookFace = y.a)
        {
          setLookFace();
          if (this.W != null) {
            this.W.g();
          }
          a(this.mLookFace);
          return;
          com.android.dazhihui.g.a().a(y.a);
          paramView.a("dzh_look_face", 0);
          paramView.g();
        }
        paramView = new Intent(getActivity(), LoginMainScreen.class);
        paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        paramView.putExtra("CAN_showSyncSettingDialog", true);
        startActivity(paramView);
        return;
        com.android.dazhihui.d.n.a("", 20228);
        paramView = new Intent(getActivity(), BrowserActivity.class);
        localBundle = new Bundle();
        localBundle.putString("nexturl", "http://120.26.113.153/client/service.html");
        paramView.putExtras(localBundle);
        startActivity(paramView);
        return;
        ti.a(getActivity());
        return;
      } while (this.C == null);
      if (TextUtils.isEmpty(this.C.e))
      {
        paramView = new Intent();
        paramView.putExtra("type", (byte)2);
        paramView.setClass(getActivity(), MessageCenterList.class);
        startActivity(paramView);
      }
      for (;;)
      {
        this.k.c(this.C.a);
        this.C = null;
        return;
        paramView = new Intent(getActivity(), BrowserActivity.class);
        localBundle = new Bundle();
        localBundle.putString("nexturl", this.C.e);
        localBundle.putBoolean("isToMain", false);
        localBundle.putString("names", getResources().getString(2131165355));
        paramView.putExtras(localBundle);
        startActivity(paramView);
      }
    case 2131559655: 
      this.S.b();
      return;
    case 2131559677: 
      this.S.c();
      return;
    case 2131559675: 
      com.android.dazhihui.d.n.a("", 1341);
      paramView = b(this.c);
      paramView = String.format(com.android.dazhihui.a.f.k, new Object[] { paramView });
      this.a.a(paramView, new gb(this, paramView));
      this.S.c();
      return;
    }
    com.android.dazhihui.d.n.a("", 1342);
    paramView = b(this.c);
    paramView = String.format(com.android.dazhihui.a.f.k, new Object[] { paramView });
    this.a.b(paramView, new gc(this, paramView));
    this.S.c();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.n = paramLayoutInflater;
    this.e = paramLayoutInflater.inflate(2130903240, paramViewGroup, false);
    this.f = ((ListView)this.e.findViewById(2131559678));
    this.o = this.e.findViewById(2131559651);
    this.p = this.e.findViewById(2131559667);
    this.r = ((CircleImageView)this.e.findViewById(2131559652));
    this.s = ((TextView)this.e.findViewById(2131559653));
    this.t = ((TextView)this.e.findViewById(2131559670));
    this.u = ((TextView)this.e.findViewById(2131559671));
    this.v = ((TextView)this.e.findViewById(2131559672));
    this.B = this.e.findViewById(2131559679);
    this.I = ((ImageView)this.e.findViewById(2131559660));
    this.J = ((ImageView)this.e.findViewById(2131559661));
    this.K = ((ImageView)this.e.findViewById(2131559662));
    this.L = ((ImageView)this.e.findViewById(2131559663));
    this.M = ((ImageView)this.e.findViewById(2131559664));
    this.D = this.e.findViewById(2131559654);
    this.E = ((CircleImageView)this.e.findViewById(2131559655));
    this.F = ((TextView)this.e.findViewById(2131559657));
    this.H = ((ImageView)this.e.findViewById(2131559656));
    this.H.setVisibility(8);
    this.G = ((TextView)this.e.findViewById(2131559665));
    this.N = ((RatingBar)this.e.findViewById(2131559658));
    this.S = ((PopupMenu)this.e.findViewById(2131559673));
    paramLayoutInflater = this.S.findViewById(2131559675);
    paramViewGroup = this.S.findViewById(2131559676);
    paramBundle = this.S.findViewById(2131559677);
    this.a = new bj(getActivity());
    paramLayoutInflater.setOnClickListener(this);
    paramViewGroup.setOnClickListener(this);
    paramBundle.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.u.setOnClickListener(this);
    this.t.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.E.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.q = new fv(this);
    LeftMenuConfigManager.getInstace().LoadLeftMenuConfig();
    LeftMenuConfigManager.getInstace().setLeftDataHaveListener(this);
    c();
    this.g = new gd(this);
    this.g.a(this.j);
    this.f.setAdapter(this.g);
    this.f.setOnItemClickListener(new fw(this));
    f();
    this.w = new fx(this, 16);
    a(this.mLookFace);
    this.z = new fy(this);
    this.A = new fz(this);
    this.V = new com.g.a.b.f().b(2130838453).c(2130838453).a(true).b(true).a();
    DzhPushService.a(this);
    if (ah.e.size() != 0)
    {
      paramLayoutInflater = ah.e.keySet().iterator();
      while (paramLayoutInflater.hasNext()) {
        a((String)paramLayoutInflater.next());
      }
    }
    return this.e;
  }
  
  public void onDestroy()
  {
    ah.a().b(this.w);
    w.a().b(this.q);
    com.android.dazhihui.b.b.a().b(this.z);
    com.android.dazhihui.b.b.a().b(this.A);
    DzhPushService.b(this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    w.a().a(this.q);
    com.android.dazhihui.b.b.a().a(this.z);
    com.android.dazhihui.b.b.a().a(this.A);
    a();
    d();
    ah.a().a(this.w);
    com.android.dazhihui.b.b.a().a(false);
    com.android.dazhihui.b.b.a().s();
  }
  
  public void onStop()
  {
    super.onStop();
    com.android.dazhihui.b.b.a().a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */