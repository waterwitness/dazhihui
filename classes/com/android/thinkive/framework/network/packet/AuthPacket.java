package com.android.thinkive.framework.network.packet;

import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;
import com.android.thinkive.framework.util.FlowNoGenerater;
import java.io.OutputStream;

public class AuthPacket
  implements IPacket
{
  private String password;
  private String userName;
  
  public AuthPacket(String paramString1, String paramString2)
  {
    this.userName = paramString1;
    this.password = paramString2;
  }
  
  public int getFlowNo()
  {
    return FlowNoGenerater.getInstance().generaterFlowNo();
  }
  
  public byte[] packingBody()
  {
    byte[] arrayOfByte1 = new byte[20];
    System.arraycopy(this.userName.getBytes(), 0, arrayOfByte1, 0, this.userName.getBytes().length);
    byte[] arrayOfByte2 = new byte[8];
    System.arraycopy(this.password.getBytes(), 0, arrayOfByte2, 0, this.password.getBytes().length);
    return ArrayUtil.addArray(arrayOfByte1, arrayOfByte2);
  }
  
  public byte[] packingHeader()
  {
    byte[] arrayOfByte1 = "TH".getBytes();
    byte[] arrayOfByte2 = ByteUtil.intToBytes(2);
    byte[] arrayOfByte3 = ByteUtil.intToBytes(28);
    return ArrayUtil.addArray(ArrayUtil.addArray(arrayOfByte1, arrayOfByte2), arrayOfByte3);
  }
  
  public void sendPacket(OutputStream paramOutputStream)
  {
    paramOutputStream.write(ArrayUtil.addArray(packingHeader(), packingBody()));
    paramOutputStream.flush();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\AuthPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */