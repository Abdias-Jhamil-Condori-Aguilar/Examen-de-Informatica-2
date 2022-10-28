import java.util.Date;

public class Main {
    public static void main(String [] args){
        Responsable jorge= new Responsable("Jorge","Aguirre","Gutierrez",72236719,"13910474");
        DirectorFinanciero juan=new DirectorFinanciero("si");
        Date fecha1 =new Date(2022,10,28);
        Solicitud n1=new Solicitud(jorge,13574,fecha1,"Yanbal","Economia",juan);
        System.out.println(jorge.toString());
        System.out.println(juan.toString());
        System.out.println(n1.toString());
    }
}

