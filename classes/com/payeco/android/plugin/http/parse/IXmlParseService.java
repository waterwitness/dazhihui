package com.payeco.android.plugin.http.parse;

import java.io.InputStream;

public abstract interface IXmlParseService
{
  public abstract Object getByParseXml(InputStream paramInputStream, Class paramClass);
  
  public abstract Object getByParseXml(InputStream paramInputStream, Class paramClass, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\IXmlParseService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */