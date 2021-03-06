package es.ua.dlsi.grfia.im4.core.semantic.meters.mensural;

import es.ua.dlsi.grfia.im4.core.Time;
import es.ua.dlsi.grfia.im4.core.semantic.Perfection;

/**
 * Visually rendered as O  with a dot inside
 * 1 breve = 3 semibreves, 1 semibreve = 3 minim
 */
public class TempusPerfectumCumProlationePerfecta extends MeterMensural {
    /**
     * Package visibility to be used by the factory
     */
    public static final String SKM = "*met(O.)";

    public TempusPerfectumCumProlationePerfecta() {
        super(SKM, Perfection.imperfectum, Perfection.imperfectum, Perfection.perfectum, Perfection.perfectum);
    }

    @Override
    public Time getDuration() {
        return getBreveDuration();
    }

    @Override
    public TempusPerfectumCumProlationePerfecta clone() {
        return new TempusPerfectumCumProlationePerfecta();
    }


}
