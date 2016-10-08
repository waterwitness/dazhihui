package com.tencent.avsdk.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomReqMsgVo<T>
{
  public T Params;
  private String Qid = new SimpleDateFormat("ssSSS", Locale.getDefault()).format(new Date());
  private String Service;
  
  public void setType(CustomReqMsgVo.CustomType paramCustomType)
  {
    this.Service = paramCustomType.getValue();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\CustomReqMsgVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */