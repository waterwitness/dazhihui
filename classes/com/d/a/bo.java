package com.d.a;

import com.d.a.a.a;
import com.d.a.a.e;
import com.d.a.a.h;
import java.io.PrintStream;
import java.nio.ByteBuffer;

public class bo
{
  public static boolean a;
  
  static
  {
    if (!bo.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      a = false;
      return;
    }
  }
  
  public static void a(a parama, Exception paramException)
  {
    if (parama != null) {
      parama.a(paramException);
    }
  }
  
  public static void a(h paramh)
  {
    if (paramh != null) {
      paramh.a();
    }
  }
  
  public static void a(al paramal, ai paramai)
  {
    Object localObject = null;
    e locale;
    int i;
    if (!paramal.k())
    {
      locale = paramal.f();
      localObject = locale;
      if (locale != null)
      {
        i = paramai.d();
        if (i > 0) {
          break label108;
        }
        localObject = locale;
      }
    }
    if ((paramai.d() != 0) && (!paramal.k()))
    {
      System.out.println("handler: " + localObject);
      System.out.println("emitter: " + paramal);
      paramai.m();
      if (!a) {}
    }
    else
    {
      label108:
      do
      {
        return;
        locale.a(paramal, paramai);
        localObject = locale;
        if (i != paramai.d()) {
          break;
        }
        localObject = locale;
        if (locale != paramal.f()) {
          break;
        }
        localObject = locale;
        if (paramal.k()) {
          break;
        }
        System.out.println("handler: " + locale);
        paramai.m();
      } while (a);
      if (!b) {
        throw new AssertionError();
      }
      throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
    }
    if (!b) {
      throw new AssertionError();
    }
    throw new RuntimeException("Not all data was consumed by Util.emitAllData");
  }
  
  public static void a(al paramal, Exception paramException)
  {
    if (paramal == null) {
      return;
    }
    a(paramal.h(), paramException);
  }
  
  public static void a(ao paramao)
  {
    if (paramao == null) {
      return;
    }
    a(paramao.g());
  }
  
  public static void a(ao paramao, ai paramai, a parama)
  {
    paramai = new bp(paramao, paramai, parama);
    paramao.a(paramai);
    paramai.a();
  }
  
  public static void a(ao paramao, byte[] paramArrayOfByte, a parama)
  {
    ByteBuffer localByteBuffer = ai.c(paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.flip();
    paramArrayOfByte = new ai();
    paramArrayOfByte.a(localByteBuffer);
    a(paramao, paramArrayOfByte, parama);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */