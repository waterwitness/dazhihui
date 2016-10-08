package com.cairh.app.sjkh.xml.config;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class ConfigXmlHandle
{
  private Context context;
  
  public ConfigXmlHandle(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public byte[] readInputStream(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[paramInputStream.available()];
    int i = 0;
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j == -1)
      {
        localByteArrayOutputStream.flush();
        localByteArrayOutputStream.close();
        paramInputStream.close();
        return localByteArrayOutputStream.toByteArray();
      }
      localByteArrayOutputStream.write(arrayOfByte, i, j);
      i += j;
    }
  }
  
  /* Error */
  public java.util.List<ConfigBean> readLocalXml(java.io.File paramFile)
  {
    // Byte code:
    //   0: new 56	java/io/FileInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 59	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_2
    //   9: new 61	java/lang/String
    //   12: dup
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual 63	com/cairh/app/sjkh/xml/config/ConfigXmlHandle:readInputStream	(Ljava/io/InputStream;)[B
    //   18: ldc 65
    //   20: invokespecial 68	java/lang/String:<init>	([BLjava/lang/String;)V
    //   23: astore_1
    //   24: invokestatic 74	javax/xml/parsers/SAXParserFactory:newInstance	()Ljavax/xml/parsers/SAXParserFactory;
    //   27: invokevirtual 78	javax/xml/parsers/SAXParserFactory:newSAXParser	()Ljavax/xml/parsers/SAXParser;
    //   30: invokevirtual 84	javax/xml/parsers/SAXParser:getXMLReader	()Lorg/xml/sax/XMLReader;
    //   33: astore_3
    //   34: new 86	com/cairh/app/sjkh/xml/config/XMLContentHandler
    //   37: dup
    //   38: invokespecial 87	com/cairh/app/sjkh/xml/config/XMLContentHandler:<init>	()V
    //   41: astore 4
    //   43: aload_3
    //   44: aload 4
    //   46: invokeinterface 93 2 0
    //   51: aload_3
    //   52: new 95	org/xml/sax/InputSource
    //   55: dup
    //   56: new 97	java/io/StringReader
    //   59: dup
    //   60: aload_1
    //   61: invokespecial 100	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   64: invokespecial 103	org/xml/sax/InputSource:<init>	(Ljava/io/Reader;)V
    //   67: invokeinterface 107 2 0
    //   72: aload 4
    //   74: invokevirtual 111	com/cairh/app/sjkh/xml/config/XMLContentHandler:getConfigBean	()Ljava/util/List;
    //   77: astore_1
    //   78: aload_2
    //   79: invokevirtual 112	java/io/FileInputStream:close	()V
    //   82: aload_1
    //   83: areturn
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_2
    //   88: invokevirtual 115	javax/xml/parsers/ParserConfigurationException:printStackTrace	()V
    //   91: aload_1
    //   92: areturn
    //   93: astore_2
    //   94: aconst_null
    //   95: astore_1
    //   96: aload_2
    //   97: invokevirtual 116	org/xml/sax/SAXException:printStackTrace	()V
    //   100: aload_1
    //   101: areturn
    //   102: astore_2
    //   103: aconst_null
    //   104: astore_1
    //   105: aload_2
    //   106: invokevirtual 117	java/io/IOException:printStackTrace	()V
    //   109: aload_1
    //   110: areturn
    //   111: astore_2
    //   112: aconst_null
    //   113: astore_1
    //   114: aload_2
    //   115: invokevirtual 118	java/lang/Exception:printStackTrace	()V
    //   118: aload_1
    //   119: areturn
    //   120: astore_2
    //   121: goto -7 -> 114
    //   124: astore_2
    //   125: goto -20 -> 105
    //   128: astore_2
    //   129: goto -33 -> 96
    //   132: astore_2
    //   133: goto -46 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	ConfigXmlHandle
    //   0	136	1	paramFile	java.io.File
    //   8	71	2	localFileInputStream	java.io.FileInputStream
    //   84	4	2	localParserConfigurationException1	javax.xml.parsers.ParserConfigurationException
    //   93	4	2	localSAXException1	org.xml.sax.SAXException
    //   102	4	2	localIOException1	java.io.IOException
    //   111	4	2	localException1	Exception
    //   120	1	2	localException2	Exception
    //   124	1	2	localIOException2	java.io.IOException
    //   128	1	2	localSAXException2	org.xml.sax.SAXException
    //   132	1	2	localParserConfigurationException2	javax.xml.parsers.ParserConfigurationException
    //   33	19	3	localXMLReader	org.xml.sax.XMLReader
    //   41	32	4	localXMLContentHandler	XMLContentHandler
    // Exception table:
    //   from	to	target	type
    //   0	78	84	javax/xml/parsers/ParserConfigurationException
    //   0	78	93	org/xml/sax/SAXException
    //   0	78	102	java/io/IOException
    //   0	78	111	java/lang/Exception
    //   78	82	120	java/lang/Exception
    //   78	82	124	java/io/IOException
    //   78	82	128	org/xml/sax/SAXException
    //   78	82	132	javax/xml/parsers/ParserConfigurationException
  }
  
  /* Error */
  public java.util.List<ConfigBean> readXml(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/cairh/app/sjkh/xml/config/ConfigXmlHandle:context	Landroid/content/Context;
    //   4: invokevirtual 128	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   7: aload_1
    //   8: invokevirtual 134	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   11: astore_2
    //   12: new 61	java/lang/String
    //   15: dup
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual 63	com/cairh/app/sjkh/xml/config/ConfigXmlHandle:readInputStream	(Ljava/io/InputStream;)[B
    //   21: ldc 65
    //   23: invokespecial 68	java/lang/String:<init>	([BLjava/lang/String;)V
    //   26: astore_1
    //   27: invokestatic 74	javax/xml/parsers/SAXParserFactory:newInstance	()Ljavax/xml/parsers/SAXParserFactory;
    //   30: invokevirtual 78	javax/xml/parsers/SAXParserFactory:newSAXParser	()Ljavax/xml/parsers/SAXParser;
    //   33: invokevirtual 84	javax/xml/parsers/SAXParser:getXMLReader	()Lorg/xml/sax/XMLReader;
    //   36: astore_3
    //   37: new 86	com/cairh/app/sjkh/xml/config/XMLContentHandler
    //   40: dup
    //   41: invokespecial 87	com/cairh/app/sjkh/xml/config/XMLContentHandler:<init>	()V
    //   44: astore 4
    //   46: aload_3
    //   47: aload 4
    //   49: invokeinterface 93 2 0
    //   54: aload_3
    //   55: new 95	org/xml/sax/InputSource
    //   58: dup
    //   59: new 97	java/io/StringReader
    //   62: dup
    //   63: aload_1
    //   64: invokespecial 100	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   67: invokespecial 103	org/xml/sax/InputSource:<init>	(Ljava/io/Reader;)V
    //   70: invokeinterface 107 2 0
    //   75: aload 4
    //   77: invokevirtual 111	com/cairh/app/sjkh/xml/config/XMLContentHandler:getConfigBean	()Ljava/util/List;
    //   80: astore_1
    //   81: aload_2
    //   82: invokevirtual 36	java/io/InputStream:close	()V
    //   85: aload_1
    //   86: areturn
    //   87: astore_2
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_2
    //   91: invokevirtual 115	javax/xml/parsers/ParserConfigurationException:printStackTrace	()V
    //   94: aload_1
    //   95: areturn
    //   96: astore_2
    //   97: aconst_null
    //   98: astore_1
    //   99: aload_2
    //   100: invokevirtual 116	org/xml/sax/SAXException:printStackTrace	()V
    //   103: aload_1
    //   104: areturn
    //   105: astore_2
    //   106: aconst_null
    //   107: astore_1
    //   108: aload_2
    //   109: invokevirtual 117	java/io/IOException:printStackTrace	()V
    //   112: aload_1
    //   113: areturn
    //   114: astore_2
    //   115: aconst_null
    //   116: astore_1
    //   117: aload_2
    //   118: invokevirtual 118	java/lang/Exception:printStackTrace	()V
    //   121: aload_1
    //   122: areturn
    //   123: astore_2
    //   124: goto -7 -> 117
    //   127: astore_2
    //   128: goto -20 -> 108
    //   131: astore_2
    //   132: goto -33 -> 99
    //   135: astore_2
    //   136: goto -46 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	ConfigXmlHandle
    //   0	139	1	paramString	String
    //   11	71	2	localInputStream	InputStream
    //   87	4	2	localParserConfigurationException1	javax.xml.parsers.ParserConfigurationException
    //   96	4	2	localSAXException1	org.xml.sax.SAXException
    //   105	4	2	localIOException1	java.io.IOException
    //   114	4	2	localException1	Exception
    //   123	1	2	localException2	Exception
    //   127	1	2	localIOException2	java.io.IOException
    //   131	1	2	localSAXException2	org.xml.sax.SAXException
    //   135	1	2	localParserConfigurationException2	javax.xml.parsers.ParserConfigurationException
    //   36	19	3	localXMLReader	org.xml.sax.XMLReader
    //   44	32	4	localXMLContentHandler	XMLContentHandler
    // Exception table:
    //   from	to	target	type
    //   0	81	87	javax/xml/parsers/ParserConfigurationException
    //   0	81	96	org/xml/sax/SAXException
    //   0	81	105	java/io/IOException
    //   0	81	114	java/lang/Exception
    //   81	85	123	java/lang/Exception
    //   81	85	127	java/io/IOException
    //   81	85	131	org/xml/sax/SAXException
    //   81	85	135	javax/xml/parsers/ParserConfigurationException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\xml\config\ConfigXmlHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */