/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // программа загадывает число, пользователь отгадывает
        System.out.println("программа загадала число в диапазоне от 0 до 5. угадай: ");
        int max = 5, min = 0, attempt = 1;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int gameNum = random.nextInt(max - min + 1) + min;
        for(int i=0; i<3; i++) {
            int userNum = scanner.nextInt();
            if(gameNum == userNum) {
                System.out.println("ты выиграл");
                break;
            }else {
                if(attempt < 3) {
                    System.out.println("пробуй еще раз, бездарь");
                }else{
                    System.out.println("тебя заскамили. задумано было: "  + gameNum);
                }
            }
            attempt++;
         } 
    }
    
}
