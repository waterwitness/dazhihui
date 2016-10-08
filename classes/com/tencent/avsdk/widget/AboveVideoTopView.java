package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.CircularImageButton;
import com.tencent.avsdk.IlvbDataBase;
import com.tencent.avsdk.MemberListAdapter;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerTag;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomUser;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomInfo;
import com.tencent.avsdk.UserilvbManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AboveVideoTopView
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
  private MemberListAdapter mMemberListAdapter;
  private View mNotifySwipeRight;
  private TextView mOwnerRankValue;
  private TextView mPrivilegeText;
  CustomRspMsgVo.RoomInfo mRoomInfo;
  private int mRotation = 0;
  private Scroller mScroller;
  private TextView mTabText1;
  private TextView mTabText2;
  private View mTagLayout;
  private View mTopBackLayout;
  private RelativeLayout mTopHostGroupLayout;
  private TextView owner_activity_value;
  
  public AboveVideoTopView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoTopView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoTopView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903182, this);
    this.mTopBackLayout = findViewById(2131559377);
    this.mTopBackLayout.setOnClickListener(this);
    this.mNotifySwipeRight = findViewById(2131559394);
    if (IlvbDataBase.getInstance().getBoolean("ilvb_notify_swipe_right", true)) {
      this.mNotifySwipeRight.setVisibility(0);
    }
    findViewById(2131559397).setOnClickListener(new AboveVideoTopView.1(this));
    this.mClockTextView = ((TextView)findViewById(2131559382));
    this.mTopHostGroupLayout = ((RelativeLayout)findViewById(2131559378));
    this.hostHead = ((CircularImageButton)findViewById(2131559379));
    this.ilvb_guest_live_label = ((TextView)findViewById(2131559381));
    this.mGuanZhuLayout = findViewById(2131559383);
    this.mGuanZhuLayout.setOnClickListener(this);
    this.mGuanZhuLayout.setVisibility(8);
    this.mHuiPiaoLayout = findViewById(2131559388);
    this.mOwnerRankValue = ((TextView)findViewById(2131559390));
    this.mHuiPiaoValue = ((TextView)findViewById(2131559391));
    this.owner_activity_value = ((TextView)findViewById(2131559389));
    this.mGuanZhu = ((TextView)findViewById(2131559384));
    this.mPrivilegeText = ((TextView)findViewById(2131559393));
    this.hostHead.setOnClickListener(this);
    this.mGallery = ((MyGallery)findViewById(2131559392));
    this.mMemberListAdapter = new MemberListAdapter(this.mContext);
    this.mGallery.setAdapter(this.mMemberListAdapter);
    this.mGallery.setOnItemSelectedListener(new AboveVideoTopView.2(this));
    this.mTagLayout = findViewById(2131559385);
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
    case 2131559379: 
      this.mActivityHandler.sendEmptyMessage(285);
      return;
    case 2131559383: 
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
      return;
    }
    n.a("", 20261);
    paramView = new Message();
    paramView.what = 297;
    paramView.arg1 = 1;
    this.mActivityHandler.sendMessage(paramView);
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
      this.mGuanZhuLayout.setVisibility(0);
      return;
    }
    this.mGuanZhu.setText("已关注");
    this.mIsGuanZhu = true;
    this.mGuanZhuLayout.setVisibility(8);
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setHuiPiao(String paramString1, String paramString2)
  {
    this.mHuiPiaoValue.setText(String.valueOf(paramString1) + "币");
    if (!TextUtils.isEmpty(paramString2)) {
      this.mHuiPiaoLayout.setOnClickListener(new AboveVideoTopView.4(this, paramString2));
    }
  }
  
  public void setNumber(CustomSysMsgVo.RoomInfo paramRoomInfo)
  {
    this.mClockTextView.setText(paramRoomInfo.MemberNum + "人");
  }
  
  public void setOwnerRank(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.mOwnerRankValue.setText(paramString + "名");
    }
  }
  
  public void setPrivilege(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      if (!TextUtils.isEmpty(paramString1)) {
        this.mPrivilegeText.setText(paramString1);
      }
      this.mPrivilegeText.setVisibility(0);
      this.mPrivilegeText.setOnClickListener(new AboveVideoTopView.3(this, paramString2));
      return;
    }
    this.mPrivilegeText.setVisibility(8);
  }
  
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    this.mRoomInfo = paramRoomInfo;
    this.mClockTextView.setText(paramRoomInfo.MemberNum + "人");
    if ((paramRoomInfo != null) && (!TextUtils.isEmpty(paramRoomInfo.OwnerName))) {
      this.ilvb_guest_live_label.setText(paramRoomInfo.OwnerName);
    }
    Object localObject = new SimpleDateFormat("yyyyMMdd");
    r.a(getContext()).a(paramRoomInfo.OwnerAccountImg + "?time=" + ((SimpleDateFormat)localObject).format(new Date()), this.hostHead, 2130838231);
    Log.d(this.TAG, "AboveVideoTopView setContent roomInfo.IsFollow=" + paramRoomInfo.IsFollow);
    if ("1".equals(paramRoomInfo.IsFollow))
    {
      this.mGuanZhu.setText("已关注");
      this.mIsGuanZhu = true;
      this.mGuanZhuLayout.setVisibility(8);
    }
    for (;;)
    {
      if ((this.mRoomInfo.OwnerTags != null) && (this.mRoomInfo.OwnerTags.size() > 0))
      {
        this.mTabText1.setVisibility(0);
        this.mTabText1.setText(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(0)).Tag);
        localObject = (GradientDrawable)this.mTabText1.getBackground();
      }
      try
      {
        ((GradientDrawable)localObject).setColor(Color.parseColor(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(0)).Color));
        if (this.mRoomInfo.OwnerTags.size() > 1)
        {
          this.mTabText2.setVisibility(0);
          this.mTabText2.setText(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(1)).Tag);
          localObject = (GradientDrawable)this.mTabText2.getBackground();
        }
      }
      catch (Exception localException1)
      {
        try
        {
          ((GradientDrawable)localObject).setColor(Color.parseColor(((CustomRspMsgVo.OwnerTag)this.mRoomInfo.OwnerTags.get(1)).Color));
          if (!TextUtils.isEmpty(paramRoomInfo.ActivityName))
          {
            this.owner_activity_value.setVisibility(0);
            this.owner_activity_value.setText(paramRoomInfo.ActivityName);
            return;
            this.mGuanZhu.setText("关注");
            this.mIsGuanZhu = false;
            this.mGuanZhuLayout.setVisibility(0);
            continue;
            localException1 = localException1;
            localException1.printStackTrace();
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            localException2.printStackTrace();
          }
          this.owner_activity_value.setVisibility(8);
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
  
  public void updateView(Configuration paramConfiguration)
  {
    getResources().getDimensionPixelOffset(2131230829);
    getResources().getDimensionPixelOffset(2131230798);
    if (paramConfiguration.orientation == 1)
    {
      this.mTagLayout.setVisibility(0);
      this.mHuiPiaoLayout.setVisibility(0);
      paramConfiguration = new RelativeLayout.LayoutParams(-2, -2);
      paramConfiguration.addRule(11);
      paramConfiguration.rightMargin = getResources().getDimensionPixelOffset(2131230799);
      paramConfiguration.topMargin = getResources().getDimensionPixelOffset(2131230849);
      this.mPrivilegeText.setLayoutParams(paramConfiguration);
      ((RelativeLayout.LayoutParams)this.mGallery.getLayoutParams()).addRule(1, this.mTopHostGroupLayout.getId());
      this.mTopBackLayout.setVisibility(8);
      this.mMemberListAdapter.setShowName(true);
      return;
    }
    if (IlvbDataBase.getInstance().getBoolean("ilvb_notify_swipe_right_land", true)) {
      this.mNotifySwipeRight.setVisibility(0);
    }
    findViewById(2131559397).setOnClickListener(new AboveVideoTopView.5(this));
    this.mHuiPiaoLayout.setVisibility(8);
    this.mTagLayout.setVisibility(8);
    paramConfiguration = new RelativeLayout.LayoutParams(-2, -2);
    paramConfiguration.addRule(1, this.mTopHostGroupLayout.getId());
    paramConfiguration.topMargin = getResources().getDimensionPixelOffset(2131230774);
    paramConfiguration.leftMargin = getResources().getDimensionPixelOffset(2131230774);
    paramConfiguration.rightMargin = 0;
    this.mPrivilegeText.setLayoutParams(paramConfiguration);
    ((RelativeLayout.LayoutParams)this.mGallery.getLayoutParams()).addRule(1, this.mPrivilegeText.getId());
    this.mTopBackLayout.setVisibility(0);
    this.mMemberListAdapter.setShowName(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoTopView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */