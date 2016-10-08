package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

public final class Util
{
  private static final char[] DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
  public static final Charset US_ASCII = Charset.forName("US-ASCII");
  public static final Charset UTF_8 = Charset.forName("UTF-8");
  private static AtomicReference<byte[]> skipBuffer = new AtomicReference();
  
  private static String bytesToHexString(byte[] paramArrayOfByte)
  {
    int i = 0;
    char[] arrayOfChar1 = DIGITS;
    char[] arrayOfChar2 = new char[paramArrayOfByte.length * 2];
    int k = paramArrayOfByte.length;
    int j = 0;
    for (;;)
    {
      if (i >= k) {
        return new String(arrayOfChar2);
      }
      int m = paramArrayOfByte[i];
      int n = j + 1;
      arrayOfChar2[j] = arrayOfChar1[(m >> 4 & 0xF)];
      j = n + 1;
      arrayOfChar2[n] = arrayOfChar1[(m & 0xF)];
      i += 1;
    }
  }
  
  public static void checkOffsetAndCount(int paramInt1, int paramInt2, int paramInt3)
  {
    if (((paramInt2 | paramInt3) < 0) || (paramInt2 > paramInt1) || (paramInt1 - paramInt2 < paramInt3)) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  
  public static void closeAll(Closeable paramCloseable1, Closeable paramCloseable2)
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        paramCloseable1.close();
        paramCloseable1 = (Closeable)localObject;
      }
      catch (Throwable paramCloseable1)
      {
        continue;
      }
      try
      {
        paramCloseable2.close();
        paramCloseable2 = paramCloseable1;
      }
      catch (Throwable localThrowable)
      {
        paramCloseable2 = paramCloseable1;
        if (paramCloseable1 != null) {
          continue;
        }
        paramCloseable2 = localThrowable;
        continue;
        if (!(paramCloseable2 instanceof IOException)) {
          continue;
        }
        throw ((IOException)paramCloseable2);
        if (!(paramCloseable2 instanceof RuntimeException)) {
          continue;
        }
        throw ((RuntimeException)paramCloseable2);
        if (!(paramCloseable2 instanceof Error)) {
          continue;
        }
        throw ((Error)paramCloseable2);
        throw new AssertionError(paramCloseable2);
      }
    }
    if (paramCloseable2 == null) {
      return;
    }
  }
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void closeQuietly(ServerSocket paramServerSocket)
  {
    if (paramServerSocket != null) {}
    try
    {
      paramServerSocket.close();
      return;
    }
    catch (RuntimeException paramServerSocket)
    {
      throw paramServerSocket;
    }
    catch (Exception paramServerSocket) {}
  }
  
  public static void closeQuietly(Socket paramSocket)
  {
    if (paramSocket != null) {}
    try
    {
      paramSocket.close();
      return;
    }
    catch (RuntimeException paramSocket)
    {
      throw paramSocket;
    }
    catch (Exception paramSocket) {}
  }
  
  public static int copy(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[' '];
    int i = 0;
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j == -1) {
        return i;
      }
      i += j;
      paramOutputStream.write(arrayOfByte, 0, j);
    }
  }
  
  public static ThreadFactory daemonThreadFactory(String paramString)
  {
    return new Util.1(paramString);
  }
  
  public static void deleteContents(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IOException("not a readable directory: " + paramFile);
    }
    int j = arrayOfFile.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramFile = arrayOfFile[i];
      if (paramFile.isDirectory()) {
        deleteContents(paramFile);
      }
      if (!paramFile.delete()) {
        throw new IOException("failed to delete file: " + paramFile);
      }
      i += 1;
    }
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int getDefaultPort(String paramString)
  {
    if ("http".equalsIgnoreCase(paramString)) {
      return 80;
    }
    if ("https".equalsIgnoreCase(paramString)) {
      return 443;
    }
    return -1;
  }
  
  private static int getEffectivePort(String paramString, int paramInt)
  {
    if (paramInt != -1) {
      return paramInt;
    }
    return getDefaultPort(paramString);
  }
  
  public static int getEffectivePort(URI paramURI)
  {
    return getEffectivePort(paramURI.getScheme(), paramURI.getPort());
  }
  
  public static int getEffectivePort(URL paramURL)
  {
    return getEffectivePort(paramURL.getProtocol(), paramURL.getPort());
  }
  
  public static String hash(String paramString)
  {
    try
    {
      paramString = bytesToHexString(MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8")));
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public static <T> List<T> immutableList(List<T> paramList)
  {
    return Collections.unmodifiableList(new ArrayList(paramList));
  }
  
  public static void pokeInt(byte[] paramArrayOfByte, int paramInt1, int paramInt2, ByteOrder paramByteOrder)
  {
    if (paramByteOrder == ByteOrder.BIG_ENDIAN)
    {
      i = paramInt1 + 1;
      paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 24 & 0xFF));
      paramInt1 = i + 1;
      paramArrayOfByte[i] = ((byte)(paramInt2 >> 16 & 0xFF));
      paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 0 & 0xFF));
      return;
    }
    int i = paramInt1 + 1;
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 0 & 0xFF));
    paramInt1 = i + 1;
    paramArrayOfByte[i] = ((byte)(paramInt2 >> 8 & 0xFF));
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 16 & 0xFF));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 24 & 0xFF));
  }
  
  public static String readAsciiLine(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    for (;;)
    {
      int i = paramInputStream.read();
      if (i == -1) {
        throw new EOFException();
      }
      if (i == 10)
      {
        i = localStringBuilder.length();
        if ((i > 0) && (localStringBuilder.charAt(i - 1) == '\r')) {
          localStringBuilder.setLength(i - 1);
        }
        return localStringBuilder.toString();
      }
      localStringBuilder.append((char)i);
    }
  }
  
  /* Error */
  public static String readFully(java.io.Reader paramReader)
  {
    // Byte code:
    //   0: new 278	java/io/StringWriter
    //   3: dup
    //   4: invokespecial 279	java/io/StringWriter:<init>	()V
    //   7: astore_1
    //   8: sipush 1024
    //   11: newarray <illegal type>
    //   13: astore_2
    //   14: aload_0
    //   15: aload_2
    //   16: invokevirtual 284	java/io/Reader:read	([C)I
    //   19: istore_3
    //   20: iload_3
    //   21: iconst_m1
    //   22: if_icmpne +14 -> 36
    //   25: aload_1
    //   26: invokevirtual 285	java/io/StringWriter:toString	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_0
    //   31: invokevirtual 286	java/io/Reader:close	()V
    //   34: aload_1
    //   35: areturn
    //   36: aload_1
    //   37: aload_2
    //   38: iconst_0
    //   39: iload_3
    //   40: invokevirtual 289	java/io/StringWriter:write	([CII)V
    //   43: goto -29 -> 14
    //   46: astore_1
    //   47: aload_0
    //   48: invokevirtual 286	java/io/Reader:close	()V
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramReader	java.io.Reader
    //   7	30	1	localObject1	Object
    //   46	6	1	localObject2	Object
    //   13	25	2	arrayOfChar	char[]
    //   19	21	3	i	int
    // Exception table:
    //   from	to	target	type
    //   0	14	46	finally
    //   14	20	46	finally
    //   25	30	46	finally
    //   36	43	46	finally
  }
  
  public static void readFully(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    readFully(paramInputStream, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static void readFully(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {}
    for (;;)
    {
      return;
      if (paramInputStream == null) {
        throw new NullPointerException("in == null");
      }
      if (paramArrayOfByte == null) {
        throw new NullPointerException("dst == null");
      }
      checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
      while (paramInt2 > 0)
      {
        int i = paramInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
        if (i < 0) {
          throw new EOFException();
        }
        paramInt1 += i;
        paramInt2 -= i;
      }
    }
  }
  
  public static int readSingleByte(InputStream paramInputStream)
  {
    int i = -1;
    byte[] arrayOfByte = new byte[1];
    if (paramInputStream.read(arrayOfByte, 0, 1) != -1) {
      i = arrayOfByte[0] & 0xFF;
    }
    return i;
  }
  
  public static void skipAll(InputStream paramInputStream)
  {
    do
    {
      paramInputStream.skip(Long.MAX_VALUE);
    } while (paramInputStream.read() != -1);
  }
  
  public static long skipByReading(InputStream paramInputStream, long paramLong)
  {
    long l2 = 0L;
    if (paramLong == 0L) {
      return 0L;
    }
    byte[] arrayOfByte2 = (byte[])skipBuffer.getAndSet(null);
    byte[] arrayOfByte1 = arrayOfByte2;
    long l1 = l2;
    if (arrayOfByte2 == null)
    {
      arrayOfByte1 = new byte['က'];
      l1 = l2;
    }
    if (l1 >= paramLong) {
      l2 = l1;
    }
    for (;;)
    {
      skipBuffer.set(arrayOfByte1);
      return l2;
      int i = (int)Math.min(paramLong - l1, arrayOfByte1.length);
      int j = paramInputStream.read(arrayOfByte1, 0, i);
      l2 = l1;
      if (j != -1)
      {
        l2 = l1 + j;
        l1 = l2;
        if (j >= i) {
          break;
        }
      }
    }
  }
  
  public static void writeSingleByte(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(new byte[] { (byte)(paramInt & 0xFF) });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */