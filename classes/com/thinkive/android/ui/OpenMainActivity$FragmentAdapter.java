package com.thinkive.android.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.ao;
import java.util.ArrayList;
import java.util.List;

public class OpenMainActivity$FragmentAdapter
  extends ao
{
  private final List<Fragment> a = new ArrayList();
  
  public OpenMainActivity$FragmentAdapter(OpenMainActivity paramOpenMainActivity, ad paramad)
  {
    super(paramad);
  }
  
  public final void a(Fragment paramFragment)
  {
    this.a.add(paramFragment);
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Fragment getItem(int paramInt)
  {
    return (Fragment)this.a.get(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\ui\OpenMainActivity$FragmentAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */