package dp.builder;

import dp.builder.airplane.*;

public class Run {
    public static void main(String[] args) {
        // instantiate the director (hire the engineer)
        AerospaceEngineer aero = new AerospaceEngineer();
        // instantiate each concrete builder (take orders)
        AirplaneBuilder cropBuilder = new CropDuster("Farmer Joe");
        AirplaneBuilder fighterBuilder = new FighterJet("The Navy");
        AirplaneBuilder gliderBuilder = new Glider("Tim Rice");
        // build a CropDuster
        aero.setAirplaneBuilder(cropBuilder);
        aero.constructAirplane();
        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() +
                " is completed and ready for delivery to " +
                completedCropDuster.getCustomer());
    }
}
