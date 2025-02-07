package segelzwerg.sporttooolbox.Controller;

import org.springframework.stereotype.Component;
import segelzwerg.sporttooolbox.IUnits.Distance;
import segelzwerg.sporttooolbox.IUnits.Speed;
import segelzwerg.sporttooolbox.IUnits.Time;
import segelzwerg.sporttooolbox.SpeedCalculator;

@Component
public class SpeedService {
    public Speed calculateSpeed(SpeedForm form) {
        int kilometer = form.getKilometer();
        int meter = form.getMeter();
        Distance distance = new Distance(kilometer, meter);

        int hour = form.getHour();
        int minute = form.getMinute();
        int second = form.getSecond();
        Time time = new Time(hour);

        SpeedCalculator speedCalculator = new SpeedCalculator(distance, time);

        return speedCalculator.computeSpeed();
    }


}
