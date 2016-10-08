package com.android.dazhihui.ui.model;

import android.os.Handler;
import android.os.Looper;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.g;
import java.util.Iterator;
import java.util.Vector;

public abstract class RequestAdapter
  implements i
{
  private static final int AUTO_MSG = 0;
  private long mAutoPeriod = 15000L;
  private h mAutoRequest = null;
  private Handler mAutoRequestHandler = new RequestAdapter.1(this, Looper.getMainLooper());
  private boolean mAutoSend = false;
  private Vector<h> mRequestVector = new Vector();
  
  private void processResponse(h paramh)
  {
    if ((paramh == this.mAutoRequest) && (this.mAutoSend))
    {
      this.mAutoRequestHandler.removeMessages(0);
      this.mAutoRequestHandler.sendEmptyMessageDelayed(0, this.mAutoPeriod);
    }
    if ((this.mRequestVector.contains(paramh)) && (paramh != this.mAutoRequest)) {
      this.mRequestVector.remove(paramh);
    }
  }
  
  public void clearRequest()
  {
    this.mAutoSend = false;
    Iterator localIterator = this.mRequestVector.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      g.a().b(localh);
    }
    this.mAutoRequestHandler.removeMessages(0);
    this.mRequestVector.clear();
  }
  
  public void destory()
  {
    this.mAutoRequestHandler.removeMessages(0);
    if ((this.mAutoRequest != null) && ((this.mAutoRequest instanceof m)))
    {
      ((m)this.mAutoRequest).t();
      this.mAutoRequest = null;
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    processResponse(paramh);
    handleResponseEx(paramh, paramj);
  }
  
  public abstract void handleResponseEx(h paramh, j paramj);
  
  public void handleTimeout(h paramh)
  {
    processResponse(paramh);
    handleTimeoutEx(paramh);
  }
  
  public abstract void handleTimeoutEx(h paramh);
  
  public void netException(h paramh, Exception paramException)
  {
    processResponse(paramh);
    netExceptionEx(paramh, paramException);
  }
  
  public abstract void netExceptionEx(h paramh, Exception paramException);
  
  public void registRequestListener(h paramh)
  {
    if (paramh != null) {
      paramh.a(this);
    }
  }
  
  public void removeRequest(h paramh)
  {
    g.a().b(paramh);
    if (this.mRequestVector.contains(paramh)) {
      this.mRequestVector.remove(paramh);
    }
  }
  
  public void sendRequest(h paramh)
  {
    if (paramh != null)
    {
      if (((paramh instanceof m)) && (((m)paramh).r()) && (!this.mRequestVector.contains(paramh)) && (paramh != this.mAutoRequest)) {
        this.mRequestVector.add(paramh);
      }
      if (this.mAutoSend)
      {
        this.mAutoRequestHandler.removeMessages(0);
        this.mAutoRequestHandler.sendEmptyMessageDelayed(0, this.mAutoPeriod);
      }
      g.a().a(paramh);
    }
  }
  
  public void setAutoRequest(h paramh)
  {
    if (this.mAutoRequest == paramh) {}
    do
    {
      return;
      if (this.mAutoRequest != null)
      {
        removeRequest(this.mAutoRequest);
        if ((this.mAutoRequest instanceof m)) {
          ((m)this.mAutoRequest).t();
        }
      }
      this.mAutoRequest = paramh;
      this.mAutoRequestHandler.removeMessages(0);
    } while (paramh == null);
    if ((paramh instanceof m)) {
      ((m)paramh).e(true);
    }
    this.mAutoRequestHandler.sendEmptyMessageDelayed(0, this.mAutoPeriod);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.mAutoPeriod = paramLong;
  }
  
  public void startAutoRequestPeriod()
  {
    this.mAutoSend = true;
    this.mAutoRequestHandler.removeMessages(0);
    if (this.mAutoRequest != null) {
      this.mAutoRequestHandler.sendEmptyMessageDelayed(0, this.mAutoPeriod);
    }
  }
  
  public void stop()
  {
    clearRequest();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\RequestAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */