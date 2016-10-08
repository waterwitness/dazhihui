package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

final class EventBus$PostingThreadState
{
  boolean canceled;
  Object event;
  List<Object> eventQueue = new ArrayList();
  boolean isMainThread;
  boolean isPosting;
  Subscription subscription;
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\EventBus$PostingThreadState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */