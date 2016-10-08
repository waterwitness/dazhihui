package qalsdk;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.qalsdk.core.b;
import com.tencent.qalsdk.sdk.ag;
import com.tencent.qalsdk.sdk.ah;
import com.tencent.qalsdk.sdk.c;
import com.tencent.qalsdk.service.QalService;

public final class j
  extends JceStruct
{
  static ah p;
  static ag q;
  static c r;
  public int a = 0;
  public String b = "";
  public long c = 0L;
  public long d = 0L;
  public long e = 0L;
  public long f = 0L;
  public long g = 0L;
  public long h = 0L;
  public String i = "";
  public String j = "";
  public ah k = null;
  public ag l = null;
  public c m = null;
  public String n = "";
  public byte o = 0;
  
  public j() {}
  
  public j(String paramString)
  {
    this.b = paramString;
    this.n = ("" + b.b(QalService.context));
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 1, true);
    this.b = paramJceInputStream.readString(2, true);
    this.c = paramJceInputStream.read(this.c, 3, true);
    this.d = paramJceInputStream.read(this.d, 4, true);
    this.e = paramJceInputStream.read(this.e, 5, false);
    this.f = paramJceInputStream.read(this.f, 6, false);
    this.g = paramJceInputStream.read(this.g, 7, false);
    this.h = paramJceInputStream.read(this.h, 8, false);
    this.i = paramJceInputStream.readString(9, false);
    this.j = paramJceInputStream.readString(10, false);
    if (p == null) {
      p = new ah();
    }
    this.k = ((ah)paramJceInputStream.read(p, 11, false));
    if (q == null) {
      q = new ag();
    }
    this.l = ((ag)paramJceInputStream.read(q, 12, false));
    if (r == null) {
      r = new c();
    }
    this.m = ((c)paramJceInputStream.read(r, 13, false));
    this.n = paramJceInputStream.readString(14, false);
    this.o = paramJceInputStream.read(this.o, 15, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
    paramJceOutputStream.write(this.d, 4);
    paramJceOutputStream.write(this.e, 5);
    paramJceOutputStream.write(this.f, 6);
    paramJceOutputStream.write(this.g, 7);
    paramJceOutputStream.write(this.h, 8);
    if (this.i != null) {
      paramJceOutputStream.write(this.i, 9);
    }
    if (this.j != null) {
      paramJceOutputStream.write(this.j, 10);
    }
    if (this.k != null) {
      paramJceOutputStream.write(this.k, 11);
    }
    if (this.l != null) {
      paramJceOutputStream.write(this.l, 12);
    }
    if (this.m != null) {
      paramJceOutputStream.write(this.m, 13);
    }
    if (this.n != null) {
      paramJceOutputStream.write(this.n, 14);
    }
    paramJceOutputStream.write(this.o, 15);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */