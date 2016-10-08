package tencent.tls.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.math.BigInteger;
import java.net.Socket;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;
import tencent.tls.tlvs.tlv_t150;
import tencent.tls.tools.MD5;
import tencent.tls.tools.util;

public class req_global
{
  public static byte[] _IMEI;
  static byte[] _IMEI_KEY;
  public static SecureRandom _SR = new SecureRandom();
  public static int _acc_type = 0;
  public static account_sig_info_map _account_sig_info_map;
  public static int _android_sdk;
  public static byte[] _apk_id;
  static byte[] _apk_sig;
  static byte[] _apk_v;
  public static byte[] _apn;
  static int _app_client_version;
  public static TreeMap<Long, async_context> _async_data = new TreeMap();
  static byte[] _brand;
  public static Context _context = null;
  public static long _cur_sequence;
  static int _dev_chg;
  static int _dev_report;
  static byte[] _device;
  static int _guid_chg;
  static int _guid_src;
  static int _img_type;
  public static byte[] _ip_addr;
  static int _isroot;
  public static long _l_init_time;
  public static String _last_date;
  public static int _local_id = 2052;
  static byte[] _mac;
  public static int _network_type;
  static int _new_install;
  public static int _pic_type;
  static int _read_guid;
  static byte[] _sim_operator_name;
  static long _time_difference;
  private static final Object data_lock;
  public static long sdkappid;
  public int _admin = 0;
  public int _cancel = 0;
  public int _encrypt_type = 0;
  public byte[] _pub_key = new byte[16];
  public byte[] _rand_key = new byte[16];
  public long _seq = 0L;
  public byte[] _share_key = new byte[16];
  Socket _sk = null;
  public int _sso_seq = 0;
  public tlv_t150 _t150 = null;
  public byte[] _t172_data = new byte[0];
  public byte[] _tgt_key = null;
  public int _time_out = 10000;
  Socket _transport_sk = null;
  public long _uin = 0L;
  public boolean _use_sso_channel = true;
  public String _userid = "";
  
  static
  {
    _last_date = "";
    _app_client_version = 0;
    _img_type = 1;
    _pic_type = 0;
    _IMEI = new byte[0];
    _IMEI_KEY = new byte[0];
    _sim_operator_name = new byte[0];
    _network_type = 0;
    _apk_id = new byte[0];
    _apn = new byte[0];
    _mac = new byte[0];
    _apk_v = new byte[0];
    _apk_sig = new byte[0];
    _device = new byte[0];
    _brand = new byte[0];
    _new_install = 0;
    _read_guid = 0;
    _guid_chg = 0;
    _guid_src = 0;
    _dev_chg = 0;
    _dev_report = 0;
    _isroot = 0;
    _time_difference = 0L;
    _l_init_time = 0L;
    _ip_addr = new byte[4];
    data_lock = new Object();
    _account_sig_info_map = null;
    _cur_sequence = 0L;
  }
  
  public req_global(Context paramContext) {}
  
  public static long allocSequence()
  {
    try
    {
      if (_cur_sequence > 200L) {
        _cur_sequence = 0L;
      }
      long l = _cur_sequence + 1L;
      _cur_sequence = l;
      return l;
    }
    finally {}
  }
  
  public static void clear_sdk_log()
  {
    try
    {
      String str = new SimpleDateFormat("yyyyMMdd").format(new Date());
      if (str.compareTo(_last_date) != 0)
      {
        _last_date = str;
        new delete_expire_log(_context).start();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static void dev_compare()
  {
    Object localObject2 = util.get_mac_addr(_context);
    Object localObject1 = localObject2;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > 0) {
        localObject1 = MD5.toMD5Byte((byte[])localObject2);
      }
    }
    Object localObject3 = util.get_imei_id(_context);
    localObject2 = localObject3;
    if (localObject3 != null)
    {
      localObject2 = localObject3;
      if (localObject3.length > 0) {
        localObject2 = MD5.toMD5Byte((byte[])localObject3);
      }
    }
    byte[] arrayOfByte1 = util.get_IMEI(_context);
    localObject3 = arrayOfByte1;
    if (arrayOfByte1 != null)
    {
      localObject3 = arrayOfByte1;
      if (arrayOfByte1.length > 0) {
        localObject3 = MD5.toMD5Byte(arrayOfByte1);
      }
    }
    if (util.get_last_flag(_context) != 0)
    {
      arrayOfByte1 = util.get_last_mac(_context);
      byte[] arrayOfByte2 = util.get_last_imei(_context);
      byte[] arrayOfByte3 = util.get_last_guid(_context);
      if (!Arrays.equals((byte[])localObject1, arrayOfByte1)) {
        _dev_chg |= 0x1;
      }
      if (!Arrays.equals((byte[])localObject2, arrayOfByte2)) {
        _dev_chg |= 0x2;
      }
      if (!Arrays.equals((byte[])localObject3, arrayOfByte3)) {
        _dev_chg |= 0x4;
      }
    }
    util.save_cur_flag(_context, 1);
    util.save_cur_mac(_context, (byte[])localObject1);
    util.save_cur_imei(_context, (byte[])localObject2);
    util.save_cur_guid(_context, (byte[])localObject3);
  }
  
  public static async_context get_async_data(long paramLong)
  {
    synchronized (data_lock)
    {
      async_context localasync_context2 = (async_context)_async_data.get(Long.valueOf(paramLong));
      async_context localasync_context1 = localasync_context2;
      if (localasync_context2 == null)
      {
        localasync_context1 = new async_context();
        _async_data.put(Long.valueOf(paramLong), localasync_context1);
      }
      return localasync_context1;
    }
  }
  
  public static long get_cur_time()
  {
    return System.currentTimeMillis() / 1000L;
  }
  
  /* Error */
  private static byte[] get_file_guid(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ifnonnull +5 -> 8
    //   6: aload_2
    //   7: areturn
    //   8: iconst_0
    //   9: newarray <illegal type>
    //   11: astore_1
    //   12: new 302	java/io/File
    //   15: dup
    //   16: new 304	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 305	java/lang/StringBuilder:<init>	()V
    //   23: aload_0
    //   24: invokevirtual 311	android/content/Context:getFilesDir	()Ljava/io/File;
    //   27: invokevirtual 315	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   30: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc_w 321
    //   36: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc_w 323
    //   42: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 326	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 327	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore_0
    //   52: aload_0
    //   53: ifnull +158 -> 211
    //   56: aload_0
    //   57: invokevirtual 331	java/io/File:exists	()Z
    //   60: ifeq +151 -> 211
    //   63: new 333	java/io/FileInputStream
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 336	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   71: astore_0
    //   72: aload_1
    //   73: astore_2
    //   74: aload_0
    //   75: invokevirtual 340	java/io/FileInputStream:available	()I
    //   78: istore 4
    //   80: aload_1
    //   81: astore_2
    //   82: iload 4
    //   84: sipush 1024
    //   87: if_icmpge +20 -> 107
    //   90: aload_1
    //   91: astore_2
    //   92: iload 4
    //   94: newarray <illegal type>
    //   96: astore_1
    //   97: aload_1
    //   98: astore_2
    //   99: aload_0
    //   100: aload_1
    //   101: invokevirtual 344	java/io/FileInputStream:read	([B)I
    //   104: pop
    //   105: aload_1
    //   106: astore_2
    //   107: aload_0
    //   108: astore_1
    //   109: aload_2
    //   110: astore_0
    //   111: aload_0
    //   112: astore_2
    //   113: aload_1
    //   114: ifnull -108 -> 6
    //   117: aload_1
    //   118: invokevirtual 347	java/io/FileInputStream:close	()V
    //   121: aload_0
    //   122: areturn
    //   123: astore_1
    //   124: aload_1
    //   125: invokestatic 353	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   128: aload_0
    //   129: areturn
    //   130: astore_2
    //   131: aload_1
    //   132: astore_0
    //   133: aconst_null
    //   134: astore_1
    //   135: getstatic 128	tencent/tls/request/req_global:_dev_report	I
    //   138: ldc_w 354
    //   141: ior
    //   142: putstatic 128	tencent/tls/request/req_global:_dev_report	I
    //   145: aload_2
    //   146: invokestatic 353	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   149: aload_0
    //   150: astore_2
    //   151: aload_1
    //   152: ifnull -146 -> 6
    //   155: aload_1
    //   156: invokevirtual 347	java/io/FileInputStream:close	()V
    //   159: aload_0
    //   160: areturn
    //   161: astore_1
    //   162: aload_1
    //   163: invokestatic 353	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: areturn
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_0
    //   171: aload_0
    //   172: ifnull +7 -> 179
    //   175: aload_0
    //   176: invokevirtual 347	java/io/FileInputStream:close	()V
    //   179: aload_1
    //   180: athrow
    //   181: astore_0
    //   182: aload_0
    //   183: invokestatic 353	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   186: goto -7 -> 179
    //   189: astore_1
    //   190: goto -19 -> 171
    //   193: astore_2
    //   194: aload_1
    //   195: astore_0
    //   196: aload_2
    //   197: astore_1
    //   198: goto -27 -> 171
    //   201: astore_3
    //   202: aload_0
    //   203: astore_1
    //   204: aload_2
    //   205: astore_0
    //   206: aload_3
    //   207: astore_2
    //   208: goto -73 -> 135
    //   211: aconst_null
    //   212: astore_2
    //   213: aload_1
    //   214: astore_0
    //   215: aload_2
    //   216: astore_1
    //   217: goto -106 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	paramContext	Context
    //   11	107	1	localObject1	Object
    //   123	9	1	localIOException1	java.io.IOException
    //   134	22	1	localObject2	Object
    //   161	2	1	localIOException2	java.io.IOException
    //   168	12	1	localObject3	Object
    //   189	6	1	localObject4	Object
    //   197	20	1	localObject5	Object
    //   1	112	2	localObject6	Object
    //   130	16	2	localException1	Exception
    //   150	1	2	localContext	Context
    //   193	12	2	localObject7	Object
    //   207	9	2	localObject8	Object
    //   201	6	3	localException2	Exception
    //   78	15	4	i	int
    // Exception table:
    //   from	to	target	type
    //   117	121	123	java/io/IOException
    //   12	52	130	java/lang/Exception
    //   56	72	130	java/lang/Exception
    //   155	159	161	java/io/IOException
    //   12	52	168	finally
    //   56	72	168	finally
    //   175	179	181	java/io/IOException
    //   74	80	189	finally
    //   92	97	189	finally
    //   99	105	189	finally
    //   135	149	193	finally
    //   74	80	201	java/lang/Exception
    //   92	97	201	java/lang/Exception
    //   99	105	201	java/lang/Exception
  }
  
  @SuppressLint({"NewApi"})
  private static byte[] get_guid(Context paramContext)
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = (TelephonyManager)paramContext.getSystemService("phone");
      if (localObject2 != null) {
        localObject1 = ((TelephonyManager)localObject2).getDeviceId();
      }
      localObject2 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      paramContext = "";
      String str = Build.MODEL;
      if (localObject1 != null) {
        paramContext = "" + (String)localObject1;
      }
      localObject1 = paramContext;
      if (str != null) {
        localObject1 = paramContext + str;
      }
      paramContext = (Context)localObject1;
      if (localObject2 != null) {
        paramContext = (String)localObject1 + (String)localObject2;
      }
      if (paramContext.length() == 0) {
        return new byte[0];
      }
      paramContext = MD5.toMD5Byte(paramContext.getBytes());
      return paramContext;
    }
    catch (Exception paramContext) {}
    return new byte[0];
  }
  
  public static long get_server_cur_time()
  {
    return System.currentTimeMillis() / 1000L + _l_init_time;
  }
  
  public static void init()
  {
    int i = util.get_saved_network_type(_context);
    _dev_report = 0;
    byte[] arrayOfByte = get_file_guid(_context);
    Object localObject1 = get_guid(_context);
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
      if ((localObject1 == null) || (localObject1.length <= 0))
      {
        localObject1 = "%4;7t>;28<fc.5*6".getBytes();
        _read_guid = 0;
        _guid_src = 20;
        util.save_file_imei(_context, (byte[])localObject1);
        _guid_chg = 0;
        _new_install = 1;
        dev_compare();
        _dev_report |= _guid_src << 24 & 0xFF000000;
        _dev_report |= _dev_chg << 8 & 0xFF00;
        _IMEI = (byte[])((byte[])localObject1).clone();
        _IMEI_KEY = (byte[])((byte[])localObject1).clone();
        _android_sdk = Build.VERSION.SDK_INT;
        _sim_operator_name = util.get_sim_operator_name(_context);
        _network_type = util.get_network_type(_context);
        if (i != _network_type)
        {
          util.set_net_retry_type(_context, 0);
          util.save_network_type(_context, _network_type);
        }
        _apn = util.get_apn_string(_context).getBytes();
        localObject1 = util.get_apk_id(_context);
        _apk_id = (byte[])localObject1;
        tencent.tls.account.acc_status.apk_id = (byte[])localObject1;
        _apk_v = util.get_apk_v(_context, new String(_apk_id));
        _apk_sig = util.getPkgSigFromApkName(_context, _context.getPackageName());
        localObject1 = Build.MODEL;
        if (localObject1 != null) {
          break label360;
        }
        _device = new byte[0];
        label253:
        if ((!util.isFileExist("/system/bin/su")) && (!util.isFileExist("/system/xbin/su")) && (!util.isFileExist("/sbin/su"))) {
          break label370;
        }
        i = 1;
        label282:
        if (i != 1) {
          break label375;
        }
      }
    }
    label360:
    label370:
    label375:
    for (i = 1;; i = 0)
    {
      _isroot = i;
      return;
      _read_guid = 1;
      _guid_src = 17;
      break;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (localObject1.length > 0) {}
      }
      else
      {
        localObject2 = "%4;7t>;28<fc.5*6".getBytes();
      }
      if (Arrays.equals((byte[])localObject2, arrayOfByte)) {}
      for (_guid_chg = 0;; _guid_chg = 1)
      {
        _read_guid = 1;
        _new_install = 0;
        _guid_src = 1;
        localObject1 = arrayOfByte;
        break;
      }
      _device = ((String)localObject1).getBytes();
      break label253;
      i = 0;
      break label282;
    }
  }
  
  public static String long2string(long paramLong)
  {
    BigInteger localBigInteger2 = BigInteger.valueOf(paramLong);
    BigInteger localBigInteger1 = localBigInteger2;
    if (localBigInteger2.signum() < 0) {
      localBigInteger1 = localBigInteger2.add(BigInteger.ONE.shiftLeft(64));
    }
    return localBigInteger1.toString();
  }
  
  public static void remove_async_data(long paramLong)
  {
    synchronized (data_lock)
    {
      _async_data.remove(Long.valueOf(paramLong));
      return;
    }
  }
  
  public void clear_sig(long paramLong1, long paramLong2)
  {
    try
    {
      _account_sig_info_map.clear_sig(paramLong1, paramLong2);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void clear_time_ip()
  {
    _ip_addr = null;
    _time_difference = 0L;
    _l_init_time = 0L;
  }
  
  public void close_connect()
  {
    QLog.d("close_connect");
    if (this._sk != null) {}
    try
    {
      QLog.d("close_connect" + this._sk.toString());
      this._sk.close();
      this._sk = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        QLog.e(localException);
      }
    }
  }
  
  public void close_transport_connect()
  {
    QLog.d("close_transport_connect");
    if (this._transport_sk != null) {}
    try
    {
      QLog.d("close_transport_connect" + this._transport_sk.toString());
      this._transport_sk.close();
      this._transport_sk = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        QLog.e(localException);
      }
    }
  }
  
  public req_global getClone(long paramLong)
  {
    req_global localreq_global = new req_global(null);
    localreq_global._use_sso_channel = this._use_sso_channel;
    localreq_global._time_out = this._time_out;
    if (this._rand_key != null) {
      localreq_global._rand_key = ((byte[])this._rand_key.clone());
    }
    if ((this._pub_key != null) && (this._share_key != null))
    {
      localreq_global._pub_key = ((byte[])this._pub_key.clone());
      localreq_global._share_key = ((byte[])this._share_key.clone());
    }
    if (paramLong <= 0L)
    {
      localreq_global._seq = allocSequence();
      return localreq_global;
    }
    localreq_global._seq = paramLong;
    return localreq_global;
  }
  
  public long getTinyId(String paramString)
  {
    long l = 0L;
    if (paramString == null) {}
    for (;;)
    {
      return l;
      try
      {
        paramString = _account_sig_info_map.getTinyInfo(paramString);
        if (paramString == null) {
          continue;
        }
        l = paramString._tinyid;
      }
      finally {}
    }
  }
  
  public TinyInfo getTinyInfo(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramString = _account_sig_info_map.getTinyInfo(paramString);
      }
      finally {}
    }
  }
  
  public List<TLSUserInfo> get_all_logined_account()
  {
    try
    {
      List localList = _account_sig_info_map.get_all_logined_account();
      return localList;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        QLog.w("_account_sig_info_map null " + localNullPointerException.getMessage());
        Object localObject1 = null;
      }
    }
    finally {}
  }
  
  public SigInfo get_siginfo(long paramLong1, long paramLong2)
  {
    try
    {
      QLog.i("get_siginfo", paramLong1);
      SigInfo localSigInfo = _account_sig_info_map.get_siginfo(paramLong1, paramLong2);
      if (localSigInfo != null) {}
      return localSigInfo;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void put_account(String paramString, long paramLong)
  {
    try
    {
      _account_sig_info_map.putTinyInfo(paramString, paramString, paramLong, TinyInfo.UserType.USER_TYPE_NORMAL);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void put_guest(String paramString, long paramLong)
  {
    _account_sig_info_map.putTinyInfo(paramString, paramString, paramLong, TinyInfo.UserType.USER_TYPE_GUEST);
  }
  
  public void put_open_account(String paramString1, String paramString2, long paramLong)
  {
    try
    {
      _account_sig_info_map.putTinyInfo(paramString1, paramString2, paramLong, TinyInfo.UserType.USER_TYPE_NORMAL);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public int put_siginfo(long paramLong1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong3, long paramLong4, long paramLong5, ArrayList<Ticket> paramArrayList, int paramInt)
  {
    try
    {
      paramInt = _account_sig_info_map.put_siginfo(paramLong1, paramLong2, paramArrayOfByte1, paramArrayOfByte2, paramLong3, paramLong4, paramLong5, paramArrayList, paramInt);
      return paramInt;
    }
    finally
    {
      paramArrayOfByte1 = finally;
      throw paramArrayOfByte1;
    }
  }
  
  public void put_sso_guest(String paramString, long paramLong)
  {
    _account_sig_info_map.putTinyInfo(paramString, paramString, paramLong, TinyInfo.UserType.USER_TYPE_SSO_GUEST);
  }
  
  public void remove_account(String paramString)
  {
    try
    {
      _account_sig_info_map.remove_account(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void set_context(Context paramContext)
  {
    _context = paramContext;
    _account_sig_info_map = new account_sig_info_map(paramContext);
    paramContext = new byte[16];
    _SR.nextBytes(paramContext);
    System.arraycopy(paramContext, 0, this._rand_key, 0, paramContext.length);
  }
  
  public void set_time_ip(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    _time_difference = (util.buf_to_int32(paramArrayOfByte1, 0) & 0xFFFFFFFF) - System.currentTimeMillis() / 1000L;
    _l_init_time = _time_difference;
    _ip_addr = paramArrayOfByte2;
  }
  
  public String uin2string()
  {
    return long2string(this._uin);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_global.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */