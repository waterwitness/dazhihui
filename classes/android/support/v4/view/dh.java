package android.support.v4.view;

import android.database.DataSetObserver;

class dh
  extends DataSetObserver
{
  private dh(ViewPager paramViewPager) {}
  
  public void onChanged()
  {
    this.a.dataSetChanged();
  }
  
  public void onInvalidated()
  {
    this.a.dataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */