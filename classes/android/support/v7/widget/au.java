package android.support.v7.widget;

class au
  implements as
{
  private au(RecyclerView paramRecyclerView) {}
  
  public void a(bk parambk)
  {
    parambk.setIsRecyclable(true);
    if ((parambk.mShadowedHolder != null) && (parambk.mShadowingHolder == null)) {
      parambk.mShadowedHolder = null;
    }
    parambk.mShadowingHolder = null;
    if ((!bk.access$6100(parambk)) && (!RecyclerView.c(this.a, parambk.itemView)) && (parambk.isTmpDetached())) {
      this.a.removeDetachedView(parambk.itemView, false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */