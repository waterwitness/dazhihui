package com.tencent.imsdk.av;

import com.tencent.imsdk.QLog;
import com.tencent.imsdk.WrapCmdListener;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.openqq.IMCmdListener;
import com.tencent.openqq.IMError;
import com.tencent.openqq.protocol.imsdk.relay.RspBody;

final class ʻ
  extends WrapCmdListener<IMCmdListener>
{
  ʻ(MultiVideoTinyId paramMultiVideoTinyId, IMCmdListener paramIMCmdListener, String paramString)
  {
    super(paramIMCmdListener);
  }
  
  public final void onError(IMError paramIMError, String paramString)
  {
    QLog.e("IMSdk.MultiVideoTinyId", 1, "multivideo|failed: " + paramIMError + " desc: " + paramString);
    ((IMCmdListener)this.listener).onError(paramIMError, paramString);
  }
  
  public final void onSucc(byte[] paramArrayOfByte)
  {
    relay.RspBody localRspBody = new relay.RspBody();
    try
    {
      localRspBody.mergeFrom(paramArrayOfByte);
      QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|callback: " + this.a);
      ((IMCmdListener)this.listener).onSucc(localRspBody.rspbody.get().toByteArray());
      return;
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      QLog.e("IMSdk.MultiVideoTinyId", 1, "multivideo|parse failed");
      ((IMCmdListener)this.listener).onError(IMError.FAIL, "parse rsp failed");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */