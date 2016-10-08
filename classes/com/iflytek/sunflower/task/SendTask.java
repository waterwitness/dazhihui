package com.iflytek.sunflower.task;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.sunflower.c.c;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.d;
import com.iflytek.sunflower.e;
import com.iflytek.sunflower.f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class SendTask
  extends Thread
{
  private com.iflytek.sunflower.b.b a;
  private Context b;
  
  public SendTask(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  private JSONObject a()
  {
    Object localObject2 = d.e(this.b);
    if ((f.k() == 0) && (localObject2 == null)) {
      return null;
    }
    Object localObject1 = f.d().iterator();
    while (((Iterator)localObject1).hasNext()) {
      localObject2 = e.a((com.iflytek.sunflower.a.b)((Iterator)localObject1).next(), (JSONObject)localObject2);
    }
    localObject1 = f.c().iterator();
    while (((Iterator)localObject1).hasNext()) {
      localObject2 = e.a((com.iflytek.sunflower.a.a)((Iterator)localObject1).next(), (JSONObject)localObject2);
    }
    ArrayList localArrayList = f.a();
    localObject1 = localObject2;
    if (localArrayList.size() != 0) {
      localObject1 = e.b(e.a(localArrayList), (JSONObject)localObject2);
    }
    localArrayList = f.b();
    localObject2 = localObject1;
    if (localArrayList.size() != 0) {
      localObject2 = e.a(e.b(localArrayList), (JSONObject)localObject1);
    }
    f.j();
    return e.a((JSONObject)localObject2, e.a(this.b));
  }
  
  public void run()
  {
    try
    {
      send();
      return;
    }
    catch (Exception localException)
    {
      g.d("Collector", "send data error:" + localException);
    }
  }
  
  public void send()
  {
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty(com.iflytek.sunflower.config.a.c))
        {
          com.iflytek.sunflower.config.a.c = c.a(com.iflytek.sunflower.config.a.b);
          if (!com.iflytek.sunflower.config.a.c.equals("e906f11001b369f4f85d4f907fd70fc9"))
          {
            g.d("Collector", "your appkey is incorrect, please check Mainifest meta-data");
            com.iflytek.sunflower.config.a.d = false;
            return;
          }
          com.iflytek.sunflower.config.a.d = true;
          JSONObject localJSONObject1 = a();
          if (localJSONObject1 != null) {
            break label93;
          }
          g.a("Collector", "nothing to send");
          continue;
        }
        if (com.iflytek.sunflower.config.a.d) {
          continue;
        }
      }
      finally {}
      g.d("Collector", "your appkey is incorrect, please check Mainifest meta-data");
      com.iflytek.sunflower.config.a.d = false;
      continue;
      label93:
      g.b("Collector", "send: " + localJSONObject2.toString());
      this.a = new com.iflytek.sunflower.b.b(this.b);
      this.a.a(localJSONObject2, 0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\SendTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */