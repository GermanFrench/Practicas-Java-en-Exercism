public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        return expectedMinutesInOven() - min;
    }
    public int preparationTimeInMinutes(int preparation){
        return preparation * 2;
    }
    public int totalTimeInMinutes(int prepa, int remaning){
        return preparationTimeInMinutes(prepa) + remaning;
    }
}
