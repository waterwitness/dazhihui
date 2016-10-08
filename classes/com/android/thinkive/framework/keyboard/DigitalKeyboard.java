package com.android.thinkive.framework.keyboard;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.thinkive.framework.util.RandomUtil;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;
import com.android.thinkive.framework.view.RoundedCornerTextView;

public class DigitalKeyboard
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
  private int[] mASCIITagValue = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
  private KeyboardEventListener mActionListener;
  private RoundedCornerTextView mClear;
  private RoundedCornerTextView mConfirm;
  private Context mContext;
  private RoundedCornerTextView mDelete;
  private RoundedCornerTextView mDot;
  private RoundedCornerTextView mHide;
  private boolean mIsRandom = false;
  private LinearLayout mNumLine1Layout;
  private LinearLayout mNumLine2Layout;
  private LinearLayout mNumLine3Layout;
  private LinearLayout mNumLine4Layout;
  private LinearLayout mNumberLayout;
  
  public DigitalKeyboard(Context paramContext)
  {
    this.mContext = paramContext;
    init();
  }
  
  public DigitalKeyboard(Context paramContext, boolean paramBoolean)
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
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams1.weight = 1.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.leftMargin = dp2Px(2);
    this.m1 = new RoundedCornerTextView(this.mContext);
    this.m2 = new RoundedCornerTextView(this.mContext);
    this.m3 = new RoundedCornerTextView(this.mContext);
    this.mDelete = new RoundedCornerTextView(this.mContext);
    this.m1.setLayoutParams(localLayoutParams1);
    this.m2.setLayoutParams(localLayoutParams2);
    this.m3.setLayoutParams(localLayoutParams2);
    this.mDelete.setLayoutParams(localLayoutParams2);
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
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams1.weight = 1.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.leftMargin = dp2Px(2);
    this.m4 = new RoundedCornerTextView(this.mContext);
    this.m5 = new RoundedCornerTextView(this.mContext);
    this.m6 = new RoundedCornerTextView(this.mContext);
    this.mClear = new RoundedCornerTextView(this.mContext);
    this.m4.setLayoutParams(localLayoutParams1);
    this.m5.setLayoutParams(localLayoutParams2);
    this.m6.setLayoutParams(localLayoutParams2);
    this.mClear.setLayoutParams(localLayoutParams2);
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
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams1.weight = 1.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.leftMargin = dp2Px(2);
    this.m7 = new RoundedCornerTextView(this.mContext);
    this.m8 = new RoundedCornerTextView(this.mContext);
    this.m9 = new RoundedCornerTextView(this.mContext);
    this.mHide = new RoundedCornerTextView(this.mContext);
    this.m7.setLayoutParams(localLayoutParams1);
    this.m8.setLayoutParams(localLayoutParams2);
    this.m9.setLayoutParams(localLayoutParams2);
    this.mHide.setLayoutParams(localLayoutParams2);
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
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams1.weight = 1.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.leftMargin = dp2Px(2);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams3.weight = 2.0F;
    localLayoutParams3.leftMargin = dp2Px(2);
    this.mDot = new RoundedCornerTextView(this.mContext);
    this.m0 = new RoundedCornerTextView(this.mContext);
    this.mConfirm = new RoundedCornerTextView(this.mContext);
    this.mDot.setLayoutParams(localLayoutParams1);
    this.m0.setLayoutParams(localLayoutParams2);
    this.mConfirm.setLayoutParams(localLayoutParams3);
    this.mNumLine4Layout.addView(this.mDot);
    this.mNumLine4Layout.addView(this.m0);
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
    if (this.mIsRandom) {
      RandomUtil.shuffle(this.mASCIITagValue);
    }
    initDefaultTagValue();
    setListenersAndOthers(this.mNumberLayout);
  }
  
  private void initDefaultTagValue()
  {
    this.m0.setTag(Integer.valueOf(this.mASCIITagValue[0]));
    this.m1.setTag(Integer.valueOf(this.mASCIITagValue[1]));
    this.m2.setTag(Integer.valueOf(this.mASCIITagValue[2]));
    this.m3.setTag(Integer.valueOf(this.mASCIITagValue[3]));
    this.m4.setTag(Integer.valueOf(this.mASCIITagValue[4]));
    this.m5.setTag(Integer.valueOf(this.mASCIITagValue[5]));
    this.m6.setTag(Integer.valueOf(this.mASCIITagValue[6]));
    this.m7.setTag(Integer.valueOf(this.mASCIITagValue[7]));
    this.m8.setTag(Integer.valueOf(this.mASCIITagValue[8]));
    this.m9.setTag(Integer.valueOf(this.mASCIITagValue[9]));
    this.mConfirm.setTag(Integer.valueOf(-3));
    this.mDelete.setTag(Integer.valueOf(-5));
    this.mHide.setTag(Integer.valueOf(-4));
    this.mDot.setTag(Integer.valueOf(-26));
    this.mClear.setTag(Integer.valueOf(-2));
  }
  
  private void initImageKey(RoundedCornerImageView paramRoundedCornerImageView)
  {
    paramRoundedCornerImageView.setImageResource(ResourceUtil.getResourceID(this.mContext, "drawable", sResNameDeleteBig));
    paramRoundedCornerImageView.setOnClickListener(new DigitalKeyboard.2(this));
    paramRoundedCornerImageView.setCornerRadius(dp2Px(1));
    paramRoundedCornerImageView.setRoundedCornerBgColor(sColorDefaultFuncKeyBg);
    paramRoundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    paramRoundedCornerImageView.setLongClickable(true);
    paramRoundedCornerImageView.setOnTouchListener(new DigitalKeyboard.3(this, paramRoundedCornerImageView));
  }
  
  private void layout()
  {
    this.mNumberLayout = new LinearLayout(this.mContext);
    this.mNumberLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, (int)ScreenUtil.dpToPx(this.mContext, 250.0F)));
    this.mNumberLayout.setOrientation(1);
    this.mNumberLayout.setBackgroundColor(sColorKeyboardBg);
    this.mNumberLayout.setPadding(2, 2, 2, 2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams.weight = 1.0F;
    this.mNumberLayout.addView(this.mNumLine1Layout, localLayoutParams);
    this.mNumberLayout.addView(this.mNumLine2Layout, localLayoutParams);
    this.mNumberLayout.addView(this.mNumLine3Layout, localLayoutParams);
    this.mNumberLayout.addView(this.mNumLine4Layout, localLayoutParams);
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
    Object localObject = paramViewGroup.getChildAt(i);
    if ((localObject instanceof ViewGroup)) {
      setListenersAndOthers((ViewGroup)localObject);
    }
    for (;;)
    {
      i += 1;
      break;
      if ((localObject instanceof RoundedCornerTextView))
      {
        localObject = (RoundedCornerTextView)localObject;
        ((RoundedCornerTextView)localObject).setGravity(17);
        ((RoundedCornerTextView)localObject).setTextSize(20.0F);
        ((RoundedCornerTextView)localObject).setTextColor(sColorDefaultFont);
        ((RoundedCornerTextView)localObject).setCornerRadius(dp2Px(1));
        setKeyBackgroundAndFontColor((RoundedCornerTextView)localObject, false);
        ((RoundedCornerTextView)localObject).setLongClickable(true);
        ((RoundedCornerTextView)localObject).setOnTouchListener(new DigitalKeyboard.1(this));
        int j = Integer.valueOf(((RoundedCornerTextView)localObject).getTag().toString()).intValue();
        if (j > 0) {
          ((RoundedCornerTextView)localObject).setText(String.valueOf((char)j));
        } else if (-3 == j) {
          ((RoundedCornerTextView)localObject).setText("确定");
        } else if (-5 == j) {
          ((RoundedCornerTextView)localObject).setText("退格");
        } else if (-2 == j) {
          ((RoundedCornerTextView)localObject).setText("清空");
        } else if (-26 == j) {
          ((RoundedCornerTextView)localObject).setText(".");
        } else if (-4 == j) {
          ((RoundedCornerTextView)localObject).setText("隐藏");
        }
      }
    }
  }
  
  protected View getView()
  {
    return this.mNumberLayout;
  }
  
  public void hide()
  {
    this.mNumberLayout.setVisibility(8);
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
    setListenersAndOthers(this.mNumberLayout);
  }
  
  public void show()
  {
    this.mNumberLayout.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\DigitalKeyboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */