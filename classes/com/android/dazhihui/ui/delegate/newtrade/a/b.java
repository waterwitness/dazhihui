package com.android.dazhihui.ui.delegate.newtrade.a;

import android.content.Context;
import android.widget.Toast;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.ui.delegate.b.a;
import com.android.dazhihui.ui.delegate.b.d;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.j;
import com.android.dazhihui.ui.delegate.b.v;
import java.util.Random;
import java.util.Vector;

public class b
{
  public static String a;
  public static String b;
  public static byte[] c;
  private static int d = 0;
  private static byte[] e = null;
  private static String f;
  private static final Random m = new Random();
  private static byte[] n;
  private static int o = 0;
  private int g;
  private byte[] h;
  private int i;
  private int j;
  private int k;
  private int l;
  
  private b() {}
  
  public b(int paramInt, byte[] paramArrayOfByte)
  {
    this.g = paramInt;
    this.h = paramArrayOfByte;
  }
  
  public b(byte[] paramArrayOfByte)
  {
    this(12, paramArrayOfByte);
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    Random localRandom = new Random();
    int i1 = 0;
    Object localObject2 = "";
    if (i1 < paramInt1)
    {
      String str;
      label40:
      int i2;
      label65:
      Object localObject1;
      if (paramInt2 == 0) {
        if (localRandom.nextInt(2) % 2 == 0)
        {
          str = "char";
          if (!"char".equalsIgnoreCase(str)) {
            break label119;
          }
          if (localRandom.nextInt(2) % 2 != 0) {
            break label112;
          }
          i2 = 65;
          localObject1 = (String)localObject2 + (char)(i2 + localRandom.nextInt(26));
        }
      }
      for (;;)
      {
        i1 += 1;
        localObject2 = localObject1;
        break;
        str = "num";
        break label40;
        label112:
        i2 = 97;
        break label65;
        label119:
        localObject1 = localObject2;
        if ("num".equalsIgnoreCase(str))
        {
          localObject1 = (String)localObject2 + String.valueOf(localRandom.nextInt(10));
          continue;
          localObject1 = localObject2;
          if (paramInt2 == 1) {
            localObject1 = (String)localObject2 + String.valueOf(localRandom.nextInt(10));
          }
        }
      }
    }
    return (String)localObject2;
  }
  
  public static void a()
  {
    d = 0;
    n = null;
    a = null;
    b = null;
    c = null;
    f = null;
    o = 0;
    j.b();
    a.b();
  }
  
  public static void a(int paramInt, String paramString)
  {
    d = paramInt;
    f = paramString;
  }
  
  /* Error */
  public static void a(java.security.PublicKey paramPublicKey)
  {
    // Byte code:
    //   0: ldc 114
    //   2: invokestatic 120	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   5: astore_1
    //   6: aload_1
    //   7: iconst_1
    //   8: aload_0
    //   9: invokevirtual 124	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   12: getstatic 87	com/android/dazhihui/ui/delegate/newtrade/a/b:a	Ljava/lang/String;
    //   15: ifnonnull +12 -> 27
    //   18: bipush 16
    //   20: iconst_0
    //   21: invokestatic 126	com/android/dazhihui/ui/delegate/newtrade/a/b:a	(II)Ljava/lang/String;
    //   24: putstatic 87	com/android/dazhihui/ui/delegate/newtrade/a/b:a	Ljava/lang/String;
    //   27: getstatic 89	com/android/dazhihui/ui/delegate/newtrade/a/b:b	Ljava/lang/String;
    //   30: ifnonnull +12 -> 42
    //   33: bipush 16
    //   35: iconst_0
    //   36: invokestatic 126	com/android/dazhihui/ui/delegate/newtrade/a/b:a	(II)Ljava/lang/String;
    //   39: putstatic 89	com/android/dazhihui/ui/delegate/newtrade/a/b:b	Ljava/lang/String;
    //   42: aload_1
    //   43: getstatic 89	com/android/dazhihui/ui/delegate/newtrade/a/b:b	Ljava/lang/String;
    //   46: invokevirtual 130	java/lang/String:getBytes	()[B
    //   49: invokevirtual 134	javax/crypto/Cipher:doFinal	([B)[B
    //   52: putstatic 91	com/android/dazhihui/ui/delegate/newtrade/a/b:c	[B
    //   55: return
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual 137	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   61: aconst_null
    //   62: astore_1
    //   63: goto -57 -> 6
    //   66: astore_1
    //   67: aload_1
    //   68: invokevirtual 138	javax/crypto/NoSuchPaddingException:printStackTrace	()V
    //   71: aconst_null
    //   72: astore_1
    //   73: goto -67 -> 6
    //   76: astore_0
    //   77: aload_0
    //   78: invokevirtual 139	java/security/InvalidKeyException:printStackTrace	()V
    //   81: goto -69 -> 12
    //   84: astore_0
    //   85: aload_0
    //   86: invokevirtual 140	javax/crypto/IllegalBlockSizeException:printStackTrace	()V
    //   89: return
    //   90: astore_0
    //   91: aload_0
    //   92: invokevirtual 141	javax/crypto/BadPaddingException:printStackTrace	()V
    //   95: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	paramPublicKey	java.security.PublicKey
    //   5	38	1	localCipher	javax.crypto.Cipher
    //   56	2	1	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   62	1	1	localObject1	Object
    //   66	2	1	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   72	1	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	6	56	java/security/NoSuchAlgorithmException
    //   0	6	66	javax/crypto/NoSuchPaddingException
    //   6	12	76	java/security/InvalidKeyException
    //   42	55	84	javax/crypto/IllegalBlockSizeException
    //   42	55	90	javax/crypto/BadPaddingException
  }
  
  public static boolean a(b paramb, Context paramContext)
  {
    if (paramb == null)
    {
      paramb = Toast.makeText(paramContext, "　　连接失败，请重试。", 0);
      paramb.setGravity(17, 0, 0);
      paramb.show();
      return false;
    }
    return true;
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i1 = 0;
    while (i1 < paramArrayOfByte1.length)
    {
      if (paramArrayOfByte1[i1] != paramArrayOfByte2[i1]) {
        return false;
      }
      i1 += 1;
    }
    return true;
  }
  
  public static byte[] a(b[] paramArrayOfb, k paramk)
  {
    g localg1 = new g();
    int i1 = 0;
    while (i1 < paramArrayOfb.length)
    {
      b localb = paramArrayOfb[i1];
      if (localb.g == 12)
      {
        byte[] arrayOfByte = localb.h;
        g localg2 = new g();
        localg2.d(20);
        localg2.g(o);
        localg2.e(0);
        localg2.g(arrayOfByte.length);
        localg2.g(arrayOfByte.length);
        localg2.a(arrayOfByte);
        int i2 = arrayOfByte.length + 33;
        if (i2 % 16 != 0) {
          localg2.d((i2 / 16 + 1) * 16 - i2);
        }
        if (n == null) {
          n = j.a((a + b + h()).getBytes());
        }
        localg2.a(0, j.b(localg2.b(20)));
        localb.j = o;
        localb.h = a.a(localg2.a(), localb.j);
        o += 1;
      }
      paramk.b(localb.j);
      localb.i = d;
      localb.k = localb.h.length;
      localg1.d(4);
      localg1.e(localb.l);
      localg1.e(localb.g);
      localg1.g(localb.i);
      localg1.g(localb.j);
      localg1.g(localb.k);
      localg1.g(localb.h.length);
      localg1.a(localb.h);
      localg1.b(0, d.a(localg1.b(4)));
      i1 += 1;
    }
    return localg1.a();
  }
  
  public static b[] a(byte[] paramArrayOfByte)
  {
    Object localObject = new g();
    if ((e == null) || (e.length == 0))
    {
      ((g)localObject).a(paramArrayOfByte);
      ((g)localObject).a(0);
      paramArrayOfByte = new Vector(1);
    }
    do
    {
      i1 = ((g)localObject).b();
      b localb = new b();
      int i2 = ((g)localObject).f();
      int i3 = ((g)localObject).b();
      localb.l = ((g)localObject).d();
      localb.g = ((g)localObject).d();
      localb.i = ((g)localObject).f();
      localb.j = ((g)localObject).f();
      localb.k = ((g)localObject).f();
      int i4 = ((g)localObject).f();
      if (!((g)localObject).c(i4))
      {
        e = ((g)localObject).b(i1);
        return null;
        ((g)localObject).a(e);
        ((g)localObject).a(paramArrayOfByte);
        break;
      }
      e = null;
      localb.h = ((g)localObject).h(i4);
      if (d.a(((g)localObject).a(i3, ((g)localObject).b() - i3)) != i2)
      {
        e = null;
        return null;
      }
      d = localb.i;
      if (localb.l != 0) {
        localb.h = v.a(localb.h, localb.k);
      }
      if (localb.g == 12)
      {
        localb.h = a.c(localb.h, localb.j);
        g localg = new g(localb.h);
        byte[] arrayOfByte = localg.h(16);
        localg.f();
        if (!a(arrayOfByte, j.b(localg.b(20)))) {
          return null;
        }
        localg.f();
        i1 = localg.d();
        i2 = localg.f();
        localb.h = localg.h(localg.f());
        if (i1 != 0) {
          localb.h = v.a(localb.h, i2);
        }
      }
      paramArrayOfByte.addElement(localb);
    } while (((g)localObject).c());
    localObject = new b[paramArrayOfByte.size()];
    int i1 = 0;
    while (i1 < localObject.length)
    {
      localObject[i1] = ((b)paramArrayOfByte.elementAt(i1));
      i1 += 1;
    }
    return (b[])localObject;
  }
  
  public static boolean b()
  {
    return n != null;
  }
  
  public static void f()
  {
    e = null;
  }
  
  public static byte[] g()
  {
    return n;
  }
  
  public static String h()
  {
    return f;
  }
  
  public int c()
  {
    return this.g;
  }
  
  public byte[] d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */