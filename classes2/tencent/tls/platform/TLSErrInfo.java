package tencent.tls.platform;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import tencent.tls.tools.I18nMsg;
import tencent.tls.tools.I18nMsg.MSG_TYPE;

public class TLSErrInfo
  implements Parcelable
{
  public static final int ACCOUNT_FREQ_LIMIT = 3;
  public static final int ACCOUNT_INVALID_APPID = 11;
  public static final int ACCOUNT_INVALID_MOBILE = 4;
  public static final int ACCOUNT_INVALID_OPERATION = 13;
  public static final int ACCOUNT_INVALID_TOKEN = 7;
  public static final int ACCOUNT_JUST_FAILED = 5;
  public static final int ACCOUNT_NOT_EXIST = 1;
  public static final int ACCOUNT_OK = 0;
  public static final int ACCOUNT_REGISTERED = 2;
  public static final int ACCOUNT_REGISTER_TOOMANY = 10;
  public static final int ACCOUNT_RESET_TOOMANY = 6;
  public static final int ACCOUNT_SESSION_NOTFOUND = 9;
  public static final int ACCOUNT_SESSION_OPERATE_TOOMANY = 16;
  public static final int ACCOUNT_SESSION_VERIFY_TOOMANY = 17;
  public static final int ACCOUNT_SMSCODE_EXPIRED = 15;
  public static final int ACCOUNT_SMSCODE_INVALID = 14;
  public static final int ACCOUNT_SMSCODE_NOTALLOW = 8;
  public static final int ACCOUNT_WRONG_OPERATION = 12;
  protected static final Parcelable.Creator<TLSErrInfo> CREATOR = new TLSErrInfo.1();
  public static final int DECRYPT_FAILED = -1002;
  public static final int INPUT_INVALID = -1017;
  public static final int LOGIN_ID_INVALID = -1008;
  public static final int LOGIN_KEY_INVALID = -1014;
  public static final int LOGIN_NEED_IMGPIC = 2;
  public static final int LOGIN_NO_ACCOUNT = 229;
  public static final int LOGIN_NO_ID = -1003;
  public static final int LOGIN_NO_KEY = -1004;
  public static final int LOGIN_OK = 0;
  public static final int LOGIN_STORAGE_ERR = -1022;
  public static final int LOGIN_SYS_ERR = -1012;
  public static final int LOGIN_TLV_INVALID = -1005;
  public static final int LOGIN_WRONG_PWD = 1;
  public static final int LOGIN_WRONG_SMSCODE = 216;
  public static final int PENDING = -1001;
  public static final int PK_LEN = -1009;
  public static final int TIMEOUT = -1000;
  public int ErrCode;
  public String ExtraMsg = "";
  public String Msg;
  public String Title;
  
  public TLSErrInfo()
  {
    this.ErrCode = 0;
    this.Title = I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_0);
    this.Msg = I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_1);
  }
  
  public TLSErrInfo(int paramInt, String paramString1, String paramString2)
  {
    this.ErrCode = paramInt;
    if (paramString1 != null) {
      this.Title = paramString1;
    }
    if (paramString2 != null) {
      this.Msg = paramString2;
    }
  }
  
  public TLSErrInfo(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.ErrCode = paramInt;
    this.Title = paramString1;
    this.Msg = paramString2;
    this.ExtraMsg = paramString3;
  }
  
  private TLSErrInfo(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void readFromParcel(Parcel paramParcel)
  {
    this.ErrCode = paramParcel.readInt();
    this.Title = paramParcel.readString();
    this.Msg = paramParcel.readString();
    this.ExtraMsg = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.ErrCode);
    paramParcel.writeString(this.Title);
    paramParcel.writeString(this.Msg);
    paramParcel.writeString(this.ExtraMsg);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSErrInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */