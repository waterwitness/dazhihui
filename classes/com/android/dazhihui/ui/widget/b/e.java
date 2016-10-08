package com.android.dazhihui.ui.widget.b;

import com.android.dazhihui.ui.screen.BaseActivity;
import java.util.Enumeration;
import java.util.Vector;

public class e
{
  private a a;
  private int b;
  private int c;
  private Vector d;
  private Vector e;
  private Vector f;
  private int g;
  private int h = 0;
  private String i = "";
  private int j = 0;
  private int k = 0;
  private String l = null;
  private String m = null;
  private String n = "";
  private String o = "";
  private String p = "";
  private String q;
  private StringBuffer r;
  private BaseActivity s;
  private final int t = 8;
  private final int u = 2;
  
  public e(a parama)
  {
    this.a = parama;
    this.b = parama.a;
    this.c = parama.b;
    this.e = new Vector();
    this.d = new Vector();
    this.f = new Vector();
  }
  
  private void a(Enumeration paramEnumeration, c paramc)
  {
    String str1 = paramc.a();
    this.q = paramc.b("title");
    for (;;)
    {
      paramc = paramEnumeration.nextElement();
      this.g += 1;
      if ((paramc instanceof c))
      {
        paramc = (c)paramc;
        String str2 = paramc.a();
        if ((str2.equals(str1)) && (paramc.b() == 2)) {
          return;
        }
        if ((!str2.equals("p")) && (str2.equals("br"))) {
          this.r.append("\n");
        }
      }
      else
      {
        this.r.append((String)paramc);
      }
    }
  }
  
  public void a()
  {
    this.r = new StringBuffer();
  }
  
  public void a(BaseActivity paramBaseActivity)
  {
    this.s = paramBaseActivity;
  }
  
  public void a(Vector paramVector, String paramString)
  {
    paramVector = paramVector.elements();
    while (paramVector.hasMoreElements())
    {
      paramString = paramVector.nextElement();
      this.g += 1;
      if ((paramString instanceof c))
      {
        paramString = (c)paramString;
        if (!paramString.a().equals("head")) {
          if ((paramString.a().equals("card")) && (paramString.b() == 1)) {
            a(paramVector, paramString);
          } else if ((!paramString.a().equals("body")) || (paramString.b() != 1)) {}
        }
      }
    }
  }
  
  public String b()
  {
    return this.r.toString();
  }
  
  public String c()
  {
    return this.q;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */