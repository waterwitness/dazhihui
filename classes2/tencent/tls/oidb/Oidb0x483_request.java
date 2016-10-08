package tencent.tls.oidb;

import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.nio.ByteBuffer;
import tencent.tls.oidb.cmd0x483.Oidb0X483.ReqBody;

public class Oidb0x483_request
{
  public static final int CMD = 1155;
  public static final byte ETX_C = 41;
  public static final int ROLE = 5970;
  public static final byte STX_C = 40;
  protected int dwBodyLen;
  protected int dwHeadLen;
  protected int service_type = 0;
  
  public int getCmd()
  {
    return 1155;
  }
  
  public byte[] get_request(long paramLong, int paramInt, String paramString)
  {
    Object localObject = paramString;
    if (paramString == null) {
      localObject = "";
    }
    paramString = new OidbHead.OIDBHead();
    paramString.uint32_command.set(1155);
    paramString.uint32_service_type.set(this.service_type);
    Oidb0X483.ReqBody localReqBody = new Oidb0X483.ReqBody();
    localReqBody.uint32_appid.set((int)paramLong);
    localReqBody.uint32_account_type.set(paramInt);
    localReqBody.str_code.set((String)localObject);
    this.dwHeadLen = paramString.getSerializedSize();
    this.dwBodyLen = localReqBody.getSerializedSize();
    localObject = ByteBuffer.allocate(this.dwHeadLen + 9 + this.dwBodyLen + 1);
    ((ByteBuffer)localObject).put((byte)40);
    ((ByteBuffer)localObject).putInt(this.dwHeadLen);
    ((ByteBuffer)localObject).putInt(this.dwBodyLen);
    ((ByteBuffer)localObject).put(paramString.toByteArray());
    ((ByteBuffer)localObject).put(localReqBody.toByteArray());
    ((ByteBuffer)localObject).put((byte)41);
    return ((ByteBuffer)localObject).array();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\oidb\Oidb0x483_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */