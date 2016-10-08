package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.a.x;
import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.b.a;
import com.joanzapata.pdfview.b.b;
import com.joanzapata.pdfview.b.c;
import com.joanzapata.pdfview.k;
import java.io.File;

public class PDFActivity
  extends BaseActivity
  implements a, b, c
{
  private PDFView a;
  private PageLoadTip b;
  private AsyncTask c;
  
  private void a(String paramString)
  {
    try
    {
      this.a.a(new File(paramString)).a(1).b(false).a(true).a(this).a(this).a();
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, int paramInt) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903366);
    paramBundle = getIntent().getExtras();
    Object localObject = paramBundle.getString("PDF_FILE", "");
    paramBundle = paramBundle.getString("PDF_URL", "");
    this.a = ((PDFView)findViewById(2131560195));
    this.b = ((PageLoadTip)findViewById(2131558569));
    if ((localObject != null) && (!((String)localObject).isEmpty())) {
      a((String)localObject);
    }
    while ((paramBundle == null) || (paramBundle.isEmpty())) {
      return;
    }
    localObject = r.a(this, "BigFileCache");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = new File((File)localObject, x.c(paramBundle));
    if (((File)localObject).exists())
    {
      a(((File)localObject).getAbsolutePath());
      return;
    }
    localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setCancelable(false);
    localObject = ((AlertDialog.Builder)localObject).show();
    View localView = LayoutInflater.from(this).inflate(2130903367, null, false);
    localView.findViewById(2131558566).setOnClickListener(new nw(this, (AlertDialog)localObject));
    ProgressBar localProgressBar = (ProgressBar)localView.findViewById(2131559618);
    TextView localTextView = (TextView)localView.findViewById(2131560196);
    ((AlertDialog)localObject).setCanceledOnTouchOutside(false);
    ((AlertDialog)localObject).getWindow().setContentView(localView);
    this.c = new nx(this, localProgressBar, localTextView, paramBundle, (AlertDialog)localObject).execute(new Context[] { this });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\PDFActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */