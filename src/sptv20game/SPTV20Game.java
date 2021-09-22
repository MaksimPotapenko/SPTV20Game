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
        // программа загадывает число, пользователь отгадываетint max = 5, min = 0, attempt = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ИГРА УГАДАЙ ЧИСЛО");
        System.out.println("Выбери от какого числа игра выберет число: ");
        int diapOne = scanner.nextInt();
        System.out.println("Выбери в каком диапазоне игра выберет число: ");
        int diapTwo = scanner.nextInt();
        
        int max = diapTwo, min = diapOne, attempt = 1, ii = 1;
        while(ii==1){
        Random random = new Random();
        int gameNum = random.nextInt(max - min +1) + min;
        System.out.printf("программа загадала число от %d до %d, угадай: ", diapOne, diapTwo);
        for(int i=0; i<10; i++) {
            int userNum = scanner.nextInt();
            if(gameNum == userNum) {
                System.out.println("ты выиграл");
                ii=ii-1;
                break;
            }else {
                if(attempt < 3) {
                    System.out.println("пробуй еще раз");
                }else{
                    System.out.println("тебя заскамили. задумано было: "  + gameNum);
                    System.out.println("хочешь попробовать еще раз? если да, нжами 1, если нет, нажми что угодно, кроме 1");
                    int cont = scanner.nextInt();
                    if(cont==1){
                        attempt=1;
                        break;
                    }else{
                        ii=ii-1;
                        System.out.println("adios");
                        break;
                    }
            }
        }
        attempt++;
    } 
    }
    }
    
}
