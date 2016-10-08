package com.f.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.unionpay.upomp.lthj.plugin.model.SmsCodeVerfiyData;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;
import java.util.regex.Pattern;

public class cd
{
  public static boolean a(Context paramContext)
  {
    if (!new String(ec.b(u.a().e.d.toString().getBytes())).equals(new String(ec.b(u.a().e.e.toString().getBytes()))))
    {
      ec.b(paramContext, paramContext.getString(bp.dR()));
      return false;
    }
    return true;
  }
  
  public static boolean a(Context paramContext, CheckBox paramCheckBox)
  {
    if (!paramCheckBox.isChecked())
    {
      ec.b(paramContext, paramContext.getString(bp.dI()));
      return false;
    }
    return true;
  }
  
  public static boolean a(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if ((TextUtils.isEmpty(paramEditText)) || (paramEditText.length() != 11))
    {
      ec.b(paramContext, paramContext.getString(bp.dF()));
      return false;
    }
    if (!TextUtils.isDigitsOnly(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dG()));
      return false;
    }
    return true;
  }
  
  public static boolean a(Context paramContext, EditText paramEditText, Button paramButton)
  {
    if (paramEditText == null) {}
    do
    {
      return true;
      paramEditText = paramEditText.getText().toString().trim();
      if (TextUtils.isEmpty(paramEditText))
      {
        ec.b(paramContext, paramContext.getString(bp.dC()));
        return false;
      }
    } while (paramEditText.length() == 6);
    ec.b(paramContext, paramContext.getString(bp.dD()));
    return false;
  }
  
  public static boolean a(Context paramContext, EditText paramEditText, String paramString)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if ((TextUtils.isEmpty(paramEditText)) || (paramEditText.length() != 11))
    {
      ec.b(paramContext, paramContext.getString(bp.dF()));
      return false;
    }
    if (paramEditText.contains("*"))
    {
      if (Pattern.matches("^1\\d{2}\\*{5}\\d{3}$", paramEditText))
      {
        if ((!paramEditText.substring(0, 3).equals(paramString.substring(0, 3))) || (!paramEditText.substring(8, 11).equals(paramString.substring(paramString.length() - 3, paramString.length()))))
        {
          ec.b(paramContext, paramContext.getString(bp.dG()));
          return false;
        }
      }
      else
      {
        ec.b(paramContext, paramContext.getString(bp.dG()));
        return false;
      }
    }
    else if (!TextUtils.isDigitsOnly(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dG()));
      return false;
    }
    return true;
  }
  
  public static boolean a(Context paramContext, SmsCodeVerfiyData paramSmsCodeVerfiyData)
  {
    if (paramSmsCodeVerfiyData == null) {
      return false;
    }
    String str = paramSmsCodeVerfiyData.smsCode;
    if (TextUtils.isEmpty(str))
    {
      ec.b(paramContext, paramContext.getString(bp.dC()));
      return false;
    }
    if (str.length() != 6)
    {
      ec.b(paramContext, paramContext.getString(bp.dD()));
      return false;
    }
    if (JniMethod.getJniMethod().validateSMSCode(paramSmsCodeVerfiyData) == 0) {
      return true;
    }
    ec.b(paramContext, paramContext.getString(bp.dE()));
    return false;
  }
  
  public static boolean a(Context paramContext, ValidateCodeView paramValidateCodeView)
  {
    if (paramValidateCodeView == null) {}
    do
    {
      do
      {
        return true;
      } while (paramValidateCodeView.getVisibility() != 0);
      paramValidateCodeView = paramValidateCodeView.d().trim();
      if (TextUtils.isEmpty(paramValidateCodeView))
      {
        ec.b(paramContext, paramContext.getString(bp.dS()));
        return false;
      }
      if (!TextUtils.isDigitsOnly(paramValidateCodeView))
      {
        ec.b(paramContext, paramContext.getString(bp.dT()));
        return false;
      }
    } while (paramValidateCodeView.length() == 4);
    ec.b(paramContext, paramContext.getString(bp.dT()));
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    paramString = paramString.trim();
    if ((TextUtils.isEmpty(paramString)) || (paramString.length() != 11))
    {
      ec.b(paramContext, paramContext.getString(bp.dF()));
      return false;
    }
    return true;
  }
  
  public static boolean b(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dH()));
      return false;
    }
    int i = paramEditText.length();
    if ((i < 6) || (i > 20))
    {
      ec.b(paramContext, paramContext.getString(bp.dJ()));
      return false;
    }
    return true;
  }
  
  public static boolean b(Context paramContext, EditText paramEditText, String paramString)
  {
    paramEditText = paramEditText.getText().toString().replace(" ", "");
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.ea()));
      return false;
    }
    if ((paramEditText.length() < 15) || (paramEditText.length() > 19))
    {
      ec.b(paramContext, paramContext.getString(bp.eb()));
      return false;
    }
    if (paramEditText.contains("*"))
    {
      if (Pattern.matches("^\\d{4}\\*{8}\\d{4,7}$", paramEditText))
      {
        if ((!paramEditText.substring(0, 4).equals(paramString.substring(0, 4))) || (!paramEditText.substring(12, paramEditText.length()).equals(paramString.substring(12, paramString.length()))))
        {
          ec.b(paramContext, paramContext.getString(bp.eb()));
          return false;
        }
      }
      else
      {
        ec.b(paramContext, paramContext.getString(bp.eb()));
        return false;
      }
    }
    else if (!TextUtils.isDigitsOnly(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.eb()));
      return false;
    }
    return true;
  }
  
  public static boolean c(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dK()));
      return false;
    }
    int i = paramEditText.length();
    if ((i < 6) || (i > 12))
    {
      ec.b(paramContext, paramContext.getString(bp.dL()));
      return false;
    }
    return true;
  }
  
  public static boolean d(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dN()));
      return false;
    }
    int i = paramEditText.length();
    if ((i < 6) || (i > 12))
    {
      ec.b(paramContext, paramContext.getString(bp.dO()));
      return false;
    }
    return true;
  }
  
  public static boolean e(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dP()));
      return false;
    }
    int i = paramEditText.length();
    if ((i < 6) || (i > 12))
    {
      ec.b(paramContext, paramContext.getString(bp.dQ()));
      return false;
    }
    return true;
  }
  
  public static boolean f(Context paramContext, EditText paramEditText)
  {
    if (TextUtils.isEmpty(paramEditText.getText().toString().trim()))
    {
      ec.b(paramContext, paramContext.getString(bp.dU()));
      return false;
    }
    return true;
  }
  
  public static boolean g(Context paramContext, EditText paramEditText)
  {
    if (TextUtils.isEmpty(paramEditText.getText().toString().trim()))
    {
      ec.b(paramContext, paramContext.getString(bp.dV()));
      return false;
    }
    return true;
  }
  
  public static boolean h(Context paramContext, EditText paramEditText)
  {
    if (TextUtils.isEmpty(paramEditText.getText().toString().trim()))
    {
      ec.b(paramContext, paramContext.getString(bp.dW()));
      return false;
    }
    return true;
  }
  
  public static boolean i(Context paramContext, EditText paramEditText)
  {
    if (TextUtils.isEmpty(paramEditText.getText().toString().trim()))
    {
      ec.b(paramContext, paramContext.getString(bp.dX()));
      return false;
    }
    return true;
  }
  
  public static boolean j(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.dY()));
      return false;
    }
    if (paramEditText.length() != 3)
    {
      ec.b(paramContext, paramContext.getString(bp.dZ()));
      return false;
    }
    return true;
  }
  
  public static boolean k(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.ea()));
      return false;
    }
    if ((paramEditText.length() < 18) || (paramEditText.length() > 23))
    {
      ec.b(paramContext, paramContext.getString(bp.eb()));
      return false;
    }
    return true;
  }
  
  public static boolean l(Context paramContext, EditText paramEditText)
  {
    paramEditText = paramEditText.getText().toString().trim();
    if (TextUtils.isEmpty(paramEditText))
    {
      ec.b(paramContext, paramContext.getString(bp.ec()));
      return false;
    }
    if (paramEditText.length() != 6)
    {
      ec.b(paramContext, paramContext.getString(bp.ed()));
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */