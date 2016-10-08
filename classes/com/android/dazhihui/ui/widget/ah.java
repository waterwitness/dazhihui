package com.android.dazhihui.ui.widget;

import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import java.util.List;

public abstract interface ah
{
  public abstract void a();
  
  public abstract void a(JsonPLItem.UtilsItem paramUtilsItem, List<JsonPLItem.UtilsItem> paramList);
  
  public abstract void a(JsonPLItem paramJsonPLItem);
  
  public abstract void a(JsonPLItem paramJsonPLItem, Boolean paramBoolean);
  
  public abstract void a(String paramString, JsonPLItem paramJsonPLItem);
  
  public abstract void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */