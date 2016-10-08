package com.payeco.android.plugin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.payeco.android.plugin.http.HttpAction;
import com.payeco.android.plugin.http.encryption.MD5;
import com.payeco.android.plugin.http.encryption.ThreeDES;
import com.payeco.android.plugin.http.objects.InitiPlugin;
import com.payeco.android.plugin.http.objects.PluginObject;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.ConfigFileUtil;
import com.payeco.android.plugin.http.parse.XmlTool;
import java.io.IOException;

public class PayecoPluginLoadingActivity
  extends PayecoBasicActivity
{
  private Resources a;
  private PayecoBasicActivity aa;
  private InitiPlugin ab;
  private String b;
  private UpPay d;
  private Handler e = new s(this);
  
  private void a(String paramString)
  {
    Resources localResources = getResources();
    q localq = new q(this);
    int i = this.a.getIdentifier("payeco_prompt", "string", this.b);
    int j = this.a.getIdentifier("payeco_confirm", "string", this.b);
    PayecoBaseUtil.showCommonDialog(this, localResources.getString(i), paramString, localResources.getString(j), localq, null, null, false);
  }
  
  private void a(String paramString, byte[] paramArrayOfByte)
  {
    ConfigFileUtil.writeConfigFile(this, ThreeDES.encryptMode(paramString.getBytes(), paramArrayOfByte), "payeco_plugin_config.xml", 0);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    ConfigFileUtil.writeConfigFile(this, new MD5().getMD5(paramArrayOfByte), "payeco_plugin_config_md5.xml", 0);
  }
  
  private String f()
  {
    Object localObject = new InitiPlugin(String.valueOf(PayecoBaseUtil.getConfigValue(this, "configVersion")), null, PayecoPluginApplication.merchantId, null, null, null, null, null, null, "sdk", null, null, null);
    try
    {
      localObject = HttpAction.sendRequestData(this, "PluginInit.Req", (PluginObject)localObject);
      return (String)localObject;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return null;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    this.b = getPackageName();
    setContentView(this.a.getIdentifier("payeco_plugin_loading", "layout", this.b));
    this.aa = this;
    PayecoPluginApplication.getInstance().addActivity(this.aa);
    PayecoPluginApplication.pluginSerinalNo = PayecoBaseUtil.getValueFromPreferences(this.aa, "payeco_pluginSerinalNo");
    PayecoPluginApplication.terminalModel = Build.MODEL;
    PayecoPluginApplication.terminalOs = "android " + Build.VERSION.RELEASE;
    PayecoPluginApplication.plugin_version = "06-02-New Version 1.1.2";
    paramBundle = getIntent().getExtras();
    int i;
    if (paramBundle == null) {
      i = 0;
    }
    for (;;)
    {
      if (i != 0)
      {
        if (!PayecoBaseUtil.checkNetWork(this)) {
          break;
        }
        new r(this, (byte)0).execute(new Void[0]);
      }
      return;
      this.d = ((UpPay)XmlTool.xmlToObject(paramBundle.getString("upPay.Req"), UpPay.class, 1));
      PayecoPluginApplication.getInstance().setmUpPay(this.d);
      if (this.d != null)
      {
        PayecoPluginApplication.merchantId = this.d.getMerchantId();
        PayecoPluginApplication.payend_action = this.d.getBackAction();
        i = 1;
      }
      else
      {
        a("get order from merchant client error");
        i = 0;
      }
    }
    a(getResources().getString(this.a.getIdentifier("payeco_networkError", "string", this.b)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoPluginLoadingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */