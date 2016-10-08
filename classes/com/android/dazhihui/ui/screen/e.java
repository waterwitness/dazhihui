package com.android.dazhihui.ui.screen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.widget.k;
import com.android.dazhihui.ui.widget.m;

public abstract class e
  extends Fragment
  implements i, IRequestAdapterListener
{
  protected Bundle mBundle;
  protected int mFragmentId;
  protected y mLookFace;
  protected e mNext;
  protected e mPrevious;
  protected RequestAdapter mRequestAdapter = new f(this);
  
  public void beforeHidden()
  {
    this.mRequestAdapter.stop();
  }
  
  public void changeLookFace(y paramy)
  {
    if ((paramy != null) && (paramy != this.mLookFace)) {
      this.mLookFace = paramy;
    }
  }
  
  public void clearRequest()
  {
    this.mRequestAdapter.clearRequest();
  }
  
  public Bundle getBundle()
  {
    return this.mBundle;
  }
  
  public int getFragmentId()
  {
    return this.mFragmentId;
  }
  
  public e getNext()
  {
    return this.mNext;
  }
  
  public e getPrevious()
  {
    return this.mPrevious;
  }
  
  public View getScroolView()
  {
    return null;
  }
  
  public void handleResponse(h paramh, j paramj) {}
  
  public void handleTimeout(h paramh) {}
  
  public void loadMoreData() {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onBackPressed()
  {
    beforeHidden();
  }
  
  public void onDestroy()
  {
    this.mRequestAdapter.destory();
    super.onDestroy();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onPulledrefresh(boolean paramBoolean) {}
  
  public void onResume()
  {
    setLookFace();
    if ((isVisible()) && (getUserVisibleHint())) {
      this.mRequestAdapter.startAutoRequestPeriod();
    }
    super.onResume();
  }
  
  public void onStop()
  {
    this.mRequestAdapter.stop();
    super.onStop();
  }
  
  public void promptTrade(String paramString1, String paramString2, String paramString3, String paramString4, m paramm1, m paramm2, m paramm3)
  {
    k localk = new k();
    if (!TextUtils.isEmpty(paramString1)) {
      localk.a(paramString1);
    }
    localk.b(paramString2);
    if (!TextUtils.isEmpty(paramString3)) {
      localk.b(paramString3, paramm1);
    }
    if (!TextUtils.isEmpty(paramString4)) {
      localk.a(paramString4, paramm2);
    }
    if (paramm3 != null) {
      localk.a(paramm3);
    }
    localk.a(getActivity());
  }
  
  public void refresh() {}
  
  public void registRequestListener(h paramh)
  {
    this.mRequestAdapter.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.mRequestAdapter.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.mRequestAdapter.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.mRequestAdapter.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.mRequestAdapter.setAutoRequestPeriod(paramLong);
  }
  
  public void setBundle(Bundle paramBundle)
  {
    this.mBundle = paramBundle;
  }
  
  public void setFragmentId(int paramInt)
  {
    this.mFragmentId = paramInt;
  }
  
  public void setLookFace()
  {
    y localy = g.a().b();
    if ((localy != null) && (localy != this.mLookFace))
    {
      changeLookFace(localy);
      this.mLookFace = localy;
    }
  }
  
  public void setNext(e parame)
  {
    this.mNext = parame;
  }
  
  public void setPrevious(e parame)
  {
    this.mPrevious = parame;
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2) {}
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean)
    {
      setLookFace();
      this.mRequestAdapter.startAutoRequestPeriod();
      return;
    }
    this.mRequestAdapter.stop();
  }
  
  public void show()
  {
    setLookFace();
    this.mRequestAdapter.startAutoRequestPeriod();
  }
  
  public void showShortToast(int paramInt)
  {
    if (getActivity() == null) {
      return;
    }
    Toast.makeText(getActivity(), getString(paramInt), 0).show();
  }
  
  public void showShortToast(String paramString)
  {
    if (getActivity() == null) {
      return;
    }
    Toast.makeText(getActivity(), paramString, 0).show();
  }
  
  public void startAutoRequestPeriod()
  {
    this.mRequestAdapter.startAutoRequestPeriod();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */