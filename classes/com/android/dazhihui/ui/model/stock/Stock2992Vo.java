package com.android.dazhihui.ui.model.stock;

import android.text.TextUtils;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;

public class Stock2992Vo
{
  public int ccl;
  public int cfg;
  public int cje;
  public int cjl;
  public int cjldw;
  public int cnfe;
  public String code;
  public int csgg;
  public int ddx;
  public int ddx60;
  public int ddy;
  public int ddy60;
  public int ddz;
  public int decLen;
  public int drzjlc;
  public int drzjlr;
  public int ggsm;
  public String gzzs;
  public int hs;
  public int hs30;
  public int hs7;
  public boolean isLoanable;
  public int jgchl;
  public int jgchs;
  public int jggg;
  public int jgmdsbuy;
  public int jgmdssell;
  public int jgthl;
  public int jgths;
  public int jsl;
  public int kp;
  public int lb;
  public String mjdm = "--";
  public int mjssjz;
  public int mjzrjz;
  public int mybuy;
  public int mysell;
  public String name;
  public int np;
  public int red10;
  public int redContinue;
  public int sgf;
  public int shf;
  public int sjl;
  public int syl;
  public int szmjxz;
  public int type;
  public int wb;
  public int xs;
  public int xzmjxd;
  public int ydsy;
  public int yhsy;
  public int zd;
  public int zf30;
  public int zf7;
  public int zg;
  public int zjcje30;
  public int zjcje5;
  public int zjlc30;
  public int zjlc5;
  public int zjlr30;
  public int zjlr5;
  public int zrccl;
  public int zrjsl;
  public int zshou;
  public int zsu;
  public int zszf;
  public int ztyj;
  public int zx;
  
  public void decode(q paramq)
  {
    this.code = paramq.l();
    this.name = paramq.l();
    this.mjdm = paramq.l();
    this.decLen = paramq.b();
    this.type = 2;
    this.zshou = paramq.h();
    this.kp = paramq.h();
    this.zx = paramq.h();
    this.zg = paramq.h();
    this.zd = paramq.h();
    this.cje = paramq.h();
    this.cjl = paramq.h();
    this.ztyj = paramq.h();
    this.cnfe = paramq.h();
    this.hs = paramq.h();
    this.lb = paramq.h();
    this.yhsy = paramq.h();
    this.ydsy = paramq.h();
    this.isLoanable = false;
  }
  
  public void getData(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt, int paramInt)
  {
    int k = 0;
    if (k < paramArrayOfString1.length)
    {
      if (k == 0)
      {
        paramArrayOfString2[k] = this.name;
        if (this.ggsm == 1) {
          paramArrayOfInt[k] = -1;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        paramArrayOfInt[k] = 34816;
        continue;
        if ("价格杠杆".equals(paramArrayOfString1[k]))
        {
          paramArrayOfString2[k] = b.a(this.jggg, 3);
          paramArrayOfInt[k] = -1;
        }
        else if ("初始杠杆".equals(paramArrayOfString1[k]))
        {
          paramArrayOfString2[k] = b.a(this.csgg, 3);
          paramArrayOfInt[k] = -1;
        }
        else
        {
          String str;
          if ("母基代码".equals(paramArrayOfString1[k]))
          {
            if (TextUtils.isEmpty(this.mjdm)) {}
            for (str = "--";; str = this.mjdm)
            {
              paramArrayOfString2[k] = str;
              paramArrayOfInt[k] = -1;
              break;
            }
          }
          if ("母基实时净值".equals(paramArrayOfString1[k]))
          {
            paramArrayOfString2[k] = b.a(this.mjssjz, 4);
            paramArrayOfInt[k] = 65280;
          }
          else if ("上折母基需涨%".equals(paramArrayOfString1[k]))
          {
            paramArrayOfString2[k] = b.a(Math.abs(this.szmjxz), 2);
            paramArrayOfInt[k] = -1;
          }
          else if ("下折母基需跌%".equals(paramArrayOfString1[k]))
          {
            paramArrayOfString2[k] = b.a(Math.abs(this.xzmjxd), 2);
            paramArrayOfInt[k] = -1;
          }
          else
          {
            if ("估算净值".equals(paramArrayOfString1[k]))
            {
              if (this.mjssjz == 0) {}
              for (str = "0.0000";; str = b.a(this.mjssjz, 4))
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = 65280;
                break;
              }
            }
            if ("母基溢价%".equals(paramArrayOfString1[k]))
            {
              if (this.ztyj == 0) {}
              for (str = "0.000";; str = b.a(this.ztyj, 3))
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = b.g(this.ztyj);
                break;
              }
            }
            if ("跟踪指数".equals(paramArrayOfString1[k]))
            {
              if (TextUtils.isEmpty(this.gzzs)) {}
              for (str = "--";; str = this.gzzs)
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = -1;
                break;
              }
            }
            if ("指数涨幅%".equals(paramArrayOfString1[k]))
            {
              if (this.zszf == 0) {}
              for (str = "0.00";; str = b.a(this.zszf, 2))
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = b.g(this.zszf);
                break;
              }
            }
            if ("申购费%".equals(paramArrayOfString1[k]))
            {
              if (this.sgf == 0) {}
              for (str = "0.00";; str = b.a(this.sgf, 2))
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = -1;
                break;
              }
            }
            if ("赎回费%".equals(paramArrayOfString1[k]))
            {
              if (this.shf == 0) {}
              for (str = "0.00";; str = b.a(this.shf, 2))
              {
                paramArrayOfString2[k] = str;
                paramArrayOfInt[k] = -1;
                break;
              }
            }
            if ("整体溢价%".equals(paramArrayOfString1[k]))
            {
              paramArrayOfString2[k] = b.a(this.ztyj, 3);
              paramArrayOfInt[k] = b.g(this.ztyj);
            }
            else
            {
              if ("场内份额".equals(paramArrayOfString1[k]))
              {
                if (this.cnfe < 0) {
                  paramArrayOfString2[k] = "--";
                }
                for (;;)
                {
                  paramArrayOfInt[k] = 65280;
                  break;
                  paramArrayOfString2[k] = n.b(this.cnfe);
                }
              }
              if ("隐含收益%".equals(paramArrayOfString1[k]))
              {
                paramArrayOfString2[k] = b.a(this.yhsy, 3);
                paramArrayOfInt[k] = b.g(this.yhsy);
              }
              else if ("约定收益%".equals(paramArrayOfString1[k]))
              {
                paramArrayOfString2[k] = b.a(this.ydsy, 3);
                paramArrayOfInt[k] = b.g(this.ydsy);
              }
              else if ("最新".equals(paramArrayOfString1[k]))
              {
                paramArrayOfString2[k] = b.a(this.zx, this.decLen);
                paramArrayOfInt[k] = b.h(this.zx, this.zshou);
              }
              else
              {
                int j;
                int i;
                if (paramArrayOfString1[k].equals("涨幅%"))
                {
                  j = this.zx;
                  i = this.zshou;
                  if (paramInt == 1)
                  {
                    j = this.zf7 + 10000;
                    i = 10000;
                  }
                  for (;;)
                  {
                    paramArrayOfString2[k] = b.c(j, i);
                    paramArrayOfInt[k] = b.h(j, i);
                    break;
                    if (paramInt == 2)
                    {
                      j = this.zf30 + 10000;
                      i = 10000;
                    }
                  }
                }
                if (paramArrayOfString1[k].equals("涨跌"))
                {
                  paramArrayOfString2[k] = b.d(this.zx, this.zshou, this.decLen);
                  paramArrayOfInt[k] = b.h(this.zx, this.zshou);
                }
                else if (paramArrayOfString1[k].equals("昨收"))
                {
                  paramArrayOfString2[k] = b.a(this.zshou, this.decLen);
                  paramArrayOfInt[k] = -1;
                }
                else if (paramArrayOfString1[k].equals("成交量"))
                {
                  paramArrayOfString2[k] = n.a(b.b(this.cjl));
                  paramArrayOfInt[k] = 65280;
                }
                else
                {
                  if (paramArrayOfString1[k].equals("成交额"))
                  {
                    i = this.cje;
                    if (paramInt == 1) {
                      i = this.zjcje5;
                    }
                    for (;;)
                    {
                      paramArrayOfString2[k] = n.a(b.b(i) * 10000L);
                      paramArrayOfInt[k] = -16711681;
                      break;
                      if (paramInt == 2) {
                        i = this.zjcje30;
                      }
                    }
                  }
                  if (paramArrayOfString1[k].equals("最高"))
                  {
                    paramArrayOfString2[k] = b.a(this.zg, this.decLen);
                    paramArrayOfInt[k] = b.h(this.zg, this.zshou);
                  }
                  else if (paramArrayOfString1[k].equals("最低"))
                  {
                    paramArrayOfString2[k] = b.a(this.zd, this.decLen);
                    paramArrayOfInt[k] = b.h(this.zd, this.zshou);
                  }
                  else if (paramArrayOfString1[k].equals("振幅%"))
                  {
                    paramArrayOfString2[k] = b.k(this.zg - this.zd, this.zshou);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("涨速%"))
                  {
                    paramArrayOfString2[k] = b.a(this.zsu, b.a(this.zx, this.decLen));
                    paramArrayOfInt[k] = b.h(this.zsu + 10000, 10000);
                  }
                  else if (paramArrayOfString1[k].equals("换手%"))
                  {
                    paramArrayOfString2[k] = b.d(this.hs);
                    paramArrayOfInt[k] = 65280;
                  }
                  else if (paramArrayOfString1[k].equals("量比"))
                  {
                    paramArrayOfString2[k] = b.a(this.lb, 2);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("委比%"))
                  {
                    paramArrayOfString2[k] = b.a(this.wb / 100.0F, 2);
                    paramArrayOfInt[k] = b.g(this.wb);
                  }
                  else if (paramArrayOfString1[k].equals("市盈"))
                  {
                    paramArrayOfString2[k] = b.d(this.syl);
                    paramArrayOfInt[k] = 65280;
                  }
                  else if (paramArrayOfString1[k].equals("市净"))
                  {
                    paramArrayOfString2[k] = b.d(this.sjl);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("代码"))
                  {
                    paramArrayOfString2[k] = this.code;
                    paramArrayOfInt[k] = -16711681;
                  }
                  else if (paramArrayOfString1[k].equals("当日ddx"))
                  {
                    paramArrayOfString2[k] = b.a(this.ddx, 3);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("当日ddy"))
                  {
                    paramArrayOfString2[k] = b.a(this.ddy, 3);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("当日ddz"))
                  {
                    paramArrayOfString2[k] = b.a(this.ddz, 3);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("60日ddx"))
                  {
                    paramArrayOfString2[k] = b.a(this.ddx60, 3);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("60日ddy"))
                  {
                    paramArrayOfString2[k] = b.a(this.ddy60, 3);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("10日飘红"))
                  {
                    paramArrayOfString2[k] = b.a(this.red10, 0);
                    paramArrayOfInt[k] = -1;
                  }
                  else if (paramArrayOfString1[k].equals("连续飘红"))
                  {
                    paramArrayOfString2[k] = b.a(this.redContinue, 0);
                    paramArrayOfInt[k] = -1;
                  }
                  else
                  {
                    if (paramArrayOfString1[k].equals("净额"))
                    {
                      i = this.drzjlr - this.drzjlc;
                      if (paramInt == 1) {
                        i = this.zjlr5 - this.zjlc5;
                      }
                      for (;;)
                      {
                        paramArrayOfString2[k] = n.c(i);
                        paramArrayOfInt[k] = b.g(i);
                        break;
                        if (paramInt == 2) {
                          i = this.zjlr30 - this.zjlc30;
                        }
                      }
                    }
                    if (paramArrayOfString1[k].equals("占成交额%"))
                    {
                      j = this.drzjlr - this.drzjlc;
                      i = this.cje;
                      if (paramInt == 1)
                      {
                        j = this.zjlr5 - this.zjlc5;
                        i = this.zjcje5;
                      }
                      for (;;)
                      {
                        paramArrayOfString2[k] = b.c(Math.abs(j) + i, i);
                        paramArrayOfInt[k] = b.g(j);
                        break;
                        if (paramInt == 2)
                        {
                          j = this.zjlr30 - this.zjlc30;
                          i = this.zjcje30;
                        }
                      }
                    }
                    if (paramArrayOfString1[k].equals("流入"))
                    {
                      i = this.drzjlr;
                      if (paramInt == 1) {
                        i = this.zjlr5;
                      }
                      for (;;)
                      {
                        paramArrayOfString2[k] = n.c(i);
                        paramArrayOfInt[k] = -65536;
                        break;
                        if (paramInt == 2) {
                          i = this.zjlr30;
                        }
                      }
                    }
                    if (paramArrayOfString1[k].equals("流出"))
                    {
                      i = this.drzjlc;
                      if (paramInt == 1) {
                        i = this.zjlc5;
                      }
                      for (;;)
                      {
                        paramArrayOfString2[k] = n.c(i);
                        paramArrayOfInt[k] = -11753174;
                        break;
                        if (paramInt == 2) {
                          i = this.zjlc30;
                        }
                      }
                    }
                    if (paramArrayOfString1[k].equals("五分钟涨%"))
                    {
                      paramArrayOfString2[k] = b.a(this.zsu, b.a(this.zx, this.decLen));
                      paramArrayOfInt[k] = b.h(this.zsu + 10000, 10000);
                    }
                    else if (paramArrayOfString1[k].equals("7日涨幅%"))
                    {
                      paramArrayOfString2[k] = b.c(this.zf7 + 10000, 10000);
                      paramArrayOfInt[k] = b.h(this.zf7 + 10000, 10000);
                    }
                    else if (paramArrayOfString1[k].equals("7日换手%"))
                    {
                      paramArrayOfString2[k] = b.c(this.hs7 + 10000, 10000);
                      paramArrayOfInt[k] = -16711681;
                    }
                    else if (paramArrayOfString1[k].equals("30日涨幅%"))
                    {
                      paramArrayOfString2[k] = b.c(this.zf30 + 10000, 10000);
                      paramArrayOfInt[k] = b.h(this.zf30 + 10000, 10000);
                    }
                    else if (paramArrayOfString1[k].equals("30日换手%"))
                    {
                      paramArrayOfString2[k] = b.c(this.hs30 + 10000, 10000);
                      paramArrayOfInt[k] = -16711681;
                    }
                    else if (paramArrayOfString1[k].equals("五日涨幅%"))
                    {
                      paramArrayOfString2[k] = b.c(this.zf7 + 10000, 10000);
                      paramArrayOfInt[k] = b.g(this.zf7);
                    }
                    else if (paramArrayOfString1[k].equals("日增"))
                    {
                      paramArrayOfString2[k] = b.d(this.ccl - this.zrccl, 0);
                      paramArrayOfInt[k] = -1;
                    }
                    else if (paramArrayOfString1[k].equals("总手"))
                    {
                      paramArrayOfString2[k] = n.e(b.b(this.cjl));
                      paramArrayOfInt[k] = 65280;
                    }
                    else if (paramArrayOfString1[k].equals("持仓"))
                    {
                      paramArrayOfString2[k] = n.g(String.valueOf(this.ccl));
                      paramArrayOfInt[k] = 65280;
                    }
                    else if (paramArrayOfString1[k].equals("结算"))
                    {
                      paramArrayOfString2[k] = b.a(this.jsl, this.decLen);
                      paramArrayOfInt[k] = b.h(this.jsl, this.zrjsl);
                    }
                    else if (paramArrayOfString1[k].equals("今开"))
                    {
                      paramArrayOfString2[k] = b.a(this.kp, this.decLen);
                      paramArrayOfInt[k] = b.h(this.kp, this.zshou);
                    }
                    else
                    {
                      paramArrayOfString2[k] = "没有解析的字段";
                      paramArrayOfInt[k] = -1;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\Stock2992Vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */