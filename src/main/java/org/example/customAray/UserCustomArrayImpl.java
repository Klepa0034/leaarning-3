package org.example.customAray;

import org.example.entity.Message;
import org.example.entity.User;

public class UserCustomArrayImpl implements UserCustomArray {
    private int currentSize;
    private User[] array;
    public UserCustomArrayImpl(){
        this.currentSize = 0;
        this.array = new User[16];
    }
    public void addElement(User value){
        if(currentSize==array.length) resize();
        array[currentSize]=value;
        currentSize++;
    }
    public void resize(){
        User[] tempArray = new User[array.length * 2];
        for(int i=0;i<=array.length;i++){
            tempArray[i]=array[i];
        }
        array=tempArray;
    }
    public void deleteElement(int index){
        if(currentSize<=index){
            throw new RuntimeException();
        }
        array[index]=null;
        reBuild(index);
        currentSize--;
    }
    public void reBuild(int index){
        for(int i =index;i< currentSize;i++){
            array[i]=array[i+1];
            array[i+1]=null;
        }
    }
    public void print(){
        for (int i = 0; i <currentSize ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
