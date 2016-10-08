package android.support.v4.app;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public class bi
{
  private static final bq a = new bt();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new bs();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new br();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new by();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new bx();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bw();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bv();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new bu();
      return;
    }
  }
  
  private static void b(bg parambg, ArrayList<bj> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      parambg.a((bj)paramArrayList.next());
    }
  }
  
  private static void b(bh parambh, bz parambz)
  {
    if (parambz != null)
    {
      if (!(parambz instanceof bm)) {
        break label37;
      }
      parambz = (bm)parambz;
      cl.a(parambh, parambz.d, parambz.f, parambz.e, parambz.a);
    }
    label37:
    do
    {
      return;
      if ((parambz instanceof bp))
      {
        parambz = (bp)parambz;
        cl.a(parambh, parambz.d, parambz.f, parambz.e, parambz.a);
        return;
      }
    } while (!(parambz instanceof bl));
    parambz = (bl)parambz;
    cl.a(parambh, parambz.d, parambz.f, parambz.e, parambz.a, parambz.b, parambz.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */