public class Main {

    public static void main(String[] args) {
        Ruokalista exactum = new Ruokalista();

        exactum.lisaaAteria("Pariloitua lohta ja kuhaa, basilikalla maustettua valkoviinivoikastiketta.");
        exactum.lisaaAteria("Kesäinen vihersalaatti ja omena-hunajavinegretti.");
        exactum.lisaaAteria("Paahdettua karitsan seläkettä ja punaviinikastiketta.");

        exactum.tulostaAteriat();

        exactum.tyhjennaRuokalista();
        exactum.tulostaAteriat();       // Ei tulostu mitään
    }
}