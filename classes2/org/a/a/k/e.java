package org.a.a.k;

import java.io.IOException;
import org.a.a.ay;
import org.a.a.az;
import org.a.a.bd;
import org.a.a.be;
import org.a.a.bi;
import org.a.a.br;

public class e
  extends i
{
  public bd a(be parambe, String paramString)
  {
    if ((paramString.length() != 0) && (paramString.charAt(0) == '#')) {
      try
      {
        paramString = a(paramString, 1);
        return paramString;
      }
      catch (IOException paramString)
      {
        throw new RuntimeException("can't recode value for oid " + parambe.e());
      }
    }
    String str = paramString;
    if (paramString.length() != 0)
    {
      str = paramString;
      if (paramString.charAt(0) == '\\') {
        str = paramString.substring(1);
      }
    }
    if ((parambe.equals(h.D)) || (parambe.equals(h.H))) {
      return new az(str);
    }
    if (parambe.equals(h.t)) {
      return new ay(str);
    }
    if ((parambe.equals(h.a)) || (parambe.equals(h.f)) || (parambe.equals(h.r)) || (parambe.equals(h.B))) {
      return new bi(str);
    }
    return new br(str);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */