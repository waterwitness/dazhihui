package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;

@Deprecated
public class HttpMultipart
  extends AbstractMultipartForm
{
  private final HttpMultipartMode mode;
  private final List<FormBodyPart> parts;
  
  public HttpMultipart(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2);
  }
  
  public HttpMultipart(String paramString1, Charset paramCharset, String paramString2)
  {
    this(paramString1, paramCharset, paramString2, HttpMultipartMode.STRICT);
  }
  
  public HttpMultipart(String paramString1, Charset paramCharset, String paramString2, HttpMultipartMode paramHttpMultipartMode)
  {
    super(paramString1, paramCharset, paramString2);
    this.mode = paramHttpMultipartMode;
    this.parts = new ArrayList();
  }
  
  public void addBodyPart(FormBodyPart paramFormBodyPart)
  {
    if (paramFormBodyPart == null) {
      return;
    }
    this.parts.add(paramFormBodyPart);
  }
  
  protected void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream)
  {
    Header localHeader = paramFormBodyPart.getHeader();
    switch (HttpMultipart.1.$SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[this.mode.ordinal()])
    {
    default: 
      paramFormBodyPart = localHeader.iterator();
    }
    while (paramFormBodyPart.hasNext())
    {
      writeField((MinimalField)paramFormBodyPart.next(), paramOutputStream);
      continue;
      writeField(localHeader.getField("Content-Disposition"), this.charset, paramOutputStream);
      if (paramFormBodyPart.getBody().getFilename() != null) {
        writeField(localHeader.getField("Content-Type"), this.charset, paramOutputStream);
      }
    }
  }
  
  public List<FormBodyPart> getBodyParts()
  {
    return this.parts;
  }
  
  public HttpMultipartMode getMode()
  {
    return this.mode;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\entity\mime\HttpMultipart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */