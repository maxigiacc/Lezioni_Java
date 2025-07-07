public class Contatore {
    private int valore = 0;
    
    public void incrementa(){ 
        valore++; 
    }
    
    public void azzera() {
        valore = 0;
    } 
    
    public int getValore() {
        return valore; 
    } 

    public static void main(String[] args) { 
        Contatore c = new Contatore(); 
        c.incrementa(); 
        System.out.println(c.getValore()); 
        
    } 

}


