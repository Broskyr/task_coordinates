package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Punkt punkt=new Punkt();
        punkt.x=0;
        punkt.y=0;
        punkt.addX();
        punkt.addY();
        punkt.showCoord();
        punkt.changeX(10);
        punkt.changeY(10);
        punkt.showCoord();

    }

    public static class Punkt {
        int x;
        int y;

        void addX(){
            x++;
        }

        void addY(){
            y++;
        }

        void changeX(int number) {
            x += number;
        }

        void changeY(int number) {
            y += number;
        }
        int showX(){
            return this.x;
        }

        int showY(){
            return this.y;
        }
        void showCoord(){
            System.out.println("x:"+x+",y:"+y);
        }

    }

}



