package com.android.dazhihui.ui.screen;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.az;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.screen.stock.AppRestoreAdvertScreen;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.widget.ba;
import com.android.dazhihui.ui.widget.bc;
import com.android.dazhihui.ui.widget.m;

public abstract class BaseActivity
  extends FragmentActivity
  implements i, IRequestAdapterListener
{
  private Dialog mLoadingDlg;
  protected y mLookFace;
  protected RequestAdapter mRequestAdapter = new c(this);
  private az mShakeUtils = null;
  private boolean mSupportShake = false;
  private d mTouchOrClickListener = null;
  private Vibrator mVibrator;
  
  private void doShake()
  {
    this.mVibrator.vibrate(new long[] { 400L, 50L, 400L, 50L }, -1);
  }
  
  private void initShakeUtils()
  {
    this.mVibrator = ((Vibrator)getSystemService("vibrator"));
    this.mShakeUtils = new az(this);
    this.mShakeUtils.a(new b(this));
  }
  
  public void animationFinish()
  {
    super.finish();
    overridePendingTransition(2130968620, 2130968621);
  }
  
  protected void changeLookFace(y paramy) {}
  
  public void clearRequest()
  {
    this.mRequestAdapter.stop();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    try
    {
      if (this.mTouchOrClickListener != null) {
        this.mTouchOrClickListener.j();
      }
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        this.mTouchOrClickListener = null;
      }
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      if (this.mTouchOrClickListener != null) {
        this.mTouchOrClickListener.j();
      }
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        this.mTouchOrClickListener = null;
      }
    }
  }
  
  public void finish()
  {
    onFinish();
    super.finish();
  }
  
  public View getLayoutView(int paramInt)
  {
    return getLayoutInflater().inflate(paramInt, null);
  }
  
  public Dialog getLoadingDialog()
  {
    if (this.mLoadingDlg == null) {
      this.mLoadingDlg = ba.a(this, bc.b);
    }
    return this.mLoadingDlg;
  }
  
  public Resources getResources()
  {
    Resources localResources = super.getResources();
    Configuration localConfiguration = new Configuration();
    localConfiguration.setToDefaults();
    try
    {
      localResources.updateConfiguration(localConfiguration, localResources.getDisplayMetrics());
      return localResources;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return localResources;
  }
  
  public d getTouchOrClickListener()
  {
    return this.mTouchOrClickListener;
  }
  
  public void handleResponse(h paramh, j paramj) {}
  
  public void handleTimeout(h paramh) {}
  
  protected abstract void init(Bundle paramBundle);
  
  public void netException(h paramh, Exception paramException) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    com.android.dazhihui.b.b.a().a(this);
    init(null);
    if (this.mSupportShake) {
      initShakeUtils();
    }
  }
  
  protected void onDestroy()
  {
    com.android.dazhihui.b.b.a().b(this);
    if (com.android.dazhihui.b.b.a().f() == this) {
      com.android.dazhihui.b.b.a().c(null);
    }
    this.mRequestAdapter.destory();
    super.onDestroy();
  }
  
  protected void onFinish()
  {
    if (!com.android.dazhihui.g.a().h()) {
      startActivity(MainScreen.class);
    }
  }
  
  public void onOptionMenuSelect(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    super.onOptionsItemSelected(paramMenuItem);
    onOptionMenuSelect(paramMenuItem.getItemId());
    return true;
  }
  
  protected void onPause()
  {
    if ((this.mLoadingDlg != null) && (this.mLoadingDlg.isShowing())) {
      this.mLoadingDlg.dismiss();
    }
    super.onPause();
    if ((this.mSupportShake) && (this.mShakeUtils != null)) {
      this.mShakeUtils.b();
    }
  }
  
  protected void onResume()
  {
    setLookFace();
    com.android.dazhihui.a.g.a().b(true);
    com.android.dazhihui.b.b.a().c(this);
    com.android.dazhihui.ui.delegate.b.k.a(this).e();
    this.mRequestAdapter.startAutoRequestPeriod();
    super.onResume();
    AppRestoreAdvertScreen.b(this);
    if ((this.mSupportShake) && (this.mShakeUtils != null)) {
      this.mShakeUtils.a();
    }
  }
  
  protected void onStop()
  {
    this.mRequestAdapter.stop();
    super.onStop();
    AppRestoreAdvertScreen.a(this);
    if (this.mVibrator != null) {
      this.mVibrator.cancel();
    }
  }
  
  public void promptTrade(String paramString1, String paramString2, String paramString3, String paramString4, m paramm1, m paramm2, m paramm3)
  {
    com.android.dazhihui.ui.widget.k localk = new com.android.dazhihui.ui.widget.k();
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
    localk.a(this);
  }
  
  public void registRequestListener(h paramh)
  {
    this.mRequestAdapter.registRequestListener(paramh);
  }
  
  public void registerTouchOrClickListener(d paramd)
  {
    this.mTouchOrClickListener = paramd;
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
  
  public void setLookFace()
  {
    y localy = com.android.dazhihui.g.a().b();
    if ((localy != null) && (localy != this.mLookFace))
    {
      changeLookFace(localy);
      this.mLookFace = localy;
    }
  }
  
  public void showShortToast(int paramInt)
  {
    if (!isFinishing())
    {
      String str = getString(paramInt);
      if (!TextUtils.isEmpty(str)) {
        Toast.makeText(this, str, 0).show();
      }
    }
  }
  
  public void showShortToast(String paramString)
  {
    if ((!isFinishing()) && (!TextUtils.isEmpty(paramString))) {
      Toast.makeText(this, paramString, 0).show();
    }
  }
  
  public void startActivity(Class<?> paramClass)
  {
    startActivity(paramClass, null);
  }
  
  public void startActivity(Class<?> paramClass, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    startActivity(localIntent);
    overridePendingTransition(2130968618, 2130968619);
  }
  
  public void startActivity(String paramString)
  {
    startActivity(paramString, null);
  }
  
  public void startActivity(String paramString, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setAction(paramString);
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    startActivity(localIntent);
    overridePendingTransition(2130968618, 2130968619);
  }
  
  public void unRegisterTouchOrClickListener(d paramd)
  {
    if ((this.mTouchOrClickListener != null) && (this.mTouchOrClickListener == paramd)) {
      this.mTouchOrClickListener = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\BaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */