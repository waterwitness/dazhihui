package com.tencent.imsdk.userid;

import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.openqq.protocol.imsdk.tinyid_to_userid.ReqBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TIMTinyIdToUserId
{
  static TIMTinyIdToUserId inst = new TIMTinyIdToUserId();
  private static final String tag = "MSF.C.TinyIdToUserId";
  ConcurrentHashMap<Long, TIMUser> tinyIdToUserId = new ConcurrentHashMap();
  
  public static TIMTinyIdToUserId get()
  {
    return inst;
  }
  
  private void localTinyIdToUserId(List<Long> paramList, List<TIMUser> paramList1)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Long localLong = (Long)paramList.next();
      if (this.tinyIdToUserId.containsKey(localLong))
      {
        TIMUser localTIMUser = new TIMUser((TIMUser)this.tinyIdToUserId.get(localLong));
        localTIMUser.setTinyId(localLong.longValue());
        paramList1.add(localTIMUser);
        paramList.remove();
      }
    }
  }
  
  public void tinyIdToUserId(List<Long> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack, long paramLong)
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
    localTinyIdToUserId(paramList, localArrayList);
    if (paramList.isEmpty())
    {
      paramList = localArrayList.iterator();
      while (paramList.hasNext())
      {
        localObject = (TIMUser)paramList.next();
        QLog.d("MSF.C.TinyIdToUserId", 1, "local get userid: " + localObject + "|tinyid: " + ((TIMUser)localObject).getTinyId());
      }
      paramTIMValueCallBack.onSuccess(localArrayList);
      return;
    }
    tinyid_to_userid.ReqBody localReqBody = new tinyid_to_userid.ReqBody();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Long localLong = (Long)paramList.next();
      localReqBody.tinyid.add(localLong);
    }
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject).getUserId(), "openim.pbtinyidtouserid", localReqBody.toByteArray(), new ʻ(this, localArrayList, paramTIMValueCallBack), paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\userid\TIMTinyIdToUserId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */