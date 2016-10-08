package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

public final class EntityUtils
{
  public static void consume(HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity == null) {}
    do
    {
      do
      {
        return;
      } while (!paramHttpEntity.isStreaming());
      paramHttpEntity = paramHttpEntity.getContent();
    } while (paramHttpEntity == null);
    paramHttpEntity.close();
  }
  
  public static void consumeQuietly(HttpEntity paramHttpEntity)
  {
    try
    {
      consume(paramHttpEntity);
      return;
    }
    catch (IOException paramHttpEntity) {}
  }
  
  @Deprecated
  public static String getContentCharSet(HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpEntity, "Entity");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramHttpEntity.getContentType() != null)
    {
      paramHttpEntity = paramHttpEntity.getContentType().getElements();
      localObject1 = localObject2;
      if (paramHttpEntity.length > 0)
      {
        paramHttpEntity = paramHttpEntity[0].getParameterByName("charset");
        localObject1 = localObject2;
        if (paramHttpEntity != null) {
          localObject1 = paramHttpEntity.getValue();
        }
      }
    }
    return (String)localObject1;
  }
  
  @Deprecated
  public static String getContentMimeType(HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpEntity, "Entity");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramHttpEntity.getContentType() != null)
    {
      paramHttpEntity = paramHttpEntity.getContentType().getElements();
      localObject1 = localObject2;
      if (paramHttpEntity.length > 0) {
        localObject1 = paramHttpEntity[0].getName();
      }
    }
    return (String)localObject1;
  }
  
  public static byte[] toByteArray(HttpEntity paramHttpEntity)
  {
    int i = 4096;
    boolean bool = false;
    Args.notNull(paramHttpEntity, "Entity");
    InputStream localInputStream = paramHttpEntity.getContent();
    if (localInputStream == null) {
      return null;
    }
    for (;;)
    {
      int j;
      try
      {
        if (paramHttpEntity.getContentLength() <= 2147483647L) {
          bool = true;
        }
        Args.check(bool, "HTTP entity too large to be buffered in memory");
        j = (int)paramHttpEntity.getContentLength();
        if (j >= 0) {
          break label118;
        }
        paramHttpEntity = new ByteArrayBuffer(i);
        byte[] arrayOfByte = new byte['က'];
        i = localInputStream.read(arrayOfByte);
        if (i != -1)
        {
          paramHttpEntity.append(arrayOfByte, 0, i);
          continue;
        }
        paramHttpEntity = paramHttpEntity.toByteArray();
      }
      finally
      {
        localInputStream.close();
      }
      localInputStream.close();
      return paramHttpEntity;
      label118:
      i = j;
    }
  }
  
  public static String toString(HttpEntity paramHttpEntity)
  {
    return toString(paramHttpEntity, (Charset)null);
  }
  
  public static String toString(HttpEntity paramHttpEntity, String paramString)
  {
    if (paramString != null) {}
    for (paramString = Charset.forName(paramString);; paramString = null) {
      return toString(paramHttpEntity, paramString);
    }
  }
  
  /* Error */
  public static String toString(HttpEntity paramHttpEntity, Charset paramCharset)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore 9
    //   5: aload_0
    //   6: ldc 36
    //   8: invokestatic 42	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_0
    //   13: invokeinterface 21 1 0
    //   18: astore_3
    //   19: aload_3
    //   20: ifnonnull +5 -> 25
    //   23: aconst_null
    //   24: areturn
    //   25: aload_0
    //   26: invokeinterface 77 1 0
    //   31: ldc2_w 78
    //   34: lcmp
    //   35: ifgt +6 -> 41
    //   38: iconst_1
    //   39: istore 9
    //   41: iload 9
    //   43: ldc 81
    //   45: invokestatic 85	org/apache/http/util/Args:check	(ZLjava/lang/String;)V
    //   48: aload_0
    //   49: invokeinterface 77 1 0
    //   54: lstore 7
    //   56: lload 7
    //   58: l2i
    //   59: istore 6
    //   61: iload 6
    //   63: istore 5
    //   65: iload 6
    //   67: ifge +8 -> 75
    //   70: sipush 4096
    //   73: istore 5
    //   75: aload_0
    //   76: invokestatic 120	org/apache/http/entity/ContentType:get	(Lorg/apache/http/HttpEntity;)Lorg/apache/http/entity/ContentType;
    //   79: astore 4
    //   81: aload_2
    //   82: astore_0
    //   83: aload 4
    //   85: ifnull +9 -> 94
    //   88: aload 4
    //   90: invokevirtual 124	org/apache/http/entity/ContentType:getCharset	()Ljava/nio/charset/Charset;
    //   93: astore_0
    //   94: aload_0
    //   95: astore_2
    //   96: aload_0
    //   97: ifnonnull +5 -> 102
    //   100: aload_1
    //   101: astore_2
    //   102: aload_2
    //   103: astore_0
    //   104: aload_2
    //   105: ifnonnull +7 -> 112
    //   108: getstatic 130	org/apache/http/protocol/HTTP:DEF_CONTENT_CHARSET	Ljava/nio/charset/Charset;
    //   111: astore_0
    //   112: new 132	java/io/InputStreamReader
    //   115: dup
    //   116: aload_3
    //   117: aload_0
    //   118: invokespecial 135	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   121: astore_0
    //   122: new 137	org/apache/http/util/CharArrayBuffer
    //   125: dup
    //   126: iload 5
    //   128: invokespecial 138	org/apache/http/util/CharArrayBuffer:<init>	(I)V
    //   131: astore_1
    //   132: sipush 1024
    //   135: newarray <illegal type>
    //   137: astore_2
    //   138: aload_0
    //   139: aload_2
    //   140: invokevirtual 143	java/io/Reader:read	([C)I
    //   143: istore 5
    //   145: iload 5
    //   147: iconst_m1
    //   148: if_icmpeq +34 -> 182
    //   151: aload_1
    //   152: aload_2
    //   153: iconst_0
    //   154: iload 5
    //   156: invokevirtual 146	org/apache/http/util/CharArrayBuffer:append	([CII)V
    //   159: goto -21 -> 138
    //   162: astore_0
    //   163: aload_3
    //   164: invokevirtual 26	java/io/InputStream:close	()V
    //   167: aload_0
    //   168: athrow
    //   169: astore_0
    //   170: new 148	java/io/UnsupportedEncodingException
    //   173: dup
    //   174: aload_0
    //   175: invokevirtual 151	java/nio/charset/UnsupportedCharsetException:getMessage	()Ljava/lang/String;
    //   178: invokespecial 154	java/io/UnsupportedEncodingException:<init>	(Ljava/lang/String;)V
    //   181: athrow
    //   182: aload_1
    //   183: invokevirtual 156	org/apache/http/util/CharArrayBuffer:toString	()Ljava/lang/String;
    //   186: astore_0
    //   187: aload_3
    //   188: invokevirtual 26	java/io/InputStream:close	()V
    //   191: aload_0
    //   192: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	paramHttpEntity	HttpEntity
    //   0	193	1	paramCharset	Charset
    //   1	152	2	localObject	Object
    //   18	170	3	localInputStream	InputStream
    //   79	10	4	localContentType	org.apache.http.entity.ContentType
    //   63	92	5	i	int
    //   59	7	6	j	int
    //   54	3	7	l	long
    //   3	39	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   25	38	162	finally
    //   41	56	162	finally
    //   75	81	162	finally
    //   88	94	162	finally
    //   108	112	162	finally
    //   112	138	162	finally
    //   138	145	162	finally
    //   151	159	162	finally
    //   170	182	162	finally
    //   182	187	162	finally
    //   75	81	169	java/nio/charset/UnsupportedCharsetException
    //   88	94	169	java/nio/charset/UnsupportedCharsetException
  }
  
  public static void updateEntity(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpResponse, "Response");
    consume(paramHttpResponse.getEntity());
    paramHttpResponse.setEntity(paramHttpEntity);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\util\EntityUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */