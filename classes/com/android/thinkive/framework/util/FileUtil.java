package com.android.thinkive.framework.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

public class FileUtil
{
  private static final long FILE_COPY_BUFFER_SIZE = 31457280L;
  public static final long ONE_KB = 1024L;
  public static final long ONE_MB = 1048576L;
  
  private static String addTrailingSlash(String paramString)
  {
    String str = paramString;
    if (paramString.charAt(paramString.length() - 1) != '/') {
      str = paramString + "/";
    }
    return str;
  }
  
  private static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static void copyAssetFile(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getAssets().open(paramString1);
    paramString1 = new FileOutputStream(paramString2);
    paramString2 = new byte['Ѐ'];
    for (;;)
    {
      int i = paramContext.read(paramString2);
      if (i <= 0)
      {
        paramContext.close();
        paramString1.close();
        return;
      }
      paramString1.write(paramString2, 0, i);
    }
  }
  
  public static void copyAssetsFolder(Context paramContext, String paramString1, String paramString2)
  {
    createDir(new File(paramString2));
    AssetManager localAssetManager = paramContext.getAssets();
    String[] arrayOfString = localAssetManager.list(paramString1);
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    label32:
    String str;
    if (i < arrayOfString.length)
    {
      str = addTrailingSlash(paramString1) + arrayOfString[i];
      if (localAssetManager.list(str).length != 0) {
        break label117;
      }
      copyAssetFile(paramContext, str, addTrailingSlash(paramString2) + arrayOfString[i]);
    }
    for (;;)
    {
      i += 1;
      break label32;
      break;
      label117:
      copyAssetsFolder(paramContext, str, addTrailingSlash(paramString2) + arrayOfString[i]);
    }
  }
  
  public static void copyDirectory(File paramFile1, File paramFile2, FileFilter paramFileFilter, boolean paramBoolean)
  {
    if (paramFile1 == null) {
      throw new NullPointerException("Source must not be null");
    }
    if (paramFile2 == null) {
      throw new NullPointerException("Destination must not be null");
    }
    if (!paramFile1.exists()) {
      throw new FileNotFoundException("Source '" + paramFile1 + "' does not exist");
    }
    if (!paramFile1.isDirectory()) {
      throw new IOException("Source '" + paramFile1 + "' exists but is not a directory");
    }
    if (paramFile1.getCanonicalPath().equals(paramFile2.getCanonicalPath())) {
      throw new IOException("Source '" + paramFile1 + "' and destination '" + paramFile2 + "' are the same");
    }
    Object localObject2 = null;
    Object localObject1 = localObject2;
    File[] arrayOfFile;
    int j;
    int i;
    if (paramFile2.getCanonicalPath().startsWith(paramFile1.getCanonicalPath()))
    {
      if (paramFileFilter != null) {
        break label239;
      }
      arrayOfFile = paramFile1.listFiles();
      localObject1 = localObject2;
      if (arrayOfFile != null)
      {
        localObject1 = localObject2;
        if (arrayOfFile.length > 0)
        {
          localObject1 = new ArrayList(arrayOfFile.length);
          j = arrayOfFile.length;
          i = 0;
        }
      }
    }
    for (;;)
    {
      if (i >= j)
      {
        doCopyDirectory(paramFile1, paramFile2, paramFileFilter, paramBoolean, (List)localObject1);
        return;
        label239:
        arrayOfFile = paramFile1.listFiles(paramFileFilter);
        break;
      }
      ((List)localObject1).add(new File(paramFile2, arrayOfFile[i].getName()).getCanonicalPath());
      i += 1;
    }
  }
  
  public static void copyDirectory(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    copyDirectory(paramFile1, paramFile2, null, paramBoolean);
  }
  
  public static void copyDirectoryToDirectory(File paramFile1, File paramFile2)
  {
    if (paramFile1 == null) {
      throw new NullPointerException("Source must not be null");
    }
    if ((paramFile1.exists()) && (!paramFile1.isDirectory())) {
      throw new IllegalArgumentException("Source '" + paramFile2 + "' is not a directory");
    }
    if (paramFile2 == null) {
      throw new NullPointerException("Destination must not be null");
    }
    if ((paramFile2.exists()) && (!paramFile2.isDirectory())) {
      throw new IllegalArgumentException("Destination '" + paramFile2 + "' is not a directory");
    }
    copyDirectory(paramFile1, new File(paramFile2, paramFile1.getName()), true);
  }
  
  public static boolean copyFile(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new FileInputStream(paramString1);
      return writeFile(paramString2, paramString1);
    }
    catch (FileNotFoundException paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
        paramString1 = null;
      }
    }
  }
  
  private static void createDir(File paramFile)
  {
    if (paramFile == null) {
      throw new IOException("dir is null");
    }
    if (paramFile.exists())
    {
      if (!paramFile.isDirectory()) {
        throw new IOException("Can't create directory, a file is in the way");
      }
    }
    else
    {
      paramFile.mkdirs();
      if (!paramFile.isDirectory()) {
        throw new IOException("Unable to create directory");
      }
    }
  }
  
  public static boolean deleteFile(File paramFile)
  {
    int i = 0;
    if (!paramFile.exists()) {
      return false;
    }
    if (paramFile.isFile())
    {
      paramFile.delete();
      return true;
    }
    File[] arrayOfFile;
    int j;
    if (paramFile.isDirectory())
    {
      arrayOfFile = paramFile.listFiles();
      if ((arrayOfFile == null) || (arrayOfFile.length == 0))
      {
        paramFile.delete();
        return true;
      }
      j = arrayOfFile.length;
    }
    for (;;)
    {
      if (i >= j)
      {
        paramFile.delete();
        return true;
      }
      deleteFile(arrayOfFile[i]);
      i += 1;
    }
  }
  
  private static void doCopyDirectory(File paramFile1, File paramFile2, FileFilter paramFileFilter, boolean paramBoolean, List<String> paramList)
  {
    if (paramFileFilter == null) {}
    for (File[] arrayOfFile = paramFile1.listFiles(); arrayOfFile == null; arrayOfFile = paramFile1.listFiles(paramFileFilter)) {
      throw new IOException("Failed to list contents of " + paramFile1);
    }
    if (paramFile2.exists())
    {
      if (!paramFile2.isDirectory()) {
        throw new IOException("Destination '" + paramFile2 + "' exists but is not a directory");
      }
    }
    else if ((!paramFile2.mkdirs()) && (!paramFile2.isDirectory())) {
      throw new IOException("Destination '" + paramFile2 + "' directory cannot be created");
    }
    if (!paramFile2.canWrite()) {
      throw new IOException("Destination '" + paramFile2 + "' cannot be written to");
    }
    int j = arrayOfFile.length;
    int i = 0;
    if (i >= j)
    {
      if (paramBoolean) {
        paramFile2.setLastModified(paramFile1.lastModified());
      }
      return;
    }
    File localFile1 = arrayOfFile[i];
    File localFile2 = new File(paramFile2, localFile1.getName());
    if ((paramList == null) || (!paramList.contains(localFile1.getCanonicalPath())))
    {
      if (!localFile1.isDirectory()) {
        break label270;
      }
      doCopyDirectory(localFile1, localFile2, paramFileFilter, paramBoolean, paramList);
    }
    for (;;)
    {
      i += 1;
      break;
      label270:
      doCopyFile(localFile1, localFile2, paramBoolean);
    }
  }
  
  /* Error */
  private static void doCopyFile(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload_1
    //   4: invokevirtual 121	java/io/File:exists	()Z
    //   7: ifeq +39 -> 46
    //   10: aload_1
    //   11: invokevirtual 134	java/io/File:isDirectory	()Z
    //   14: ifeq +32 -> 46
    //   17: new 54	java/io/IOException
    //   20: dup
    //   21: new 33	java/lang/StringBuilder
    //   24: dup
    //   25: ldc -65
    //   27: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: ldc -5
    //   36: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokespecial 137	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   45: athrow
    //   46: new 197	java/io/FileInputStream
    //   49: dup
    //   50: aload_0
    //   51: invokespecial 253	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   54: astore_3
    //   55: new 75	java/io/FileOutputStream
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 254	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   63: astore 4
    //   65: aload_3
    //   66: invokevirtual 258	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   69: astore 5
    //   71: aload 4
    //   73: invokevirtual 259	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   76: astore 7
    //   78: aload 5
    //   80: invokevirtual 264	java/nio/channels/FileChannel:size	()J
    //   83: lstore 12
    //   85: lconst_0
    //   86: lstore 8
    //   88: lload 8
    //   90: lload 12
    //   92: lcmp
    //   93: iflt +75 -> 168
    //   96: aload 7
    //   98: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   101: aload 4
    //   103: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   106: aload 5
    //   108: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   111: aload_3
    //   112: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   115: aload_0
    //   116: invokevirtual 268	java/io/File:length	()J
    //   119: aload_1
    //   120: invokevirtual 268	java/io/File:length	()J
    //   123: lcmp
    //   124: ifeq +126 -> 250
    //   127: new 54	java/io/IOException
    //   130: dup
    //   131: new 33	java/lang/StringBuilder
    //   134: dup
    //   135: ldc_w 270
    //   138: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: aload_0
    //   142: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   145: ldc_w 272
    //   148: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload_1
    //   152: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   155: ldc_w 274
    //   158: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokespecial 137	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   167: athrow
    //   168: lload 12
    //   170: lload 8
    //   172: lsub
    //   173: ldc2_w 7
    //   176: lcmp
    //   177: ifle +31 -> 208
    //   180: ldc2_w 7
    //   183: lstore 10
    //   185: aload 7
    //   187: aload 5
    //   189: lload 8
    //   191: lload 10
    //   193: invokevirtual 278	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   196: lstore 10
    //   198: lload 8
    //   200: lload 10
    //   202: ladd
    //   203: lstore 8
    //   205: goto -117 -> 88
    //   208: lload 12
    //   210: lload 8
    //   212: lsub
    //   213: lstore 10
    //   215: goto -30 -> 185
    //   218: astore_0
    //   219: aconst_null
    //   220: astore_1
    //   221: aconst_null
    //   222: astore_3
    //   223: aconst_null
    //   224: astore 4
    //   226: aload 7
    //   228: astore 5
    //   230: aload_1
    //   231: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   234: aload_3
    //   235: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   238: aload 5
    //   240: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   243: aload 4
    //   245: invokestatic 266	com/android/thinkive/framework/util/FileUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   248: aload_0
    //   249: athrow
    //   250: iload_2
    //   251: ifeq +12 -> 263
    //   254: aload_1
    //   255: aload_0
    //   256: invokevirtual 237	java/io/File:lastModified	()J
    //   259: invokevirtual 241	java/io/File:setLastModified	(J)Z
    //   262: pop
    //   263: return
    //   264: astore_0
    //   265: aconst_null
    //   266: astore_1
    //   267: aconst_null
    //   268: astore 6
    //   270: aload_3
    //   271: astore 4
    //   273: aload 7
    //   275: astore 5
    //   277: aload 6
    //   279: astore_3
    //   280: goto -50 -> 230
    //   283: astore_0
    //   284: aconst_null
    //   285: astore_1
    //   286: aload_3
    //   287: astore 6
    //   289: aload 7
    //   291: astore 5
    //   293: aload 4
    //   295: astore_3
    //   296: aload 6
    //   298: astore 4
    //   300: goto -70 -> 230
    //   303: astore_0
    //   304: aload_3
    //   305: astore 6
    //   307: aconst_null
    //   308: astore_1
    //   309: aload 4
    //   311: astore_3
    //   312: aload 6
    //   314: astore 4
    //   316: goto -86 -> 230
    //   319: astore_0
    //   320: aload_3
    //   321: astore 6
    //   323: aload 7
    //   325: astore_1
    //   326: aload 4
    //   328: astore_3
    //   329: aload 6
    //   331: astore 4
    //   333: goto -103 -> 230
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	paramFile1	File
    //   0	336	1	paramFile2	File
    //   0	336	2	paramBoolean	boolean
    //   54	275	3	localObject1	Object
    //   63	269	4	localObject2	Object
    //   69	223	5	localFileChannel1	java.nio.channels.FileChannel
    //   268	62	6	localObject3	Object
    //   1	323	7	localFileChannel2	java.nio.channels.FileChannel
    //   86	125	8	l1	long
    //   183	31	10	l2	long
    //   83	126	12	l3	long
    // Exception table:
    //   from	to	target	type
    //   46	55	218	finally
    //   55	65	264	finally
    //   65	71	283	finally
    //   71	78	303	finally
    //   78	85	319	finally
    //   185	198	319	finally
  }
  
  public static String getFileExtension(String paramString)
  {
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() > 0)
      {
        int i = paramString.lastIndexOf('.');
        str = paramString;
        if (i > -1)
        {
          str = paramString;
          if (i < paramString.length() - 1) {
            str = paramString.substring(i + 1);
          }
        }
      }
    }
    return str;
  }
  
  public static String getFileName(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    int i;
    do
    {
      return paramString;
      i = paramString.lastIndexOf(File.separator);
    } while (i == -1);
    return paramString.substring(i + 1);
  }
  
  public static String getFileNameByUrl(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    int j = paramString.lastIndexOf('?');
    int k = paramString.lastIndexOf("/");
    if ((j > 0) && (k >= j)) {
      return UUID.randomUUID().toString();
    }
    int i = j;
    if (j < 0) {
      i = paramString.length();
    }
    return paramString.substring(k + 1, i);
  }
  
  public static long getFileSize(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return -1L;
      paramString = new File(paramString);
    } while ((!paramString.exists()) || (!paramString.isFile()));
    return paramString.length();
  }
  
  public static String getFolderName(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    int i = paramString.lastIndexOf(File.separator);
    if (i == -1) {}
    for (paramString = "";; paramString = paramString.substring(0, i)) {
      return paramString;
    }
  }
  
  private static File getRealFileName(String paramString1, String paramString2)
  {
    String[] arrayOfString = paramString2.split("/");
    paramString1 = new File(paramString1);
    paramString2 = paramString1;
    int i;
    if (arrayOfString.length > 1) {
      i = 0;
    }
    for (;;)
    {
      if (i >= arrayOfString.length - 1)
      {
        if (!paramString1.exists()) {
          paramString1.mkdirs();
        }
        paramString2 = arrayOfString[(arrayOfString.length - 1)];
      }
      try
      {
        str = new String(paramString2.getBytes("8859_1"), "GB2312");
        paramString2 = str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        for (;;)
        {
          String str;
          localUnsupportedEncodingException2.printStackTrace();
        }
      }
      paramString2 = new File(paramString1, paramString2);
      return paramString2;
      paramString2 = arrayOfString[i];
      try
      {
        str = new String(paramString2.getBytes("8859_1"), "GB2312");
        paramString2 = str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        for (;;)
        {
          localUnsupportedEncodingException1.printStackTrace();
        }
      }
      paramString1 = new File(paramString1, paramString2);
      i += 1;
    }
  }
  
  public static boolean isDirectoryEmpty(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {}
    do
    {
      do
      {
        return true;
      } while (!paramString.isDirectory());
      paramString = paramString.list();
    } while ((paramString == null) || (paramString.length <= 0));
    return false;
  }
  
  public static boolean isFileExists(String paramString)
  {
    try
    {
      boolean bool = new File(paramString).exists();
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static boolean makeDirs(String paramString)
  {
    paramString = getFolderName(paramString);
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory())) {
      return true;
    }
    return paramString.mkdirs();
  }
  
  public static void unZip(File paramFile, String paramString1, String paramString2)
  {
    paramFile = new net.lingala.zip4j.core.ZipFile(paramFile);
    paramFile.setFileNameCharset("GBK");
    if (!paramFile.isValidZipFile()) {
      throw new ZipException("压缩文件不合法,可能被损坏.");
    }
    File localFile = new File(paramString1);
    if ((localFile.isDirectory()) && (!localFile.exists())) {
      localFile.mkdir();
    }
    if (paramFile.isEncrypted()) {
      paramFile.setPassword(paramString2.toCharArray());
    }
    paramFile.extractAll(paramString1);
  }
  
  public static void unZipAssets(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = new File(paramString2);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    paramString1 = new ZipInputStream(paramContext.getAssets().open(paramString1));
    paramContext = paramString1.getNextEntry();
    localObject = new byte['က'];
    for (;;)
    {
      if (paramContext == null)
      {
        paramString1.close();
        return;
      }
      if (!paramContext.isDirectory()) {
        break;
      }
      new File(paramString2 + File.separator + paramContext.getName()).mkdir();
      paramContext = paramString1.getNextEntry();
    }
    paramContext = new File(paramString2 + File.separator + paramContext.getName());
    paramContext.createNewFile();
    paramContext = new FileOutputStream(paramContext);
    for (;;)
    {
      int i = paramString1.read((byte[])localObject);
      if (i <= 0)
      {
        paramContext.close();
        break;
      }
      paramContext.write((byte[])localObject, 0, i);
    }
  }
  
  public static int upZipFile(File paramFile, String paramString)
  {
    java.util.zip.ZipFile localZipFile = new java.util.zip.ZipFile(paramFile);
    Enumeration localEnumeration = localZipFile.entries();
    byte[] arrayOfByte = new byte['Ѐ'];
    paramFile = paramString;
    if (!paramString.endsWith("/"))
    {
      Log.e("folderPath is'st end with /!!!");
      paramFile = paramString + File.separator;
    }
    Log.e("folderPath = " + paramFile);
    for (;;)
    {
      if (!localEnumeration.hasMoreElements())
      {
        localZipFile.close();
        Log.d("upZipFile finished!!!");
        return 0;
      }
      localObject = (ZipEntry)localEnumeration.nextElement();
      if (!((ZipEntry)localObject).isDirectory()) {
        break;
      }
      new File(new String((paramFile + ((ZipEntry)localObject).getName()).getBytes("8859_1"), "GB2312")).mkdirs();
    }
    paramString = new BufferedOutputStream(new FileOutputStream(getRealFileName(paramFile, ((ZipEntry)localObject).getName())));
    Object localObject = new BufferedInputStream(localZipFile.getInputStream((ZipEntry)localObject));
    for (;;)
    {
      int i = ((InputStream)localObject).read(arrayOfByte, 0, 1024);
      if (i == -1)
      {
        ((InputStream)localObject).close();
        paramString.close();
        break;
      }
      paramString.write(arrayOfByte, 0, i);
    }
  }
  
  /* Error */
  public static boolean writeFile(File paramFile, InputStream paramInputStream, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: invokevirtual 461	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   7: invokestatic 463	com/android/thinkive/framework/util/FileUtil:makeDirs	(Ljava/lang/String;)Z
    //   10: pop
    //   11: new 75	java/io/FileOutputStream
    //   14: dup
    //   15: aload_0
    //   16: iload_2
    //   17: invokespecial 466	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   20: astore_3
    //   21: aload_3
    //   22: astore_0
    //   23: sipush 1024
    //   26: newarray <illegal type>
    //   28: astore 4
    //   30: aload_3
    //   31: astore_0
    //   32: aload_1
    //   33: aload 4
    //   35: invokevirtual 82	java/io/InputStream:read	([B)I
    //   38: istore 5
    //   40: iload 5
    //   42: iconst_m1
    //   43: if_icmpne +25 -> 68
    //   46: aload_3
    //   47: astore_0
    //   48: aload_3
    //   49: invokevirtual 469	java/io/OutputStream:flush	()V
    //   52: aload_3
    //   53: ifnull +11 -> 64
    //   56: aload_3
    //   57: invokevirtual 86	java/io/OutputStream:close	()V
    //   60: aload_1
    //   61: invokevirtual 83	java/io/InputStream:close	()V
    //   64: iconst_1
    //   65: istore_2
    //   66: iload_2
    //   67: ireturn
    //   68: aload_3
    //   69: astore_0
    //   70: aload_3
    //   71: aload 4
    //   73: iconst_0
    //   74: iload 5
    //   76: invokevirtual 90	java/io/OutputStream:write	([BII)V
    //   79: goto -49 -> 30
    //   82: astore 4
    //   84: aload_3
    //   85: astore_0
    //   86: aload 4
    //   88: invokevirtual 205	java/io/FileNotFoundException:printStackTrace	()V
    //   91: iload 6
    //   93: istore_2
    //   94: aload_3
    //   95: ifnull -29 -> 66
    //   98: aload_3
    //   99: invokevirtual 86	java/io/OutputStream:close	()V
    //   102: aload_1
    //   103: invokevirtual 83	java/io/InputStream:close	()V
    //   106: iconst_0
    //   107: ireturn
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 470	java/io/IOException:printStackTrace	()V
    //   113: iconst_0
    //   114: ireturn
    //   115: astore_0
    //   116: aload_0
    //   117: invokevirtual 470	java/io/IOException:printStackTrace	()V
    //   120: goto -56 -> 64
    //   123: astore 4
    //   125: aconst_null
    //   126: astore_3
    //   127: aload_3
    //   128: astore_0
    //   129: aload 4
    //   131: invokevirtual 470	java/io/IOException:printStackTrace	()V
    //   134: iload 6
    //   136: istore_2
    //   137: aload_3
    //   138: ifnull -72 -> 66
    //   141: aload_3
    //   142: invokevirtual 86	java/io/OutputStream:close	()V
    //   145: aload_1
    //   146: invokevirtual 83	java/io/InputStream:close	()V
    //   149: iconst_0
    //   150: ireturn
    //   151: astore_0
    //   152: aload_0
    //   153: invokevirtual 470	java/io/IOException:printStackTrace	()V
    //   156: iconst_0
    //   157: ireturn
    //   158: astore_3
    //   159: aconst_null
    //   160: astore_0
    //   161: aload_0
    //   162: ifnull +11 -> 173
    //   165: aload_0
    //   166: invokevirtual 86	java/io/OutputStream:close	()V
    //   169: aload_1
    //   170: invokevirtual 83	java/io/InputStream:close	()V
    //   173: aload_3
    //   174: athrow
    //   175: astore_0
    //   176: aload_0
    //   177: invokevirtual 470	java/io/IOException:printStackTrace	()V
    //   180: goto -7 -> 173
    //   183: astore_3
    //   184: goto -23 -> 161
    //   187: astore 4
    //   189: goto -62 -> 127
    //   192: astore 4
    //   194: aconst_null
    //   195: astore_3
    //   196: goto -112 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	paramFile	File
    //   0	199	1	paramInputStream	InputStream
    //   0	199	2	paramBoolean	boolean
    //   20	122	3	localFileOutputStream	FileOutputStream
    //   158	16	3	localObject1	Object
    //   183	1	3	localObject2	Object
    //   195	1	3	localObject3	Object
    //   28	44	4	arrayOfByte	byte[]
    //   82	5	4	localFileNotFoundException1	FileNotFoundException
    //   123	7	4	localIOException1	IOException
    //   187	1	4	localIOException2	IOException
    //   192	1	4	localFileNotFoundException2	FileNotFoundException
    //   38	37	5	i	int
    //   1	134	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   23	30	82	java/io/FileNotFoundException
    //   32	40	82	java/io/FileNotFoundException
    //   48	52	82	java/io/FileNotFoundException
    //   70	79	82	java/io/FileNotFoundException
    //   98	106	108	java/io/IOException
    //   56	64	115	java/io/IOException
    //   3	21	123	java/io/IOException
    //   141	149	151	java/io/IOException
    //   3	21	158	finally
    //   165	173	175	java/io/IOException
    //   23	30	183	finally
    //   32	40	183	finally
    //   48	52	183	finally
    //   70	79	183	finally
    //   86	91	183	finally
    //   129	134	183	finally
    //   23	30	187	java/io/IOException
    //   32	40	187	java/io/IOException
    //   48	52	187	java/io/IOException
    //   70	79	187	java/io/IOException
    //   3	21	192	java/io/FileNotFoundException
  }
  
  public static boolean writeFile(String paramString, InputStream paramInputStream)
  {
    return writeFile(paramString, paramInputStream, false);
  }
  
  public static boolean writeFile(String paramString, InputStream paramInputStream, boolean paramBoolean)
  {
    if (paramString != null) {}
    for (paramString = new File(paramString);; paramString = null) {
      return writeFile(paramString, paramInputStream, paramBoolean);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\FileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */