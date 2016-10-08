package com.tencent.av;

import java.util.ArrayList;
import java.util.List;

public class TIMAvManager$RecordParam
{
  int classId;
  String filename;
  boolean isScreenShot = false;
  boolean isTransCode = false;
  boolean isWaterMark = false;
  TIMAvManager.SDKType sdktype = TIMAvManager.SDKType.Normal;
  TIMAvManager.ʻ stype = TIMAvManager.ʻ.a;
  List<String> tags = new ArrayList();
  
  public TIMAvManager$RecordParam(TIMAvManager paramTIMAvManager) {}
  
  private void setSourceType(TIMAvManager.ʻ paramʻ)
  {
    this.stype = paramʻ;
  }
  
  public void addTag(String paramString)
  {
    this.tags.add(paramString);
  }
  
  public int classId()
  {
    return this.classId;
  }
  
  public String filename()
  {
    return this.filename;
  }
  
  public TIMAvManager.SDKType getSdkType()
  {
    return this.sdktype;
  }
  
  public boolean isScreenShot()
  {
    return this.isScreenShot;
  }
  
  public boolean isTransCode()
  {
    return this.isTransCode;
  }
  
  public boolean isWaterMark()
  {
    return this.isWaterMark;
  }
  
  public void setClassId(int paramInt)
  {
    this.classId = paramInt;
  }
  
  public void setFilename(String paramString)
  {
    this.filename = paramString;
  }
  
  public void setSdkType(TIMAvManager.SDKType paramSDKType)
  {
    this.sdktype = paramSDKType;
  }
  
  public void setSreenShot(boolean paramBoolean)
  {
    this.isScreenShot = paramBoolean;
  }
  
  public void setTransCode(boolean paramBoolean)
  {
    this.isTransCode = paramBoolean;
  }
  
  public void setWaterMark(boolean paramBoolean)
  {
    this.isWaterMark = paramBoolean;
  }
  
  public List<String> tags()
  {
    return this.tags;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\TIMAvManager$RecordParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */