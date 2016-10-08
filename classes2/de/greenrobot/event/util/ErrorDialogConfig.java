package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.EventBus;

public class ErrorDialogConfig
{
  int defaultDialogIconId;
  final int defaultErrorMsgId;
  Class<?> defaultEventTypeOnDialogClosed;
  final int defaultTitleId;
  EventBus eventBus;
  boolean logExceptions = true;
  final ExceptionToResourceMapping mapping;
  final Resources resources;
  String tagForLoggingExceptions;
  
  public ErrorDialogConfig(Resources paramResources, int paramInt1, int paramInt2)
  {
    this.resources = paramResources;
    this.defaultTitleId = paramInt1;
    this.defaultErrorMsgId = paramInt2;
    this.mapping = new ExceptionToResourceMapping();
  }
  
  public ErrorDialogConfig addMapping(Class<? extends Throwable> paramClass, int paramInt)
  {
    this.mapping.addMapping(paramClass, paramInt);
    return this;
  }
  
  public void disableExceptionLogging()
  {
    this.logExceptions = false;
  }
  
  EventBus getEventBus()
  {
    if (this.eventBus != null) {
      return this.eventBus;
    }
    return EventBus.getDefault();
  }
  
  public int getMessageIdForThrowable(Throwable paramThrowable)
  {
    Integer localInteger = this.mapping.mapThrowable(paramThrowable);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    Log.d(EventBus.TAG, "No specific message ressource ID found for " + paramThrowable);
    return this.defaultErrorMsgId;
  }
  
  public void setDefaultDialogIconId(int paramInt)
  {
    this.defaultDialogIconId = paramInt;
  }
  
  public void setDefaultEventTypeOnDialogClosed(Class<?> paramClass)
  {
    this.defaultEventTypeOnDialogClosed = paramClass;
  }
  
  public void setEventBus(EventBus paramEventBus)
  {
    this.eventBus = paramEventBus;
  }
  
  public void setTagForLoggingExceptions(String paramString)
  {
    this.tagForLoggingExceptions = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */