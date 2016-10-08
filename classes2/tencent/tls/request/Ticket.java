package tencent.tls.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import tencent.tls.tools.util;

public class Ticket
  implements Parcelable
{
  public static final Parcelable.Creator<Ticket> CREATOR = new Ticket.1();
  public long CreateTime;
  public long ExpireTime;
  public byte[] Sig;
  public byte[] SigKey;
  public int Type;
  protected Map<String, byte[]> _pskey_map = new HashMap();
  public int accountType;
  public String appidAt3rd;
  
  public Ticket() {}
  
  public Ticket(int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2)
  {
    this(paramInt1, paramArrayOfByte1, paramArrayOfByte2, paramLong1, paramLong2);
    this.accountType = paramInt2;
    this.appidAt3rd = paramString;
  }
  
  public Ticket(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2)
  {
    this.Type = paramInt;
    if (paramArrayOfByte1 == null)
    {
      paramArrayOfByte1 = new byte[0];
      this.Sig = paramArrayOfByte1;
      if (paramArrayOfByte2 != null) {
        break label70;
      }
    }
    label70:
    for (paramArrayOfByte1 = new byte[0];; paramArrayOfByte1 = (byte[])paramArrayOfByte2.clone())
    {
      this.SigKey = paramArrayOfByte1;
      this.CreateTime = paramLong1;
      this.ExpireTime = paramLong2;
      return;
      paramArrayOfByte1 = (byte[])paramArrayOfByte1.clone();
      break;
    }
  }
  
  protected Ticket(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2, byte[] paramArrayOfByte3)
  {
    this.Type = paramInt;
    if (paramArrayOfByte1 == null)
    {
      paramArrayOfByte1 = new byte[0];
      this.Sig = paramArrayOfByte1;
      if (paramArrayOfByte2 != null) {
        break label76;
      }
    }
    label76:
    for (paramArrayOfByte1 = new byte[0];; paramArrayOfByte1 = (byte[])paramArrayOfByte2.clone())
    {
      this.SigKey = paramArrayOfByte1;
      this.CreateTime = paramLong1;
      this.ExpireTime = paramLong2;
      parsePsBuf(paramArrayOfByte3);
      return;
      paramArrayOfByte1 = (byte[])paramArrayOfByte1.clone();
      break;
    }
  }
  
  private Ticket(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  private void parsePsBuf(byte[] paramArrayOfByte)
  {
    int k;
    int j;
    int i;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 2))
    {
      k = util.buf_to_int16(paramArrayOfByte, 0);
      j = 2;
      i = 0;
    }
    for (;;)
    {
      if ((i >= k) || (paramArrayOfByte.length < j + 2)) {}
      int m;
      String str;
      do
      {
        do
        {
          do
          {
            return;
            m = util.buf_to_int16(paramArrayOfByte, j);
            j += 2;
          } while (paramArrayOfByte.length < j + m);
          str = new String(paramArrayOfByte, j, m);
          m = j + m;
        } while (paramArrayOfByte.length < m + 2);
        j = util.buf_to_int16(paramArrayOfByte, m);
        m += 2;
      } while (paramArrayOfByte.length < m + j);
      byte[] arrayOfByte = new byte[j];
      System.arraycopy(paramArrayOfByte, m, arrayOfByte, 0, j);
      j = m + j;
      this._pskey_map.put(str, arrayOfByte);
      i += 1;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void readFromParcel(Parcel paramParcel)
  {
    this.Type = paramParcel.readInt();
    this.accountType = paramParcel.readInt();
    this.appidAt3rd = paramParcel.readString();
    this.Sig = paramParcel.createByteArray();
    this.SigKey = paramParcel.createByteArray();
    this.CreateTime = paramParcel.readLong();
    this.ExpireTime = paramParcel.readLong();
    this._pskey_map = paramParcel.readHashMap(Map.class.getClassLoader());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.Type);
    paramParcel.writeInt(this.accountType);
    paramParcel.writeString(this.appidAt3rd);
    paramParcel.writeByteArray(this.Sig);
    paramParcel.writeByteArray(this.SigKey);
    paramParcel.writeLong(this.CreateTime);
    paramParcel.writeLong(this.ExpireTime);
    paramParcel.writeMap(this._pskey_map);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\Ticket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */