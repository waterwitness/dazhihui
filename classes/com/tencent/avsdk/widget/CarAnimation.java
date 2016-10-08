package com.tencent.avsdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.adv.GifView;

public class CarAnimation
  extends LinearLayout
{
  TextView carText;
  GifView carView;
  private boolean isShowAnimation = false;
  private int showNumber = 0;
  
  public CarAnimation(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CarAnimation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    setOrientation(0);
    setVisibility(8);
    LayoutInflater.from(getContext()).inflate(2130903077, this, true);
    this.carText = ((TextView)findViewById(2131558701));
    this.carView = ((GifView)findViewById(2131558702));
  }
  
  public void start(String paramString, Runnable paramRunnable)
  {
    this.isShowAnimation = true;
    this.showNumber += 1;
    setVisibility(0);
    this.carText.setText(paramString);
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, -1.0F, 2, 1.0F, 2, 0.0F, 2, 0.2F);
    localTranslateAnimation.setDuration(2000L);
    localTranslateAnimation.setAnimationListener(new CarAnimation.1(this, paramString, paramRunnable));
    localTranslateAnimation.setFillAfter(true);
    localAnimationSet.addAnimation(localTranslateAnimation);
    this.carView.setBackgroundResource(2130837626);
    startAnimation(localAnimationSet);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\CarAnimation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */