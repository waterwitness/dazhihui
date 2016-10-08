package de.greenrobot.event;

import java.lang.reflect.Method;

final class SubscriberMethod
{
  final Class<?> eventType;
  final Method method;
  String methodString;
  final ThreadMode threadMode;
  
  SubscriberMethod(Method paramMethod, ThreadMode paramThreadMode, Class<?> paramClass)
  {
    this.method = paramMethod;
    this.threadMode = paramThreadMode;
    this.eventType = paramClass;
  }
  
  private void checkMethodString()
  {
    try
    {
      if (this.methodString == null)
      {
        StringBuilder localStringBuilder = new StringBuilder(64);
        localStringBuilder.append(this.method.getDeclaringClass().getName());
        localStringBuilder.append('#').append(this.method.getName());
        localStringBuilder.append('(').append(this.eventType.getName());
        this.methodString = localStringBuilder.toString();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof SubscriberMethod))
    {
      checkMethodString();
      paramObject = (SubscriberMethod)paramObject;
      ((SubscriberMethod)paramObject).checkMethodString();
      return this.methodString.equals(((SubscriberMethod)paramObject).methodString);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.method.hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\SubscriberMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */