package com.f.a.a;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import com.unionpay.upomp.lthj.plugin.ui.KeyboardDialog;
import com.unionpay.upomp.lthj.plugin.ui.YearAndMonthDialog;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Vector;

public class ec
{
  public static GetBundleBankCardList a(Vector paramVector)
  {
    paramVector = paramVector.iterator();
    while (paramVector.hasNext())
    {
      GetBundleBankCardList localGetBundleBankCardList = (GetBundleBankCardList)paramVector.next();
      if ("1".equals(localGetBundleBankCardList.isDefault)) {
        return localGetBundleBankCardList;
      }
    }
    return null;
  }
  
  public static String a()
  {
    String str = Build.VERSION.RELEASE;
    return "android" + str;
  }
  
  public static String a(Context paramContext)
  {
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    paramContext = str;
    if (TextUtils.isEmpty(str)) {
      paramContext = "000000";
    }
    return paramContext;
  }
  
  public static String a(String paramString)
  {
    if ("00".equals(paramString)) {
      return "信用卡";
    }
    if ("01".equals(paramString)) {
      return "借记卡";
    }
    if ("02".equals(paramString)) {
      return "储值卡";
    }
    return null;
  }
  
  public static Vector a(ba paramba)
  {
    Object localObject = new Vector();
    String[] arrayOfString1 = a(paramba.b(), '|');
    String[] arrayOfString2 = a(paramba.c(), '|');
    String[] arrayOfString3 = a(paramba.e(), '|');
    String[] arrayOfString4 = a(paramba.d(), '|');
    String[] arrayOfString5 = a(paramba.f(), '|');
    String[] arrayOfString6 = a(paramba.g(), '|');
    String[] arrayOfString7 = a(paramba.h(), '|');
    if ((arrayOfString1 == null) || (arrayOfString2 == null) || (arrayOfString3 == null) || (arrayOfString4 == null) || (arrayOfString5 == null) || (arrayOfString6 == null) || (arrayOfString7 == null))
    {
      localObject = null;
      return (Vector)localObject;
    }
    int i = 0;
    for (paramba = (ba)localObject;; paramba = (ba)localObject)
    {
      localObject = paramba;
      if (i >= arrayOfString1.length) {
        break;
      }
      GetBundleBankCardList localGetBundleBankCardList = new GetBundleBankCardList();
      localGetBundleBankCardList.bindId = arrayOfString1[i];
      localGetBundleBankCardList.panType = arrayOfString2[i];
      localGetBundleBankCardList.panBank = arrayOfString3[i];
      localGetBundleBankCardList.panBankId = arrayOfString4[i];
      localGetBundleBankCardList.pan = arrayOfString5[i];
      localGetBundleBankCardList.mobileNumber = arrayOfString6[i];
      localGetBundleBankCardList.isDefault = arrayOfString7[i];
      localObject = paramba;
      if (paramba == null) {
        localObject = new Vector();
      }
      ((Vector)localObject).add(localGetBundleBankCardList);
      i += 1;
    }
  }
  
  public static void a(Context paramContext, EditText paramEditText, int paramInt)
  {
    paramContext = new KeyboardDialog(paramContext, bp.eE());
    paramContext.setInputText(paramEditText);
    paramContext.setType(paramInt);
    paramContext.show();
  }
  
  public static void a(Context paramContext, EditText paramEditText, int paramInt, ax paramax)
  {
    paramContext = new YearAndMonthDialog(paramContext, paramEditText, paramInt, paramax);
    paramContext.setType(paramInt);
    paramContext.show();
  }
  
  public static void a(Context paramContext, String paramString)
  {
    ef.a().a(paramContext, paramContext.getString(bp.p()), paramString);
  }
  
  public static void a(Context paramContext, String paramString, int paramInt)
  {
    paramString = b(paramContext, paramString, paramInt);
    ef.a().a(paramContext, paramContext.getString(bp.p()), paramString);
  }
  
  public static void a(ValidateCodeView paramValidateCodeView)
  {
    if (paramValidateCodeView.getVisibility() == 8) {
      return;
    }
    if (paramValidateCodeView != null) {
      paramValidateCodeView.a().setVisibility(8);
    }
    paramValidateCodeView.c().setText("");
    bs.a(paramValidateCodeView, paramValidateCodeView.b());
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean)
  {
    paramContext = paramContext.getSharedPreferences("shared_pre", 0);
    if (!paramBoolean) {
      return paramContext.getBoolean("isquickpay", false);
    }
    paramContext = paramContext.edit();
    paramContext.putBoolean("isquickpay", true);
    paramContext.commit();
    return paramBoolean;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return cf.a(paramArrayOfByte, 0);
  }
  
  public static String[] a(String paramString, char paramChar)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    paramString = b(paramString, paramChar);
    String[] arrayOfString = new String[paramString.size()];
    paramString.copyInto(arrayOfString);
    return arrayOfString;
  }
  
  public static String b()
  {
    return Build.MODEL;
  }
  
  public static String b(Context paramContext)
  {
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
    paramContext = str;
    if (TextUtils.isEmpty(str)) {
      paramContext = "000000";
    }
    return paramContext;
  }
  
  public static String b(Context paramContext, String paramString, int paramInt)
  {
    return paramString + "(" + paramInt + ")";
  }
  
  public static String b(String paramString)
  {
    if ("01".equals(paramString)) {
      return "信用卡";
    }
    if ("00".equals(paramString)) {
      return "借记卡";
    }
    if ("02".equals(paramString)) {
      return "储值卡";
    }
    return null;
  }
  
  public static Vector b(String paramString, char paramChar)
  {
    int m = 0;
    int i = paramString.length();
    int j = i;
    String str = paramString;
    if (paramString.charAt(i - 1) != paramChar)
    {
      str = paramString + paramChar;
      j = i + 1;
    }
    paramString = new Vector();
    int k = 0;
    if (k < j)
    {
      i = m;
      if (str.charAt(k) == paramChar) {
        if (k != 0) {
          break label101;
        }
      }
      for (i = k + 1;; i = k + 1)
      {
        k += 1;
        m = i;
        break;
        label101:
        paramString.addElement(str.substring(m, k));
      }
    }
    return paramString;
  }
  
  public static void b(Context paramContext, String paramString)
  {
    new AlertDialog.Builder(paramContext).setTitle("提示").setMessage(paramString).setPositiveButton("确定", new eo()).show();
  }
  
  public static void b(ValidateCodeView paramValidateCodeView)
  {
    if (u.a().c.f())
    {
      u.a().c.f(false);
      if (paramValidateCodeView != null)
      {
        paramValidateCodeView.setVisibility(0);
        a(paramValidateCodeView);
      }
    }
    while (paramValidateCodeView == null) {
      return;
    }
    paramValidateCodeView.setVisibility(8);
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.reset();
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static String c(String paramString)
  {
    if (paramString != null) {
      try
      {
        paramString = new SimpleDateFormat("yyyyMMddHHmmss").parse(paramString);
        paramString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(paramString);
        return paramString;
      }
      catch (ParseException paramString)
      {
        paramString.printStackTrace();
      }
    }
    return null;
  }
  
  public static void c()
  {
    u.a().b();
    JniMethod.getJniMethod().releaseResource();
    v.a = "";
    System.gc();
  }
  
  public static void c(Context paramContext)
  {
    Dialog localDialog = new Dialog(paramContext, bp.eE());
    paramContext = LayoutInflater.from(paramContext).inflate(bp.E(), null);
    localDialog.setContentView(paramContext);
    paramContext.setOnClickListener(new en(localDialog));
    localDialog.setCancelable(false);
    localDialog.show();
  }
  
  public static void c(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    paramContext = paramContext.getSharedPreferences("shared_pre", 0).edit();
    paramContext.putString("username", new String(JniMethod.getJniMethod().encryptConfig(paramString.getBytes(), paramString.length())));
    paramContext.commit();
  }
  
  public static String d(Context paramContext)
  {
    paramContext = paramContext.getSharedPreferences("shared_pre", 0).getString("username", "");
    if (!"".equals(paramContext)) {
      try
      {
        paramContext = new String(JniMethod.getJniMethod().decryptConfig(paramContext.getBytes(), paramContext.length()));
        return paramContext;
      }
      catch (Exception paramContext)
      {
        return "";
      }
    }
    return paramContext;
  }
  
  public static String d(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (TextUtils.isDigitsOnly(paramString)))
    {
      paramString = new StringBuffer(paramString);
      while (paramString.length() < 3) {
        paramString.insert(0, "0");
      }
      paramString.insert(paramString.length() - 2, ".");
      return "  元";
    }
    return null;
  }
  
  public static void d(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    paramContext = paramContext.getSharedPreferences("shared_pre", 0).edit();
    paramContext.putString("pan", new String(JniMethod.getJniMethod().encryptConfig(paramString.getBytes(), paramString.length())));
    paramContext.commit();
  }
  
  public static Bitmap e(String paramString)
  {
    try
    {
      paramString = BitmapFactory.decodeStream(new URL(paramString).openConnection().getInputStream());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String e(Context paramContext)
  {
    paramContext = paramContext.getSharedPreferences("shared_pre", 0).getString("pan", "");
    if (!"".equals(paramContext)) {
      try
      {
        paramContext = new String(JniMethod.getJniMethod().decryptConfig(paramContext.getBytes(), paramContext.length()));
        return paramContext;
      }
      catch (Exception paramContext)
      {
        return "";
      }
    }
    return paramContext;
  }
  
  public static String f(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 3)) {
      return paramString;
    }
    return paramString.substring(0, 3) + "*****" + paramString.substring(paramString.length() - 3);
  }
  
  public static String g(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 4)) {
      return paramString;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString.length() % 4 == 0) {}
    for (int i = paramString.length() / 4;; i = paramString.length() / 4 + 1)
    {
      j = 0;
      while (j < i - 1)
      {
        localStringBuffer.append(paramString.substring(j * 4, j * 4 + 4) + " ");
        j += 1;
      }
    }
    int j = i - 1;
    while (j < i)
    {
      localStringBuffer.append(paramString.substring(j * 4, paramString.length()));
      j += 1;
    }
    return paramString.substring(0, 4) + " **** **** " + localStringBuffer.substring(15);
  }
  
  public static String h(String paramString)
  {
    return paramString.substring(paramString.length() - 4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */