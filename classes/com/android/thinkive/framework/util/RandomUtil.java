package com.android.thinkive.framework.util;

import java.util.Random;

public class RandomUtil
{
  public static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
  public static final String NUMBERS = "0123456789";
  public static final String NUMBERS_AND_LETTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  public static int getRandom(int paramInt)
  {
    return getRandom(0, paramInt);
  }
  
  public static int getRandom(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 > paramInt2) {
      i = 0;
    }
    do
    {
      return i;
      i = paramInt1;
    } while (paramInt1 == paramInt2);
    return paramInt1 + new Random().nextInt(paramInt2 - paramInt1);
  }
  
  public static String getRandom(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    return getRandom(paramString.toCharArray(), paramInt);
  }
  
  public static String getRandom(char[] paramArrayOfChar, int paramInt)
  {
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0) || (paramInt < 0)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramInt);
    Random localRandom = new Random();
    int i = 0;
    for (;;)
    {
      if (i >= paramInt) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append(paramArrayOfChar[localRandom.nextInt(paramArrayOfChar.length)]);
      i += 1;
    }
  }
  
  public static String getRandomCapitalLetters(int paramInt)
  {
    return getRandom("ABCDEFGHIJKLMNOPQRSTUVWXYZ", paramInt);
  }
  
  public static String getRandomLetters(int paramInt)
  {
    return getRandom("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", paramInt);
  }
  
  public static String getRandomLowerCaseLetters(int paramInt)
  {
    return getRandom("abcdefghijklmnopqrstuvwxyz", paramInt);
  }
  
  public static String getRandomNumbers(int paramInt)
  {
    return getRandom("0123456789", paramInt);
  }
  
  public static String getRandomNumbersAndLetters(int paramInt)
  {
    return getRandom("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", paramInt);
  }
  
  public static boolean shuffle(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return false;
    }
    return shuffle(paramArrayOfObject, getRandom(paramArrayOfObject.length));
  }
  
  public static boolean shuffle(Object[] paramArrayOfObject, int paramInt)
  {
    boolean bool2 = true;
    int j;
    boolean bool1;
    if ((paramArrayOfObject != null) && (paramInt >= 0))
    {
      j = paramArrayOfObject.length;
      if (j >= paramInt) {}
    }
    else
    {
      bool1 = false;
      return bool1;
    }
    int i = 1;
    for (;;)
    {
      bool1 = bool2;
      if (i > paramInt) {
        break;
      }
      int k = getRandom(j - i);
      Object localObject = paramArrayOfObject[(j - i)];
      paramArrayOfObject[(j - i)] = paramArrayOfObject[k];
      paramArrayOfObject[k] = localObject;
      i += 1;
    }
  }
  
  public static int[] shuffle(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    return shuffle(paramArrayOfInt, getRandom(paramArrayOfInt.length));
  }
  
  public static int[] shuffle(int[] paramArrayOfInt, int paramInt)
  {
    int j;
    Object localObject;
    if ((paramArrayOfInt != null) && (paramInt >= 0))
    {
      j = paramArrayOfInt.length;
      if (j >= paramInt) {}
    }
    else
    {
      localObject = null;
      return (int[])localObject;
    }
    int[] arrayOfInt = new int[paramInt];
    int i = 1;
    for (;;)
    {
      localObject = arrayOfInt;
      if (i > paramInt) {
        break;
      }
      int k = getRandom(j - i);
      arrayOfInt[(i - 1)] = paramArrayOfInt[k];
      int m = paramArrayOfInt[(j - i)];
      paramArrayOfInt[(j - i)] = paramArrayOfInt[k];
      paramArrayOfInt[k] = m;
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\RandomUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */