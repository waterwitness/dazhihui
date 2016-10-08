import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class br
{
  public Context a;
  
  public br(Context paramContext)
  {
    this.a = paramContext;
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
  
  public final Camera.Size a(Camera paramCamera)
  {
    Object localObject1 = paramCamera.getParameters();
    paramCamera = ((Camera.Parameters)localObject1).getPreviewSize();
    localObject1 = ((Camera.Parameters)localObject1).getSupportedPreviewSizes();
    if (localObject1 == null) {
      return paramCamera;
    }
    localObject1 = new ArrayList((Collection)localObject1);
    Collections.sort((List)localObject1, new bs(this));
    Object localObject2 = new StringBuilder();
    Object localObject3 = ((List)localObject1).iterator();
    double d;
    if (!((Iterator)localObject3).hasNext())
    {
      Log.v("CameraSizeMatcher", "Supported preview resolutions: " + localObject2);
      localObject2 = bq.a(this.a).b();
      localObject3 = bq.a(this.a).a();
      Log.e("asos", "findBestPreviewResolution screen:width = " + (String)localObject2 + "height = " + (String)localObject3);
      d = bq.a(this.a).b() / bq.a(this.a).a();
      localObject2 = ((List)localObject1).iterator();
    }
    int i;
    label339:
    label349:
    int m;
    label358:
    label398:
    label405:
    label412:
    do
    {
      int j;
      for (;;)
      {
        if (!((Iterator)localObject2).hasNext())
        {
          if (((List)localObject1).isEmpty()) {
            return paramCamera;
          }
          return (Camera.Size)((List)localObject1).get(0);
          Camera.Size localSize = (Camera.Size)((Iterator)localObject3).next();
          ((StringBuilder)localObject2).append(localSize.width).append('x').append(localSize.height).append(' ');
          break;
        }
        localObject3 = (Camera.Size)((Iterator)localObject2).next();
        i = ((Camera.Size)localObject3).width;
        j = ((Camera.Size)localObject3).height;
        if (i * j >= 153600) {
          break label339;
        }
        ((Iterator)localObject2).remove();
      }
      int k;
      if (i < j)
      {
        k = 1;
        if (k == 0) {
          break label398;
        }
        m = j;
        if (k == 0) {
          break label405;
        }
      }
      for (;;)
      {
        if (Math.abs(m / i - d) <= 0.15D) {
          break label412;
        }
        ((Iterator)localObject2).remove();
        break;
        k = 0;
        break label349;
        m = i;
        break label358;
        i = j;
      }
    } while ((m != bq.a(this.a).b()) || (i != bq.a(this.a).a()));
    return (Camera.Size)localObject3;
    return paramCamera;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */