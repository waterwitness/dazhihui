package org.apache.http.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map<**>;

public class VersionInfo
{
  public static final String PROPERTY_MODULE = "info.module";
  public static final String PROPERTY_RELEASE = "info.release";
  public static final String PROPERTY_TIMESTAMP = "info.timestamp";
  public static final String UNAVAILABLE = "UNAVAILABLE";
  public static final String VERSION_PROPERTY_FILE = "version.properties";
  private final String infoClassloader;
  private final String infoModule;
  private final String infoPackage;
  private final String infoRelease;
  private final String infoTimestamp;
  
  protected VersionInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Args.notNull(paramString1, "Package identifier");
    this.infoPackage = paramString1;
    if (paramString2 != null)
    {
      this.infoModule = paramString2;
      if (paramString3 == null) {
        break label63;
      }
      label29:
      this.infoRelease = paramString3;
      if (paramString4 == null) {
        break label69;
      }
      label39:
      this.infoTimestamp = paramString4;
      if (paramString5 == null) {
        break label76;
      }
    }
    for (;;)
    {
      this.infoClassloader = paramString5;
      return;
      paramString2 = "UNAVAILABLE";
      break;
      label63:
      paramString3 = "UNAVAILABLE";
      break label29;
      label69:
      paramString4 = "UNAVAILABLE";
      break label39;
      label76:
      paramString5 = "UNAVAILABLE";
    }
  }
  
  protected static VersionInfo fromMap(String paramString, Map<?, ?> paramMap, ClassLoader paramClassLoader)
  {
    Object localObject4 = null;
    Args.notNull(paramString, "Package identifier");
    Object localObject1;
    Object localObject2;
    label80:
    Object localObject3;
    if (paramMap != null)
    {
      localObject1 = (String)paramMap.get("info.module");
      if ((localObject1 != null) && (((String)localObject1).length() < 1))
      {
        localObject1 = null;
        localObject2 = (String)paramMap.get("info.release");
        if ((localObject2 != null) && ((((String)localObject2).length() < 1) || (((String)localObject2).equals("${pom.version}"))))
        {
          localObject2 = null;
          localObject3 = (String)paramMap.get("info.timestamp");
          if ((localObject3 != null) && ((((String)localObject3).length() < 1) || (((String)localObject3).equals("${mvn.timestamp}"))))
          {
            Object localObject5 = null;
            paramMap = (Map<?, ?>)localObject2;
            localObject3 = localObject1;
            localObject2 = localObject5;
            localObject1 = paramMap;
            paramMap = (Map<?, ?>)localObject3;
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = localObject4;
      if (paramClassLoader != null) {
        localObject3 = paramClassLoader.toString();
      }
      return new VersionInfo(paramString, paramMap, (String)localObject1, (String)localObject2, (String)localObject3);
      paramMap = (Map<?, ?>)localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
      continue;
      break label80;
      break;
      localObject2 = null;
      localObject1 = null;
      paramMap = null;
    }
  }
  
  public static String getUserAgent(String paramString1, String paramString2, Class<?> paramClass)
  {
    paramString2 = loadVersionInfo(paramString2, paramClass.getClassLoader());
    if (paramString2 != null) {}
    for (paramString2 = paramString2.getRelease();; paramString2 = "UNAVAILABLE")
    {
      paramClass = System.getProperty("java.version");
      return paramString1 + "/" + paramString2 + " (Java 1.5 minimum; Java/" + paramClass + ")";
    }
  }
  
  /* Error */
  public static VersionInfo loadVersionInfo(String paramString, ClassLoader paramClassLoader)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ldc 31
    //   5: invokestatic 37	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   8: pop
    //   9: aload_1
    //   10: ifnull +79 -> 89
    //   13: aload_1
    //   14: astore_2
    //   15: aload_2
    //   16: new 103	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   23: aload_0
    //   24: bipush 46
    //   26: bipush 47
    //   28: invokevirtual 122	java/lang/String:replace	(CC)Ljava/lang/String;
    //   31: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: ldc 110
    //   36: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc 19
    //   41: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokevirtual 128	java/lang/ClassLoader:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   50: astore 4
    //   52: aload 4
    //   54: ifnull +64 -> 118
    //   57: new 130	java/util/Properties
    //   60: dup
    //   61: invokespecial 131	java/util/Properties:<init>	()V
    //   64: astore_1
    //   65: aload_1
    //   66: aload 4
    //   68: invokevirtual 135	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   71: aload 4
    //   73: invokevirtual 140	java/io/InputStream:close	()V
    //   76: aload_1
    //   77: ifnull +10 -> 87
    //   80: aload_0
    //   81: aload_1
    //   82: aload_2
    //   83: invokestatic 142	org/apache/http/util/VersionInfo:fromMap	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/ClassLoader;)Lorg/apache/http/util/VersionInfo;
    //   86: astore_3
    //   87: aload_3
    //   88: areturn
    //   89: invokestatic 148	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   92: invokevirtual 151	java/lang/Thread:getContextClassLoader	()Ljava/lang/ClassLoader;
    //   95: astore_2
    //   96: goto -81 -> 15
    //   99: astore_1
    //   100: aload 4
    //   102: invokevirtual 140	java/io/InputStream:close	()V
    //   105: aload_1
    //   106: athrow
    //   107: astore_1
    //   108: aconst_null
    //   109: astore_1
    //   110: goto -34 -> 76
    //   113: astore 4
    //   115: goto -39 -> 76
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -44 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramString	String
    //   0	123	1	paramClassLoader	ClassLoader
    //   14	82	2	localClassLoader	ClassLoader
    //   1	87	3	localVersionInfo	VersionInfo
    //   50	51	4	localInputStream	java.io.InputStream
    //   113	1	4	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   57	71	99	finally
    //   15	52	107	java/io/IOException
    //   100	107	107	java/io/IOException
    //   71	76	113	java/io/IOException
  }
  
  public static VersionInfo[] loadVersionInfo(String[] paramArrayOfString, ClassLoader paramClassLoader)
  {
    Args.notNull(paramArrayOfString, "Package identifier array");
    ArrayList localArrayList = new ArrayList(paramArrayOfString.length);
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      VersionInfo localVersionInfo = loadVersionInfo(paramArrayOfString[i], paramClassLoader);
      if (localVersionInfo != null) {
        localArrayList.add(localVersionInfo);
      }
      i += 1;
    }
    return (VersionInfo[])localArrayList.toArray(new VersionInfo[localArrayList.size()]);
  }
  
  public final String getClassloader()
  {
    return this.infoClassloader;
  }
  
  public final String getModule()
  {
    return this.infoModule;
  }
  
  public final String getPackage()
  {
    return this.infoPackage;
  }
  
  public final String getRelease()
  {
    return this.infoRelease;
  }
  
  public final String getTimestamp()
  {
    return this.infoTimestamp;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
    localStringBuilder.append("VersionInfo(").append(this.infoPackage).append(':').append(this.infoModule);
    if (!"UNAVAILABLE".equals(this.infoRelease)) {
      localStringBuilder.append(':').append(this.infoRelease);
    }
    if (!"UNAVAILABLE".equals(this.infoTimestamp)) {
      localStringBuilder.append(':').append(this.infoTimestamp);
    }
    localStringBuilder.append(')');
    if (!"UNAVAILABLE".equals(this.infoClassloader)) {
      localStringBuilder.append('@').append(this.infoClassloader);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\util\VersionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */