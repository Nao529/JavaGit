package javagit;

public class JavaGit {
    
    public static void main(String[] args) {
        /*ha hideg van, akkor
            viszek kabátot,
            egyébként nem
        */    
        final int HIDEG_HATAR = 10;
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String eredmeny = "";
        /*hagyományos if:*/
        if(hidegVan) {
            eredmeny = "viszek kabátot";
        } else {
            eredmeny = "nem viszek kabátot";
        }
        System.out.println(eredmeny);
    
    }
    
}
