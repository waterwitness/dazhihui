package com.android.dazhihui.ui.widget.b;

import com.android.dazhihui.ui.screen.BaseActivity;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class a
{
  int a;
  int b;
  private String c = "UTF-8";
  private b d = new b();
  private e e = new e(this);
  
  public a(BaseActivity paramBaseActivity)
  {
    this.e.a(paramBaseActivity);
  }
  
  public String a()
  {
    return this.e.b();
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    b(paramArrayOfByte);
  }
  
  public String b()
  {
    return this.e.c();
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    Object localObject = new ByteArrayInputStream(paramArrayOfByte, 0, paramArrayOfByte.length);
    try
    {
      paramArrayOfByte = new InputStreamReader((InputStream)localObject, this.c);
      paramArrayOfByte = this.d.a(paramArrayOfByte);
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        try
        {
          localObject = this.d.a(paramArrayOfByte);
          this.e.a();
          this.e.a((Vector)localObject, null);
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          this.e.a();
          this.e.a(paramArrayOfByte, null);
        }
        paramArrayOfByte = paramArrayOfByte;
        paramArrayOfByte.printStackTrace();
        paramArrayOfByte = new InputStreamReader((InputStream)localObject);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */