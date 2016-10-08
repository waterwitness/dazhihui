package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;

public abstract class ao
  extends ax
{
  private static final boolean DEBUG = false;
  private static final String TAG = "FragmentPagerAdapter";
  private at mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private final ad mFragmentManager;
  
  public ao(ad paramad)
  {
    this.mFragmentManager = paramad;
  }
  
  private static String makeFragmentName(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    this.mCurTransaction.d((Fragment)paramObject);
  }
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    if (this.mCurTransaction != null)
    {
      this.mCurTransaction.b();
      this.mCurTransaction = null;
      this.mFragmentManager.b();
    }
  }
  
  public abstract Fragment getItem(int paramInt);
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    long l = getItemId(paramInt);
    Object localObject = makeFragmentName(paramViewGroup.getId(), l);
    localObject = this.mFragmentManager.a((String)localObject);
    if (localObject != null) {
      this.mCurTransaction.e((Fragment)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.mCurrentPrimaryItem)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = getItem(paramInt);
      this.mCurTransaction.a(paramViewGroup.getId(), (Fragment)localObject, makeFragmentName(paramViewGroup.getId(), l));
    }
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable saveState()
  {
    return null;
  }
  
  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (Fragment)paramObject;
    if (paramViewGroup != this.mCurrentPrimaryItem)
    {
      if (this.mCurrentPrimaryItem != null)
      {
        this.mCurrentPrimaryItem.setMenuVisibility(false);
        this.mCurrentPrimaryItem.setUserVisibleHint(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(true);
        paramViewGroup.setUserVisibleHint(true);
      }
      this.mCurrentPrimaryItem = paramViewGroup;
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */