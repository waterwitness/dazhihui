package com.c.b.b.a;

import com.c.b.a.b;
import com.c.b.a.c;
import com.c.b.a.d;
import com.c.b.a.k;
import com.c.b.e;
import com.c.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class m
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 32, 36, 37, 42, 43, 45, 46, 47, 58 };
  
  private static char a(int paramInt)
  {
    if (paramInt >= a.length) {
      throw f.a();
    }
    return a[paramInt];
  }
  
  private static int a(b paramb)
  {
    int i = paramb.a(8);
    if ((i & 0x80) == 0) {
      return i & 0x7F;
    }
    if ((i & 0xC0) == 128) {
      return (i & 0x3F) << 8 | paramb.a(8);
    }
    if ((i & 0xE0) == 192) {
      return (i & 0x1F) << 16 | paramb.a(16);
    }
    throw f.a();
  }
  
  static d a(byte[] paramArrayOfByte, s params, o paramo, Map<e, ?> paramMap)
  {
    b localb = new b(paramArrayOfByte);
    StringBuilder localStringBuilder = new StringBuilder(50);
    ArrayList localArrayList = new ArrayList(1);
    c localc = null;
    int i = -1;
    int j = -1;
    boolean bool = false;
    for (;;)
    {
      q localq1;
      try
      {
        if (localb.a() < 4)
        {
          localq1 = q.a;
          if (localq1 == q.a) {
            break label438;
          }
          if (localq1 == q.h) {
            break label468;
          }
          if (localq1 == q.i)
          {
            break label468;
            q localq2 = q.a;
            if (localq1 != localq2) {
              break label453;
            }
            paramMap = localStringBuilder.toString();
            if (!localArrayList.isEmpty()) {
              break label424;
            }
            params = null;
            if (paramo != null) {
              break label430;
            }
            paramo = null;
            return new d(paramArrayOfByte, paramMap, params, paramo, i, j);
          }
        }
        else
        {
          localq1 = q.a(localb.a(4));
          continue;
        }
        if (localq1 != q.d) {
          break label198;
        }
        if (localb.a() < 16) {
          throw f.a();
        }
      }
      catch (IllegalArgumentException paramArrayOfByte)
      {
        throw f.a();
      }
      i = localb.a(8);
      j = localb.a(8);
      continue;
      label198:
      if (localq1 == q.f)
      {
        localc = c.a(a(localb));
        if (localc == null) {
          throw f.a();
        }
      }
      else
      {
        if (localq1 == q.j)
        {
          k = localb.a(4);
          int m = localb.a(localq1.a(params));
          if (k != 1) {
            break label501;
          }
          a(localb, localStringBuilder, m);
          break label501;
        }
        k = localb.a(localq1.a(params));
        if (localq1 == q.b)
        {
          c(localb, localStringBuilder, k);
          k = i;
          i = j;
          j = k;
          continue;
        }
        if (localq1 == q.c)
        {
          a(localb, localStringBuilder, k, bool);
          k = i;
          i = j;
          j = k;
          continue;
        }
        if (localq1 == q.e)
        {
          a(localb, localStringBuilder, k, localc, localArrayList, paramMap);
          k = i;
          i = j;
          j = k;
          continue;
        }
        if (localq1 == q.g)
        {
          b(localb, localStringBuilder, k);
          k = i;
          i = j;
          j = k;
          continue;
        }
        throw f.a();
        label424:
        params = localArrayList;
        continue;
        label430:
        paramo = paramo.toString();
        continue;
        label438:
        k = i;
        i = j;
        j = k;
        continue;
        label453:
        k = i;
        i = j;
        j = k;
        continue;
        label468:
        bool = true;
        k = i;
        i = j;
        j = k;
        continue;
      }
      int k = i;
      i = j;
      j = k;
      continue;
      label501:
      k = i;
      i = j;
      j = k;
    }
  }
  
  private static void a(b paramb, StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt * 13 > paramb.a()) {
      throw f.a();
    }
    byte[] arrayOfByte = new byte[paramInt * 2];
    int j = 0;
    int i = paramInt;
    paramInt = j;
    if (i > 0)
    {
      j = paramb.a(13);
      j = j % 96 | j / 96 << 8;
      if (j < 959) {
        j += 41377;
      }
      for (;;)
      {
        arrayOfByte[paramInt] = ((byte)(j >> 8 & 0xFF));
        arrayOfByte[(paramInt + 1)] = ((byte)(j & 0xFF));
        i -= 1;
        paramInt += 2;
        break;
        j += 42657;
      }
    }
    try
    {
      paramStringBuilder.append(new String(arrayOfByte, "GB2312"));
      return;
    }
    catch (UnsupportedEncodingException paramb)
    {
      throw f.a();
    }
  }
  
  private static void a(b paramb, StringBuilder paramStringBuilder, int paramInt, c paramc, Collection<byte[]> paramCollection, Map<e, ?> paramMap)
  {
    if (paramInt * 8 > paramb.a()) {
      throw f.a();
    }
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      arrayOfByte[i] = ((byte)paramb.a(8));
      i += 1;
    }
    if (paramc == null) {}
    for (paramb = k.a(arrayOfByte, paramMap);; paramb = paramc.name()) {
      try
      {
        paramStringBuilder.append(new String(arrayOfByte, paramb));
        paramCollection.add(arrayOfByte);
        return;
      }
      catch (UnsupportedEncodingException paramb)
      {
        throw f.a();
      }
    }
  }
  
  private static void a(b paramb, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean)
  {
    int i = paramStringBuilder.length();
    while (paramInt > 1)
    {
      if (paramb.a() < 11) {
        throw f.a();
      }
      int j = paramb.a(11);
      paramStringBuilder.append(a(j / 45));
      paramStringBuilder.append(a(j % 45));
      paramInt -= 2;
    }
    if (paramInt == 1)
    {
      if (paramb.a() < 6) {
        throw f.a();
      }
      paramStringBuilder.append(a(paramb.a(6)));
    }
    if (paramBoolean)
    {
      paramInt = i;
      if (paramInt < paramStringBuilder.length())
      {
        if (paramStringBuilder.charAt(paramInt) == '%')
        {
          if ((paramInt >= paramStringBuilder.length() - 1) || (paramStringBuilder.charAt(paramInt + 1) != '%')) {
            break label159;
          }
          paramStringBuilder.deleteCharAt(paramInt + 1);
        }
        for (;;)
        {
          paramInt += 1;
          break;
          label159:
          paramStringBuilder.setCharAt(paramInt, '\035');
        }
      }
    }
  }
  
  private static void b(b paramb, StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt * 13 > paramb.a()) {
      throw f.a();
    }
    byte[] arrayOfByte = new byte[paramInt * 2];
    int j = 0;
    int i = paramInt;
    paramInt = j;
    if (i > 0)
    {
      j = paramb.a(13);
      j = j % 192 | j / 192 << 8;
      if (j < 7936) {
        j += 33088;
      }
      for (;;)
      {
        arrayOfByte[paramInt] = ((byte)(j >> 8));
        arrayOfByte[(paramInt + 1)] = ((byte)j);
        i -= 1;
        paramInt += 2;
        break;
        j += 49472;
      }
    }
    try
    {
      paramStringBuilder.append(new String(arrayOfByte, "SJIS"));
      return;
    }
    catch (UnsupportedEncodingException paramb)
    {
      throw f.a();
    }
  }
  
  private static void c(b paramb, StringBuilder paramStringBuilder, int paramInt)
  {
    while (paramInt >= 3)
    {
      if (paramb.a() < 10) {
        throw f.a();
      }
      int i = paramb.a(10);
      if (i >= 1000) {
        throw f.a();
      }
      paramStringBuilder.append(a(i / 100));
      paramStringBuilder.append(a(i / 10 % 10));
      paramStringBuilder.append(a(i % 10));
      paramInt -= 3;
    }
    if (paramInt == 2)
    {
      if (paramb.a() < 7) {
        throw f.a();
      }
      paramInt = paramb.a(7);
      if (paramInt >= 100) {
        throw f.a();
      }
      paramStringBuilder.append(a(paramInt / 10));
      paramStringBuilder.append(a(paramInt % 10));
    }
    while (paramInt != 1) {
      return;
    }
    if (paramb.a() < 4) {
      throw f.a();
    }
    paramInt = paramb.a(4);
    if (paramInt >= 10) {
      throw f.a();
    }
    paramStringBuilder.append(a(paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */