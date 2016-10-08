package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.d;
import com.tencent.wxop.stat.a.g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;

final class o
  implements Runnable
{
  private f bM = null;
  private Map<String, Integer> bO = null;
  private Context e = null;
  
  public o(Context paramContext)
  {
    this.e = paramContext;
    this.bM = null;
  }
  
  private static b a(String paramString, int paramInt)
  {
    b localb = new b();
    Socket localSocket = new Socket();
    int i = 0;
    for (;;)
    {
      try
      {
        localb.setDomain(paramString);
        localb.setPort(paramInt);
        long l = System.currentTimeMillis();
        paramString = new InetSocketAddress(paramString, paramInt);
        localSocket.connect(paramString, 30000);
        localb.a(System.currentTimeMillis() - l);
        localb.k(paramString.getAddress().getHostAddress());
        localSocket.close();
      }
      catch (IOException paramString)
      {
        paramString = paramString;
        paramInt = -1;
        e.K().b(paramString);
        try
        {
          localSocket.close();
        }
        catch (Throwable paramString)
        {
          e.K().b(paramString);
        }
        continue;
      }
      finally {}
      try
      {
        localSocket.close();
        paramInt = i;
      }
      catch (Throwable paramString)
      {
        e.K().b(paramString);
        paramInt = i;
      }
    }
    localb.setStatusCode(paramInt);
    return localb;
    try
    {
      localSocket.close();
      throw paramString;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        e.K().b(localThrowable);
      }
    }
  }
  
  private static Map<String, Integer> ag()
  {
    HashMap localHashMap = new HashMap();
    Object localObject = c.l("__MTA_TEST_SPEED__");
    if ((localObject == null) || (((String)localObject).trim().length() == 0)) {}
    for (;;)
    {
      return localHashMap;
      localObject = ((String)localObject).split(";");
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString = localObject[i].split(",");
        String str;
        if ((arrayOfString != null) && (arrayOfString.length == 2))
        {
          str = arrayOfString[0];
          if ((str == null) || (str.trim().length() == 0)) {}
        }
        try
        {
          int k = Integer.valueOf(arrayOfString[1]).intValue();
          localHashMap.put(str, Integer.valueOf(k));
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            e.K().b(localNumberFormatException);
          }
        }
        i += 1;
      }
    }
  }
  
  public final void run()
  {
    Object localObject;
    for (;;)
    {
      Map.Entry localEntry;
      String str;
      try
      {
        if (this.bO == null) {
          this.bO = ag();
        }
        if ((this.bO == null) || (this.bO.size() == 0))
        {
          e.K().b("empty domain list.");
          return;
        }
        JSONArray localJSONArray = new JSONArray();
        localObject = this.bO.entrySet().iterator();
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localEntry = (Map.Entry)((Iterator)localObject).next();
        str = (String)localEntry.getKey();
        if ((str == null) || (str.length() == 0))
        {
          e.K().c("empty domain name.");
          continue;
        }
        if ((Integer)localEntry.getValue() != null) {
          break label166;
        }
      }
      catch (Throwable localThrowable)
      {
        e.K().b(localThrowable);
        return;
      }
      e.K().c("port is null for " + str);
      continue;
      label166:
      localThrowable.put(a((String)localEntry.getKey(), ((Integer)localEntry.getValue()).intValue()).i());
    }
    if (localThrowable.length() != 0)
    {
      localObject = new g(this.e, e.a(this.e, false, this.bM), this.bM);
      ((g)localObject).b(localThrowable.toString());
      new p((d)localObject).ah();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */