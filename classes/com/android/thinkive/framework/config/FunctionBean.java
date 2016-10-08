package com.android.thinkive.framework.config;

import java.util.ArrayList;

public class FunctionBean
{
  private String byteFuncNo;
  private String description;
  private ArrayList<FunctionBean.InputBean> inputs;
  private boolean isStockIndex;
  private String jsonFuncNo;
  private int mode;
  private ArrayList<FunctionBean.OutPutBean> outPuts;
  private ArrayList<FunctionBean.OutSetBean> outsets;
  
  public String getByteFuncNo()
  {
    return this.byteFuncNo;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public ArrayList<FunctionBean.InputBean> getInputs()
  {
    return this.inputs;
  }
  
  public String getJsonFuncNo()
  {
    return this.jsonFuncNo;
  }
  
  public int getMode()
  {
    return this.mode;
  }
  
  public ArrayList<FunctionBean.OutPutBean> getOutPuts()
  {
    return this.outPuts;
  }
  
  public ArrayList<FunctionBean.OutSetBean> getOutsets()
  {
    return this.outsets;
  }
  
  public boolean isStockIndex()
  {
    return this.isStockIndex;
  }
  
  public void setByteFuncNo(String paramString)
  {
    this.byteFuncNo = paramString;
  }
  
  public void setDescription(String paramString)
  {
    this.description = paramString;
  }
  
  public void setInputs(ArrayList<FunctionBean.InputBean> paramArrayList)
  {
    this.inputs = paramArrayList;
  }
  
  public void setIsStockIndex(boolean paramBoolean)
  {
    this.isStockIndex = paramBoolean;
  }
  
  public void setJsonFuncNo(String paramString)
  {
    this.jsonFuncNo = paramString;
  }
  
  public void setMode(int paramInt)
  {
    this.mode = paramInt;
  }
  
  public void setOutPuts(ArrayList<FunctionBean.OutPutBean> paramArrayList)
  {
    this.outPuts = paramArrayList;
  }
  
  public void setOutsets(ArrayList<FunctionBean.OutSetBean> paramArrayList)
  {
    this.outsets = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\config\FunctionBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */