package com.condo;




/*
SINGLETON Pattern EXAMPLE
 */
public class Single {

    private static Single single;



    private Single(){

    }
    public static Single getInstance() {
        if (null == single) {
            synchronized (Single.class) {
                if (null == single) {
                    single = new Single();

                }

            }
        }
        return single;
    }
    public String print(){
        System.out.println("Inside the instance");
        return "";
    }

    public static void main(String[] args) {


        Thread t1 = new Thread( Single.getInstance().print());
        Thread t2 = new Thread(Single.getInstance().print());

        t1.start();
        t2.start();

    }
}
