package tencent.tls.request;

import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tlvs.tlv_t105;
import tencent.tls.tlvs.tlv_t2;
import tencent.tls.tlvs.tlv_t8;

class req_imgcode_verify$1
  extends TLVPacker
{
  req_imgcode_verify$1(req_imgcode_verify paramreq_imgcode_verify, int[] paramArrayOfInt, async_context paramasync_context, byte[] paramArrayOfByte)
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
    }
    return new tlv_t2().get_tlv_2(this.val$imgcode, this.val$_context._t105.get_sign());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_imgcode_verify$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */