package qalsdk;

import com.tencent.qalsdk.util.MsfSocketInputBuffer;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.StatusLine;

public class ao
{
  private final MsfSocketInputBuffer a;
  private InputStream b;
  private StatusLine c;
  private Header[] d;
  private String e;
  private String f;
  private int g = -1;
  private String h;
  private String i;
  
  public ao(MsfSocketInputBuffer paramMsfSocketInputBuffer)
  {
    this.a = paramMsfSocketInputBuffer;
  }
  
  public StatusLine a()
  {
    return this.c;
  }
  
  public void a(InputStream paramInputStream)
  {
    this.b = paramInputStream;
  }
  
  public void a(StatusLine paramStatusLine)
  {
    this.c = paramStatusLine;
  }
  
  public void a(Header[] paramArrayOfHeader)
  {
    this.d = paramArrayOfHeader;
    int j = paramArrayOfHeader.length - 1;
    if (j >= 0)
    {
      Header localHeader = paramArrayOfHeader[j];
      if (localHeader.getName().equalsIgnoreCase("Transfer-Encoding")) {
        this.i = localHeader.getValue();
      }
      for (;;)
      {
        j -= 1;
        break;
        if (localHeader.getName().equalsIgnoreCase("Content-Length")) {
          this.g = Integer.parseInt(localHeader.getValue());
        } else if (localHeader.getName().equalsIgnoreCase("Connection")) {
          this.e = localHeader.getValue();
        } else if (localHeader.getName().equalsIgnoreCase("Content-Encoding")) {
          this.h = localHeader.getValue();
        } else if (localHeader.getName().equalsIgnoreCase("Content-Type")) {
          this.f = localHeader.getValue();
        }
      }
    }
  }
  
  public int b()
  {
    return this.g;
  }
  
  public String c()
  {
    return this.i;
  }
  
  public MsfSocketInputBuffer d()
  {
    return this.a;
  }
  
  public InputStream e()
  {
    return this.b;
  }
  
  public String toString()
  {
    return a() + " contentLen:" + b() + " transfer:" + this.i;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */