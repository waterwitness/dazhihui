package tencent.tls.request;

import tencent.tls.tlvs.tlv_t100;
import tencent.tls.tlvs.tlv_t109;
import tencent.tls.tlvs.tlv_t112;
import tencent.tls.tlvs.tlv_t116;
import tencent.tls.tlvs.tlv_t142;
import tencent.tls.tlvs.tlv_t145;
import tencent.tls.tlvs.tlv_t154;
import tencent.tls.tlvs.tlv_t502;
import tencent.tls.tlvs.tlv_t509;
import tencent.tls.tlvs.tlv_t8;

class req_smslogin_ask$1
  extends TLVPacker
{
  req_smslogin_ask$1(req_smslogin_ask paramreq_smslogin_ask, int[] paramArrayOfInt, long paramLong1, long paramLong2, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, long[] paramArrayOfLong)
  {
    super(paramArrayOfInt);
  }
  
  protected byte[] loop(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 256: 
    case 265: 
      do
      {
        return new byte[0];
        return new tlv_t100().get_tlv_100(this.val$appid, this.val$subappid, this.val$client_version, this.val$mainSigmap);
      } while ((req_global._IMEI == null) || (req_global._IMEI.length <= 0));
      return new tlv_t109().get_tlv_109(req_global._IMEI);
    case 8: 
      return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
    case 322: 
      return new tlv_t142().get_tlv_142(req_global._apk_id);
    case 325: 
      return new tlv_t145().get_tlv_145(req_global._IMEI);
    case 340: 
      return new tlv_t154().get_tlv_154(this.this$0._g._sso_seq);
    case 274: 
      return new tlv_t112().get_tlv_112(this.val$mobile);
    case 1282: 
      return new tlv_t502().get_tlv_502(req_global._acc_type);
    case 278: 
      return new tlv_t116().get_tlv_116(this.val$miscBitmap, this.val$getsig, this.val$subappid_list);
    }
    return new tlv_t509().get_tlv_509(req_global._apk_sig, req_global._apk_id);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_smslogin_ask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */