package com.android.dazhihui.richscan.a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

final class b
{
  private static final String a = b.class.getSimpleName();
  private static final Pattern b = Pattern.compile(",");
  private final Context c;
  private Point d;
  private Point e;
  private int f;
  private String g;
  
  b(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private static int a(CharSequence paramCharSequence, int paramInt)
  {
    paramCharSequence = b.split(paramCharSequence);
    int m = paramCharSequence.length;
    int j = 0;
    int i = 0;
    String str;
    if (j < m) {
      str = paramCharSequence[j].trim();
    }
    label86:
    for (;;)
    {
      try
      {
        double d1 = Double.parseDouble(str);
        int k = (int)(10.0D * d1);
        if (Math.abs(paramInt - d1) >= Math.abs(paramInt - i)) {
          break label86;
        }
        i = k;
        j += 1;
      }
      catch (NumberFormatException paramCharSequence)
      {
        return paramInt;
      }
      return i;
    }
  }
  
  private static Point a(Camera.Parameters paramParameters, Point paramPoint)
  {
    Object localObject = paramParameters.get("preview-size-values");
    if (localObject == null) {
      localObject = paramParameters.get("preview-size-value");
    }
    for (;;)
    {
      paramParameters = null;
      if (localObject != null)
      {
        Log.d(a, "preview-size-values parameter: " + (String)localObject);
        paramParameters = a((CharSequence)localObject, paramPoint);
      }
      localObject = paramParameters;
      if (paramParameters == null) {
        localObject = new Point(paramPoint.x >> 3 << 3, paramPoint.y >> 3 << 3);
      }
      return (Point)localObject;
    }
  }
  
  private static Point a(CharSequence paramCharSequence, Point paramPoint)
  {
    paramCharSequence = b.split(paramCharSequence);
    int i3 = paramCharSequence.length;
    int m = 0;
    int j = 0;
    int i = 0;
    int n = Integer.MAX_VALUE;
    String str;
    int k;
    for (;;)
    {
      if (m >= i3) {
        break label268;
      }
      str = paramCharSequence[m].trim();
      k = str.indexOf('x');
      if (k >= 0) {
        break;
      }
      Log.w(a, "Bad preview-size: " + str);
      k = j;
      j = i;
      i = k;
      m += 1;
      k = j;
      j = i;
      i = k;
    }
    for (;;)
    {
      int i2;
      try
      {
        i1 = Integer.parseInt(str.substring(0, k));
        k = Integer.parseInt(str.substring(k + 1));
        i2 = Math.abs(i1 - paramPoint.x) + Math.abs(k - paramPoint.y);
        if (i2 != 0) {
          break label229;
        }
        if ((i1 <= 0) || (k <= 0)) {
          break label251;
        }
        return new Point(i1, k);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Log.w(a, "Bad preview-size: " + str);
        k = i;
        i = j;
        j = k;
      }
      break;
      label229:
      if (i2 < n)
      {
        n = i2;
        j = i1;
        i = k;
        break;
        label251:
        return null;
      }
      k = i;
      i = j;
      j = k;
      break;
      label268:
      k = j;
      int i1 = i;
    }
  }
  
  private void a(Camera.Parameters paramParameters)
  {
    if ((Build.MODEL.contains("Behold II")) && (c.a == 3)) {
      paramParameters.set("flash-value", 1);
    }
    for (;;)
    {
      paramParameters.set("flash-mode", "off");
      return;
      paramParameters.set("flash-value", 2);
    }
  }
  
  private void b(Camera.Parameters paramParameters)
  {
    str1 = paramParameters.get("zoom-supported");
    if ((str1 != null) && (!Boolean.parseBoolean(str1))) {}
    do
    {
      return;
      j = 27;
      str1 = paramParameters.get("max-zoom");
      i = j;
      if (str1 != null) {}
      try
      {
        double d1 = Double.parseDouble(str1);
        i = (int)(d1 * 10.0D);
        if (27 <= i) {
          break;
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        for (;;)
        {
          String str2;
          Log.w(a, "Bad max-zoom: " + str1);
          i = j;
          continue;
          i = 27;
        }
      }
      str2 = paramParameters.get("taking-picture-zoom-max");
      j = i;
      if (str2 != null) {}
      try
      {
        k = Integer.parseInt(str2);
        j = i;
        if (i > k) {
          j = k;
        }
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        for (;;)
        {
          int k;
          String str3;
          String str4;
          Log.w(a, "Bad taking-picture-zoom-max: " + localNumberFormatException1);
          j = i;
        }
      }
      str3 = paramParameters.get("mot-zoom-values");
      i = j;
      if (str3 != null) {
        i = a(str3, j);
      }
      str4 = paramParameters.get("mot-zoom-step");
      j = i;
      if (str4 != null) {}
      try
      {
        k = (int)(Double.parseDouble(str4.trim()) * 10.0D);
        j = i;
        if (k > 1) {
          j = i - i % k;
        }
      }
      catch (NumberFormatException localNumberFormatException3)
      {
        for (;;)
        {
          j = i;
        }
      }
      if ((str1 != null) || (str3 != null)) {
        paramParameters.set("zoom", String.valueOf(j / 10.0D));
      }
    } while (str2 == null);
    paramParameters.set("taking-picture-zoom", j);
  }
  
  Point a()
  {
    return this.e;
  }
  
  void a(Camera paramCamera)
  {
    paramCamera = paramCamera.getParameters();
    this.f = paramCamera.getPreviewFormat();
    this.g = paramCamera.get("preview-format");
    Log.d(a, "Default preview format: " + this.f + '/' + this.g);
    Object localObject = ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay();
    this.d = new Point(((Display)localObject).getWidth(), ((Display)localObject).getHeight());
    Log.d(a, "Screen resolution: " + this.d);
    localObject = new Point();
    ((Point)localObject).x = this.d.x;
    ((Point)localObject).y = this.d.y;
    if (this.d.x < this.d.y)
    {
      ((Point)localObject).x = this.d.y;
      ((Point)localObject).y = this.d.x;
    }
    this.e = a(paramCamera, (Point)localObject);
    Log.d(a, "Camera resolution: " + this.d);
  }
  
  protected void a(Camera paramCamera, int paramInt)
  {
    try
    {
      Method localMethod = paramCamera.getClass().getMethod("setDisplayOrientation", new Class[] { Integer.TYPE });
      if (localMethod != null) {
        localMethod.invoke(paramCamera, new Object[] { Integer.valueOf(paramInt) });
      }
      return;
    }
    catch (Exception paramCamera) {}
  }
  
  Point b()
  {
    return this.d;
  }
  
  void b(Camera paramCamera)
  {
    Camera.Parameters localParameters = paramCamera.getParameters();
    Log.d(a, "Setting preview size: " + this.e);
    localParameters.setPreviewSize(this.e.x, this.e.y);
    a(localParameters);
    b(localParameters);
    if (Integer.parseInt(Build.VERSION.SDK) >= 8) {
      a(paramCamera, 90);
    }
    paramCamera.setParameters(localParameters);
  }
  
  int c()
  {
    return this.f;
  }
  
  String d()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */