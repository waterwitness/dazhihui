package com.tencent.avsdk.widget;

import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;

public class YachtAnimation
  extends FrameLayout
{
  AnimationDrawable animationDrawable;
  View fireworks;
  View fireworks_bg;
  View heart_arrow;
  public boolean isShowAnimation = false;
  private Runnable runnable;
  View water1;
  View water2;
  View youlun;
  TextView youlunText;
  
  public YachtAnimation(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public YachtAnimation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    LayoutInflater.from(getContext()).inflate(2130903596, this, true);
    this.heart_arrow = findViewById(2131561362);
    this.heart_arrow.setVisibility(8);
    this.youlun = findViewById(2131561358);
    this.youlun.setVisibility(8);
    this.fireworks_bg = findViewById(2131561360);
    this.fireworks_bg.setVisibility(8);
    this.fireworks = findViewById(2131561361);
    this.fireworks.setVisibility(8);
    this.animationDrawable = ((AnimationDrawable)this.fireworks.getBackground());
    this.water2 = findViewById(2131561357);
    this.water2.setVisibility(8);
    this.water1 = findViewById(2131561356);
    this.water1.setVisibility(8);
    this.youlunText = ((TextView)findViewById(2131561359));
    setVisibility(8);
  }
  
  private void setArrowAnim()
  {
    postDelayed(new YachtAnimation.2(this), 2000L);
    int i = ((View)this.youlun.getParent().getParent().getParent()).getWidth();
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.heart_arrow, "translationX", new float[] { 0.0F, i * 0.7F }).setDuration(1000L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.heart_arrow, "translationY", new float[] { 0.0F, 0.0F }).setDuration(1000L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(localObjectAnimator1).with(localObjectAnimator2);
    localAnimatorSet.setStartDelay(2000L);
    localAnimatorSet.addListener(new YachtAnimation.3(this));
    localAnimatorSet.start();
  }
  
  private void setFireworksAnim()
  {
    postDelayed(new YachtAnimation.4(this), 1000L);
  }
  
  private void setWaterAnim()
  {
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.03F, 2, 0.0F, 2, 0.0F);
    localTranslateAnimation.setDuration(1000L);
    localTranslateAnimation.setFillAfter(false);
    localTranslateAnimation.setRepeatCount(1000);
    this.water1.startAnimation(localTranslateAnimation);
    this.water1.setVisibility(0);
    localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, -0.03F, 2, 0.0F, 2, 0.0F);
    localTranslateAnimation.setDuration(1000L);
    localTranslateAnimation.setFillAfter(false);
    localTranslateAnimation.setRepeatCount(1000);
    this.water2.startAnimation(localTranslateAnimation);
    this.water2.setVisibility(0);
  }
  
  private void setYouLunAnim()
  {
    int i = ((View)this.youlun.getParent().getParent().getParent()).getWidth();
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.youlun, "translationX", new float[] { -400.0F, i * 0.1F }).setDuration(1000L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.youlun, "translationX", new float[] { i * 0.1F, 0.6F * i }).setDuration(2500L);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.youlun, "translationX", new float[] { 0.6F * i, i }).setDuration(1000L);
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.youlun, "rotation", new float[] { 0.0F, -5.0F, 0.0F, 5.0F, 0.0F }).setDuration(2500L);
    ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(this.youlun, "rotation", new float[] { 0.0F, -5.0F, -5.0F, 0.0F }).setDuration(1000L);
    AnimatorSet localAnimatorSet1 = new AnimatorSet();
    AnimatorSet localAnimatorSet2 = new AnimatorSet();
    localAnimatorSet2.addListener(new YachtAnimation.1(this));
    localAnimatorSet2.play(localObjectAnimator2).with(localObjectAnimator4).before(localObjectAnimator3);
    localAnimatorSet1.play(localObjectAnimator1).with(localObjectAnimator5).before(localAnimatorSet2);
    localAnimatorSet1.start();
    this.youlun.setVisibility(0);
  }
  
  public void start(String paramString, Runnable paramRunnable)
  {
    this.isShowAnimation = true;
    this.runnable = paramRunnable;
    setVisibility(0);
    setWaterAnim();
    this.youlunText.setText(paramString);
    setYouLunAnim();
    setArrowAnim();
    setFireworksAnim();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\YachtAnimation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */