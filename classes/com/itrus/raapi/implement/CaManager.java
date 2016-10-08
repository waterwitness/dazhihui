package com.itrus.raapi.implement;

import android.app.Activity;
import android.text.TextUtils;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class CaManager
{
  public static final String STATE_PRE = "$OKOKOK$";
  private String accountHash = "";
  private Activity act;
  private SoapSerializationEnvelope envelope = null;
  private String nameSpace = "";
  private HttpTransportSE transport = null;
  
  public CaManager(String paramString1, String paramString2, Activity paramActivity)
  {
    this.act = paramActivity;
    if (!TextUtils.isEmpty(paramString1)) {
      this.nameSpace = paramString1;
    }
    if (!TextUtils.isEmpty(paramString2)) {
      this.accountHash = paramString2;
    }
    this.envelope = new SoapSerializationEnvelope(110);
    this.envelope.encodingStyle = "UTF-8";
    this.transport = new HttpTransportSE(paramString1);
  }
  
  public String enrollCert(String paramString1, UserInfo paramUserInfo, String paramString2, String paramString3, String paramString4)
  {
    int i;
    if (("1".equalsIgnoreCase(paramString4)) || ("passCodeMode".equalsIgnoreCase(paramString2)))
    {
      paramString4 = this.nameSpace + "/" + "enrollCertAA";
      paramString2 = "365";
      localObject = new StringBuilder("{'certValidity':'");
      if ("365" == null) {
        paramString2 = "";
      }
      paramString2 = paramString2 + "'}";
      localObject = new SoapObject(this.nameSpace, "enrollCertAA");
      PropertyInfo localPropertyInfo = new PropertyInfo();
      localPropertyInfo.setName("userInfo");
      localPropertyInfo.setType(UserInfo.class);
      localPropertyInfo.setValue(paramUserInfo);
      ((SoapObject)localObject).addProperty(localPropertyInfo);
      ((SoapObject)localObject).addProperty("certReqBuf", paramString1);
      ((SoapObject)localObject).addProperty("accountHash", this.accountHash);
      ((SoapObject)localObject).addProperty("aaCheckPoint", paramString3);
      ((SoapObject)localObject).addProperty("json", paramString2);
      this.envelope.bodyOut = localObject;
      this.envelope.setOutputSoapObject(localObject);
      try
      {
        this.transport.call(paramString4, this.envelope);
        paramUserInfo = (SoapObject)this.envelope.getResponse();
        paramString1 = "";
        i = 0;
        for (;;)
        {
          if (i >= paramUserInfo.getPropertyCount()) {
            return "$OKOKOK$" + paramString1;
          }
          paramString2 = new PropertyInfo();
          paramUserInfo.getPropertyInfo(i, paramString2);
          if (paramString2.getName().equalsIgnoreCase("certSignBuf")) {
            paramString1 = paramString2.getValue().toString();
          }
          i += 1;
        }
        paramString2 = "365";
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        return "申请证书失败，原因:" + paramString1.getMessage();
      }
    }
    paramString4 = this.nameSpace + "/" + "enrollCert";
    Object localObject = new StringBuilder("{'certValidity':'");
    if ("365" == null) {
      paramString2 = "";
    }
    paramString2 = paramString2 + "'}";
    localObject = new SoapObject(this.nameSpace, "enrollCert");
    ((SoapObject)localObject).addProperty("userInfo", paramUserInfo);
    ((SoapObject)localObject).addProperty("certReqBuf", paramString1);
    ((SoapObject)localObject).addProperty("certReqChallenge", paramString3);
    ((SoapObject)localObject).addProperty("accountHash", this.accountHash);
    ((SoapObject)localObject).addProperty("json", paramString2);
    this.envelope.bodyOut = localObject;
    this.envelope.setOutputSoapObject(localObject);
    try
    {
      this.transport.call(paramString4, this.envelope);
      paramUserInfo = (SoapObject)this.envelope.getResponse();
      paramString1 = "";
      i = 0;
      for (;;)
      {
        if (i >= paramUserInfo.getPropertyCount()) {
          return "$OKOKOK$" + paramString1;
        }
        paramString2 = new PropertyInfo();
        paramUserInfo.getPropertyInfo(i, paramString2);
        if (paramString2.getName().equalsIgnoreCase("certSignBuf")) {
          paramString1 = paramString2.getValue().toString();
        }
        i += 1;
      }
      return "申请证书失败，原因:" + paramString1.getMessage();
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public String pickupCert(String paramString1, String paramString2)
  {
    Object localObject = this.nameSpace + "/" + "pickupCert";
    SoapObject localSoapObject = new SoapObject(this.nameSpace, "pickupCert");
    localSoapObject.addProperty("certPin", paramString2);
    localSoapObject.addProperty("certReqChallenge", paramString1);
    localSoapObject.addProperty("accountHash", this.accountHash);
    localSoapObject.addProperty("json", null);
    this.envelope.bodyOut = localSoapObject;
    this.envelope.setOutputSoapObject(localSoapObject);
    try
    {
      this.transport.call((String)localObject, this.envelope);
      paramString2 = (SoapObject)this.envelope.getResponse();
      paramString1 = "";
      int i = 0;
      for (;;)
      {
        if (i >= paramString2.getPropertyCount()) {
          return "$OKOKOK$" + paramString1;
        }
        localObject = new PropertyInfo();
        paramString2.getPropertyInfo(i, (PropertyInfo)localObject);
        if (((PropertyInfo)localObject).getName().equalsIgnoreCase("certSignBuf")) {
          paramString1 = ((PropertyInfo)localObject).getValue().toString();
        }
        i += 1;
      }
      return paramString1.getMessage();
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public String renewCert(String paramString)
  {
    Object localObject1 = this.nameSpace + "/" + "renewCertAA";
    Object localObject2 = ClientForAndroid.getInstance(this.act).GetCertBuf(paramString).replaceAll("\r\n", "");
    CACertInfo localCACertInfo = new CACertInfo();
    localCACertInfo.setProperty(25, localObject2);
    localObject2 = ClientForAndroid.getInstance(this.act).GenCSRWithCertID("sony", "wusong", "wu_song@itrus.com.cn", "itrus", "r2ra", paramString).replaceAll("\r\n", "");
    paramString = ClientForAndroid.getInstance(this.act).SignMessage("LOGONDATA:" + (String)localObject2, paramString, "SHA1", 1).replaceAll("\r\n", "");
    try
    {
      paramString = "{\"PKCSINFORMATION\":\"" + paramString + "\",\"CERT_REQ_BUF\":\"" + (String)localObject2 + "\",\"certValidity\":\"" + "365" + "\"}";
      localObject2 = new SoapObject(this.nameSpace, "renewCertAA");
      ((SoapObject)localObject2).addProperty("userInfo", null);
      ((SoapObject)localObject2).addProperty("origin", localCACertInfo);
      ((SoapObject)localObject2).addProperty("accountHash", this.accountHash);
      ((SoapObject)localObject2).addProperty("aaCheckPoint", null);
      ((SoapObject)localObject2).addProperty("passCode", "password");
      ((SoapObject)localObject2).addProperty("json", paramString);
      this.envelope.bodyOut = localObject2;
      this.envelope.setOutputSoapObject(localObject2);
      this.transport.call((String)localObject1, this.envelope);
      paramString = (SoapObject)this.envelope.getResponse();
      int i = 0;
      for (;;)
      {
        if (i >= paramString.getPropertyCount()) {
          return "$OKOKOK$" + "";
        }
        localObject1 = new PropertyInfo();
        paramString.getPropertyInfo(i, (PropertyInfo)localObject1);
        if (((PropertyInfo)localObject1).getName().equalsIgnoreCase("certSignBuf")) {
          ((PropertyInfo)localObject1).getValue().toString();
        }
        i += 1;
      }
      return paramString.getMessage();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public String revokeCert(String paramString1, String paramString2, String paramString3)
  {
    String str = this.nameSpace + "/" + "revokeCert";
    SoapObject localSoapObject = new SoapObject(this.nameSpace, "revokeCert");
    localSoapObject.addProperty("serialNumber", paramString1);
    localSoapObject.addProperty("certReqChallenge", paramString3);
    localSoapObject.addProperty("certRevokeReason", paramString2);
    localSoapObject.addProperty("accountHash", this.accountHash);
    localSoapObject.addProperty("json", null);
    this.envelope.bodyOut = localSoapObject;
    this.envelope.setOutputSoapObject(localSoapObject);
    try
    {
      this.transport.call(str, this.envelope);
      paramString2 = (SoapObject)this.envelope.getResponse();
      paramString1 = "";
      int i = 0;
      for (;;)
      {
        if (i >= paramString2.getPropertyCount()) {
          return "$OKOKOK$" + paramString1;
        }
        paramString3 = new PropertyInfo();
        paramString2.getPropertyInfo(i, paramString3);
        if (paramString3.getName().equalsIgnoreCase("certSignBuf")) {
          paramString1 = paramString3.getValue().toString();
        }
        i += 1;
      }
      return paramString1.getMessage();
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\CaManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */