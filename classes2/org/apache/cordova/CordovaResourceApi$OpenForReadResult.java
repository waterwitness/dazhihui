package org.apache.cordova;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

public final class CordovaResourceApi$OpenForReadResult
{
  public final AssetFileDescriptor assetFd;
  public final InputStream inputStream;
  public final long length;
  public final String mimeType;
  public final Uri uri;
  
  CordovaResourceApi$OpenForReadResult(Uri paramUri, InputStream paramInputStream, String paramString, long paramLong, AssetFileDescriptor paramAssetFileDescriptor)
  {
    this.uri = paramUri;
    this.inputStream = paramInputStream;
    this.mimeType = paramString;
    this.length = paramLong;
    this.assetFd = paramAssetFileDescriptor;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaResourceApi$OpenForReadResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */