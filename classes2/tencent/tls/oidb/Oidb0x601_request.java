package tencent.tls.oidb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0x601.Oidb0X601.OpenAccountInfo;
import tencent.tls.oidb.cmd0x601.Oidb0X601.OpenSigInfo;
import tencent.tls.oidb.cmd0x601.Oidb0X601.ReqBody;
import tencent.tls.oidb.cmd0x601.Oidb0X601.UserAccountInfo;

public class Oidb0x601_request
{
  public static final int CMD = 1537;
  public static final byte ETX_C = 41;
  public static final int ROLE = 6161;
  public static final byte STX_C = 40;
  protected int dwBodyLen;
  protected int dwHeadLen;
  protected int service_type = 3;
  
  public int getCmd()
  {
    return 1537;
  }
  
  public byte[] get_request(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, String paramString3, String paramString4, String paramString5)
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
    paramString3 = paramString4;
    if (paramString4 == null) {
      paramString3 = "";
    }
    paramString4 = paramString5;
    if (paramString5 == null) {
      paramString4 = "";
    }
    paramString5 = new OidbHead.OIDBHead();
    paramString5.uint32_command.set(1537);
    paramString5.uint32_service_type.set(this.service_type);
    Oidb0X601.OpenAccountInfo localOpenAccountInfo = new Oidb0X601.OpenAccountInfo();
    localOpenAccountInfo.uint32_openacctype.set(paramInt3);
    localOpenAccountInfo.str_openappid.set(paramString2);
    localOpenAccountInfo.str_openid.set(paramString3);
    paramString3 = new Oidb0X601.UserAccountInfo();
    paramString3.uint32_useracctype.set(paramInt2);
    paramString3.str_useraccount.set(str);
    paramString3.str_usersig.set(paramString1);
    paramString1 = new Oidb0X601.OpenSigInfo();
    paramString1.str_openappid.set(paramString2);
    paramString1.bytes_opensig.set(ByteStringMicro.copyFrom(paramString4.getBytes()));
    paramString2 = new Oidb0X601.ReqBody();
    paramString2.openaccount.set(localOpenAccountInfo);
    paramString2.useraccount.set(paramString3);
    paramString2.opensig.set(paramString1);
    paramString2.uint32_sdkappid.set(paramInt1);
    this.dwHeadLen = paramString5.getSerializedSize();
    this.dwBodyLen = paramString2.getSerializedSize();
    paramString1 = ByteBuffer.allocate(this.dwHeadLen + 9 + this.dwBodyLen + 1);
    paramString1.put((byte)40);
    paramString1.putInt(this.dwHeadLen);
    paramString1.putInt(this.dwBodyLen);
    paramString1.put(paramString5.toByteArray());
    paramString1.put(paramString2.toByteArray());
    paramString1.put((byte)41);
    return paramString1.array();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0x601_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */