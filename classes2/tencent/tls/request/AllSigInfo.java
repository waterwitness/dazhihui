package tencent.tls.request;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeMap;

class AllSigInfo
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = 1L;
  public TreeMap<Long, SigInfo> _tk_map = new TreeMap();
  
  protected AllSigInfo clone()
  {
    try
    {
      AllSigInfo localAllSigInfo = (AllSigInfo)super.clone();
      localAllSigInfo._tk_map = ((TreeMap)this._tk_map.clone());
      return localAllSigInfo;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public int put_siginfo(long paramLong1, long paramLong2, long paramLong3, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    SigInfo localSigInfo = (SigInfo)this._tk_map.get(Long.valueOf(paramLong1));
    if (localSigInfo != null) {
      this._tk_map.put(Long.valueOf(paramLong1), localSigInfo.Set(paramLong2, paramLong3, paramArrayList, paramInt));
    }
    for (;;)
    {
      return 0;
      this._tk_map.put(Long.valueOf(paramLong1), new SigInfo(paramLong2, paramLong3, paramArrayList, paramInt));
    }
  }
  
  public int put_siginfo(long paramLong1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2)
  {
    SigInfo localSigInfo = (SigInfo)this._tk_map.get(Long.valueOf(paramLong1));
    if (localSigInfo != null)
    {
      byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 2, 0 });
      int i = 0;
      while (i < arrayOfByte.length)
      {
        arrayOfByte[i] = new byte[0];
        i += 1;
      }
      arrayOfByte[0] = paramArrayOfByte1;
      arrayOfByte[1] = paramArrayOfByte2;
      this._tk_map.put(Long.valueOf(paramLong1), localSigInfo.Set(arrayOfByte, paramLong2));
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\AllSigInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */