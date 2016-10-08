package tencent.tls.request;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import tencent.tls.report.QLog;

class SSORunner$ProxyListener
  implements InvocationHandler
{
  SSORunner$ProxyListener(SSORunner paramSSORunner) {}
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    paramMethod = paramMethod.getName();
    QLog.i("proxy " + paramMethod);
    if (paramMethod.equals("onSuccess")) {
      onSuccess((byte[])paramArrayOfObject[0]);
    }
    do
    {
      return paramObject;
      if (paramMethod.equals("onError"))
      {
        onError(((Integer)paramArrayOfObject[0]).intValue(), (String)paramArrayOfObject[1]);
        return paramObject;
      }
      if ("equals".equals(paramMethod))
      {
        if (paramObject == paramArrayOfObject[0]) {
          bool = true;
        }
        return Boolean.valueOf(bool);
      }
      if ("hashCode".equals(paramMethod)) {
        return Integer.valueOf(System.identityHashCode(paramObject));
      }
    } while (!"toString".equals(paramMethod));
    return paramObject.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(paramObject)) + ", with InvocationHandler " + this;
  }
  
  void onError(int paramInt, String arg2)
  {
    QLog.i("sso err " + paramInt + " errmsg " + ???);
    SSORunner.access$002(this.this$0, null);
    synchronized (SSORunner.access$100(this.this$0))
    {
      SSORunner.access$100(this.this$0).notify();
      return;
    }
  }
  
  void onSuccess(byte[] arg1)
  {
    SSORunner.access$002(this.this$0, ???);
    synchronized (SSORunner.access$100(this.this$0))
    {
      SSORunner.access$100(this.this$0).notify();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\SSORunner$ProxyListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */