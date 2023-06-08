package hp;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();   //fitur menyalakan hp
        cp.chargeBattery(50);   //fitur charging hp
        cp.displayInfo();   //melihat informasi hp
        cp.addContact("Alifah", "081241414979");  //menambahkan kontak
        cp.addContact("Nur", "081236364756");
        cp.displayContacts();   //melihat kontak
        cp.topUpPulsa(10000);   //fitur top up pulsa
        System.out.println("Sisa pulsa: " + cp.checkPulsa());   //melihat sisa pulsa
        cp.searchContact("Alifah");   //mencari kontak
        cp.searchContact("Nur");
        cp.removeContact("Nur");   //menghapus kontak
        cp.displayContacts();
        cp.powerOff();  //mematikan hp
    }
}
