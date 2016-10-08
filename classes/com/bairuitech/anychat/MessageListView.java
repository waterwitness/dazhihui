package com.bairuitech.anychat;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.ArrayList;

public class MessageListView
  extends ListView
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private ArrayList<String> fileList = new ArrayList();
  private MessageListView.FileListAdapter fileListAdapter;
  
  public MessageListView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    setCacheColorHint(0);
    this.fileListAdapter = new MessageListView.FileListAdapter(this, this.context);
    setAdapter(this.fileListAdapter);
    setOnItemClickListener(this);
  }
  
  public void SetFileList(ArrayList<String> paramArrayList)
  {
    this.fileList = paramArrayList;
    this.fileListAdapter = new MessageListView.FileListAdapter(this, this.context);
    setAdapter(this.fileListAdapter);
    invalidate();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\MessageListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */