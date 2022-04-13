/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil1,bil2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangan 1"); 
     
        bil1 = input.nextInt();
 
        
        System.out.println("");
        System.out.println("Input Bilangan 2");
        
        bil2 = input.nextInt();
       
        
        if(bil1 > bil2){
            System.out.println("YANG LEBIH BESAR ADALAH:"+bil1);
        }else{
            System.out.println("YANG LEBIH BESAR ADALAH:"+bil2);
        }
        }
        
    }
    

