package com.kwl.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ResourceUtil
{
  public static int dp2px(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    float f = paramInt;
    return (int)(paramContext.density * f + 0.5D);
  }
  
  public static int getAnimIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "anim", paramContext.getPackageName());
  }
  
  public static int getColorIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "color", paramContext.getPackageName());
  }
  
  public static int getDimenPixelSize(Context paramContext, int paramInt)
  {
    return paramContext.getResources().getDimensionPixelSize(paramInt);
  }
  
  public static float getDimension(Context paramContext, int paramInt)
  {
    return paramContext.getResources().getDimension(paramInt);
  }
  
  public static int getDimensionPixelOffset(Context paramContext, int paramInt)
  {
    return paramContext.getResources().getDimensionPixelOffset(paramInt);
  }
  
  public static int getDrawableIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "drawable", paramContext.getPackageName());
  }
  
  public static int getId(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "id", paramContext.getPackageName());
  }
  
  public static int getLayoutIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "layout", paramContext.getPackageName());
  }
  
  public static int getRawIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "raw", paramContext.getPackageName());
  }
  
  private static Object getResourceId(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getPackageName() + ".R";
    label136:
    label150:
    for (;;)
    {
      int k;
      int i;
      try
      {
        paramContext = Class.forName(paramContext).getClasses();
        k = paramContext.length;
        i = 0;
      }
      catch (Exception paramContext)
      {
        Field[] arrayOfField;
        Field localField;
        String str;
        paramContext.printStackTrace();
        return null;
      }
      arrayOfField = paramContext[i];
      int m;
      int j;
      if (arrayOfField.getSimpleName().equals(paramString2))
      {
        arrayOfField = arrayOfField.getFields();
        m = arrayOfField.length;
        j = 0;
        break label136;
        localField = arrayOfField[j];
        str = localField.getName();
        if (str.equals(paramString1))
        {
          System.out.println(str);
          paramContext = localField.get(null);
          return paramContext;
        }
        j += 1;
      }
      for (;;)
      {
        if (i < k) {
          break label150;
        }
        return null;
        if (j < m) {
          break;
        }
        i += 1;
      }
    }
  }
  
  public static String getResourceName(Context paramContext, int paramInt)
  {
    return paramContext.getResources().getResourceName(paramInt);
  }
  
  public static String getString(Context paramContext, String paramString)
  {
    int i = getStringIdByName(paramContext, paramString);
    return paramContext.getResources().getString(i);
  }
  
  public static String getStringByResName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getString(getStringIdByName(paramContext, paramString));
  }
  
  public static int getStringIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "string", paramContext.getPackageName());
  }
  
  public static int getStyleIdByName(Context paramContext, String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      throw new RuntimeException("string name is empty");
    }
    return paramContext.getResources().getIdentifier(paramString, "style", paramContext.getPackageName());
  }
  
  public static int getStyleable(Context paramContext, String paramString)
  {
    return ((Integer)getResourceId(paramContext, paramString, "styleable")).intValue();
  }
  
  public static int[] getStyleableArray(Context paramContext, String paramString)
  {
    return (int[])getResourceId(paramContext, paramString, "styleable");
  }
  
  public static int getXmlDef(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    return (int)TypedValue.complexToFloat(localTypedValue.data);
  }
  
  public static int px2sp(Context paramContext, float paramFloat)
  {
    return (int)(paramFloat / paramContext.getResources().getDisplayMetrics().scaledDensity + 0.5F);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\ResourceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */