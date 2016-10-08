package com.iflytek.speech.util;

import android.content.Context;
import android.preference.EditTextPreference;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SettingTextWatcher
  implements TextWatcher
{
  private int editCount;
  private int editStart;
  private Context mContext;
  private EditTextPreference mEditTextPreference;
  int maxValue;
  int minValue;
  
  public SettingTextWatcher(Context paramContext, EditTextPreference paramEditTextPreference, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.mEditTextPreference = paramEditTextPreference;
    this.minValue = paramInt1;
    this.maxValue = paramInt2;
  }
  
  public static boolean isNumeric(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (TextUtils.isEmpty(paramEditable)) {}
    int i;
    do
    {
      return;
      String str = paramEditable.toString();
      if (!isNumeric(str)) {
        break;
      }
      i = Integer.parseInt(str);
    } while ((i <= this.maxValue) && (i >= this.minValue));
    paramEditable.delete(this.editStart, this.editStart + this.editCount);
    this.mEditTextPreference.getEditText().setText(paramEditable);
    Toast.makeText(this.mContext, "超出有效值范围", 0).show();
    return;
    paramEditable.delete(this.editStart, this.editStart + this.editCount);
    this.mEditTextPreference.getEditText().setText(paramEditable);
    Toast.makeText(this.mContext, "只能输入数字哦", 0).show();
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.editStart = paramInt1;
    this.editCount = paramInt3;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\util\SettingTextWatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */