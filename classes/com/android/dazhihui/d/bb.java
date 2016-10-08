package com.android.dazhihui.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;
import com.android.dazhihui.ui.model.stock.ProgressMultipartEntity;
import com.android.dazhihui.ui.screen.ShareActivity;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.w;
import com.android.dazhihui.wxapi.WXEntryActivity;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.i;
import com.tencent.mm.sdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.sdk.modelmsg.WXImageObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXWebpageObject;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.entity.mime.content.StringBody;

public class bb
{
  private static bb b;
  private static Context c;
  private com.sina.weibo.sdk.api.a.f a = null;
  private IWXAPI d;
  
  public static Bitmap a(Activity paramActivity, boolean paramBoolean)
  {
    View localView = paramActivity.getWindow().getDecorView();
    localView.setDrawingCacheEnabled(true);
    localView.buildDrawingCache();
    Bitmap localBitmap = localView.getDrawingCache();
    Object localObject = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
    int i = ((Rect)localObject).top;
    int k = paramActivity.getWindowManager().getDefaultDisplay().getWidth();
    int j = paramActivity.getWindowManager().getDefaultDisplay().getHeight() - i;
    if (i + j > localBitmap.getHeight())
    {
      j = localBitmap.getHeight();
      i = 0;
    }
    for (;;)
    {
      localBitmap = Bitmap.createBitmap(localBitmap, 0, i, k, j);
      if (paramBoolean)
      {
        paramActivity = ((BitmapDrawable)paramActivity.getResources().getDrawable(2130838342)).getBitmap();
        localObject = new Canvas(localBitmap);
        Paint localPaint = new Paint();
        ((Canvas)localObject).drawBitmap(paramActivity, k / 2 - paramActivity.getWidth() / 2, j / 2 - paramActivity.getHeight() / 2, localPaint);
        localView.destroyDrawingCache();
      }
      localView.destroyDrawingCache();
      return localBitmap;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    if (paramBitmap == null) {
      return null;
    }
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramFloat1, paramFloat2);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
  }
  
  public static bb a(Context paramContext)
  {
    if (b == null) {
      b = new bb();
    }
    c = paramContext;
    return b;
  }
  
  private ImageObject a(Drawable paramDrawable)
  {
    ImageObject localImageObject = new ImageObject();
    localImageObject.a(((BitmapDrawable)paramDrawable).getBitmap());
    return localImageObject;
  }
  
  private TextObject a(String paramString)
  {
    TextObject localTextObject = new TextObject();
    localTextObject.g = paramString;
    return localTextObject;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (paramContext != null) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
    }
  }
  
  private byte[] a(Bitmap paramBitmap, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = false;
    int i = localByteArrayOutputStream.toByteArray().length;
    localOptions.inSampleSize = ((int)Math.ceil(i / paramInt / 1024.0D));
    Bitmap localBitmap = paramBitmap;
    if (i > paramInt * 1024)
    {
      localBitmap = BitmapFactory.decodeByteArray(localByteArrayOutputStream.toByteArray(), 0, i, localOptions);
      paramBitmap.recycle();
    }
    localByteArrayOutputStream.reset();
    localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    i = 100;
    for (;;)
    {
      if ((localByteArrayOutputStream.toByteArray().length <= paramInt * 1024) || (i < 0))
      {
        localBitmap.recycle();
        return localByteArrayOutputStream.toByteArray();
      }
      localByteArrayOutputStream.reset();
      localBitmap.compress(Bitmap.CompressFormat.PNG, i, localByteArrayOutputStream);
      i -= 10;
    }
  }
  
  private String b(String paramString)
  {
    if (paramString == null) {
      return String.valueOf(System.currentTimeMillis());
    }
    return paramString + System.currentTimeMillis();
  }
  
  private void b()
  {
    this.d = WXAPIFactory.createWXAPI(c, WXEntryActivity.a, false);
    this.d.registerApp(WXEntryActivity.a);
  }
  
  private void c(String paramString, Drawable paramDrawable)
  {
    com.sina.weibo.sdk.api.h localh = new com.sina.weibo.sdk.api.h();
    if (!paramString.equals("")) {
      localh.a = a(paramString);
    }
    if (paramDrawable != null) {
      localh.a = a(paramDrawable);
    }
    paramString = new com.sina.weibo.sdk.api.a.g();
    paramString.a = String.valueOf(System.currentTimeMillis());
    paramString.b = localh;
    this.a.a(paramString);
  }
  
  public void a(String paramString1, Bitmap paramBitmap, String paramString2, String paramString3, boolean paramBoolean)
  {
    int i = 0;
    if (!a(c, "com.tencent.mm"))
    {
      Toast.makeText(c, "请先安装微信!", 0).show();
      return;
    }
    if (this.d == null) {
      b();
    }
    WXWebpageObject localWXWebpageObject = new WXWebpageObject();
    localWXWebpageObject.webpageUrl = paramString3;
    paramString3 = new WXMediaMessage(localWXWebpageObject);
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.thumbData = a(paramBitmap, 32);
    paramString1 = new SendMessageToWX.Req();
    paramString1.transaction = b("webpage");
    paramString1.message = paramString3;
    if (paramBoolean) {
      i = 1;
    }
    paramString1.scene = i;
    this.d.sendReq(paramString1);
  }
  
  public void a(String paramString1, Bitmap paramBitmap, String paramString2, boolean paramBoolean)
  {
    if (this.d == null) {
      b();
    }
    WXImageObject localWXImageObject = new WXImageObject(paramBitmap);
    paramString1 = new WXMediaMessage();
    paramString1.mediaObject = localWXImageObject;
    paramString1.thumbData = a(paramBitmap, 32);
    if (paramString2 != null) {
      paramString1.description = paramString2;
    }
    paramBitmap = new SendMessageToWX.Req();
    paramBitmap.transaction = b("img");
    paramBitmap.message = paramString1;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      paramBitmap.scene = i;
      this.d.sendReq(paramBitmap);
      return;
    }
  }
  
  public void a(String paramString, Bitmap paramBitmap, boolean paramBoolean)
  {
    a(paramString, paramBitmap, null, paramBoolean);
  }
  
  public void a(String paramString, Drawable paramDrawable)
  {
    this.a = com.sina.weibo.sdk.api.a.n.a(c, "961982984");
    if (this.a.a(true))
    {
      this.a.c();
      if (this.a.a())
      {
        if (this.a.b() < 10351) {
          break label70;
        }
        b(paramString, paramDrawable);
      }
    }
    return;
    label70:
    c(paramString, paramDrawable);
  }
  
  public void a(String paramString1, String paramString2, Bitmap paramBitmap)
  {
    n.a("", 20066);
    if ((c != null) && (paramBitmap != null))
    {
      if (!w.a().l())
      {
        Toast.makeText(c, "分享失败,请登录后再试!", 0).show();
        paramString1 = new Intent(c, LoginMainScreen.class);
        paramString1.addFlags(268435456);
        paramString1.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        c.startActivity(paramString1);
      }
    }
    else {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("shareType", "2");
    localBundle.putString("stockName", paramString1);
    localBundle.putString("stockCode", paramString2);
    paramString2 = a(paramBitmap, 0.4F, 0.4F);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = paramBitmap;
    }
    paramString2 = new ByteArrayOutputStream();
    paramString1.compress(Bitmap.CompressFormat.PNG, 100, paramString2);
    paramString1.recycle();
    paramBitmap.recycle();
    localBundle.putByteArray("message", paramString2.toByteArray());
    paramString1 = new Intent(c, ShareActivity.class);
    paramString1.addFlags(268435456);
    paramString1.putExtras(localBundle);
    c.startActivity(paramString1);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    n.a("", 20067);
    if (c != null)
    {
      if (!w.a().l())
      {
        Toast.makeText(c, "分享失败,请登录后再试!", 0).show();
        paramString1 = new Intent(c, LoginMainScreen.class);
        paramString1.addFlags(268435456);
        paramString1.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        c.startActivity(paramString1);
      }
    }
    else {
      return;
    }
    paramString3 = new Bundle();
    paramString3.putString("shareType", "1");
    paramString3.putString("text", paramString1);
    paramString3.putString("webpageUrl", paramString4);
    paramString3.putString("thumbData", paramString2);
    paramString1 = new Intent(c, ShareActivity.class);
    paramString1.addFlags(268435456);
    paramString1.putExtras(paramString3);
    c.startActivity(paramString1);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    n.a("", 20067);
    if (c != null)
    {
      if (!w.a().l())
      {
        Toast.makeText(c, "分享失败,请登录后再试!", 0).show();
        paramString1 = new Intent(c, LoginMainScreen.class);
        paramString1.addFlags(268435456);
        paramString1.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        c.startActivity(paramString1);
      }
    }
    else {
      return;
    }
    paramString3 = new ProgressMultipartEntity();
    ProgressMultipartEntity.enable();
    try
    {
      paramString3.addPart("token", new StringBody(o.a().b(), "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("version", new StringBody(com.android.dazhihui.g.a().r(), "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("shareType", new StringBody("1", "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("text", new StringBody(paramString1, "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("webpageUrl", new StringBody(paramString4, "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("content", new StringBody(paramString5, "text/plain", Charset.forName("UTF-8")));
      paramString3.addPart("thumbData", new StringBody(paramString2, "text/plain", Charset.forName("UTF-8")));
      new HttpPostAsyncTask(new bd(this), paramString3).execute(new String[] { com.android.dazhihui.a.f.S });
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    Log.i("weixin", "shareTxt=" + paramString1 + " icoUrl=" + paramString2 + " des=" + paramString3 + " url=" + paramString4 + " isfriend=" + paramBoolean);
    new bc(this, paramString2, paramString1, paramString3, paramString4, paramBoolean).execute(new String[0]);
  }
  
  public void b(String paramString, Drawable paramDrawable)
  {
    i locali = new i();
    if (!paramString.equals("")) {
      locali.a = a(paramString);
    }
    if (paramDrawable != null) {
      locali.b = a(paramDrawable);
    }
    paramString = new com.sina.weibo.sdk.api.a.h();
    paramString.a = String.valueOf(System.currentTimeMillis());
    paramString.b = locali;
    this.a.a(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */