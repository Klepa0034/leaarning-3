package org.example.customAray;

import org.example.entity.Chat;
import org.example.entity.User;

public class ChatCustomArrayImpl implements ChatCustomArray{
    private int currentSize;
    private Chat[] array;
    public ChatCustomArrayImpl(){
        this.currentSize = 0;
        this.array = new Chat[16];
    }

    public void addElement(Chat value){
        if(currentSize==array.length) resize();
        array[currentSize]=value;
        currentSize++;
    }
    private void resize(){
        Chat[] tempArray = new Chat[array.length * 2];
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
    private void reBuild(int index){
//      [1,2,3,4]
//        index=1
//      currentSize=4
//        [1,0,3,4]
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
