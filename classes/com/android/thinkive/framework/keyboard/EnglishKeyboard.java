package com.android.thinkive.framework.keyboard;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;
import com.android.thinkive.framework.view.RoundedCornerTextView;

public class EnglishKeyboard
  extends BaseKeyboard
  implements View.OnClickListener
{
  private RoundedCornerTextView m123;
  private RoundedCornerTextView mA;
  private KeyboardEventListener mActionListener;
  private RoundedCornerTextView mB;
  private RoundedCornerTextView mC;
  private RoundedCornerTextView mConfirm;
  private Context mContext;
  private RoundedCornerTextView mD;
  private RoundedCornerTextView mDelete;
  private RoundedCornerTextView mE;
  private RoundedCornerTextView mF;
  private RoundedCornerTextView mG;
  private RoundedCornerTextView mH;
  private RoundedCornerTextView mHide;
  private RoundedCornerTextView mI;
  private boolean mIsKeyPreviewAddedToWindow;
  private boolean mIsLowerCase = true;
  private RoundedCornerTextView mJ;
  private RoundedCornerTextView mK;
  private int mKeyWidth;
  private RoundedCornerTextView mL;
  private LinearLayout mLine1Layout;
  private LinearLayout mLine2Layout;
  private LinearLayout mLine3Layout;
  private LinearLayout mLine4Layout;
  private RoundedCornerTextView mM;
  private RoundedCornerTextView mN;
  private RoundedCornerTextView mO;
  private RoundedCornerTextView mP;
  private int mPadding;
  private KeyInputPreviewView mPreviewView;
  private RoundedCornerTextView mQ;
  private RoundedCornerTextView mR;
  private LinearLayout mRootLayout;
  private RoundedCornerTextView mS;
  private RoundedCornerTextView mShift;
  private RoundedCornerTextView mSpace;
  private RoundedCornerTextView mT;
  private RoundedCornerTextView mU;
  private RoundedCornerTextView mV;
  private RoundedCornerTextView mW;
  private WindowManager mWindowManager;
  private RoundedCornerTextView mX;
  private RoundedCornerTextView mY;
  private RoundedCornerTextView mZ;
  
  public EnglishKeyboard(Context paramContext)
  {
    this.mContext = paramContext;
    this.mPadding = dp2Px(2);
    this.mKeyWidth = ((int)((ScreenUtil.getScreenWidth(paramContext) - ScreenUtil.dpToPx(this.mContext, 2.0F) * 9.0F) / 10.0F));
    if ((this.mContext instanceof Activity)) {}
    for (this.mWindowManager = ((WindowManager)((Activity)this.mContext).getSystemService("window"));; this.mWindowManager = ((WindowManager)this.mContext.getSystemService("window")))
    {
      createLine1Layout();
      createLine2Layout();
      createLine3Layout();
      createLine4Layout();
      layout();
      initTagValue();
      setListenersAndOthers(this.mRootLayout);
      this.mPreviewView = new KeyInputPreviewView(this.mContext);
      this.mPreviewView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.mPreviewView.setBackgroundResource(ResourceUtil.getResourceID(this.mContext, "drawable", getResKeyPreviewBg()));
      return;
    }
  }
  
  private void createLine1Layout()
  {
    this.mLine1Layout = new LinearLayout(this.mContext);
    this.mLine1Layout.setOrientation(0);
    this.mLine1Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
    this.mLine1Layout.setPadding(0, 0, 0, this.mPadding);
    this.mQ = new RoundedCornerTextView(this.mContext);
    this.mW = new RoundedCornerTextView(this.mContext);
    this.mE = new RoundedCornerTextView(this.mContext);
    this.mR = new RoundedCornerTextView(this.mContext);
    this.mT = new RoundedCornerTextView(this.mContext);
    this.mY = new RoundedCornerTextView(this.mContext);
    this.mU = new RoundedCornerTextView(this.mContext);
    this.mI = new RoundedCornerTextView(this.mContext);
    this.mO = new RoundedCornerTextView(this.mContext);
    this.mP = new RoundedCornerTextView(this.mContext);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    localLayoutParams1.leftMargin = this.mPadding;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    this.mLine1Layout.addView(this.mQ, localLayoutParams2);
    this.mLine1Layout.addView(this.mW, localLayoutParams1);
    this.mLine1Layout.addView(this.mE, localLayoutParams1);
    this.mLine1Layout.addView(this.mR, localLayoutParams1);
    this.mLine1Layout.addView(this.mT, localLayoutParams1);
    this.mLine1Layout.addView(this.mY, localLayoutParams1);
    this.mLine1Layout.addView(this.mU, localLayoutParams1);
    this.mLine1Layout.addView(this.mI, localLayoutParams1);
    this.mLine1Layout.addView(this.mO, localLayoutParams1);
    this.mLine1Layout.addView(this.mP, localLayoutParams1);
  }
  
  private void createLine2Layout()
  {
    this.mLine2Layout = new LinearLayout(this.mContext);
    this.mLine2Layout.setOrientation(0);
    this.mLine2Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
    this.mLine2Layout.setPadding(0, 0, 0, this.mPadding);
    this.mA = new RoundedCornerTextView(this.mContext);
    this.mS = new RoundedCornerTextView(this.mContext);
    this.mD = new RoundedCornerTextView(this.mContext);
    this.mF = new RoundedCornerTextView(this.mContext);
    this.mG = new RoundedCornerTextView(this.mContext);
    this.mH = new RoundedCornerTextView(this.mContext);
    this.mJ = new RoundedCornerTextView(this.mContext);
    this.mK = new RoundedCornerTextView(this.mContext);
    this.mL = new RoundedCornerTextView(this.mContext);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    localLayoutParams1.leftMargin = this.mPadding;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    localLayoutParams2.leftMargin = (this.mKeyWidth / 2 + this.mPadding);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    localLayoutParams3.rightMargin = (this.mKeyWidth / 2);
    localLayoutParams3.leftMargin = this.mPadding;
    this.mLine2Layout.addView(this.mA, localLayoutParams2);
    this.mLine2Layout.addView(this.mS, localLayoutParams1);
    this.mLine2Layout.addView(this.mD, localLayoutParams1);
    this.mLine2Layout.addView(this.mF, localLayoutParams1);
    this.mLine2Layout.addView(this.mG, localLayoutParams1);
    this.mLine2Layout.addView(this.mH, localLayoutParams1);
    this.mLine2Layout.addView(this.mJ, localLayoutParams1);
    this.mLine2Layout.addView(this.mK, localLayoutParams1);
    this.mLine2Layout.addView(this.mL, localLayoutParams3);
  }
  
  private void createLine3Layout()
  {
    this.mLine3Layout = new LinearLayout(this.mContext);
    this.mLine3Layout.setOrientation(0);
    this.mLine3Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
    this.mLine3Layout.setPadding(0, 0, 0, this.mPadding);
    this.mShift = new RoundedCornerTextView(this.mContext);
    this.mDelete = new RoundedCornerTextView(this.mContext);
    this.mZ = new RoundedCornerTextView(this.mContext);
    this.mX = new RoundedCornerTextView(this.mContext);
    this.mC = new RoundedCornerTextView(this.mContext);
    this.mV = new RoundedCornerTextView(this.mContext);
    this.mB = new RoundedCornerTextView(this.mContext);
    this.mN = new RoundedCornerTextView(this.mContext);
    this.mM = new RoundedCornerTextView(this.mContext);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(this.mKeyWidth, -1);
    localLayoutParams1.leftMargin = this.mPadding;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(this.mKeyWidth * 3 / 2 + this.mPadding, -1);
    localLayoutParams2.leftMargin = this.mPadding;
    this.mLine3Layout.addView(this.mShift, new LinearLayout.LayoutParams(this.mKeyWidth * 3 / 2 + this.mPadding, -1));
    this.mLine3Layout.addView(this.mZ, localLayoutParams1);
    this.mLine3Layout.addView(this.mX, localLayoutParams1);
    this.mLine3Layout.addView(this.mC, localLayoutParams1);
    this.mLine3Layout.addView(this.mV, localLayoutParams1);
    this.mLine3Layout.addView(this.mB, localLayoutParams1);
    this.mLine3Layout.addView(this.mN, localLayoutParams1);
    this.mLine3Layout.addView(this.mM, localLayoutParams1);
    this.mLine3Layout.addView(this.mDelete, localLayoutParams2);
  }
  
  private void createLine4Layout()
  {
    this.mLine4Layout = new LinearLayout(this.mContext);
    this.mLine4Layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.mLine4Layout.setOrientation(0);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.mKeyWidth * 3 / 2 + this.mPadding, -1);
    localLayoutParams.leftMargin = this.mPadding;
    this.m123 = new RoundedCornerTextView(this.mContext);
    this.mHide = new RoundedCornerTextView(this.mContext);
    this.mConfirm = new RoundedCornerTextView(this.mContext);
    this.mSpace = new RoundedCornerTextView(this.mContext);
    this.m123.setLayoutParams(new LinearLayout.LayoutParams(this.mKeyWidth * 3 / 2 + this.mPadding, -1));
    this.mHide.setLayoutParams(localLayoutParams);
    localLayoutParams = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams.weight = 1.0F;
    localLayoutParams.leftMargin = this.mPadding;
    this.mSpace.setLayoutParams(localLayoutParams);
    localLayoutParams = new LinearLayout.LayoutParams(this.mKeyWidth * 5 / 2 + this.mPadding, -1);
    localLayoutParams.leftMargin = this.mPadding;
    this.mConfirm.setLayoutParams(localLayoutParams);
    this.mConfirm.getPaint().setFakeBoldText(true);
    this.mLine4Layout.addView(this.m123);
    this.mLine4Layout.addView(this.mHide);
    this.mLine4Layout.addView(this.mSpace);
    this.mLine4Layout.addView(this.mConfirm);
  }
  
  private void dismissKeyPreview()
  {
    if (this.mIsKeyPreviewAddedToWindow)
    {
      this.mWindowManager.removeView(this.mPreviewView);
      this.mIsKeyPreviewAddedToWindow = false;
    }
  }
  
  private void doShift(View paramView)
  {
    if (paramView.getTag() == null) {}
    int i;
    do
    {
      return;
      i = ((Integer)paramView.getTag()).intValue();
    } while ((i < 0) || (i == 32));
    paramView = (RoundedCornerTextView)paramView;
    if (this.mIsLowerCase)
    {
      paramView.setText(String.valueOf((char)(i - 32)));
      paramView.setTag(Integer.valueOf(i - 32));
      return;
    }
    paramView.setTag(Integer.valueOf(i + 32));
    paramView.setText(String.valueOf((char)(i + 32)));
  }
  
  private int dp2Px(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(this.mContext, paramInt);
  }
  
  private void initImageKey(RoundedCornerImageView paramRoundedCornerImageView)
  {
    int i = ((Integer)paramRoundedCornerImageView.getTag()).intValue();
    paramRoundedCornerImageView.setCornerRadius(dp2Px(1));
    paramRoundedCornerImageView.setRoundedCornerBgColor(sColorDefaultFuncKeyBg);
    paramRoundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    paramRoundedCornerImageView.setLongClickable(true);
    if (-5 == i)
    {
      paramRoundedCornerImageView.setImageResource(ResourceUtil.getResourceID(this.mContext, "drawable", sResNameDeleteSmall));
      paramRoundedCornerImageView.setOnTouchListener(new EnglishKeyboard.1(this, paramRoundedCornerImageView));
    }
    while (-6 != i) {
      return;
    }
    paramRoundedCornerImageView.setImageResource(ResourceUtil.getResourceID(this.mContext, "drawable", sResNameShift));
    paramRoundedCornerImageView.setOnTouchListener(new EnglishKeyboard.2(this, paramRoundedCornerImageView));
  }
  
  private void initKey(View paramView)
  {
    paramView = (RoundedCornerTextView)paramView;
    paramView.setGravity(17);
    paramView.setTextSize(20.0F);
    paramView.setTextColor(sColorDefaultFont);
    paramView.setCornerRadius(dp2Px(1));
    setKeyBackgroundAndFontColor(paramView, false);
    int i = Integer.valueOf(paramView.getTag().toString()).intValue();
    paramView.setLongClickable(true);
    paramView.setOnTouchListener(new EnglishKeyboard.3(this, i, paramView));
    if (i > 0) {
      paramView.setText(String.valueOf((char)i));
    }
    do
    {
      return;
      if (-3 == i)
      {
        paramView.setText("完成");
        return;
      }
      if (-4 == i)
      {
        paramView.setText("隐藏");
        return;
      }
      if (-1 == i)
      {
        paramView.setText("123");
        return;
      }
      if (-6 == i)
      {
        paramView.setText("切换");
        return;
      }
    } while (-5 != i);
    paramView.setText("删除");
  }
  
  private void initTagValue()
  {
    this.mQ.setTag(Integer.valueOf(113));
    this.mW.setTag(Integer.valueOf(119));
    this.mE.setTag(Integer.valueOf(101));
    this.mR.setTag(Integer.valueOf(114));
    this.mT.setTag(Integer.valueOf(116));
    this.mY.setTag(Integer.valueOf(121));
    this.mU.setTag(Integer.valueOf(117));
    this.mI.setTag(Integer.valueOf(105));
    this.mO.setTag(Integer.valueOf(111));
    this.mP.setTag(Integer.valueOf(112));
    this.mA.setTag(Integer.valueOf(97));
    this.mS.setTag(Integer.valueOf(115));
    this.mD.setTag(Integer.valueOf(100));
    this.mF.setTag(Integer.valueOf(102));
    this.mG.setTag(Integer.valueOf(103));
    this.mH.setTag(Integer.valueOf(104));
    this.mJ.setTag(Integer.valueOf(106));
    this.mK.setTag(Integer.valueOf(107));
    this.mL.setTag(Integer.valueOf(108));
    this.mZ.setTag(Integer.valueOf(122));
    this.mX.setTag(Integer.valueOf(120));
    this.mC.setTag(Integer.valueOf(99));
    this.mV.setTag(Integer.valueOf(118));
    this.mB.setTag(Integer.valueOf(98));
    this.mN.setTag(Integer.valueOf(110));
    this.mM.setTag(Integer.valueOf(109));
    this.mSpace.setTag(Integer.valueOf(32));
    this.mDelete.setTag(Integer.valueOf(-5));
    this.mHide.setTag(Integer.valueOf(-4));
    this.m123.setTag(Integer.valueOf(-1));
    this.mConfirm.setTag(Integer.valueOf(-3));
    this.mShift.setTag(Integer.valueOf(-6));
  }
  
  private void layout()
  {
    this.mRootLayout = new LinearLayout(this.mContext);
    this.mRootLayout.setOrientation(1);
    this.mRootLayout.setBackgroundColor(sColorKeyboardBg);
    this.mRootLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 250.0F)));
    this.mRootLayout.setPadding(2, 2, 2, 2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams.weight = 1.0F;
    this.mRootLayout.addView(this.mLine1Layout, localLayoutParams);
    this.mRootLayout.addView(this.mLine2Layout, localLayoutParams);
    this.mRootLayout.addView(this.mLine3Layout, localLayoutParams);
    this.mRootLayout.addView(this.mLine4Layout, localLayoutParams);
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
  
  private void setListenersAndOthers(ViewGroup paramViewGroup)
  {
    int i = 0;
    if (i >= paramViewGroup.getChildCount()) {
      return;
    }
    View localView = paramViewGroup.getChildAt(i);
    if ((localView instanceof ViewGroup)) {
      setListenersAndOthers((ViewGroup)localView);
    }
    for (;;)
    {
      i += 1;
      break;
      if ((localView instanceof RoundedCornerTextView)) {
        initKey(localView);
      } else if ((localView instanceof RoundedCornerImageView)) {
        initImageKey((RoundedCornerImageView)localView);
      }
    }
  }
  
  private void shift(ViewGroup paramViewGroup)
  {
    int i = 0;
    if (i >= paramViewGroup.getChildCount()) {
      return;
    }
    View localView = paramViewGroup.getChildAt(i);
    if ((localView instanceof ViewGroup)) {
      shift((ViewGroup)localView);
    }
    for (;;)
    {
      i += 1;
      break;
      if ((localView instanceof RoundedCornerTextView)) {
        doShift(localView);
      }
    }
  }
  
  private void showKeyPreview(View paramView)
  {
    if (!this.mIsKeyPreviewAddedToWindow)
    {
      int[] arrayOfInt = new int[2];
      paramView.getLocationOnScreen(arrayOfInt);
      WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-1, -2, 2, 520, -3);
      if (!(this.mContext instanceof Activity)) {
        localLayoutParams.type = 2003;
      }
      localLayoutParams.width = (paramView.getWidth() * 5 / 3 + dp2Px(6));
      localLayoutParams.height = (paramView.getHeight() * 11 / 5);
      localLayoutParams.x = (arrayOfInt[0] - paramView.getWidth() / 3 - dp2Px(3));
      localLayoutParams.y = (arrayOfInt[1] - paramView.getHeight() * 16 / 10);
      localLayoutParams.gravity = 51;
      this.mWindowManager.addView(this.mPreviewView, localLayoutParams);
      this.mIsKeyPreviewAddedToWindow = true;
    }
  }
  
  protected View getView()
  {
    return this.mRootLayout;
  }
  
  public void hide()
  {
    this.mRootLayout.setVisibility(8);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getTag() == null) {}
    int i;
    do
    {
      return;
      i = ((Integer)paramView.getTag()).intValue();
      if (-6 == i)
      {
        shift(this.mRootLayout);
        if (this.mIsLowerCase)
        {
          this.mIsLowerCase = false;
          return;
        }
        this.mIsLowerCase = true;
        return;
      }
    } while (this.mActionListener == null);
    this.mActionListener.onKeyEvent(i);
  }
  
  public void setOnKeyboardActionListener(KeyboardEventListener paramKeyboardEventListener)
  {
    this.mActionListener = paramKeyboardEventListener;
  }
  
  public void setTheme(short paramShort)
  {
    super.setTheme(paramShort);
    setListenersAndOthers(this.mRootLayout);
    this.mPreviewView.setBackgroundResource(ResourceUtil.getResourceID(this.mContext, "drawable", getResKeyPreviewBg()));
  }
  
  public void show()
  {
    this.mRootLayout.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\EnglishKeyboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */