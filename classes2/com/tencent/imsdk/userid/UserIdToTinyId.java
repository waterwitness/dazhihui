package com.tencent.imsdk.userid;

import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.imsdk.WrapCmdListener;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.openqq.IMError;
import com.tencent.openqq.IMUserId;
import com.tencent.openqq.IMUserIdListener;
import com.tencent.openqq.protocol.imsdk.im_open_common.IMUserId;
import com.tencent.openqq.protocol.imsdk.userid_to_tinyid.ReqBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class UserIdToTinyId
{
  static UserIdToTinyId inst = new UserIdToTinyId();
  private static final String tag = "MSF.C.UserIdToTinyId";
  ConcurrentHashMap<IMUserId, Long> userIdToTinyId = new ConcurrentHashMap();
  
  public static UserIdToTinyId get()
  {
    return inst;
  }
  
  private void localUserIdToTinyId(List<IMUserId> paramList1, List<IMUserId> paramList2)
  {
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      IMUserId localIMUserId1 = (IMUserId)paramList1.next();
      if (this.userIdToTinyId.containsKey(localIMUserId1))
      {
        IMUserId localIMUserId2 = new IMUserId(localIMUserId1);
        localIMUserId2.setTinyId(((Long)this.userIdToTinyId.get(localIMUserId1)).longValue());
        paramList2.add(localIMUserId2);
        paramList1.remove();
      }
    }
  }
  
  public void userIdToTinyId(List<IMUserId> paramList, IMUserIdListener paramIMUserIdListener)
  {
    Object localObject1 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if ((localObject1 == null) || (!((IMMsfUserInfo)localObject1).isLoggedIn()))
    {
      paramIMUserIdListener.onError(IMError.FAIL, "not logged in");
      return;
    }
    ʾ localʾ = new ʾ(this, paramIMUserIdListener);
    Object localObject2 = new ArrayList();
    localʾ.setUserIdList((List)localObject2);
    localUserIdToTinyId(paramList, (List)localObject2);
    if (paramList.isEmpty())
    {
      paramList = ((List)localObject2).iterator();
      while (paramList.hasNext())
      {
        localObject1 = (IMUserId)paramList.next();
        QLog.d("MSF.C.UserIdToTinyId", 1, "local get userid: " + localObject1 + "|tinyid: " + ((IMUserId)localObject1).getTinyId());
      }
      paramIMUserIdListener.onSucc((List)localObject2);
      return;
    }
    paramIMUserIdListener = new userid_to_tinyid.ReqBody();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject2 = (IMUserId)paramList.next();
      im_open_common.IMUserId localIMUserId = new im_open_common.IMUserId();
      localIMUserId.uidtype.set(ByteStringMicro.copyFromUtf8(((IMUserId)localObject2).getUidType()));
      localIMUserId.userappid.set(((IMUserId)localObject2).getUserAppId());
      localIMUserId.userid.set(ByteStringMicro.copyFromUtf8(((IMUserId)localObject2).getUserId()));
      paramIMUserIdListener.userid.add(localIMUserId);
    }
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject1).getUserId(), IMMsfCoreProxy.get().getSdkType() + ".pbuseridtotinyid", paramIMUserIdListener.toByteArray(), localʾ);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\userid\UserIdToTinyId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */