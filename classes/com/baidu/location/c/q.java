package com.baidu.location.c;

import com.baidu.location.BDLocation;
import java.util.LinkedHashMap;

final class q
{
  final String a;
  final String b;
  final boolean c;
  final boolean d;
  final boolean e;
  final int f;
  final BDLocation g;
  final boolean h;
  final LinkedHashMap i;
  
  public q(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null)
    {
      this.a = null;
      this.b = null;
      this.i = null;
      this.c = false;
      this.d = false;
      this.e = false;
      this.g = null;
      this.h = false;
      this.f = 8;
      return;
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    int j = 0;
    m = 8;
    bool3 = false;
    bool2 = false;
    bool1 = false;
    k = 0;
    localObject3 = null;
    localObject1 = null;
    localObject2 = null;
    localObject4 = localObject1;
    localObject5 = localObject2;
    try
    {
      if (j >= paramArrayOfString.length) {
        break label1065;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (!paramArrayOfString[j].equals("-loc")) {
        break label349;
      }
      localObject2 = paramArrayOfString[(j + 1)];
      localObject4 = localObject1;
      localObject5 = localObject2;
      arrayOfString = ((String)localObject2).split("&");
      n = 0;
    }
    catch (Exception paramArrayOfString)
    {
      for (;;)
      {
        String[] arrayOfString;
        int n;
        int i1;
        boolean bool5;
        boolean bool6;
        int i2;
        Object localObject8;
        Object localObject6;
        Object localObject7;
        localObject2 = localObject5;
        localObject1 = localObject4;
        boolean bool4 = false;
        continue;
        n += 1;
        localObject1 = localObject6;
        continue;
        i1 += 1;
      }
    }
    i1 = m;
    bool4 = bool3;
    bool5 = bool2;
    bool6 = bool1;
    i2 = k;
    localObject8 = localObject3;
    localObject6 = localObject1;
    localObject7 = localObject2;
    localObject4 = localObject1;
    localObject5 = localObject2;
    if (n < arrayOfString.length)
    {
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (arrayOfString[n].startsWith("cl="))
      {
        localObject4 = localObject1;
        localObject5 = localObject2;
        localObject6 = arrayOfString[n].substring(3);
        break label1184;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      localObject6 = localObject1;
      if (!arrayOfString[n].startsWith("wf=")) {
        break label1184;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      localObject7 = arrayOfString[n].substring(3).split("\\|");
      i1 = 0;
      localObject4 = localObject1;
      localObject5 = localObject2;
      localObject6 = localObject1;
      if (i1 >= localObject7.length) {
        break label1184;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      localObject6 = localObject7[i1].split(";");
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (localObject6.length < 2) {
        break label1196;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      localLinkedHashMap.put(localObject6[0], Integer.valueOf(localObject6[1]));
      break label1196;
      label349:
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (!paramArrayOfString[j].equals("-com")) {
        break label566;
      }
      localObject4 = localObject1;
      localObject5 = localObject2;
      arrayOfString = paramArrayOfString[(j + 1)].split(";");
      i1 = m;
      bool4 = bool3;
      bool5 = bool2;
      bool6 = bool1;
      i2 = k;
      localObject8 = localObject3;
      localObject6 = localObject1;
      localObject7 = localObject2;
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (arrayOfString.length > 0)
      {
        localObject4 = localObject1;
        localObject5 = localObject2;
        localObject6 = new BDLocation();
      }
    }
    for (;;)
    {
      try
      {
        ((BDLocation)localObject6).a(Double.valueOf(arrayOfString[0]).doubleValue());
        ((BDLocation)localObject6).b(Double.valueOf(arrayOfString[1]).doubleValue());
        ((BDLocation)localObject6).a(Integer.valueOf(arrayOfString[2]).intValue());
        ((BDLocation)localObject6).e(arrayOfString[3]);
        localObject8 = localObject6;
        localObject7 = localObject2;
        localObject6 = localObject1;
        i2 = k;
        bool6 = bool1;
        bool5 = bool2;
        bool4 = bool3;
        i1 = m;
      }
      catch (Exception paramArrayOfString)
      {
        label566:
        localObject3 = localObject6;
        continue;
        continue;
      }
      j += 2;
      m = i1;
      bool3 = bool4;
      bool2 = bool5;
      bool1 = bool6;
      k = i2;
      localObject3 = localObject8;
      localObject1 = localObject6;
      localObject2 = localObject7;
      break;
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (paramArrayOfString[j].equals("-log"))
      {
        i1 = m;
        bool4 = bool3;
        bool5 = bool2;
        bool6 = bool1;
        i2 = k;
        localObject8 = localObject3;
        localObject6 = localObject1;
        localObject7 = localObject2;
        localObject4 = localObject1;
        localObject5 = localObject2;
        if (paramArrayOfString[(j + 1)].equals("true"))
        {
          i2 = 1;
          i1 = m;
          bool4 = bool3;
          bool5 = bool2;
          bool6 = bool1;
          localObject8 = localObject3;
          localObject6 = localObject1;
          localObject7 = localObject2;
        }
      }
      else
      {
        localObject4 = localObject1;
        localObject5 = localObject2;
        if (paramArrayOfString[j].equals("-rgc"))
        {
          i1 = m;
          bool4 = bool3;
          bool5 = bool2;
          bool6 = bool1;
          i2 = k;
          localObject8 = localObject3;
          localObject6 = localObject1;
          localObject7 = localObject2;
          localObject4 = localObject1;
          localObject5 = localObject2;
          if (paramArrayOfString[(j + 1)].equals("true"))
          {
            bool5 = true;
            i1 = m;
            bool4 = bool3;
            bool6 = bool1;
            i2 = k;
            localObject8 = localObject3;
            localObject6 = localObject1;
            localObject7 = localObject2;
          }
        }
        else
        {
          localObject4 = localObject1;
          localObject5 = localObject2;
          if (paramArrayOfString[j].equals("-poi"))
          {
            i1 = m;
            bool4 = bool3;
            bool5 = bool2;
            bool6 = bool1;
            i2 = k;
            localObject8 = localObject3;
            localObject6 = localObject1;
            localObject7 = localObject2;
            localObject4 = localObject1;
            localObject5 = localObject2;
            if (paramArrayOfString[(j + 1)].equals("true"))
            {
              bool6 = true;
              i1 = m;
              bool4 = bool3;
              bool5 = bool2;
              i2 = k;
              localObject8 = localObject3;
              localObject6 = localObject1;
              localObject7 = localObject2;
            }
          }
          else
          {
            localObject4 = localObject1;
            localObject5 = localObject2;
            bool4 = paramArrayOfString[j].equals("-minap");
            if (!bool4) {}
          }
        }
      }
      try
      {
        i1 = Integer.valueOf(paramArrayOfString[(j + 1)]).intValue();
        bool4 = bool3;
        bool5 = bool2;
        bool6 = bool1;
        i2 = k;
        localObject8 = localObject3;
        localObject6 = localObject1;
        localObject7 = localObject2;
      }
      catch (Exception localException)
      {
        boolean bool7;
        i1 = m;
        bool4 = bool3;
        bool5 = bool2;
        bool6 = bool1;
        i2 = k;
        localObject8 = localObject3;
        localObject6 = localObject1;
        localObject7 = localObject2;
      }
      i1 = m;
      bool4 = bool3;
      bool5 = bool2;
      bool6 = bool1;
      i2 = k;
      localObject8 = localObject3;
      localObject6 = localObject1;
      localObject7 = localObject2;
      localObject4 = localObject1;
      localObject5 = localObject2;
      if (paramArrayOfString[j].equals("-des"))
      {
        localObject4 = localObject1;
        localObject5 = localObject2;
        bool7 = paramArrayOfString[(j + 1)].equals("true");
        i1 = m;
        bool4 = bool3;
        bool5 = bool2;
        bool6 = bool1;
        i2 = k;
        localObject8 = localObject3;
        localObject6 = localObject1;
        localObject7 = localObject2;
        if (bool7)
        {
          bool4 = true;
          i1 = m;
          bool5 = bool2;
          bool6 = bool1;
          i2 = k;
          localObject8 = localObject3;
          localObject6 = localObject1;
          localObject7 = localObject2;
        }
      }
    }
    label1065:
    if (k == 0) {
      localObject2 = null;
    }
    bool4 = true;
    this.a = ((String)localObject2);
    this.b = ((String)localObject1);
    this.i = localLinkedHashMap;
    this.c = bool4;
    this.d = bool1;
    this.e = bool2;
    this.f = m;
    this.g = ((BDLocation)localObject3);
    this.h = bool3;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */