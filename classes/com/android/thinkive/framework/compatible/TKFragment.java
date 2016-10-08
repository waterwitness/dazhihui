package com.android.thinkive.framework.compatible;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public abstract class TKFragment
  extends Fragment
{
  protected abstract void findViews();
  
  protected abstract void initData();
  
  protected abstract void initViews();
  
  protected abstract void setListeners();
  
  public void startTask(CallBack.SchedulerCallBack paramSchedulerCallBack)
  {
    FragmentActivity localFragmentActivity = getActivity();
    if ((localFragmentActivity instanceof TKFragmentActivity)) {
      ((TKFragmentActivity)localFragmentActivity).startTask(paramSchedulerCallBack);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\TKFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */