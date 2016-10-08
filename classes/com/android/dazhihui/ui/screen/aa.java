package com.android.dazhihui.ui.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.a.f;
import com.android.dazhihui.g;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;
import com.android.dazhihui.ui.model.stock.ProgressMultipartEntity;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.StringBody;

class aa
  implements View.OnClickListener
{
  aa(ShareActivity paramShareActivity) {}
  
  public void onClick(View paramView)
  {
    if (ShareActivity.a(this.a) != null) {
      ShareActivity.b(this.a).abort();
    }
    ShareActivity.a(this.a, new ProgressMultipartEntity());
    ProgressMultipartEntity.enable();
    paramView = ShareActivity.c(this.a).getText().toString().trim();
    try
    {
      if ("2".equals(ShareActivity.d(this.a)))
      {
        ShareActivity.a(this.a).addPart("token", new StringBody(o.a().b(), "text/plain", Charset.forName("UTF-8")));
        ShareActivity.a(this.a).addPart("version", new StringBody(g.a().r(), "text/plain", Charset.forName("UTF-8")));
        ShareActivity.a(this.a).addPart("shareType", new StringBody(ShareActivity.d(this.a), "text/plain", Charset.forName("UTF-8")));
        ShareActivity.a(this.a).addPart("text", new StringBody(paramView, "text/plain", Charset.forName("UTF-8")));
        ShareActivity.a(this.a).addPart("content", new StringBody(ShareActivity.e(this.a), "text/plain", Charset.forName("UTF-8")));
        ShareActivity.a(this.a).addPart("message", new ByteArrayBody(ShareActivity.f(this.a), "logo.png"));
      }
      for (;;)
      {
        ShareActivity.a(this.a, new HttpPostAsyncTask(this.a, ShareActivity.a(this.a)));
        ShareActivity.b(this.a).execute(new String[] { f.S });
        return;
        if ("1".equals(ShareActivity.d(this.a)))
        {
          ShareActivity.a(this.a).addPart("token", new StringBody(o.a().b(), "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("version", new StringBody(g.a().r(), "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("shareType", new StringBody(ShareActivity.d(this.a), "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("text", new StringBody(ShareActivity.g(this.a), "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("webpageUrl", new StringBody(ShareActivity.h(this.a), "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("content", new StringBody(paramView, "text/plain", Charset.forName("UTF-8")));
          ShareActivity.a(this.a).addPart("thumbData", new StringBody(ShareActivity.i(this.a), "text/plain", Charset.forName("UTF-8")));
        }
      }
    }
    catch (UnsupportedEncodingException paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */