package com.tencent.kapalaiadapter.sdcardmountinforutil;

import java.util.ArrayList;

public abstract interface ISDCardMountInfor
{
  public abstract ArrayList<String> getAllPath();
  
  public abstract boolean isExSdcard(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\kapalaiadapter\sdcardmountinforutil\ISDCardMountInfor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */