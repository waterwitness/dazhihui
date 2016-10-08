package com.cairh.app.sjkh.common;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class SupportedSizesReflect
{
  private static Method Parameters_getSupportedPictureSizes;
  private static Method Parameters_getSupportedPreviewSizes = null;
  
  static
  {
    Parameters_getSupportedPictureSizes = null;
    initCompatibility();
  }
  
  public static List<Camera.Size> getSupportedPictureSizes(Camera.Parameters paramParameters)
  {
    return getSupportedSizes(paramParameters, Parameters_getSupportedPictureSizes);
  }
  
  public static List<Camera.Size> getSupportedPreviewSizes(Camera.Parameters paramParameters)
  {
    return getSupportedSizes(paramParameters, Parameters_getSupportedPreviewSizes);
  }
  
  private static List<Camera.Size> getSupportedSizes(Camera.Parameters paramParameters, Method paramMethod)
  {
    if (paramMethod != null) {}
    try
    {
      paramParameters = (List)paramMethod.invoke(paramParameters, new Object[0]);
      return paramParameters;
    }
    catch (InvocationTargetException paramParameters)
    {
      paramMethod = paramParameters.getCause();
      if (!(paramMethod instanceof RuntimeException)) {
        break label39;
      }
      throw ((RuntimeException)paramMethod);
      label39:
      if (!(paramMethod instanceof Error)) {
        break label51;
      }
      throw ((Error)paramMethod);
      label51:
      throw new RuntimeException(paramParameters);
    }
    catch (IllegalAccessException paramParameters) {}
    return null;
    return null;
  }
  
  private static void initCompatibility()
  {
    try
    {
      Parameters_getSupportedPreviewSizes = Camera.Parameters.class.getMethod("getSupportedPreviewSizes", new Class[0]);
      Parameters_getSupportedPictureSizes = Camera.Parameters.class.getMethod("getSupportedPictureSizes", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
      Parameters_getSupportedPictureSizes = null;
      Parameters_getSupportedPreviewSizes = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\common\SupportedSizesReflect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */