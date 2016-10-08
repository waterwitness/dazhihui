package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import java.util.ArrayList;

public class AutoTextView
  extends TextSwitcher
  implements ViewSwitcher.ViewFactory
{
  int a = 0;
  int b = -1;
  int c = 5000;
  private Context d;
  private ArrayList<String> e;
  private final Handler f = new Handler();
  private AutoTextView g;
  private j h;
  private j i;
  private final Runnable j = new i(this);
  
  public AutoTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AutoTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    d();
  }
  
  private j a(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    j localj = new j(this, paramFloat1, paramFloat2, paramBoolean1, paramBoolean2);
    localj.setDuration(800L);
    localj.setFillAfter(false);
    localj.setInterpolator(new AccelerateInterpolator());
    return localj;
  }
  
  private void d()
  {
    setFactory(this);
    this.h = a(0.0F, 0.0F, true, true);
    this.i = a(0.0F, 0.0F, false, true);
    this.g = this;
  }
  
  public void a()
  {
    if (this.j != null) {
      this.f.removeCallbacks(this.j);
    }
    if ((this.e == null) || (this.e.size() <= 0))
    {
      b();
      return;
    }
    this.a = this.e.size();
    this.b = -1;
    this.f.postDelayed(this.j, 2000L);
  }
  
  public boolean a(String paramString)
  {
    try
    {
      Integer.valueOf(paramString).intValue();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public void b()
  {
    if (this.j != null) {
      this.f.removeCallbacks(this.j);
    }
    setInAnimation(null);
    setOutAnimation(null);
    setText("主播名/视吧/话题");
  }
  
  public void c()
  {
    if (getInAnimation() != this.h) {
      setInAnimation(this.h);
    }
    if (getOutAnimation() != this.i) {
      setOutAnimation(this.i);
    }
  }
  
  public View makeView()
  {
    TextView localTextView = new TextView(this.d);
    localTextView.setTextColor(-1996488705);
    localTextView.setMaxLines(1);
    return localTextView;
  }
  
  public void setShowData(ArrayList<String> paramArrayList)
  {
    this.e = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\AutoTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */