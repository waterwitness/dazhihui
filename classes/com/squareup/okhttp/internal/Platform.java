package com.squareup.okhttp.internal;

import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.net.ssl.SSLSocket;

public class Platform
{
  private static final Platform PLATFORM = ;
  private Constructor<DeflaterOutputStream> deflaterConstructor;
  
  private static Platform findPlatform()
  {
    try
    {
      localClass1 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      try
      {
        Object localObject3;
        Object localObject4;
        for (;;)
        {
          Class localClass1;
          localObject3 = localClass1.getMethod("setUseSessionTickets", new Class[] { Boolean.TYPE });
          localObject4 = localClass1.getMethod("setHostname", new Class[] { String.class });
          try
          {
            Platform.Android41 localAndroid41 = new Platform.Android41(localClass1, (Method)localObject3, (Method)localObject4, localClass1.getMethod("setNpnProtocols", new Class[] { byte[].class }), localClass1.getMethod("getNpnSelectedProtocol", new Class[0]), null);
            return localAndroid41;
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            Object localObject1 = new Platform.Android23((Class)localObject1, (Method)localObject3, (Method)localObject4, null, null);
            return (Platform)localObject1;
          }
          localClassNotFoundException1 = localClassNotFoundException1;
          localObject1 = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
        }
        try
        {
          Object localObject2 = Class.forName("org.eclipse.jetty.npn.NextProtoNego");
          localObject3 = Class.forName("org.eclipse.jetty.npn.NextProtoNego" + "$Provider");
          localObject4 = Class.forName("org.eclipse.jetty.npn.NextProtoNego" + "$ClientProvider");
          Class localClass2 = Class.forName("org.eclipse.jetty.npn.NextProtoNego" + "$ServerProvider");
          localObject2 = new Platform.JdkWithJettyNpnPlatform(((Class)localObject2).getMethod("put", new Class[] { SSLSocket.class, localObject3 }), ((Class)localObject2).getMethod("get", new Class[] { SSLSocket.class }), (Class)localObject4, localClass2);
          return (Platform)localObject2;
        }
        catch (ClassNotFoundException localClassNotFoundException3)
        {
          return new Platform();
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          for (;;) {}
        }
      }
      catch (ClassNotFoundException localClassNotFoundException2) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;) {}
    }
  }
  
  public static Platform get()
  {
    return PLATFORM;
  }
  
  public void connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    paramSocket.connect(paramInetSocketAddress, paramInt);
  }
  
  public void enableTlsExtensions(SSLSocket paramSSLSocket, String paramString) {}
  
  public byte[] getNpnSelectedProtocol(SSLSocket paramSSLSocket)
  {
    return null;
  }
  
  public String getPrefix()
  {
    return "OkHttp";
  }
  
  public void logW(String paramString)
  {
    System.out.println(paramString);
  }
  
  public OutputStream newDeflaterOutputStream(OutputStream paramOutputStream, Deflater paramDeflater, boolean paramBoolean)
  {
    try
    {
      Constructor localConstructor2 = this.deflaterConstructor;
      Constructor localConstructor1 = localConstructor2;
      if (localConstructor2 == null)
      {
        localConstructor1 = DeflaterOutputStream.class.getConstructor(new Class[] { OutputStream.class, Deflater.class, Boolean.TYPE });
        this.deflaterConstructor = localConstructor1;
      }
      paramOutputStream = (OutputStream)localConstructor1.newInstance(new Object[] { paramOutputStream, paramDeflater, Boolean.valueOf(paramBoolean) });
      return paramOutputStream;
    }
    catch (NoSuchMethodException paramOutputStream)
    {
      throw new UnsupportedOperationException("Cannot SPDY; no SYNC_FLUSH available");
    }
    catch (InvocationTargetException paramOutputStream)
    {
      if ((paramOutputStream.getCause() instanceof RuntimeException)) {}
      for (paramOutputStream = (RuntimeException)paramOutputStream.getCause();; paramOutputStream = new RuntimeException(paramOutputStream.getCause())) {
        throw paramOutputStream;
      }
    }
    catch (InstantiationException paramOutputStream)
    {
      throw new RuntimeException(paramOutputStream);
    }
    catch (IllegalAccessException paramOutputStream)
    {
      throw new AssertionError();
    }
  }
  
  public void setNpnProtocols(SSLSocket paramSSLSocket, byte[] paramArrayOfByte) {}
  
  public void supportTlsIntolerantServer(SSLSocket paramSSLSocket)
  {
    paramSSLSocket.setEnabledProtocols(new String[] { "SSLv3" });
  }
  
  public void tagSocket(Socket paramSocket) {}
  
  public URI toUriLenient(URL paramURL)
  {
    return paramURL.toURI();
  }
  
  public void untagSocket(Socket paramSocket) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\Platform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */