package com.tencent.imsdk;

import com.tencent.openqq.IMCmdListener;
import com.tencent.openqq.IMUserId;
import java.util.ArrayList;
import java.util.List;

public abstract class WrapCmdListener<T>
  implements IMCmdListener
{
  public int called_cnt = 0;
  public T listener;
  public List<String> openIdList = new ArrayList();
  public int req_num = 20;
  public int seq = 0;
  public int start_index = 0;
  public List<IMUserId> userIdList;
  
  public WrapCmdListener(T paramT)
  {
    this.listener = paramT;
  }
  
  public List<IMUserId> getUserIdList()
  {
    return this.userIdList;
  }
  
  public void setUserIdList(List<IMUserId> paramList)
  {
    this.userIdList = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\WrapCmdListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */