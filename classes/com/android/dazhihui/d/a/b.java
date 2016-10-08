package com.android.dazhihui.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import com.a.a.a.a.a;
import com.android.dazhihui.d.n;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class b
{
  private Context a;
  private SharedPreferences b;
  private PublicKey c;
  private String d;
  private int e = 0;
  
  public b(Context paramContext)
  {
    this.a = paramContext;
    this.b = this.a.getSharedPreferences("encrypt", 0);
    c();
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 0;
    try
    {
      int j = Integer.parseInt(paramString2);
      i = j;
    }
    catch (NumberFormatException paramString2)
    {
      for (;;)
      {
        try
        {
          this.c = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(a.a(paramString2)));
          if (!paramBoolean)
          {
            this.b.edit().putInt("PUBLIC_KEY_Stock_PEM_ID", this.e).commit();
            this.b.edit().putString("PUBLIC_KEY_Stock_PEM", paramString1).commit();
          }
          return;
        }
        catch (NoSuchAlgorithmException paramString1)
        {
          paramString1.printStackTrace();
          return;
        }
        catch (InvalidKeySpecException paramString1)
        {
          paramString1.printStackTrace();
          return;
        }
        catch (Exception paramString1)
        {
          paramString1.printStackTrace();
        }
        paramString2 = paramString2;
        Log.e("sTAG", "Error key version id");
        paramString2.printStackTrace();
      }
    }
    this.e = i;
    paramString2 = paramString1.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "");
    if (!TextUtils.isEmpty(paramString2)) {}
  }
  
  private void c()
  {
    this.d = this.b.getString("PUBLIC_KEY_Stock_PEM", "");
    this.e = this.b.getInt("PUBLIC_KEY_Stock_PEM_ID", 0);
    if (!TextUtils.isEmpty(this.d))
    {
      n.c(">>> load local Market key info:key|\n" + this.d + "\n" + "KeyID|" + this.e);
      a(this.d, String.valueOf(this.e), true);
    }
  }
  
  public int a()
  {
    n.c(">>> curr Stk keyId:" + this.e);
    return this.e;
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, false);
  }
  
  /* Error */
  public byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: getfield 93	com/android/dazhihui/d/a/b:c	Ljava/security/PublicKey;
    //   7: ifnonnull +5 -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: ldc -74
    //   14: invokestatic 187	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   17: astore 5
    //   19: aload 5
    //   21: iconst_1
    //   22: aload_0
    //   23: getfield 93	com/android/dazhihui/d/a/b:c	Ljava/security/PublicKey;
    //   26: invokevirtual 191	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   29: new 193	java/io/ByteArrayOutputStream
    //   32: dup
    //   33: invokespecial 194	java/io/ByteArrayOutputStream:<init>	()V
    //   36: astore_3
    //   37: aload_3
    //   38: astore_2
    //   39: aload_1
    //   40: arraylength
    //   41: istore 7
    //   43: iload 7
    //   45: iload 6
    //   47: isub
    //   48: ifle +79 -> 127
    //   51: iload 7
    //   53: iload 6
    //   55: isub
    //   56: bipush 117
    //   58: if_icmple +39 -> 97
    //   61: aload_3
    //   62: astore_2
    //   63: aload 5
    //   65: aload_1
    //   66: iload 6
    //   68: bipush 117
    //   70: invokevirtual 198	javax/crypto/Cipher:doFinal	([BII)[B
    //   73: astore 4
    //   75: aload_3
    //   76: astore_2
    //   77: aload_3
    //   78: aload 4
    //   80: iconst_0
    //   81: aload 4
    //   83: arraylength
    //   84: invokevirtual 202	java/io/ByteArrayOutputStream:write	([BII)V
    //   87: iload 6
    //   89: bipush 117
    //   91: iadd
    //   92: istore 6
    //   94: goto -51 -> 43
    //   97: aload_3
    //   98: astore_2
    //   99: aload 5
    //   101: aload_1
    //   102: iload 6
    //   104: iload 7
    //   106: iload 6
    //   108: isub
    //   109: invokevirtual 198	javax/crypto/Cipher:doFinal	([BII)[B
    //   112: astore 4
    //   114: iload 6
    //   116: iload 7
    //   118: iload 6
    //   120: isub
    //   121: iadd
    //   122: istore 6
    //   124: goto -49 -> 75
    //   127: aload_3
    //   128: astore_2
    //   129: aload_3
    //   130: invokevirtual 206	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   133: astore_1
    //   134: aload_3
    //   135: invokestatic 211	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   138: aload_1
    //   139: areturn
    //   140: astore 4
    //   142: aconst_null
    //   143: astore_1
    //   144: aload_1
    //   145: astore_2
    //   146: aload 4
    //   148: invokevirtual 212	java/security/GeneralSecurityException:printStackTrace	()V
    //   151: aload_1
    //   152: invokestatic 211	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   155: aconst_null
    //   156: areturn
    //   157: astore_1
    //   158: aconst_null
    //   159: astore_2
    //   160: aload_2
    //   161: invokestatic 211	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: goto -7 -> 160
    //   170: astore 4
    //   172: aload_3
    //   173: astore_1
    //   174: goto -30 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	b
    //   0	177	1	paramArrayOfByte	byte[]
    //   38	123	2	localObject	Object
    //   36	137	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   73	40	4	arrayOfByte	byte[]
    //   140	7	4	localGeneralSecurityException1	java.security.GeneralSecurityException
    //   170	1	4	localGeneralSecurityException2	java.security.GeneralSecurityException
    //   17	83	5	localCipher	javax.crypto.Cipher
    //   1	122	6	i	int
    //   41	80	7	j	int
    // Exception table:
    //   from	to	target	type
    //   12	37	140	java/security/GeneralSecurityException
    //   12	37	157	finally
    //   39	43	166	finally
    //   63	75	166	finally
    //   77	87	166	finally
    //   99	114	166	finally
    //   129	134	166	finally
    //   146	151	166	finally
    //   39	43	170	java/security/GeneralSecurityException
    //   63	75	170	java/security/GeneralSecurityException
    //   77	87	170	java/security/GeneralSecurityException
    //   99	114	170	java/security/GeneralSecurityException
    //   129	134	170	java/security/GeneralSecurityException
  }
  
  public boolean b()
  {
    return this.c != null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */