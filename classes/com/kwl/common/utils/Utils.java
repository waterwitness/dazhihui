package com.kwl.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils
{
  public static boolean ChineseNameTest(String paramString)
  {
    return paramString.matches("[一-龥]{2,20}");
  }
  
  public static float dip2px(Context paramContext, float paramFloat)
  {
    return paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F;
  }
  
  public static String getSDPath(Context paramContext)
  {
    File localFile = null;
    if (Environment.getExternalStorageState().equals("mounted")) {
      localFile = Environment.getExternalStorageDirectory();
    }
    if (localFile == null) {
      return paramContext.getFilesDir().getAbsolutePath();
    }
    return localFile.toString();
  }
  
  public static int getXmlDef(Context paramContext, int paramInt)
  {
    synchronized (new TypedValue())
    {
      paramContext.getResources().getValue(paramInt, ???, true);
      paramInt = (int)TypedValue.complexToFloat(???.data);
      return paramInt;
    }
  }
  
  public static boolean isMobileNumber(String paramString)
  {
    return Pattern.compile("^((13[0-9])|(170)|(15[^4,\\D])|(18[0-9]))\\d{8}$").matcher(paramString).matches();
  }
  
  public static float px2dip(Context paramContext, float paramFloat)
  {
    float f = paramContext.getResources().getDisplayMetrics().density;
    Log.i("msg", "scale:" + f);
    return paramFloat / f + 0.5F;
  }
  
  public static void setListViewHeightBasedOnChildren(ListView paramListView)
  {
    ListAdapter localListAdapter = paramListView.getAdapter();
    if (localListAdapter == null) {
      return;
    }
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= localListAdapter.getCount())
      {
        localObject = paramListView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = (paramListView.getDividerHeight() * (localListAdapter.getCount() - 1) + j);
        paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        return;
      }
      Object localObject = localListAdapter.getView(i, null, paramListView);
      ((View)localObject).measure(0, 0);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
  }
  
  public static void setPartTextColor(String paramString, int paramInt1, int paramInt2, TextView paramTextView, int paramInt3)
  {
    if (paramTextView == null) {
      return;
    }
    paramString = new SpannableStringBuilder(paramString);
    paramString.setSpan(new ForegroundColorSpan(paramInt3), paramInt1 - 1, paramInt2, 34);
    paramString.setSpan(new AbsoluteSizeSpan((int)(paramTextView.getTextSize() + 8.0F)), paramInt1 - 1, paramInt2, 33);
    paramTextView.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */