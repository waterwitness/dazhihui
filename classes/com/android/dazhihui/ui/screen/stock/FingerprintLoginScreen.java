package com.android.dazhihui.ui.screen.stock;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b;
import com.android.dazhihui.c.b.c;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.GoldAnimation;
import com.android.dazhihui.w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class FingerprintLoginScreen
  extends BaseActivity
{
  String a;
  String b;
  String c;
  String d;
  GoldAnimation e;
  boolean f = true;
  boolean g = true;
  boolean h = false;
  b i = new bp(this);
  private m j;
  
  public static String a(Context paramContext)
  {
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    paramContext = str;
    if (TextUtils.isEmpty(str)) {
      paramContext = "";
    }
    return paramContext;
  }
  
  public static String a(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      localObject = a(((MessageDigest)localObject).digest());
      return (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return String.valueOf(paramString.hashCode());
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int k = 0;
    while (k < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[k] & 0xFF);
      if (str.length() == 1) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      k += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static void a(Context paramContext, boolean paramBoolean, br parambr)
  {
    new String[3][0] = Boolean.toString(false);
    w.a().f();
    String str = w.a().i();
    if ((paramBoolean) && (str != null) && (!str.isEmpty()))
    {
      parambr.a("", "", false);
      return;
    }
    paramContext = a(paramContext);
    str = g.a().u();
    if (((paramContext != null) && (!paramContext.isEmpty())) || ((str != null) && (!str.isEmpty())))
    {
      parambr.a(str, paramContext, true);
      return;
    }
    parambr.a(str, paramContext, false);
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(163);
    paramString1 = b("{\"imei\":\"" + paramString1 + "\",\"mac\":\"" + "" + "\",\"mobile_md5\":\"" + paramString3 + "\",\"verify_code\":\"" + paramString4 + "\",\"qudao_id\":\"" + paramString2 + "\"}");
    localx2.d(0);
    localx2.c(paramString1.length);
    localx2.a(paramString1);
    localx1.a(localx2, (short)16);
    this.j = new m(localx1);
    registRequestListener(this.j);
    sendRequest(this.j);
  }
  
  private static byte[] a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = d("mobile.gw.com.cn");
      Object localObject = e("mobile.gw.com.cn");
      Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
      localObject = new IvParameterSpec((byte[])localObject);
      if (paramBoolean) {
        localCipher.init(1, localSecretKeySpec, (AlgorithmParameterSpec)localObject);
      }
      for (;;)
      {
        return localCipher.doFinal(paramArrayOfByte);
        localCipher.init(2, localSecretKeySpec, (AlgorithmParameterSpec)localObject);
      }
      return new byte[1];
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  private static String b(byte[] paramArrayOfByte)
  {
    int n = 0;
    paramArrayOfByte = a(paramArrayOfByte, false);
    int m = 0;
    int k = 0;
    byte[] arrayOfByte;
    for (;;)
    {
      if ((m >= paramArrayOfByte.length) || (paramArrayOfByte[m] == 0))
      {
        arrayOfByte = new byte[k];
        m = n;
        while (m < k)
        {
          arrayOfByte[m] = paramArrayOfByte[m];
          m += 1;
        }
      }
      k += 1;
      m += 1;
    }
    return new String(arrayOfByte);
  }
  
  private static byte[] b(String paramString)
  {
    return a(c(paramString), true);
  }
  
  private static byte[] c(String paramString)
  {
    int k = (paramString.length() + 15) / 16;
    paramString = paramString.getBytes();
    byte[] arrayOfByte = new byte[k * 16];
    k = 0;
    while ((k < paramString.length) && (k < arrayOfByte.length))
    {
      arrayOfByte[k] = paramString[k];
      k += 1;
    }
    return arrayOfByte;
  }
  
  private static SecretKeySpec d(String paramString)
  {
    paramString = paramString.getBytes();
    byte[] arrayOfByte = new byte[16];
    int k = 0;
    while ((k < paramString.length) && (k < arrayOfByte.length))
    {
      arrayOfByte[k] = paramString[k];
      k += 1;
    }
    return new SecretKeySpec(arrayOfByte, "AES");
  }
  
  private static byte[] e(String paramString)
  {
    paramString = paramString.getBytes();
    byte[] arrayOfByte = new byte[16];
    int k = 0;
    while ((k < paramString.length) && (k < arrayOfByte.length))
    {
      arrayOfByte[k] = paramString[k];
      k += 1;
    }
    return arrayOfByte;
  }
  
  public void a()
  {
    try
    {
      getLoadingDialog().dismiss();
      finish();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (this.j == paramh)
    {
      paramh = ((o)paramj).h();
      if (paramh.a == 2972)
      {
        paramh = new q(paramh.b);
        int k = paramh.b();
        int m = paramh.e();
        paramh.e();
        paramh.e();
        if (m == 163)
        {
          if (k == 2)
          {
            paramh = b(paramh.b(0));
            Object localObject;
            try
            {
              localObject = new JSONObject(paramh);
              k = ((JSONObject)localObject).optInt("status", 3);
              paramh = ((JSONObject)localObject).optString("realuname", "");
              paramj = ((JSONObject)localObject).optString("passwdmd5", "");
              m = ((JSONObject)localObject).optInt("gw_coins", 0);
              localObject = ((JSONObject)localObject).optString("msg", "");
              if (((k == 0) || (k == 1) || (k == 2)) && (this.h)) {
                c.a(this, "mobileMD5", this.c);
              }
              if (k == 0)
              {
                if (!isFinishing()) {
                  getLoadingDialog().dismiss();
                }
                this.g = false;
                w.a().a(paramh, paramj);
                this.e.setVisibility(0);
                this.e.a(m);
                this.e.setOnBtnClickListener(new bq(this));
                return;
              }
              if (k == 1)
              {
                w.a().a(paramh, paramj);
                if ((localObject == null) || (((String)localObject).isEmpty())) {
                  return;
                }
                showShortToast((String)localObject);
                return;
              }
            }
            catch (JSONException paramh)
            {
              paramh.printStackTrace();
              showShortToast("指纹登录异常!");
              a();
              return;
            }
            if (k == 2)
            {
              w.a().a(paramh, paramj);
              return;
            }
            if (k == 4)
            {
              paramh = new Intent();
              paramh.setClass(this, MobileVerifyScreen.class);
              startActivity(paramh);
              this.f = false;
              finish();
              return;
            }
            showShortToast((String)localObject);
            a();
            return;
          }
          showShortToast("指纹登录异常!");
          a();
        }
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.j == paramh)
    {
      showShortToast("指纹登录超时!");
      a();
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903115);
    this.e = ((GoldAnimation)findViewById(2131558921));
    new IntentFilter().addAction("android.net.wifi.WIFI_STATE_CHANGED");
    this.a = getIntent().getStringExtra("imei");
    this.b = getIntent().getStringExtra("mac");
    this.c = getIntent().getStringExtra("mobile");
    if (this.c == null)
    {
      paramBundle = c.c(this, "mobileMD5");
      if (paramBundle == null)
      {
        this.c = "";
        this.d = getIntent().getStringExtra("verify_code");
        if (this.d != null) {
          break label202;
        }
      }
    }
    label202:
    for (paramBundle = "";; paramBundle = this.d)
    {
      this.d = paramBundle;
      w.a().a(this.i);
      a(this.a, this.b, this.c, this.d);
      getLoadingDialog().show();
      return;
      this.c = new String(paramBundle);
      break;
      this.c = a(this.c);
      this.h = true;
      break;
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.j == paramh)
    {
      showShortToast("指纹登录异常!");
      a();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    w.a().b(this.i);
  }
  
  protected void onFinish()
  {
    if (this.f) {
      super.onFinish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\FingerprintLoginScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */