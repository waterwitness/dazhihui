package com.android.dazhihui.ui.model.stock.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MergeAdapter
  extends BaseAdapter
  implements SectionIndexer
{
  protected MergeAdapter.PieceStateRoster pieces = new MergeAdapter.PieceStateRoster(null);
  
  public void addAdapter(ListAdapter paramListAdapter)
  {
    this.pieces.add(paramListAdapter);
    paramListAdapter.registerDataSetObserver(new MergeAdapter.CascadeDataSetObserver(this, null));
  }
  
  public void addView(View paramView)
  {
    addView(paramView, false);
  }
  
  public void addView(View paramView, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramView);
    addViews(localArrayList, paramBoolean);
  }
  
  public void addViews(List<View> paramList)
  {
    addViews(paramList, false);
  }
  
  public void addViews(List<View> paramList, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      addAdapter(new MergeAdapter.EnabledSackAdapter(paramList));
      return;
    }
    addAdapter(new SackOfViewsAdapter(paramList));
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public ListAdapter getAdapter(int paramInt)
  {
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i) {
        return localListAdapter;
      }
      paramInt -= i;
    }
    return null;
  }
  
  public int getCount()
  {
    Iterator localIterator = getPieces().iterator();
    for (int i = 0; localIterator.hasNext(); i = ((ListAdapter)localIterator.next()).getCount() + i) {}
    return i;
  }
  
  public Object getItem(int paramInt)
  {
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i) {
        return localListAdapter.getItem(paramInt);
      }
      paramInt -= i;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i) {
        return localListAdapter.getItemId(paramInt);
      }
      paramInt -= i;
    }
    return -1L;
  }
  
  public int getItemViewType(int paramInt)
  {
    Iterator localIterator = this.pieces.getRawPieces().iterator();
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (localIterator.hasNext())
    {
      MergeAdapter.PieceState localPieceState = (MergeAdapter.PieceState)localIterator.next();
      j = i;
      if (localPieceState.isActive)
      {
        j = localPieceState.adapter.getCount();
        if (i < j) {
          return localPieceState.adapter.getItemViewType(i) + paramInt;
        }
        j = i - j;
      }
      paramInt = localPieceState.adapter.getViewTypeCount() + paramInt;
      i = j;
    }
    return -1;
  }
  
  protected List<ListAdapter> getPieces()
  {
    return this.pieces.getPieces();
  }
  
  public int getPositionForSection(int paramInt)
  {
    int m = 0;
    Iterator localIterator = getPieces().iterator();
    int j = 0;
    int i = paramInt;
    paramInt = j;
    j = m;
    ListAdapter localListAdapter;
    Object[] arrayOfObject;
    if (localIterator.hasNext())
    {
      localListAdapter = (ListAdapter)localIterator.next();
      j = i;
      if (!(localListAdapter instanceof SectionIndexer)) {
        break label118;
      }
      arrayOfObject = ((SectionIndexer)localListAdapter).getSections();
      if (arrayOfObject == null) {
        break label134;
      }
    }
    label118:
    label134:
    for (int k = arrayOfObject.length;; k = 0)
    {
      if (i < k)
      {
        j = paramInt + ((SectionIndexer)localListAdapter).getPositionForSection(i);
        return j;
      }
      j = i;
      if (arrayOfObject != null) {
        j = i - k;
      }
      paramInt = localListAdapter.getCount() + paramInt;
      i = j;
      break;
    }
  }
  
  public int getSectionForPosition(int paramInt)
  {
    int k = 0;
    Iterator localIterator = getPieces().iterator();
    int j = 0;
    int i = paramInt;
    paramInt = j;
    j = k;
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = (ListAdapter)localIterator.next();
      j = ((ListAdapter)localObject).getCount();
      if (i >= j) {
        break label89;
      }
      j = k;
      if ((localObject instanceof SectionIndexer)) {
        j = paramInt + ((SectionIndexer)localObject).getSectionForPosition(i);
      }
    }
    return j;
    label89:
    if ((localObject instanceof SectionIndexer))
    {
      localObject = ((SectionIndexer)localObject).getSections();
      if (localObject != null) {
        paramInt += localObject.length;
      }
    }
    for (;;)
    {
      i -= j;
      break;
    }
  }
  
  public Object[] getSections()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ListAdapter)localIterator.next();
      if ((localObject instanceof SectionIndexer))
      {
        localObject = ((SectionIndexer)localObject).getSections();
        if (localObject != null) {
          Collections.addAll(localArrayList, (Object[])localObject);
        }
      }
    }
    if (localArrayList.size() == 0) {
      return new String[0];
    }
    return localArrayList.toArray(new Object[0]);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i) {
        return localListAdapter.getView(paramInt, paramView, paramViewGroup);
      }
      paramInt -= i;
    }
    return null;
  }
  
  public int getViewTypeCount()
  {
    Iterator localIterator = this.pieces.getRawPieces().iterator();
    for (int i = 0; localIterator.hasNext(); i = ((MergeAdapter.PieceState)localIterator.next()).adapter.getViewTypeCount() + i) {}
    return Math.max(i, 1);
  }
  
  public boolean isEnabled(int paramInt)
  {
    Iterator localIterator = getPieces().iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i) {
        return localListAdapter.isEnabled(paramInt);
      }
      paramInt -= i;
    }
    return false;
  }
  
  public void setActive(View paramView, boolean paramBoolean)
  {
    this.pieces.setActive(paramView, paramBoolean);
    notifyDataSetChanged();
  }
  
  public void setActive(ListAdapter paramListAdapter, boolean paramBoolean)
  {
    this.pieces.setActive(paramListAdapter, paramBoolean);
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\MergeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */