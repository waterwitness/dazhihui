package com.tencent.open;

import com.tencent.open.a.f;
import java.lang.reflect.Method;
import java.util.List;

public class a$b
{
  public void call(String paramString, List<String> paramList, a.a parama)
  {
    Method[] arrayOfMethod = getClass().getDeclaredMethods();
    Object localObject2 = null;
    int j = arrayOfMethod.length;
    int i = 0;
    for (;;)
    {
      Object localObject1 = localObject2;
      if (i < j)
      {
        localObject1 = arrayOfMethod[i];
        if ((!((Method)localObject1).getName().equals(paramString)) || (((Method)localObject1).getParameterTypes().length != paramList.size())) {}
      }
      else
      {
        if (localObject1 != null) {}
        for (;;)
        {
          try
          {
            switch (paramList.size())
            {
            case 0: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3), paramList.get(4), paramList.get(5) });
              paramList = ((Method)localObject1).getReturnType();
              f.b("openSDK_LOG.JsBridge", "-->call, result: " + paramString + " | ReturnType: " + paramList.getName());
              if (("void".equals(paramList.getName())) || (paramList == Void.class))
              {
                if (parama == null) {
                  break label571;
                }
                parama.a(null);
                return;
                paramString = ((Method)localObject1).invoke(this, new Object[0]);
              }
              break;
            case 1: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0) });
              break;
            case 2: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0), paramList.get(1) });
              break;
            case 3: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0), paramList.get(1), paramList.get(2) });
              break;
            case 4: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3) });
              break;
            case 5: 
              paramString = ((Method)localObject1).invoke(this, new Object[] { paramList.get(0), paramList.get(1), paramList.get(2), paramList.get(3), paramList.get(4) });
              continue;
              if ((parama == null) || (!customCallback())) {
                break label571;
              }
              if (paramString == null) {
                break label554;
              }
              paramString = paramString.toString();
              parama.a(paramString);
              return;
            }
          }
          catch (Exception paramString)
          {
            f.b("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + localObject1, paramString);
            if (parama == null) {
              break;
            }
          }
          parama.a();
          return;
          label554:
          paramString = null;
          continue;
          if (parama == null) {
            break;
          }
          parama.a();
          return;
        }
        label571:
        return;
      }
      i += 1;
    }
  }
  
  public boolean customCallback()
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */