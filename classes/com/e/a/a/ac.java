package com.e.a.a;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public abstract interface ac
{
  public abstract boolean getUseSynchronousMode();
  
  public abstract void onPostProcessResponse(ac paramac, HttpResponse paramHttpResponse);
  
  public abstract void onPreProcessResponse(ac paramac, HttpResponse paramHttpResponse);
  
  public abstract void sendCancelMessage();
  
  public abstract void sendFailureMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);
  
  public abstract void sendFinishMessage();
  
  public abstract void sendProgressMessage(int paramInt1, int paramInt2);
  
  public abstract void sendResponseMessage(HttpResponse paramHttpResponse);
  
  public abstract void sendRetryMessage(int paramInt);
  
  public abstract void sendStartMessage();
  
  public abstract void setRequestHeaders(Header[] paramArrayOfHeader);
  
  public abstract void setRequestURI(URI paramURI);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */