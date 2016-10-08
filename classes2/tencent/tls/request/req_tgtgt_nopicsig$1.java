package tencent.tls.request;

import java.util.List;
import tencent.tls.tlvs.tlv_t1;
import tencent.tls.tlvs.tlv_t100;
import tencent.tls.tlvs.tlv_t106;
import tencent.tls.tlvs.tlv_t107;
import tencent.tls.tlvs.tlv_t109;
import tencent.tls.tlvs.tlv_t112;
import tencent.tls.tlvs.tlv_t116;
import tencent.tls.tlvs.tlv_t124;
import tencent.tls.tlvs.tlv_t128;
import tencent.tls.tlvs.tlv_t141;
import tencent.tls.tlvs.tlv_t142;
import tencent.tls.tlvs.tlv_t144;
import tencent.tls.tlvs.tlv_t145;
import tencent.tls.tlvs.tlv_t147;
import tencent.tls.tlvs.tlv_t154;
import tencent.tls.tlvs.tlv_t166;
import tencent.tls.tlvs.tlv_t16a;
import tencent.tls.tlvs.tlv_t16b;
import tencent.tls.tlvs.tlv_t16e;
import tencent.tls.tlvs.tlv_t172;
import tencent.tls.tlvs.tlv_t177;
import tencent.tls.tlvs.tlv_t18;
import tencent.tls.tlvs.tlv_t502;
import tencent.tls.tlvs.tlv_t509;
import tencent.tls.tlvs.tlv_t8;
import tencent.tls.tools.util;

class req_tgtgt_nopicsig$1
  extends TLVPacker
{
  req_tgtgt_nopicsig$1(req_tgtgt_nopicsig paramreq_tgtgt_nopicsig, int[] paramArrayOfInt, long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3, int paramInt4, long[] paramArrayOfLong, long paramLong3, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, byte[] paramArrayOfByte3, async_context paramasync_context, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, List paramList, long paramLong4)
  {
    super(paramArrayOfInt);
  }
  
  protected byte[] loop(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new byte[0];
    case 24: 
      return new tlv_t18().get_tlv_18(this.val$appid, this.val$client_version, this.val$uin, this.val$rc);
    case 1: 
      return new tlv_t1().get_tlv_1(this.val$uin, this.val$client_ip);
    case 262: 
      localObject1 = new tlv_t106();
      ((tlv_t106)localObject1).set_data(this.val$A1, this.val$A1.length);
      return ((tlv_t106)localObject1).get_buf();
    case 278: 
      return new tlv_t116().get_tlv_116(this.val$bitmap, this.val$getsig, this.val$appid_array);
    case 256: 
      return new tlv_t100().get_tlv_100(this.val$appid, this.val$wxappid, this.val$client_version, this.val$getsig1);
    case 263: 
      return new tlv_t107().get_tlv_107(this.val$pic_type, this.val$cap_type, this.val$pic_size, this.val$ret_type);
    case 324: 
      if ((this.val$IMEI == null) || (this.val$IMEI.length <= 0)) {
        break;
      }
    }
    for (Object localObject1 = new tlv_t109().get_tlv_109(this.val$IMEI);; localObject1 = new byte[0])
    {
      Object localObject2 = new tlv_t124();
      byte[] arrayOfByte1 = util.get_os_type();
      byte[] arrayOfByte2 = util.get_os_version();
      paramInt = req_global._network_type;
      byte[] arrayOfByte3 = req_global._sim_operator_name;
      byte[] arrayOfByte4 = req_global._apn;
      localObject2 = ((tlv_t124)localObject2).get_tlv_124(arrayOfByte1, arrayOfByte2, paramInt, arrayOfByte3, new byte[0], arrayOfByte4);
      arrayOfByte1 = new tlv_t128().get_tlv_128(req_global._new_install, req_global._read_guid, req_global._guid_chg, req_global._dev_report, req_global._device, req_global._IMEI, null);
      arrayOfByte2 = new tlv_t16e().get_tlv_16e(req_global._device);
      return new tlv_t144().get_tlv_144((byte[])localObject1, (byte[])localObject2, arrayOfByte1, arrayOfByte2, this.val$thisContext._tgtgt_key);
      return new tlv_t142().get_tlv_142(this.val$apk_id);
      return new tlv_t112().get_tlv_112(this.this$0._g._userid.getBytes());
      return new tlv_t502().get_tlv_502(req_global._acc_type);
      return new tlv_t145().get_tlv_145(req_global._IMEI);
      if ((this.val$bitmap & 0x80) == 0) {
        break;
      }
      return new tlv_t166().get_tlv_166(req_global._img_type);
      return new tlv_t16a().get_tlv_16a(this.val$no_pic_sig);
      if ((this.val$domains == null) || (this.val$domains.size() <= 0)) {
        break;
      }
      return new tlv_t16b().get_tlv_16b(this.val$domains);
      return new tlv_t154().get_tlv_154(this.this$0._g._sso_seq);
      return new tlv_t141().get_tlv_141(req_global._sim_operator_name, req_global._network_type, req_global._apn);
      return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
      return new tlv_t147().get_tlv_147(this.val$sappid, req_global._apk_v, req_global._apk_sig);
      if ((this.this$0._g._t172_data == null) || (this.this$0._g._t172_data.length <= 0)) {
        break;
      }
      return new tlv_t172().get_tlv_172(this.this$0._g._t172_data);
      return new tlv_t177().get_tlv_177(1460985272L, "1.1.1532");
      return new tlv_t509().get_tlv_509(req_global._apk_sig, req_global._apk_id);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_tgtgt_nopicsig$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */