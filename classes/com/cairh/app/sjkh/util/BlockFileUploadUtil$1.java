package com.cairh.app.sjkh.util;

import com.e.a.a.i;
import org.apache.http.Header;

class BlockFileUploadUtil$1
  extends i
{
  BlockFileUploadUtil$1(BlockFileUploadUtil paramBlockFileUploadUtil, int paramInt, byte[] paramArrayOfByte) {}
  
  private void reTry()
  {
    if (this.val$times < 10)
    {
      BlockFileUploadUtil.access$6(this.this$0, this.val$block, this.val$times + 1);
      return;
    }
    BlockFileUploadUtil.access$4(this.this$0, 0);
  }
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    reTry();
  }
  
  /* Error */
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 45	java/lang/String
    //   3: dup
    //   4: aload_3
    //   5: ldc 47
    //   7: invokespecial 50	java/lang/String:<init>	([BLjava/lang/String;)V
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +58 -> 70
    //   15: new 52	org/json/JSONObject
    //   18: dup
    //   19: aload_2
    //   20: invokespecial 55	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   23: ldc 57
    //   25: invokevirtual 61	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   28: ifne +106 -> 134
    //   31: aload_0
    //   32: getfield 14	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   35: invokestatic 65	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$0	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;)Ljava/util/List;
    //   38: invokestatic 69	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$1	()I
    //   41: iconst_1
    //   42: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   45: invokeinterface 81 3 0
    //   50: pop
    //   51: invokestatic 69	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$1	()I
    //   54: invokestatic 84	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$2	()I
    //   57: iconst_1
    //   58: isub
    //   59: if_icmpne +22 -> 81
    //   62: aload_0
    //   63: getfield 14	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   66: iconst_0
    //   67: invokevirtual 88	com/cairh/app/sjkh/util/BlockFileUploadUtil:notifyMergeBlocks	(I)V
    //   70: return
    //   71: astore_2
    //   72: aload_2
    //   73: invokevirtual 91	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   76: aconst_null
    //   77: astore_2
    //   78: goto -67 -> 11
    //   81: invokestatic 69	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$1	()I
    //   84: iconst_1
    //   85: iadd
    //   86: invokestatic 94	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$3	(I)V
    //   89: aload_0
    //   90: getfield 14	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   93: iconst_1
    //   94: invokestatic 33	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$4	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;I)V
    //   97: aload_0
    //   98: getfield 14	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   101: aload_0
    //   102: getfield 14	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:this$0	Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;
    //   105: invokestatic 97	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$5	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;)Ljava/util/List;
    //   108: invokestatic 69	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$1	()I
    //   111: invokeinterface 101 2 0
    //   116: checkcast 102	[B
    //   119: iconst_0
    //   120: invokestatic 29	com/cairh/app/sjkh/util/BlockFileUploadUtil:access$6	(Lcom/cairh/app/sjkh/util/BlockFileUploadUtil;[BI)V
    //   123: return
    //   124: astore_2
    //   125: aload_2
    //   126: invokevirtual 103	org/json/JSONException:printStackTrace	()V
    //   129: aload_0
    //   130: invokespecial 37	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:reTry	()V
    //   133: return
    //   134: aload_0
    //   135: invokespecial 37	com/cairh/app/sjkh/util/BlockFileUploadUtil$1:reTry	()V
    //   138: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	1
    //   0	139	1	paramInt	int
    //   0	139	2	paramArrayOfHeader	Header[]
    //   0	139	3	paramArrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	11	71	java/io/UnsupportedEncodingException
    //   15	70	124	org/json/JSONException
    //   81	123	124	org/json/JSONException
    //   134	138	124	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\BlockFileUploadUtil$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */