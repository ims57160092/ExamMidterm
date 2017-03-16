package com.example.nopporn.exammidterm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASUS on 2/3/2560.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String databaseName = "dbtodolist.sqlite";
    private static final int databaseVersion = 1;
    Context myContext;
    private static final String SQLCreateTable =
            "CREATE TABLE tbtodo_list (" +
                    "taskid INTEGER PRIMARYKEY AOTOINCREMENT,"+
                    "taskname TEXT,"+
                    "phone TEXT)";
    public DbHelper(Context context){
        super(context,databaseName,null,databaseVersion);
        this.myContext=context;
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQLCreateTable);
        String insertData1 = "INSERT INTO tbtodo_list (taskname,phone) VALUES ('homework1','0891203348')";
        String insertData2 = "INSERT INTO tbtodo_list (taskname,phone) VALUES ('homework2','0891203348')";
        String insertData3 = "INSERT INTO tbtodo_list (taskname,phone) VALUES ('homework3','0891203348')";
        String insertData4 = "INSERT INTO tbtodo_list (taskname,phone) VALUES ('homework4','0891203348')";
        String insertData5 = "INSERT INTO tbtodo_list (taskname,phone) VALUES ('homework5','0891203348')";
        db.execSQL(insertData1);
        db.execSQL(insertData2);
        db.execSQL(insertData3);
        db.execSQL(insertData4);
        db.execSQL(insertData5);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
