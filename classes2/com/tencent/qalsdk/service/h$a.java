package com.tencent.qalsdk.service;

import com.tencent.qalsdk.util.QLog;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

class h$a
{
  public long[] a = null;
  public long[] b = null;
  
  public h$a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    this.a = paramArrayOfLong1;
    this.b = paramArrayOfLong2;
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    if (this.a == null)
    {
      this.a = new long[1];
      this.a[0] = paramLong;
      this.b = new long[1];
    }
    long l1;
    int j;
    Object localObject;
    int i;
    if (paramBoolean)
    {
      l1 = 2L;
      j = Arrays.binarySearch(this.a, paramLong);
      localObject = new StringBuilder().append(paramLong).append(" is the ");
      if (j >= 0) {
        break label289;
      }
      i = -j - 1;
      label77:
      QLog.d("GuardManager", 2, i + "th of " + Arrays.toString(this.a));
      if (j >= 0) {
        break label845;
      }
      i = -j - 1;
      if (i <= 0) {
        break label929;
      }
    }
    label289:
    label845:
    label918:
    label929:
    for (long l2 = paramLong - this.a[(i - 1)];; l2 = Long.MAX_VALUE)
    {
      if (i < this.a.length) {}
      for (long l3 = this.a[i] - paramLong;; l3 = Long.MAX_VALUE)
      {
        if ((l2 <= h.b() * 2L) || (l3 <= h.b() * 2L))
        {
          if (l2 >= l3) {
            break label918;
          }
          i -= 1;
        }
        for (;;)
        {
          this.a[i] = (this.a[i] * this.b[i] + paramLong * l1);
          localObject = this.b;
          localObject[i] = (l1 + localObject[i]);
          localObject = this.a;
          localObject[i] /= this.b[i];
          for (;;)
          {
            QLog.d("GuardManager", 2, Arrays.toString(this.a));
            return;
            l1 = 1L;
            break;
            i = j;
            break label77;
            int k = this.a.length;
            localObject = new ArrayList(k * 2);
            j = 0;
            while (j < i)
            {
              ((ArrayList)localObject).add(Long.valueOf(this.a[j]));
              ((ArrayList)localObject).add(Long.valueOf(this.b[j]));
              j += 1;
            }
            ((ArrayList)localObject).add(Long.valueOf(paramLong));
            ((ArrayList)localObject).add(Long.valueOf(l1));
            while (i < k)
            {
              ((ArrayList)localObject).add(Long.valueOf(this.a[i]));
              ((ArrayList)localObject).add(Long.valueOf(this.b[i]));
              i += 1;
            }
            if (((ArrayList)localObject).size() > 56)
            {
              l1 = ((Long)((ArrayList)localObject).get(0)).longValue();
              paramLong = ((Long)((ArrayList)localObject).get(1)).longValue();
              k = ((ArrayList)localObject).size() / 2;
              i = 0;
              j = 1;
              if (j < k)
              {
                l3 = ((Long)((ArrayList)localObject).get(j * 2)).longValue();
                long l4 = ((Long)((ArrayList)localObject).get(j * 2 + 1)).longValue();
                if (l3 - l1 < h.b() * 3L)
                {
                  l2 = l4 + paramLong;
                  paramLong = (l3 * l4 + l1 * paramLong) / l2;
                  l1 = l2;
                }
                for (;;)
                {
                  j += 1;
                  l2 = paramLong;
                  paramLong = l1;
                  l1 = l2;
                  break;
                  ((ArrayList)localObject).set(i * 2, Long.valueOf(l1));
                  ((ArrayList)localObject).set(i * 2 + 1, Long.valueOf(paramLong));
                  i += 1;
                  l1 = l4;
                  paramLong = l3;
                }
              }
              ((ArrayList)localObject).set(i * 2, Long.valueOf(l1));
              ((ArrayList)localObject).set(i * 2 + 1, Long.valueOf(paramLong));
              j = i + 1;
              this.a = new long[j];
              this.b = new long[j];
              i = 0;
              while (i < j)
              {
                this.a[i] = ((Long)((ArrayList)localObject).get(i * 2)).longValue();
                this.b[i] = ((Long)((ArrayList)localObject).get(i * 2 + 1)).longValue();
                i += 1;
              }
            }
            else
            {
              j = ((ArrayList)localObject).size() / 2;
              this.a = new long[j];
              this.b = new long[j];
              i = 0;
              while (i < j)
              {
                this.a[i] = ((Long)((ArrayList)localObject).get(i * 2)).longValue();
                this.b[i] = ((Long)((ArrayList)localObject).get(i * 2 + 1)).longValue();
                i += 1;
              }
              continue;
              this.a[j] = (this.a[j] * this.b[j] + paramLong * l1);
              localObject = this.b;
              localObject[j] = (l1 + localObject[j]);
              localObject = this.a;
              localObject[j] /= this.b[j];
            }
          }
        }
      }
    }
  }
  
  public void a(ObjectOutputStream paramObjectOutputStream, boolean paramBoolean)
  {
    int j = 0;
    int i;
    if (this.a != null)
    {
      i = this.a.length;
      if (!paramBoolean) {
        break label68;
      }
      paramObjectOutputStream.writeLong(i);
    }
    for (;;)
    {
      if (j >= i) {
        return;
      }
      paramObjectOutputStream.writeLong(this.a[j]);
      paramObjectOutputStream.writeLong(this.b[j]);
      j += 1;
      continue;
      i = 0;
      break;
      label68:
      paramObjectOutputStream.writeByte(i);
    }
  }
  
  public boolean a(long paramLong)
  {
    if (this.a != null)
    {
      int j = Arrays.binarySearch(this.a, paramLong);
      int i = j;
      if (j < 0)
      {
        j = -j - 1;
        QLog.d("GuardManager", 2, paramLong + " is the " + j + "th of " + Arrays.toString(this.a) + ", range reaches [" + (paramLong - h.b()) + ", " + (h.b() + paramLong) + "]");
        if ((j <= 0) || (paramLong - this.a[(j - 1)] > h.b())) {
          break label197;
        }
        i = j - 1;
      }
      while (i >= 0)
      {
        int m = this.a.length;
        paramLong = this.b[i];
        i = 0;
        j = 0;
        for (;;)
        {
          if (i < m)
          {
            int k = j;
            if (this.b[i] > paramLong) {
              k = j + 1;
            }
            i += 1;
            j = k;
            continue;
            label197:
            if (j < this.a.length)
            {
              i = j;
              if (this.a[j] - paramLong <= h.b()) {
                break;
              }
            }
            i = -1;
            break;
          }
        }
        QLog.d("GuardManager", 2, "order: " + j + ", limit: " + h.c() + ", in " + Arrays.toString(this.b));
        if (j < h.c()) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\service\h$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */