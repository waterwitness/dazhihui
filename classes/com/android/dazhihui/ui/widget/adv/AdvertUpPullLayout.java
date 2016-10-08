package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.AdvertUpPullData;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.Data;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.screen.stock.oy;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.kg;
import java.util.ArrayList;
import java.util.Iterator;

public class AdvertUpPullLayout
  extends RelativeLayout
  implements com.android.dazhihui.ui.widget.a
{
  public static int a;
  private Context b;
  private LayoutInflater c;
  private TextView d;
  private Scroller e;
  private boolean f = false;
  private boolean g = false;
  private MyWebView h;
  private String i = "1";
  private ImageView j;
  private View k;
  private AdvertView l;
  private PopupWindow m;
  private String n = "";
  private kg o;
  
  public AdvertUpPullLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AdvertUpPullLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AdvertUpPullLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a = getResources().getDimensionPixelSize(2131230843);
    this.b = paramContext;
    this.c = LayoutInflater.from(paramContext);
    this.e = new Scroller(paramContext, new LinearInterpolator());
    this.c.inflate(2130903050, this);
    this.d = ((TextView)findViewById(2131558576));
    this.j = ((ImageView)findViewById(2131558577));
    this.l = ((AdvertView)findViewById(2131558575));
    this.k = findViewById(2131558578);
    setLayoutParams(new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelSize(2131230843)));
    a(oy.a().b(), 0);
    d();
  }
  
  private void a(String paramString)
  {
    if (this.h == null)
    {
      ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from(this.b).inflate(2130903092, null);
      this.h = ((MyWebView)localViewGroup.findViewById(2131558818));
      this.h.getSettings().setBuiltInZoomControls(false);
      this.h.setHorizontalFadingEdgeEnabled(false);
      this.h.setHorizontalScrollBarEnabled(false);
      this.h.setHorizontalScrollbarOverlay(false);
      this.h.setVerticalFadingEdgeEnabled(false);
      this.h.setVerticalScrollBarEnabled(false);
      this.h.setVerticalScrollbarOverlay(false);
      TextView localTextView = (TextView)localViewGroup.findViewById(2131558567);
      this.h.setWebViewLoadListener(new f(this, localTextView));
      ((ImageView)localViewGroup.findViewById(2131558817)).setOnClickListener(new g(this));
      this.h.setBackgroundColor(-1);
      this.h.setLayerType(2, null);
      this.m = new PopupWindow(localViewGroup, -2, -2, true);
      this.m.setOutsideTouchable(true);
      this.m.setBackgroundDrawable(new ColorDrawable(0));
      this.m.setWindowLayoutMode(-2, -2);
    }
    for (;;)
    {
      this.h.loadUrl(paramString);
      this.m.showAtLocation(this, 1, 0, 0);
      return;
      this.h.clearHistory();
    }
  }
  
  private boolean a(AdvertUpPullVo paramAdvertUpPullVo, int paramInt)
  {
    boolean bool2 = true;
    this.f = false;
    this.g = false;
    Object localObject1;
    Object localObject2;
    int i1;
    if ((paramAdvertUpPullVo != null) && (paramAdvertUpPullVo.data != null) && (paramAdvertUpPullVo.data.upPull != null))
    {
      localObject1 = new ArrayList();
      localObject2 = paramAdvertUpPullVo.data.upPull.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        AdvertUpPullVo.AdvertUpPullData localAdvertUpPullData = (AdvertUpPullVo.AdvertUpPullData)((Iterator)localObject2).next();
        if ((localAdvertUpPullData != null) && (this.i.equals(localAdvertUpPullData.type))) {
          ((ArrayList)localObject1).add(localAdvertUpPullData);
        }
      }
      if (((ArrayList)localObject1).size() > 0) {
        if (((paramAdvertUpPullVo.homeIndex >= 0) && (paramAdvertUpPullVo.homeIndex < ((ArrayList)localObject1).size()) && (this.i.equals("1"))) || ((paramAdvertUpPullVo.minuteIndex >= 0) && (paramAdvertUpPullVo.minuteIndex < ((ArrayList)localObject1).size()) && (this.i.equals("2")))) {
          if (this.i.equals("1"))
          {
            i1 = paramAdvertUpPullVo.homeIndex;
            localObject1 = (AdvertUpPullVo.AdvertUpPullData)((ArrayList)localObject1).get(i1);
            this.n = ((AdvertUpPullVo.AdvertUpPullData)localObject1).content;
            localObject1 = new e(this, (AdvertUpPullVo.AdvertUpPullData)localObject1);
            this.d.setOnClickListener((View.OnClickListener)localObject1);
            this.j.setOnClickListener((View.OnClickListener)localObject1);
            this.k.setVisibility(8);
            this.d.setVisibility(0);
            this.j.setVisibility(0);
            if (paramAdvertUpPullVo.homeIndex == 0) {
              this.g = true;
            }
            if ((!this.i.equals("1")) || (paramInt != 1)) {
              break label349;
            }
            paramAdvertUpPullVo.homeIndex += 1;
            label300:
            if (paramAdvertUpPullVo == null) {}
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        DzhApplication.a().b().a("advertUpPullData", paramAdvertUpPullVo);
        this.f = true;
        if (this.f) {
          break label812;
        }
        setVisibility(8);
        return this.f;
        i1 = paramAdvertUpPullVo.minuteIndex;
        break;
        label349:
        if ((!this.i.equals("2")) || (paramInt != 1)) {
          break label300;
        }
        paramAdvertUpPullVo.minuteIndex += 1;
      }
      catch (Exception paramAdvertUpPullVo)
      {
        paramAdvertUpPullVo.printStackTrace();
        continue;
      }
      this.d.setVisibility(8);
      this.j.setVisibility(8);
      if (("1".equals(this.i)) && (this.l.getVisibility() == 0))
      {
        this.k.setVisibility(8);
        localObject2 = this.l.getAdvertData();
        if ((localObject2 != null) && ("5".equals(((AdvertVo.AdvertData)localObject2).previewtype))) {
          this.g = true;
        }
        label470:
        this.d.setOnClickListener(null);
        this.j.setOnClickListener(null);
        if (("2".equals(this.i)) && ((((ArrayList)localObject1).size() == 0) || (((ArrayList)localObject1).size() == paramAdvertUpPullVo.minuteIndex))) {
          break label540;
        }
      }
      label540:
      for (boolean bool1 = true;; bool1 = false)
      {
        this.f = bool1;
        break;
        this.k.setVisibility(0);
        break label470;
      }
      this.d.setVisibility(8);
      this.j.setVisibility(8);
      if (("1".equals(this.i)) && (this.l.getVisibility() == 0))
      {
        this.k.setVisibility(8);
        localObject2 = this.l.getAdvertData();
        if ((localObject2 != null) && ("5".equals(((AdvertVo.AdvertData)localObject2).previewtype))) {
          this.g = true;
        }
        label628:
        this.d.setOnClickListener(null);
        this.j.setOnClickListener(null);
        bool1 = bool2;
        if ("2".equals(this.i)) {
          if ((((ArrayList)localObject1).size() == 0) || (((ArrayList)localObject1).size() == paramAdvertUpPullVo.minuteIndex)) {
            break label703;
          }
        }
      }
      label703:
      for (bool1 = bool2;; bool1 = false)
      {
        this.f = bool1;
        break;
        this.k.setVisibility(0);
        break label628;
      }
      this.d.setVisibility(8);
      this.j.setVisibility(8);
      this.k.setVisibility(8);
      if (("1".equals(this.i)) && (this.l.getVisibility() == 0))
      {
        this.f = true;
        paramAdvertUpPullVo = this.l.getAdvertData();
        if ((paramAdvertUpPullVo != null) && ("5".equals(paramAdvertUpPullVo.previewtype))) {
          this.g = true;
        }
      }
      this.d.setOnClickListener(null);
      this.j.setOnClickListener(null);
      continue;
      label812:
      setVisibility(0);
    }
  }
  
  private void d()
  {
    this.d.setText(this.n);
    this.d.requestLayout();
    this.d.postInvalidate();
  }
  
  private boolean e()
  {
    return this.f;
  }
  
  public void a()
  {
    a(oy.a().b(), 1);
    d();
    if (this.o != null)
    {
      this.o.b();
      this.o.a();
    }
    if (AdvertUpPullVo.isNeedUpdate()) {
      oy.a().a(new i(this));
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (j.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.d != null)
        {
          this.d.setBackgroundResource(2130838697);
          this.d.setTextColor(getResources().getColor(2131493563));
        }
      } while (this.k == null);
      this.k.setBackgroundResource(2130838697);
      return;
      if (this.d != null)
      {
        this.d.setBackgroundResource(2130838782);
        this.d.setTextColor(getResources().getColor(2131493626));
      }
    } while (this.k == null);
    this.k.setBackgroundResource(2130838782);
  }
  
  public boolean a(float paramFloat)
  {
    boolean bool = false;
    if (e())
    {
      Log.i("UHG", "mOffset=" + paramFloat + " height=" + getMeasuredHeight());
      if (paramFloat == 2.14748365E9F)
      {
        ViewPropertyAnimator localViewPropertyAnimator = animate();
        localViewPropertyAnimator.cancel();
        localViewPropertyAnimator.scaleX(1.0F);
        localViewPropertyAnimator.scaleY(1.0F);
        localViewPropertyAnimator.setDuration(200L);
        localViewPropertyAnimator.setListener(new h(this));
        localViewPropertyAnimator.start();
        bool = true;
      }
    }
    else
    {
      return bool;
    }
    paramFloat = Math.abs(paramFloat);
    if (paramFloat < a)
    {
      setScaleX(paramFloat / a);
      setScaleY(paramFloat / a);
      return false;
    }
    setScaleX(1.0F);
    setScaleY(1.0F);
    return false;
  }
  
  public void b()
  {
    Log.i("GUH", "136广告触发更新下拉内容");
    a(oy.a().b(), 0);
    d();
    if (this.o != null) {
      this.o.b();
    }
  }
  
  public void c()
  {
    Log.i("GUH", "页请求下拉内容返回后触发");
    a(oy.a().b(), 0);
    d();
    if (this.o != null) {
      this.o.b();
    }
  }
  
  public String getType()
  {
    return this.i;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setAdvertUpPullListener(kg paramkg)
  {
    this.o = paramkg;
  }
  
  public void setType(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.i = paramString;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\AdvertUpPullLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */