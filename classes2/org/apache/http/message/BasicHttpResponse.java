package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicHttpResponse
  extends AbstractHttpMessage
  implements HttpResponse
{
  private int code;
  private HttpEntity entity;
  private Locale locale;
  private final ReasonPhraseCatalog reasonCatalog;
  private String reasonPhrase;
  private StatusLine statusline;
  private ProtocolVersion ver;
  
  public BasicHttpResponse(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = paramString;
    this.reasonCatalog = null;
    this.locale = null;
  }
  
  public BasicHttpResponse(StatusLine paramStatusLine)
  {
    this.statusline = ((StatusLine)Args.notNull(paramStatusLine, "Status line"));
    this.ver = paramStatusLine.getProtocolVersion();
    this.code = paramStatusLine.getStatusCode();
    this.reasonPhrase = paramStatusLine.getReasonPhrase();
    this.reasonCatalog = null;
    this.locale = null;
  }
  
  public BasicHttpResponse(StatusLine paramStatusLine, ReasonPhraseCatalog paramReasonPhraseCatalog, Locale paramLocale)
  {
    this.statusline = ((StatusLine)Args.notNull(paramStatusLine, "Status line"));
    this.ver = paramStatusLine.getProtocolVersion();
    this.code = paramStatusLine.getStatusCode();
    this.reasonPhrase = paramStatusLine.getReasonPhrase();
    this.reasonCatalog = paramReasonPhraseCatalog;
    this.locale = paramLocale;
  }
  
  public HttpEntity getEntity()
  {
    return this.entity;
  }
  
  public Locale getLocale()
  {
    return this.locale;
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.ver;
  }
  
  protected String getReason(int paramInt)
  {
    if (this.reasonCatalog != null)
    {
      ReasonPhraseCatalog localReasonPhraseCatalog = this.reasonCatalog;
      if (this.locale != null) {}
      for (Locale localLocale = this.locale;; localLocale = Locale.getDefault()) {
        return localReasonPhraseCatalog.getReason(paramInt, localLocale);
      }
    }
    return null;
  }
  
  public StatusLine getStatusLine()
  {
    Object localObject;
    int i;
    if (this.statusline == null)
    {
      if (this.ver == null) {
        break label55;
      }
      localObject = this.ver;
      i = this.code;
      if (this.reasonPhrase == null) {
        break label62;
      }
    }
    label55:
    label62:
    for (String str = this.reasonPhrase;; str = getReason(this.code))
    {
      this.statusline = new BasicStatusLine((ProtocolVersion)localObject, i, str);
      return this.statusline;
      localObject = HttpVersion.HTTP_1_1;
      break;
    }
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
  }
  
  public void setLocale(Locale paramLocale)
  {
    this.locale = ((Locale)Args.notNull(paramLocale, "Locale"));
    this.statusline = null;
  }
  
  public void setReasonPhrase(String paramString)
  {
    this.statusline = null;
    this.reasonPhrase = paramString;
  }
  
  public void setStatusCode(int paramInt)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.code = paramInt;
    this.reasonPhrase = null;
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = null;
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = paramString;
  }
  
  public void setStatusLine(StatusLine paramStatusLine)
  {
    this.statusline = ((StatusLine)Args.notNull(paramStatusLine, "Status line"));
    this.ver = paramStatusLine.getProtocolVersion();
    this.code = paramStatusLine.getStatusCode();
    this.reasonPhrase = paramStatusLine.getReasonPhrase();
  }
  
  public String toString()
  {
    return getStatusLine() + " " + this.headergroup;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHttpResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */