package com.payeco.android.plugin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class IdcardUtils
{
  public static final int CHINA_ID_MAX_LENGTH = 18;
  public static final int CHINA_ID_MIN_LENGTH = 15;
  public static final int MIN = 1930;
  public static final String[] cityCode = { "11", "12", "13", "14", "15", "21", "22", "23", "31", "32", "33", "34", "35", "36", "37", "41", "42", "43", "44", "45", "46", "50", "51", "52", "53", "54", "61", "62", "63", "64", "65", "71", "81", "82", "91" };
  public static Map cityCodes;
  public static final int[] power = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
  public static final String[] verifyCode = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
  
  static
  {
    HashMap localHashMap = new HashMap();
    cityCodes = localHashMap;
    localHashMap.put("11", "北京");
    cityCodes.put("12", "天津");
    cityCodes.put("13", "河北");
    cityCodes.put("14", "山西");
    cityCodes.put("15", "内蒙古");
    cityCodes.put("21", "辽宁");
    cityCodes.put("22", "吉林");
    cityCodes.put("23", "黑龙江");
    cityCodes.put("31", "上海");
    cityCodes.put("32", "江苏");
    cityCodes.put("33", "浙江");
    cityCodes.put("34", "安徽");
    cityCodes.put("35", "福建");
    cityCodes.put("36", "江西");
    cityCodes.put("37", "山东");
    cityCodes.put("41", "河南");
    cityCodes.put("42", "湖北");
    cityCodes.put("43", "湖南");
    cityCodes.put("44", "广东");
    cityCodes.put("45", "广西");
    cityCodes.put("46", "海南");
    cityCodes.put("50", "重庆");
    cityCodes.put("51", "四川");
    cityCodes.put("52", "贵州");
    cityCodes.put("53", "云南");
    cityCodes.put("54", "西藏");
    cityCodes.put("61", "陕西");
    cityCodes.put("62", "甘肃");
    cityCodes.put("63", "青海");
    cityCodes.put("64", "宁夏");
    cityCodes.put("65", "新疆");
    cityCodes.put("71", "台湾");
    cityCodes.put("81", "香港");
    cityCodes.put("82", "澳门");
    cityCodes.put("91", "国外");
  }
  
  public static String conver15CardTo18(String paramString)
  {
    if (paramString.length() != 15) {}
    for (;;)
    {
      return null;
      if (!isNum(paramString)) {
        continue;
      }
      Object localObject1 = paramString.substring(6, 12);
      try
      {
        localObject1 = new SimpleDateFormat("yyMMdd").parse((String)localObject1);
        Object localObject3 = Calendar.getInstance();
        if (localObject1 != null) {
          ((Calendar)localObject3).setTime((Date)localObject1);
        }
        int i = ((Calendar)localObject3).get(1);
        localObject1 = paramString.substring(0, 6) + String.valueOf(i) + paramString.substring(8);
        localObject3 = ((String)localObject1).toCharArray();
        paramString = (String)localObject1;
        if (localObject3 != null)
        {
          paramString = getCheckCode18(getPowerSum(converCharToInt((char[])localObject3)));
          if (paramString.length() <= 0) {
            continue;
          }
          paramString = localObject1 + paramString;
        }
        return paramString;
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
          Object localObject2 = null;
        }
      }
    }
  }
  
  public static int[] converCharToInt(char[] paramArrayOfChar)
  {
    int j = paramArrayOfChar.length;
    int[] arrayOfInt = new int[j];
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return arrayOfInt;
      }
      try
      {
        arrayOfInt[i] = Integer.parseInt(String.valueOf(paramArrayOfChar[i]));
        i += 1;
      }
      catch (NumberFormatException paramArrayOfChar)
      {
        paramArrayOfChar.printStackTrace();
      }
    }
    return arrayOfInt;
  }
  
  public static int getAgeByIdCard(String paramString)
  {
    String str = paramString;
    if (paramString.length() == 15) {
      str = conver15CardTo18(paramString);
    }
    paramString = str.substring(6, 10);
    return Calendar.getInstance().get(1) - Integer.valueOf(paramString).intValue();
  }
  
  public static String getBirthByIdCard(String paramString)
  {
    Integer localInteger = Integer.valueOf(paramString.length());
    if (localInteger.intValue() < 15) {
      return null;
    }
    String str = paramString;
    if (localInteger.intValue() == 15) {
      str = conver15CardTo18(paramString);
    }
    return str.substring(6, 14);
  }
  
  public static String getCheckCode18(int paramInt)
  {
    switch (paramInt % 11)
    {
    default: 
      return "";
    case 10: 
      return "2";
    case 9: 
      return "3";
    case 8: 
      return "4";
    case 7: 
      return "5";
    case 6: 
      return "6";
    case 5: 
      return "7";
    case 4: 
      return "8";
    case 3: 
      return "9";
    case 2: 
      return "x";
    case 1: 
      return "0";
    }
    return "1";
  }
  
  public static Short getDateByIdCard(String paramString)
  {
    Integer localInteger = Integer.valueOf(paramString.length());
    if (localInteger.intValue() < 15) {
      return null;
    }
    String str = paramString;
    if (localInteger.intValue() == 15) {
      str = conver15CardTo18(paramString);
    }
    return Short.valueOf(str.substring(12, 14));
  }
  
  public static String getGenderByIdCard(String paramString)
  {
    String str = paramString;
    if (paramString.length() == 15) {
      str = conver15CardTo18(paramString);
    }
    if (Integer.parseInt(str.substring(16, 17)) % 2 != 0) {
      return "M";
    }
    return "F";
  }
  
  public static Short getMonthByIdCard(String paramString)
  {
    Integer localInteger = Integer.valueOf(paramString.length());
    if (localInteger.intValue() < 15) {
      return null;
    }
    String str = paramString;
    if (localInteger.intValue() == 15) {
      str = conver15CardTo18(paramString);
    }
    return Short.valueOf(str.substring(10, 12));
  }
  
  public static int getPowerSum(int[] paramArrayOfInt)
  {
    if (power.length == paramArrayOfInt.length)
    {
      int j = 0;
      int i = 0;
      int k;
      for (;;)
      {
        if (j >= paramArrayOfInt.length) {
          return i;
        }
        k = 0;
        if (k < power.length) {
          break;
        }
        j += 1;
      }
      if (j == k) {
        i = paramArrayOfInt[j] * power[k] + i;
      }
      for (;;)
      {
        k += 1;
        break;
      }
    }
    return 0;
  }
  
  public static String getProvinceByIdCard(String paramString)
  {
    int i = paramString.length();
    String str = "";
    if ((i == 15) || (i == 18)) {
      str = paramString.substring(0, 2);
    }
    return (String)cityCodes.get(str);
  }
  
  public static Short getYearByIdCard(String paramString)
  {
    Integer localInteger = Integer.valueOf(paramString.length());
    if (localInteger.intValue() < 15) {
      return null;
    }
    String str = paramString;
    if (localInteger.intValue() == 15) {
      str = conver15CardTo18(paramString);
    }
    return Short.valueOf(str.substring(6, 10));
  }
  
  public static boolean isNum(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    return paramString.matches("^[0-9]*$");
  }
  
  public static boolean valiDate(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Calendar.getInstance().get(1);
    if ((paramInt1 < 1930) || (paramInt1 >= i)) {
      return false;
    }
    if ((paramInt2 <= 0) || (paramInt2 > 12)) {
      return false;
    }
    switch (paramInt2)
    {
    case 3: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    default: 
      paramInt1 = 31;
    }
    while ((paramInt3 > 0) && (paramInt3 <= paramInt1))
    {
      return true;
      paramInt1 = 30;
      continue;
      if (((paramInt1 % 4 == 0) && (paramInt1 % 100 != 0)) || ((paramInt1 % 400 == 0) && (paramInt1 > 1930) && (paramInt1 < i))) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 == 0) {
          break label158;
        }
        paramInt1 = 29;
        break;
      }
      label158:
      paramInt1 = 28;
    }
    return false;
  }
  
  public static boolean validateCard(String paramString)
  {
    paramString = paramString.trim();
    if (paramString.length() == 18) {
      return validateIdCard18(paramString);
    }
    if (paramString.length() == 15) {
      return validateIdCard15(paramString);
    }
    return false;
  }
  
  public static boolean validateIdCard15(String paramString)
  {
    if (paramString.length() != 15) {
      return false;
    }
    if (isNum(paramString))
    {
      Object localObject = paramString.substring(0, 2);
      if (cityCodes.get(localObject) == null) {
        return false;
      }
      String str = paramString.substring(6, 12);
      paramString = null;
      try
      {
        localObject = new SimpleDateFormat("yy").parse(str.substring(0, 2));
        paramString = (String)localObject;
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
        }
      }
      localObject = Calendar.getInstance();
      if (paramString != null) {
        ((Calendar)localObject).setTime(paramString);
      }
      if (valiDate(((Calendar)localObject).get(1), Integer.valueOf(str.substring(2, 4)).intValue(), Integer.valueOf(str.substring(4, 6)).intValue())) {
        break label133;
      }
      return false;
    }
    return false;
    label133:
    return true;
  }
  
  public static boolean validateIdCard18(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString.length() == 18)
    {
      Object localObject = paramString.substring(0, 17);
      paramString = paramString.substring(17, 18);
      bool1 = bool2;
      if (isNum((String)localObject))
      {
        localObject = ((String)localObject).toCharArray();
        bool1 = bool2;
        if (localObject != null)
        {
          localObject = getCheckCode18(getPowerSum(converCharToInt((char[])localObject)));
          bool1 = bool2;
          if (((String)localObject).length() > 0)
          {
            bool1 = bool2;
            if (((String)localObject).equalsIgnoreCase(paramString)) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\IdcardUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */