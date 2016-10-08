package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class EntityTemplate
  extends AbstractHttpEntity
{
  private final ContentProducer contentproducer;
  
  public EntityTemplate(ContentProducer paramContentProducer)
  {
    this.contentproducer = ((ContentProducer)Args.notNull(paramContentProducer, "Content producer"));
  }
  
  public InputStream getContent()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    writeTo(localByteArrayOutputStream);
    return new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
  }
  
  public long getContentLength()
  {
    return -1L;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    this.contentproducer.writeTo(paramOutputStream);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\EntityTemplate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */