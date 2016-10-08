package com.payeco.android.plugin.http.parse;

import java.io.InputStream;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ConfigParseService
{
  public static final String CONFIG_VERSION = "configVersion";
  public static final String FRONTPUBKEY = "frontPubKey";
  public static final String FRONTPUBKEY_BASE64 = "frontPubKeyBase64";
  public static final String FRONTPUBKEY_VERSION = "frontPubKeyversion";
  public static final String FRONT_MODULUS = "frontModulus";
  public static final String FRONT_PUBLICEXPONENT = "frontPublicExponent";
  public static final String UPOPPUBKEY = "upopPubKey";
  public static final String UPOPPUBKEY_BASE64 = "upopPubKeyBase64";
  public static final String UPOPPUBKEY_VERSION = "upopPubKeyversion";
  public static final String UPOP_MODULUS = "upopModulus";
  public static final String UPOP_PUBLICEXPONENT = "upopPublicExponent";
  
  public Map parseConfig(InputStream paramInputStream)
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    a locala = new a();
    localSAXParser.parse(paramInputStream, locala);
    return locala.k();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\ConfigParseService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */