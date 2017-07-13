package pattern.structural.proxy.exam2;

public class CommandExecutorProxy implements CommandExecutor{
	
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd){
		if (("Pankaj").equals(user) && "J@urnalD$V".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin )
			executor.runCommand(cmd);
		else
			if (cmd.trim().startsWith("rm")){
				throw new Exception("rm cmand is not allowed for non-admin users.");
			}else {
				executor.runCommand(cmd);
			}
		
	}

}
