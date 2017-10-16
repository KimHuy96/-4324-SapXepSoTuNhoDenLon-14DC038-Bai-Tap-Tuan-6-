import java.rmi.*;
import java.rmi.server.*;

public class ImplTD extends UnicastRemoteObject implements TD{
    public ImplTD() throws RemoteException {
    }
    public int TD(int a, int b) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
