package com.tencent;

import com.tencent.imcore.GroupPendencyItemVec;
import com.tencent.imcore.GroupPendencyMeta;
import java.util.ArrayList;
import java.util.List;

public class TIMGroupPendencyListGetSucc
{
  private String identifer;
  private TIMGroupPendencyMeta meta;
  private List<TIMGroupPendencyItem> pendencies = new ArrayList();
  
  TIMGroupPendencyListGetSucc(String paramString, GroupPendencyMeta paramGroupPendencyMeta, GroupPendencyItemVec paramGroupPendencyItemVec)
  {
    this.identifer = paramString;
    this.meta = new TIMGroupPendencyMeta(paramGroupPendencyMeta);
    int i = 0;
    while (i < paramGroupPendencyItemVec.size())
    {
      this.pendencies.add(new TIMGroupPendencyItem(paramString, paramGroupPendencyItemVec.get(i)));
      i += 1;
    }
  }
  
  public List<TIMGroupPendencyItem> getPendencies()
  {
    return this.pendencies;
  }
  
  public TIMGroupPendencyMeta getPendencyMeta()
  {
    return this.meta;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupPendencyListGetSucc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */