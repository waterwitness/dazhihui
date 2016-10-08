package tencent.tls.request;

import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tlvs.tlv_t8;

class req_imgcode_reask$1
  extends TLVPacker
{
  req_imgcode_reask$1(req_imgcode_reask paramreq_imgcode_reask, int[] paramArrayOfInt)
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
      return req_global.get_async_data(this.this$0._g._seq)._t104.get_buf();
    }
    return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_imgcode_reask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */