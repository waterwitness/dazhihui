package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.EventBus;
import java.lang.reflect.Constructor;

class AsyncExecutor$1
  implements Runnable
{
  AsyncExecutor$1(AsyncExecutor paramAsyncExecutor, AsyncExecutor.RunnableEx paramRunnableEx) {}
  
  public void run()
  {
    try
    {
      this.val$runnable.run();
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject = AsyncExecutor.access$1(this.this$0).newInstance(new Object[] { localException1 });
        if ((localObject instanceof HasExecutionScope)) {
          ((HasExecutionScope)localObject).setExecutionScope(AsyncExecutor.access$2(this.this$0));
        }
        AsyncExecutor.access$3(this.this$0).post(localObject);
        return;
      }
      catch (Exception localException2)
      {
        Log.e(EventBus.TAG, "Original exception:", localException1);
        throw new RuntimeException("Could not create failure event", localException2);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\AsyncExecutor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */