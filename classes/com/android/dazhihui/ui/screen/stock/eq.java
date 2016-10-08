package com.android.dazhihui.ui.screen.stock;

import android.graphics.BitmapFactory;
import android.provider.ContactsContract.Contacts;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.InputStream;
import java.util.List;

class eq
  extends BaseAdapter
{
  eq(GetAddressBookActivity paramGetAddressBookActivity) {}
  
  public int getCount()
  {
    return GetAddressBookActivity.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return GetAddressBookActivity.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    es locales;
    if (paramView == null)
    {
      paramViewGroup = new et(this.a);
      paramView = LayoutInflater.from(this.a.getApplicationContext()).inflate(2130903047, null);
      paramViewGroup.b = ((Button)paramView.findViewById(2131558566));
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558565));
      paramViewGroup.c = ((ImageView)paramView.findViewById(2131558564));
      paramView.setTag(paramViewGroup);
      locales = (es)GetAddressBookActivity.a(this.a).get(paramInt);
      if (locales.a() == null) {
        break label174;
      }
      InputStream localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.a.getContentResolver(), locales.a());
      paramViewGroup.c.setImageBitmap(BitmapFactory.decodeStream(localInputStream));
    }
    for (;;)
    {
      paramViewGroup.a.setText(es.a(locales));
      paramViewGroup.b.setOnClickListener(new er(this, locales));
      return paramView;
      paramViewGroup = (et)paramView.getTag();
      break;
      label174:
      paramViewGroup.c.setImageResource(2130837517);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */