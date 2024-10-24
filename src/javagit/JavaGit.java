package javagit;

public class JavaGit {
    
    public static void main(String[] args) {
        /*ha hideg van, akkor
            viszek kabátot,
            egyébként nem
        */    
        final int HIDEG_HATAR = 10;
        int fok = 17;
        boolean hidegVan = fok < HIDEG_HATAR;
        String eredmeny = "nem viszek kabátot";
        /*ternalis operatorral:*/
        eredmeny = hidegVan ? eredmeny : "nem " + eredmeny;
        
        System.out.println(eredmeny);
    
    }
    
}
