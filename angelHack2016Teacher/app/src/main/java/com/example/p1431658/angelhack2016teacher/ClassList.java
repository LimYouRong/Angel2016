package com.example.p1431658.angelhack2016teacher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Joshua on 14/5/2016.
 */
public class ClassList extends AppCompatActivity {
    ArrayList<Student> class01 = new ArrayList<>();
    ArrayList<Student> class02 = new ArrayList<>();
    ArrayList<Student> class03 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classlist);
        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(1, "Joshua                                                                                               S150382", 2, "David Goh"));
        listOfStudents.add(new Student(2, "Martin                                                                                               S153762", 2, "David Tan"));
        listOfStudents.add(new Student(3, "Johnathan                                                                                               S154578", 2, "David Goh"));
        listOfStudents.add(new Student(4, "May                                                                                               S153477", 2, "David Tan"));
        listOfStudents.add(new Student(5, "Sarah                                                                                               S155453", 2, "David Goh"));
        listOfStudents.add(new Student(6, "Wilson                                                                                               S152436", 2, "David Tan"));
        populateListView(listOfStudents);
        ArrayList<String> studentNames = new ArrayList<>();
        for(int i = 0; i < class02.size(); i++){
            studentNames.add(class02.get(i).getStudentName());
        }



        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, studentNames);
        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);
    }

    public void populateListView(ArrayList<Student> listOfStudents ){
        for(int i  = 0; i < listOfStudents.size(); i++){
            switch (listOfStudents.get(i).getClassId()){
                case 1:
                    class01.add(listOfStudents.get(i));
                    break;
                case 2:
                    class02.add(listOfStudents.get(i));
                    break;
                case 3:
                    class03.add(listOfStudents.get(i));
                    break;
            }
        }
    }
}





