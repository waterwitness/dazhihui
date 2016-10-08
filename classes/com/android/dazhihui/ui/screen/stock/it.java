package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.screen.BrowserActivity;

class it
  implements View.OnClickListener
{
  it(MaxNineScreen paramMaxNineScreen, EditText paramEditText) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.b, BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", this.a.getText().toString());
    paramView.putExtras(localBundle);
    this.b.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\it.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */