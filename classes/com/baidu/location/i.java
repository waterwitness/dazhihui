package com.baidu.location;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

class i
  extends Handler
{
  private i(h paramh) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 7: 
    case 3: 
    case 8: 
    case 5: 
    case 6: 
    case 9: 
    case 10: 
    case 1: 
    case 2: 
    case 11: 
    case 4: 
    case 12: 
    case 54: 
    case 55: 
    case 21: 
      Object localObject;
      do
      {
        do
        {
          do
          {
            return;
            h.a(this.a, paramMessage);
            return;
            h.b(this.a, paramMessage);
            return;
            h.c(this.a, paramMessage);
            return;
            h.d(this.a, paramMessage);
            return;
            h.e(this.a, paramMessage);
            return;
            h.f(this.a, paramMessage);
            return;
            h.l(this.a);
            return;
            h.m(this.a);
            return;
            h.n(this.a);
            return;
            h.o(this.a);
            return;
            h.p(this.a);
            return;
          } while (!h.f(this.a).h);
          h.c(this.a, true);
          return;
        } while (!h.f(this.a).h);
        h.c(this.a, false);
        return;
        localObject = paramMessage.getData();
        ((Bundle)localObject).setClassLoader(BDLocation.class.getClassLoader());
        localObject = (BDLocation)((Bundle)localObject).getParcelable("locStr");
      } while ((!h.q(this.a)) && (h.r(this.a) == true) && (((BDLocation)localObject).h() == 66));
      if ((!h.q(this.a)) && (h.r(this.a) == true))
      {
        h.d(this.a, true);
        return;
      }
      if (!h.q(this.a)) {
        h.d(this.a, true);
      }
      h.a(this.a, paramMessage, 21);
      return;
    case 26: 
      h.a(this.a, paramMessage, 26);
      return;
    case 27: 
      h.g(this.a, paramMessage);
      return;
    }
    h.a(this.a, (BDLocation)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */