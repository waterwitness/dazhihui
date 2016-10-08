package com.tencent.imcore;

public class internal
  implements internalConstants
{
  public static boolean checkFriendCustomTag(String paramString)
  {
    return internalJNI.checkFriendCustomTag(paramString);
  }
  
  public static boolean checkProfileCustomTag(String paramString)
  {
    return internalJNI.checkProfileCustomTag(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\internal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */