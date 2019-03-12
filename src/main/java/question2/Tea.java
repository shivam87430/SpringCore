package question2;

import org.springframework.beans.factory.annotation.Autowired;

public class Tea implements HotDrink{

    @Override
    public String prepareHotDrink() {
        return "Tea is ready for you";
    }

}
