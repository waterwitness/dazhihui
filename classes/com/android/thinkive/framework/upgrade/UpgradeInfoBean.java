package com.android.thinkive.framework.upgrade;

import java.util.ArrayList;

public class UpgradeInfoBean
{
  private ArrayList<String> dsName;
  private String error_info;
  private String error_no;
  private ArrayList<UpgradeInfoBean.VersionInfoBean> results;
  
  public ArrayList<String> getDsName()
  {
    return this.dsName;
  }
  
  public String getError_info()
  {
    return this.error_info;
  }
  
  public String getError_no()
  {
    return this.error_no;
  }
  
  public ArrayList<UpgradeInfoBean.VersionInfoBean> getResults()
  {
    return this.results;
  }
  
  public void setDsName(ArrayList<String> paramArrayList)
  {
    this.dsName = paramArrayList;
  }
  
  public void setError_info(String paramString)
  {
    this.error_info = paramString;
  }
  
  public void setError_no(String paramString)
  {
    this.error_no = paramString;
  }
  
  public void setResults(ArrayList<UpgradeInfoBean.VersionInfoBean> paramArrayList)
  {
    this.results = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeInfoBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */