package com.example.vidu_customlayout_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmployeeAdapter extends ArrayAdapter {
    private Context context ;
    private int[] icon ;
    private Employee employee ;
    private List<Employee> employeeList ;
    LayoutInflater inflater;


    public EmployeeAdapter(@NonNull Context context, int[] icon, List<Employee> employeeList) {
        super(context,R.layout.listemployee,employeeList);
        this.context = context;
        this.icon = icon;
        this.employeeList = employeeList;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView =  inflater.inflate(R.layout.listemployee,null,true) ;

        ImageView iv = convertView.findViewById(R.id.icon)  ;
        TextView tv = convertView.findViewById(R.id.employ) ;
        CheckBox cb = convertView.findViewById(R.id.sex);

        employee =employeeList.get(position);

        tv.setText(employee.getId() + "-" + employee.getName());
        if(employee.isMale()){
            iv.setImageResource(icon[0]);
            cb.setChecked(false);
        }
        else{
            iv.setImageResource(icon[1]);
            cb.setChecked(true);
        }
        return convertView ;
    }
}


