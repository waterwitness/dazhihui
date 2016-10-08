package com.tencent;

import com.tencent.imcore.FriendFutureItemVec;
import com.tencent.imcore.FutureFriendMeta;
import java.util.ArrayList;
import java.util.List;

public class TIMGetFriendFutureListSucc
{
  private List<TIMFriendFutureItem> items;
  private TIMFriendFutureMeta meta;
  
  TIMGetFriendFutureListSucc(FutureFriendMeta paramFutureFriendMeta, FriendFutureItemVec paramFriendFutureItemVec)
  {
    setMeta(new TIMFriendFutureMeta(paramFutureFriendMeta));
    paramFutureFriendMeta = new ArrayList();
    int j = (int)paramFriendFutureItemVec.size();
    int i = 0;
    while (i < j)
    {
      paramFutureFriendMeta.add(new TIMFriendFutureItem(paramFriendFutureItemVec.get(i)));
      i += 1;
    }
    setItems(paramFutureFriendMeta);
  }
  
  public List<TIMFriendFutureItem> getItems()
  {
    return this.items;
  }
  
  public TIMFriendFutureMeta getMeta()
  {
    return this.meta;
  }
  
  void setItems(List<TIMFriendFutureItem> paramList)
  {
    this.items = paramList;
  }
  
  void setMeta(TIMFriendFutureMeta paramTIMFriendFutureMeta)
  {
    this.meta = paramTIMFriendFutureMeta;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGetFriendFutureListSucc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */