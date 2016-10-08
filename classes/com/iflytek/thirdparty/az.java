package com.iflytek.thirdparty;

import android.content.Context;
import android.net.Uri;
import android.provider.Contacts.People;

public class az
  extends aB
{
  private static final String[] d = { "_id", "name" };
  private static final String[] e = { "name", "number", "_id" };
  private static final String[] f = { "person" };
  private static final String[] g = { "display_name" };
  private static final String[] h = { "number", "type", "name" };
  private static final String[] i = { "_id", "name", "number", "type" };
  private static final String[] j = { "number" };
  
  public az(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public Uri a()
  {
    return Contacts.People.CONTENT_URI;
  }
  
  protected String[] b()
  {
    return d;
  }
  
  protected String c()
  {
    return "name";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */