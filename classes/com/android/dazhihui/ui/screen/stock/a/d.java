package com.android.dazhihui.ui.screen.stock.a;

import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

class d
  implements mc
{
  d(a parama) {}
  
  public void a(int paramInt)
  {
    TableLayoutGroup localTableLayoutGroup;
    if (a.a(this.a) == paramInt)
    {
      a.b(this.a, a.b(this.a) % 2);
      localTableLayoutGroup = this.a.a;
      if (a.c(this.a) != 0) {
        break label74;
      }
    }
    label74:
    for (boolean bool = false;; bool = true)
    {
      localTableLayoutGroup.a(paramInt, bool);
      this.a.a.a();
      a.a(this.a, 0, false);
      return;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    a.d(this.a).w();
    a.d(this.a).a(null);
    Object localObject1 = this.a.a.getDataModel();
    Vector localVector = new Vector();
    paramInt = 0;
    int i = 0;
    while (paramInt < ((List)localObject1).size())
    {
      localObject2 = (mh)((List)localObject1).get(paramInt);
      if (localObject2 == parammh) {
        i = paramInt;
      }
      String[] arrayOfString = new String[((mh)localObject2).a.length + 1];
      int j = 0;
      while (j < ((mh)localObject2).a.length)
      {
        arrayOfString[j] = localObject2.a[j];
        j += 1;
      }
      arrayOfString[j] = ((String)localObject2.k[0]);
      localVector.add(arrayOfString);
      paramInt += 1;
    }
    a.d(this.a).a(localVector);
    a.d(this.a).w(i);
    parammh = ((mh)((List)localObject1).get(i)).a;
    localObject1 = (String)((mh)localObject1.get(i)).k[0];
    localVector = parammh[0];
    Object localObject2 = new String[4];
    Arrays.fill((Object[])localObject2, "");
    System.arraycopy(parammh, 1, localObject2, 0, localObject2.length);
    a.a(this.a, (String)localObject1, localVector, (String[])localObject2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */