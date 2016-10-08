package com.bairuitech.anychat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

class MessageListView$FileListAdapter
  extends BaseAdapter
{
  private Context context;
  
  public MessageListView$FileListAdapter(MessageListView paramMessageListView, Context paramContext)
  {
    this.context = paramContext;
  }
  
  public int getCount()
  {
    return MessageListView.access$0(this.this$0).size();
  }
  
  public Object getItem(int paramInt)
  {
    return MessageListView.access$0(this.this$0).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = new TextView(this.context);
    paramView.setTextColor(-16777216);
    paramView.setPadding(0, 2, 0, 2);
    paramView.setTextSize(18.0F);
    paramView.setBackgroundColor(17170444);
    paramView.setText((CharSequence)MessageListView.access$0(this.this$0).get(paramInt));
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\MessageListView$FileListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */