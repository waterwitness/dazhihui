package tencent.tls.request;

import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tlvs.tlv_t116;
import tencent.tls.tlvs.tlv_t126;
import tencent.tls.tlvs.tlv_t127;
import tencent.tls.tlvs.tlv_t184;
import tencent.tls.tlvs.tlv_t8;

class req_smslogin_verify$1
  extends TLVPacker
{
  req_smslogin_verify$1(req_smslogin_verify paramreq_smslogin_verify, int[] paramArrayOfInt, async_context paramasync_context, byte[] paramArrayOfByte, int paramInt1, int paramInt2, long[] paramArrayOfLong)
  {
    super(paramArrayOfInt);
  }
  
  protected byte[] loop(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new byte[0];
    case 260: 
      return this.val$_context._t104.get_buf();
    case 8: 
      return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
    case 295: 
      return new tlv_t127().get_tlv_127(this.val$msgCode, this.val$_context._t126.get_random());
    case 388: 
      return new tlv_t184().get_tlv_184(this.val$_context._msalt, this.val$_context._mpasswd);
    }
    return new tlv_t116().get_tlv_116(this.val$miscBitmap, this.val$getsig, this.val$subappid_list);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_smslogin_verify$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */