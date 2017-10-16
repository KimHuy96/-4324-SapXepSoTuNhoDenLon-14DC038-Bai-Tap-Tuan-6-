import java.rmi.*;

public interface TD extends Remote{
    public int TD(int a, int b) throws RemoteException;

}