package com.android.dazhihui.d;

import android.content.Context;
import android.content.res.Resources;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.MarketManager;
import java.util.HashMap;

public class bf
{
  private static boolean a = false;
  private static HashMap<String, bg> b;
  
  public static bg a()
  {
    if (!a) {
      b();
    }
    return new bg(DzhApplication.a().getApplicationContext().getResources().getStringArray(2131361805), new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0 }, new int[] { 0, 4, 1, 0, 0, 2, 3, 0, 0 }, 1, 2);
  }
  
  public static bg a(String paramString)
  {
    if (!a) {
      b();
    }
    bg localbg = (bg)b.get(paramString);
    String str = paramString;
    for (paramString = localbg;; paramString = (bg)b.get(str))
    {
      if ((paramString != null) || (MarketManager.get().getParent(str) == null) || (MarketManager.get().getParent(str).equals(str))) {
        return paramString;
      }
      str = MarketManager.get().getParent(str);
    }
  }
  
  private static void b()
  {
    Resources localResources = DzhApplication.a().getApplicationContext().getResources();
    b = new HashMap();
    bg localbg1 = new bg(localResources.getStringArray(2131361805), new boolean[9], new int[9], 1, 2);
    b.put("全球市场", localbg1);
    b.put("外汇", localbg1);
    b.put("市场板块", localbg1);
    b.put("上证期权", localbg1);
    b.put("股指期权", localbg1);
    b.put("全球指数", localbg1);
    localbg1 = new bg(localResources.getStringArray(2131361799), new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, new int[] { 0, 4, 1, 0, 0, 2, 3, 0, 0, 22, 25, 21, 20, 26, 23, 24 }, 33273, 2);
    b.put("沪深市场", localbg1);
    b.put("基础层", localbg1);
    b.put("创新层", localbg1);
    bg localbg2 = new bg(localResources.getStringArray(2131361799), new boolean[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 4, 1, 0, 0, 2, 3, 0, 0, 22, 25, 21, 20, 26, 23, 24 }, 33273, 2);
    b.put("沪深指数", localbg2);
    localbg2 = new bg(localResources.getStringArray(2131361805), new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0 }, new int[] { 0, 4, 1, 0, 0, 2, 3, 0, 0 }, 1, 2);
    b.put("港股", localbg2);
    b.put("美股", localbg2);
    b.put("债券", localbg2);
    b.put("常用商品", new bg(localResources.getStringArray(2131361824), new boolean[12], new int[12], 8697, 0));
    b.put("分级B", new bg(new String[] { "名称", "最新", "涨幅%", "价格杠杆", "整体溢价%", "成交额", "场内份额", "跟踪指数", "指数涨幅%", "母基代码", "母基实时净值", "上折母基需涨%", "下折母基需跌%" }, new boolean[] { 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }, new int[] { 0, 1, 2, 8, 4, 3, 9, 0, 0, 0, 5, 6, 7 }, -100, 2));
    b.put("分级A", new bg(new String[] { "名称", "最新", "涨幅%", "隐含收益%", "成交额", "场内份额", "约定收益%", "母基代码", "整体溢价%" }, new boolean[] { 0, 1, 1, 1, 1, 1, 1, 0, 1 }, new int[] { 0, 1, 2, 6, 3, 5, 7, 0, 4 }, -100, 2));
    b.put("上市母基", new bg(new String[] { "名称", "最新", "涨幅%", "估算净值", "母基溢价%", "成交额", "跟踪指数", "指数涨幅%", "申购费%", "赎回费%" }, new boolean[] { 0, 1, 1, 1, 1, 1, 0, 1, 0, 0 }, new int[] { 0, 1, 2, 5, 4, 3, 0, 6, 0, 0 }, -100, 2));
    b.put("基金", localbg1);
    b.put("DDE决策", new bg(localResources.getStringArray(2131361804), new boolean[] { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new int[] { 0, 10, 11, 12, 13, 14, 15, 16, 4, 1 }, 34944, 1));
    b.put("个股资金最近1天", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 17, 0, 0, 0, 0, 0, 0, 0, 0 }, 38032, 1));
    b.put("个股资金最近1周", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 18, 0, 0, 0, 0, 0, 0, 0, 0 }, 38032, 1));
    b.put("个股资金最近1月", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 19, 0, 0, 0, 0, 0, 0, 0, 0 }, 38032, 1));
    b.put("板块资金最近1天", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 17, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("板块资金最近1周", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 18, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("板块资金最近1月", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 19, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("板块详情最近1天", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 17, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("板块详情最近1周", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 18, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("板块详情最近1月", new bg(localResources.getStringArray(2131361903), new boolean[] { 0, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 19, 0, 0, 0, 0, 0, 0, 0, 0 }, 37904, 1));
    b.put("5分钟涨幅", new bg(localResources.getStringArray(2131361812), new boolean[] { 0, 1, 1, 1 }, new int[] { 0, 4, 1, 25 }, 32928, 3));
    b.put("阶段统计", new bg(localResources.getStringArray(2131361889), new boolean[] { 0, 1, 1, 1, 1, 1, 1 }, new int[] { 0, 5, 6, 7, 8, 4, 1 }, 33920, 1));
    b.put("交易关注", new bg(localResources.getStringArray(2131361807), new boolean[4], new int[4], 33792, 0));
    b.put("富时A50指数期货", new bg(localResources.getStringArray(2131361823), new boolean[] { 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 }, new int[] { 0, 2, 1, 0, 5, 3, 4, 0, 0, 0, 0, 0, 0 }, 32816, 0));
    a = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */