package com.android.thinkive.framework.config;

import java.util.ArrayList;
import java.util.HashMap;

public class QuotationConfigBean
{
  private HashMap<String, FieldBean> mFieldMap = new HashMap();
  private HashMap<String, FunctionBean> mFunctionMap = new HashMap();
  private ArrayList<TypeBean> mTypeBeanList = new ArrayList();
  
  public void addTypeBean(TypeBean paramTypeBean)
  {
    if (!this.mTypeBeanList.contains(paramTypeBean)) {
      this.mTypeBeanList.add(paramTypeBean);
    }
  }
  
  public FieldBean getFieldBean(String paramString)
  {
    return (FieldBean)this.mFieldMap.get(paramString);
  }
  
  public FunctionBean getFunctionBean(String paramString)
  {
    return (FunctionBean)this.mFunctionMap.get(paramString);
  }
  
  public ArrayList<TypeBean> getTypeBeanList()
  {
    return this.mTypeBeanList;
  }
  
  public void putFieldBean(String paramString, FieldBean paramFieldBean)
  {
    this.mFieldMap.put(paramString, paramFieldBean);
  }
  
  public void putFunctionBean(String paramString, FunctionBean paramFunctionBean)
  {
    this.mFunctionMap.put(paramString, paramFunctionBean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\config\QuotationConfigBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */