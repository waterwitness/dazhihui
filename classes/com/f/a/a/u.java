package com.f.a.a;

import android.content.Context;
import android.util.Xml;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

public class u
{
  private static u O = null;
  public static Context b;
  public StringBuffer A = new StringBuffer();
  public StringBuffer B = new StringBuffer();
  public StringBuffer C = new StringBuffer();
  public Vector D;
  public GetBundleBankCardList E;
  public String F;
  public String G;
  public String H;
  public String I;
  public String J;
  public String K;
  public String L;
  public String M;
  public String N;
  public y a;
  public bw c;
  public ee d;
  public d e;
  public boolean f;
  public boolean g = false;
  public boolean h = false;
  public String i;
  public String j;
  public String k;
  public String l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String r;
  public String s;
  public String t;
  public String u;
  public boolean v;
  public StringBuffer w = new StringBuffer();
  public StringBuffer x = new StringBuffer();
  public StringBuffer y = new StringBuffer();
  public StringBuffer z = new StringBuffer();
  
  private u()
  {
    e();
  }
  
  public static u a()
  {
    try
    {
      if (O == null) {
        O = new u();
      }
      u localu = O;
      return localu;
    }
    finally {}
  }
  
  private void e()
  {
    this.a = new y();
    this.c = new bw();
    this.e = new d();
    this.d = new ee();
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (paramBoolean)
    {
      this.M = "http://202.101.25.188:8080/qzjy/GateWay/deal.action";
      this.N = "upomp_lthj_config_test.xml";
      return;
    }
    this.M = "http://mobilepay.unionpaysecure.com/qzjy/GateWay/deal.action";
    this.N = "upomp_lthj_config_fromal.xml";
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        localObject = new ByteArrayInputStream(paramArrayOfByte);
        paramArrayOfByte = Xml.newPullParser();
        paramArrayOfByte.setInput((InputStream)localObject, "UTF-8");
        i1 = paramArrayOfByte.getEventType();
        break label148;
      }
      catch (Exception paramArrayOfByte)
      {
        paramArrayOfByte = paramArrayOfByte;
        paramArrayOfByte.printStackTrace();
        throw paramArrayOfByte;
      }
      finally {}
      int i1 = paramArrayOfByte.next();
      break label148;
      Object localObject = paramArrayOfByte.getName();
      if (((String)localObject).equalsIgnoreCase("merchantId"))
      {
        this.i = paramArrayOfByte.nextText();
      }
      else if (((String)localObject).equalsIgnoreCase("merchantOrderId"))
      {
        this.l = paramArrayOfByte.nextText();
      }
      else if (((String)localObject).equalsIgnoreCase("merchantOrderTime"))
      {
        this.m = paramArrayOfByte.nextText();
      }
      else if (((String)localObject).equalsIgnoreCase("sign"))
      {
        this.s = paramArrayOfByte.nextText();
        label148:
        while (i1 == 1) {
          return;
        }
        switch (i1)
        {
        }
      }
    }
  }
  
  public void b()
  {
    this.e.a();
    O = null;
  }
  
  public void c()
  {
    this.A.delete(0, this.A.length());
    this.B.delete(0, this.B.length());
    this.C.delete(0, this.C.length());
  }
  
  public byte[] d()
  {
    XmlSerializer localXmlSerializer = Xml.newSerializer();
    for (;;)
    {
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localXmlSerializer.setOutput(localByteArrayOutputStream, "utf-8");
        localXmlSerializer.startDocument("utf-8", Boolean.valueOf(true));
        localXmlSerializer.startTag(null, "upomp");
        localXmlSerializer.attribute(null, "version", "1.0.0");
        localXmlSerializer.startTag(null, "application");
        localXmlSerializer.text("LanchPay.Rsp");
        localXmlSerializer.endTag(null, "application");
        localXmlSerializer.startTag(null, "merchantId");
        localXmlSerializer.text(this.i);
        localXmlSerializer.endTag(null, "merchantId");
        localXmlSerializer.startTag(null, "merchantOrderId");
        localXmlSerializer.text(this.l);
        localXmlSerializer.endTag(null, "merchantOrderId");
        localXmlSerializer.startTag(null, "merchantOrderTime");
        localXmlSerializer.text(this.m);
        localXmlSerializer.endTag(null, "merchantOrderTime");
        localXmlSerializer.startTag(null, "respCode");
        if (this.t != null)
        {
          localXmlSerializer.text(this.t);
          localXmlSerializer.endTag(null, "respCode");
          localXmlSerializer.startTag(null, "respDesc");
          if (this.u != null)
          {
            localXmlSerializer.text(this.u);
            localXmlSerializer.endTag(null, "respDesc");
            localXmlSerializer.endTag(null, "upomp");
            localXmlSerializer.endDocument();
            return localByteArrayOutputStream.toByteArray();
          }
        }
        else
        {
          localXmlSerializer.text("");
          continue;
        }
        localException.text("");
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return null;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */