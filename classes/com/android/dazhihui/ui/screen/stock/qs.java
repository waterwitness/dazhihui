package com.android.dazhihui.ui.screen.stock;

import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.ui.model.stock.SearchHuiVo;
import com.tencent.avsdk.HttpUtil;
import java.io.PrintStream;
import java.util.ArrayList;

class qs
  extends AsyncTask<String, Void, String>
{
  qs(SearchHuiFragment paramSearchHuiFragment) {}
  
  protected String a(String... paramVarArgs)
  {
    try
    {
      paramVarArgs = HttpUtil.httpGet(paramVarArgs[0]);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      paramVarArgs.printStackTrace();
    }
    return null;
  }
  
  protected void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      System.out.println("report result = " + paramString);
      this.a.j = SearchHuiVo.parseData(paramString);
      this.a.g.notifyDataSetChanged();
      if ((this.a.j == null) || (this.a.j.size() == 0))
      {
        SearchHuiFragment.b(this.a).setVisibility(0);
        SearchHuiFragment.j(this.a).setText(this.a.d.getText().toString());
      }
    }
    do
    {
      return;
      SearchHuiFragment.b(this.a).setVisibility(8);
      return;
      SearchHuiFragment.b(this.a).setVisibility(8);
    } while ((this.a.j == null) || (this.a.j.size() == 0) || (this.a.getActivity() == null) || (this.a.getActivity().isFinishing()));
    Toast.makeText(this.a.getActivity(), "请求数据异常~", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */