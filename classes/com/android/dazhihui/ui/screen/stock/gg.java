package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.data;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.c.a.k;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class gg
  extends com.android.dazhihui.ui.screen.a
{
  public static int a = 0;
  public static int b = 1;
  public static int c = 2;
  public static int d = 3;
  private View e;
  private MyViewPager f;
  private DzhMainHeader g;
  private gn h;
  private List<LivebarConfigVo.topConfig> i;
  private List<LivebarConfigVo.topConfig> j;
  private com.android.dazhihui.a.b.f k;
  private LivebarConfigVo l;
  private int m;
  private CircleImageView n;
  private AdvertView o;
  private View p;
  private com.android.dazhihui.a.b.f q;
  private com.android.dazhihui.a.b.f r;
  private int s;
  
  public void a()
  {
    this.l = ((LivebarConfigVo)DzhApplication.a().b().a("liveBarconfig", new gm(this)));
    if ((this.l == null) || (!this.l.isSameDay()))
    {
      this.k = new com.android.dazhihui.a.b.f();
      this.k.c(com.android.dazhihui.a.f.i);
      registRequestListener(this.k);
      sendRequest(this.k);
      return;
    }
    m.a().a(this.l);
    this.i = this.l.getData().getTopConfig();
  }
  
  public void a(View paramView)
  {
    this.p = this.e.findViewById(2131559178);
    this.o = ((AdvertView)this.e.findViewById(2131559270));
    this.e.findViewById(2131559298).setOnClickListener(new gh(this));
    this.p.setOnClickListener(new gi(this));
    this.o.setOnAdvertStateChangeListener(new gj(this));
    this.o.setAdvCode(137);
    addAdvert(this.o);
    this.n = ((CircleImageView)this.e.findViewById(2131559688));
    this.l = m.a().g();
    if (this.l == null) {
      this.l = ((LivebarConfigVo)DzhApplication.a().b().a("liveBarconfig", new gl(this)));
    }
    Object localObject;
    if (this.l == null)
    {
      a();
      this.j.clear();
      localObject = new LivebarConfigVo();
      localObject.getClass();
      localObject = new LivebarConfigVo.topConfig((LivebarConfigVo)localObject);
      this.g = ((DzhMainHeader)paramView.findViewById(2131559289));
      if (this.s != a) {
        break label341;
      }
      this.g.a(getActivity(), 8, null);
      ((LivebarConfigVo.topConfig)localObject).setType(2);
    }
    for (;;)
    {
      this.j.add(localObject);
      this.f = ((MyViewPager)paramView.findViewById(2131559297));
      this.h = new gn(this, getChildFragmentManager());
      this.f.setAdapter(this.h);
      this.f.setCurrentItem(0);
      this.g.recevierData();
      this.g.i();
      return;
      m.a().a(this.l);
      this.i = this.l.getData().getTopConfig();
      break;
      label341:
      this.g.a(getActivity(), 8, null);
    }
  }
  
  public void changeLookFace(y paramy)
  {
    if (this.g != null) {
      this.g.a();
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      if (paramh == this.k)
      {
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        this.l = ((LivebarConfigVo)new k().a(paramh, LivebarConfigVo.class));
        paramh = this.l.getData();
        if (paramh != null)
        {
          this.l.setTime(System.currentTimeMillis());
          this.i = paramh.getTopConfig();
          if (this.i != null)
          {
            m.a().a(this.l);
            DzhApplication.a().b().a("liveBarconfig", this.l);
          }
        }
      }
      else
      {
        if (paramh == this.r)
        {
          paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
          try
          {
            paramh = new LeftMenuVo();
            paramh.decode(paramj);
            paramj = m.a().J();
            if ((paramj != null) && (paramj.getVersion().equals(paramh.getVersion()))) {
              break label311;
            }
            m.a().a(paramh);
            DzhApplication.a().b().a("LeftMenuJson", paramh);
            return;
          }
          catch (JSONException paramh)
          {
            paramh.printStackTrace();
            return;
          }
        }
        if (paramh == this.q)
        {
          paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
          try
          {
            paramh = new uc();
            paramj = new JSONObject(paramj).getJSONObject("data");
            String str = paramj.getString("notice");
            int i1 = paramj.getInt("HResolution");
            int i2 = paramj.getInt("VResolution");
            int i3 = paramj.getInt("FrameRate");
            paramh.a = str;
            paramh.b = i1;
            paramh.c = i2;
            paramh.d = i3;
            m.a().a(paramh);
            return;
          }
          catch (Exception paramh)
          {
            paramh.printStackTrace();
          }
        }
      }
      label311:
      return;
    }
    catch (Exception paramh) {}
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 2131296296));
    if (this.mBundle != null) {
      this.s = this.mBundle.getInt("showType");
    }
    this.e = paramLayoutInflater.inflate(2130903245, paramViewGroup, false);
    a(this.e);
    return this.e;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.g.j();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if (this.f != null)
    {
      if ((paramInt1 != -1) && (paramInt2 == -1)) {}
      return;
    }
    this.m = paramInt1;
  }
  
  public void show()
  {
    if ((this.h != null) && (this.h.a() != null))
    {
      if (!(this.h.a() instanceof i)) {
        break label57;
      }
      ((i)this.h.a()).refresh();
    }
    for (;;)
    {
      changeLookFace(com.android.dazhihui.g.a().b());
      return;
      label57:
      ((e)this.h.a()).show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */