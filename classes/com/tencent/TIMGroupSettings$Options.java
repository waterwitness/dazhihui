package com.tencent;

import com.tencent.imcore.BytesVec;
import com.tencent.imcore.UpdateInfoOpt;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

public class TIMGroupSettings$Options
{
  List<String> customTags;
  long flags = -1L;
  
  public TIMGroupSettings$Options(TIMGroupSettings paramTIMGroupSettings) {}
  
  UpdateInfoOpt convert()
  {
    UpdateInfoOpt localUpdateInfoOpt = new UpdateInfoOpt(this.flags);
    if (this.customTags != null)
    {
      BytesVec localBytesVec = new BytesVec();
      Iterator localIterator = this.customTags.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          localBytesVec.pushBack(str.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
      localUpdateInfoOpt.setCustomInfoTags(localBytesVec);
    }
    return localUpdateInfoOpt;
  }
  
  public void setCustomTags(List<String> paramList)
  {
    this.customTags = paramList;
  }
  
  public void setFlags(long paramLong)
  {
    this.flags = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupSettings$Options.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */