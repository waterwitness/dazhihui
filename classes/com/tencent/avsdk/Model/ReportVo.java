package com.tencent.avsdk.Model;

import com.c.a.k;

public class ReportVo
{
  public int Counter;
  public ReportVo.DataMsg Data;
  public int Err = -1;
  public String Qid;
  
  public void parseData(String paramString)
  {
    if (paramString == null) {
      return;
    }
    paramString = (ReportVo)new k().a(paramString, ReportVo.class);
    this.Qid = paramString.Qid;
    this.Err = paramString.Err;
    this.Counter = paramString.Counter;
    this.Data = paramString.Data;
  }
  
  public String toString()
  {
    return "ReportVo{Qid='" + this.Qid + '\'' + ", Err=" + this.Err + ", Counter=" + this.Counter + ", Data=" + this.Data + '}';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\ReportVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */