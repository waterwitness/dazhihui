package tencent.tls.request;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import tencent.tls.platform.TLSErrInfo;
import tencent.tls.report.QLog;
import tencent.tls.tlvs.tlv_t;
import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tlvs.tlv_t105;
import tencent.tls.tlvs.tlv_t106;
import tencent.tls.tlvs.tlv_t113;
import tencent.tls.tlvs.tlv_t11f;
import tencent.tls.tlvs.tlv_t126;
import tencent.tls.tlvs.tlv_t130;
import tencent.tls.tlvs.tlv_t138;
import tencent.tls.tlvs.tlv_t146;
import tencent.tls.tlvs.tlv_t149;
import tencent.tls.tlvs.tlv_t150;
import tencent.tls.tlvs.tlv_t16a;
import tencent.tls.tlvs.tlv_t172;
import tencent.tls.tlvs.tlv_t183;
import tencent.tls.tlvs.tlv_t505;
import tencent.tls.tools.I18nMsg;
import tencent.tls.tools.I18nMsg.MSG_TYPE;
import tencent.tls.tools.cryptor;
import tencent.tls.tools.util;

public class oicq_request
{
  static final int ECDH_KEY = 0;
  static final int KC_KEY = 1;
  static String _save_host = "";
  static String[] _static_web_wlogin_ip;
  static String[] _static_wlogin_ip = { "183.62.104.188" };
  static int _test;
  static String _test_host;
  protected byte[] _buf = new byte[this._max];
  protected int _cmd = 0;
  protected int _default_client_seq = 0;
  protected int _default_client_version = 8002;
  protected int _default_ext_instance = 0;
  protected int _default_ext_no = 0;
  protected int _default_ext_retry = 0;
  protected int _default_ext_type = 2;
  protected int _default_ext_version = 3;
  protected int _default_ext_version1 = 0;
  public req_global _g;
  int _max = 4096;
  int _pos = 0;
  byte[] _recv_ret_buf = new byte['⠀'];
  int _rep_body_len = 0;
  int _req_head_len = 31;
  byte _ret;
  protected int _rsp_body_len = 0;
  public int _rsp_head_len = 19;
  InetSocketAddress _server_ip = null;
  int _server_port = 0;
  protected String _service_cmd = "";
  protected int _sub_cmd = 0;
  
  static
  {
    _static_web_wlogin_ip = new String[] { "183.62.104.188" };
    _test = 0;
    _test_host = "";
  }
  
  public static byte[] encrypt_a1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramArrayOfByte1.length, paramArrayOfByte2.length);
    return arrayOfByte;
  }
  
  public static void set_test(int paramInt, String paramString)
  {
    _test = paramInt;
    _test_host = paramString;
  }
  
  public byte[] decrypt_a1(byte[] paramArrayOfByte)
  {
    Object localObject;
    if ((req_global._IMEI_KEY == null) || (req_global._IMEI_KEY.length <= 0))
    {
      localObject = cryptor.decrypt(paramArrayOfByte, 0, paramArrayOfByte.length, "%4;7t>;28<fc.5*6".getBytes());
      if (localObject != null) {
        break label208;
      }
    }
    label208:
    for (paramArrayOfByte = (byte[])paramArrayOfByte.clone();; paramArrayOfByte = (byte[])localObject)
    {
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 16))
      {
        return null;
        localObject = new byte[16];
        if (req_global._IMEI_KEY.length > localObject.length) {
          System.arraycopy(req_global._IMEI_KEY, 0, localObject, 0, localObject.length);
        }
        for (;;)
        {
          arrayOfByte = cryptor.decrypt(paramArrayOfByte, 0, paramArrayOfByte.length, (byte[])localObject);
          if (arrayOfByte != null)
          {
            localObject = arrayOfByte;
            if (arrayOfByte.length > 0) {
              break;
            }
          }
          localObject = cryptor.decrypt(paramArrayOfByte, 0, paramArrayOfByte.length, "%4;7t>;28<fc.5*6".getBytes());
          break;
          System.arraycopy(req_global._IMEI_KEY, 0, localObject, 0, req_global._IMEI_KEY.length);
          i = req_global._IMEI_KEY.length;
          while (i < localObject.length)
          {
            localObject[i] = ((byte)(i + 1));
            i += 1;
          }
        }
      }
      int i = paramArrayOfByte.length - 16;
      localObject = new byte[i];
      System.arraycopy(paramArrayOfByte, 0, localObject, 0, i);
      byte[] arrayOfByte = new byte[16];
      System.arraycopy(paramArrayOfByte, i, arrayOfByte, 0, 16);
      req_global.get_async_data(this._g._seq)._tgtgt_key = arrayOfByte;
      return (byte[])localObject;
    }
  }
  
  public int decrypt_body(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = cryptor.decrypt(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2);
    if (paramArrayOfByte1 == null) {
      return 64534;
    }
    this._rsp_body_len = paramArrayOfByte1.length;
    if (paramArrayOfByte1.length + this._rsp_head_len + 2 > this._max)
    {
      this._max = (paramArrayOfByte1.length + this._rsp_head_len + 2);
      paramArrayOfByte2 = new byte[this._max];
      System.arraycopy(this._buf, 0, paramArrayOfByte2, 0, this._pos);
      this._buf = paramArrayOfByte2;
    }
    this._pos = 0;
    System.arraycopy(paramArrayOfByte1, 0, this._buf, paramInt1, paramArrayOfByte1.length);
    paramInt1 = this._pos;
    paramInt2 = this._rsp_head_len;
    this._pos = (paramArrayOfByte1.length + (paramInt2 + 2) + paramInt1);
    return 0;
  }
  
  byte[] ecdh_encrypt_body(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null) || (paramArrayOfByte3 == null) || (paramArrayOfByte4 == null)) {
      return new byte[0];
    }
    paramArrayOfByte1 = cryptor.encrypt(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte4);
    paramArrayOfByte4 = new byte[paramArrayOfByte2.length + 2 + 2 + 2 + paramArrayOfByte3.length + paramArrayOfByte1.length];
    util.int8_to_buf(paramArrayOfByte4, 0, 1);
    util.int8_to_buf(paramArrayOfByte4, 1, 1);
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte4, 2, paramArrayOfByte2.length);
    int i = paramArrayOfByte2.length + 2;
    util.int16_to_buf(paramArrayOfByte4, i, 258);
    i += 2;
    util.int16_to_buf(paramArrayOfByte4, i, paramArrayOfByte3.length);
    i += 2;
    System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte4, i, paramArrayOfByte3.length);
    i += paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte4, i, paramArrayOfByte1.length);
    i = paramArrayOfByte1.length;
    QLog.d("ecdh req body " + paramArrayOfByte4.length);
    return paramArrayOfByte4;
  }
  
  protected byte[] encrypt_body(byte[] paramArrayOfByte)
  {
    if (this._g._encrypt_type == 0) {
      return ecdh_encrypt_body(paramArrayOfByte, this._g._rand_key, this._g._pub_key, this._g._share_key);
    }
    return kc_encrypt_body(paramArrayOfByte, this._g._rand_key);
  }
  
  byte[] encrypt_body(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    QLog.i("subcmd 0x" + Integer.toHexString(paramInt1));
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + 4];
    util.int16_to_buf(arrayOfByte, 0, paramInt1);
    util.int16_to_buf(arrayOfByte, 2, paramInt2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    if (this._g._encrypt_type == 0) {
      return ecdh_encrypt_body(arrayOfByte, this._g._rand_key, this._g._pub_key, this._g._share_key);
    }
    return kc_encrypt_body(arrayOfByte, this._g._rand_key);
  }
  
  public void fill(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte, int paramInt8)
  {
    fill_head(paramInt1, paramInt2, paramInt3, paramLong, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
    fill_body(paramArrayOfByte, paramInt8);
    fill_end();
  }
  
  public void fill_body(byte[] paramArrayOfByte, int paramInt)
  {
    if (this._pos + paramInt + 1 > this._max)
    {
      this._max = (this._pos + paramInt + 1 + 128);
      byte[] arrayOfByte = new byte[this._max];
      System.arraycopy(this._buf, 0, arrayOfByte, 0, this._pos);
      this._buf = arrayOfByte;
    }
    System.arraycopy(paramArrayOfByte, 0, this._buf, this._pos, paramInt);
    this._pos += paramInt;
  }
  
  public void fill_end()
  {
    util.int8_to_buf(this._buf, this._pos, 3);
    this._pos += 1;
  }
  
  public void fill_head(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    paramInt3 = this._default_client_seq + 1;
    this._default_client_seq = paramInt3;
    this._pos = 0;
    util.int8_to_buf(this._buf, this._pos, 2);
    this._pos += 1;
    util.int16_to_buf(this._buf, this._pos, this._req_head_len + 2 + paramInt8);
    this._pos += 2;
    util.int16_to_buf(this._buf, this._pos, paramInt1);
    this._pos += 2;
    util.int16_to_buf(this._buf, this._pos, paramInt2);
    this._pos += 2;
    util.int16_to_buf(this._buf, this._pos, paramInt3);
    this._pos += 2;
    util.int64_to_buf(this._buf, this._pos, paramLong);
    this._pos += 8;
    util.int8_to_buf(this._buf, this._pos, 3);
    this._pos += 1;
    util.int8_to_buf(this._buf, this._pos, 7);
    this._pos += 1;
    util.int8_to_buf(this._buf, this._pos, paramInt4);
    this._pos += 1;
    util.int32_to_buf(this._buf, this._pos, paramInt5);
    this._pos += 4;
    util.int32_to_buf(this._buf, this._pos, paramInt6);
    this._pos += 4;
    util.int32_to_buf(this._buf, this._pos, paramInt7);
    this._pos += 4;
  }
  
  public byte[] get_buf()
  {
    byte[] arrayOfByte = new byte[this._pos];
    System.arraycopy(this._buf, 0, arrayOfByte, 0, this._pos);
    return arrayOfByte;
  }
  
  public void get_err_msg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    tlv_t146 localtlv_t146 = new tlv_t146();
    paramInt1 = localtlv_t146.get_tlv(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte = req_global.get_async_data(this._g._seq);
    if (paramInt1 >= 0)
    {
      paramArrayOfByte._last_err_msg = new TLSErrInfo(localtlv_t146.errType, localtlv_t146.errTitle, localtlv_t146.errMsg, localtlv_t146.extraErrMsg);
      QLog.i("t146 errtype: " + localtlv_t146.errType);
    }
  }
  
  public String get_host(boolean paramBoolean)
  {
    String[] arrayOfString = new String[2];
    if (paramBoolean)
    {
      arrayOfString[0] = "ida1.qq.com";
      arrayOfString[1] = "ida1.qq.com";
    }
    for (;;)
    {
      return arrayOfString[Math.abs(new java.util.Random().nextInt() % arrayOfString.length)];
      arrayOfString[0] = "ida.qq.com";
      arrayOfString[1] = "ida.qq.com";
    }
  }
  
  public int get_port(boolean paramBoolean)
  {
    if (paramBoolean) {}
    return 443;
  }
  
  public void get_request(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte)
  {
    fill(paramInt1, paramInt2, paramInt3, paramLong, paramInt4, paramInt5, paramInt6, paramInt7, paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public int get_response()
  {
    int i = this._pos;
    int j;
    if (i <= this._rsp_head_len + 2)
    {
      j = 64527;
      return j;
    }
    this._rsp_body_len = (i - this._rsp_head_len - 2);
    if (this._g._encrypt_type == 0)
    {
      j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._share_key);
      i = j;
      if (j < 0)
      {
        QLog.i("use ecdh decrypt_body failed");
        j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._rand_key);
        i = j;
        if (j < 0)
        {
          QLog.i("use kc decrypt_body failed");
          i = j;
        }
      }
    }
    for (;;)
    {
      j = i;
      if (i < 0) {
        break;
      }
      return get_response_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len);
      j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._rand_key);
      i = j;
      if (j < 0)
      {
        QLog.i("use kc decrypt_body failed");
        i = j;
      }
    }
  }
  
  public int get_response_body(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = 4294967295L;
    Object localObject4 = new tlv_t104();
    tlv_t105 localtlv_t105 = new tlv_t105();
    tlv_t113 localtlv_t113 = new tlv_t113();
    tlv_t localtlv_t6 = new tlv_t(281);
    tlv_t localtlv_t1 = new tlv_t(269);
    tlv_t localtlv_t2 = new tlv_t(266);
    Object localObject2 = new tlv_t130();
    tlv_t106 localtlv_t106 = new tlv_t106();
    tlv_t localtlv_t5 = new tlv_t(268);
    Object localObject1 = new tlv_t11f();
    new tlv_t138();
    Object localObject3 = new tlv_t149();
    tlv_t150 localtlv_t150 = new tlv_t150();
    tlv_t localtlv_t3 = new tlv_t(323);
    tlv_t localtlv_t4 = new tlv_t(773);
    tlv_t16a localtlv_t16a = new tlv_t16a();
    tlv_t localtlv_t7 = new tlv_t(353);
    tlv_t localtlv_t8 = new tlv_t(372);
    tlv_t126 localtlv_t126 = new tlv_t126();
    tlv_t505 localtlv_t505 = new tlv_t505();
    tlv_t183 localtlv_t183 = new tlv_t183();
    async_context localasync_context = req_global.get_async_data(this._g._seq);
    long l2 = localasync_context._src_appid;
    long l3 = localasync_context._appid;
    int i;
    switch (this._sub_cmd)
    {
    default: 
      paramInt2 = 64524;
      return paramInt2;
    case 9: 
      i = 0;
    }
    while (paramInt2 < 5)
    {
      return 64527;
      i = 5;
      continue;
      i = 6;
      continue;
      i = 7;
      continue;
      i = 0;
      continue;
      i = 8;
      continue;
      i = 0;
      continue;
      i = 9;
    }
    paramInt2 = get_response_ret_code(paramArrayOfByte, paramInt1 + 2);
    QLog.i("get_response_body type=" + paramInt2);
    int j = paramInt1 + 5;
    this._g._t150 = null;
    switch (paramInt2)
    {
    default: 
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      label554:
      localObject1 = new StringBuilder().append("ret:");
      if (paramInt1 <= 0) {
        break;
      }
    }
    for (paramArrayOfByte = "0x" + Integer.toHexString(paramInt1);; paramArrayOfByte = Integer.valueOf(paramInt1))
    {
      QLog.i(paramArrayOfByte, this._g._uin);
      localasync_context._last_err_msg.ErrCode = paramInt1;
      if (paramInt1 == 0)
      {
        set_err_msg(null);
        localasync_context._last_err_msg.ErrCode = 0;
      }
      if ((paramInt1 != 10) && (paramInt1 != 162) && (paramInt1 != 164) && (paramInt1 != 165) && (paramInt1 != 166) && (paramInt1 != 154))
      {
        paramInt2 = paramInt1;
        if (paramInt1 < 128) {
          break;
        }
        paramInt2 = paramInt1;
        if (paramInt1 > 143) {
          break;
        }
      }
      return 64536;
      if ((i == 7) || (i == 8))
      {
        if (i == 8)
        {
          paramInt2 = localtlv_t183.get_tlv(paramArrayOfByte, j, this._pos - j);
          paramInt1 = paramInt2;
          if (paramInt2 < 0) {
            break label554;
          }
          localasync_context._msalt = localtlv_t183.getMsalt();
          this._g.put_account(this._g._userid, this._g._uin);
        }
        paramInt2 = ((tlv_t104)localObject4).get_tlv(paramArrayOfByte, j, this._pos - j);
        paramInt1 = paramInt2;
        if (paramInt2 < 0) {
          break label554;
        }
        localasync_context._t104 = ((tlv_t104)localObject4);
        paramInt1 = 0;
        break label554;
      }
      if (i == 9)
      {
        if (localtlv_t113.get_tlv(paramArrayOfByte, j, this._pos - j) < 0)
        {
          paramInt1 = 64533;
          break label554;
        }
        this._g._uin = localtlv_t113.get_uin();
        localObject1 = new tlv_t(1286);
        if (((tlv_t)localObject1).get_tlv(paramArrayOfByte, j, this._pos - j) >= 0) {
          this._g._admin = util.buf_to_int32(((tlv_t)localObject1).get_data(), 0);
        }
        localObject2 = new tlv_t(274);
        paramInt1 = ((tlv_t)localObject2).get_tlv(paramArrayOfByte, j, this._pos - j);
        localObject1 = this._g._userid;
        if (paramInt1 >= 0) {
          localObject1 = new String(((tlv_t)localObject2).get_data());
        }
        this._g.put_open_account(this._g._userid, (String)localObject1, this._g._uin);
        this._g._userid = ((String)localObject1);
        localtlv_t2.get_tlv(paramArrayOfByte, j, this._pos - j);
        localtlv_t3.get_tlv(paramArrayOfByte, j, this._pos - j);
        localtlv_t4.get_tlv(paramArrayOfByte, j, this._pos - j);
        l1 = req_global.get_cur_time();
        paramArrayOfByte = new ArrayList();
        paramArrayOfByte.add(new Ticket(64, localtlv_t2.get_data(), localtlv_t1.get_data(), l1, 2160000L + l1));
        paramArrayOfByte.add(new Ticket(262144, localtlv_t3.get_data(), localtlv_t4.get_data(), l1, l1 + 1728000L));
        localObject1 = this._g;
        l4 = this._g._uin;
        paramInt1 = localasync_context._login_bitmap;
        ((req_global)localObject1).put_siginfo(l4, l2, new byte[0], new byte[0], l3, 4294967295L, l1, paramArrayOfByte, paramInt1);
        paramInt1 = 0;
        break label554;
      }
      if (i == 0)
      {
        if (localtlv_t113.get_tlv(paramArrayOfByte, j, this._pos - j) < 0)
        {
          paramInt1 = 64533;
          break label554;
        }
        this._g._uin = localtlv_t113.get_uin();
        this._g.put_account(this._g._userid, this._g._uin);
      }
      if (localtlv_t150.get_tlv(paramArrayOfByte, j, this._pos - j - 1) >= 0) {
        this._g._t150 = localtlv_t150;
      }
      if (localtlv_t7.get_tlv(paramArrayOfByte, j, this._pos - j - 1) >= 0)
      {
        parse_t161(localtlv_t7);
        QLog.d("parse t161 called");
      }
      paramInt1 = localtlv_t6.get_tlv(paramArrayOfByte, j, this._pos - j - 1, localasync_context._tgtgt_key);
      if (paramInt1 < 0)
      {
        QLog.d("119 can not decrypt");
        break label554;
      }
      localObject4 = localtlv_t6.get_data();
      paramInt1 = localObject4.length;
      if (((tlv_t149)localObject3).get_tlv((byte[])localObject4, 2, paramInt1) > 0) {
        show_alert_dialog((tlv_t149)localObject3);
      }
      if (((tlv_t130)localObject2).get_tlv((byte[])localObject4, 2, paramInt1) > 0) {
        this._g.set_time_ip(((tlv_t130)localObject2).get_time(), ((tlv_t130)localObject2).get_ipaddr());
      }
      localtlv_t2.get_tlv((byte[])localObject4, 2, paramInt1);
      localtlv_t1.get_tlv((byte[])localObject4, 2, paramInt1);
      localtlv_t3.get_tlv((byte[])localObject4, 2, paramInt1);
      localtlv_t4.get_tlv((byte[])localObject4, 2, paramInt1);
      localObject3 = new tlv_t(1283);
      ((tlv_t)localObject3).get_tlv((byte[])localObject4, 2, paramInt1);
      if (((tlv_t11f)localObject1).get_tlv((byte[])localObject4, 2, paramInt1) >= 0) {
        l1 = ((tlv_t11f)localObject1).get_tk_pri() & 0xFFFFFFFF;
      }
      QLog.i("sdkAppid:" + localasync_context._appid + " tk_valid:" + 2160000L + " a2_valid:" + 2160000L, this._g._uin);
      localObject2 = new byte[0];
      localObject1 = new byte[0];
      paramInt2 = localtlv_t5.get_tlv((byte[])localObject4, 2, paramInt1);
      paramArrayOfByte = (byte[])localObject2;
      if (localtlv_t106.get_tlv((byte[])localObject4, 2, paramInt1) >= 0)
      {
        paramArrayOfByte = (byte[])localObject2;
        if (paramInt2 >= 0)
        {
          paramArrayOfByte = localtlv_t5.get_data();
          paramArrayOfByte = encrypt_a1(localtlv_t106.get_data(), paramArrayOfByte);
        }
      }
      if (localtlv_t16a.get_tlv((byte[])localObject4, 2, paramInt1) >= 0) {
        localObject1 = localtlv_t16a.get_data();
      }
      long l4 = req_global.get_cur_time();
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).add(new Ticket(64, localtlv_t2.get_data(), localtlv_t1.get_data(), l4, 2160000L + l4));
      ((ArrayList)localObject2).add(new Ticket(262144, localtlv_t3.get_data(), localtlv_t4.get_data(), l4, l4 + 1728000L));
      ((ArrayList)localObject2).add(new Ticket(268435456, ((tlv_t)localObject3).get_data(), null, l4, l4 + 2160000L));
      paramInt1 = this._g.put_siginfo(this._g._uin, l2, paramArrayOfByte, (byte[])localObject1, l3, l1, l4, (ArrayList)localObject2, localasync_context._login_bitmap);
      if (paramInt1 != 0)
      {
        paramArrayOfByte = new TLSErrInfo();
        paramArrayOfByte.ErrCode = paramInt1;
        paramArrayOfByte.Msg = I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_2);
        set_err_msg(paramArrayOfByte);
        QLog.i("put_siginfo fail,ret=", this._g._uin);
        break label554;
      }
      paramInt1 = 0;
      break label554;
      this._g.clear_sig(this._g._uin, l2);
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      break label554;
      paramInt1 = ((tlv_t104)localObject4).get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      localasync_context._t104 = ((tlv_t104)localObject4);
      paramInt1 = localtlv_t105.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      localasync_context._t105 = localtlv_t105;
      localObject1 = new tlv_t(1284);
      if (((tlv_t)localObject1).get_tlv(paramArrayOfByte, j, this._pos - j - 1) >= 0) {
        QLog.i("got t504");
      }
      set_err_msg(new TLSErrInfo(paramInt2, null, new String(((tlv_t)localObject1).get_data())));
      paramInt1 = paramInt2;
      break label554;
      paramInt1 = ((tlv_t130)localObject2).get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      this._g.set_time_ip(((tlv_t130)localObject2).get_time(), ((tlv_t130)localObject2).get_ipaddr());
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      break label554;
      paramInt1 = ((tlv_t104)localObject4).get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      localasync_context._t104 = ((tlv_t104)localObject4);
      paramInt1 = localtlv_t8.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      localasync_context._t174 = localtlv_t8;
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      break label554;
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      this._g.remove_account(this._g._userid);
      this._g.clear_sig(this._g._uin, 0L);
      paramInt1 = paramInt2;
      break label554;
      paramInt1 = localtlv_t7.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      if (paramInt1 < 0) {
        break label554;
      }
      parse_t161(localtlv_t7);
      QLog.d("0xb4 parse t161 called");
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      break label554;
      paramInt2 = ((tlv_t104)localObject4).get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        break label554;
      }
      localasync_context._t104 = ((tlv_t104)localObject4);
      paramInt2 = localtlv_t126.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        break label554;
      }
      localasync_context._t126 = localtlv_t126;
      paramInt2 = localtlv_t505.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        break label554;
      }
      localasync_context._smslogin_reask = localtlv_t505.getReask();
      localasync_context._smslogin_expire = localtlv_t505.getExpire();
      QLog.i("reask: " + localasync_context._smslogin_reask + ", expire: " + localasync_context._smslogin_expire);
      paramInt2 = localtlv_t183.get_tlv(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        break label554;
      }
      localasync_context._msalt = localtlv_t183.getMsalt();
      paramInt1 = 0;
      break label554;
      get_err_msg(paramArrayOfByte, j, this._pos - j - 1);
      paramInt1 = localasync_context._last_err_msg.ErrCode;
      break label554;
    }
  }
  
  public int get_response_ret_code(byte[] paramArrayOfByte, int paramInt)
  {
    this._ret = paramArrayOfByte[paramInt];
    return paramArrayOfByte[paramInt] & 0xFF;
  }
  
  public int get_rsp_length(byte[] paramArrayOfByte)
  {
    return util.buf_to_int16(paramArrayOfByte, 1);
  }
  
  public Socket get_sk()
  {
    if (this._g._sk != null) {
      QLog.d("_sk" + this._g._sk.toString());
    }
    for (;;)
    {
      return this._g._sk;
      QLog.d("_sknull");
    }
  }
  
  public String get_static_ip(boolean paramBoolean)
  {
    if (paramBoolean) {
      return _static_web_wlogin_ip[((int)(Math.random() * 2.147483647E9D) % _static_web_wlogin_ip.length)];
    }
    return _static_wlogin_ip[((int)(Math.random() * 2.147483647E9D) % _static_wlogin_ip.length)];
  }
  
  byte[] kc_encrypt_body(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return kc_encrypt_body(paramArrayOfByte1, paramArrayOfByte2, 2);
  }
  
  byte[] kc_encrypt_body(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
      return new byte[0];
    }
    paramArrayOfByte1 = cryptor.encrypt(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2);
    byte[] arrayOfByte = new byte[paramArrayOfByte2.length + 2 + 2 + 2 + paramArrayOfByte1.length];
    util.int8_to_buf(arrayOfByte, 0, 1);
    util.int8_to_buf(arrayOfByte, 1, paramInt);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, 2, paramArrayOfByte2.length);
    paramInt = paramArrayOfByte2.length + 2;
    util.int16_to_buf(arrayOfByte, paramInt, 258);
    paramInt += 2;
    util.int16_to_buf(arrayOfByte, paramInt, 0);
    paramInt += 2;
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, paramInt, paramArrayOfByte1.length);
    paramInt = paramArrayOfByte1.length;
    QLog.d("kc req body " + arrayOfByte.length);
    return arrayOfByte;
  }
  
  public int parse_t161(tlv_t paramtlv_t)
  {
    tlv_t localtlv_t = new tlv_t(371);
    tlv_t172 localtlv_t172 = new tlv_t172();
    paramtlv_t = paramtlv_t.get_data();
    int i = paramtlv_t.length;
    if (localtlv_t.get_tlv(paramtlv_t, 2, i) > 0) {
      parse_t173(localtlv_t);
    }
    if (localtlv_t172.get_tlv(paramtlv_t, 2, i) > 0)
    {
      this._g._encrypt_type = 1;
      this._g._t172_data = localtlv_t172.get_data();
      QLog.i("get rollback sig");
    }
    return 0;
  }
  
  public int parse_t173(tlv_t paramtlv_t)
  {
    paramtlv_t = paramtlv_t.get_data();
    int k;
    int j;
    int i;
    if ((paramtlv_t != null) && (paramtlv_t.length > 2))
    {
      k = util.buf_to_int8(paramtlv_t, 1);
      j = 2;
      i = 0;
    }
    for (;;)
    {
      if ((i >= k) || (paramtlv_t.length < j + 1)) {}
      int m;
      byte[] arrayOfByte;
      do
      {
        do
        {
          do
          {
            return 0;
            m = util.buf_to_int8(paramtlv_t, j);
            n = j + 1;
          } while (paramtlv_t.length < n + 2);
          j = util.buf_to_int16(paramtlv_t, n);
          n += 2;
        } while (paramtlv_t.length < n + j);
        arrayOfByte = new byte[j];
        System.arraycopy(paramtlv_t, n, arrayOfByte, 0, j);
        j = n + j;
      } while (paramtlv_t.length < j + 2);
      int n = util.buf_to_int16(paramtlv_t, j);
      j += 2;
      set_server_host(m, arrayOfByte, n);
      i += 1;
    }
  }
  
  public String resolve_server_addr(int paramInt, boolean paramBoolean)
  {
    String str1 = "";
    paramInt /= 2;
    String str2;
    if ((_test != 0) && (_test_host != null) && (_test_host.length() > 0)) {
      str2 = _test_host;
    }
    for (;;)
    {
      _save_host = str2;
      QLog.d("resolve_server_addr OK host:" + str2 + " tryno:" + paramInt);
      return str2;
      if (paramInt < 1)
      {
        if (paramBoolean) {
          if (req_global._network_type == 1) {
            str1 = util.get_server_host(req_global._context, "wap-host1");
          }
        }
        for (;;)
        {
          if (str1 != null)
          {
            str2 = str1;
            if (str1.length() > 0) {
              break;
            }
          }
          str2 = get_host(paramBoolean);
          break;
          if (req_global._network_type == 2)
          {
            str1 = util.get_server_host(req_global._context, "wap-host2");
            continue;
            if (req_global._network_type == 1) {
              str1 = util.get_server_host(req_global._context, "host1");
            } else if (req_global._network_type == 2) {
              str1 = util.get_server_host(req_global._context, "host2");
            }
          }
        }
      }
      if (paramInt < 2) {
        str2 = get_host(paramBoolean);
      } else {
        str2 = get_static_ip(paramBoolean);
      }
    }
  }
  
  public void set_buf(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt > this._max)
    {
      this._max = (paramInt + 128);
      this._buf = new byte[this._max];
    }
    this._pos = paramInt;
    System.arraycopy(paramArrayOfByte, 0, this._buf, 0, paramInt);
  }
  
  public void set_err_msg(TLSErrInfo paramTLSErrInfo)
  {
    async_context localasync_context = req_global.get_async_data(this._g._seq);
    if (paramTLSErrInfo != null)
    {
      localasync_context._last_err_msg = paramTLSErrInfo;
      return;
    }
    localasync_context._last_err_msg = new TLSErrInfo();
  }
  
  void set_server_host(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return;
    }
    if (paramInt1 == 1) {
      if (req_global._network_type == 1) {
        util.set_server_host(req_global._context, paramArrayOfByte, "host1");
      }
    }
    for (;;)
    {
      QLog.i("net type:" + req_global._network_type + " type:" + paramInt1 + " host:" + new String(paramArrayOfByte) + " port:" + paramInt2, this._g._uin);
      return;
      if (req_global._network_type == 2)
      {
        util.set_server_host(req_global._context, paramArrayOfByte, "host2");
        continue;
        if (paramInt1 == 2) {
          if (req_global._network_type == 1) {
            util.set_server_host(req_global._context, paramArrayOfByte, "wap-host1");
          } else if (req_global._network_type == 2) {
            util.set_server_host(req_global._context, paramArrayOfByte, "wap-host2");
          }
        }
      }
    }
  }
  
  public void set_sk(Socket paramSocket)
  {
    this._g._sk = paramSocket;
  }
  
  public void show_alert_dialog(tlv_t149 paramtlv_t149)
  {
    if (paramtlv_t149 != null) {}
    try
    {
      paramtlv_t149 = new TLSErrInfo(paramtlv_t149.get_type(), paramtlv_t149.get_title(), paramtlv_t149.get_content(), paramtlv_t149.get_otherinfo());
      new alert_thread(req_global._context, paramtlv_t149).start();
      return;
    }
    catch (Exception paramtlv_t149) {}
  }
  
  public int snd_rcv_req()
  {
    if (this._g._use_sso_channel) {}
    for (int i = snd_rcv_req_sso();; i = snd_rcv_req_tcp())
    {
      if (i == 64536)
      {
        TLSErrInfo localTLSErrInfo = new TLSErrInfo();
        localTLSErrInfo.ErrCode = i;
        localTLSErrInfo.Msg = I18nMsg.getMsg(I18nMsg.MSG_TYPE.MSG_4);
        set_err_msg(localTLSErrInfo);
      }
      return i;
    }
  }
  
  public int snd_rcv_req_sso()
  {
    int i = 64536;
    QLog.i(getClass().getName() + ":snd_rcv_req_sso ...", this._g._uin);
    int j = this._g._time_out;
    Object localObject = get_buf();
    for (;;)
    {
      try
      {
        QLog.i("SSORunner service_cmd:" + this._service_cmd + " timeout:" + j, this._g._uin);
        localObject = new SSORunner(this._service_cmd, (byte[])localObject, j);
        ((SSORunner)localObject).run();
        arrayOfByte = ((SSORunner)localObject).getResData();
        if (arrayOfByte != null) {
          continue;
        }
        QLog.i("recv data from server failed, ret=" + ((SSORunner)localObject).getRet(), this._g._uin);
      }
      catch (Exception localException)
      {
        byte[] arrayOfByte;
        QLog.e(localException);
        continue;
      }
      QLog.i(getClass().getName() + ":snd_rcv_req_sso ret=" + i, this._g._uin);
      return i;
      set_buf(arrayOfByte, arrayOfByte.length);
      i = 0;
    }
  }
  
  public int snd_rcv_req_tcp()
  {
    QLog.i(getClass().getName() + ":snd_rcv_req_tcp ...", this._g._uin);
    byte[] arrayOfByte = get_buf();
    Socket localSocket = get_sk();
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = j;
      Object localObject2;
      if (i < 6)
      {
        if (i != 0) {
          util.chg_retry_type(req_global._context);
        }
        util.is_wap_retry(req_global._context);
        this._server_ip = null;
        QLog.i("try bin connect " + i + " ...", this._g._uin);
        if (localSocket == null)
        {
          localObject2 = "";
          if (this._server_ip == null)
          {
            localObject2 = resolve_server_addr(i, false);
            QLog.i("DNS for " + (String)localObject2 + " request ...", this._g._uin);
          }
        }
      }
      try
      {
        this._server_port = get_port(false);
        this._server_ip = DNS_resolver.get_DNS_resolver((String)localObject2, this._server_port, this._g._time_out);
        if (this._server_ip == null)
        {
          QLog.i("DNS for " + (String)localObject2 + " request failed", this._g._uin);
          i += 1;
          this._server_ip = null;
          set_sk(null);
          localSocket = null;
          continue;
        }
        QLog.i("DNS for " + (String)localObject2 + "(" + this._server_ip.toString() + ") request OK", this._g._uin);
        if (localSocket == null)
        {
          Object localObject1;
          for (;;)
          {
            try
            {
              QLog.i("tcp connect to " + this._server_ip + " request ...", this._g._uin);
              localSocket = new Socket();
              set_sk(localSocket);
              localSocket.connect(this._server_ip, this._g._time_out);
              localSocket.setSoTimeout(this._g._time_out);
              localSocket.setReceiveBufferSize(this._recv_ret_buf.length);
              QLog.i("tcp connect to " + this._server_ip + " OK", this._g._uin);
              QLog.i("tcp request write ...", this._g._uin);
              localObject2 = localSocket.getOutputStream();
              ((OutputStream)localObject2).write(arrayOfByte, 0, arrayOfByte.length);
              ((OutputStream)localObject2).flush();
              localObject2 = localSocket.getInputStream();
              k = i;
              m = j;
            }
            catch (Exception localException1)
            {
              try
              {
                QLog.i("recv data from server ...", this._g._uin);
                n = 0;
                i1 = 0;
                k = i;
                m = j;
                if (i1 < this._rsp_head_len + 1)
                {
                  k = i;
                  m = j;
                  n = ((InputStream)localObject2).read(this._recv_ret_buf, i1, this._rsp_head_len + 1 - i1);
                  if (n >= 0) {}
                }
                else
                {
                  if (n >= 0) {
                    break label668;
                  }
                  n = i + 1;
                  k = n;
                  m = j;
                  localSocket.close();
                  k = n;
                  m = j;
                  this._server_ip = null;
                  i = n;
                  k = j;
                }
              }
              catch (Exception localException4)
              {
                int m;
                int n;
                int i1;
                int i2;
                j = m;
                i = k;
                localObject2 = localObject1;
                localObject1 = localException4;
              }
              try
              {
                set_sk(null);
                localSocket = null;
                i = n;
              }
              catch (Exception localException3)
              {
                for (;;)
                {
                  localObject2 = null;
                  j = k;
                }
              }
              localException1 = localException1;
              QLog.e(localException1);
              i += 1;
              this._server_ip = null;
              set_sk(null);
              localObject1 = null;
            }
            break;
            i1 += n;
          }
          label668:
          k = i;
          m = j;
          j = get_rsp_length(this._recv_ret_buf);
          k = i;
          m = j;
          if (j <= this._rsp_head_len + 1)
          {
            n = i + 1;
            k = n;
            m = j;
            ((Socket)localObject1).close();
            k = n;
            m = j;
            this._server_ip = null;
            i = n;
            k = j;
            set_sk(null);
            localObject1 = null;
            i = n;
            continue;
          }
          k = i;
          m = j;
          if (j >= this._recv_ret_buf.length)
          {
            n = i + 1;
            k = n;
            m = j;
            ((Socket)localObject1).close();
            k = n;
            m = j;
            this._server_ip = null;
            i = n;
            k = j;
            set_sk(null);
            localObject1 = null;
            i = n;
            continue;
          }
          k = i;
          m = j;
          i2 = this._rsp_head_len + 1;
          i1 = j - i2;
          for (;;)
          {
            if (i1 > 0)
            {
              k = i;
              m = j;
              n = ((InputStream)localObject2).read(this._recv_ret_buf, i2, i1);
              if (n != -1) {}
            }
            else
            {
              k = j;
              if (n != -1) {
                break label1014;
              }
              n = i + 1;
              k = n;
              m = j;
              ((Socket)localObject1).close();
              k = n;
              m = j;
              this._server_ip = null;
              i = n;
              k = j;
              set_sk(null);
              localObject1 = null;
              i = n;
              break;
            }
            i2 += n;
            i1 -= n;
          }
          QLog.e((Throwable)localObject1);
          i += 1;
          try
          {
            if (((Socket)localObject2).isConnected()) {
              ((Socket)localObject2).close();
            }
            this._server_ip = null;
            set_sk(null);
            localObject1 = null;
            continue;
            label1014:
            if (i >= 6) {}
            for (i = 64536;; i = 0)
            {
              if (i == 0) {
                set_buf(this._recv_ret_buf, k);
              }
              QLog.i(getClass().getName() + ":snd_rcv_req_tcp ret=" + i, this._g._uin);
              return i;
            }
          }
          catch (Exception localException2)
          {
            for (;;) {}
          }
        }
      }
      catch (Exception localException5)
      {
        for (;;) {}
      }
    }
  }
  
  public String toString()
  {
    String str = "";
    int i = 0;
    while (i < this._pos)
    {
      str = str + Integer.toHexString(this._buf[i] >> 4 & 0xF);
      str = str + Integer.toHexString(this._buf[i] & 0xF);
      i += 1;
    }
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\oicq_request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */