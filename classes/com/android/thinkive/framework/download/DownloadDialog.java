package com.android.thinkive.framework.download;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.thinkive.framework.util.ScreenUtil;

public class DownloadDialog
  extends Dialog
{
  private static final int BACKGROUND = -1842205;
  private static final int TEXT_COLOR = -13421773;
  private LinearLayout mBottomLayout;
  private Button mCancelBtn;
  private LinearLayout mContentLayout;
  private Context mContext;
  private TextView mDownLoadFileSizeTv;
  private View mDownloadLayout;
  private DownloadManager mDownloadManager;
  private String mDownloadUrl;
  private Button mHideBtn;
  private DisplayMetrics mMetrics;
  private TextView mPercentProgressTv;
  private ProgressBar mProgressBar;
  private TextView mTitleTv;
  
  public DownloadDialog(Context paramContext, String paramString)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mDownloadUrl = paramString;
    this.mDownloadManager = DownloadManager.getInstance(paramContext);
    paramContext = (WindowManager)getContext().getSystemService("window");
    this.mMetrics = new DisplayMetrics();
    paramContext.getDefaultDisplay().getMetrics(this.mMetrics);
    requestWindowFeature(1);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    paramContext = new LinearLayout(getContext());
    paramContext.setOrientation(1);
    paramContext.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mDownloadLayout = createDownloadView();
    paramContext.addView(this.mDownloadLayout);
    setContentView(paramContext, new ViewGroup.LayoutParams((int)(this.mMetrics.widthPixels * 0.9D), -2));
    setListener();
  }
  
  private View createDownloadView()
  {
    this.mContentLayout = new LinearLayout(getContext());
    this.mContentLayout.setOrientation(1);
    this.mContentLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mContentLayout.setBackgroundColor(-1);
    this.mBottomLayout = new LinearLayout(getContext());
    this.mBottomLayout.setOrientation(0);
    this.mBottomLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(getContext(), 50.0F)));
    this.mBottomLayout.setBackgroundColor(-1842205);
    this.mTitleTv = new TextView(getContext());
    this.mTitleTv.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(getContext(), 60.0F)));
    this.mTitleTv.setText("下载中...");
    this.mTitleTv.setTextSize(20.0F);
    this.mTitleTv.setTextColor(-13421773);
    this.mTitleTv.setGravity(16);
    this.mTitleTv.setPadding((int)ScreenUtil.dpToPx(getContext(), 20.0F), 0, 0, 0);
    this.mTitleTv.setBackgroundColor(-1842205);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout.setPadding(dpToPx(20), dpToPx(10), dpToPx(20), dpToPx(10));
    Object localObject = new ViewGroup.LayoutParams(-1, dpToPx(30));
    this.mDownLoadFileSizeTv = new TextView(getContext());
    this.mDownLoadFileSizeTv.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.mDownLoadFileSizeTv.setText("已完成：0M/0M");
    this.mDownLoadFileSizeTv.setTextSize(18.0F);
    this.mDownLoadFileSizeTv.setGravity(16);
    this.mDownLoadFileSizeTv.setTextColor(-16777216);
    this.mDownLoadFileSizeTv.setBackgroundColor(-1);
    this.mProgressBar = new ProgressBar(getContext(), null, 16842872);
    this.mProgressBar.setLayoutParams(new ViewGroup.LayoutParams(-1, dpToPx(25)));
    this.mProgressBar.setPadding(0, dpToPx(5), 0, dpToPx(5));
    this.mPercentProgressTv = new TextView(getContext());
    this.mPercentProgressTv.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.mPercentProgressTv.setText("0%");
    this.mPercentProgressTv.setTextSize(18.0F);
    this.mPercentProgressTv.setGravity(16);
    this.mPercentProgressTv.setTextColor(-16777216);
    this.mPercentProgressTv.setBackgroundColor(-1);
    localObject = new LinearLayout.LayoutParams(-2, -1);
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.mCancelBtn = new Button(this.mContext);
    this.mCancelBtn.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.mCancelBtn.setText("取消");
    this.mCancelBtn.setGravity(17);
    this.mCancelBtn.setTextSize(18.0F);
    this.mCancelBtn.setTextColor(-13421773);
    this.mCancelBtn.setBackgroundColor(-1842205);
    localObject = new View(getContext());
    ((View)localObject).setLayoutParams(new LinearLayout.LayoutParams((int)ScreenUtil.dpToPx(getContext(), 1.0F), -1));
    ((View)localObject).setBackgroundColor(-3355444);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.weight = 1.0F;
    this.mHideBtn = new Button(this.mContext);
    this.mHideBtn.setLayoutParams(localLayoutParams);
    this.mHideBtn.setText("隐藏对话框");
    this.mHideBtn.setGravity(17);
    this.mHideBtn.setTextSize(18.0F);
    this.mHideBtn.setTextColor(-13421773);
    this.mHideBtn.setBackgroundColor(-1842205);
    localLinearLayout.addView(this.mDownLoadFileSizeTv);
    localLinearLayout.addView(this.mProgressBar);
    localLinearLayout.addView(this.mPercentProgressTv);
    this.mContentLayout.addView(this.mTitleTv);
    this.mContentLayout.addView(localLinearLayout);
    this.mBottomLayout.addView(this.mCancelBtn);
    this.mBottomLayout.addView((View)localObject);
    this.mBottomLayout.addView(this.mHideBtn);
    this.mContentLayout.addView(this.mBottomLayout);
    return this.mContentLayout;
  }
  
  private int dpToPx(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(getContext(), paramInt);
  }
  
  private void setListener()
  {
    this.mCancelBtn.setOnClickListener(new DownloadDialog.1(this));
    this.mHideBtn.setOnClickListener(new DownloadDialog.2(this));
  }
  
  public void hideBottomLayout()
  {
    this.mBottomLayout.setVisibility(8);
  }
  
  public void setDownLoadFinishedSize(String paramString)
  {
    this.mDownLoadFileSizeTv.setText(paramString);
  }
  
  public void setDownloadPercent(String paramString)
  {
    this.mPercentProgressTv.setText(paramString);
  }
  
  public void setProgressBarMax(int paramInt)
  {
    this.mProgressBar.setMax(paramInt);
  }
  
  public void setProgressBarVaule(int paramInt)
  {
    this.mProgressBar.setProgress(paramInt);
  }
  
  public void setRightButtonContent(String paramString)
  {
    this.mHideBtn.setText(paramString);
  }
  
  public void setTitleContent(String paramString)
  {
    this.mTitleTv.setText(paramString);
  }
  
  public void showBottomLayout()
  {
    this.mBottomLayout.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */