package tencent.tls.request;

import tencent.tls.platform.TLSErrInfo;
import tencent.tls.tlvs.tlv_t;
import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tlvs.tlv_t105;
import tencent.tls.tlvs.tlv_t126;

public class async_context
{
  public long _appid = 0L;
  public TLSErrInfo _last_err_msg = new TLSErrInfo();
  public int _login_bitmap = 0;
  public int _main_sigmap = 0;
  public String _mpasswd = "";
  public long _msalt = 0L;
  public int _smslogin_expire = 0;
  public int _smslogin_reask = 0;
  public long _src_appid = 0L;
  public long _sub_appid = 0L;
  public tlv_t104 _t104 = new tlv_t104();
  public tlv_t105 _t105 = new tlv_t105();
  public tlv_t126 _t126 = new tlv_t126();
  public tlv_t _t174 = new tlv_t(372);
  public byte[] _tgtgt_key = new byte[16];
  public long _tinyid = 0L;
  public byte[] _tmp_no_pic_sig = new byte[0];
  public byte[] _tmp_pwd = new byte[16];
  public int _tmp_pwd_type = 0;
  public String _userid = "";
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\async_context.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */