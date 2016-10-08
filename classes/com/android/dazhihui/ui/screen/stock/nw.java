package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.view.View;
import android.view.View.OnClickListener;

class nw
  implements View.OnClickListener
{
  nw(PDFActivity paramPDFActivity, AlertDialog paramAlertDialog) {}
  
  public void onClick(View paramView)
  {
    this.a.dismiss();
    if (PDFActivity.a(this.b) != null) {
      PDFActivity.a(this.b).cancel(true);
    }
    this.b.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */