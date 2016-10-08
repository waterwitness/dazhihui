package com.android.dazhihui.ui.model.stock.adapter;

public class NewsAdapter
{
  private static String getTypeName(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return "个股资讯";
    case 1: 
      return "信息地雷";
    case 2: 
      return "研究报告";
    case 3: 
      return "公司新闻";
    case 4: 
      return "公司公告";
    case 5: 
      return "舆情";
    }
    return "通信社新闻";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\NewsAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */