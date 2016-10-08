package tencent.tls.oidb;

import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.account.TLSOpenAccountInfo.OpenAccountStatus;
import tencent.tls.oidb.cmd0x602.Oidb0X602.Open2UserInfo;
import tencent.tls.oidb.cmd0x602.Oidb0X602.RspBody;
import tencent.tls.report.QLog;

public class Oidb0x602_response
{
  private int dwBodyLen;
  private int dwHeadLen;
  private OidbHead.OIDBHead oidbHead;
  private int result = 0;
  private Oidb0X602.RspBody rspBody;
  
  public Oidb0x602_response(byte[] paramArrayOfByte)
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
      this.rspBody = new Oidb0X602.RspBody();
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
  
  public int getHeadResult()
  {
    if (this.oidbHead != null) {
      return this.oidbHead.uint32_result.get();
    }
    return -1;
  }
  
  public TLSOpenAccountInfo.OpenAccountStatus getOpenAccountStatus()
  {
    if (this.rspBody.rpt_open2userinfos.size() > 0) {}
    switch (((Oidb0X602.Open2UserInfo)this.rspBody.rpt_open2userinfos.get(0)).uint32_result_flg.get())
    {
    default: 
      return TLSOpenAccountInfo.OpenAccountStatus.UNKNOWN;
    case 1: 
      return TLSOpenAccountInfo.OpenAccountStatus.USED_BINDED;
    case 2: 
      return TLSOpenAccountInfo.OpenAccountStatus.USED_UNBINDED;
    }
    return TLSOpenAccountInfo.OpenAccountStatus.UNUSED;
  }
  
  public int getResult()
  {
    return this.result;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0x602_response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */