package tencent.tls.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import tencent.tls.report.QLog;

public class SigInfo
  implements Parcelable, Serializable
{
  protected static final Parcelable.Creator<SigInfo> CREATOR = new SigInfo.1();
  private static final long serialVersionUID = 1L;
  public long _A1_create_time = 0L;
  public long _A2_create_time = 0L;
  public long _A2_expire_time = 0L;
  public byte[] _D2 = new byte[0];
  public byte[] _D2Key = new byte[0];
  public long _D2_create_time = 0L;
  public long _D2_expire_time = 0L;
  public byte[] _TGT = new byte[0];
  public byte[] _TGTKey = new byte[0];
  public byte[] _TLS = new byte[0];
  public long _TLS_create_time = 0L;
  public long _TLS_expire_time = 0L;
  public byte[] _access_token = new byte[0];
  public long _app_pri = 0L;
  public byte[] _en_A1 = new byte[0];
  public int _login_bitmap = 0;
  public byte[] _noPicSig = new byte[0];
  public int accountType = 0;
  public String appidAt3rd;
  public byte[] openid = new byte[0];
  
  public SigInfo(long paramLong1, long paramLong2, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    SetSigInfo(paramLong1, paramLong2, paramArrayList, paramInt);
  }
  
  private SigInfo(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  public SigInfo Set(long paramLong1, long paramLong2, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    SetSigInfo(paramLong1, paramLong2, paramArrayList, paramInt);
    return this;
  }
  
  public SigInfo Set(byte[][] paramArrayOfByte, long paramLong)
  {
    try
    {
      this._en_A1 = ((byte[])paramArrayOfByte[0].clone());
      this._A1_create_time = paramLong;
      this._noPicSig = ((byte[])paramArrayOfByte[1].clone());
      return this;
    }
    catch (Exception paramArrayOfByte)
    {
      QLog.e(paramArrayOfByte);
    }
    return this;
  }
  
  public void SetSigInfo(long paramLong1, long paramLong2, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    this._app_pri = paramLong1;
    this._login_bitmap |= paramInt;
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Ticket localTicket = (Ticket)paramArrayList.next();
      if ((localTicket.Sig != null) && (localTicket.Sig.length != 0)) {
        switch (localTicket.Type)
        {
        default: 
          break;
        case 64: 
          this._A2_create_time = localTicket.CreateTime;
          this._A2_expire_time = localTicket.ExpireTime;
          this._TGT = localTicket.Sig;
          this._TGTKey = localTicket.SigKey;
          break;
        case 262144: 
          this._D2_create_time = localTicket.CreateTime;
          this._D2_expire_time = localTicket.ExpireTime;
          this._D2 = localTicket.Sig;
          this._D2Key = localTicket.SigKey;
          break;
        case 268435456: 
          this._TLS_create_time = localTicket.CreateTime;
          this._TLS_expire_time = localTicket.ExpireTime;
          this._TLS = localTicket.Sig;
          break;
        case 305419896: 
          this._access_token = localTicket.Sig;
          this.openid = localTicket.SigKey;
          this.accountType = localTicket.accountType;
          this.appidAt3rd = localTicket.appidAt3rd;
        }
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void readFromParcel(Parcel paramParcel)
  {
    this._en_A1 = paramParcel.createByteArray();
    this._noPicSig = paramParcel.createByteArray();
    this._TGT = paramParcel.createByteArray();
    this._TGTKey = paramParcel.createByteArray();
    this._D2 = paramParcel.createByteArray();
    this._D2Key = paramParcel.createByteArray();
    this._TLS = paramParcel.createByteArray();
    this.openid = paramParcel.createByteArray();
    this._access_token = paramParcel.createByteArray();
    this.accountType = paramParcel.readInt();
    this.appidAt3rd = paramParcel.readString();
    this._A1_create_time = paramParcel.readLong();
    this._A2_create_time = paramParcel.readLong();
    this._D2_create_time = paramParcel.readLong();
    this._TLS_create_time = paramParcel.readLong();
    this._A2_expire_time = paramParcel.readLong();
    this._D2_expire_time = paramParcel.readLong();
    this._TLS_expire_time = paramParcel.readLong();
    this._login_bitmap = paramParcel.readInt();
    this._app_pri = paramParcel.readLong();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this._en_A1);
    paramParcel.writeByteArray(this._noPicSig);
    paramParcel.writeByteArray(this._TGT);
    paramParcel.writeByteArray(this._TGTKey);
    paramParcel.writeByteArray(this._D2);
    paramParcel.writeByteArray(this._D2Key);
    paramParcel.writeByteArray(this._TLS);
    paramParcel.writeByteArray(this.openid);
    paramParcel.writeByteArray(this._access_token);
    paramParcel.writeInt(this.accountType);
    paramParcel.writeString(this.appidAt3rd);
    paramParcel.writeLong(this._A1_create_time);
    paramParcel.writeLong(this._A2_create_time);
    paramParcel.writeLong(this._D2_create_time);
    paramParcel.writeLong(this._TLS_create_time);
    paramParcel.writeLong(this._A2_expire_time);
    paramParcel.writeLong(this._D2_expire_time);
    paramParcel.writeLong(this._TLS_expire_time);
    paramParcel.writeInt(this._login_bitmap);
    paramParcel.writeLong(this._app_pri);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\SigInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */