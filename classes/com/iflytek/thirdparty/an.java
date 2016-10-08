package com.iflytek.thirdparty;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.iflytek.msc.MSC;
import java.io.InputStream;
import java.util.HashMap;

public class an
{
  public static int a;
  public static int b;
  public static int c;
  public static int d;
  private static final String e;
  private static final String f;
  private static HashMap<String, Drawable> g;
  private static HashMap<String, Drawable> h;
  
  static
  {
    if (MSC.isIflyVersion()) {}
    for (String str = "iflytek/";; str = "cmcc/")
    {
      e = str;
      f = "assets/" + e;
      g = new HashMap();
      h = new HashMap();
      a = 3;
      b = 4;
      c = 7;
      d = 8;
      return;
    }
  }
  
  public static Drawable a(Context paramContext, String paramString)
  {
    try
    {
      Drawable localDrawable2 = (Drawable)g.get(paramString);
      Drawable localDrawable1 = localDrawable2;
      if (localDrawable2 == null)
      {
        localDrawable1 = c(paramContext, paramString);
        g.put(paramString, localDrawable1);
      }
      return localDrawable1;
    }
    finally {}
  }
  
  public static View a(Context paramContext, String paramString, ViewGroup paramViewGroup)
  {
    paramString = f + paramString + ".xml";
    paramString = paramContext.getAssets().openXmlResourceParser(paramString);
    return ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramString, paramViewGroup);
  }
  
  public static int[] a()
  {
    return new int[] { -1579033, -9933198 };
  }
  
  private static InputStream b(Context paramContext, String paramString)
  {
    return paramContext.getAssets().open(paramString);
  }
  
  public static int[] b()
  {
    return new int[] { 20, 16 };
  }
  
  private static Drawable c(Context paramContext, String paramString)
  {
    InputStream localInputStream = b(paramContext, e + paramString + ".png");
    TypedValue localTypedValue = new TypedValue();
    localTypedValue.density = 240;
    if (Build.VERSION.SDK_INT > a) {}
    for (paramContext = ao.a(paramContext.getResources(), localTypedValue, localInputStream, paramString, null);; paramContext = Drawable.createFromResourceStream(paramContext.getResources(), localTypedValue, localInputStream, paramString))
    {
      if (localInputStream != null) {
        localInputStream.close();
      }
      return paramContext;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */