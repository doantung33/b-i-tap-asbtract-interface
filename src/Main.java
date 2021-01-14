import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ChienGion>crispy= new ArrayList<>();
        List<Thit>meat=new ArrayList<>();
        ChienGion crispy1= new ChienGion("c1","aringon1", LocalDate.parse("2020-01-10"),2000,10);
        ChienGion crispy2= new ChienGion("c2","aringon2", LocalDate.parse("2020-02-20"),2500,30);
        ChienGion crispy3= new ChienGion("c3","aringon3", LocalDate.parse("2020-04-20"),2000,10);
        ChienGion crispy4= new ChienGion("c4","aringon4", LocalDate.parse("2020-09-25"),2000,20);
        ChienGion crispy5= new ChienGion("c5","aringon5", LocalDate.parse("2020-11-30"),2200,30);
        Thit meat1= new Thit("t1","bò1",LocalDate.parse("2021-01-05"),80,2);
        Thit meat2= new Thit("t2","bò2",LocalDate.parse("2021-01-10"),85,6);
        Thit meat3= new Thit("t3","bò3",LocalDate.parse("2021-01-15"),83,2);
        Thit meat4=new Thit("t4","bò4",LocalDate.parse("2021-01-20"),89,3);
        Thit meat5= new Thit("t5","bò5",LocalDate.parse("2021-01-25"),90,7);
        crispy=new ArrayList<>(Arrays.asList(crispy1,crispy2,crispy3,crispy4,crispy5));
        System.out.println(crispy);
        meat=new ArrayList<>(Arrays.asList(meat1,meat2,meat3,meat4,meat5));
        System.out.println(meat);
        double cost=0;
        double salePrice=0;
        double totalDiscount=0;
        for (ChienGion c:crispy
             ) {
            cost+= c.getAmount();
            salePrice+=c.getRealMoney();
        }
        totalDiscount=cost-salePrice;
        System.out.println("sale="+totalDiscount);
        double cost1=0;
        double salePrice1=0;
        double totalDiscount1=0;
        for (Thit t:meat
             ) {
            cost1+=t.getAmount();
            salePrice1+=t.getRealMoney();
        }
        totalDiscount1=cost1-salePrice1;
        System.out.println("Sale= "+totalDiscount1);
//        chienGion.toString();
//        chienGion1.toString();
//        chienGion2.toString();
//        chienGion3.toString();
//        chienGion4.toString();
//        thit.toString();
//        thit1.toString();
//        thit2.toString();
//        thit3.toString();
//        thit4.toString();

    }
}
