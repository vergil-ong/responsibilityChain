package com.github.ong.ResponsibilityChain.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponsibilityRegister {

    @Autowired
    private List<Responsibility> list = new ArrayList<>();

    private int current = 0;

    public List<Responsibility> getList() {
        return list;
    }

    public void setList(List<Responsibility> list) {
        this.list = list;
    }

    public boolean regist(Responsibility responsibility){
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(responsibility);
        return true;
    }

    public Responsibility getNext(){
        if(list == null){
            return null;
        }
        if(list.size()>current){
            Responsibility responsibility = list.get(current);
            current++;
            return responsibility;
        }
        return null;
    }
}
