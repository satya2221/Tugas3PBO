import Swara.SoundBehave;
import mabur.FlyBehave;
import serang.NyerangBehave;
import tahan.BertahanBehave;

public class Duck {
    private FlyBehave caraterbang;
    private SoundBehave carabunyi;
    private BertahanBehave carabertahan;
    private NyerangBehave caraserang;

    public Duck(FlyBehave terbang, SoundBehave bunyi, BertahanBehave tahan, NyerangBehave serang) {
        caraterbang = terbang;
        carabunyi = bunyi;
        carabertahan = tahan;
        caraserang = serang;
    }

    public void setCarabunyi(SoundBehave carabunyi) {
        this.carabunyi = carabunyi;
    }

    public void setCaraterbang(FlyBehave caraterbang) {
        this.caraterbang = caraterbang;
    }

//    public void setCarabertahan(BertahanBehave carabertahan) {
//        this.carabertahan = carabertahan;
//    }

    public void setCaraserang(NyerangBehave caraserang) {
        this.caraserang = caraserang;
    }

    public void fly(){
        caraterbang.terbang();
    }
    public void sound(){
        carabunyi.bunyi();
    }
    public void attack(){
        caraserang.serang();
    }
    public void defense(){
        carabertahan.bertahan();
    }
}
