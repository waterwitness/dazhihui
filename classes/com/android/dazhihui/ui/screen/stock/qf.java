package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class qf
  extends Handler
{
  private boolean a = false;
  private List<qg> b = new ArrayList();
  
  public void a()
  {
    this.a = true;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      removeMessages(((qg)localIterator.next()).a);
    }
  }
  
  public void a(qg paramqg)
  {
    if (this.b.contains(paramqg)) {
      return;
    }
    this.a = false;
    this.b.add(paramqg);
    removeMessages(paramqg.a);
    sendMessage(obtainMessage(paramqg.a));
  }
  
  public void b()
  {
    this.a = false;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      qg localqg = (qg)localIterator.next();
      removeMessages(localqg.a);
      sendMessage(obtainMessage(localqg.a));
    }
  }
  
  public void b(qg paramqg)
  {
    paramqg.c = true;
    this.b.remove(paramqg);
    removeMessages(paramqg.a);
  }
  
  public void c()
  {
    a();
    this.b.clear();
  }
  
  public void handleMessage(Message paramMessage)
  {
    qg localqg;
    if (!this.a)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localqg = (qg)localIterator.next();
        if (paramMessage.what == localqg.a)
        {
          if ((localqg.c) || (!localqg.a())) {
            break label88;
          }
          removeMessages(localqg.a);
          sendMessageDelayed(obtainMessage(localqg.a), localqg.b);
        }
      }
    }
    return;
    label88:
    this.b.remove(localqg);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */