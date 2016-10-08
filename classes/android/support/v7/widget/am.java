package android.support.v7.widget;

import android.support.v4.os.l;
import android.view.ViewGroup;
import java.util.List;

public abstract class am<VH extends bk>
{
  private boolean mHasStableIds = false;
  private final an mObservable = new an();
  
  public final void bindViewHolder(VH paramVH, int paramInt)
  {
    paramVH.mPosition = paramInt;
    if (hasStableIds()) {
      paramVH.mItemId = getItemId(paramInt);
    }
    paramVH.setFlags(1, 519);
    l.a("RV OnBindView");
    onBindViewHolder(paramVH, paramInt, paramVH.getUnmodifiedPayloads());
    paramVH.clearPayload();
    l.a();
  }
  
  public final VH createViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    l.a("RV CreateView");
    paramViewGroup = onCreateViewHolder(paramViewGroup, paramInt);
    paramViewGroup.mItemViewType = paramInt;
    l.a();
    return paramViewGroup;
  }
  
  public abstract int getItemCount();
  
  public long getItemId(int paramInt)
  {
    return -1L;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final boolean hasObservers()
  {
    return this.mObservable.a();
  }
  
  public final boolean hasStableIds()
  {
    return this.mHasStableIds;
  }
  
  public final void notifyDataSetChanged()
  {
    this.mObservable.b();
  }
  
  public final void notifyItemChanged(int paramInt)
  {
    this.mObservable.a(paramInt, 1);
  }
  
  public final void notifyItemChanged(int paramInt, Object paramObject)
  {
    this.mObservable.a(paramInt, 1, paramObject);
  }
  
  public final void notifyItemInserted(int paramInt)
  {
    this.mObservable.b(paramInt, 1);
  }
  
  public final void notifyItemMoved(int paramInt1, int paramInt2)
  {
    this.mObservable.d(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    this.mObservable.a(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this.mObservable.a(paramInt1, paramInt2, paramObject);
  }
  
  public final void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    this.mObservable.b(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    this.mObservable.c(paramInt1, paramInt2);
  }
  
  public final void notifyItemRemoved(int paramInt)
  {
    this.mObservable.c(paramInt, 1);
  }
  
  public void onAttachedToRecyclerView(RecyclerView paramRecyclerView) {}
  
  public abstract void onBindViewHolder(VH paramVH, int paramInt);
  
  public void onBindViewHolder(VH paramVH, int paramInt, List<Object> paramList)
  {
    onBindViewHolder(paramVH, paramInt);
  }
  
  public abstract VH onCreateViewHolder(ViewGroup paramViewGroup, int paramInt);
  
  public void onDetachedFromRecyclerView(RecyclerView paramRecyclerView) {}
  
  public boolean onFailedToRecycleView(VH paramVH)
  {
    return false;
  }
  
  public void onViewAttachedToWindow(VH paramVH) {}
  
  public void onViewDetachedFromWindow(VH paramVH) {}
  
  public void onViewRecycled(VH paramVH) {}
  
  public void registerAdapterDataObserver(ao paramao)
  {
    this.mObservable.registerObserver(paramao);
  }
  
  public void setHasStableIds(boolean paramBoolean)
  {
    if (hasObservers()) {
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    this.mHasStableIds = paramBoolean;
  }
  
  public void unregisterAdapterDataObserver(ao paramao)
  {
    this.mObservable.unregisterObserver(paramao);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */