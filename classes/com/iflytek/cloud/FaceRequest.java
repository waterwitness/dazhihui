package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.thirdparty.ae;
import com.iflytek.thirdparty.y;

public class FaceRequest
  extends y
{
  private ae a;
  private Context c;
  
  public FaceRequest(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public void cancel()
  {
    try
    {
      if (this.a != null)
      {
        this.a.a();
        this.a = null;
      }
      return;
    }
    finally {}
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public int sendRequest(byte[] paramArrayOfByte, RequestListener paramRequestListener)
  {
    try
    {
      if (this.a != null)
      {
        this.a.a();
        this.a = null;
      }
      this.a = new ae(this.c, this.b);
      int i = this.a.a(paramArrayOfByte, new FaceRequest.a(this, paramRequestListener));
      return i;
    }
    finally {}
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\FaceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */