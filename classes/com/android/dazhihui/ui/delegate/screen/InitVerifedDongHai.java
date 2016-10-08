package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.view.b;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class InitVerifedDongHai
  extends BaseActivity
  implements cp, cs
{
  private static String p = "com.danghaizq.send";
  private static String q = "com.danghaizq.delivery";
  private com.android.dazhihui.a.b.u A;
  String a;
  private Object b;
  private boolean c = false;
  private String d;
  private EditText e;
  private FrameLayout f = null;
  private b g = null;
  private TextView h;
  private TextView i;
  private TextView j;
  private Button k;
  private Button l;
  private Button m;
  private String[][] n = (String[][])null;
  private String o = null;
  private cn r;
  private cn s;
  private DzhHeader t;
  private boolean u;
  private boolean v = false;
  private Thread w;
  private boolean x = false;
  private Handler y = new ci(this);
  private com.android.dazhihui.a.b.u z;
  
  private long a(String paramString, int paramInt)
  {
    if (paramInt == 0) {}
    try
    {
      return Long.parseLong(paramString);
    }
    catch (Exception paramString)
    {
      long l1;
      paramString.printStackTrace();
    }
    l1 = Long.parseLong(paramString, paramInt);
    return l1;
    return 0L;
  }
  
  private void a(String paramString1, String paramString2)
  {
    SmsManager localSmsManager = SmsManager.getDefault();
    PendingIntent localPendingIntent1 = PendingIntent.getBroadcast(this, 0, new Intent(p), 0);
    PendingIntent localPendingIntent2 = PendingIntent.getBroadcast(this, 0, new Intent(q), 0);
    try
    {
      localSmsManager.sendTextMessage(paramString1, null, paramString2, localPendingIntent1, localPendingIntent2);
      i1 = 1;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1 = Toast.makeText(this, "　　发送出错。", 0);
        paramString1.setGravity(17, 0, 0);
        paramString1.show();
        int i1 = 0;
      }
    }
    if (i1 != 0)
    {
      paramString1 = Toast.makeText(this, "　　信息已发送。", 0);
      paramString1.setGravity(17, 0, 0);
      paramString1.show();
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 4)
    {
      this.h.setVisibility(i1);
      this.i.setVisibility(i1);
      this.j.setVisibility(i1);
      this.k.setVisibility(i1);
      this.l.setVisibility(i1);
      this.m.setVisibility(i1);
      return;
    }
  }
  
  /* Error */
  private String b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 177	java/lang/String:length	()I
    //   4: iconst_2
    //   5: idiv
    //   6: anewarray 173	java/lang/String
    //   9: astore_3
    //   10: iconst_0
    //   11: istore 5
    //   13: iload 5
    //   15: aload_1
    //   16: invokevirtual 177	java/lang/String:length	()I
    //   19: if_icmpge +52 -> 71
    //   22: aload_3
    //   23: iload 5
    //   25: iconst_2
    //   26: idiv
    //   27: new 179	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   34: aload_0
    //   35: aload_1
    //   36: iload 5
    //   38: iload 5
    //   40: iconst_2
    //   41: iadd
    //   42: invokevirtual 184	java/lang/String:substring	(II)Ljava/lang/String;
    //   45: bipush 16
    //   47: invokespecial 186	com/android/dazhihui/ui/delegate/screen/InitVerifedDongHai:a	(Ljava/lang/String;I)J
    //   50: invokevirtual 190	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   53: ldc -64
    //   55: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: aastore
    //   62: iload 5
    //   64: iconst_2
    //   65: iadd
    //   66: istore 5
    //   68: goto -55 -> 13
    //   71: aload_0
    //   72: getfield 200	com/android/dazhihui/ui/delegate/screen/InitVerifedDongHai:d	Ljava/lang/String;
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 177	java/lang/String:length	()I
    //   80: aload_3
    //   81: arraylength
    //   82: if_icmpge +28 -> 110
    //   85: new 179	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   92: aload_1
    //   93: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_0
    //   97: getfield 200	com/android/dazhihui/ui/delegate/screen/InitVerifedDongHai:d	Ljava/lang/String;
    //   100: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore_1
    //   107: goto -31 -> 76
    //   110: aload_1
    //   111: iconst_0
    //   112: aload_3
    //   113: arraylength
    //   114: invokevirtual 184	java/lang/String:substring	(II)Ljava/lang/String;
    //   117: astore 4
    //   119: ldc -64
    //   121: astore_1
    //   122: iconst_0
    //   123: istore 5
    //   125: aload_1
    //   126: astore_2
    //   127: iload 5
    //   129: aload_3
    //   130: arraylength
    //   131: if_icmpge +68 -> 199
    //   134: new 179	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   141: aload_1
    //   142: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload_0
    //   146: aload 4
    //   148: iload 5
    //   150: iload 5
    //   152: iconst_1
    //   153: iadd
    //   154: invokevirtual 184	java/lang/String:substring	(II)Ljava/lang/String;
    //   157: iconst_0
    //   158: invokespecial 186	com/android/dazhihui/ui/delegate/screen/InitVerifedDongHai:a	(Ljava/lang/String;I)J
    //   161: aload_0
    //   162: aload_3
    //   163: iload 5
    //   165: aaload
    //   166: iconst_0
    //   167: invokespecial 186	com/android/dazhihui/ui/delegate/screen/InitVerifedDongHai:a	(Ljava/lang/String;I)J
    //   170: lxor
    //   171: invokevirtual 190	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   174: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: astore_2
    //   178: iload 5
    //   180: iconst_1
    //   181: iadd
    //   182: istore 5
    //   184: aload_2
    //   185: astore_1
    //   186: goto -61 -> 125
    //   189: astore_2
    //   190: ldc -64
    //   192: astore_1
    //   193: aload_2
    //   194: invokevirtual 99	java/lang/Exception:printStackTrace	()V
    //   197: aload_1
    //   198: astore_2
    //   199: aload_2
    //   200: areturn
    //   201: astore_2
    //   202: goto -9 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	InitVerifedDongHai
    //   0	205	1	paramString	String
    //   126	59	2	str1	String
    //   189	5	2	localException1	Exception
    //   198	2	2	str2	String
    //   201	1	2	localException2	Exception
    //   9	154	3	arrayOfString	String[]
    //   117	30	4	str3	String
    //   11	172	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   0	10	189	java/lang/Exception
    //   13	62	189	java/lang/Exception
    //   71	76	189	java/lang/Exception
    //   76	107	189	java/lang/Exception
    //   110	119	189	java/lang/Exception
    //   127	178	201	java/lang/Exception
  }
  
  private void b(Object paramObject)
  {
    if ((paramObject instanceof View))
    {
      paramObject = (View)paramObject;
      if (this.k != paramObject) {
        break label37;
      }
      a(this.n[0][1], this.o);
    }
    label37:
    do
    {
      return;
      if (this.l == paramObject)
      {
        a(this.n[1][1], this.o);
        return;
      }
    } while (this.m != paramObject);
    a(this.n[2][1], this.o);
  }
  
  private void d()
  {
    if (this.v) {}
    for (com.android.dazhihui.ui.delegate.b.h localh = new com.android.dazhihui.ui.delegate.b.h("13088");; localh = new com.android.dazhihui.ui.delegate.b.h("13056"))
    {
      this.z = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(15, localh.h()) });
      registRequestListener(this.z);
      sendRequest(this.z);
      getLoadingDialog().show();
      return;
    }
  }
  
  private void e()
  {
    this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(15, new com.android.dazhihui.ui.delegate.b.h("13054").a("2002", this.d).h()) });
    registRequestListener(this.A);
    sendRequest(this.A);
    getLoadingDialog().show();
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    this.d = this.e.getText().toString();
    if (this.d.length() == 0)
    {
      Toast.makeText(this, "　　手机号码必须填写。", 1).show();
      return;
    }
    if (this.d.length() != 11)
    {
      Toast.makeText(this, "　　手机号码须为 11 位。", 1).show();
      return;
    }
    e();
  }
  
  public void a(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "未从服务器上取到数据请重试！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
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
  
  public void a(Object paramObject)
  {
    new AlertDialog.Builder(this).setTitle(getString(2131165469)).setMessage(getString(2131165344)).setPositiveButton(getString(2131165363), new cl(this, paramObject)).setNegativeButton(getString(2131165331), null).show();
  }
  
  public void a(String paramString)
  {
    paramString = Toast.makeText(this, "　　" + paramString, 0);
    paramString.setGravity(17, 0, 0);
    paramString.show();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = o.q();
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.t = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i1 = e.a().j();
    paramj = ((v)paramj).b();
    if (paramj == null) {
      return;
    }
    getLoadingDialog().dismiss();
    paramj = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramj.b())
    {
      o.a(null);
      Toast.makeText(this, paramj.d(), 1).show();
      return;
    }
    ArrayList localArrayList;
    if (paramh == this.z)
    {
      paramh = n.c(paramj.a("2007"), ",");
      localArrayList = new ArrayList();
      i1 = paramh.size() / 2;
      if ((i1 != 0) || (paramh.size() != 1)) {
        break label857;
      }
      i1 = 1;
    }
    label298:
    label391:
    label447:
    label495:
    label759:
    label855:
    label857:
    for (;;)
    {
      this.n = ((String[][])Array.newInstance(String.class, new int[] { i1, 2 }));
      if ((i1 == 1) && (paramh.size() == 1))
      {
        this.n[0][0] = ((String)paramh.get(0));
        this.n[0][1] = ((String)paramh.get(0));
        localArrayList.add(this.n[0][0]);
        this.h.setTextSize(16.0F);
        this.h.setText((CharSequence)localArrayList.get(0));
        this.h.setVisibility(0);
        this.k.setVisibility(0);
        this.o = paramj.a("1208").trim();
        this.g.setText("注册方法：用户需发送短信" + this.o + "至以下号码" + "进行注册，注册成功后在上方输入框输入您的手机号码点击 “验证” 即可登录。");
        return;
      }
      i1 = 0;
      if (i1 < this.n.length)
      {
        this.n[i1][0] = ((String)paramh.get(i1 * 2));
        this.n[i1][1] = ((String)paramh.get(i1 * 2 + 1));
        if ((this.n[i1][0] != null) && (this.n[i1][0].length() != 0)) {
          break label447;
        }
        localArrayList.add(this.n[i1][1]);
        if (i1 != 0) {
          break label495;
        }
        this.h.setTextSize(16.0F);
        this.h.setText((CharSequence)localArrayList.get(i1));
        this.h.setVisibility(0);
        this.k.setVisibility(0);
      }
      for (;;)
      {
        i1 += 1;
        break label298;
        break;
        localArrayList.add(this.n[i1][0] + "：" + this.n[i1][1]);
        break label391;
        if (i1 == 1)
        {
          this.i.setTextSize(16.0F);
          this.i.setText((CharSequence)localArrayList.get(i1));
          this.i.setVisibility(0);
          this.l.setVisibility(0);
        }
        else if (i1 == 2)
        {
          this.j.setTextSize(16.0F);
          this.j.setText((CharSequence)localArrayList.get(i1));
          this.j.setVisibility(0);
          this.m.setVisibility(0);
        }
      }
      if (paramh != this.A) {
        break;
      }
      paramj = b(paramj.a("2007").trim());
      paramh = new a(this);
      a.z = a.i[i1][2];
      a.i[i1] = { this.d, paramj, a.z };
      paramh.a(19);
      if (a.A[0].equals("无"))
      {
        a.A[0] = a.z;
        paramh.a(35);
      }
      for (;;)
      {
        paramh.close();
        Toast.makeText(this, "注册成功", 1).show();
        paramh = new Bundle();
        paramh.putBoolean("accobool", true);
        paramh.putBoolean("haveNoLoginSorHaveOne", this.x);
        startActivity(RegionTable.class, paramh);
        finish();
        return;
        i1 = 0;
        if (i1 < a.A.length) {
          if (!a.A[i1].equals(a.z)) {}
        }
        for (i1 = 0;; i1 = 1)
        {
          if (i1 == 0) {
            break label855;
          }
          paramj = a.A;
          a.A = null;
          a.A = new String[paramj.length + 1];
          System.arraycopy(paramj, 0, a.A, 0, paramj.length);
          a.A[(a.A.length - 1)] = a.z;
          paramh.a(35);
          break;
          i1 += 1;
          break label759;
        }
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (getLoadingDialog().isShowing())
    {
      getLoadingDialog().dismiss();
      a(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.c = paramBundle.getBoolean("hidden");
    this.v = paramBundle.getBoolean("isTPY", false);
    this.x = paramBundle.getBoolean("haveNoLoginSorHaveOne");
    setContentView(2130903217);
    this.t = ((DzhHeader)findViewById(2131558643));
    this.t.a(this, this);
    this.f = ((FrameLayout)findViewById(2131559510));
    this.g = new b(this, "注册方法：用户需发送短信****至以下号码进行注册，注册成功后在上方输入框输入您的手机号码点击 “验证” 即可登录。", 0, 2.0F);
    this.f.addView(this.g);
    this.h = ((TextView)findViewById(2131559511));
    this.i = ((TextView)findViewById(2131559513));
    this.j = ((TextView)findViewById(2131559515));
    this.k = ((Button)findViewById(2131559512));
    this.l = ((Button)findViewById(2131559514));
    this.m = ((Button)findViewById(2131559516));
    this.k.setOnClickListener(new cm(this));
    this.l.setOnClickListener(new cm(this));
    this.m.setOnClickListener(new cm(this));
    a(false);
    this.e = ((EditText)findViewById(2131559508));
    this.e.setFilters(new InputFilter[] { new InputFilter.LengthFilter(11) });
    ((Button)findViewById(2131559509)).setOnClickListener(new cj(this));
    if (o.m != null)
    {
      if (o.m.length > 0) {
        this.b = o.m[0];
      }
      if (o.m.length > 1) {
        this.a = o.m[1];
      }
    }
    if (this.b != null) {
      this.e.setText((String)this.b);
    }
    if (this.c) {
      a();
    }
    this.r = new cn(this);
    paramBundle = new IntentFilter(p);
    registerReceiver(this.r, paramBundle);
    this.s = new cn(this);
    paramBundle = new IntentFilter(q);
    registerReceiver(this.s, paramBundle);
    this.u = false;
    this.w = new ck(this);
    this.w.start();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (getLoadingDialog().isShowing())
    {
      a(2);
      getLoadingDialog().dismiss();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return false;
  }
  
  public void onPause()
  {
    try
    {
      unregisterReceiver(this.r);
      unregisterReceiver(this.s);
      super.onPause();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\InitVerifedDongHai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */