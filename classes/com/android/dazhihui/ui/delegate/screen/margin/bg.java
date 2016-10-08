package com.android.dazhihui.ui.delegate.screen.margin;

import java.util.ArrayList;

public class bg
{
  public static final String[] a = { "普通买入", "普通卖出", "融资买入", "融券卖出", "卖券还款", "买券还券", "撤单", "资金查询", "股份查询", "当日委托查询", "当日成交查询", "资产负债查询", "融资情况查询", "融券情况查询", "银证转账", "历史查询", "退出" };
  public static final String[] b = { "", "买入", "卖出", "转入", "转出", "还款", "还券" };
  public static final String[] c = { "", "可买", "可卖", "可转", "可转", "可用", "可用" };
  public static String d;
  public static String e;
  public static String f;
  public static ArrayList<bh> g;
  public static String h = "";
  
  public static boolean a()
  {
    if ((d == null) || (d.equals("")))
    {
      d = "1";
      return true;
    }
    return d.equals("1");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */