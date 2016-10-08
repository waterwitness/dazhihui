package com.tencent.avsdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;

public class RoomMemberListView
  extends RelativeLayout
{
  private Context mContext;
  private LayoutInflater mInflater;
  private Scroller mScroller;
  private VideoParaDebugView mVideoParaDebugView;
  
  public RoomMemberListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RoomMemberListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RoomMemberListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
  }
  
  private void updateMemberView() {}
  
  public void cancel() {}
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void showMemberList() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\RoomMemberListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */