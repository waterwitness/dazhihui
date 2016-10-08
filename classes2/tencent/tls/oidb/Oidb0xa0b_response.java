package tencent.tls.oidb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0xa0b.Oidb0Xa0b.RspBody;
import tencent.tls.report.QLog;

public class Oidb0xa0b_response
{
  private int dwBodyLen;
  private int dwHeadLen;
  private OidbHead.OIDBHead oidbHead;
  private int result = 0;
  private Oidb0Xa0b.RspBody rspBody;
  
  public Oidb0xa0b_response(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    try
    {
      paramArrayOfByte.get();
      this.dwHeadLen = paramArrayOfByte.getInt();
      this.dwBodyLen = paramArrayOfByte.getInt();
      byte[] arrayOfByte = new byte[this.dwHeadLen];
      paramArrayOfByte.get(arrayOfByte);
      this.oidbHead = new OidbHead.OIDBHead();
      this.oidbHead.mergeFrom(arrayOfByte);
      arrayOfByte = new byte[this.dwBodyLen];
      paramArrayOfByte.get(arrayOfByte);
      this.rspBody = new Oidb0Xa0b.RspBody();
      this.rspBody.mergeFrom(arrayOfByte);
      paramArrayOfByte.get();
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      QLog.e(paramArrayOfByte);
      this.result = 64527;
    }
  }
  
  public byte[] getA2()
  {
    return this.rspBody.bytes_a2.get().toByteArray();
  }
  
  public int getAdminFlag()
  {
    return this.rspBody.uint32_adminflag.get();
  }
  
  public byte[] getD2()
  {
    return this.rspBody.bytes_d2.get().toByteArray();
  }
  
  public byte[] getD2Key()
  {
    return this.rspBody.bytes_d2key.get().toByteArray();
  }
  
  public String getErrMsg()
  {
    return this.oidbHead.str_error_msg.get();
  }
  
  public int getHeadResult()
  {
    if (this.oidbHead != null) {
      return this.oidbHead.uint32_result.get();
    }
    return -1;
  }
  
  public String getIdentifier()
  {
    return this.rspBody.str_identifier.get();
  }
  
  public int getResult()
  {
    return this.result;
  }
  
  public long getTinyID()
  {
    return this.rspBody.uint64_tinyid.get();
  }
  
  public String getUserSig()
  {
    return this.rspBody.str_tlssig.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0xa0b_response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */