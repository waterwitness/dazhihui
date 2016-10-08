package com.android.thinkive.framework.util;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class FlowNoGenerater
{
  private static FlowNoGenerater primaryGenerater = null;
  private int flowNo = 1;
  private Random mRandom;
  private AtomicInteger mSequenceGenerator = new AtomicInteger();
  
  public static FlowNoGenerater getInstance()
  {
    if (primaryGenerater == null) {}
    try
    {
      if (primaryGenerater == null) {
        primaryGenerater = new FlowNoGenerater();
      }
      return primaryGenerater;
    }
    finally {}
  }
  
  public int generaterFlowNo()
  {
    try
    {
      int i = this.mSequenceGenerator.incrementAndGet();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\FlowNoGenerater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */