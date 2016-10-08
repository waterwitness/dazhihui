package com.tencent.avsdk.widget;

import android.database.DataSetObserver;

class MyGallery$AdapterDataSetObserver
  extends DataSetObserver
{
  MyGallery$AdapterDataSetObserver(MyGallery paramMyGallery) {}
  
  public void onChanged()
  {
    this.this$0.resetList();
    MyGallery.access$100(this.this$0);
    this.this$0.requestLayout();
  }
  
  public void onInvalidated()
  {
    this.this$0.requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\MyGallery$AdapterDataSetObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */