package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.AdvHeader;
import com.android.dazhihui.ui.model.stock.BodyField;
import com.android.dazhihui.ui.model.stock.ComentHideField;
import com.android.dazhihui.ui.model.stock.ComentZanField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.w;
import com.c.a.k;
import com.c.a.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class oy
{
  public static HashMap<String, Boolean> a = new HashMap();
  public static int b = a.size();
  private static oy c;
  private AdvertUpPullVo d;
  private String e = "1100001/1";
  private String f = null;
  private m g;
  
  public static m a(int paramInt, String paramString)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(6, paramInt, paramString, true));
    localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new pc().getType());
    localx.b(2);
    localx.a(paramString.getBytes());
    return new m(localx);
  }
  
  public static m a(String paramString)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(4, paramString, 1));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new pj().getType());
    localx.b(2);
    localx.a(paramString.getBytes());
    return new m(localx);
  }
  
  public static m a(String paramString, int paramInt)
  {
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(4, paramString, paramInt));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = ((k)localObject).a(paramString, new pl().getType());
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    return new m((x)localObject);
  }
  
  public static m a(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(7, paramInt1, paramString, paramInt2));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = ((k)localObject).a(paramString, new pg().getType());
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    return new m((x)localObject);
  }
  
  public static m a(String paramString1, String paramString2)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentZanField(String.valueOf(3), paramString2, com.android.dazhihui.g.a().v(), w.a().f(), paramString1));
    localLinkedHashMap.put("header", new HeaderField(114));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1, new pp().getType());
    localx.b(2);
    localx.a(paramString1.getBytes());
    return new m(localx);
  }
  
  public static m a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    String str = "";
    if (!TextUtils.isEmpty(w.a().g())) {
      str = w.a().g();
    }
    localLinkedHashMap.put("data", new ComentZanField(String.valueOf(13), paramString2, com.android.dazhihui.g.a().v(), w.a().f(), "", str, paramString1, paramString3, paramString4));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1, new pi().getType());
    paramString2 = new x(3005);
    paramString2.b(2);
    paramString2.a(paramString1.getBytes());
    return new m(paramString2);
  }
  
  public static oy a()
  {
    if (c == null) {
      c = new oy();
    }
    return c;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    Object localObject;
    String str1;
    try
    {
      localObject = new q(paramArrayOfByte);
      int i = paramArrayOfByte.length;
      ((q)localObject).b();
      paramArrayOfByte = new String(paramArrayOfByte, 1, i - 1);
      if (TextUtils.isEmpty(paramArrayOfByte)) {
        return;
      }
      paramArrayOfByte = new JSONArray(paramArrayOfByte).getJSONObject(0);
      localObject = (JsonHeader)new k().a(paramArrayOfByte.getJSONObject("header").toString(), JsonHeader.class);
      str1 = ((JsonHeader)localObject).getKey();
      String str2 = ((JsonHeader)localObject).getError();
      String str3 = ((JsonHeader)localObject).getService();
      if ((TextUtils.isEmpty(str3)) || (110 != Integer.valueOf(str3).intValue())) {
        return;
      }
      if ((TextUtils.isEmpty(this.e)) || (("1".equals(str2)) && (this.e.equals(str1))))
      {
        a().a(null);
        return;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return;
    }
    if (this.e.equals(str1))
    {
      this.e = ((JsonHeader)localObject).getNext();
      this.f = ((JsonHeader)localObject).getPrev();
      paramArrayOfByte = (AdvertUpPullVo)new k().a(paramArrayOfByte.toString(), AdvertUpPullVo.class);
      a().a(paramArrayOfByte);
    }
  }
  
  public static m b(String paramString)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2960);
    arrayOfx[0].a(paramString);
    arrayOfx[0].c(1);
    arrayOfx[1] = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(0, "", "", 1, paramString));
    localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new pk().getType());
    arrayOfx[1].b(2);
    arrayOfx[1].a(paramString.getBytes());
    return new m(arrayOfx);
  }
  
  public static m b(String paramString, int paramInt)
  {
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(0, "", "", paramInt, paramString));
    localLinkedHashMap.put("header", new HeaderField(113, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = ((k)localObject).a(paramString, new pm().getType());
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    return new m((x)localObject);
  }
  
  public static m b(String paramString1, String paramString2)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentZanField(String.valueOf(3), paramString2, com.android.dazhihui.g.a().v(), w.a().f(), paramString1));
    localLinkedHashMap.put("header", new HeaderField(113));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1, new pa().getType());
    localx.b(2);
    localx.a(paramString1.getBytes());
    return new m(localx);
  }
  
  public static m c(String paramString)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentHideField(1, paramString));
    localLinkedHashMap.put("header", new HeaderField(113));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new pn().getType());
    localx.b(2);
    localx.a(paramString.getBytes());
    return new m(localx);
  }
  
  public static m c(String paramString1, String paramString2)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentZanField(String.valueOf(3), paramString2, com.android.dazhihui.g.a().v(), w.a().f(), paramString1));
    localLinkedHashMap.put("header", new HeaderField(114));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1, new pb().getType());
    localx.b(2);
    localx.a(paramString1.getBytes());
    return new m(localx);
  }
  
  public static m d(String paramString)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentHideField(5, paramString));
    localLinkedHashMap.put("header", new HeaderField(114));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new po().getType());
    localx.b(2);
    localx.a(paramString.getBytes());
    return new m(localx);
  }
  
  public static m d(String paramString1, String paramString2)
  {
    x localx = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new ComentZanField(String.valueOf(0), paramString2, com.android.dazhihui.g.a().v(), w.a().f(), paramString1, w.a().g()));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString1 = new ArrayList(1);
    paramString1.add(localLinkedHashMap);
    paramString1 = localk.a(paramString1, new pf().getType());
    localx.b(2);
    localx.a(paramString1.getBytes());
    return new m(localx);
  }
  
  public static m e(String paramString)
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(3005);
    k localk = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(paramString));
    localLinkedHashMap.put("header", new HeaderField(110, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = localk.a(paramString, new pd().getType());
    arrayOfx[0].b(2);
    arrayOfx[0].a(paramString.getBytes());
    return new m(arrayOfx);
  }
  
  public static m f(String paramString)
  {
    Object localObject = new r().a().b();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("data", new BodyField(12, paramString));
    localLinkedHashMap.put("header", new HeaderField(114, com.android.dazhihui.g.a().u()));
    paramString = new ArrayList(1);
    paramString.add(localLinkedHashMap);
    paramString = ((k)localObject).a(paramString, new ph().getType());
    localObject = new x(3005);
    ((x)localObject).b(2);
    ((x)localObject).a(paramString.getBytes());
    return new m((x)localObject);
  }
  
  public void a(AdvertUpPullVo paramAdvertUpPullVo)
  {
    if ((this.d != null) && (this.d.header != null) && (this.d.header.key != null) && (paramAdvertUpPullVo != null) && (paramAdvertUpPullVo.header != null) && (this.d.header.key.equals(paramAdvertUpPullVo.header.key))) {
      return;
    }
    this.d = paramAdvertUpPullVo;
    if (this.d != null) {
      try
      {
        DzhApplication.a().b().a("advertUpPullData", this.d);
        return;
      }
      catch (Exception paramAdvertUpPullVo)
      {
        paramAdvertUpPullVo.printStackTrace();
        return;
      }
    }
    try
    {
      DzhApplication.a().b().a("advertUpPullData", new AdvertUpPullVo());
      return;
    }
    catch (Exception paramAdvertUpPullVo)
    {
      paramAdvertUpPullVo.printStackTrace();
    }
  }
  
  public void a(pr parampr)
  {
    b(parampr);
  }
  
  public AdvertUpPullVo b()
  {
    if (this.d == null) {}
    try
    {
      this.d = ((AdvertUpPullVo)DzhApplication.a().b().a("advertUpPullData", new oz(this)));
      if ((this.d != null) && (this.d.header != null) && (this.d.header.next != null)) {
        this.e = this.d.header.next;
      }
      return this.d;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        this.d = null;
      }
    }
  }
  
  public void b(pr parampr)
  {
    if (TextUtils.isEmpty(this.e)) {
      return;
    }
    this.g = e(this.e);
    this.g.a(new pe(this, parampr));
    com.android.dazhihui.a.g.a().a(this.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */