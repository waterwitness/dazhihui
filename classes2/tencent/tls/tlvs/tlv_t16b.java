package tencent.tls.tlvs;

import java.util.List;
import tencent.tls.tools.util;

public class tlv_t16b
  extends tlv_t
{
  public tlv_t16b()
  {
    this._cmd = 363;
  }
  
  public byte[] get_tlv_16b(List<String> paramList)
  {
    int k;
    int i;
    if (paramList != null)
    {
      k = paramList.size();
      i = 0;
      j = 0;
      while (j < k)
      {
        i += 2;
        if (paramList.get(j) == null) {
          break label199;
        }
        i = ((String)paramList.get(j)).length() + i;
        j += 1;
      }
    }
    for (int j = k;; j = 0)
    {
      byte[] arrayOfByte1 = new byte[i + 2];
      util.int16_to_buf(arrayOfByte1, 0, j);
      if (paramList != null)
      {
        i = 2;
        k = 0;
        if (k < j)
        {
          if (paramList.get(k) != null)
          {
            byte[] arrayOfByte2 = ((String)paramList.get(k)).getBytes();
            util.int16_to_buf(arrayOfByte1, i, arrayOfByte2.length);
            i += 2;
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, arrayOfByte2.length);
            i = arrayOfByte2.length + i;
          }
          for (;;)
          {
            k += 1;
            break;
            util.int16_to_buf(arrayOfByte1, i, 0);
            i += 2;
          }
        }
      }
      set_data(arrayOfByte1, arrayOfByte1.length);
      return get_buf();
      label199:
      break;
      i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t16b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */