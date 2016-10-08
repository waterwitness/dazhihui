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

class jx
  implements ah
{
  jx(ju paramju) {}
  
  public void a()
  {
    n.a(this.a.b, 20074);
    Intent localIntent = new Intent(this.a.getActivity(), BBSMoreListActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("code", this.a.b);
    localIntent.putExtras(localBundle);
    this.a.startActivity(localIntent);
  }
  
  public void a(JsonPLItem.UtilsItem paramUtilsItem, List<JsonPLItem.UtilsItem> paramList)
  {
    ju.a(this.a, paramUtilsItem);
    ju.a(this.a, paramUtilsItem.getId());
    ju.a(this.a, paramList);
    this.a.a(false, true);
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    ju.c(this.a, paramJsonPLItem);
    ju.a(this.a, paramJsonPLItem.getId());
    this.a.a(false, false);
  }
  
  public void a(JsonPLItem paramJsonPLItem, Boolean paramBoolean)
  {
    Intent localIntent = new Intent(this.a.getActivity(), GUHDetailBZTJ.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("opid", paramJsonPLItem.getId());
    localBundle.putSerializable("json", paramJsonPLItem);
    localBundle.putString("code", this.a.b);
    localBundle.putBoolean("isShowKeyboard", paramBoolean.booleanValue());
    localIntent.putExtras(localBundle);
    this.a.startActivity(localIntent);
  }
  
  public void a(String paramString, JsonPLItem paramJsonPLItem)
  {
    ju.b(this.a, paramJsonPLItem);
    ju.a(this.a, oy.d(paramString));
    ju.d(this.a).a(this.a);
    g.a().a(ju.d(this.a));
  }
  
  public void a(String paramString, boolean paramBoolean, JsonPLItem paramJsonPLItem, JsonPLItem.UtilsItem paramUtilsItem)
  {
    n.a(this.a.b, 1193);
    this.a.a(paramString, paramBoolean, paramJsonPLItem, paramUtilsItem);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */