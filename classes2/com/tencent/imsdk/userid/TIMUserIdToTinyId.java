package com.tencent.imsdk.userid;

import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.openqq.protocol.imsdk.im_open_common.IMUserId;
import com.tencent.openqq.protocol.imsdk.userid_to_tinyid.ReqBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TIMUserIdToTinyId
{
  static TIMUserIdToTinyId inst = new TIMUserIdToTinyId();
  private static final String tag = "MSF.C.UserIdToTinyId";
  ConcurrentHashMap<TIMUser, Long> userIdToTinyId = new ConcurrentHashMap();
  
  public static TIMUserIdToTinyId get()
  {
    return inst;
  }
  
  private void localUserIdToTinyId(List<TIMUser> paramList1, List<TIMUser> paramList2)
  {
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      TIMUser localTIMUser1 = (TIMUser)paramList1.next();
      if (this.userIdToTinyId.containsKey(localTIMUser1))
      {
        TIMUser localTIMUser2 = new TIMUser(localTIMUser1);
        localTIMUser2.setTinyId(((Long)this.userIdToTinyId.get(localTIMUser1)).longValue());
        paramList2.add(localTIMUser2);
        paramList1.remove();
      }
    }
  }
  
  public void userIdToTinyId(List<TIMUser> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack, long paramLong)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    Object localObject = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if ((localObject == null) || (!((IMMsfUserInfo)localObject).isLoggedIn()))
    {
      paramTIMValueCallBack.onError(6014, "not logged in");
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localUserIdToTinyId(paramList, localArrayList);
    if (paramList.isEmpty())
    {
      paramList = localArrayList.iterator();
      while (paramList.hasNext())
      {
        localObject = (TIMUser)paramList.next();
        QLog.d("MSF.C.UserIdToTinyId", 1, "local get userid: " + localObject + "|tinyid: " + ((TIMUser)localObject).getTinyId());
      }
      paramTIMValueCallBack.onSuccess(localArrayList);
      return;
    }
    userid_to_tinyid.ReqBody localReqBody = new userid_to_tinyid.ReqBody();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      TIMUser localTIMUser = (TIMUser)paramList.next();
      im_open_common.IMUserId localIMUserId = new im_open_common.IMUserId();
      localIMUserId.uidtype.set(ByteStringMicro.copyFromUtf8(IMMsfCoreProxy.get().getUidType()));
      localIMUserId.userappid.set(IMMsfCoreProxy.get().getSdkAppId());
      localIMUserId.userid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getIdentifier()));
      localReqBody.userid.add(localIMUserId);
    }
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject).getUserId(), "openim.pbuseridtotinyid", localReqBody.toByteArray(), new ʼ(this, localArrayList, paramTIMValueCallBack), paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\userid\TIMUserIdToTinyId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */