package com.android.dazhihui.ui.model.stock.adapter;

import android.view.View;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MergeAdapter$PieceStateRoster
{
  protected ArrayList<ListAdapter> active = null;
  protected ArrayList<MergeAdapter.PieceState> pieces = new ArrayList();
  
  void add(ListAdapter paramListAdapter)
  {
    this.pieces.add(new MergeAdapter.PieceState(paramListAdapter, true));
  }
  
  List<ListAdapter> getPieces()
  {
    if (this.active == null)
    {
      this.active = new ArrayList();
      Iterator localIterator = this.pieces.iterator();
      while (localIterator.hasNext())
      {
        MergeAdapter.PieceState localPieceState = (MergeAdapter.PieceState)localIterator.next();
        if (localPieceState.isActive) {
          this.active.add(localPieceState.adapter);
        }
      }
    }
    return this.active;
  }
  
  List<MergeAdapter.PieceState> getRawPieces()
  {
    return this.pieces;
  }
  
  void setActive(View paramView, boolean paramBoolean)
  {
    Iterator localIterator = this.pieces.iterator();
    while (localIterator.hasNext())
    {
      MergeAdapter.PieceState localPieceState = (MergeAdapter.PieceState)localIterator.next();
      if (((localPieceState.adapter instanceof SackOfViewsAdapter)) && (((SackOfViewsAdapter)localPieceState.adapter).hasView(paramView)))
      {
        localPieceState.isActive = paramBoolean;
        this.active = null;
      }
    }
  }
  
  void setActive(ListAdapter paramListAdapter, boolean paramBoolean)
  {
    Iterator localIterator = this.pieces.iterator();
    while (localIterator.hasNext())
    {
      MergeAdapter.PieceState localPieceState = (MergeAdapter.PieceState)localIterator.next();
      if (localPieceState.adapter == paramListAdapter)
      {
        localPieceState.isActive = paramBoolean;
        this.active = null;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\MergeAdapter$PieceStateRoster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */