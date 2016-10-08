package tencent.tls.request;

import tencent.tls.tlvs.tlv_t;
import tencent.tls.tlvs.tlv_t100;
import tencent.tls.tlvs.tlv_t107;
import tencent.tls.tlvs.tlv_t112;
import tencent.tls.tlvs.tlv_t154;
import tencent.tls.tlvs.tlv_t502;
import tencent.tls.tlvs.tlv_t509;
import tencent.tls.tlvs.tlv_t8;

class req_getsalt$1
  extends TLVPacker
{
  req_getsalt$1(req_getsalt paramreq_getsalt, int[] paramArrayOfInt, String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramArrayOfInt);
  }
  
  protected byte[] loop(int paramInt)
  {
    Object localObject = new byte[0];
    if (this.val$userID != null) {
      localObject = this.val$userID.getBytes();
    }
    switch (paramInt)
    {
    default: 
      return new byte[0];
    case 256: 
      return new tlv_t100().get_tlv_100(this.val$appid, this.val$subAppid, this.val$client_ver, this.val$getsig);
    case 274: 
      return new tlv_t112().get_tlv_112((byte[])localObject);
    case 263: 
      return new tlv_t107().get_tlv_107(this.val$pic_type, this.val$cap_type, this.val$pic_size, this.val$ret_type);
    case 265: 
      localObject = new tlv_t(265);
      ((tlv_t)localObject).set_data(req_global._IMEI, req_global._IMEI.length);
      return ((tlv_t)localObject).get_buf();
    case 340: 
      return new tlv_t154().get_tlv_154(this.this$0._g._sso_seq);
    case 8: 
      return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
    case 1282: 
      return new tlv_t502().get_tlv_502(req_global._acc_type);
    }
    return new tlv_t509().get_tlv_509(req_global._apk_sig, req_global._apk_id);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_getsalt$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */