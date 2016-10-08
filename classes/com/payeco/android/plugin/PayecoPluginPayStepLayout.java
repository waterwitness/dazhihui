package com.payeco.android.plugin;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PayecoPluginPayStepLayout
  extends RelativeLayout
{
  private ImageView ad;
  private TextView ae;
  private TextView af;
  
  public PayecoPluginPayStepLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public PayecoPluginPayStepLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    Resources localResources = paramContext.getResources();
    paramContext = paramContext.getPackageName();
    paramAttributeSet.inflate(localResources.getIdentifier("payeco_paystep_layout", "layout", paramContext), this);
    this.ad = ((ImageView)findViewById(localResources.getIdentifier("payeco_paystep_lime", "id", paramContext)));
    this.ae = ((TextView)findViewById(localResources.getIdentifier("payeco_paystep_solid", "id", paramContext)));
    this.af = ((TextView)findViewById(localResources.getIdentifier("payeco_paystep_tip", "id", paramContext)));
  }
  
  public void initLayout(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.ad.setBackgroundColor(paramContext.getResources().getColor(paramInt2));
    this.ae.setBackgroundResource(paramInt1);
    this.ae.setText(paramString);
    this.af.setText(paramContext.getString(paramInt3));
    this.af.setTextColor(paramContext.getResources().getColor(paramInt2));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoPluginPayStepLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */