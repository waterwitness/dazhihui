package com.android.dazhihui.ui.delegate.screen.newstock;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

class j
  extends BaseAdapter
{
  private int b = -1;
  
  j(NewStockBatchEntrust paramNewStockBatchEntrust) {}
  
  public int getCount()
  {
    return NewStockBatchEntrust.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return NewStockBatchEntrust.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    o localo;
    i locali;
    if (paramView == null)
    {
      paramView = (ViewGroup)this.a.getLayoutInflater().inflate(2130903516, null);
      localo = new o(this.a, null);
      localo.a = ((CheckBox)paramView.findViewById(2131560930));
      localo.b = ((TextView)paramView.findViewById(2131559141));
      localo.c = ((TextView)paramView.findViewById(2131559276));
      localo.d = ((TextView)paramView.findViewById(2131559143));
      localo.e = ((TextView)paramView.findViewById(2131560936));
      localo.f = ((EditText)paramView.findViewById(2131560674));
      locali = new i(this.a);
      localo.f.addTextChangedListener(locali);
      paramViewGroup = new l(this.a);
      localo.a.setOnCheckedChangeListener(paramViewGroup);
      paramView.setTag(localo);
      paramView.setTag(localo.a.getId(), paramViewGroup);
      paramView.setTag(localo.f.getId(), locali);
    }
    while ((NewStockBatchEntrust.a(this.a) == null) || (NewStockBatchEntrust.a(this.a).size() <= paramInt))
    {
      return paramView;
      localo = (o)paramView.getTag();
      paramViewGroup = (l)paramView.getTag(localo.a.getId());
      locali = (i)paramView.getTag(localo.f.getId());
    }
    localo.b.setText(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).a);
    localo.c.setText(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).b);
    localo.d.setText(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).c);
    localo.e.setText(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).d);
    locali.a(paramInt);
    localo.f.setOnTouchListener(new k(this, paramInt));
    localo.f.clearFocus();
    if ((this.b != -1) && (this.b == paramInt)) {
      localo.f.requestFocus();
    }
    localo.f.setText(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).e);
    localo.f.setSelection(localo.f.getText().length());
    paramViewGroup.a(paramInt);
    localo.a.setChecked(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).f);
    localo.f.setEnabled(((n)NewStockBatchEntrust.a(this.a).get(paramInt)).f);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */