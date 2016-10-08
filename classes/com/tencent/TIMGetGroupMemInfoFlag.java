package com.tencent;

public enum TIMGetGroupMemInfoFlag
{
  TIM_GET_GROUP_MEM_INFO_FLAG_JOIN_TIME(1L),  TIM_GET_GROUP_MEM_INFO_FLAG_MSG_FLAG(2L),  TIM_GET_GROUP_MEM_INFO_FLAG_ROLE_INFO(8L),  TIM_GET_GROUP_MEM_INFO_FLAG_SHUTUP_TIME(16L);
  
  private long value;
  
  private TIMGetGroupMemInfoFlag(long paramLong)
  {
    this.value = paramLong;
  }
  
  final long getValue()
  {
    return this.value;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGetGroupMemInfoFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */