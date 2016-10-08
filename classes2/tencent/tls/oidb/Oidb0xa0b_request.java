package tencent.tls.oidb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0xa0b.Oidb0Xa0b.ReqBody;

public class Oidb0xa0b_request
{
  public static final int CMD = 2571;
  public static final byte ETX_C = 41;
  public static final int OPENACCOUNT = 1;
  public static final int ROLE = 6269;
  public static final int SELFACCOUNT = 2;
  public static final byte STX_C = 40;
  protected int dwBodyLen;
  protected int dwHeadLen;
  protected int service_type;
  
  public Oidb0xa0b_request(int paramInt)
  {
    this.service_type = paramInt;
  }
  
  public int getCmd()
  {
    return 2571;
  }
  
  public byte[] get_request(long paramLong, int paramInt, String paramString1, String paramString2, String paramString3)
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
    paramString3.uint32_command.set(2571);
    paramString3.uint32_service_type.set(this.service_type);
    Oidb0Xa0b.ReqBody localReqBody = new Oidb0Xa0b.ReqBody();
    localReqBody.uint32_sdkappid.set((int)paramLong);
    localReqBody.str_appidat3rd.set(paramString1);
    localReqBody.str_identifier.set(str);
    localReqBody.bytes_usersig.set(ByteStringMicro.copyFrom(paramString2.getBytes()));
    localReqBody.uint32_accounttype.set(paramInt);
    this.dwHeadLen = paramString3.getSerializedSize();
    this.dwBodyLen = localReqBody.getSerializedSize();
    paramString1 = ByteBuffer.allocate(this.dwHeadLen + 9 + this.dwBodyLen + 1);
    paramString1.put((byte)40);
    paramString1.putInt(this.dwHeadLen);
    paramString1.putInt(this.dwBodyLen);
    paramString1.put(paramString3.toByteArray());
    paramString1.put(localReqBody.toByteArray());
    paramString1.put((byte)41);
    return paramString1.array();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0xa0b_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */