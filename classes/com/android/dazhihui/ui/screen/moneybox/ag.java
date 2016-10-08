package com.android.dazhihui.ui.screen.moneybox;

import java.lang.reflect.Array;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ag
{
  String a;
  String[][] b;
  
  public void a(JSONArray paramJSONArray)
  {
    if (paramJSONArray != null)
    {
      this.b = ((String[][])Array.newInstance(String.class, new int[] { paramJSONArray.length(), 7 }));
      int i = 0;
      for (;;)
      {
        if (i < paramJSONArray.length()) {
          try
          {
            this.b[i][0] = paramJSONArray.getJSONObject(i).getString("jjdm");
            this.b[i][1] = paramJSONArray.getJSONObject(i).getString("cz");
            this.b[i][2] = paramJSONArray.getJSONObject(i).getString("sgdw");
            this.b[i][3] = paramJSONArray.getJSONObject(i).getString("shdw");
            this.b[i][4] = paramJSONArray.getJSONObject(i).getString("sc");
            this.b[i][5] = paramJSONArray.getJSONObject(i).getString("cjcx");
            this.b[i][6] = paramJSONArray.getJSONObject(i).getString("state");
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              localJSONException.printStackTrace();
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */