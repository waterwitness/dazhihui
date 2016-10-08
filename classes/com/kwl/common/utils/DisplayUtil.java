package com.kwl.common.utils;

public class DisplayUtil
{
  public static int dip2px(float paramFloat1, float paramFloat2)
  {
    return (int)(paramFloat1 * paramFloat2 + 0.5F);
  }
  
  public static int px2dip(float paramFloat1, float paramFloat2)
  {
    return (int)(paramFloat1 / paramFloat2 + 0.5F);
  }
  
  public static int px2sp(float paramFloat1, float paramFloat2)
  {
    return (int)(paramFloat1 / paramFloat2 + 0.5F);
  }
  
  public static int sp2px(float paramFloat1, float paramFloat2)
  {
    return (int)(paramFloat1 * paramFloat2 + 0.5F);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\DisplayUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */