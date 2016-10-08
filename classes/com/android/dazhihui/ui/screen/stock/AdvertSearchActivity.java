package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.widget.a.r;
import com.c.a.k;
import java.util.ArrayList;

public class AdvertSearchActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    Object localObject2 = (TextView)findViewById(2131558521);
    paramBundle = (TextView)findViewById(2131558522);
    int i = getIntent().getIntExtra("PCODE", 0);
    Object localObject1 = a.c().b();
    if ((localObject1 != null) && (((AdvertVo)localObject1).getAdvert(i) != null))
    {
      localObject1 = ((AdvertVo)localObject1).getAdvert(i);
      ((TextView)localObject2).setText(new k().a(localObject1));
      if ((((AdvertVo.AdvertData)localObject1).advList != null) && (((AdvertVo.AdvertData)localObject1).advList.size() != 0))
      {
        i = 0;
        if (i < ((AdvertVo.AdvertData)localObject1).advList.size())
        {
          localObject2 = (AdvertVo.AdvItem)((AdvertVo.AdvertData)localObject1).advList.get(i);
          if (((AdvertVo.AdvItem)localObject2).getMatchImg() != null)
          {
            localObject2 = localObject2.getMatchImg()[0];
            if (r.a(this).a((String)localObject2) != null) {
              break label213;
            }
          }
          label213:
          for (boolean bool = false;; bool = true)
          {
            paramBundle.append(i + "---->" + (String)localObject2 + "\n是否下载：" + String.valueOf(bool) + "\n");
            i += 1;
            break;
          }
        }
      }
      else
      {
        paramBundle.setText("该广告无图片数据");
      }
      return;
    }
    if (localObject1 == null)
    {
      ((TextView)localObject2).setText("所以广告无数据");
      return;
    }
    ((TextView)localObject2).setText("当前广告位没数据");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\AdvertSearchActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */