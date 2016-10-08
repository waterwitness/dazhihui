package tencent.tls.oidb;

import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0x483.Oidb0X483.RspBody;
import tencent.tls.oidb.cmd0x483.Oidb0X483.TokenInfo;
import tencent.tls.report.QLog;

public class Oidb0x483_response
{
  private int dwBodyLen;
  private int dwHeadLen;
  private OidbHead.OIDBHead oidbHead;
  private int result = 0;
  private Oidb0X483.RspBody rspBody;
  
  public Oidb0x483_response(byte[] paramArrayOfByte)
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
      this.rspBody = new Oidb0X483.RspBody();
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
  
  public String getAccessToken()
  {
    return this.rspBody.st_token.str_access_token.get();
  }
  
  public String getErrHint()
  {
    return this.rspBody.str_errhint.get();
  }
  
  public long getExpireTime()
  {
    return this.rspBody.st_token.uint32_expires_in.get();
  }
  
  public int getHeadResult()
  {
    if (this.oidbHead != null) {
      return this.oidbHead.uint32_result.get();
    }
    return -1;
  }
  
  public String getOpenid()
  {
    return this.rspBody.st_token.str_openid.get();
  }
  
  public String getRefreshToken()
  {
    return this.rspBody.st_token.str_refresh_token.get();
  }
  
  public int getResult()
  {
    return this.result;
  }
  
  public String getScope()
  {
    return this.rspBody.st_token.str_scope.get();
  }
  
  public String getUnionid()
  {
    return this.rspBody.st_token.str_unionid.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0x483_response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */