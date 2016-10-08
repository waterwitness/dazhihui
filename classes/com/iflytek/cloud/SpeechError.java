package com.iflytek.cloud;

import com.iflytek.cloud.resource.Resource;
import com.iflytek.thirdparty.X;

public class SpeechError
  extends Exception
{
  public static final int TIP_ERROR_ALREADY_EXIST = 66;
  public static final int TIP_ERROR_GROUP_EMPTY = 68;
  public static final int TIP_ERROR_IVP_EXTRA_RGN_SOPPORT = 56;
  public static final int TIP_ERROR_IVP_GENERAL = 55;
  public static final int TIP_ERROR_IVP_MUCH_NOISE = 58;
  public static final int TIP_ERROR_IVP_NO_ENOUGH_AUDIO = 63;
  public static final int TIP_ERROR_IVP_TEXT_NOT_MATCH = 62;
  public static final int TIP_ERROR_IVP_TOO_LOW = 59;
  public static final int TIP_ERROR_IVP_TRUNCATED = 57;
  public static final int TIP_ERROR_IVP_UTTER_TOO_SHORT = 61;
  public static final int TIP_ERROR_IVP_ZERO_AUDIO = 60;
  public static final int TIP_ERROR_MODEL_IS_CREATING = 65;
  public static final int TIP_ERROR_MODEL_NOT_FOUND = 64;
  public static final int TIP_ERROR_NO_GROUP = 67;
  public static final int TIP_ERROR_NO_USER = 69;
  public static final int TIP_ERROR_OVERFLOW_IN_GROUP = 70;
  private static final long serialVersionUID = 4434424251478985596L;
  private int a = 0;
  private String b = "";
  
  public SpeechError(int paramInt)
  {
    this.a = paramInt;
    if (paramInt < 20001) {
      if (this.a == 10118) {
        paramInt = j;
      }
    }
    for (;;)
    {
      switch (this.a)
      {
      default: 
        i = paramInt;
      }
      for (;;)
      {
        this.b = Resource.getErrorDescription(i);
        return;
        if ((10106 == this.a) || (10107 == this.a) || (10124 == this.a))
        {
          X.a("sdk errorcode", this.a + "");
          paramInt = 7;
          break;
        }
        if (this.a == 10110)
        {
          paramInt = 32;
          break;
        }
        if (this.a == 10111)
        {
          paramInt = 28;
          break;
        }
        if ((this.a >= 10200) && (this.a < 10300))
        {
          paramInt = 3;
          break;
        }
        if ((this.a == 10117) || (this.a == 10101))
        {
          paramInt = 16;
          break;
        }
        if (this.a == 10113)
        {
          paramInt = 17;
          break;
        }
        if (this.a == 10116)
        {
          paramInt = 64;
          break;
        }
        if (this.a == 10121)
        {
          paramInt = 66;
          break;
        }
        if ((this.a >= 10400) && (this.a <= 10407))
        {
          paramInt = 18;
          break;
        }
        if ((this.a >= 11000) && (this.a < 11099))
        {
          if (this.a == 11005)
          {
            paramInt = 23;
            break;
          }
          if (this.a == 11006)
          {
            paramInt = 24;
            break;
          }
          paramInt = 18;
          break;
        }
        if (this.a == 10129)
        {
          paramInt = 19;
          break;
        }
        if (this.a == 10109)
        {
          paramInt = 20;
          break;
        }
        if (this.a == 10702)
        {
          paramInt = 21;
          break;
        }
        if ((this.a >= 10500) && (this.a < 10600))
        {
          paramInt = 22;
          break;
        }
        if ((this.a >= 11200) && (this.a <= 11250))
        {
          paramInt = 25;
          break;
        }
        if ((this.a >= 14000) && (this.a <= 14006))
        {
          paramInt = 31;
          break;
        }
        if ((this.a >= 16000) && (this.a <= 16006))
        {
          paramInt = 31;
          break;
        }
        if (11401 == this.a)
        {
          paramInt = 35;
          break;
        }
        if (11402 == this.a)
        {
          paramInt = 36;
          break;
        }
        if (11403 == this.a)
        {
          paramInt = 37;
          break;
        }
        if (11404 == this.a)
        {
          paramInt = 38;
          break;
        }
        if (11405 == this.a)
        {
          paramInt = 39;
          break;
        }
        if (11406 == this.a)
        {
          paramInt = 40;
          break;
        }
        if (11407 == this.a)
        {
          paramInt = 41;
          break;
        }
        if (11408 == this.a)
        {
          paramInt = 42;
          break;
        }
        if (this.a == 11501)
        {
          paramInt = 65;
          break;
        }
        if (this.a == 11502)
        {
          paramInt = 64;
          break;
        }
        if (this.a != 11503) {
          break label1283;
        }
        paramInt = 19;
        break;
        if (this.a >= 30000) {
          break label1283;
        }
        if (this.a == 20001)
        {
          paramInt = 1;
          break;
        }
        if (this.a == 20002)
        {
          paramInt = 2;
          break;
        }
        if (this.a == 20003)
        {
          paramInt = 3;
          break;
        }
        if (this.a == 20004)
        {
          paramInt = 5;
          break;
        }
        if (this.a == 20005)
        {
          paramInt = 10;
          break;
        }
        if (this.a == 20006)
        {
          paramInt = 9;
          break;
        }
        if (this.a == 20007)
        {
          paramInt = 12;
          break;
        }
        paramInt = j;
        if (this.a == 20008) {
          break;
        }
        if (this.a == 20009)
        {
          paramInt = 13;
          break;
        }
        if (this.a == 20010)
        {
          paramInt = 14;
          break;
        }
        if (this.a == 20012)
        {
          paramInt = 7;
          break;
        }
        if (this.a == 21003)
        {
          paramInt = 28;
          break;
        }
        if ((this.a == 21002) || (this.a == 21001))
        {
          paramInt = 29;
          break;
        }
        paramInt = 30;
        break;
        i = 55;
        continue;
        i = 56;
        continue;
        i = 57;
        continue;
        i = 58;
        continue;
        i = 59;
        continue;
        i = 60;
        continue;
        i = 61;
        continue;
        i = 62;
        continue;
        i = 63;
        continue;
        i = 65;
        continue;
        i = 43;
        continue;
        i = 44;
        continue;
        i = 45;
        continue;
        i = 46;
        continue;
        i = 47;
        continue;
        i = 48;
        continue;
        i = 49;
        continue;
        i = 50;
        continue;
        i = 51;
        continue;
        i = 52;
        continue;
        i = 53;
        continue;
        i = 54;
        continue;
        i = 67;
        continue;
        i = 68;
        continue;
        i = 69;
        continue;
        i = 70;
      }
      label1283:
      paramInt = 3;
    }
  }
  
  public SpeechError(int paramInt, String paramString)
  {
    this(paramInt);
    if ("wfr".equals(paramString))
    {
      if (10118 != paramInt) {
        break label31;
      }
      this.b = Resource.getErrorDescription(33);
    }
    label31:
    while (10119 != paramInt) {
      return;
    }
    this.b = Resource.getErrorDescription(34);
  }
  
  public SpeechError(Exception paramException)
  {
    this.a = 20999;
    this.b = paramException.toString();
  }
  
  public int getErrorCode()
  {
    return this.a;
  }
  
  public String getErrorDescription()
  {
    return this.b;
  }
  
  public String getHtmlDescription(boolean paramBoolean)
  {
    String str2 = this.b + "...";
    String str1 = str2;
    if (paramBoolean)
    {
      str1 = str2 + "<br>(";
      str1 = str1 + Resource.getErrorTag(0) + ":";
      str1 = str1 + this.a + ")";
    }
    return str1;
  }
  
  public String getPlainDescription(boolean paramBoolean)
  {
    String str2 = this.b;
    String str1 = str2;
    if (paramBoolean)
    {
      str1 = str2 + ".";
      str1 = str1 + "(" + Resource.getErrorTag(0) + ":";
      str1 = str1 + this.a + ")";
    }
    return str1;
  }
  
  public String toString()
  {
    return getPlainDescription(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */