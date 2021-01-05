import java.rmi.Remote;
import java.rmi.RemoteException;

public interface gumallMachineRemote extends Remote{
        public int getCount() throws RemoteException;
        public String getLocation() throws RemoteException;
        public state getState() throws RemoteException;
    }

