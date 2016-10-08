package com.android.thinkive.framework.theme;

public class ThemeInfo
{
  public static final String ATTRIBUTE_NAME = "name";
  public static final String FILE_NAME = "theme_info.xml";
  public static final String TAG_COLOR = "color";
  public static final String TAG_STYLE_COLOR = "style_color";
  public static final String TAG_THEME = "theme";
  public static final String TAG_THEME_NAME = "theme_name";
  
  /* Error */
  public static ThemeBean parseThemeColor(String paramString)
  {
    // Byte code:
    //   0: invokestatic 42	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   3: astore_2
    //   4: new 44	com/android/thinkive/framework/theme/ThemeBean
    //   7: dup
    //   8: invokespecial 45	com/android/thinkive/framework/theme/ThemeBean:<init>	()V
    //   11: astore_1
    //   12: new 47	java/util/HashMap
    //   15: dup
    //   16: invokespecial 48	java/util/HashMap:<init>	()V
    //   19: astore_3
    //   20: aload_2
    //   21: new 50	java/io/FileInputStream
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 53	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   29: ldc 55
    //   31: invokeinterface 61 3 0
    //   36: aload_2
    //   37: invokeinterface 65 1 0
    //   42: pop
    //   43: aload_2
    //   44: invokeinterface 68 1 0
    //   49: istore 4
    //   51: iconst_1
    //   52: iload 4
    //   54: if_icmpne +13 -> 67
    //   57: aload_1
    //   58: areturn
    //   59: astore_0
    //   60: ldc 70
    //   62: invokestatic 75	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   65: aconst_null
    //   66: areturn
    //   67: iload 4
    //   69: tableswitch	default:+23->92, 2:+34->103, 3:+141->210
    //   92: aload_2
    //   93: invokeinterface 65 1 0
    //   98: istore 4
    //   100: goto -49 -> 51
    //   103: aload_2
    //   104: invokeinterface 79 1 0
    //   109: astore_0
    //   110: aload_0
    //   111: ldc 20
    //   113: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   116: ifne -24 -> 92
    //   119: aload_0
    //   120: ldc 23
    //   122: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   125: ifeq +23 -> 148
    //   128: aload_1
    //   129: aload_2
    //   130: invokeinterface 88 1 0
    //   135: invokevirtual 91	com/android/thinkive/framework/theme/ThemeBean:setThemeName	(Ljava/lang/String;)V
    //   138: goto -46 -> 92
    //   141: astore_0
    //   142: aload_0
    //   143: invokevirtual 94	org/xmlpull/v1/XmlPullParserException:printStackTrace	()V
    //   146: aload_1
    //   147: areturn
    //   148: aload_0
    //   149: ldc 17
    //   151: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   154: ifeq +23 -> 177
    //   157: aload_1
    //   158: aload_2
    //   159: invokeinterface 88 1 0
    //   164: invokevirtual 97	com/android/thinkive/framework/theme/ThemeBean:setStyleColor	(Ljava/lang/String;)V
    //   167: goto -75 -> 92
    //   170: astore_0
    //   171: aload_0
    //   172: invokevirtual 98	java/io/IOException:printStackTrace	()V
    //   175: aload_1
    //   176: areturn
    //   177: aload_0
    //   178: ldc 14
    //   180: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   183: ifeq -91 -> 92
    //   186: aload_3
    //   187: aload_2
    //   188: ldc 100
    //   190: ldc 8
    //   192: invokeinterface 104 3 0
    //   197: aload_2
    //   198: invokeinterface 88 1 0
    //   203: invokevirtual 108	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   206: pop
    //   207: goto -115 -> 92
    //   210: aload_1
    //   211: aload_3
    //   212: invokevirtual 112	com/android/thinkive/framework/theme/ThemeBean:setMapColor	(Ljava/util/HashMap;)V
    //   215: goto -123 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	paramString	String
    //   11	200	1	localThemeBean	ThemeBean
    //   3	195	2	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   19	193	3	localHashMap	java.util.HashMap
    //   49	50	4	i	int
    // Exception table:
    //   from	to	target	type
    //   20	36	59	java/lang/Exception
    //   36	51	141	org/xmlpull/v1/XmlPullParserException
    //   92	100	141	org/xmlpull/v1/XmlPullParserException
    //   103	138	141	org/xmlpull/v1/XmlPullParserException
    //   148	167	141	org/xmlpull/v1/XmlPullParserException
    //   177	207	141	org/xmlpull/v1/XmlPullParserException
    //   210	215	141	org/xmlpull/v1/XmlPullParserException
    //   36	51	170	java/io/IOException
    //   92	100	170	java/io/IOException
    //   103	138	170	java/io/IOException
    //   148	167	170	java/io/IOException
    //   177	207	170	java/io/IOException
    //   210	215	170	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\theme\ThemeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */