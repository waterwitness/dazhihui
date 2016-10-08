package com.iflytek.cloud.util;

import android.text.TextUtils;
import com.iflytek.thirdparty.X;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class UserWords
{
  private Hashtable<String, ArrayList<String>> a = null;
  
  public UserWords() {}
  
  public UserWords(String paramString)
  {
    a(paramString);
  }
  
  private String a()
  {
    JSONArray localJSONArray1;
    for (;;)
    {
      Map.Entry localEntry;
      JSONObject localJSONObject2;
      try
      {
        if (this.a == null)
        {
          X.a("mwords is null...");
          return null;
        }
        JSONObject localJSONObject1 = new JSONObject();
        localJSONArray1 = new JSONArray();
        Iterator localIterator1 = this.a.entrySet().iterator();
        if (!localIterator1.hasNext()) {
          break;
        }
        localEntry = (Map.Entry)localIterator1.next();
        localJSONObject2 = new JSONObject();
        JSONArray localJSONArray2 = new JSONArray();
        Iterator localIterator2 = ((ArrayList)localEntry.getValue()).iterator();
        if (localIterator2.hasNext())
        {
          localJSONArray2.put((String)localIterator2.next());
          continue;
        }
        localJSONObject2.put("words", localJSONArray2);
      }
      catch (JSONException localJSONException)
      {
        X.a(localJSONException);
        return null;
      }
      localJSONObject2.put("name", localEntry.getKey());
      localJSONArray1.put(localJSONObject2);
    }
    localJSONException.put("userword", localJSONArray1);
    String str = localJSONException.toString();
    return str;
  }
  
  private void a(String paramString)
  {
    for (;;)
    {
      int j;
      try
      {
        if (TextUtils.isEmpty(paramString))
        {
          X.a("userword is null...");
          return;
        }
        paramString = new JSONObject(new JSONTokener(paramString)).getJSONArray("userword");
        int i = 0;
        if (i < paramString.length())
        {
          JSONObject localJSONObject = (JSONObject)paramString.get(i);
          JSONArray localJSONArray = localJSONObject.getJSONArray("words");
          ArrayList localArrayList = new ArrayList();
          j = 0;
          if (j < localJSONArray.length())
          {
            String str = localJSONArray.get(j).toString();
            if ((localArrayList != null) && (!localArrayList.contains(str))) {
              localArrayList.add(str);
            }
          }
          else
          {
            this.a.put(localJSONObject.get("name").toString(), localArrayList);
            i += 1;
          }
        }
        else
        {
          return;
        }
      }
      catch (JSONException paramString)
      {
        X.a(paramString);
      }
      j += 1;
    }
  }
  
  private boolean a(ArrayList<String> paramArrayList, String paramString)
  {
    if ((paramArrayList != null) && (!paramArrayList.contains(paramString)))
    {
      paramArrayList.add(paramString);
      return true;
    }
    return false;
  }
  
  private boolean a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if ((paramArrayList1 == null) || (paramArrayList2 == null)) {
      return false;
    }
    paramArrayList2 = paramArrayList2.iterator();
    while (paramArrayList2.hasNext()) {
      a(paramArrayList1, (String)paramArrayList2.next());
    }
    return true;
  }
  
  public ArrayList<String> getKeys()
  {
    Object localObject;
    if ((this.a == null) || (this.a.isEmpty()))
    {
      localObject = null;
      return (ArrayList<String>)localObject;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.keySet().iterator();
    for (;;)
    {
      localObject = localArrayList;
      if (!localIterator.hasNext()) {
        break;
      }
      localArrayList.add(localIterator.next());
    }
  }
  
  public ArrayList<String> getWords()
  {
    return getWords("default");
  }
  
  public ArrayList<String> getWords(String paramString)
  {
    return (ArrayList)this.a.get(paramString);
  }
  
  public boolean hasKey(String paramString)
  {
    return this.a.containsKey(paramString);
  }
  
  public boolean putWord(String paramString)
  {
    return putWord("default", paramString);
  }
  
  public boolean putWord(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    ArrayList localArrayList = getWords(paramString1);
    if (localArrayList != null) {
      a(localArrayList, paramString2);
    }
    for (;;)
    {
      return true;
      localArrayList = new ArrayList();
      a(localArrayList, paramString2);
      this.a.put(paramString1, localArrayList);
    }
  }
  
  public boolean putWords(String paramString, ArrayList<String> paramArrayList)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramArrayList == null)) {
      return false;
    }
    ArrayList localArrayList = getWords(paramString);
    if (localArrayList != null) {
      a(localArrayList, paramArrayList);
    }
    for (;;)
    {
      return true;
      localArrayList = new ArrayList();
      a(localArrayList, paramArrayList);
      this.a.put(paramString, localArrayList);
    }
  }
  
  public boolean putWords(ArrayList<String> paramArrayList)
  {
    return putWords("default", paramArrayList);
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\UserWords.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */