package com.android.dazhihui.ui.screen.stock;

public enum nm
{
  private String K;
  private String L;
  
  private nm(String paramString1, String paramString2)
  {
    this.K = paramString1;
    this.L = paramString2;
  }
  
  public static String a(String paramString)
  {
    String str = "";
    nm[] arrayOfnm = values();
    int i2 = arrayOfnm.length;
    int i1 = 0;
    for (;;)
    {
      Object localObject = str;
      if (i1 < i2)
      {
        localObject = arrayOfnm[i1];
        if (((nm)localObject).a().equals(paramString)) {
          localObject = ((nm)localObject).b();
        }
      }
      else
      {
        return (String)localObject;
      }
      i1 += 1;
    }
  }
  
  public String a()
  {
    return this.K;
  }
  
  public String b()
  {
    return this.L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */