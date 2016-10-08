package com.tencent;

public enum TIMNetworkStatus
{
  TIM_NETWORK_STATUS_CONNECTED(1L),  TIM_NETWORK_STATUS_DISCONNECTED(2L);
  
  private long value;
  
  private TIMNetworkStatus(long paramLong)
  {
    this.value = paramLong;
  }
  
  final long getValue()
  {
    return this.value;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMNetworkStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */