package com.payeco.android.plugin;

import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.payeco.android.plugin.http.HttpAction;
import com.payeco.android.plugin.http.objects.CheckOrder;
import com.payeco.android.plugin.http.objects.CommonPay;
import com.payeco.android.plugin.http.objects.CommonPayValidation;
import com.payeco.android.plugin.http.objects.PluginObject;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;
import com.payeco.android.plugin.util.EditTextGroupWatch;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class PayecoOrderDetailActivity
  extends PayecoBasicActivity
{
  protected static final String USECQP_NO = "1";
  protected static final String USECQP_YES = "0";
  protected static String mUseCqp = "0";
  private String A;
  private String B;
  private String C;
  private Button D;
  private PayecoPluginPayStepLayout E;
  private int F;
  private int G;
  private int H;
  private int I;
  private Resources a;
  private String b;
  private PayecoOrderDetailActivity c;
  private UpPay d;
  private Handler e = new j(this);
  private int f = -1;
  private CheckOrder g;
  private CommonPayValidation h;
  private CommonPay i;
  private Button j;
  private RelativeLayout k;
  private RelativeLayout l;
  private boolean m;
  private int n = 0;
  private int o = 0;
  private TextView p;
  private String q;
  private EditText r;
  private String s;
  private String t;
  private LocationManager u;
  private Looper v;
  private g w;
  private g x;
  private i y;
  private h z;
  
  private static String a(String paramString1, String paramString2)
  {
    int i1 = 0;
    for (;;)
    {
      int i2;
      try
      {
        paramString1 = new DefaultHttpClient().execute(new HttpGet("http://maps.google.cn/maps/api/geocode/json?latlng=" + paramString1 + "," + paramString2 + "&sensor=true&language=zh-CN"));
        if ((paramString1 != null) && (paramString1.getStatusLine().getStatusCode() == 200))
        {
          JSONArray localJSONArray = new JSONObject(EntityUtils.toString(paramString1.getEntity())).getJSONArray("results").getJSONObject(0).getJSONArray("address_components");
          i2 = localJSONArray.length();
          paramString1 = null;
          String str1 = null;
          break label250;
          JSONObject localJSONObject = localJSONArray.getJSONObject(i1);
          String str2 = localJSONObject.getJSONArray("types").get(0).toString();
          if ("administrative_area_level_1".equals(str2))
          {
            paramString2 = localJSONObject.getString("long_name").toString();
            if ((paramString2 == null) || (str1 == null)) {
              break label259;
            }
            return paramString2.substring(0, paramString2.length() - 1) + "," + str1;
          }
          paramString2 = paramString1;
          if (!"locality".equals(str2)) {
            continue;
          }
          str1 = localJSONObject.getString("long_name").toString();
          paramString2 = paramString1;
          continue;
        }
        else
        {
          Log.e("payeco", "GPS fail");
          return null;
        }
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        return null;
      }
      label250:
      while (i1 >= i2)
      {
        return null;
        label259:
        i1 += 1;
        paramString1 = paramString2;
      }
    }
  }
  
  private void b()
  {
    this.m = false;
    this.E.initLayout(this.c, this.G, this.I, "2", this.a.getIdentifier("payeco_plugin_step_2", "string", this.b));
    this.k.setVisibility(0);
    this.l.setVisibility(8);
    this.r = ((EditText)findViewById(this.a.getIdentifier("payeco_new_pay_pan_edit", "id", this.b)));
    String str = this.g.getSupportPanType();
    if ("14".equals(str)) {
      this.r.setHint(this.a.getIdentifier("payeco_pay_debit_hint", "string", this.b));
    }
    for (;;)
    {
      this.r.addTextChangedListener(new EditTextGroupWatch(4));
      this.D.setText(this.a.getIdentifier("payeco_next", "string", this.b));
      return;
      if ("21".equals(str)) {
        this.r.setHint(this.a.getIdentifier("payeco_pay_credit_hint", "string", this.b));
      }
    }
  }
  
  private void c()
  {
    if (this.w != null)
    {
      this.u.removeUpdates(this.w);
      this.w = null;
    }
    if (this.x != null)
    {
      this.u.removeUpdates(this.x);
      this.x = null;
    }
  }
  
  public void doCallBack(PluginObject paramPluginObject)
  {
    switch (this.f)
    {
    default: 
      return;
    case 0: 
      if (paramPluginObject != null)
      {
        this.g = ((CheckOrder)paramPluginObject);
        if ("0000".equals(this.g.getRespCode()))
        {
          this.e.sendEmptyMessage(0);
          return;
        }
        this.e.sendEmptyMessage(1);
        return;
      }
      this.e.sendEmptyMessage(1);
      return;
    }
    if (paramPluginObject != null)
    {
      this.h = ((CommonPayValidation)paramPluginObject);
      paramPluginObject = this.h.getRespCode();
      if ("0000".equals(paramPluginObject))
      {
        this.e.sendEmptyMessage(2);
        return;
      }
      if (PayecoConstant.PAYECO_PLUGIN_PAY_RISKCONTROL.equals(paramPluginObject))
      {
        this.e.sendEmptyMessage(3);
        return;
      }
      this.e.sendEmptyMessage(4);
      return;
    }
    this.e.sendEmptyMessage(4);
  }
  
  public void doCallBack(Exception paramException)
  {
    switch (this.f)
    {
    default: 
      return;
    case 0: 
      this.e.sendEmptyMessage(1);
      return;
    }
    this.e.sendEmptyMessage(4);
  }
  
  public void onBackPressed()
  {
    PayecoPluginApplication localPayecoPluginApplication = PayecoPluginApplication.getInstance();
    UpPay localUpPay1 = localPayecoPluginApplication.getmUpPay();
    UpPay localUpPay2 = new UpPay();
    localUpPay2.setApplication("upPay.Rsp");
    localUpPay2.setMerchantId(localUpPay1.getMerchantId());
    localUpPay2.setMerchantOrderId(localUpPay1.getMerchantOrderId());
    localUpPay2.setMerchantOrderAmt(localUpPay1.getMerchantOrderAmt());
    localUpPay2.setMerchantOrderTime(localUpPay1.getMerchantOrderTime());
    localUpPay2.setRespCode("0002");
    localUpPay2.setRespDesc(this.a.getString(this.a.getIdentifier("payeco_plugin_pay_cancel", "string", this.b)));
    localPayecoPluginApplication.payEnd(this, "0", XmlTool.objectToXml(localUpPay2));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    this.b = getPackageName();
    setContentView(this.a.getIdentifier("payeco_plugin_order_detail", "layout", this.b));
    this.c = this;
    this.u = ((LocationManager)this.c.getSystemService("location"));
    PayecoPluginApplication.getInstance().addActivity(this.c);
    this.d = ((UpPay)getIntent().getSerializableExtra("upPay"));
    this.A = PayecoBaseUtil.getIMSI(this.c);
    paramBundle = PayecoBaseUtil.getLocalMacAddress(this.c);
    if (!TextUtils.isEmpty(paramBundle)) {
      this.C = paramBundle.toUpperCase();
    }
    paramBundle = (PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_first", "id", this.b));
    this.F = this.a.getIdentifier("payeco_plugin_solidyellow", "drawable", this.b);
    this.G = this.a.getIdentifier("payeco_plugin_solidgray", "drawable", this.b);
    this.H = this.a.getIdentifier("payeco_textColorYellow", "color", this.b);
    this.I = this.a.getIdentifier("payeco_textColorGrayTwo", "color", this.b);
    paramBundle.initLayout(this.c, this.F, this.H, "1", this.a.getIdentifier("payeco_plugin_step_1", "string", this.b));
    this.E = ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_second", "id", this.b)));
    this.E.initLayout(this.c, this.G, this.I, "2", this.a.getIdentifier("payeco_plugin_step_2", "string", this.b));
    ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_third", "id", this.b))).initLayout(this.c, this.G, this.I, "3", this.a.getIdentifier("payeco_plugin_step_3", "string", this.b));
    if (this.d != null)
    {
      if (!((WifiManager)this.c.getSystemService("wifi")).isWifiEnabled()) {
        break label967;
      }
      Log.e("payeco", "WIFI is enabled");
    }
    label932:
    label962:
    label967:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 == 0)
      {
        paramBundle = (TelephonyManager)this.c.getSystemService("phone");
        if ((paramBundle == null) || (paramBundle.getNetworkType() == 0)) {
          break label962;
        }
        Log.e("payeco", "Telephony is enabled");
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == 0)
        {
          i1 = 0;
          if (i1 != 0) {
            break label932;
          }
          Toast.makeText(this.c, getString(this.a.getIdentifier("payeco_networkError", "string", this.b)), 0).show();
        }
        for (;;)
        {
          paramBundle = (TextView)findViewById(this.a.getIdentifier("payeco_orderDetail_orderAmt_edit", "id", this.b));
          paramBundle.getPaint().setFakeBoldText(true);
          Object localObject = this.d.getMerchantOrderAmt();
          paramBundle.setText(getString(this.a.getIdentifier("payeco_amount", "string", this.b), new Object[] { PayecoBaseUtil.fomatAmount((String)localObject) }));
          ((TextView)findViewById(this.a.getIdentifier("payeco_orderDetail_orderId_edit", "id", this.b))).setText(this.d.getMerchantOrderId());
          ((TextView)findViewById(this.a.getIdentifier("payeco_orderDetail_orderDesc_edit", "id", this.b))).setText(this.d.getMerchantOrderDesc());
          this.D = ((Button)findViewById(this.a.getIdentifier("payeco_bt_to_pay", "id", this.b)));
          this.D.setOnClickListener(new d(this));
          ((Button)findViewById(this.a.getIdentifier("payeco_bt_to_cancelPay", "id", this.b))).setOnClickListener(new e(this));
          ((TextView)findViewById(this.a.getIdentifier("payeco_supportBank", "id", this.b))).setOnClickListener(new f(this));
          this.f = 0;
          paramBundle = PayecoBaseUtil.getValueFromPreferences(this.c, "payeco_mobileNum");
          localObject = new CheckOrder();
          ((CheckOrder)localObject).setImsi(this.A);
          ((CheckOrder)localObject).setMac(this.C);
          ((CheckOrder)localObject).setMobileNumber(paramBundle);
          ((CheckOrder)localObject).setMerchantName(this.d.getMerchantName());
          ((CheckOrder)localObject).setMerchantId(this.d.getMerchantId());
          ((CheckOrder)localObject).setMerchantOrderId(this.d.getMerchantOrderId());
          ((CheckOrder)localObject).setMerchantOrderTime(this.d.getMerchantOrderTime());
          ((CheckOrder)localObject).setMerchantOrderAmt(this.d.getMerchantOrderAmt());
          ((CheckOrder)localObject).setMerchantOrderDesc(this.d.getMerchantOrderDesc());
          ((CheckOrder)localObject).setTransTimeout(this.d.getTransTimeout());
          ((CheckOrder)localObject).setSign(this.d.getSign());
          ((CheckOrder)localObject).setMerchantPublicCert(this.d.getMerchantPublicCert());
          HttpAction.doPostAction(this.c, "CheckOrder.Req", (PluginObject)localObject, PayecoBaseUtil.createWaitDialog(this.c, false));
          return;
          i1 = 1;
          break;
          if (this.z == null)
          {
            this.z = new h(this, (byte)0);
            this.z.start();
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    c();
    this.c = null;
    this.d = null;
    this.g = null;
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoOrderDetailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */