package ru.kirpichenkov.Lymbda.primer1;

public class test2 {
    static void def(I i){
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(()->{return 18; });
    }
}
interface I{
    int abc();
}
