package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Vector;

class s
  implements AbsListView.OnScrollListener
{
  s(q paramq) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      if ((paramAbsListView.getLastVisiblePosition() != paramAbsListView.getCount() - 1) || (q.a(this.a).size() >= q.e(this.a).b())) {
        break label63;
      }
      q.e(this.a).a().setVisibility(0);
      q.a(this.a, false);
    }
    label63:
    while ((paramAbsListView.getLastVisiblePosition() != paramAbsListView.getCount() - 1) || (q.a(this.a).size() != q.e(this.a).b())) {
      return;
    }
    q.f(this.a).removeFooterView(q.e(this.a).a());
    paramAbsListView = Toast.makeText(this.a.getActivity(), "没有更多了！", 0);
    paramAbsListView.setGravity(80, 0, 0);
    paramAbsListView.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */