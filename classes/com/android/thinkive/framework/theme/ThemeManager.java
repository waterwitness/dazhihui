package com.android.thinkive.framework.theme;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Environment;
import com.android.thinkive.framework.util.FileUtil;
import com.android.thinkive.framework.util.NinePatchChunk;
import com.android.thinkive.framework.util.PreferencesUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemeManager
{
  private static final String KEY_THEME_NAME = "key_theme_NAME";
  public static final String SUFFIX_JPG = ".jpg";
  public static final String SUFFIX_PNG = ".png";
  public static final String SUFFIX_PNG9 = ".9.png";
  public static final String THEME_PATH = Environment.getExternalStorageDirectory() + File.separator + "thinkive" + File.separator + "theme" + File.separator;
  public static ThemeManager instance;
  private Context mContext;
  private ThemeBean themeBean;
  
  public ThemeManager(Context paramContext)
  {
    this.mContext = paramContext;
    loadThemeInfo();
  }
  
  public static String getCurrentTheme(Context paramContext)
  {
    return PreferencesUtil.getString(paramContext, "key_theme_NAME", "");
  }
  
  public static ThemeManager getInstance(Context paramContext)
  {
    if (instance == null) {}
    try
    {
      if (instance == null) {
        instance = new ThemeManager(paramContext);
      }
      return instance;
    }
    finally {}
  }
  
  public static Drawable getNormalDrawable(Context paramContext, int paramInt, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = paramContext.getResources().getResourceEntryName(paramInt) + paramString;
    localObject2 = THEME_PATH + getCurrentTheme(paramContext) + File.separator + (String)localObject2;
    if (FileUtil.isFileExists((String)localObject2))
    {
      if (paramString.contains(".9"))
      {
        localObject2 = BitmapFactory.decodeFile((String)localObject2);
        byte[] arrayOfByte = ((Bitmap)localObject2).getNinePatchChunk();
        paramString = (String)localObject1;
        if (NinePatch.isNinePatchChunk(arrayOfByte)) {
          paramString = new NinePatchDrawable(paramContext.getResources(), (Bitmap)localObject2, arrayOfByte, NinePatchChunk.deserialize(arrayOfByte).mPaddings, null);
        }
        return paramString;
      }
      try
      {
        paramContext = Drawable.createFromStream(new FileInputStream((String)localObject2), "");
        return paramContext;
      }
      catch (FileNotFoundException paramContext)
      {
        paramContext.printStackTrace();
        return null;
      }
    }
    return paramContext.getResources().getDrawable(paramInt);
  }
  
  public static Drawable getSelectDrawable(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable;
    if (paramInt3 > 0)
    {
      localDrawable = getNormalDrawable(paramContext, paramInt3, paramString);
      localStateListDrawable.addState(new int[] { -16842910 }, localDrawable);
    }
    if (paramInt2 > 0)
    {
      localDrawable = getNormalDrawable(paramContext, paramInt2, paramString);
      localStateListDrawable.addState(new int[] { 16842919 }, localDrawable);
    }
    if (paramInt1 > 0)
    {
      paramContext = getNormalDrawable(paramContext, paramInt1, paramString);
      localStateListDrawable.addState(new int[] { 16842910 }, paramContext);
    }
    return localStateListDrawable;
  }
  
  public static int getThemeColor(Context paramContext, int paramInt)
  {
    HashMap localHashMap = null;
    String str = paramContext.getResources().getResourceEntryName(paramInt);
    if (getInstance(paramContext).getThemeBean() != null) {
      localHashMap = getInstance(paramContext).getThemeBean().getMapColor();
    }
    if ((localHashMap != null) && (localHashMap.containsKey(str))) {
      return Color.parseColor((String)localHashMap.get(str));
    }
    return paramContext.getResources().getColor(paramInt);
  }
  
  public static void saveTheme(Context paramContext, String paramString)
  {
    if (!getCurrentTheme(paramContext).equals(paramString)) {
      PreferencesUtil.putString(paramContext, "key_theme_NAME", paramString);
    }
  }
  
  public ArrayList<String> getAllThemeName()
  {
    ArrayList localArrayList = new ArrayList();
    if ("mounted".equals(Environment.getExternalStorageState()))
    {
      int j;
      int i;
      do
      {
        try
        {
          arrayOfFile = new File(THEME_PATH).listFiles();
          if (arrayOfFile == null) {
            break;
          }
          j = arrayOfFile.length;
          i = 0;
        }
        catch (Exception localException)
        {
          File[] arrayOfFile;
          File localFile;
          localException.printStackTrace();
          return localArrayList;
        }
        localFile = arrayOfFile[i];
        if (localFile.isDirectory()) {
          localArrayList.add(localFile.getName());
        }
        i += 1;
      } while (i < j);
    }
    return localArrayList;
  }
  
  public ThemeBean getThemeBean()
  {
    return this.themeBean;
  }
  
  public void loadThemeInfo()
  {
    this.themeBean = ThemeInfo.parseThemeColor(THEME_PATH + getCurrentTheme(this.mContext) + File.separator + "theme_info.xml");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\theme\ThemeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */