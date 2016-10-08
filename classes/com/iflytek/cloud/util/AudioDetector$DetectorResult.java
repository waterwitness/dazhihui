package com.iflytek.cloud.util;

import java.util.LinkedHashMap;

public class AudioDetector$DetectorResult
{
  public static final int STATUS_BOS = 3;
  public static final int STATUS_EOS = 2;
  public static final int STATUS_OK = 0;
  public static final int STATUS_START = 1;
  public static final int STATUS_TIMEOUT = 4;
  public static final int SUB_END = 2;
  public static final int SUB_OK = 0;
  public static final int SUB_START = 1;
  public static final int SUB_STARTEND = 3;
  public byte[] buffer = null;
  public int end = 0;
  public int error = 0;
  public int length = 0;
  public int offset = 0;
  public int quality = 0;
  public int start = 0;
  public int status = 0;
  public int sub = 0;
  public final LinkedHashMap<Integer, Integer> subs = new LinkedHashMap();
  public boolean voice = false;
  public int volume = 0;
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\AudioDetector$DetectorResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */