package com.chinachino.rxjavaandrxandroid;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Task> CreateTasksList(){
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task("Tack out the trash",true,3));
        tasks.add(new Task("walk the dog",false,2));
        tasks.add(new Task("make my bed",true,1));
        tasks.add(new Task("make my bed",true,1));
        tasks.add(new Task("unload the dishwasher",false,0));
        tasks.add(new Task("unload the dishwasher",false,0));
        tasks.add(new Task("make dinner",true,5));
        return tasks;
    }
}
