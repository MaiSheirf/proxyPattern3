import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class gymballMachine extends UnicastRemoteObject implements gumallMachineRemote {
    public gymballMachine(String location, int numberGumballs) throws RemoteException {
// code here
    }

    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public state getState() throws RemoteException {
        return null;
    }
}
