package com.alipay.d.a.a.e;

import com.alipay.d.a.a.c.b.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

public final class b
{
  private File a = null;
  private a b = null;
  
  public b(String paramString, a parama)
  {
    this.a = new File(paramString);
    this.b = parama;
  }
  
  private static String a(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "id");
      localJSONObject.put("error", paramString);
      return localJSONObject.toString();
    }
    catch (Exception paramString) {}
    return "";
  }
  
  private void b()
  {
    int j = 0;
    for (;;)
    {
      try
      {
        Object localObject1 = this.a;
        if (localObject1 == null) {
          return;
        }
        if ((this.a.exists()) && (this.a.isDirectory()) && (this.a.list().length != 0))
        {
          ArrayList localArrayList = new ArrayList();
          localObject1 = this.a.list();
          int k = localObject1.length;
          int i = 0;
          if (i < k)
          {
            localArrayList.add(localObject1[i]);
            i += 1;
          }
          else
          {
            Collections.sort(localArrayList);
            localObject1 = (String)localArrayList.get(localArrayList.size() - 1);
            i = localArrayList.size();
            Object localObject3 = Calendar.getInstance().getTime();
            localObject3 = new SimpleDateFormat("yyyyMMdd").format((Date)localObject3);
            if (((String)localObject1).equals((String)localObject3 + ".log")) {
              if (localArrayList.size() >= 2)
              {
                localObject1 = (String)localArrayList.get(localArrayList.size() - 2);
                i -= 1;
                localObject1 = a(com.alipay.d.a.a.a.b.a(this.a.getAbsolutePath(), (String)localObject1));
                if (!this.b.a((String)localObject1))
                {
                  i -= 1;
                  if (j < i)
                  {
                    localObject1 = (String)localArrayList.get(j);
                    new File(this.a, (String)localObject1).delete();
                    j += 1;
                    continue;
                  }
                }
                else
                {
                  continue;
                }
              }
            }
          }
        }
      }
      finally {}
    }
  }
  
  public final void a()
  {
    new Thread(new c(this)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */