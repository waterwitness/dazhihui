package tencent.tls.account;

import java.nio.ByteBuffer;
import java.util.Arrays;
import tencent.tls.report.QLog;
import tencent.tls.tools.MD5;
import tencent.tls.tools.cryptor;
import tencent.tls.tools.util;

public class acc_request
{
  public static final int CMD_GUEST = 118;
  public static final int CMD_REG_AC = 49;
  public static final int CMD_REG_CM = 54;
  public static final int CMD_REG_RA = 52;
  public static final int CMD_REG_VC = 53;
  public static final int CMD_RST_AC = 64;
  public static final int CMD_RST_CM = 67;
  public static final int CMD_RST_RA = 65;
  public static final int CMD_RST_VC = 66;
  public static final int CMD_SMS_AC = 33;
  public static final int CMD_SMS_CM = 38;
  public static final int CMD_SMS_RA = 36;
  public static final int CMD_SMS_VC = 37;
  public static final int CMD_STR_CM = 102;
  public static final int CMD_STR_QRY = 97;
  protected int _body_len = 0;
  protected int _cmd = 0;
  protected int _head_len = 11;
  protected int _os_type = 5;
  protected int _version = 1;
  
  private static int check_header(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    try
    {
      localByteBuffer.get();
      if (localByteBuffer.getShort() != paramArrayOfByte.length) {
        return 64527;
      }
      localByteBuffer.getInt();
      int i = localByteBuffer.get();
      int j = localByteBuffer.position();
      return j + i;
    }
    catch (Exception paramArrayOfByte)
    {
      QLog.e(paramArrayOfByte);
    }
    return 64527;
  }
  
  public static int parse_checkvalid_rsp(int paramInt, byte[] paramArrayOfByte, acc_status paramacc_status)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = check_header(paramArrayOfByte);
    if (i == 64527) {
      return 64527;
    }
    localByteBuffer.position(i);
    paramacc_status.sec_ctrl_code = localByteBuffer.get();
    Object localObject = null;
    switch (paramInt)
    {
    default: 
      paramArrayOfByte = (byte[])localObject;
    case 33: 
    case 36: 
    case 49: 
    case 52: 
    case 64: 
    case 65: 
    case 38: 
    case 54: 
    case 67: 
    case 102: 
    case 37: 
    case 53: 
    case 66: 
    case 97: 
      for (;;)
      {
        paramacc_status.token = new byte[localByteBuffer.get()];
        localByteBuffer.get(paramacc_status.token);
        if ((paramArrayOfByte == null) || (Arrays.equals(paramacc_status.token, paramArrayOfByte))) {
          break;
        }
        return 64534;
        localByteBuffer.getShort();
        paramacc_status.next_resend_time = localByteBuffer.getShort();
        paramacc_status.total_time_over = localByteBuffer.getShort();
        paramArrayOfByte = (byte[])localObject;
        continue;
        localObject = new byte[localByteBuffer.getShort()];
        localByteBuffer.get((byte[])localObject);
        if ((paramacc_status.msgcode == null) || (paramacc_status.msgcode.length == 0)) {}
        for (paramArrayOfByte = acc_status.STATIC_KEY.getBytes();; paramArrayOfByte = MD5.toMD5Byte(paramacc_status.msgcode))
        {
          paramArrayOfByte = cryptor.decrypt((byte[])localObject, 0, localObject.length, paramArrayOfByte);
          if (paramArrayOfByte != null) {
            break;
          }
          return 64534;
        }
        localObject = ByteBuffer.wrap(paramArrayOfByte);
        paramArrayOfByte = new byte[((ByteBuffer)localObject).get()];
        ((ByteBuffer)localObject).get(paramArrayOfByte);
        paramacc_status.nopicsig = new byte[((ByteBuffer)localObject).getShort()];
        ((ByteBuffer)localObject).get(paramacc_status.nopicsig);
        continue;
        resolveTLV(paramInt, localByteBuffer);
        paramArrayOfByte = (byte[])localObject;
        continue;
        acc_status.msalt = localByteBuffer.getLong();
        paramArrayOfByte = (byte[])localObject;
        continue;
        acc_status.msalt = localByteBuffer.getLong();
        paramInt = localByteBuffer.getShort();
        paramArrayOfByte = (byte[])localObject;
        if (paramInt > 0)
        {
          localByteBuffer.position(paramInt + localByteBuffer.position());
          paramArrayOfByte = (byte[])localObject;
        }
      }
    }
    acc_status.msalt = localByteBuffer.getLong();
    acc_status.regtime = localByteBuffer.getLong();
    paramArrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(paramArrayOfByte);
    paramacc_status.userID = new String(paramArrayOfByte);
    resolveTLV(paramInt, localByteBuffer);
    paramacc_status.promptinfo = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(paramacc_status.promptinfo);
    return 0;
    paramacc_status.promptinfo = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(paramacc_status.promptinfo);
    return 0;
  }
  
  private static void resolveTLV(int paramInt, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.get() == 0) {}
  }
  
  public int get_cmd()
  {
    return this._cmd;
  }
  
  protected byte[] get_encrypt_token(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + 1];
    util.int8_to_buf(arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 1, paramArrayOfByte1.length);
    paramArrayOfByte1 = MD5.toMD5Byte(paramArrayOfByte2);
    return cryptor.encrypt(arrayOfByte, 0, arrayOfByte.length, paramArrayOfByte1);
  }
  
  protected byte[] get_request(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(this._head_len + 2 + paramArrayOfByte.length);
    localByteBuffer.put((byte)2);
    localByteBuffer.putShort((short)(this._head_len + 1 + paramArrayOfByte.length + 1));
    localByteBuffer.putShort((short)this._version);
    localByteBuffer.putShort((short)this._cmd);
    localByteBuffer.put((byte)4);
    localByteBuffer.putInt(0);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.put((byte)3);
    return localByteBuffer.array();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */