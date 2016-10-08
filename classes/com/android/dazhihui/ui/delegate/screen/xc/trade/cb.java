package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.screen.TransferMenuNew;
import com.android.dazhihui.ui.screen.BaseActivity;

class cb
  implements View.OnClickListener
{
  cb(bw parambw) {}
  
  public void onClick(View paramView)
  {
    Bundle localBundle = new Bundle();
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560921: 
      ((BaseActivity)this.a.getActivity()).startActivity(TransferMenuNew.class);
      n.a("", 1353);
      return;
    case 2131560828: 
      localBundle.putInt("type", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(TradeCommonStock.class, localBundle);
      n.a("", 1350);
      return;
    case 2131560829: 
      localBundle.putInt("type", 1);
      ((BaseActivity)this.a.getActivity()).startActivity(TradeCommonStock.class, localBundle);
      n.a("", 1351);
      return;
    case 2131559788: 
      localBundle.putInt("type", 2);
      ((BaseActivity)this.a.getActivity()).startActivity(TradeCommonStock.class, localBundle);
      n.a("", 1352);
      return;
    case 2131560832: 
      localBundle.putInt("type", 4);
      ((BaseActivity)this.a.getActivity()).startActivity(TradeCommonStock.class, localBundle);
      return;
    }
    localBundle.putInt("type", 3);
    ((BaseActivity)this.a.getActivity()).startActivity(TradeCommonStock.class, localBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */