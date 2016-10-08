package com.tencent.avsdk.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

class MyGallery$1
  implements View.OnClickListener
{
  MyGallery$1(MyGallery paramMyGallery, int paramInt, long paramLong) {}
  
  public void onClick(View paramView)
  {
    if (MyGallery.access$000(this.this$0) != null) {
      MyGallery.access$000(this.this$0).onItemSelected(null, paramView, this.val$position, this.val$id);
    }
    MyGallery.selectedId = this.val$position;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\MyGallery$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */