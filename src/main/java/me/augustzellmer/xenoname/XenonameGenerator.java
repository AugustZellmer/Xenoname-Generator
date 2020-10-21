package me.augustzellmer.xenoname;

import static me.augustzellmer.xenoname.Xenonames.prefixes;
import static me.augustzellmer.xenoname.Xenonames.suffixes;

public class XenonameGenerator {

    public String getName(String input) {
        Pair<String, String> names = getFirstAndLastName(input);
        String fName = names.x;
        String lName = names.y;

        String fXenoname = prefixes[lName.hashCode() % prefixes.length];
        String lXenoname = suffixes[fName.hashCode() % suffixes.length];

        return fXenoname + " " + lXenoname;
    }

    private Pair<String, String> getFirstAndLastName(String name){
        String fName;
        String lName;
        int index;

        if(name.contains(" ")){
            index = name.lastIndexOf(" ");
        }
        else{
            index = name.length()/2;
        }
        fName = name.substring(0, index);
        lName = name.substring(index);

        return new Pair(fName, lName);
    }
}
