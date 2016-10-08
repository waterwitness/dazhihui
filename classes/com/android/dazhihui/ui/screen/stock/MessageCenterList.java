package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b.b;
import com.android.dazhihui.b.i;
import com.android.dazhihui.b.k;
import com.android.dazhihui.b.l;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MessageListView;
import com.android.dazhihui.ui.widget.WriteableImageView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.ho;
import com.android.dazhihui.w;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageCenterList
  extends BaseActivity
  implements View.OnClickListener, i, cp, cs
{
  private long A = 0L;
  private TextView B;
  private ImageView C;
  private TextView D;
  private LinearLayout E;
  private TextView F;
  private LinearLayout G;
  private TextView H;
  private LinearLayout I;
  private LinearLayout J;
  private TextView K;
  private Handler L = new ix(this);
  private final int a = 0;
  private final int b = 1;
  private final int c = 2;
  private final int d = 3;
  private DzhHeader e;
  private RelativeLayout f;
  private WriteableImageView g;
  private MessageListView h;
  private ImageView i;
  private iz j;
  private byte k = 5;
  private ho l;
  private ct m;
  private b n = b.a();
  private d o = d.a();
  private List<com.android.dazhihui.b.g> p = new ArrayList();
  private List<com.android.dazhihui.b.h> q = new ArrayList();
  private List<l> r = new ArrayList();
  private List<k> s = new ArrayList();
  private List<k> t = new ArrayList();
  private LayoutInflater u;
  private DateFormat v = new SimpleDateFormat("yyyy-MM-dd");
  private DateFormat w = new SimpleDateFormat("HH:mm");
  private String[] x;
  private com.android.dazhihui.a.b.m y;
  private String z = null;
  
  private void c()
  {
    switch (this.k)
    {
    case 4: 
    default: 
      this.o.g();
      if ((this.k == 0) && (this.s.size() <= 0)) {
        this.i.setVisibility(0);
      }
      break;
    }
    for (;;)
    {
      this.j.notifyDataSetChanged();
      return;
      this.n.m();
      this.s = this.o.a(0);
      break;
      this.n.i();
      this.r = this.o.e();
      break;
      this.n.k();
      this.q = this.o.c();
      break;
      this.n.p();
      this.t = this.o.a(3);
      break;
      this.n.m();
      this.s = this.o.a(0);
      this.n.i();
      this.r = this.o.e();
      this.n.k();
      this.q = this.o.c();
      this.n.p();
      this.t = this.o.a(3);
      this.n.j();
      this.p = this.o.b();
      break;
      if ((this.k == 1) && (this.r.size() <= 0)) {
        this.i.setVisibility(0);
      } else if ((this.k == 2) && (this.q.size() <= 0)) {
        this.i.setVisibility(0);
      } else if ((this.k == 3) && (this.t.size() <= 0)) {
        this.i.setVisibility(0);
      } else if ((this.k == 5) && (this.p.size() <= 0)) {
        this.i.setVisibility(0);
      } else {
        this.i.setVisibility(8);
      }
    }
  }
  
  private void d()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(518);
    localx.a(w.a().f());
    localx.a(com.android.dazhihui.g.a().v());
    localx.b(com.android.dazhihui.g.a().ac());
    localx.a(com.android.dazhihui.g.a().r());
    switch (this.k)
    {
    }
    for (;;)
    {
      localx.c(0);
      localx.c(10);
      localx.b(1);
      ((x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
      localObject = new com.android.dazhihui.a.b.m((x)localObject, n.a);
      registRequestListener((com.android.dazhihui.a.b.h)localObject);
      sendRequest((com.android.dazhihui.a.b.h)localObject);
      return;
      localx.c(1);
      continue;
      localx.c(0);
      continue;
      localx.c(2);
      continue;
      localx.c(3);
    }
  }
  
  private void e()
  {
    x localx1 = new x(3001);
    localx1.b(2);
    x localx2 = new x(521);
    localx2.a(w.a().f());
    localx2.a(com.android.dazhihui.g.a().v());
    localx2.b(com.android.dazhihui.g.a().ac());
    localx2.a(com.android.dazhihui.g.a().r());
    localx2.c(0);
    localx2.c(10);
    localx2.b(1);
    localx2.a(new int[] { 0, 1, 2, 3 });
    localx1.a(localx2, 1, com.android.dazhihui.ui.a.m.a().h());
    this.y = new com.android.dazhihui.a.b.m(localx1, n.a);
    registRequestListener(this.y);
    sendRequest(this.y);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public void a()
  {
    this.f = ((RelativeLayout)findViewById(2131561201));
    this.g = ((WriteableImageView)findViewById(2131561202));
    ViewGroup.LayoutParams localLayoutParams = this.g.getLayoutParams();
    localLayoutParams.width = 60;
    localLayoutParams.height = 60;
    this.f.setGravity(17);
    this.g.setPadding(20, 20, 20, 20);
    this.g.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.g.setLayoutParams(localLayoutParams);
    this.g.requestLayout();
    this.g.setBackgroundResource(2130839088);
    this.g.setVisibility(0);
    this.g.setOnClickListener(new iu(this));
  }
  
  public void a(byte paramByte)
  {
    if (paramByte == 100) {
      return;
    }
    if (paramByte == this.k) {
      this.L.sendEmptyMessage(1);
    }
    Message localMessage = Message.obtain();
    localMessage.arg1 = paramByte;
    this.L.sendMessage(localMessage);
  }
  
  public void a(byte paramByte, int paramInt)
  {
    switch (paramByte)
    {
    default: 
      this.H.setTag(null);
      this.I.setTag(null);
      this.K.setTag(null);
      this.J.setTag(null);
    case 4: 
      if (this.I.getVisibility() == 0)
      {
        this.H.setOnClickListener(this);
        label86:
        if (paramInt != 0) {
          break label2167;
        }
        this.B.setVisibility(0);
        this.B.setText(this.z);
      }
      break;
    }
    label300:
    label358:
    label515:
    label566:
    label790:
    label996:
    label1185:
    label1258:
    label1415:
    label1510:
    label1725:
    label1773:
    label1807:
    Object localObject5;
    label2066:
    label2117:
    label2142:
    label2167:
    do
    {
      return;
      Object localObject6 = new k();
      this.E.setVisibility(8);
      Object localObject7;
      Object localObject1;
      if (this.k == 5)
      {
        ((k)localObject6).a = ((com.android.dazhihui.b.g)this.p.get(paramInt)).a;
        ((k)localObject6).f = ((com.android.dazhihui.b.g)this.p.get(paramInt)).g;
        ((k)localObject6).g = ((com.android.dazhihui.b.g)this.p.get(paramInt)).f;
        localObject7 = ((com.android.dazhihui.b.g)this.p.get(paramInt)).h;
        localObject1 = localObject6;
        if (localObject7 != null)
        {
          localObject1 = localObject6;
          if (((String)localObject7).equals("")) {}
        }
        try
        {
          localObject1 = new JSONObject((String)localObject7);
          ((k)localObject6).b = ((JSONObject)localObject1).optString("rt");
          ((k)localObject6).c = ((JSONObject)localObject1).optInt("ty");
          ((k)localObject6).d = ((JSONObject)localObject1).optString("url");
          ((k)localObject6).e = ((JSONObject)localObject1).optString("code");
          localObject1 = localObject6;
        }
        catch (JSONException localJSONException1)
        {
          for (;;)
          {
            localJSONException1.printStackTrace();
            localObject2 = localObject6;
          }
        }
        this.D.setText("自选股消息");
        if ((!TextUtils.isEmpty(((k)localObject1).d)) || (!TextUtils.isEmpty(((k)localObject1).e))) {
          break label515;
        }
        this.G.setBackgroundResource(2130838528);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        this.H.setTag(localObject1);
        this.I.setTag(localObject1);
        this.J.setTag(localObject1);
        if (paramInt > 0) {
          if (this.k != 5) {
            break label566;
          }
        }
      }
      Object localObject2;
      for (this.A = ((com.android.dazhihui.b.g)this.p.get(paramInt - 1)).f;; this.A = ((k)this.s.get(paramInt - 1)).g)
      {
        this.z = this.v.format(new Date(((k)localObject1).g));
        this.C.setImageResource(2130839097);
        this.F.setText(this.w.format(new Date(((k)localObject1).g)));
        this.H.setText(((k)localObject1).f);
        break;
        localObject2 = (k)this.s.get(paramInt);
        break label300;
        this.G.setBackgroundResource(2130838529);
        if (TextUtils.isEmpty(((k)localObject2).d)) {
          this.I.setVisibility(8);
        }
        if (!TextUtils.isEmpty(((k)localObject2).e)) {
          break label358;
        }
        this.J.setVisibility(8);
        break label358;
      }
      this.G.setBackgroundResource(2130838529);
      this.I.setVisibility(8);
      this.E.setVisibility(0);
      this.E.setOnClickListener(new iv(this));
      localObject6 = new l();
      if (this.k == 5)
      {
        ((l)localObject6).a = ((com.android.dazhihui.b.g)this.p.get(paramInt)).a;
        ((l)localObject6).d = ((com.android.dazhihui.b.g)this.p.get(paramInt)).g;
        ((l)localObject6).e = ((com.android.dazhihui.b.g)this.p.get(paramInt)).f;
        localObject7 = ((com.android.dazhihui.b.g)this.p.get(paramInt)).h;
        localObject2 = localObject6;
        if (localObject7 != null)
        {
          localObject2 = localObject6;
          if (((String)localObject7).equals("")) {}
        }
        try
        {
          localObject2 = new JSONObject((String)localObject7);
          ((l)localObject6).b = ((JSONObject)localObject2).optString("StkCode");
          ((l)localObject6).c = ((JSONObject)localObject2).optString("StkName");
          localObject2 = localObject6;
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            localJSONException2.printStackTrace();
            localObject3 = localObject6;
          }
        }
        if (paramInt > 0) {
          if (this.k != 5) {
            break label996;
          }
        }
      }
      Object localObject3;
      for (this.A = ((com.android.dazhihui.b.g)this.p.get(paramInt - 1)).f;; this.A = ((l)this.r.get(paramInt - 1)).e)
      {
        this.D.setText("股价预警");
        this.z = this.v.format(new Date(((l)localObject2).e));
        this.C.setImageResource(2130838054);
        this.F.setText(this.w.format(new Date(((l)localObject2).e)));
        this.H.setText(((l)localObject2).c + "(" + ((l)localObject2).b + ") " + ((l)localObject2).d);
        this.H.setTag(localObject2);
        this.I.setTag(localObject2);
        this.J.setTag(localObject2);
        break;
        localObject3 = (l)this.r.get(paramInt);
        break label790;
      }
      localObject6 = new com.android.dazhihui.b.h();
      this.E.setVisibility(8);
      if (this.k == 5)
      {
        localObject7 = ((com.android.dazhihui.b.g)this.p.get(paramInt)).h;
        ((com.android.dazhihui.b.h)localObject6).a = ((com.android.dazhihui.b.g)this.p.get(paramInt)).a;
        ((com.android.dazhihui.b.h)localObject6).f = ((com.android.dazhihui.b.g)this.p.get(paramInt)).g;
        ((com.android.dazhihui.b.h)localObject6).g = ((com.android.dazhihui.b.g)this.p.get(paramInt)).f;
        localObject3 = localObject6;
        if (localObject7 != null)
        {
          localObject3 = localObject6;
          if (((String)localObject7).equals("")) {}
        }
        try
        {
          localObject7 = new JSONObject((String)localObject7);
          localObject3 = localObject6;
          if (localObject7 != null)
          {
            ((com.android.dazhihui.b.h)localObject6).e = ((JSONObject)localObject7).optString("Url");
            localObject3 = localObject6;
          }
        }
        catch (JSONException localJSONException3)
        {
          for (;;)
          {
            localJSONException3.printStackTrace();
            localObject4 = localObject6;
          }
        }
        this.D.setText("公共消息");
        if ((!TextUtils.isEmpty(((com.android.dazhihui.b.h)localObject3).e)) || (!TextUtils.isEmpty(((com.android.dazhihui.b.h)localObject3).c)) || ((((com.android.dazhihui.b.h)localObject3).d != 0) && (((com.android.dazhihui.b.h)localObject3).d != 1))) {
          break label1415;
        }
        this.G.setBackgroundResource(2130838528);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        if (paramInt > 0) {
          if (this.k != 5) {
            break label1510;
          }
        }
      }
      Object localObject4;
      for (this.A = ((com.android.dazhihui.b.g)this.p.get(paramInt - 1)).f;; this.A = ((com.android.dazhihui.b.h)this.q.get(paramInt - 1)).g)
      {
        this.z = this.v.format(new Date(((com.android.dazhihui.b.h)localObject3).g));
        this.C.setImageResource(2130838041);
        this.F.setText(this.w.format(new Date(((com.android.dazhihui.b.h)localObject3).g)));
        this.H.setText(((com.android.dazhihui.b.h)localObject3).f);
        this.H.setTag(localObject3);
        this.I.setTag(localObject3);
        this.J.setTag(localObject3);
        break;
        localObject4 = (com.android.dazhihui.b.h)this.q.get(paramInt);
        break label1185;
        this.G.setBackgroundResource(2130838529);
        if ((((com.android.dazhihui.b.h)localObject4).d == 0) || (((com.android.dazhihui.b.h)localObject4).d == 1))
        {
          if (TextUtils.isEmpty(((com.android.dazhihui.b.h)localObject4).e)) {
            this.I.setVisibility(8);
          }
          if (!TextUtils.isEmpty(((com.android.dazhihui.b.h)localObject4).c)) {
            break label1258;
          }
          this.J.setVisibility(8);
          break label1258;
        }
        this.J.setVisibility(8);
        if (((com.android.dazhihui.b.h)localObject4).d != 2) {
          break label1258;
        }
        this.I.setVisibility(8);
        break label1258;
      }
      this.E.setVisibility(8);
      localObject6 = new k();
      if (this.k == 5)
      {
        ((k)localObject6).a = ((com.android.dazhihui.b.g)this.p.get(paramInt)).a;
        ((k)localObject6).f = ((com.android.dazhihui.b.g)this.p.get(paramInt)).g;
        ((k)localObject6).g = ((com.android.dazhihui.b.g)this.p.get(paramInt)).f;
        localObject7 = ((com.android.dazhihui.b.g)this.p.get(paramInt)).h;
        localObject4 = localObject6;
        if (localObject7 != null)
        {
          localObject4 = localObject6;
          if (((String)localObject7).equals("")) {}
        }
        try
        {
          localObject4 = new JSONObject((String)localObject7);
          ((k)localObject6).b = ((JSONObject)localObject4).optString("rt");
          ((k)localObject6).c = ((JSONObject)localObject4).optInt("ty");
          ((k)localObject6).d = ((JSONObject)localObject4).optString("url");
          ((k)localObject6).e = ((JSONObject)localObject4).optString("code");
          localObject4 = localObject6;
        }
        catch (JSONException localJSONException4)
        {
          for (;;)
          {
            ForegroundColorSpan localForegroundColorSpan;
            int i1;
            localJSONException4.printStackTrace();
            localObject5 = localObject6;
          }
        }
        if ((!TextUtils.isEmpty(((k)localObject4).d)) || (!TextUtils.isEmpty(((k)localObject4).e))) {
          break label2066;
        }
        this.G.setBackgroundResource(2130838528);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        if (paramInt > 0)
        {
          if (this.k != 5) {
            break label2117;
          }
          this.A = ((com.android.dazhihui.b.g)this.p.get(paramInt - 1)).f;
        }
        this.D.setText("彩票消息");
        this.z = this.v.format(new Date(((k)localObject4).g));
        this.C.setImageResource(2130837609);
        this.F.setText(this.w.format(new Date(((k)localObject4).g)));
        if ((!((k)localObject4).f.contains("期")) || (!((k)localObject4).f.contains("开"))) {
          break label2142;
        }
        localObject6 = new SpannableStringBuilder(((k)localObject4).f);
        localObject7 = new ForegroundColorSpan(getResources().getColor(2131493631));
        localForegroundColorSpan = new ForegroundColorSpan(getResources().getColor(2131493520));
        paramByte = ((k)localObject4).f.indexOf("期");
        i1 = ((k)localObject4).f.indexOf("开");
        ((SpannableStringBuilder)localObject6).setSpan(localObject7, 0, paramByte, 18);
        ((SpannableStringBuilder)localObject6).setSpan(localForegroundColorSpan, paramByte + 1, i1, 17);
        this.H.setText(((SpannableStringBuilder)localObject6).toString());
      }
      for (;;)
      {
        this.H.setTag(localObject4);
        this.I.setTag(localObject4);
        this.J.setTag(localObject4);
        break;
        localObject5 = (k)this.t.get(paramInt);
        break label1725;
        this.G.setBackgroundResource(2130838529);
        if (TextUtils.isEmpty(((k)localObject5).d)) {
          this.I.setVisibility(8);
        }
        if (!TextUtils.isEmpty(((k)localObject5).e)) {
          break label1773;
        }
        this.J.setVisibility(8);
        break label1773;
        this.A = ((k)this.t.get(paramInt - 1)).g;
        break label1807;
        this.H.setText(((k)localObject5).f);
      }
      this.H.setOnClickListener(null);
      break label86;
      localObject5 = this.v.format(new Date(this.A));
    } while (this.z.endsWith((String)localObject5));
    this.B.setVisibility(0);
    this.B.setText(this.z);
  }
  
  public void a(com.android.dazhihui.b.g paramg)
  {
    l locall = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject2 = null;
    int i3 = 0;
    int i4 = 0;
    int i2 = 0;
    int i1 = paramg.b;
    if (i1 == 0) {}
    Object localObject1;
    try
    {
      locall = new l();
      locall.a = paramg.a;
      locall.d = paramg.g;
      locall.e = paramg.f;
      localObject1 = localObject2;
      if (paramg.h != null)
      {
        localObject1 = localObject2;
        if (!paramg.h.equals("")) {
          localObject1 = new JSONObject(paramg.h);
        }
      }
      if (localObject1 != null)
      {
        locall.b = ((JSONObject)localObject1).optString("StkCode");
        locall.c = ((JSONObject)localObject1).optString("StkName");
      }
      this.r = this.o.e();
      this.o.g();
      i1 = 0;
      if (i1 >= this.r.size()) {
        break label837;
      }
      if (((l)this.r.get(i1)).a != locall.a) {
        break label844;
      }
      i1 = i2;
      if (i1 == 0) {
        break label843;
      }
      this.n.a(locall, false);
      return;
    }
    catch (JSONException paramg)
    {
      label404:
      paramg.printStackTrace();
      return;
    }
    if (i1 == 1)
    {
      localObject2 = new k();
      ((k)localObject2).a = paramg.a;
      ((k)localObject2).f = paramg.g;
      ((k)localObject2).g = paramg.f;
      localObject1 = locall;
      if (paramg.h != null)
      {
        localObject1 = locall;
        if (!paramg.h.equals("")) {
          localObject1 = new JSONObject(paramg.h);
        }
      }
      if (localObject1 != null)
      {
        ((k)localObject2).b = ((JSONObject)localObject1).optString("rt");
        ((k)localObject2).c = ((JSONObject)localObject1).optInt("ty");
        ((k)localObject2).d = ((JSONObject)localObject1).optString("url");
        ((k)localObject2).e = ((JSONObject)localObject1).optString("code");
      }
      ((k)localObject2).h = 0;
      this.s = this.o.a(0);
      this.o.g();
      i1 = 0;
      while (i1 < this.s.size())
      {
        if (((k)this.s.get(i1)).a == ((k)localObject2).a)
        {
          i1 = i3;
          if (i1 == 0) {
            break label843;
          }
          this.n.a((k)localObject2, false);
          return;
        }
        i1 += 1;
      }
    }
    if (i1 == 2)
    {
      localObject2 = new com.android.dazhihui.b.h();
      ((com.android.dazhihui.b.h)localObject2).a = paramg.a;
      ((com.android.dazhihui.b.h)localObject2).f = paramg.g;
      ((com.android.dazhihui.b.h)localObject2).g = paramg.f;
      localObject1 = localObject3;
      if (paramg.h != null)
      {
        localObject1 = localObject3;
        if (!paramg.h.equals("")) {
          localObject1 = new JSONObject(paramg.h);
        }
      }
      if (localObject1 != null) {
        ((com.android.dazhihui.b.h)localObject2).e = ((JSONObject)localObject1).optString("Url");
      }
      this.q = this.o.c();
      this.o.g();
      i1 = 0;
    }
    for (;;)
    {
      if (i1 < this.q.size())
      {
        if (((com.android.dazhihui.b.h)this.q.get(i1)).a == ((com.android.dazhihui.b.h)localObject2).a) {
          i1 = i4;
        }
      }
      else
      {
        for (;;)
        {
          label588:
          if (i1 != 0)
          {
            this.n.a((com.android.dazhihui.b.h)localObject2, false);
            return;
            if (i1 == 3)
            {
              localObject2 = new k();
              ((k)localObject2).a = paramg.a;
              ((k)localObject2).f = paramg.g;
              ((k)localObject2).g = paramg.f;
              localObject1 = localObject4;
              if (paramg.h != null)
              {
                localObject1 = localObject4;
                if (!paramg.h.equals("")) {
                  localObject1 = new JSONObject(paramg.h);
                }
              }
              if (localObject1 != null)
              {
                ((k)localObject2).b = ((JSONObject)localObject1).optString("rt");
                ((k)localObject2).c = ((JSONObject)localObject1).optInt("ty");
                ((k)localObject2).d = ((JSONObject)localObject1).optString("url");
                ((k)localObject2).e = ((JSONObject)localObject1).optString("code");
              }
              ((k)localObject2).h = 3;
              this.t = this.o.a(3);
              this.o.g();
              i1 = 0;
              label754:
              if (i1 < this.t.size()) {
                if (((k)this.t.get(i1)).a == ((k)localObject2).a) {
                  i1 = 0;
                }
              }
              for (;;)
              {
                if (i1 != 0)
                {
                  this.n.b((k)localObject2, false);
                  return;
                  i1 += 1;
                  break label754;
                  i1 = 1;
                  continue;
                  i1 = 1;
                  break label588;
                  i1 = 1;
                  break label404;
                  label837:
                  i1 = 1;
                  break;
                }
              }
            }
          }
        }
        label843:
        return;
        label844:
        i1 += 1;
        break;
      }
      i1 += 1;
    }
  }
  
  public void b()
  {
    this.e.a(this, this);
    createTitleObj(this, this.m);
    a();
  }
  
  public void b(byte paramByte) {}
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (iy.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.e == null);
      this.e.a(paramy);
      return;
    } while (this.e == null);
    this.e.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 72;
    this.m = paramct;
    this.x = getResources().getStringArray(2131361850);
    paramct.i = new ho(this, this.x, "messageCenter");
    this.l = ((ho)paramct.i);
    paramct.j = new iw(this);
    if (this.k == 5)
    {
      this.l.a(0);
      switch (this.k)
      {
      }
    }
    for (;;)
    {
      if (TextUtils.isEmpty(paramct.d)) {
        paramct.d = "全部消息";
      }
      paramct.p = this;
      return;
      if (this.k == 2)
      {
        this.l.a(1);
        break;
      }
      if (this.k == 0)
      {
        this.l.a(2);
        break;
      }
      if (this.k == 3)
      {
        this.l.a(3);
        break;
      }
      if (this.k != 1) {
        break;
      }
      this.l.a(4);
      break;
      paramct.d = getString(2131165946);
      continue;
      paramct.d = getString(2131165944);
      continue;
      paramct.d = getString(2131165947);
      continue;
      paramct.d = getString(2131165945);
      continue;
      paramct.d = getString(2131165943);
      continue;
      paramct.d = getString(2131165942);
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i3;
    int i1;
    long l1;
    int i2;
    Object localObject3;
    label259:
    label514:
    Object localObject2;
    if ((paramj instanceof o))
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.b != null) && (paramh.a == 3001))
      {
        paramh = new com.android.dazhihui.a.b.q(paramh.b);
        if (paramh.b() == 2)
        {
          i3 = paramh.e();
          paramh.e();
          paramh.e();
          com.android.dazhihui.ui.a.m.a().c(paramh.h());
          if (i3 == 518)
          {
            if (paramh.e() < 0) {
              break label1179;
            }
            paramj = paramh.m();
            int i4 = paramj.length;
            i1 = 0;
            if (i1 < i4)
            {
              Object localObject1 = paramj[i1];
              for (;;)
              {
                try
                {
                  localObject1 = new JSONObject((String)localObject1);
                  l1 = ((JSONObject)localObject1).optLong("md") & 0xFFFFFF;
                  i2 = ((JSONObject)localObject1).optInt("mt");
                  if (i2 == 0)
                  {
                    localObject3 = new l();
                    ((l)localObject3).a = ((int)l1);
                    ((l)localObject3).d = ((JSONObject)localObject1).optString("des");
                    ((l)localObject3).e = (((JSONObject)localObject1).optLong("pt") * 1000L);
                    localObject1 = ((JSONObject)localObject1).optJSONObject("exp");
                    if (localObject1 != null)
                    {
                      ((l)localObject3).b = ((JSONObject)localObject1).optString("StkCode");
                      ((l)localObject3).c = ((JSONObject)localObject1).optString("StkName");
                    }
                    this.r = this.o.e();
                    this.o.g();
                    i2 = 0;
                    if ((i2 >= this.r.size()) || (i2 >= 10)) {
                      break label1330;
                    }
                    if (((l)this.r.get(i2)).a != ((l)localObject3).a) {
                      break label1345;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                      break label1336;
                    }
                    this.n.a((l)localObject3, false);
                    break label1336;
                  }
                  if (i2 != 1) {
                    break;
                  }
                  localObject3 = new k();
                  ((k)localObject3).a = ((int)l1);
                  ((k)localObject3).f = ((JSONObject)localObject1).optString("des");
                  ((k)localObject3).g = (((JSONObject)localObject1).optLong("pt") * 1000L);
                  localObject1 = ((JSONObject)localObject1).optJSONObject("exp");
                  if (localObject1 != null)
                  {
                    ((k)localObject3).b = ((JSONObject)localObject1).optString("rt");
                    ((k)localObject3).c = ((JSONObject)localObject1).optInt("ty");
                    ((k)localObject3).d = ((JSONObject)localObject1).optString("url");
                    ((k)localObject3).e = ((JSONObject)localObject1).optString("code");
                  }
                  ((k)localObject3).h = 0;
                  this.s = this.o.a(0);
                  this.o.g();
                  i2 = 0;
                  if ((i2 >= this.s.size()) || (i2 >= 10)) {
                    break label1324;
                  }
                  if (((k)this.s.get(i2)).a == ((k)localObject3).a)
                  {
                    i2 = 0;
                    if (i2 == 0) {
                      break label1336;
                    }
                    this.n.a((k)localObject3, false);
                  }
                }
                catch (JSONException localJSONException)
                {
                  localJSONException.printStackTrace();
                }
                i2 += 1;
              }
              if (i2 == 2)
              {
                localObject3 = new com.android.dazhihui.b.h();
                ((com.android.dazhihui.b.h)localObject3).a = ((int)l1);
                ((com.android.dazhihui.b.h)localObject3).f = localJSONException.optString("des");
                ((com.android.dazhihui.b.h)localObject3).g = (localJSONException.optLong("pt") * 1000L);
                localObject2 = localJSONException.optJSONObject("exp");
                if (localObject2 != null) {
                  ((com.android.dazhihui.b.h)localObject3).e = ((JSONObject)localObject2).optString("Url");
                }
                this.q = this.o.c();
                this.o.g();
                i2 = 0;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((i2 < this.q.size()) && (i2 < 10))
      {
        if (((com.android.dazhihui.b.h)this.q.get(i2)).a == ((com.android.dazhihui.b.h)localObject3).a) {
          i2 = 0;
        }
      }
      else
      {
        for (;;)
        {
          label694:
          if (i2 != 0)
          {
            this.n.a((com.android.dazhihui.b.h)localObject3, false);
            break label1336;
            if (i2 == 3)
            {
              localObject3 = new k();
              ((k)localObject3).a = ((int)l1);
              ((k)localObject3).f = ((JSONObject)localObject2).optString("des");
              ((k)localObject3).g = (((JSONObject)localObject2).optLong("pt") * 1000L);
              localObject2 = ((JSONObject)localObject2).optJSONObject("exp");
              if (localObject2 != null)
              {
                ((k)localObject3).b = ((JSONObject)localObject2).optString("rt");
                ((k)localObject3).c = ((JSONObject)localObject2).optInt("ty");
                ((k)localObject3).d = ((JSONObject)localObject2).optString("url");
                ((k)localObject3).e = ((JSONObject)localObject2).optString("code");
              }
              ((k)localObject3).h = 3;
              this.t = this.o.a(3);
              this.o.g();
              i2 = 0;
              label851:
              if ((i2 < this.t.size()) && (i2 < 10)) {
                if (((k)this.t.get(i2)).a == ((k)localObject3).a) {
                  i2 = 0;
                }
              }
              for (;;)
              {
                if (i2 != 0)
                {
                  this.n.b((k)localObject3, false);
                  break label1336;
                  i2 += 1;
                  break label851;
                  this.L.sendEmptyMessage(1);
                  if (i3 == 521)
                  {
                    if (paramh.e() < 0) {
                      break label1257;
                    }
                    paramh = paramh.m();
                    i3 = paramh.length;
                    i1 = 0;
                    label963:
                    if (i1 < i3) {
                      paramj = paramh[i1];
                    }
                  }
                  for (;;)
                  {
                    try
                    {
                      paramj = new JSONObject(paramj);
                      localObject2 = new com.android.dazhihui.b.g();
                      ((com.android.dazhihui.b.g)localObject2).a = ((int)(paramj.optLong("md") & 0xFFFFFF));
                      ((com.android.dazhihui.b.g)localObject2).b = paramj.optInt("mt");
                      ((com.android.dazhihui.b.g)localObject2).c = paramj.optInt("mst");
                      ((com.android.dazhihui.b.g)localObject2).d = paramj.optString("res");
                      ((com.android.dazhihui.b.g)localObject2).e = paramj.optString("ct");
                      ((com.android.dazhihui.b.g)localObject2).f = (paramj.optLong("pt") * 1000L);
                      ((com.android.dazhihui.b.g)localObject2).g = paramj.optString("des");
                      ((com.android.dazhihui.b.g)localObject2).h = paramj.optString("exp");
                      this.p = this.o.b();
                      this.o.g();
                      i2 = 0;
                      if (i2 >= this.p.size()) {
                        break label1306;
                      }
                      if (((com.android.dazhihui.b.g)this.p.get(i2)).a != ((com.android.dazhihui.b.g)localObject2).a) {
                        continue;
                      }
                      i2 = 0;
                      if (i2 != 0) {
                        this.n.a((com.android.dazhihui.b.g)localObject2, false);
                      }
                      a((com.android.dazhihui.b.g)localObject2);
                    }
                    catch (JSONException paramj)
                    {
                      label1179:
                      paramj.printStackTrace();
                      continue;
                    }
                    i1 += 1;
                    break label963;
                    i1 = paramh.h();
                    paramj = paramh.l();
                    System.out.println("error code:   " + i1 + "     message:    " + paramj);
                    break;
                    i2 += 1;
                    continue;
                    this.L.sendEmptyMessage(1);
                    return;
                    label1257:
                    i1 = paramh.h();
                    paramh = paramh.l();
                    System.out.println("error code:   " + i1 + "     message:    " + paramh);
                    return;
                    label1306:
                    i2 = 1;
                  }
                  i2 = 1;
                  continue;
                  i2 = 1;
                  break label694;
                  label1324:
                  i2 = 1;
                  break label514;
                  label1330:
                  i2 = 1;
                  break;
                }
              }
            }
          }
        }
        label1336:
        i1 += 1;
        break;
        label1345:
        i2 += 1;
        break label259;
      }
      i2 += 1;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  protected void init(Bundle paramBundle)
  {
    b.a().a(this);
    this.u = ((LayoutInflater)getSystemService("layout_inflater"));
    setContentView(2130903305);
    this.i = ((ImageView)findViewById(2131559967));
    this.e = ((DzhHeader)findViewById(2131558567));
    this.h = ((MessageListView)findViewById(2131559966));
    this.h.setCacheColorHint(0);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null) {
      this.k = paramBundle.getByte("type");
    }
    this.e.a(this, this);
    this.e.setOnHeaderButtonClickListener(this);
    this.x = getResources().getStringArray(2131361850);
    a();
    this.j = new iz(this, null);
    this.h.setAdapter(this.j);
    this.L.sendEmptyMessage(1);
    paramBundle = Message.obtain();
    paramBundle.arg1 = this.k;
    paramBundle.what = 0;
    this.L.sendMessage(paramBundle);
    this.L.sendEmptyMessage(2);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 19)
    {
      Intent localIntent = new Intent(this, MainScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putInt("TAB_ID", com.android.dazhihui.ui.screen.q.b);
      localBundle.putInt("fragment_index", 0);
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      if (!(localObject instanceof k)) {
        break label105;
      }
      localObject = (k)localObject;
      if ((paramView.getId() != 2131559963) && (paramView.getId() != 2131558868)) {
        break label54;
      }
      r.a(((k)localObject).d, this, "", null);
    }
    label53:
    label54:
    label105:
    do
    {
      do
      {
        do
        {
          do
          {
            break label53;
            break label53;
            do
            {
              return;
            } while (paramView.getId() != 2131559964);
            paramView = new Bundle();
            paramView.putString("code", ((k)localObject).e);
            r.a(this, new StockVo("", ((k)localObject).e, -1, false), paramView);
            return;
            if (!(localObject instanceof l)) {
              break;
            }
            localObject = (l)localObject;
          } while (paramView.getId() != 2131559964);
          paramView = new Bundle();
          paramView.putString("code", ((l)localObject).b);
          paramView.putString("name", ((l)localObject).c);
          paramView.putBoolean("isWarn", true);
          r.a(this, new StockVo(((l)localObject).c, ((l)localObject).b, -1, false), paramView);
          return;
        } while (!(localObject instanceof com.android.dazhihui.b.h));
        localObject = (com.android.dazhihui.b.h)localObject;
        if ((((com.android.dazhihui.b.h)localObject).d != 0) && (((com.android.dazhihui.b.h)localObject).d != 1)) {
          break;
        }
        if ((paramView.getId() == 2131559963) || (paramView.getId() == 2131558868))
        {
          r.a(((com.android.dazhihui.b.h)localObject).e, this, "", null);
          return;
        }
      } while (paramView.getId() != 2131559964);
      paramView = new Bundle();
      paramView.putString("code", ((com.android.dazhihui.b.h)localObject).c);
      paramView.putString("name", ((com.android.dazhihui.b.h)localObject).b);
      r.a(this, new StockVo(((com.android.dazhihui.b.h)localObject).b, ((com.android.dazhihui.b.h)localObject).c, -1, false), paramView);
      return;
      if (((com.android.dazhihui.b.h)localObject).d == 2)
      {
        paramView = new Intent(this, MainScreen.class);
        localObject = new Bundle();
        ((Bundle)localObject).putInt("TAB_ID", com.android.dazhihui.ui.screen.q.b);
        ((Bundle)localObject).putInt("fragment_index", 0);
        paramView.putExtras((Bundle)localObject);
        startActivity(paramView);
        finish();
        return;
      }
    } while (((com.android.dazhihui.b.h)localObject).d != 3);
    paramView = new Intent(this, BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", ((com.android.dazhihui.b.h)localObject).e);
    paramView.putExtras(localBundle);
    startActivityForResult(paramView, 19);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.e = ((DzhHeader)findViewById(2131558567));
    paramIntent = getIntent().getExtras();
    if (paramIntent != null) {
      this.k = paramIntent.getByte("type");
    }
    this.e.a(this, this);
    this.e.setOnHeaderButtonClickListener(this);
    this.x = getResources().getStringArray(2131361850);
    a();
    this.j = new iz(this, null);
    this.h.setAdapter(this.j);
    this.L.sendEmptyMessage(1);
    paramIntent = Message.obtain();
    paramIntent.arg1 = this.k;
    paramIntent.what = 0;
    this.L.sendMessage(paramIntent);
    this.L.sendEmptyMessage(2);
  }
  
  protected void onStop()
  {
    b.a().b(this);
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MessageCenterList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */