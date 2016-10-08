package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class SerializableEntity
  extends AbstractHttpEntity
{
  private Serializable objRef;
  private byte[] objSer;
  
  public SerializableEntity(Serializable paramSerializable)
  {
    Args.notNull(paramSerializable, "Source object");
    this.objRef = paramSerializable;
  }
  
  public SerializableEntity(Serializable paramSerializable, boolean paramBoolean)
  {
    Args.notNull(paramSerializable, "Source object");
    if (paramBoolean)
    {
      createBytes(paramSerializable);
      return;
    }
    this.objRef = paramSerializable;
  }
  
  private void createBytes(Serializable paramSerializable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
    localObjectOutputStream.writeObject(paramSerializable);
    localObjectOutputStream.flush();
    this.objSer = localByteArrayOutputStream.toByteArray();
  }
  
  public InputStream getContent()
  {
    if (this.objSer == null) {
      createBytes(this.objRef);
    }
    return new ByteArrayInputStream(this.objSer);
  }
  
  public long getContentLength()
  {
    if (this.objSer == null) {
      return -1L;
    }
    return this.objSer.length;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return this.objSer == null;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    if (this.objSer == null)
    {
      paramOutputStream = new ObjectOutputStream(paramOutputStream);
      paramOutputStream.writeObject(this.objRef);
      paramOutputStream.flush();
      return;
    }
    paramOutputStream.write(this.objSer);
    paramOutputStream.flush();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\SerializableEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */