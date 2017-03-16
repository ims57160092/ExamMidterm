package com.example.nopporn.exammidterm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by ASUS on 2/3/2560.
 */

public class TodoListDAO {
    private SQLiteDatabase database;
    private DbHelper dbHelper;

    public TodoListDAO(Context context){
        dbHelper=new DbHelper(context);
    }
    public void open(){
        database=dbHelper.getWritableDatabase();
    }
    public void close(){
        dbHelper.close();
    }
    public ArrayList<TodoList> getAlltodoList(){
        ArrayList<TodoList> todoList = new ArrayList<TodoList>();
        Cursor cursor = database.rawQuery("SELECT * FROM tbtodo_list;",null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            TodoList todoList1;
            todoList1 = new TodoList();
            todoList1.setTaskid(cursor.getInt(0));
            todoList1.setTaskname(cursor.getString(1));
            todoList.add(todoList1);
            cursor.moveToNext();
        }
        cursor.close();
        return todoList;
    }
    public void add(TodoList todoList){
        TodoList newTodoList = new TodoList();
        newTodoList = todoList;
        ContentValues values = new ContentValues();
        values.put("taskname", newTodoList.getTaskname()); this.database.insert("tbtodo_list",null,values);
        Log.d("Todo List Demo :::", "Add OK"); }


}
