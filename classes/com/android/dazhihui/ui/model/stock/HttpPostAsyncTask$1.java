package com.android.dazhihui.ui.model.stock;

import android.util.Log;

class HttpPostAsyncTask$1
  implements ProgressMultipartEntity.ProgressListener
{
  HttpPostAsyncTask$1(HttpPostAsyncTask paramHttpPostAsyncTask) {}
  
  public void transferred(long paramLong)
  {
    if (HttpPostAsyncTask.access$000(this.this$0) == 0L) {}
    do
    {
      return;
      HttpPostAsyncTask.access$100(this.this$0, new Integer[] { Integer.valueOf((int)((float)paramLong / (float)HttpPostAsyncTask.access$000(this.this$0) * 100.0F)) });
    } while (HttpPostAsyncTask.access$000(this.this$0) != paramLong);
    Log.i("GUH", "flush ok=" + paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HttpPostAsyncTask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */