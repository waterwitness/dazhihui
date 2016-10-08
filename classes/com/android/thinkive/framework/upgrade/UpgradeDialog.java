package com.android.thinkive.framework.upgrade;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.thinkive.framework.util.ScreenUtil;

public class UpgradeDialog
  extends Dialog
{
  private static final int BACKGROUND = -1842205;
  private static final int TEXT_COLOR = -13421773;
  private LinearLayout mBottomLayout;
  private Button mCancelBtn;
  private ScrollView mContentSv;
  private TextView mContentTv;
  private Context mContext;
  private String mDescription;
  private View mDivLine;
  private boolean mIsForce;
  private DisplayMetrics mMetrics;
  private Button mOkBtn;
  private TextView mTitleTv;
  private UpgradeManager mUpgradeManager;
  private View mVersionHintLayout;
  
  public UpgradeDialog(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    paramContext = (WindowManager)getContext().getSystemService("window");
    this.mMetrics = new DisplayMetrics();
    paramContext.getDefaultDisplay().getMetrics(this.mMetrics);
    requestWindowFeature(1);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    paramContext = new LinearLayout(getContext());
    paramContext.setOrientation(1);
    paramContext.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mVersionHintLayout = createView();
    paramContext.addView(this.mVersionHintLayout);
    setContentView(paramContext, new ViewGroup.LayoutParams((int)(this.mMetrics.widthPixels * 0.9D), -2));
    setListener();
  }
  
  private View createView()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mBottomLayout = new LinearLayout(getContext());
    this.mBottomLayout.setOrientation(0);
    this.mBottomLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 50.0F)));
    this.mTitleTv = new TextView(getContext());
    this.mTitleTv.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 60.0F)));
    this.mTitleTv.setText("版本更新提示");
    this.mTitleTv.setTextSize(20.0F);
    this.mTitleTv.setTextColor(-13421773);
    this.mTitleTv.setGravity(16);
    this.mTitleTv.setPadding((int)ScreenUtil.dpToPx(this.mContext, 20.0F), 0, 0, 0);
    this.mTitleTv.setBackgroundColor(-1842205);
    int i = (int)ScreenUtil.dpToPx(this.mContext, 5.0F);
    this.mContentTv = new TextView(getContext());
    this.mContentTv.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mContentTv.setTextSize(16.0F);
    this.mContentTv.setTextColor(-16777216);
    this.mContentTv.setPadding(i, i, i, i);
    this.mContentTv.setMinHeight((int)ScreenUtil.dpToPx(this.mContext, 100.0F));
    this.mContentTv.setMaxHeight((int)(this.mMetrics.heightPixels * 0.6D));
    this.mContentTv.setBackgroundColor(-1);
    this.mContentSv = new ScrollView(this.mContext);
    this.mContentSv.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
    this.mContentSv.addView(this.mContentTv);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.weight = 1.0F;
    this.mCancelBtn = new Button(this.mContext);
    this.mCancelBtn.setLayoutParams(localLayoutParams);
    this.mCancelBtn.setText("以后再说");
    this.mCancelBtn.setGravity(17);
    this.mCancelBtn.setTextSize(18.0F);
    this.mCancelBtn.setTextColor(-13421773);
    this.mCancelBtn.setBackgroundColor(-1842205);
    this.mDivLine = new View(getContext());
    this.mDivLine.setLayoutParams(new LinearLayout.LayoutParams((int)ScreenUtil.spToPx(getContext(), 1.0F), -1));
    this.mDivLine.setBackgroundColor(-3355444);
    this.mOkBtn = new Button(this.mContext);
    this.mOkBtn.setLayoutParams(localLayoutParams);
    this.mOkBtn.setText("立即下载");
    this.mOkBtn.setGravity(17);
    this.mOkBtn.setTextSize(18.0F);
    this.mOkBtn.setTextColor(-13421773);
    this.mOkBtn.setBackgroundColor(-1842205);
    localLinearLayout.addView(this.mTitleTv);
    localLinearLayout.addView(this.mContentSv);
    localLinearLayout.addView(this.mBottomLayout);
    return localLinearLayout;
  }
  
  public void setDescription(String paramString)
  {
    this.mDescription = paramString;
    this.mContentTv.setText(Html.fromHtml(this.mDescription));
  }
  
  public void setIsForce(boolean paramBoolean)
  {
    this.mIsForce = paramBoolean;
    this.mBottomLayout.removeAllViews();
    if (!this.mIsForce)
    {
      this.mBottomLayout.addView(this.mCancelBtn);
      this.mBottomLayout.addView(this.mDivLine);
    }
    this.mBottomLayout.addView(this.mOkBtn);
  }
  
  public void setListener()
  {
    this.mCancelBtn.setOnClickListener(new UpgradeDialog.1(this));
    this.mOkBtn.setOnClickListener(new UpgradeDialog.2(this));
  }
  
  public void setUpgradeManager(UpgradeManager paramUpgradeManager)
  {
    this.mUpgradeManager = paramUpgradeManager;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */