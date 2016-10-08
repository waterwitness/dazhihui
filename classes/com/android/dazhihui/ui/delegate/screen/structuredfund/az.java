package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.BorderedTextView;
import java.io.PrintStream;
import java.util.ArrayList;

class az
  extends BaseAdapter
{
  ArrayList<String[]> a = new ArrayList();
  
  public az(Context paramContext, ArrayList<String[]> paramArrayList)
  {
    StructuredFundSplitOrMerge.a(paramContext, LayoutInflater.from(paramArrayList));
    this.a.clear();
    ArrayList localArrayList;
    this.a = localArrayList;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new ba(this);
      paramView = StructuredFundSplitOrMerge.k(this.b).inflate(2130903131, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558990));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558991));
      paramViewGroup.c = ((BorderedTextView)paramView.findViewById(2131558992));
      paramView.setTag(paramViewGroup);
      if (!StructuredFundSplitOrMerge.g(this.b).equals("hebing")) {
        break label259;
      }
      paramViewGroup.a.setText(((String[])this.a.get(paramInt))[0]);
      paramViewGroup.b.setText(((String[])this.a.get(paramInt))[1]);
      paramViewGroup.c.setText(((String[])this.a.get(paramInt))[2]);
    }
    for (;;)
    {
      StructuredFundSplitOrMerge.o(this.b);
      int i = StructuredFundSplitOrMerge.p(this.b);
      System.out.println("这是滴" + String.valueOf(i) + "次" + ((String[])this.a.get(paramInt))[StructuredFundSplitOrMerge.m(this.b)] + "   " + ((String[])this.a.get(paramInt))[StructuredFundSplitOrMerge.l(this.b)]);
      return paramView;
      paramViewGroup = (ba)paramView.getTag();
      break;
      label259:
      if (StructuredFundSplitOrMerge.g(this.b).equals("chaifen"))
      {
        paramViewGroup.a.setText(((String[])this.a.get(paramInt))[StructuredFundSplitOrMerge.l(this.b)]);
        paramViewGroup.b.setText(((String[])this.a.get(paramInt))[StructuredFundSplitOrMerge.m(this.b)]);
        if (((String[])this.a.get(paramInt))[StructuredFundSplitOrMerge.n(this.b)].equals("3")) {
          paramViewGroup.c.setText("沪");
        } else if (((String[])StructuredFundSplitOrMerge.c(this.b).get(paramInt))[StructuredFundSplitOrMerge.n(this.b)].equals("2")) {
          paramViewGroup.c.setText("深");
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */