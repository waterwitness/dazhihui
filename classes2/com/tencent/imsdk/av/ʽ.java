package com.tencent.imsdk.av;

import com.tencent.imsdk.QLog;
import com.tencent.imsdk.WrapCmdListener;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.openqq.IMError;
import com.tencent.openqq.IMPushListener;
import com.tencent.openqq.IMReqListener;
import com.tencent.openqq.protocol.imsdk.common.CmdErrorCode;
import com.tencent.openqq.protocol.imsdk.sharp.RspBody;

final class ʽ
  extends WrapCmdListener<IMReqListener>
{
  ʽ(SharpTinyId paramSharpTinyId, IMReqListener paramIMReqListener)
  {
    super(paramIMReqListener);
  }
  
  public final void onError(IMError paramIMError, String paramString)
  {
    QLog.e("MSF.C.SharpTinyId", 1, "sharp|req failed: " + paramIMError + " desc: " + paramString);
    ((IMReqListener)this.listener).onError(paramIMError, paramString);
  }
  
  public final void onSucc(byte[] paramArrayOfByte)
  {
    sharp.RspBody localRspBody = new sharp.RspBody();
    do
    {
      try
      {
        localRspBody.mergeFrom(paramArrayOfByte);
        if (localRspBody.msg_cmd_error_code.uint32_code.get() != 0)
        {
          QLog.e("MSF.C.SharpTinyId", 1, "sharp|svr ret: " + localRspBody.msg_cmd_error_code.uint32_code.get() + " err msg: " + localRspBody.msg_cmd_error_code.bytes_err_msg.get().toStringUtf8());
          ((IMReqListener)this.listener).onError(IMError.FAIL, localRspBody.msg_cmd_error_code.bytes_err_msg.get().toStringUtf8());
          return;
        }
      }
      catch (InvalidProtocolBufferMicroException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        QLog.e("MSF.C.SharpTinyId", 1, "sharp|parse svr rsp failed");
        ((IMReqListener)this.listener).onError(IMError.FAIL, "");
        return;
      }
      ((IMReqListener)this.listener).onSucc();
      paramArrayOfByte = this.a.getSharpSvrRspListener();
    } while (paramArrayOfByte == null);
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|call rsp listener");
    paramArrayOfByte.onRecv(localRspBody.bytes_rsp_data.get().toByteArray());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */