package com.tencent.avsdk.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.tencent.avsdk.Model.GiftVo;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.control.GiftManager;

public class GiftView
  extends PopupWindow
{
  GiftView.ViewFlowAdapter adapter;
  TextView commitBtn;
  TextView continuousBtn;
  Handler mActivityHandler;
  private Context mContext;
  private GiftVo mMenuConfigVo;
  TextView money;
  View noSelectTip;
  private GiftVo.GiftItem selectedItem;
  private int time = -1;
  
  public GiftView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public GiftView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    setHeight(-2);
    setWidth(-1);
    setOutsideTouchable(true);
    View localView = LayoutInflater.from(this.mContext).inflate(2130903150, null);
    setContentView(localView);
    setBackgroundDrawable(new ColorDrawable(0));
    ViewFlow localViewFlow = (ViewFlow)localView.findViewById(2131559173);
    localViewFlow.setFlowIndicator((CircleFlowIndicator)localView.findViewById(2131559174));
    localView.findViewById(2131559178).setOnClickListener(new GiftView.1(this));
    this.adapter = new GiftView.ViewFlowAdapter(this);
    localViewFlow.setAdapter(this.adapter);
    this.noSelectTip = localView.findViewById(2131559175);
    this.commitBtn = ((TextView)localView.findViewById(2131559177));
    this.commitBtn.setOnClickListener(this.adapter);
    this.noSelectTip.setVisibility(0);
    this.money = ((TextView)localView.findViewById(2131559172));
    localView.findViewById(2131559176).setOnClickListener(new GiftView.2(this));
    this.continuousBtn = ((TextView)localView.findViewById(2131559179));
    GiftManager.getConfig(new GiftView.3(this));
  }
  
  public void dismiss()
  {
    super.dismiss();
    this.time = -1;
  }
  
  public void setHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setMoney(String paramString)
  {
    this.money.setText(paramString + " 慧币");
  }
  
  public void showAtLocation(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
    this.selectedItem = null;
    this.commitBtn.setBackgroundColor(-4671304);
    this.noSelectTip.setVisibility(8);
    this.mActivityHandler.sendEmptyMessage(270);
    this.adapter.notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */