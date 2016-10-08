package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.y;
import java.io.Serializable;

public class SelfStock
  implements Serializable
{
  public static final int DOWN_COLOR = -11753174;
  public static final int INIT_COLOR = -8616044;
  public static final int SELF_TYPE_LATEST_VIEW = 1;
  public static final int SELF_TYPE_ZIXUAN = 0;
  public static final int UP_COLOR = -1099463;
  private static final long serialVersionUID = 3981532554688802004L;
  public int bkColor;
  public String bkZf;
  public String cfgName;
  public String cfgZf;
  public String cfgZx;
  public int cje;
  public int cjl;
  public int cjl_dw;
  public int closePrice;
  public String code;
  public String ddx;
  public int ddxColor;
  public int decLen;
  public int dieCount;
  public int fiveColor;
  public String fiveZf;
  public String fundFlow;
  public int fundFlowColor;
  public int ggss = 0;
  public String hs;
  public int hsColor;
  public String hsl;
  public int hslColor;
  public boolean isLoanable;
  public String je;
  public int jeColor;
  public int latestPrice;
  public int liuch;
  public int liuru;
  public String moduleCode;
  public int module_id;
  public String name;
  public int openPrice;
  public int pingCount;
  public boolean pingTop = false;
  public int selfType = 0;
  public int type = 1;
  public int zhangCount;
  
  public SelfStock() {}
  
  public SelfStock(String paramString)
  {
    this.name = "";
    this.code = paramString;
    this.type = 1;
    this.isLoanable = false;
    this.ggss = 0;
  }
  
  public SelfStock(String paramString1, String paramString2, int paramInt)
  {
    this.name = paramString1;
    this.code = paramString2;
    this.type = 1;
    this.isLoanable = false;
    this.ggss = 0;
    this.selfType = paramInt;
  }
  
  public SelfStock(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.code = paramString1;
    this.name = paramString2;
    this.closePrice = paramInt1;
    this.decLen = paramInt2;
    this.latestPrice = paramInt3;
  }
  
  public SelfStock(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.name = paramString1;
    this.code = paramString2;
    this.type = paramInt1;
    this.decLen = paramInt2;
    this.closePrice = paramInt3;
    this.latestPrice = paramInt4;
    this.isLoanable = paramBoolean;
    this.ggss = paramInt5;
    this.selfType = paramInt6;
    this.cje = paramInt7;
    this.cjl = paramInt8;
  }
  
  public SelfStock(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean2)
  {
    this.name = paramString1;
    this.code = paramString2;
    this.type = paramInt1;
    this.decLen = paramInt2;
    this.closePrice = paramInt3;
    this.latestPrice = paramInt4;
    this.isLoanable = paramBoolean1;
    this.ggss = paramInt5;
    this.selfType = paramInt6;
    this.cje = paramInt7;
    this.cjl = paramInt8;
    this.pingTop = paramBoolean2;
  }
  
  public static int getDownColor()
  {
    return -11753174;
  }
  
  public static int getUpColor()
  {
    return -1099463;
  }
  
  public int compareCloseAndLatestPrice()
  {
    if (this.closePrice < this.latestPrice) {
      return 1;
    }
    if (this.closePrice == this.latestPrice) {
      return 0;
    }
    return -1;
  }
  
  public boolean decode(q paramq, int paramInt1, int paramInt2)
  {
    try
    {
      this.code = paramq.l();
      this.name = paramq.l();
      this.decLen = paramq.b();
      this.type = paramq.b();
      this.closePrice = paramq.h();
      this.openPrice = paramq.h();
      this.latestPrice = paramq.h();
      paramq.h();
      paramq.h();
      this.cje = paramq.h();
      if ((paramInt1 == 105) || (paramInt1 == 113) || (paramInt1 == 114)) {
        paramq.e();
      }
      if ((paramInt2 >>> 0 & 0x1) != 0)
      {
        this.cjl_dw = paramq.e();
        this.cjl = paramq.h();
      }
      if ((paramInt2 >>> 1 & 0x1) != 0) {
        paramq.e();
      }
      if ((paramInt2 >>> 2 & 0x1) != 0) {
        paramq.e();
      }
      if ((paramInt2 >>> 3 & 0x1) != 0) {
        paramq.e();
      }
      if ((paramInt2 >>> 4 & 0x1) != 0) {
        paramq.e();
      }
      if ((paramInt2 >>> 5 & 0x1) != 0) {
        paramq.d();
      }
      if ((paramInt2 >>> 6 & 0x1) != 0) {
        paramq.d();
      }
      this.ggss = 0;
      if ((paramInt2 >>> 7 & 0x1) != 0) {
        this.ggss = paramq.b();
      }
      if ((paramInt2 >>> 8 & 0x1) != 0)
      {
        paramq.f();
        paramq.f();
      }
      if ((paramInt2 >>> 9 & 0x1) != 0)
      {
        paramq.h();
        paramq.h();
      }
      if ((paramInt2 >>> 10 & 0x1) != 0)
      {
        paramq.f();
        paramq.h();
        paramq.f();
        paramq.h();
      }
      if ((paramInt2 >>> 11 & 0x1) != 0)
      {
        paramq.d();
        paramq.d();
        paramq.f();
        paramq.f();
        paramq.f();
        paramq.b();
        paramq.b();
      }
      if ((paramInt2 >>> 12 & 0x1) != 0)
      {
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
      }
      if ((paramInt2 >>> 13 & 0x1) != 0)
      {
        paramq.h();
        paramq.h();
        paramq.h();
        paramq.h();
      }
      if ((paramInt2 >>> 14 & 0x1) != 0)
      {
        paramq.e();
        paramq.e();
        paramq.e();
        paramq.e();
        paramq.e();
        paramq.e();
      }
      this.isLoanable = false;
      if ((paramInt2 >>> 15 & 0x1) != 0) {
        if ((paramq.b() & 0x1) != 1) {
          break label485;
        }
      }
      label485:
      for (boolean bool = true;; bool = false)
      {
        this.isLoanable = bool;
        return true;
      }
      return false;
    }
    catch (Exception paramq)
    {
      paramq.printStackTrace();
    }
  }
  
  public int getAllCount()
  {
    return this.zhangCount + this.dieCount + this.pingCount;
  }
  
  public int getBkColor()
  {
    return this.bkColor;
  }
  
  public String getBkZf()
  {
    return this.bkZf;
  }
  
  public int getBulletin()
  {
    return this.ggss;
  }
  
  public String getCfgName()
  {
    return this.cfgName;
  }
  
  public String getCfgZf()
  {
    return this.cfgZf;
  }
  
  public String getCfgZx()
  {
    return this.cfgZx;
  }
  
  public String getCje()
  {
    if (this.cje == 0) {
      return "--";
    }
    return n.b(b.b(this.cje) * 10000L);
  }
  
  public int getCjeColor(y paramy)
  {
    if (paramy == y.b) {
      return -16777216;
    }
    return -1;
  }
  
  public int getClosePrice()
  {
    return this.closePrice;
  }
  
  public String getCode()
  {
    return this.code;
  }
  
  public int getColor()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return -7829368;
    }
    if (this.latestPrice > this.closePrice) {
      return -1099463;
    }
    if (this.latestPrice < this.closePrice) {
      return -11753174;
    }
    return -8616044;
  }
  
  public String getDDX()
  {
    return this.ddx;
  }
  
  public int getDDXColor(y paramy)
  {
    if (paramy == y.b) {
      return -16777216;
    }
    return -1;
  }
  
  public int getDecLen()
  {
    return this.decLen;
  }
  
  public int getDieCount()
  {
    return this.dieCount;
  }
  
  public int getFiveColor()
  {
    return this.fiveColor;
  }
  
  public String getFiveZf()
  {
    return this.fiveZf;
  }
  
  public String getFormatTradeVolumn()
  {
    if (this.cje == 0) {
      return "0000亿";
    }
    return n.b(b.b(this.cje) * 10000L);
  }
  
  public String getFundFlow()
  {
    return this.fundFlow;
  }
  
  public int getFundFlowColor()
  {
    return this.fundFlowColor;
  }
  
  public String getHs()
  {
    return this.hs;
  }
  
  public int getHsColor()
  {
    return this.hsColor;
  }
  
  public String getHsl()
  {
    return this.hsl;
  }
  
  public int getHslColor()
  {
    return this.hslColor;
  }
  
  public String getIndexGrowthRate()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return "0.00%";
    }
    return b.b(this.latestPrice, this.closePrice);
  }
  
  public String getIndexLatestPrice()
  {
    Object localObject;
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      localObject = "0000.00";
    }
    String str;
    do
    {
      do
      {
        do
        {
          return (String)localObject;
          str = b.a(this.latestPrice, this.decLen);
          localObject = str;
        } while (!str.contains("."));
        localObject = str;
      } while (str.length() < 8);
      localObject = str;
    } while (str.split("\\.")[1].length() <= 1);
    return str.substring(0, str.length() - 1);
  }
  
  public String getIndexUpDown()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return "00.00";
    }
    return b.b(this.latestPrice, this.closePrice, this.decLen);
  }
  
  public String getJe()
  {
    return this.je;
  }
  
  public int getJeColor()
  {
    return this.jeColor;
  }
  
  public int getLatestPrice()
  {
    return this.latestPrice;
  }
  
  public String getModuleCode()
  {
    return this.moduleCode;
  }
  
  public int getModule_id()
  {
    return this.module_id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getOpenPrice()
  {
    return this.openPrice;
  }
  
  public boolean getPingTop()
  {
    return this.pingTop;
  }
  
  public String getSelfAggregrateValue()
  {
    return n.h(String.valueOf(b.b(this.cjl)));
  }
  
  public String getSelfGrowthRate()
  {
    String str = b.c(this.latestPrice, this.closePrice);
    if (str.equals("--")) {}
    do
    {
      return str;
      if ((str.contains("-")) || (str.equals("0.00"))) {
        return str + "%";
      }
    } while (str.equals("-"));
    return "+" + str + "%";
  }
  
  public String getSelfLatestPrice()
  {
    return b.a(this.latestPrice, this.decLen);
  }
  
  public int getSelfType()
  {
    return this.selfType;
  }
  
  public String getSelfUpDown()
  {
    return b.d(this.latestPrice, this.closePrice, this.decLen);
  }
  
  public String getStockCode()
  {
    if (this.code == null) {
      return "";
    }
    return this.code.trim();
  }
  
  public String getStockName()
  {
    return this.name;
  }
  
  public int getTradeNumbers()
  {
    return this.cjl;
  }
  
  public int getTradeNumbersDW()
  {
    return this.cjl_dw;
  }
  
  public int getTradeVolumn()
  {
    return this.cje;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public int getZF()
  {
    if ((this.latestPrice == 0) || (this.closePrice == 0)) {
      return 0;
    }
    return b.e(this.latestPrice, this.closePrice);
  }
  
  public String getZd()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return "--";
    }
    return b.b(this.latestPrice, this.closePrice, this.decLen);
  }
  
  public double getZdDouble()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return 0.0D;
    }
    double d2 = this.latestPrice;
    double d3 = this.closePrice;
    if (this.decLen <= 0) {}
    for (double d1 = 1.0D;; d1 = Math.pow(10.0D, this.decLen)) {
      return (d2 - d3) / d1;
    }
  }
  
  public String getZf()
  {
    Object localObject;
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      localObject = "--";
    }
    String str;
    do
    {
      do
      {
        return (String)localObject;
        str = b.b(this.latestPrice, this.closePrice);
        localObject = str;
      } while (str.contains("-"));
      localObject = str;
    } while (str.equals("0.00%"));
    return "+" + str;
  }
  
  public int getZhangCount()
  {
    return this.zhangCount;
  }
  
  public String getZx()
  {
    if ((this.latestPrice == 0) && (this.closePrice == 0)) {
      return "--";
    }
    return b.a(this.latestPrice, this.decLen);
  }
  
  public boolean isLoan()
  {
    return this.isLoanable;
  }
  
  public boolean isLoanable()
  {
    return this.isLoanable;
  }
  
  public void setBkColor(int paramInt)
  {
    this.bkColor = paramInt;
  }
  
  public void setBkZf(String paramString)
  {
    this.bkZf = paramString;
  }
  
  public void setBulletin(int paramInt)
  {
    this.ggss = paramInt;
  }
  
  public void setCfgName(String paramString)
  {
    this.cfgName = paramString;
  }
  
  public void setCfgZf(String paramString)
  {
    this.cfgZf = paramString;
  }
  
  public void setCfgZx(String paramString)
  {
    this.cfgZx = paramString;
  }
  
  public void setCje(int paramInt)
  {
    this.cje = paramInt;
  }
  
  public void setClosePrice(int paramInt)
  {
    this.closePrice = paramInt;
  }
  
  public void setCode(String paramString)
  {
    this.code = paramString;
  }
  
  public void setDDX(String paramString)
  {
    this.ddx = paramString;
  }
  
  public void setDecLen(int paramInt)
  {
    this.decLen = paramInt;
  }
  
  public void setDecl(int paramInt)
  {
    this.decLen = paramInt;
  }
  
  public void setDieCount(int paramInt)
  {
    this.dieCount = paramInt;
  }
  
  public void setFiveColor(int paramInt)
  {
    this.fiveColor = paramInt;
  }
  
  public void setFiveZf(String paramString)
  {
    this.fiveZf = paramString;
  }
  
  public void setFundFlow(String paramString)
  {
    this.fundFlow = paramString;
  }
  
  public void setFundFlowColor(int paramInt)
  {
    this.fundFlowColor = paramInt;
  }
  
  public void setHs(String paramString)
  {
    this.hs = paramString;
  }
  
  public void setHsColor(int paramInt)
  {
    this.hsColor = paramInt;
  }
  
  public void setHsl(String paramString)
  {
    this.hsl = paramString;
  }
  
  public void setHslColor(int paramInt)
  {
    this.hslColor = paramInt;
  }
  
  public void setJe(String paramString)
  {
    this.je = paramString;
  }
  
  public void setJeColor(int paramInt)
  {
    this.jeColor = paramInt;
  }
  
  public void setLatestPrice(int paramInt)
  {
    this.latestPrice = paramInt;
  }
  
  public void setLiuInfo(int paramInt1, int paramInt2)
  {
    this.liuru = paramInt1;
    this.liuch = paramInt2;
  }
  
  public void setLoan(boolean paramBoolean)
  {
    this.isLoanable = paramBoolean;
  }
  
  public void setLoanable(boolean paramBoolean)
  {
    this.isLoanable = paramBoolean;
  }
  
  public void setModuleCode(String paramString)
  {
    this.moduleCode = paramString;
  }
  
  public void setModule_id(int paramInt)
  {
    this.module_id = paramInt;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setOpenPrice(int paramInt)
  {
    this.openPrice = paramInt;
  }
  
  public void setPingCount(int paramInt)
  {
    this.pingCount = paramInt;
  }
  
  public void setPingTop(boolean paramBoolean)
  {
    this.pingTop = paramBoolean;
  }
  
  public void setSelfType(int paramInt)
  {
    this.selfType = paramInt;
  }
  
  public void setStockCode(String paramString)
  {
    this.code = paramString;
  }
  
  public void setStockName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setTradeNumbers(int paramInt)
  {
    this.cjl = paramInt;
  }
  
  public void setTradeNumbersDW(int paramInt)
  {
    this.cjl_dw = paramInt;
  }
  
  public void setTradeVolumn(int paramInt)
  {
    this.cje = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void setZhangCount(int paramInt)
  {
    this.zhangCount = paramInt;
  }
  
  public void setZs(int paramInt)
  {
    this.closePrice = paramInt;
  }
  
  public void setZxData(int paramInt)
  {
    this.latestPrice = paramInt;
  }
  
  public void update(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.decLen = paramInt2;
    this.cjl_dw = paramInt3;
    this.latestPrice = paramInt4;
    this.cjl = paramInt5;
    this.cje = paramInt6;
  }
  
  public void update(SelfStock paramSelfStock)
  {
    this.name = paramSelfStock.getName();
    this.code = paramSelfStock.getCode();
    this.type = paramSelfStock.getType();
    this.decLen = paramSelfStock.getDecLen();
    this.closePrice = paramSelfStock.getClosePrice();
    this.latestPrice = paramSelfStock.getLatestPrice();
    this.isLoanable = paramSelfStock.isLoan();
    this.ggss = paramSelfStock.getBulletin();
    this.cje = paramSelfStock.getTradeVolumn();
    this.cjl = paramSelfStock.getTradeNumbers();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SelfStock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */