package com.joanzapata.pdfview;

import com.joanzapata.pdfview.c.a;
import java.util.Comparator;

class f
  implements Comparator<a>
{
  f(e parame) {}
  
  public int a(a parama1, a parama2)
  {
    if (parama1.a() == parama2.a()) {
      return 0;
    }
    if (parama1.a() > parama2.a()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */