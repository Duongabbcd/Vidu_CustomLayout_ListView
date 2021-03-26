package com.example.vidu_customlayout_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    private EditText edt1 ,edt2 ;
    private RadioButton male ,female ;
    private ListView listView ;
    private int[] icon = {R.drawable.male , R.drawable.female} ;
    private Employee employee ;
    private RadioGroup radioGroup ;
    private List<Employee> employeeList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee = new Employee("","",false);
                employee.setId(edt1.getText().toString());
                employee.setName(edt2.getText().toString());

                if(male.isChecked()){
                    employee.setSex(true);
                    employeeList.add(employee);
                }
                if(female.isChecked()){
                    employee.setSex(false);
                    employeeList.add(employee);
                }
                final EmployeeAdapter adapter = new EmployeeAdapter(getApplicationContext(),icon,employeeList) ;
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });

        }

    private void init() {
            button = findViewById(R.id.btn) ;
            edt1 = findViewById(R.id.maNV)  ;
            edt2 =  findViewById(R.id.tenNV)  ;
            male = findViewById(R.id.male) ;
            female = findViewById(R.id.female) ;
            listView  =findViewById(R.id.listview);
            radioGroup = findViewById(R.id.radio) ;
            employeeList = new ArrayList<>() ;

    }
}