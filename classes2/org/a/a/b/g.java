package org.a.a.b;

import java.math.BigInteger;
import java.util.Enumeration;
import org.a.a.ag;
import org.a.a.ai;
import org.a.a.ak;
import org.a.a.ba;
import org.a.a.bd;
import org.a.a.be;
import org.a.a.bp;
import org.a.a.m;
import org.a.a.r;
import org.a.a.t;
import org.a.a.x;

public class g
  extends org.a.a.d
{
  private ba a;
  private t b;
  private e c;
  private t d;
  private t e;
  private t f;
  private boolean g;
  private boolean h;
  
  public g(r paramr)
  {
    paramr = paramr.e();
    this.a = ((ba)paramr.nextElement());
    this.b = ((t)paramr.nextElement());
    this.c = e.a(paramr.nextElement());
    while (paramr.hasMoreElements())
    {
      Object localObject = (bd)paramr.nextElement();
      if ((localObject instanceof x))
      {
        localObject = (x)localObject;
        switch (((x)localObject).e())
        {
        default: 
          throw new IllegalArgumentException("unknown tag value " + ((x)localObject).e());
        case 0: 
          this.g = (localObject instanceof ak);
          this.d = t.a((x)localObject, false);
          break;
        case 1: 
          this.h = (localObject instanceof ak);
          this.e = t.a((x)localObject, false);
          break;
        }
      }
      else
      {
        this.f = ((t)localObject);
      }
    }
  }
  
  public g(t paramt1, e parame, t paramt2, t paramt3, t paramt4)
  {
    this.a = a(parame.e(), paramt2, paramt3, paramt4);
    this.b = paramt1;
    this.c = parame;
    this.d = paramt2;
    this.e = paramt3;
    this.f = paramt4;
    this.h = (paramt3 instanceof ai);
    this.g = (paramt2 instanceof ai);
  }
  
  public static g a(Object paramObject)
  {
    if ((paramObject instanceof g)) {
      return (g)paramObject;
    }
    if ((paramObject instanceof r)) {
      return new g((r)paramObject);
    }
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  private ba a(be parambe, t paramt1, t paramt2, t paramt3)
  {
    int i3 = 0;
    int i2 = 0;
    int k;
    int j;
    int i;
    int n;
    int m;
    int i1;
    Object localObject;
    if (paramt1 != null)
    {
      paramt1 = paramt1.e();
      k = 0;
      j = 0;
      i = 0;
      n = k;
      m = j;
      i1 = i;
      if (!paramt1.hasMoreElements()) {
        break label158;
      }
      localObject = paramt1.nextElement();
      if (!(localObject instanceof x)) {
        break label308;
      }
      localObject = (x)localObject;
      if (((x)localObject).e() == 1)
      {
        m = k;
        j = 1;
        k = i;
        i = m;
      }
    }
    for (;;)
    {
      m = k;
      k = i;
      i = m;
      break;
      if (((x)localObject).e() == 2)
      {
        m = 1;
        k = i;
        i = m;
      }
      else if (((x)localObject).e() == 3)
      {
        i = k;
        k = 1;
        continue;
        n = 0;
        m = 0;
        i1 = 0;
        label158:
        if (i1 != 0) {
          return new ba(5);
        }
        j = i3;
        if (paramt2 != null)
        {
          paramt1 = paramt2.e();
          i = i2;
          for (;;)
          {
            j = i;
            if (!paramt1.hasMoreElements()) {
              break;
            }
            if ((paramt1.nextElement() instanceof x)) {
              i = 1;
            }
          }
        }
        if (j != 0) {
          return new ba(5);
        }
        if (n != 0) {
          return new ba(4);
        }
        if (m != 0) {
          return new ba(3);
        }
        if (a(paramt3)) {
          return new ba(3);
        }
        if (!d.a.equals(parambe)) {
          return new ba(3);
        }
        return new ba(1);
      }
      else
      {
        label308:
        m = i;
        i = k;
        k = m;
      }
    }
  }
  
  private boolean a(t paramt)
  {
    paramt = paramt.e();
    while (paramt.hasMoreElements()) {
      if (i.a(paramt.nextElement()).e().e().intValue() == 3) {
        return true;
      }
    }
    return false;
  }
  
  public bd d()
  {
    org.a.a.e locale = new org.a.a.e();
    locale.a(this.a);
    locale.a(this.b);
    locale.a(this.c);
    if (this.d != null)
    {
      if (this.g) {
        locale.a(new ak(false, 0, this.d));
      }
    }
    else if (this.e != null)
    {
      if (!this.h) {
        break label131;
      }
      locale.a(new ak(false, 1, this.e));
    }
    for (;;)
    {
      locale.a(this.f);
      return new ag(locale);
      locale.a(new bp(false, 0, this.d));
      break;
      label131:
      locale.a(new bp(false, 1, this.e));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */