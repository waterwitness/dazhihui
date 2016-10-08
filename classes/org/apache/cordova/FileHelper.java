package org.apache.cordova;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

@Deprecated
public class FileHelper
{
  private static final String LOG_TAG = "FileUtils";
  private static final String _DATA = "_data";
  
  public static InputStream getInputStreamFromUriString(String paramString, CordovaInterface paramCordovaInterface)
  {
    if (paramString.startsWith("content"))
    {
      paramString = Uri.parse(paramString);
      return paramCordovaInterface.getActivity().getContentResolver().openInputStream(paramString);
    }
    if (paramString.startsWith("file://"))
    {
      int i = paramString.indexOf("?");
      String str = paramString;
      if (i > -1) {
        str = paramString.substring(0, i);
      }
      if (str.startsWith("file:///android_asset/"))
      {
        paramString = Uri.parse(str).getPath().substring(15);
        return paramCordovaInterface.getActivity().getAssets().open(paramString);
      }
      return new FileInputStream(getRealPath(str, paramCordovaInterface));
    }
    return new FileInputStream(getRealPath(paramString, paramCordovaInterface));
  }
  
  public static String getMimeType(String paramString, CordovaInterface paramCordovaInterface)
  {
    Uri localUri = Uri.parse(paramString);
    if (paramString.startsWith("content://")) {
      return paramCordovaInterface.getActivity().getContentResolver().getType(localUri);
    }
    return getMimeTypeForExtension(localUri.getPath());
  }
  
  public static String getMimeTypeForExtension(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    String str = paramString;
    if (i != -1) {
      str = paramString.substring(i + 1);
    }
    paramString = str.toLowerCase(Locale.getDefault());
    if (paramString.equals("3ga")) {
      return "audio/3gpp";
    }
    return MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
  }
  
  public static String getRealPath(Uri paramUri, CordovaInterface paramCordovaInterface)
  {
    return getRealPath(paramUri.toString(), paramCordovaInterface);
  }
  
  public static String getRealPath(String paramString, CordovaInterface paramCordovaInterface)
  {
    if (paramString.startsWith("content://"))
    {
      paramCordovaInterface = paramCordovaInterface.getActivity().managedQuery(Uri.parse(paramString), new String[] { "_data" }, null, null, null);
      int i = paramCordovaInterface.getColumnIndexOrThrow("_data");
      paramCordovaInterface.moveToFirst();
      paramCordovaInterface = paramCordovaInterface.getString(i);
      if (paramCordovaInterface == null) {
        LOG.e("FileUtils", "Could get real path for URI string %s", new Object[] { paramString });
      }
      return paramCordovaInterface;
    }
    if (paramString.startsWith("file://"))
    {
      paramCordovaInterface = paramString.substring(7);
      if (paramCordovaInterface.startsWith("/android_asset/"))
      {
        LOG.e("FileUtils", "Cannot get real path for URI string %s because it is a file:///android_asset/ URI.", new Object[] { paramString });
        return null;
      }
    }
    else
    {
      return paramString;
    }
    return paramCordovaInterface;
  }
  
  public static String stripFileProtocol(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("file://")) {
      str = paramString.substring(7);
    }
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\FileHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */