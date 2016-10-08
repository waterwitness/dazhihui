package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import java.io.PrintStream;

public class InitVerifedChuanCai
  extends BaseActivity
{
  String a;
  private boolean b = false;
  private String c;
  private a d;
  private boolean e;
  private com.android.dazhihui.a.b.u f;
  
  private long a(String paramString, int paramInt)
  {
    if (paramInt == 0) {}
    try
    {
      return Long.parseLong(paramString);
    }
    catch (Exception paramString)
    {
      long l;
      paramString.printStackTrace();
    }
    l = Long.parseLong(paramString, paramInt);
    return l;
    return 0L;
  }
  
  /* Error */
  private String a(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 42	java/lang/String:length	()I
    //   4: iconst_2
    //   5: idiv
    //   6: anewarray 38	java/lang/String
    //   9: astore_3
    //   10: iconst_0
    //   11: istore 5
    //   13: iload 5
    //   15: aload_1
    //   16: invokevirtual 42	java/lang/String:length	()I
    //   19: if_icmpge +52 -> 71
    //   22: aload_3
    //   23: iload 5
    //   25: iconst_2
    //   26: idiv
    //   27: new 44	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   34: aload_0
    //   35: aload_1
    //   36: iload 5
    //   38: iload 5
    //   40: iconst_2
    //   41: iadd
    //   42: invokevirtual 49	java/lang/String:substring	(II)Ljava/lang/String;
    //   45: bipush 16
    //   47: invokespecial 51	com/android/dazhihui/ui/delegate/screen/InitVerifedChuanCai:a	(Ljava/lang/String;I)J
    //   50: invokevirtual 55	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   53: ldc 57
    //   55: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: aastore
    //   62: iload 5
    //   64: iconst_2
    //   65: iadd
    //   66: istore 5
    //   68: goto -55 -> 13
    //   71: aload_0
    //   72: getfield 66	com/android/dazhihui/ui/delegate/screen/InitVerifedChuanCai:c	Ljava/lang/String;
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 42	java/lang/String:length	()I
    //   80: aload_3
    //   81: arraylength
    //   82: if_icmpge +28 -> 110
    //   85: new 44	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   92: aload_1
    //   93: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_0
    //   97: getfield 66	com/android/dazhihui/ui/delegate/screen/InitVerifedChuanCai:c	Ljava/lang/String;
    //   100: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore_1
    //   107: goto -31 -> 76
    //   110: aload_1
    //   111: iconst_0
    //   112: aload_3
    //   113: arraylength
    //   114: invokevirtual 49	java/lang/String:substring	(II)Ljava/lang/String;
    //   117: astore 4
    //   119: ldc 57
    //   121: astore_1
    //   122: iconst_0
    //   123: istore 5
    //   125: aload_1
    //   126: astore_2
    //   127: iload 5
    //   129: aload_3
    //   130: arraylength
    //   131: if_icmpge +68 -> 199
    //   134: new 44	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   141: aload_1
    //   142: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload_0
    //   146: aload 4
    //   148: iload 5
    //   150: iload 5
    //   152: iconst_1
    //   153: iadd
    //   154: invokevirtual 49	java/lang/String:substring	(II)Ljava/lang/String;
    //   157: iconst_0
    //   158: invokespecial 51	com/android/dazhihui/ui/delegate/screen/InitVerifedChuanCai:a	(Ljava/lang/String;I)J
    //   161: aload_0
    //   162: aload_3
    //   163: iload 5
    //   165: aaload
    //   166: iconst_0
    //   167: invokespecial 51	com/android/dazhihui/ui/delegate/screen/InitVerifedChuanCai:a	(Ljava/lang/String;I)J
    //   170: lxor
    //   171: invokevirtual 55	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   174: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: astore_2
    //   178: iload 5
    //   180: iconst_1
    //   181: iadd
    //   182: istore 5
    //   184: aload_2
    //   185: astore_1
    //   186: goto -61 -> 125
    //   189: astore_2
    //   190: ldc 57
    //   192: astore_1
    //   193: aload_2
    //   194: invokevirtual 35	java/lang/Exception:printStackTrace	()V
    //   197: aload_1
    //   198: astore_2
    //   199: aload_2
    //   200: areturn
    //   201: astore_2
    //   202: goto -9 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	InitVerifedChuanCai
    //   0	205	1	paramString	String
    //   126	59	2	str1	String
    //   189	5	2	localException1	Exception
    //   198	2	2	str2	String
    //   201	1	2	localException2	Exception
    //   9	154	3	arrayOfString	String[]
    //   117	30	4	str3	String
    //   11	172	5	i	int
    // Exception table:
    //   from	to	target	type
    //   0	10	189	java/lang/Exception
    //   13	62	189	java/lang/Exception
    //   71	76	189	java/lang/Exception
    //   76	107	189	java/lang/Exception
    //   110	119	189	java/lang/Exception
    //   127	178	201	java/lang/Exception
  }
  
  private void a()
  {
    this.d = new a(this);
    int i = e.a().j();
    if ((a.i != null) && (a.i[i][0] != null) && (!a.i[i][0].equals("")))
    {
      a(false);
      return;
    }
    this.f = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(15, new com.android.dazhihui.ui.delegate.b.h("13064").h()) });
    registRequestListener(this.f);
    sendRequest(this.f);
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      Toast.makeText(this, "注册成功。", 1).show();
    }
    this.d.a(25);
    this.d.close();
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("accobool", true);
    localBundle.putBoolean("haveNoLoginSorHaveOne", this.e);
    localIntent.putExtras(localBundle);
    localIntent.setClass(this, RegionTable.class);
    startActivity(localIntent);
    finish();
  }
  
  public void a(int paramInt)
  {
    Toast localToast;
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "  网络连接异常请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i = e.a().j();
    paramj = ((v)paramj).b();
    if (paramj == null) {}
    do
    {
      return;
      paramj = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      System.out.println(paramj);
      if (!paramj.b())
      {
        o.a(null);
        Toast.makeText(this, paramj.d(), 1).show();
        finish();
        return;
      }
    } while (paramh != this.f);
    this.c = paramj.a("2002");
    this.a = paramj.a("2007");
    this.a = a(this.a.trim());
    a.z = a.i[i][2];
    a.i[i] = { this.c, this.a, a.z };
    this.d.a(19);
    if (a.A[0].equals("无"))
    {
      a.A[0] = a.z;
      this.d.a(35);
    }
    label199:
    label291:
    for (;;)
    {
      this.d.close();
      a(true);
      return;
      i = 0;
      if (i < a.A.length) {
        if (!a.A[i].equals(a.z)) {}
      }
      for (i = 0;; i = 1)
      {
        if (i == 0) {
          break label291;
        }
        paramh = a.A;
        a.A = null;
        a.A = new String[paramh.length + 1];
        System.arraycopy(paramh, 0, a.A, 0, paramh.length);
        a.A[(a.A.length - 1)] = a.z;
        this.d.a(35);
        break;
        i += 1;
        break label199;
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    a(1);
    finish();
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.b = paramBundle.getBoolean("hidden");
    this.e = paramBundle.getBoolean("haveNoLoginSorHaveOne");
    setContentView(2130903549);
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    a(2);
    finish();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\InitVerifedChuanCai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */