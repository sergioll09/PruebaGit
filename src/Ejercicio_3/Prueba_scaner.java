package Ejercicio_3;

import java.util.Scanner;

public class Prueba_scaner {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int i,n= sc.nextInt();
      if(n==0){
      System.out.println("El numero "+n+" es Cero");
      } else{
          if(n>0){
              System.out.println("El numero "+n+" es positivo");
          }else{
          System.out.println("El numero "+n+" es negativo");
          }
      }
      i=0;
while(i==n){
n=n+i;
i=i+1;
}
System.out.println("la suma de los "+n+" numeros es "+n);
      }
}