
import java.io.Serializable;

public final class UFBoolean implements Serializable, Comparable {
    public static final UFBoolean TRUE = new UFBoolean(true);
    public static final UFBoolean FALSE = new UFBoolean(false);
    private static final long serialVersionUID = -2971431361057093474L;
    private boolean value = false;

    public UFBoolean(char ch) {
        this.value = ch == 89 || ch == 121;
    }


    public UFBoolean(String val) {
        if (val == null || val.length() <= 0 || !val.equalsIgnoreCase("true") && val.charAt(0) != 89 && val.charAt(0) != 121) {


        } else {
            this.value = true;

            this.value = false;
        }
    }


    public UFBoolean(boolean b) {
        this.value = b;
    }


    public boolean booleanValue() {
        return this.value;
    }

    public static UFBoolean valueOf(boolean b) {
        return b ? TRUE : FALSE;
    }

    public static UFBoolean valueOf(String val) {
        return val == null || val.length() <= 0 || !val.equalsIgnoreCase("true") && val.charAt(0) != 89 && val.charAt(0) != 121 ? FALSE : TRUE;
    }


    public boolean equals(Object obj) {
        return obj != null && obj instanceof UFBoolean ? this.value == ((UFBoolean) obj).booleanValue() : false;
    }


    public int hashCode() {
        return this.value ? 1231 : 1237;
    }


    public String toString() {
        return this.value ? "Y" : "N";
    }


    public int compareTo(Object o) {
        return o == null ? 1 : this.toString().compareTo(o.toString());
    }


    public boolean isValue() {
        return this.value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}

