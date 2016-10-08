package com.d.a;

import com.d.a.a.e;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class ay
  implements e
{
  static Hashtable<Class, Method> d = new Hashtable();
  al a;
  ByteOrder b = ByteOrder.BIG_ENDIAN;
  ai c = new ai();
  private bk e = new az(this, 0);
  private bk f = new ba(this, 1);
  private bk g = new bb(this, 2);
  private bk h = new bc(this, 4);
  private bk i = new bd(this, 8);
  private bi<byte[]> j = new be(this);
  private bi<ai> k = new bf(this);
  private bi<byte[]> l = new bg(this);
  private LinkedList<bk> m = new LinkedList();
  private ArrayList<Object> n = new ArrayList();
  
  public ay(al paramal)
  {
    this.a = paramal;
    this.a.a(this);
  }
  
  public ay a(byte paramByte, e parame)
  {
    this.m.add(new bj(paramByte, parame));
    return this;
  }
  
  public ay a(int paramInt, bi<byte[]> parambi)
  {
    this.m.add(new bh(paramInt, parambi));
    return this;
  }
  
  public void a(al paramal, ai paramai)
  {
    paramai.a(this.c);
    for (;;)
    {
      if ((this.m.size() <= 0) || (this.c.d() < ((bk)this.m.peek()).c))
      {
        if (this.m.size() == 0) {
          this.c.a(paramai);
        }
        return;
      }
      this.c.a(this.b);
      bk localbk = ((bk)this.m.poll()).a(paramal, this.c);
      if (localbk != null) {
        this.m.addFirst(localbk);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */