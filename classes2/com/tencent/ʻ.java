package com.tencent;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imcore.EnvRequestClosure;
import com.tencent.imcore.HttpMethod;
import com.tencent.imcore.IEnv;
import com.tencent.imcore.RunClosure;
import com.tencent.imcore.ThreadEntry;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import java.net.HttpURLConnection;
import java.net.URL;

final class ʻ
  extends IEnv
{
  private static int a = 55533;
  private static String b = "imcore_jni";
  private static ʻ d = new ʻ();
  private Handler c = new Handler(Looper.getMainLooper());
  
  public static ʻ a()
  {
    return d;
  }
  
  public final boolean a(Runnable paramRunnable)
  {
    return this.c.post(paramRunnable);
  }
  
  public final boolean createThread(ThreadEntry paramThreadEntry)
  {
    new Thread(new ʾ(this, paramThreadEntry)).start();
    return true;
  }
  
  public final boolean httpRequest(String paramString1, HttpMethod paramHttpMethod, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    try
    {
      paramString1 = (HttpURLConnection)new URL(paramString2).openConnection();
      new Thread(new ʼ(this, paramHttpMethod, paramString1, paramArrayOfByte, paramEnvRequestClosure)).start();
      return true;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return false;
  }
  
  public final boolean runOnMainThread(RunClosure paramRunClosure)
  {
    return this.c.post(new ʿ(this, paramRunClosure));
  }
  
  public final boolean sSORequest(String paramString1, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    return sSORequest(paramString1, paramString2, paramArrayOfByte, paramEnvRequestClosure, IMMsfCoreProxy.get().getReqTimeout());
  }
  
  public final boolean sSORequest(String paramString1, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure, long paramLong)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getMsfUserInfo(paramString1);
    Object localObject = localIMMsfUserInfo;
    if (localIMMsfUserInfo == null)
    {
      QLog.e(b, 1, "sSORequest no user found: " + paramString1);
      localObject = new IMMsfUserInfo();
    }
    QLog.d(b, 1, "request user: " + paramString1 + "|cmd:" + paramString2);
    if ((!paramString2.equals("IMBDH.GetKeyAndIp")) && (!((IMMsfUserInfo)localObject).isLoggedIn()))
    {
      if (paramEnvRequestClosure != null) {
        try
        {
          paramEnvRequestClosure.fail(6014, "sdk not logined!!!");
          return true;
        }
        catch (Throwable paramString1)
        {
          for (;;)
          {
            paramString1 = IMFunc.getExceptionInfo(paramString1);
            QLog.e(b, 1, paramString1);
            paramString2 = TIMManager.getInstance().getExceptionListener();
            if (paramString2 != null) {
              paramString2.onException(paramString1);
            }
          }
        }
      }
      return false;
    }
    localObject = null;
    if (paramEnvRequestClosure != null) {
      localObject = new ʽ(this, paramEnvRequestClosure, paramString1);
    }
    IMMsfCoreProxy.get().request(paramString1, paramString2, paramArrayOfByte, (TIMValueCallBack)localObject, paramLong);
    return paramEnvRequestClosure != null;
  }
  
  public final boolean uploadLogFile(String paramString1, String paramString2, String paramString3)
  {
    return TIMManager.getInstanceById(paramString1).uploadLogFile(paramString2, paramString3);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */