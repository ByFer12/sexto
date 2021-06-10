import java.util.Scanner;

public class sexto {
    public static void main(String[] args) {
        int edad, promMayor, i=0, promMenor,j=0,contador=0;
        int aux1=0,aux2=0;
        Scanner ent = new Scanner(System.in);
        while(contador<10){
            System.out.println("Ingrese la edad de la persona: "+(contador+1));
            edad=ent.nextInt();
            if(edad>=25){
                aux1+=edad;
                i++;
                
            }else{
                aux2+=edad;
                j++;
            }
            contador++;
        }
        promMayor=aux1/i;
        promMenor=aux2/j;
        System.out.println("El promedio de la edad mayor es: "+promMayor);
        System.out.println("El promedio de la edad menor es: "+promMenor);
    }
    
}
