package tencent.tls.platform;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tencent.tls.request.SigInfo;
import tencent.tls.request.Ticket;
import tencent.tls.request.TinyInfo.UserType;

public class TLSUserInfo
  implements Parcelable, Serializable
{
  protected static final Parcelable.Creator<TLSUserInfo> CREATOR = new TLSUserInfo.1();
  private static final long serialVersionUID = 1L;
  protected List<Ticket> _tickets = new ArrayList();
  public int accountType = 0;
  public int adminFlag = 0;
  protected long createTime;
  public String identifier;
  public boolean isGuest = false;
  protected long tinyid;
  public TinyInfo.UserType userType = TinyInfo.UserType.USER_TYPE_NORMAL;
  
  public TLSUserInfo() {}
  
  public TLSUserInfo(int paramInt, String paramString, long paramLong1, long paramLong2, TinyInfo.UserType paramUserType)
  {
    this.accountType = paramInt;
    this.identifier = paramString;
    this.tinyid = paramLong1;
    this.createTime = paramLong2;
    this.userType = paramUserType;
    if (paramUserType == TinyInfo.UserType.USER_TYPE_GUEST) {
      this.isGuest = true;
    }
  }
  
  private TLSUserInfo(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  private void readFromParcel(Parcel paramParcel)
  {
    this.identifier = paramParcel.readString();
    this.tinyid = paramParcel.readLong();
    paramParcel.readTypedList(this._tickets, Ticket.CREATOR);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void get_clone(SigInfo paramSigInfo)
  {
    this._tickets.clear();
    this._tickets.add(new Ticket(64, paramSigInfo._TGT, paramSigInfo._TGTKey, paramSigInfo._A2_create_time, paramSigInfo._A2_expire_time));
    this._tickets.add(new Ticket(262144, paramSigInfo._D2, paramSigInfo._D2Key, paramSigInfo._A2_create_time, paramSigInfo._A2_expire_time));
    this._tickets.add(new Ticket(268435456, paramSigInfo._TLS, null, paramSigInfo._TLS_create_time, paramSigInfo._TLS_expire_time));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.identifier);
    paramParcel.writeLong(this.tinyid);
    paramParcel.writeTypedList(this._tickets);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSUserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */