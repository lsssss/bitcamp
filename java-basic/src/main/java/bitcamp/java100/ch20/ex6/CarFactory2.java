package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

public class CarFactory2 {
    
    private Tire[] tires;
    
    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    public Car createCar(String model) {
        Car car = null;
        switch (model) {
        case "티코" : car = createTico(); break;
        case "티코 골드" : car = createTicoGold(); break;
        case "소나타" : car = createSonata();  break;
        case "에쿠스" : car =createEquus(); break;
        default: car = createBasic();
        }
        
        car.setTires(tires);
        
        return car;
    }

    private static Car createBasic() {
       Car c = new Car();
       Engine engine = new Engine();
       engine.setCc(1500);
       engine.setName("비트엔진");
       engine.setValve(16);
       
       c.setEngine(engine);
       
       return c;
    }

    private static Car createEquus() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("비트스페셜엔진");
        engine.setValve(32);
        
        c.setEngine(engine);
        
        return c;
    }

    private static Car createSonata() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(1980);
        engine.setName("비트표준엔진");
        engine.setValve(16);
        c.setEngine(engine);
        return c;
    }

    private static Car createTicoGold() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        Map<String, String> options = new HashMap<>();
        options.put("sunroof", "yes");
        options.put("airbag", "yes");
        options.put("blackbox", "yes");
        
        c.setOptions(options);
        return c;
    }

    private static Car createTico() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }
    
}
