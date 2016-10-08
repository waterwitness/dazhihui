package qalsdk;

import android.text.TextUtils;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class bg
  extends be
{
  private String c;
  private URL d;
  private String e;
  private int f = 10000;
  private HttpURLConnection g;
  private int h;
  private String i;
  
  public bg(int paramInt1, String paramString1, String paramString2, int paramInt2, bf parambf)
  {
    super(paramInt1, parambf);
    this.c = (paramString1 + b(paramString1));
    this.c = MsfSdkUtils.insertMtype("netdetect", this.c);
    this.e = paramString2;
    this.f = paramInt2;
  }
  
  private String b(String paramString)
  {
    Object localObject = new Random(System.currentTimeMillis());
    localObject = "r=" + String.valueOf(((Random)localObject).nextInt(100000));
    if (paramString.contains("?"))
    {
      if (paramString.endsWith("?")) {
        return paramString + (String)localObject;
      }
      return (String)localObject + "&" + (String)localObject;
    }
    return "?" + (String)localObject;
  }
  
  protected int a(String paramString)
  {
    int k = -3;
    int j;
    if ((this.h == 200) && (this.d.getHost().equals(this.i)) && (!TextUtils.isEmpty(paramString)))
    {
      j = k;
      if (paramString.equals(this.e))
      {
        if (QLog.isColorLevel()) {
          QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " valid succ");
        }
        j = 0;
      }
    }
    do
    {
      do
      {
        return j;
        if (QLog.isColorLevel()) {
          QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " valid failed.");
        }
        j = k;
      } while (this.h == 302);
      j = k;
    } while (this.h == 301);
    QLog.i("HttpEchoTask", "wifi detect response:" + this.h);
    return -2;
  }
  
  protected boolean a()
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " try connect " + this.c);
      }
      this.d = new URL(this.c);
      this.g = ((HttpURLConnection)this.d.openConnection());
      this.g.setRequestMethod("GET");
      this.g.setDoInput(true);
      this.g.setUseCaches(false);
      this.g.setConnectTimeout(this.f);
      this.g.setReadTimeout(10000);
      this.g.connect();
      if (QLog.isColorLevel()) {
        QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " connect " + this.c + " succ.");
      }
      return true;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " connect " + this.c + " failed.");
      }
      if (this.g != null) {
        this.g.disconnect();
      }
    }
    return false;
  }
  
  protected void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " disconnect " + this.c);
    }
    if (this.g != null) {
      this.g.disconnect();
    }
  }
  
  protected String c()
  {
    try
    {
      this.h = this.g.getResponseCode();
      this.i = this.g.getURL().getHost();
      Object localObject1 = new BufferedReader(new InputStreamReader(this.g.getInputStream()));
      Object localObject2;
      for (String str = "";; str = str + (String)localObject2)
      {
        localObject2 = ((BufferedReader)localObject1).readLine();
        if (localObject2 == null) {
          break;
        }
      }
      ((BufferedReader)localObject1).close();
      if (QLog.isColorLevel())
      {
        localObject2 = new StringBuilder().append("WIFI detect, HttpEchoTask ").append(this.a).append(" echo content: ");
        if (str.length() <= 10) {
          break label149;
        }
      }
      label149:
      for (localObject1 = str.substring(0, 10);; localObject1 = str)
      {
        QLog.d("HttpEchoTask", 2, (String)localObject1);
        return str;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.d("HttpEchoTask", 2, "WIFI detect, HttpEchoTask " + this.a + " echo failed");
      }
    }
  }
  
  protected Object d()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */