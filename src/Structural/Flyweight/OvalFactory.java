package Structural.Flyweight;

import java.util.HashMap;

public class OvalFactory {

    private static HashMap<OvalType, Oval> ovals = new HashMap<>();

    public Oval getOval(OvalType type) {

        Oval oval = ovals.get(type);

        if (oval == null) {
                oval = new Oval(type);
                ovals.put(type, oval);
            }
            return oval;
        }

     public int getNumberOfOvals() {
        return ovals.size();
     }
    }

