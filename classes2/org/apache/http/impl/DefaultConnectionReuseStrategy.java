package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.BasicTokenIterator;

@Immutable
public class DefaultConnectionReuseStrategy
  implements ConnectionReuseStrategy
{
  public static final DefaultConnectionReuseStrategy INSTANCE = new DefaultConnectionReuseStrategy();
  
  private boolean canResponseHaveBody(HttpResponse paramHttpResponse)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    return (i >= 200) && (i != 204) && (i != 304) && (i != 205);
  }
  
  protected TokenIterator createTokenIterator(HeaderIterator paramHeaderIterator)
  {
    return new BasicTokenIterator(paramHeaderIterator);
  }
  
  /* Error */
  public boolean keepAlive(HttpResponse paramHttpResponse, org.apache.http.protocol.HttpContext paramHttpContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: aload_1
    //   4: ldc 47
    //   6: invokestatic 53	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: ldc 55
    //   13: invokestatic 53	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_1
    //   18: invokeinterface 26 1 0
    //   23: invokeinterface 59 1 0
    //   28: astore 4
    //   30: aload_1
    //   31: ldc 61
    //   33: invokeinterface 65 2 0
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +19 -> 59
    //   43: ldc 67
    //   45: aload_2
    //   46: invokeinterface 73 1 0
    //   51: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   54: ifne +48 -> 102
    //   57: iconst_0
    //   58: ireturn
    //   59: aload_0
    //   60: aload_1
    //   61: invokespecial 81	org/apache/http/impl/DefaultConnectionReuseStrategy:canResponseHaveBody	(Lorg/apache/http/HttpResponse;)Z
    //   64: ifeq +38 -> 102
    //   67: aload_1
    //   68: ldc 83
    //   70: invokeinterface 87 2 0
    //   75: astore_2
    //   76: aload_2
    //   77: arraylength
    //   78: iconst_1
    //   79: if_icmpne -22 -> 57
    //   82: aload_2
    //   83: iconst_0
    //   84: aaload
    //   85: astore_2
    //   86: aload_2
    //   87: invokeinterface 73 1 0
    //   92: invokestatic 93	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   95: istore 5
    //   97: iload 5
    //   99: iflt -42 -> 57
    //   102: aload_1
    //   103: ldc 95
    //   105: invokeinterface 99 2 0
    //   110: astore_3
    //   111: aload_3
    //   112: astore_2
    //   113: aload_3
    //   114: invokeinterface 105 1 0
    //   119: ifne +12 -> 131
    //   122: aload_1
    //   123: ldc 107
    //   125: invokeinterface 99 2 0
    //   130: astore_2
    //   131: aload_2
    //   132: invokeinterface 105 1 0
    //   137: ifeq +63 -> 200
    //   140: aload_0
    //   141: aload_2
    //   142: invokevirtual 109	org/apache/http/impl/DefaultConnectionReuseStrategy:createTokenIterator	(Lorg/apache/http/HeaderIterator;)Lorg/apache/http/TokenIterator;
    //   145: astore_1
    //   146: iconst_0
    //   147: istore 5
    //   149: aload_1
    //   150: invokeinterface 112 1 0
    //   155: ifeq +38 -> 193
    //   158: aload_1
    //   159: invokeinterface 115 1 0
    //   164: astore_2
    //   165: ldc 117
    //   167: aload_2
    //   168: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   171: ifne -114 -> 57
    //   174: ldc 119
    //   176: aload_2
    //   177: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   180: istore 7
    //   182: iload 7
    //   184: ifeq -35 -> 149
    //   187: iconst_1
    //   188: istore 5
    //   190: goto -41 -> 149
    //   193: iload 5
    //   195: ifeq +5 -> 200
    //   198: iconst_1
    //   199: ireturn
    //   200: aload 4
    //   202: getstatic 125	org/apache/http/HttpVersion:HTTP_1_0	Lorg/apache/http/HttpVersion;
    //   205: invokevirtual 131	org/apache/http/ProtocolVersion:lessEquals	(Lorg/apache/http/ProtocolVersion;)Z
    //   208: ifne +6 -> 214
    //   211: iload 6
    //   213: ireturn
    //   214: iconst_0
    //   215: istore 6
    //   217: goto -6 -> 211
    //   220: astore_1
    //   221: iconst_0
    //   222: ireturn
    //   223: astore_1
    //   224: iconst_0
    //   225: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	this	DefaultConnectionReuseStrategy
    //   0	226	1	paramHttpResponse	HttpResponse
    //   0	226	2	paramHttpContext	org.apache.http.protocol.HttpContext
    //   110	4	3	localHeaderIterator	HeaderIterator
    //   28	173	4	localProtocolVersion	org.apache.http.ProtocolVersion
    //   95	99	5	i	int
    //   1	215	6	bool1	boolean
    //   180	3	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   140	146	220	org/apache/http/ParseException
    //   149	182	220	org/apache/http/ParseException
    //   86	97	223	java/lang/NumberFormatException
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\DefaultConnectionReuseStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */