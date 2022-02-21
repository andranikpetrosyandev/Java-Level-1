package com.classroom.week5.set;

public class ArraySet extends AbstractSet{
    private User[] array = new User[10];
    private int pointer;

    @Override
    public void add(User user) {
        if(this.contains(user)){
            System.out.println("The user:"+user.toString()+"Already exist");
            return;
        }
        array[pointer] = user;
        this.pointer ++ ;

    }

    @Override
    public boolean contains(User user) {
        for (int i = 0; i <this.pointer ; i++) {
            if(user.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return pointer;
    }
}
