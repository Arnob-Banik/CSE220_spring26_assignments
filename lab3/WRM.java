// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id,name,age,bloodgroup,dh,dh) ;
        Patient tail = dh.prev;
        newPatient.next = dh;
        dh.prev = newPatient;
        tail.next = newPatient;
        newPatient.prev = tail;
     }

    public void servePatient() {
        Patient remove = dh.next;
        Patient succ = remove.next;
        dh.next = succ;
        remove.next = null;
        remove.prev=null;
        succ.prev = dh;

    }

    public void showAllPatient() {
      Patient temp = dh.next;
      while(temp!=dh){
        System.out.print(temp.name + " --> ") ;
        temp=temp.next;
      }
      System.out.println();
    }

    public Boolean canDoctorGoHome() {
        if (dh.next == dh) return true;
        return false;
       // return null; // Delete this line once you're ready
    }

    public void cancelAll() {
        dh.next= dh;
        dh.prev= dh;
    }


    public void reverseTheLine() {
        Patient curr = dh.next;
        dh.next = dh.prev;
        dh.prev = curr;
        while (curr!=dh){
            Patient temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = temp;
        }
    }

}
