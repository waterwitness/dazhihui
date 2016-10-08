package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.open.a.f;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

class AuthAgent$FeedConfirmListener
  implements IUiListener
{
  IUiListener a;
  private final String c = "sendinstall";
  private final String d = "installwording";
  private final String e = "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
  
  public AuthAgent$FeedConfirmListener(AuthAgent paramAuthAgent, IUiListener paramIUiListener)
  {
    this.a = paramIUiListener;
  }
  
  /* Error */
  private Drawable a(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 47	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: invokevirtual 51	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   7: astore_2
    //   8: aload_2
    //   9: aload_1
    //   10: invokevirtual 57	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +5 -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: aload_1
    //   21: ldc 59
    //   23: invokevirtual 65	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   26: istore_3
    //   27: iload_3
    //   28: ifeq +61 -> 89
    //   31: aload_2
    //   32: invokestatic 71	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   35: astore_1
    //   36: aload_1
    //   37: ifnull +68 -> 105
    //   40: aload_1
    //   41: invokevirtual 77	android/graphics/Bitmap:getNinePatchChunk	()[B
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 83	android/graphics/NinePatch:isNinePatchChunk	([B)Z
    //   49: pop
    //   50: new 85	android/graphics/drawable/NinePatchDrawable
    //   53: dup
    //   54: aload_1
    //   55: aload_2
    //   56: new 87	android/graphics/Rect
    //   59: dup
    //   60: invokespecial 88	android/graphics/Rect:<init>	()V
    //   63: aconst_null
    //   64: invokespecial 91	android/graphics/drawable/NinePatchDrawable:<init>	(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
    //   67: astore_1
    //   68: aload_1
    //   69: areturn
    //   70: astore_2
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_2
    //   74: invokevirtual 94	java/io/IOException:printStackTrace	()V
    //   77: aload_1
    //   78: areturn
    //   79: astore_1
    //   80: aload_1
    //   81: invokevirtual 95	java/lang/OutOfMemoryError:printStackTrace	()V
    //   84: aconst_null
    //   85: astore_1
    //   86: goto -50 -> 36
    //   89: aload_2
    //   90: aload_1
    //   91: invokestatic 101	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   94: astore_1
    //   95: aload_2
    //   96: invokevirtual 106	java/io/InputStream:close	()V
    //   99: aload_1
    //   100: areturn
    //   101: astore_2
    //   102: goto -29 -> 73
    //   105: aconst_null
    //   106: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	FeedConfirmListener
    //   0	107	1	paramString	String
    //   0	107	2	paramContext	Context
    //   26	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	14	70	java/io/IOException
    //   20	27	70	java/io/IOException
    //   31	36	70	java/io/IOException
    //   40	68	70	java/io/IOException
    //   80	84	70	java/io/IOException
    //   89	95	70	java/io/IOException
    //   31	36	79	java/lang/OutOfMemoryError
    //   95	99	101	java/io/IOException
  }
  
  private View a(Context paramContext, Drawable paramDrawable, String paramString, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    Object localObject1 = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
    float f = ((DisplayMetrics)localObject1).density;
    localObject1 = new RelativeLayout(paramContext);
    Object localObject2 = new ImageView(paramContext);
    ((ImageView)localObject2).setImageDrawable(paramDrawable);
    ((ImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_XY);
    ((ImageView)localObject2).setId(1);
    int i = (int)(60.0F * f);
    int j = (int)(60.0F * f);
    int k = (int)(14.0F * f);
    k = (int)(18.0F * f);
    int m = (int)(6.0F * f);
    int n = (int)(18.0F * f);
    paramDrawable = new RelativeLayout.LayoutParams(i, j);
    paramDrawable.addRule(9);
    paramDrawable.setMargins(0, k, m, n);
    ((RelativeLayout)localObject1).addView((View)localObject2, paramDrawable);
    paramDrawable = new TextView(paramContext);
    paramDrawable.setText(paramString);
    paramDrawable.setTextSize(14.0F);
    paramDrawable.setGravity(3);
    paramDrawable.setIncludeFontPadding(false);
    paramDrawable.setPadding(0, 0, 0, 0);
    paramDrawable.setLines(2);
    paramDrawable.setId(5);
    paramDrawable.setMinWidth((int)(185.0F * f));
    paramString = new RelativeLayout.LayoutParams(-2, -2);
    paramString.addRule(1, 1);
    paramString.addRule(6, 1);
    i = (int)(10.0F * f);
    paramString.setMargins(0, 0, (int)(5.0F * f), 0);
    ((RelativeLayout)localObject1).addView(paramDrawable, paramString);
    paramDrawable = new View(paramContext);
    paramDrawable.setBackgroundColor(Color.rgb(214, 214, 214));
    paramDrawable.setId(3);
    paramString = new RelativeLayout.LayoutParams(-2, 2);
    paramString.addRule(3, 1);
    paramString.addRule(5, 1);
    paramString.addRule(7, 5);
    paramString.setMargins(0, 0, 0, (int)(12.0F * f));
    ((RelativeLayout)localObject1).addView(paramDrawable, paramString);
    paramDrawable = new LinearLayout(paramContext);
    paramString = new RelativeLayout.LayoutParams(-2, -2);
    paramString.addRule(5, 1);
    paramString.addRule(7, 5);
    paramString.addRule(3, 3);
    localObject2 = new Button(paramContext);
    ((Button)localObject2).setText("跳过");
    ((Button)localObject2).setBackgroundDrawable(a("buttonNegt.png", paramContext));
    ((Button)localObject2).setTextColor(Color.rgb(36, 97, 131));
    ((Button)localObject2).setTextSize(20.0F);
    ((Button)localObject2).setOnClickListener(paramOnClickListener2);
    ((Button)localObject2).setId(4);
    paramOnClickListener2 = new LinearLayout.LayoutParams(0, (int)(45.0F * f));
    paramOnClickListener2.rightMargin = ((int)(14.0F * f));
    paramOnClickListener2.leftMargin = ((int)(4.0F * f));
    paramOnClickListener2.weight = 1.0F;
    paramDrawable.addView((View)localObject2, paramOnClickListener2);
    paramOnClickListener2 = new Button(paramContext);
    paramOnClickListener2.setText("确定");
    paramOnClickListener2.setTextSize(20.0F);
    paramOnClickListener2.setTextColor(Color.rgb(255, 255, 255));
    paramOnClickListener2.setBackgroundDrawable(a("buttonPost.png", paramContext));
    paramOnClickListener2.setOnClickListener(paramOnClickListener1);
    paramContext = new LinearLayout.LayoutParams(0, (int)(45.0F * f));
    paramContext.weight = 1.0F;
    paramContext.rightMargin = ((int)(4.0F * f));
    paramDrawable.addView(paramOnClickListener2, paramContext);
    ((RelativeLayout)localObject1).addView(paramDrawable, paramString);
    paramContext = new FrameLayout.LayoutParams((int)(279.0F * f), (int)(163.0F * f));
    ((RelativeLayout)localObject1).setPadding((int)(14.0F * f), 0, (int)(12.0F * f), (int)(12.0F * f));
    ((RelativeLayout)localObject1).setLayoutParams(paramContext);
    ((RelativeLayout)localObject1).setBackgroundColor(Color.rgb(247, 251, 247));
    paramContext = new PaintDrawable(Color.rgb(247, 251, 247));
    paramContext.setCornerRadius(f * 5.0F);
    ((RelativeLayout)localObject1).setBackgroundDrawable(paramContext);
    return (View)localObject1;
  }
  
  private void a(String paramString, IUiListener paramIUiListener, Object paramObject)
  {
    Drawable localDrawable = null;
    Activity localActivity = (Activity)AuthAgent.e(this.b).get();
    if (localActivity == null) {}
    for (;;)
    {
      return;
      Dialog localDialog = new Dialog(localActivity);
      localDialog.requestWindowFeature(1);
      Object localObject3 = localActivity.getPackageManager();
      try
      {
        Object localObject1 = ((PackageManager)localObject3).getPackageInfo(localActivity.getPackageName(), 0);
        if (localObject1 != null) {
          localDrawable = ((PackageInfo)localObject1).applicationInfo.loadIcon((PackageManager)localObject3);
        }
        localObject1 = new AuthAgent.FeedConfirmListener.1(this, localDialog, paramIUiListener, paramObject);
        localObject3 = new AuthAgent.FeedConfirmListener.2(this, localDialog, paramIUiListener, paramObject);
        ColorDrawable localColorDrawable = new ColorDrawable();
        localColorDrawable.setAlpha(0);
        localDialog.getWindow().setBackgroundDrawable(localColorDrawable);
        localDialog.setContentView(a(localActivity, localDrawable, paramString, (View.OnClickListener)localObject1, (View.OnClickListener)localObject3));
        localDialog.setOnCancelListener(new AuthAgent.FeedConfirmListener.3(this, paramIUiListener, paramObject));
        if ((localActivity == null) || (localActivity.isFinishing())) {
          continue;
        }
        localDialog.show();
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          localNameNotFoundException.printStackTrace();
          Object localObject2 = null;
        }
      }
    }
  }
  
  protected void a()
  {
    Bundle localBundle = AuthAgent.g(this.b);
    Activity localActivity = (Activity)AuthAgent.e(this.b).get();
    if (localActivity != null) {
      HttpUtils.requestAsync(AuthAgent.h(this.b), localActivity, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", localBundle, "POST", null);
    }
  }
  
  public void onCancel()
  {
    if (this.a != null) {
      this.a.onCancel();
    }
  }
  
  public void onComplete(Object paramObject)
  {
    int j = 0;
    int i = 0;
    if (paramObject != null)
    {
      localObject = (JSONObject)paramObject;
      if (localObject == null) {}
    }
    try
    {
      if (((JSONObject)localObject).getInt("sendinstall") == 1) {
        i = 1;
      }
      j = i;
      localObject = ((JSONObject)localObject).getString("installwording");
    }
    catch (JSONException localJSONException)
    {
      do
      {
        for (;;)
        {
          f.d("openSDK_LOG.AuthAgent", "FeedConfirmListener onComplete There is no value for sendinstall.");
          i = j;
          String str = "";
        }
      } while (this.a == null);
      this.a.onComplete(paramObject);
    }
    Object localObject = URLDecoder.decode((String)localObject);
    f.a("openSDK_LOG.AuthAgent", " WORDING = " + (String)localObject + "xx");
    if ((i != 0) && (!TextUtils.isEmpty((CharSequence)localObject)))
    {
      a((String)localObject, this.a, paramObject);
      return;
    }
  }
  
  public void onError(UiError paramUiError)
  {
    if (this.a != null) {
      this.a.onError(paramUiError);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$FeedConfirmListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */