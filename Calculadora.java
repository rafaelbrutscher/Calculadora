import java.util.Scanner;
public class Calculadora{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String escolha;
    double n1;
    double n2;
    pergunta();
    n1 = input.nextDouble();
      
   while(true){
    System.out.println("Opera��o [+]Adi��o \n[-]Subtra��o \n[*]Multiplica��o \n[/]Divis�o \n[0]Sair: ");
    escolha = input.next();
    
    if(escolha.equals("+")){
      pergunta();
      n2 = input.nextDouble();
      n1 = n1+n2;
      pulaLinha();
      conta(n1);
      pulaLinha();
    }
    else if(escolha.equals("-")){
      pergunta();
      n2 = input.nextDouble();
      n1 = n1-n2;
      pulaLinha();
      conta(n1);
      pulaLinha();
    }
    else if(escolha.equals("*")){
      pergunta();
      n2 = input.nextDouble();
      n1 = n1*n2;
      pulaLinha();
      conta(n1);
      pulaLinha();
    }
    else if(escolha.equals("/")){
      pergunta();
      n2 = input.nextDouble();
      n1 = n1/n2;
      pulaLinha();
      conta(n1);
      pulaLinha();
    }
    else if(escolha.equals("0")){
      break;
    }
    else{
      pulaLinha();
      System.out.println("OPERA��O INV�LIDA");
      pulaLinha();
    }

   }
   System.out.println("Resultado final: "+n1);
  }
  public static void pulaLinha(){
    System.out.println("");
  }
  public static void pergunta(){
    System.out.print("Digite um n�mero: ");
  }
  public static void conta(double num1){
     System.out.println(num1);
  }
}