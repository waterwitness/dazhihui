package com.android.thinkive.framework.keyboard;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;
import com.android.thinkive.framework.view.RoundedCornerTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonKeyboard
  extends BaseKeyboard
  implements View.OnClickListener
{
  private RoundedCornerTextView m0;
  private RoundedCornerTextView m1;
  private RoundedCornerTextView m2;
  private RoundedCornerTextView m3;
  private RoundedCornerTextView m4;
  private RoundedCornerTextView m5;
  private RoundedCornerTextView m6;
  private RoundedCornerTextView m7;
  private RoundedCornerTextView m8;
  private RoundedCornerTextView m9;
  private RoundedCornerTextView mABC;
  private int[] mASCIITagValue = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
  private List<Integer> mASCIITagValueList = new ArrayList();
  private KeyboardEventListener mActionListener;
  private RoundedCornerTextView mClear;
  private RoundedCornerTextView mConfirm;
  private Context mContext;
  private RoundedCornerTextView mDelete;
  private RoundedCornerTextView mHide;
  private boolean mIsRandom = false;
  private LinearLayout mNumLine1Layout;
  private LinearLayout mNumLine2Layout;
  private LinearLayout mNumLine3Layout;
  private LinearLayout mNumLine4Layout;
  private LinearLayout mNumberLayout;
  private RoundedCornerTextView mPoint;
  private LinearLayout mRootLayout;
  
  public CommonKeyboard(Context paramContext)
  {
    this.mContext = paramContext;
    init();
  }
  
  public CommonKeyboard(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mIsRandom = paramBoolean;
    init();
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
    this.mPoint = new RoundedCornerTextView(this.mContext);
    this.mPoint.setLayoutParams(localLayoutParams);
    this.mConfirm.setLayoutParams(localLayoutParams);
    this.mConfirm.getPaint().setFakeBoldText(true);
    this.mNumLine4Layout.addView(this.mABC);
    this.mNumLine4Layout.addView(this.m0);
    this.mNumLine4Layout.addView(this.mPoint);
    this.mNumLine4Layout.addView(this.mConfirm);
  }
  
  private int dp2Px(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(this.mContext, paramInt);
  }
  
  private void init()
  {
    createLine1Layout();
    createLine2Layout();
    createLine3Layout();
    createLine4Layout();
    layout();
    int i = 0;
    for (;;)
    {
      if (i >= this.mASCIITagValue.length)
      {
        if (this.mIsRandom) {
          Collections.shuffle(this.mASCIITagValueList);
        }
        initDefaultTagValue();
        initDefaultText();
        setListenersAndStyles(this.mRootLayout);
        return;
      }
      this.mASCIITagValueList.add(Integer.valueOf(this.mASCIITagValue[i]));
      i += 1;
    }
  }
  
  private void initDefaultTagValue()
  {
    this.m0.setTag(this.mASCIITagValueList.get(0));
    this.m1.setTag(this.mASCIITagValueList.get(1));
    this.m2.setTag(this.mASCIITagValueList.get(2));
    this.m3.setTag(this.mASCIITagValueList.get(3));
    this.m4.setTag(this.mASCIITagValueList.get(4));
    this.m5.setTag(this.mASCIITagValueList.get(5));
    this.m6.setTag(this.mASCIITagValueList.get(6));
    this.m7.setTag(this.mASCIITagValueList.get(7));
    this.m8.setTag(this.mASCIITagValueList.get(8));
    this.m9.setTag(this.mASCIITagValueList.get(9));
    this.mPoint.setTag(Integer.valueOf(-26));
    this.mABC.setTag(Integer.valueOf(-7));
    this.mClear.setTag(Integer.valueOf(-2));
    this.mConfirm.setTag(Integer.valueOf(-3));
    this.mHide.setTag(Integer.valueOf(-4));
    this.mDelete.setTag(Integer.valueOf(-5));
  }
  
  private void initDefaultText()
  {
    String str1 = (char)((Integer)this.mASCIITagValueList.get(0)).intValue();
    String str2 = (char)((Integer)this.mASCIITagValueList.get(1)).intValue();
    String str3 = (char)((Integer)this.mASCIITagValueList.get(2)).intValue();
    String str4 = (char)((Integer)this.mASCIITagValueList.get(3)).intValue();
    String str5 = (char)((Integer)this.mASCIITagValueList.get(4)).intValue();
    String str6 = (char)((Integer)this.mASCIITagValueList.get(5)).intValue();
    String str7 = (char)((Integer)this.mASCIITagValueList.get(6)).intValue();
    String str8 = (char)((Integer)this.mASCIITagValueList.get(7)).intValue();
    String str9 = (char)((Integer)this.mASCIITagValueList.get(8)).intValue();
    String str10 = (char)((Integer)this.mASCIITagValueList.get(9)).intValue();
    this.m0.setText(str1);
    this.m1.setText(str2);
    this.m2.setText(str3);
    this.m3.setText(str4);
    this.m4.setText(str5);
    this.m5.setText(str6);
    this.m6.setText(str7);
    this.m7.setText(str8);
    this.m8.setText(str9);
    this.m9.setText(str10);
    this.mPoint.setText(".");
    this.mABC.setText("ABC");
    this.mConfirm.setText("确 定");
    this.mClear.setText("清空");
    this.mHide.setText("隐藏");
    this.mDelete.setText("删除");
  }
  
  private void initImageKey(RoundedCornerImageView paramRoundedCornerImageView)
  {
    paramRoundedCornerImageView.setImageResource(ResourceUtil.getResourceID(this.mContext, "drawable", sResNameDeleteSmall));
    paramRoundedCornerImageView.setOnClickListener(new CommonKeyboard.1(this));
    paramRoundedCornerImageView.setCornerRadius(dp2Px(1));
    paramRoundedCornerImageView.setRoundedCornerBgColor(sColorDefaultFuncKeyBg);
    paramRoundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    paramRoundedCornerImageView.setLongClickable(true);
    paramRoundedCornerImageView.setOnTouchListener(new CommonKeyboard.2(this, paramRoundedCornerImageView));
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
    paramView.setOnTouchListener(new CommonKeyboard.3(this));
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\CommonKeyboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */