package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class dn
{
  private static final String a = dn.class.getSimpleName();
  private static dn d;
  private HashMap<List<Integer>, String> b = new HashMap();
  private HashMap<String, ArrayList<String>> c = new HashMap();
  
  private dn(Context paramContext)
  {
    b(paramContext);
  }
  
  public static dn a(Context paramContext)
  {
    if (d == null) {
      d = new dn(paramContext);
    }
    return d;
  }
  
  private int[] b(String paramString)
  {
    int j = 0;
    paramString = paramString.toCharArray();
    int k = paramString.length;
    int[] arrayOfInt = new int[Character.codePointCount(paramString, 0, k)];
    int i = 0;
    while (j < k)
    {
      int m = Character.codePointAt(paramString, j);
      arrayOfInt[i] = m;
      j += Character.charCount(m);
      i += 1;
    }
    return arrayOfInt;
  }
  
  public SpannableString a(Context paramContext, int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramContext = paramContext.getResources().getDrawable(paramInt);
    paramContext.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
    paramContext = new ImageSpan(paramContext, paramString);
    SpannableString localSpannableString = new SpannableString(paramString);
    localSpannableString.setSpan(paramContext, 0, paramString.length(), 33);
    return localSpannableString;
  }
  
  public String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = b(paramString);
    int i = 0;
    if (i < paramString.length)
    {
      ArrayList localArrayList = new ArrayList();
      if (i + 1 < paramString.length)
      {
        localArrayList.add(Integer.valueOf(paramString[i]));
        localArrayList.add(Integer.valueOf(paramString[(i + 1)]));
        if (this.b.containsKey(localArrayList))
        {
          if ((String)this.b.get(localArrayList) != null) {
            localStringBuilder.append("[表情]");
          }
          i += 1;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.clear();
        localArrayList.add(Integer.valueOf(paramString[i]));
        if (this.b.containsKey(localArrayList))
        {
          if ((String)this.b.get(localArrayList) != null) {
            localStringBuilder.append("[表情]");
          }
        }
        else {
          localStringBuilder.append(Character.toChars(paramString[i]));
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public void b(Context paramContext)
  {
    Object localObject1 = null;
    if ((this.b == null) || (this.b.size() == 0)) {
      this.b = new HashMap();
    }
    for (;;)
    {
      try
      {
        localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        localXmlPullParser.setInput(paramContext.getAssets().open("emoji.xml"), "UTF-8");
        i = localXmlPullParser.getEventType();
        paramContext = null;
      }
      catch (Exception paramContext)
      {
        XmlPullParser localXmlPullParser;
        Log.e(a, paramContext.toString(), paramContext);
      }
      int i = localXmlPullParser.next();
      break label312;
      if (localXmlPullParser.getName().equals("key"))
      {
        paramContext = new ArrayList();
        localObject1 = localXmlPullParser.nextText();
      }
      Object localObject2 = paramContext;
      Object localObject3 = localObject1;
      if (localXmlPullParser.getName().equals("e"))
      {
        localObject2 = localXmlPullParser.nextText();
        paramContext.add(localObject2);
        localObject3 = new ArrayList();
        if (((String)localObject2).length() > 6)
        {
          arrayOfString = ((String)localObject2).split("\\_");
          j = arrayOfString.length;
          i = 0;
          if (i < j)
          {
            ((List)localObject3).add(Integer.valueOf(Integer.parseInt(arrayOfString[i], 16)));
            i += 1;
            continue;
          }
        }
        else
        {
          ((List)localObject3).add(Integer.valueOf(Integer.parseInt((String)localObject2, 16)));
        }
        this.b.put(localObject3, localObject2);
        continue;
        localObject2 = paramContext;
        localObject3 = localObject1;
        if (localXmlPullParser.getName().equals("dict"))
        {
          this.c.put(localObject1, paramContext);
          continue;
          Log.d("", "parse emoji complete");
          localObject2 = paramContext;
          localObject3 = localObject1;
          label312:
          while (i == 1)
          {
            String[] arrayOfString;
            int j;
            return;
          }
        }
      }
      switch (i)
      {
      case 2: 
      case 3: 
      case 1: 
      default: 
        localObject3 = localObject1;
        localObject2 = paramContext;
        localObject1 = localObject3;
        paramContext = (Context)localObject2;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */