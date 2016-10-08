package com.baidu.location.g;

import android.util.Xml;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;

class a
{
  public String a = "";
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public String f = "";
  public String g = "";
  private double h = Double.MIN_VALUE;
  private double i = Double.MIN_VALUE;
  private float j = 0.0F;
  private boolean k = false;
  private boolean l = true;
  
  public a() {}
  
  public a(String paramString)
  {
    try
    {
      XmlPullParser localXmlPullParser = Xml.newPullParser();
      localXmlPullParser.setInput(new StringReader(paramString));
      localXmlPullParser.next();
      int i1 = localXmlPullParser.getEventType();
      for (;;)
      {
        i1 = localXmlPullParser.next();
        int n;
        m = n;
        if (m == 0)
        {
          n = m;
          if (localXmlPullParser.getName().equals("LocationRS")) {
            n = 1;
          }
        }
        else
        {
          paramString = localXmlPullParser.getName();
          n = m;
          if (paramString != null)
          {
            boolean bool = paramString.equals("latitude");
            if (bool)
            {
              try
              {
                this.h = Double.valueOf(localXmlPullParser.nextText()).doubleValue();
                n = m;
              }
              catch (Exception paramString)
              {
                this.l = false;
                n = m;
              }
            }
            else
            {
              bool = paramString.equals("longitude");
              if (bool)
              {
                try
                {
                  this.i = Double.valueOf(localXmlPullParser.nextText()).doubleValue();
                  n = m;
                }
                catch (Exception paramString)
                {
                  this.l = false;
                  n = m;
                }
              }
              else
              {
                bool = paramString.equals("hpe");
                if (bool)
                {
                  try
                  {
                    this.j = Float.valueOf(localXmlPullParser.nextText()).floatValue();
                    n = m;
                  }
                  catch (Exception paramString)
                  {
                    this.l = false;
                    n = m;
                  }
                }
                else
                {
                  bool = paramString.equals("country");
                  if (bool) {}
                  try
                  {
                    this.c = localXmlPullParser.getAttributeValue(0);
                    try
                    {
                      this.b = localXmlPullParser.nextText();
                      n = m;
                    }
                    catch (Exception paramString)
                    {
                      n = m;
                    }
                    continue;
                    bool = paramString.equals("province");
                    if (bool)
                    {
                      try
                      {
                        this.d = localXmlPullParser.nextText();
                        n = m;
                      }
                      catch (Exception paramString)
                      {
                        n = m;
                      }
                      continue;
                    }
                    bool = paramString.equals("region");
                    if (bool)
                    {
                      try
                      {
                        this.e = localXmlPullParser.nextText();
                        n = m;
                      }
                      catch (Exception paramString)
                      {
                        n = m;
                      }
                      continue;
                    }
                    bool = paramString.equals("street-number");
                    if (bool)
                    {
                      try
                      {
                        this.g = localXmlPullParser.nextText();
                        n = m;
                      }
                      catch (Exception paramString)
                      {
                        n = m;
                      }
                      continue;
                    }
                    bool = paramString.equals("city");
                    if (bool)
                    {
                      try
                      {
                        this.a = localXmlPullParser.nextText();
                        n = m;
                      }
                      catch (Exception paramString)
                      {
                        n = m;
                      }
                      continue;
                    }
                    bool = paramString.equals("address-line");
                    if (bool)
                    {
                      try
                      {
                        this.f = localXmlPullParser.nextText();
                        n = m;
                      }
                      catch (Exception paramString)
                      {
                        n = m;
                      }
                      continue;
                    }
                    n = m;
                    if (!paramString.equals("error")) {
                      continue;
                    }
                    this.l = false;
                    n = m;
                  }
                  catch (Exception paramString)
                  {
                    for (;;) {}
                  }
                  if (i1 == 1) {
                    break;
                  }
                  n = m;
                  switch (i1)
                  {
                  }
                  n = m;
                }
              }
            }
          }
        }
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public boolean a()
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (!this.b.equals("China"))
    {
      bool1 = bool2;
      if (!this.b.equals("Taiwan"))
      {
        bool1 = bool2;
        if (!this.c.equals("HK")) {
          bool1 = false;
        }
      }
    }
    return bool1;
  }
  
  public boolean b()
  {
    return this.l;
  }
  
  public double c()
  {
    return this.h;
  }
  
  public double d()
  {
    return this.i;
  }
  
  public float e()
  {
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */