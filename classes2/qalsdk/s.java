package qalsdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class s
  extends JceStruct
  implements Cloneable
{
  public String a = "";
  public String b = "";
  public String c = "";
  public String d = "";
  public int e = 0;
  public int f = 0;
  public int g = 0;
  
  static
  {
    if (!s.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      h = bool;
      return;
    }
  }
  
  public Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (h) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "apn");
    paramStringBuilder.display(this.b, "wifi_supplicant_state");
    paramStringBuilder.display(this.c, "wifi_ssid");
    paramStringBuilder.display(this.d, "wifi_bssid");
    paramStringBuilder.display(this.e, "wifi_rssi");
    paramStringBuilder.display(this.f, "rat");
    paramStringBuilder.display(this.g, "rat_ss");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (s)paramObject;
    } while ((!JceUtil.equals(this.a, ((s)paramObject).a)) || (!JceUtil.equals(this.b, ((s)paramObject).b)) || (!JceUtil.equals(this.c, ((s)paramObject).c)) || (!JceUtil.equals(this.d, ((s)paramObject).d)) || (!JceUtil.equals(this.e, ((s)paramObject).e)) || (!JceUtil.equals(this.f, ((s)paramObject).f)) || (!JceUtil.equals(this.g, ((s)paramObject).g)));
    return true;
  }
  
  public int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.readString(1, true);
    this.b = paramJceInputStream.readString(2, true);
    this.c = paramJceInputStream.readString(3, true);
    this.d = paramJceInputStream.readString(4, true);
    this.e = paramJceInputStream.read(this.e, 5, true);
    this.f = paramJceInputStream.read(this.f, 6, true);
    this.g = paramJceInputStream.read(this.g, 7, true);
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
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */