package org.vudroid.a.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public class a
{
  public static String a(ContentResolver paramContentResolver, Uri paramUri)
  {
    if (paramUri.getScheme().equals("file")) {
      return paramUri.getPath();
    }
    paramContentResolver = paramContentResolver.query(paramUri, new String[] { "_data" }, null, null, null);
    if (paramContentResolver.moveToFirst()) {
      return paramContentResolver.getString(0);
    }
    throw new RuntimeException("Can't retrieve path from uri: " + paramUri.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\vudroid\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */