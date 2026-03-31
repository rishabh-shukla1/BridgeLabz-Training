package FileBackupScheduler;

public class BackUpMain {
	
	public static void main(String[] args) {

        BackupSchedulerService service = new BackupSchedulerService();

        try {
        	
            service.addBackupTask("/database", 10);
            service.addBackupTask("/system/config", 5);
            service.addBackupTask("/user/documents", 2);
            service.addBackupTask("", 3); 
        } 
        catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        service.executeBackups();
    }

}
