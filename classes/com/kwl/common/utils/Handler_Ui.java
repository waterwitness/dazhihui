package com.kwl.common.utils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.ResultReceiver;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.Spinner;
import android.widget.Toast;

public class Handler_Ui
{
  private static Dialog pd = null;
  private static Toast toast = null;
  
  public static void alertDialog(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    paramContext = new AlertDialog.Builder(paramContext);
    paramContext.setMessage(paramString1);
    paramContext.setNegativeButton(paramString2, paramOnClickListener1);
    paramContext.setPositiveButton(paramString3, paramOnClickListener2);
    paramContext.setCancelable(paramBoolean);
    paramContext.show();
  }
  
  public static void alertDialog(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    paramContext = new AlertDialog.Builder(paramContext);
    paramContext.setMessage(paramString1);
    paramContext.setPositiveButton(paramString2, paramOnClickListener);
    paramContext.setCancelable(paramBoolean);
    paramContext.show();
  }
  
  public static void dismissProgressDialog()
  {
    if ((pd != null) && (pd.isShowing()))
    {
      pd.dismiss();
      pd = null;
    }
  }
  
  public static void hideSoftKeyboard(View paramView)
  {
    ((InputMethodManager)paramView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
  }
  
  public static Dialog progressDialog(Context paramContext)
  {
    if ((pd != null) && (pd.isShowing())) {
      pd.dismiss();
    }
    pd = new Dialog(paramContext, ResourceUtil.getStyleIdByName(paramContext, "selectorDialog"));
    paramContext = LayoutInflater.from(paramContext).inflate(ResourceUtil.getLayoutIdByName(paramContext, "kwlstock_open_dialog"), null);
    pd.setContentView(paramContext);
    pd.setCancelable(false);
    return pd;
  }
  
  public static void removeParentView(View paramView)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
  }
  
  public static void setSelection(Spinner paramSpinner, Object paramObject)
  {
    setSelection(paramSpinner, paramObject.toString());
  }
  
  public static void setSelection(Spinner paramSpinner, String paramString)
  {
    int j = paramSpinner.getCount();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      if (paramSpinner.getItemAtPosition(i).toString().equalsIgnoreCase(paramString)) {
        paramSpinner.setSelection(i);
      }
      i += 1;
    }
  }
  
  public static Bitmap shot(Activity paramActivity)
  {
    View localView = paramActivity.getWindow().getDecorView();
    paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
    localView.layout(0, 0, paramActivity.getWidth(), paramActivity.getHeight());
    localView.setDrawingCacheEnabled(true);
    paramActivity = Bitmap.createBitmap(localView.getDrawingCache());
    localView.setDrawingCacheEnabled(false);
    return paramActivity;
  }
  
  public static void showSoftkeyboard(View paramView)
  {
    showSoftkeyboard(paramView, null);
  }
  
  public static void showSoftkeyboard(View paramView, ResultReceiver paramResultReceiver)
  {
    InputMethodManager localInputMethodManager;
    if (paramView.getContext().getResources().getConfiguration().hardKeyboardHidden == 2)
    {
      localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
      if (paramResultReceiver != null) {
        localInputMethodManager.showSoftInput(paramView, 1, paramResultReceiver);
      }
    }
    else
    {
      return;
    }
    localInputMethodManager.showSoftInput(paramView, 1);
  }
  
  public static void startAnim(ImageView paramImageView, int paramInt)
  {
    try
    {
      paramImageView.setScaleType(ImageView.ScaleType.CENTER);
      paramImageView.setImageResource(paramInt);
      AnimationSet localAnimationSet = new AnimationSet(false);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
      localRotateAnimation.setDuration(2000L);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      localRotateAnimation.setRepeatMode(1);
      localRotateAnimation.setRepeatCount(-1);
      localAnimationSet.addAnimation(localRotateAnimation);
      paramImageView.setAnimation(localAnimationSet);
      return;
    }
    catch (Exception paramImageView) {}
  }
  
  public static void stopAnim(ImageView paramImageView)
  {
    try
    {
      paramImageView.clearAnimation();
      paramImageView.setImageBitmap(null);
      return;
    }
    catch (Exception paramImageView) {}
  }
  
  public static void toastDialog(Context paramContext, String paramString)
  {
    if (toast == null) {
      toast = Toast.makeText(paramContext, paramString, 0);
    }
    for (;;)
    {
      toast.setGravity(17, 0, 0);
      toast.show();
      return;
      toast.setText(paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\Handler_Ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */