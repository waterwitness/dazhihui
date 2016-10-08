package com.cairh.app.sjkh.util;

import com.e.a.a.i;
import org.apache.http.Header;

class BlockFileUploadUtil$2
  extends i
{
  BlockFileUploadUtil$2(BlockFileUploadUtil paramBlockFileUploadUtil, int paramInt) {}
  
  private void reTry()
  {
    if (this.val$times < 5)
    {
      this.this$0.notifyMergeBlocks(this.val$times + 1);
      return;
    }
    BlockFileUploadUtil.access$4(this.this$0, 3);
    BlockFileUploadUtil.access$7(this.this$0).onMegreFailed();
  }
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    reTry();
  }
  
  /* Error */
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 49	java/lang/String
    //   3: dup
    //   4: aload_3
    //   5: ldc 51
    //   7: invokespecial 54	java/lang/String:<init>	([BLjava/lang/String;)V
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +51 -> 63
    //   15: new 56	org/json/JSONObject
    //   18: dup
    //   19: aload_2
    //   20: invokespecial 59	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   23: astore_2
    //   24: aload_2
    //   25: ldc 61
    //   27: invokevirtual 65	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   30: istore_1
    //   31: aload_2
    //   32: ldc 67
    //   34: invokevirtual 71	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_2
    //   38: iload_1
    //   39: ifne +35 -> 74
    //   42: aload_0
    //   43: getfield 12	com/cairh/app/sjkh/util/BlockFileUploadUtil$2:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   46: iconst_2
    //   47: invokestatic 28	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$4	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;I)V
    //   50: aload_0
    //   51: getfield 12	com/cairh/app/sjkh/util/BlockFileUploadUtil$2:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   54: invokestatic 32	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$7	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;)Lcom/cairh/app/sjkh/util/BlockFileUploadUtil$BlockUploadListener;
    //   57: aload_2
    //   58: invokeinterface 74 2 0
    //   63: return
    //   64: astore_2
    //   65: aload_2
    //   66: invokevirtual 77	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   69: aconst_null
    //   70: astore_2
    //   71: goto -60 -> 11
    //   74: aload_0
    //   75: invokespecial 41	com/cairh/app/sjkh/util/BlockFileUploadUtil$2:reTry	()V
    //   78: return
    //   79: astore_2
    //   80: aload_2
    //   81: invokevirtual 78	org/json/JSONException:printStackTrace	()V
    //   84: aload_0
    //   85: invokespecial 41	com/cairh/app/sjkh/util/BlockFileUploadUtil$2:reTry	()V
    //   88: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	2
    //   0	89	1	paramInt	int
    //   0	89	2	paramArrayOfHeader	Header[]
    //   0	89	3	paramArrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	11	64	java/io/UnsupportedEncodingException
    //   15	38	79	org/json/JSONException
    //   42	63	79	org/json/JSONException
    //   74	78	79	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\BlockFileUploadUtil$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */