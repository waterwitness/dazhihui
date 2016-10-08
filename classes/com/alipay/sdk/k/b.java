package com.alipay.sdk.k;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public final class b
  extends AlertDialog
{
  protected b(a parama, Context paramContext)
  {
    super(paramContext);
  }
  
  private static int a(Context paramContext, float paramFloat)
  {
    if (paramContext == null) {}
    for (paramContext = Resources.getSystem();; paramContext = paramContext.getResources()) {
      return (int)(paramContext.getDisplayMetrics().density * paramFloat);
    }
  }
  
  /* Error */
  private static android.graphics.drawable.Drawable a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 43	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokestatic 48	com/alipay/sdk/d/a:a	(Ljava/lang/String;)[B
    //   8: invokespecial 51	java/io/ByteArrayInputStream:<init>	([B)V
    //   11: astore_1
    //   12: new 53	android/graphics/BitmapFactory$Options
    //   15: dup
    //   16: invokespecial 56	android/graphics/BitmapFactory$Options:<init>	()V
    //   19: astore_2
    //   20: aload_2
    //   21: sipush 480
    //   24: putfield 60	android/graphics/BitmapFactory$Options:inDensity	I
    //   27: aload_2
    //   28: aload_0
    //   29: invokevirtual 36	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   32: invokevirtual 25	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   35: getfield 63	android/util/DisplayMetrics:densityDpi	I
    //   38: putfield 66	android/graphics/BitmapFactory$Options:inTargetDensity	I
    //   41: aload_1
    //   42: aconst_null
    //   43: aload_2
    //   44: invokestatic 72	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   47: astore_2
    //   48: new 74	android/graphics/drawable/BitmapDrawable
    //   51: dup
    //   52: aload_0
    //   53: invokevirtual 36	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   56: aload_2
    //   57: invokespecial 77	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   60: astore_0
    //   61: aload_1
    //   62: invokevirtual 82	java/io/InputStream:close	()V
    //   65: aload_0
    //   66: areturn
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_0
    //   70: aload_0
    //   71: ifnull +42 -> 113
    //   74: aload_0
    //   75: invokevirtual 82	java/io/InputStream:close	()V
    //   78: aconst_null
    //   79: areturn
    //   80: astore_0
    //   81: aconst_null
    //   82: areturn
    //   83: astore_0
    //   84: aconst_null
    //   85: astore_1
    //   86: aload_1
    //   87: ifnull +7 -> 94
    //   90: aload_1
    //   91: invokevirtual 82	java/io/InputStream:close	()V
    //   94: aload_0
    //   95: athrow
    //   96: astore_1
    //   97: aload_0
    //   98: areturn
    //   99: astore_1
    //   100: goto -6 -> 94
    //   103: astore_0
    //   104: goto -18 -> 86
    //   107: astore_0
    //   108: aload_1
    //   109: astore_0
    //   110: goto -40 -> 70
    //   113: aconst_null
    //   114: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramContext	Context
    //   0	115	1	paramString	String
    //   19	38	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	67	java/lang/Throwable
    //   74	78	80	java/lang/Exception
    //   0	12	83	finally
    //   61	65	96	java/lang/Exception
    //   90	94	99	java/lang/Exception
    //   12	61	103	finally
    //   12	61	107	java/lang/Throwable
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Context localContext = getContext();
    LinearLayout localLinearLayout = new LinearLayout(localContext);
    paramBundle = new FrameLayout.LayoutParams(-2, a(localContext, 50.0F));
    paramBundle.gravity = 17;
    localLinearLayout.setOrientation(0);
    localLinearLayout.setLayoutParams(paramBundle);
    paramBundle = new GradientDrawable();
    paramBundle.setColor(-450944201);
    paramBundle.setCornerRadius(a(localContext, 5.0F));
    localLinearLayout.setBackgroundDrawable(paramBundle);
    ImageView localImageView = new ImageView(localContext);
    paramBundle = new LinearLayout.LayoutParams(a(localContext, 20.0F), a(localContext, 20.0F));
    paramBundle.gravity = 16;
    paramBundle.setMargins(a(a.a(this.a), 17.0F), a(a.a(this.a), 10.0F), a(a.a(this.a), 8.0F), a(a.a(this.a), 10.0F));
    localImageView.setLayoutParams(paramBundle);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setImageDrawable(a(localContext, a.a));
    paramBundle = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    paramBundle.setRepeatCount(-1);
    paramBundle.setDuration(900L);
    paramBundle.setInterpolator(new LinearInterpolator());
    localImageView.startAnimation(paramBundle);
    TextView localTextView = new TextView(localContext);
    if (TextUtils.isEmpty(a.b(this.a))) {}
    for (paramBundle = "正在加载";; paramBundle = a.b(this.a))
    {
      localTextView.setText(paramBundle);
      localTextView.setTextSize(16.0F);
      localTextView.setTextColor(-1);
      paramBundle = new LinearLayout.LayoutParams(-2, -2);
      paramBundle.gravity = 16;
      paramBundle.setMargins(0, 0, a(localContext, 17.0F), 0);
      localTextView.setLayoutParams(paramBundle);
      localLinearLayout.addView(localImageView);
      localLinearLayout.addView(localTextView);
      setContentView(localLinearLayout);
      setCancelable(false);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */