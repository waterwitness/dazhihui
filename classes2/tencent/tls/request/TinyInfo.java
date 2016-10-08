package tencent.tls.request;

import java.io.Serializable;

public class TinyInfo
  implements Serializable
{
  public static long GUEST_MAGIC = -1L;
  private static final long serialVersionUID = 1L;
  public int _acc_type;
  public long _msalt;
  public long _tinyid;
  public String _userid;
  public TinyInfo.UserType userType = TinyInfo.UserType.USER_TYPE_NORMAL;
  
  public TinyInfo(int paramInt, String paramString, long paramLong, TinyInfo.UserType paramUserType)
  {
    this._acc_type = paramInt;
    this._userid = paramString;
    this._tinyid = paramLong;
    this.userType = paramUserType;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\TinyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */