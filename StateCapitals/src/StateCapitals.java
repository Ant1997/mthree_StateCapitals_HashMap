import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {
    public static void main(String[] args) {
        Map<String, String> statesCapital = new HashMap<>();
        String[] states = new String[]{"Alabama","Alaska","Arizona", "Arkansas",
                "California", "Colorado", "Connecticut",
                "Delaware","Florida","Georgia","Hawaii",
                "Idaho", "Illinois", "Indiana", "Iowa",
                "Kansas", "Kentucky",
                "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan","Minnesota", "Mississippi", "Missouri", "Montana",
                "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota",
                "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont","Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming"};
        String[] capitals = new String[]{"Montgomery","Juneau","Phoenix", "Little Rock",
                "Sacramento", "Denver", "Hartford",
                "Dover","Tallahassee","Atlanta","Honolulu",
                "Boise", "Springfield", "Indianapolis", "Des Moines",
                "Topeka", "Frankfort",
                "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing","St. Paul", "Jackson", "Jefferson City", "Helena",
                "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck",
                "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence",
                "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier","Richmond", "Olympia",
                "Charleston", "Madison", "Cheyenne"};

        for (int i = 0; i < states.length; i++ ){
            statesCapital.put(states[i], capitals[i]);
        }

        System.out.println("STATES:");
        System.out.println("=======");
        Set<String> keys = statesCapital.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        System.out.println("\nCAPITALS:");
        System.out.println("=========");
        Collection<String> statesValues = statesCapital.values();
        for (String v : statesValues) {
            System.out.println(v);
        }

        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for (String k : keys) {
            System.out.println(k + " - " + statesCapital.get(k));
        }
    }
}
