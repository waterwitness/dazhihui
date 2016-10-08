package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.media.AudioManager;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.sunflower.FlowerCollector;
import java.util.HashMap;

class qt
  implements View.OnTouchListener
{
  qt(SearchHuiFragment paramSearchHuiFragment) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    }
    ((AudioManager)this.a.getActivity().getApplicationContext().getSystemService("audio")).setStreamMute(3, true);
    FlowerCollector.onEvent(this.a.getActivity(), "iat_recognize");
    this.a.d.setFocusable(true);
    this.a.d.setFocusableInTouchMode(true);
    this.a.d.requestFocus();
    this.a.d.findFocus();
    this.a.d.setText("");
    SearchHuiFragment.l(this.a).clear();
    SearchHuiFragment.c(this.a, 1);
    this.a.b();
    SearchHuiFragment.m(this.a).setVisibility(0);
    SearchHuiFragment.o(this.a).setListener(SearchHuiFragment.n(this.a));
    SearchHuiFragment.o(this.a).show();
    SearchHuiFragment.a(this.a, this.a.getString(2131166342));
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */