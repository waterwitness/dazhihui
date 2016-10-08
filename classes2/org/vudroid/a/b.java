package org.vudroid.a;

import android.content.ContentResolver;
import android.net.Uri;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.vudroid.a.a.c;

public class b
  implements a
{
  private final org.vudroid.a.a.a a;
  private org.vudroid.a.a.b b;
  private final ExecutorService c = Executors.newSingleThreadExecutor();
  private final Map<Object, Future<?>> d = new ConcurrentHashMap();
  private final HashMap<Integer, SoftReference<c>> e = new HashMap();
  private ContentResolver f;
  private Queue<Integer> g = new LinkedList();
  
  public b(org.vudroid.a.a.a parama)
  {
    this.a = parama;
  }
  
  public int a()
  {
    return this.b.a();
  }
  
  public int a(int paramInt)
  {
    return c(paramInt).a();
  }
  
  public void a(ContentResolver paramContentResolver)
  {
    this.f = paramContentResolver;
    this.a.a(paramContentResolver);
  }
  
  public void a(Uri paramUri)
  {
    this.b = this.a.a(org.vudroid.a.b.a.a(this.f, paramUri));
  }
  
  public int b(int paramInt)
  {
    return c(paramInt).b();
  }
  
  public c c(int paramInt)
  {
    if ((!this.e.containsKey(Integer.valueOf(paramInt))) || (((SoftReference)this.e.get(Integer.valueOf(paramInt))).get() == null))
    {
      this.e.put(Integer.valueOf(paramInt), new SoftReference(this.b.a(paramInt)));
      this.g.remove(Integer.valueOf(paramInt));
      this.g.offer(Integer.valueOf(paramInt));
      if (this.g.size() > 16)
      {
        Object localObject = (Integer)this.g.poll();
        localObject = (c)((SoftReference)this.e.remove(localObject)).get();
        if (localObject != null) {
          ((c)localObject).c();
        }
      }
    }
    return (c)((SoftReference)this.e.get(Integer.valueOf(paramInt))).get();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\vudroid\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */