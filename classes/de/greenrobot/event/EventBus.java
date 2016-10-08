package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventBus
{
  private static final String DEFAULT_METHOD_NAME = "onEvent";
  public static String TAG = "Event";
  private static volatile EventBus defaultInstance;
  private static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();
  static ExecutorService executorService = ;
  private final AsyncPoster asyncPoster = new AsyncPoster(this);
  private final BackgroundPoster backgroundPoster = new BackgroundPoster(this);
  private final ThreadLocal<EventBus.PostingThreadState> currentPostingThreadState = new EventBus.1(this);
  private boolean logSubscriberExceptions = true;
  private final HandlerPoster mainThreadPoster = new HandlerPoster(this, Looper.getMainLooper(), 10);
  private final Map<Class<?>, Object> stickyEvents = new ConcurrentHashMap();
  private boolean subscribed;
  private final SubscriberMethodFinder subscriberMethodFinder = new SubscriberMethodFinder();
  private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> subscriptionsByEventType = new HashMap();
  private final Map<Object, List<Class<?>>> typesBySubscriber = new HashMap();
  
  static void addInterfaces(List<Class<?>> paramList, Class<?>[] paramArrayOfClass)
  {
    int j = paramArrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      Class<?> localClass = paramArrayOfClass[i];
      if (!paramList.contains(localClass))
      {
        paramList.add(localClass);
        addInterfaces(paramList, localClass.getInterfaces());
      }
      i += 1;
    }
  }
  
  public static void clearCaches()
  {
    SubscriberMethodFinder.clearCaches();
    eventTypesCache.clear();
  }
  
  public static void clearSkipMethodNameVerifications() {}
  
  private List<Class<?>> findEventTypes(Class<?> paramClass)
  {
    synchronized (eventTypesCache)
    {
      Object localObject2 = (List)eventTypesCache.get(paramClass);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        localObject1 = paramClass;
        if (localObject1 == null)
        {
          eventTypesCache.put(paramClass, localObject2);
          localObject1 = localObject2;
        }
      }
      else
      {
        return (List<Class<?>>)localObject1;
      }
      ((List)localObject2).add(localObject1);
      addInterfaces((List)localObject2, ((Class)localObject1).getInterfaces());
      localObject1 = ((Class)localObject1).getSuperclass();
    }
  }
  
  public static EventBus getDefault()
  {
    if (defaultInstance == null) {}
    try
    {
      if (defaultInstance == null) {
        defaultInstance = new EventBus();
      }
      return defaultInstance;
    }
    finally {}
  }
  
  /* Error */
  private void postSingleEvent(Object paramObject, EventBus.PostingThreadState paramPostingThreadState)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 196	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: astore_3
    //   5: aload_0
    //   6: aload_3
    //   7: invokespecial 198	de/greenrobot/event/EventBus:findEventTypes	(Ljava/lang/Class;)Ljava/util/List;
    //   10: astore 4
    //   12: aload 4
    //   14: invokeinterface 201 1 0
    //   19: istore 9
    //   21: iconst_0
    //   22: istore 8
    //   24: iconst_0
    //   25: istore 7
    //   27: iload 8
    //   29: iload 9
    //   31: if_icmplt +57 -> 88
    //   34: iload 7
    //   36: ifne +51 -> 87
    //   39: getstatic 81	de/greenrobot/event/EventBus:TAG	Ljava/lang/String;
    //   42: new 203	java/lang/StringBuilder
    //   45: dup
    //   46: ldc -51
    //   48: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: aload_3
    //   52: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokestatic 222	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   61: pop
    //   62: aload_3
    //   63: ldc -32
    //   65: if_acmpeq +22 -> 87
    //   68: aload_3
    //   69: ldc -30
    //   71: if_acmpeq +16 -> 87
    //   74: aload_0
    //   75: new 224	de/greenrobot/event/NoSubscriberEvent
    //   78: dup
    //   79: aload_0
    //   80: aload_1
    //   81: invokespecial 229	de/greenrobot/event/NoSubscriberEvent:<init>	(Lde/greenrobot/event/EventBus;Ljava/lang/Object;)V
    //   84: invokevirtual 233	de/greenrobot/event/EventBus:post	(Ljava/lang/Object;)V
    //   87: return
    //   88: aload 4
    //   90: iload 8
    //   92: invokeinterface 236 2 0
    //   97: checkcast 148	java/lang/Class
    //   100: astore 5
    //   102: aload_0
    //   103: monitorenter
    //   104: aload_0
    //   105: getfield 98	de/greenrobot/event/EventBus:subscriptionsByEventType	Ljava/util/Map;
    //   108: aload 5
    //   110: invokeinterface 174 2 0
    //   115: checkcast 238	java/util/concurrent/CopyOnWriteArrayList
    //   118: astore 5
    //   120: aload_0
    //   121: monitorexit
    //   122: aload 5
    //   124: ifnull +126 -> 250
    //   127: aload 5
    //   129: invokevirtual 242	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   132: ifne +118 -> 250
    //   135: aload 5
    //   137: invokevirtual 246	java/util/concurrent/CopyOnWriteArrayList:iterator	()Ljava/util/Iterator;
    //   140: astore 5
    //   142: aload 5
    //   144: invokeinterface 251 1 0
    //   149: ifne +20 -> 169
    //   152: iconst_1
    //   153: istore 7
    //   155: iload 8
    //   157: iconst_1
    //   158: iadd
    //   159: istore 8
    //   161: goto -134 -> 27
    //   164: astore_1
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_1
    //   168: athrow
    //   169: aload 5
    //   171: invokeinterface 255 1 0
    //   176: checkcast 257	de/greenrobot/event/Subscription
    //   179: astore 6
    //   181: aload_2
    //   182: aload_1
    //   183: putfield 263	de/greenrobot/event/EventBus$PostingThreadState:event	Ljava/lang/Object;
    //   186: aload_2
    //   187: aload 6
    //   189: putfield 267	de/greenrobot/event/EventBus$PostingThreadState:subscription	Lde/greenrobot/event/Subscription;
    //   192: aload_0
    //   193: aload 6
    //   195: aload_1
    //   196: aload_2
    //   197: getfield 270	de/greenrobot/event/EventBus$PostingThreadState:isMainThread	Z
    //   200: invokespecial 274	de/greenrobot/event/EventBus:postToSubscription	(Lde/greenrobot/event/Subscription;Ljava/lang/Object;Z)V
    //   203: aload_2
    //   204: getfield 277	de/greenrobot/event/EventBus$PostingThreadState:canceled	Z
    //   207: istore 10
    //   209: aload_2
    //   210: aconst_null
    //   211: putfield 263	de/greenrobot/event/EventBus$PostingThreadState:event	Ljava/lang/Object;
    //   214: aload_2
    //   215: aconst_null
    //   216: putfield 267	de/greenrobot/event/EventBus$PostingThreadState:subscription	Lde/greenrobot/event/Subscription;
    //   219: aload_2
    //   220: iconst_0
    //   221: putfield 277	de/greenrobot/event/EventBus$PostingThreadState:canceled	Z
    //   224: iload 10
    //   226: ifeq -84 -> 142
    //   229: goto -77 -> 152
    //   232: astore_1
    //   233: aload_2
    //   234: aconst_null
    //   235: putfield 263	de/greenrobot/event/EventBus$PostingThreadState:event	Ljava/lang/Object;
    //   238: aload_2
    //   239: aconst_null
    //   240: putfield 267	de/greenrobot/event/EventBus$PostingThreadState:subscription	Lde/greenrobot/event/Subscription;
    //   243: aload_2
    //   244: iconst_0
    //   245: putfield 277	de/greenrobot/event/EventBus$PostingThreadState:canceled	Z
    //   248: aload_1
    //   249: athrow
    //   250: goto -95 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	EventBus
    //   0	253	1	paramObject	Object
    //   0	253	2	paramPostingThreadState	EventBus.PostingThreadState
    //   4	65	3	localClass	Class
    //   10	79	4	localList	List
    //   100	70	5	localObject	Object
    //   179	15	6	localSubscription	Subscription
    //   25	129	7	i	int
    //   22	138	8	j	int
    //   19	13	9	k	int
    //   207	18	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   104	122	164	finally
    //   165	167	164	finally
    //   192	209	232	finally
  }
  
  private void postToSubscription(Subscription paramSubscription, Object paramObject, boolean paramBoolean)
  {
    switch (paramSubscription.subscriberMethod.threadMode)
    {
    default: 
      throw new IllegalStateException("Unknown thread mode: " + paramSubscription.subscriberMethod.threadMode);
    case Async: 
      invokeSubscriber(paramSubscription, paramObject);
      return;
    case BackgroundThread: 
      if (paramBoolean)
      {
        invokeSubscriber(paramSubscription, paramObject);
        return;
      }
      this.mainThreadPoster.enqueue(paramSubscription, paramObject);
      return;
    case MainThread: 
      if (paramBoolean)
      {
        this.backgroundPoster.enqueue(paramSubscription, paramObject);
        return;
      }
      invokeSubscriber(paramSubscription, paramObject);
      return;
    }
    this.asyncPoster.enqueue(paramSubscription, paramObject);
  }
  
  /* Error */
  private void register(Object paramObject, String paramString, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 133	de/greenrobot/event/EventBus:subscriberMethodFinder	Lde/greenrobot/event/SubscriberMethodFinder;
    //   6: aload_1
    //   7: invokevirtual 196	java/lang/Object:getClass	()Ljava/lang/Class;
    //   10: aload_2
    //   11: invokevirtual 308	de/greenrobot/event/SubscriberMethodFinder:findSubscriberMethods	(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/List;
    //   14: invokeinterface 309 1 0
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 251 1 0
    //   26: istore 5
    //   28: iload 5
    //   30: ifne +6 -> 36
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: aload_0
    //   37: aload_1
    //   38: aload_2
    //   39: invokeinterface 255 1 0
    //   44: checkcast 285	de/greenrobot/event/SubscriberMethod
    //   47: iload_3
    //   48: iload 4
    //   50: invokespecial 313	de/greenrobot/event/EventBus:subscribe	(Ljava/lang/Object;Lde/greenrobot/event/SubscriberMethod;ZI)V
    //   53: goto -33 -> 20
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	EventBus
    //   0	61	1	paramObject	Object
    //   0	61	2	paramString	String
    //   0	61	3	paramBoolean	boolean
    //   0	61	4	paramInt	int
    //   26	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	20	56	finally
    //   20	28	56	finally
    //   36	53	56	finally
  }
  
  private void register(Object paramObject, String paramString, boolean paramBoolean, Class<?> paramClass, Class<?>... paramVarArgs)
  {
    label130:
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = paramObject.getClass();
        paramString = this.subscriberMethodFinder.findSubscriberMethods((Class)localObject, paramString).iterator();
        boolean bool = paramString.hasNext();
        if (!bool) {
          return;
        }
        localObject = (SubscriberMethod)paramString.next();
        if (paramClass == ((SubscriberMethod)localObject).eventType)
        {
          subscribe(paramObject, (SubscriberMethod)localObject, paramBoolean, 0);
          continue;
        }
        if (paramVarArgs == null) {
          continue;
        }
      }
      finally {}
      int j = paramVarArgs.length;
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label130;
        }
        if (paramVarArgs[i] == ((SubscriberMethod)localObject).eventType)
        {
          subscribe(paramObject, (SubscriberMethod)localObject, paramBoolean, 0);
          break;
        }
        i += 1;
      }
    }
  }
  
  public static void skipMethodVerificationFor(Class<?> paramClass)
  {
    SubscriberMethodFinder.skipMethodVerificationFor(paramClass);
  }
  
  private void subscribe(Object arg1, SubscriberMethod paramSubscriberMethod, boolean paramBoolean, int paramInt)
  {
    this.subscribed = true;
    Class localClass = paramSubscriberMethod.eventType;
    Object localObject = (CopyOnWriteArrayList)this.subscriptionsByEventType.get(localClass);
    Subscription localSubscription = new Subscription(???, paramSubscriberMethod, paramInt);
    int i;
    if (localObject == null)
    {
      paramSubscriberMethod = new CopyOnWriteArrayList();
      this.subscriptionsByEventType.put(localClass, paramSubscriberMethod);
      i = paramSubscriberMethod.size();
      paramInt = 0;
      if (paramInt <= i) {
        break label260;
      }
      label82:
      localObject = (List)this.typesBySubscriber.get(???);
      paramSubscriberMethod = (SubscriberMethod)localObject;
      if (localObject == null)
      {
        paramSubscriberMethod = new ArrayList();
        this.typesBySubscriber.put(???, paramSubscriberMethod);
      }
      paramSubscriberMethod.add(localClass);
      if (!paramBoolean) {}
    }
    for (;;)
    {
      synchronized (this.stickyEvents)
      {
        paramSubscriberMethod = this.stickyEvents.get(localClass);
        if (paramSubscriberMethod != null)
        {
          if (Looper.getMainLooper() == Looper.myLooper())
          {
            paramBoolean = true;
            postToSubscription(localSubscription, paramSubscriberMethod, paramBoolean);
          }
        }
        else
        {
          return;
          paramSubscriberMethod = ((CopyOnWriteArrayList)localObject).iterator();
          if (!paramSubscriberMethod.hasNext())
          {
            paramSubscriberMethod = (SubscriberMethod)localObject;
            break;
          }
          if (!((Subscription)paramSubscriberMethod.next()).equals(localSubscription)) {
            continue;
          }
          throw new EventBusException("Subscriber " + ???.getClass() + " already registered to event " + localClass);
          label260:
          if ((paramInt == i) || (localSubscription.priority > ((Subscription)paramSubscriberMethod.get(paramInt)).priority))
          {
            paramSubscriberMethod.add(paramInt, localSubscription);
            break label82;
          }
          paramInt += 1;
        }
      }
      paramBoolean = false;
    }
  }
  
  private void unubscribeByEventType(Object paramObject, Class<?> paramClass)
  {
    paramClass = (List)this.subscriptionsByEventType.get(paramClass);
    int i;
    int j;
    if (paramClass != null)
    {
      i = paramClass.size();
      j = 0;
      if (j < i) {}
    }
    else
    {
      return;
    }
    Subscription localSubscription = (Subscription)paramClass.get(j);
    if (localSubscription.subscriber == paramObject)
    {
      localSubscription.active = false;
      paramClass.remove(j);
      j -= 1;
      i -= 1;
    }
    for (;;)
    {
      j += 1;
      break;
    }
  }
  
  public void cancelEventDelivery(Object paramObject)
  {
    EventBus.PostingThreadState localPostingThreadState = (EventBus.PostingThreadState)this.currentPostingThreadState.get();
    if (!localPostingThreadState.isPosting) {
      throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
    }
    if (paramObject == null) {
      throw new EventBusException("Event may not be null");
    }
    if (localPostingThreadState.event != paramObject) {
      throw new EventBusException("Only the currently handled event may be aborted");
    }
    if (localPostingThreadState.subscription.subscriberMethod.threadMode != ThreadMode.PostThread) {
      throw new EventBusException(" event handlers may only abort the incoming event");
    }
    localPostingThreadState.canceled = true;
  }
  
  public void configureLogSubscriberExceptions(boolean paramBoolean)
  {
    if (this.subscribed) {
      throw new EventBusException("This method must be called before any registration");
    }
    this.logSubscriberExceptions = paramBoolean;
  }
  
  public <T> T getStickyEvent(Class<T> paramClass)
  {
    synchronized (this.stickyEvents)
    {
      paramClass = paramClass.cast(this.stickyEvents.get(paramClass));
      return paramClass;
    }
  }
  
  void invokeSubscriber(PendingPost paramPendingPost)
  {
    Object localObject = paramPendingPost.event;
    Subscription localSubscription = paramPendingPost.subscription;
    PendingPost.releasePendingPost(paramPendingPost);
    if (localSubscription.active) {
      invokeSubscriber(localSubscription, localObject);
    }
  }
  
  void invokeSubscriber(Subscription paramSubscription, Object paramObject)
  {
    try
    {
      paramSubscription.subscriberMethod.method.invoke(paramSubscription.subscriber, new Object[] { paramObject });
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable = localInvocationTargetException.getCause();
      if ((paramObject instanceof SubscriberExceptionEvent))
      {
        Log.e(TAG, "SubscriberExceptionEvent subscriber " + paramSubscription.subscriber.getClass() + " threw an exception", localThrowable);
        paramSubscription = (SubscriberExceptionEvent)paramObject;
        Log.e(TAG, "Initial event " + paramSubscription.causingEvent + " caused exception in " + paramSubscription.causingSubscriber, paramSubscription.throwable);
        return;
      }
      if (this.logSubscriberExceptions) {
        Log.e(TAG, "Could not dispatch event: " + paramObject.getClass() + " to subscribing class " + paramSubscription.subscriber.getClass(), localThrowable);
      }
      post(new SubscriberExceptionEvent(this, localThrowable, paramObject, paramSubscription.subscriber));
      return;
    }
    catch (IllegalAccessException paramSubscription)
    {
      throw new IllegalStateException("Unexpected exception", paramSubscription);
    }
  }
  
  public boolean isRegistered(Object paramObject)
  {
    try
    {
      boolean bool = this.typesBySubscriber.containsKey(paramObject);
      return bool;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public void post(Object paramObject)
  {
    EventBus.PostingThreadState localPostingThreadState = (EventBus.PostingThreadState)this.currentPostingThreadState.get();
    List localList = localPostingThreadState.eventQueue;
    localList.add(paramObject);
    if (localPostingThreadState.isPosting) {
      return;
    }
    if (Looper.getMainLooper() == Looper.myLooper()) {}
    for (boolean bool = true;; bool = false)
    {
      localPostingThreadState.isMainThread = bool;
      localPostingThreadState.isPosting = true;
      if (!localPostingThreadState.canceled) {
        break;
      }
      throw new EventBusException("Internal error. Abort state was not reset");
    }
    try
    {
      do
      {
        postSingleEvent(localList.remove(0), localPostingThreadState);
        bool = localList.isEmpty();
      } while (!bool);
      return;
    }
    finally
    {
      localPostingThreadState.isPosting = false;
      localPostingThreadState.isMainThread = false;
    }
  }
  
  public void postSticky(Object paramObject)
  {
    synchronized (this.stickyEvents)
    {
      this.stickyEvents.put(paramObject.getClass(), paramObject);
      post(paramObject);
      return;
    }
  }
  
  public void register(Object paramObject)
  {
    register(paramObject, "onEvent", false, 0);
  }
  
  public void register(Object paramObject, int paramInt)
  {
    register(paramObject, "onEvent", false, paramInt);
  }
  
  @Deprecated
  public void register(Object paramObject, Class<?> paramClass, Class<?>... paramVarArgs)
  {
    register(paramObject, "onEvent", false, paramClass, paramVarArgs);
  }
  
  @Deprecated
  public void register(Object paramObject, String paramString)
  {
    register(paramObject, paramString, false, 0);
  }
  
  @Deprecated
  public void register(Object paramObject, String paramString, Class<?> paramClass, Class<?>... paramVarArgs)
  {
    register(paramObject, paramString, false, paramClass, paramVarArgs);
  }
  
  public void registerSticky(Object paramObject)
  {
    register(paramObject, "onEvent", true, 0);
  }
  
  public void registerSticky(Object paramObject, int paramInt)
  {
    register(paramObject, "onEvent", true, paramInt);
  }
  
  @Deprecated
  public void registerSticky(Object paramObject, Class<?> paramClass, Class<?>... paramVarArgs)
  {
    register(paramObject, "onEvent", true, paramClass, paramVarArgs);
  }
  
  @Deprecated
  public void registerSticky(Object paramObject, String paramString)
  {
    register(paramObject, paramString, true, 0);
  }
  
  @Deprecated
  public void registerSticky(Object paramObject, String paramString, Class<?> paramClass, Class<?>... paramVarArgs)
  {
    register(paramObject, paramString, true, paramClass, paramVarArgs);
  }
  
  public void removeAllStickyEvents()
  {
    synchronized (this.stickyEvents)
    {
      this.stickyEvents.clear();
      return;
    }
  }
  
  public <T> T removeStickyEvent(Class<T> paramClass)
  {
    synchronized (this.stickyEvents)
    {
      paramClass = paramClass.cast(this.stickyEvents.remove(paramClass));
      return paramClass;
    }
  }
  
  public boolean removeStickyEvent(Object paramObject)
  {
    synchronized (this.stickyEvents)
    {
      Class localClass = paramObject.getClass();
      if (paramObject.equals(this.stickyEvents.get(localClass)))
      {
        this.stickyEvents.remove(localClass);
        return true;
      }
      return false;
    }
  }
  
  public void unregister(Object paramObject)
  {
    for (;;)
    {
      try
      {
        Object localObject = (List)this.typesBySubscriber.get(paramObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          if (!((Iterator)localObject).hasNext())
          {
            this.typesBySubscriber.remove(paramObject);
            return;
          }
          unubscribeByEventType(paramObject, (Class)((Iterator)localObject).next());
          continue;
        }
        Log.w(TAG, "Subscriber to unregister was not registered before: " + paramObject.getClass());
      }
      finally {}
    }
  }
  
  @Deprecated
  public void unregister(Object paramObject, Class<?>... paramVarArgs)
  {
    try
    {
      if (paramVarArgs.length == 0) {
        throw new IllegalArgumentException("Provide at least one event class");
      }
    }
    finally {}
    List localList = (List)this.typesBySubscriber.get(paramObject);
    int i;
    if (localList != null)
    {
      int j = paramVarArgs.length;
      i = 0;
      if (i >= j) {
        if (localList.isEmpty()) {
          this.typesBySubscriber.remove(paramObject);
        }
      }
    }
    for (;;)
    {
      return;
      Class<?> localClass = paramVarArgs[i];
      unubscribeByEventType(paramObject, localClass);
      localList.remove(localClass);
      i += 1;
      break;
      Log.w(TAG, "Subscriber to unregister was not registered before: " + paramObject.getClass());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\de\greenrobot\event\EventBus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */