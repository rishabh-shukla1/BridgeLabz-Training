package linked_list;

class TaskNode
{
    int taskId;
    String taskName;
    String priority;
    String dueDate;

    TaskNode next;

    TaskNode(int taskId, String taskName, String priority, String dueDate)
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularLinkedList
{
    TaskNode head;
    TaskNode tail;
    TaskNode current;

    // Add at Beginning
    void addBegining(int id, String name, String priority, String date)
    {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null)
        {
            head = tail = node;
            node.next = head;
            current = head;
        }
        else
        {
            node.next = head;
            head = node;
            tail.next = head;
        }
    }

    // Add at End
    void addEnd(int id, String name, String priority, String date)
    {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null)
        {
            head = tail = node;
            node.next = head;
            current = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // Add at Position
    void addAtPosition(int pos, int id, String name, String priority, String date)
    {
        if (pos == 0)
        {
            addBegining(id, name, priority, date);
            return;
        }

        TaskNode node = new TaskNode(id, name, priority, date);
        TaskNode temp = head;

        for (int i = 1; i < pos && temp.next != head; i++)
        {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        if (temp == tail)
            tail = node;
    }

    // Delete by Task ID
    void deleteById(int id)
    {
        if (head == null)
        {
            System.out.println("No tasks");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do
        {
            if (temp.taskId == id)
            {
                if (temp == head)
                {
                    head = head.next;
                    tail.next = head;
                }
                else if (temp == tail)
                {
                    tail = prev;
                    tail.next = head;
                }
                else
                {
                    prev.next = temp.next;
                }

                System.out.println("Task deleted");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    void viewNextTask()
    {
        if (current == null)
        {
            System.out.println("No tasks");
            return;
        }

        System.out.println("Current Task:");
        displayTask(current);

        current = current.next;
    }

    // Display all tasks
    void displayAll()
    {
        if (head == null)
        {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;

        do
        {
            displayTask(temp);
            temp = temp.next;
        }
        while (temp != head);
    }

    // Search by Priority
    void searchByPriority(String priority)
    {
        if (head == null)
        {
            System.out.println("No tasks");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do
        {
            if (temp.priority.equalsIgnoreCase(priority))
            {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        }
        while (temp != head);

        if (!found)
            System.out.println("No task found for this priority");
    }

    // Display single task
    void displayTask(TaskNode t)
    {
        System.out.println("TaskID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due Date: " + t.dueDate);
    }
}

public class TaskManagement
{
    public static void main(String[] args)
    {
        TaskCircularLinkedList list = new TaskCircularLinkedList();

        list.addBegining(1, "Project", "High", "10-Apr");
        list.addEnd(2, "Assignment", "Medium", "12-Apr");
        list.addEnd(3, "Exam Prep", "High", "15-Apr");
        list.addAtPosition(1, 4, "Shopping", "Low", "11-Apr");

        System.out.println("All Tasks:");
        list.displayAll();

        System.out.println("\nSearch Priority High:");
        list.searchByPriority("High");

        System.out.println("\nRunning Scheduler:");
        list.viewNextTask();
        list.viewNextTask();
        list.viewNextTask();

        System.out.println("\nDelete Task ID 2:");
        list.deleteById(2);

        System.out.println("\nFinal Task List:");
        list.displayAll();
    }
}
