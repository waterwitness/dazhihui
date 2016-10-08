package com.android.thinkive.framework.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
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
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.ScreenUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class InfoDialog
  extends Dialog
{
  private LinearLayout mBottomLv;
  private Button mCancelBtn;
  private ScrollView mContentSv;
  private TextView mContentTv;
  private Context mContext;
  private View mDivLine;
  private View mDivideLine;
  private String mFlag;
  private DisplayMetrics mMetrics;
  private Button mOkBtn;
  private LinearLayout mRootView;
  private String mSourceModule;
  private TextView mTitleTv;
  
  public InfoDialog(Context paramContext)
  {
    super(paramContext);
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    this.mMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(this.mMetrics);
    requestWindowFeature(1);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    this.mContext = paramContext;
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
    this.mTitleTv.setText("系统提示");
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
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.weight = 1.0F;
    this.mCancelBtn = new Button(this.mContext);
    this.mCancelBtn.setLayoutParams(localLayoutParams);
    this.mCancelBtn.setText("取消");
    this.mCancelBtn.setGravity(17);
    this.mCancelBtn.setTextSize(18.0F);
    this.mCancelBtn.setTextColor(Color.parseColor("#FFFFFF"));
    this.mCancelBtn.setBackgroundColor(Color.parseColor("#009be7"));
    this.mDivLine = new View(getContext());
    this.mDivLine.setLayoutParams(new LinearLayout.LayoutParams((int)ScreenUtil.dpToPx(getContext(), 1.0F), -1));
    this.mDivLine.setBackgroundColor(-3355444);
    this.mOkBtn = new Button(this.mContext);
    this.mOkBtn.setLayoutParams(localLayoutParams);
    this.mOkBtn.setBackgroundColor(Color.parseColor("#009be7"));
    this.mOkBtn.setTextSize(18.0F);
    this.mOkBtn.setText("确认");
    this.mOkBtn.setTextColor(Color.parseColor("#FFFFFF"));
    this.mBottomLv = new LinearLayout(this.mContext);
    this.mBottomLv.setLayoutParams(new LinearLayout.LayoutParams(-1, dpToPx(56)));
    this.mBottomLv.setOrientation(0);
    this.mBottomLv.setGravity(17);
    this.mBottomLv.addView(this.mCancelBtn);
    this.mBottomLv.addView(this.mDivLine);
    this.mBottomLv.addView(this.mOkBtn);
    this.mRootView.addView(this.mTitleTv);
    this.mRootView.addView(this.mContentSv);
    this.mRootView.addView(this.mDivideLine);
    this.mRootView.addView(this.mBottomLv);
  }
  
  private void sendResponseToH5()
  {
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("flag", this.mFlag);
      localObject = new AppMessage(50111, (JSONObject)localObject);
      ((AppMessage)localObject).setSourceModule(this.mSourceModule);
      MessageManager.getInstance(this.mContext).sendMessage((AppMessage)localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  private void setListener()
  {
    this.mOkBtn.setOnClickListener(new InfoDialog.1(this));
    this.mCancelBtn.setOnClickListener(new InfoDialog.2(this));
  }
  
  public void setCancelBtnVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.mCancelBtn.setVisibility(0);
      this.mDivLine.setVisibility(0);
      return;
    }
    this.mCancelBtn.setVisibility(8);
    this.mDivLine.setVisibility(8);
  }
  
  public void setContent(String paramString)
  {
    this.mContentTv.setText(Html.fromHtml(paramString));
  }
  
  public void setFlag(String paramString)
  {
    this.mFlag = paramString;
  }
  
  public void setSourceModule(String paramString)
  {
    this.mSourceModule = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.mTitleTv.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\view\InfoDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */