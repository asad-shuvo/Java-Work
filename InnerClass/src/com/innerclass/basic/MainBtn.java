package com.innerclass.basic;

import java.util.Scanner;

public class MainBtn {
    private static Scanner scanner=new Scanner(System.in);
    private static Button btnprint=new Button("Print");

    public static void main(String[]args){

        class ClickListner implements Button.OnClickListner{
            public ClickListner(){
                System.out.println("I Have Been Attached");

            }

            @Override
            public void onClick(String title) {
                System.out.println(title+ "  was Clicked");
            }
        }

      //  btnprint.setOnClickListner(new ClickListner());
        btnprint.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println(title+ "  was clicked");
            }
        });
        Listen();

    }

    private static void Listen(){
        boolean quit=false;
        while (!quit){
            int choise=scanner.nextInt();
            switch (choise){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnprint.onClick();
            }
        }
    }
}
