package com.tencent.avsdkhost.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import com.tencent.avsdkhost.control.MessageControlHost;

public class AboveVideoContainViewHost
  extends RelativeLayout
{
  private AboveVideoBottomViewHost mAboveVideoBottomView;
  private AboveVideoNotSwipeViewHost mAboveVideoNotSwipeView;
  private AboveVideoTopViewHost mAboveVideoTopView;
  private Handler mActivityHandler;
  private Context mContext;
  private LayoutInflater mInflater;
  private MyUserInfoDialogHost mMyUserInfoDialogView;
  private Scroller mScroller;
  private Animation topViewInAnimation;
  private Animation topViewOutAnimation;
  
  public AboveVideoContainViewHost(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoContainViewHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoContainViewHost(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mAboveVideoTopView = new AboveVideoTopViewHost(paramContext);
    this.mAboveVideoBottomView = new AboveVideoBottomViewHost(paramContext);
    this.mMyUserInfoDialogView = new MyUserInfoDialogHost(paramContext);
    this.mMyUserInfoDialogView.setParent(this);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(10);
    addView(this.mAboveVideoBottomView, paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(10);
    addView(this.mAboveVideoTopView, paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(13);
    addView(this.mMyUserInfoDialogView, paramContext);
    this.topViewInAnimation = AnimationUtils.loadAnimation(getContext(), 2130968601);
    this.topViewOutAnimation = AnimationUtils.loadAnimation(getContext(), 2130968602);
  }
  
  public void cancel()
  {
    this.mAboveVideoTopView.cancel();
    this.mAboveVideoBottomView.cancel();
    this.mMyUserInfoDialogView.dismiss();
  }
  
  public AboveVideoBottomViewHost getAboveVideoBottomView()
  {
    return this.mAboveVideoBottomView;
  }
  
  public AboveVideoTopViewHost getAboveVideoTopView()
  {
    return this.mAboveVideoTopView;
  }
  
  public MyUserInfoDialogHost getMyUserInfoDialogView()
  {
    return this.mMyUserInfoDialogView;
  }
  
  public void init(MessageControlHost paramMessageControlHost)
  {
    this.mAboveVideoBottomView.init(paramMessageControlHost);
  }
  
  public void memberCloseAlertDialog()
  {
    if (!this.mAboveVideoBottomView.showInputHideMenu(false)) {
      this.mAboveVideoNotSwipeView.memberCloseAlertDialog();
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void onReplyClick()
  {
    this.mAboveVideoBottomView.showInputHideMenu(true);
    this.mMyUserInfoDialogView.dismiss();
  }
  
  public void setAboveVideoNotSwipeView(AboveVideoNotSwipeViewHost paramAboveVideoNotSwipeViewHost)
  {
    this.mAboveVideoNotSwipeView = paramAboveVideoNotSwipeViewHost;
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
    this.mAboveVideoBottomView.setActivityHandler(paramHandler);
    this.mAboveVideoTopView.setActivityHandler(paramHandler);
    this.mMyUserInfoDialogView.setActivityHandler(paramHandler);
  }
  
  public void setTopViewVisiable(int paramInt)
  {
    if (paramInt == 0)
    {
      this.mAboveVideoTopView.setVisibility(paramInt);
      this.mAboveVideoTopView.startAnimation(this.topViewInAnimation);
      return;
    }
    this.mAboveVideoTopView.startAnimation(this.topViewOutAnimation);
    this.mAboveVideoTopView.setVisibility(paramInt);
  }
  
  public void start()
  {
    this.mAboveVideoTopView.start();
  }
  
  public void updateView(Configuration paramConfiguration) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoContainViewHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */