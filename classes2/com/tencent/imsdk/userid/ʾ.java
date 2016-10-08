package com.tencent.imsdk.userid;

import com.tencent.imsdk.QLog;
import com.tencent.imsdk.WrapCmdListener;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.IMError;
import com.tencent.openqq.IMUserId;
import com.tencent.openqq.IMUserIdListener;
import com.tencent.openqq.protocol.imsdk.im_open_common.IMUserId;
import com.tencent.openqq.protocol.imsdk.userid_to_tinyid.RspBody;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class ʾ
  extends WrapCmdListener<IMUserIdListener>
{
  ʾ(UserIdToTinyId paramUserIdToTinyId, IMUserIdListener paramIMUserIdListener)
  {
    super(paramIMUserIdListener);
  }
  
  public final void onError(IMError paramIMError, String paramString)
  {
    ((IMUserIdListener)this.listener).onError(paramIMError, paramString);
  }
  
  public final void onSucc(byte[] paramArrayOfByte)
  {
    Object localObject1 = new userid_to_tinyid.RspBody();
    Object localObject2;
    try
    {
      ((userid_to_tinyid.RspBody)localObject1).mergeFrom(paramArrayOfByte);
      paramArrayOfByte = getUserIdList();
      localObject1 = ((userid_to_tinyid.RspBody)localObject1).userid.get().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (im_open_common.IMUserId)((Iterator)localObject1).next();
        IMUserId localIMUserId = new IMUserId();
        localIMUserId.setUidType(((im_open_common.IMUserId)localObject2).uidtype.get().toStringUtf8());
        localIMUserId.setUserAppId(((im_open_common.IMUserId)localObject2).userappid.get());
        localIMUserId.setUserId(((im_open_common.IMUserId)localObject2).userid.get().toStringUtf8());
        localIMUserId.setTinyId(((im_open_common.IMUserId)localObject2).tinyid.get());
        paramArrayOfByte.add(localIMUserId);
        UserIdToTinyId.get().userIdToTinyId.put(localIMUserId, Long.valueOf(localIMUserId.getTinyId()));
        TinyIdToUserId.get().tinyIdToUserId.put(Long.valueOf(localIMUserId.getTinyId()), localIMUserId);
      }
      localObject1 = paramArrayOfByte.iterator();
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return;
    }
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (IMUserId)((Iterator)localObject1).next();
      QLog.d("MSF.C.UserIdToTinyId", 1, "get userid: " + localObject2 + "|tinyid: " + ((IMUserId)localObject2).getTinyId());
    }
    ((IMUserIdListener)this.listener).onSucc(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\userid\ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */