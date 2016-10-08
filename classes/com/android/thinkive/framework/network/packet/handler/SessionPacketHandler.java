package com.android.thinkive.framework.network.packet.handler;

import com.android.thinkive.framework.util.ArrayUtil;

public class SessionPacketHandler
{
  public String parse(byte[] paramArrayOfByte)
  {
    String str = "";
    if (paramArrayOfByte.length > 8) {
      str = new String(ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 8, paramArrayOfByte.length));
    }
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\handler\SessionPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */