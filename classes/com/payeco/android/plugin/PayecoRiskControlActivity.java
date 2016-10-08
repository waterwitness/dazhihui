package com.payeco.android.plugin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.payeco.android.plugin.http.encryption.MD5;
import com.payeco.android.plugin.http.objects.CommonPay;
import com.payeco.android.plugin.http.objects.CommonPayValidation;
import com.payeco.android.plugin.http.objects.PluginObject;
import com.payeco.android.plugin.http.objects.RiskControl;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;
import com.payeco.android.plugin.util.ImageUtil;
import com.payeco.android.plugin.util.NewRiskControlTool;
import com.payeco.android.plugin.util.PayecoKeyBoard;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PayecoRiskControlActivity
  extends PayecoBasicActivity
{
  protected static final String USERTAG_2 = "02";
  private Button D;
  private Resources a;
  private boolean aA;
  private Bitmap aB;
  private EditText aC;
  private Spinner aD;
  private EditText aE;
  private Spinner aF;
  private Spinner aG;
  private EditText aH;
  private EditText aI;
  private EditText aJ;
  private EditText aK;
  private EditText aL;
  private EditText aM;
  private Button aN;
  private Map aO;
  private boolean aP = false;
  private boolean aQ = true;
  private String aR;
  private Map aS;
  private Button aT;
  private ImageButton aU;
  private ImageView aV;
  private boolean aW = true;
  private boolean aX = false;
  private String aY;
  private Button aZ;
  private PayecoRiskControlActivity ag;
  private String ah = null;
  private Map ai;
  private CommonPayValidation aj;
  private CommonPayValidation ak;
  private List al = new ArrayList();
  private String am;
  private String an;
  private String ao;
  private RelativeLayout ap;
  private Button aq;
  private String ar;
  private LinearLayout as;
  private Button at;
  private String au;
  private String av;
  private String aw;
  private String ax;
  private RelativeLayout ay;
  private LinearLayout az;
  private String b;
  private boolean ba = false;
  private ProgressDialog bb;
  private Handler e = new K(this);
  private int f = -1;
  private CommonPayValidation h;
  private CommonPay i;
  protected PayecoKeyBoard mKeyboard;
  protected ImageView mPhotoThumbnailView;
  private TextView p;
  private String t;
  
  private void a(RiskControl paramRiskControl, boolean paramBoolean)
  {
    if ("0".equals(paramRiskControl.getItemId())) {
      if (paramBoolean)
      {
        findViewById(this.a.getIdentifier("payeco_rcUserNameInputLayout1", "id", this.b)).setVisibility(0);
        this.aC = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_userName_edit1", "id", this.b)));
        this.aC.setHint(paramRiskControl.getTips());
      }
    }
    for (;;)
    {
      return;
      findViewById(this.a.getIdentifier("payeco_rcUserNameInputLayout2", "id", this.b)).setVisibility(0);
      this.aC = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_userName_edit2", "id", this.b)));
      break;
      if ("1".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcIdNumInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aE = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_idNum_edit1", "id", this.b)));; this.aE = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_idNum_edit2", "id", this.b))))
        {
          this.aE.setHint(paramRiskControl.getTips());
          return;
          findViewById(this.a.getIdentifier("payeco_rcIdNumInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("2".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean)
        {
          findViewById(this.a.getIdentifier("payeco_rcBankAddrInputLayout1", "id", this.b)).setVisibility(0);
          this.aF = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_province_spinner1", "id", this.b)));
        }
        for (this.aG = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_city_spinner1", "id", this.b)));; this.aG = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_city_spinner2", "id", this.b))))
        {
          NewRiskControlTool.initBankAddrSpinner(this.ag, this.aF, this.aG);
          return;
          findViewById(this.a.getIdentifier("payeco_rcBankAddrInputLayout2", "id", this.b)).setVisibility(0);
          this.aF = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_province_spinner2", "id", this.b)));
        }
      }
      if ("3".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcIdTypeInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aD = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_idType_spinner1", "id", this.b)));; this.aD = ((Spinner)findViewById(this.a.getIdentifier("payeco_riskControl_idType_spinner2", "id", this.b))))
        {
          NewRiskControlTool.initSpinner(this.ag, this.aD, paramRiskControl);
          return;
          findViewById(this.a.getIdentifier("payeco_rcIdTypeInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("4".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcBenifitNameInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aH = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_benifitName_edit1", "id", this.b)));; this.aH = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_benifitName_edit2", "id", this.b))))
        {
          this.aH.setHint(paramRiskControl.getTips());
          return;
          findViewById(this.a.getIdentifier("payeco_rcBenifitNameInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("5".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcPhotoDescInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aI = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_photoDesc_edit1", "id", this.b)));; this.aI = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_photoDesc_edit2", "id", this.b))))
        {
          this.aI.setHint(paramRiskControl.getTips());
          return;
          findViewById(this.a.getIdentifier("payeco_rcPhotoDescInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("6".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcAddressInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aJ = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_address_edit1", "id", this.b)));; this.aJ = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_address_edit2", "id", this.b))))
        {
          this.aJ.setHint(paramRiskControl.getTips());
          return;
          findViewById(this.a.getIdentifier("payeco_rcAddressInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("7".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean)
        {
          this.aQ = false;
          this.aU = ((ImageButton)findViewById(this.a.getIdentifier("payeco_riskControl_idCardPhoto_view1", "id", this.b)));
          findViewById(this.a.getIdentifier("payeco_rcIdCardPhotoInputLayout1", "id", this.b)).setVisibility(0);
          this.aV = ((ImageView)findViewById(this.a.getIdentifier("payeco_riskControl_idCardPhoto_img1", "id", this.b)));
          this.aV.setVisibility(0);
        }
        for (;;)
        {
          this.aU.setOnClickListener(new E(this));
          return;
          this.aU = ((ImageButton)findViewById(this.a.getIdentifier("payeco_riskControl_idCardPhoto_view2", "id", this.b)));
          findViewById(this.a.getIdentifier("payeco_rcIdCardPhotoInputLayout2", "id", this.b)).setVisibility(0);
          this.aV = ((ImageView)findViewById(this.a.getIdentifier("payeco_riskControl_idCardPhoto_img2", "id", this.b)));
          this.aV.setVisibility(0);
        }
      }
      if ("8".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean) {
          findViewById(this.a.getIdentifier("payeco_rcYixiantongInputLayout1", "id", this.b)).setVisibility(0);
        }
        for (this.aK = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_yixiantong_edit1", "id", this.b)));; this.aK = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_yixiantong_edit2", "id", this.b))))
        {
          this.aK.setHint(paramRiskControl.getTips());
          return;
          findViewById(this.a.getIdentifier("payeco_rcYixiantongInputLayout2", "id", this.b)).setVisibility(0);
        }
      }
      if ("9".equals(paramRiskControl.getItemId()))
      {
        if (paramBoolean)
        {
          findViewById(this.a.getIdentifier("payeco_rcMobileInputLayout1", "id", this.b)).setVisibility(0);
          if ("sms".equals(paramRiskControl.getItemType()))
          {
            this.aQ = false;
            findViewById(this.a.getIdentifier("payeco_rcMobileMacInputLayout1", "id", this.b)).setVisibility(0);
            this.aM = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_mobileMac_edit1", "id", this.b)));
            this.aN = ((Button)findViewById(this.a.getIdentifier("payeco_riskControl_getMobileMac_bt1", "id", this.b)));
          }
        }
        while ("sms".equals(paramRiskControl.getItemType()))
        {
          this.aM.setHint(paramRiskControl.getTips());
          this.aN.setClickable(false);
          this.aN.setOnClickListener(new F(this));
          this.aO = new HashMap();
          if ((this.ai != null) && (!this.ai.isEmpty())) {
            this.aO.putAll(this.ai);
          }
          new J(this).start();
          return;
          findViewById(this.a.getIdentifier("payeco_rcMobileNumInputLayout1", "id", this.b)).setVisibility(0);
          this.aL = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_mobileNum_edit1", "id", this.b)));
          continue;
          findViewById(this.a.getIdentifier("payeco_rcMobileInputLayout2", "id", this.b)).setVisibility(0);
          if ("sms".equals(paramRiskControl.getItemType()))
          {
            findViewById(this.a.getIdentifier("payeco_rcMobileMacInputLayout2", "id", this.b)).setVisibility(0);
            this.aM = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_mobileMac_edit2", "id", this.b)));
            this.aN = ((Button)findViewById(this.a.getIdentifier("payeco_riskControl_getMobileMac_bt2", "id", this.b)));
          }
          else
          {
            findViewById(this.a.getIdentifier("payeco_rcMobileNumInputLayout2", "id", this.b)).setVisibility(0);
            this.aL = ((EditText)findViewById(this.a.getIdentifier("payeco_riskControl_mobileNum_edit2", "id", this.b)));
          }
        }
      }
    }
  }
  
  private boolean a(Map paramMap)
  {
    boolean bool3 = true;
    boolean bool1 = bool3;
    Iterator localIterator;
    boolean bool2;
    if (paramMap != null)
    {
      localIterator = paramMap.keySet().iterator();
      bool1 = true;
      if (localIterator.hasNext()) {
        break label201;
      }
      bool2 = bool1;
      label39:
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (this.aL != null)
        {
          if (PayecoBaseUtil.checkMobileNum(this.aL.getText().toString().trim())) {
            break label304;
          }
          PayecoBaseUtil.showToast(this.ag, this.a.getIdentifier("payeco_error_moblieNum", "string", this.b));
          bool1 = false;
        }
      }
      label106:
      if ((!bool1) || (this.aD == null) || (this.aD.getVisibility() != 0) || (!"01".equals(this.aD.getTag().toString()))) {
        break label310;
      }
      bool1 = bool3;
      if (!PayecoBaseUtil.checkIdNum(this.aE.getText().toString().trim()))
      {
        PayecoBaseUtil.showToast(this.ag, this.a.getIdentifier("payeco_error_idNum", "string", this.b));
        bool1 = false;
      }
    }
    return bool1;
    label201:
    Object localObject = (RiskControl)paramMap.get((String)localIterator.next());
    if ("true".equals(((RiskControl)localObject).getRequired())) {
      if (!TextUtils.isEmpty(((RiskControl)localObject).getValue())) {
        bool1 = true;
      }
    }
    for (;;)
    {
      bool2 = bool1;
      if (!bool1) {
        break label39;
      }
      break;
      localObject = getString(this.a.getIdentifier("payeco_error_riskcontrol", "string", this.b), new Object[] { ((RiskControl)localObject).getTitle() });
      PayecoBaseUtil.showToast(this.ag, (String)localObject);
      bool1 = false;
      continue;
      label304:
      bool1 = true;
      break label106;
      label310:
      return bool1;
    }
  }
  
  private void b(Map paramMap)
  {
    if ((paramMap == null) || (paramMap.isEmpty())) {}
    for (;;)
    {
      return;
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        RiskControl localRiskControl = (RiskControl)paramMap.get(str);
        if ("0".equals(str))
        {
          this.aC.setEnabled(false);
        }
        else if ("1".equals(str))
        {
          this.aE.setEnabled(false);
        }
        else if ("2".equals(str))
        {
          this.aF.setEnabled(false);
          this.aG.setEnabled(false);
        }
        else if ("3".equals(str))
        {
          this.aD.setEnabled(false);
        }
        else if ("4".equals(str))
        {
          this.aH.setEnabled(false);
        }
        else if ("5".equals(str))
        {
          this.aI.setEnabled(false);
        }
        else if ("6".equals(str))
        {
          this.aJ.setEnabled(false);
        }
        else if ("7".equals(str))
        {
          this.aU.setEnabled(false);
        }
        else if ("8".equals(str))
        {
          this.aK.setEnabled(false);
        }
        else if ("9".equals(str))
        {
          if ("sms".equals(localRiskControl.getItemType())) {
            this.aM.setEnabled(false);
          } else {
            this.aL.setEnabled(false);
          }
        }
      }
    }
  }
  
  private void c(Map paramMap)
  {
    if ((paramMap == null) || (paramMap.isEmpty())) {}
    for (;;)
    {
      return;
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        RiskControl localRiskControl = (RiskControl)paramMap.get(str);
        if ("0".equals(str))
        {
          localRiskControl.setValue(this.aC.getText().toString().trim());
        }
        else if ("1".equals(str))
        {
          localRiskControl.setValue(this.aE.getText().toString().trim());
        }
        else if ("2".equals(str))
        {
          localRiskControl.setValue(this.aF.getTag().toString() + this.aG.getTag().toString());
        }
        else if ("3".equals(str))
        {
          localRiskControl.setValue(this.aD.getTag().toString());
        }
        else if ("4".equals(str))
        {
          localRiskControl.setValue(this.aH.getText().toString().trim());
        }
        else if ("5".equals(str))
        {
          localRiskControl.setValue(this.aI.getText().toString().trim());
        }
        else if ("6".equals(str))
        {
          localRiskControl.setValue(this.aJ.getText().toString().trim());
        }
        else if ("7".equals(str))
        {
          str = ImageUtil.bitmaptoString("/payeco_plugin/idcard.jpg");
          if (!TextUtils.isEmpty(str)) {
            localRiskControl.setValue(str);
          } else {
            localRiskControl.setValue(null);
          }
        }
        else if ("8".equals(str))
        {
          localRiskControl.setValue(this.aK.getText().toString().trim());
        }
        else if ("9".equals(str))
        {
          if ("sms".equals(localRiskControl.getItemType())) {
            localRiskControl.setValue(this.aM.getText().toString().trim());
          } else {
            localRiskControl.setValue(this.aL.getText().toString().trim());
          }
        }
      }
    }
  }
  
  private void g()
  {
    this.ap = ((RelativeLayout)findViewById(this.a.getIdentifier("payeco_cqpAuthPinInputLayout", "id", this.b)));
    this.as = ((LinearLayout)findViewById(this.a.getIdentifier("payeco_creditLayout", "id", this.b)));
    Object localObject1 = this.aj.getIvrTag();
    Object localObject2 = this.aj.getUserTag();
    if ("00".equals(localObject1))
    {
      this.aA = true;
      this.az.setVisibility(8);
      this.ay.setVisibility(8);
      label103:
      if ((!"02".equals(this.aj.getUserTag())) || ("1".equals(PayecoOrderDetailActivity.mUseCqp)))
      {
        if ((this.aA) || (!"14".equals(this.t))) {
          break label318;
        }
        this.ap.setVisibility(0);
        this.as.setVisibility(8);
        localObject1 = (ScrollView)findViewById(this.a.getIdentifier("payeco_payInputLayout", "id", this.b));
        this.aq = ((Button)findViewById(this.a.getIdentifier("payeco_cqp_authPin_edit", "id", this.b)));
        this.aq.setOnFocusChangeListener(new H(this, (ScrollView)localObject1));
        this.aq.setOnClickListener(new I(this, (ScrollView)localObject1));
      }
    }
    label318:
    while ((this.aA) || (!"21".equals(this.t)))
    {
      return;
      this.aA = false;
      this.az.setVisibility(0);
      if (!"01".equals(localObject2)) {
        break;
      }
      this.ay.setVisibility(0);
      ((TextView)findViewById(this.a.getIdentifier("payeco_cqpAuth_readProtocol", "id", this.b))).setOnClickListener(new G(this));
      break label103;
    }
    this.ap.setVisibility(8);
    this.as.setVisibility(0);
    localObject1 = (TextView)findViewById(this.a.getIdentifier("payeco_credit_info", "id", this.b));
    ((TextView)localObject1).setVisibility(0);
    ((TextView)localObject1).setOnClickListener(new u(this));
    localObject1 = (ScrollView)findViewById(this.a.getIdentifier("payeco_payInputLayout", "id", this.b));
    this.at = ((Button)findViewById(this.a.getIdentifier("payeco_cqpAuth_cvn2_edit", "id", this.b)));
    this.at.setOnFocusChangeListener(new w(this, (ScrollView)localObject1));
    this.at.setOnClickListener(new x(this, (ScrollView)localObject1));
    localObject1 = (Spinner)findViewById(this.a.getIdentifier("payeco_cqpAuth_month_spinner", "id", this.b));
    localObject2 = getResources().getStringArray(this.a.getIdentifier("payeco_month", "array", this.b));
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this.ag, 17367048, (Object[])localObject2);
    localArrayAdapter.setDropDownViewResource(17367049);
    ((Spinner)localObject1).setAdapter(localArrayAdapter);
    ((Spinner)localObject1).setOnItemSelectedListener(new y(this, (String[])localObject2));
    localObject1 = (Spinner)findViewById(this.a.getIdentifier("payeco_cqpAuth_year_spinner", "id", this.b));
    int k = Calendar.getInstance().get(1);
    localObject2 = new String[10];
    int j = 0;
    for (;;)
    {
      if (j >= 10)
      {
        localArrayAdapter = new ArrayAdapter(this.ag, 17367048, (Object[])localObject2);
        localArrayAdapter.setDropDownViewResource(17367049);
        ((Spinner)localObject1).setAdapter(localArrayAdapter);
        ((Spinner)localObject1).setOnItemSelectedListener(new z(this, (String[])localObject2));
        return;
      }
      localObject2[j] = (String.valueOf(k + j) + "年");
      j += 1;
    }
  }
  
  private boolean h()
  {
    if (this.aX)
    {
      int j = 0;
      for (Object localObject2 = null;; localObject2 = localObject1)
      {
        if (j >= this.al.size()) {}
        do
        {
          if (localObject2 == null) {
            break;
          }
          try
          {
            boolean bool = MD5.MungPass(((RiskControl)localObject2).getValue()).toUpperCase().equalsIgnoreCase(this.aY);
            if (bool) {
              break;
            }
            return false;
          }
          catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
          {
            RiskControl localRiskControl;
            Object localObject1;
            localNoSuchAlgorithmException.printStackTrace();
            return false;
          }
          localRiskControl = (RiskControl)this.al.get(j);
          localObject1 = localObject2;
          if ("9".equals(localRiskControl.getItemId()))
          {
            localObject1 = localObject2;
            if ("sms".equals(localRiskControl.getItemType())) {
              localObject1 = localRiskControl;
            }
          }
          localObject2 = localObject1;
        } while (localObject1 != null);
        j += 1;
      }
    }
    return true;
  }
  
  private void i()
  {
    PayecoPluginApplication localPayecoPluginApplication = PayecoPluginApplication.getInstance();
    Object localObject = localPayecoPluginApplication.getmUpPay();
    UpPay localUpPay = new UpPay();
    localUpPay.setApplication("upPay.Rsp");
    localUpPay.setMerchantId(((UpPay)localObject).getMerchantId());
    localUpPay.setMerchantOrderId(((UpPay)localObject).getMerchantOrderId());
    localUpPay.setMerchantOrderAmt(((UpPay)localObject).getMerchantOrderAmt());
    localUpPay.setMerchantOrderTime(((UpPay)localObject).getMerchantOrderTime());
    localUpPay.setRespCode("0002");
    localUpPay.setRespDesc(this.a.getString(this.a.getIdentifier("payeco_plugin_pay_cancel", "string", this.b)));
    localObject = XmlTool.objectToXml(localUpPay);
    localPayecoPluginApplication.payEnd(this.ag, "0", (String)localObject);
  }
  
  public void doCallBack(PluginObject paramPluginObject)
  {
    super.doCallBack(paramPluginObject);
    switch (this.f)
    {
    default: 
      return;
    case 0: 
      if (paramPluginObject != null)
      {
        this.ak = ((CommonPayValidation)paramPluginObject);
        paramPluginObject = this.ak.getRespCode();
        if ("0000".equals(paramPluginObject))
        {
          this.e.sendEmptyMessage(0);
          return;
        }
        if (PayecoConstant.PAYECO_PLUGIN_PAY_RISKCONTROL.equals(paramPluginObject))
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
        this.e.sendEmptyMessage(2);
        return;
      }
      this.e.sendEmptyMessage(3);
      return;
    }
    this.e.sendEmptyMessage(3);
  }
  
  public void doCallBack(Exception paramException)
  {
    super.doCallBack(paramException);
    switch (this.f)
    {
    default: 
      return;
    case 0: 
      this.e.sendEmptyMessage(1);
      return;
    }
    this.e.sendEmptyMessage(3);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    this.mPhotoThumbnailView = this.aV;
    this.e.sendEmptyMessage(5);
    new Thread(new A(this, "/payeco_plugin/idcardtemp.jpg", "/payeco_plugin/idcard.jpg")).start();
  }
  
  public void onBackPressed()
  {
    if (this.ba)
    {
      i();
      return;
    }
    super.onBackPressed();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.mKeyboard != null)
    {
      this.mKeyboard.dismiss();
      this.mKeyboard = null;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    this.b = getPackageName();
    setContentView(this.a.getIdentifier("payeco_plugin_risk_control", "layout", this.b));
    this.ag = this;
    PayecoPluginApplication.getInstance().addActivity(this.ag);
    this.aj = ((CommonPayValidation)getIntent().getExtras().getSerializable("riskControl"));
    if (this.aj != null)
    {
      if (!"0000".equals(this.aj.getRespCode())) {
        break label738;
      }
      this.aQ = false;
      this.ah = this.aj.getMisc();
      this.ai = NewRiskControlTool.parseXmlToRiskControl(this.ah, true);
      int j = this.a.getIdentifier("payeco_plugin_solidyellow", "drawable", this.b);
      int k = this.a.getIdentifier("payeco_plugin_solidgray", "drawable", this.b);
      int m = this.a.getIdentifier("payeco_textColorYellow", "color", this.b);
      int n = this.a.getIdentifier("payeco_textColorGrayTwo", "color", this.b);
      ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_first", "id", this.b))).initLayout(this.ag, j, m, "1", this.a.getIdentifier("payeco_plugin_step_1", "string", this.b));
      ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_second", "id", this.b))).initLayout(this.ag, j, m, "2", this.a.getIdentifier("payeco_plugin_step_2", "string", this.b));
      ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_third", "id", this.b))).initLayout(this.ag, k, n, "3", this.a.getIdentifier("payeco_plugin_step_3", "string", this.b));
      this.t = this.aj.getPanType();
      this.an = this.aj.getPan();
      this.p = ((TextView)findViewById(this.a.getIdentifier("payeco_cqp_pan_edit", "id", this.b)));
      if (this.an.length() != 4) {
        break label746;
      }
      this.p.setText("** " + this.an);
      label444:
      this.ao = this.aj.getPanBank();
      if (!TextUtils.isEmpty(this.ao))
      {
        paramBundle = (TextView)findViewById(this.a.getIdentifier("payeco_bank_view", "id", this.b));
        paramBundle.setText(this.ao);
        paramBundle.setVisibility(0);
      }
      if (this.ai != null)
      {
        paramBundle = this.ai.keySet().iterator();
        label524:
        if (paramBundle.hasNext()) {
          break label764;
        }
      }
      this.aT = ((Button)findViewById(this.a.getIdentifier("payeco_bt_confirmRiskControl", "id", this.b)));
      this.aT.setOnClickListener(new B(this));
      this.D = ((Button)findViewById(this.a.getIdentifier("payeco_bt_confirmPay", "id", this.b)));
      this.D.setOnClickListener(new C(this));
      this.ay = ((RelativeLayout)findViewById(this.a.getIdentifier("payeco_cqpAuth_confirm_layout", "id", this.b)));
      this.az = ((LinearLayout)findViewById(this.a.getIdentifier("payeco_unIvrLayout", "id", this.b)));
      if (!this.aQ) {
        break label795;
      }
      this.aT.setVisibility(0);
      this.D.setVisibility(8);
    }
    for (;;)
    {
      this.aZ = ((Button)findViewById(this.a.getIdentifier("payeco_bt_cancelRiskControl", "id", this.b)));
      this.aZ.setOnClickListener(new D(this));
      return;
      label738:
      this.aQ = true;
      break;
      label746:
      this.p.setText(PayecoBaseUtil.formatString(this.an, 4));
      break label444;
      label764:
      String str = (String)paramBundle.next();
      a((RiskControl)this.ai.get(str), true);
      break label524;
      label795:
      g();
      this.aT.setVisibility(8);
      this.D.setVisibility(0);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.ag = null;
    ImageUtil.deleteFile("/payeco_plugin/idcard.jpg");
    if ((this.aB != null) && (!this.aB.isRecycled()))
    {
      this.aB.recycle();
      this.aB = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoRiskControlActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */