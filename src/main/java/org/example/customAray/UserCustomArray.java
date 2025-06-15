package org.example.customAray;

import org.example.entity.Message;
import org.example.entity.User;

public interface UserCustomArray {
     void addElement(User value);
     void resize() ;
    void deleteElement(int index);
     void reBuild(int index) ;
    void print();
    }
