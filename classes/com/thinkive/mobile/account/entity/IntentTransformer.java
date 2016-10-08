package com.thinkive.mobile.account.entity;

import android.text.TextUtils;
import bq;
import com.android.thinkive.framework.compatible.Parameter;
import java.io.Serializable;
import java.util.HashMap;

public class IntentTransformer
  implements Serializable
{
  private static final long serialVersionUID = -2194691698337827632L;
  private String action;
  private String autenticationType;
  private String clientInfo;
  private String currentImageType;
  private String customId;
  private String filename;
  private String frontResult;
  private String funcNo;
  private String funcNum;
  private String imgType;
  private String isBack;
  private String jsessionId;
  private String key;
  private String longestTime;
  private String md5;
  private String mobile_no;
  private String moduleName;
  private String netWorkStatus;
  private String orgId;
  private String photoType;
  private String r;
  private String requestParam;
  private int seatId;
  private String securitiesName;
  private String shortestTime;
  private String url;
  private String userId;
  private String userName;
  private String userType;
  private String uuid;
  
  public Parameter createParameter()
  {
    Parameter localParameter = new Parameter();
    localParameter.addParameter("uuid", this.uuid);
    localParameter.addParameter("user_id", this.userId);
    localParameter.addParameter("r", this.r);
    localParameter.addParameter("signMsg", getMd5());
    localParameter.addParameter("img_type", this.currentImageType);
    localParameter.addParameter("url", this.url);
    localParameter.addParameter("clientinfo", this.clientInfo);
    localParameter.addParameter("jsessionid", this.jsessionId);
    localParameter.addParameter("funcNo", this.funcNum);
    localParameter.addParameter("isBack", this.isBack);
    return localParameter;
  }
  
  public HashMap<String, String> createParameterMap()
  {
    int i = 0;
    localHashMap = new HashMap();
    localHashMap.put("url", this.url);
    try
    {
      if (!TextUtils.isEmpty(this.requestParam))
      {
        String[] arrayOfString1 = this.requestParam.split("&");
        for (;;)
        {
          if (i >= arrayOfString1.length) {
            return localHashMap;
          }
          String[] arrayOfString2 = arrayOfString1[i].split("=");
          localHashMap.put(arrayOfString2[0], arrayOfString2[1]);
          i += 1;
        }
      }
      return localHashMap;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public String getAction()
  {
    return this.action;
  }
  
  public String getAutenticationType()
  {
    return this.autenticationType;
  }
  
  public String getClientInfo()
  {
    return this.clientInfo;
  }
  
  public String getCurrentImageType()
  {
    return this.currentImageType;
  }
  
  public String getCustomId()
  {
    return this.customId;
  }
  
  public String getFilename()
  {
    return this.filename;
  }
  
  public String getFrontResult()
  {
    return this.frontResult;
  }
  
  public String getFuncNo()
  {
    return this.funcNo;
  }
  
  public String getFuncNum()
  {
    return this.funcNum;
  }
  
  public String getImgType()
  {
    return this.imgType;
  }
  
  public String getIsBack()
  {
    return this.isBack;
  }
  
  public String getJsessionId()
  {
    return this.jsessionId;
  }
  
  public String getKey()
  {
    return this.key;
  }
  
  public String getLongestTime()
  {
    return this.longestTime;
  }
  
  public String getMd5()
  {
    this.md5 = bq.a(this.r, this.key);
    return this.md5;
  }
  
  public String getMobile_no()
  {
    return this.mobile_no;
  }
  
  public String getModuleName()
  {
    return this.moduleName;
  }
  
  public String getNetWorkStatus()
  {
    return this.netWorkStatus;
  }
  
  public String getOrgId()
  {
    return this.orgId;
  }
  
  public String getPhotoType()
  {
    return this.photoType;
  }
  
  public String getR()
  {
    return this.r;
  }
  
  public String getRequestParam()
  {
    return this.requestParam;
  }
  
  public int getSeatId()
  {
    return this.seatId;
  }
  
  public String getSecuritiesName()
  {
    return this.securitiesName;
  }
  
  public String getShortestTime()
  {
    return this.shortestTime;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String getUserId()
  {
    return this.userId;
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public String getUserType()
  {
    return this.userType;
  }
  
  public String getUuid()
  {
    return this.uuid;
  }
  
  public void setAction(String paramString)
  {
    this.action = paramString;
  }
  
  public void setAutenticationType(String paramString)
  {
    this.autenticationType = paramString;
  }
  
  public void setClientInfo(String paramString)
  {
    this.clientInfo = paramString;
  }
  
  public void setCurrentImageType(String paramString)
  {
    this.currentImageType = paramString;
  }
  
  public void setCustomId(String paramString)
  {
    this.customId = paramString;
  }
  
  public void setFilename(String paramString)
  {
    this.filename = paramString;
  }
  
  public void setFrontResult(String paramString)
  {
    this.frontResult = paramString;
  }
  
  public void setFuncNo(String paramString)
  {
    this.funcNo = paramString;
  }
  
  public void setFuncNum(String paramString)
  {
    this.funcNum = paramString;
  }
  
  public void setImgType(String paramString)
  {
    this.imgType = paramString;
  }
  
  public void setIsBack(String paramString)
  {
    this.isBack = paramString;
  }
  
  public void setJsessionId(String paramString)
  {
    this.jsessionId = paramString;
  }
  
  public void setKey(String paramString)
  {
    this.key = paramString;
  }
  
  public void setLongestTime(String paramString)
  {
    this.longestTime = paramString;
  }
  
  public void setMd5(String paramString)
  {
    this.md5 = paramString;
  }
  
  public void setMobile_no(String paramString)
  {
    this.mobile_no = paramString;
  }
  
  public void setModuleName(String paramString)
  {
    this.moduleName = paramString;
  }
  
  public void setNetWorkStatus(String paramString)
  {
    this.netWorkStatus = paramString;
  }
  
  public void setOrgId(String paramString)
  {
    this.orgId = paramString;
  }
  
  public void setPhotoType(String paramString)
  {
    this.photoType = paramString;
  }
  
  public void setR(String paramString)
  {
    this.r = paramString;
  }
  
  public void setRequestParam(String paramString)
  {
    this.requestParam = paramString;
  }
  
  public void setSeatId(int paramInt)
  {
    this.seatId = paramInt;
  }
  
  public void setSecuritiesName(String paramString)
  {
    this.securitiesName = paramString;
  }
  
  public void setShortestTime(String paramString)
  {
    this.shortestTime = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public void setUserId(String paramString)
  {
    this.userId = paramString;
  }
  
  public void setUserName(String paramString)
  {
    this.userName = paramString;
  }
  
  public void setUserType(String paramString)
  {
    this.userType = paramString;
  }
  
  public void setUuid(String paramString)
  {
    this.uuid = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\entity\IntentTransformer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */