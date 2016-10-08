package com.android.thinkive.framework.network.packet.handler;

import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;
import com.android.thinkive.framework.util.Log;

public class AESPacketHandler
{
  public int parse(byte[] paramArrayOfByte)
  {
    int i = -1;
    if (paramArrayOfByte.length > 4) {
      i = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, paramArrayOfByte.length - 4, paramArrayOfByte.length));
    }
    Log.e("AES flag = " + i);
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\handler\AESPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */