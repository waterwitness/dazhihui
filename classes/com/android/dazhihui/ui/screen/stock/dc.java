package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.widget.ah;
import java.util.List;

class dc
  implements ah
{
  dc(cq paramcq) {}
  
  public void a() {}
  
  public void a(JsonPLItem.UtilsItem paramUtilsItem, List<JsonPLItem.UtilsItem> paramList)
  {
    cq.a(this.a, paramUtilsItem);
    cq.a(this.a, paramUtilsItem.getId());
    cq.a(this.a, paramList);
    this.a.a(false, true);
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    cq.b(this.a, paramJsonPLItem);
    cq.a(this.a, paramJsonPLItem.getId());
    this.a.a(false, false);
  }
  
  public void a(JsonPLItem paramJsonPLItem, Boolean paramBoolean)
  {
    Intent localIntent = new Intent(this.a.getActivity(), GUHDetailBZTJ.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("opid", paramJsonPLItem.getId());
    localBundle.putSerializable("json", paramJsonPLItem);
    localBundle.putString("code", this.a.a);
    localBundle.putString("name", this.a.b);
    localBundle.putBoolean("isShowKeyboard", paramBoolean.booleanValue());
    localIntent.putExtras(localBundle);
    this.a.startActivity(localIntent);
  }
  
  public void a(String paramString, JsonPLItem paramJsonPLItem)
  {
    cq.a(this.a, paramJsonPLItem);
    cq.a(this.a, oy.c(paramString));
    cq.d(this.a).a(this.a);
    g.a().a(cq.d(this.a));
  }
  
  public void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem)
  {
    n.a(this.a.a, 1193);
    this.a.a(paramString, paramBoolean, paramJsonPLItem, paramUtilsItem);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */