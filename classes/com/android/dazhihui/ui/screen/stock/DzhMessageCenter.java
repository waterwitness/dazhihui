package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b.b;
import com.android.dazhihui.b.i;
import com.android.dazhihui.b.k;
import com.android.dazhihui.b.l;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class DzhMessageCenter
  extends BaseActivity
  implements View.OnClickListener, i, cp, cs
{
  private DzhHeader a;
  private LinearLayout b;
  private LayoutInflater c;
  private RelativeLayout d;
  private RelativeLayout e;
  private RelativeLayout f;
  private RelativeLayout g;
  private b h = b.a();
  private d i = d.a();
  private DateFormat j = new SimpleDateFormat("MM月dd日 HH:mm");
  
  private void a()
  {
    byte b1 = 0;
    if (b1 < 4)
    {
      View localView = this.c.inflate(2130903105, null);
      ImageView localImageView = (ImageView)localView.findViewById(2131558865);
      TextView localTextView = (TextView)localView.findViewById(2131558866);
      localTextView.setCompoundDrawablePadding(getResources().getDimensionPixelSize(2131230829));
      switch (b1)
      {
      }
      for (;;)
      {
        this.b.addView(localView, new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230845)));
        localView.setOnClickListener(this);
        localView.setTag(Byte.valueOf(b1));
        b1 = (byte)(b1 + 1);
        break;
        this.d = ((RelativeLayout)localView);
        localImageView.setImageResource(2130838532);
        localTextView.setText(2131165946);
        continue;
        localImageView.setImageResource(2130838530);
        localTextView.setText(2131165944);
        continue;
        this.e = ((RelativeLayout)localView);
        localImageView.setImageResource(2130838533);
        localTextView.setText(2131165947);
        continue;
        this.f = ((RelativeLayout)localView);
        localImageView.setImageResource(2130838531);
        localTextView.setText(2131165945);
        continue;
        this.g = ((RelativeLayout)localView);
        localImageView.setImageResource(2130838527);
        localTextView.setText(2131165943);
      }
    }
  }
  
  private void b()
  {
    e();
    c();
    d();
    f();
  }
  
  private void c()
  {
    Object localObject1 = (TextView)this.f.findViewById(2131558866);
    TextView localTextView1 = (TextView)this.f.findViewById(2131558867);
    TextView localTextView2 = (TextView)this.f.findViewById(2131558868);
    ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    localTextView2.setVisibility(0);
    Object localObject2 = this.h.l();
    if (((List)localObject2).size() > 0)
    {
      localObject2 = (com.android.dazhihui.b.h)((List)localObject2).get(((List)localObject2).size() - 1);
      ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837549, 0);
      localTextView1.setText(this.j.format(new Date(((com.android.dazhihui.b.h)localObject2).g)));
      localTextView2.setText(((com.android.dazhihui.b.h)localObject2).f);
    }
    for (;;)
    {
      this.i.g();
      return;
      localObject1 = this.i.d();
      if (localObject1 == null)
      {
        localTextView1.setText("");
        localTextView2.setText("");
        localTextView2.setVisibility(8);
      }
      else
      {
        localTextView1.setText(this.j.format(new Date(((com.android.dazhihui.b.h)localObject1).g)));
        localTextView2.setText(((com.android.dazhihui.b.h)localObject1).f);
      }
    }
  }
  
  private void d()
  {
    Object localObject1 = (TextView)this.e.findViewById(2131558866);
    TextView localTextView1 = (TextView)this.e.findViewById(2131558867);
    TextView localTextView2 = (TextView)this.e.findViewById(2131558868);
    ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    localTextView2.setVisibility(0);
    Object localObject2 = this.h.g();
    if (((List)localObject2).size() > 0)
    {
      localObject2 = (l)((List)localObject2).get(((List)localObject2).size() - 1);
      ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837549, 0);
      localTextView1.setText(this.j.format(new Date(((l)localObject2).e)));
      localTextView2.setText(((l)localObject2).d);
    }
    for (;;)
    {
      this.i.g();
      return;
      localObject1 = this.i.f();
      if (localObject1 == null)
      {
        localTextView1.setText("");
        localTextView2.setText("");
        localTextView2.setVisibility(8);
      }
      else
      {
        localTextView1.setText(this.j.format(new Date(((l)localObject1).e)));
        localTextView2.setText(((l)localObject1).d);
      }
    }
  }
  
  private void e()
  {
    Object localObject1 = (TextView)this.d.findViewById(2131558866);
    TextView localTextView1 = (TextView)this.d.findViewById(2131558867);
    TextView localTextView2 = (TextView)this.d.findViewById(2131558868);
    ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    localTextView2.setVisibility(0);
    Object localObject2 = this.h.o();
    if (((List)localObject2).size() > 0)
    {
      localObject2 = (k)((List)localObject2).get(((List)localObject2).size() - 1);
      ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837549, 0);
      localTextView1.setText(this.j.format(new Date(((k)localObject2).g)));
      localTextView2.setText(((k)localObject2).f);
    }
    for (;;)
    {
      this.i.g();
      return;
      localObject1 = this.i.b(0);
      if (localObject1 == null)
      {
        localTextView1.setText("");
        localTextView2.setText("");
        localTextView2.setVisibility(8);
      }
      else
      {
        localTextView1.setText(this.j.format(new Date(((k)localObject1).g)));
        localTextView2.setText(((k)localObject1).f);
      }
    }
  }
  
  private void f()
  {
    Object localObject1 = (TextView)this.g.findViewById(2131558866);
    TextView localTextView1 = (TextView)this.g.findViewById(2131558867);
    TextView localTextView2 = (TextView)this.g.findViewById(2131558868);
    ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    localTextView2.setVisibility(0);
    Object localObject2 = this.h.q();
    if (((List)localObject2).size() > 0)
    {
      localObject2 = (k)((List)localObject2).get(((List)localObject2).size() - 1);
      ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837549, 0);
      localTextView1.setText(this.j.format(new Date(((k)localObject2).g)));
      localTextView2.setText(((k)localObject2).f);
    }
    for (;;)
    {
      this.i.g();
      return;
      localObject1 = this.i.b(3);
      if (localObject1 == null)
      {
        localTextView1.setText("");
        localTextView2.setText("");
        localTextView2.setVisibility(8);
      }
      else
      {
        localTextView1.setText(this.j.format(new Date(((k)localObject1).g)));
        localTextView2.setText(((k)localObject1).f);
      }
    }
  }
  
  private void g()
  {
    Object localObject = new x(3001);
    ((x)localObject).b(2);
    x localx = new x(519);
    localx.a(w.a().f());
    localx.a(g.a().v());
    localx.b(g.a().ac());
    localx.a(g.a().r());
    localx.a(new int[] { 0, 1, 2, 3 });
    ((x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
    localObject = new com.android.dazhihui.a.b.m((x)localObject, com.android.dazhihui.a.b.n.a);
    registRequestListener((com.android.dazhihui.a.b.h)localObject);
    sendRequest((com.android.dazhihui.a.b.h)localObject);
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
      continue;
      com.android.dazhihui.d.n.a("", 1343);
      startActivity(new Intent(this, MessageCenterSettingScreen.class));
    }
  }
  
  public void a(byte paramByte)
  {
    if (paramByte == 2) {
      c();
    }
    do
    {
      return;
      if (paramByte == 1)
      {
        d();
        return;
      }
      if (paramByte == 0)
      {
        e();
        return;
      }
    } while (paramByte != 3);
    f();
  }
  
  public void b(byte paramByte) {}
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.f = getResources().getDrawable(2130838734);
    paramct.d = getString(2131166430);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int k;
    int m;
    if ((paramj instanceof o))
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.b != null) && (paramh.a == 3001))
      {
        paramh = new q(paramh.b);
        if (paramh.b() == 2)
        {
          k = paramh.e();
          paramh.e();
          paramh.e();
          com.android.dazhihui.ui.a.m.a().c(paramh.h());
          if (k == 519) {
            if (paramh.e() == 0)
            {
              paramh = paramh.m();
              m = paramh.length;
              k = 0;
            }
          }
        }
      }
    }
    for (;;)
    {
      if (k < m)
      {
        paramj = paramh[k];
        long l;
        int n;
        Object localObject;
        try
        {
          paramj = new JSONObject(paramj);
          l = paramj.optLong("md") & 0xFFFFFF;
          n = paramj.optInt("mt");
          if (n == 0)
          {
            localObject = this.i.f();
            if ((localObject == null) || ((localObject != null) && (((l)localObject).a != l)))
            {
              localObject = new l();
              ((l)localObject).a = ((int)l);
              ((l)localObject).d = paramj.optString("des");
              ((l)localObject).e = (paramj.optLong("pt") * 1000L);
              paramj = paramj.optJSONObject("exp");
              if (paramj != null)
              {
                ((l)localObject).b = paramj.optString("StkCode");
                ((l)localObject).c = paramj.optString("StkName");
              }
              this.h.a((l)localObject, false);
              d();
            }
          }
          else if (n == 1)
          {
            localObject = this.i.b(0);
            if ((localObject != null) && ((localObject == null) || (((k)localObject).a == l))) {
              break label749;
            }
            localObject = new k();
            ((k)localObject).a = ((int)l);
            ((k)localObject).f = paramj.optString("des");
            ((k)localObject).g = (paramj.optLong("pt") * 1000L);
            paramj = paramj.optJSONObject("exp");
            if (paramj != null)
            {
              ((k)localObject).b = paramj.optString("rt");
              ((k)localObject).c = paramj.optInt("ty");
              ((k)localObject).d = paramj.optString("url");
              ((k)localObject).e = paramj.optString("code");
            }
            ((k)localObject).h = 0;
            this.h.a((k)localObject, false);
            e();
          }
        }
        catch (JSONException paramj)
        {
          paramj.printStackTrace();
        }
        if (n == 2)
        {
          localObject = this.i.d();
          if ((localObject == null) || ((localObject != null) && (((com.android.dazhihui.b.h)localObject).a != l)))
          {
            localObject = new com.android.dazhihui.b.h();
            ((com.android.dazhihui.b.h)localObject).a = ((int)l);
            ((com.android.dazhihui.b.h)localObject).f = paramj.optString("des");
            ((com.android.dazhihui.b.h)localObject).g = (paramj.optLong("pt") * 1000L);
            paramj = paramj.optJSONObject("exp");
            if (paramj != null) {
              ((com.android.dazhihui.b.h)localObject).e = paramj.optString("Url");
            }
            this.h.a((com.android.dazhihui.b.h)localObject, false);
            c();
          }
        }
        else if (n == 3)
        {
          localObject = this.i.b(3);
          if ((localObject == null) || ((localObject != null) && (((k)localObject).a != l)))
          {
            localObject = new k();
            ((k)localObject).a = ((int)l);
            ((k)localObject).f = paramj.optString("des");
            ((k)localObject).g = (paramj.optLong("pt") * 1000L);
            paramj = paramj.optJSONObject("exp");
            if (paramj != null)
            {
              ((k)localObject).b = paramj.optString("rt");
              ((k)localObject).c = paramj.optInt("ty");
              ((k)localObject).d = paramj.optString("url");
              ((k)localObject).e = paramj.optString("code");
            }
            ((k)localObject).h = 3;
            this.h.b((k)localObject, false);
            f();
            break label749;
            k = paramh.h();
            paramh = paramh.l();
            System.out.println("error code:   " + k + "     message:    " + paramh);
          }
        }
      }
      else
      {
        return;
      }
      label749:
      k += 1;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903104);
    this.c = ((LayoutInflater)getSystemService("layout_inflater"));
    this.a = ((DzhHeader)findViewById(2131558567));
    this.b = ((LinearLayout)findViewById(2131558526));
    this.a.a(this, this);
    this.a.setOnHeaderButtonClickListener(this);
    a();
    g();
    com.android.dazhihui.d.n.a("", 1159);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    paramView = (Byte)paramView.getTag();
    if (paramView != null) {
      switch (paramView.byteValue())
      {
      }
    }
    for (;;)
    {
      Bundle localBundle = new Bundle();
      localBundle.putByte("type", paramView.byteValue());
      startActivity(MessageCenterList.class, localBundle);
      return;
      com.android.dazhihui.d.n.a("", 1337);
      continue;
      com.android.dazhihui.d.n.a("", 1338);
      continue;
      com.android.dazhihui.d.n.a("", 1339);
      continue;
      com.android.dazhihui.d.n.a("", 1340);
    }
  }
  
  protected void onResume()
  {
    b.a().a(this);
    b();
    super.onResume();
  }
  
  protected void onStop()
  {
    b.a().b(this);
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\DzhMessageCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */