package com.iflytek.speech;

import android.text.TextUtils;
import com.iflytek.thirdparty.X;
import java.util.ArrayList;
import java.util.Iterator;

public final class SpeechComponent
{
  private ArrayList<String> mEngines = new ArrayList();
  private String mPackageName = "";
  
  public SpeechComponent(String paramString)
  {
    if (paramString != null) {
      this.mPackageName = paramString;
    }
  }
  
  public void addEngine(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.mEngines.add(paramString);
    }
  }
  
  public ArrayList<String> getEngines()
  {
    return this.mEngines;
  }
  
  public String getPackageName()
  {
    return this.mPackageName;
  }
  
  public boolean isEngineAvaible(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if (this.mEngines.size() == 0) {
      return false;
    }
    Iterator localIterator = this.mEngines.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        boolean bool = str.contains(paramString);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException)
      {
        X.a(localException);
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechComponent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */