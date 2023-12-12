package ru.kirpichenkov.Lymbda.primer2;

public class task {
   static void x(Function fc){
       fc.change("б>0","М<0", "р=0" )
   }


    public static void main(String[] args) {

    }
}

interface Function{
    int change(String a, String b, String c);
}
