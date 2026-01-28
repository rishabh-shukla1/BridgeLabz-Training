package FileBackupScheduler;

import java.util.*;

public class BackupSchedulerService {
	
	 private PriorityQueue<BackupTask> queue;

	    public BackupSchedulerService() {
	        queue = new PriorityQueue<>();
	    }

	    public void addBackupTask(String path, int priority)
	            throws InvalidBackupPathException {

	        if (path == null || path.length() == 0) {
	            throw new InvalidBackupPathException("Invalid backup path");
	        }

	        BackupTask task = new BackupTask(path, priority);
	        queue.add(task);

	        System.out.println("Backup task added for:-" + path);
	    }

	    public void executeBackups() {

	        System.out.println("Executing backups in priority order:");

	        while (!queue.isEmpty()) {
	        	
	            BackupTask task = queue.poll();
	            System.out.println("Backing up " + task.getFolderPath() +"- Priority: " + task.getPriority());
	        }
	    }

}
