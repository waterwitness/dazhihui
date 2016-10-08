package com.android.dazhihui.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class e
  extends SQLiteOpenHelper
{
  public e(d paramd, Context paramContext)
  {
    super(paramContext, "DAZHIHUI", null, 6);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table dzh_table (_id integer primary key autoincrement, key text not null, data text not null);");
    paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 6) {
      if (paramInt1 == 1)
      {
        paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (paramInt1 == 2)
              {
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
                return;
              }
              if (paramInt1 == 3)
              {
                paramSQLiteDatabase.execSQL("ALTER TABLE self_stock RENAME TO self_stock_temp");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
                paramSQLiteDatabase.execSQL("INSERT INTO self_stock SELECT *, 0 from self_stock_temp");
                paramSQLiteDatabase.execSQL("DROP TABLE self_stock_temp");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
                return;
              }
              if (paramInt1 == 4)
              {
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
                paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
                return;
              }
            } while (paramInt1 != 5);
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_all_table(all_id INTEGER PRIMARY KEY AUTOINCREMENT, all_message_id INTEGER NOT NULL,all_mesage_type INTEGER,all_mesage_son_type INTEGER,all_res TEXT,all_ct TEXT,all_push_time TEXT,all_des TEXT,all_exp TEXT)");
            return;
            if (paramInt2 != 5) {
              break;
            }
            if (paramInt1 == 1)
            {
              paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
              return;
            }
            if (paramInt1 == 2)
            {
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
              return;
            }
            if (paramInt1 == 3)
            {
              paramSQLiteDatabase.execSQL("ALTER TABLE self_stock RENAME TO self_stock_temp");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
              paramSQLiteDatabase.execSQL("INSERT INTO self_stock SELECT *, 0 from self_stock_temp");
              paramSQLiteDatabase.execSQL("DROP TABLE self_stock_temp");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
              paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
              return;
            }
          } while (paramInt1 != 4);
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_capital(id INTEGER PRIMARY KEY AUTOINCREMENT, quanshang_name TEXT,name TEXT,code TEXT NOT NULL,cost TEXT,amount INTEGER,available_amount INTEGER,type INTEGER,profitorloss TEXT,profitorloss_deviation TEXT)");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_entrust(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,entrust_state TEXT,entrust_time TEXT, entrust_account TEXT ,keyongzijin TEXT ,dangriyingkui_deviation TEXT ,dangriyingkui_deviation_type TEXT )");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS offline_drcj(id INTEGER PRIMARY KEY AUTOINCREMENT, buy_or_sell TEXT,name TEXT,price TEXT, amount TEXT ,code TEXT )");
          return;
          if (paramInt2 != 4) {
            break;
          }
          if (paramInt1 == 1)
          {
            paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
            return;
          }
          if (paramInt1 == 2)
          {
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
            paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
            return;
          }
        } while (paramInt1 != 3);
        paramSQLiteDatabase.execSQL("ALTER TABLE self_stock RENAME TO self_stock_temp");
        paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
        paramSQLiteDatabase.execSQL("INSERT INTO self_stock SELECT *, 0 from self_stock_temp");
        paramSQLiteDatabase.execSQL("DROP TABLE self_stock_temp");
        return;
        if (paramInt2 != 3) {
          break;
        }
        if (paramInt1 == 1)
        {
          paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
          paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
          return;
        }
      } while (paramInt1 != 2);
      paramSQLiteDatabase.execSQL("create table IF NOT EXISTS self_stock(self_stock_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,code TEXT NOT NULL,type INTEGER,decf_len INTEGER,close_price INTEGER,latest_price INTEGER,loan INTEGER,bulletin INTEGER,self_type INTEGER,trade_volumn INTEGER,trade_numbers INTEGER,ping_top INTEGER)");
      paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_public_table(public_id INTEGER PRIMARY KEY AUTOINCREMENT, public_message_id INTEGER NOT NULL,public_name TEXT,public_code TEXT,public_type INTEGER,public_param TEXT,pubic_message TEXT,public_push_time TEXT)");
      paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_warn_table(warn_id INTEGER PRIMARY KEY AUTOINCREMENT, warn_message_id INTEGER NOT NULL,warn_name TEXT,warn_code TEXT,warn_message TEXT,warn_time TEXT)");
      paramSQLiteDatabase.execSQL("create table IF NOT EXISTS push_template_table(template_id INTEGER PRIMARY KEY AUTOINCREMENT, template_message_id INTEGER,template_redirect TEXT,template_type TEXT,template_url TEXT,template_code TEXT,template_message TEXT,template_message_type INTEGER,template_time TEXT)");
      return;
      if (paramInt2 != 2) {
        break;
      }
    } while (paramInt1 != 1);
    paramSQLiteDatabase.execSQL("create table read_marks (_id integer primary key autoincrement, news_type integer, item_id text, time integer );");
    paramSQLiteDatabase.execSQL("create table IF NOT EXISTS lottery(_id INTEGER PRIMARY KEY AUTOINCREMENT, gametype INTEGER NOT NULL, playtype TEXT NOT NULL, number TEXT NOT NULL, amount INTEGER NOT NULL)");
    return;
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS dzh_table");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */