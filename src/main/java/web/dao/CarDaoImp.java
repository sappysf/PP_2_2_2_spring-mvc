package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>(List.of(
                new Car("Audi", "v8", 12313),
                new Car("Lada", "v1", 231),
                new Car("noName", "v2", 1),
                new Car("BMW", "v8", 724),
                new Car("VAZ", "v12", 2107)
        ));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(Math.min(count, 5)).toList();
    }
}
