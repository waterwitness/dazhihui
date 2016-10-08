package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import com.android.dazhihui.ui.delegate.b.h;

public class g
{
  public static h a(h paramh)
  {
    String str1 = paramh.a("1325");
    int i = str1.indexOf(",");
    String str2 = str1.substring(0, i);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12191").append(",");
    localStringBuilder2.append("12195").append(",");
    localStringBuilder2.append("12199").append(",");
    localStringBuilder2.append("12207").append(",");
    localStringBuilder2.append("12209").append(",");
    localStringBuilder2.append("12211").append(",");
    localStringBuilder2.append("12217").append(",");
    localStringBuilder2.append("12219").append(",");
    localStringBuilder2.append("12221").append(",");
    localStringBuilder2.append("12215").append(",");
    localStringBuilder2.append("12285").append(",");
    localStringBuilder2.append("12287").append(",");
    localStringBuilder2.append("12289").append(",");
    localStringBuilder2.append("12291").append(",");
    localStringBuilder2.append("12329").append(",");
    localStringBuilder2.append("12341").append(",");
    localStringBuilder2.append("12203").append(",");
    localStringBuilder2.append("12249").append(",");
    localStringBuilder2.append("12287").append(",");
    localStringBuilder2.append("12403").append(",");
    localStringBuilder2.append("12411").append(",");
    localStringBuilder2.append("12407").append(",");
    localStringBuilder2.append("12979").append(",");
    localStringBuilder2.append("12419");
    int j = Integer.valueOf(str2).intValue();
    str1 = str1.substring(i + 1, str1.length());
    localStringBuilder1.append(j + 24).append(",");
    if ((str1 != null) && (str1.length() > 0)) {
      localStringBuilder1.append(str1).append(",");
    }
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */