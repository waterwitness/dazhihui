package com.iflytek.cloud.util;

public class VolumeUtil
{
  public static int computeVolume(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt <= 2)) {}
    long l1;
    do
    {
      return 0;
      int i = paramInt / 2;
      paramInt = 0;
      l1 = 0L;
      while (paramInt < i * 2 - 1)
      {
        l1 += paramArrayOfByte[paramInt] + paramArrayOfByte[(paramInt + 1)] * 256;
        paramInt += 2;
      }
      long l2 = l1 / i;
      l1 = 0L;
      paramInt = 0;
      while (paramInt < i * 2 - 1)
      {
        int j = (int)(paramArrayOfByte[paramInt] + paramArrayOfByte[(paramInt + 1)] * 256 - l2);
        l1 += (j * j >> 9);
        paramInt += 2;
      }
      l1 /= i;
    } while (l1 < 329L);
    if (l1 < 421L) {
      return 1;
    }
    if (l1 < 543L) {
      return 2;
    }
    if (l1 < 694L) {
      return 3;
    }
    if (l1 < 895L) {
      return 4;
    }
    if (l1 < 1146L) {
      return 5;
    }
    if (l1 < 1476L) {
      return 6;
    }
    if (l1 < 1890L) {
      return 7;
    }
    if (l1 < 2433L) {
      return 8;
    }
    if (l1 < 3118L) {
      return 9;
    }
    if (l1 < 4011L) {
      return 10;
    }
    if (l1 < 5142L) {
      return 11;
    }
    if (l1 < 6612L) {
      return 12;
    }
    if (l1 < 8478L) {
      return 13;
    }
    if (l1 < 10900L) {
      return 14;
    }
    if (l1 < 13982L) {
      return 15;
    }
    if (l1 < 17968L) {
      return 16;
    }
    if (l1 < 23054L) {
      return 17;
    }
    if (l1 < 29620L) {
      return 18;
    }
    if (l1 < 38014L) {
      return 19;
    }
    if (l1 < 48828L) {
      return 20;
    }
    if (l1 < 62654L) {
      return 21;
    }
    if (l1 < 80491L) {
      return 22;
    }
    if (l1 < 103294L) {
      return 23;
    }
    if (l1 < 132686L) {
      return 24;
    }
    if (l1 < 170366L) {
      return 25;
    }
    if (l1 < 218728L) {
      return 26;
    }
    if (l1 < 280830L) {
      return 27;
    }
    return 30;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\VolumeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */