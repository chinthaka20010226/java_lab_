// class Enum{
//     enum DaysOfWeek{
//         SUNDAY,MONDAY,TUESDAY,WENSDAY,THURSDAY,FRIDAY,SATURDAY
//     }

//     public static void main(String args[]){
//         DaysOfWeek today=DaysOfWeek.MONDAY;
//         System.out.println(today);

//         for(DaysOfWeek day:DaysOfWeek.values()){
//             System.out.println(day);
//         }
//     }
// }








enum Color{
    RED("FF0000"),GREEN("00FF00"),BLUE("0000FF");

    private String hexCode;

    Color(String hexCode){
        this.hexCode=hexCode;
    }

    public String getHexCode(){
        return hexCode;
    }
}

class EnumExample{
    public static void main(String args[]){
        Color color=Color.BLUE;
        System.out.println(color);
        System.out.println(color.getHexCode());
    }
}