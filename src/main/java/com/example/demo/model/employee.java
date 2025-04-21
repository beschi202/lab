package com.example.demo.model;


public class employee {
    int eno;
    String name;

    public employee(int no,String name){
        this.eno=eno;
        this.name=name;
    }

    public String getname(){
        return name;
    }

    public int getno(){
        return eno;
    }

    public void setname(String name){
        this.name=name;
    }

    public void setno(int no){
        this.eno=no;
    }
    
}
