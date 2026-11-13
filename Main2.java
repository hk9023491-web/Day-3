Class GrandParent{
    Void name(){
        System.out.println("This is GrandParent");
    }
}
Class Parent extends GrandParent{
    Parent(){
        System.out.println("This is Parent");
    }
}
Class Child extends parent{
    Child1(){
        System.out.println("This is Child1");
    }
}

Class Child extends parent{
    Child2(){
        System.out.println("This is Child2");
    }
}
Class Main {
    public static void Main(String[] args) {
        Child ch =new Child();
        Ch.name();
    }
}