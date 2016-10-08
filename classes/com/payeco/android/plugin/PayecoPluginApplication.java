package com.payeco.android.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import com.payeco.android.plugin.http.objects.UpPay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PayecoPluginApplication
{
  private static PayecoPluginApplication W;
  public static String authPay_mobileMac;
  public static int mFlagMerchantName;
  public static String merchantId = null;
  public static String payend_action = null;
  public static String pluginSerinalNo;
  public static String plugin_version;
  public static String sessionId;
  public static String terminalModel;
  public static String terminalOs;
  private List S = new ArrayList();
  private UpPay T;
  private Map U;
  private Map V;
  
  static
  {
    mFlagMerchantName = 0;
    plugin_version = null;
    terminalOs = null;
    terminalModel = null;
    pluginSerinalNo = null;
  }
  
  private void a(Context paramContext, Intent paramIntent)
  {
    sessionId = null;
    this.U = null;
    paramContext.sendBroadcast(paramIntent);
    paramContext = this.S.iterator();
    for (;;)
    {
      if (!paramContext.hasNext()) {
        return;
      }
      paramIntent = (Activity)paramContext.next();
      if (!paramIntent.isFinishing()) {
        paramIntent.finish();
      }
    }
  }
  
  public static PayecoPluginApplication getInstance()
  {
    if (W == null) {
      W = new PayecoPluginApplication();
    }
    return W;
  }
  
  public void addActivity(Activity paramActivity)
  {
    this.S.add(paramActivity);
  }
  
  public List getActivityList()
  {
    return this.S;
  }
  
  public Map getConfigMap()
  {
    return this.U;
  }
  
  public Map getNetConfigMap()
  {
    return this.V;
  }
  
  public UpPay getmUpPay()
  {
    return this.T;
  }
  
  public void payEnd(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = new Intent(payend_action);
    ((Intent)localObject).putExtra("upPay.Rsp", paramString2);
    if (!"0000".equals(paramString2))
    {
      if ("0".equals(paramString1))
      {
        paramString1 = paramContext.getResources();
        paramString2 = paramContext.getPackageName();
        localObject = new o(this, paramContext, (Intent)localObject);
        p localp = new p(this);
        int i = paramString1.getIdentifier("payeco_prompt", "string", paramString2);
        int j = paramString1.getIdentifier("payeco_exit_app_msg", "string", paramString2);
        int k = paramString1.getIdentifier("payeco_confirm", "string", paramString2);
        int m = paramString1.getIdentifier("payeco_cancel", "string", paramString2);
        PayecoBaseUtil.showCommonDialog(paramContext, paramString1.getString(i), paramString1.getString(j), paramString1.getString(k), (DialogInterface.OnClickListener)localObject, paramString1.getString(m), localp, true);
      }
    }
    else {
      return;
    }
    a(paramContext, (Intent)localObject);
  }
  
  public void setActivityList(List paramList)
  {
    this.S = paramList;
  }
  
  public void setConfigMap(Map paramMap)
  {
    this.U = paramMap;
  }
  
  public void setNetConfigMap(Map paramMap)
  {
    this.V = paramMap;
  }
  
  public void setmUpPay(UpPay paramUpPay)
  {
    this.T = paramUpPay;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoPluginApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */