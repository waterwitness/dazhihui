package com.tencent.avsdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.g;

public class AboveVideoNotSwipeView
  extends RelativeLayout
  implements View.OnClickListener
{
  private String TAG = "ilvb";
  private Handler mActivityHandler;
  private Context mContext;
  private View mDebugPara;
  private Dialog mDialog;
  private View mEmptyView;
  private LayoutInflater mInflater;
  private Scroller mScroller;
  private VideoParaDebugView mVideoParaDebugView;
  
  public AboveVideoNotSwipeView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoNotSwipeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoNotSwipeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903181, this);
    findViewById(2131559374).setOnClickListener(this);
    this.mEmptyView = findViewById(2131559330);
    this.mDebugPara = findViewById(2131559375);
    if (g.a().L())
    {
      this.mDebugPara.setVisibility(0);
      this.mDebugPara.setOnClickListener(this);
    }
    this.mVideoParaDebugView = new VideoParaDebugView(paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.mVideoParaDebugView, paramContext);
  }
  
  public void cancel()
  {
    this.mVideoParaDebugView.cancel();
  }
  
  public void memberCloseAlertDialog()
  {
    this.mDialog = new Dialog(this.mContext, 2131296301);
    this.mDialog.setContentView(2130903110);
    TextView localTextView = (TextView)this.mDialog.findViewById(2131558894);
    Button localButton1 = (Button)this.mDialog.findViewById(2131558895);
    Button localButton2 = (Button)this.mDialog.findViewById(2131558898);
    Button localButton3 = (Button)this.mDialog.findViewById(2131558896);
    localTextView.setText("确认退出吗？");
    localButton1.setText("结束观看");
    localButton2.setText("继续观看");
    localButton3.setText("只听音频");
    localButton3.setVisibility(0);
    this.mDialog.findViewById(2131558897).setVisibility(0);
    localButton1.setOnClickListener(new AboveVideoNotSwipeView.1(this));
    localButton2.setOnClickListener(new AboveVideoNotSwipeView.2(this));
    localButton3.setOnClickListener(new AboveVideoNotSwipeView.3(this));
    this.mDialog.show();
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (getContext() != null)) {}
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559375: 
      if (this.mVideoParaDebugView.getVisibility() != 0)
      {
        this.mVideoParaDebugView.start();
        return;
      }
      this.mVideoParaDebugView.cancel();
      return;
    }
    this.mActivityHandler.sendEmptyMessage(262);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void start() {}
  
  public void updateView(Configuration paramConfiguration)
  {
    if (paramConfiguration.orientation == 1)
    {
      this.mEmptyView.setVisibility(8);
      return;
    }
    this.mEmptyView.setVisibility(4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoNotSwipeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */