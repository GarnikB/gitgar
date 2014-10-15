import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Udacha {
    private JButton button1;
    private JTextArea textArea1;


    public static void main(String args[]) {
        System.out.print("vai");
    }

    int money = 0;
    int mood = 0;//o - bad 1 -good
    int day = 0;
    int power = 0;
    int happy = 0;
    int dream = 0;
    int respect =0;
    int love=0;
    int son=0;
    Random rand = new Random();

    public void ololo(){
        textArea1.setText("vai vai");
    }
    public void getUp() {
        if (mood == 0)
            badMoon();
        else
            goodMoon();

    }

    public void badMoon() {
        if (power == 1) {
           moneyUp(300);
        } else {
            day++;
            getUp();
        }
    }

    public void moneyUp(int x){
        money+=x;
        day++;
        getUp();
    }

    public void moneyDown(int x,int y,int z){
        money-=x;
        respect+=y;
        love+=z;
        day++;
        dream++;
        getUp();
    }


    public void dream0() {
        if (money < 500) {
            moneyUp(200);//кинуть лоха
        } else {
           moneyDown(500,10,1);//adidas
        }
    }

    public void dream1() { //туфли и кепарь
        if (money < 2000) {
            int kart = rand.nextInt(1);
            if (kart == 1) {
                moneyUp(1000);//картишки
            } else {
                money -= 500;
                day++;
                getUp();
            }

        } else {
           moneyDown(2000,50,4);
        }
    }

    public void dream2() {
        if (money < 20000) {
            int af = rand.nextInt(1);
            if (af == 1) {
                moneyUp(4000);
            } else {
                money -= 1500;
                day++;
                getUp();
            }
        } else {
            moneyDown(20000,150,10);
        }

    }

    public void dream3(){
        if (money < 8000) {
            int bomb = rand.nextInt(1);
            if (bomb == 1) {
                moneyUp(4000);
            } else {
                money -= 1500;
                day++;
                getUp();
            }
        } else {
            moneyDown(8000,250,20);
        }

    }

    public void dream4(){ //власть
        if (respect<600) {
            respect += 20;
            moneyUp(1000);
        } else {
            dream++;
            love+=50;
            day++;

        }
    }

    public void dream5(){ //BMW
        if(money < 150000)
        moneyUp(rand.nextInt(9)*1000);
        else moneyDown(150000,500,150);
    }

    public void dream6(){ //Зинка с 3 подъезда
        if(money < 1000)
            moneyUp(rand.nextInt(9)*1000);
        else if (love < 250) {
                money -= 1000;
                love += 2;
            } else {
            dream++;
            day++;
            respect+=300;

        }
    }

    public void dream7(){
        if(son==0) {
            son = 1;
            dream++;
            happy=1;
        }
    }



    public void goodMoon(){
        if (happy==0) {
            if (dream == 0)
                dream0();
            else if (dream == 1)
                dream1();
            else if (dream == 2)
                dream2();
            else if (dream == 3)
                dream3();
            else if (dream == 4)
                dream4();
            else if (dream == 5)
                dream5();
            else if (dream == 6)
                dream6();
            else if (dream == 7)
                dream7();
        }
             if (happy==1){
            //game over
             }
    }


    }

