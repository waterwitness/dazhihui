package com.android.dazhihui.ui.screen.stock;

import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.ui.model.stock.SearchPeopleVo;
import com.tencent.avsdk.HttpUtil;
import java.io.PrintStream;
import java.util.ArrayList;

class rc
  extends AsyncTask<String, Void, String>
{
  rc(SearchPeopleFragment paramSearchPeopleFragment) {}
  
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
      SearchPeopleVo localSearchPeopleVo = new SearchPeopleVo();
      this.a.k = localSearchPeopleVo.parseData(paramString);
      this.a.g.notifyDataSetChanged();
      if ((this.a.k == null) || (this.a.k.size() == 0))
      {
        this.a.j.setVisibility(0);
        this.a.i.setText("没有这个人哦~");
      }
    }
    do
    {
      return;
      this.a.j.setVisibility(8);
      return;
      if ((this.a.k == null) || (this.a.k.size() == 0))
      {
        this.a.j.setVisibility(0);
        this.a.i.setText("请求数据异常~");
        return;
      }
    } while ((this.a.getActivity() == null) || (this.a.getActivity().isFinishing()));
    Toast.makeText(this.a.getActivity(), "请求数据异常~", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */