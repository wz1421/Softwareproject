public class Main {
    public static void main(String[] args) {
        Patient pat1 = new Patient("John Molecules");
        Patient pat2 = new Patient("Jill Biomedenhall");
        Vaccines vac1 = new Vaccines("Moderna");
        Vaccines vac2 = new Vaccines("Pfizer");
        System.out.println("Patient name is:"+pat1.getFullName()+"\nVaccine Type: "+vac1.getname()+"\nLocation is : "+vac1.getLocation()+"\n"+vac1.getDates());
        System.out.println("\n");
        System.out.println("Patient name is:"+pat2.getFullName()+"\nVaccine Type: "+vac2.getname()+"\nLocation is : "+vac2.getLocation()+"\n"+vac2.getDates());

    }
}
