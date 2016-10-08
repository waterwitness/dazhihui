package com.android.thinkive.framework.keyboard;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;
import com.android.thinkive.framework.view.RoundedCornerTextView;

public class StockKeyboard
  extends BaseKeyboard
  implements View.OnClickListener
{
  private RoundedCornerTextView m0;
  private RoundedCornerTextView m000;
  private RoundedCornerTextView m002;
  private RoundedCornerTextView m1;
  private RoundedCornerTextView m2;
  private RoundedCornerTextView m3;
  private RoundedCornerTextView m300;
  private RoundedCornerTextView m4;
  private RoundedCornerTextView m5;
  private RoundedCornerTextView m6;
  private RoundedCornerTextView m600;
  private RoundedCornerTextView m601;
  private RoundedCornerTextView m7;
  private RoundedCornerTextView m8;
  private RoundedCornerTextView m9;
  private RoundedCornerTextView mABC;
  private KeyboardEventListener mActionListener;
  private RoundedCornerTextView mClear;
  private RoundedCornerTextView mConfirm;
  private Context mContext;
  private RoundedCornerTextView mDelete;
  private RoundedCornerTextView mHide;
  private LinearLayout mNumLine1Layout;
  private LinearLayout mNumLine2Layout;
  private LinearLayout mNumLine3Layout;
  private LinearLayout mNumLine4Layout;
  private LinearLayout mNumberLayout;
  private LinearLayout mRootLayout;
  private LinearLayout mStockPrefixLayout;
  
  public StockKeyboard(Context paramContext)
  {
    this.mContext = paramContext;
    createLine1Layout();
    createLine2Layout();
    createLine3Layout();
    createLine4Layout();
    createStockPrefixLayout();
    layout();
    initDefaultTagValue();
    initDefaultText();
    setListenersAndStyles(this.mRootLayout);
  }
  
  private void createLine1Layout()
  {
    this.mNumLine1Layout = new LinearLayout(this.mContext);
    this.mNumLine1Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mNumLine1Layout.setOrientation(0);
    this.mNumLine1Layout.setPadding(0, 0, 0, dp2Px(2));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.leftMargin = dp2Px(2);
    this.m1 = new RoundedCornerTextView(this.mContext);
    this.m2 = new RoundedCornerTextView(this.mContext);
    this.m3 = new RoundedCornerTextView(this.mContext);
    this.mDelete = new RoundedCornerTextView(this.mContext);
    this.m1.setLayoutParams(localLayoutParams);
    this.m2.setLayoutParams(localLayoutParams);
    this.m3.setLayoutParams(localLayoutParams);
    this.mDelete.setLayoutParams(localLayoutParams);
    this.mNumLine1Layout.addView(this.m1);
    this.mNumLine1Layout.addView(this.m2);
    this.mNumLine1Layout.addView(this.m3);
    this.mNumLine1Layout.addView(this.mDelete);
  }
  
  private void createLine2Layout()
  {
    this.mNumLine2Layout = new LinearLayout(this.mContext);
    this.mNumLine2Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mNumLine2Layout.setOrientation(0);
    this.mNumLine2Layout.setPadding(0, 0, 0, dp2Px(2));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.leftMargin = dp2Px(2);
    this.m4 = new RoundedCornerTextView(this.mContext);
    this.m5 = new RoundedCornerTextView(this.mContext);
    this.m6 = new RoundedCornerTextView(this.mContext);
    this.mClear = new RoundedCornerTextView(this.mContext);
    this.m4.setLayoutParams(localLayoutParams);
    this.m5.setLayoutParams(localLayoutParams);
    this.m6.setLayoutParams(localLayoutParams);
    this.mClear.setLayoutParams(localLayoutParams);
    this.mNumLine2Layout.addView(this.m4);
    this.mNumLine2Layout.addView(this.m5);
    this.mNumLine2Layout.addView(this.m6);
    this.mNumLine2Layout.addView(this.mClear);
  }
  
  private void createLine3Layout()
  {
    this.mNumLine3Layout = new LinearLayout(this.mContext);
    this.mNumLine3Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mNumLine3Layout.setOrientation(0);
    this.mNumLine3Layout.setPadding(0, 0, 0, dp2Px(2));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.leftMargin = dp2Px(2);
    this.m7 = new RoundedCornerTextView(this.mContext);
    this.m8 = new RoundedCornerTextView(this.mContext);
    this.m9 = new RoundedCornerTextView(this.mContext);
    this.mHide = new RoundedCornerTextView(this.mContext);
    this.m7.setLayoutParams(localLayoutParams);
    this.m8.setLayoutParams(localLayoutParams);
    this.m9.setLayoutParams(localLayoutParams);
    this.mHide.setLayoutParams(localLayoutParams);
    this.mNumLine3Layout.addView(this.m7);
    this.mNumLine3Layout.addView(this.m8);
    this.mNumLine3Layout.addView(this.m9);
    this.mNumLine3Layout.addView(this.mHide);
  }
  
  private void createLine4Layout()
  {
    this.mNumLine4Layout = new LinearLayout(this.mContext);
    this.mNumLine4Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mNumLine4Layout.setOrientation(0);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.leftMargin = dp2Px(2);
    this.mABC = new RoundedCornerTextView(this.mContext);
    this.m0 = new RoundedCornerTextView(this.mContext);
    this.mConfirm = new RoundedCornerTextView(this.mContext);
    this.mABC.setLayoutParams(localLayoutParams);
    this.m0.setLayoutParams(localLayoutParams);
    localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 2.0F;
    localLayoutParams.leftMargin = dp2Px(2);
    this.mConfirm.setLayoutParams(localLayoutParams);
    this.mConfirm.getPaint().setFakeBoldText(true);
    this.mNumLine4Layout.addView(this.mABC);
    this.mNumLine4Layout.addView(this.m0);
    this.mNumLine4Layout.addView(this.mConfirm);
  }
  
  private void createStockPrefixLayout()
  {
    this.mStockPrefixLayout = new LinearLayout(this.mContext);
    this.mStockPrefixLayout.setLayoutParams(new ViewGroup.LayoutParams(dp2Px(70), -1));
    this.mStockPrefixLayout.setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams1.weight = 1.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.bottomMargin = dp2Px(2);
    this.m600 = new RoundedCornerTextView(this.mContext);
    this.m601 = new RoundedCornerTextView(this.mContext);
    this.m000 = new RoundedCornerTextView(this.mContext);
    this.m002 = new RoundedCornerTextView(this.mContext);
    this.m300 = new RoundedCornerTextView(this.mContext);
    this.m300.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
    this.m601.setLayoutParams(localLayoutParams2);
    this.m000.setLayoutParams(localLayoutParams2);
    this.m002.setLayoutParams(localLayoutParams2);
    this.m600.setLayoutParams(localLayoutParams2);
    this.m300.setLayoutParams(localLayoutParams1);
    this.mStockPrefixLayout.addView(this.m600);
    this.mStockPrefixLayout.addView(this.m601);
    this.mStockPrefixLayout.addView(this.m000);
    this.mStockPrefixLayout.addView(this.m002);
    this.mStockPrefixLayout.addView(this.m300);
  }
  
  private int dp2Px(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(this.mContext, paramInt);
  }
  
  private void initDefaultTagValue()
  {
    this.m0.setTag(Integer.valueOf(48));
    this.m1.setTag(Integer.valueOf(49));
    this.m2.setTag(Integer.valueOf(50));
    this.m3.setTag(Integer.valueOf(51));
    this.m4.setTag(Integer.valueOf(52));
    this.m5.setTag(Integer.valueOf(53));
    this.m6.setTag(Integer.valueOf(54));
    this.m7.setTag(Integer.valueOf(55));
    this.m8.setTag(Integer.valueOf(56));
    this.m9.setTag(Integer.valueOf(57));
    this.m600.setTag(Integer.valueOf(-21));
    this.m601.setTag(Integer.valueOf(-22));
    this.m000.setTag(Integer.valueOf(-23));
    this.m002.setTag(Integer.valueOf(-24));
    this.m300.setTag(Integer.valueOf(-25));
    this.mABC.setTag(Integer.valueOf(-7));
    this.mClear.setTag(Integer.valueOf(-2));
    this.mConfirm.setTag(Integer.valueOf(-3));
    this.mHide.setTag(Integer.valueOf(-4));
    this.mDelete.setTag(Integer.valueOf(-5));
  }
  
  private void initDefaultText()
  {
    this.m0.setText("0");
    this.m1.setText("1");
    this.m2.setText("2");
    this.m3.setText("3");
    this.m4.setText("4");
    this.m5.setText("5");
    this.m6.setText("6");
    this.m7.setText("7");
    this.m8.setText("8");
    this.m9.setText("9");
    this.m600.setText("600");
    this.m601.setText("601");
    this.m000.setText("000");
    this.m002.setText("002");
    this.m300.setText("300");
    this.mABC.setText("ABC");
    this.mConfirm.setText("确 定");
    this.mClear.setText("清空");
    this.mHide.setText("隐藏");
    this.mDelete.setText("删除");
  }
  
  private void initImageKey(RoundedCornerImageView paramRoundedCornerImageView)
  {
    paramRoundedCornerImageView.setImageResource(ResourceUtil.getResourceID(this.mContext, "drawable", sResNameDeleteSmall));
    paramRoundedCornerImageView.setOnClickListener(new StockKeyboard.1(this));
    paramRoundedCornerImageView.setCornerRadius(dp2Px(1));
    paramRoundedCornerImageView.setRoundedCornerBgColor(sColorDefaultFuncKeyBg);
    paramRoundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    paramRoundedCornerImageView.setLongClickable(true);
    paramRoundedCornerImageView.setOnTouchListener(new StockKeyboard.2(this, paramRoundedCornerImageView));
  }
  
  private void layout()
  {
    this.mRootLayout = new LinearLayout(this.mContext);
    this.mRootLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, dp2Px(250)));
    this.mRootLayout.setOrientation(0);
    this.mRootLayout.setBackgroundColor(sColorKeyboardBg);
    this.mRootLayout.setPadding(2, 2, 2, 2);
    this.mNumberLayout = new LinearLayout(this.mContext);
    this.mNumberLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mNumberLayout.setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.weight = 1.0F;
    this.mNumberLayout.addView(this.mNumLine1Layout, localLayoutParams);
    this.mNumberLayout.addView(this.mNumLine2Layout, localLayoutParams);
    this.mNumberLayout.addView(this.mNumLine3Layout, localLayoutParams);
    localLayoutParams.bottomMargin = 0;
    this.mNumberLayout.addView(this.mNumLine4Layout, localLayoutParams);
    localLayoutParams = new LinearLayout.LayoutParams(dp2Px(70), dp2Px(250));
    this.mRootLayout.addView(this.mStockPrefixLayout, localLayoutParams);
    this.mRootLayout.addView(this.mNumberLayout, new LinearLayout.LayoutParams(-1, dp2Px(250)));
  }
  
  private void setKeyBackgroundAndFontColor(RoundedCornerTextView paramRoundedCornerTextView, boolean paramBoolean)
  {
    int i = ((Integer)paramRoundedCornerTextView.getTag()).intValue();
    if (paramBoolean)
    {
      paramRoundedCornerTextView.setRoundedCornerBgColor(sColorSelectedKeyBg);
      paramRoundedCornerTextView.setTextColor(sColorSelectedFont);
      return;
    }
    if (i < 0) {
      paramRoundedCornerTextView.setRoundedCornerBgColor(sColorDefaultFuncKeyBg);
    }
    for (;;)
    {
      paramRoundedCornerTextView.setTextColor(sColorDefaultFont);
      return;
      paramRoundedCornerTextView.setRoundedCornerBgColor(sColorDefaultKeyBg);
    }
  }
  
  private void setListenersAndStyles(ViewGroup paramViewGroup)
  {
    int i = 0;
    if (i >= paramViewGroup.getChildCount()) {
      return;
    }
    View localView = paramViewGroup.getChildAt(i);
    if ((localView instanceof ViewGroup)) {
      setListenersAndStyles((ViewGroup)localView);
    }
    for (;;)
    {
      i += 1;
      break;
      if ((localView instanceof RoundedCornerTextView)) {
        setRCTV(localView);
      }
    }
  }
  
  private void setRCTV(View paramView)
  {
    paramView = (RoundedCornerTextView)paramView;
    paramView.setGravity(17);
    paramView.setTextSize(20.0F);
    paramView.setTextColor(sColorDefaultFont);
    paramView.setCornerRadius(dp2Px(1));
    setKeyBackgroundAndFontColor(paramView, false);
    paramView.setLongClickable(true);
    paramView.setOnTouchListener(new StockKeyboard.3(this));
  }
  
  protected LinearLayout getView()
  {
    return this.mRootLayout;
  }
  
  protected void hide()
  {
    this.mRootLayout.setVisibility(8);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getTag() == null) {}
    while (this.mActionListener == null) {
      return;
    }
    this.mActionListener.onKeyEvent(((Integer)paramView.getTag()).intValue());
  }
  
  public void setOnKeyboardActionListener(KeyboardEventListener paramKeyboardEventListener)
  {
    this.mActionListener = paramKeyboardEventListener;
  }
  
  public void setTheme(short paramShort)
  {
    super.setTheme(paramShort);
    setListenersAndStyles(this.mRootLayout);
  }
  
  protected void show()
  {
    this.mRootLayout.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\StockKeyboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */