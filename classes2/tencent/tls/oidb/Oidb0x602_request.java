package tencent.tls.oidb;

import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0x602.Oidb0X602.OpenAccountInfo;
import tencent.tls.oidb.cmd0x602.Oidb0X602.ReqBody;

public class Oidb0x602_request
{
  public static final int CMD = 1538;
  public static final byte ETX_C = 41;
  public static final int ROLE = 6161;
  public static final byte STX_C = 40;
  protected int dwBodyLen;
  protected int dwHeadLen;
  protected int service_type = 2;
  
  public int getCmd()
  {
    return 1538;
  }
  
  public byte[] get_request(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    paramString2 = paramString3;
    if (paramString3 == null) {
      paramString2 = "";
    }
    paramString3 = new OidbHead.OIDBHead();
    paramString3.uint32_command.set(1538);
    paramString3.uint32_service_type.set(this.service_type);
    Oidb0X602.OpenAccountInfo localOpenAccountInfo = new Oidb0X602.OpenAccountInfo();
    localOpenAccountInfo.uint32_openacctype.set(paramInt2);
    localOpenAccountInfo.str_openappid.set(str);
    localOpenAccountInfo.str_openid.set(paramString1);
    localOpenAccountInfo.uint32_sdkappid.set(paramInt1);
    localOpenAccountInfo.str_access_token.set(paramString2);
    paramString1 = new Oidb0X602.ReqBody();
    paramString1.rpt_openaccinfos.add(localOpenAccountInfo);
    this.dwHeadLen = paramString3.getSerializedSize();
    this.dwBodyLen = paramString1.getSerializedSize();
    paramString2 = ByteBuffer.allocate(this.dwHeadLen + 9 + this.dwBodyLen + 1);
    paramString2.put((byte)40);
    paramString2.putInt(this.dwHeadLen);
    paramString2.putInt(this.dwBodyLen);
    paramString2.put(paramString3.toByteArray());
    paramString2.put(paramString1.toByteArray());
    paramString2.put((byte)41);
    return paramString2.array();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0x602_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */