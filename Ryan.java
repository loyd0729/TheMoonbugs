package Moonbugs;

/**
 * Created by lbaba on 7/4/2017.
 */
public class Ryan {
    private String name;
    private String vocals;
    private String instrument;

    public Ryan(String name, String instrument, String vocals) {
        this.name = name;
        this.vocals = vocals;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public String getVocals() {
        return vocals;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        String str0 =   "Name: " + getName() + "\n" +
                        "Position: " + getVocals() + "\n" +
                        "Instrument: " + getInstrument() + "\n";
            return str0;
        }
    }
