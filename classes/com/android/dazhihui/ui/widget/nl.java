package com.android.dazhihui.ui.widget;

import android.widget.BaseAdapter;
import com.android.dazhihui.ui.model.stock.WisdomHostManager.WisdomCallBack;
import com.android.dazhihui.ui.model.stock.WisdomHostVo;
import com.android.dazhihui.ui.model.stock.WisdomHostVo.Data;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.GifView;
import java.util.List;

class nl
  implements WisdomHostManager.WisdomCallBack
{
  nl(WisdomHot paramWisdomHot, GifView paramGifView) {}
  
  public void callBack(WisdomHostVo paramWisdomHostVo)
  {
    if ((paramWisdomHostVo != null) && (paramWisdomHostVo.data != null) && (paramWisdomHostVo.data.getHotMsgs().size() > 0))
    {
      r.a(this.b.getContext()).a(paramWisdomHostVo.data.getHotImgUrl(), new nm(this));
      this.b.a.clear();
      this.b.a.addAll(paramWisdomHostVo.data.getHotMsgs());
      this.b.b.notifyDataSetChanged();
      this.b.setVisibility(0);
      return;
    }
    this.b.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */