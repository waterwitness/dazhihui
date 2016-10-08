package com.tencent.avsdk.widget;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import com.tencent.avsdk.control.QavsdkControl;

public class VideoParaDebugView
  extends RelativeLayout
{
  private static final int mAutoRefreshTime = 1000;
  private boolean mAllowShowPara = false;
  private Handler mAutoHandler = new Handler();
  private Runnable mAutoRunnable = new VideoParaDebugView.1(this);
  private Context mContext;
  private LayoutInflater mInflater;
  private TextView mParaTextView;
  private QavsdkControl mQavsdkControl;
  private Scroller mScroller;
  private int mTextSizeSP = 12;
  
  public VideoParaDebugView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public VideoParaDebugView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VideoParaDebugView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mParaTextView = new TextView(paramContext);
    this.mParaTextView.setSingleLine(false);
    this.mParaTextView.setTextSize(2, this.mTextSizeSP);
    this.mParaTextView.setTextColor(-16711936);
    this.mParaTextView.setText("");
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.topMargin = 100;
    paramContext.bottomMargin = 100;
    paramContext.leftMargin = 5;
    paramContext.rightMargin = 5;
    addView(this.mParaTextView, paramContext);
    setVisibility(8);
  }
  
  private String praseString(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    String[] arrayOfString1;
    int i;
    do
    {
      return str;
      str = "";
      arrayOfString1 = paramString.split("\\n");
      i = 0;
      paramString = str;
      str = paramString;
    } while (i >= arrayOfString1.length);
    if (arrayOfString1[i].length() < 2) {
      str = paramString;
    }
    for (;;)
    {
      i += 1;
      paramString = str;
      break;
      String[] arrayOfString2 = arrayOfString1[i].split(":");
      str = paramString;
      if (arrayOfString2[0].length() != "mainVideoSendSmallViewQua".length())
      {
        if (arrayOfString2[0].endsWith("BigViewQua")) {
          arrayOfString2[0] = "mainVideoSendViewQua";
        }
        if (arrayOfString2[0].endsWith("BigViewQos")) {
          arrayOfString2[0] = "mainVideoSendViewQos";
        }
        paramString = paramString + arrayOfString2[0] + ":\n" + "\t\t";
        int j = 1;
        while (j < arrayOfString2.length)
        {
          paramString = paramString + arrayOfString2[j];
          j += 1;
        }
        str = paramString + "\n";
      }
    }
  }
  
  private void showVideoPara()
  {
    if (this.mAllowShowPara)
    {
      if (this.mParaTextView != null) {}
      return;
    }
    this.mParaTextView.setText("");
  }
  
  public void cancel()
  {
    setVisibility(8);
    this.mAllowShowPara = false;
    this.mAutoHandler.removeCallbacks(this.mAutoRunnable);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void start()
  {
    setVisibility(0);
    this.mAllowShowPara = true;
    this.mAutoHandler.removeCallbacks(this.mAutoRunnable);
    this.mAutoHandler.post(this.mAutoRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\VideoParaDebugView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */