import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.thinkive.mobile.account.tools.EditPhotoView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.a.e.a.a;

public class bq
{
  private static bq a;
  private DisplayMetrics b = null;
  private Context c;
  
  private bq(Context paramContext)
  {
    this.c = paramContext;
    a = this;
  }
  
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int k = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    int i = 1;
    if ((k > paramInt2) || (j > paramInt1))
    {
      i = Math.round(k / paramInt2);
      paramInt1 = Math.round(j / paramInt1);
      if (i >= paramInt1) {}
    }
    else
    {
      return i;
    }
    return paramInt1;
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = a(localOptions, 500, 500);
    localOptions.inJustDecodeBounds = false;
    return BitmapFactory.decodeFile(paramString, localOptions);
  }
  
  public static Bitmap a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, (BitmapFactory.Options)localObject);
    ((BitmapFactory.Options)localObject).inSampleSize = a((BitmapFactory.Options)localObject, 500, 500);
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
    localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, (BitmapFactory.Options)localObject);
    paramArrayOfByte = (byte[])localObject;
    if (EditPhotoView.b == 1)
    {
      paramArrayOfByte = new Matrix();
      paramArrayOfByte.postScale(-1.0F, 1.0F);
      paramArrayOfByte = Bitmap.createBitmap((Bitmap)localObject, 0, 0, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight(), paramArrayOfByte, true);
    }
    return paramArrayOfByte;
  }
  
  public static bq a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    paramContext = new bq(paramContext);
    a = paramContext;
    return paramContext;
  }
  
  public static String a(Context paramContext, Uri paramUri)
  {
    try
    {
      if (paramUri.getScheme().equals("file")) {
        return paramUri.getPath();
      }
      paramContext = ((Activity)paramContext).managedQuery(paramUri, new String[] { "_data" }, null, null, null);
      int i = paramContext.getColumnIndexOrThrow("_data");
      paramContext.moveToFirst();
      paramContext = paramContext.getString(i);
      return paramContext;
    }
    catch (IllegalArgumentException paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static String a(Bitmap paramBitmap)
  {
    Object localObject2 = null;
    if (paramBitmap != null) {}
    for (;;)
    {
      try
      {
        localByteArrayOutputStream = new ByteArrayOutputStream();
        if (localByteArrayOutputStream == null) {}
      }
      finally
      {
        for (;;)
        {
          try
          {
            paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
            paramBitmap = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 2);
            if (localByteArrayOutputStream == null) {}
          }
          finally
          {
            ByteArrayOutputStream localByteArrayOutputStream;
            continue;
          }
          try
          {
            localByteArrayOutputStream.flush();
            localByteArrayOutputStream.close();
            return paramBitmap;
          }
          catch (IOException localIOException2)
          {
            localIOException2.printStackTrace();
            return paramBitmap;
          }
        }
        paramBitmap = finally;
        localByteArrayOutputStream = null;
      }
      try
      {
        localByteArrayOutputStream.flush();
        localByteArrayOutputStream.close();
        throw paramBitmap;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          localIOException1.printStackTrace();
        }
      }
      Object localObject1 = null;
      paramBitmap = (Bitmap)localObject2;
    }
  }
  
  public static String a(Bitmap paramBitmap, int paramInt, String... paramVarArgs)
  {
    int i = 100;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      try
      {
        paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
        Log.e("asos", String.format("当前图片大小为:%sKB图片最大阈值为%sKB", new Object[] { Integer.valueOf(localByteArrayOutputStream.toByteArray().length / 1024), paramInt + " " }));
        if (localByteArrayOutputStream.toByteArray().length <= paramInt * 1024)
        {
          Log.e("asos", "final quality == " + i);
          paramVarArgs = new File(paramVarArgs[0], paramVarArgs[1]);
          File localFile = paramVarArgs.getParentFile();
          if (!localFile.exists()) {
            localFile.mkdir();
          }
          if (!paramVarArgs.exists()) {
            paramVarArgs.createNewFile();
          }
          localByteArrayOutputStream.writeTo(new FileOutputStream(paramVarArgs));
          paramVarArgs = paramVarArgs.getAbsolutePath();
        }
      }
      catch (Exception paramVarArgs)
      {
        paramVarArgs = paramVarArgs;
        paramVarArgs.printStackTrace();
        try
        {
          localByteArrayOutputStream.flush();
          localByteArrayOutputStream.close();
          if (paramBitmap != null) {
            paramBitmap.recycle();
          }
        }
        catch (IOException paramBitmap)
        {
          paramBitmap.printStackTrace();
          continue;
        }
        return null;
      }
      finally {}
      try
      {
        localByteArrayOutputStream.flush();
        localByteArrayOutputStream.close();
        if (paramBitmap != null) {
          paramBitmap.recycle();
        }
        return paramVarArgs;
      }
      catch (IOException paramBitmap)
      {
        paramBitmap.printStackTrace();
        return paramVarArgs;
      }
      Log.e("asos", "达到阈值,触发质量压缩");
      i -= 10;
      localByteArrayOutputStream.reset();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, i, localByteArrayOutputStream);
      Log.e("asos", "质量压缩后:" + localByteArrayOutputStream.toByteArray().length / 1024 + "kb");
    }
    try
    {
      localByteArrayOutputStream.flush();
      localByteArrayOutputStream.close();
      if (paramBitmap != null) {
        paramBitmap.recycle();
      }
    }
    catch (IOException paramBitmap)
    {
      for (;;)
      {
        paramBitmap.printStackTrace();
      }
    }
    throw paramVarArgs;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    paramString1 = paramString1.getBytes();
    paramString2 = paramString2.getBytes();
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString1);
      ((MessageDigest)localObject).update(paramString2);
      ((MessageDigest)localObject).update("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".getBytes());
      paramString1 = ((MessageDigest)localObject).digest();
      paramString2 = new StringBuffer();
      int i = 0;
      for (;;)
      {
        if (i >= paramString1.length) {
          return paramString2.toString();
        }
        localObject = Integer.toHexString(paramString1[i] & 0xFF);
        if (((String)localObject).length() < 2) {
          paramString2.append("0");
        }
        paramString2.append((String)localObject);
        i += 1;
      }
      return "";
    }
    catch (Exception paramString1) {}
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return new String(a.a(paramArrayOfByte)).toString();
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.postOnAnimation(paramRunnable);
      return;
    }
    paramView.postDelayed(paramRunnable, 16L);
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar localCalendar1 = Calendar.getInstance();
    Calendar localCalendar2 = Calendar.getInstance();
    try
    {
      localCalendar1.setTime(localSimpleDateFormat.parse(paramString1));
      localCalendar2.setTime(localSimpleDateFormat.parse(paramString2));
      i = localCalendar1.compareTo(localCalendar2);
      if (i == 0)
      {
        Log.e("c1相等c2", "-------");
        return false;
      }
    }
    catch (ParseException paramString1)
    {
      int i;
      for (;;)
      {
        Log.e("比较日期出错", paramString1.getMessage());
      }
      if (i < 0)
      {
        Log.e("c1小于c2", "-------");
        return true;
      }
      Log.e("c1大于c2", "-------");
    }
    return false;
  }
  
  public static List<String> c()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = Environment.getExternalStorageState();
    File localFile1 = Environment.getExternalStorageDirectory();
    if ((((String)localObject1).endsWith("mounted")) && (localFile1.exists()) && (localFile1.isDirectory()) && (localFile1.canWrite())) {
      localArrayList.add(localFile1.getAbsolutePath());
    }
    for (;;)
    {
      try
      {
        localObject1 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("mount").getInputStream()));
        localObject2 = ((BufferedReader)localObject1).readLine();
        if (localObject2 != null) {
          continue;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject2;
        File localFile2;
        localIOException.printStackTrace();
        continue;
      }
      Log.i("dengchen", "DirectoryLoader.java...getPath()....path = " + (String)localArrayList.get(0));
      return localArrayList;
      if (((((String)localObject2).contains("fat")) || (((String)localObject2).contains("fuse")) || (((String)localObject2).contains("storage"))) && (!((String)localObject2).contains("secure")) && (!((String)localObject2).contains("asec")) && (!((String)localObject2).contains("firmware")) && (!((String)localObject2).contains("shell")) && (!((String)localObject2).contains("obb")) && (!((String)localObject2).contains("legacy")) && (!((String)localObject2).contains("data")))
      {
        localObject2 = ((String)localObject2).split(" ");
        if (1 < localObject2.length)
        {
          localObject2 = localObject2[1];
          if ((((String)localObject2).contains("/")) && (!((String)localObject2).contains("data")) && (!((String)localObject2).contains("Data")))
          {
            localFile2 = new File((String)localObject2);
            if ((localFile2.exists()) && (localFile2.isDirectory()) && (localFile2.canWrite()) && (!((String)localObject2).equals(localFile1.getAbsolutePath()))) {
              localArrayList.add(localObject2);
            }
          }
        }
      }
    }
  }
  
  public final int a()
  {
    if (this.b == null) {
      this.b = this.c.getApplicationContext().getResources().getDisplayMetrics();
    }
    return this.b.heightPixels;
  }
  
  public final int b()
  {
    if (this.b == null) {
      this.b = this.c.getApplicationContext().getResources().getDisplayMetrics();
    }
    return this.b.widthPixels;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */