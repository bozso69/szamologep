package szamologep;
    
public class matMuveletek {


    public String osszeadas(String szam1, String szam2) {
   /* double doubleszam1 = Double.parseDouble(szam1);
    double doubleszam2 = Double.parseDouble(szam2);*/
   /* Double eredmeny =  Double.parseDouble(szam1) + Double.parseDouble(szam2);
        System.out.println("eredmeny = " + eredmeny);*/
    return  String.valueOf(Double.parseDouble(szam1) + Double.parseDouble(szam2));}

    public String kivonas(String szam1, String szam2) {
        return  String.valueOf(Double.parseDouble(szam1) - Double.parseDouble(szam2));}

    public String sorzas(String szam1, String szam2) {
        System.out.println(String.valueOf(Double.parseDouble(szam1) * Double.parseDouble(szam2)));
        return  String.valueOf(Double.parseDouble(szam1) * Double.parseDouble(szam2));}

    public String osztas(String szam1, String szam2) {
        return  String.valueOf(Double.parseDouble(szam1) / Double.parseDouble(szam2));}
}

