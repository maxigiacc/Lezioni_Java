public class Contatore {
    private int valore;
    
    public Contatore() {
        this.valore = 0;
    }

    public void incrementa(){ 
        this.valore++; 
    }
    
    public void azzera() {
        this.valore = 0;
    } 
    
    public int getValore() {
        return this.valore; 
    } 

    public static void main(String[] args) { 
        Contatore c = new Contatore(); 
        c.incrementa(); 
        System.out.println(c.getValore());
    }
}


