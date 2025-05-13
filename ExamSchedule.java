public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        ExamNode newExamNode = new ExamNode(examDetails);
        if (head == null) {
            head = newExamNode;
            current = head;
        } else {
            ExamNode currentNode = head;
            ExamNode prevExamNode = currentNode;
            while (currentNode != null) {
                prevExamNode = currentNode;
                currentNode = currentNode.next;
            }
            prevExamNode.next = newExamNode;
            newExamNode.prev = prevExamNode;
    
            System.out.println("Exam " + examDetails + " has been added to exam schedule.");
        }

    }


    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            if (current.next != null) {
                System.out.println("Next exam: " + current.next.examDetails.toString());
                current = current.next;
            } else {
                System.out.println("There is no exam anymore.");
            }
        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            if (current.prev != null) {
                System.out.println("Previous exam: " + current.prev.examDetails.toString());
                current = current.prev;
            } else {
                System.out.println("There is no exam anymore.");
            }
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}


