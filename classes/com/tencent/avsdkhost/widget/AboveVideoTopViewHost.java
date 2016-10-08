package com.tencent.avsdkhost.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.CircularImageButton;
import com.tencent.avsdk.IlvbDataBase;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerTag;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomUser;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomInfo;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.widget.MyGallery;
import com.tencent.avsdkhost.MemberListAdapterHost;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AboveVideoTopViewHost
  extends RelativeLayout
  implements View.OnClickListener
{
  private static final int slength = 40;
  private String TAG = "ilvb";
  private float density;
  private CircularImageButton hostHead;
  private TextView ilvb_guest_live_label;
  private Handler mActivityHandler;
  private TextView mClockTextView;
  private Context mContext;
  private MyGallery mGallery;
  private TextView mGuanZhu;
  private View mGuanZhuLayout;
  private View mHuiPiaoLayout;
  private TextView mHuiPiaoValue;
  private LayoutInflater mInflater;
  private boolean mIsGuanZhu = false;
  private MemberListAdapterHost mMemberListAdapter;
  private View mNotifySwipeRight;
  CustomRspMsgVo.RoomInfo mRoomInfo;
  private Scroller mScroller;
  private TextView mTabText1;
  private TextView mTabText2;
  private TextView rank_value;
  private View tequan;
  
  public AboveVideoTopViewHost(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoTopViewHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoTopViewHost(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903191, this);
    this.mNotifySwipeRight = findViewById(2131559394);
    if (IlvbDataBase.getInstance().getBoolean("ilvb_notify_swipe_right", true)) {
      this.mNotifySwipeRight.setVisibility(0);
    }
    findViewById(2131559397).setOnClickListener(new AboveVideoTopViewHost.1(this));
    this.mClockTextView = ((TextView)findViewById(2131559382));
    this.hostHead = ((CircularImageButton)findViewById(2131559379));
    this.ilvb_guest_live_label = ((TextView)findViewById(2131559381));
    this.tequan = findViewById(2131559419);
    this.tequan.setOnClickListener(this);
    this.mGuanZhuLayout = findViewById(2131559383);
    this.mGuanZhuLayout.setOnClickListener(this);
    this.mGuanZhuLayout.setVisibility(8);
    this.mHuiPiaoLayout = findViewById(2131559388);
    this.mHuiPiaoValue = ((TextView)findViewById(2131559391));
    this.rank_value = ((TextView)findViewById(2131559420));
    this.mGuanZhu = ((TextView)findViewById(2131559384));
    this.hostHead.setOnClickListener(this);
    this.mGallery = ((MyGallery)findViewById(2131559392));
    this.mMemberListAdapter = new MemberListAdapterHost(this.mContext);
    this.mGallery.setAdapter(this.mMemberListAdapter);
    this.mGallery.setOnItemSelectedListener(new AboveVideoTopViewHost.2(this));
    this.mTabText1 = ((TextView)findViewById(2131559386));
    this.mTabText2 = ((TextView)findViewById(2131559387));
  }
  
  public void cancel() {}
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (getContext() != null)) {}
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559419: 
      paramView = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", this.mRoomInfo.PrivilegeUrl);
      paramView.putExtras(localBundle);
      paramView.setClass(this.mContext, BrowserActivity.class);
      this.mContext.startActivity(paramView);
      return;
    case 2131559379: 
      this.mActivityHandler.sendEmptyMessage(285);
      return;
    }
    if (!UserilvbManager.getInstance().isFromDZHAccount())
    {
      UserilvbManager.getInstance().showLoginDialog(this.mContext);
      return;
    }
    if (!this.mIsGuanZhu)
    {
      this.mActivityHandler.sendEmptyMessage(279);
      return;
    }
    this.mActivityHandler.sendEmptyMessage(281);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void onGuanZhuResult()
  {
    if (this.mIsGuanZhu)
    {
      this.mGuanZhu.setText("关注");
      this.mIsGuanZhu = false;
      this.mGuanZhuLayout.setVisibility(8);
      this.tequan.setVisibility(8);
    }
    do
    {
      return;
      this.mGuanZhu.setText("已关注");
      this.mIsGuanZhu = true;
      this.mGuanZhuLayout.setVisibility(8);
    } while ((this.mRoomInfo == null) || (TextUtils.isEmpty(this.mRoomInfo.PrivilegeUrl)));
    this.tequan.setVisibility(0);
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setHuiPiao(String paramString1, String paramString2)
  {
    this.mHuiPiaoValue.setText(String.valueOf(paramString1));
    if (!TextUtils.isEmpty(paramString2)) {
      this.mHuiPiaoLayout.setOnClickListener(new AboveVideoTopViewHost.3(this, paramString2));
    }
  }
  
  public void setNumber(CustomSysMsgVo.RoomInfo paramRoomInfo)
  {
    this.mClockTextView.setText(paramRoomInfo.MemberNum + "人");
  }
  
  public void setOwnerInfo(CustomRspMsgVo.OwnerRsp paramOwnerRsp)
  {
    this.mHuiPiaoValue.setText(String.valueOf(paramOwnerRsp.Diamond));
  }
  
  public void setRank(int paramInt)
  {
    this.rank_value.setText(String.valueOf(paramInt));
  }
  
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    this.mRoomInfo = paramRoomInfo;
    this.mClockTextView.setText(paramRoomInfo.MemberNum + "人");
    if ((paramRoomInfo != null) && (!TextUtils.isEmpty(paramRoomInfo.OwnerName))) {
      this.ilvb_guest_live_label.setText(paramRoomInfo.OwnerName);
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    r.a(getContext()).a(paramRoomInfo.OwnerAccountImg + "?time=" + localSimpleDateFormat.format(new Date()), this.hostHead, 2130838231);
    Log.d(this.TAG, "AboveVideoTopView setContent roomInfo.IsFollow=" + paramRoomInfo.IsFollow);
    if ("1".equals(paramRoomInfo.IsFollow))
    {
      this.mGuanZhu.setText("已关注");
      this.mIsGuanZhu = true;
      this.mGuanZhuLayout.setVisibility(8);
      if ((paramRoomInfo != null) && (!TextUtils.isEmpty(paramRoomInfo.PrivilegeUrl))) {
        this.tequan.setVisibility(0);
      }
    }
    for (;;)
    {
      if ((this.mRoomInfo.OwnerTags != null) && (this.mRoomInfo.OwnerTags.size() > 0))
      {
        this.mTabText1.setVisibility(0);
        this.mTabText1.setText(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(0)).Tag);
        paramRoomInfo = (GradientDrawable)this.mTabText1.getBackground();
      }
      try
      {
        paramRoomInfo.setColor(Color.parseColor(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(0)).Color));
        if (this.mRoomInfo.OwnerTags.size() > 1)
        {
          this.mTabText2.setVisibility(0);
          this.mTabText2.setText(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(1)).Tag);
          paramRoomInfo = (GradientDrawable)this.mTabText2.getBackground();
        }
        try
        {
          paramRoomInfo.setColor(Color.parseColor(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(1)).Color));
          return;
        }
        catch (Exception paramRoomInfo)
        {
          paramRoomInfo.printStackTrace();
        }
        this.mGuanZhu.setText("关注");
        this.mIsGuanZhu = false;
        this.mGuanZhuLayout.setVisibility(8);
        this.tequan.setVisibility(8);
      }
      catch (Exception paramRoomInfo)
      {
        for (;;)
        {
          paramRoomInfo.printStackTrace();
        }
      }
    }
  }
  
  public void start() {}
  
  public void updateUserList(List<CustomRspMsgVo.RoomUser> paramList)
  {
    if (this.mMemberListAdapter != null) {
      this.mMemberListAdapter.refreshUser(paramList);
    }
  }
  
  public void updateView(Configuration paramConfiguration) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoTopViewHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */