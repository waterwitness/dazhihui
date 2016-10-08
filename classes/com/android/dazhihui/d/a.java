package com.android.dazhihui.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.dazhihui.g;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{
  public static Paint a = new Paint(1);
  public static Paint b = new Paint(1);
  public static Paint c = new Paint(1);
  public static Paint d = new Paint();
  public static Paint e = new Paint(1);
  public static int f = 20;
  public static Paint.FontMetrics g = null;
  public static Paint h = new Paint(1);
  
  public static int a(String paramString)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    f = g.a().m() / 16;
    a.setTextSize(f);
    Rect localRect = new Rect();
    a.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.width();
  }
  
  public static int a(String paramString, float paramFloat)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    Paint localPaint = new Paint(1);
    localPaint.setTextSize(paramFloat);
    Rect localRect = new Rect();
    localPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.width();
  }
  
  public static int a(String paramString, int paramInt)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    Paint localPaint = new Paint(1);
    localPaint.setTextSize(paramInt);
    Rect localRect = new Rect();
    localPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.height();
  }
  
  public static int a(String paramString, Paint paramPaint)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    Rect localRect = new Rect();
    paramPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.width();
  }
  
  public static Bitmap a(Resources paramResources, int paramInt, float paramFloat1, float paramFloat2)
  {
    paramResources = BitmapFactory.decodeResource(paramResources, paramInt);
    paramInt = paramResources.getWidth();
    int i = paramResources.getHeight();
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(1.0F * paramFloat1, 1.0F * paramFloat2);
    return Bitmap.createBitmap(paramResources, 0, 0, paramInt, i, localMatrix, true);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.postRotate(paramInt);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
  }
  
  public static Drawable a(Resources paramResources, int paramInt)
  {
    return paramResources.getDrawable(paramInt);
  }
  
  public static String a(double paramDouble, String paramString)
  {
    return new DecimalFormat(paramString).format(paramDouble);
  }
  
  public static ArrayList<String> a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    paramString = e(paramString.replaceAll("\t", " "));
    ArrayList localArrayList = new ArrayList();
    int k = Math.max(paramInt1 / a("国"), 1);
    Iterator localIterator = paramString.iterator();
    int j;
    int m;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = str;
      j = paramInt2;
      if (str.length() < 1)
      {
        localArrayList.add(str);
        paramInt2 = paramInt1;
      }
      else
      {
        m = paramString.length();
        if (k <= m) {
          break label275;
        }
      }
    }
    label141:
    label199:
    label275:
    for (paramInt2 = m;; paramInt2 = k)
    {
      int n = a(paramString.substring(0, paramInt2));
      int i;
      if ((n > j) && (paramInt2 > 1))
      {
        paramInt2 -= 1;
        i = paramInt2;
        if (paramInt2 > 1)
        {
          if (a(paramString.substring(0, paramInt2)) > j) {
            break label199;
          }
          i = paramInt2;
        }
      }
      for (;;)
      {
        if (i < m)
        {
          localArrayList.add(paramString.substring(0, i));
          paramString = paramString.substring(i);
          j = paramInt1;
          break;
          paramInt2 -= 1;
          break label141;
          i = paramInt2;
          if (n < j)
          {
            i = paramInt2;
            if (paramInt2 < m) {
              for (;;)
              {
                i = paramInt2;
                if (paramInt2 >= m) {
                  break;
                }
                i = paramInt2;
                if (a(paramString.substring(0, paramInt2 + 1)) > j) {
                  break;
                }
                paramInt2 += 1;
              }
            }
          }
        }
      }
      localArrayList.add(paramString);
      paramInt2 = paramInt1;
      break;
      return localArrayList;
    }
  }
  
  public static List<String> a(String paramString, int paramInt, Paint paramPaint)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    if (a(paramString, paramPaint) <= paramInt)
    {
      localArrayList.add(paramString);
      return localArrayList;
    }
    int k = paramInt / a(paramString.substring(0, 1), paramPaint);
    int i;
    if (k > paramString.length()) {
      i = paramString.length();
    }
    for (;;)
    {
      int m = a(paramString.substring(j, i), paramPaint);
      if (m > paramInt)
      {
        i -= 1;
      }
      else if (m <= paramInt)
      {
        if (i + 1 > paramString.length())
        {
          localArrayList.add(paramString.substring(j));
          return localArrayList;
        }
        if (a(paramString.substring(j, i + 1), paramPaint) >= paramInt)
        {
          localArrayList.add(paramString.substring(j, i));
          m = i + k;
          if (m > paramString.length())
          {
            m = paramString.length();
            j = i;
            i = m;
          }
        }
        else
        {
          i += 1;
          continue;
        }
        j = i;
        i = m;
        continue;
        i = k;
      }
    }
  }
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt, Canvas paramCanvas)
  {
    d.setAntiAlias(true);
    d.setColor(paramInt);
    if (paramFloat1 == paramFloat3)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4 + 1.0F, d);
      return;
    }
    if (paramFloat2 == paramFloat4)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4, d);
      return;
    }
    if (paramFloat4 > paramFloat2)
    {
      if (paramFloat3 > paramFloat1)
      {
        paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4 + 1.0F, d);
        return;
      }
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 - 1.0F, paramFloat4 + 1.0F, d);
      return;
    }
    if (paramFloat3 > paramFloat1)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4 - 1.0F, d);
      return;
    }
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 - 1.0F, paramFloat4 - 1.0F, d);
  }
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Canvas paramCanvas)
  {
    d.setAntiAlias(true);
    d.setStrokeWidth(2.0F);
    if (paramFloat1 == paramFloat3)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4 + 1.0F, d);
      return;
    }
    if (paramFloat2 == paramFloat4)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4, d);
      return;
    }
    if (paramFloat4 > paramFloat2)
    {
      if (paramFloat3 > paramFloat1)
      {
        paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4 + 1.0F, d);
        return;
      }
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 - 1.0F, paramFloat4 + 1.0F, d);
      return;
    }
    if (paramFloat3 > paramFloat1)
    {
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 + 1.0F, paramFloat4 - 1.0F, d);
      return;
    }
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3 - 1.0F, paramFloat4 - 1.0F, d);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Canvas paramCanvas)
  {
    a.setColor(paramInt7);
    a.setStyle(Paint.Style.FILL);
    paramCanvas.drawRoundRect(new RectF(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4), paramInt5, paramInt6, a);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Canvas paramCanvas)
  {
    a.setColor(paramInt5);
    a.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4, a);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    a.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4, a);
  }
  
  public static void a(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(paramBitmap, new Rect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4), new RectF(paramInt5, paramInt6, paramInt5 + paramInt3, paramInt6 + paramInt4), a);
  }
  
  public static void a(Bitmap paramBitmap, int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(paramBitmap, paramInt1, paramInt2, a);
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, Paint.Align paramAlign, Canvas paramCanvas)
  {
    a.setColor(paramInt3);
    a.setTextAlign(paramAlign);
    g = a.getFontMetrics();
    paramCanvas.drawText(paramString, paramInt1, paramInt2 - g.ascent, a);
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, Paint.Align paramAlign, Canvas paramCanvas)
  {
    a.setTextAlign(paramAlign);
    g = a.getFontMetrics();
    paramCanvas.drawText(paramString, paramInt1, paramInt2 - g.ascent, a);
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, Paint.Align paramAlign, Canvas paramCanvas, Paint paramPaint)
  {
    paramPaint.setTextAlign(paramAlign);
    paramAlign = paramString;
    if (paramString == null) {
      paramAlign = "--";
    }
    paramString = paramAlign;
    if (paramAlign.equals("null")) {
      paramString = "";
    }
    g = paramPaint.getFontMetrics();
    paramCanvas.drawText(paramString, paramInt1, paramInt2 - g.ascent, paramPaint);
  }
  
  public static int b(String paramString)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    a.setTextSize(b.b);
    Rect localRect = new Rect();
    a.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.width();
  }
  
  public static int b(String paramString, int paramInt)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    Paint localPaint = new Paint(1);
    localPaint.setTextSize(paramInt);
    Rect localRect = new Rect();
    localPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.width();
  }
  
  public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Canvas paramCanvas)
  {
    a.setColor(paramInt5);
    a.setStyle(Paint.Style.FILL);
    paramCanvas.drawRect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4, a);
  }
  
  public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramCanvas);
  }
  
  public static void b(String paramString, int paramInt1, int paramInt2, Paint.Align paramAlign, Canvas paramCanvas)
  {
    b.setTextAlign(paramAlign);
    g = b.getFontMetrics();
    paramCanvas.drawText(paramString, paramInt1, paramInt2 - g.ascent, b);
  }
  
  public static int c(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return 0;
  }
  
  public static int c(String paramString, int paramInt)
  {
    if (paramString == null) {}
    while (paramString.length() == 0) {
      return 0;
    }
    Paint localPaint = new Paint(1);
    localPaint.setTextSize(paramInt);
    Rect localRect = new Rect();
    localPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    return localRect.height();
  }
  
  public static void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    paramCanvas.clipRect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  public static double d(String paramString)
  {
    try
    {
      double d1 = Double.parseDouble(paramString);
      return d1;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return 0.0D;
  }
  
  public static ArrayList<String> e(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    ArrayList localArrayList = new ArrayList();
    int m = 0;
    int k = paramString.length();
    int j = paramString.indexOf('\n', m);
    int n = paramString.indexOf('\r', m);
    int i = j;
    if (j < 0) {
      i = k;
    }
    j = n;
    if (n < 0) {
      j = k;
    }
    if (i > j) {}
    for (;;)
    {
      localArrayList.add(paramString.substring(m, j));
      if (j == k) {
        return localArrayList;
      }
      m = j + 1;
      i = m;
      if (paramString.charAt(j) == '\r')
      {
        i = m;
        if (m < k)
        {
          i = m;
          if (paramString.charAt(m) == '\n') {
            i = m + 1;
          }
        }
      }
      m = i;
      if (i != k) {
        break;
      }
      localArrayList.add("");
      return localArrayList;
      j = i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */