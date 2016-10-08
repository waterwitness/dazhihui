package com.tencent.avsdk.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class FireworksAnimation
  extends FrameLayout
{
  AnimationDrawable animationDrawable1;
  AnimationDrawable animationDrawable2;
  AnimationDrawable animationDrawable3;
  View imageView1;
  View imageView2;
  View imageView3;
  public boolean isShowAnimation = false;
  TextView lihuaText;
  public int showNumber = 0;
  
  public FireworksAnimation(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FireworksAnimation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    setVisibility(8);
    View localView = LayoutInflater.from(getContext()).inflate(2130903116, this, true);
    this.lihuaText = ((TextView)localView.findViewById(2131558924));
    this.imageView1 = localView.findViewById(2131558881);
    this.imageView1.setVisibility(4);
    this.animationDrawable1 = ((AnimationDrawable)this.imageView1.getBackground());
    this.imageView2 = localView.findViewById(2131558922);
    this.imageView2.setVisibility(4);
    this.animationDrawable2 = ((AnimationDrawable)this.imageView2.getBackground());
    this.imageView3 = localView.findViewById(2131558923);
    this.imageView3.setVisibility(4);
    this.animationDrawable3 = ((AnimationDrawable)this.imageView3.getBackground());
  }
  
  public void start(String paramString, Runnable paramRunnable)
  {
    this.isShowAnimation = true;
    this.lihuaText.setText(paramString);
    this.showNumber += 1;
    setVisibility(0);
    this.imageView1.setVisibility(0);
    this.animationDrawable1.start();
    postDelayed(new FireworksAnimation.1(this, paramString, paramRunnable), 1500L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FireworksAnimation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */