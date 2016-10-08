package com.android.thinkive.framework.network.packet.handler;

import com.android.thinkive.framework.network.socket.SocketType;
import com.android.thinkive.framework.network.socket.TradeSocketManager;
import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;

public class AuthPacketHandler
{
  public int parse(byte[] paramArrayOfByte, SocketType paramSocketType)
  {
    int i = -1;
    if (paramArrayOfByte.length > 4)
    {
      if (SocketType.TRADE != paramSocketType) {
        break label92;
      }
      paramSocketType = ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 405, paramArrayOfByte.length - 401);
      String str = new String(ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 261, paramArrayOfByte.length - 5));
      paramArrayOfByte = new String(ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 5, paramArrayOfByte.length));
      TradeSocketManager.getInstance().buildAESKey(str, paramArrayOfByte);
    }
    label92:
    for (paramArrayOfByte = paramSocketType;; paramArrayOfByte = ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 4, paramArrayOfByte.length))
    {
      i = ByteUtil.bytesToInt(paramArrayOfByte);
      return i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\handler\AuthPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */