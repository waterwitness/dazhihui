package com.squareup.okhttp.internal.spdy;

final class Settings
{
  static final int CLIENT_CERTIFICATE_VECTOR_SIZE = 8;
  static final int COUNT = 10;
  static final int CURRENT_CWND = 5;
  static final int DEFAULT_INITIAL_WINDOW_SIZE = 65536;
  static final int DOWNLOAD_BANDWIDTH = 2;
  static final int DOWNLOAD_RETRANS_RATE = 6;
  static final int FLAG_CLEAR_PREVIOUSLY_PERSISTED_SETTINGS = 1;
  static final int FLOW_CONTROL_OPTIONS = 9;
  static final int FLOW_CONTROL_OPTIONS_DISABLED = 1;
  static final int INITIAL_WINDOW_SIZE = 7;
  static final int MAX_CONCURRENT_STREAMS = 4;
  static final int PERSISTED = 2;
  static final int PERSIST_VALUE = 1;
  static final int ROUND_TRIP_TIME = 3;
  static final int UPLOAD_BANDWIDTH = 1;
  private int persistValue;
  private int persisted;
  private int set;
  private final int[] values = new int[10];
  
  int flags(int paramInt)
  {
    int i = 0;
    if (isPersisted(paramInt)) {
      i = 2;
    }
    int j = i;
    if (persistValue(paramInt)) {
      j = i | 0x1;
    }
    return j;
  }
  
  int get(int paramInt)
  {
    return this.values[paramInt];
  }
  
  int getClientCertificateVectorSize(int paramInt)
  {
    if ((0x100 & this.set) != 0) {
      paramInt = this.values[8];
    }
    return paramInt;
  }
  
  int getCurrentCwnd(int paramInt)
  {
    if ((0x20 & this.set) != 0) {
      paramInt = this.values[5];
    }
    return paramInt;
  }
  
  int getDownloadBandwidth(int paramInt)
  {
    if ((0x4 & this.set) != 0) {
      paramInt = this.values[2];
    }
    return paramInt;
  }
  
  int getDownloadRetransRate(int paramInt)
  {
    if ((0x40 & this.set) != 0) {
      paramInt = this.values[6];
    }
    return paramInt;
  }
  
  int getInitialWindowSize(int paramInt)
  {
    if ((0x80 & this.set) != 0) {
      paramInt = this.values[7];
    }
    return paramInt;
  }
  
  int getMaxConcurrentStreams(int paramInt)
  {
    if ((0x10 & this.set) != 0) {
      paramInt = this.values[4];
    }
    return paramInt;
  }
  
  int getRoundTripTime(int paramInt)
  {
    if ((0x8 & this.set) != 0) {
      paramInt = this.values[3];
    }
    return paramInt;
  }
  
  int getUploadBandwidth(int paramInt)
  {
    if ((0x2 & this.set) != 0) {
      paramInt = this.values[1];
    }
    return paramInt;
  }
  
  boolean isFlowControlDisabled()
  {
    boolean bool = false;
    if ((0x200 & this.set) != 0) {}
    for (int i = this.values[9];; i = 0)
    {
      if ((i & 0x1) != 0) {
        bool = true;
      }
      return bool;
    }
  }
  
  boolean isPersisted(int paramInt)
  {
    return (1 << paramInt & this.persisted) != 0;
  }
  
  boolean isSet(int paramInt)
  {
    return (1 << paramInt & this.set) != 0;
  }
  
  void merge(Settings paramSettings)
  {
    int i = 0;
    if (i >= 10) {
      return;
    }
    if (!paramSettings.isSet(i)) {}
    for (;;)
    {
      i += 1;
      break;
      set(i, paramSettings.flags(i), paramSettings.get(i));
    }
  }
  
  boolean persistValue(int paramInt)
  {
    return (1 << paramInt & this.persistValue) != 0;
  }
  
  void set(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= this.values.length) {
      return;
    }
    int i = 1 << paramInt1;
    this.set |= i;
    if ((paramInt2 & 0x1) != 0)
    {
      this.persistValue |= i;
      if ((paramInt2 & 0x2) == 0) {
        break label84;
      }
    }
    label84:
    for (this.persisted = (i | this.persisted);; this.persisted = ((i ^ 0xFFFFFFFF) & this.persisted))
    {
      this.values[paramInt1] = paramInt3;
      return;
      this.persistValue &= (i ^ 0xFFFFFFFF);
      break;
    }
  }
  
  int size()
  {
    return Integer.bitCount(this.set);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Settings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */