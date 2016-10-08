package com.tencent.avsdkhost.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.tencent.avsdkhost.control.MessageControlHost;
import com.tencent.avsdkhost.control.MessageControlHost.AccountNumberListener;

public class IlvbRedEnvelopeHost
  extends BaseActivity
  implements MessageControlHost.AccountNumberListener
{
  TextView errorInfo;
  EditText explainEdt;
  TextView hongbaoTip;
  EditText huiNmberEdt;
  TextView huiTotal;
  int minMoney = 100;
  float moneyTotalNum = -1.0F;
  EditText redEnvelopeNumberEdt;
  Button sendRedEnvelope;
  TextWatcher textWatcher = new IlvbRedEnvelopeHost.4(this);
  TextWatcher textWatcher1 = new IlvbRedEnvelopeHost.3(this);
  
  private void manageInput()
  {
    String str1 = this.redEnvelopeNumberEdt.getText().toString();
    String str2 = this.huiNmberEdt.getText().toString();
    if (!TextUtils.isEmpty(str1)) {}
    for (int i = Integer.parseInt(str1);; i = -1)
    {
      if (!TextUtils.isEmpty(str2)) {}
      for (int j = Integer.parseInt(str2);; j = -1)
      {
        if (i == -1)
        {
          if (j != -1)
          {
            if (j < this.minMoney)
            {
              setSendState(false, "慧币总数不得低于" + this.minMoney + "币");
              return;
            }
            if ((j > this.moneyTotalNum) && (this.moneyTotalNum != -1.0F))
            {
              setSendState(false, "你的余额不足，点击此处可以进行充值!");
              return;
            }
            setSendState(false, null);
            return;
          }
          setSendState(false, null);
          return;
        }
        if (i < 1)
        {
          setSendState(false, "红包个数应该大于0");
          return;
        }
        if (i > 1000)
        {
          setSendState(false, "红包个数不能超过1000");
          return;
        }
        if (j != -1)
        {
          if (j < this.minMoney)
          {
            setSendState(false, "慧币总数不得低于" + this.minMoney + "币");
            return;
          }
          if ((j > this.moneyTotalNum) && (this.moneyTotalNum != -1.0F))
          {
            setSendState(false, "你的余额不足，点击此处可以进行充值!");
            return;
          }
          float f = j / i;
          if (f < 1.0F)
          {
            setSendState(false, "单个红包金额不可小于1币");
            return;
          }
          if (f > 2000.0F)
          {
            setSendState(false, "单个红包金额不可超过2000币");
            return;
          }
          setSendState(true, null);
          return;
        }
        setSendState(false, null);
        return;
      }
    }
  }
  
  public static void onStart(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, IlvbRedEnvelopeHost.class);
    localIntent.putExtra("roomNumber", paramInt);
    paramContext.startActivity(localIntent);
  }
  
  private void setSendState(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      this.sendRedEnvelope.setClickable(true);
      this.sendRedEnvelope.setBackgroundResource(2130838211);
    }
    while (TextUtils.isEmpty(paramString))
    {
      this.errorInfo.setVisibility(4);
      return;
      this.sendRedEnvelope.setClickable(false);
      this.sendRedEnvelope.setBackgroundResource(2130838213);
    }
    if (paramString.contains("余额不足")) {
      this.errorInfo.setOnClickListener(new IlvbRedEnvelopeHost.5(this));
    }
    for (;;)
    {
      this.errorInfo.setVisibility(0);
      this.errorInfo.setText(paramString);
      return;
      this.errorInfo.setClickable(false);
    }
  }
  
  public void accountRes(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    this.moneyTotalNum = Float.parseFloat(paramString);
    TextView localTextView = this.hongbaoTip;
    if (this.moneyTotalNum == -1.0F) {}
    for (paramString = "每人抽到的慧币随机";; paramString = "每人抽到的慧币随机,你一共有" + paramString + "慧币")
    {
      localTextView.setText(paramString);
      return;
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903204);
    MessageControlHost.getInstance().setOnQueryAccountListener(this);
    MessageControlHost.getInstance().sendQueryAccount();
    paramBundle = (DzhHeader)findViewById(2131559456);
    paramBundle.a(g.a().b());
    paramBundle.a(this, new IlvbRedEnvelopeHost.1(this));
    this.redEnvelopeNumberEdt = ((EditText)findViewById(2131559458));
    this.huiNmberEdt = ((EditText)findViewById(2131559460));
    this.explainEdt = ((EditText)findViewById(2131559462));
    TextView localTextView = (TextView)findViewById(2131559459);
    this.errorInfo = ((TextView)findViewById(2131559457));
    this.huiTotal = ((TextView)findViewById(2131559463));
    this.hongbaoTip = ((TextView)findViewById(2131559461));
    this.sendRedEnvelope = ((Button)findViewById(2131559464));
    this.sendRedEnvelope.setOnClickListener(new IlvbRedEnvelopeHost.2(this));
    this.sendRedEnvelope.setClickable(false);
    int i = getIntent().getIntExtra("roomNumber", -1);
    StringBuilder localStringBuilder = new StringBuilder().append("本房间共");
    if (i == -1) {}
    for (paramBundle = "--";; paramBundle = String.valueOf(i))
    {
      localTextView.setText(paramBundle + "人");
      this.redEnvelopeNumberEdt.addTextChangedListener(this.textWatcher);
      this.huiNmberEdt.addTextChangedListener(this.textWatcher1);
      return;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    MessageControlHost.getInstance().setOnQueryAccountListener(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\IlvbRedEnvelopeHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */