package com.android.dazhihui.ui.screen;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask.PostListener;
import com.android.dazhihui.ui.model.stock.ProgressMultipartEntity;
import com.android.dazhihui.ui.model.stock.ShareResultVo;
import com.c.a.k;
import com.g.a.a.a.b.c;
import com.g.a.b.a.h;
import com.g.a.b.d;
import com.g.a.b.f;
import com.g.a.b.g;
import com.g.a.b.j;

public class ShareActivity
  extends BaseActivity
  implements HttpPostAsyncTask.PostListener
{
  private View a;
  private TextView b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private EditText i;
  private TextView j;
  private TextView k;
  private ImageView l;
  private Bitmap m;
  private ProgressMultipartEntity n;
  private byte[] o;
  private AlertDialog p = null;
  private TextView q = null;
  private HttpPostAsyncTask r;
  private d s;
  private View t;
  
  public static Bitmap a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a()
  {
    if (this.p != null)
    {
      this.p.dismiss();
      this.p = null;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ae.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.t == null);
      this.t.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.t == null);
    this.t.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void onCancelled(String paramString)
  {
    Log.e("GUH", "share cancel=" + paramString);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903432);
    this.t = findViewById(2131558630);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.c = paramBundle.getString("shareType", "");
      this.g = paramBundle.getString("webpageUrl", "");
      this.h = paramBundle.getString("thumbData", "");
      this.d = paramBundle.getString("text", "");
      this.e = paramBundle.getString("stockName", "");
      this.f = paramBundle.getString("stockCode", "");
      this.o = paramBundle.getByteArray("message");
      this.m = a(this.o);
      if (("2".equals(this.c)) && (this.m == null))
      {
        Toast.makeText(this, "截图失败,请重试!", 0).show();
        finish();
      }
    }
    else
    {
      Toast.makeText(this, "截图失败,请重试!", 0).show();
      finish();
      return;
    }
    this.a = findViewById(2131558633);
    this.a.setOnClickListener(new z(this));
    this.b = ((TextView)findViewById(2131558634));
    this.b.setText("分享");
    this.i = ((EditText)findViewById(2131560473));
    this.j = ((TextView)findViewById(2131558588));
    paramBundle = findViewById(2131560476);
    View localView = findViewById(2131560474);
    if ("2".equals(this.c))
    {
      paramBundle.setVisibility(8);
      this.l = ((ImageView)findViewById(2131560475));
      this.l.setImageBitmap(this.m);
      paramBundle = new StringBuilder();
      paramBundle.append("¥").append(this.e).append("(").append(this.f).append(")").append("¥");
      this.i.setText(paramBundle.toString());
      this.i.setSelection(this.i.getText().length());
    }
    for (;;)
    {
      this.j.setOnClickListener(new aa(this));
      return;
      if ("1".equals(this.c))
      {
        localView.setVisibility(8);
        this.l = ((ImageView)findViewById(2131560477));
        this.k = ((TextView)findViewById(2131559212));
        this.k.setText(this.d);
        if (!g.a().b())
        {
          paramBundle = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
          g.a().a(paramBundle);
        }
        this.s = new f().a(true).b(true).a();
        g.a().a(this.h, this.l, this.s);
      }
    }
  }
  
  protected void onDestroy()
  {
    if (this.m != null) {
      this.m.recycle();
    }
    if (this.r != null) {
      this.r.abort();
    }
    a();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (this.r != null) {
      this.r.abort();
    }
    a();
    super.onPause();
  }
  
  public void onPostExecute(String paramString)
  {
    Log.i("GUH", "share result=" + paramString);
    if (this.p != null) {
      this.q.setText("发送完成");
    }
    if (!TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      try
      {
        paramString = (ShareResultVo)new k().a(paramString, ShareResultVo.class);
        if ((paramString != null) && (!"1".equals(paramString.error))) {
          break label172;
        }
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("分享失败,请重试!");
        StringBuilder localStringBuilder2 = new StringBuilder().append("share error=");
        if (paramString != null) {
          break label164;
        }
        paramString = "unkown error";
        Log.e("GUH", paramString);
        Toast.makeText(this, localStringBuilder1.toString(), 0).show();
        finish();
        return;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
      paramString = null;
      continue;
      label164:
      paramString = paramString.because;
      continue;
      label172:
      Toast.makeText(this, "分享成功", 0).show();
    }
  }
  
  public void onPreExecute()
  {
    a();
    View localView1 = LayoutInflater.from(this).inflate(2130903378, null);
    this.q = ((TextView)localView1.findViewById(2131558894));
    View localView2 = localView1.findViewById(2131560220);
    this.p = new AlertDialog.Builder(new ContextThemeWrapper(this, 2131296289)).setView(localView1).create();
    this.p.setCancelable(true);
    this.p.setCanceledOnTouchOutside(false);
    this.p.getWindow().setBackgroundDrawable(new ColorDrawable(0));
    localView2.setOnClickListener(new ab(this));
    this.p.setOnCancelListener(new ac(this));
    this.p.setOnDismissListener(new ad(this));
    this.p.show();
  }
  
  public void onProgressUpdate(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */