package Structural.Proxy;

// Wrapper for the real Command Executor class
public class CommandExecutorProxy implements Executor {

    private boolean isAdmin, isUser, isGuest;
    private CommandExecutor executor;

    public CommandExecutorProxy(String userName, String password) {
        // Admin
        if (userName.equalsIgnoreCase("admin")) {
            if (password.equalsIgnoreCase("123")) {
                isAdmin = true;
            }

        // User
        } else if (userName.equalsIgnoreCase("user")) {
            if (password.equalsIgnoreCase("123")) {
                isUser = true;
            }
        }

        // Guest
        else {
            isGuest = true;
        }

        executor = new CommandExecutor();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            System.out.println("Running command as Admin");
            executor.runCommand(cmd);
        } else if (isUser) {
            System.out.println("Running command as User");
            executor.runCommand(cmd);
        } else if (isGuest) {
            throw new Exception("Guests cannot run commands. Please login as an Admin/User.");
        }
    }
}