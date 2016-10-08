package tencent.tls.request;

import tencent.tls.tlvs.tlv_t;
import tencent.tls.tlvs.tlv_t100;
import tencent.tls.tlvs.tlv_t112;
import tencent.tls.tlvs.tlv_t502;
import tencent.tls.tlvs.tlv_t8;

class req_exchange$1
  extends TLVPacker
{
  req_exchange$1(req_exchange paramreq_exchange, int[] paramArrayOfInt, long paramLong, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    super(paramArrayOfInt);
  }
  
  protected byte[] loop(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt)
    {
    default: 
      return new byte[0];
    case 256: 
      return new tlv_t100().get_tlv_100(this.val$appid, 0L, 0, 0);
    case 274: 
      localObject2 = new tlv_t112();
      if (this.val$userID == null) {}
      for (localObject1 = new byte[0];; localObject1 = this.val$userID.getBytes()) {
        return ((tlv_t112)localObject2).get_tlv_112((byte[])localObject1);
      }
    case 1282: 
      return new tlv_t502().get_tlv_502(this.val$accType);
    case 1283: 
      localObject2 = new tlv_t(1283);
      if (this.val$usersig == null) {}
      for (;;)
      {
        return ((tlv_t)localObject2).build_tlv((byte[])localObject1);
        localObject1 = this.val$usersig.getBytes();
      }
    case 1287: 
      tlv_t localtlv_t = new tlv_t(1287);
      if (this.val$appidAt3rd == null) {}
      for (localObject1 = localObject2;; localObject1 = this.val$appidAt3rd.getBytes()) {
        return localtlv_t.build_tlv((byte[])localObject1);
      }
    }
    return new tlv_t8().get_tlv_8(0, req_global._local_id, 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_exchange$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */