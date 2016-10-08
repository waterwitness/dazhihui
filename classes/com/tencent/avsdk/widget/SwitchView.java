package com.tencent.avsdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class SwitchView
  extends RelativeLayout
  implements View.OnClickListener
{
  private boolean mChecked = false;
  private int mMargin = 4;
  private TextView mOffText;
  private CompoundButton.OnCheckedChangeListener mOnCheckedChangeListener;
  private TextView mOnText;
  
  public SwitchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SwitchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setBackgroundResource(2130838159);
    this.mOnText = new TextView(paramContext);
    this.mOnText.setBackgroundResource(2130838162);
    this.mOnText.setText("弹幕");
    this.mOnText.setTextColor(-12686651);
    this.mOnText.setTextSize(15.0F);
    this.mOnText.setGravity(17);
    paramAttributeSet = new RelativeLayout.LayoutParams(-2, -1);
    paramAttributeSet.addRule(15);
    paramAttributeSet.addRule(11);
    paramAttributeSet.topMargin = this.mMargin;
    paramAttributeSet.bottomMargin = this.mMargin;
    paramAttributeSet.rightMargin = this.mMargin;
    addView(this.mOnText, paramAttributeSet);
    this.mOffText = new TextView(paramContext);
    this.mOffText.setBackgroundResource(2130838161);
    this.mOffText.setText("弹幕");
    this.mOffText.setTextColor(-7829368);
    this.mOffText.setTextSize(15.0F);
    this.mOffText.setGravity(17);
    paramContext = new RelativeLayout.LayoutParams(-2, -1);
    paramContext.addRule(15);
    paramContext.addRule(9);
    paramContext.topMargin = this.mMargin;
    paramContext.bottomMargin = this.mMargin;
    paramContext.leftMargin = this.mMargin;
    addView(this.mOffText, paramContext);
    setOnClickListener(this);
    this.mOnText.setVisibility(4);
    this.mOffText.setVisibility(0);
  }
  
  public void onClick(View paramView)
  {
    boolean bool;
    if (!this.mChecked)
    {
      bool = true;
      this.mChecked = bool;
      if (!this.mChecked) {
        break label70;
      }
      setBackgroundResource(2130838160);
      this.mOffText.setVisibility(4);
      this.mOnText.setVisibility(0);
    }
    for (;;)
    {
      if (this.mOnCheckedChangeListener != null) {
        this.mOnCheckedChangeListener.onCheckedChanged(null, this.mChecked);
      }
      return;
      bool = false;
      break;
      label70:
      setBackgroundResource(2130838159);
      this.mOnText.setVisibility(4);
      this.mOffText.setVisibility(0);
    }
  }
  
  public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.mOnCheckedChangeListener = paramOnCheckedChangeListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\SwitchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */