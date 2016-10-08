package com.android.dazhihui.ui.model.stock.adapter;

import android.database.DataSetObserver;

class MergeAdapter$CascadeDataSetObserver
  extends DataSetObserver
{
  private MergeAdapter$CascadeDataSetObserver(MergeAdapter paramMergeAdapter) {}
  
  public void onChanged()
  {
    this.this$0.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    this.this$0.notifyDataSetInvalidated();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\MergeAdapter$CascadeDataSetObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */