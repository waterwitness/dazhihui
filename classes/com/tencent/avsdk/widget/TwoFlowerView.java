package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TwoFlowerView
  extends LinearLayout
{
  private List<FlowerView.FlowerVo> flowerList = new ArrayList();
  Handler handler = new TwoFlowerView.1(this);
  private HashMap<String, TwoFlowerView.Link> map = new HashMap();
  private FlowerView oneFlowerView;
  Animation.AnimationListener oneListener = new TwoFlowerView.2(this);
  private FlowerView twoFlowerView;
  Animation.AnimationListener twoListener = new TwoFlowerView.3(this);
  
  public TwoFlowerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TwoFlowerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void addList(FlowerView.FlowerVo paramFlowerVo)
  {
    if (paramFlowerVo.isLink)
    {
      Iterator localIterator = this.flowerList.iterator();
      while (localIterator.hasNext())
      {
        FlowerView.FlowerVo localFlowerVo = (FlowerView.FlowerVo)localIterator.next();
        if ((localFlowerVo.userId.equals(paramFlowerVo.userId)) && (localFlowerVo.giftId.equals(paramFlowerVo.giftId)))
        {
          localFlowerVo.linkCount += paramFlowerVo.linkCount;
          return;
        }
      }
      this.flowerList.add(paramFlowerVo);
      return;
    }
    this.flowerList.add(paramFlowerVo);
  }
  
  private void init()
  {
    setOrientation(1);
    this.oneFlowerView = new FlowerView(getContext());
    addView(this.oneFlowerView, -2, -2);
    this.twoFlowerView = new FlowerView(getContext());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.topMargin = getContext().getResources().getDimensionPixelSize(2131230774);
    addView(this.twoFlowerView, localLayoutParams);
  }
  
  private void show(FlowerView paramFlowerView, Animation.AnimationListener paramAnimationListener, FlowerView.FlowerVo paramFlowerVo)
  {
    String str = paramFlowerVo.userId + paramFlowerVo.giftId;
    TwoFlowerView.Link localLink = (TwoFlowerView.Link)this.map.get(str);
    if (localLink != null)
    {
      if (localLink.isTimeOut())
      {
        localLink.reset(paramFlowerVo.linkCount);
        paramFlowerView.show(paramFlowerVo, 0, paramAnimationListener);
        return;
      }
      paramFlowerView.show(paramFlowerVo, localLink.num, paramAnimationListener);
      localLink.addNum(paramFlowerVo.linkCount);
      return;
    }
    localLink = new TwoFlowerView.Link(this, paramFlowerVo.linkCount);
    this.map.put(str, localLink);
    paramFlowerView.show(paramFlowerVo, 0, paramAnimationListener);
  }
  
  public void show(FlowerView.FlowerVo paramFlowerVo)
  {
    if (paramFlowerVo.isLink)
    {
      if (this.oneFlowerView.isShowAnimation)
      {
        if (this.oneFlowerView.isInShow(paramFlowerVo.userId, paramFlowerVo.giftId))
        {
          this.oneFlowerView.setlinkCount(1, paramFlowerVo.linkCount);
          return;
        }
        if (this.twoFlowerView.isShowAnimation)
        {
          if (this.twoFlowerView.isInShow(paramFlowerVo.userId, paramFlowerVo.giftId))
          {
            this.twoFlowerView.setlinkCount(1, paramFlowerVo.linkCount);
            return;
          }
          addList(paramFlowerVo);
          return;
        }
        show(this.twoFlowerView, this.twoListener, paramFlowerVo);
        return;
      }
      if ((this.twoFlowerView.isShowAnimation) && (this.twoFlowerView.isInShow(paramFlowerVo.userId, paramFlowerVo.giftId)))
      {
        this.twoFlowerView.setlinkCount(1, paramFlowerVo.linkCount);
        return;
      }
      show(this.oneFlowerView, this.oneListener, paramFlowerVo);
      return;
    }
    if (this.oneFlowerView.isShowAnimation)
    {
      if (this.twoFlowerView.isShowAnimation)
      {
        addList(paramFlowerVo);
        return;
      }
      this.twoFlowerView.show(paramFlowerVo, 0, this.twoListener);
      return;
    }
    this.oneFlowerView.show(paramFlowerVo, 0, this.oneListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\TwoFlowerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */