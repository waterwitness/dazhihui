package qalsdk;

import android.text.TextUtils;
import com.tencent.qalsdk.util.QLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class bh
  extends be
{
  public static ArrayList<String> c = new ArrayList();
  private String d;
  private int e;
  private String f;
  private String g;
  private int h = 10000;
  private Socket i;
  private String j;
  
  public bh(int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3, bf parambf)
  {
    super(paramInt1, parambf);
    this.d = paramString1;
    this.e = paramInt2;
    this.f = (this.d + ":" + this.e);
    this.g = paramString2;
    this.h = paramInt3;
    this.j = "test";
  }
  
  protected int a(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(this.g)))
    {
      if (QLog.isColorLevel()) {
        QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " valid succ");
      }
      return 0;
    }
    if (QLog.isColorLevel()) {
      QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " valid failed.");
    }
    return -3;
  }
  
  protected boolean a()
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " try connect " + this.f);
      }
      InetSocketAddress localInetSocketAddress = new InetSocketAddress(this.d, this.e);
      this.i = new Socket();
      this.i.setSoTimeout(10000);
      this.i.setTcpNoDelay(true);
      this.i.setKeepAlive(true);
      this.i.connect(localInetSocketAddress, this.h);
      if (QLog.isColorLevel()) {
        QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " connect " + this.f + " succ.");
      }
      return true;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " connect " + this.f + " failed.");
      }
      if (this.i == null) {}
    }
    try
    {
      this.i.close();
      return false;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  protected void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " disconnect " + this.f);
    }
    if (this.i != null) {}
    try
    {
      c.clear();
      this.i.close();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  protected String c()
  {
    try
    {
      Object localObject1 = this.i.getOutputStream();
      c.add(localObject1.toString());
      Object localObject2 = this.i.getInputStream();
      c.add(localObject2.toString());
      localObject2 = new BufferedReader(new InputStreamReader((InputStream)localObject2));
      ((OutputStream)localObject1).write(this.j.getBytes());
      ((OutputStream)localObject1).flush();
      Object localObject3;
      for (localObject1 = "";; localObject1 = (String)localObject1 + (String)localObject3)
      {
        localObject3 = ((BufferedReader)localObject2).readLine();
        if (localObject3 == null) {
          break;
        }
      }
      ((BufferedReader)localObject2).close();
      if (QLog.isColorLevel())
      {
        localObject3 = new StringBuilder().append("WIFI detect, EchoTaskTcp ").append(this.a).append(" echo content: ");
        if (((String)localObject1).length() <= 10) {
          break label171;
        }
      }
      label171:
      for (localObject2 = ((String)localObject1).substring(0, 10);; localObject2 = localObject1)
      {
        QLog.d("EchoTaskTcp", 2, (String)localObject2);
        return (String)localObject1;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      c.clear();
      localThrowable.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.d("EchoTaskTcp", 2, "WIFI detect, EchoTaskTcp " + this.a + " echo failed");
      }
    }
  }
  
  protected Object d()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */