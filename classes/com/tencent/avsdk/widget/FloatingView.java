package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import com.android.dazhihui.g;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.UserilvbManager.RoomInfo;
import com.tencent.avsdk.activity.AvGuestActivity;

public class FloatingView
  extends LinearLayout
  implements View.OnClickListener
{
  private static final int MOVE_DISTANCE_MIN = 10;
  private static final String TAG = "ilvb";
  private View mContentView = null;
  private Context mContext;
  private int mDzhBottomLayoutHeight;
  private int mDzhTopLayoutHeight;
  private boolean mIsShowing = false;
  private int mOrientation = 1;
  private float mRawStartX = 0.0F;
  private float mRawStartY = 0.0F;
  private float mRawX;
  private float mRawY;
  private View mReturnIlvb;
  private int mScreenHeight;
  private int mScreenWidth;
  private int mStatusBarHeight;
  private WindowManager mWindowManager;
  private WindowManager.LayoutParams mWindowParams;
  
  public FloatingView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
  }
  
  public FloatingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public FloatingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private int getStatusBarHeight()
  {
    try
    {
      Resources localResources = this.mContext.getResources();
      int i = localResources.getDimensionPixelSize(localResources.getIdentifier("status_bar_height", "dimen", "android"));
      Log.v("ilvb", "Status height:" + i);
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  private void init()
  {
    initWindowParams();
    initView();
  }
  
  private void initView()
  {
    this.mContentView = LayoutInflater.from(this.mContext).inflate(2130903175, null);
    this.mReturnIlvb = this.mContentView.findViewById(2131559322);
    this.mReturnIlvb.setOnClickListener(this);
    addView(this.mContentView, -2, -2);
    this.mWindowManager.addView(this, this.mWindowParams);
  }
  
  private void initWindowParams()
  {
    this.mWindowManager = ((WindowManager)this.mContext.getSystemService("window"));
    Object localObject = new DisplayMetrics();
    ((Activity)this.mContext).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
    if (this.mStatusBarHeight <= 0)
    {
      localObject = new Rect();
      ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
      this.mStatusBarHeight = ((Rect)localObject).top;
    }
    if (this.mStatusBarHeight <= 0) {
      this.mStatusBarHeight = getStatusBarHeight();
    }
    if (this.mStatusBarHeight <= 0) {
      this.mStatusBarHeight = ((int)this.mContext.getResources().getDimension(2131230828));
    }
    this.mDzhBottomLayoutHeight = ((int)this.mContext.getResources().getDimension(2131230835) + 1);
    this.mDzhTopLayoutHeight = ((int)this.mContext.getResources().getDimension(2131230828));
    Log.d("ilvb", "FloatingView initWindowParams mScreenHeight = " + this.mScreenHeight + " mStatusBarHeight = " + this.mStatusBarHeight);
    this.mWindowParams = UserilvbManager.getInstance().getWindowManagerLayoutParams();
    this.mWindowParams.type = 2005;
    this.mWindowParams.gravity = 85;
    this.mWindowParams.x = 0;
    this.mWindowParams.y = this.mDzhBottomLayoutHeight;
    this.mWindowParams.width = -2;
    this.mWindowParams.height = -2;
    this.mWindowParams.flags = 264;
    this.mWindowParams.format = -3;
    this.mWindowParams.windowAnimations = 0;
  }
  
  private boolean isNeedUpdateViewPosition()
  {
    return (Math.abs(this.mRawX - this.mRawStartX) > 10.0F) || (Math.abs(this.mRawY - this.mRawStartY) > 10.0F);
  }
  
  private void updateViewPosition()
  {
    if ((this.mScreenWidth <= 0) || (this.mScreenHeight <= 0)) {
      return;
    }
    int i;
    if (this.mOrientation == 1)
    {
      this.mWindowParams.x = ((int)(this.mScreenWidth - this.mRawX - getMeasuredWidth() / 2));
      i = (int)(this.mScreenHeight - this.mRawY - getMeasuredHeight() / 2);
      if (this.mRawY <= this.mDzhTopLayoutHeight + this.mStatusBarHeight + getMeasuredHeight() / 2) {
        this.mWindowParams.y = (this.mScreenHeight - (this.mDzhTopLayoutHeight + this.mStatusBarHeight + getMeasuredHeight()));
      }
    }
    for (;;)
    {
      if (g.a().L()) {
        Log.i("ilvb", "updateViewPosition mRawX=" + this.mRawX + " mRawY=" + this.mRawY + " w=" + this.mScreenWidth + " h=" + this.mScreenHeight + " [x=" + this.mWindowParams.x + ", y=" + this.mWindowParams.y + "]");
      }
      this.mWindowManager.updateViewLayout(this, this.mWindowParams);
      return;
      if (i <= this.mDzhBottomLayoutHeight)
      {
        this.mWindowParams.y = this.mDzhBottomLayoutHeight;
      }
      else
      {
        this.mWindowParams.y = i;
        continue;
        this.mWindowParams.x = ((int)(this.mScreenHeight - this.mRawX - getMeasuredWidth() / 2));
        i = (int)(this.mScreenWidth - this.mRawY - getMeasuredHeight() / 2);
        if (this.mRawY <= getMeasuredHeight() / 2 + 0) {
          this.mWindowParams.y = (this.mScreenWidth - (getMeasuredHeight() + 0));
        } else {
          this.mWindowParams.y = i;
        }
      }
    }
  }
  
  public void hide()
  {
    if ((this.mWindowManager != null) && (this.mContentView != null) && (this.mIsShowing))
    {
      Log.d("ilvb", "FloatingView hide()");
      setVisibility(8);
      this.mIsShowing = false;
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    paramView = UserilvbManager.getInstance().getSavedRoomInfo();
    Context localContext;
    if (paramView != null)
    {
      Log.d("ilvb", "from only sound bypass=" + UserilvbManager.getInstance().mAccountChangeInSoundMode);
      localContext = this.mContext;
      if (UserilvbManager.getInstance().mAccountChangeInSoundMode) {
        break label125;
      }
    }
    label125:
    for (boolean bool = true;; bool = false)
    {
      AvGuestActivity.startAvGuestActivity(null, -1, localContext, bool, paramView.mRoomID, paramView.mHostIdentifier, paramView.mRoomImage, paramView.mRoomShareUrl, paramView.mRoomPV, paramView.mGroupId, "", "");
      hide();
      return;
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2)
    {
      this.mOrientation = 2;
      return;
    }
    this.mOrientation = 1;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.mRawX = paramMotionEvent.getRawX();
    this.mRawY = paramMotionEvent.getRawY();
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      do
      {
        for (;;)
        {
          return super.onInterceptTouchEvent(paramMotionEvent);
          this.mRawStartX = this.mRawX;
          this.mRawStartY = this.mRawY;
        }
      } while (!isNeedUpdateViewPosition());
      return true;
    } while (!isNeedUpdateViewPosition());
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.mRawX = paramMotionEvent.getRawX();
    this.mRawY = paramMotionEvent.getRawY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      updateViewPosition();
      continue;
      updateViewPosition();
    }
  }
  
  public void release()
  {
    if ((this.mWindowManager != null) && (this.mContentView != null))
    {
      Log.d("ilvb", "FloatingView release()");
      this.mWindowManager.removeView(this);
      this.mIsShowing = false;
      this.mContentView = null;
    }
  }
  
  public void show()
  {
    if ((this.mWindowManager != null) && (this.mContentView != null) && (!this.mIsShowing))
    {
      Log.d("ilvb", "FloatingView show()");
      setVisibility(0);
      this.mIsShowing = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FloatingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */