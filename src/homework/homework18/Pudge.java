package homework.homework18;

import java.io.Serializable;
import java.util.Locale;

public class Pudge implements Serializable {


    //private String imageURL;
    private Locale locale;
    //private long serialVersionUID = 1L;

    public Pudge() {

    }

    public Pudge(Locale locale) {
        //this.imageURL = imageURL;
        this.locale = locale;
    }

//    public String getImageURL() {
//        return imageURL;
//    }

//    public void setImageURL(String imageURL) {
//        this.imageURL = imageURL;
//    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

//    @Override
//    public String toString() {
//        return "Pudge{" +
//                "imageURL='" + imageURL + '\'' +
//                ", locale=" + locale +
//                '}';
//    }


    @Override
    public String toString() {
        return "Pudge{" +
                "locale=" + locale +
                '}';
    }
}
