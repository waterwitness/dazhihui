package qalsdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;

public final class t
  extends JceStruct
  implements Cloneable
{
  static ArrayList<s> b;
  public ArrayList<s> a = null;
  
  static
  {
    if (!t.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      c = bool;
      return;
    }
  }
  
  public ArrayList<s> a()
  {
    return this.a;
  }
  
  public void a(ArrayList<s> paramArrayList)
  {
    this.a = paramArrayList;
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
      while (c) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    new JceDisplayer(paramStringBuilder, paramInt).display(this.a, "netInfos");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    paramObject = (t)paramObject;
    return JceUtil.equals(this.a, ((t)paramObject).a);
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
    if (b == null)
    {
      b = new ArrayList();
      s locals = new s();
      b.add(locals);
    }
    this.a = ((ArrayList)paramJceInputStream.read(b, 1, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */