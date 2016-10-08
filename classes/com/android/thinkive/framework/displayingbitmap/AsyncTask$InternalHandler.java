package com.android.thinkive.framework.displayingbitmap;

import android.os.Handler;
import android.os.Message;

class AsyncTask$InternalHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    AsyncTask.AsyncTaskResult localAsyncTaskResult = (AsyncTask.AsyncTaskResult)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      AsyncTask.access$0(localAsyncTaskResult.mTask, localAsyncTaskResult.mData[0]);
      return;
    }
    localAsyncTaskResult.mTask.onProgressUpdate(localAsyncTaskResult.mData);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$InternalHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */