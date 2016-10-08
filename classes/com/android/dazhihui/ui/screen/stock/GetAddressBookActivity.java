package com.android.dazhihui.ui.screen.stock;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.ArrayList;
import java.util.List;

public class GetAddressBookActivity
  extends BaseActivity
  implements cp, cs
{
  private List<es> a = null;
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public List<es> a()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, "display_name COLLATE LOCALIZED ASC");
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      int i = localCursor.getColumnIndex("_id");
      int j = localCursor.getColumnIndex("display_name");
      do
      {
        Object localObject = localCursor.getString(i);
        String str1 = localCursor.getString(j);
        es locales = new es(this);
        long l1 = localCursor.getLong(localCursor.getColumnIndex("photo_id"));
        long l2 = localCursor.getLong(localCursor.getColumnIndex("_id"));
        if (l1 > 0L) {
          locales.a(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(l2).longValue()));
        }
        locales.b(str1);
        int k = localCursor.getInt(localCursor.getColumnIndex("has_phone_number"));
        Log.i("username", str1);
        if (k > 0)
        {
          localObject = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + (String)localObject, null, null);
          if (((Cursor)localObject).moveToFirst()) {
            do
            {
              str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("data1"));
              String str2 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("data2"));
              locales.a(str1);
              Log.i("phoneNumber", str1);
              Log.i("phoneType", str2);
            } while (((Cursor)localObject).moveToNext());
          }
        }
        localArrayList.add(locales);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    paramct.d = "添加通讯录好友";
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903048);
    paramBundle = (DzhHeader)findViewById(2131558567);
    paramBundle.setOnHeaderButtonClickListener(this);
    paramBundle.a(this, this);
    try
    {
      this.a = a();
      paramBundle = (PageLoadTip)findViewById(2131558569);
      View localView1 = findViewById(2131558570);
      View localView2 = findViewById(2131558572);
      TextView localTextView = (TextView)findViewById(2131558571);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      localSpannableStringBuilder.append("如果未授予权限请允许");
      int i = localSpannableStringBuilder.length();
      localSpannableStringBuilder.append("“大智慧”");
      int j = localSpannableStringBuilder.length();
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-14973720), i, j, 33);
      localSpannableStringBuilder.append("访问你的通讯录");
      localTextView.setText(localSpannableStringBuilder);
      localView2.setOnClickListener(new ep(this));
      if (this.a == null)
      {
        paramBundle.setPageError("读取联系人信息异常!");
        return;
      }
      if (this.a.size() == 0)
      {
        localView1.setVisibility(0);
        return;
      }
      ((ListView)findViewById(2131558568)).setAdapter(new eq(this));
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\GetAddressBookActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */