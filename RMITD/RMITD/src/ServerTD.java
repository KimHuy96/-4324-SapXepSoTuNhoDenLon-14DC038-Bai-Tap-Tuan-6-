import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerTD {
    public static void main(String[] args) throws MalformedURLException {
       new ServerTD().run();
    }
    private void run() throws MalformedURLException{
        int port=6394;
        try {
            ImplTD tinhToan = new ImplTD();
            Registry registry = LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/ImplTD", tinhToan);
            System.out.println("Server is running ...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServerTD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
