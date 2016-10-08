package com.tencent.avsdkhost.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Scroller;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.widget.DanMuView;
import com.tencent.avsdkhost.control.MessageControlHost;
import java.util.ArrayList;
import java.util.List;

public class DanMuContainViewHost
  extends LinearLayout
  implements View.OnClickListener
{
  private final int DAN_MU_MAX_COUNT = 3;
  private Handler mActivityHandler;
  private Handler mAutoFlipHandler = new Handler();
  private Runnable mAutoFlipRunnable = new DanMuContainViewHost.1(this);
  private int mAutoRefreshTime = 5000;
  private List<ChatEntity> mChatDataList = new ArrayList();
  private Context mContext;
  private DanMuView[] mDanMuViews;
  private LayoutInflater mInflater;
  private Scroller mScroller;
  
  public DanMuContainViewHost(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DanMuContainViewHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DanMuContainViewHost(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    setGravity(80);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mDanMuViews = new DanMuView[3];
    paramAttributeSet = new LinearLayout.LayoutParams(-1, -2);
    paramInt = 0;
    while (paramInt < 3)
    {
      this.mDanMuViews[paramInt] = new DanMuView(paramContext);
      this.mDanMuViews[paramInt].setVisibility(4);
      addView(this.mDanMuViews[paramInt], paramAttributeSet);
      paramInt += 1;
    }
  }
  
  public void cancel()
  {
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
  }
  
  public void init(MessageControlHost paramMessageControlHost) {}
  
  public void onClick(View paramView)
  {
    paramView.getId();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void refreshDanMu()
  {
    int j;
    if (this.mChatDataList != null)
    {
      int i = this.mChatDataList.size() - 1;
      j = 0;
      if ((j < 3) && (i >= 0))
      {
        if (!this.mDanMuViews[j].isAvailable()) {
          break label107;
        }
        ChatEntity localChatEntity = (ChatEntity)this.mChatDataList.remove(i);
        this.mDanMuViews[j].updateDanMu(localChatEntity);
        i -= 1;
      }
    }
    label107:
    for (;;)
    {
      j += 1;
      break;
      if (this.mChatDataList.size() > 0) {
        this.mAutoFlipHandler.postDelayed(this.mAutoFlipRunnable, this.mAutoRefreshTime);
      }
      return;
    }
  }
  
  public void refreshDanMu(ChatEntity paramChatEntity)
  {
    if (paramChatEntity == null) {
      return;
    }
    if (this.mChatDataList == null) {
      this.mChatDataList = new ArrayList();
    }
    this.mChatDataList.add(paramChatEntity);
    refreshDanMu();
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void start()
  {
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
    this.mAutoFlipHandler.post(this.mAutoFlipRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\DanMuContainViewHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */