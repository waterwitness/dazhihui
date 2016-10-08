package com.thinkive.mobile.account.activitys;

import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;

final class CameraActivity$4
  implements CallBack.SchedulerCallBack
{
  CameraActivity$4(CameraActivity paramCameraActivity) {}
  
  /* Error */
  public final void handler(com.android.thinkive.framework.compatible.MessageAction paramMessageAction)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   4: astore_1
    //   5: invokestatic 27	e:b	()Le;
    //   8: pop
    //   9: aload_1
    //   10: invokestatic 30	e:a	()[B
    //   13: invokestatic 35	com/thinkive/mobile/account/activitys/CameraActivity:a	(Lcom/thinkive/mobile/account/activitys/CameraActivity;[B)V
    //   16: invokestatic 40	java/lang/System:gc	()V
    //   19: aload_0
    //   20: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   23: invokestatic 43	com/thinkive/mobile/account/activitys/CameraActivity:b	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)[B
    //   26: ifnonnull +15 -> 41
    //   29: aload_0
    //   30: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   33: invokestatic 47	com/thinkive/mobile/account/activitys/CameraActivity:c	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)Landroid/os/Handler;
    //   36: iconst_2
    //   37: invokevirtual 53	android/os/Handler:sendEmptyMessage	(I)Z
    //   40: pop
    //   41: aload_0
    //   42: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   45: invokestatic 43	com/thinkive/mobile/account/activitys/CameraActivity:b	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)[B
    //   48: sipush 500
    //   51: sipush 500
    //   54: invokestatic 58	bq:a	([BII)Landroid/graphics/Bitmap;
    //   57: astore_1
    //   58: aload_1
    //   59: invokestatic 63	br:a	(Landroid/graphics/Bitmap;)Ljava/lang/String;
    //   62: putstatic 66	com/thinkive/mobile/account/activitys/CameraActivity:c	Ljava/lang/String;
    //   65: new 68	java/lang/StringBuilder
    //   68: dup
    //   69: ldc 70
    //   71: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: getstatic 66	com/thinkive/mobile/account/activitys/CameraActivity:c	Ljava/lang/String;
    //   77: invokevirtual 77	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: putstatic 66	com/thinkive/mobile/account/activitys/CameraActivity:c	Ljava/lang/String;
    //   86: aload_1
    //   87: aload_0
    //   88: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   91: invokestatic 85	com/thinkive/mobile/account/activitys/CameraActivity:d	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)I
    //   94: iconst_2
    //   95: anewarray 87	java/lang/String
    //   98: dup
    //   99: iconst_0
    //   100: invokestatic 90	com/thinkive/mobile/account/activitys/CameraActivity:f	()Ljava/lang/String;
    //   103: aastore
    //   104: dup
    //   105: iconst_1
    //   106: aload_0
    //   107: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   110: invokestatic 93	com/thinkive/mobile/account/activitys/CameraActivity:e	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)Ljava/lang/String;
    //   113: aastore
    //   114: invokestatic 96	bq:a	(Landroid/graphics/Bitmap;I[Ljava/lang/String;)Ljava/lang/String;
    //   117: astore_1
    //   118: aload_1
    //   119: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   122: ifeq +38 -> 160
    //   125: aload_0
    //   126: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   129: invokestatic 47	com/thinkive/mobile/account/activitys/CameraActivity:c	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)Landroid/os/Handler;
    //   132: iconst_2
    //   133: invokevirtual 53	android/os/Handler:sendEmptyMessage	(I)Z
    //   136: pop
    //   137: return
    //   138: astore_2
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_2
    //   142: invokevirtual 105	java/lang/Exception:printStackTrace	()V
    //   145: aload_0
    //   146: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   149: invokestatic 47	com/thinkive/mobile/account/activitys/CameraActivity:c	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)Landroid/os/Handler;
    //   152: iconst_2
    //   153: invokevirtual 53	android/os/Handler:sendEmptyMessage	(I)Z
    //   156: pop
    //   157: goto -71 -> 86
    //   160: aload_0
    //   161: getfield 12	com/thinkive/mobile/account/activitys/CameraActivity$4:a	Lcom/thinkive/mobile/account/activitys/CameraActivity;
    //   164: invokestatic 47	com/thinkive/mobile/account/activitys/CameraActivity:c	(Lcom/thinkive/mobile/account/activitys/CameraActivity;)Landroid/os/Handler;
    //   167: new 107	com/thinkive/mobile/account/activitys/CameraActivity$4$1
    //   170: dup
    //   171: aload_0
    //   172: aload_1
    //   173: invokespecial 110	com/thinkive/mobile/account/activitys/CameraActivity$4$1:<init>	(Lcom/thinkive/mobile/account/activitys/CameraActivity$4;Ljava/lang/String;)V
    //   176: invokevirtual 114	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   179: pop
    //   180: return
    //   181: astore_2
    //   182: goto -41 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	4
    //   0	185	1	paramMessageAction	com.android.thinkive.framework.compatible.MessageAction
    //   138	4	2	localException1	Exception
    //   181	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   16	41	138	java/lang/Exception
    //   41	58	138	java/lang/Exception
    //   58	86	181	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\CameraActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */