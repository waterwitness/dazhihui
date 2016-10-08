package org.apache.cordova;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

@Deprecated
public class JSONUtils
{
  public static List<String> toStringList(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i >= paramJSONArray.length()) {
        return localArrayList;
      }
      localArrayList.add(paramJSONArray.get(i).toString());
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\JSONUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */