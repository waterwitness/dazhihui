package com.thinkive.mobile.account.entity;

import android.text.TextUtils;
import com.c.a.a.b;
import java.io.Serializable;

public class IdentityCard
  implements Serializable
{
  private static final long serialVersionUID = 5177514595834505982L;
  private String birthday;
  private String custname;
  private String ethnicname;
  private String filepath;
  private String idbegindate;
  private String idenddate;
  private String idno;
  @b(a="native")
  private String nativeAdress;
  private String policeimagepath;
  private String policeorg;
  private String policesecret;
  private String secret;
  
  public String getBirthday()
  {
    return this.birthday;
  }
  
  public String getCustname()
  {
    return this.custname;
  }
  
  public String getEthnicname()
  {
    return this.ethnicname;
  }
  
  public String getFilepath()
  {
    return this.filepath;
  }
  
  public String getIdbegindate()
  {
    return this.idbegindate;
  }
  
  public String getIdenddate()
  {
    return this.idenddate;
  }
  
  public String getIdno()
  {
    return this.idno;
  }
  
  public String getNativeAdress()
  {
    return this.nativeAdress;
  }
  
  public String getPoliceimagepath()
  {
    return this.policeimagepath;
  }
  
  public String getPoliceorg()
  {
    return this.policeorg;
  }
  
  public String getPolicesecret()
  {
    return this.policesecret;
  }
  
  public String getSecret()
  {
    return this.secret;
  }
  
  public void setBirthday(String paramString)
  {
    this.birthday = paramString;
  }
  
  public void setCustname(String paramString)
  {
    this.custname = paramString;
  }
  
  public void setEthnicname(String paramString)
  {
    this.ethnicname = paramString;
  }
  
  public void setFilepath(String paramString)
  {
    this.filepath = paramString;
  }
  
  public void setIdbegindate(String paramString)
  {
    this.idbegindate = paramString;
  }
  
  public void setIdenddate(String paramString)
  {
    this.idenddate = paramString;
  }
  
  public void setIdno(String paramString)
  {
    this.idno = paramString;
  }
  
  public void setNativeAdress(String paramString)
  {
    this.nativeAdress = paramString;
  }
  
  public void setPoliceimagepath(String paramString)
  {
    this.policeimagepath = paramString;
  }
  
  public void setPoliceorg(String paramString)
  {
    this.policeorg = paramString;
  }
  
  public void setPolicesecret(String paramString)
  {
    this.policesecret = paramString;
  }
  
  public void setSecret(String paramString)
  {
    this.secret = paramString;
  }
  
  public boolean validateBack()
  {
    return (!TextUtils.isEmpty(this.idbegindate)) && (!TextUtils.isEmpty(this.idenddate)) && (!TextUtils.isEmpty(this.policeorg));
  }
  
  public boolean validateFront()
  {
    return (!TextUtils.isEmpty(this.idno)) && (!TextUtils.isEmpty(this.custname)) && (!TextUtils.isEmpty(this.nativeAdress)) && (!TextUtils.isEmpty(this.birthday));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\entity\IdentityCard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */