import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int a=0;
int b=1;
int c;
System.out.print(a+" "+b);
for(int i=3; i<=n;i++){
c=a+b;
System.out.print(c);
a=b;
b=c;
}
}
}