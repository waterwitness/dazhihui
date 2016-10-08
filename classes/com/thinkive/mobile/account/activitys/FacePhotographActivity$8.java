package com.thinkive.mobile.account.activitys;

import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.DialogFrame;

final class FacePhotographActivity$8
  implements CallBack.SchedulerCallBack
{
  FacePhotographActivity$8(FacePhotographActivity paramFacePhotographActivity, DialogFrame paramDialogFrame) {}
  
  /* Error */
  public final void handler(com.android.thinkive.framework.compatible.MessageAction paramMessageAction)
  {
    // Byte code:
    //   0: invokestatic 30	e:b	()Le;
    //   3: pop
    //   4: invokestatic 33	e:a	()[B
    //   7: putstatic 38	com/thinkive/mobile/account/activitys/FacePhotographActivity:b	[B
    //   10: invokestatic 43	java/lang/System:gc	()V
    //   13: getstatic 38	com/thinkive/mobile/account/activitys/FacePhotographActivity:b	[B
    //   16: ifnonnull +15 -> 31
    //   19: aload_0
    //   20: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   23: invokestatic 47	com/thinkive/mobile/account/activitys/FacePhotographActivity:g	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)Landroid/os/Handler;
    //   26: iconst_2
    //   27: invokevirtual 53	android/os/Handler:sendEmptyMessage	(I)Z
    //   30: pop
    //   31: getstatic 38	com/thinkive/mobile/account/activitys/FacePhotographActivity:b	[B
    //   34: sipush 500
    //   37: sipush 500
    //   40: invokestatic 58	bq:a	([BII)Landroid/graphics/Bitmap;
    //   43: astore_1
    //   44: aload_1
    //   45: invokestatic 63	br:a	(Landroid/graphics/Bitmap;)Ljava/lang/String;
    //   48: putstatic 67	com/thinkive/mobile/account/activitys/FacePhotographActivity:d	Ljava/lang/String;
    //   51: new 69	java/lang/StringBuilder
    //   54: dup
    //   55: ldc 71
    //   57: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: getstatic 67	com/thinkive/mobile/account/activitys/FacePhotographActivity:d	Ljava/lang/String;
    //   63: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: putstatic 67	com/thinkive/mobile/account/activitys/FacePhotographActivity:d	Ljava/lang/String;
    //   72: aload_1
    //   73: aload_0
    //   74: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   77: invokestatic 86	com/thinkive/mobile/account/activitys/FacePhotographActivity:h	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)I
    //   80: iconst_2
    //   81: anewarray 88	java/lang/String
    //   84: dup
    //   85: iconst_0
    //   86: aload_0
    //   87: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   90: invokestatic 92	com/thinkive/mobile/account/activitys/FacePhotographActivity:i	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)Ljava/lang/String;
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: aload_0
    //   97: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   100: invokestatic 95	com/thinkive/mobile/account/activitys/FacePhotographActivity:j	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)Ljava/lang/String;
    //   103: aastore
    //   104: invokestatic 98	bq:a	(Landroid/graphics/Bitmap;I[Ljava/lang/String;)Ljava/lang/String;
    //   107: pop
    //   108: aload_0
    //   109: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   112: invokestatic 47	com/thinkive/mobile/account/activitys/FacePhotographActivity:g	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)Landroid/os/Handler;
    //   115: new 100	com/thinkive/mobile/account/activitys/FacePhotographActivity$8$1
    //   118: dup
    //   119: aload_0
    //   120: invokespecial 103	com/thinkive/mobile/account/activitys/FacePhotographActivity$8$1:<init>	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity$8;)V
    //   123: invokevirtual 107	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   126: pop
    //   127: aload_0
    //   128: getfield 16	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:b	Lcom/android/thinkive/framework/compatible/DialogFrame;
    //   131: ifnull +10 -> 141
    //   134: aload_0
    //   135: getfield 16	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:b	Lcom/android/thinkive/framework/compatible/DialogFrame;
    //   138: invokevirtual 112	com/android/thinkive/framework/compatible/DialogFrame:unWaitDialog	()V
    //   141: return
    //   142: astore_2
    //   143: aconst_null
    //   144: astore_1
    //   145: aload_2
    //   146: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   149: aload_0
    //   150: getfield 14	com/thinkive/mobile/account/activitys/FacePhotographActivity$8:a	Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;
    //   153: invokestatic 47	com/thinkive/mobile/account/activitys/FacePhotographActivity:g	(Lcom/thinkive/mobile/account/activitys/FacePhotographActivity;)Landroid/os/Handler;
    //   156: iconst_2
    //   157: invokevirtual 53	android/os/Handler:sendEmptyMessage	(I)Z
    //   160: pop
    //   161: goto -89 -> 72
    //   164: astore_1
    //   165: aload_1
    //   166: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   169: return
    //   170: astore_2
    //   171: goto -26 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	8
    //   0	174	1	paramMessageAction	com.android.thinkive.framework.compatible.MessageAction
    //   142	4	2	localException1	Exception
    //   170	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   10	31	142	java/lang/Exception
    //   31	44	142	java/lang/Exception
    //   127	141	164	java/lang/Exception
    //   44	72	170	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */