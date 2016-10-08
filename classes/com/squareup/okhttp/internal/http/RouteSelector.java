package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.RouteDatabase;
import com.squareup.okhttp.internal.Dns;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public final class RouteSelector
{
  private static final int TLS_MODE_COMPATIBLE = 0;
  private static final int TLS_MODE_MODERN = 1;
  private static final int TLS_MODE_NULL = -1;
  private final Address address;
  private final Dns dns;
  private boolean hasNextProxy;
  private InetSocketAddress lastInetSocketAddress;
  private Proxy lastProxy;
  private int nextSocketAddressIndex;
  private int nextTlsMode = -1;
  private final ConnectionPool pool;
  private final List<Route> postponedRoutes;
  private final ProxySelector proxySelector;
  private Iterator<Proxy> proxySelectorProxies;
  private final RouteDatabase routeDatabase;
  private InetAddress[] socketAddresses;
  private int socketPort;
  private final URI uri;
  private Proxy userSpecifiedProxy;
  
  public RouteSelector(Address paramAddress, URI paramURI, ProxySelector paramProxySelector, ConnectionPool paramConnectionPool, Dns paramDns, RouteDatabase paramRouteDatabase)
  {
    this.address = paramAddress;
    this.uri = paramURI;
    this.proxySelector = paramProxySelector;
    this.pool = paramConnectionPool;
    this.dns = paramDns;
    this.routeDatabase = paramRouteDatabase;
    this.postponedRoutes = new LinkedList();
    resetNextProxy(paramURI, paramAddress.getProxy());
  }
  
  private boolean hasNextInetSocketAddress()
  {
    return this.socketAddresses != null;
  }
  
  private boolean hasNextPostponed()
  {
    return !this.postponedRoutes.isEmpty();
  }
  
  private boolean hasNextProxy()
  {
    return this.hasNextProxy;
  }
  
  private boolean hasNextTlsMode()
  {
    return this.nextTlsMode != -1;
  }
  
  private InetSocketAddress nextInetSocketAddress()
  {
    Object localObject = this.socketAddresses;
    int i = this.nextSocketAddressIndex;
    this.nextSocketAddressIndex = (i + 1);
    localObject = new InetSocketAddress(localObject[i], this.socketPort);
    if (this.nextSocketAddressIndex == this.socketAddresses.length)
    {
      this.socketAddresses = null;
      this.nextSocketAddressIndex = 0;
    }
    return (InetSocketAddress)localObject;
  }
  
  private Route nextPostponed()
  {
    return (Route)this.postponedRoutes.remove(0);
  }
  
  private Proxy nextProxy()
  {
    if (this.userSpecifiedProxy != null)
    {
      this.hasNextProxy = false;
      return this.userSpecifiedProxy;
    }
    if (this.proxySelectorProxies != null) {}
    Proxy localProxy;
    do
    {
      if (!this.proxySelectorProxies.hasNext())
      {
        this.hasNextProxy = false;
        return Proxy.NO_PROXY;
      }
      localProxy = (Proxy)this.proxySelectorProxies.next();
    } while (localProxy.type() == Proxy.Type.DIRECT);
    return localProxy;
  }
  
  private int nextTlsMode()
  {
    if (this.nextTlsMode == 1)
    {
      this.nextTlsMode = 0;
      return 1;
    }
    if (this.nextTlsMode == 0)
    {
      this.nextTlsMode = -1;
      return 0;
    }
    throw new AssertionError();
  }
  
  private void resetNextInetSocketAddress(Proxy paramProxy)
  {
    this.socketAddresses = null;
    if (paramProxy.type() == Proxy.Type.DIRECT) {
      paramProxy = this.uri.getHost();
    }
    InetSocketAddress localInetSocketAddress;
    for (this.socketPort = Util.getEffectivePort(this.uri);; this.socketPort = localInetSocketAddress.getPort())
    {
      this.socketAddresses = this.dns.getAllByName(paramProxy);
      this.nextSocketAddressIndex = 0;
      return;
      paramProxy = paramProxy.address();
      if (!(paramProxy instanceof InetSocketAddress)) {
        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + paramProxy.getClass());
      }
      localInetSocketAddress = (InetSocketAddress)paramProxy;
      paramProxy = localInetSocketAddress.getHostName();
    }
  }
  
  private void resetNextProxy(URI paramURI, Proxy paramProxy)
  {
    this.hasNextProxy = true;
    if (paramProxy != null) {
      this.userSpecifiedProxy = paramProxy;
    }
    do
    {
      return;
      paramURI = this.proxySelector.select(paramURI);
    } while (paramURI == null);
    this.proxySelectorProxies = paramURI.iterator();
  }
  
  private void resetNextTlsMode()
  {
    if (this.address.getSslSocketFactory() != null) {}
    for (int i = 1;; i = 0)
    {
      this.nextTlsMode = i;
      return;
    }
  }
  
  public void connectFailed(Connection paramConnection, IOException paramIOException)
  {
    paramConnection = paramConnection.getRoute();
    if ((paramConnection.getProxy().type() != Proxy.Type.DIRECT) && (this.proxySelector != null)) {
      this.proxySelector.connectFailed(this.uri, paramConnection.getProxy().address(), paramIOException);
    }
    this.routeDatabase.failed(paramConnection, paramIOException);
  }
  
  public boolean hasNext()
  {
    return (hasNextTlsMode()) || (hasNextInetSocketAddress()) || (hasNextProxy()) || (hasNextPostponed());
  }
  
  public Connection next(String paramString)
  {
    boolean bool = true;
    Object localObject;
    for (;;)
    {
      localObject = this.pool.get(this.address);
      if (localObject == null)
      {
        if (hasNextTlsMode()) {
          break label119;
        }
        if (hasNextInetSocketAddress()) {
          break label107;
        }
        if (hasNextProxy()) {
          break label91;
        }
        if (hasNextPostponed()) {
          break;
        }
        throw new NoSuchElementException();
      }
      if ((paramString.equals("GET")) || (((Connection)localObject).isReadable())) {
        return (Connection)localObject;
      }
      ((Connection)localObject).close();
    }
    return new Connection(nextPostponed());
    label91:
    this.lastProxy = nextProxy();
    resetNextInetSocketAddress(this.lastProxy);
    label107:
    this.lastInetSocketAddress = nextInetSocketAddress();
    resetNextTlsMode();
    label119:
    if (nextTlsMode() == 1) {}
    for (;;)
    {
      localObject = new Route(this.address, this.lastProxy, this.lastInetSocketAddress, bool);
      if (!this.routeDatabase.shouldPostpone((Route)localObject)) {
        break;
      }
      this.postponedRoutes.add(localObject);
      return next(paramString);
      bool = false;
    }
    return new Connection((Route)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\RouteSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */