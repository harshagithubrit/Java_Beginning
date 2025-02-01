public class Switch2 {
    public static void main(String []args){
        String day ="Monday";
        String result="";
        result = switch(day){
            case "Saturday","Sunday"-> "8am";
            case "Monday" -> "7am";
            default -> "6am";
        };
        System.out.println(result);
    }
}
