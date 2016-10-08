package com.android.thinkive.framework.displayingbitmap;

public class ImageWorker$CacheAsyncTask
  extends AsyncTask<Object, Void, Void>
{
  protected ImageWorker$CacheAsyncTask(ImageWorker paramImageWorker) {}
  
  protected Void doInBackground(Object... paramVarArgs)
  {
    switch (((Integer)paramVarArgs[0]).intValue())
    {
    }
    for (;;)
    {
      return null;
      this.this$0.clearCacheInternal();
      continue;
      this.this$0.initDiskCacheInternal();
      continue;
      this.this$0.flushCacheInternal();
      continue;
      this.this$0.closeCacheInternal();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageWorker$CacheAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */