package com.kwl.common.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;

public class URIUtils
{
  public static String getDataColumn(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    Object localObject = null;
    try
    {
      paramUri = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, paramString, paramArrayOfString, null);
      if (paramUri == null) {
        break label80;
      }
      if (paramUri == null) {
        break label78;
      }
    }
    finally
    {
      try
      {
        if (!paramUri.moveToFirst()) {
          break label80;
        }
        paramContext = paramUri.getString(paramUri.getColumnIndexOrThrow("_data"));
        if (paramUri != null) {
          paramUri.close();
        }
        return paramContext;
      }
      finally
      {
        for (;;) {}
      }
      paramContext = finally;
      paramUri = (Uri)localObject;
    }
    paramUri.close();
    label78:
    throw paramContext;
    label80:
    if (paramUri != null) {
      paramUri.close();
    }
    return null;
  }
  
  @TargetApi(19)
  public static String getImageAbsolutePath(Activity paramActivity, Uri paramUri)
  {
    Object localObject = null;
    if ((paramActivity == null) || (paramUri == null)) {}
    label208:
    do
    {
      do
      {
        do
        {
          return null;
          if ((Build.VERSION.SDK_INT < 19) || (!DocumentsContract.isDocumentUri(paramActivity, paramUri))) {
            break label208;
          }
          if (!isExternalStorageDocument(paramUri)) {
            break;
          }
          paramActivity = DocumentsContract.getDocumentId(paramUri).split(":");
        } while (!"primary".equalsIgnoreCase(paramActivity[0]));
        return Environment.getExternalStorageDirectory() + "/" + paramActivity[1];
        if (isDownloadsDocument(paramUri))
        {
          paramUri = DocumentsContract.getDocumentId(paramUri);
          return getDataColumn(paramActivity, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(paramUri).longValue()), null, null);
        }
      } while (!isMediaDocument(paramUri));
      String[] arrayOfString = DocumentsContract.getDocumentId(paramUri).split(":");
      String str = arrayOfString[0];
      if ("image".equals(str)) {
        paramUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
      }
      for (;;)
      {
        return getDataColumn(paramActivity, paramUri, "_id=?", new String[] { arrayOfString[1] });
        if ("video".equals(str))
        {
          paramUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        else
        {
          paramUri = (Uri)localObject;
          if ("audio".equals(str)) {
            paramUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
          }
        }
      }
      if ("content".equalsIgnoreCase(paramUri.getScheme()))
      {
        if (isGooglePhotosUri(paramUri)) {
          return paramUri.getLastPathSegment();
        }
        return getDataColumn(paramActivity, paramUri, null, null);
      }
    } while (!"file".equalsIgnoreCase(paramUri.getScheme()));
    return paramUri.getPath();
  }
  
  public static boolean isDownloadsDocument(Uri paramUri)
  {
    return "com.android.providers.downloads.documents".equals(paramUri.getAuthority());
  }
  
  public static boolean isExternalStorageDocument(Uri paramUri)
  {
    return "com.android.externalstorage.documents".equals(paramUri.getAuthority());
  }
  
  public static boolean isGooglePhotosUri(Uri paramUri)
  {
    return "com.google.android.apps.photos.content".equals(paramUri.getAuthority());
  }
  
  public static boolean isMediaDocument(Uri paramUri)
  {
    return "com.android.providers.media.documents".equals(paramUri.getAuthority());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\URIUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */