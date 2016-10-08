package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class hp
  implements View.OnClickListener
{
  hp(TransferTable paramTransferTable) {}
  
  public void onClick(View paramView)
  {
    if ((TransferTable.a(this.a) == null) || (TransferTable.a(this.a).length < 1))
    {
      paramView = Toast.makeText(this.a, "无银行列表，请返回重新获取", 1);
      paramView.setGravity(17, 0, 0);
      paramView.show();
      return;
    }
    paramView = new Bundle();
    paramView.putInt("moneyTypeId", TransferTable.b(this.a));
    paramView.putString("bankname", TransferTable.a(this.a)[((int)TransferTable.c(this.a).getSelectedItemId())]);
    new Intent().putExtras(paramView);
    this.a.startActivity(Transfertable_select.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */