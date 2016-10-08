package com.android.dazhihui.ui.model.stock;

public class HotNewsVo$NewsRequestHot
{
  public HotNewsVo.HotData data = new HotNewsVo.HotData();
  public HotNewsVo.HotHeader header;
  
  public HotNewsVo$NewsRequestHot(String paramString1, String paramString2, String paramString3)
  {
    this.data.url = paramString1;
    this.data.title = paramString2;
    this.data.source = paramString3;
    this.header = new HotNewsVo.HotHeader();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HotNewsVo$NewsRequestHot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */