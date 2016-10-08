package com.android.dazhihui.ui.model.stock;

import android.text.TextUtils;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;

public class Stock2990Vo
{
  public int bksz_all;
  public int bksz_lt;
  public int bkzdjs_down;
  public int bkzdjs_equal;
  public int bkzdjs_up;
  public int ccl;
  public int cfg;
  public int cje;
  public int cjl;
  public int cjldw;
  public String code;
  public int ddx;
  public int ddx60;
  public int ddy;
  public int ddy60;
  public int ddz;
  public int decLen;
  public String down_cfg_code;
  public int down_cfg_decLen;
  public String down_cfg_name;
  public int down_cfg_zf;
  public int down_cfg_zx;
  public int drzjlc;
  public int drzjlr;
  public int ggsm;
  public int hs;
  public int hs30;
  public int hs7;
  public boolean isLoanable;
  public int jgchl;
  public int jgchs;
  public int jgmdsbuy;
  public int jgmdssell;
  public int jgthl;
  public int jgths;
  public int jsl;
  public int kp;
  public int lb;
  public int mybuy;
  public int mysell;
  public String name;
  public int np;
  public int red10;
  public int redContinue;
  public int sjl;
  public int syl;
  public int tgbj;
  public int type;
  public String up_cfg_code;
  public int up_cfg_decLen;
  public String up_cfg_name;
  public int up_cfg_zf;
  public int up_cfg_zx;
  public int wb;
  public int xs;
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
  public int zqbj;
  public int zrccl;
  public int zrjsl;
  public int zshou;
  public int zsu;
  public int zx;
  
  public boolean decode(q paramq, int paramInt1, int paramInt2)
  {
    try
    {
      this.code = paramq.l();
      this.name = paramq.l();
      this.decLen = paramq.b();
      this.type = paramq.b();
      this.zshou = paramq.h();
      this.kp = paramq.h();
      this.zx = paramq.h();
      this.zg = paramq.h();
      this.zd = paramq.h();
      this.cje = paramq.h();
      if ((paramInt1 == 105) || (paramInt1 == 113) || (paramInt1 == 114)) {
        this.cfg = paramq.e();
      }
      if ((paramInt2 >>> 0 & 0x1) != 0)
      {
        this.cjldw = paramq.e();
        this.cjl = paramq.h();
      }
      if ((paramInt2 >>> 1 & 0x1) != 0) {
        this.np = paramq.e();
      }
      if ((paramInt2 >>> 2 & 0x1) != 0) {
        this.xs = paramq.e();
      }
      if ((paramInt2 >>> 3 & 0x1) != 0) {
        this.lb = paramq.e();
      }
      if ((paramInt2 >>> 4 & 0x1) != 0) {
        this.hs = paramq.e();
      }
      if ((paramInt2 >>> 5 & 0x1) != 0) {
        this.zsu = paramq.d();
      }
      if ((paramInt2 >>> 6 & 0x1) != 0) {
        this.wb = paramq.d();
      }
      this.ggsm = 0;
      if ((paramInt2 >>> 7 & 0x1) != 0) {
        this.ggsm = paramq.b();
      }
      if ((paramInt2 >>> 8 & 0x1) != 0)
      {
        this.syl = paramq.f();
        this.sjl = paramq.f();
      }
      if ((paramInt2 >>> 9 & 0x1) != 0)
      {
        this.mysell = paramq.h();
        this.mybuy = paramq.h();
      }
      if ((paramInt2 >>> 10 & 0x1) != 0)
      {
        this.zf7 = paramq.f();
        this.hs7 = paramq.h();
        this.zf30 = paramq.f();
        this.hs30 = paramq.h();
      }
      if ((paramInt2 >>> 11 & 0x1) != 0)
      {
        this.ddx = paramq.d();
        this.ddy = paramq.d();
        this.ddz = paramq.f();
        this.ddx60 = paramq.f();
        this.ddy60 = paramq.f();
        this.red10 = paramq.b();
        this.redContinue = paramq.b();
      }
      if ((paramInt2 >>> 12 & 0x1) != 0)
      {
        this.drzjlr = paramq.h();
        this.drzjlc = paramq.h();
        this.zjlr5 = paramq.h();
        this.zjlc5 = paramq.h();
        this.zjcje5 = paramq.h();
        this.zjlr30 = paramq.h();
        this.zjlc30 = paramq.h();
        this.zjcje30 = paramq.h();
      }
      if ((paramInt2 >>> 13 & 0x1) != 0)
      {
        this.zrccl = paramq.h();
        this.zrjsl = paramq.h();
        this.ccl = paramq.h();
        this.jsl = paramq.h();
      }
      if ((paramInt2 >>> 14 & 0x1) != 0)
      {
        this.jgmdsbuy = paramq.e();
        this.jgmdssell = paramq.e();
        this.jgchs = paramq.e();
        this.jgths = paramq.e();
        this.jgchl = paramq.e();
        this.jgthl = paramq.e();
      }
      this.isLoanable = false;
      if ((paramInt2 >>> 15 & 0x1) != 0) {
        if ((paramq.b() & 0x1) != 1) {
          break label865;
        }
      }
      label865:
      for (boolean bool = true;; bool = false)
      {
        this.isLoanable = bool;
        if ((paramInt2 >>> 16 & 0x1) != 0) {
          this.tgbj = paramq.e();
        }
        if ((paramInt2 >>> 17 & 0x1) != 0) {
          this.zqbj = paramq.e();
        }
        if ((paramInt2 >>> 18 & 0x1) != 0)
        {
          this.bkzdjs_up = paramq.e();
          this.bkzdjs_down = paramq.e();
          this.bkzdjs_equal = paramq.e();
        }
        if ((paramInt2 >>> 19 & 0x1) != 0)
        {
          this.bksz_lt = paramq.h();
          this.bksz_all = paramq.h();
        }
        if ((paramInt2 >>> 20 & 0x1) != 0)
        {
          this.up_cfg_code = paramq.l();
          this.up_cfg_name = paramq.l();
          if (TextUtils.isEmpty(this.up_cfg_code)) {
            this.up_cfg_code = "--";
          }
          if (TextUtils.isEmpty(this.up_cfg_name)) {
            this.up_cfg_name = "--";
          }
          this.up_cfg_decLen = paramq.b();
          this.up_cfg_zx = paramq.h();
          this.up_cfg_zf = paramq.h();
        }
        if ((paramInt2 >>> 21 & 0x1) != 0)
        {
          this.down_cfg_code = paramq.l();
          this.down_cfg_name = paramq.l();
          if (TextUtils.isEmpty(this.down_cfg_code)) {
            this.down_cfg_code = "--";
          }
          if (TextUtils.isEmpty(this.down_cfg_name)) {
            this.down_cfg_name = "--";
          }
          this.down_cfg_decLen = paramq.b();
          this.down_cfg_zx = paramq.h();
          this.down_cfg_zf = paramq.h();
        }
        return true;
      }
      return false;
    }
    catch (Exception paramq)
    {
      paramq.printStackTrace();
    }
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
        if (paramArrayOfString1[k].equals("细分类"))
        {
          paramArrayOfString2[k] = "--";
          paramArrayOfInt[k] = -1;
        }
        else if (paramArrayOfString1[k].equals("总市值"))
        {
          paramArrayOfString2[k] = n.a(b.b(this.bksz_lt) * 10000L);
          paramArrayOfInt[k] = -16711681;
        }
        else if (paramArrayOfString1[k].equals("流通市值"))
        {
          paramArrayOfString2[k] = n.a(b.b(this.bksz_all) * 10000L);
          paramArrayOfInt[k] = -16711681;
        }
        else if (paramArrayOfString1[k].equals("最新"))
        {
          if ((this.zx == 0) && (this.zshou != 0))
          {
            paramArrayOfString2[k] = b.a(this.zshou, this.decLen);
            paramArrayOfInt[k] = b.h(this.zshou, this.zshou);
          }
          else
          {
            paramArrayOfString2[k] = b.a(this.zx, this.decLen);
            paramArrayOfInt[k] = b.h(this.zx, this.zshou);
          }
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
              else if ((paramArrayOfString1[k].equals("五日涨幅%")) || (paramArrayOfString1[k].equals("5日涨幅%")))
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
              else if (paramArrayOfString1[k].equals("流通市值"))
              {
                paramArrayOfString2[k] = (String.valueOf(this.bksz_lt) + "万元");
                paramArrayOfInt[k] = -1;
              }
              else if (paramArrayOfString1[k].equals("总市值"))
              {
                paramArrayOfString2[k] = (String.valueOf(this.bksz_all) + "万元");
                paramArrayOfInt[k] = -1;
              }
              else if (paramArrayOfString1[k].equals("涨跌家数"))
              {
                paramArrayOfString2[k] = (String.valueOf(this.bkzdjs_up) + "/" + String.valueOf(this.bkzdjs_equal) + "/" + String.valueOf(this.bkzdjs_down));
                paramArrayOfInt[k] = -1;
              }
              else if (paramArrayOfString1[k].equals("领涨股"))
              {
                paramArrayOfString2[k] = (this.up_cfg_name + "#" + b.a(this.up_cfg_zx, this.up_cfg_decLen) + "#" + b.c(this.up_cfg_zf));
                paramArrayOfInt[k] = -1;
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
  
  public boolean getIsLoanable()
  {
    return this.isLoanable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\Stock2990Vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */