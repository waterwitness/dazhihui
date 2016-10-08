package com.android.dazhihui.ui.delegate.screen.fund;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class az
  extends bz
{
  public static String[] a;
  public static String[] b;
  public static String[] c;
  public static String[] d;
  public static String e;
  public static String f;
  public static String[][] g = { { "0", "每月" }, { "1", "每周" }, { "2", "每季度" }, { "3", "每年" }, { "4", "每天" } };
  
  public static String a(String paramString)
  {
    return a(b(), paramString, 1, 0);
  }
  
  public static List<String> a()
  {
    if (e == null) {
      localObject1 = null;
    }
    ArrayList localArrayList;
    String[] arrayOfString;
    int k;
    int i;
    do
    {
      return (List<String>)localObject1;
      localArrayList = new ArrayList();
      arrayOfString = e.split(",");
      b(arrayOfString[0]);
      k = arrayOfString.length;
      i = 1;
      localObject1 = localArrayList;
    } while (i > k - 1);
    Object localObject1 = arrayOfString[i].split(":");
    Object localObject2 = localObject1[0];
    if (((String)localObject2).equals("0")) {
      localArrayList.add(localObject1[1]);
    }
    for (;;)
    {
      i += 1;
      break;
      if (((String)localObject2).equals("1"))
      {
        localObject1 = localObject1[1].split("-");
        int j = b(localObject1[0]);
        int m = b(localObject1[1]);
        while (j <= m)
        {
          localArrayList.add(String.valueOf(j));
          j += 1;
        }
      }
    }
  }
  
  public static String[][] b()
  {
    if (f == null)
    {
      localObject = g;
      return (String[][])localObject;
    }
    Object localObject = f.split(",");
    b(localObject[0]);
    int j = localObject.length - 1;
    String[][] arrayOfString = (String[][])Array.newInstance(String.class, new int[] { j, 2 });
    int i = 1;
    while (i <= j)
    {
      String[] arrayOfString1 = localObject[i].split(":");
      arrayOfString[(i - 1)][0] = arrayOfString1[0];
      arrayOfString[(i - 1)][1] = arrayOfString1[1];
      i += 1;
    }
    i = 0;
    for (;;)
    {
      localObject = arrayOfString;
      if (i >= arrayOfString.length) {
        break;
      }
      System.out.println(arrayOfString[i][0] + ":" + arrayOfString[i][1]);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */