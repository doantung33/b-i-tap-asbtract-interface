import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ChienGion>chienGions= new ArrayList<>();
        List<Thit>thits=new ArrayList<>();
        ChienGion chienGion= new ChienGion("c1","aringon1", LocalDate.parse("2020-01-10"),2000,10);
        ChienGion chienGion1= new ChienGion("c2","aringon2", LocalDate.parse("2020-02-20"),2500,30);
        ChienGion chienGion2= new ChienGion("c3","aringon3", LocalDate.parse("2020-04-20"),2000,10);
        ChienGion chienGion3= new ChienGion("c4","aringon4", LocalDate.parse("2020-09-25"),2000,20);
        ChienGion chienGion4= new ChienGion("c5","aringon5", LocalDate.parse("2020-11-30"),2200,30);
        Thit thit= new Thit("t1","bò1",LocalDate.parse("2021-01-05"),80,2);
        Thit thit1= new Thit("t2","bò2",LocalDate.parse("2021-01-10"),85,6);
        Thit thit2= new Thit("t3","bò3",LocalDate.parse("2021-01-15"),83,2);
        Thit thit3=new Thit("t4","bò4",LocalDate.parse("2021-01-20"),89,3);
        Thit thit4= new Thit("t5","bò5",LocalDate.parse("2021-01-25"),90,7);
        chienGions=new ArrayList<ChienGion>(Arrays.asList(chienGion,chienGion1,chienGion2,chienGion3,chienGion4));
        System.out.println(chienGions);
        thits=new ArrayList<Thit>(Arrays.asList(thit,thit1,thit2,thit3,thit4));
        System.out.println(thits);
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
