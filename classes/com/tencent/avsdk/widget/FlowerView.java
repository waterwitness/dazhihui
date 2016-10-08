package com.tencent.avsdk.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.aa;
import com.android.dazhihui.ui.widget.a.r;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlowerView
  extends FrameLayout
{
  TextView beishu;
  private Animation.AnimationListener callBack;
  CircleImageView circleImageView;
  private FlowerView.AnListener flowerAnimationListener = new FlowerView.AnListener(this, 1);
  ImageView flowerImg;
  private FlowerView.AnListener goneAnimationListener = new FlowerView.AnListener(this, 3);
  aa imageLoadListener = new FlowerView.3(this);
  private boolean isInOutAnimation = false;
  public boolean isShowAnimation = false;
  private FlowerView.AnListener leftAnimationListener = new FlowerView.AnListener(this, 0);
  View leftContent;
  private int linkCount;
  private FlowerView.FlowerVo mFlowerVo;
  Handler mHandler = new FlowerView.1(this);
  private int postion;
  View rootView;
  private FlowerView.AnListener textAnimationListener = new FlowerView.AnListener(this, 2);
  TextView user;
  aa userImgListener = new FlowerView.2(this);
  TextView userSend;
  
  public FlowerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlowerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    this.rootView = LayoutInflater.from(getContext()).inflate(2130903117, this, false);
    addView(this.rootView, -2, -2);
    this.rootView.setVisibility(4);
    this.leftContent = this.rootView.findViewById(2131558925);
    this.user = ((TextView)this.rootView.findViewById(2131558926));
    this.userSend = ((TextView)this.rootView.findViewById(2131558927));
    this.circleImageView = ((CircleImageView)this.rootView.findViewById(2131558928));
    this.flowerImg = ((ImageView)this.rootView.findViewById(2131558929));
    this.beishu = ((TextView)this.rootView.findViewById(2131558930));
  }
  
  private void setFlower(Animation.AnimationListener paramAnimationListener)
  {
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(2, -0.6F, 2, 0.0F, 1, 0.0F, 1, 0.0F);
    localTranslateAnimation.setDuration(700L);
    localTranslateAnimation.setAnimationListener(paramAnimationListener);
    this.flowerImg.startAnimation(localTranslateAnimation);
    this.flowerImg.setVisibility(0);
  }
  
  private void setGone(Animation.AnimationListener paramAnimationListener)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.setAnimationListener(paramAnimationListener);
    paramAnimationListener = new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, 0.0F, 1, -1.0F);
    paramAnimationListener.setDuration(800L);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(600L);
    localAnimationSet.addAnimation(paramAnimationListener);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.setStartOffset(2000L);
    this.rootView.startAnimation(localAnimationSet);
  }
  
  private void setLeft(Animation.AnimationListener paramAnimationListener)
  {
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, -1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
    localTranslateAnimation.setDuration(800L);
    localTranslateAnimation.setAnimationListener(paramAnimationListener);
    this.leftContent.startAnimation(localTranslateAnimation);
    this.leftContent.setVisibility(0);
  }
  
  private void setText(Animation.AnimationListener paramAnimationListener)
  {
    ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, 0.3F, 1.0F, 0.3F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setAnimationListener(paramAnimationListener);
    localScaleAnimation.setDuration(200L);
    localScaleAnimation.setStartOffset(600L);
    this.beishu.startAnimation(localScaleAnimation);
  }
  
  public boolean isInShow(String paramString1, String paramString2)
  {
    return (!this.isInOutAnimation) && (paramString1.equals(this.mFlowerVo.userId)) && (paramString2.equals(this.mFlowerVo.giftId));
  }
  
  public int setlinkCount(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1) {}
    for (;;)
    {
      try
      {
        this.linkCount += paramInt2;
        paramInt1 = this.linkCount;
        return paramInt1;
      }
      finally {}
      paramInt1 = this.linkCount;
    }
  }
  
  public void show(FlowerView.FlowerVo paramFlowerVo, int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.isShowAnimation = true;
    this.isInOutAnimation = false;
    this.callBack = paramAnimationListener;
    this.mFlowerVo = paramFlowerVo;
    this.linkCount = paramFlowerVo.linkCount;
    this.postion = paramInt;
    this.user.setText(paramFlowerVo.userName);
    this.userSend.setText("送了一个" + paramFlowerVo.giftName);
    this.circleImageView.setImageResource(2130838231);
    paramFlowerVo = new SimpleDateFormat("yyyyMMdd");
    r.a(getContext()).a(this.mFlowerVo.userUrl + "?time=" + paramFlowerVo.format(new Date()), this.userImgListener);
    r.a(getContext()).a(this.mFlowerVo.giftUrl, this.imageLoadListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FlowerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */