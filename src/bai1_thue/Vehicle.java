/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_thue;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vehicle{
    String name;
    String nameofcar;
    float price;
    int volume;
    float tax;
    public Vehicle(float price, int volume, String name, String nameofcar) {
        this.price = price;
        this.volume = volume;
        this.name = name;
        this.nameofcar = nameofcar;
    }
    public Vehicle(){

    }
    public float getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public String getName(){
        return name;
    }
    public String getNameofcar(){
        return nameofcar;
    }
    public boolean setPrice(float price) {
        if(price>=0){
            this.price = price;
            return true;
        }else{
            System.err.println("Nhap lai gia xe");
            return false;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNameofcar(String nameofcar){
        this.nameofcar = nameofcar;
    }
    public boolean setVolume(int volume) {
        if(volume>=0){
            this.volume = volume;
            return true;
        }
        else{
            System.err.println("Nhap lai dung tich xi lanh:");
            return false;
        }
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chu xe:");
        name = input.nextLine();
        System.out.println("Nhap ten xe:");
        nameofcar = input.nextLine();
        System.out.println("Nhap gia tri cua xe:");
        while(true){
            float priceInput = Float.parseFloat(input.nextLine());
            boolean check = setPrice(priceInput);
            if(check){
                break;
            }
        }

        System.out.println("Nhap dung tich xi lanh");
        while(true){
            int volumeInput;
            volumeInput = Integer.parseInt(input.nextLine());
            boolean check = setVolume(volumeInput);
            if(check){
                break;
            }
        }
    }

    public void showInfo(){
        System.out.println("Chu so huu:"+name+", Ten xe:"+nameofcar +", Gia tri:"+price+", Dung tich:"+volume + ", Thue:"+law());
    }

    /**
     *
     * @return
     */
    public float law(){
        if(volume<100){
            tax = price/100;
        }
        else if(volume>=100 & volume<200){
            tax = price*3/100;
        }
        else{
            tax = price*5/100;
        }
        return tax;
    }

}
