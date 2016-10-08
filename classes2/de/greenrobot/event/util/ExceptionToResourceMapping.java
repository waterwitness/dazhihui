package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExceptionToResourceMapping
{
  public final Map<Class<? extends Throwable>, Integer> throwableToMsgIdMap = new HashMap();
  
  public ExceptionToResourceMapping addMapping(Class<? extends Throwable> paramClass, int paramInt)
  {
    this.throwableToMsgIdMap.put(paramClass, Integer.valueOf(paramInt));
    return this;
  }
  
  public Integer mapThrowable(Throwable paramThrowable)
  {
    int i = 20;
    Object localObject1 = paramThrowable;
    Object localObject2;
    do
    {
      localObject2 = mapThrowableFlat((Throwable)localObject1);
      if (localObject2 != null) {
        return (Integer)localObject2;
      }
      localObject2 = ((Throwable)localObject1).getCause();
      i -= 1;
      if ((i <= 0) || (localObject2 == paramThrowable)) {
        break;
      }
      localObject1 = localObject2;
    } while (localObject2 != null);
    Log.d(EventBus.TAG, "No specific message ressource ID found for " + paramThrowable);
    return null;
  }
  
  protected Integer mapThrowableFlat(Throwable paramThrowable)
  {
    Class localClass2 = paramThrowable.getClass();
    Integer localInteger = (Integer)this.throwableToMsgIdMap.get(localClass2);
    if (localInteger == null)
    {
      Iterator localIterator = this.throwableToMsgIdMap.entrySet().iterator();
      Class localClass1;
      for (paramThrowable = null;; paramThrowable = localClass1)
      {
        Map.Entry localEntry;
        do
        {
          if (!localIterator.hasNext()) {
            return localInteger;
          }
          localEntry = (Map.Entry)localIterator.next();
          localClass1 = (Class)localEntry.getKey();
        } while ((!localClass1.isAssignableFrom(localClass2)) || ((paramThrowable != null) && (!paramThrowable.isAssignableFrom(localClass1))));
        localInteger = (Integer)localEntry.getValue();
      }
    }
    return localInteger;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ExceptionToResourceMapping.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */