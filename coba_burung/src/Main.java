import Swara.Normal;
import Swara.Ultrasonic;
import mabur.Plane;
import mabur.Rocket;
import mabur.Wing;
import serang.Excalibur;
import serang.M16A2;
import serang.Panci;
import tahan.ArmorKayu;
import tahan.ArmorVibranium;

public class Main {

    public static void main(String[] args) {
        Duck superbebek = new Duck(new Rocket(),new Ultrasonic(), new ArmorVibranium(), new M16A2());
        System.out.println("Superduck behaviour is : ");
        superbebek.fly();
        superbebek.sound();
        superbebek.defense();
        superbebek.attack();

        System.out.println("");
        Duck notsuperduck = new Duck(new Wing(),new Normal(), new ArmorKayu(), new Panci());
        System.out.println("Not superduck behaviour is : ");
        notsuperduck.fly();
        notsuperduck.sound();
        notsuperduck.defense();
        notsuperduck.attack();

        System.out.println("");
        superbebek.setCaraterbang(new Plane());
        superbebek.setCaraserang(new Excalibur());
        System.out.println("Superduck change attack and fly behaviour : ");
        superbebek.fly();
        superbebek.sound();
        superbebek.defense();
        superbebek.attack();
    }
}
