public class Location_Translate {

    static Translate_AD GetUserLocation(String location) {
        if (location == "PL") {return new Polish_Translate();}
        else if (location == "DE") {return new German_Translate();}
        else if (location == "ENG") {return new English_Translate();}
        return new English_Translate();
    }

}
