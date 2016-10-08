package com.squareup.okhttp;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;

public final class RouteDatabase
{
  private final Set<Route> failedRoutes = new LinkedHashSet();
  
  public void connected(Route paramRoute)
  {
    try
    {
      this.failedRoutes.remove(paramRoute);
      return;
    }
    finally
    {
      paramRoute = finally;
      throw paramRoute;
    }
  }
  
  public void failed(Route paramRoute, IOException paramIOException)
  {
    try
    {
      this.failedRoutes.add(paramRoute);
      if (!(paramIOException instanceof SSLHandshakeException)) {
        this.failedRoutes.add(paramRoute.flipTlsMode());
      }
      return;
    }
    finally
    {
      paramRoute = finally;
      throw paramRoute;
    }
  }
  
  public int failedRoutesCount()
  {
    try
    {
      int i = this.failedRoutes.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean shouldPostpone(Route paramRoute)
  {
    try
    {
      boolean bool = this.failedRoutes.contains(paramRoute);
      return bool;
    }
    finally
    {
      paramRoute = finally;
      throw paramRoute;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\RouteDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */