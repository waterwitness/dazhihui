package com.android.thinkive.framework.notice;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
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
import com.android.thinkive.framework.storage.DatabaseStorage;
import com.android.thinkive.framework.util.ScreenUtil;

public class NoticeDialog
  extends Dialog
{
  Handler handler = new NoticeDialog.1(this);
  private LinearLayout mBottomLv;
  private ScrollView mContentSv;
  private TextView mContentTv;
  private Context mContext;
  private View mDivideLine;
  private Button mFinishBtn;
  private DisplayMetrics mMetrics;
  private Button mNoTipBtn;
  private NoticeInfoBean.NoticeBean mNoticeBean;
  private LinearLayout mRootView;
  private DatabaseStorage mStorage;
  private TextView mTitleTv;
  
  public NoticeDialog(Context paramContext, NoticeInfoBean.NoticeBean paramNoticeBean)
  {
    super(paramContext);
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    this.mMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(this.mMetrics);
    requestWindowFeature(1);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    this.mContext = paramContext;
    this.mNoticeBean = paramNoticeBean;
    this.mStorage = new DatabaseStorage(this.mContext);
    initView();
    setContentView(this.mRootView, new ViewGroup.LayoutParams((int)(this.mMetrics.widthPixels * 0.9D), -2));
    setListener();
  }
  
  private int dpToPx(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(this.mContext, paramInt);
  }
  
  private void initView()
  {
    this.mRootView = new LinearLayout(this.mContext);
    this.mRootView.setOrientation(1);
    this.mRootView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.mRootView.setBackgroundColor(-1);
    this.mTitleTv = new TextView(this.mContext);
    this.mTitleTv.setLayoutParams(new LinearLayout.LayoutParams(-1, dpToPx(48)));
    this.mTitleTv.setBackgroundColor(Color.parseColor("#009be7"));
    this.mTitleTv.setTextSize(22.0F);
    this.mTitleTv.setGravity(17);
    this.mTitleTv.setTextColor(Color.parseColor("#FFFFFF"));
    this.mTitleTv.setText("系统公告");
    this.mContentTv = new TextView(this.mContext);
    this.mContentTv.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mContentTv.setTextColor(Color.parseColor("#797979"));
    this.mContentTv.setTextSize(18.0F);
    this.mContentTv.setMinHeight(dpToPx(100));
    this.mContentTv.setPadding(dpToPx(12), dpToPx(10), dpToPx(12), dpToPx(10));
    this.mContentSv = new ScrollView(this.mContext);
    this.mContentSv.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
    this.mContentSv.addView(this.mContentTv);
    this.mDivideLine = new View(this.mContext);
    this.mDivideLine.setLayoutParams(new LinearLayout.LayoutParams(-1, dpToPx(1)));
    this.mDivideLine.setBackgroundColor(Color.parseColor("#dbdbdb"));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    this.mFinishBtn = new Button(this.mContext);
    this.mFinishBtn.setLayoutParams(localLayoutParams);
    this.mFinishBtn.setBackgroundColor(Color.parseColor("#009be7"));
    this.mFinishBtn.setTextSize(20.0F);
    this.mFinishBtn.setText("我知道了");
    this.mFinishBtn.setTextColor(Color.parseColor("#FFFFFF"));
    View localView = new View(this.mContext);
    if (this.mNoticeBean.getShowType().equals("2"))
    {
      localView.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(1), -1));
      localView.setBackgroundColor(Color.parseColor("#dbdbdb"));
      this.mNoTipBtn = new Button(this.mContext);
      this.mNoTipBtn.setLayoutParams(localLayoutParams);
      this.mNoTipBtn.setBackgroundColor(Color.parseColor("#009be7"));
      this.mNoTipBtn.setTextSize(20.0F);
      this.mNoTipBtn.setText("不再提示");
      this.mNoTipBtn.setTextColor(Color.parseColor("#FFFFFF"));
    }
    this.mBottomLv = new LinearLayout(this.mContext);
    this.mBottomLv.setLayoutParams(new LinearLayout.LayoutParams(-1, dpToPx(50)));
    this.mBottomLv.setGravity(17);
    if (this.mNoticeBean.getShowType().equals("2"))
    {
      this.mBottomLv.addView(this.mNoTipBtn);
      this.mBottomLv.addView(localView);
    }
    this.mBottomLv.addView(this.mFinishBtn);
    this.mRootView.addView(this.mTitleTv);
    this.mRootView.addView(this.mContentSv);
    this.mRootView.addView(this.mDivideLine);
    this.mRootView.addView(this.mBottomLv);
  }
  
  private void sendBroadcast()
  {
    Intent localIntent = new Intent("com.thinkive.notice.dismiss.action");
    this.mContext.sendBroadcast(localIntent);
  }
  
  private void setListener()
  {
    this.mFinishBtn.setOnClickListener(new NoticeDialog.2(this));
    if (this.mNoTipBtn != null) {
      this.mNoTipBtn.setOnClickListener(new NoticeDialog.3(this));
    }
  }
  
  public void setBackgroundColor(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mTitleTv.setBackgroundColor(paramInt1);
    this.mContentTv.setBackgroundColor(paramInt2);
    this.mFinishBtn.setBackgroundColor(paramInt3);
    if (this.mNoTipBtn != null) {
      this.mNoTipBtn.setBackgroundColor(paramInt3);
    }
  }
  
  public void setContent(String paramString)
  {
    new Thread(new NoticeDialog.4(this, paramString)).start();
    this.mContentTv.setMovementMethod(LinkMovementMethod.getInstance());
    this.mContentTv.setText(Html.fromHtml(paramString));
  }
  
  public void setTitle(String paramString)
  {
    this.mTitleTv.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */