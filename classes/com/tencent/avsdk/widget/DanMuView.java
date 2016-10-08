package com.tencent.avsdk.widget;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.CircularImageButton;

public class DanMuView
  extends RelativeLayout
  implements View.OnClickListener
{
  private Handler mActivityHandler;
  private Animation mAnimation;
  private CircularImageButton mCircularImageButton;
  private TextView mContent;
  private Context mContext;
  private LayoutInflater mInflater;
  private Scroller mScroller;
  private TextView mSender;
  
  public DanMuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DanMuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DanMuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903180, this);
    this.mCircularImageButton = ((CircularImageButton)findViewById(2131559372));
    this.mSender = ((TextView)findViewById(2131559370));
    this.mContent = ((TextView)findViewById(2131559371));
    this.mAnimation = AnimationUtils.loadAnimation(paramContext, 2130968600);
    this.mAnimation.setAnimationListener(new DanMuView.1(this));
  }
  
  public void cancel() {}
  
  public boolean isAvailable()
  {
    return getVisibility() != 0;
  }
  
  public void onClick(View paramView) {}
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void start() {}
  
  public void updateDanMu(ChatEntity paramChatEntity)
  {
    if (TextUtils.isEmpty(paramChatEntity.user))
    {
      this.mSender.setText("");
      if (!TextUtils.isEmpty(paramChatEntity.event)) {
        break label91;
      }
      this.mContent.setText("");
      label38:
      if (TextUtils.isEmpty(paramChatEntity.userImg)) {
        break label105;
      }
      r.a(getContext()).a(paramChatEntity.userImg, this.mCircularImageButton, 2130838231);
    }
    for (;;)
    {
      startAnimation(this.mAnimation);
      return;
      this.mSender.setText(paramChatEntity.user);
      break;
      label91:
      this.mContent.setText(paramChatEntity.event);
      break label38;
      label105:
      this.mCircularImageButton.setImageResource(2130838231);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\DanMuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */