package com.android.dazhihui.ui.screen.stock;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public class es
{
  private List<String> b;
  private String c;
  private Uri d;
  
  public es(GetAddressBookActivity paramGetAddressBookActivity) {}
  
  public Uri a()
  {
    return this.d;
  }
  
  public void a(Uri paramUri)
  {
    this.d = paramUri;
  }
  
  public void a(String paramString)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    this.b.add(paramString);
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */