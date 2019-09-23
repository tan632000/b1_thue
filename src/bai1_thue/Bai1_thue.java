/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_thue;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_thue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehicle> vehicleList;
        vehicleList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Moi ban nhap lua chon:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    for(int i=0; i<3; i++){
                        Vehicle std = new Vehicle();
                        std.inputInfo();
                        vehicleList.add(std);
                    }
                    break;
                case 2:
                    for(int i = 0; i<vehicleList.size(); i++){
                        vehicleList.get(i).showInfo();
                    }
                    break;
                case 3:
                    System.out.println("Bye");
            }
        }while(choose!=4);
    }
    static void showMenu(){
        System.out.println("1.Moi nhap thong tin cac xe:");
        System.out.println("2.Xuat bang thue:");
        System.out.println("3.Thoat");
    }
}
