package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class SubscriberMethodFinder
{
  private static final int MODIFIERS_IGNORE = 1032;
  private static final Map<String, List<SubscriberMethod>> methodCache = new HashMap();
  private static final Map<Class<?>, Class<?>> skipMethodVerificationForClasses = new ConcurrentHashMap();
  
  static void clearCaches()
  {
    synchronized (methodCache)
    {
      methodCache.clear();
      return;
    }
  }
  
  public static void clearSkipMethodVerifications()
  {
    skipMethodVerificationForClasses.clear();
  }
  
  static void skipMethodVerificationFor(Class<?> paramClass)
  {
    if (!methodCache.isEmpty()) {
      throw new IllegalStateException("This method must be called before registering anything");
    }
    skipMethodVerificationForClasses.put(paramClass, paramClass);
  }
  
  List<SubscriberMethod> findSubscriberMethods(Class<?> arg1, String paramString)
  {
    String str1 = ???.getName() + '.' + paramString;
    synchronized (methodCache)
    {
      localObject2 = (List)methodCache.get(str1);
      if (localObject2 != null) {
        return (List<SubscriberMethod>)localObject2;
      }
    }
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder();
    Method[] arrayOfMethod;
    int i;
    for (Object localObject2 = ???;; localObject2 = ((Class)localObject2).getSuperclass())
    {
      if (localObject2 == null) {}
      do
      {
        if (!localArrayList.isEmpty()) {
          break;
        }
        throw new EventBusException("Subscriber " + ??? + " has no public methods called " + paramString);
        ??? = ((Class)localObject2).getName();
      } while ((((String)???).startsWith("java.")) || (((String)???).startsWith("javax.")) || (((String)???).startsWith("android.")));
      arrayOfMethod = ((Class)localObject2).getMethods();
      int j = arrayOfMethod.length;
      i = 0;
      if (i < j) {
        break;
      }
    }
    Method localMethod = arrayOfMethod[i];
    String str2 = localMethod.getName();
    if (str2.startsWith(paramString))
    {
      int k = localMethod.getModifiers();
      if (((k & 0x1) == 0) || ((k & 0x408) != 0)) {
        break label452;
      }
      Object localObject3 = localMethod.getParameterTypes();
      if (localObject3.length == 1)
      {
        ??? = str2.substring(paramString.length());
        if (((String)???).length() != 0) {
          break label366;
        }
        ??? = ThreadMode.PostThread;
        label288:
        localObject3 = localObject3[0];
        localStringBuilder.setLength(0);
        localStringBuilder.append(str2);
        localStringBuilder.append('>').append(((Class)localObject3).getName());
        if (localHashSet.add(localStringBuilder.toString())) {
          localArrayList.add(new SubscriberMethod(localMethod, (ThreadMode)???, (Class)localObject3));
        }
      }
    }
    for (;;)
    {
      i += 1;
      break;
      label366:
      if (((String)???).equals("MainThread"))
      {
        ??? = ThreadMode.MainThread;
        break label288;
      }
      if (((String)???).equals("BackgroundThread"))
      {
        ??? = ThreadMode.BackgroundThread;
        break label288;
      }
      if (((String)???).equals("Async"))
      {
        ??? = ThreadMode.Async;
        break label288;
      }
      if (!skipMethodVerificationForClasses.containsKey(localObject2))
      {
        throw new EventBusException("Illegal onEvent method, check for typos: " + localMethod);
        label452:
        if (!skipMethodVerificationForClasses.containsKey(localObject2)) {
          Log.d(EventBus.TAG, "Skipping method (not public, static or abstract): " + localObject2 + "." + str2);
        }
      }
    }
    synchronized (methodCache)
    {
      methodCache.put(str1, localArrayList);
      return localArrayList;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\SubscriberMethodFinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */