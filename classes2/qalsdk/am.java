package qalsdk;

import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.util.MsfSocketInputBuffer;
import com.tencent.qalsdk.util.QLog;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.IdentityInputStream;

public class am
  implements an
{
  j a;
  
  public am(j paramj)
  {
    this.a = paramj;
  }
  
  protected int a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.put(paramArrayOfByte).flip();
    return localByteBuffer.getInt();
  }
  
  public void a(MsfSocketInputBuffer paramMsfSocketInputBuffer)
  {
    Object localObject2 = new ap(paramMsfSocketInputBuffer).a();
    if (ap.a((ao)localObject2))
    {
      if (((ao)localObject2).b() == -1) {
        break label100;
      }
      ((ao)localObject2).a(new ContentLengthInputStream(paramMsfSocketInputBuffer, ((ao)localObject2).b()));
    }
    for (;;)
    {
      i = ((ao)localObject2).a().getStatusCode();
      if (i >= 200) {
        break;
      }
      if (i == 100) {
        break label278;
      }
      throw new ProtocolException("Unexpected response: " + ((ao)localObject2).a());
      label100:
      if (((ao)localObject2).c().equalsIgnoreCase("chunked")) {
        ((ao)localObject2).a(new ChunkedInputStream(paramMsfSocketInputBuffer));
      } else {
        ((ao)localObject2).a(new IdentityInputStream(paramMsfSocketInputBuffer));
      }
    }
    byte[] arrayOfByte1 = new byte['倀'];
    Object localObject1 = new ArrayList();
    int i = 0;
    for (;;)
    {
      int k = ((ao)localObject2).e().read(arrayOfByte1);
      if (k <= 0) {
        break;
      }
      int j = i + k;
      byte[] arrayOfByte2 = new byte[k];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
      ((ArrayList)localObject1).add(arrayOfByte2);
      i = j;
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetConnTag", 2, " read " + arrayOfByte2.length);
        i = j;
      }
    }
    if (((ArrayList)localObject1).size() == 1) {
      this.a.c.c((byte[])((ArrayList)localObject1).get(0));
    }
    label278:
    while (!paramMsfSocketInputBuffer.hasBufferedData())
    {
      return;
      localObject2 = new byte[i];
      localObject1 = ((ArrayList)localObject1).iterator();
      for (i = 0; ((Iterator)localObject1).hasNext(); i = arrayOfByte1.length + i)
      {
        arrayOfByte1 = (byte[])((Iterator)localObject1).next();
        System.arraycopy(arrayOfByte1, 0, localObject2, i, arrayOfByte1.length);
      }
      this.a.c.c((byte[])localObject2);
    }
  }
  
  public byte[] a(c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
    int k = a(arrayOfByte1);
    if (paramArrayOfByte.length > k)
    {
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      int i = 0;
      for (;;)
      {
        int m = i;
        if (paramArrayOfByte.length >= k)
        {
          byte[] arrayOfByte2 = new byte[k];
          System.arraycopy(paramArrayOfByte, j, arrayOfByte2, 0, arrayOfByte2.length);
          byte[] arrayOfByte3 = b(paramc, paramString1, paramString2, arrayOfByte2);
          i += arrayOfByte3.length;
          localArrayList.add(arrayOfByte3);
          j += arrayOfByte2.length;
          if (j >= paramArrayOfByte.length) {
            m = i;
          }
        }
        else
        {
          paramc = new byte[m];
          paramString1 = localArrayList.iterator();
          for (i = 0; paramString1.hasNext(); i = paramString2.length + i)
          {
            paramString2 = (byte[])paramString1.next();
            System.arraycopy(paramString2, 0, paramc, i, paramString2.length);
          }
        }
        System.arraycopy(paramArrayOfByte, j, arrayOfByte1, 0, arrayOfByte1.length);
        k = a(arrayOfByte1);
      }
      return paramc;
    }
    return b(paramc, paramString1, paramString2, paramArrayOfByte);
  }
  
  protected byte[] b(c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    paramc = ("POST / HTTP/1.1\r\nConnection: Keep-Alive\r\nHost: " + paramc.c() + ":" + paramc.d() + "\r\n" + "Accept: */*\r\n" + "User-Agent: javaMsfClient\r\n" + "Content-Type: application/x-www-form-urlencoded\r\n" + "Content-Length: " + paramArrayOfByte.length + "\r\n\r\n").getBytes();
    paramString1 = new byte[paramc.length + paramArrayOfByte.length];
    System.arraycopy(paramc, 0, paramString1, 0, paramc.length);
    System.arraycopy(paramArrayOfByte, 0, paramString1, paramc.length, paramArrayOfByte.length);
    return paramString1;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */