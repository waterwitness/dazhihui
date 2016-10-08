package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.UserilvbManager;

public class GameOverView
  extends RelativeLayout
  implements View.OnClickListener
{
  private Activity mActivity;
  private Handler mActivityHandler;
  private TextView mAttentionbtn;
  private Context mContext;
  private LayoutInflater mInflater;
  private boolean mIsGuanZhu = false;
  private TextView mReturnMain;
  private CustomRspMsgVo.RoomInfo mRoomInfo;
  private String mRoomShareUrl;
  private Scroller mScroller;
  private TextView mTitle;
  private TextView mViewerCountTextView;
  private TextView mZhuye;
  
  public GameOverView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public GameOverView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public GameOverView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mActivity = ((Activity)paramContext);
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903176, this);
    this.mViewerCountTextView = ((TextView)findViewById(2131559324));
    this.mReturnMain = ((TextView)findViewById(2131559325));
    this.mAttentionbtn = ((TextView)findViewById(2131559326));
    this.mZhuye = ((TextView)findViewById(2131559327));
    this.mTitle = ((TextView)findViewById(2131559323));
    this.mReturnMain.setOnClickListener(this);
    this.mAttentionbtn.setOnClickListener(this);
    this.mZhuye.setOnClickListener(this);
  }
  
  public void cancel() {}
  
  public void gotoZhuYe(String paramString)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramString + "&formPlant=1");
    localBundle.putString("names", "主页");
    localIntent.putExtras(localBundle);
    localIntent.setClass(this.mContext, BrowserActivity.class);
    this.mContext.startActivity(localIntent);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      n.a("", 20239);
      zhuye();
      return;
      this.mActivity.finish();
      return;
      n.a("", 20236);
      if (!UserilvbManager.getInstance().isFromDZHAccount())
      {
        UserilvbManager.getInstance().showLoginDialog(this.mContext);
        return;
      }
    } while (this.mIsGuanZhu);
    this.mActivityHandler.sendEmptyMessage(279);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void onGuanZhuResult()
  {
    if (!this.mIsGuanZhu) {}
    for (boolean bool = true;; bool = false)
    {
      this.mIsGuanZhu = bool;
      return;
    }
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    if (paramRoomInfo != null)
    {
      this.mRoomInfo = paramRoomInfo;
      this.mViewerCountTextView.setText(paramRoomInfo.PV);
      this.mIsGuanZhu = "1".equals(paramRoomInfo.IsFollow);
    }
  }
  
  public void show(boolean paramBoolean)
  {
    if (paramBoolean == true) {
      this.mTitle.setText("主播已离开");
    }
    if (!this.mIsGuanZhu) {
      this.mAttentionbtn.setText("关注主播");
    }
    for (;;)
    {
      setVisibility(0);
      return;
      this.mAttentionbtn.setText("已关注主播");
    }
  }
  
  public void start() {}
  
  public void updateInfo(String paramString, int paramInt)
  {
    if (paramInt >= 0) {
      this.mViewerCountTextView.setText(String.valueOf(paramInt));
    }
    this.mRoomShareUrl = paramString;
  }
  
  public void updateView(Configuration paramConfiguration)
  {
    int i = getResources().getDimensionPixelOffset(2131230781);
    if (paramConfiguration.orientation == 1)
    {
      ((RelativeLayout.LayoutParams)this.mTitle.getLayoutParams()).topMargin = i;
      return;
    }
    ((RelativeLayout.LayoutParams)this.mTitle.getLayoutParams()).topMargin = (i / 2);
  }
  
  public void zhuye()
  {
    if ((this.mRoomInfo != null) && (!TextUtils.isEmpty(this.mRoomInfo.RoomShareUrl)))
    {
      gotoZhuYe(this.mRoomInfo.RoomShareUrl);
      return;
    }
    if (!TextUtils.isEmpty(this.mRoomShareUrl))
    {
      gotoZhuYe(this.mRoomShareUrl);
      return;
    }
    Toast.makeText(this.mContext, "房间信息获取失败", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GameOverView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */