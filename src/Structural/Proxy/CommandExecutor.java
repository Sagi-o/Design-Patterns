package Structural.Proxy;

public class CommandExecutor implements Executor {
    @Override
    public void runCommand(String cmd) throws Exception {
        System.out.println("'" + cmd + "' command executed succesfully.");
    }
}
