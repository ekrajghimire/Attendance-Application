package com.example.attendanceapplication;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    RecyclerView recyclerView;
    ClassAdapter classAdapter;
    RecyclerView.LayoutManager LayoutManager;
    ArrayList<ClassItem> classItems = new ArrayList<>();

    EditText class_edt;
    EditText subject_edt;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fab = findViewById(R.id.fab_main);
        fab.setOnClickListener(v -> showDialog());

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        classAdapter = new ClassAdapter(this, classItems);
        recyclerView.setAdapter(classAdapter);

    }

    private void showDialog(){
    MyDialog dialog = new MyDialog();
    dialog.show(getSupportFragmentManager(), MyDialog.CLASS_ADD_DIALOG);
    dialog.setListener((className, subjectName) -> addClass(className, subjectName));


    }

    private void addClass(String className, String subjectName) {
        classItems.add(new ClassItem(className, subjectName));
        classAdapter.notifyDataSetChanged();
    }
}