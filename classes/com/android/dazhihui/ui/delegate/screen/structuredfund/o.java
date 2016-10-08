package com.android.dazhihui.ui.delegate.screen.structuredfund;

import java.util.Comparator;
import java.util.Map.Entry;

class o
  implements Comparator<Map.Entry<String, Double>>
{
  o(i parami) {}
  
  public int a(Map.Entry<String, Double> paramEntry1, Map.Entry<String, Double> paramEntry2)
  {
    return ((Double)paramEntry2.getValue()).compareTo((Double)paramEntry1.getValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */