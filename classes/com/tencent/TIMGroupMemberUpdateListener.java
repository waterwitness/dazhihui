package com.tencent;

import java.util.List;

public abstract interface TIMGroupMemberUpdateListener
{
  public abstract void onMemberInfoUpdate(String paramString, List<TIMGroupTipsElemMemberInfo> paramList);
  
  public abstract void onMemberUpdate(String paramString, TIMGroupTipsType paramTIMGroupTipsType, List<String> paramList);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupMemberUpdateListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */