package com.f.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;
import java.util.Queue;

public class br
  implements ck
{
  private static br b;
  protected Context a;
  private UIResponseListener c;
  private es d;
  private Queue e;
  private v f;
  private Handler g = new ca(this);
  private Handler h = new cb(this);
  
  public static br a()
  {
    if (b == null) {
      b = new br();
    }
    return b;
  }
  
  private void a(es parames)
  {
    if ("0000".equals(parames.s())) {
      switch (parames.j())
      {
      }
    }
    do
    {
      return;
    } while (this.a == null);
    ec.a(this.a, true);
  }
  
  private void b(es parames)
  {
    int i = 1;
    switch (parames.j())
    {
    default: 
      i = 99;
    }
    for (;;)
    {
      u.a().d.a(i, false);
      return;
      if ("1".equals(((dg)parames).b()))
      {
        i = 3;
      }
      else
      {
        if (!"2".equals(((dg)parames).b())) {
          break;
        }
        i = 4;
        continue;
        if ("1".equals(((dp)parames).b()))
        {
          i = 8;
        }
        else
        {
          if (!"2".equals(((dp)parames).b())) {
            break;
          }
          i = 9;
        }
      }
    }
  }
  
  /* Error */
  public void a(bg parambg)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 117	com/f/a/a/bg:b	()Lcom/unionpay/upomp/lthj/plugin/ui/UIResponseListener;
    //   7: putfield 80	com/f/a/a/br:c	Lcom/unionpay/upomp/lthj/plugin/ui/UIResponseListener;
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 120	com/f/a/a/bg:a	()Lcom/f/a/a/es;
    //   15: putfield 109	com/f/a/a/br:d	Lcom/f/a/a/es;
    //   18: aload_0
    //   19: getfield 109	com/f/a/a/br:d	Lcom/f/a/a/es;
    //   22: ifnull +50 -> 72
    //   25: aload_0
    //   26: getfield 109	com/f/a/a/br:d	Lcom/f/a/a/es;
    //   29: invokevirtual 123	com/f/a/a/es:a	()Lcom/unionpay/upomp/lthj/plugin/model/Data;
    //   32: astore_1
    //   33: invokestatic 129	com/unionpay/upomp/lthj/plugin/ui/JniMethod:getJniMethod	()Lcom/unionpay/upomp/lthj/plugin/ui/JniMethod;
    //   36: astore_2
    //   37: aload_2
    //   38: aload_1
    //   39: aload_0
    //   40: getfield 109	com/f/a/a/br:d	Lcom/f/a/a/es;
    //   43: invokevirtual 70	com/f/a/a/es:j	()I
    //   46: invokevirtual 133	com/unionpay/upomp/lthj/plugin/ui/JniMethod:packAndEncrypt	(Lcom/unionpay/upomp/lthj/plugin/model/Data;I)Lcom/unionpay/upomp/lthj/plugin/model/JNIBottomBackData;
    //   49: astore_1
    //   50: aload_1
    //   51: ifnull +10 -> 61
    //   54: aload_1
    //   55: getfield 139	com/unionpay/upomp/lthj/plugin/model/JNIBottomBackData:stateCode	I
    //   58: ifeq +27 -> 85
    //   61: aload_0
    //   62: getfield 80	com/f/a/a/br:c	Lcom/unionpay/upomp/lthj/plugin/ui/UIResponseListener;
    //   65: ldc -115
    //   67: invokeinterface 147 2 0
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 150	java/lang/Exception:printStackTrace	()V
    //   80: aconst_null
    //   81: astore_1
    //   82: goto -32 -> 50
    //   85: ldc -104
    //   87: new 154	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   94: ldc -99
    //   96: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: new 62	java/lang/String
    //   102: dup
    //   103: aload_1
    //   104: getfield 165	com/unionpay/upomp/lthj/plugin/model/JNIBottomBackData:sendData	[B
    //   107: invokespecial 168	java/lang/String:<init>	([B)V
    //   110: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokestatic 177	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   119: pop
    //   120: aload_0
    //   121: new 179	com/f/a/a/v
    //   124: dup
    //   125: aload_0
    //   126: getfield 72	com/f/a/a/br:a	Landroid/content/Context;
    //   129: invokestatic 87	com/f/a/a/u:a	()Lcom/f/a/a/u;
    //   132: getfield 183	com/f/a/a/u:M	Ljava/lang/String;
    //   135: invokespecial 186	com/f/a/a/v:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   138: putfield 45	com/f/a/a/br:f	Lcom/f/a/a/v;
    //   141: aload_0
    //   142: getfield 45	com/f/a/a/br:f	Lcom/f/a/a/v;
    //   145: ifnull -73 -> 72
    //   148: aload_0
    //   149: getfield 45	com/f/a/a/br:f	Lcom/f/a/a/v;
    //   152: invokevirtual 188	com/f/a/a/v:b	()V
    //   155: aload_0
    //   156: getfield 45	com/f/a/a/br:f	Lcom/f/a/a/v;
    //   159: aload_1
    //   160: getfield 165	com/unionpay/upomp/lthj/plugin/model/JNIBottomBackData:sendData	[B
    //   163: iconst_0
    //   164: aload_1
    //   165: getfield 165	com/unionpay/upomp/lthj/plugin/model/JNIBottomBackData:sendData	[B
    //   168: arraylength
    //   169: aload_0
    //   170: ldc -67
    //   172: invokevirtual 192	com/f/a/a/v:a	([BIILcom/f/a/a/ck;I)V
    //   175: goto -103 -> 72
    //   178: astore_1
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_1
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	br
    //   0	183	1	parambg	bg
    //   36	2	2	localJniMethod	JniMethod
    // Exception table:
    //   from	to	target	type
    //   37	50	75	java/lang/Exception
    //   2	37	178	finally
    //   37	50	178	finally
    //   54	61	178	finally
    //   61	72	178	finally
    //   76	80	178	finally
    //   85	175	178	finally
  }
  
  /* Error */
  public void a(es parames, UIResponseListener paramUIResponseListener, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_3
    //   4: putfield 72	com/f/a/a/br:a	Landroid/content/Context;
    //   7: invokestatic 87	com/f/a/a/u:a	()Lcom/f/a/a/u;
    //   10: getfield 90	com/f/a/a/u:d	Lcom/f/a/a/ee;
    //   13: aload_1
    //   14: invokevirtual 196	com/f/a/a/ee:a	(Lcom/f/a/a/es;)Z
    //   17: ifne +17 -> 34
    //   20: aload_3
    //   21: aload_3
    //   22: invokestatic 201	com/f/a/a/bp:ef	()I
    //   25: invokevirtual 207	android/content/Context:getString	(I)Ljava/lang/String;
    //   28: invokestatic 209	com/f/a/a/ec:b	(Landroid/content/Context;Ljava/lang/String;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: iload 4
    //   36: ifeq +20 -> 56
    //   39: invokestatic 214	com/f/a/a/ef:a	()Lcom/f/a/a/ef;
    //   42: aload_3
    //   43: iload 5
    //   45: new 216	com/f/a/a/bz
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 217	com/f/a/a/bz:<init>	(Lcom/f/a/a/br;)V
    //   53: invokevirtual 220	com/f/a/a/ef:a	(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)V
    //   56: aload_0
    //   57: getfield 48	com/f/a/a/br:e	Ljava/util/Queue;
    //   60: ifnull +17 -> 77
    //   63: aload_0
    //   64: getfield 48	com/f/a/a/br:e	Ljava/util/Queue;
    //   67: invokeinterface 225 1 0
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield 48	com/f/a/a/br:e	Ljava/util/Queue;
    //   77: aload_0
    //   78: new 114	com/f/a/a/bg
    //   81: dup
    //   82: aload_1
    //   83: aload_2
    //   84: invokespecial 228	com/f/a/a/bg:<init>	(Lcom/f/a/a/es;Lcom/unionpay/upomp/lthj/plugin/ui/UIResponseListener;)V
    //   87: invokevirtual 230	com/f/a/a/br:a	(Lcom/f/a/a/bg;)V
    //   90: goto -59 -> 31
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	br
    //   0	98	1	parames	es
    //   0	98	2	paramUIResponseListener	UIResponseListener
    //   0	98	3	paramContext	Context
    //   0	98	4	paramBoolean1	boolean
    //   0	98	5	paramBoolean2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	31	93	finally
    //   39	56	93	finally
    //   56	77	93	finally
    //   77	90	93	finally
  }
  
  public void a(String paramString, v paramv)
  {
    if (this.f != paramv) {
      return;
    }
    try
    {
      paramv = Message.obtain();
      paramv.obj = paramString;
      this.g.sendMessage(paramv);
      return;
    }
    catch (Exception paramString)
    {
      Log.d("---NetMediator-errorDistribution--", paramString.getMessage());
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      try
      {
        paramArrayOfByte = JniMethod.getJniMethod().unpackAndDecrypt(paramArrayOfByte, paramInt2, this.d.j());
        if ((paramArrayOfByte != null) && (paramArrayOfByte.stateCode == 0)) {
          break label203;
        }
        if ((paramArrayOfByte.respCode == null) && (paramArrayOfByte.respDesc == null)) {
          break label169;
        }
        if (!"3022".equals(paramArrayOfByte.respCode)) {
          continue;
        }
        this.d.a(paramArrayOfByte);
        paramArrayOfByte = Message.obtain();
        paramArrayOfByte.obj = this.d;
        this.h.sendMessage(paramArrayOfByte);
      }
      catch (Exception paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        Log.d("---plugin--NetMediator-response-e=", "--quotMediator--response=" + paramArrayOfByte);
        continue;
      }
      finally {}
      return;
      a(paramArrayOfByte.respDesc + "，错误码为" + paramArrayOfByte.respCode, this.f);
      continue;
      label169:
      a("命令处理失败，错误码为" + paramArrayOfByte.stateCode, this.f);
      continue;
      label203:
      if (this.d != null)
      {
        this.d.a(paramArrayOfByte);
        if (!"0".equals(this.d.s())) {
          Log.i("PayPlug", "theCmd respCode=" + this.d.s() + ",theCmd.respDesc=" + this.d.t());
        }
      }
      paramArrayOfByte = Message.obtain();
      paramArrayOfByte.obj = this.d;
      this.h.sendMessage(paramArrayOfByte);
    }
  }
  
  /* Error */
  public void a(byte[] paramArrayOfByte, v paramv)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 45	com/f/a/a/br:f	Lcom/f/a/a/v;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_2
    //   9: if_acmpeq +6 -> 15
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: aload_1
    //   17: iconst_0
    //   18: aload_1
    //   19: arraylength
    //   20: invokevirtual 301	com/f/a/a/br:a	([BII)V
    //   23: goto -11 -> 12
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	br
    //   0	31	1	paramArrayOfByte	byte[]
    //   0	31	2	paramv	v
    //   6	2	3	localv	v
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
    //   15	23	26	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */