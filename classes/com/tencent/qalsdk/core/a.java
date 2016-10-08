package com.tencent.qalsdk.core;

import com.qq.taf.jce.HexUtil;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.util.CodecWarpper;
import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
  private static final String a = "MSF.C.AccountCenter";
  private static final String b = "key_account_head_";
  private String c = null;
  private ConcurrentHashMap<String, com.tencent.qalsdk.sdk.a> d = new ConcurrentHashMap();
  
  private void a(ArrayList<com.tencent.qalsdk.sdk.a> paramArrayList)
  {
    if (paramArrayList.size() == 0)
    {
      String[] arrayOfString = l.a().getConfigList("key_account_head_");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        QLog.d("MSF.C.AccountCenter", 1, "try load accounts " + arrayOfString.length);
        int j = arrayOfString.length;
        int i = 0;
        for (;;)
        {
          if (i < j)
          {
            Object localObject = arrayOfString[i];
            try
            {
              localObject = new JceInputStream(HexUtil.hexStr2Bytes((String)localObject));
              com.tencent.qalsdk.sdk.a locala = new com.tencent.qalsdk.sdk.a();
              locala.readFrom((JceInputStream)localObject);
              paramArrayList.add(locala);
              QLog.i("MSF.C.AccountCenter", 2, "load account tinyid:" + locala.d() + " registed:" + locala.i());
              i += 1;
            }
            catch (Throwable localThrowable)
            {
              for (;;)
              {
                QLog.w("MSF.C.AccountCenter", 1, "parse account error " + localThrowable.toString(), localThrowable);
              }
            }
          }
        }
      }
    }
  }
  
  private void b(com.tencent.qalsdk.sdk.a parama)
  {
    try
    {
      c(parama);
      o.l = parama.f;
      CodecWarpper.setAccountKey(parama.b, null, parama.c, null, null, parama.d, null, parama.e, null, null);
      o.a(parama.b, false);
      QLog.d("MSF.C.AccountCenter", 2, "handle account " + parama.b);
      return;
    }
    catch (Throwable parama)
    {
      QLog.e("MSF.C.AccountCenter", 1, "parse account error " + parama.toString(), parama);
    }
  }
  
  private void c(com.tencent.qalsdk.sdk.a parama)
  {
    this.d.put(parama.d(), parama);
  }
  
  private void e(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {
      l.a().n_removeConfig("key_account_head_" + paramString);
    }
  }
  
  private void f(String paramString)
  {
    Object localObject = c(paramString);
    JceOutputStream localJceOutputStream = new JceOutputStream();
    ((com.tencent.qalsdk.sdk.a)localObject).writeTo(localJceOutputStream);
    localObject = HexUtil.bytes2HexStr(localJceOutputStream.toByteArray());
    l.a().n_setConfig("key_account_head_" + paramString, (String)localObject);
    QLog.i("MSF.C.AccountCenter", 4, "storeAccount tinyID:" + paramString);
  }
  
  public void a()
  {
    Object localObject = new ArrayList();
    a((ArrayList)localObject);
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      b((com.tencent.qalsdk.sdk.a)((Iterator)localObject).next());
    }
  }
  
  public void a(com.tencent.qalsdk.sdk.a parama)
  {
    try
    {
      c(parama);
      o.l = parama.f;
      CodecWarpper.setAccountKey(parama.b, null, parama.c, null, null, parama.d, null, parama.e, null, null);
      o.a(parama.d(), false);
      this.c = parama.b;
      f(parama.b);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public void a(String paramString, long paramLong)
  {
    try
    {
      paramString = c(paramString);
      if (paramString != null) {
        paramString.a(paramLong);
      }
      return;
    }
    finally {}
  }
  
  public boolean a(String paramString)
  {
    e(paramString);
    QLog.i("MSF.C.AccountCenter", 2, "del user " + paramString + " succ.");
    return true;
  }
  
  public ArrayList<String> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((String)localIterator.next());
    }
    return localArrayList;
  }
  
  public boolean b(String paramString)
  {
    paramString = c(paramString);
    return (paramString != null) && (paramString.g == 1);
  }
  
  com.tencent.qalsdk.sdk.a c(String paramString)
  {
    return (com.tencent.qalsdk.sdk.a)this.d.get(paramString);
  }
  
  public String c()
  {
    return this.c;
  }
  
  public long d(String paramString)
  {
    paramString = c(paramString);
    if (paramString != null) {
      return paramString.j();
    }
    return 0L;
  }
  
  public ConcurrentHashMap<String, com.tencent.qalsdk.sdk.a> d()
  {
    return this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */