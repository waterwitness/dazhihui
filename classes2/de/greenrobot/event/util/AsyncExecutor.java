package de.greenrobot.event.util;

import de.greenrobot.event.EventBus;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

public class AsyncExecutor
{
  private final EventBus eventBus;
  private final Constructor<?> failureEventConstructor;
  private Object scope;
  private final Executor threadPool;
  
  private AsyncExecutor(Executor paramExecutor, EventBus paramEventBus, Class<?> paramClass, Object paramObject)
  {
    this.threadPool = paramExecutor;
    this.eventBus = paramEventBus;
    this.scope = paramObject;
    try
    {
      this.failureEventConstructor = paramClass.getConstructor(new Class[] { Throwable.class });
      return;
    }
    catch (NoSuchMethodException paramExecutor)
    {
      throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", paramExecutor);
    }
  }
  
  public static AsyncExecutor.Builder builder()
  {
    return new AsyncExecutor.Builder(null);
  }
  
  public static AsyncExecutor create()
  {
    return new AsyncExecutor.Builder(null).build();
  }
  
  public void execute(AsyncExecutor.RunnableEx paramRunnableEx)
  {
    this.threadPool.execute(new AsyncExecutor.1(this, paramRunnableEx));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\AsyncExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */