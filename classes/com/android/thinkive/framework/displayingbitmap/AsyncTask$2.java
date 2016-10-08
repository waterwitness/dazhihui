package com.android.thinkive.framework.displayingbitmap;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class AsyncTask$2
  extends AsyncTask.WorkerRunnable<Params, Result>
{
  AsyncTask$2(AsyncTask paramAsyncTask)
  {
    super(null);
  }
  
  public Result call()
  {
    AsyncTask.access$1(this.this$0).set(true);
    Process.setThreadPriority(10);
    return (Result)AsyncTask.access$2(this.this$0, this.this$0.doInBackground(this.mParams));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */