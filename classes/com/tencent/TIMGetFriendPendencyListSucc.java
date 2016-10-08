package com.tencent;

import com.tencent.imcore.FriendPendencyItemVec;
import com.tencent.imcore.FriendPendencyMeta;
import java.util.ArrayList;
import java.util.List;

public class TIMGetFriendPendencyListSucc
{
  private TIMFriendPendencyMeta meta;
  private List<TIMFriendPendencyItem> pendencies;
  
  TIMGetFriendPendencyListSucc(FriendPendencyMeta paramFriendPendencyMeta, FriendPendencyItemVec paramFriendPendencyItemVec)
  {
    setMeta(new TIMFriendPendencyMeta(paramFriendPendencyMeta));
    paramFriendPendencyMeta = new ArrayList();
    int j = (int)paramFriendPendencyItemVec.size();
    int i = 0;
    while (i < j)
    {
      paramFriendPendencyMeta.add(new TIMFriendPendencyItem(paramFriendPendencyItemVec.get(i)));
      i += 1;
    }
    setPendencies(paramFriendPendencyMeta);
  }
  
  public TIMFriendPendencyMeta getMeta()
  {
    return this.meta;
  }
  
  public List<TIMFriendPendencyItem> getPendencies()
  {
    return this.pendencies;
  }
  
  void setMeta(TIMFriendPendencyMeta paramTIMFriendPendencyMeta)
  {
    this.meta = paramTIMFriendPendencyMeta;
  }
  
  void setPendencies(List<TIMFriendPendencyItem> paramList)
  {
    this.pendencies = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGetFriendPendencyListSucc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */