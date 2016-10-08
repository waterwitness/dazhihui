package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sina.weibo.sdk.b.a;
import java.io.File;

public class ImageObject
  extends BaseMediaObject
{
  public static final Parcelable.Creator<ImageObject> CREATOR = new b();
  public byte[] g;
  public String h;
  
  public ImageObject() {}
  
  public ImageObject(Parcel paramParcel)
  {
    this.g = paramParcel.createByteArray();
    this.h = paramParcel.readString();
  }
  
  /* Error */
  public final void a(android.graphics.Bitmap paramBitmap)
  {
    // Byte code:
    //   0: new 45	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 46	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: astore_2
    //   10: aload_1
    //   11: getstatic 52	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   14: bipush 85
    //   16: aload_3
    //   17: invokevirtual 58	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   20: pop
    //   21: aload_3
    //   22: astore_2
    //   23: aload_0
    //   24: aload_3
    //   25: invokevirtual 61	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   28: putfield 31	com/sina/weibo/sdk/api/ImageObject:g	[B
    //   31: aload_3
    //   32: invokevirtual 64	java/io/ByteArrayOutputStream:close	()V
    //   35: return
    //   36: astore 4
    //   38: aconst_null
    //   39: astore_1
    //   40: aload_1
    //   41: astore_2
    //   42: aload 4
    //   44: invokevirtual 67	java/lang/Exception:printStackTrace	()V
    //   47: aload_1
    //   48: astore_2
    //   49: ldc 69
    //   51: ldc 71
    //   53: invokestatic 77	com/sina/weibo/sdk/b/a:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_1
    //   57: invokevirtual 64	java/io/ByteArrayOutputStream:close	()V
    //   60: return
    //   61: astore_1
    //   62: aload_1
    //   63: invokevirtual 78	java/io/IOException:printStackTrace	()V
    //   66: return
    //   67: astore_1
    //   68: aconst_null
    //   69: astore_2
    //   70: aload_2
    //   71: invokevirtual 64	java/io/ByteArrayOutputStream:close	()V
    //   74: aload_1
    //   75: athrow
    //   76: astore_2
    //   77: aload_2
    //   78: invokevirtual 78	java/io/IOException:printStackTrace	()V
    //   81: goto -7 -> 74
    //   84: astore_1
    //   85: aload_1
    //   86: invokevirtual 78	java/io/IOException:printStackTrace	()V
    //   89: return
    //   90: astore_1
    //   91: goto -21 -> 70
    //   94: astore 4
    //   96: aload_3
    //   97: astore_1
    //   98: goto -58 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	ImageObject
    //   0	101	1	paramBitmap	android.graphics.Bitmap
    //   9	62	2	localObject	Object
    //   76	2	2	localIOException	java.io.IOException
    //   7	90	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   36	7	4	localException1	Exception
    //   94	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	8	36	java/lang/Exception
    //   56	60	61	java/io/IOException
    //   0	8	67	finally
    //   70	74	76	java/io/IOException
    //   31	35	84	java/io/IOException
    //   10	21	90	finally
    //   23	31	90	finally
    //   42	47	90	finally
    //   49	56	90	finally
    //   10	21	94	java/lang/Exception
    //   23	31	94	java/lang/Exception
  }
  
  public boolean a()
  {
    if ((this.g == null) && (this.h == null))
    {
      a.b("Weibo.ImageObject", "imageData and imagePath are null");
      return false;
    }
    if ((this.g != null) && (this.g.length > 2097152))
    {
      a.b("Weibo.ImageObject", "imageData is too large");
      return false;
    }
    if ((this.h != null) && (this.h.length() > 512))
    {
      a.b("Weibo.ImageObject", "imagePath is too length");
      return false;
    }
    if (this.h != null)
    {
      File localFile = new File(this.h);
      try
      {
        if ((!localFile.exists()) || (localFile.length() == 0L) || (localFile.length() > 10485760L))
        {
          a.b("Weibo.ImageObject", "checkArgs fail, image content is too large or not exists");
          return false;
        }
      }
      catch (SecurityException localSecurityException)
      {
        a.b("Weibo.ImageObject", "checkArgs fail, image content is too large or not exists");
        return false;
      }
    }
    return true;
  }
  
  protected String b()
  {
    return "";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this.g);
    paramParcel.writeString(this.h);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\ImageObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */