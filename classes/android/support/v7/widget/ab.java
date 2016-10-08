package android.support.v7.widget;

import java.util.List;

class ab
{
  final ac a;
  
  public ab(ac paramac)
  {
    this.a = paramac;
  }
  
  private void a(List<c> paramList, int paramInt1, int paramInt2)
  {
    c localc1 = (c)paramList.get(paramInt1);
    c localc2 = (c)paramList.get(paramInt2);
    switch (localc2.a)
    {
    case 3: 
    default: 
      return;
    case 2: 
      a(paramList, paramInt1, localc1, paramInt2, localc2);
      return;
    case 1: 
      c(paramList, paramInt1, localc1, paramInt2, localc2);
      return;
    }
    b(paramList, paramInt1, localc1, paramInt2, localc2);
  }
  
  private int b(List<c> paramList)
  {
    int i = 0;
    int j = paramList.size() - 1;
    if (j >= 0)
    {
      if (((c)paramList.get(j)).a == 8)
      {
        if (i == 0) {
          break label50;
        }
        return j;
      }
      i = 1;
    }
    label50:
    for (;;)
    {
      j -= 1;
      break;
      return -1;
    }
  }
  
  private void c(List<c> paramList, int paramInt1, c paramc1, int paramInt2, c paramc2)
  {
    int i = 0;
    if (paramc1.d < paramc2.b) {
      i = -1;
    }
    int j = i;
    if (paramc1.b < paramc2.b) {
      j = i + 1;
    }
    if (paramc2.b <= paramc1.b) {
      paramc1.b += paramc2.d;
    }
    if (paramc2.b <= paramc1.d) {
      paramc1.d += paramc2.d;
    }
    paramc2.b = (j + paramc2.b);
    paramList.set(paramInt1, paramc2);
    paramList.set(paramInt2, paramc1);
  }
  
  void a(List<c> paramList)
  {
    for (;;)
    {
      int i = b(paramList);
      if (i == -1) {
        break;
      }
      a(paramList, i, i + 1);
    }
  }
  
  void a(List<c> paramList, int paramInt1, c paramc1, int paramInt2, c paramc2)
  {
    int j = 0;
    int i;
    if (paramc1.b < paramc1.d)
    {
      if ((paramc2.b != paramc1.b) || (paramc2.d != paramc1.d - paramc1.b)) {
        break label623;
      }
      i = 1;
    }
    for (;;)
    {
      label70:
      c localc;
      if (paramc1.d < paramc2.b)
      {
        paramc2.b -= 1;
        if (paramc1.b > paramc2.b) {
          break label241;
        }
        paramc2.b += 1;
        localc = null;
      }
      for (;;)
      {
        label97:
        if (i != 0)
        {
          paramList.set(paramInt1, paramc2);
          paramList.remove(paramInt2);
          this.a.a(paramc1);
        }
        label241:
        label596:
        label606:
        for (;;)
        {
          return;
          if ((paramc2.b != paramc1.d + 1) || (paramc2.d != paramc1.b - paramc1.d)) {
            break label614;
          }
          j = 1;
          i = 1;
          break;
          if (paramc1.d >= paramc2.b + paramc2.d) {
            break label70;
          }
          paramc2.d -= 1;
          paramc1.a = 2;
          paramc1.d = 1;
          if (paramc2.d == 0)
          {
            paramList.remove(paramInt2);
            this.a.a(paramc2);
            return;
            if (paramc1.b >= paramc2.b + paramc2.d) {
              break label608;
            }
            int k = paramc2.b;
            int m = paramc2.d;
            int n = paramc1.b;
            localc = this.a.a(2, paramc1.b + 1, k + m - n, null);
            paramc2.d = (paramc1.b - paramc2.b);
            break label97;
            if (j != 0)
            {
              if (localc != null)
              {
                if (paramc1.b > localc.b) {
                  paramc1.b -= localc.d;
                }
                if (paramc1.d > localc.b) {
                  paramc1.d -= localc.d;
                }
              }
              if (paramc1.b > paramc2.b) {
                paramc1.b -= paramc2.d;
              }
              if (paramc1.d > paramc2.b) {
                paramc1.d -= paramc2.d;
              }
              paramList.set(paramInt1, paramc2);
              if (paramc1.b == paramc1.d) {
                break label596;
              }
              paramList.set(paramInt2, paramc1);
            }
            for (;;)
            {
              if (localc == null) {
                break label606;
              }
              paramList.add(paramInt1, localc);
              return;
              if (localc != null)
              {
                if (paramc1.b >= localc.b) {
                  paramc1.b -= localc.d;
                }
                if (paramc1.d >= localc.b) {
                  paramc1.d -= localc.d;
                }
              }
              if (paramc1.b >= paramc2.b) {
                paramc1.b -= paramc2.d;
              }
              if (paramc1.d < paramc2.b) {
                break;
              }
              paramc1.d -= paramc2.d;
              break;
              paramList.remove(paramInt2);
            }
          }
        }
        label608:
        localc = null;
      }
      label614:
      i = 0;
      j = 1;
      continue;
      label623:
      i = 0;
    }
  }
  
  void b(List<c> paramList, int paramInt1, c paramc1, int paramInt2, c paramc2)
  {
    Object localObject2 = null;
    Object localObject1;
    if (paramc1.d < paramc2.b)
    {
      paramc2.b -= 1;
      localObject1 = null;
    }
    for (;;)
    {
      if (paramc1.b <= paramc2.b)
      {
        paramc2.b += 1;
        label54:
        paramList.set(paramInt2, paramc1);
        if (paramc2.d <= 0) {
          break label243;
        }
        paramList.set(paramInt1, paramc2);
      }
      for (;;)
      {
        if (localObject1 != null) {
          paramList.add(paramInt1, localObject1);
        }
        if (localObject2 != null) {
          paramList.add(paramInt1, localObject2);
        }
        return;
        if (paramc1.d >= paramc2.b + paramc2.d) {
          break label265;
        }
        paramc2.d -= 1;
        localObject1 = this.a.a(4, paramc1.b, 1, paramc2.c);
        break;
        if (paramc1.b >= paramc2.b + paramc2.d) {
          break label54;
        }
        int i = paramc2.b + paramc2.d - paramc1.b;
        localObject2 = this.a.a(4, paramc1.b + 1, i, paramc2.c);
        paramc2.d -= i;
        break label54;
        label243:
        paramList.remove(paramInt1);
        this.a.a(paramc2);
      }
      label265:
      localObject1 = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */