import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientTD {
    public static void main(String[] args) {
        // TODO code application logic here
        new ClientTD().run();
    }
    
    private void run(){
        int port=6394;
         
        try {
            TD td = (TD) Naming.lookup("rmi://localhost:"+port+"/ImplTD");
            Scanner nhap = new Scanner(System.in);
             Scanner input =new Scanner(System.in);
        int [] a=new int[5];
        int i,j,tg;
        System.out.println("Nhap vao cac phan tu cua mang");
        for(i=0;i<5;i++){
            System.out.print("a"+"["+i+"]"+"=" );
            a[i]=input.nextInt();
        }
        System.out.println("Sap xep cac phan tu cua mang theo chieu tang dan:");
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j]){
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
            System.out.print("a"+"["+i+"]"+"=");
            System.out.println(a[i]);
        }
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientTD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientTD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientTD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
