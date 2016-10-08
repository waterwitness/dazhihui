package com.android.dazhihui.ui.screen;

import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.stock.qf;
import com.android.dazhihui.ui.screen.stock.qg;
import com.android.dazhihui.ui.widget.adv.ac;
import com.android.dazhihui.ui.widget.adv.c;

public class a
  extends e
{
  private c advertManage;
  protected boolean isShow = true;
  protected qf refreshHandler;
  
  private void advertOnHiddenChanged(boolean paramBoolean)
  {
    if (getUserVisibleHint()) {
      if (paramBoolean) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.isShow = bool;
      fragmentChanged(paramBoolean);
      return;
    }
  }
  
  public void addAdvert(ac paramac)
  {
    if (this.advertManage == null) {
      this.advertManage = new c();
    }
    this.advertManage.a(paramac);
  }
  
  public void addRefresh(qg paramqg)
  {
    if (this.refreshHandler == null) {
      this.refreshHandler = new qf();
    }
    this.refreshHandler.a(paramqg);
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (this.isShow) {
      advertOnHiddenChanged(true);
    }
  }
  
  public void changeLookFace(y paramy)
  {
    if ((paramy != null) && (paramy != this.mLookFace)) {
      this.mLookFace = paramy;
    }
  }
  
  public void fragmentChanged(boolean paramBoolean)
  {
    if (this.advertManage != null) {
      this.advertManage.a(paramBoolean);
    }
    onFragmentChanged(paramBoolean);
    if (this.refreshHandler != null)
    {
      if (paramBoolean) {
        this.refreshHandler.a();
      }
    }
    else {
      return;
    }
    this.refreshHandler.b();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.advertManage != null) {
      this.advertManage.b();
    }
    if (this.refreshHandler != null) {
      this.refreshHandler.c();
    }
  }
  
  public void onFragmentChanged(boolean paramBoolean) {}
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onPause()
  {
    super.onPause();
    if ((!isHidden()) && (getUserVisibleHint()) && (this.isShow))
    {
      if (this.advertManage != null) {
        this.advertManage.c();
      }
      onFragmentChanged(true);
    }
  }
  
  public void onResume()
  {
    if ((!isHidden()) && (getUserVisibleHint()) && (this.isShow))
    {
      if (this.advertManage != null) {
        this.advertManage.a();
      }
      onFragmentChanged(false);
    }
    super.onResume();
  }
  
  public void removeRefresh(qg paramqg)
  {
    if (this.refreshHandler != null) {
      this.refreshHandler.b(paramqg);
    }
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
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    super.setUserVisibleHint(paramBoolean);
    if (isResumed())
    {
      if ((!paramBoolean) || (!this.isShow)) {
        break label44;
      }
      if (paramBoolean) {
        break label39;
      }
      paramBoolean = bool1;
      fragmentChanged(paramBoolean);
    }
    label39:
    label44:
    do
    {
      return;
      paramBoolean = false;
      break;
      if ((paramBoolean) && (!this.isShow))
      {
        this.isShow = true;
        return;
      }
      if ((!paramBoolean) && (this.isShow))
      {
        if (!paramBoolean) {}
        for (paramBoolean = bool2;; paramBoolean = false)
        {
          fragmentChanged(paramBoolean);
          return;
        }
      }
    } while ((paramBoolean) || (this.isShow));
    this.isShow = true;
  }
  
  public void show()
  {
    super.show();
    if (!this.isShow) {
      advertOnHiddenChanged(false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */