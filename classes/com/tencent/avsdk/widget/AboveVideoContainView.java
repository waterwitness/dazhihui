package com.tencent.avsdk.widget;

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
import com.tencent.avsdk.MyUserInfoDialog;
import com.tencent.avsdk.control.MessageControl;

public class AboveVideoContainView
  extends RelativeLayout
{
  private AboveVideoBottomView mAboveVideoBottomView;
  private AboveVideoNotSwipeView mAboveVideoNotSwipeView;
  private AboveVideoTopView mAboveVideoTopView;
  private Handler mActivityHandler;
  private Context mContext;
  private LayoutInflater mInflater;
  private MyUserInfoDialog mMyUserInfoDialogView;
  private Scroller mScroller;
  private Animation topViewInAnimation;
  private Animation topViewOutAnimation;
  
  public AboveVideoContainView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoContainView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoContainView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mAboveVideoTopView = new AboveVideoTopView(paramContext);
    this.mAboveVideoBottomView = new AboveVideoBottomView(paramContext);
    this.mAboveVideoBottomView.setParent(this);
    this.mMyUserInfoDialogView = new MyUserInfoDialog(paramContext);
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
  
  public AboveVideoBottomView getAboveVideoBottomView()
  {
    return this.mAboveVideoBottomView;
  }
  
  public AboveVideoTopView getAboveVideoTopView()
  {
    return this.mAboveVideoTopView;
  }
  
  public MyUserInfoDialog getMyUserInfoDialogView()
  {
    return this.mMyUserInfoDialogView;
  }
  
  public void init(MessageControl paramMessageControl)
  {
    this.mAboveVideoBottomView.init(paramMessageControl);
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
  
  public void setAboveVideoNotSwipeView(AboveVideoNotSwipeView paramAboveVideoNotSwipeView)
  {
    this.mAboveVideoNotSwipeView = paramAboveVideoNotSwipeView;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoContainView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */