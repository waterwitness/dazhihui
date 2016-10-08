package de.greenrobot.event.util;

import android.app.Activity;
import de.greenrobot.event.EventBus;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncExecutor$Builder
{
  private EventBus eventBus;
  private Class<?> failureEventType;
  private Executor threadPool;
  
  public AsyncExecutor build()
  {
    return buildForScope(null);
  }
  
  public AsyncExecutor buildForActivityScope(Activity paramActivity)
  {
    return buildForScope(paramActivity.getClass());
  }
  
  public AsyncExecutor buildForScope(Object paramObject)
  {
    if (this.eventBus == null) {
      this.eventBus = EventBus.getDefault();
    }
    if (this.threadPool == null) {
      this.threadPool = Executors.newCachedThreadPool();
    }
    if (this.failureEventType == null) {
      this.failureEventType = ThrowableFailureEvent.class;
    }
    return new AsyncExecutor(this.threadPool, this.eventBus, this.failureEventType, paramObject, null);
  }
  
  public Builder eventBus(EventBus paramEventBus)
  {
    this.eventBus = paramEventBus;
    return this;
  }
  
  public Builder failureEventType(Class<?> paramClass)
  {
    this.failureEventType = paramClass;
    return this;
  }
  
  public Builder threadPool(Executor paramExecutor)
  {
    this.threadPool = paramExecutor;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\AsyncExecutor$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */