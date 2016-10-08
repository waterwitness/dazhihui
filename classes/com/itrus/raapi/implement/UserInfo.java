package com.itrus.raapi.implement;

import java.io.Serializable;
import java.util.Hashtable;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class UserInfo
  implements Serializable, KvmSerializable
{
  public static Class<UserInfo> UserInfo_CLASS = UserInfo.class;
  private static final long serialVersionUID = 6224773662016085885L;
  protected String userAdditionalField1;
  protected String userAdditionalField10;
  protected String userAdditionalField2;
  protected String userAdditionalField3;
  protected String userAdditionalField4;
  protected String userAdditionalField5;
  protected String userAdditionalField6;
  protected String userAdditionalField7;
  protected String userAdditionalField8;
  protected String userAdditionalField9;
  protected String userCountry;
  protected String userDescription;
  protected String userDns;
  protected String userEmail;
  protected String userIp;
  protected String userLocality;
  protected String userName;
  protected String userOrganization;
  protected String userOrgunit;
  protected String userSerialnumber;
  protected String userState;
  protected String userStreet;
  protected String userSurname;
  protected String userTitle;
  
  public Object getProperty(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return this.userName;
    case 1: 
      return this.userSurname;
    case 2: 
      return this.userSerialnumber;
    case 3: 
      return this.userEmail;
    case 4: 
      return this.userOrganization;
    case 5: 
      return this.userOrgunit;
    case 6: 
      return this.userCountry;
    case 7: 
      return this.userState;
    case 8: 
      return this.userLocality;
    case 9: 
      return this.userStreet;
    case 10: 
      return this.userDns;
    case 11: 
      return this.userIp;
    case 12: 
      return this.userTitle;
    case 13: 
      return this.userDescription;
    case 14: 
      return this.userAdditionalField1;
    case 15: 
      return this.userAdditionalField2;
    case 16: 
      return this.userAdditionalField3;
    case 17: 
      return this.userAdditionalField4;
    case 18: 
      return this.userAdditionalField5;
    case 19: 
      return this.userAdditionalField6;
    case 20: 
      return this.userAdditionalField7;
    case 21: 
      return this.userAdditionalField8;
    case 22: 
      return this.userAdditionalField9;
    }
    return this.userAdditionalField10;
  }
  
  public int getPropertyCount()
  {
    return 24;
  }
  
  public void getPropertyInfo(int paramInt, Hashtable paramHashtable, PropertyInfo paramPropertyInfo)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramPropertyInfo.name = "userName";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 1: 
      paramPropertyInfo.name = "userSurname";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 2: 
      paramPropertyInfo.name = "userSerialnumber";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 3: 
      paramPropertyInfo.name = "userEmail";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 4: 
      paramPropertyInfo.name = "userOrganization";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 5: 
      paramPropertyInfo.name = "userOrgunit";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 6: 
      paramPropertyInfo.name = "userCountry";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 7: 
      paramPropertyInfo.name = "userState";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 8: 
      paramPropertyInfo.name = "userLocality";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 9: 
      paramPropertyInfo.name = "userStreet";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 10: 
      paramPropertyInfo.name = "userDns";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 11: 
      paramPropertyInfo.name = "userIp";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 12: 
      paramPropertyInfo.name = "userTitle";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 13: 
      paramPropertyInfo.name = "userDescription";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 14: 
      paramPropertyInfo.name = "userAdditionalField1";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 15: 
      paramPropertyInfo.name = "userAdditionalField2";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 16: 
      paramPropertyInfo.name = "userAdditionalField3";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 17: 
      paramPropertyInfo.name = "userAdditionalField4";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 18: 
      paramPropertyInfo.name = "userAdditionalField5";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 19: 
      paramPropertyInfo.name = "userAdditionalField6";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 20: 
      paramPropertyInfo.name = "userAdditionalField7";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 21: 
      paramPropertyInfo.name = "userAdditionalField8";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 22: 
      paramPropertyInfo.name = "userAdditionalField9";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    }
    paramPropertyInfo.name = "userAdditionalField10";
    paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
  }
  
  public String getUserAdditionalField1()
  {
    return this.userAdditionalField1;
  }
  
  public String getUserAdditionalField10()
  {
    return this.userAdditionalField10;
  }
  
  public String getUserAdditionalField2()
  {
    return this.userAdditionalField2;
  }
  
  public String getUserAdditionalField3()
  {
    return this.userAdditionalField3;
  }
  
  public String getUserAdditionalField4()
  {
    return this.userAdditionalField4;
  }
  
  public String getUserAdditionalField5()
  {
    return this.userAdditionalField5;
  }
  
  public String getUserAdditionalField6()
  {
    return this.userAdditionalField6;
  }
  
  public String getUserAdditionalField7()
  {
    return this.userAdditionalField7;
  }
  
  public String getUserAdditionalField8()
  {
    return this.userAdditionalField8;
  }
  
  public String getUserAdditionalField9()
  {
    return this.userAdditionalField9;
  }
  
  public String getUserCountry()
  {
    return this.userCountry;
  }
  
  public String getUserDescription()
  {
    return this.userDescription;
  }
  
  public String getUserDns()
  {
    return this.userDns;
  }
  
  public String getUserEmail()
  {
    return this.userEmail;
  }
  
  public String getUserIp()
  {
    return this.userIp;
  }
  
  public String getUserLocality()
  {
    return this.userLocality;
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public String getUserOrganization()
  {
    return this.userOrganization;
  }
  
  public String getUserOrgunit()
  {
    return this.userOrgunit;
  }
  
  public String getUserSerialnumber()
  {
    return this.userSerialnumber;
  }
  
  public String getUserState()
  {
    return this.userState;
  }
  
  public String getUserStreet()
  {
    return this.userStreet;
  }
  
  public String getUserSurname()
  {
    return this.userSurname;
  }
  
  public String getUserTitle()
  {
    return this.userTitle;
  }
  
  public void setProperty(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.userName = paramObject.toString();
      return;
    case 1: 
      this.userSurname = paramObject.toString();
      return;
    case 2: 
      this.userSerialnumber = paramObject.toString();
      return;
    case 3: 
      this.userEmail = paramObject.toString();
      return;
    case 4: 
      this.userOrganization = paramObject.toString();
      return;
    case 5: 
      this.userOrgunit = paramObject.toString();
      return;
    case 6: 
      this.userCountry = paramObject.toString();
      return;
    case 7: 
      this.userState = paramObject.toString();
      return;
    case 8: 
      this.userLocality = paramObject.toString();
      return;
    case 9: 
      this.userStreet = paramObject.toString();
      return;
    case 10: 
      this.userDns = paramObject.toString();
      return;
    case 11: 
      this.userIp = paramObject.toString();
      return;
    case 12: 
      this.userTitle = paramObject.toString();
      return;
    case 13: 
      this.userDescription = paramObject.toString();
      return;
    case 14: 
      this.userAdditionalField1 = paramObject.toString();
      return;
    case 15: 
      this.userAdditionalField2 = paramObject.toString();
      return;
    case 16: 
      this.userAdditionalField3 = paramObject.toString();
      return;
    case 17: 
      this.userAdditionalField4 = paramObject.toString();
      return;
    case 18: 
      this.userAdditionalField5 = paramObject.toString();
      return;
    case 19: 
      this.userAdditionalField6 = paramObject.toString();
      return;
    case 20: 
      this.userAdditionalField7 = paramObject.toString();
      return;
    case 21: 
      this.userAdditionalField8 = paramObject.toString();
      return;
    case 22: 
      this.userAdditionalField9 = paramObject.toString();
      return;
    }
    this.userAdditionalField10 = paramObject.toString();
  }
  
  public void setUserAdditionalField1(String paramString)
  {
    this.userAdditionalField1 = paramString;
  }
  
  public void setUserAdditionalField10(String paramString)
  {
    this.userAdditionalField10 = paramString;
  }
  
  public void setUserAdditionalField2(String paramString)
  {
    this.userAdditionalField2 = paramString;
  }
  
  public void setUserAdditionalField3(String paramString)
  {
    this.userAdditionalField3 = paramString;
  }
  
  public void setUserAdditionalField4(String paramString)
  {
    this.userAdditionalField4 = paramString;
  }
  
  public void setUserAdditionalField5(String paramString)
  {
    this.userAdditionalField5 = paramString;
  }
  
  public void setUserAdditionalField6(String paramString)
  {
    this.userAdditionalField6 = paramString;
  }
  
  public void setUserAdditionalField7(String paramString)
  {
    this.userAdditionalField7 = paramString;
  }
  
  public void setUserAdditionalField8(String paramString)
  {
    this.userAdditionalField8 = paramString;
  }
  
  public void setUserAdditionalField9(String paramString)
  {
    this.userAdditionalField9 = paramString;
  }
  
  public void setUserCountry(String paramString)
  {
    this.userCountry = paramString;
  }
  
  public void setUserDescription(String paramString)
  {
    this.userDescription = paramString;
  }
  
  public void setUserDns(String paramString)
  {
    this.userDns = paramString;
  }
  
  public void setUserEmail(String paramString)
  {
    this.userEmail = paramString;
  }
  
  public void setUserIp(String paramString)
  {
    this.userIp = paramString;
  }
  
  public void setUserLocality(String paramString)
  {
    this.userLocality = paramString;
  }
  
  public void setUserName(String paramString)
  {
    this.userName = paramString;
  }
  
  public void setUserOrganization(String paramString)
  {
    this.userOrganization = paramString;
  }
  
  public void setUserOrgunit(String paramString)
  {
    this.userOrgunit = paramString;
  }
  
  public void setUserSerialnumber(String paramString)
  {
    this.userSerialnumber = paramString;
  }
  
  public void setUserState(String paramString)
  {
    this.userState = paramString;
  }
  
  public void setUserStreet(String paramString)
  {
    this.userStreet = paramString;
  }
  
  public void setUserSurname(String paramString)
  {
    this.userSurname = paramString;
  }
  
  public void setUserTitle(String paramString)
  {
    this.userTitle = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\UserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */