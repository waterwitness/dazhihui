package com.tencent.imsdk.userid;

import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.imsdk.WrapCmdListener;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.openqq.IMError;
import com.tencent.openqq.IMUserId;
import com.tencent.openqq.IMUserIdListener;
import com.tencent.openqq.protocol.imsdk.tinyid_to_userid.ReqBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TinyIdToUserId
{
  static TinyIdToUserId inst = new TinyIdToUserId();
  private static final String tag = "MSF.C.TinyIdToUserId";
  ConcurrentHashMap<Long, IMUserId> tinyIdToUserId = new ConcurrentHashMap();
  
  public static TinyIdToUserId get()
  {
    return inst;
  }
  
  private void localTinyIdToUserId(List<Long> paramList, List<IMUserId> paramList1)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Long localLong = (Long)paramList.next();
      if (this.tinyIdToUserId.containsKey(localLong))
      {
        IMUserId localIMUserId = new IMUserId((IMUserId)this.tinyIdToUserId.get(localLong));
        localIMUserId.setTinyId(localLong.longValue());
        paramList1.add(localIMUserId);
        paramList.remove();
      }
    }
  }
  
  public void tinyIdToUserId(List<Long> paramList, IMUserIdListener paramIMUserIdListener)
  {
    Object localObject1 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if ((localObject1 == null) || (!((IMMsfUserInfo)localObject1).isLoggedIn()))
    {
      paramIMUserIdListener.onError(IMError.FAIL, "not logged in");
      return;
    }
    ʽ localʽ = new ʽ(this, paramIMUserIdListener);
    Object localObject2 = new ArrayList();
    localʽ.setUserIdList((List)localObject2);
    localTinyIdToUserId(paramList, (List)localObject2);
    if (paramList.isEmpty())
    {
      paramList = ((List)localObject2).iterator();
      while (paramList.hasNext())
      {
        localObject1 = (IMUserId)paramList.next();
        QLog.d("MSF.C.TinyIdToUserId", 1, "local get userid: " + localObject1 + "|tinyid: " + ((IMUserId)localObject1).getTinyId());
      }
      paramIMUserIdListener.onSucc((List)localObject2);
      return;
    }
    paramIMUserIdListener = new tinyid_to_userid.ReqBody();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject2 = (Long)paramList.next();
      paramIMUserIdListener.tinyid.add(localObject2);
    }
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject1).getUserId(), IMMsfCoreProxy.get().getSdkType() + ".pbtinyidtouserid", paramIMUserIdListener.toByteArray(), localʽ);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\userid\TinyIdToUserId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */