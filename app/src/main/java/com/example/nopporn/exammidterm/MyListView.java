package com.example.nopporn.exammidterm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 2/3/2560.
 */

public class MyListView extends BaseAdapter {

    private static Activity activity;
    private static LayoutInflater inflater;
    ArrayList<TodoList> myTodoList;

    @Override
    public int getCount() {
        return myTodoList.size();
    }

    @Override
    public TodoList getItem(int position) {
        return myTodoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myTodoList.get(position).getTaskid();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        v = inflater.inflate(R.layout.activity_contact_list, null);
        TextView textView = (TextView) v.findViewById(R.id.listview_text);
        ImageView imageView=(ImageView) v.findViewById(R.id.Image_View);
        TodoList todoList = myTodoList.get(position);
        textView.setText(todoList.getTaskname());
        return v;
    }

    public MyListView(Activity activity, ArrayList<TodoList> myTodoList) {
        this.myTodoList = myTodoList;
        this.activity = activity;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE); }
}
