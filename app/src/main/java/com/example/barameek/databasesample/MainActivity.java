package com.example.barameek.databasesample;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    SQLiteDatabase mDb;
    MyDbHelper mHelper;
    Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ListView listView1 = (ListView)findViewById(R.id.listView1);

        mHelper = new MyDbHelper(this);
//        mDb = mHelper.getWritableDatabase();
//        mCursor = mDb.rawQuery("SELECT " + MyDbHelper.COL_NAME + ", "  + MyDbHelper.COL_PIECE_PRICE
//                + ", " + MyDbHelper.COL_CAKE_PRICE + " FROM " + MyDbHelper.TABLE_NAME, null);
//
//        ArrayList<String> dirArray = new ArrayList<String>();
//        mCursor.moveToFirst();

//        while ( !mCursor.isAfterLast() ){
//            dirArray.add(mCursor.getString(mCursor.getColumnIndex(MyDbHelper.COL_NAME)) + "\n"
//                    + "Piece : " + mCursor.getString(mCursor.getColumnIndex(MyDbHelper.COL_PIECE_PRICE)) + "\t\t"
//                    + "Cake : " + mCursor.getString(mCursor.getColumnIndex(MyDbHelper.COL_CAKE_PRICE)));
//            mCursor.moveToNext();
//        }

        //ArrayAdapter<String> adapterDir = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dirArray);
        //listView1.setAdapter(adapterDir);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
