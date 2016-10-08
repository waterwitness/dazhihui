package qalsdk;

import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.util.MsfSocketInputBuffer;

public class bc
  implements an
{
  j a;
  
  public bc(j paramj)
  {
    this.a = paramj;
  }
  
  public void a(MsfSocketInputBuffer paramMsfSocketInputBuffer)
  {
    byte[] arrayOfByte = new byte[paramMsfSocketInputBuffer.getBufferlen()];
    System.arraycopy(paramMsfSocketInputBuffer.getBuffer(), 0, arrayOfByte, 0, arrayOfByte.length);
    this.a.c.c(arrayOfByte);
  }
  
  public byte[] a(c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    return paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */