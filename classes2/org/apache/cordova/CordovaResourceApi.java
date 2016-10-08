package org.apache.cordova;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.squareup.okhttp.OkHttpClient;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Locale;
import org.apache.http.util.EncodingUtils;

public class CordovaResourceApi
{
  private static final String[] LOCAL_FILE_PROJECTION = { "_data" };
  private static final String LOG_TAG = "CordovaResourceApi";
  public static final int URI_TYPE_ASSET = 1;
  public static final int URI_TYPE_CONTENT = 2;
  public static final int URI_TYPE_DATA = 4;
  public static final int URI_TYPE_FILE = 0;
  public static final int URI_TYPE_HTTP = 5;
  public static final int URI_TYPE_HTTPS = 6;
  public static final int URI_TYPE_RESOURCE = 3;
  public static final int URI_TYPE_UNKNOWN = -1;
  private static OkHttpClient httpClient = new OkHttpClient();
  static Thread jsThread;
  private final AssetManager assetManager;
  private final ContentResolver contentResolver;
  private final PluginManager pluginManager;
  private boolean threadCheckingEnabled = true;
  
  public CordovaResourceApi(Context paramContext, PluginManager paramPluginManager)
  {
    this.contentResolver = paramContext.getContentResolver();
    this.assetManager = paramContext.getAssets();
    this.pluginManager = paramPluginManager;
  }
  
  private void assertBackgroundThread()
  {
    if (this.threadCheckingEnabled)
    {
      Thread localThread = Thread.currentThread();
      if (localThread == Looper.getMainLooper().getThread()) {
        throw new IllegalStateException("Do not perform IO operations on the UI thread. Use CordovaInterface.getThreadPool() instead.");
      }
      if (localThread == jsThread) {
        throw new IllegalStateException("Tried to perform an IO operation on the WebCore thread. Use CordovaInterface.getThreadPool() instead.");
      }
    }
  }
  
  private static void assertNonRelative(Uri paramUri)
  {
    if (!paramUri.isAbsolute()) {
      throw new IllegalArgumentException("Relative URIs are not supported.");
    }
  }
  
  private String getDataUriMimeType(Uri paramUri)
  {
    paramUri = paramUri.getSchemeSpecificPart();
    int i = paramUri.indexOf(',');
    if (i == -1) {}
    do
    {
      return null;
      paramUri = paramUri.substring(0, i).split(";");
    } while (paramUri.length <= 0);
    return paramUri[0];
  }
  
  private String getMimeTypeFromPath(String paramString)
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
    if (paramString.equals("js")) {
      return "text/javascript";
    }
    return MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
  }
  
  public static int getUriType(Uri paramUri)
  {
    assertNonRelative(paramUri);
    String str = paramUri.getScheme();
    if ("content".equals(str)) {
      return 2;
    }
    if ("android.resource".equals(str)) {
      return 3;
    }
    if ("file".equals(str))
    {
      if (paramUri.getPath().startsWith("/android_asset/")) {
        return 1;
      }
      return 0;
    }
    if ("data".equals(str)) {
      return 4;
    }
    if ("http".equals(str)) {
      return 5;
    }
    if ("https".equals(str)) {
      return 6;
    }
    return -1;
  }
  
  private CordovaResourceApi.OpenForReadResult readDataUri(Uri paramUri)
  {
    Object localObject = paramUri.getSchemeSpecificPart();
    int k = ((String)localObject).indexOf(',');
    if (k == -1) {
      return null;
    }
    String[] arrayOfString = ((String)localObject).substring(0, k).split(";");
    if (arrayOfString.length > 0) {}
    for (String str = arrayOfString[0];; str = null)
    {
      int i = 1;
      int j = 0;
      if (i >= arrayOfString.length)
      {
        localObject = ((String)localObject).substring(k + 1);
        if (j == 0) {
          break label127;
        }
      }
      label127:
      for (localObject = Base64.decode((String)localObject, 0);; localObject = EncodingUtils.getBytes((String)localObject, "UTF-8"))
      {
        return new CordovaResourceApi.OpenForReadResult(paramUri, new ByteArrayInputStream((byte[])localObject), str, localObject.length, null);
        if ("base64".equalsIgnoreCase(arrayOfString[i])) {
          j = 1;
        }
        i += 1;
        break;
      }
    }
  }
  
  public void copyResource(Uri paramUri1, Uri paramUri2)
  {
    copyResource(openForRead(paramUri1), openOutputStream(paramUri2));
  }
  
  public void copyResource(Uri paramUri, OutputStream paramOutputStream)
  {
    copyResource(openForRead(paramUri), paramOutputStream);
  }
  
  /* Error */
  public void copyResource(CordovaResourceApi.OpenForReadResult paramOpenForReadResult, OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 248	org/apache/cordova/CordovaResourceApi:assertBackgroundThread	()V
    //   4: aload_1
    //   5: getfield 252	org/apache/cordova/CordovaResourceApi$OpenForReadResult:inputStream	Ljava/io/InputStream;
    //   8: astore_3
    //   9: aload_3
    //   10: instanceof 254
    //   13: ifeq +82 -> 95
    //   16: aload_2
    //   17: instanceof 256
    //   20: ifeq +75 -> 95
    //   23: aload_1
    //   24: getfield 252	org/apache/cordova/CordovaResourceApi$OpenForReadResult:inputStream	Ljava/io/InputStream;
    //   27: checkcast 254	java/io/FileInputStream
    //   30: invokevirtual 260	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   33: astore_3
    //   34: aload_2
    //   35: checkcast 256	java/io/FileOutputStream
    //   38: invokevirtual 261	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   41: astore 4
    //   43: lconst_0
    //   44: lstore 6
    //   46: aload_1
    //   47: getfield 265	org/apache/cordova/CordovaResourceApi$OpenForReadResult:length	J
    //   50: lstore 8
    //   52: aload_1
    //   53: getfield 269	org/apache/cordova/CordovaResourceApi$OpenForReadResult:assetFd	Landroid/content/res/AssetFileDescriptor;
    //   56: ifnull +12 -> 68
    //   59: aload_1
    //   60: getfield 269	org/apache/cordova/CordovaResourceApi$OpenForReadResult:assetFd	Landroid/content/res/AssetFileDescriptor;
    //   63: invokevirtual 275	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   66: lstore 6
    //   68: aload 4
    //   70: aload_3
    //   71: lload 6
    //   73: lload 8
    //   75: invokevirtual 281	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   78: pop2
    //   79: aload_1
    //   80: getfield 252	org/apache/cordova/CordovaResourceApi$OpenForReadResult:inputStream	Ljava/io/InputStream;
    //   83: invokevirtual 286	java/io/InputStream:close	()V
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 289	java/io/OutputStream:close	()V
    //   94: return
    //   95: sipush 8192
    //   98: newarray <illegal type>
    //   100: astore 4
    //   102: aload_3
    //   103: aload 4
    //   105: iconst_0
    //   106: sipush 8192
    //   109: invokevirtual 293	java/io/InputStream:read	([BII)I
    //   112: istore 5
    //   114: iload 5
    //   116: ifle -37 -> 79
    //   119: aload_2
    //   120: aload 4
    //   122: iconst_0
    //   123: iload 5
    //   125: invokevirtual 297	java/io/OutputStream:write	([BII)V
    //   128: goto -26 -> 102
    //   131: astore_3
    //   132: aload_1
    //   133: getfield 252	org/apache/cordova/CordovaResourceApi$OpenForReadResult:inputStream	Ljava/io/InputStream;
    //   136: invokevirtual 286	java/io/InputStream:close	()V
    //   139: aload_2
    //   140: ifnull +7 -> 147
    //   143: aload_2
    //   144: invokevirtual 289	java/io/OutputStream:close	()V
    //   147: aload_3
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	CordovaResourceApi
    //   0	149	1	paramOpenForReadResult	CordovaResourceApi.OpenForReadResult
    //   0	149	2	paramOutputStream	OutputStream
    //   8	95	3	localObject1	Object
    //   131	17	3	localObject2	Object
    //   41	80	4	localObject3	Object
    //   112	12	5	i	int
    //   44	28	6	l1	long
    //   50	24	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   4	43	131	finally
    //   46	52	131	finally
    //   52	68	131	finally
    //   68	79	131	finally
    //   95	102	131	finally
    //   102	114	131	finally
    //   119	128	131	finally
  }
  
  public HttpURLConnection createHttpConnection(Uri paramUri)
  {
    assertBackgroundThread();
    return httpClient.open(new URL(paramUri.toString()));
  }
  
  public String getMimeType(Uri paramUri)
  {
    switch (getUriType(paramUri))
    {
    }
    for (;;)
    {
      return null;
      return getMimeTypeFromPath(paramUri.getPath());
      return this.contentResolver.getType(paramUri);
      return getDataUriMimeType(paramUri);
      try
      {
        paramUri = httpClient.open(new URL(paramUri.toString()));
        paramUri.setDoInput(false);
        paramUri.setRequestMethod("HEAD");
        paramUri = paramUri.getHeaderField("Content-Type");
        return paramUri;
      }
      catch (IOException paramUri) {}
    }
  }
  
  public boolean isThreadCheckingEnabled()
  {
    return this.threadCheckingEnabled;
  }
  
  public File mapUriToFile(Uri paramUri)
  {
    assertBackgroundThread();
    switch (getUriType(paramUri))
    {
    }
    do
    {
      return null;
      return new File(paramUri.getPath());
      paramUri = this.contentResolver.query(paramUri, LOCAL_FILE_PROJECTION, null, null, null);
    } while (paramUri == null);
    try
    {
      int i = paramUri.getColumnIndex(LOCAL_FILE_PROJECTION[0]);
      if ((i != -1) && (paramUri.getCount() > 0))
      {
        paramUri.moveToFirst();
        Object localObject1 = paramUri.getString(i);
        if (localObject1 != null)
        {
          localObject1 = new File((String)localObject1);
          return (File)localObject1;
        }
      }
    }
    finally
    {
      paramUri.close();
    }
    paramUri.close();
    return null;
  }
  
  public CordovaResourceApi.OpenForReadResult openForRead(Uri paramUri)
  {
    return openForRead(paramUri, false);
  }
  
  public CordovaResourceApi.OpenForReadResult openForRead(Uri paramUri, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (!paramBoolean) {
      assertBackgroundThread();
    }
    switch (getUriType(paramUri))
    {
    default: 
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
      for (;;)
      {
        throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + paramUri);
        localObject1 = new FileInputStream(paramUri.getPath());
        localObject1 = new CordovaResourceApi.OpenForReadResult(paramUri, (InputStream)localObject1, getMimeTypeFromPath(paramUri.getPath()), ((FileInputStream)localObject1).getChannel().size(), null);
        do
        {
          return (CordovaResourceApi.OpenForReadResult)localObject1;
          String str = paramUri.getPath().substring(15);
          long l1 = -1L;
          try
          {
            localObject2 = this.assetManager.openFd(str);
            localObject1 = localObject2;
            FileInputStream localFileInputStream = ((AssetFileDescriptor)localObject2).createInputStream();
            localObject1 = localObject2;
            long l2 = ((AssetFileDescriptor)localObject2).getLength();
            l1 = l2;
            localObject1 = localObject2;
            localObject2 = localFileInputStream;
          }
          catch (FileNotFoundException localFileNotFoundException)
          {
            for (;;)
            {
              Object localObject2;
              localObject3 = this.assetManager.open(str);
            }
          }
          return new CordovaResourceApi.OpenForReadResult(paramUri, (InputStream)localObject2, getMimeTypeFromPath(str), l1, (AssetFileDescriptor)localObject1);
          localObject1 = this.contentResolver.getType(paramUri);
          localObject3 = this.contentResolver.openAssetFileDescriptor(paramUri, "r");
          return new CordovaResourceApi.OpenForReadResult(paramUri, ((AssetFileDescriptor)localObject3).createInputStream(), (String)localObject1, ((AssetFileDescriptor)localObject3).getLength(), (AssetFileDescriptor)localObject3);
          localObject3 = readDataUri(paramUri);
          localObject1 = localObject3;
        } while (localObject3 != null);
      }
    }
    localObject1 = httpClient.open(new URL(paramUri.toString()));
    ((HttpURLConnection)localObject1).setDoInput(true);
    Object localObject3 = ((HttpURLConnection)localObject1).getHeaderField("Content-Type");
    int i = ((HttpURLConnection)localObject1).getContentLength();
    return new CordovaResourceApi.OpenForReadResult(paramUri, ((HttpURLConnection)localObject1).getInputStream(), (String)localObject3, i, null);
  }
  
  public OutputStream openOutputStream(Uri paramUri)
  {
    return openOutputStream(paramUri, false);
  }
  
  public OutputStream openOutputStream(Uri paramUri, boolean paramBoolean)
  {
    assertBackgroundThread();
    switch (getUriType(paramUri))
    {
    case 1: 
    default: 
      throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + paramUri);
    case 0: 
      paramUri = new File(paramUri.getPath());
      localObject = paramUri.getParentFile();
      if (localObject != null) {
        ((File)localObject).mkdirs();
      }
      return new FileOutputStream(paramUri, paramBoolean);
    }
    ContentResolver localContentResolver = this.contentResolver;
    if (paramBoolean) {}
    for (Object localObject = "wa";; localObject = "w") {
      return localContentResolver.openAssetFileDescriptor(paramUri, (String)localObject).createOutputStream();
    }
  }
  
  public String remapPath(String paramString)
  {
    return remapUri(Uri.fromFile(new File(paramString))).getPath();
  }
  
  public Uri remapUri(Uri paramUri)
  {
    assertNonRelative(paramUri);
    Uri localUri = this.pluginManager.remapUri(paramUri);
    if (localUri != null) {
      paramUri = localUri;
    }
    return paramUri;
  }
  
  public void setThreadCheckingEnabled(boolean paramBoolean)
  {
    this.threadCheckingEnabled = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaResourceApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */