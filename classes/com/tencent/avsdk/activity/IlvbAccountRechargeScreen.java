package com.tencent.avsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.GridView;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.tencent.avsdk.control.MessageControl;
import com.tencent.avsdk.control.MessageControl.AccountNumberListener;

public class IlvbAccountRechargeScreen
  extends BaseActivity
  implements cp, cs, MessageControl.AccountNumberListener
{
  private static final int SDK_PAY_FLAG = 1;
  private static final String TAG = "ilvb";
  private TextView mBalanceText;
  private MyWebView mChargeInfoWebView;
  private int mCurrentSelect;
  private DzhHeader mCustomTitle;
  private MessageControl mMessageControl;
  private int[] mPayMathodId = { 2130838330, 2130838331 };
  private String[] mPayMathodNames = { "支付宝", "微信" };
  private GridView mPayMethodGridView;
  private IlvbAccountRechargeScreen.PayMethodGridViewAdapter mPayMethodGridViewAdapter;
  private String mRemoteBalance;
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public void accountRes(String paramString)
  {
    this.mBalanceText.setText(paramString);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (IlvbAccountRechargeScreen.3.$SwitchMap$com$android$dazhihui$ui$screen$LookFace[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.mCustomTitle == null);
      this.mCustomTitle.a(paramy);
      return;
    } while (this.mCustomTitle == null);
    this.mCustomTitle.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "我的慧币";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.mCustomTitle = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903172);
    this.mBalanceText = ((TextView)findViewById(2131559302));
    paramBundle = getIntent().getExtras();
    if (paramBundle != null) {
      this.mRemoteBalance = paramBundle.getString("price", "");
    }
    this.mCustomTitle = ((DzhHeader)findViewById(2131558869));
    this.mCustomTitle.setOnHeaderButtonClickListener(this);
    this.mCustomTitle.a(this, this);
    this.mPayMethodGridView = ((GridView)findViewById(2131559304));
    this.mPayMethodGridViewAdapter = new IlvbAccountRechargeScreen.PayMethodGridViewAdapter(this, this, this.mPayMathodId, this.mPayMathodNames);
    this.mPayMethodGridView.setAdapter(this.mPayMethodGridViewAdapter);
    this.mPayMethodGridView.setOnItemClickListener(new IlvbAccountRechargeScreen.1(this));
    this.mChargeInfoWebView = ((MyWebView)findViewById(2131559305));
    this.mChargeInfoWebView.setFocusable(false);
    this.mChargeInfoWebView.getSettings().setBuiltInZoomControls(false);
    this.mChargeInfoWebView.setHorizontalFadingEdgeEnabled(false);
    this.mChargeInfoWebView.setHorizontalScrollBarEnabled(false);
    this.mChargeInfoWebView.setHorizontalScrollbarOverlay(false);
    this.mChargeInfoWebView.setVerticalFadingEdgeEnabled(false);
    this.mChargeInfoWebView.setVerticalScrollBarEnabled(false);
    this.mChargeInfoWebView.setVerticalScrollbarOverlay(false);
    this.mChargeInfoWebView.setBackgroundColor(0);
    this.mChargeInfoWebView.setStatisticsCountId(1420);
    this.mChargeInfoWebView.setWebViewLoadListener(new IlvbAccountRechargeScreen.2(this));
    this.mChargeInfoWebView.setLayerType(0, null);
    this.mChargeInfoWebView.loadUrl(f.ae);
    n.a("", 20252);
  }
  
  protected void onDestroy()
  {
    if (this.mMessageControl != null) {
      this.mMessageControl.setOnQueryAccountListener(null);
    }
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!TextUtils.isEmpty(this.mRemoteBalance)) {
      this.mBalanceText.setText(this.mRemoteBalance);
    }
    do
    {
      return;
      if (this.mMessageControl == null) {
        this.mMessageControl = MessageControl.getInstance();
      }
    } while (this.mMessageControl == null);
    this.mMessageControl.setOnQueryAccountListener(this);
    this.mMessageControl.sendQueryAccount();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbAccountRechargeScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */