package exercícios;

import java.util.Date;

public class PooEx {

    public static void main(String[] args) {
        
        // Exercicio de polimorfismo
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();
        
        cachorro.EmitirSom();
        cavalo.EmitirSom();
        preguica.EmitirSom();
}
}
class BankAccount {
    private String AccountName;
    private float AccountBalance;
    private String AccountAdress;

    public BankAccount(String AccountName, float AccountBalance, String AccountAdress) {
        this.AccountName = AccountName;
        this.AccountBalance = AccountBalance;
        this.AccountAdress = AccountAdress;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "AccountName=" + AccountName + ", AccountBalance=" + AccountBalance + ", AccountAdress=" + AccountAdress + '}';
    }

    
}

class Patient {
 
    private String PatientName;
    private String PatientAddress;
    private Date CreationDate;
    private Date AppointmentDate;   

    public Patient(String PatientName, String PatientAddress, Date CreationDate, Date AppointmentDate) {
        this.PatientName = PatientName;
        this.PatientAddress = PatientAddress;
        this.CreationDate = CreationDate;
        this.AppointmentDate = AppointmentDate;
    }

    @Override
    public String toString() {
        return "Patient{" + "PatientName=" + PatientName + ", PatientAddress=" + PatientAddress + ", CreationDate=" + CreationDate + ", AppointmentDate=" + AppointmentDate + '}';
    }
}




abstract class Animal {
    public String Nome;
    public int Idade;
    
    public void EmitirSom() {
        System.out.println("Animal emitindo som");
    }
    
    public void Correr() {
        System.out.println("Animal correndo");
    }
}


class Cachorro extends Animal {

}

class Cavalo extends Animal {

}


class Preguica extends Animal {

    @Override
    public void Correr() {
    }
    
    public void SubirEmArvores() {}

}
