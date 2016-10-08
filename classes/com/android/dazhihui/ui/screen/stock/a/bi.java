package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.stock.PlateListScreen;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;

class bi
  implements mc
{
  bi(bf parambf) {}
  
  public void a(int paramInt)
  {
    int i = bf.b(this.a, paramInt);
    Object localObject;
    if (bf.a(this.a) == i)
    {
      localObject = this.a;
      if (bf.b(this.a) == 0)
      {
        i = 1;
        bf.a((bf)localObject, (byte)i);
        label44:
        localObject = bf.c(this.a);
        if (bf.b(this.a) != 0) {
          break label118;
        }
      }
    }
    label118:
    for (boolean bool = false;; bool = true)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      bf.c(this.a).a();
      bf.a(this.a, 0, true);
      return;
      i = 0;
      break;
      bf.c(this.a, i);
      bf.a(this.a, (byte)0);
      break label44;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    paramInt = ((Integer)parammh.k[1]).intValue();
    if ((paramInt == 0) || (TextUtils.isEmpty(parammh.a[0])) || ("--".equals(parammh.a[0]))) {
      return;
    }
    MarketVo localMarketVo = new MarketVo(parammh.a[0], false, false, paramInt);
    Bundle localBundle = new Bundle();
    localBundle.putString("code", (String)parammh.k[0]);
    localBundle.putParcelable("market_vo", localMarketVo);
    parammh = new Intent();
    parammh.putExtras(localBundle);
    parammh.setClass(this.a.getActivity(), PlateListScreen.class);
    this.a.startActivity(parammh);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */