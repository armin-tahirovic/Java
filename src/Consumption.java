public class Consumption {
    private int consumption;

    public Consumption(int consumption){
        this.consumption=consumption;

    }

    public int calculateConsumption(){
        int x;
        int y;
        for(x=0, x<Apartment.MeterList.size, x++){

            for(y=0, y<Apartment.MeterList[x].Readings.size, y++){

                consumption=consumption+Apartment.MeterList[x].Readings[y].getValue;
            }
        }
        return consumption;
    }


    public int lastMeasure(){
        return consumption;
    }


}
